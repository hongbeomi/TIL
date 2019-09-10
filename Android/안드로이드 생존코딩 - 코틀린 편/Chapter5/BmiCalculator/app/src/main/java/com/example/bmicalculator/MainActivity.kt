package com.example.bmicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        // 이전에 입력한 값 불러오기

        resultButton.setOnClickListener {
            try {
                saveData(heightEditText.text.toString().toInt(),
                    weightEditText.text.toString().toInt())
                // 마지막에 입력한 내용 저장

//            val intent = Intent(this, ResultActivity::class.java)
//            intent.putExtra("weight", weightEditText.text.toString())
//            intent.putExtra("height", heightEditText.text.toString())
//            startActivity(intent)
//            Anko 없이 액티비티를 전환하는 코드

                startActivity<ResultActivity>(
                    "weight" to weightEditText.text.toString(),
                    "height" to heightEditText.text.toString()
                    // Anko 라이브러리를 사용한 코드. 입력한 키와 몸무게를 텍스트로 변경하여
                    // 인텐트에 담아 ResultActivity로 보낸다.
                )
            } catch (e: Exception){
                toast("숫자를 입력해주세요")
            }

        }
    }

    // 데이터를 저장하는 메서드이다.
    private fun saveData(height: Int, weight: Int) {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        // 프리러런스 매니저를 사용해서 현재 프리퍼런스 객체를 받는다.
        val editor = pref.edit()
        // 프리퍼런스 객체의 에디터 객체를 얻는다. 이 객체를 사용해서 프리퍼런스에 데이터를 담을 수 있다.

        editor.putInt("KEY_HEIGHT", height)
            .putInt("KEY_WEIGHT", weight)
            .apply() // 설정한 내용을 반영한다.
    }

    private fun loadData() {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val height = pref.getInt("KEY_HEIGHT", 0) // 프리퍼런스 객체에서 저장된 값이 없을 때 0리턴
        val weight = pref.getInt("KEY_WEIGHT", 0)

        if (height != 0 && weight != 0) {
            heightEditText.setText(height.toString())
            weightEditText.setText(weight.toString())
        }
    }

}
