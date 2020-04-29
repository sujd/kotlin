package com.example.myapplication.高阶函数

import android.app.Activity
import android.os.Bundle

/**
 * 高阶函数：一个用函数作为参数或者返回值的函数
 * 把筛选的行为（函数）作为参数传递到过滤器里，简洁代码，提高效率
 */

class MethodActivity:Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        select(21)
    }
}