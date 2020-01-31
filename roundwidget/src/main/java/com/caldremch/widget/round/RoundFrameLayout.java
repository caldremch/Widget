package com.caldremch.widget.round;

import android.content.Context;
import android.support.annotation.Nullable;
import androidx.constraintlayout.ConstraintLayout;
import android.util.AttributeSet;

/**
 * @author Caldremch
 * @date 2019-07-06 19:34
 * @email caldremch@163.com
 * @describe
 **/
public class RoundFrameLayout extends ConstraintLayout {
    public RoundFrameLayout(Context context) {
        this(context, null);
    }
    public RoundFrameLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public RoundFrameLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        new RoundWidgetDelegate(this, context, attrs);
    }
}
