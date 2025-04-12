/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$1;
import com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker$1;
import java.lang.ref.Reference;

class BottomSheetBehavior$StateSettlingTracker {
    private final Runnable continueSettlingRunnable;
    private boolean isContinueSettlingRunnablePosted;
    private int targetState;
    final /* synthetic */ BottomSheetBehavior this$0;

    private BottomSheetBehavior$StateSettlingTracker(BottomSheetBehavior object) {
        this.this$0 = object;
        this.continueSettlingRunnable = object = new BottomSheetBehavior$StateSettlingTracker$1(this);
    }

    public /* synthetic */ BottomSheetBehavior$StateSettlingTracker(BottomSheetBehavior bottomSheetBehavior, BottomSheetBehavior$1 bottomSheetBehavior$1) {
        this(bottomSheetBehavior);
    }

    public static /* synthetic */ boolean access$1702(BottomSheetBehavior$StateSettlingTracker bottomSheetBehavior$StateSettlingTracker, boolean bl2) {
        bottomSheetBehavior$StateSettlingTracker.isContinueSettlingRunnablePosted = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$1800(BottomSheetBehavior$StateSettlingTracker bottomSheetBehavior$StateSettlingTracker) {
        return bottomSheetBehavior$StateSettlingTracker.targetState;
    }

    public void continueSettlingToState(int n3) {
        Object object = this.this$0.viewRef;
        if (object != null && (object = ((Reference)object).get()) != null) {
            this.targetState = n3;
            n3 = (int)(this.isContinueSettlingRunnablePosted ? 1 : 0);
            if (n3 == 0) {
                View view = (View)this.this$0.viewRef.get();
                object = this.continueSettlingRunnable;
                view.postOnAnimation((Runnable)object);
                n3 = 1;
                this.isContinueSettlingRunnablePosted = n3;
            }
        }
    }
}

