package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasourceimpl

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.db.ArtistDao
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao):
    ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
       return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.deleteAllArtists()
       }
    }
}