package com.ayushapp.codinginfinity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intrologo : ImageView = findViewById(R.id.intro)
        val clogo : ImageView = findViewById(R.id.clogo)
        val pylogo : ImageView = findViewById(R.id.pylogo)
        val maintext : TextView = findViewById(R.id.maintext)



        clogo.setOnClickListener {
            Toast.makeText(this, "Moving To C Page", Toast.LENGTH_SHORT).show()
            val intent_c = Intent(this, Cprogram::class.java)
            startActivity(intent_c)
        }
        pylogo.setOnClickListener {
            Toast.makeText(this, "Moving To Python Page", Toast.LENGTH_SHORT).show()
            val intent_py = Intent(this, PyProgram ::class.java)
            startActivity(intent_py)
        }
    }
}