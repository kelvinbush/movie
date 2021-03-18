package com.kelvinwachiye.kotlin.moviedb.ui.showdetails


import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants
import com.kelvinwachiye.kotlin.moviedb.domains.Episode

class BindingUtils {

    companion object{
        @BindingAdapter("name")
        @JvmStatic
        fun TextView.setName(item: Episode?) {
            item?.let {
                text = item.name
            }
        }

        @BindingAdapter("overview")
        @JvmStatic
        fun TextView.setOverview(item: Episode?) {
            item?.let {
                text = item.overview
            }
        }

        @BindingAdapter("imageUrl")
        @JvmStatic
        fun setStillPath(view: ImageView, item: Episode?) {
            item?.let {
                Glide.with(view.context)
                    .load(MyConstants.IMAGE_BASE_URL + item.still_path)
                    .error(R.drawable.ic_broken_image)
                    .into(view)
            }
        }
    }


}
