/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.SubMenu
 */
package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;

public final class NavigationBarMenu
extends d {
    private final int maxItemCount;
    private final Class viewClass;

    public NavigationBarMenu(Context context, Class clazz, int n3) {
        super(context);
        this.viewClass = clazz;
        this.maxItemCount = n3;
    }

    public MenuItem addInternal(int n3, int n4, int n7, CharSequence charSequence) {
        int n8 = this.size();
        int n10 = 1;
        int n14 = this.maxItemCount;
        if ((n8 += n10) <= n14) {
            this.stopDispatchingItemsChanged();
            MenuItem menuItem = super.addInternal(n3, n4, n7, charSequence);
            n4 = menuItem instanceof f;
            if (n4 != 0) {
                MenuItem menuItem2 = menuItem;
                menuItem2 = (f)menuItem;
                menuItem2.g(n10 != 0);
            }
            this.startDispatchingItemsChanged();
            return menuItem;
        }
        String string2 = this.viewClass.getSimpleName();
        StringBuilder stringBuilder = Gn.a("Maximum number of items supported by ", string2, " is ");
        int n15 = this.maxItemCount;
        stringBuilder.append(n15);
        stringBuilder.append(". Limit can be checked with ");
        stringBuilder.append(string2);
        stringBuilder.append("#getMaxItemCount()");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public SubMenu addSubMenu(int n3, int n4, int n7, CharSequence charSequence) {
        String string2 = this.viewClass.getSimpleName().concat(" does not support submenus");
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}

