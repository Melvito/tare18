package com.example.tare18

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tare18.databinding.NewlayoutBinding


class newclass (
    private val context: Context,
    private val labelList: MutableList<String>,

) : RecyclerView.Adapter<newclass.ViewPagerHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding = NewlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val label = labelList[position]

        holder.bind(label)
    }

    override fun getItemCount(): Int {
        return labelList.size
    }

    class ViewPagerHolder(private var itemHolderBinding: NewlayoutBinding) :
        RecyclerView.ViewHolder(itemHolderBinding.root) {
        fun bind(label: String) {
            itemHolderBinding.txtlabel.text = label

        }
    }
}