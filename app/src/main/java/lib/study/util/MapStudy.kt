package lib.study.util

import android.os.Build
import android.support.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
        /**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 23:43
 * @class describe
 */

fun main(args: Array<String>) {
    val map = mapOf(Pair(1, "A"), Pair(2, "B"), Pair(3, "C"))

    //这种写法@RequiresApi(Build.VERSION_CODES.N)
    map.forEach { key, value ->
        println("key: $key   value:$value")
    }

}

//中缀表示法
//中缀调用首先必须满足一个条件就是函数的参数只有一个。然后再看这个函数的参与者是不是只有两个元素，这两个元素可以是两个数，可以是两个对象，可以是集合等。
private infix fun String.sameAs(strB: String): Boolean = strB == this
private fun test13() {
    val strA = "A"
    val strB = "B"
    if (strA sameAs strB) {//中缀调用 sameAs
        println("str is the same")
    } else {
        println("str is the different")
    }
}

private infix fun <T> T.into(list: List<T>): Boolean = list.contains(this)

private fun testInfix() {
    val list = listOf(1, 3, 5, 7, 9)
    val element = 2
    if (element into list) {//中缀调用，这样的写法，会更加接近我们自然语言的表达，更容易理解
        println("element: $element is into list")
    } else {
        println("element: $element is not into list")
    }
}

@RequiresApi(Build.VERSION_CODES.N)
private fun test12() {
    val map = mapOf(1 to "A", 2 to "B", 3 to "C")
    map.forEach { key, value ->
        println("key: $key   value:$value")
    }
}

