package com.kelvinwachiye.kotlin.moviedb.utils

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    fun getDate(dateStr: String): String {
        return try {
            /** DEBUG dateStr = '2006-04-16T04:00:00Z' **/
            val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
            val mDate = formatter.parse(dateStr) // this never ends while debugging
            val dater = SimpleDateFormat("EEE, MMM d, yyyy", Locale.ENGLISH)
            dater.format(mDate!!)
        } catch (e: Exception) {
            Log.d("mDate", e.toString()) // this never gets called either
            dateStr
        }
    }
}