package com.kelvinwachiye.kotlin.moviedb

import com.kelvinwachiye.kotlin.moviedb.utils.DefaultIfNull
import com.kelvinwachiye.kotlin.moviedb.utils.DefaultIfNullFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.Test

class NullSkipperTest {

    @DefaultIfNull
    data class ClassWithDefaults(val foo: String, val bar: String? = "defaultBar")

    @Test
    fun skipNulls() {
        //language=JSON
        val json = """{"foo": "fooValue", "bar": null}"""

        val adapter = Moshi.Builder()
            .add(DefaultIfNullFactory())
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter(ClassWithDefaults::class.java)

        val instance = adapter.fromJson(json)!!
        check(instance.bar == "defaultBar")
    }
}