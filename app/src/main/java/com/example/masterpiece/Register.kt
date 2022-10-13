package com.example.masterpiece

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {
    private lateinit var username_input: EditText
    private lateinit var useremail_input: EditText
    private lateinit var phone_input: EditText
    private lateinit var userpass_input:EditText
    private lateinit var sign_input:Button
    private lateinit var reguser_input:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        username_input= findViewById(R.id.username_input)
        useremail_input= findViewById(R.id.emailreg_input)
        phone_input= findViewById(R.id.phone_input)
        userpass_input= findViewById(R.id.passreg_input)
        sign_input= findViewById(R.id.register_input)
        reguser_input= findViewById(R.id.enteruser_input)

        reguser_input.setOnClickListener {
            Toast.makeText(this,"Going to LogIn page...",Toast.LENGTH_SHORT).show()
            var loginuser= Intent(this,MainActivity::class.java)
            startActivity(loginuser)
        }

    }
}