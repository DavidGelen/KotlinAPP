package lib.study.util

import android.os.Build
import android.support.annotation.RequiresApi

/**
 * @name KotlinAPP
 * @package name：lib.study.util
 * @anthor DavidZhang
 * @time 2019/1/7 14:25
 * @class 演示中缀调用
 */

infix fun String.sameAs(other: String): Boolean = (other == this)
private fun test13() {
    val strA = "A"
    val strB = "B"
    if (strA sameAs strB) {//中缀调用 sameAs
        println("str is the same")
    } else {
        println("str is the different")
    }
}

infix fun <T> T.into(other: Collection<T>): Boolean = other.contains(this)
private fun testInfix() {
    val list = listOf(1, 3, 5, 7, 9)
    val element = 2
    if (element into list) {//中缀调用，这样的写法，会更加接近我们自然语言的表达，更容易理解
        println("element: $element is into list")
    } else {
        println("element: $element is not into list")
    }
}

infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
@RequiresApi(Build.VERSION_CODES.N)
private fun test12() {
    val map = mapOf(1 to "A", 2 to "B", 3 to "C")
    map.forEach { key, value ->
        println("key: $key   value:$value")
    }
}