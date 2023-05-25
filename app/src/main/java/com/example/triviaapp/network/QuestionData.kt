package com.example.triviaapp.network

data class QuestionData (val category: String, val type: String, val difficulty: String,
                         val question: String, val correct_answer: String, val incorrect_answers: Array<String>
                         )

