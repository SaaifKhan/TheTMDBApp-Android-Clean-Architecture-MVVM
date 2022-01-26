package com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasourceimpl

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.Movie
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }
}