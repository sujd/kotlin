package com.example.myapplication.继承封装多态接口抽象

import android.util.Log

class Student(name: String,var work: String,var food: String) :Person(name),SomeCan {

    override fun eat():String{
        return work
    }

    override fun work(): String {
        return food
    }

    override fun canPlay() {
        Log.e("sujd=====",name+"会打电子游戏");
    }
}