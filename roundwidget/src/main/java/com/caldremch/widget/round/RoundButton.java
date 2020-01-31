package com.caldremch.widget.round;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * @author Caldremch
 * @date 2019-07-07 00:44
 * @email caldremch@163.com
 * @describe
 **/
public class RoundButton extends AppCompatButton {
    public RoundButton(Context context) {
        this(context, null);
    }
    public RoundButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public RoundButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        new RoundWidgetDelegate(this, context, attrs);
    }
}
