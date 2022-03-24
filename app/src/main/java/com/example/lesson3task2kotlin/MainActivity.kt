package com.example.lesson3task2kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        val i = findViewById<Button>(R.id.i)
        i.setOnClickListener { secondActivity() }
    }
    private fun secondActivity(){
        val second = Intent(this, SecondActivity::class.java)
        startActivity(second)
    }
}