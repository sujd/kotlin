package com.example.myapplication.代理

import android.app.Activity
import android.os.Bundle
import android.util.Log

class BuyTest: Activity() {

    enum class aa{
        周一,周二,周三,周四,周五,周六,周日
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("sujd====",aa.周一.name);
        Log.e("sujd====", aa.周一.ordinal.toString());


        var woman=Woman()
        var woman2=Woman()
        woman.buyfruit()

        Log.e("sujd====", (woman==woman2).toString());

//        var man=Man()
//        man.buyfruit()
    }
}