package com.kelvinwachiye.kotlin.moviedb.domains.network

import com.kelvinwachiye.kotlin.moviedb.utils.DefaultIfNull
import com.squareup.moshi.Json


@DefaultIfNull
data class NetworkMovieResult(
    val id: String,
    @Json(name = "original_title") val title: String,
    @Json(name = "poster_path") val imageSrcUrl: String? = "",
    val overview: String? = "",
    @Json(name = "release_date") val date: String? = "",
    @Json(name = "vote_average") val rating: String? = ""
)


data class NetworkMovieResultContainer(
    @Json(name = "results") val movies: List<NetworkMovieResult>
)

@DefaultIfNull
data class NetworkTvShow(
    val id: String,
    val name: String,
    val overview: String? = "",
    @Json(name = "poster_path") val poster: String? = "",
    @Json(name = "first_air_date") val date: String? = "",
    @Json(name = "vote_average") val rating: String? = ""
)

data class NetworkTvShowContainer(
    @Json(name = "results") val shows: List<NetworkTvShow>
)

@DefaultIfNull
data class NetWorkMovieDetails(
    val id: String,
    @Json(name = "original_language")val language: String? = "",
    val status : String? = ""
)

