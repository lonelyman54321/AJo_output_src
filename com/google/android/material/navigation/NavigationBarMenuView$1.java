/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarPresenter;

class NavigationBarMenuView$1
implements View.OnClickListener {
    final /* synthetic */ NavigationBarMenuView this$0;

    public NavigationBarMenuView$1(NavigationBarMenuView navigationBarMenuView) {
        this.this$0 = navigationBarMenuView;
    }

    public void onClick(View object) {
        NavigationBarPresenter navigationBarPresenter;
        object = ((NavigationBarItemView)object).getItemData();
        d d2 = NavigationBarMenuView.access$100(this.this$0);
        boolean bl2 = d2.performItemAction((MenuItem)object, navigationBarPresenter = NavigationBarMenuView.access$000(this.this$0), 0);
        if (!bl2) {
            bl2 = true;
            ((f)object).setChecked(bl2);
        }
    }
}

