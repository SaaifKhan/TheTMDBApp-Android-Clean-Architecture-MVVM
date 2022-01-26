package com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}