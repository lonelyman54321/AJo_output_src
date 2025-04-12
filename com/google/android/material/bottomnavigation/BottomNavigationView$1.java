/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;

class BottomNavigationView$1
implements ViewUtils$OnApplyWindowInsetsListener {
    final /* synthetic */ BottomNavigationView this$0;

    public BottomNavigationView$1(BottomNavigationView bottomNavigationView) {
        this.this$0 = bottomNavigationView;
    }

    public f onApplyWindowInsets(View view, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int n3;
        int n4 = viewUtils$RelativePadding.bottom;
        viewUtils$RelativePadding.bottom = n3 = f5.a() + n4;
        n4 = view.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        n4 = f5.b();
        int n7 = f5.c();
        int n8 = viewUtils$RelativePadding.start;
        int n10 = n3 != 0 ? n7 : n4;
        viewUtils$RelativePadding.start = n8 += n10;
        n8 = viewUtils$RelativePadding.end;
        if (n3 == 0) {
            n4 = n7;
        }
        viewUtils$RelativePadding.end = n8 += n4;
        viewUtils$RelativePadding.applyToView(view);
        return f5;
    }
}

