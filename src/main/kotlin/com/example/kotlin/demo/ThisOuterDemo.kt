package com.example.kotlin.demo

/**
 * Description: <br>
 * 如果this没有限定符，它指的是最内层包含它的作用域。
 * 想要引用其它作用域中的this，可以使用this@label标签
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月09日 <br>
 * @see com.example.kotlin.demo <br>
 * @since R8.0 <br>
 */
class ThisOuterDemo {
    val oh = "Oh!"

    inner class Inner {
        fun m() {
            val outer = this@ThisOuterDemo
            val inner = this@Inner
            val pthis = this
            println("outer=$outer")
            println("inner=$inner")
            println("pthis=$pthis")
            println(this@ThisOuterDemo.oh)

            val fun1 = hello@ fun String.() {
                val d1 = this //fun1的接收者
                println("d1$d1")
            }

            val fun2 = { s: String ->
                val d2 = this
                println("d2=$d2")
                println("s=$s")
            }

            "abc".fun1()
            fun2("zyf")
        }
    }
}