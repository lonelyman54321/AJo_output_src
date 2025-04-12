/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomappbar;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

class BottomAppBar$8
implements Runnable {
    final /* synthetic */ BottomAppBar this$0;
    final /* synthetic */ ActionMenuView val$actionMenuView;
    final /* synthetic */ int val$fabAlignmentMode;
    final /* synthetic */ boolean val$fabAttached;

    public BottomAppBar$8(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int n3, boolean bl2) {
        this.this$0 = bottomAppBar;
        this.val$actionMenuView = actionMenuView;
        this.val$fabAlignmentMode = n3;
        this.val$fabAttached = bl2;
    }

    public void run() {
        ActionMenuView actionMenuView = this.val$actionMenuView;
        BottomAppBar bottomAppBar = this.this$0;
        int n3 = this.val$fabAlignmentMode;
        boolean bl2 = this.val$fabAttached;
        float f5 = bottomAppBar.getActionMenuViewTranslationX(actionMenuView, n3, bl2);
        actionMenuView.setTranslationX(f5);
    }
}

