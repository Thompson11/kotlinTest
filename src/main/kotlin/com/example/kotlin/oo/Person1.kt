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
class Person1 {
    lateinit var name: String
    var age: Int = 0
    lateinit var sex: String

    override fun toString(): String {
        return "Person1(name='$name', age=$age, sex='$sex')"
    }
}