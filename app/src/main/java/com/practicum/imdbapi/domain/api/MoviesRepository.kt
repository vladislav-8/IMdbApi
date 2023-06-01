package com.practicum.imdbapi.domain.api

import com.practicum.imdbapi.domain.models.Movie
import com.practicum.imdbapi.util.Resource

interface MoviesRepository {

    fun searchMovies(expression: String): Resource<List<Movie>>
}