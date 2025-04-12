/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem;

class NavigationMenuPresenter$NavigationMenuSeparatorItem
implements NavigationMenuPresenter$NavigationMenuItem {
    private final int paddingBottom;
    private final int paddingTop;

    public NavigationMenuPresenter$NavigationMenuSeparatorItem(int n3, int n4) {
        this.paddingTop = n3;
        this.paddingBottom = n4;
    }

    public int getPaddingBottom() {
        return this.paddingBottom;
    }

    public int getPaddingTop() {
        return this.paddingTop;
    }
}

