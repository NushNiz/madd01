package com.example.tute01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private val inserRecordFragment = InserRecordFragment();
    private val viewRecordFragment = ViewRecordFragment();

    lateinit var btnAdd: Button
    lateinit var btnView:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnView = findViewById(R.id.btnView)

        btnAdd.setOnClickListener{
            loadInsertFragment()


        }

        btnView.setOnClickListener{
            loadViewFragment()


        }
    }

    private fun loadInsertFragment(){

        val fragment:Fragment? = supportFragmentManager.findFragmentById(R.id.Fragment_container)

        if(fragment == null){
            supportFragmentManager.beginTransaction().add(R.id.Fragment_container, inserRecordFragment)
        }else{
            supportFragmentManager.beginTransaction().replace(R.id.Fragment_container, inserRecordFragment)
        }

    }

    private fun loadViewFragment(){

        val fragment:Fragment? = supportFragmentManager.findFragmentById(R.id.Fragment_container)

        if(fragment == null){
            supportFragmentManager.beginTransaction().add(R.id.Fragment_container, viewRecordFragment)
        }else{
            supportFragmentManager.beginTransaction().replace(R.id.Fragment_container, viewRecordFragment)
        }

    }

}