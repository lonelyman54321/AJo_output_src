/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;

class BottomSheetDialog$2
implements View.OnClickListener {
    final /* synthetic */ BottomSheetDialog this$0;

    public BottomSheetDialog$2(BottomSheetDialog bottomSheetDialog) {
        this.this$0 = bottomSheetDialog;
    }

    public void onClick(View object) {
        boolean bl2;
        object = this.this$0;
        boolean bl3 = ((BottomSheetDialog)object).cancelable;
        if (bl3 && (bl2 = object.isShowing()) && (bl2 = ((BottomSheetDialog)(object = this.this$0)).shouldWindowCloseOnTouchOutside())) {
            object = this.this$0;
            ((BottomSheetDialog)object).cancel();
        }
    }
}

