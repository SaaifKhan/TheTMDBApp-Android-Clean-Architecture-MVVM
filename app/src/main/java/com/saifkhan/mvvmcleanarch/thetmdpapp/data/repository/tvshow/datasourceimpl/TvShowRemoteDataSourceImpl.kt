package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasourceimpl

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.api.TMDBService
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.tvshow.TvShowList
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.tvshow.datasouce.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

