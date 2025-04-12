/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.motion.MaterialSideContainerBackHelper;

class MaterialSideContainerBackHelper$1
extends AnimatorListenerAdapter {
    final /* synthetic */ MaterialSideContainerBackHelper this$0;
    final /* synthetic */ int val$gravity;
    final /* synthetic */ boolean val$leftSwipeEdge;

    public MaterialSideContainerBackHelper$1(MaterialSideContainerBackHelper materialSideContainerBackHelper, boolean bl2, int n3) {
        this.this$0 = materialSideContainerBackHelper;
        this.val$leftSwipeEdge = bl2;
        this.val$gravity = n3;
    }

    public void onAnimationEnd(Animator object) {
        this.this$0.view.setTranslationX(0.0f);
        object = this.this$0;
        boolean bl2 = this.val$leftSwipeEdge;
        int n3 = this.val$gravity;
        ((MaterialSideContainerBackHelper)object).updateBackProgress(0.0f, bl2, n3);
    }
}

