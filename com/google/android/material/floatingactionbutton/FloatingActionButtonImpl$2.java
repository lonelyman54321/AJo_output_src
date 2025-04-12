/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener;

class FloatingActionButtonImpl$2
extends AnimatorListenerAdapter {
    final /* synthetic */ FloatingActionButtonImpl this$0;
    final /* synthetic */ boolean val$fromUser;
    final /* synthetic */ FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener;

    public FloatingActionButtonImpl$2(FloatingActionButtonImpl floatingActionButtonImpl, boolean bl2, FloatingActionButtonImpl$InternalVisibilityChangedListener floatingActionButtonImpl$InternalVisibilityChangedListener) {
        this.this$0 = floatingActionButtonImpl;
        this.val$fromUser = bl2;
        this.val$listener = floatingActionButtonImpl$InternalVisibilityChangedListener;
    }

    public void onAnimationEnd(Animator object) {
        FloatingActionButtonImpl.access$002(this.this$0, 0);
        FloatingActionButtonImpl.access$102(this.this$0, null);
        object = this.val$listener;
        if (object != null) {
            object.onShown();
        }
    }

    public void onAnimationStart(Animator animator2) {
        FloatingActionButton floatingActionButton = this.this$0.view;
        boolean bl2 = this.val$fromUser;
        floatingActionButton.internalSetVisibility(0, bl2);
        FloatingActionButtonImpl.access$002(this.this$0, 2);
        FloatingActionButtonImpl.access$102(this.this$0, animator2);
    }
}

