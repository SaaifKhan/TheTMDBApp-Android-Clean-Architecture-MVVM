package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.movie

import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.GetMoviesUseCase
import com.saifkhan.mvvmcleanarch.thetmdpapp.domain.usecase.UpdateMoviesUsecase
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
       getMoviesUseCase: GetMoviesUseCase,
       updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {

        return MovieViewModelFactory(
            getMoviesUseCase,updateMoviesUsecase
        )
    }
}