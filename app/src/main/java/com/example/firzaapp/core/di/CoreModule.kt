package com.example.firzaapp.core.di

import androidx.viewbinding.BuildConfig
import com.example.firzaapp.core.data.remote.MovieRemoteDataSource
import com.example.firzaapp.core.data.remote.network.ApiService
import com.example.firzaapp.utils.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory


val networkModule = module {

    single {
        val httpCliet = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            httpCliet.addInterceptor(logging)
        }

        httpCliet
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
            .create(ApiService::class.java)
    }

}



}

val repositoryModule = module {
    single { MovieRemoteDataSource(get()) }
    single<IMovieRepository> { MovieRepository(get()) }
}