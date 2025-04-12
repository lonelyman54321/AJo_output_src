/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.util.Property
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.R$anim;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.IndeterminateAnimatorDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Iterator;

final class LinearIndeterminateDisjointAnimatorDelegate
extends IndeterminateAnimatorDelegate {
    private static final Property ANIMATION_FRACTION;
    private static final int[] DELAY_TO_MOVE_SEGMENT_ENDS;
    private static final int[] DURATION_TO_MOVE_SEGMENT_ENDS;
    private static final int TOTAL_DURATION_IN_MS = 1800;
    private float animationFraction;
    private ObjectAnimator animator;
    Mj animatorCompleteCallback;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private boolean dirtyColors;
    private int indicatorColorIndex;
    private final Interpolator[] interpolatorArray;

    static {
        DURATION_TO_MOVE_SEGMENT_ENDS = new int[]{533, 567, 850, 750};
        DELAY_TO_MOVE_SEGMENT_ENDS = new int[]{1267, 1000, 333, 0};
        LinearIndeterminateDisjointAnimatorDelegate$3 linearIndeterminateDisjointAnimatorDelegate$3 = new LinearIndeterminateDisjointAnimatorDelegate$3(Float.class, "animationFraction");
        ANIMATION_FRACTION = linearIndeterminateDisjointAnimatorDelegate$3;
    }

    public LinearIndeterminateDisjointAnimatorDelegate(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        int n3 = 2;
        super(n3);
        this.indicatorColorIndex = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = linearProgressIndicatorSpec;
        int n4 = R$anim.linear_indeterminate_line1_head_interpolator;
        linearProgressIndicatorSpec = AnimationUtils.loadInterpolator((Context)context, (int)n4);
        int n7 = R$anim.linear_indeterminate_line1_tail_interpolator;
        Interpolator interpolator2 = AnimationUtils.loadInterpolator((Context)context, (int)n7);
        int n8 = R$anim.linear_indeterminate_line2_head_interpolator;
        Interpolator interpolator3 = AnimationUtils.loadInterpolator((Context)context, (int)n8);
        int n10 = R$anim.linear_indeterminate_line2_tail_interpolator;
        context = AnimationUtils.loadInterpolator((Context)context, (int)n10);
        Interpolator[] interpolatorArray = new Interpolator[4];
        interpolatorArray[0] = linearProgressIndicatorSpec;
        interpolatorArray[1] = interpolator2;
        interpolatorArray[n3] = interpolator3;
        interpolatorArray[3] = context;
        this.interpolatorArray = interpolatorArray;
    }

    public static /* synthetic */ int access$000(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
        return linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex;
    }

    public static /* synthetic */ int access$002(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, int n3) {
        linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = n3;
        return n3;
    }

    public static /* synthetic */ BaseProgressIndicatorSpec access$100(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
        return linearIndeterminateDisjointAnimatorDelegate.baseSpec;
    }

    public static /* synthetic */ boolean access$202(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, boolean bl2) {
        linearIndeterminateDisjointAnimatorDelegate.dirtyColors = bl2;
        return bl2;
    }

    public static /* synthetic */ float access$300(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
        return linearIndeterminateDisjointAnimatorDelegate.getAnimationFraction();
    }

    private float getAnimationFraction() {
        return this.animationFraction;
    }

    private void maybeInitializeAnimators() {
        int n3;
        Object object;
        ObjectAnimator objectAnimator = this.animator;
        LinearIndeterminateDisjointAnimatorDelegate$2 linearIndeterminateDisjointAnimatorDelegate$2 = null;
        long l2 = 1800L;
        if (objectAnimator == null) {
            objectAnimator = ANIMATION_FRACTION;
            object = new float[]{0.0f, 1.0f};
            this.animator = objectAnimator = ObjectAnimator.ofFloat((Object)this, (Property)objectAnimator, (float[])object);
            objectAnimator.setDuration(l2);
            this.animator.setInterpolator(null);
            objectAnimator = this.animator;
            n3 = -1;
            objectAnimator.setRepeatCount(n3);
            objectAnimator = this.animator;
            object = (Object)new LinearIndeterminateDisjointAnimatorDelegate$1;
            object(this);
            objectAnimator.addListener((Animator.AnimatorListener)object);
        }
        if ((objectAnimator = this.completeEndAnimator) == null) {
            float f5;
            objectAnimator = ANIMATION_FRACTION;
            n3 = 1;
            object = new float[n3];
            object[0] = f5 = 1.0f;
            this.completeEndAnimator = objectAnimator = ObjectAnimator.ofFloat((Object)this, (Property)objectAnimator, (float[])object);
            objectAnimator.setDuration(l2);
            this.completeEndAnimator.setInterpolator(null);
            objectAnimator = this.completeEndAnimator;
            linearIndeterminateDisjointAnimatorDelegate$2 = new LinearIndeterminateDisjointAnimatorDelegate$2(this);
            objectAnimator.addListener((Animator.AnimatorListener)linearIndeterminateDisjointAnimatorDelegate$2);
        }
    }

    private void maybeUpdateSegmentColors() {
        boolean bl2 = this.dirtyColors;
        if (bl2) {
            boolean bl3;
            Iterator iterator = this.activeIndicators.iterator();
            while (bl3 = iterator.hasNext()) {
                int n3;
                DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)iterator.next();
                int[] nArray = this.baseSpec.indicatorColors;
                int n4 = this.indicatorColorIndex;
                drawingDelegate$ActiveIndicator.color = n3 = nArray[n4];
            }
            bl2 = false;
            iterator = null;
            this.dirtyColors = false;
        }
    }

    private void updateSegmentPositions(int n3) {
        Object object;
        int n4;
        for (int i3 = 0; i3 < (n4 = (object = this.activeIndicators).size()); ++i3) {
            object = (DrawingDelegate$ActiveIndicator)this.activeIndicators.get(i3);
            int[] nArray = DELAY_TO_MOVE_SEGMENT_ENDS;
            int n7 = i3 * 2;
            int n8 = nArray[n7];
            int[] nArray2 = DURATION_TO_MOVE_SEGMENT_ENDS;
            int n10 = nArray2[n7];
            float f5 = this.getFractionInRange(n3, n8, n10);
            f5 = this.interpolatorArray[n7].getInterpolation(f5);
            n10 = 0;
            float f6 = 1.0f;
            ((DrawingDelegate$ActiveIndicator)object).startFraction = f5 = PK1.a(f5, 0.0f, f6);
            int n14 = nArray[++n7];
            n8 = nArray2[n7];
            float f7 = this.getFractionInRange(n3, n14, n8);
            Interpolator[] interpolatorArray = this.interpolatorArray;
            Interpolator interpolator2 = interpolatorArray[n7];
            ((DrawingDelegate$ActiveIndicator)object).endFraction = f7 = PK1.a(interpolator2.getInterpolation(f7), 0.0f, f6);
        }
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
            this.cancelAnimatorImmediately();
            object = this.drawable;
            bl2 = object.isVisible();
            if (bl2) {
                object = this.completeEndAnimator;
                float f5 = this.animationFraction;
                float f6 = 1.0f;
                int n3 = 2;
                float[] fArray = new float[n3];
                fArray[0] = f5;
                fArray[1] = f6;
                object.setFloatValues(fArray);
                object = this.completeEndAnimator;
                f5 = this.animationFraction;
                f6 -= f5;
                f5 = 1800.0f;
                long l2 = (long)(f6 *= f5);
                object.setDuration(l2);
                object = this.completeEndAnimator;
                object.start();
            }
        }
    }

    public void resetPropertiesForNewStart() {
        boolean bl2;
        this.indicatorColorIndex = 0;
        Iterator iterator = this.activeIndicators.iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator)iterator.next();
            int[] nArray = this.baseSpec.indicatorColors;
            drawingDelegate$ActiveIndicator.color = n3 = nArray[0];
        }
    }

    public void setAnimationFraction(float f5) {
        this.animationFraction = f5;
        int n3 = (int)(f5 * 1800.0f);
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
        this.animatorCompleteCallback = null;
    }
}

