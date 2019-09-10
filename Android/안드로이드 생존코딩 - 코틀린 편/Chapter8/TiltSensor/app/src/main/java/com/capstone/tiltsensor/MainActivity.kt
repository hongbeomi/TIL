package com.capstone.tiltsensor

import android.content.Context
import android.content.pm.ActivityInfo
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager

class MainActivity : AppCompatActivity(), SensorEventListener {

    private lateinit var tiltView: TiltView

    // 정밀도가 변경되면 호출
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 센서값이 변경되면 호출됩니다.
    override fun onSensorChanged(event: SensorEvent?) {
        event?.let {
            Log.d("Main activity", "onSensorChanged: x : " +
            "${event.values[0]}, y : ${event.values[1]}, z : ${event.values[2]}")
            tiltView.onSensorEvent(event)
        }
    }

    private val sensorManager by lazy {
        getSystemService(Context.SENSOR_SERVICE) as SensorManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면이 꺼지지 않게 하기
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        // 화면 가로 모드로 고정
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)

        tiltView = TiltView(this)
        setContentView(tiltView)
    }

    override fun onResume() {
        super.onResume()
        sensorManager.registerListener(this,
                // 사용할 센서 등록
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                // 센서 종류 지정
                SensorManager.SENSOR_DELAY_NORMAL)
                // 얼마나 센서값을 자주 받을지를 지정
    }

    override fun onStop() {
        super.onStop()
        sensorManager.unregisterListener(this)
    }

}
