package com.kelvinwachiye.kotlin.moviedb.ui.showdetails;

import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
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
public final class ShowDetailsViewModel_AssistedFactory_Factory implements Factory<ShowDetailsViewModel_AssistedFactory> {
  private final Provider<MovieDbAPi> movieDbAPiProvider;

  public ShowDetailsViewModel_AssistedFactory_Factory(Provider<MovieDbAPi> movieDbAPiProvider) {
    this.movieDbAPiProvider = movieDbAPiProvider;
  }

  @Override
  public ShowDetailsViewModel_AssistedFactory get() {
    return newInstance(movieDbAPiProvider);
  }

  public static ShowDetailsViewModel_AssistedFactory_Factory create(
      Provider<MovieDbAPi> movieDbAPiProvider) {
    return new ShowDetailsViewModel_AssistedFactory_Factory(movieDbAPiProvider);
  }

  public static ShowDetailsViewModel_AssistedFactory newInstance(Provider<MovieDbAPi> movieDbAPi) {
    return new ShowDetailsViewModel_AssistedFactory(movieDbAPi);
  }
}
