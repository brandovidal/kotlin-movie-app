package com.brandovidal.movieapp.data.local

import com.brandovidal.movieapp.application.AppConstants
import com.brandovidal.movieapp.data.model.MovieEntity
import com.brandovidal.movieapp.data.model.MovieList
import com.brandovidal.movieapp.data.model.toMovieList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LocalMovieDatabase(private val movieDao: MovieDao) {
    suspend fun getUpcomingMovies(): MovieList = withContext(Dispatchers.IO) {
        return@withContext movieDao.getAllMovies().filter{ it.movie_type == "upcoming" }.toMovieList()
    }

    suspend fun getTopRatedMovies(): MovieList = withContext(Dispatchers.IO) {
        return@withContext movieDao.getAllMovies().filter{ it.movie_type == "toprated" }.toMovieList()
    }

    suspend fun getPopularMovies(): MovieList = withContext(Dispatchers.IO) {
        return@withContext movieDao.getAllMovies().filter{ it.movie_type == "popular" }.toMovieList()
    }

    suspend fun saveMovie(movie: MovieEntity) {
        movieDao.saveMovie(movie)
    }
}