package com.example.firstappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val messege: TextView = findViewById(R.id.message)
        messege.text = "asfasdfasasfd"

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            useToast("hola ${messege.text}")
        }
    }


    fun useToast(text: String): Unit {

        Toast.makeText(this,text,Toast.LENGTH_LONG).show()

    }
}