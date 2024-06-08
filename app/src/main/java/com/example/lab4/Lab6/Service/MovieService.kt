package com.example.lab_8.Service


import com.example.lab4.Lab6.Model.Entities.MovieRequest
import com.example.lab4.Lab6.Model.Entities.MovieResponse
import com.example.lab4.Lab6.Model.Entities.StatusResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface MovieService {

    @GET("Film")
    suspend fun getListFilms(): Response<List<MovieResponse>>

    @GET("Film/{id}")
    suspend fun getFilmDetail(@Path("id") id: String): Response<MovieResponse>

    @POST("Film")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @PUT("Film/{id}")
    suspend fun updateFilm(
        @Path("id") id: String,
        @Body filmRequest: MovieRequest
    ): Response<StatusResponse>

    @DELETE("Film/{id}")
    suspend fun deleteFilm(@Path("id") id: String): Response<StatusResponse>
}