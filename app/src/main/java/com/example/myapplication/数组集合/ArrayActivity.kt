package com.example.myapplication.数组集合

import android.app.Activity
import android.os.Bundle
import android.util.Log

class ArrayActivity:Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        show4()
        show5()
    }


    fun show4(){
        //通过listOf 返回数据内容不可变的集合,不能有null
        var lists= listOf<String>("我","是","大","帅","哥")
        for(list in lists){
            Log.e("sujd===",list)
        }

        //通过listOfNotNull，返回不可变的List集合，可以有null，但是不会输出
        var lists2= listOfNotNull<String>("我","是","大","帅","哥",null)
        for(list in lists2){
            Log.e("sujd===",list)
        }

        //通过arrayListOf，返回不可变的ArrayList集合，不可以有null
        var lists3= arrayListOf<String>()
        lists3.add("哈哈哈哈")
        lists3.add("嘿嘿嘿嘿")
        lists3.add("吼吼吼吼")
        for(list in lists3){
            Log.e("sujd===",list)
        }

        //通过mutableListOf，返回不可变的MutableListOf集合，不可以有null
        var lists4= mutableListOf<String>()
        lists4.add("大傻子")
        lists4.add("大疯子")
        lists4.add("大美女")
        for(list in lists4){
            Log.e("sujd===",list)
        }

    }

    fun show5(){
        var map=HashMap<String,String>()
        map.put("1","我是第一条数据")
        map.put("2","我是第二条数据")
        map.put("3","我是第三条数据")
        map.put("4","我是第四条数据")

        Log.e("sujd===",map.get("1"))
        Log.e("sujd===",map["2"])
    }
}