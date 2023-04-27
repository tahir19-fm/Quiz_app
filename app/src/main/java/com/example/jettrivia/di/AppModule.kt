package com.example.jettrivia.di

import androidx.compose.ui.unit.Constraints
import com.example.jettrivia.network.QuestionsApi
import com.example.jettrivia.repository.QuestionRepository
import com.example.jettrivia.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesQuestionApi():QuestionsApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionsApi::class.java)
    }
    @Singleton
    @Provides
    fun provideQuestionRepository(api:QuestionsApi)=QuestionRepository(api)
}