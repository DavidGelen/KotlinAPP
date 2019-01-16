package lib.study.extension

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.annotation.StringRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * @name KotlinAPP
 * @class name：lib.study.extension
 * @class describe
 * @anthor David
 * @time 2019/1/16 上午11:36
 * @class describe
 */

inline val Context.displayWidth: Int
    get() = resources.displayMetrics.widthPixels

inline val Context.displayHeight: Int
    get() = resources.displayMetrics.heightPixels

inline val Context.inflater: LayoutInflater
    get() = LayoutInflater.from(this)

fun Context?.toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG) = this?.let { Toast.makeText(it, text, duration).show() }

fun Context?.toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG) = this?.let { Toast.makeText(it, textId, duration).show() }

fun Context.inflateLayout(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): View
        = LayoutInflater.from(this).inflate(layoutId, parent, attachToRoot)