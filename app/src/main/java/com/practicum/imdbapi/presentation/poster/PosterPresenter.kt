package com.practicum.imdbapi.presentation.poster


class PosterPresenter(
    private val view: PosterView,
    private val imageUrl: String
) {

    fun onCreate() {
        view.showImageView(imageUrl)
    }

}