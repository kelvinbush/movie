package com.kelvinwachiye.kotlin.moviedb.ui.movielist;

import com.kelvinwachiye.kotlin.moviedb.repository.MainRepository;
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
public final class MovieListViewModel_AssistedFactory_Factory implements Factory<MovieListViewModel_AssistedFactory> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public MovieListViewModel_AssistedFactory_Factory(
      Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public MovieListViewModel_AssistedFactory get() {
    return newInstance(mainRepositoryProvider);
  }

  public static MovieListViewModel_AssistedFactory_Factory create(
      Provider<MainRepository> mainRepositoryProvider) {
    return new MovieListViewModel_AssistedFactory_Factory(mainRepositoryProvider);
  }

  public static MovieListViewModel_AssistedFactory newInstance(
      Provider<MainRepository> mainRepository) {
    return new MovieListViewModel_AssistedFactory(mainRepository);
  }
}
