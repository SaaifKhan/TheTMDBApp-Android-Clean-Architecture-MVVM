package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.movie

import com.saifkhan.mvvmcleanarch.tmdbclient_mvvm_cleanarcheitecture.TMDBApp.presentation.ui.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }

}