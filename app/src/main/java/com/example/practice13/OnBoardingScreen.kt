package com.example.practice13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBoardingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)
    }

    fun login(view: View) {
        val intent = Intent(this,LoginScreen::class.java)
        startActivity(intent)
    }
}