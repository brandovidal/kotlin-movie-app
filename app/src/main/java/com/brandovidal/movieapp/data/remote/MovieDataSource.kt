package com.brandovidal.movieapp.data.remote

import com.brandovidal.movieapp.application.AppConstants
import com.brandovidal.movieapp.data.model.MovieList
import com.brandovidal.movieapp.repository.WebService

class MovieDataSource(private val webService: WebService) {
    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)
}