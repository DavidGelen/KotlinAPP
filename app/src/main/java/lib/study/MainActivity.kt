package lib.study

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import lib.study.extension.TAG
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var result: String
    fun isInitial() = ::result.isInitialized

    private var authorUrl: String? = null

    //定义基本数据类型的延迟,等价于lateinit
    var count: Int by Delegates.notNull<Int>()
    var name: String by Delegates.notNull<String>()

    private var testurl: String = " "

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
            showText.text = "isNullOrBlank 成立"
        } else {
            showText.text = "isNullOrBlank 不成立"
        }

        MainActivity.TAG()

    }
}
