package com.example.firzaapp.di

import com.example.firzaapp.core.domain.usecase.movie.MovieInteractor
import com.example.firzaapp.core.domain.usecase.movie.MovieUseCase
import com.example.firzaapp.ui.movie.MovieViewModel
import com.example.firzaapp.ui.tvshow.TvShowViewModel
import okhttp3.internal.platform.android.AndroidSocketAdapter.Companion.factory
import java.lang.reflect.Array.get

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }

}

val viewModelModule = module {
    viewModel{ MovieViewModel(get()) }
    viewModel{ TvShowViewModel(get()) }
}
