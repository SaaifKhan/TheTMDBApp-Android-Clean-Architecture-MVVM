package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation

import android.app.Application
import com.saifkhan.mvvmcleanarch.thetmdpapp.BuildConfig
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.artist.ArtistSubComponent
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.core.*
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.movie.MovieSubComponent
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.tvshow.TvShowSubComponent

class App:Application(),Injector {
    private lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
       return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistShowSubComponent(): ArtistSubComponent {
       return appComponent.artistSubComponent().create()
    }
}