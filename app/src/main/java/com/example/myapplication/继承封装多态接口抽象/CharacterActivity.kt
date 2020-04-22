package com.example.myapplication.继承封装多态接口抽象

import android.app.Activity
import android.os.Bundle
import android.util.Log

class CharacterActivity:Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var student=Student("小明","喜欢吃辣条","是学生")
        student.action()
        student.canPlay()
    }
}