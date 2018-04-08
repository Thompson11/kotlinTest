package com.example.kotlin.demoTest

import com.example.kotlin.demo.returnDemo_1
import com.example.kotlin.demo.returnDemo_2
import com.example.kotlin.demo.returnDemo_3
import com.example.kotlin.demo.returnDemo_4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月05日 <br>
 * @see com.example.kotlin.demoTest <br>
 * @since R8.0 <br>
 */
@RunWith(JUnit4::class)
class ReturnDemoTest {

    @Test
    fun testReturnDemo_1() {
        returnDemo_1()
    }

    @Test
    fun testReturnDemo_2() {
        returnDemo_2()
    }

    @Test
    fun testReturnDemo_3() {
        returnDemo_3()
    }

    @Test
    fun testReturnDemo_4(){
        returnDemo_4()
    }
}