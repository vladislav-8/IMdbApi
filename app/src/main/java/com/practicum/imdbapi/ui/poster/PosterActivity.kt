package com.practicum.imdbapi.ui.poster

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.practicum.imdbapi.util.Creator
import com.practicum.imdbapi.R
import com.practicum.imdbapi.presentation.poster.PosterPresenter
import com.practicum.imdbapi.presentation.poster.PosterView

class PosterActivity : Activity(), PosterView {

    private lateinit var posterPresenter: PosterPresenter
    private lateinit var poster: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poster)

        val imageUrl = intent.extras?.getString("poster", "") ?: ""
        posterPresenter = Creator.providePosterPresenter(this, imageUrl)
        setContentView(R.layout.activity_poster)
        poster = findViewById(R.id.poster)

        posterPresenter.onCreate()
    }

    override fun showImageView(url: String) {
        Glide.with(applicationContext)
            .load(url)
            .into(poster)
    }
}