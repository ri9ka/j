package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)

        val imageView = findViewById<ImageView>(R.id.imageView)

        val textView1 = findViewById<TextView>(R.id.textView4)
        val textView2 = findViewById<TextView>(R.id.textView6)
        button7.setOnClickListener {
            textView1.text = "вертикальная"
            imageView.setImageResource(R.drawable.msg6361254918_23238)

        }

        button8.setOnClickListener {
            textView2.text = "по правому краю"
            imageView.setImageResource(R.drawable.msg6361254918_23239)
        }


        button5.setOnClickListener {
            textView1.text = "горизонтальная"
            imageView.setImageResource(R.drawable.msg6361254918_23240)
        }
        button6.setOnClickListener {
            textView2.text = "по центру"
            imageView.setImageResource(R.drawable.msg6361254918_23241)
        }


        button3.setOnClickListener {
            textView1.text = "вертикальная"
            imageView.setImageResource(R.drawable.msg6361254918_23242)
        }
        button4.setOnClickListener {
            textView2.text = "по левому краю"
            imageView.setImageResource(R.drawable.msg6361254918_23243)
        }
    }

}