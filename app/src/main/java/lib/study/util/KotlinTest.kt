package lib.study.util

//注意:声明的位置在函数外部，package内部
typealias NumPrint = (Int) -> Unit

/**
 * @name KotlinAPP
 * @package name：lib.study.util
 * @anthor DavidZhang
 * @time 2019/1/4 16:44
 * @class describe
 */
class KotlinTest {

    // typealias仅仅是给基础类型取了一个别名而已
    //typealias Token = String
    //private inline class TokenWrapper(val value: String)
    /*fun main(args: Array<String>) {
        val token: Token = "r3huae03zdhreol38fdjhkdfd8df"//可以看出这里Token名称完全是当做String类型来用了，相当于给String取了一个有意义的名字
        val tokenWrapper = TokenWrapper("r3huae03zdhreol38fdjhkdfd8df")//而inline class则是把String类型的值包裹起来，相当于String的一个包装器类。
        println("token is $token")
        println("token value is ${tokenWrapper.value}")//这里tokenWrapper并不能像token一样当做String来使用，而是需要打开包装器取里面value值
    }*/

    /*fun main(args: Array<String>) {
        val isOddNumber = { number: Int ->
            //lambda表达式是返回函数体内最后一行表达式的值
            number % 2
        }

        val oddNum:  (Int) -> Unit = {
            if (it % 2 == 1) {
                println(it)
            } else {
                println("is not a odd num")
            }
        }

        val evenNum:  (Int) -> Unit = {
            if (it % 2 == 0) {
                println(it)
            } else {
                println("is not a even num")
            }
        }

        oddNum.invoke(100)
        evenNum.invoke(100)
    }*/

    /*fun main(args: Array<String>) {
        val oddNum: NumPrint = {
            if (it % 2 == 1) {
                println(it)
            } else {
                println("is not a odd num")
            }
        }

        val evenNum: NumPrint = {
            if (it % 2 == 0) {
                println(it)
            } else {
                println("is not a even num")
            }
        }
        oddNum.invoke(100)
        evenNum.invoke(100)
    }*/

    //拒绝啰嗦代码，可以这么写
    /*fun main(args: Array<String>) {
        val persons = listOf(Person(name = "Alice", age = 18), Person(name = "Mikyou", age = 20), Person(name = "Bob", age = 16))
        println(persons.maxBy(Person::age))//成员引用的类型和maxBy传入的lambda表达式类型一致
    }*/

    /*fun salute() = print("salute")

    fun main(args: Array<String>) {
        run(::salute)
    }*/

    //https://juejin.im/post/5c0558fa51882545e24edead
    //https://juejin.im/post/5b052f806fb9a07ac0229ce3

}