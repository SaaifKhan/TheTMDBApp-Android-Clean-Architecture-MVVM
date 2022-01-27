package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetMoviesUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateMoviesUsecase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData{

        val movieList   = getMoviesUseCase.execute()
        emit(movieList)

    }

    fun updateMovies() = liveData{
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)

    }


}