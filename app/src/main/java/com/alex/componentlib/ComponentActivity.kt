package com.alex.componentlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ComponentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}