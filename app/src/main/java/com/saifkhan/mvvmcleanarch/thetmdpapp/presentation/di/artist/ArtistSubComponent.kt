package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.artist

import com.saifkhan.mvvmcleanarch.tmdbclient_mvvm_cleanarcheitecture.TMDBApp.presentation.ui.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {

    fun inject(artistActivity: ArtistActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():ArtistSubComponent
    }
}