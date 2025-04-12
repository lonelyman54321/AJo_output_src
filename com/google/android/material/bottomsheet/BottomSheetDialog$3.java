/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.a;
import com.google.android.material.bottomsheet.BottomSheetDialog;

class BottomSheetDialog$3
extends a {
    final /* synthetic */ BottomSheetDialog this$0;

    public BottomSheetDialog$3(BottomSheetDialog bottomSheetDialog) {
        this.this$0 = bottomSheetDialog;
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = this.this$0;
        int n3 = object.cancelable;
        if (n3 != 0) {
            n3 = 0x100000;
            c2.a(n3);
            object = c2.a;
            boolean bl2 = true;
            object.setDismissable(bl2);
        } else {
            object = c2.a;
            boolean bl3 = false;
            c2 = null;
            object.setDismissable(false);
        }
    }

    public boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        int n4 = 0x100000;
        if (n3 == n4) {
            BottomSheetDialog bottomSheetDialog = this.this$0;
            boolean bl2 = bottomSheetDialog.cancelable;
            if (bl2) {
                bottomSheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, n3, bundle);
    }
}

