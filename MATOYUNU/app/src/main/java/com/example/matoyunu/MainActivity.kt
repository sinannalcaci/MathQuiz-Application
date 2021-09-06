package com.example.matoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun aktiviteDegistir(view: View){
        val intent =Intent(applicationContext,MainActivity2::class.java)
        startActivity(intent)

    }
}