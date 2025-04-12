/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.sidesheet;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetCallback;
import com.google.android.material.sidesheet.SideSheetDialog;

class SideSheetDialog$1
extends SideSheetCallback {
    final /* synthetic */ SideSheetDialog this$0;

    public SideSheetDialog$1(SideSheetDialog sideSheetDialog) {
        this.this$0 = sideSheetDialog;
    }

    public void onSlide(View view, float f5) {
    }

    public void onStateChanged(View object, int n3) {
        int n4 = 5;
        if (n3 == n4) {
            object = this.this$0;
            ((SideSheetDialog)object).cancel();
        }
    }
}

