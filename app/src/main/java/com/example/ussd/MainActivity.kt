package com.example.ussd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.ussd.utils.MyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyData.addTemplate()
    }

//    override fun onSupportNavigateUp(): Boolean {
//        return Navigation.findNavController(this,R.id.my_navigation).navigateUp()
//    }
}