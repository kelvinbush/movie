package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kelvinwachiye.kotlin.moviedb.Key
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.Season
import javax.inject.Inject


class MovieDetailsRepo @Inject constructor(private val movieDbAPi: MovieDbAPi) {
    private lateinit var mEpisodes: MutableLiveData<Season>

    private fun getEpisodesFromApi(id: String) {
        mEpisodes.value = movieDbAPi.getEpisodes(id, 1, Key.api_key)
    }

    fun getEpisodes(id: String): LiveData<Season> {
        getEpisodesFromApi(id)
        return mEpisodes
    }
}