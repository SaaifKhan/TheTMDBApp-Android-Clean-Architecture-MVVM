package com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie.Movie
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}