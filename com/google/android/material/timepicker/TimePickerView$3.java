/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.Checkable
 */
package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

class TimePickerView$3
implements View.OnTouchListener {
    final /* synthetic */ TimePickerView this$0;
    final /* synthetic */ GestureDetector val$gestureDetector;

    public TimePickerView$3(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.this$0 = timePickerView;
        this.val$gestureDetector = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl2 = (view = (Checkable)view).isChecked();
        if (bl2) {
            return this.val$gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }
}

