package com.brandovidal.movieapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.brandovidal.movieapp.databinding.FragmentMovieBinding

class MovieFragment : Fragment(R.layout.fragment_movie) {
    private lateinit var binding: FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)
    }
}