package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.ArtistRepositoryImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.MovieRepositoryImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieCacheDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieLocalDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.TvShowRepositoryImpl
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowCacheDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowLocalDataSource
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowRemoteDatasource
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.ArtistRepository
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.MovieRepository
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}