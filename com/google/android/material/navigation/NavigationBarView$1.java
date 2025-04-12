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
import com.google.android.material.navigation.NavigationBarView;

class NavigationBarView$1
implements d$a {
    final /* synthetic */ NavigationBarView this$0;

    public NavigationBarView$1(NavigationBarView navigationBarView) {
        this.this$0 = navigationBarView;
    }

    public boolean onMenuItemSelected(d object, MenuItem menuItem) {
        NavigationBarView navigationBarView;
        int n3;
        int n4;
        object = NavigationBarView.access$000(this.this$0);
        boolean bl2 = true;
        if (object != null && (n4 = menuItem.getItemId()) == (n3 = (navigationBarView = this.this$0).getSelectedItemId())) {
            NavigationBarView.access$000(this.this$0).onNavigationItemReselected(menuItem);
            return bl2;
        }
        object = NavigationBarView.access$100(this.this$0);
        if (object == null || (n4 = (int)((object = NavigationBarView.access$100(this.this$0)).onNavigationItemSelected(menuItem) ? 1 : 0)) != 0) {
            bl2 = false;
        }
        return bl2;
    }

    public void onMenuModeChange(d d2) {
    }
}

