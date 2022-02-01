package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.core

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.api.TMDBService
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowRemoteDatasource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey:String) {


    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDatasource{
        return MovieRemoteDataSourceImpl(tmdbService,apiKey)


    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService):ArtistRemoteDatasource{
        return ArtistRemoteDataSourceImpl(tmdbService,apiKey)


    }
    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService):TvShowRemoteDatasource{
        return TvShowRemoteDataSourceImpl(tmdbService,apiKey)


    }
}