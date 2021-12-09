package com.olgadenis.learnandplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class LearnActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView
    lateinit var headtext: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        val strUser: String? = intent.getStringExtra("Username")

        bottomNavigationMenu = findViewById(R.id.bottom_navigation)
        headtext = findViewById(R.id.headtext)

        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {
                R.id.fragment1 -> {
                    fragment = FragmentLetters()
                    replaceFragment(fragment!!)
                    headtext.text = "Привет, "+strUser+", учим буквы"

                }
                R.id.fragment2 -> {
                    fragment = FragmentNumbers()
                    replaceFragment(fragment!!)
                    headtext.text = "Привет, "+strUser+", учим цифры"
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


    fun replaceFragment (fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
    }
