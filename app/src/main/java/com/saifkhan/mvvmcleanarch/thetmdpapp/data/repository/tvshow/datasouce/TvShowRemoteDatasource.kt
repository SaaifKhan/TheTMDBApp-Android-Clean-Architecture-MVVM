package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}