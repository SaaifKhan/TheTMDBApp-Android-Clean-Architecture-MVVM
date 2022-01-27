package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetTvShowsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateTvShowsUseCase

class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistsUseCase,updateArtistsUseCase) as T
    }

}