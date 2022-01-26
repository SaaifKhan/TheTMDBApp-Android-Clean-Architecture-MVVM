package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}