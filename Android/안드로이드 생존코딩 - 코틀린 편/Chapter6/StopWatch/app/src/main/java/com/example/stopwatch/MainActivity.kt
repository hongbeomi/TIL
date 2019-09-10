package com.example.stopwatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    private var time = 0 // 시간을 계산할 변수 0으로 초기화
    private var isRunning = false // 타이머가 동작 중인지 검사하는 변수
    private var timerTask: Timer? = null // null을 허용하는 Timer 타입의 변수 선언
    private var lap = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            isRunning = !isRunning // 타이머를 시작한다는 뜻을 알려줌

            if (isRunning) {
                start()
            } else {
                pause()
            }
        }

        lapButton.setOnClickListener {
            recordLapTime()
        }

        resetFab.setOnClickListener {
            reset()
        }
    }

    private fun start() {
        fab.setImageResource(R.drawable.ic_pause_black_24dp) // 시작버튼을 눌렀을 때 버튼 모양 변화

        timerTask = timer(period = 10) { // 0.01초 마다 변수를 증가시키며 UI 갱신
            time++
            val sec = time / 100
            val milli = time % 100
            runOnUiThread { // 워커 스레드로 동작하며 UI 조작을 가능하게 함.
                secTextView.text = "$sec"
                milliTextView.text = "$milli"
            }
        }
    }

    private fun pause() {
        fab.setImageResource(R.drawable.ic_play_arrow_black_24dp)
        timerTask?.cancel() // 실행 중인 타이머가 있다면 타이머 취소
    }

    // 레코드 시간을 기록해줌.
    private fun recordLapTime() {
        val lapTime = this.time // 현재 시간을 저장
        val textView = TextView(this)
        textView.text = "$lap LAP : ${lapTime / 100}.${lapTime % 100}" //

        // 스크롤뷰 안의 레이아웃의 맨 위에 랩타임 추가
        lapLayout.addView(textView, 0)
        lap++
    }

    private fun reset() {
        timerTask?.cancel() // 실행 중인 타이머가 있다면 취소

        // 모든 변수 초기화
        time = 0
        isRunning = false
        fab.setImageResource(R.drawable.ic_play_arrow_black_24dp)
        secTextView.text = "0"
        milliTextView.text = "00"
    }

}
