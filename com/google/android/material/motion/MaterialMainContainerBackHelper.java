/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.RoundedCorner
 *  android.view.View
 *  android.view.WindowInsets
 */
package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.R$dimen;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackAnimationHelper;
import com.google.android.material.motion.MaterialMainContainerBackHelper$1;

public class MaterialMainContainerBackHelper
extends MaterialBackAnimationHelper {
    private static final float MIN_SCALE = 0.9f;
    private Integer expandedCornerSize;
    private Rect initialHideFromClipBounds;
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(View view) {
        super(view);
        float f5;
        float f6;
        view = view.getResources();
        int n3 = R$dimen.m3_back_progress_main_container_min_edge_gap;
        this.minEdgeGap = f6 = view.getDimension(n3);
        n3 = R$dimen.m3_back_progress_main_container_max_translation_y;
        this.maxTranslationY = f5 = view.getDimension(n3);
    }

    public static /* synthetic */ void a(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        MaterialMainContainerBackHelper.lambda$createCornerAnimator$0(clippableRoundedCornerLayout, valueAnimator);
    }

    private ValueAnimator createCornerAnimator(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        float f5 = clippableRoundedCornerLayout.getCornerRadius();
        float f6 = this.getExpandedCornerSize();
        float[] fArray = new float[]{f5, f6};
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])fArray);
        dk1_0 dk1_02 = new dk1_0(clippableRoundedCornerLayout);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)dk1_02);
        return valueAnimator;
    }

    private AnimatorSet createResetScaleAndTranslationAnimator(View view) {
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
        Object[] objectArray = new float[n3];
        objectArray[0] = f5;
        property = ObjectAnimator.ofFloat((Object)property, (Property)object2, (float[])objectArray);
        View view2 = this.view;
        object2 = View.TRANSLATION_X;
        Object object3 = new float[n3];
        object3[0] = 0.0f;
        view2 = ObjectAnimator.ofFloat((Object)view2, (Property)object2, (float[])object3);
        object2 = this.view;
        object3 = View.TRANSLATION_Y;
        float[] fArray = new float[n3];
        fArray[0] = 0.0f;
        object2 = ObjectAnimator.ofFloat((Object)object2, (Property)object3, (float[])fArray);
        objectArray = new Animator[4];
        objectArray[0] = (float)object;
        objectArray[n3] = (float)property;
        objectArray[2] = (float)view2;
        objectArray[3] = (float)object2;
        animatorSet.playTogether((Animator[])objectArray);
        object = new MaterialMainContainerBackHelper$1(this, view);
        animatorSet.addListener((Animator.AnimatorListener)object);
        return animatorSet;
    }

    private int getMaxDeviceCornerRadius() {
        WindowInsets windowInsets;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        int n7 = 0;
        if (n3 >= n4 && (windowInsets = Re1.a(this.view)) != null) {
            n4 = this.getRoundedCornerRadius(windowInsets, 0);
            n7 = this.getRoundedCornerRadius(windowInsets, 1);
            n4 = Math.max(n4, n7);
            n7 = this.getRoundedCornerRadius(windowInsets, 3);
            n3 = this.getRoundedCornerRadius(windowInsets, 2);
            n3 = Math.max(n7, n3);
            return Math.max(n4, n3);
        }
        return 0;
    }

    private int getRoundedCornerRadius(WindowInsets windowInsets, int n3) {
        int n4;
        if ((windowInsets = Sg.a(windowInsets, n3)) != null) {
            n4 = Yz.a((RoundedCorner)windowInsets);
        } else {
            n4 = 0;
            windowInsets = null;
        }
        return n4;
    }

    private boolean isAtTopOfScreen() {
        int[] nArray = new int[2];
        View view = this.view;
        view.getLocationOnScreen(nArray);
        boolean bl2 = true;
        int n3 = nArray[bl2];
        if (n3 != 0) {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    private static /* synthetic */ void lambda$createCornerAnimator$0(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        clippableRoundedCornerLayout.updateCornerRadius(f5);
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    public void cancelBackProgress(View view) {
        Object object = super.onCancelBackProgress();
        if (object == null) {
            return;
        }
        view = this.createResetScaleAndTranslationAnimator(view);
        object = this.view;
        int n3 = object instanceof ClippableRoundedCornerLayout;
        if (n3 != 0) {
            object = (ClippableRoundedCornerLayout)((Object)object);
            object = this.createCornerAnimator((ClippableRoundedCornerLayout)((Object)object));
            n3 = 1;
            Animator[] animatorArray = new Animator[n3];
            animatorArray[0] = object;
            view.playTogether(animatorArray);
        }
        long l2 = this.cancelDuration;
        view.setDuration(l2);
        view.start();
        this.resetInitialValues();
    }

    public void finishBackProgress(long l2, View view) {
        view = this.createResetScaleAndTranslationAnimator(view);
        view.setDuration(l2);
        view.start();
        this.resetInitialValues();
    }

    public int getExpandedCornerSize() {
        Integer n3 = this.expandedCornerSize;
        if (n3 == null) {
            int n4 = this.isAtTopOfScreen();
            if (n4 != 0) {
                n4 = this.getMaxDeviceCornerRadius();
            } else {
                n4 = 0;
                n3 = null;
            }
            this.expandedCornerSize = n3 = Integer.valueOf(n4);
        }
        return this.expandedCornerSize;
    }

    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public void startBackProgress(float f5, View view) {
        Rect rect;
        this.initialHideToClipBounds = rect = ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            rect = this.view;
            view = ViewUtils.calculateOffsetRectFromBounds((View)rect, view);
            this.initialHideFromClipBounds = view;
        }
        this.initialTouchY = f5;
    }

    public void startBackProgress(uu_0 uu_02, View view) {
        super.onStartBackProgress(uu_02);
        float f5 = uu_02.b;
        this.startBackProgress(f5, view);
    }

    /*
     * WARNING - void declaration
     */
    public void updateBackProgress(float f5, boolean bl2, float f6, float f7) {
        float f8;
        f5 = this.interpolateProgress(f5);
        View view = this.view;
        int n3 = view.getWidth();
        float f11 = n3;
        View view2 = this.view;
        int n4 = view2.getHeight();
        float f12 = n4;
        float f14 = f11 - 0.0f;
        Object object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object > 0 && (object = (f8 = f12 - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0) {
            float f15;
            void var2_5;
            float f16;
            object = 1065353216;
            float f17 = 0.9f;
            float f18 = AnimationUtils.lerp(1.0f, f17, f5);
            float f19 = 2.0f;
            f11 = qy_1.a(f11, f17, f11, f19);
            f17 = this.minEdgeGap;
            f11 -= f17;
            f11 = Math.max(0.0f, f11);
            f11 = AnimationUtils.lerp(0.0f, f11, f5);
            if (bl2) {
                boolean bl3 = true;
                f16 = Float.MIN_VALUE;
            } else {
                int n7 = -1;
                f16 = 0.0f / 0.0f;
            }
            f16 = (float)var2_5;
            f11 *= f16;
            f16 = qy_1.a(f18, f12, f12, f19);
            f17 = this.minEdgeGap;
            f16 -= f17;
            f16 = Math.max(0.0f, f16);
            f17 = this.maxTranslationY;
            f16 = Math.min(f16, f17);
            f17 = this.initialTouchY;
            f15 -= f17;
            f17 = Math.abs(f15) / f12;
            f15 = Math.signum(f15);
            f16 = AnimationUtils.lerp(0.0f, f16, f17) * f15;
            this.view.setScaleX(f18);
            this.view.setScaleY(f18);
            this.view.setTranslationX(f11);
            View view3 = this.view;
            view3.setTranslationY(f16);
            Object object2 = this.view;
            int n8 = object2 instanceof ClippableRoundedCornerLayout;
            if (n8 != 0) {
                void var4_7;
                object2 = (ClippableRoundedCornerLayout)((Object)object2);
                n8 = this.getExpandedCornerSize();
                f15 = n8;
                f5 = AnimationUtils.lerp(f15, (float)var4_7, f5);
                ((ClippableRoundedCornerLayout)((Object)object2)).updateCornerRadius(f5);
            }
        }
    }

    public void updateBackProgress(uu_0 uu_02, View view, float f5) {
        boolean bl2;
        int n3;
        int n4;
        uu_0 uu_03 = super.onUpdateBackProgress(uu_02);
        if (uu_03 == null) {
            return;
        }
        if (view != null && (n4 = view.getVisibility()) != (n3 = 4)) {
            view.setVisibility(n3);
        }
        if (!(bl2 = uu_02.d)) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        float f6 = uu_02.c;
        float f7 = uu_02.b;
        this.updateBackProgress(f6, bl2, f7, f5);
    }
}

