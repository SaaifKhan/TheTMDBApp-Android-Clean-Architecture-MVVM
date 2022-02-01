package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.core

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.db.ArtistDao
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.db.MovieDao
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.db.TvShowDao
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieLocalDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowLocalDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {



    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }


    @Singleton
    @Provides
    fun provideTvLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }
}