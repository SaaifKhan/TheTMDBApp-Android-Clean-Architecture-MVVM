package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetTvShowsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateArtistsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateTvShowsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) : ViewModel() {
    fun getArtists() = liveData {

        val artistList = getArtistsUseCase.execute()
        emit(artistList)

    }

    fun updateArtists() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)

    }
}