package com.practicum.imdbapi.presentation.movies

import com.practicum.imdbapi.domain.models.Movie

interface MoviesView {

    fun showPlaceholderMessage(isVisible: Boolean)
    fun showMoviesList(isVisible: Boolean)
    fun showProgressBar(isVisible: Boolean)
    fun changePlaceholderText(newPlaceholderText: String)
    fun updateMoviesList(newMoviesList: List<Movie>)
    fun showToast(message: String)
}