package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}