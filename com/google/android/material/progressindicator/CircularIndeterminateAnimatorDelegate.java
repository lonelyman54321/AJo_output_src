/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.IndeterminateAnimatorDelegate;

final class CircularIndeterminateAnimatorDelegate
extends IndeterminateAnimatorDelegate {
    private static final Property ANIMATION_FRACTION;
    private static final Property COMPLETE_END_FRACTION;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int[] DELAY_TO_COLLAPSE_IN_MS;
    private static final int[] DELAY_TO_EXPAND_IN_MS;
    private static final int[] DELAY_TO_FADE_IN_MS;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = 236;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private ObjectAnimator animator;
    Mj animatorCompleteCallback = null;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset = 0;
    private final xi0_0 interpolator;

    static {
        Property property;
        DELAY_TO_EXPAND_IN_MS = new int[]{0, 1350, 2700, 4050};
        DELAY_TO_COLLAPSE_IN_MS = new int[]{667, 2017, 3367, 4717};
        DELAY_TO_FADE_IN_MS = new int[]{1000, 2350, 3700, 5050};
        Class<Float> clazz = Float.class;
        ANIMATION_FRACTION = property = new CircularIndeterminateAnimatorDelegate$3(clazz, "animationFraction");
        COMPLETE_END_FRACTION = property = new CircularIndeterminateAnimatorDelegate$4(clazz, "completeEndFraction");
    }

    public CircularIndeterminateAnimatorDelegate(CircularProgressIndicatorSpec object) {
        super(1);
        this.baseSpec = object;
        this.interpolator = object = new xi0_0();
    }

    public static /* synthetic */ int access$000(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        return circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset;
    }

    public static /* synthetic */ int access$002(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, int n3) {
        circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset = n3;
        return n3;
    }

    public static /* synthetic */ BaseProgressIndicatorSpec access$100(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        return circularIndeterminateAnimatorDelegate.baseSpec;
    }

    public static /* synthetic */ float access$200(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        return circularIndeterminateAnimatorDelegate.getAnimationFraction();
    }

    public static /* synthetic */ float access$300(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        return circularIndeterminateAnimatorDelegate.getCompleteEndFraction();
    }

    public static /* synthetic */ void access$400(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, float f5) {
        circularIndeterminateAnimatorDelegate.setCompleteEndFraction(f5);
    }

    private float getAnimationFraction() {
        return this.animationFraction;
    }

    private float getCompleteEndFraction() {
        return this.completeEndFraction;
    }

    private void maybeInitializeAnimators() {
        int n3 = 2;
        Object object = this.animator;
        if (object == null) {
            object = ANIMATION_FRACTION;
            Object object2 = new float[n3];
            object2[0] = 0.0f;
            object2[1] = 1.0f;
            this.animator = object = ObjectAnimator.ofFloat((Object)this, (Property)object, (float[])object2);
            long l2 = 5400L;
            object.setDuration(l2);
            this.animator.setInterpolator(null);
            object = this.animator;
            int n4 = -1;
            object.setRepeatCount(n4);
            object = this.animator;
            object2 = (Object)new CircularIndeterminateAnimatorDelegate$1;
            object2(this);
            object.addListener((Animator.AnimatorListener)object2);
        }
        if ((object = this.completeEndAnimator) == null) {
            object = COMPLETE_END_FRACTION;
            Object object3 = new float[n3];
            object3[0] = 0.0f;
            object3[1] = 1.0f;
            object3 = ObjectAnimator.ofFloat((Object)this, (Property)object, (float[])object3);
            this.completeEndAnimator = (ObjectAnimator)object3;
            long l3 = 333L;
            object3.setDuration(l3);
            object3 = this.completeEndAnimator;
            object = this.interpolator;
            object3.setInterpolator((TimeInterpolator)object);
            object3 = this.completeEndAnimator;
            object = new CircularIndeterminateAnimatorDelegate$2(this);
            object3.addListener((Animator.AnimatorListener)object);
        }
    }

    private void maybeUpdateSegmentColors(int n3) {
        DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = null;
        int n4 = 0;
        Integer n7 = null;
        while (true) {
            float f5;
            int n8 = 4;
            float f6 = 5.6E-45f;
            if (n4 >= n8) break;
            int[] nArray = DELAY_TO_FADE_IN_MS;
            n8 = nArray[n4];
            f6 = this.getFractionInRange(n3, n8, 333);
            float f7 = 0.0f;
            ArgbEvaluatorCompat argbEvaluatorCompat = null;
            float f8 = f6 - 0.0f;
            Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object >= 0 && (object = (f5 = f6 - (f7 = 1.0f)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
                n3 = this.indicatorColorIndexOffset;
                n4 += n3;
                Object object2 = this.baseSpec.indicatorColors;
                object = ((int[])object2).length;
                n4 %= object;
                object = n4 + 1;
                int n10 = ((int[])object2).length;
                n4 = object2[n4];
                n3 = object2[object %= n10];
                f6 = this.interpolator.getInterpolation(f6);
                drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(0);
                argbEvaluatorCompat = ArgbEvaluatorCompat.getInstance();
                n7 = n4;
                object2 = n3;
                object2 = argbEvaluatorCompat.evaluate(f6, n7, (Integer)object2);
                drawingDelegate$ActiveIndicator.color = n3 = ((Integer)object2).intValue();
                break;
            }
            ++n4;
        }
    }

    private void setCompleteEndFraction(float f5) {
        this.completeEndFraction = f5;
    }

    private void updateSegmentPositions(int n3) {
        Object object = this.activeIndicators;
        int n4 = 0;
        float f5 = 0.0f;
        object = (DrawingDelegate$ActiveIndicator)object.get(0);
        float f6 = this.animationFraction;
        int n7 = 1153302528;
        float f7 = 1520.0f;
        float f8 = f6 * f7;
        float f11 = -20.0f;
        ((DrawingDelegate$ActiveIndicator)object).startFraction = f8 += f11;
        ((DrawingDelegate$ActiveIndicator)object).endFraction = f6 *= f7;
        while (true) {
            int n8 = 4;
            f6 = 5.6E-45f;
            if (n4 >= n8) break;
            n8 = DELAY_TO_EXPAND_IN_MS[n4];
            n7 = 667;
            f6 = this.getFractionInRange(n3, n8, n7);
            f8 = ((DrawingDelegate$ActiveIndicator)object).endFraction;
            xi0_0 xi0_02 = this.interpolator;
            f6 = xi0_02.getInterpolation(f6);
            f11 = 250.0f;
            ((DrawingDelegate$ActiveIndicator)object).endFraction = f6 = f6 * f11 + f8;
            int[] nArray = DELAY_TO_COLLAPSE_IN_MS;
            n8 = nArray[n4];
            f6 = this.getFractionInRange(n3, n8, n7);
            f7 = ((DrawingDelegate$ActiveIndicator)object).startFraction;
            xi0_0 xi0_03 = this.interpolator;
            ((DrawingDelegate$ActiveIndicator)object).startFraction = f6 = xi0_03.getInterpolation(f6) * f11 + f7;
            ++n4;
        }
        float f12 = ((DrawingDelegate$ActiveIndicator)object).startFraction;
        f5 = ((DrawingDelegate$ActiveIndicator)object).endFraction;
        f6 = f5 - f12;
        f7 = this.completeEndFraction;
        f6 = f6 * f7 + f12;
        f12 = 360.0f;
        ((DrawingDelegate$ActiveIndicator)object).startFraction = f6 /= f12;
        ((DrawingDelegate$ActiveIndicator)object).endFraction = f5 /= f12;
    }

    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void invalidateSpecValues() {
        this.resetPropertiesForNewStart();
    }

    public void registerAnimatorsCompleteCallback(Mj mj) {
        this.animatorCompleteCallback = mj;
    }

    public void requestCancelAnimatorAfterCurrentCycle() {
        boolean bl2;
        Object object = this.completeEndAnimator;
        if (object != null && !(bl2 = object.isRunning())) {
            object = this.drawable;
            bl2 = object.isVisible();
            if (bl2) {
                object = this.completeEndAnimator;
                object.start();
            } else {
                this.cancelAnimatorImmediately();
            }
        }
    }

    public void resetPropertiesForNewStart() {
        int n3;
        this.indicatorColorIndexOffset = 0;
        DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(0);
        drawingDelegate$ActiveIndicator.color = n3 = this.baseSpec.indicatorColors[0];
        this.completeEndFraction = 0.0f;
    }

    public void setAnimationFraction(float f5) {
        this.animationFraction = f5;
        int n3 = (int)(f5 * 5400.0f);
        this.updateSegmentPositions(n3);
        this.maybeUpdateSegmentColors(n3);
        this.drawable.invalidateSelf();
    }

    public void startAnimator() {
        this.maybeInitializeAnimators();
        this.resetPropertiesForNewStart();
        this.animator.start();
    }

    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }
}

