package com.saifkhan.mvvmcleanarch.tmdbclient_mvvm_cleanarcheitecture.TMDBApp.presentation.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.saifkhan.mvvmcleanarch.thetmdpapp.R
import com.saifkhan.mvvmcleanarch.thetmdpapp.databinding.ActivityMovieBinding
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.di.core.Injector
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.movie.MovieViewModel
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.movie.MovieViewModelFactory
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.movie.adapter.MovieAdapter
import com.saifkhan.mvvmcleanarch.thetmdpapp.showSnackBar
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: MovieViewModelFactory
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var binding: ActivityMovieBinding
    private lateinit var adapter: MovieAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
        (application as Injector).createMovieSubComponent()
            .inject(this)


        movieViewModel = ViewModelProvider(this, factory)
            .get(MovieViewModel::class.java)
        initilize()


    }

    private fun initilize() {
        adapter = MovieAdapter()
        binding.movieRecyclerView.adapter = adapter
        displayPouplarMovies()
    }

    private fun displayPouplarMovies() {
        binding.movieProgressBar.visibility = View.VISIBLE
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, Observer {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.movieProgressBar.visibility = View.GONE


            } else {
                binding.movieProgressBar.visibility = View.GONE
                binding.movieRecyclerView.showSnackBar("No Data Found", Snackbar.LENGTH_LONG)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater

        inflater.inflate(R.menu.update, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_update -> {
                updateMovies()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun updateMovies(){
        binding.movieProgressBar.visibility = View.VISIBLE
        val response = movieViewModel.updateMovies()
        response.observe(this, Observer {
            if (it!=null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.movieProgressBar.visibility = View.GONE
            }else{
                binding.movieProgressBar.visibility = View.GONE


            }
        })
    }
}