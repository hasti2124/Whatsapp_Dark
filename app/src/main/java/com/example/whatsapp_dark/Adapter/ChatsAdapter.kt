package com.example.whatsapp_dark.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.whatsapp_dark.Models.ProfileModel
import com.example.whatsapp_dark.R
import com.example.whatsapp_dark.databinding.ChatsItemBinding

class ChatsAdapter(private val list: ArrayList<ProfileModel>) : Adapter<ChatsAdapter.ChatsHolder>() {

    lateinit var context : Context
    class ChatsHolder(itemView: ChatsItemBinding) : ViewHolder(itemView.root){
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsHolder {
        context = parent.context
        var binding = ChatsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ChatsHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {
        holder.binding.apply {
            list.get(position).apply {
                txtName.text = name
                imgProfile.setImageResource(image)
                if (position % 2 == 1){
                    txtCount.visibility = View.GONE
                    txtTime.setTextColor(context.resources.getColor(R.color.text))
                }else if (position % 2 == 0){
                    imgRound.visibility = View.GONE
                }
            }
        }
    }
}