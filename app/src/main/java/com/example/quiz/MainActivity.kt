package com.example.quiz

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var questionNo = 0
    var questions = listOf("What do ADT stands for? \\n\\n A) Android development tool \\n\\n B) Application Development tool \\n\\n C) Android Develoment Testing")
    var rightAnswers = listOf(1, 2, 1, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }

    }

    fun showToast(answer: Int) {
        if (answer==rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "CORRECT, you made it!!", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "WRONG Think again and answer!!!", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateQuestion() {
        questionNo = questionNo + 1
        textView.setText(questions.get(questionNo))
    }

}