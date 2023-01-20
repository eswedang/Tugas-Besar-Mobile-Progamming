package com.example.firzaapp.core.domain.repository

import com.example.firzaapp.core.data.remote.Resource
import com.example.firzaapp.core.domain.model.Movie
import com.example.firzaapp.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}