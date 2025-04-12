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
import com.google.android.material.motion.MaterialBottomContainerBackHelper;

class MaterialBottomContainerBackHelper$1
extends AnimatorListenerAdapter {
    final /* synthetic */ MaterialBottomContainerBackHelper this$0;

    public MaterialBottomContainerBackHelper$1(MaterialBottomContainerBackHelper materialBottomContainerBackHelper) {
        this.this$0 = materialBottomContainerBackHelper;
    }

    public void onAnimationEnd(Animator animator2) {
        this.this$0.view.setTranslationY(0.0f);
        this.this$0.updateBackProgress(0.0f);
    }
}

