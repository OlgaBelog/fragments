package com.olgadenis.learnandplay

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import androidx.fragment.app.Fragment

class LegoAdapter(private val legoList: List<Lego>,  private val fragmentManager: FragmentManager, private val activity: Activity):RecyclerView.Adapter <LegoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LegoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lego_list_item, parent, false)
        return LegoViewHolder(itemView, fragmentManager, activity)
    }

    override fun onBindViewHolder(holder: LegoViewHolder, position: Int) {
       val lego = legoList[position]
        holder.bind(lego)
    }

    override fun getItemCount(): Int {
        return legoList.size
    }
}