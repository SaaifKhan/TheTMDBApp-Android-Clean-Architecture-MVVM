package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasourceimpl

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.api.TMDBService
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.MovieList
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

