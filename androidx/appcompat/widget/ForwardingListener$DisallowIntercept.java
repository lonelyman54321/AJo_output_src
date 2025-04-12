/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewParent
 */
package androidx.appcompat.widget;

import android.view.ViewParent;
import androidx.appcompat.widget.ForwardingListener;

class ForwardingListener$DisallowIntercept
implements Runnable {
    public final /* synthetic */ ForwardingListener a;

    public ForwardingListener$DisallowIntercept(ForwardingListener forwardingListener) {
        this.a = forwardingListener;
    }

    public final void run() {
        ViewParent viewParent = this.a.d.getParent();
        if (viewParent != null) {
            boolean bl2 = true;
            viewParent.requestDisallowInterceptTouchEvent(bl2);
        }
    }
}

