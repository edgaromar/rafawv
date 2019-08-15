package com.rafa.www.rafaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_IMMERSIVE
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainL.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN


        val webV = webView

        //webV.settings.javaScriptEnabled = true
        webV.webViewClient = WebViewClient()
        webV.loadUrl("http://www.google.com")

    }
}
