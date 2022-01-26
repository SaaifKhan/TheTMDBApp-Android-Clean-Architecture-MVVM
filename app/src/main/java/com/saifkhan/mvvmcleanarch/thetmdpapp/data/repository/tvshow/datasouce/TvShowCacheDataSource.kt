package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}