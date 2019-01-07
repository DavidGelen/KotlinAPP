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



