package com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}