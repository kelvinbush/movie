package com.kelvinwachiye.kotlin.moviedb.ui.showslist

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.kelvinwachiye.kotlin.moviedb.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TvShowsViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    stateHandle: SavedStateHandle
) :
    ViewModel() {

    private val currentQuery = stateHandle.getLiveData(
        CURRENT_QUERY,
        DEFAULT_QUERY
    )

    val shows = currentQuery.switchMap { queryString ->
        mainRepository.getTvShows(queryString).cachedIn(viewModelScope)
    }

    fun searchTvShows(query: String) {
        currentQuery.value = query
    }

    companion object {
        private const val DEFAULT_QUERY = "popular"
        private const val CURRENT_QUERY = "current_query"
    }
}