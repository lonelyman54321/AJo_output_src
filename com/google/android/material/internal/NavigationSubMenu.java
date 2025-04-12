/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import com.google.android.material.internal.NavigationMenu;

public class NavigationSubMenu
extends j {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, f f5) {
        super(context, navigationMenu, f5);
    }

    public void onItemsChanged(boolean bl2) {
        super.onItemsChanged(bl2);
        ((d)this.getParentMenu()).onItemsChanged(bl2);
    }
}

