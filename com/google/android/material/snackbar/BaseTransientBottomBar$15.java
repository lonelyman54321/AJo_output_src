/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$15
extends AnimatorListenerAdapter {
    final /* synthetic */ BaseTransientBottomBar this$0;
    final /* synthetic */ int val$event;

    public BaseTransientBottomBar$15(BaseTransientBottomBar baseTransientBottomBar, int n3) {
        this.this$0 = baseTransientBottomBar;
        this.val$event = n3;
    }

    public void onAnimationEnd(Animator object) {
        object = this.this$0;
        int n3 = this.val$event;
        ((BaseTransientBottomBar)object).onViewHidden(n3);
    }

    public void onAnimationStart(Animator object) {
        object = BaseTransientBottomBar.access$1600(this.this$0);
        int n3 = BaseTransientBottomBar.access$1800(this.this$0);
        object.animateContentOut(0, n3);
    }
}

