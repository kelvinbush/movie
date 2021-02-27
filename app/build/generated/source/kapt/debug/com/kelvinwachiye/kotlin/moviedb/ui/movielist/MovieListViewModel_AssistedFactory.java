package com.kelvinwachiye.kotlin.moviedb.ui.movielist;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.kelvinwachiye.kotlin.moviedb.repository.MainRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class MovieListViewModel_AssistedFactory implements ViewModelAssistedFactory<MovieListViewModel> {
  private final Provider<MainRepository> mainRepository;

  @Inject
  MovieListViewModel_AssistedFactory(Provider<MainRepository> mainRepository) {
    this.mainRepository = mainRepository;
  }

  @Override
  @NonNull
  public MovieListViewModel create(SavedStateHandle handle) {
    return new MovieListViewModel(mainRepository.get(), handle);
  }
}
