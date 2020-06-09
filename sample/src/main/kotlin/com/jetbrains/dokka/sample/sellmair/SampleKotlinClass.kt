@file:Suppress("unused")

package com.jetbrains.dokka.sample.sellmair

open class BaseClass {
    open fun baseClassFunction1() {

    }

    open fun baseClassFunction2() {

    }

    open val baseClassProperty1: Int = 1
}

/**
 * This is a sample Kotlin class
 * Unlike [SampleJavaClass], this is written in Kotlin
 */
class SampleKotlinClass : BaseClass() {
    fun someUndocumentedFunction() {
        println("I have no idea what I am doing 🤷‍")
    }

    override fun baseClassFunction2() {
        super.baseClassFunction2()
        println("I have no idea what I am doing 🤷‍")
    }
}