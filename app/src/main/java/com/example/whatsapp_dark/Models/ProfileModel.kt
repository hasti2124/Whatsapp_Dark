package com.example.whatsapp_dark.Models

import android.media.Image

class ProfileModel {

    var name : String
    var image = 0

    constructor(name:String, image: Int){
        this.name = name
        this.image = image
    }
}