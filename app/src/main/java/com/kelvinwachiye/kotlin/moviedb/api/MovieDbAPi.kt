package com.kelvinwachiye.kotlin.moviedb.api

import com.kelvinwachiye.kotlin.moviedb.domains.Credits
import com.kelvinwachiye.kotlin.moviedb.domains.Season
import com.kelvinwachiye.kotlin.moviedb.domains.Show
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetWorkMovieDetails
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieResultContainer
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowContainer
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface MovieDbAPi {
    companion object {
        const val MOVIE_BASE_URL = "https://api.themoviedb.org/3/"
    }

    @GET("movie/{query}")
    suspend fun getMoviesAsync(
        @Path("query") query: String,
        @Query("api_key") key: String,
        @Query("page") page: Int
    ):
            NetworkMovieResultContainer


    @GET("tv/{query}")
    suspend fun getTvShowsAsync(
        @Path("query") query: String,
        @Query("api_key") key: String,
        @Query("page") page: Int
    ):
            NetworkTvShowContainer

    @GET("movie/{id}")
    suspend fun getMovieDetails(
        @Path("id") id: String,
        @Query("api_key") key: String
    ): NetWorkMovieDetails

    @GET("tv/{id}")
    suspend fun getTvShowDetails(
        @Path("id") id: String,
        @Query("api_key") key: String
    ): Show

    @GET("tv/{id}/credits")
    suspend fun getCredits(
        @Path("id") id: String,
        @Query("api_key") key: String
    ): Credits

    @GET("tv/{id}/season/{s_no}")
    suspend fun getEpisodes(
        @Path("id") id: String,
        @Path("s_no") sNo: Int,
        @Query("api_key") key: String
    ): Season
}