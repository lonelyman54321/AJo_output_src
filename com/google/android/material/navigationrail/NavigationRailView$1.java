/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.navigationrail;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.android.material.navigationrail.NavigationRailView;

class NavigationRailView$1
implements ViewUtils$OnApplyWindowInsetsListener {
    final /* synthetic */ NavigationRailView this$0;

    public NavigationRailView$1(NavigationRailView navigationRailView) {
        this.this$0 = navigationRailView;
    }

    public f onApplyWindowInsets(View view, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int n3;
        ei1 ei12 = f5.a.f(7);
        NavigationRailView navigationRailView = this.this$0;
        Boolean bl2 = NavigationRailView.access$000(navigationRailView);
        int n4 = NavigationRailView.access$100(navigationRailView, bl2);
        if (n4 != 0) {
            n4 = viewUtils$RelativePadding.top;
            n3 = ei12.b;
            viewUtils$RelativePadding.top = n4 += n3;
        }
        if ((n4 = (int)(NavigationRailView.access$100(navigationRailView = this.this$0, bl2 = NavigationRailView.access$200(navigationRailView)) ? 1 : 0)) != 0) {
            n4 = viewUtils$RelativePadding.bottom;
            n3 = ei12.d;
            viewUtils$RelativePadding.bottom = n4 += n3;
        }
        if ((n4 = (int)(NavigationRailView.access$100(navigationRailView = this.this$0, bl2 = NavigationRailView.access$300(navigationRailView)) ? 1 : 0)) != 0) {
            n4 = viewUtils$RelativePadding.start;
            n3 = (int)(ViewUtils.isLayoutRtl(view) ? 1 : 0);
            int n7 = n3 != 0 ? ei12.c : ei12.a;
            viewUtils$RelativePadding.start = n4 += n7;
        }
        viewUtils$RelativePadding.applyToView(view);
        return f5;
    }
}

