package com.example.kotlin.demo

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月05日 <br>
 * @see com.example.kotlin.demo <br>
 * @since V1.0 <br>
 */
fun returnDemo_1() {
    println(" START " + ::returnDemo_1.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        if (it == 3) return
        println(it)
    }
    println(" END " + ::returnDemo_1.name)
}

fun returnDemo_2() {
    println(" START " + ::returnDemo_2.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach(
            fun(a: Int) {
                if (a == 3) return
                println(a)
            }
    )
    println(" END " + ::returnDemo_2.name)
}

fun returnDemo_3() {
    println(" START " + ::returnDemo_3.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach here@{
        if (it == 3) return@here //指令跳转到lambda表达式标签here@处，继续下一个it=4的遍历循环
        println(it)
    }
    println(" END" + ::returnDemo_3.name)
}

fun returnDemo_4() {
    println(" START " + ::returnDemo_4.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        if (it == 3) return@forEach //从lambda表达式@forEach中返回
        println(it)
    }
}