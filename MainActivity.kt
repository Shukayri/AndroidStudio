package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       fun add(num1: Int, num2:Int): Int {
           return num1 + num2
       }
        print("Enter first number: ")
        //var num1 = readLine()!!.toInt()
        print("Enter second number: ")
        //var num2 = readLine()!!.toInt()

       // println("$num1 + $num2 = ${add(num1, num2)}")
        Log.d("MainActivity", " Here is the test ${add(num1 = 22, num2 = 33)}")
    }
}