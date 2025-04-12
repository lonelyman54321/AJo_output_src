/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.a;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter;

class NavigationMenuPresenter$NavigationMenuAdapter$1
extends a {
    final /* synthetic */ NavigationMenuPresenter$NavigationMenuAdapter this$1;
    final /* synthetic */ boolean val$isHeader;
    final /* synthetic */ int val$position;

    public NavigationMenuPresenter$NavigationMenuAdapter$1(NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter, int n3, boolean bl2) {
        this.this$1 = navigationMenuPresenter$NavigationMenuAdapter;
        this.val$position = n3;
        this.val$isHeader = bl2;
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter = this.this$1;
        int n3 = this.val$position;
        int n4 = NavigationMenuPresenter$NavigationMenuAdapter.access$100(navigationMenuPresenter$NavigationMenuAdapter, n3);
        boolean bl2 = this.val$isHeader;
        boolean bl3 = object.isSelected();
        object = C2$f.a(n4, 1, 1, 1, bl2, bl3);
        c2.n((C2$f)object);
    }
}

