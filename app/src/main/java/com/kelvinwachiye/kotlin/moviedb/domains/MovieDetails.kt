package com.kelvinwachiye.kotlin.moviedb.domains

data class MovieDetails(
    val id: String,
    val language: String?,
    val status: String?,
)

data class MovieTrailers(
    val trailers : List<MovieTrailer>
)
data  class MovieTrailer(
    val key : String?,
    val site: String?
)