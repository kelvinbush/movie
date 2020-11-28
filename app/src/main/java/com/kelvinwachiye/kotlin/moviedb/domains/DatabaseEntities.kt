package com.kelvinwachiye.kotlin.moviedb.domains

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DatabaseMovie constructor(
    @PrimaryKey
    val id: String,
    val title: String,
    val imageSrcUrl: String,
    val overview: String,
    val date: String,
    val rating: String
)

fun List<DatabaseMovie>.asDomainModel(): List<Movie> {
    return map {
        Movie(
            id = it.id,
            title = it.title,
            imageSrcUrl = it.imageSrcUrl,
            overview = it.overview,
            date = it.date,
            rating = it.rating
        )
    }
}