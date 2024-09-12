package com.milly.Ev01Movies.viewModel

import com.milly.Ev01Movies.models.Details
import com.milly.Ev01Movies.models.MoviesList
import com.milly.Ev01Movies.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getMovieList(page:Int): Response<MoviesList>{
        return RetrofitInstance.api.getMovies(page)
    }
    suspend fun getDetailsById(id:Int): Response<Details>{
        return RetrofitInstance.api.getDetailsById(id = id)
    }
}