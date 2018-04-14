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
class Person2() {
    lateinit var name: String
    var age: Int = 0
    lateinit var sex: String

    constructor(name: String) : this() {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        this.name = name
        this.age = age
        this.sex = sex
    }


    override fun toString(): String {
        return "Person2(name='$name', age=$age, sex='$sex')"
    }

}