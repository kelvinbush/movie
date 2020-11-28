package com.kelvinwachiye.kotlin.moviedb.domains.network

import com.kelvinwachiye.kotlin.moviedb.domains.Movie
import com.kelvinwachiye.kotlin.moviedb.utils.EntityMapper
import javax.inject.Inject

class NetworkMovieMapper @Inject constructor(): EntityMapper<NetworkMovieResult, Movie> {
    override fun mapFromEntity(entity: NetworkMovieResult): Movie {
        return Movie(
            id = entity.id,
            title = entity.title,
            imageSrcUrl = entity.imageSrcUrl,
            overview = entity.overview,
            date = entity.date,
            rating = entity.rating
        )
    }

    override fun mapToEntity(domainModel: Movie): NetworkMovieResult {
        return NetworkMovieResult(
            id = domainModel.id,
            title = domainModel.title,
            imageSrcUrl = domainModel.imageSrcUrl,
            overview = domainModel.overview,
            date = domainModel.date,
            rating = domainModel.rating
        )
    }
    fun mapFromEntityList(entities: List<NetworkMovieResult>): List<Movie>{
        return entities.map { mapFromEntity(it) }
    }
}