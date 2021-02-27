package com.kelvinwachiye.kotlin.moviedb.ui.movielist;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = MovieListViewModel.class
)
public interface MovieListViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.kelvinwachiye.kotlin.moviedb.ui.movielist.MovieListViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(MovieListViewModel_AssistedFactory factory);
}
