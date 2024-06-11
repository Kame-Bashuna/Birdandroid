//package com.example.myapplication
//
//import android.content.Intent
//import android.os.Bundle
//import android.provider.Telephony.Mms.Intents
//import android.widget.ImageView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.myapplication.databinding.ActivityMainBinding
//import com.example.myapplication.databinding.ActivitySecondBirdBinding
//import com.squareup.picasso.Picasso
//
//class SecondBirdActivity : AppCompatActivity() {
//    lateinit var binding: ActivitySecondBirdBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.imageView3.setOnClickListener {
//            val intent = Intent(this, ThirdBirdActivity::class.java)
//            startActivity(intent)
//        }
//        Picasso
//            .get()
//            .load("https://images.unsplash.com/photo-1452570053594-1b985d6ea890?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJpcmR8ZW58MHx8MHx8fDA%3D")
//            .into(binding.imageView2)
//    }
//}
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1452570053594-1b985d6ea890?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView)

    }
}
