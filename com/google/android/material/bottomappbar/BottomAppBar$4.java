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

class BottomAppBar$4
extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar this$0;

    public BottomAppBar$4(BottomAppBar bottomAppBar) {
        this.this$0 = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator2) {
        BottomAppBar.access$1700(this.this$0);
        BottomAppBar.access$1802(this.this$0, null);
    }

    public void onAnimationStart(Animator animator2) {
        BottomAppBar.access$1600(this.this$0);
    }
}

