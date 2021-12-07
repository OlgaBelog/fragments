package com.olgadenis.learnandplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.media.MediaPlayer


class FragmentLetters : Fragment() {



    lateinit var button: Button


    lateinit var image: ImageView




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_letters, container, false)

        button = view.findViewById(R.id.button1)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter1image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound1)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button2)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter2image)
        }

        button = view.findViewById(R.id.button3)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter3image)
        }

        button = view.findViewById(R.id.button4)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter4image)
        }

        button = view.findViewById(R.id.button5)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter5image)
        }
        return view


    }

}