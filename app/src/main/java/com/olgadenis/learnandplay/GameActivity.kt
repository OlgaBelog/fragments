package com.olgadenis.learnandplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView



class GameActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView
    lateinit var headtext: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation)
        headtext = findViewById(R.id.headtext)




     bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {
                R.id.fragment1 -> {
                    fragment = FragmentRecycler()
                    replaceFragment(fragment!!)
                    headtext.text = "Список"

                }
              /*  R.id.fragment2 -> {
                    fragment = FragmentAnimation()
                    replaceFragment(fragment!!)
                    headtext.text = "Назад в список"
                }*/

                R.id.back -> {

                    //fragment = FragmentRecycler()
                   // replaceFragment(fragment!!)
                    //headtext.text = "Выход в главное меню"
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
         //   .addToBackStack(null)
            .commit()
    }
}
