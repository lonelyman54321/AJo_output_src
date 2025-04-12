/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.internal;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter;

class NavigationMenuPresenter$1
implements View.OnClickListener {
    final /* synthetic */ NavigationMenuPresenter this$0;

    public NavigationMenuPresenter$1(NavigationMenuPresenter navigationMenuPresenter) {
        this.this$0 = navigationMenuPresenter;
    }

    public void onClick(View object) {
        boolean bl2;
        object = (NavigationMenuItemView)object;
        Object object2 = this.this$0;
        boolean bl3 = true;
        ((NavigationMenuPresenter)object2).setUpdateSuspended(bl3);
        object = ((NavigationMenuItemView)object).getItemData();
        object2 = this.this$0;
        d d2 = ((NavigationMenuPresenter)object2).menu;
        boolean bl4 = d2.performItemAction((MenuItem)object, (h)object2, 0);
        if (object != null && (bl2 = ((f)object).isCheckable()) && bl4) {
            object2 = this.this$0.adapter;
            ((NavigationMenuPresenter$NavigationMenuAdapter)object2).setCheckedItem((f)object);
        } else {
            bl3 = false;
        }
        object = this.this$0;
        ((NavigationMenuPresenter)object).setUpdateSuspended(false);
        if (bl3) {
            object = this.this$0;
            ((NavigationMenuPresenter)object).updateMenuView(false);
        }
    }
}

