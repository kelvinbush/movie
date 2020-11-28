package com.kelvinwachiye.kotlin.moviedb;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi;
import com.kelvinwachiye.kotlin.moviedb.di.AppModule;
import com.kelvinwachiye.kotlin.moviedb.di.AppModule_ProvideMoshiFactory;
import com.kelvinwachiye.kotlin.moviedb.di.AppModule_ProvideMovieDbApiFactory;
import com.kelvinwachiye.kotlin.moviedb.di.AppModule_ProvideRetrofitFactory;
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkMovieMapper;
import com.kelvinwachiye.kotlin.moviedb.domains.network.NetworkTvShowMapper;
import com.kelvinwachiye.kotlin.moviedb.repository.MainRepository;
import com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsFragment;
import com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsViewModel_AssistedFactory;
import com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsViewModel_AssistedFactory_Factory;
import com.kelvinwachiye.kotlin.moviedb.ui.movielist.MovieListFragment;
import com.kelvinwachiye.kotlin.moviedb.ui.movielist.MovieListViewModel_AssistedFactory;
import com.kelvinwachiye.kotlin.moviedb.ui.movielist.MovieListViewModel_AssistedFactory_Factory;
import com.kelvinwachiye.kotlin.moviedb.ui.showdetails.ShowDetailsFragment;
import com.kelvinwachiye.kotlin.moviedb.ui.showdetails.ShowDetailsViewModel_AssistedFactory;
import com.kelvinwachiye.kotlin.moviedb.ui.showdetails.ShowDetailsViewModel_AssistedFactory_Factory;
import com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsFragment;
import com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsViewModel_AssistedFactory;
import com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsViewModel_AssistedFactory_Factory;
import com.squareup.moshi.Moshi;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMovieApplication_HiltComponents_ApplicationC extends MovieApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object moshi = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object movieDbAPi = new MemoizedSentinel();

  private volatile Provider<MovieDbAPi> provideMovieDbApiProvider;

  private volatile Object mainRepository = new MemoizedSentinel();

  private volatile Provider<MainRepository> mainRepositoryProvider;

  private DaggerMovieApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Moshi getMoshi() {
    Object local = moshi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moshi;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideMoshiFactory.provideMoshi();
          moshi = DoubleCheck.reentrantCheck(moshi, local);
        }
      }
    }
    return (Moshi) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit(getMoshi());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private MovieDbAPi getMovieDbAPi() {
    Object local = movieDbAPi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = movieDbAPi;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideMovieDbApiFactory.provideMovieDbApi(getRetrofit());
          movieDbAPi = DoubleCheck.reentrantCheck(movieDbAPi, local);
        }
      }
    }
    return (MovieDbAPi) local;
  }

  private Provider<MovieDbAPi> getMovieDbAPiProvider() {
    Object local = provideMovieDbApiProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideMovieDbApiProvider = (Provider<MovieDbAPi>) local;
    }
    return (Provider<MovieDbAPi>) local;
  }

  private MainRepository getMainRepository() {
    Object local = mainRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = mainRepository;
        if (local instanceof MemoizedSentinel) {
          local = new MainRepository(getMovieDbAPi(), new NetworkMovieMapper(), new NetworkTvShowMapper());
          mainRepository = DoubleCheck.reentrantCheck(mainRepository, local);
        }
      }
    }
    return (MainRepository) local;
  }

  private Provider<MainRepository> getMainRepositoryProvider() {
    Object local = mainRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      mainRepositoryProvider = (Provider<MainRepository>) local;
    }
    return (Provider<MainRepository>) local;
  }

  @Override
  public void injectMovieApplication(MovieApplication movieApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MovieApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMovieApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MovieApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MovieApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MovieApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MovieApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MovieApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MovieApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MovieDetailsViewModel_AssistedFactory> movieDetailsViewModel_AssistedFactoryProvider;

      private volatile Provider<MovieListViewModel_AssistedFactory> movieListViewModel_AssistedFactoryProvider;

      private volatile Provider<ShowDetailsViewModel_AssistedFactory> showDetailsViewModel_AssistedFactoryProvider;

      private volatile Provider<TvShowsViewModel_AssistedFactory> tvShowsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MovieDetailsViewModel_AssistedFactory getMovieDetailsViewModel_AssistedFactory() {
        return MovieDetailsViewModel_AssistedFactory_Factory.newInstance(DaggerMovieApplication_HiltComponents_ApplicationC.this.getMovieDbAPiProvider());
      }

      private Provider<MovieDetailsViewModel_AssistedFactory> getMovieDetailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = movieDetailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          movieDetailsViewModel_AssistedFactoryProvider = (Provider<MovieDetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<MovieDetailsViewModel_AssistedFactory>) local;
      }

      private MovieListViewModel_AssistedFactory getMovieListViewModel_AssistedFactory() {
        return MovieListViewModel_AssistedFactory_Factory.newInstance(DaggerMovieApplication_HiltComponents_ApplicationC.this.getMainRepositoryProvider());
      }

      private Provider<MovieListViewModel_AssistedFactory> getMovieListViewModel_AssistedFactoryProvider(
          ) {
        Object local = movieListViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          movieListViewModel_AssistedFactoryProvider = (Provider<MovieListViewModel_AssistedFactory>) local;
        }
        return (Provider<MovieListViewModel_AssistedFactory>) local;
      }

      private ShowDetailsViewModel_AssistedFactory getShowDetailsViewModel_AssistedFactory() {
        return ShowDetailsViewModel_AssistedFactory_Factory.newInstance(DaggerMovieApplication_HiltComponents_ApplicationC.this.getMovieDbAPiProvider());
      }

      private Provider<ShowDetailsViewModel_AssistedFactory> getShowDetailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = showDetailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          showDetailsViewModel_AssistedFactoryProvider = (Provider<ShowDetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<ShowDetailsViewModel_AssistedFactory>) local;
      }

      private TvShowsViewModel_AssistedFactory getTvShowsViewModel_AssistedFactory() {
        return TvShowsViewModel_AssistedFactory_Factory.newInstance(DaggerMovieApplication_HiltComponents_ApplicationC.this.getMainRepositoryProvider());
      }

      private Provider<TvShowsViewModel_AssistedFactory> getTvShowsViewModel_AssistedFactoryProvider(
          ) {
        Object local = tvShowsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          tvShowsViewModel_AssistedFactoryProvider = (Provider<TvShowsViewModel_AssistedFactory>) local;
        }
        return (Provider<TvShowsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(4).put("com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsViewModel", (Provider) getMovieDetailsViewModel_AssistedFactoryProvider()).put("com.kelvinwachiye.kotlin.moviedb.ui.movielist.MovieListViewModel", (Provider) getMovieListViewModel_AssistedFactoryProvider()).put("com.kelvinwachiye.kotlin.moviedb.ui.showdetails.ShowDetailsViewModel", (Provider) getShowDetailsViewModel_AssistedFactoryProvider()).put("com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsViewModel", (Provider) getTvShowsViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMovieApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MovieApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MovieApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MovieApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMovieApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectMovieDetailsFragment(MovieDetailsFragment movieDetailsFragment) {
        }

        @Override
        public void injectMovieListFragment(MovieListFragment movieListFragment) {
        }

        @Override
        public void injectShowDetailsFragment(ShowDetailsFragment showDetailsFragment) {
        }

        @Override
        public void injectTvShowsFragment(TvShowsFragment tvShowsFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MovieApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MovieApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MovieApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MovieApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MovieApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MovieApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMovieDetailsViewModel_AssistedFactory();

            case 1: // com.kelvinwachiye.kotlin.moviedb.ui.movielist.MovieListViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMovieListViewModel_AssistedFactory();

            case 2: // com.kelvinwachiye.kotlin.moviedb.ui.showdetails.ShowDetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getShowDetailsViewModel_AssistedFactory();

            case 3: // com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getTvShowsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MovieApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MovieApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MovieApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi 
        return (T) DaggerMovieApplication_HiltComponents_ApplicationC.this.getMovieDbAPi();

        case 1: // com.kelvinwachiye.kotlin.moviedb.repository.MainRepository 
        return (T) DaggerMovieApplication_HiltComponents_ApplicationC.this.getMainRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
