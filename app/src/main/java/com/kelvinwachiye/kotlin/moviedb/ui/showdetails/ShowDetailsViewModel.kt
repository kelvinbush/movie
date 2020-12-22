package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.util.Log
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.kelvinwachiye.kotlin.moviedb.Key
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.Credits
import com.kelvinwachiye.kotlin.moviedb.domains.Show
import com.kelvinwachiye.kotlin.moviedb.domains.TvShow
import com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.ApiStatus
import kotlinx.coroutines.launch

private const val TAG = "ShowDetailsViewModel"

class ShowDetailsViewModel
@ViewModelInject constructor(
    private val movieDbAPi: MovieDbAPi,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _show = MutableLiveData<Show>()
    private val _credits = MutableLiveData<Credits>()

    private val id = savedStateHandle.get<TvShow>("tvShow")?.id ?: "0"

    // The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<ApiStatus>()

    // The external immutable LiveData for the request status
    val status: LiveData<ApiStatus>
        get() = _status

    val show: LiveData<Show>
        get() = _show
    val credits: LiveData<Credits>
        get() = _credits

    init {
        getShow(id)
        getCredits(id)
        Log.d(TAG, "init: ${savedStateHandle.get<TvShow>("tvShow")}")
    }

    private fun getShow(id: String) {
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

    private fun getCredits(id: String) {
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

}