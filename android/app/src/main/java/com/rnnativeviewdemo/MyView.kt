package com.rnnativeviewdemo

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity.CENTER_VERTICAL
import android.widget.FrameLayout
import android.widget.TextView

class MyView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val textView: TextView = TextView(context).apply {
        text = "Native View"
        textAlignment = TEXT_ALIGNMENT_CENTER
        gravity = CENTER_VERTICAL
    }

    private var onPressEvent: (() -> Unit)? = null

    fun setOnPressEventListener(listener: (() -> Unit)?) {
        onPressEvent = listener
    }

    init {
        addView(textView, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
        setOnClickListener {
            onPressEvent?.invoke()
        }
    }
}
