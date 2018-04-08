package com.example.kotlin.demo

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月05日 <br>
 * @see com.example.kotlin.demo <br>
 * @since R8.0 <br>
 */
class VariableVSValue {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)

        var x = 5
        x += 1
        println("x = $x")
    }

    fun declareVal() {
        val b = "a"
        println(b)
        println(b::class)
        println(b::class.java)

        val c: Int = 1
        val d = 2
        val e: Int
        e = 2
        println("c = $c, d = $d,e = $e")
    }
}