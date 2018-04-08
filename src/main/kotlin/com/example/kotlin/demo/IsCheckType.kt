package com.example.kotlin.demo

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月05日 <br>
 * @see com.example.kotlin.demo <br>
 * @since V1.0 <br>
 */
fun getLength(obj: Any): Int? {
    var result = 0
    if (obj is String) {
        println(obj::class)
        result = obj.length
        println(result)
    }
    println(obj::class)
    return result
}