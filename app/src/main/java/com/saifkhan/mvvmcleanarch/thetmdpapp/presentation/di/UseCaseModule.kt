package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di

import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.ArtistRepository
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.MovieRepository
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.TvShowRepository
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.*
import dagger.Module
import dagger.Provides
@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUsecase {
        return UpdateMoviesUsecase(movieRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }
    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }
    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository):UpdateArtistsUseCase{
        return UpdateArtistsUseCase(artistRepository)
    }
}