/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.IndeterminateAnimatorDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$1;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Iterator;

final class LinearIndeterminateContiguousAnimatorDelegate
extends IndeterminateAnimatorDelegate {
    private static final Property ANIMATION_FRACTION;
    private static final int DURATION_PER_CYCLE_IN_MS = 333;
    private static final int TOTAL_DURATION_IN_MS = 667;
    private float animationFraction;
    private ObjectAnimator animator;
    private final BaseProgressIndicatorSpec baseSpec;
    private boolean dirtyColors;
    private xi0_0 interpolator;
    private int newIndicatorColorIndex = 1;

    static {
        LinearIndeterminateContiguousAnimatorDelegate$2 linearIndeterminateContiguousAnimatorDelegate$2 = new LinearIndeterminateContiguousAnimatorDelegate$2(Float.class, "animationFraction");
        ANIMATION_FRACTION = linearIndeterminateContiguousAnimatorDelegate$2;
    }

    public LinearIndeterminateContiguousAnimatorDelegate(LinearProgressIndicatorSpec object) {
        super(3);
        this.baseSpec = object;
        this.interpolator = object = new xi0_0();
    }

    public static /* synthetic */ int access$000(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
        return linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex;
    }

    public static /* synthetic */ int access$002(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, int n3) {
        linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex = n3;
        return n3;
    }

    public static /* synthetic */ BaseProgressIndicatorSpec access$100(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
        return linearIndeterminateContiguousAnimatorDelegate.baseSpec;
    }

    public static /* synthetic */ boolean access$202(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, boolean bl2) {
        linearIndeterminateContiguousAnimatorDelegate.dirtyColors = bl2;
        return bl2;
    }

    public static /* synthetic */ float access$300(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
        return linearIndeterminateContiguousAnimatorDelegate.getAnimationFraction();
    }

    private float getAnimationFraction() {
        return this.animationFraction;
    }

    private void maybeInitializeAnimators() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator == null) {
            objectAnimator = ANIMATION_FRACTION;
            Object object = new float[]{0.0f, 1.0f};
            this.animator = objectAnimator = ObjectAnimator.ofFloat((Object)this, (Property)objectAnimator, (float[])object);
            long l2 = 333L;
            objectAnimator.setDuration(l2);
            this.animator.setInterpolator(null);
            objectAnimator = this.animator;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
            objectAnimator = this.animator;
            object = (Object)new LinearIndeterminateContiguousAnimatorDelegate$1;
            object(this);
            objectAnimator.addListener((Animator.AnimatorListener)object);
        }
    }

    private void maybeUpdateSegmentColors() {
        Object object = this.dirtyColors;
        if (object != 0) {
            Object object2 = this.activeIndicators;
            Object object3 = 1;
            object2 = (DrawingDelegate$ActiveIndicator)object2.get((int)object3);
            float f5 = ((DrawingDelegate$ActiveIndicator)object2).endFraction;
            int n3 = 1065353216;
            float f6 = 1.0f;
            float f7 = f5 - f6;
            object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object < 0) {
                object2 = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(2);
                ((DrawingDelegate$ActiveIndicator)object2).color = n3 = ((DrawingDelegate$ActiveIndicator)this.activeIndicators.get((int)object3)).color;
                object2 = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get((int)object3);
                Object object4 = this.activeIndicators;
                n3 = 0;
                f6 = 0.0f;
                ((DrawingDelegate$ActiveIndicator)object2).color = object3 = ((DrawingDelegate$ActiveIndicator)object4.get((int)0)).color;
                object2 = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(0);
                object4 = this.baseSpec.indicatorColors;
                int n4 = this.newIndicatorColorIndex;
                ((DrawingDelegate$ActiveIndicator)object2).color = object3 = (Object)object4[n4];
                this.dirtyColors = false;
            }
        }
    }

    private void updateSegmentPositions(int n3) {
        float f5;
        ((DrawingDelegate$ActiveIndicator)this.activeIndicators.get((int)0)).startFraction = 0.0f;
        float f6 = this.getFractionInRange(n3, 0, 667);
        DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(0);
        Object object = this.activeIndicators;
        int n4 = 1;
        object = (DrawingDelegate$ActiveIndicator)object.get(n4);
        ((DrawingDelegate$ActiveIndicator)object).startFraction = f5 = this.interpolator.getInterpolation(f6);
        drawingDelegate$ActiveIndicator.endFraction = f5;
        f6 += 0.49925038f;
        drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(n4);
        object = this.activeIndicators;
        n4 = 2;
        object = (DrawingDelegate$ActiveIndicator)object.get(n4);
        ((DrawingDelegate$ActiveIndicator)object).startFraction = f6 = this.interpolator.getInterpolation(f6);
        drawingDelegate$ActiveIndicator.endFraction = f6;
        ((DrawingDelegate$ActiveIndicator)this.activeIndicators.get((int)n4)).endFraction = 1.0f;
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
    }

    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    public void resetPropertiesForNewStart() {
        boolean bl2;
        boolean bl3;
        this.dirtyColors = bl3 = true;
        this.newIndicatorColorIndex = (int)(bl3 ? 1 : 0);
        Iterator iterator = this.activeIndicators.iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            int n4;
            DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)iterator.next();
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            int[] nArray = baseProgressIndicatorSpec.indicatorColors;
            drawingDelegate$ActiveIndicator.color = n4 = nArray[0];
            drawingDelegate$ActiveIndicator.gapSize = n3 = baseProgressIndicatorSpec.indicatorTrackGapSize / 2;
        }
    }

    public void setAnimationFraction(float f5) {
        this.animationFraction = f5;
        int n3 = (int)(f5 * 333.0f);
        this.updateSegmentPositions(n3);
        this.maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }

    public void startAnimator() {
        this.maybeInitializeAnimators();
        this.resetPropertiesForNewStart();
        this.animator.start();
    }

    public void unregisterAnimatorsCompleteCallback() {
    }
}

