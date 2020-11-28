package com.kelvinwachiye.kotlin.moviedb.domains;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0087\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016\u00a8\u00060"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/domains/Show;", "", "first_air_date", "", "genres", "", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Genres;", "last_air_date", "number_of_episodes", "number_of_seasons", "networks", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Networks;", "seasons", "Lcom/kelvinwachiye/kotlin/moviedb/domains/Seasons;", "next_episode_to_air", "Lcom/kelvinwachiye/kotlin/moviedb/domains/NextEpisode;", "last_episode_to_air", "Lcom/kelvinwachiye/kotlin/moviedb/domains/LastEpisode;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kelvinwachiye/kotlin/moviedb/domains/NextEpisode;Lcom/kelvinwachiye/kotlin/moviedb/domains/LastEpisode;)V", "getFirst_air_date", "()Ljava/lang/String;", "getGenres", "()Ljava/util/List;", "getLast_air_date", "getLast_episode_to_air", "()Lcom/kelvinwachiye/kotlin/moviedb/domains/LastEpisode;", "getNetworks", "getNext_episode_to_air", "()Lcom/kelvinwachiye/kotlin/moviedb/domains/NextEpisode;", "getNumber_of_episodes", "getNumber_of_seasons", "getSeasons", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@com.kelvinwachiye.kotlin.moviedb.utils.DefaultIfNull()
public final class Show {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String first_air_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Genres> genres = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last_air_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String number_of_episodes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String number_of_seasons = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Networks> networks = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Seasons> seasons = null;
    @org.jetbrains.annotations.Nullable()
    private final com.kelvinwachiye.kotlin.moviedb.domains.NextEpisode next_episode_to_air = null;
    @org.jetbrains.annotations.Nullable()
    private final com.kelvinwachiye.kotlin.moviedb.domains.LastEpisode last_episode_to_air = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_air_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Genres> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_air_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumber_of_episodes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumber_of_seasons() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Networks> getNetworks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Seasons> getSeasons() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.kelvinwachiye.kotlin.moviedb.domains.NextEpisode getNext_episode_to_air() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.kelvinwachiye.kotlin.moviedb.domains.LastEpisode getLast_episode_to_air() {
        return null;
    }
    
    public Show(@org.jetbrains.annotations.Nullable()
    java.lang.String first_air_date, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String last_air_date, @org.jetbrains.annotations.Nullable()
    java.lang.String number_of_episodes, @org.jetbrains.annotations.Nullable()
    java.lang.String number_of_seasons, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Networks> networks, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Seasons> seasons, @org.jetbrains.annotations.Nullable()
    com.kelvinwachiye.kotlin.moviedb.domains.NextEpisode next_episode_to_air, @org.jetbrains.annotations.Nullable()
    com.kelvinwachiye.kotlin.moviedb.domains.LastEpisode last_episode_to_air) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Genres> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Networks> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Seasons> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.kelvinwachiye.kotlin.moviedb.domains.NextEpisode component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.kelvinwachiye.kotlin.moviedb.domains.LastEpisode component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kelvinwachiye.kotlin.moviedb.domains.Show copy(@org.jetbrains.annotations.Nullable()
    java.lang.String first_air_date, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String last_air_date, @org.jetbrains.annotations.Nullable()
    java.lang.String number_of_episodes, @org.jetbrains.annotations.Nullable()
    java.lang.String number_of_seasons, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Networks> networks, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kelvinwachiye.kotlin.moviedb.domains.Seasons> seasons, @org.jetbrains.annotations.Nullable()
    com.kelvinwachiye.kotlin.moviedb.domains.NextEpisode next_episode_to_air, @org.jetbrains.annotations.Nullable()
    com.kelvinwachiye.kotlin.moviedb.domains.LastEpisode last_episode_to_air) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}