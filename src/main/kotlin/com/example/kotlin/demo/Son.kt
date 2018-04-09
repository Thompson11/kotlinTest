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
open class Father {
    open val firstName = "Chen"
    open val lastName = "Json"

    fun ff() {
        println("FFF")
    }
}

class Son : Father {
    override var firstName = super.firstName
    override var lastName = "Jack"

    constructor(lastName: String) {
        this.lastName = lastName
    }

    constructor()

    fun love() {
        super.ff()
        println(super.firstName + " " + super.lastName + " Love " + this.firstName + " " + this.lastName)
    }
}