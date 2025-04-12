/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.ClearTextEndIconDelegate;

class ClearTextEndIconDelegate$1
extends AnimatorListenerAdapter {
    final /* synthetic */ ClearTextEndIconDelegate this$0;

    public ClearTextEndIconDelegate$1(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.this$0 = clearTextEndIconDelegate;
    }

    public void onAnimationStart(Animator animator2) {
        this.this$0.endLayout.setEndIconVisible(true);
    }
}

