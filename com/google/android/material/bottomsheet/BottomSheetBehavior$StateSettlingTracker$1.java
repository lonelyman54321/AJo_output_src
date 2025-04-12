/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomsheet;

import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker;

class BottomSheetBehavior$StateSettlingTracker$1
implements Runnable {
    final /* synthetic */ BottomSheetBehavior$StateSettlingTracker this$1;

    public BottomSheetBehavior$StateSettlingTracker$1(BottomSheetBehavior$StateSettlingTracker stateSettlingTracker) {
        this.this$1 = stateSettlingTracker;
    }

    public void run() {
        int n3;
        Object object = this.this$1;
        int n4 = 0;
        BottomSheetBehavior bottomSheetBehavior = null;
        BottomSheetBehavior$StateSettlingTracker.access$1702((BottomSheetBehavior$StateSettlingTracker)object, false);
        object = this.this$1.this$0.viewDragHelper;
        if (object != null && (n3 = ((ViewDragHelper)object).h()) != 0) {
            object = this.this$1;
            n4 = BottomSheetBehavior$StateSettlingTracker.access$1800((BottomSheetBehavior$StateSettlingTracker)object);
            ((BottomSheetBehavior$StateSettlingTracker)object).continueSettlingToState(n4);
        } else {
            object = this.this$1;
            bottomSheetBehavior = ((BottomSheetBehavior$StateSettlingTracker)object).this$0;
            int n7 = bottomSheetBehavior.state;
            int n8 = 2;
            if (n7 == n8) {
                n3 = BottomSheetBehavior$StateSettlingTracker.access$1800((BottomSheetBehavior$StateSettlingTracker)object);
                bottomSheetBehavior.setStateInternal(n3);
            }
        }
    }
}

