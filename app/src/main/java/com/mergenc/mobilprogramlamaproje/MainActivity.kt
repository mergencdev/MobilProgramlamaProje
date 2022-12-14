package com.mergenc.mobilprogramlamaproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mergenc.mobilprogramlamaproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnServiceExample.setOnClickListener {
            startActivity(Intent(this, ServiceExampleActivity::class.java))
        }

        binding.btnBroadcastReceiverExample.setOnClickListener {
            startActivity(Intent(this, BroadcastReceiverExample::class.java))
        }
    }
}