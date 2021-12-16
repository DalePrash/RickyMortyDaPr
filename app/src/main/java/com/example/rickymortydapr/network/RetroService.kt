package com.example.rickymortydapr.network

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

public interface RetroService {

    @Headers("Accept: application/json")
    @GET("character")
    suspend fun getDataFromAPI(@Query("page") query: Int):RickAndMortyList
}