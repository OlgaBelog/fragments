package com.olgadenis.learnandplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.DialogFragment
import android.app.Dialog
import android.media.MediaPlayer
import android.media.SoundPool

import androidx.appcompat.app.AlertDialog



class LearnActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView
    lateinit var headtext: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation)
        headtext = findViewById(R.id.headtext)

        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {
                R.id.fragment1 -> {
                    fragment = FragmentLetters()
                    replaceFragment(fragment!!)
                    headtext.text = "Учим буквы"

                }
                R.id.fragment2 -> {
                    fragment = FragmentNumbers()
                    replaceFragment(fragment!!)
                    headtext.text = "Учим цифры"
                }
                R.id.back -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)


                }
            }

               true
            }
        bottomNavigationMenu.selectedItemId=R.id.fragment1

        }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
            outState.putBoolean("ActiveButtonPlay", true)
    }
    fun replaceFragment (fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
    }
