package com.example.myapplication.高阶函数

import android.util.Log

data class Girl(var name:String,var age:Int,var height:Int,var address:String)

var fcwr= listOf<Girl>(

    Girl("小小",24,176,"河北"),
    Girl("大大",21,170,"湖北"),
    Girl("呼呼",25,175,"江西"),
    Girl("哗哗",26,173,"北京"),
    Girl("娜娜",22,172,"天津"),
    Girl("露露",21,177,"四川")
)

fun select(ages: Int){
    var list=ArrayList<Girl>()

    for(girl:Girl in fcwr){
        if(girl.age==ages){
            list.add(girl)
        }
    }

    for(girl in list){
        Log.e("sujd===","${girl.name}")
    }
}