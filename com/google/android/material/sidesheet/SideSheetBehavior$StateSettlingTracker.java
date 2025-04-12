/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.sidesheet;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.b;

class SideSheetBehavior$StateSettlingTracker {
    private final Runnable continueSettlingRunnable;
    private boolean isContinueSettlingRunnablePosted;
    private int targetState;
    final /* synthetic */ SideSheetBehavior this$0;

    public SideSheetBehavior$StateSettlingTracker(SideSheetBehavior object) {
        this.this$0 = object;
        this.continueSettlingRunnable = object = new b(this);
    }

    public static /* synthetic */ void a(SideSheetBehavior$StateSettlingTracker sideSheetBehavior$StateSettlingTracker) {
        sideSheetBehavior$StateSettlingTracker.lambda$new$0();
    }

    private /* synthetic */ void lambda$new$0() {
        int n3 = 0;
        this.isContinueSettlingRunnablePosted = false;
        Object object = SideSheetBehavior.access$800(this.this$0);
        if (object != null && (n3 = (int)(((ViewDragHelper)(object = SideSheetBehavior.access$800(this.this$0))).h() ? 1 : 0)) != 0) {
            n3 = this.targetState;
            this.continueSettlingToState(n3);
        } else {
            int n4;
            object = this.this$0;
            n3 = SideSheetBehavior.access$000((SideSheetBehavior)object);
            if (n3 == (n4 = 2)) {
                object = this.this$0;
                n4 = this.targetState;
                ((SideSheetBehavior)object).setStateInternal(n4);
            }
        }
    }

    public void continueSettlingToState(int n3) {
        Object object = SideSheetBehavior.access$100(this.this$0);
        if (object != null && (object = SideSheetBehavior.access$100(this.this$0).get()) != null) {
            this.targetState = n3;
            n3 = (int)(this.isContinueSettlingRunnablePosted ? 1 : 0);
            if (n3 == 0) {
                View view = (View)SideSheetBehavior.access$100(this.this$0).get();
                object = this.continueSettlingRunnable;
                view.postOnAnimation((Runnable)object);
                n3 = 1;
                this.isContinueSettlingRunnablePosted = n3;
            }
        }
    }
}

