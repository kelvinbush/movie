package com.kelvinwachiye.kotlin.moviedb.ui.showdetails;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class ShowDetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<ShowDetailsViewModel> {
  private final Provider<MovieDbAPi> movieDbAPi;

  @Inject
  ShowDetailsViewModel_AssistedFactory(Provider<MovieDbAPi> movieDbAPi) {
    this.movieDbAPi = movieDbAPi;
  }

  @Override
  @NonNull
  public ShowDetailsViewModel create(SavedStateHandle handle) {
    return new ShowDetailsViewModel(movieDbAPi.get(), handle);
  }
}
