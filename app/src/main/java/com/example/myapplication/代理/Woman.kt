package com.example.myapplication.代理

import android.util.Log

class Woman:BuyFruit by Man{
    override fun buyfruit() {
        Log.e("sujd====","女人买水果跑腿费100元,");
        Man.buyfruit();
        Log.e("sujd====","女人赚差价90元");

    }
}