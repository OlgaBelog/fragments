package com.olgadenis.learnandplay

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class LegoViewHolder(itemView: View, private val fragmentManager: FragmentManager, private val activity: Activity): RecyclerView.ViewHolder(itemView), View.OnClickListener {
    private val LegoImageView:ImageView=itemView.findViewById(R.id.lego_image_view)
    private val LegoNameView:TextView =itemView.findViewById(R.id.lego_name_textview)
    private val LegoCollectionView:TextView =itemView.findViewById(R.id.lego_collection_textview)

    fun bind(lego:Lego){
        LegoNameView.text = lego.name
        LegoCollectionView.text = lego.collect
        LegoImageView.setImageResource(lego.image)

    }

    init {
        itemView.setOnClickListener(this)
   }


    override fun onClick(v: View?) {
        val n= this.adapterPosition
        val bundle = Bundle()
        bundle.putInt("input_pos", n)
        FragmentAnimation().arguments = bundle


        val transaction = fragmentManager.beginTransaction()
        val fragmentanimation = FragmentAnimation()
        fragmentanimation.arguments = bundle
        transaction.replace(R.id.fragment_container, fragmentanimation)
        transaction.addToBackStack(null)
        transaction.commit()

    }


}
