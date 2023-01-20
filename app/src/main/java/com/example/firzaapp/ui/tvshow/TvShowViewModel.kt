package com.example.firzaapp.ui.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.firzaapp.core.domain.usecase.movie.MovieUseCase

class TvShowViewModel(private val useCase: MovieUseCase): ViewModel() {
    fun getTvShow() = useCase.getTvShow().asLiveData()
}