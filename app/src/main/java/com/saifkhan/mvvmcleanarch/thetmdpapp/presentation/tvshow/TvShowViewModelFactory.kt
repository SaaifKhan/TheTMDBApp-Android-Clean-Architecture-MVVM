package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetTvShowsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowsUseCase,updateTvShowsUseCase) as T
    }

}