/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$dimen;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialBackAnimationHelper;
import com.google.android.material.motion.MaterialBottomContainerBackHelper$1;

public class MaterialBottomContainerBackHelper
extends MaterialBackAnimationHelper {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(View view) {
        super(view);
        float f5;
        float f6;
        view = view.getResources();
        int n3 = R$dimen.m3_back_progress_bottom_container_max_scale_x_distance;
        this.maxScaleXDistance = f6 = view.getDimension(n3);
        n3 = R$dimen.m3_back_progress_bottom_container_max_scale_y_distance;
        this.maxScaleYDistance = f5 = view.getDimension(n3);
    }

    private Animator createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        Object object = this.view;
        Property property = View.SCALE_X;
        float f5 = 1.0f;
        int n3 = 1;
        Object object2 = new float[n3];
        object2[0] = f5;
        object = ObjectAnimator.ofFloat((Object)object, (Property)property, (float[])object2);
        property = this.view;
        object2 = View.SCALE_Y;
        Object object3 = new float[n3];
        object3[0] = f5;
        property = ObjectAnimator.ofFloat((Object)property, (Property)object2, (float[])object3);
        int n4 = 2;
        object2 = new Animator[n4];
        object2[0] = (float)object;
        object2[n3] = (float)property;
        animatorSet.playTogether((Animator[])object2);
        object = this.view;
        int n7 = object instanceof ViewGroup;
        if (n7 != 0) {
            object = (ViewGroup)object;
            property = null;
            for (n7 = 0; n7 < (n4 = object.getChildCount()); n7 += n3) {
                object2 = object.getChildAt(n7);
                object3 = View.SCALE_Y;
                float[] fArray = new float[n3];
                fArray[0] = f5;
                object2 = ObjectAnimator.ofFloat((Object)object2, (Property)object3, (float[])fArray);
                object3 = new Animator[n3];
                object3[0] = (float)object2;
                animatorSet.playTogether((Animator[])object3);
            }
        }
        object = new xi0_0();
        animatorSet.setInterpolator((TimeInterpolator)object);
        return animatorSet;
    }

    public void cancelBackProgress() {
        uu_0 uu_02 = super.onCancelBackProgress();
        if (uu_02 == null) {
            return;
        }
        uu_02 = this.createResetScaleAnimator();
        long l2 = this.cancelDuration;
        uu_02.setDuration(l2);
        uu_02.start();
    }

    public void finishBackProgressNotPersistent(uu_0 object, Animator.AnimatorListener animatorListener) {
        int n3 = this.view.getHeight();
        float f5 = n3;
        float f6 = this.view.getScaleY() * f5;
        View view = this.view;
        Property property = View.TRANSLATION_Y;
        int n4 = 1;
        float[] fArray = new float[n4];
        fArray[0] = f6;
        view = ObjectAnimator.ofFloat((Object)view, (Property)property, (float[])fArray);
        xi0_0 xi0_02 = new xi0_0();
        view.setInterpolator((TimeInterpolator)xi0_02);
        int n7 = this.hideDurationMax;
        int n8 = this.hideDurationMin;
        float f7 = object.c;
        int n10 = AnimationUtils.lerp(n7, n8, f7);
        long l2 = n10;
        view.setDuration(l2);
        object = new MaterialBottomContainerBackHelper$1(this);
        view.addListener((Animator.AnimatorListener)object);
        if (animatorListener != null) {
            view.addListener(animatorListener);
        }
        view.start();
    }

    public void finishBackProgressPersistent(uu_0 uu_02, Animator.AnimatorListener animatorListener) {
        Animator animator2 = this.createResetScaleAnimator();
        int n3 = this.hideDurationMax;
        int n4 = this.hideDurationMin;
        float f5 = uu_02.c;
        int n7 = AnimationUtils.lerp(n3, n4, f5);
        long l2 = n7;
        animator2.setDuration(l2);
        if (animatorListener != null) {
            animator2.addListener(animatorListener);
        }
        animator2.start();
    }

    public void startBackProgress(uu_0 uu_02) {
        super.onStartBackProgress(uu_02);
    }

    public void updateBackProgress(float f5) {
        float f6;
        f5 = this.interpolateProgress(f5);
        View view = this.view;
        int n3 = view.getWidth();
        float f7 = n3;
        View view2 = this.view;
        int n4 = view2.getHeight();
        float f8 = n4;
        float f11 = f7 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object > 0 && (object = (f6 = f8 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) > 0) {
            float f12 = this.maxScaleXDistance / f7;
            f7 = this.maxScaleYDistance / f8;
            f12 = AnimationUtils.lerp(0.0f, f12, f5);
            f5 = AnimationUtils.lerp(0.0f, f7, f5);
            n3 = 1065353216;
            f7 = 1.0f;
            f12 = f7 - f12;
            f5 = f7 - f5;
            this.view.setScaleX(f12);
            View view3 = this.view;
            view3.setPivotY(f8);
            this.view.setScaleY(f5);
            view2 = this.view;
            int n7 = view2 instanceof ViewGroup;
            if (n7 != 0) {
                int n8;
                view2 = (ViewGroup)view2;
                view3 = null;
                for (n7 = 0; n7 < (n8 = view2.getChildCount()); ++n7) {
                    View view4 = view2.getChildAt(n7);
                    float f14 = -view4.getTop();
                    view4.setPivotY(f14);
                    float f15 = f5 - 0.0f;
                    float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (f16 != false) {
                        f14 = f12 / f5;
                    } else {
                        f16 = 1065353216;
                        f14 = 1.0f;
                    }
                    view4.setScaleY(f14);
                }
            }
        }
    }

    public void updateBackProgress(uu_0 uu_02) {
        uu_0 uu_03 = super.onUpdateBackProgress(uu_02);
        if (uu_03 == null) {
            return;
        }
        float f5 = uu_02.c;
        this.updateBackProgress(f5);
    }
}

