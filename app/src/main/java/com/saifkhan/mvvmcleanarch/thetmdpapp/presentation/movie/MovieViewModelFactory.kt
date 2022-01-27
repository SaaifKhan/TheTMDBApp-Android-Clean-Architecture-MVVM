package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetMoviesUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateMoviesUsecase

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }

}