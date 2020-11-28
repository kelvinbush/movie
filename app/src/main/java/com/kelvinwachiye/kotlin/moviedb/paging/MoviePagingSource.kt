package com.kelvinwachiye.kotlin.moviedb.paging

import androidx.paging.PagingSource
import com.kelvinwachiye.kotlin.moviedb.Key
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.Movie
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject



class MoviePagingSource @Inject constructor(
    private val movieDbAPi: MovieDbAPi,
    private val query: String,
    private val networkMovieMapper: NetworkMovieMapper
) : PagingSource<Int, Movie>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        // Start refresh at page 1 if undefined.
        val nextPageNumber = params.key ?: 1

        return try {
            val response = movieDbAPi.getMoviesAsync(
                query,
                Key.api_key, nextPageNumber
            )
            LoadResult.Page(
                data = networkMovieMapper.mapFromEntityList(response.movies),
                prevKey = if (nextPageNumber == 1) null else nextPageNumber - 1,
                nextKey = if (response.movies.isEmpty()) null else nextPageNumber + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}