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
    Log.d("setTextViewText: ", view.context.resources.getResourceEntryName(view.id))
    if (view.context.resources.getResourceEntryName(view.id) == "tvDate") {
        Log.d("setTextViewText:", "got called")
        view.text = getDate(textPassed)
    } else {
        view.text = textPassed
    }
}

private fun getDate(dateStr: String?) =
    try {
        /** DEBUG dateStr = '2006-04-16T04:00:00Z' **/
        val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        val mDate = formatter.parse(dateStr) // this never ends while debugging
        val dater = SimpleDateFormat("EEE, MMM d, yyyy", Locale.ENGLISH)
        dater.format(mDate!!)
    } catch (e: Exception) {
        Log.d("mDate", e.toString()) // this never gets called either
        dateStr
    }
