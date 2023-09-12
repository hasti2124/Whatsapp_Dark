package com.example.whatsapp_dark.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_dark.Adapter.ChatsAdapter
import com.example.whatsapp_dark.Models.ProfileModel
import com.example.whatsapp_dark.R.drawable.*
import com.example.whatsapp_dark.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {
    var list = ArrayList<ProfileModel>()
    var profile = arrayOf(picture1, picture2, picture3, picture4, picture5, picture6, picture7, picture8, picture9, picture10, picture11, picture12, picture13, picture14, picture15, picture16, picture17, picture18, picture19, picture20)
    var name = arrayOf("Riya","Vishwa","Yesha","Nency","Nemisha","Prinesha","Asha","Aesha","Shreya","Darshita","Jemisha","Bansi","Mansavi","Gopi","Janvi","Dikshita","Jensi","Yeshvi","Zisha","Zinta")

    lateinit var binding: FragmentChatsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(layoutInflater)
        for (x in 0..profile.size-1){
            var model = ProfileModel(name[x],profile[x])
            list.add(model)
        }

        binding.rcvChat.layoutManager = LinearLayoutManager(context)
        binding.rcvChat.adapter = ChatsAdapter(list)
        return binding.root
    }
}