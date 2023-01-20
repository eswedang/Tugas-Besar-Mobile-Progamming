package com.example.firzaapp.core.utils

import com.example.firzaapp.core.data.remote.response.MovieResponse
import com.example.firzaapp.core.domain.model.Movie
import com.example.firzaapp.core.domain.model.TvShow
import com.example.firzaapp.core.data.remote.response.TvShowResponse

fun mapMovieResponseToDomain(input: MovieResponse) =
    Movie(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )

fun mapTvShowResponseToDomain(input: TvShowResponse) =
    TvShow(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )

