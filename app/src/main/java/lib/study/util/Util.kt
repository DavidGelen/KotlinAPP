package lib.study.util

/**
 * @name KotlinAPP
 * @package name：lib.study.util
 * @anthor DavidZhang
 * @time 2019/1/4 15:11
 * @class describe
 */


// 声明接收者
fun kotlinDSL(block:StringBuilder.()->Unit){
    block(StringBuilder("Kotlin"))
}




