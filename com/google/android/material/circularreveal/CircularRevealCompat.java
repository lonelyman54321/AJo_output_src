/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewAnimationUtils
 */
package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.CircularRevealCompat$1;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.circularreveal.CircularRevealWidget$CircularRevealEvaluator;
import com.google.android.material.circularreveal.CircularRevealWidget$CircularRevealProperty;
import com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo;

public final class CircularRevealCompat {
    private CircularRevealCompat() {
    }

    public static Animator createCircularReveal(CircularRevealWidget object, float f5, float f6, float f7) {
        Property property = CircularRevealWidget$CircularRevealProperty.CIRCULAR_REVEAL;
        Object object2 = CircularRevealWidget$CircularRevealEvaluator.CIRCULAR_REVEAL;
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = new CircularRevealWidget$RevealInfo(f5, f6, f7);
        int n3 = 1;
        Object[] objectArray = new CircularRevealWidget$RevealInfo[n3];
        objectArray[0] = circularRevealWidget$RevealInfo;
        property = ObjectAnimator.ofObject((Object)object, (Property)property, (TypeEvaluator)object2, (Object[])objectArray);
        object2 = object.getRevealInfo();
        if (object2 != null) {
            float f8 = object2.radius;
            object = (View)object;
            int n4 = (int)f5;
            int n7 = (int)f6;
            object = ViewAnimationUtils.createCircularReveal((View)object, (int)n4, (int)n7, (float)f8, (float)f7);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArray = new Animator[2];
            animatorArray[0] = property;
            animatorArray[n3] = object;
            animatorSet.playTogether(animatorArray);
            return animatorSet;
        }
        object = new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        throw object;
    }

    public static Animator createCircularReveal(CircularRevealWidget circularRevealWidget, float f5, float f6, float f7, float f8) {
        Property property = CircularRevealWidget$CircularRevealProperty.CIRCULAR_REVEAL;
        TypeEvaluator typeEvaluator = CircularRevealWidget$CircularRevealEvaluator.CIRCULAR_REVEAL;
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = new CircularRevealWidget$RevealInfo(f5, f6, f7);
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo2 = new CircularRevealWidget$RevealInfo(f5, f6, f8);
        int n3 = 2;
        Object[] objectArray = new CircularRevealWidget$RevealInfo[n3];
        objectArray[0] = circularRevealWidget$RevealInfo;
        int n4 = 1;
        objectArray[n4] = circularRevealWidget$RevealInfo2;
        property = ObjectAnimator.ofObject((Object)circularRevealWidget, (Property)property, (TypeEvaluator)typeEvaluator, (Object[])objectArray);
        circularRevealWidget = (View)circularRevealWidget;
        int n7 = (int)f5;
        int n8 = (int)f6;
        circularRevealWidget = ViewAnimationUtils.createCircularReveal((View)circularRevealWidget, (int)n7, (int)n8, (float)f7, (float)f8);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = property;
        animatorArray[n4] = circularRevealWidget;
        animatorSet.playTogether(animatorArray);
        return animatorSet;
    }

    public static Animator.AnimatorListener createCircularRevealListener(CircularRevealWidget circularRevealWidget) {
        CircularRevealCompat$1 circularRevealCompat$1 = new CircularRevealCompat$1(circularRevealWidget);
        return circularRevealCompat$1;
    }
}

