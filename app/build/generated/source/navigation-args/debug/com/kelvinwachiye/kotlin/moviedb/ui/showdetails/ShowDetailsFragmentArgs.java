package com.kelvinwachiye.kotlin.moviedb.ui.showdetails;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.kelvinwachiye.kotlin.moviedb.domains.TvShow;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ShowDetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ShowDetailsFragmentArgs() {
  }

  private ShowDetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ShowDetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ShowDetailsFragmentArgs __result = new ShowDetailsFragmentArgs();
    bundle.setClassLoader(ShowDetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("tvShow")) {
      TvShow tvShow;
      if (Parcelable.class.isAssignableFrom(TvShow.class) || Serializable.class.isAssignableFrom(TvShow.class)) {
        tvShow = (TvShow) bundle.get("tvShow");
      } else {
        throw new UnsupportedOperationException(TvShow.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (tvShow == null) {
        throw new IllegalArgumentException("Argument \"tvShow\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("tvShow", tvShow);
    } else {
      throw new IllegalArgumentException("Required argument \"tvShow\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public TvShow getTvShow() {
    return (TvShow) arguments.get("tvShow");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ShowDetailsFragmentArgs that = (ShowDetailsFragmentArgs) object;
    if (arguments.containsKey("tvShow") != that.arguments.containsKey("tvShow")) {
      return false;
    }
    if (getTvShow() != null ? !getTvShow().equals(that.getTvShow()) : that.getTvShow() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTvShow() != null ? getTvShow().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ShowDetailsFragmentArgs{"
        + "tvShow=" + getTvShow()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ShowDetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull TvShow tvShow) {
      if (tvShow == null) {
        throw new IllegalArgumentException("Argument \"tvShow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvShow", tvShow);
    }

    @NonNull
    public ShowDetailsFragmentArgs build() {
      ShowDetailsFragmentArgs result = new ShowDetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTvShow(@NonNull TvShow tvShow) {
      if (tvShow == null) {
        throw new IllegalArgumentException("Argument \"tvShow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvShow", tvShow);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public TvShow getTvShow() {
      return (TvShow) arguments.get("tvShow");
    }
  }
}
