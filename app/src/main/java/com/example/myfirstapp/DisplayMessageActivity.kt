package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // get info
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // find & set string
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}