package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.util.Log
import androidx.lifecycle.*
import com.kelvinwachiye.kotlin.moviedb.Key
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.Credits
import com.kelvinwachiye.kotlin.moviedb.domains.Season
import com.kelvinwachiye.kotlin.moviedb.domains.Show
import com.kelvinwachiye.kotlin.moviedb.domains.TvShow
import com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.ApiStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "ShowDetailsViewModel"


enum class EpisodesStatus { LOADING, ERROR, DONE }
@HiltViewModel
class ShowDetailsViewModel
@Inject constructor(
    private val movieDbAPi: MovieDbAPi,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val id = savedStateHandle.get<TvShow>("tvShow")?.id ?: "0"

    private val _show = MutableLiveData<Show>()
    val show: LiveData<Show>
        get() = _show

    private val _credits = MutableLiveData<Credits>()
    val credits: LiveData<Credits>
        get() = _credits

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _episodes = MutableLiveData<Season>()
    val episodes: LiveData<Season>
        get() = _episodes

    private val currentQuery = savedStateHandle.getLiveData(
        CURRENT_QUERY,
        DEFAULT_QUERY
    )

//    init {
//        getEpisodes(id, 1)
//        getShow(id)
//        getCredits(id)
//        Log.d(TAG, "init: ${savedStateHandle.get<TvShow>("tvShow")}")
//    }

    fun getShow(id: String) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            try {
                _show.value = movieDbAPi.getTvShowDetails(id, Key.api_key)
                _status.value = ApiStatus.DONE
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                Log.d(TAG, "getShow: ${e.message}")
            }
        }
    }

    fun getCredits(id: String) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            try {
                _credits.value = movieDbAPi.getCredits(id, Key.api_key)
                _status.value = ApiStatus.DONE
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                Log.d(TAG, "getCredits: ${e.message}")
            }
        }
    }

    fun getEpisodes(id: String, sNo: Int) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            try {
                _episodes.value = movieDbAPi.getEpisodes(id, sNo, Key.api_key)
                _status.value = ApiStatus.DONE
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                Log.d(TAG, "getEpisodes: ${e.message}")
            }
        }
    }

    companion object {
        private const val DEFAULT_QUERY = "1"
        private const val CURRENT_QUERY = "current_query"
    }

}