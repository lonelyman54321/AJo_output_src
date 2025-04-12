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
import com.google.android.material.bottomappbar.BottomAppBar;

class BottomAppBar$1
extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar this$0;

    public BottomAppBar$1(BottomAppBar bottomAppBar) {
        this.this$0 = bottomAppBar;
    }

    public void onAnimationStart(Animator object) {
        object = this.this$0;
        boolean bl2 = BottomAppBar.access$000((BottomAppBar)object);
        if (!bl2) {
            object = this.this$0;
            int n3 = BottomAppBar.access$100((BottomAppBar)object);
            BottomAppBar bottomAppBar = this.this$0;
            boolean bl3 = BottomAppBar.access$200(bottomAppBar);
            BottomAppBar.access$300((BottomAppBar)object, n3, bl3);
        }
    }
}

