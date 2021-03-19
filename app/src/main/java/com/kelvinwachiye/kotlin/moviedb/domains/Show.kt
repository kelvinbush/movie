package com.kelvinwachiye.kotlin.moviedb.domains

import com.kelvinwachiye.kotlin.moviedb.utils.DefaultIfNull

@DefaultIfNull
data class Show(
    val first_air_date: String?,
    val genres: List<Genres>?,
    val last_air_date: String?,
    val number_of_episodes: String?,
    val number_of_seasons: Int?,
    val networks: List<Networks>?,
    val seasons: List<Seasons>?,
    val next_episode_to_air: NextEpisode?,
    val last_episode_to_air: LastEpisode?,
    val overview: String?,
    val original_language: String?,
    val vote_average: String?,
    val status: String?,
    val name: String?,
    val backdrop_path: String?,
    val poster_path: String?

)

@DefaultIfNull
data class Genres(
    val name: String?
)

@DefaultIfNull
data class Networks(
    val name: String?
)

@DefaultIfNull
data class Seasons(
    val air_date: String?,
    val episode_count: String?,
    val name: String?,
    val id: String?,
    val overview: String?,
    val poster_path: String?,
    val season_number: Int?
)

@DefaultIfNull
data class LastEpisode(
    val air_date: String?,
    val episode_number: Int?,
    val name: String?,
    val overview: String?,
    val season_number: Int?,
    val still_path: String?
)

@DefaultIfNull
data class NextEpisode(
    val air_date: String?,
    val episode_number: Int?,
    val name: String?,
    val overview: String?,
    val season_number: Int?,
    val still_path: String?
)

@DefaultIfNull
data class Cast(
    val original_name: String?,
    val character: String?,
    val profile_path: String?,
    val id: Int
)

@DefaultIfNull
data class Crew(
    val original_name: String?,
    val profile_path: String?,
    val job: String?
)

@DefaultIfNull
data class Credits(
    val cast: List<Cast>?,
    val crew: List<Crew>?
)