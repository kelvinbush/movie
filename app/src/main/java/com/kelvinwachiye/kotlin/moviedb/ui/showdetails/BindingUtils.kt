package com.kelvinwachiye.kotlin.moviedb.ui.showdetails


import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants
import com.kelvinwachiye.kotlin.moviedb.domains.Cast
import com.kelvinwachiye.kotlin.moviedb.domains.Episode

@BindingAdapter("character")
fun TextView.setCharacter(item: Cast?) {
    item?.let {
        text = item.character
    }
}

@BindingAdapter("originalName")
fun TextView.setOriginalName(item: Cast?) {
    item?.let {
        text = item.original_name
    }
}

@BindingAdapter("castImage")
fun setCastImage(view: ImageView, url: String) {
    Glide.with(view.context)
        .load(MyConstants.IMAGE_BASE_URL + url)
        .error(R.drawable.ic_broken_image)
        .into(view)

}

@BindingAdapter("overview")
fun TextView.setOverview(item: Episode?) {
    item?.let {
        text = item.overview
    }
}

@BindingAdapter("name")
fun TextView.setName(item: Episode?) {
    item?.let {
        text = item.name
    }
}
