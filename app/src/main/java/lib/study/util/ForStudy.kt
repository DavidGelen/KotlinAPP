package lib.study.util

/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 22:56
 * @class describe
 */

fun test1() {
    // i in [1, 10)
    for (i in 1 until 10) {
        println(i)
    }
}

fun test2() {
    //i in [1,10]
    for (x in 1..10) {
        println(x)
    }
}

fun test4() {
    //递增数列迭代，每次间隔步长是2；1，3，5，7...
    for (x in 1..100 step 2) {
        println(x)
    }
}

fun test5() {
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
}

fun test6() {
    val list = listOf("a", "b", "c")
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
}

fun test7() {
    //递减数列迭代，每次间隔步长是3；9，6，3，0
    for(x in 9 downTo 0 step 3){
        println(x)
    }
}

fun test8() {
    val items = listOf("java", "kotlin", "android")
    for (index in items.indices) {//类似于java中的数组的length-index的遍历
        println("The $index index is ${items[index]}")
    }
}









