package com.example.bmicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.toast
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getStringExtra("height").toInt()
        val weight = intent.getStringExtra("weight").toInt()
        // 키와 몸무게를 정수형으로 변환하여

        val bmi = weight / (height / 100.0).pow(2.0)
        // 계산

        when {
            bmi >= 35 -> resultTextView.text = "고도 비만"
            bmi >= 30 -> resultTextView.text = "2단계 비만"
            bmi >= 25 -> resultTextView.text = "1단계 비만"
            bmi >= 23 -> resultTextView.text = "과체중"
            bmi >= 18.5 -> resultTextView.text = "정상"
            else -> resultTextView.text = "저체중"
        }

        when {
            bmi >= 23 -> imageView.setImageResource(
                R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
            bmi >= 18.5 -> imageView.setImageResource(
                R.drawable.ic_sentiment_satisfied_black_24dp)
            else -> imageView.setImageResource(
                R.drawable.ic_sentiment_dissatisfied_black_24dp)
        }

        // Toast.makeText(this, "$bmi", Toast.LENGTH_SHORT).show()
        // Anko 라이브러리 적용 전

        toast("bmi : $bmi")
        // 적용 후
    }
}
