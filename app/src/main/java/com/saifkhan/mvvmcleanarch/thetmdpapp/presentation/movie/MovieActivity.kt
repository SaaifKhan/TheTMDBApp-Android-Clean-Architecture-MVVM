package com.saifkhan.mvvmcleanarch.tmdbclient_mvvm_cleanarcheitecture.TMDBApp.presentation.ui.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saifkhan.mvvmcleanarch.thetmdpapp.R
import com.saifkhan.mvvmcleanarch.thetmdpapp.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
    }
}