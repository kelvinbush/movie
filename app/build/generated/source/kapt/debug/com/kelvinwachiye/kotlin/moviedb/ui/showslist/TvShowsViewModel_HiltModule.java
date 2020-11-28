package com.kelvinwachiye.kotlin.moviedb.ui.showslist;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = TvShowsViewModel.class
)
public interface TvShowsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(TvShowsViewModel_AssistedFactory factory);
}
