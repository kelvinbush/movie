package com.kelvinwachiye.kotlin.moviedb.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/repository/MainRepository;", "", "movieDbAPi", "Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;", "networkMovieMapper", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkMovieMapper;", "tvShowMapper", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkTvShowMapper;", "(Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkMovieMapper;Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkTvShowMapper;)V", "getMovies", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Movie;", "query", "", "getTvShows", "Lcom/kelvinwachiye/kotlin/moviedb/domains/TvShow;", "app_debug"})
@javax.inject.Singleton()
public final class MainRepository {
    private final com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi = null;
    private final com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper networkMovieMapper = null;
    private final com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowMapper tvShowMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.kelvinwachiye.kotlin.moviedb.domains.Movie>> getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.kelvinwachiye.kotlin.moviedb.domains.TvShow>> getTvShows(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi, @org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper networkMovieMapper, @org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowMapper tvShowMapper) {
        super();
    }
}