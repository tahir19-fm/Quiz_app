package com.example.jettrivia.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jettrivia.component.Questions

@Composable
fun TriviaHome(viewModel: QuestionsViewmodel= hiltViewModel()){
    Questions(viewModel)
}
