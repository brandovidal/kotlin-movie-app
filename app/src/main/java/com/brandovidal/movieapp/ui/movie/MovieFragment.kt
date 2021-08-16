package com.brandovidal.movieapp.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.brandovidal.movieapp.R
import com.brandovidal.movieapp.core.Resource
import com.brandovidal.movieapp.data.remote.MovieDataSource
import com.brandovidal.movieapp.databinding.FragmentMovieBinding
import com.brandovidal.movieapp.presentation.MovieViewModel
import com.brandovidal.movieapp.presentation.MovieViewModelFactory
import com.brandovidal.movieapp.repository.MovieRepositoryImpl
import com.brandovidal.movieapp.repository.RetrofitClient

class MovieFragment : Fragment(R.layout.fragment_movie) {
    private lateinit var binding: FragmentMovieBinding
    private val viewModel by viewModels<MovieViewModel> {
        MovieViewModelFactory(
            MovieRepositoryImpl(
                MovieDataSource(RetrofitClient.webservice)
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        viewModel.fetchMainScreenMovies().observe(viewLifecycleOwner, Observer { result ->
            when(result) {
                is Resource.Loading -> {
                    Log.d("LiveData", "Loading.... ")
                }
                is Resource.Success -> {
                    Log.d("LiveData", "Upcoming: ${result.data.first} \n \nTopRated ${result.data.second} \n \nPopular ${result.data.third}")}
                is Resource.Failure -> {
                    Log.d("LiveData", "${result.exception} ")}
            }
        })
    }
}