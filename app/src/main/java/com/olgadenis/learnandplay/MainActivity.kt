package com.olgadenis.learnandplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


import android.content.Intent
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


lateinit var text:EditText

   //  var ActiveButtonPlay: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLearn: Button = findViewById(R.id.ButtonStartLearn)
        val buttonPlay: Button = findViewById(R.id.ButtonStartPlay)

        buttonLearn.setOnClickListener {
            text=findViewById(R.id.text_name)
            val username=text.getText().toString()

            val intent = Intent(this, LearnActivity::class.java)
            intent.putExtra("Username", username)
            startActivity(intent)

       }


        buttonPlay.setOnClickListener {
          val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)


        }
 //       if (savedInstanceState != null) {
 //           buttonPlay.isEnabled = savedInstanceState.getBoolean("ActiveButtonPlay")

        }
    }

 //   override fun onSaveInstanceState(outState: Bundle) {
 //       super.onSaveInstanceState(outState)
  //      outState.putBoolean("ActiveButtonPlay", ActiveButtonPlay)

  //  }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
 //       super.onRestoreInstanceState(savedInstanceState)
 //       ActiveButtonPlay = savedInstanceState.getBoolean("ActiveButtonPlay")
 //   }
