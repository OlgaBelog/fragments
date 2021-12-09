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
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound2)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button3)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter3image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound3)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button4)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter4image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound4)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button5)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter5image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound5)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button6)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter6image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound6)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button7)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter7image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound7)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button8)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter8image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound8)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button9)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter9image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound9)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button10)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter10image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound10)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button11)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter11image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound11)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button12)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter12image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound12)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button13)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter13image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound13)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button14)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter14image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound14)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button15)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter15image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound15)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button16)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter16image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound16)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button17)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter17image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound17)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button18)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter18image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound18)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button19)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter19image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound19)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button20)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter20image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound20)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button21)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter21image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound21)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button22)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter22image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound22)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button23)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter23image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound23)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button24)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter24image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound24)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button25)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter25image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound25)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button26)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter26image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound26)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button27)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter27image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound27)
            mediaplayer.start()
        }

        button = view.findViewById(R.id.button28)
        button.isSoundEffectsEnabled = false
        image = view.findViewById(R.id.main_image_letter)
        button.setOnClickListener{
            image.setImageResource(R.drawable.letter28image)
            val mediaplayer = MediaPlayer.create(context, R.raw.lettersound28)
            mediaplayer.start()
        }


        return view


    }

}