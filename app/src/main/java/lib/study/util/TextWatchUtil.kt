package lib.study.util

import android.text.Editable
import android.text.TextWatcher

/**
 * @name KotlinAPP
 * @package name：lib.study.util
 * @anthor DavidZhang
 * @time 2019/1/2 16:32
 * @class 使用命名的可选参数轻松替换为更简洁的工厂方法
 */

fun makeTextWatcher(
        afterTextChanged: ((s: Editable?) -> Unit)? = null,
        beforeTextChanged: ((s: CharSequence?, start: Int, count: Int, after: Int) -> Unit)? = null,
        onTextChanged: ((s: CharSequence?, start: Int, before: Int, count: Int) -> Unit)? = null
) = object : TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        afterTextChanged?.invoke(s)
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        beforeTextChanged?.invoke(s, start, count, after)
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        onTextChanged?.invoke(s, start, before, count)
    }
}

// Usage
/*taskNameView.addTextChangedListener(makeTextWatcher(
afterTextChanged = { s ->
    // ..
},
beforeTextChanged = { s, start, count, after ->
    // ...
}
))*/

