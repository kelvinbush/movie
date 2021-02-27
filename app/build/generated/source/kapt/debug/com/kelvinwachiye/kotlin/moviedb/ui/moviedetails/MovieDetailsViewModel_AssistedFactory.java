package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class MovieDetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<MovieDetailsViewModel> {
  private final Provider<MovieDbAPi> movieDbAPi;

  @Inject
  MovieDetailsViewModel_AssistedFactory(Provider<MovieDbAPi> movieDbAPi) {
    this.movieDbAPi = movieDbAPi;
  }

  @Override
  @NonNull
  public MovieDetailsViewModel create(SavedStateHandle handle) {
    return new MovieDetailsViewModel(movieDbAPi.get(), handle);
  }
}
