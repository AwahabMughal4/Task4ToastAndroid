package com.startandroid2.toast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var toastButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastButton = findViewById(R.id.toastButton2)
        toastButton.setOnClickListener {
             Toast.makeText(this, "You Just Implemented Toast Successfully", Toast.LENGTH_LONG).show()
           // val intent = Intent(this, FullscreenActivity::class.java)
            startActivity(intent)
        }
    }
}
