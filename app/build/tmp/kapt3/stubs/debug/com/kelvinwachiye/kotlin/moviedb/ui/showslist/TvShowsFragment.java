package com.kelvinwachiye.kotlin.moviedb.ui.showslist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/kelvinwachiye/kotlin/moviedb/ui/showslist/TvShowsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kelvinwachiye/kotlin/moviedb/adapters/ShowsAdapter$OnItemClickListener;", "()V", "_binding", "Lcom/kelvinwachiye/kotlin/moviedb/databinding/FragmentShowListBinding;", "binding", "getBinding", "()Lcom/kelvinwachiye/kotlin/moviedb/databinding/FragmentShowListBinding;", "tvShowsViewModel", "Lcom/kelvinwachiye/kotlin/moviedb/ui/showslist/TvShowsViewModel;", "getTvShowsViewModel", "()Lcom/kelvinwachiye/kotlin/moviedb/ui/showslist/TvShowsViewModel;", "tvShowsViewModel$delegate", "Lkotlin/Lazy;", "onItemClick", "", "show", "Lcom/kelvinwachiye/kotlin/moviedb/domains/TvShow;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TvShowsFragment extends androidx.fragment.app.Fragment implements com.kelvinwachiye.kotlin.moviedb.adapters.ShowsAdapter.OnItemClickListener {
    private final kotlin.Lazy tvShowsViewModel$delegate = null;
    private com.kelvinwachiye.kotlin.moviedb.databinding.FragmentShowListBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.kelvinwachiye.kotlin.moviedb.ui.showslist.TvShowsViewModel getTvShowsViewModel() {
        return null;
    }
    
    private final com.kelvinwachiye.kotlin.moviedb.databinding.FragmentShowListBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.kelvinwachiye.kotlin.moviedb.domains.TvShow show) {
    }
    
    public TvShowsFragment() {
        super();
    }
}