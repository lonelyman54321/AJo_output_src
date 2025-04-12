/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.internal;

import android.view.View;

public class ViewUtils$RelativePadding {
    public int bottom;
    public int end;
    public int start;
    public int top;

    public ViewUtils$RelativePadding(int n3, int n4, int n7, int n8) {
        this.start = n3;
        this.top = n4;
        this.end = n7;
        this.bottom = n8;
    }

    public ViewUtils$RelativePadding(ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int n3;
        int n4;
        this.start = n4 = viewUtils$RelativePadding.start;
        this.top = n4 = viewUtils$RelativePadding.top;
        this.end = n4 = viewUtils$RelativePadding.end;
        this.bottom = n3 = viewUtils$RelativePadding.bottom;
    }

    public void applyToView(View view) {
        int n3 = this.start;
        int n4 = this.top;
        int n7 = this.end;
        int n8 = this.bottom;
        view.setPaddingRelative(n3, n4, n7, n8);
    }
}

