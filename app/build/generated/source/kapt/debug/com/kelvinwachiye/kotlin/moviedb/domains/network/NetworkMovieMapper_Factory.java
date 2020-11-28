package com.kelvinwachiye.kotlin.moviedb.domains.network;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkMovieMapper_Factory implements Factory<NetworkMovieMapper> {
  @Override
  public NetworkMovieMapper get() {
    return newInstance();
  }

  public static NetworkMovieMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkMovieMapper newInstance() {
    return new NetworkMovieMapper();
  }

  private static final class InstanceHolder {
    private static final NetworkMovieMapper_Factory INSTANCE = new NetworkMovieMapper_Factory();
  }
}
