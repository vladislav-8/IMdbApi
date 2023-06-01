package com.practicum.imdbapi.data.network

import com.practicum.imdbapi.data.dto.MoviesSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApiService {
    @GET("/en/API/SearchMovie/k_8dm08vtu/{expression}")
    fun searchMovies(@Path("expression") expression: String): Call<MoviesSearchResponse>
}