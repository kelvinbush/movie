package com.kelvinwachiye.kotlin.moviedb.di;

import com.squareup.moshi.Moshi;
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
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Moshi> moshiProvider;

  public AppModule_ProvideRetrofitFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(moshiProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(Provider<Moshi> moshiProvider) {
    return new AppModule_ProvideRetrofitFactory(moshiProvider);
  }

  public static Retrofit provideRetrofit(Moshi moshi) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRetrofit(moshi), "Cannot return null from a non-@Nullable @Provides method");
  }
}
