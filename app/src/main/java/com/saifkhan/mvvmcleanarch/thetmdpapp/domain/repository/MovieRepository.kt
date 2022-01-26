package com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}