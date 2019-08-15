package com.rafa.www.rafaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webV = webView

        webV.settings.javaScriptEnabled = true

        webV.loadUrl("http://www.google.com")

    }
}
