/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.a;
import com.google.android.material.internal.NavigationMenuItemView;

class NavigationMenuItemView$1
extends a {
    final /* synthetic */ NavigationMenuItemView this$0;

    public NavigationMenuItemView$1(NavigationMenuItemView navigationMenuItemView) {
        this.this$0 = navigationMenuItemView;
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(view, c2);
        boolean bl2 = this.this$0.checkable;
        c2.a.setCheckable(bl2);
    }
}

