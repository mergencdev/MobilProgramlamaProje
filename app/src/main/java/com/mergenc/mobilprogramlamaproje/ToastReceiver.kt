package com.mergenc.mobilprogramlamaproje

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by Mehmet Emin Ergenc on 14.12.2022
 */

class ToastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Broadcast Received!", Toast.LENGTH_SHORT).show()
    }
}