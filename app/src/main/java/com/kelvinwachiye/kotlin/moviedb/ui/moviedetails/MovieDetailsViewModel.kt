package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails

import android.util.Log
import androidx.lifecycle.*
import com.kelvinwachiye.kotlin.moviedb.Key
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.domains.Movie
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetWorkMovieDetails
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

enum class ApiStatus { LOADING, ERROR, DONE }


private const val TAG = "MovieDetailsViewModel"

@HiltViewModel
class MovieDetailsViewModel
@Inject constructor(
    private val movieDbAPi: MovieDbAPi,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _details = MutableLiveData<NetWorkMovieDetails>()

    val details: LiveData<NetWorkMovieDetails>
        get() = _details

    // The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<ApiStatus>()

    // The external immutable LiveData for the request status
    val status: LiveData<ApiStatus>
        get() = _status
    private val id: String = savedStateHandle.get<Movie>("movie2")?.id ?: "0"


    init {
        getMovieDetails(id)
        Log.d(TAG, "called.............: ${savedStateHandle.get<Movie>("movie2")}")
    }

    fun getMovieDetails(id: String) {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            try {
                _details.value = movieDbAPi.getMovieDetails(id, Key.api_key)
                Log.d(TAG, "getMovieDetails: ${_details.value!!.language}")
                _status.value = ApiStatus.DONE
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                Log.d(TAG, "getMovieDetails: ${e.message}")
            }
        }
    }
}