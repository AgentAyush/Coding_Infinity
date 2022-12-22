package com.ayushapp.codinginfinity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class Cprogram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cprogram)
        val listView = findViewById<ListView>(R.id.listview)
        val arrayAdapter: ArrayAdapter<*>
        val list = arrayOf(
            "Cristiano Ronaldo",
            "Messi",
            "Neymar",
            "Isco",
            "Hazard",
            "Mbappe",
            "Hazard",
            "Ziyech",
            "Suarez",
            "Ayush",
            "Sankha"
        )
        // access the listView from xml file
//        val listView = findViewById<ListView>(R.id.listview)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_activated_1, list
        )
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val element = arrayAdapter.getPosition(position.toString()) // The item that was clicked
            val intent = Intent(this, Codes::class.java)
            startActivity(intent)
        }
    }


    }
