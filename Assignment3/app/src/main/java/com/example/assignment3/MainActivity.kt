package com.example.assignment3

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val message = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("12345", message)
            }
            startActivity(intent)
        }
    }
}