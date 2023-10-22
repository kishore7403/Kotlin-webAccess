package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
class WebActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webView = findViewById(R.id.dalweb)                 // Initialize the WebView element from the layout
        val webSettings: WebSettings = webView.settings     // Configure web settings, including enabling JavaScript
        webSettings.javaScriptEnabled = true
        webView.loadUrl("https://www.dal.ca/")          // Load a specific URL (https://www.dal.ca/) in the WebView
        webView.webViewClient = WebViewClient()              // Set a WebViewClient to handle web page navigation within the WebView
    }
}
