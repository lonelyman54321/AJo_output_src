/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.a;
import com.google.android.material.R$id;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

class ClockFaceView$2
extends a {
    final /* synthetic */ ClockFaceView this$0;

    public ClockFaceView$2(ClockFaceView clockFaceView) {
        this.this$0 = clockFaceView;
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        int n3 = R$id.material_value_index;
        Integer n4 = (Integer)object.getTag(n3);
        int n7 = n4;
        if (n7 > 0) {
            n4 = ClockFaceView.access$200(this.this$0);
            int n8 = n7 + -1;
            n4 = (View)n4.get(n8);
            c2.u((View)n4);
        }
        boolean bl2 = object.isSelected();
        object = C2$f.a(0, 1, n7, 1, false, bl2);
        c2.n((C2$f)object);
        c2.a.setClickable(true);
        object = C2$a.g;
        c2.b((C2$a)object);
    }

    public boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        int n4 = 16;
        float f5 = 2.2E-44f;
        if (n3 == n4) {
            long l2 = SystemClock.uptimeMillis();
            Rect rect = ClockFaceView.access$300(this.this$0);
            view.getHitRect(rect);
            float f6 = ClockFaceView.access$300(this.this$0).centerX();
            f5 = ClockFaceView.access$300(this.this$0).centerY();
            ClockHandView clockHandView = ClockFaceView.access$000(this.this$0);
            MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)0, (float)f6, (float)f5, (int)0);
            clockHandView.onTouchEvent(motionEvent);
            clockHandView = ClockFaceView.access$000(this.this$0);
            view = MotionEvent.obtain((long)l2, (long)l2, (int)1, (float)f6, (float)f5, (int)0);
            clockHandView.onTouchEvent((MotionEvent)view);
            return true;
        }
        return super.performAccessibilityAction(view, n3, bundle);
    }
}

