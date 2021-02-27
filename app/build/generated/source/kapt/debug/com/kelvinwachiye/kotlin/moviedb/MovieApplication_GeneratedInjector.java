package com.kelvinwachiye.kotlin.moviedb;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MovieApplication.class
)
@GeneratedEntryPoint
@InstallIn(ApplicationComponent.class)
public interface MovieApplication_GeneratedInjector {
  void injectMovieApplication(MovieApplication movieApplication);
}
