package com.kelvinwachiye.kotlin.moviedb.repository;

import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper;
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowMapper;
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
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<MovieDbAPi> movieDbAPiProvider;

  private final Provider<NetworkMovieMapper> networkMovieMapperProvider;

  private final Provider<NetworkTvShowMapper> tvShowMapperProvider;

  public MainRepository_Factory(Provider<MovieDbAPi> movieDbAPiProvider,
      Provider<NetworkMovieMapper> networkMovieMapperProvider,
      Provider<NetworkTvShowMapper> tvShowMapperProvider) {
    this.movieDbAPiProvider = movieDbAPiProvider;
    this.networkMovieMapperProvider = networkMovieMapperProvider;
    this.tvShowMapperProvider = tvShowMapperProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(movieDbAPiProvider.get(), networkMovieMapperProvider.get(), tvShowMapperProvider.get());
  }

  public static MainRepository_Factory create(Provider<MovieDbAPi> movieDbAPiProvider,
      Provider<NetworkMovieMapper> networkMovieMapperProvider,
      Provider<NetworkTvShowMapper> tvShowMapperProvider) {
    return new MainRepository_Factory(movieDbAPiProvider, networkMovieMapperProvider, tvShowMapperProvider);
  }

  public static MainRepository newInstance(MovieDbAPi movieDbAPi,
      NetworkMovieMapper networkMovieMapper, NetworkTvShowMapper tvShowMapper) {
    return new MainRepository(movieDbAPi, networkMovieMapper, tvShowMapper);
  }
}
