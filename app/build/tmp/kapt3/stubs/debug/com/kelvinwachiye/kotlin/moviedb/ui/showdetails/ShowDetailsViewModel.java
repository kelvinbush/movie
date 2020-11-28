package com.kelvinwachiye.kotlin.moviedb.ui.showdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/ui/showdetails/ShowDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "movieDbAPi", "Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;Landroidx/lifecycle/SavedStateHandle;)V", "_show", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Show;", "_status", "Lcom/kelvinwachiye/kotlin/moviedb/ui/moviedetails/ApiStatus;", "id", "", "show", "Landroidx/lifecycle/LiveData;", "getShow", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "", "app_debug"})
public final class ShowDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.kelvinwachiye.kotlin.moviedb.domains.Show> _show = null;
    private final java.lang.String id = null;
    private final androidx.lifecycle.MutableLiveData<com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.ApiStatus> _status = null;
    private final com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kelvinwachiye.kotlin.moviedb.domains.Show> getShow() {
        return null;
    }
    
    private final void getShow(java.lang.String id) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ShowDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}