package com.example.natour.network.services

import com.example.natour.network.TrailApiService
import com.example.natour.network.util.Converters
import com.example.natour.network.util.URLs
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object TrailService {

    private val okHttpClient = run {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
        OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()
    }

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Converters.createConverterFactory())
        .baseUrl(URLs.BACKEND)
        .client(okHttpClient)
        .build()

    val retrofitService: TrailApiService by lazy {
        retrofit.create(TrailApiService::class.java)
    }
}