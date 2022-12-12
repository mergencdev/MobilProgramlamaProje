package com.mergenc.mobilprogramlamaproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ServiceExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_example)

    }

    fun start(view:View){
        startService(Intent(this,MediaPlayerService::class.java))
    }

    fun stop(view:View){
        stopService(Intent(this,MediaPlayerService::class.java))
    }
}