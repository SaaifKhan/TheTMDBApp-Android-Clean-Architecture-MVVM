package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.artist.datasource

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist

interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}