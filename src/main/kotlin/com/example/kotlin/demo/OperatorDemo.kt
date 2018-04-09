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

data class Counter(var index: Int)

/**
 * 重载+运算符
 */
operator fun Counter.plus(increment: Int): Counter {
    return Counter(index + increment)
}

data class Person(val name: String, val age: Int)

/**
 * 用infix函数自定义中缀操作符
 */
infix fun Person.grow(years: Int): Person {
    return Person(name, age + years)
}