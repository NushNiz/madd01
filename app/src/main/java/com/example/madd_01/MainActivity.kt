package com.example.madd_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edtusername:EditText
    lateinit var edtpassword:EditText
    lateinit var btnLogin:Button
    lateinit var btnRegister:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtusername = findViewById(R.id.edtusername)
        edtpassword = findViewById(R.id.edtpassword)
        btnLogin = findViewById(R.id.btnlogin)
        btnRegister = findViewById(R.id.btnreg)

        btnLogin.setOnClickListener()
    }
}