package com.example.interactiveui

import android.hardware.lights.Light
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.annotation.RequiresPermission.Read

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val DarkButton=findViewById<Button>(R.id.button4)
        val ReadtButton=findViewById<Button>(R.id.button5)
        val linearL=findViewById<LinearLayout>(R.id.linearLayout )
        ReadtButton.setOnClickListener {
             // change to read mode
            linearL.setBackgroundResource(R.color.slightly_yellow)
            DarkButton.setBackgroundColor(getColor(R.color.black))
            ReadtButton.setBackgroundColor(getColor(R.color.black))
            DarkButton.setTextColor(getColor(R.color.white))
            ReadtButton.setTextColor(getColor(R.color.white))


        }
        DarkButton.setOnClickListener {
            // change dark theme
            linearL.setBackgroundResource(R.color.black)
            DarkButton.setBackgroundColor(getColor(R.color.white))
            ReadtButton.setBackgroundColor(getColor(R.color.white))
            DarkButton.setTextColor(getColor(R.color.black))
            ReadtButton.setTextColor(getColor(R.color.black))


        }

    }
}