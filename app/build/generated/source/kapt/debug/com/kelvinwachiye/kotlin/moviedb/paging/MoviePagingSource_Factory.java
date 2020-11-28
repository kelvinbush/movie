package com.kelvinwachiye.kotlin.moviedb.paging;

import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoviePagingSource_Factory implements Factory<MoviePagingSource> {
  private final Provider<MovieDbAPi> movieDbAPiProvider;

  private final Provider<String> queryProvider;

  private final Provider<NetworkMovieMapper> networkMovieMapperProvider;

  public MoviePagingSource_Factory(Provider<MovieDbAPi> movieDbAPiProvider,
      Provider<String> queryProvider, Provider<NetworkMovieMapper> networkMovieMapperProvider) {
    this.movieDbAPiProvider = movieDbAPiProvider;
    this.queryProvider = queryProvider;
    this.networkMovieMapperProvider = networkMovieMapperProvider;
  }

  @Override
  public MoviePagingSource get() {
    return newInstance(movieDbAPiProvider.get(), queryProvider.get(), networkMovieMapperProvider.get());
  }

  public static MoviePagingSource_Factory create(Provider<MovieDbAPi> movieDbAPiProvider,
      Provider<String> queryProvider, Provider<NetworkMovieMapper> networkMovieMapperProvider) {
    return new MoviePagingSource_Factory(movieDbAPiProvider, queryProvider, networkMovieMapperProvider);
  }

  public static MoviePagingSource newInstance(MovieDbAPi movieDbAPi, String query,
      NetworkMovieMapper networkMovieMapper) {
    return new MoviePagingSource(movieDbAPi, query, networkMovieMapper);
  }
}
