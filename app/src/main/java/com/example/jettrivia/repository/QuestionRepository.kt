package com.example.jettrivia.repository

import android.util.Log
import com.example.jettrivia.data.DataOrException
import com.example.jettrivia.model.QuestionItem
import com.example.jettrivia.network.QuestionsApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(
    private val api:QuestionsApi) {
    private val dataOrException=DataOrException<ArrayList<QuestionItem>,Boolean,Exception>()

    suspend fun getAllQuestions():DataOrException<ArrayList<QuestionItem>,Boolean,Exception>{
        try {
            dataOrException.loading=true
            dataOrException.data=api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading=false
        }catch (e:Exception){
            dataOrException.e=e
            Log.d("ecption", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")

        }
        return dataOrException
    }

}