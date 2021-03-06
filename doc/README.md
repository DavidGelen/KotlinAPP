### lambda表达式类型

- () -> Unit //表示无参数无返回值的Lambda表达式类型

- (T) -> Unit //表示接收一个T类型参数，无返回值的Lambda表达式类型

- (T) -> R //表示接收一个T类型参数，返回一个R类型值的Lambda表达式类型

- (T, P) -> R //表示接收一个T类型和P类型的参数，返回一个R类型值的Lambda表达式类型

- (T, (P,Q) -> S) -> R
//表示接收一个T类型参数和一个接收P、Q类型两个参数并返回一个S类型的值的Lambda表达式类型参数，
返回一个R类型值的Lambda表达式类型

---

**lambda表达式可以作为一个参数传入到另一个函数中，这个也称为高阶函数。
在使用高阶函数的时候我们需要注意尽量把我们的高阶函数声明成inline内联函数。**

**在使用高阶函数时，尽量去使用inline函数，降低类生成和类的实例创建的开销。**

## 中缀调用

**中缀调用必须满足二个条件：**

- 函数的参数只有一个

- 函数的参与者必须是只有两个元素
    这两个元素可以是两个数，可以是两个对象，可以是集合等

**Java中的ArrayList类和HashSet类实际上Kotlin中的MutableList和MutableSet集合接口的实现类**

---

**协程是一个异步调用的框架，解决了之前线程间协作代码繁琐的问题。**

---

private var onClickListener: ((View) -> Unit)? = null
fun setOnClickListener(listener: (view: View) -> Unit) {
    onClickListener = listener
}

// later, to invoke
onClickListener?.invoke(this)

---

class Outer{

    class Inner{ // 静态成员类，等价于public final class Outer

    }

    inner class OtherInner{ // 非静态成员类

        fun action(){
            // 调用外部类实例
            this@Outer.toString()
        }
    }
}








