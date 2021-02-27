package com.kelvinwachiye.kotlin.moviedb.domains

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class TvShow(
    val id: String,
    val name: String,
    val overview: String?,
    val poster: String?,
    val date: String?,
    val rating: String?
) : Parcelable