package com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}