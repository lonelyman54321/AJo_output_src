/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 */
package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import com.google.android.material.navigation.NavigationView;

class NavigationView$2
implements d$a {
    final /* synthetic */ NavigationView this$0;

    public NavigationView$2(NavigationView navigationView) {
        this.this$0 = navigationView;
    }

    public boolean onMenuItemSelected(d object, MenuItem menuItem) {
        boolean bl2;
        object = this.this$0.listener;
        if (object != null && (bl2 = object.onNavigationItemSelected(menuItem))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void onMenuModeChange(d d2) {
    }
}

