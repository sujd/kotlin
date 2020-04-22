package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.代理.BuyFruit
import com.example.myapplication.代理.BuyTest
import com.example.myapplication.基础语法.SimpleActivity
import com.example.myapplication.数组集合.ArrayActivity
import com.example.myapplication.继承封装多态接口抽象.CharacterActivity

class MainActivity : Activity(){



    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1=findViewById(R.id.bt1)
        bt2=findViewById(R.id.bt2)
        bt3=findViewById(R.id.bt3)
        bt4=findViewById(R.id.bt4)

        bt1.setOnClickListener({ startActivity(Intent(Guiding@this,SimpleActivity::class.java ))})
        bt2.setOnClickListener({ startActivity(Intent(Guiding@this,ArrayActivity::class.java ))})
        bt3.setOnClickListener({ startActivity(Intent(Guiding@this,CharacterActivity::class.java ))})
        bt4.setOnClickListener({ startActivity(Intent(Guiding@this,BuyTest::class.java ))})
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

}
