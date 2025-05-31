package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
     val etUsername = findViewById<EditText>(R.id.etUsername)
     val etpassword = findViewById<EditText>(R.id.etPassword)
        val login = findViewById<Button>(R.id.btnlogin)

        login.setOnClickListener{
            val username = etUsername.text.toString().trim()
            val password = etpassword.text.toString().trim()
            if(username.isEmpty()){
                Toast.makeText(this, "Please enter the username", Toast.LENGTH_SHORT).show()
            }
             else if(password.isEmpty()){
                Toast.makeText(this,"Please enter the password", Toast.LENGTH_SHORT).show()
            } else if(username == "admin" && password =="123"){
                Toast.makeText(this, "Login Successful",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                finish()
            } else{
                Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}