package com.example.pianoapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pionina.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val keyC: Button = findViewById(R.id.keyC)
        val keyD: Button = findViewById(R.id.keyD)
        val keyE: Button = findViewById(R.id.keyE)
        val keyF: Button = findViewById(R.id.keyF)
        val keyG: Button = findViewById(R.id.keyG)
        val keyA: Button = findViewById(R.id.keyA)
        val keyB: Button = findViewById(R.id.keyB)

        keyC.setOnClickListener { playSound(R.raw.music1ogg) }
        keyD.setOnClickListener { playSound(R.raw.music2) }
        keyE.setOnClickListener { playSound(R.raw.music3) }
        keyF.setOnClickListener { playSound(R.raw.music4) }
        keyG.setOnClickListener { playSound(R.raw.music5) }
        keyA.setOnClickListener { playSound(R.raw.music6) }
        keyB.setOnClickListener { playSound(R.raw.music7) }
    }

    private fun playSound(soundResource: Int) {
        val mediaPlayer = MediaPlayer.create(this, soundResource)
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            it.release()
        }
    }
}
