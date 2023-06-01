package com.practicum.imdbapi.util

import android.content.Context
import com.practicum.imdbapi.domain.impl.MoviesRepositoryImpl
import com.practicum.imdbapi.data.network.RetrofitNetworkClient
import com.practicum.imdbapi.domain.api.MoviesInteractor
import com.practicum.imdbapi.domain.api.MoviesRepository
import com.practicum.imdbapi.domain.impl.MoviesInteractorImpl
import com.practicum.imdbapi.presentation.movies.MoviesSearchPresenter
import com.practicum.imdbapi.presentation.poster.PosterPresenter
import com.practicum.imdbapi.presentation.movies.MoviesView
import com.practicum.imdbapi.presentation.poster.PosterView

object Creator {

    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun provideMoviesSearchPresenter(
        moviesView: MoviesView,
        context: Context,
    ): MoviesSearchPresenter {
        return MoviesSearchPresenter(
            view = moviesView,
            context = context,
        )
    }

    fun providePosterPresenter(
        posterView: PosterView,
        imageUrl: String,
    ): PosterPresenter {
        return PosterPresenter(posterView, imageUrl)
    }
}