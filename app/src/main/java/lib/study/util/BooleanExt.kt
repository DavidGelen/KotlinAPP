package lib.study.util

/**
 * @name KotlinAPP
 * @package name：lib.study.util
 * @anthor DavidZhang
 * @time 2019/1/7 18:00
 * @class describe
 */

sealed class BooleanExt<out T>//定义成协变

object Otherwise : BooleanExt<Nothing>()//Nothing是所有类型的子类型

class TransferData<T>(val data: T) : BooleanExt<T>()//data涉及到了只读操作

inline fun <T> Boolean.yes(block: () -> T): BooleanExt<T> = when {
    this -> {
        TransferData(block.invoke())
    }

    else -> Otherwise
}

inline fun <T> BooleanExt<T>.otherWise(block: () -> T): T = when(this) {
    is Otherwise ->
        block()

    is TransferData ->
        this.data
}

val numberList = listOf(1,3,7,9,12,36,27,18)

fun isOldList() = println(numberList
    .filter { it % 2 == 1 }
    .count()
    .equals(numberList.size)
    .yes { "奇数集合" }
    .otherWise { "非奇数集合" })



