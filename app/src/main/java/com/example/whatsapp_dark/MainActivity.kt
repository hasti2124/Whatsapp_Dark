package com.example.whatsapp_dark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupMenu
import com.example.whatsapp_dark.Adapter.WhatsPageAdapter
import com.example.whatsapp_dark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = WhatsPageAdapter(supportFragmentManager)
        binding.vpFrag.adapter = adapter

        binding.tabs.setupWithViewPager(binding.vpFrag)

        var image =findViewById<ImageView>(R.id.imgMore)
        image.setOnClickListener{
            val popupMenu = PopupMenu(this,image)
            popupMenu.menuInflater.inflate(R.menu.popupitem,popupMenu.menu)

            popupMenu.show()
        }
    }
}