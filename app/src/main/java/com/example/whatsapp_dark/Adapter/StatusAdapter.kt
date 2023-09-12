package com.example.whatsapp_dark.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.whatsapp_dark.Models.ProfileModel
import com.example.whatsapp_dark.databinding.StatusItemBinding

class StatusAdapter(private val list: ArrayList<ProfileModel>) : Adapter<StatusAdapter.StatusHolder>() {
    class StatusHolder(itemView: StatusItemBinding) : ViewHolder(itemView.root){
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        var binding = StatusItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return StatusHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        holder.binding.apply {
            list.get(position).apply {
                txtStatus.text = name
                imgStatus.setImageResource(image)
            }
        }
    }
}