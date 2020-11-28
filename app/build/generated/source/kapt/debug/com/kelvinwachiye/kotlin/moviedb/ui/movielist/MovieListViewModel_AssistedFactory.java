package com.kelvinwachiye.kotlin.moviedb.ui.movielist;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.kelvinwachiye.kotlin.moviedb.repository.MainRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MovieListViewModel_AssistedFactory implements ViewModelAssistedFactory<MovieListViewModel> {
  private final Provider<MainRepository> mainRepository;

  @Inject
  MovieListViewModel_AssistedFactory(Provider<MainRepository> mainRepository) {
    this.mainRepository = mainRepository;
  }

  @Override
  @NonNull
  public MovieListViewModel create(SavedStateHandle arg0) {
    return new MovieListViewModel(mainRepository.get(), arg0);
  }
}
