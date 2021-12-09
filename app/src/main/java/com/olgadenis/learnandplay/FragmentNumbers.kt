package com.olgadenis.learnandplay

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class FragmentNumbers : Fragment() {

    lateinit var button: Button
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var text: TextView
    var counter: Int = 1
    var val1: Int = 0
    var val2: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_numbers, container, false)

        image1 = view.findViewById(R.id.first_rec)
        image2 = view.findViewById(R.id.second_rec)
        text=view.findViewById(R.id.result_text)

        button = view.findViewById(R.id.button1)
        button.setOnClickListener{
            when (counter) {
                1 -> {
                    image1.setImageResource(R.drawable.rounds1)
                    image2.setImageResource(R.drawable.rounds0)
                    val1=1
                    text.text=""
                    counter++
                }
                2 -> {
                    image2.setImageResource(R.drawable.rounds1)
                    val2=1
                    text.text=(val1+val2).toString()
                    counter--}

            }
        }


        button = view.findViewById(R.id.button2)
        button.setOnClickListener{
            when (counter) {
                1 -> {
                    image1.setImageResource(R.drawable.rounds2)
                    image2.setImageResource(R.drawable.rounds0)
                    val1=2
                    text.text=""
                    counter++
                }
                2 -> {
                    image2.setImageResource(R.drawable.rounds2)
                    val2=2
                    text.text=(val1+val2).toString()
                    counter--}

            }
        }

        button = view.findViewById(R.id.button3)
        button.setOnClickListener{
            when (counter) {
                1 -> {
                    image1.setImageResource(R.drawable.rounds3)
                    image2.setImageResource(R.drawable.rounds0)
                    val1=3
                    text.text=""
                    counter++
                }
                2 -> {
                    image2.setImageResource(R.drawable.rounds3)
                    val2=3
                    text.text=(val1+val2).toString()
                    counter--}

            }
        }
        button = view.findViewById(R.id.button4)
        button.setOnClickListener{
            when (counter) {
                1 -> {
                    image1.setImageResource(R.drawable.rounds4)
                    image2.setImageResource(R.drawable.rounds0)
                    val1=4
                    text.text=""
                    counter++
                }
                2 -> {
                    image2.setImageResource(R.drawable.rounds4)
                    val2=4
                    text.text=(val1+val2).toString()
                    counter--}

            }
        }
        button = view.findViewById(R.id.button5)
        button.setOnClickListener{
            when (counter) {
                1 -> {
                    image1.setImageResource(R.drawable.rounds5)
                    image2.setImageResource(R.drawable.rounds0)
                    val1=5
                    text.text=""
                    counter++
                }
                2 -> {
                    image2.setImageResource(R.drawable.rounds5)
                    val2=5
                    text.text=(val1+val2).toString()
                    counter--}

            }
        }

        return view
    }


}