package com.example.whatsapp_dark.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsapp_dark.Fragment.CallsFragment
import com.example.whatsapp_dark.Fragment.ChatsFragment
import com.example.whatsapp_dark.Fragment.StatusFragment

class WhatsPageAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {

    var fragment = arrayOf(ChatsFragment(),StatusFragment(),CallsFragment())
    var title = arrayOf("Chat","Status","Call")
    override fun getCount(): Int {
        return fragment.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title[position]
    }

}