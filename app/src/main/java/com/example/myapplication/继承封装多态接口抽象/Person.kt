package com.example.myapplication.继承封装多态接口抽象

import android.util.Log

/**
 * 父类 人类
 * 定义成抽象类的作用：
 *  1，有些方法在子类当中实现，在父类当中不需要实现，也就是不需要写方法体；
 *  2，抽象类定义的是事物的本质
 */
abstract class Person {

    var name:String=""//每个人都有名字

    //构造方法接收名字
    constructor(name:String){
        this.name=name
    }

    //人类都是可以吃饭的
    abstract fun eat():String

    //人类都有自己的职业属性
    abstract fun work(): String

    //普通方法
    open fun action(){
        Log.e("sujd=====",name+work()+eat());
    }
}