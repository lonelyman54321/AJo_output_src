/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.widget.ScrollView
 */
package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;
import in.juspay.hypersdk.mystique.SwypeLayout;

public class SwypeScroll
extends ScrollView {
    private float lastX;
    private float lastY;
    private float xDistance;
    private float yDistance;

    public SwypeScroll(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        if (n3 != 0) {
            int n4 = 2;
            float f5 = 2.8E-45f;
            if (n3 == n4) {
                float f6 = motionEvent.getX();
                f5 = motionEvent.getY();
                float f7 = this.xDistance;
                float f8 = this.lastX;
                this.xDistance = f8 = Math.abs(f6 - f8) + f7;
                f7 = this.yDistance;
                f8 = this.lastY;
                this.yDistance = f8 = Math.abs(f5 - f8) + f7;
                this.lastX = f6;
                this.lastY = f5;
                f6 = this.xDistance;
                float f11 = f6 - f8;
                n3 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                if (n3 > 0) {
                    return false;
                }
                SwypeLayout swypeLayout = (SwypeLayout)((Object)SwypeLayout.partialSwypeWeakReference.get());
                SwypeLayout swypeLayout2 = (SwypeLayout)((Object)SwypeLayout.activeLayoutWeakReference.get());
                if (swypeLayout != null && swypeLayout != swypeLayout2) {
                    swypeLayout.reset();
                }
            }
        } else {
            float f12;
            n3 = 0;
            Object var8_10 = null;
            this.yDistance = 0.0f;
            this.xDistance = 0.0f;
            this.lastX = f12 = motionEvent.getX();
            this.lastY = f12 = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}

