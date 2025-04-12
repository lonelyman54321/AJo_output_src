/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;

class TimePickerView$2
extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ TimePickerView this$0;

    public TimePickerView$2(TimePickerView timePickerView) {
        this.this$0 = timePickerView;
    }

    public boolean onDoubleTap(MotionEvent object) {
        object = TimePickerView.access$100(this.this$0);
        if (object != null) {
            object.onDoubleTap();
            return true;
        }
        return false;
    }
}

