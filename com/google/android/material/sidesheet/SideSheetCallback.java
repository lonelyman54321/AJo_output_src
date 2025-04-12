/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.sidesheet;

import android.view.View;
import com.google.android.material.sidesheet.SheetCallback;

public abstract class SideSheetCallback
implements SheetCallback {
    public void onLayout(View view) {
    }

    public abstract void onSlide(View var1, float var2);

    public abstract void onStateChanged(View var1, int var2);
}

