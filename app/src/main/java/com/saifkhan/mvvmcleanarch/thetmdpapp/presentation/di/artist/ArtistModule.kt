package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.artist

import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module

class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {

        return ArtistViewModelFactory(
            getArtistsUseCase, updateArtistsUseCase
        )
    }
}