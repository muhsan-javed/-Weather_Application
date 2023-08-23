package com.muhsanjaved.weatherapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhsanjaved.weatherapplication.R
import com.muhsanjaved.weatherapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}