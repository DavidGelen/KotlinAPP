package lib.study.util

/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 23:01
 * @class describe
 */

fun main(args: Array<String>) {
    val langs = listOf("C", "C++", "Java", "Python", "JavaScript")
    langs.asSequence().filter { it.startsWith("C") }
        .sortedBy { it }
        .map { it.toUpperCase() }.toList()
        .forEach { println(it) }
}

fun test11() {
    val items = listOf("java", "kotlin", "python")
    when {
        "java" in items -> println("is good lang")
        "kotlin" in items -> println("is good good lang")
        else -> println("python is best lang")
    }
}

