package com.example.kotlin.demoTest

import com.example.kotlin.demo.sum
import com.example.kotlin.demo.concat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ThisTestTest {

    @Test
    fun execTest() {
        println(1.sum(1))
        println("abc".concat(123))
    }
}