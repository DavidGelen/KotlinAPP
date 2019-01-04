package lib.study

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var result: String
        fun isInitial() = ::result.isInitialized

    private var authorUrl: String? = null

    companion object {
        private val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(isInitial()) {
            //do sth
        }

        //判空要这样判
        if (!authorUrl.isNullOrBlank()) {
        }

        val dialog = Dialog(this)

        dialog.run {

        }
    }
}
