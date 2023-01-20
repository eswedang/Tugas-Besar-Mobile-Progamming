package com.example.firzaapp.core.domain.usecase.movie

import com.example.firzaapp.core.data.remote.Resource
import com.example.firzaapp.core.domain.model.Movie
import com.example.firzaapp.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface MovieUseCase{
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}