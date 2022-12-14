package com.mergenc.mobilprogramlamaproje

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MediaPlayerService : Service() {

    lateinit var player: MediaPlayer

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

        player = MediaPlayer.create(this, R.raw.dream_a_little_dream_of_me)
        player.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}
