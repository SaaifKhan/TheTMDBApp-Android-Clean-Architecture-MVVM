package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.tvshow

import com.saifkhan.mvvmcleanarch.tmdbclient_mvvm_cleanarcheitecture.TMDBApp.presentation.ui.artist.ArtistActivity
import com.saifkhan.mvvmcleanarch.tmdbclient_mvvm_cleanarcheitecture.TMDBApp.presentation.ui.tvshow.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {

    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }
}