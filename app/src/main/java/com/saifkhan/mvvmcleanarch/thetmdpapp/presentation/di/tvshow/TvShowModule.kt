package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.tvshow

import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetTvShowsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateTvShowsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.artist.ArtistViewModelFactory
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module

class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {

        return TvShowViewModelFactory(
           getTvShowsUseCase,updateTvShowsUseCase
        )
    }
}