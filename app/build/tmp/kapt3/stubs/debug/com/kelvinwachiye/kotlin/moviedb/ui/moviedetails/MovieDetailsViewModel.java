package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/ui/moviedetails/MovieDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "movieDbAPi", "Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;Landroidx/lifecycle/SavedStateHandle;)V", "_details", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetWorkMovieDetails;", "_status", "Lcom/kelvinwachiye/kotlin/moviedb/ui/moviedetails/ApiStatus;", "details", "Landroidx/lifecycle/LiveData;", "getDetails", "()Landroidx/lifecycle/LiveData;", "id", "", "status", "getStatus", "getMovieDetails", "", "app_debug"})
public final class MovieDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.kelvinwachiye.kotlin.moviedb.domains.network.NetWorkMovieDetails> _details = null;
    private final androidx.lifecycle.MutableLiveData<com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.ApiStatus> _status = null;
    private final java.lang.String id = null;
    private final com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kelvinwachiye.kotlin.moviedb.domains.network.NetWorkMovieDetails> getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.ApiStatus> getStatus() {
        return null;
    }
    
    private final void getMovieDetails(java.lang.String id) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MovieDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}