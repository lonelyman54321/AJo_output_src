/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetDialog;

class BottomSheetDialog$5
extends BottomSheetBehavior$BottomSheetCallback {
    final /* synthetic */ BottomSheetDialog this$0;

    public BottomSheetDialog$5(BottomSheetDialog bottomSheetDialog) {
        this.this$0 = bottomSheetDialog;
    }

    public void onSlide(View view, float f5) {
    }

    public void onStateChanged(View object, int n3) {
        int n4 = 5;
        if (n3 == n4) {
            object = this.this$0;
            ((BottomSheetDialog)object).cancel();
        }
    }
}

