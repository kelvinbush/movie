package com.kelvinwachiye.kotlin.moviedb.ui.showslist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.kelvinwachiye.kotlin.moviedb.R;
import com.kelvinwachiye.kotlin.moviedb.domains.TvShow;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TvShowsFragmentDirections {
  private TvShowsFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationTvShowFragmentToShowDetailsFragment actionNavigationTvShowFragmentToShowDetailsFragment(
      @NonNull TvShow tvShow) {
    return new ActionNavigationTvShowFragmentToShowDetailsFragment(tvShow);
  }

  public static class ActionNavigationTvShowFragmentToShowDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationTvShowFragmentToShowDetailsFragment(@NonNull TvShow tvShow) {
      if (tvShow == null) {
        throw new IllegalArgumentException("Argument \"tvShow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvShow", tvShow);
    }

    @NonNull
    public ActionNavigationTvShowFragmentToShowDetailsFragment setTvShow(@NonNull TvShow tvShow) {
      if (tvShow == null) {
        throw new IllegalArgumentException("Argument \"tvShow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvShow", tvShow);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("tvShow")) {
        TvShow tvShow = (TvShow) arguments.get("tvShow");
        if (Parcelable.class.isAssignableFrom(TvShow.class) || tvShow == null) {
          __result.putParcelable("tvShow", Parcelable.class.cast(tvShow));
        } else if (Serializable.class.isAssignableFrom(TvShow.class)) {
          __result.putSerializable("tvShow", Serializable.class.cast(tvShow));
        } else {
          throw new UnsupportedOperationException(TvShow.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_navigation_tv_show_fragment_to_showDetailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public TvShow getTvShow() {
      return (TvShow) arguments.get("tvShow");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavigationTvShowFragmentToShowDetailsFragment that = (ActionNavigationTvShowFragmentToShowDetailsFragment) object;
      if (arguments.containsKey("tvShow") != that.arguments.containsKey("tvShow")) {
        return false;
      }
      if (getTvShow() != null ? !getTvShow().equals(that.getTvShow()) : that.getTvShow() != null) {
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
      result = 31 * result + (getTvShow() != null ? getTvShow().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavigationTvShowFragmentToShowDetailsFragment(actionId=" + getActionId() + "){"
          + "tvShow=" + getTvShow()
          + "}";
    }
  }
}
