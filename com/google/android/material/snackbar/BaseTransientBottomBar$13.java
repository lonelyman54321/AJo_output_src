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

class BaseTransientBottomBar$13
extends AnimatorListenerAdapter {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$13(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator2) {
        this.this$0.onViewShown();
    }

    public void onAnimationStart(Animator object) {
        object = BaseTransientBottomBar.access$1600(this.this$0);
        int n3 = BaseTransientBottomBar.access$1400(this.this$0);
        int n4 = BaseTransientBottomBar.access$1500(this.this$0);
        n3 -= n4;
        n4 = BaseTransientBottomBar.access$1500(this.this$0);
        object.animateContentIn(n3, n4);
    }
}

