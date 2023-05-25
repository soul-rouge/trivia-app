package com.example.triviaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviaapp.databinding.ActivityMainBinding
import com.example.triviaapp.network.Api

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val QuestionList= Api.retrofitService.getQuestion()
        val question_data = QuestionList.get(1)
        val question_text: String = question_data.question
        val question_widget = binding.question
        question_widget.text= question_text
    }
}