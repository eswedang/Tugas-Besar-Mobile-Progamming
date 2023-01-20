package com.example.firzaapp.core.data.remote.network

import com.example.firzaapp.utils.API_KEY
import com.example.firzaapp.core.data.remote.response.ListResponse
import com.example.firzaapp.core.data.remote.response.MovieResponse
import com.example.firzaapp.core.data.remote.response.TvShowResponse
//import com.project.proyek_akhir_mobile_programming.utils.API_KEY
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    suspend fun getMovies(): ListResponse<MovieResponse>

    @GET("tv/airing_today?api_key=$API_KEY")
    suspend fun getTvShow(): ListResponse<TvShowResponse>

}