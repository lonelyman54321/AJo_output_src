/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.ViewGroup
 */
package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarPresenter$SavedState;

public class NavigationBarPresenter
implements h {
    private int id;
    private d menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    public boolean collapseItemActionView(d d2, f f5) {
        return false;
    }

    public boolean expandItemActionView(d d2, f f5) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public int getId() {
        return this.id;
    }

    public i getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    public void initForMenu(Context context, d d2) {
        this.menu = d2;
        this.menuView.initialize(d2);
    }

    public void onCloseMenu(d d2, boolean bl2) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof NavigationBarPresenter$SavedState;
        if (bl2) {
            NavigationBarMenuView navigationBarMenuView = this.menuView;
            parcelable = (NavigationBarPresenter$SavedState)parcelable;
            int n3 = parcelable.selectedItemId;
            navigationBarMenuView.tryRestoreSelectedItemId(n3);
            navigationBarMenuView = this.menuView.getContext();
            parcelable = parcelable.badgeSavedStates;
            parcelable = BadgeUtils.createBadgeDrawablesFromSavedStates((Context)navigationBarMenuView, (ParcelableSparseArray)parcelable);
            navigationBarMenuView = this.menuView;
            navigationBarMenuView.restoreBadgeDrawables((SparseArray)parcelable);
        }
    }

    public Parcelable onSaveInstanceState() {
        ParcelableSparseArray parcelableSparseArray;
        int n3;
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.selectedItemId = n3 = this.menuView.getSelectedItemId();
        navigationBarPresenter$SavedState.badgeSavedStates = parcelableSparseArray = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return navigationBarPresenter$SavedState;
    }

    public boolean onSubMenuSelected(j j3) {
        return false;
    }

    public void setCallback(h$a h$a) {
    }

    public void setId(int n3) {
        this.id = n3;
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean bl2) {
        this.updateSuspended = bl2;
    }

    public void updateMenuView(boolean bl2) {
        boolean bl3 = this.updateSuspended;
        if (bl3) {
            return;
        }
        if (bl2) {
            NavigationBarMenuView navigationBarMenuView = this.menuView;
            navigationBarMenuView.buildMenuView();
        } else {
            NavigationBarMenuView navigationBarMenuView = this.menuView;
            navigationBarMenuView.updateMenuView();
        }
    }
}

