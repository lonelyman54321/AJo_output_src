/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment$1;

class BottomSheetDialogFragment$BottomSheetDismissCallback
extends BottomSheetBehavior$BottomSheetCallback {
    final /* synthetic */ BottomSheetDialogFragment this$0;

    private BottomSheetDialogFragment$BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.this$0 = bottomSheetDialogFragment;
    }

    public /* synthetic */ BottomSheetDialogFragment$BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment, BottomSheetDialogFragment$1 bottomSheetDialogFragment$1) {
        this(bottomSheetDialogFragment);
    }

    public void onSlide(View view, float f5) {
    }

    public void onStateChanged(View object, int n3) {
        int n4 = 5;
        if (n3 == n4) {
            object = this.this$0;
            BottomSheetDialogFragment.access$100((BottomSheetDialogFragment)object);
        }
    }
}

