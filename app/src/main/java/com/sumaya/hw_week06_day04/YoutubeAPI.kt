package com.sumaya.hw_week06_day04

import retrofit2.http.GET

interface YoutubeAPI {
    @GET("home_feed")
    suspend fun fetchVideos() : YoutubeData
}