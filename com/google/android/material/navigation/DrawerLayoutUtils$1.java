/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

class DrawerLayoutUtils$1
extends AnimatorListenerAdapter {
    final /* synthetic */ DrawerLayout val$drawerLayout;
    final /* synthetic */ View val$drawerView;

    public DrawerLayoutUtils$1(DrawerLayout drawerLayout, View view) {
        this.val$drawerLayout = drawerLayout;
        this.val$drawerView = view;
    }

    public void onAnimationEnd(Animator object) {
        object = this.val$drawerLayout;
        View view = this.val$drawerView;
        ((DrawerLayout)((Object)object)).closeDrawer(view, false);
        this.val$drawerLayout.setScrimColor(-1728053248);
    }
}

