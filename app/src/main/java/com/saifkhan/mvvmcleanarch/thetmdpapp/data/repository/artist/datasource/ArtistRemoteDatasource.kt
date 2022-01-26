package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}