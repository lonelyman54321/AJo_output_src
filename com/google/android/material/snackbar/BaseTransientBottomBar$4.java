/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.a;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$4
extends a {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$4(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(view, c2);
        c2.a(0x100000);
        c2.a.setDismissable(true);
    }

    public boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        int n4 = 0x100000;
        if (n3 == n4) {
            this.this$0.dismiss();
            return true;
        }
        return super.performAccessibilityAction(view, n3, bundle);
    }
}

