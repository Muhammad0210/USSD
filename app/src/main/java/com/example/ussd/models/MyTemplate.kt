package com.example.ussd.models

import java.io.Serializable

data class MyTemplate(
    val name:String,
    val code:String,
    val price:String,
    val about:String
):Serializable