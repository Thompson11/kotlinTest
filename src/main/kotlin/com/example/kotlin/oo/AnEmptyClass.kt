package com.example.kotlin.oo

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月13日 <br>
 * @see com.example.kotlin.oo <br>
 * @since R8.0 <br>
 */
class AnEmptyClass

fun emptyClass() {
    val anEmptyClass = AnEmptyClass()
    println(anEmptyClass)
    println(anEmptyClass is AnEmptyClass)
    println(anEmptyClass::class)
}