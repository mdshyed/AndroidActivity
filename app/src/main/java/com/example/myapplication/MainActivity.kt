package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.BinderThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val linearLayout=findViewById<LinearLayout>(R.id.LinearLayout)

        val btnUpload=findViewById<Button>(R.id.btnUpload)
        btnUpload.setOnClickListener{
            linearLayout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext,"uploading...",Toast.LENGTH_SHORT).show()
        }
        val btnDownload= findViewById<Button>(R.id.btnDownload)
            btnDownload.setOnClickListener{
                Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
                    linearLayout.setBackgroundResource(R.color.yellow)

        }
    }
}