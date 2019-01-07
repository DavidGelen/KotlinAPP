//通过@file: JvmName("FileFormatUtil")注解，自定义类名为FileFormatUtil
// 并且调用的时候直接调用FileFormatUtil.formateFileSize()即可
//放在文件顶部，在package声明的前面
@file: JvmName("FileFormatUtil")
package lib.study.util

import java.math.BigDecimal

/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 23:36
 * @class describe
 */

//这个顶层函数不属于任何一个类，不需要类容器，不需要static关键字
fun formateFileSize(size: Double): String {
    if (size < 0) {
        return "0 KB"
    }

    val kBSize = size / 1024
    if (kBSize < 1) {
        return "$size B"
    }

    val mBSize = kBSize / 1024
    if (mBSize < 1) {
        return "${BigDecimal(kBSize.toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toPlainString()} KB"
    }

    val mGSize = mBSize / 1024
    if (mGSize < 1) {
        return "${BigDecimal(mBSize.toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toPlainString()} MB"
    }

    val mTSize = mGSize / 1024
    if (mTSize < 1) {
        return "${BigDecimal(mGSize.toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toPlainString()} GB"
    }
    return "${BigDecimal(mTSize.toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toPlainString()} TB"
}

//测试顶层函数，实际上Kotlin中main函数和Java不一样，它可以不存在任何类容器中，可以直接定义在一个Kotlin 文件中
//另一方面也解释了Kotlin中的main函数不需要static关键字，实际上它自己就是个顶层函数。
fun main(args: Array<String>) {
    println("文件大小: ${formateFileSize(15582.0)}")
}