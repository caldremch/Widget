package com.caldremch.samplewidget

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.HorizontalScrollView

/**
 *
 *
 * @author Caldremch
 *
 * @date 2020/1/31
 *
 *
 **/
class SlidingMenu @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : HorizontalScrollView(context, attrs, defStyleAttr) {


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d("TAG", "onMeasure: $childCount")
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}