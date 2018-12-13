package lib.study.util


/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 22:45
 * @class describe
 */

val sum: (Int,Int,Int) -> (Int) = {a, b, c -> a + b + c}

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






