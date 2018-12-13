package lib.study.util

/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 23:13
 * @class describe
 */
abstract  class Shape(val sides: List<Double>) {

    val perimeter: Double
        get() = sides.sum()

    abstract fun calculateArea(): Double
}