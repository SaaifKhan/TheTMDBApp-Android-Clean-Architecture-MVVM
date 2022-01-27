package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieCacheDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowCacheDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {


    @Singleton
    @Provides
    fun provideMovieCacheDataSource():MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource():TvShowCacheDataSource{
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource():ArtistCacheDataSource{
        return ArtistCacheDataSourceImpl()
    }
}