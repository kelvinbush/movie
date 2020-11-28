package com.kelvinwachiye.kotlin.moviedb.ui.movielist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.kelvinwachiye.kotlin.moviedb.R;
import com.kelvinwachiye.kotlin.moviedb.domains.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MovieListFragmentDirections {
  private MovieListFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationMovieListToDetailsFragment actionNavigationMovieListToDetailsFragment(
      @NonNull Movie movie) {
    return new ActionNavigationMovieListToDetailsFragment(movie);
  }

  public static class ActionNavigationMovieListToDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationMovieListToDetailsFragment(@NonNull Movie movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
    }

    @NonNull
    public ActionNavigationMovieListToDetailsFragment setMovie(@NonNull Movie movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_navigation_movie_list_to_detailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getMovie() {
      return (Movie) arguments.get("movie");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavigationMovieListToDetailsFragment that = (ActionNavigationMovieListToDetailsFragment) object;
      if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
        return false;
      }
      if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavigationMovieListToDetailsFragment(actionId=" + getActionId() + "){"
          + "movie=" + getMovie()
          + "}";
    }
  }
}
