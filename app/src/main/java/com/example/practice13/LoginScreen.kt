package com.example.practice13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.view.View
import android.widget.EditText

class LoginScreen : AppCompatActivity() {

    lateinit var email:EditText
    lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signin(view: View) {

        if (email.text.toString().isEmpty() && password.text.toString().isEmpty()){
            val alert = AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("Fields cannot be empty")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
        else{
            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }

    }
}