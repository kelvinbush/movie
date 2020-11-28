package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.kelvinwachiye.kotlin.moviedb.domains.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MovieDetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MovieDetailsFragmentArgs() {
  }

  private MovieDetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MovieDetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MovieDetailsFragmentArgs __result = new MovieDetailsFragmentArgs();
    bundle.setClassLoader(MovieDetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("movie")) {
      Movie movie;
      if (Parcelable.class.isAssignableFrom(Movie.class) || Serializable.class.isAssignableFrom(Movie.class)) {
        movie = (Movie) bundle.get("movie");
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("movie", movie);
    } else {
      throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Movie getMovie() {
    return (Movie) arguments.get("movie");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("movie")) {
      Movie movie = (Movie) arguments.get("movie");
      if (Parcelable.class.isAssignableFrom(Movie.class) || movie == null) {
        __result.putParcelable("movie", Parcelable.class.cast(movie));
      } else if (Serializable.class.isAssignableFrom(Movie.class)) {
        __result.putSerializable("movie", Serializable.class.cast(movie));
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    MovieDetailsFragmentArgs that = (MovieDetailsFragmentArgs) object;
    if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
      return false;
    }
    if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MovieDetailsFragmentArgs{"
        + "movie=" + getMovie()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(MovieDetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Movie movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
    }

    @NonNull
    public MovieDetailsFragmentArgs build() {
      MovieDetailsFragmentArgs result = new MovieDetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMovie(@NonNull Movie movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getMovie() {
      return (Movie) arguments.get("movie");
    }
  }
}
