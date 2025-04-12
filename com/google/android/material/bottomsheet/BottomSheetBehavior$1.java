/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

class BottomSheetBehavior$1
implements Runnable {
    final /* synthetic */ BottomSheetBehavior this$0;
    final /* synthetic */ View val$child;
    final /* synthetic */ int val$finalState;

    public BottomSheetBehavior$1(BottomSheetBehavior bottomSheetBehavior, View view, int n3) {
        this.this$0 = bottomSheetBehavior;
        this.val$child = view;
        this.val$finalState = n3;
    }

    public void run() {
        BottomSheetBehavior bottomSheetBehavior = this.this$0;
        View view = this.val$child;
        int n3 = this.val$finalState;
        BottomSheetBehavior.access$100(bottomSheetBehavior, view, n3, false);
    }
}

