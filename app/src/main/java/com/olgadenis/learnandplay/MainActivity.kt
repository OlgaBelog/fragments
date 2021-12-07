package com.olgadenis.learnandplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


import android.content.Intent




class MainActivity : AppCompatActivity() {



     var ActiveButtonPlay: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLearn: Button = findViewById(R.id.ButtonStartLearn)
        val buttonPlay: Button = findViewById(R.id.ButtonStartPlay)
        buttonLearn.setOnClickListener {
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
            ActiveButtonPlay = true
            buttonPlay.isEnabled = ActiveButtonPlay

       }

        if (savedInstanceState != null) {
            buttonPlay.isEnabled = savedInstanceState.getBoolean("ActiveButtonPlay")

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("ActiveButtonPlay", ActiveButtonPlay)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        ActiveButtonPlay = savedInstanceState.getBoolean("ActiveButtonPlay")
    }
}