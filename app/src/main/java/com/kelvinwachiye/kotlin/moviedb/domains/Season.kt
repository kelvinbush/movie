package com.kelvinwachiye.kotlin.moviedb.domains

data class Season(
    val episodes: List<Episode>?,
    val season_number: Int?
)

data class Episode(
    val name: String?,
    val air_date: String?,
    val overview: String?,
    val still_path: String?,
    val id: Int
)