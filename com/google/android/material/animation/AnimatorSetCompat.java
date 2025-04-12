/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.ValueAnimator
 */
package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.Collection;
import java.util.List;

public class AnimatorSetCompat {
    public static void playTogether(AnimatorSet animatorSet, List list) {
        int n3 = list.size();
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            Animator animator2 = (Animator)list.get(i3);
            long l3 = animator2.getStartDelay();
            long l4 = animator2.getDuration() + l3;
            l2 = Math.max(l2, l4);
        }
        ValueAnimator valueAnimator = ValueAnimator.ofInt((int[])new int[]{0, 0});
        valueAnimator.setDuration(l2);
        list.add(0, valueAnimator);
        animatorSet.playTogether((Collection)list);
    }
}

