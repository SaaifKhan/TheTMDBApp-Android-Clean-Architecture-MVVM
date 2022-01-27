package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetTvShowsUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel() {
    fun getTvShows() = liveData {

        val tvShowList = getTvShowsUseCase.execute()
        emit(tvShowList)

    }

    fun updateTvShows() = liveData {
        val tvShowList = updateTvShowsUseCase.execute()
        emit(tvShowList)

    }
}