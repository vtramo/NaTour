package com.example.natour.network.util

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Converter
import retrofit2.converter.moshi.MoshiConverterFactory

object Converters {

    /* A modern JSON library for Kotlin and Java */
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    fun createConverterFactory(): Converter.Factory = MoshiConverterFactory.create(moshi).asLenient()
}