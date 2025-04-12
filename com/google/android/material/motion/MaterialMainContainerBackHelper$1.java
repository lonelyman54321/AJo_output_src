/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.motion.MaterialMainContainerBackHelper;

class MaterialMainContainerBackHelper$1
extends AnimatorListenerAdapter {
    final /* synthetic */ MaterialMainContainerBackHelper this$0;
    final /* synthetic */ View val$collapsedView;

    public MaterialMainContainerBackHelper$1(MaterialMainContainerBackHelper materialMainContainerBackHelper, View view) {
        this.this$0 = materialMainContainerBackHelper;
        this.val$collapsedView = view;
    }

    public void onAnimationEnd(Animator animator2) {
        animator2 = this.val$collapsedView;
        if (animator2 != null) {
            animator2.setVisibility(0);
        }
    }
}

