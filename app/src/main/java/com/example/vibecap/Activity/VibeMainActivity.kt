package com.example.vibecap.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vibecap.databinding.ActivityVibeMainBinding

class VibeMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVibeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVibeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}