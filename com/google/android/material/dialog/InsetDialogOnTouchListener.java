/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 */
package com.google.android.material.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class InsetDialogOnTouchListener
implements View.OnTouchListener {
    private final Dialog dialog;
    private final int leftInset;
    private final int prePieSlop;
    private final int topInset;

    public InsetDialogOnTouchListener(Dialog dialog, Rect rect) {
        int n3;
        int n4;
        int n7;
        this.dialog = dialog;
        this.leftInset = n7 = rect.left;
        this.topInset = n4 = rect.top;
        this.prePieSlop = n3 = ViewConfiguration.get((Context)dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f5;
        View view2 = view.findViewById(0x1020002);
        int n3 = this.leftInset;
        int n4 = view2.getLeft() + n3;
        n3 = view2.getWidth() + n4;
        int n7 = this.topInset;
        int n8 = view2.getTop() + n7;
        int n10 = view2.getHeight() + n8;
        float f6 = n4;
        float f7 = n8;
        float f8 = n3;
        float f11 = n10;
        RectF rectF = new RectF(f6, f7, f8, f11);
        f11 = motionEvent.getX();
        f8 = motionEvent.getY();
        n10 = (int)(rectF.contains(f11, f8) ? 1 : 0);
        n3 = 0;
        f8 = 0.0f;
        if (n10 != 0) {
            return false;
        }
        view2 = MotionEvent.obtain((MotionEvent)motionEvent);
        int n14 = motionEvent.getAction();
        n4 = 1;
        f6 = Float.MIN_VALUE;
        if (n14 == n4) {
            n14 = 4;
            f5 = 5.6E-45f;
            view2.setAction(n14);
        }
        if ((n14 = Build.VERSION.SDK_INT) < (n7 = 28)) {
            view2.setAction(0);
            n14 = this.prePieSlop;
            n3 = -n14 - n4;
            f8 = n3;
            n14 = -n14 - n4;
            f5 = n14;
            view2.setLocation(f8, f5);
        }
        view.performClick();
        return this.dialog.onTouchEvent((MotionEvent)view2);
    }
}

