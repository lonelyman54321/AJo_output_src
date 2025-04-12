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

class ClearTextEndIconDelegate$2
extends AnimatorListenerAdapter {
    final /* synthetic */ ClearTextEndIconDelegate this$0;

    public ClearTextEndIconDelegate$2(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.this$0 = clearTextEndIconDelegate;
    }

    public void onAnimationEnd(Animator animator2) {
        this.this$0.endLayout.setEndIconVisible(false);
    }
}

