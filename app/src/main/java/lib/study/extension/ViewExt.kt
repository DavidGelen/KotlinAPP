package lib.study.extension

import android.content.Context
import android.view.View

/**
 * @name KotlinAPP
 * @class name：lib.study.extension
 * @class describe
 * @anthor David
 * @time 2019/1/16 上午11:12
 * @class describe
 */

fun View.updatePadding(paddingStart: Int = getPaddingStart(),
                       paddingTop: Int = getPaddingTop(),
                       paddingEnd: Int = getPaddingEnd(),
                       paddingBottom: Int = getPaddingBottom()) {
    setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom)
}

fun View.setHeight(value: Int) {
    val lp = layoutParams
    lp?.let {
        lp.height = value
        layoutParams = lp
    }
}

fun View.resize(width: Int, height: Int) {
    val lp = layoutParams
    lp?.let {
        lp.width = width
        lp.height = height
        layoutParams = lp
    }
}

fun <T : View> T.click(block: (T) -> Unit) = setOnClickListener { block(it as T) }

fun<T : View> T.onLongClick(block: (T) -> Boolean) = setOnLongClickListener { block(it as T)}

fun View.show(): View {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
    return this
}

inline fun View.showIf(block: () -> Boolean) : View {
    if (visibility != View.VISIBLE && block()) {
        visibility = View.VISIBLE
    }
    return this
}

/*@JvmOverloads
inline fun View.snack(message: String, @Duration length: Int = Snackbar.LENGTH_LONG, f: Snackbar.() -> Unit) {
    val snack = Snackbar.make(this, message, length)
    snack.f()
    snack.show()
}

fun View.snack(@StringRes messageRes: Int, length: Int = Snackbar.LENGTH_LONG) = snack(messageRes, length) {}*/












