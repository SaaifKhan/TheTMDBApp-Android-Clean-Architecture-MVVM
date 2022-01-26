package com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.movie

import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

)