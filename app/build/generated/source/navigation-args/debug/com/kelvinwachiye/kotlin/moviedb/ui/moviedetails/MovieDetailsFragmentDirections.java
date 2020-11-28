package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kelvinwachiye.kotlin.moviedb.R;

public class MovieDetailsFragmentDirections {
  private MovieDetailsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailsFragmentToNavigationMovieList() {
    return new ActionOnlyNavDirections(R.id.action_detailsFragment_to_navigation_movie_list);
  }
}
