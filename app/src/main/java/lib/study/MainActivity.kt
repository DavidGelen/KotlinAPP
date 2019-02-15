package lib.study

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import lib.study.extension.TAG
import lib.study.util.NumPrint
import lib.study.util.kotlinDSL
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var result: String
    fun isInitial() = ::result.isInitialized

    private var authorUrl: String? = null

    //定义基本数据类型的延迟,等价于lateinit
    var count: Int by Delegates.notNull<Int>()
    var name: String by Delegates.notNull<String>()

    private var testurl: String = ""

    companion object {
        //private val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (isInitial()) {
            //do sth
        }

        //判空要这样判
        if (!authorUrl.isNullOrBlank()) {
        }

        /*if(testurl.isNullOrEmpty()) {
            //允许有空格
            showText.text = "isNullOrEmpty 成立"
        } else {
            showText.text = "isNullOrEmpty 不成立"
        }*/

        if (testurl.isNullOrBlank()) {
           // showText.text = "isNullOrBlank 成立"
        } else {
            showText.text = "isNullOrBlank 不成立"
        }

        //MainActivity.TAG()

        test4()
    }

    private fun test1() {
        // 调用高阶函数
        kotlinDSL {
            // 这个 lambda 的接收者类型为StringBuilder
            append(" DSL")
            println(this)
        }

    }

    private fun test2() {
        val datas = listOf(1,2,3,4).minus(2)
        //print(datas)
        showText.text = datas.toString() //1,3,4
    }

    private fun test3() {
        val oddNum: NumPrint = {
            if (it % 2 == 1) {
                showText.text = "$it"
            } else {
                showText.text = "is not a odd num"
            }
        }

        oddNum.invoke(100)
    }

    private fun test4() {
        val map = mapOf(Pair(1, "A"), Pair(2, "B"), Pair(3, "C"))
        for((key,value) in map) {
            if(2 == key) {
                showText.text = value
                break
            }
        }
    }
}
