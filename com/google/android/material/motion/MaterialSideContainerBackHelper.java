/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.util.Property
 *  android.view.Gravity
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$dimen;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialBackAnimationHelper;
import com.google.android.material.motion.MaterialSideContainerBackHelper$1;

public class MaterialSideContainerBackHelper
extends MaterialBackAnimationHelper {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        float f5;
        float f6;
        view = view.getResources();
        int n3 = R$dimen.m3_back_progress_side_container_max_scale_x_distance_shrink;
        this.maxScaleXDistanceShrink = f6 = view.getDimension(n3);
        n3 = R$dimen.m3_back_progress_side_container_max_scale_x_distance_grow;
        this.maxScaleXDistanceGrow = f6 = view.getDimension(n3);
        n3 = R$dimen.m3_back_progress_side_container_max_scale_y_distance;
        this.maxScaleYDistance = f5 = view.getDimension(n3);
    }

    private boolean checkAbsoluteGravity(int n3, int n4) {
        View view = this.view;
        int n7 = view.getLayoutDirection();
        n3 = (n3 = Gravity.getAbsoluteGravity((int)n3, (int)n7) & n4) == n4 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int getEdgeMargin(boolean bl2) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        boolean bl3 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bl3) {
            void var1_4;
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            if (bl2) {
                int n3 = layoutParams.leftMargin;
            } else {
                int n4 = layoutParams.rightMargin;
            }
            return (int)var1_4;
        }
        return 0;
    }

    public void cancelBackProgress() {
        int n3 = 1;
        uu_0 uu_02 = super.onCancelBackProgress();
        if (uu_02 == null) {
            return;
        }
        uu_02 = new AnimatorSet();
        View view = this.view;
        Property property = View.SCALE_X;
        float f5 = 1.0f;
        Object object = new float[n3];
        object[0] = f5;
        view = ObjectAnimator.ofFloat((Object)view, (Property)property, (float[])object);
        property = this.view;
        object = View.SCALE_Y;
        Object object2 = new float[n3];
        object2[0] = f5;
        property = ObjectAnimator.ofFloat((Object)property, (Property)object, (float[])object2);
        int n4 = 2;
        object = new Animator[n4];
        object[0] = (float)view;
        object[n3] = (float)property;
        uu_02.playTogether((Animator[])object);
        view = this.view;
        int n7 = view instanceof ViewGroup;
        if (n7 != 0) {
            view = (ViewGroup)view;
            property = null;
            for (n7 = 0; n7 < (n4 = view.getChildCount()); n7 += n3) {
                object = view.getChildAt(n7);
                object2 = View.SCALE_Y;
                float[] fArray = new float[n3];
                fArray[0] = f5;
                object = ObjectAnimator.ofFloat((Object)object, (Property)object2, (float[])fArray);
                object2 = new Animator[n3];
                object2[0] = (float)object;
                uu_02.playTogether((Animator[])object2);
            }
        }
        long l2 = this.cancelDuration;
        uu_02.setDuration(l2);
        uu_02.start();
    }

    public void finishBackProgress(uu_0 object, int n3, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener object2) {
        ObjectAnimator objectAnimator = null;
        int n4 = 1;
        int n7 = object.d;
        n7 = n7 == 0 ? 1 : 0;
        boolean bl2 = this.checkAbsoluteGravity(n3, 3);
        float f5 = this.view.getWidth();
        View view = this.view;
        float f6 = view.getScaleX() * f5;
        int n8 = this.getEdgeMargin(bl2);
        f5 = n8;
        f6 += f5;
        View view2 = this.view;
        Property property = View.TRANSLATION_X;
        if (bl2) {
            f6 = -f6;
        }
        float[] fArray = new float[n4];
        fArray[0] = f6;
        objectAnimator = ObjectAnimator.ofFloat((Object)view2, (Property)property, (float[])fArray);
        if (object2 != null) {
            objectAnimator.addUpdateListener(object2);
        }
        object2 = new xi0_0();
        objectAnimator.setInterpolator((TimeInterpolator)object2);
        int n10 = this.hideDurationMax;
        n4 = this.hideDurationMin;
        float f7 = object.c;
        int n14 = AnimationUtils.lerp(n10, n4, f7);
        long l2 = n14;
        objectAnimator.setDuration(l2);
        object = new MaterialSideContainerBackHelper$1(this, n7 != 0, n3);
        objectAnimator.addListener((Animator.AnimatorListener)object);
        if (animatorListener != null) {
            objectAnimator.addListener(animatorListener);
        }
        objectAnimator.start();
    }

    public void startBackProgress(uu_0 uu_02) {
        super.onStartBackProgress(uu_02);
    }

    public void updateBackProgress(float f5, boolean n3, int n4) {
        float f6;
        float f7;
        f5 = this.interpolateProgress(f5);
        n4 = (int)(this.checkAbsoluteGravity(n4, 3) ? 1 : 0);
        int n7 = 0;
        n3 = n3 == n4 ? 1 : 0;
        View view = this.view;
        int n8 = view.getWidth();
        View view2 = this.view;
        int n10 = view2.getHeight();
        float f8 = n8;
        float f11 = f8 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (f12 > 0 && (f12 = (f7 = (f6 = (float)n10) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) > 0) {
            float f14 = this.maxScaleXDistanceShrink / f8;
            float f15 = this.maxScaleXDistanceGrow / f8;
            float f16 = this.maxScaleYDistance / f6;
            view2 = this.view;
            if (n4 != 0) {
                f8 = 0.0f;
            }
            view2.setPivotX(f8);
            if (n3 == 0) {
                f15 = -f14;
            }
            f6 = AnimationUtils.lerp(0.0f, f15, f5);
            f8 = 1.0f;
            f14 = f6 + f8;
            this.view.setScaleX(f14);
            f5 = AnimationUtils.lerp(0.0f, f16, f5);
            f5 = f8 - f5;
            this.view.setScaleY(f5);
            View view3 = this.view;
            int n14 = view3 instanceof ViewGroup;
            if (n14 != 0) {
                view3 = (ViewGroup)view3;
                while (n7 < (n14 = view3.getChildCount())) {
                    float f17;
                    float f18;
                    float f19;
                    int n15;
                    int n16;
                    View view4 = view3.getChildAt(n7);
                    if (n4 != 0) {
                        n16 = view4.getRight();
                        n16 = n8 - n16;
                        n15 = view4.getWidth() + n16;
                        f19 = n15;
                    } else {
                        n16 = -view4.getLeft();
                        f19 = n16;
                    }
                    view4.setPivotX(f19);
                    n16 = -view4.getTop();
                    f19 = n16;
                    view4.setPivotY(f19);
                    if (n3 != 0) {
                        f19 = f8 - f6;
                    } else {
                        n16 = 1065353216;
                        f19 = 1.0f;
                    }
                    n15 = (int)((f18 = f5 - 0.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                    if (n15 != 0) {
                        f17 = f14 / f5 * f19;
                    } else {
                        n15 = 1065353216;
                        f17 = 1.0f;
                    }
                    view4.setScaleX(f19);
                    view4.setScaleY(f17);
                    ++n7;
                }
            }
        }
    }

    public void updateBackProgress(uu_0 uu_02, int n3) {
        uu_0 uu_03 = super.onUpdateBackProgress(uu_02);
        if (uu_03 == null) {
            return;
        }
        int n4 = uu_02.d;
        if (!n4) {
            n4 = 1;
        } else {
            n4 = 0;
            uu_03 = null;
        }
        float f5 = uu_02.c;
        this.updateBackProgress(f5, n4 != 0, n3);
    }
}

