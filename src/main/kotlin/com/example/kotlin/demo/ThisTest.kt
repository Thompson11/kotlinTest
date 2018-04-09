package com.example.kotlin.demo

/**
 * 在扩展函数或者带接收者的函数字面值中，this表示在点左侧传递的接收者参数
 */
val sum = fun Int.(x: Int): Int = this + x
val concat = fun String.(x: Any) = this + x
