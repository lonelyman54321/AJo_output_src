/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.OverScroller
 */
package com.ril.ajio.plp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.ril.ajio.plp.PlpBottomSheetBehavior;
import com.ril.ajio.plp.PlpBottomSheetBehavior$a;
import com.ril.ajio.plp.PlpViewDragHelper;

class PlpBottomSheetBehavior$SettleRunnable
implements Runnable {
    public final View a;
    public final int b;
    public final /* synthetic */ PlpBottomSheetBehavior c;

    public PlpBottomSheetBehavior$SettleRunnable(PlpBottomSheetBehavior plpBottomSheetBehavior, View view, int n3) {
        this.c = plpBottomSheetBehavior;
        this.a = view;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        int n3;
        Object object = this.c;
        PlpViewDragHelper plpViewDragHelper = ((PlpBottomSheetBehavior)object).j;
        if (plpViewDragHelper != null) {
            int n4 = plpViewDragHelper.a;
            boolean bl2 = false;
            int n7 = 2;
            if (n4 == n7) {
                ViewGroup viewGroup;
                View view;
                OverScroller overScroller = plpViewDragHelper.p;
                boolean bl3 = overScroller.computeScrollOffset();
                int n8 = overScroller.getCurrX();
                int n10 = overScroller.getCurrY();
                View view2 = plpViewDragHelper.r;
                int n14 = view2.getLeft();
                n14 = n8 - n14;
                View view3 = plpViewDragHelper.r;
                int n15 = view3.getTop();
                n15 = n10 - n15;
                if (n14 != 0) {
                    view = plpViewDragHelper.r;
                    ViewCompat.l(n14, view);
                }
                if (n15 != 0) {
                    view = plpViewDragHelper.r;
                    ViewCompat.m(n15, view);
                }
                if (n14 != 0 || n15 != 0) {
                    view2 = (View)((PlpBottomSheetBehavior$a)plpViewDragHelper.q).a.o.get();
                }
                if (bl3 && n8 == (n14 = overScroller.getFinalX()) && n10 == (n8 = overScroller.getFinalY())) {
                    overScroller.abortAnimation();
                    bl3 = false;
                    viewGroup = null;
                }
                if (!bl3) {
                    Runnable runnable2 = plpViewDragHelper.u;
                    viewGroup = plpViewDragHelper.t;
                    viewGroup.post(runnable2);
                }
            }
            if ((n3 = plpViewDragHelper.a) == n7) {
                bl2 = true;
            }
            if (bl2) {
                object = ViewCompat.a;
                object = this.a;
                object.postOnAnimation((Runnable)this);
                return;
            }
        }
        n3 = this.b;
        ((PlpBottomSheetBehavior)object).c(n3);
    }
}

