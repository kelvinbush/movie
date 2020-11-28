package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails;

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
public final class MovieDetailsViewModel_AssistedFactory_Factory implements Factory<MovieDetailsViewModel_AssistedFactory> {
  private final Provider<MovieDbAPi> movieDbAPiProvider;

  public MovieDetailsViewModel_AssistedFactory_Factory(Provider<MovieDbAPi> movieDbAPiProvider) {
    this.movieDbAPiProvider = movieDbAPiProvider;
  }

  @Override
  public MovieDetailsViewModel_AssistedFactory get() {
    return newInstance(movieDbAPiProvider);
  }

  public static MovieDetailsViewModel_AssistedFactory_Factory create(
      Provider<MovieDbAPi> movieDbAPiProvider) {
    return new MovieDetailsViewModel_AssistedFactory_Factory(movieDbAPiProvider);
  }

  public static MovieDetailsViewModel_AssistedFactory newInstance(Provider<MovieDbAPi> movieDbAPi) {
    return new MovieDetailsViewModel_AssistedFactory(movieDbAPi);
  }
}
