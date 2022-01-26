package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}