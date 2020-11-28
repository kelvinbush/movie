package com.kelvinwachiye.kotlin.moviedb.domains.network

import com.kelvinwachiye.kotlin.moviedb.domains.TvShow
import com.kelvinwachiye.kotlin.moviedb.utils.EntityMapper
import javax.inject.Inject

class NetworkTvShowMapper @Inject constructor() : EntityMapper<NetworkTvShow, TvShow> {
    override fun mapFromEntity(entity: NetworkTvShow): TvShow {
        return TvShow(
            id = entity.id,
            name = entity.name,
            overview = entity.overview,
            poster = entity.poster,
            date = entity.date,
            rating = entity.rating
        )
    }

    override fun mapToEntity(domainModel: TvShow): NetworkTvShow {
        TODO("Not yet implemented")
    }

    fun mapFromEntityList(entities: List<NetworkTvShow>) : List<TvShow>{
        return entities.map { mapFromEntity(it) }
    }
}