package com.nazhiba.viewmodaldemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var ViewModel:MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val viewkomponen = findViewById<TextView>(R.id.tvcount)
        val tombol = findViewById<Button>(R.id.btncount)

//        viewkomponen.text = count.toString()

//        viewkomponen.text = ViewModel.count.toString()
        ViewModel.count.observe(this, Observer{
            viewkomponen.text = it.toString()
        })
        tombol.setOnClickListener(){
//            ++count
//            viewkomponen.text = count.toString()

            ViewModel.updateCount()
//            viewkomponen.text = ViewModel.count.toString()
        }
    }
}