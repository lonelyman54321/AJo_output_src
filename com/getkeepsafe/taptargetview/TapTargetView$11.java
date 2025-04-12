/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
package com.getkeepsafe.taptargetview;

import android.view.View;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;

class TapTargetView$11
implements View.OnLongClickListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$11(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public boolean onLongClick(View view) {
        view = this.this$0;
        TapTargetView$Listener tapTargetView$Listener = view.listener;
        if (tapTargetView$Listener == null) {
            return false;
        }
        tapTargetView$Listener = view.targetBounds;
        float f5 = view.lastTouchX;
        int n3 = (int)f5;
        float f6 = view.lastTouchY;
        int n4 = (int)f6;
        if ((n4 = (int)(tapTargetView$Listener.contains(n3, n4) ? 1 : 0)) != 0) {
            view = this.this$0;
            view.listener.onTargetLongClick((TapTargetView)view);
            return true;
        }
        return false;
    }
}

