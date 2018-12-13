package lib.study.util

/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 23:16
 * @class describe
 */
class Rectangle(var height: Double, var length: Double) :
    Shape(listOf(height, length, height, length)),
    RectangleProperity {

    override fun calculateArea(): Double = height * length
    override val isSquare: Boolean get() = height == length

    private var name: String
        get() = "Hello"
        set(value) {

        }
}