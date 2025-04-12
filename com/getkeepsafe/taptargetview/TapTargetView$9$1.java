/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 */
package com.getkeepsafe.taptargetview;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$9;

class TapTargetView$9$1
implements Runnable {
    final /* synthetic */ TapTargetView$9 this$1;

    public TapTargetView$9$1(TapTargetView$9 var1_1) {
        this.this$1 = var1_1;
    }

    public void run() {
        int n3 = 2;
        Object object = new int[n3];
        TapTargetView$9 tapTargetView$9 = this.this$1;
        Rect rect = tapTargetView$9.this$0.targetBounds;
        tapTargetView$9 = tapTargetView$9.val$target.bounds();
        rect.set((Rect)tapTargetView$9);
        this.this$1.this$0.getLocationOnScreen((int[])object);
        tapTargetView$9 = this.this$1.this$0.targetBounds;
        int n4 = 0;
        rect = null;
        int n7 = -object[0];
        int n8 = 1;
        int n10 = -object[n8];
        tapTargetView$9.offset(n7, n10);
        object = this.this$1;
        tapTargetView$9 = object.val$boundingParent;
        if (tapTargetView$9 != null) {
            boolean bl2;
            object = (WindowManager)object.val$context.getSystemService("window");
            tapTargetView$9 = new DisplayMetrics();
            object.getDefaultDisplay().getMetrics((DisplayMetrics)tapTargetView$9);
            object = new Rect;
            object();
            this.this$1.val$boundingParent.getWindowVisibleDisplayFrame((Rect)object);
            Object object2 = new int[n3];
            this.this$1.val$boundingParent.getLocationInWindow(object2);
            TapTargetView$9 tapTargetView$92 = this.this$1;
            TapTarget tapTarget = tapTargetView$92.val$target;
            int n14 = tapTarget.drawBehindStatusBar;
            if (n14 != 0) {
                object.top = n14 = object2[n8];
            }
            if (bl2 = tapTarget.drawBehindNavigationBar) {
                n3 = object2[n8];
                tapTargetView$92 = tapTargetView$92.val$boundingParent;
                object.bottom = n7 = tapTargetView$92.getHeight() + n3;
            }
            object2 = this.this$1;
            n7 = (int)(object2.val$layoutNoLimits ? 1 : 0);
            if (n7 != 0) {
                object2 = (Object)object2.this$0;
                n7 = object.top;
                object2.topBoundary = n4 = Math.max(0, n7);
                object2 = (Object)this.this$1.this$0;
                n10 = object.bottom;
                int n15 = ((DisplayMetrics)tapTargetView$9).heightPixels;
                object2.bottomBoundary = n10 = Math.min(n10, n15);
            } else {
                int n16;
                object2 = (Object)object2.this$0;
                object2.topBoundary = n16 = object.top;
                object2.bottomBoundary = n10 = object.bottom;
            }
        }
        this.this$1.this$0.drawTintedTarget();
        this.this$1.this$0.requestFocus();
        this.this$1.this$0.calculateDimensions();
        TapTargetView.access$300(this.this$1.this$0);
    }
}

