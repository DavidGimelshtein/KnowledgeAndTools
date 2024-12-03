package com.example.serviceexample

import android.app.Application
import android.content.Intent
import android.util.Log

class App: Application() {

    companion object {
        const val TAG = "Application"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Test", "$TAG -> onCreate")
        startService(Intent(this, BackgroundService::class.java))
    }
}