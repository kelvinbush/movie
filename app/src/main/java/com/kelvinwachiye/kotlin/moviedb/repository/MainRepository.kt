package com.kelvinwachiye.kotlin.moviedb.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.kelvinwachiye.kotlin.moviedb.BuildConfig
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowMapper
import com.kelvinwachiye.kotlin.moviedb.paging.MoviePagingSource
import com.kelvinwachiye.kotlin.moviedb.paging.TvShowPagingSource
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "MoviesRepository"

@Singleton
class MainRepository @Inject constructor(
    private val movieDbAPi: MovieDbAPi,
    private val networkMovieMapper: NetworkMovieMapper,
    private val tvShowMapper: NetworkTvShowMapper
) {
    fun getMovies(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                MoviePagingSource(
                    movieDbAPi,
                    query,
                    networkMovieMapper
                )
            }
        ).liveData

    fun getTvShows(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                TvShowPagingSource(
                    movieDbAPi,
                    query,
                    tvShowMapper
                )
            }
        ).liveData


}