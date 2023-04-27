package com.example.jettrivia.network

import com.example.jettrivia.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionsApi {

    @GET("world.json")
    suspend fun getAllQuestions():Question
}