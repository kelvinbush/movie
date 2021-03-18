package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.kelvinwachiye.kotlin.moviedb.domains.Episode

class BindingUtils {

    @BindingAdapter("name")
    fun TextView.setName(item: Episode?) {
        item?.let {
            text = item.name
        }
    }

    @BindingAdapter("overview")
    fun TextView.setOverview(item: Episode?){
        item?.let {
            text = item.overview
        }
    }
}