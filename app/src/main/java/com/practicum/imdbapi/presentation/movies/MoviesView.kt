package com.practicum.imdbapi.presentation.movies

import com.practicum.imdbapi.ui.movies.MoviesState

interface MoviesView {

    // Методы, меняющие внешний вид экрана

    fun render(state: MoviesState)

    // Методы «одноразовых событий»

    fun showToast(additionalMessage: String)
}