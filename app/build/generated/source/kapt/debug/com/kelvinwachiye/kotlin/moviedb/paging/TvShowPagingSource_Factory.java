package com.kelvinwachiye.kotlin.moviedb.paging;

import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
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
public final class TvShowPagingSource_Factory implements Factory<TvShowPagingSource> {
  private final Provider<MovieDbAPi> movieDbAPiProvider;

  private final Provider<String> queryProvider;

  private final Provider<NetworkTvShowMapper> networkTvShowMapperProvider;

  public TvShowPagingSource_Factory(Provider<MovieDbAPi> movieDbAPiProvider,
      Provider<String> queryProvider, Provider<NetworkTvShowMapper> networkTvShowMapperProvider) {
    this.movieDbAPiProvider = movieDbAPiProvider;
    this.queryProvider = queryProvider;
    this.networkTvShowMapperProvider = networkTvShowMapperProvider;
  }

  @Override
  public TvShowPagingSource get() {
    return newInstance(movieDbAPiProvider.get(), queryProvider.get(), networkTvShowMapperProvider.get());
  }

  public static TvShowPagingSource_Factory create(Provider<MovieDbAPi> movieDbAPiProvider,
      Provider<String> queryProvider, Provider<NetworkTvShowMapper> networkTvShowMapperProvider) {
    return new TvShowPagingSource_Factory(movieDbAPiProvider, queryProvider, networkTvShowMapperProvider);
  }

  public static TvShowPagingSource newInstance(MovieDbAPi movieDbAPi, String query,
      NetworkTvShowMapper networkTvShowMapper) {
    return new TvShowPagingSource(movieDbAPi, query, networkTvShowMapper);
  }
}
