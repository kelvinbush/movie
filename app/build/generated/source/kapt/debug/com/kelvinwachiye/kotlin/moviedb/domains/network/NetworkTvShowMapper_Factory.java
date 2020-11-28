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
public final class NetworkTvShowMapper_Factory implements Factory<NetworkTvShowMapper> {
  @Override
  public NetworkTvShowMapper get() {
    return newInstance();
  }

  public static NetworkTvShowMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkTvShowMapper newInstance() {
    return new NetworkTvShowMapper();
  }

  private static final class InstanceHolder {
    private static final NetworkTvShowMapper_Factory INSTANCE = new NetworkTvShowMapper_Factory();
  }
}
