package com.sumaya.hw_week06_day04

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object YoutubeBuilder {
    private const val BASE_URL = "https://api.letsbuildthatapp.com/youtube/"
    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val youtubeApi: YoutubeAPI = retrofit().create(YoutubeAPI::class.java)
}