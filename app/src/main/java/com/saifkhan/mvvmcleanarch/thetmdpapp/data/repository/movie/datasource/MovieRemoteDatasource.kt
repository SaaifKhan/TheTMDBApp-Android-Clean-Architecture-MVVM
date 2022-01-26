package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}