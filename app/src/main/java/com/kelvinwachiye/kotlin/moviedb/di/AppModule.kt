package com.kelvinwachiye.kotlin.moviedb.di

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.kelvinwachiye.kotlin.moviedb.api.MovieDbAPi
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants
import com.kelvinwachiye.kotlin.moviedb.utils.DefaultIfNullFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMoshi(): Moshi =
        Moshi.Builder()
            .add(DefaultIfNullFactory())
            .addLast(KotlinJsonAdapterFactory())
            .build()


    @Provides
    @Singleton
    fun provideRetrofit(moshi: Moshi): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(MyConstants.MOVIE_BASE_URL)
            .build()

    @Provides
    @Singleton
    fun provideMovieDbApi(retrofit: Retrofit): MovieDbAPi =
        retrofit.create(MovieDbAPi::class.java)

    @Singleton
    @Provides
    fun provideGlideInstance(application: Application,
                             requestOptions: RequestOptions): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }
}