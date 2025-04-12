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
import com.google.android.material.internal.VisibilityAwareImageButton;

class FloatingActionButtonImpl$1
extends AnimatorListenerAdapter {
    private boolean cancelled;
    final /* synthetic */ FloatingActionButtonImpl this$0;
    final /* synthetic */ boolean val$fromUser;
    final /* synthetic */ FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener;

    public FloatingActionButtonImpl$1(FloatingActionButtonImpl floatingActionButtonImpl, boolean bl2, FloatingActionButtonImpl$InternalVisibilityChangedListener internalVisibilityChangedListener) {
        this.this$0 = floatingActionButtonImpl;
        this.val$fromUser = bl2;
        this.val$listener = internalVisibilityChangedListener;
    }

    public void onAnimationCancel(Animator animator2) {
        this.cancelled = true;
    }

    public void onAnimationEnd(Animator object) {
        FloatingActionButtonImpl.access$002(this.this$0, 0);
        object = this.this$0;
        boolean bl2 = false;
        FloatingActionButtonImpl.access$102((FloatingActionButtonImpl)object, null);
        boolean bl3 = this.cancelled;
        if (!bl3) {
            object = this.this$0.view;
            bl2 = this.val$fromUser;
            int n3 = bl2 ? 8 : 4;
            ((VisibilityAwareImageButton)((Object)object)).internalSetVisibility(n3, bl2);
            object = this.val$listener;
            if (object != null) {
                object.onHidden();
            }
        }
    }

    public void onAnimationStart(Animator animator2) {
        FloatingActionButton floatingActionButton = this.this$0.view;
        boolean bl2 = this.val$fromUser;
        floatingActionButton.internalSetVisibility(0, bl2);
        FloatingActionButtonImpl.access$002(this.this$0, 1);
        FloatingActionButtonImpl.access$102(this.this$0, animator2);
        this.cancelled = false;
    }
}

