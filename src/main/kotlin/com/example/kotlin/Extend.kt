package com.example.kotlin

val <T> List<T>.lastIndex: Int get() = size - 1

fun String.notEmpty(): Boolean {
    return !this.isEmpty()
}