package com.mergenc.mobilprogramlamaproje

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mergenc.mobilprogramlamaproje.Object.ACTION_TOAST
import com.mergenc.mobilprogramlamaproje.databinding.ActivityBroadcastReceiverExampleBinding

class BroadcastReceiverExample : AppCompatActivity() {
    private lateinit var binding: ActivityBroadcastReceiverExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBroadcastReceiverExampleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        registerReceiver(ToastReceiver(), IntentFilter(ACTION_TOAST))
        binding.btnBroadcastReceiverExample.setOnClickListener {
            sendBroadcast(Intent(ACTION_TOAST))
        }
    }
}