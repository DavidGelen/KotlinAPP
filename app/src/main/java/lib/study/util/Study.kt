package lib.study.util

import android.content.Intent
import lib.study.entity.Student
import java.io.Serializable


/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 22:45
 * @class describe
 */

val sum: (Int, Int, Int) -> (Int) = { a, b, c -> a + b + c }

var age: String? = "23"

val ages2 = age?.toInt() ?: -1

fun descript(obj: Any): String = when (obj) {
    1 -> "one"
    "hello" -> "hello word"
    is Long -> "long type"
    !is String -> "is not String"
    else -> {
        "unknown type"
    }
}

/**所以在Kotlin给出了另一个方案就是使用@JvmOverloads注解这样就会自动生成多个重载方法供Java调用*/
@JvmOverloads
fun <T> Any.joinString(
    collection: Collection<T> = listOf(),
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    return collection.joinToString(separator, prefix, postfix)
}

fun main(args: Array<String>) {
    val student = Student("mikyou", 18, 99.0)
    val (name, age, grade) = student//将一个student对象解构成一组3个单独的变量
    println("my name is $name , I'm $age years old, I get $grade score")//解构后的3个变量可以脱离对象，直接单独使用

}

/**
 * @Author: DavidZhang
 * @Date: 2019/1/4 15:55
 * @Description: let函数一路裂变，每烈一次，it对象发生改变
 */
fun studyLet() {
    val original = "abc"
    // Evolve the value and send to the next chain
    original.let {
        println("The original String is $it") // "abc"
        it.reversed() // evolve it as parameter to send to next let
    }.let {
        println("The reverse String is $it") // "cba"
        it.length  // can be evolve to other type
    }.let {
        println("The length of the String is $it") // 3
    }
}

/**
 * @Author: DavidZhang
 * @Date: 2019/1/4 15:59
 * @Description: also函数一路裂变，不管怎么裂变下去，it对象始终不变
 */
fun studyAlso() {
    val original = "abc"
    original.also {
        println("The original String is $it") // "abc"
        it.reversed() // even if we evolve it, it is useless
    }.also {
        println("The reverse String is ${it}") // "abc"
        it.length  // even if we evolve it, it is useless
    }.also {
        println("The length of the String is ${it}") // "abc"
    }
}

//下面的代码就是最好的诠释
// Normal approach
/*fun makeDir(path: String): File  {
    val result = File(path)
    result.mkdirs()
    return result
}*/
// Improved approach
//fun makeDir(path: String) = path.let{ File(it) }.also{ it.mkdirs() }

private fun fillIntentArguments(intent: Intent, params: Array<out Pair<String, Any?>>) {
    params.forEach {
        when (val value = it.second) {//看到没有，官方说你不是想要一个when表达式实现吗，那行把value缩进来了. 这样在when表达式内部快乐使用value了
            //null -> intent.putExtra(it.first, null as Serializable?)
            is Int -> intent.putExtra(it.first, value)
            is Long -> intent.putExtra(it.first, value)
            is CharSequence -> intent.putExtra(it.first, value)
            is String -> intent.putExtra(it.first, value)
            is Float -> intent.putExtra(it.first, value)
            is Double -> intent.putExtra(it.first, value)
            else -> intent.putExtra(it.first, null as Serializable?)
        }
        return@forEach
    }
}











































