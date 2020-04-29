package com.example.myapplication.印章类

import android.util.Log

sealed class SealedTest {

    fun method(){
        Log.e("sujd===","打印")
    }

    class SealedA():SealedTest()
    class SealedB():SealedTest()
    class SealedC():SealedTest()
}