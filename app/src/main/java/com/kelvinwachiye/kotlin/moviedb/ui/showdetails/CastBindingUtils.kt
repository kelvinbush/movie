package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants
import com.kelvinwachiye.kotlin.moviedb.domains.Cast

class CastBindingUtils {

    companion object {
        @BindingAdapter("character")
        @JvmStatic
        fun TextView.setCharacter(item: Cast?) {
            item?.let {
                text =  item.character
            }
        }

        @BindingAdapter("originalName")
        @JvmStatic
        fun TextView.setOriginalName(item: Cast?) {
            item?.let {
                text =  item.original_name
            }
        }

        @BindingAdapter("castImage")
        @JvmStatic
        fun setCastImage(view: ImageView, item: Cast?) {
            item?.let {
                Glide.with(view.context)
                    .load(MyConstants.IMAGE_BASE_URL + item.profile_path)
                    .error(R.drawable.ic_broken_image)
                    .into(view)
            }
        }
    }
}