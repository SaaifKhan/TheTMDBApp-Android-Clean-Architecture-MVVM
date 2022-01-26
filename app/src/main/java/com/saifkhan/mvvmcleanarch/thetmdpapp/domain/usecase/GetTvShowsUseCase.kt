package com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase

import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.tvshow.TvShow
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}