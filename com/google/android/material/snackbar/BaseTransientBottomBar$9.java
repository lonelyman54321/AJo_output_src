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

class BaseTransientBottomBar$9
extends AnimatorListenerAdapter {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$9(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator2) {
        this.this$0.onViewShown();
    }
}

