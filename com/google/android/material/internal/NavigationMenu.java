/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.SubMenu
 */
package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import com.google.android.material.internal.NavigationSubMenu;

public class NavigationMenu
extends d {
    public NavigationMenu(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int n3, int n4, int n7, CharSequence charSequence) {
        Object object = (f)this.addInternal(n3, n4, n7, charSequence);
        Context context = this.getContext();
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(context, this, (f)object);
        ((f)object).o = navigationSubMenu;
        object = ((f)object).e;
        navigationSubMenu.setHeaderTitle((CharSequence)object);
        return navigationSubMenu;
    }
}

