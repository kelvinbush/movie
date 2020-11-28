package com.kelvinwachiye.kotlin.moviedb.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/paging/MoviePagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Movie;", "movieDbAPi", "Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;", "query", "", "networkMovieMapper", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkMovieMapper;", "(Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;Ljava/lang/String;Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkMovieMapper;)V", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MoviePagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.kelvinwachiye.kotlin.moviedb.domains.Movie> {
    private final com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi = null;
    private final java.lang.String query = null;
    private final com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper networkMovieMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.kelvinwachiye.kotlin.moviedb.domains.Movie>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public MoviePagingSource(@org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi movieDbAPi, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper networkMovieMapper) {
        super();
    }
}