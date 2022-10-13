package com.example.masterpiece

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var email_input: EditText
    private lateinit var pass_input:EditText
    private lateinit var log_input:Button
    private lateinit var sign_input:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        email_input= findViewById(R.id.email_input)
        pass_input= findViewById(R.id.password_input)
        log_input= findViewById(R.id.login_input)
        sign_input= findViewById(R.id.sign_input)

        sign_input.setOnClickListener {

        Toast.makeText(this,"Going to SignUp page...",Toast.LENGTH_SHORT).show()
            var registeruser= Intent(this,Register::class.java)
            startActivity(registeruser)
        }
    }
}