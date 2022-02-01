package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.core

import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.artist.ArtistSubComponent
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.movie.MovieSubComponent
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent():MovieSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistShowSubComponent():ArtistSubComponent
}