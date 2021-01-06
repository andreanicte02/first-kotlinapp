package com.example.firstappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rec: RecyclerView = findViewById(R.id.recycler)
        rec.adapter= MediaAdapter(getItems())



    }


    fun useToast(text: String): Unit {

        Toast.makeText(this,text,Toast.LENGTH_LONG).show()

    }
}