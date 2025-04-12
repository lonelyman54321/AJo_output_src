/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.MotionEvent
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class AjioZoomViewPager
extends ViewPager {
    public AjioZoomViewPager(Context context) {
        super(context);
    }

    public AjioZoomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            yn3_0.a(illegalArgumentException);
            Log.getStackTraceString((Throwable)illegalArgumentException);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            yn3_0.a(illegalArgumentException);
            return false;
        }
    }
}

