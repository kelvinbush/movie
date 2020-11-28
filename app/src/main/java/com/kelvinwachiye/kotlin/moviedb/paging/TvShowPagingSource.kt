package com.kelvinwachiye.kotlin.moviedb.paging

import androidx.paging.PagingSource
import com.kelvinwachiye.kotlin.moviedb.Key
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.TvShow
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowMapper
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject



class TvShowPagingSource @Inject constructor(
    private val movieDbAPi: MovieDbAPi,
    private val query: String,
    private val networkTvShowMapper: NetworkTvShowMapper
) : PagingSource<Int, TvShow>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, TvShow> {
        // Start refresh at page 1 if undefined.
        val nextPageNumber = params.key ?: 1

        return try {
            val response = movieDbAPi.getTvShowsAsync(
                query,
                Key.api_key, nextPageNumber
            )
            LoadResult.Page(
                data = networkTvShowMapper.mapFromEntityList(response.shows),
                prevKey = if (nextPageNumber == 1) null else nextPageNumber - 1,
                nextKey = if (response.shows.isEmpty()) null else nextPageNumber + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}