package com.kelvinwachiye.kotlin.moviedb.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J/\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J/\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi;", "", "getMovieDetails", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetWorkMovieDetails;", "id", "", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesAsync", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkMovieResultContainer;", "query", "page", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTvShowDetails", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Show;", "getTvShowsAsync", "Lcom/kelvinwachiye/kotlin/moviedb/domains/network/NetworkTvShowContainer;", "Companion", "app_debug"})
public abstract interface MovieDbAPi {
    public static final com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "b45a182d55eff71ad023468cb69d2ea5";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{query}")
    public abstract java.lang.Object getMoviesAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieResultContainer> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/{query}")
    public abstract java.lang.Object getTvShowsAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowContainer> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{id}")
    public abstract java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kelvinwachiye.kotlin.moviedb.domains.network.NetWorkMovieDetails> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/{id}")
    public abstract java.lang.Object getTvShowDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kelvinwachiye.kotlin.moviedb.domains.Show> p2);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/api/MovieDbAPi$Companion;", "", "()V", "API_KEY", "", "MOVIE_BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MOVIE_BASE_URL = "https://api.themoviedb.org/3/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY = "b45a182d55eff71ad023468cb69d2ea5";
        
        private Companion() {
            super();
        }
    }
}