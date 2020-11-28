package com.kelvinwachiye.kotlin.moviedb.di;

import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMovieDbApiFactory implements Factory<MovieDbAPi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideMovieDbApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MovieDbAPi get() {
    return provideMovieDbApi(retrofitProvider.get());
  }

  public static AppModule_ProvideMovieDbApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideMovieDbApiFactory(retrofitProvider);
  }

  public static MovieDbAPi provideMovieDbApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideMovieDbApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
