package com.kelvinwachiye.kotlin.moviedb;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kelvinwachiye.kotlin.moviedb.databinding.EpisodesListItemBindingImpl;
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentDetailsBindingImpl;
import com.kelvinwachiye.kotlin.moviedb.databinding.GridItemMovieBindingImpl;
import com.kelvinwachiye.kotlin.moviedb.databinding.GridItemShowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_EPISODESLISTITEM = 1;

  private static final int LAYOUT_FRAGMENTDETAILS = 2;

  private static final int LAYOUT_GRIDITEMMOVIE = 3;

  private static final int LAYOUT_GRIDITEMSHOW = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kelvinwachiye.kotlin.moviedb.R.layout.episodes_list_item, LAYOUT_EPISODESLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kelvinwachiye.kotlin.moviedb.R.layout.fragment_details, LAYOUT_FRAGMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kelvinwachiye.kotlin.moviedb.R.layout.grid_item_movie, LAYOUT_GRIDITEMMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kelvinwachiye.kotlin.moviedb.R.layout.grid_item_show, LAYOUT_GRIDITEMSHOW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_EPISODESLISTITEM: {
          if ("layout/episodes_list_item_0".equals(tag)) {
            return new EpisodesListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for episodes_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILS: {
          if ("layout/fragment_details_0".equals(tag)) {
            return new FragmentDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_details is invalid. Received: " + tag);
        }
        case  LAYOUT_GRIDITEMMOVIE: {
          if ("layout/grid_item_movie_0".equals(tag)) {
            return new GridItemMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for grid_item_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_GRIDITEMSHOW: {
          if ("layout/grid_item_show_0".equals(tag)) {
            return new GridItemShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for grid_item_show is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "episode");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/episodes_list_item_0", com.kelvinwachiye.kotlin.moviedb.R.layout.episodes_list_item);
      sKeys.put("layout/fragment_details_0", com.kelvinwachiye.kotlin.moviedb.R.layout.fragment_details);
      sKeys.put("layout/grid_item_movie_0", com.kelvinwachiye.kotlin.moviedb.R.layout.grid_item_movie);
      sKeys.put("layout/grid_item_show_0", com.kelvinwachiye.kotlin.moviedb.R.layout.grid_item_show);
    }
  }
}
