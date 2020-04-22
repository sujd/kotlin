package com.example.myapplication.基础语法

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View

class SimpleActivity:Activity() {

    var y=100
    var s:String ="111"
    var x:Int=123
    var b=false

    val PI=3.1415926f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        y=20

        Log.e("sujd===1",""+add(1,2))
        Log.e("sujd===2",""+add2(1,2))
        Log.e("sujd===3",""+add3(1,2))
        Log.e("sujd===4",""+add4(1,2))
        Log.e("sujd===5",""+show6(PI,1f))
    }

    fun add(a:Int,b:Int):Int{
        return a+b
    }

    //如果只有1条返回值，上面的方法可以进行简化
    fun add2(a:Int,b:Int)=a+b

    //函数表达式写法
    var add3={x:Int,y:Int -> x+y}

    //add3还可以演化为
    var add4:(Int,Int)->Int={x,y ->x+y}


    fun showString(s:String):String{

        return "我是你${s}${s.length}"
    }

    fun showString2(s:String?):String{

        return s+"我是你"
    }

    fun show2(s:Int):String{
        when(s){
            1 -> return "1状态"
            2-> return "2状态"
            else-> return "乱状态"
        }
    }

    fun show3(){
        //定义一个[1，15]闭合区间的数组
        var nums=1..15
        for(i:Int in nums){
            Log.e("sujd===","${i} ")
        }

        //定义一个[1，15)左闭右开的数组
        //step 表示跳几步进行输出
        var nums2=1 until 15
        for(i:Int in nums2 step 3){
            Log.e("sujd===",""+i)
        }

        var nums3=nums.reversed();//数组倒序
        nums.count();//数组长度
    }



    fun show6(Pi:Float=PI,r:Float):Float{

        return Pi*r*r
    }
}