package lib.study

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import lib.study.util.formateFileSize

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

        if (authorUrl.isNullOrBlank()) {
        }

    }
}
