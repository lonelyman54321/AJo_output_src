/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.getkeepsafe.taptargetview;

import android.view.View;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;

class TapTargetView$10
implements View.OnClickListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$10(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onClick(View view) {
        boolean bl2;
        view = this.this$0;
        Object object = view.listener;
        if (object != null && (object = (Object)view.outerCircleCenter) != null && (bl2 = TapTargetView.access$000((TapTargetView)view))) {
            view = this.this$0;
            object = view.targetBounds;
            int n3 = object.centerX();
            Object object2 = this.this$0.targetBounds;
            Object object3 = object2.centerY();
            TapTargetView tapTargetView = this.this$0;
            float f5 = tapTargetView.lastTouchX;
            int n4 = (int)f5;
            Object object4 = (int)tapTargetView.lastTouchY;
            double d2 = view.distance(n3, (int)object3, n4, (int)object4);
            view = this.this$0;
            float f6 = view.targetCircleRadius;
            double d5 = f6;
            int n7 = 1;
            Object object5 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
            if (object5 <= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            object2 = view.outerCircleCenter;
            object4 = object2[0];
            object3 = object2[n7];
            n4 = (int)view.lastTouchX;
            float f7 = view.lastTouchY;
            object5 = (int)f7;
            double d7 = view.distance((int)object4, (int)object3, n4, (int)object5);
            view = this.this$0;
            f5 = view.outerCircleRadius;
            double d9 = f5;
            n4 = (int)(d7 == d9 ? 0 : (d7 < d9 ? -1 : 1));
            if (n4 > 0) {
                n7 = 0;
            }
            if (n3 != 0) {
                TapTargetView.access$002((TapTargetView)view, false);
                view = this.this$0;
                object = view.listener;
                ((TapTargetView$Listener)object).onTargetClick((TapTargetView)view);
            } else if (n7 != 0) {
                object = view.listener;
                ((TapTargetView$Listener)object).onOuterCircleClick((TapTargetView)view);
            } else {
                n3 = (int)(view.cancelable ? 1 : 0);
                if (n3 != 0) {
                    TapTargetView.access$002((TapTargetView)view, false);
                    view = this.this$0;
                    object = view.listener;
                    ((TapTargetView$Listener)object).onTargetCancel((TapTargetView)view);
                }
            }
        }
    }
}

