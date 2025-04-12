/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3;
import java.util.List;

abstract class DrawableWithAnimatedVisibilityChange
extends Drawable
implements Animatable {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property GROW_FRACTION;
    private List animationCallbacks;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Mj internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    final Paint paint;
    private ValueAnimator showAnimator;
    private int totalAlpha;

    static {
        DrawableWithAnimatedVisibilityChange$3 drawableWithAnimatedVisibilityChange$3 = new DrawableWithAnimatedVisibilityChange$3(Float.class, "growFraction");
        GROW_FRACTION = drawableWithAnimatedVisibilityChange$3;
    }

    public DrawableWithAnimatedVisibilityChange(Context object, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        Paint paint;
        this.paint = paint = new Paint();
        this.context = object;
        this.baseSpec = baseProgressIndicatorSpec;
        this.animatorDurationScaleProvider = object;
        this.setAlpha(255);
    }

    public static /* synthetic */ void access$000(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        drawableWithAnimatedVisibilityChange.dispatchAnimationStart();
    }

    public static /* synthetic */ boolean access$101(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, boolean bl2, boolean bl3) {
        return super.setVisible(bl2, bl3);
    }

    public static /* synthetic */ void access$200(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        drawableWithAnimatedVisibilityChange.dispatchAnimationEnd();
    }

    private void cancelAnimatorsWithoutCallbacks(ValueAnimator ... valueAnimatorArray) {
        boolean bl2 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArray) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = bl2;
    }

    private void dispatchAnimationEnd() {
        boolean bl2;
        Object object = this.internalAnimationCallback;
        if (object != null) {
            ((Mj)object).onAnimationEnd(this);
        }
        if ((object = this.animationCallbacks) != null && !(bl2 = this.ignoreCallbacks)) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Mj mj = (Mj)object.next();
                mj.onAnimationEnd(this);
            }
        }
    }

    private void dispatchAnimationStart() {
        boolean bl2;
        Object object = this.internalAnimationCallback;
        if (object != null) {
            ((Mj)object).onAnimationStart(this);
        }
        if ((object = this.animationCallbacks) != null && !(bl2 = this.ignoreCallbacks)) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Mj mj = (Mj)object.next();
                mj.onAnimationStart(this);
            }
        }
    }

    private void endAnimatorsWithoutCallbacks(ValueAnimator ... valueAnimatorArray) {
        boolean bl2 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArray) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = bl2;
    }

    private void maybeInitializeAnimators() {
        int n3 = 2;
        ValueAnimator valueAnimator = this.showAnimator;
        long l2 = 500L;
        if (valueAnimator == null) {
            valueAnimator = GROW_FRACTION;
            Object object = new float[n3];
            object[0] = 0.0f;
            object[1] = 1.0f;
            this.showAnimator = valueAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (Property)valueAnimator, (float[])object);
            valueAnimator.setDuration(l2);
            valueAnimator = this.showAnimator;
            object = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            valueAnimator.setInterpolator((TimeInterpolator)object);
            valueAnimator = this.showAnimator;
            this.setShowAnimator(valueAnimator);
        }
        if ((valueAnimator = this.hideAnimator) == null) {
            valueAnimator = GROW_FRACTION;
            Object object = new float[n3];
            object[0] = 1.0f;
            object[1] = 0.0f;
            object = ObjectAnimator.ofFloat((Object)((Object)this), (Property)valueAnimator, (float[])object);
            this.hideAnimator = (ValueAnimator)object;
            object.setDuration(l2);
            object = this.hideAnimator;
            valueAnimator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            object.setInterpolator((TimeInterpolator)valueAnimator);
            object = this.hideAnimator;
            this.setHideAnimator((ValueAnimator)object);
        }
    }

    private void setHideAnimator(ValueAnimator object) {
        boolean bl2;
        Object object2 = this.hideAnimator;
        if (object2 != null && (bl2 = object2.isRunning())) {
            object = new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            throw object;
        }
        this.hideAnimator = object;
        object2 = new DrawableWithAnimatedVisibilityChange$2(this);
        object.addListener((Animator.AnimatorListener)object2);
    }

    private void setShowAnimator(ValueAnimator object) {
        boolean bl2;
        Object object2 = this.showAnimator;
        if (object2 != null && (bl2 = object2.isRunning())) {
            object = new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            throw object;
        }
        this.showAnimator = object;
        object2 = new DrawableWithAnimatedVisibilityChange$1(this);
        object.addListener((Animator.AnimatorListener)object2);
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    public int getAlpha() {
        return this.totalAlpha;
    }

    public float getGrowFraction() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
        boolean bl2 = baseProgressIndicatorSpec.isShowAnimationEnabled();
        if (!bl2 && !(bl2 = (baseProgressIndicatorSpec = this.baseSpec).isHideAnimationEnabled())) {
            return 1.0f;
        }
        bl2 = this.mockHideAnimationRunning;
        if (!bl2 && !(bl2 = this.mockShowAnimationRunning)) {
            return this.growFraction;
        }
        return this.mockGrowFraction;
    }

    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return this.setVisible(false, false, false);
    }

    public boolean isHiding() {
        boolean bl2;
        ValueAnimator valueAnimator = this.hideAnimator;
        if (valueAnimator != null && (bl2 = valueAnimator.isRunning()) || (bl2 = this.mockHideAnimationRunning)) {
            bl2 = true;
        } else {
            bl2 = false;
            valueAnimator = null;
        }
        return bl2;
    }

    public boolean isRunning() {
        boolean bl2 = this.isShowing();
        bl2 = bl2 || (bl2 = this.isHiding());
        return bl2;
    }

    public boolean isShowing() {
        boolean bl2;
        ValueAnimator valueAnimator = this.showAnimator;
        if (valueAnimator != null && (bl2 = valueAnimator.isRunning()) || (bl2 = this.mockShowAnimationRunning)) {
            bl2 = true;
        } else {
            bl2 = false;
            valueAnimator = null;
        }
        return bl2;
    }

    public void registerAnimationCallback(Mj mj) {
        boolean bl2;
        List<Mj> list = this.animationCallbacks;
        if (list == null) {
            list = new List<Mj>();
            this.animationCallbacks = list;
        }
        if (!(bl2 = (list = this.animationCallbacks).contains(mj))) {
            list = this.animationCallbacks;
            list.add(mj);
        }
    }

    public void setAlpha(int n3) {
        this.totalAlpha = n3;
        this.invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public void setGrowFraction(float f5) {
        float f6 = this.growFraction;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.growFraction = f5;
            this.invalidateSelf();
        }
    }

    public void setInternalAnimationCallback(Mj mj) {
        this.internalAnimationCallback = mj;
    }

    public void setMockHideAnimationRunning(boolean bl2, float f5) {
        this.mockHideAnimationRunning = bl2;
        this.mockGrowFraction = f5;
    }

    public void setMockShowAnimationRunning(boolean bl2, float f5) {
        this.mockShowAnimationRunning = bl2;
        this.mockGrowFraction = f5;
    }

    public boolean setVisible(boolean bl2, boolean bl3) {
        return this.setVisible(bl2, bl3, true);
    }

    public boolean setVisible(boolean bl2, boolean bl3, boolean n3) {
        float f5;
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        float f6 = animatorDurationScaleProvider.getSystemAnimatorDurationScale(contentResolver);
        n3 = n3 != 0 && (n3 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0 ? 1 : 0;
        return this.setVisibleInternal(bl2, bl3, n3 != 0);
    }

    public boolean setVisibleInternal(boolean bl2, boolean bl3, boolean bl4) {
        ValueAnimator[] valueAnimatorArray;
        int n3 = 1;
        this.maybeInitializeAnimators();
        boolean bl5 = this.isVisible();
        if (!bl5 && !bl2) {
            return false;
        }
        ValueAnimator valueAnimator = bl2 ? this.showAnimator : this.hideAnimator;
        ValueAnimator valueAnimator2 = bl2 ? this.hideAnimator : this.showAnimator;
        if (!bl4) {
            ValueAnimator[] valueAnimatorArray2;
            bl3 = valueAnimator2.isRunning();
            if (bl3) {
                valueAnimatorArray2 = new ValueAnimator[n3];
                valueAnimatorArray2[0] = valueAnimator2;
                this.cancelAnimatorsWithoutCallbacks(valueAnimatorArray2);
            }
            if (bl3 = valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                valueAnimatorArray2 = new ValueAnimator[n3];
                valueAnimatorArray2[0] = valueAnimator;
                this.endAnimatorsWithoutCallbacks(valueAnimatorArray2);
            }
            return super.setVisible(bl2, false);
        }
        bl4 = valueAnimator.isRunning();
        if (bl4) {
            return false;
        }
        bl4 = !bl2 || (bl4 = super.setVisible(bl2, false));
        if (bl2) {
            valueAnimatorArray = this.baseSpec;
            bl2 = valueAnimatorArray.isShowAnimationEnabled();
        } else {
            valueAnimatorArray = this.baseSpec;
            bl2 = valueAnimatorArray.isHideAnimationEnabled();
        }
        if (!bl2) {
            valueAnimatorArray = new ValueAnimator[n3];
            valueAnimatorArray[0] = valueAnimator;
            this.endAnimatorsWithoutCallbacks(valueAnimatorArray);
            return bl4;
        }
        if (!bl3 && (bl2 = valueAnimator.isPaused())) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return bl4;
    }

    public void start() {
        boolean bl2 = true;
        this.setVisibleInternal(bl2, bl2, false);
    }

    public void stop() {
        this.setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(Mj object) {
        boolean bl2;
        List list = this.animationCallbacks;
        if (list != null && (bl2 = list.contains(object))) {
            list = this.animationCallbacks;
            list.remove(object);
            object = this.animationCallbacks;
            boolean bl3 = object.isEmpty();
            if (bl3) {
                bl3 = false;
                object = null;
                this.animationCallbacks = null;
            }
            return true;
        }
        return false;
    }
}

