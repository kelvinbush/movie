package com.kelvinwachiye.kotlin.moviedb.ui.showslist;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.kelvinwachiye.kotlin.moviedb.repository.MainRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class TvShowsViewModel_AssistedFactory implements ViewModelAssistedFactory<TvShowsViewModel> {
  private final Provider<MainRepository> mainRepository;

  @Inject
  TvShowsViewModel_AssistedFactory(Provider<MainRepository> mainRepository) {
    this.mainRepository = mainRepository;
  }

  @Override
  @NonNull
  public TvShowsViewModel create(SavedStateHandle handle) {
    return new TvShowsViewModel(mainRepository.get(), handle);
  }
}
