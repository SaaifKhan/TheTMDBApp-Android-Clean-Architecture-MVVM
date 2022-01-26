package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.Movie

interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}