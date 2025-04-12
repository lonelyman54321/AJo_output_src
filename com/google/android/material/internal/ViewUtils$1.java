/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;

class ViewUtils$1
implements ViewUtils$OnApplyWindowInsetsListener {
    final /* synthetic */ ViewUtils$OnApplyWindowInsetsListener val$listener;
    final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
    final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
    final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

    public ViewUtils$1(boolean bl2, boolean bl3, boolean bl4, ViewUtils$OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener) {
        this.val$paddingBottomSystemWindowInsets = bl2;
        this.val$paddingLeftSystemWindowInsets = bl3;
        this.val$paddingRightSystemWindowInsets = bl4;
        this.val$listener = viewUtils$OnApplyWindowInsetsListener;
    }

    public f onApplyWindowInsets(View view, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int n3;
        int n4 = this.val$paddingBottomSystemWindowInsets;
        if (n4 != 0) {
            n4 = viewUtils$RelativePadding.bottom;
            viewUtils$RelativePadding.bottom = n3 = f5.a() + n4;
        }
        n4 = (int)(ViewUtils.isLayoutRtl(view) ? 1 : 0);
        n3 = this.val$paddingLeftSystemWindowInsets;
        if (n3 != 0) {
            if (n4 != 0) {
                int n7;
                n3 = viewUtils$RelativePadding.end;
                viewUtils$RelativePadding.end = n7 = f5.b() + n3;
            } else {
                int n8;
                n3 = viewUtils$RelativePadding.start;
                viewUtils$RelativePadding.start = n8 = f5.b() + n3;
            }
        }
        if ((n3 = (int)(this.val$paddingRightSystemWindowInsets ? 1 : 0)) != 0) {
            if (n4 != 0) {
                n4 = viewUtils$RelativePadding.start;
                viewUtils$RelativePadding.start = n3 = f5.c() + n4;
            } else {
                n4 = viewUtils$RelativePadding.end;
                viewUtils$RelativePadding.end = n3 = f5.c() + n4;
            }
        }
        viewUtils$RelativePadding.applyToView(view);
        ViewUtils$OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener = this.val$listener;
        if (viewUtils$OnApplyWindowInsetsListener != null) {
            f5 = viewUtils$OnApplyWindowInsetsListener.onApplyWindowInsets(view, f5, viewUtils$RelativePadding);
        }
        return f5;
    }
}

