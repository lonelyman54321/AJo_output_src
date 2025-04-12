/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

class BottomSheetBehavior$6
implements E2 {
    final /* synthetic */ BottomSheetBehavior this$0;
    final /* synthetic */ int val$state;

    public BottomSheetBehavior$6(BottomSheetBehavior bottomSheetBehavior, int n3) {
        this.this$0 = bottomSheetBehavior;
        this.val$state = n3;
    }

    public boolean perform(View object, E2$a e2$a) {
        object = this.this$0;
        int n3 = this.val$state;
        ((BottomSheetBehavior)object).setState(n3);
        return true;
    }
}

