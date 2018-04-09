package com.example.kotlin.demoTest

import com.example.kotlin.demo.ThisOuterDemo
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月09日 <br>
 * @see com.example.kotlin.demoTest <br>
 * @since R8.0 <br>
 */
@RunWith(JUnit4::class)
class ThisOuterTest {

    @Test
    fun testThisKeyWord() {
        val outer = ThisOuterDemo()
        outer.Inner().m()
    }
}