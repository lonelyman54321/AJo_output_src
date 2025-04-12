/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

class BottomAppBar$7
extends AnimatorListenerAdapter {
    public boolean cancelled;
    final /* synthetic */ BottomAppBar this$0;
    final /* synthetic */ ActionMenuView val$actionMenuView;
    final /* synthetic */ boolean val$targetAttached;
    final /* synthetic */ int val$targetMode;

    public BottomAppBar$7(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int n3, boolean bl2) {
        this.this$0 = bottomAppBar;
        this.val$actionMenuView = actionMenuView;
        this.val$targetMode = n3;
        this.val$targetAttached = bl2;
    }

    public void onAnimationCancel(Animator animator2) {
        this.cancelled = true;
    }

    public void onAnimationEnd(Animator object) {
        int n3 = this.cancelled;
        if (!n3) {
            object = this.this$0;
            n3 = BottomAppBar.access$2100((BottomAppBar)object);
            if (n3) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            BottomAppBar bottomAppBar = this.this$0;
            int n4 = BottomAppBar.access$2100(bottomAppBar);
            bottomAppBar.replaceMenu(n4);
            bottomAppBar = this.this$0;
            ActionMenuView actionMenuView = this.val$actionMenuView;
            int n7 = this.val$targetMode;
            boolean bl2 = this.val$targetAttached;
            BottomAppBar.access$2200(bottomAppBar, actionMenuView, n7, bl2, n3 != 0);
        }
    }
}

