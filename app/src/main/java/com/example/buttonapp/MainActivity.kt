package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val plus =findViewById<Button>(R.id.plus)
        val minus =findViewById<Button>(R.id.minus)
        val textView=findViewById<TextView>(R.id.textView)

       //a counter to increase or decrease when user press the buttons
        var counter=0

        plus.setOnClickListener {
            counter++
            textView.setTextColor(Color.parseColor(colorPicker(counter)))
            textView.setY(textView.getY() - 10);
            textView.text=counter.toString()
        }
        minus.setOnClickListener {
            counter--
            textView.setTextColor(Color.parseColor(colorPicker(counter)))
            textView.setY(textView.getY() + 10);
            textView.text=counter.toString()

        }

    }
   //function to return the color for the counter
    private fun colorPicker(counter: Int): String? {
       if(counter>0) //if positive return green
        return "#00FF00"
    else if (counter==0 ) //if 0 return black
        return "#000000"
    else   //if negative return red
        return "#FF0000"
    }

}