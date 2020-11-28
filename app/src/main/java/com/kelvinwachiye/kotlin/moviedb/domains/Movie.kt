package com.kelvinwachiye.kotlin.moviedb.domains

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Movie(
    val id: String,
    val title: String,
    val imageSrcUrl: String?,
    val overview: String?,
    val date: String?,
    val rating: String?
) : Parcelable