package com.example.myapplication.代理

import android.util.Log

//男人去买
object Man:BuyFruit{
    override fun buyfruit() {
        Log.e("sujd====","男人买水果跑腿费10元");
    }
}