package com.example.layoutdesign_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.layoutdesign_04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(){
            Toast.makeText(this,"Submit SuccessFully",Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity2 :: class.java)
            startActivity(intent)
        }

    }
}