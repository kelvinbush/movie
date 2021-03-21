package com.kelvinwachiye.kotlin.moviedb.ui.showdetails


import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("imageUrl")
fun setCastImage(view: ImageView, url: String?) {
    Glide.with(view.context)
        .load(MyConstants.IMAGE_BASE_URL + url)
        .error(R.drawable.ic_broken_image)
        .into(view)

}

@BindingAdapter("textHere")
fun setTextViewText(view: TextView, textPassed: String?) {
    view.text = textPassed
}
