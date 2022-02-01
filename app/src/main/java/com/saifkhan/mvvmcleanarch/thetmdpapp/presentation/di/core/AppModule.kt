package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.core

import android.content.Context
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.artist.ArtistSubComponent
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.movie.MovieSubComponent
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class,ArtistSubComponent::class,TvShowSubComponent::class])
class AppModule(private val context:Context) {

    @Singleton
    @Provides
    fun provideApi():Context{
        return context.applicationContext
    }
}