package com.example.whatsapp_dark.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_dark.Adapter.StatusAdapter
import com.example.whatsapp_dark.Models.ProfileModel
import com.example.whatsapp_dark.R.drawable.*
import com.example.whatsapp_dark.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
    var list = ArrayList<ProfileModel>()
    var profile1 = arrayOf(hasti,picture1, picture4, picture10, picture14, picture19, picture20, picture3, picture15, picture7, picture2, picture21, picture22, picture23, picture24, picture25, picture26, picture27, picture28, picture29, picture30)
    var name1 = arrayOf("My Status","Riya","Nency","Darshita","Gopi","Zisha","Zinta","Yesha","Janvi","Asha","Vishwa","Krishna","Diya","Priya","Dhara","Ishita","Dwija","Dwiti","Kiya","Denisha","Krisha")
    lateinit var binding: FragmentStatusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStatusBinding.inflate(layoutInflater)
        for (x in 0..profile1.size-1){
            var model = ProfileModel(name1[x],profile1[x])
            list.add(model)
        }

        binding.rcvStatus.layoutManager = LinearLayoutManager(context)
        binding.rcvStatus.adapter = StatusAdapter(list)
        return binding.root
    }
}