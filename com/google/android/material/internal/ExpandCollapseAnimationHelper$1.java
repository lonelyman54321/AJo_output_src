/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;

class ExpandCollapseAnimationHelper$1
extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandCollapseAnimationHelper this$0;

    public ExpandCollapseAnimationHelper$1(ExpandCollapseAnimationHelper expandCollapseAnimationHelper) {
        this.this$0 = expandCollapseAnimationHelper;
    }

    public void onAnimationStart(Animator animator2) {
        ExpandCollapseAnimationHelper.access$000(this.this$0).setVisibility(0);
    }
}

