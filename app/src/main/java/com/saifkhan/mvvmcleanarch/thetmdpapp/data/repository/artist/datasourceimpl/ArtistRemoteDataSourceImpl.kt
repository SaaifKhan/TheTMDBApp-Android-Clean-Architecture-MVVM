package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasourceimpl

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.api.TMDBService
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.ArtistList
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

