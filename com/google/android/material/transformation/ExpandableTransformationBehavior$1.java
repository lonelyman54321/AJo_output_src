/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

class ExpandableTransformationBehavior$1
extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandableTransformationBehavior this$0;

    public ExpandableTransformationBehavior$1(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.this$0 = expandableTransformationBehavior;
    }

    public void onAnimationEnd(Animator animator2) {
        ExpandableTransformationBehavior.access$002(this.this$0, null);
    }
}

