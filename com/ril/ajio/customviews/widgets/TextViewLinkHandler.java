/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.method.LinkMovementMethod
 *  android.text.style.URLSpan
 *  android.view.MotionEvent
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

public abstract class TextViewLinkHandler
extends LinkMovementMethod {
    public abstract void onLinkClick(String var1);

    public boolean onTouchEvent(TextView object, Spannable spannable, MotionEvent object2) {
        float f5;
        int n3;
        int n4 = object2.getAction();
        if (n4 != (n3 = 1)) {
            return super.onTouchEvent((TextView)object, spannable, object2);
        }
        n4 = (int)object2.getX();
        float f6 = object2.getY();
        int n7 = (int)f6;
        int n8 = object.getTotalPaddingLeft();
        n4 -= n8;
        n8 = object.getTotalPaddingTop();
        n7 -= n8;
        n8 = object.getScrollX() + n4;
        n4 = object.getScrollY() + n7;
        object = object.getLayout();
        n7 = object.getLineForVertical(n4);
        int n10 = object.getOffsetForHorizontal(n7, f5 = (float)n8);
        int n14 = ((URLSpan[])(object = (URLSpan[])spannable.getSpans(n10, n10, (Class)(object2 = URLSpan.class)))).length;
        if (n14 != 0) {
            n14 = 0;
            spannable = null;
            object = object[0].getURL();
            this.onLinkClick((String)object);
        }
        return n3 != 0;
    }
}

