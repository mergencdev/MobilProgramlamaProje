package com.mergenc.mobilprogramlamaproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.ImageView
import android.widget.SeekBar

class ServiceExampleActivity : AppCompatActivity() {
    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_example)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
    }

    fun onClick(view:View){
        var image = findViewById<ImageView>(R.id.button)

        if(!isPlaying){
            startService(Intent(this,MediaPlayerService::class.java))
            image.setImageResource(R.drawable.pause)
            isPlaying = true

        } else {
            stopService(Intent(this,MediaPlayerService::class.java))
            image.setImageResource(R.drawable.play)
            isPlaying = false
        }
    }

}