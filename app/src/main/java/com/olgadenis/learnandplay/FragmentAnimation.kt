package com.olgadenis.learnandplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent
import android.net.Uri
import android.view.animation.Animation
import android.view.animation.AnimationUtils


class FragmentAnimation : Fragment() {
    lateinit var image: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_animation, container, false)
        val inputPos = arguments?.getInt("input_pos")
        image = view.findViewById(R.id.main_hero)
        image.setImageResource(legoList[inputPos!!].image)



        // Анимация для Героя
        val HeroAnimation: Animation = AnimationUtils.loadAnimation(context, R.anim.fly_hero)
        // Подключаем анимацию к нужному View
        image.startAnimation(HeroAnimation)

        val Detal1ImageView: ImageView = view.findViewById(R.id.detal1)
// анимация для вращения первой детали
        val Detal1Animation = AnimationUtils.loadAnimation(context, R.anim.rotate_detal)
        Detal1ImageView.startAnimation(Detal1Animation)

        val Detal2ImageView: ImageView = view.findViewById(R.id.detal2)
// анимация для вращения первой детали
        val Detal2Animation = AnimationUtils.loadAnimation(context, R.anim.rotate_detal)
        Detal2ImageView.startAnimation(Detal2Animation)



        return view
    }


}