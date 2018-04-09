package com.example.kotlin.demo

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月09日 <br>
 * @see com.example.kotlin.demo <br>
 * @since R8.0 <br>
 */
class OperatorDemo {

}

data class Point(val x: Int, val y: Int)

/**
 * 重载一元减运算符
 */
operator fun Point.unaryMinus() = Point(-x, -y)