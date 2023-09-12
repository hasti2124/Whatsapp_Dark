package com.example.whatsapp_dark.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_dark.Adapter.CallsAdapter
import com.example.whatsapp_dark.Models.ProfileModel
import com.example.whatsapp_dark.R.drawable.*
import com.example.whatsapp_dark.databinding.FragmentCallsBinding


class CallsFragment : Fragment() {

    var list = ArrayList<ProfileModel>()
    var profile2 = arrayOf(call,picture1, picture2, picture10, picture14, picture19, picture20, picture22,picture25,picture28,picture30)
    var name2 = arrayOf("Create Call Link","Riya","Vishwa","Darshita","Gopi","Zisha","Zinta","Diya","Ishita","Kiya","Krisha")
    lateinit var binding: FragmentCallsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCallsBinding.inflate(layoutInflater)
        for(x in 0..profile2.size-1){
            var model = ProfileModel(name2[x],profile2[x])
            list.add(model)
        }

        binding.rcvCalls.layoutManager = LinearLayoutManager(context)
        binding.rcvCalls.adapter = CallsAdapter(list)
        return binding.root
    }
}