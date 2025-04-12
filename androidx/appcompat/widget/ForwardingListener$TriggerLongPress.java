/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewParent
 */
package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.ForwardingListener;

class ForwardingListener$TriggerLongPress
implements Runnable {
    public final /* synthetic */ ForwardingListener a;

    public ForwardingListener$TriggerLongPress(ForwardingListener forwardingListener) {
        this.a = forwardingListener;
    }

    public final void run() {
        ForwardingListener forwardingListener = this.a;
        forwardingListener.a();
        View view = forwardingListener.d;
        boolean bl2 = view.isEnabled();
        if (bl2 && !(bl2 = view.isLongClickable()) && (bl2 = forwardingListener.c())) {
            ViewParent viewParent = view.getParent();
            boolean bl3 = true;
            viewParent.requestDisallowInterceptTouchEvent(bl3);
            long l2 = SystemClock.uptimeMillis();
            int n3 = 3;
            viewParent = MotionEvent.obtain((long)l2, (long)l2, (int)n3, (float)0.0f, (float)0.0f, (int)0);
            view.onTouchEvent((MotionEvent)viewParent);
            viewParent.recycle();
            forwardingListener.g = bl3;
        }
    }
}

