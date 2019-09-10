package com.example.mywebbrowser

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 웹뷰 기본 설정
        webView.apply {
            settings.javaScriptEnabled = true // 자바 스크립트 동작 켜기
            webViewClient = WebViewClient() // 웹뷰에 페이지 표시 후 자체 웹 브라우저 동작
        }

        webView.loadUrl("http://www.google.com")

        // 키보드의 검색 버튼 동작 정의하기
        urlEditText.setOnEditorActionListener{_, actionId, _ -> // 반응한 뷰, 액션 ID, 이벤트를 인자로 가짐
            if (actionId == EditorInfo.IME_ACTION_SEARCH) { // ACTION_SEARCH에 해당하는 상수와 비교
                webView.loadUrl(urlEditText.text.toString())
                true
            } else {
                false
            }
        }

        // 컨텍스트 메뉴 등록
        registerForContextMenu(webView)
    }

    // 뒤로 가기 재정의
    override fun onBackPressed() {
        if (webView.canGoBack()) { // 이전 동작으로 갈 수 있다면
            webView.goBack()
        } else {
            super.onBackPressed() // 그렇지 않으면 종료
        }
    }

    // 옵션 메뉴를 액티비티에 표시하기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu) // 인플레이터 객체 사용
        return true
    }

    // 옵션 메뉴 클릭 이벤트 처리
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_google, R.id.action_home -> {
                webView.loadUrl("http://www.google.com")
                return true
            }
            R.id.action_naver -> {
                webView.loadUrl("http://www.naver.com")
                return true
            }
            R.id.action_daum -> {
                webView.loadUrl("http://www.daum.net")
                return true
            }
            R.id.action_call -> {
                val intent = Intent(Intent.ACTION_DIAL) // Anko 없이 작성한 암시적 인텐트
                intent.data = Uri.parse("tel:010-1234-4568")
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }

                // Anko를 적용한다면 이렇게 바뀐다.
                // makeCall("010-1234-4568")
                return true
            }
            R.id.action_send_text -> {
                sendSMS("010-1234-4568", webView.url) // Anko에서 지원하는 암시적 인텐트
                return true
            }
            R.id.action_email -> {
                email("test@example.com", "잘 만들었네요.", webView.url)
                // Anko에서 지원하는 암시적 인텐트
                return true
            }
        }
        return super.onOptionsItemSelected(item)
        // 내가 처리한 경우를 제외한 경우에는 super 메서드를 호출하는게 규칙이다.
    }

    // 컨텍스트 메뉴 등록하기
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context, menu)
    }

    // 컨텍스트 메뉴 클릭 이벤트 처리
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_share -> {
                share(webView.url) // Anko에서 지원하는 암시적 인텐트
                return true
            }
            R.id.action_browser -> {
                browse(webView.url) // Anko에서 지원하는 암시적 인텐트
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

}
