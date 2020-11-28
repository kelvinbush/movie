package com.kelvinwachiye.kotlin.moviedb.ui.showslist;

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
public final class TvShowsViewModel_AssistedFactory_Factory implements Factory<TvShowsViewModel_AssistedFactory> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public TvShowsViewModel_AssistedFactory_Factory(Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public TvShowsViewModel_AssistedFactory get() {
    return newInstance(mainRepositoryProvider);
  }

  public static TvShowsViewModel_AssistedFactory_Factory create(
      Provider<MainRepository> mainRepositoryProvider) {
    return new TvShowsViewModel_AssistedFactory_Factory(mainRepositoryProvider);
  }

  public static TvShowsViewModel_AssistedFactory newInstance(
      Provider<MainRepository> mainRepository) {
    return new TvShowsViewModel_AssistedFactory(mainRepository);
  }
}
