/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 */
package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.animation.AnimationUtils;

public class MotionTiming {
    private long delay;
    private long duration;
    private TimeInterpolator interpolator;
    private int repeatCount;
    private int repeatMode;

    public MotionTiming(long l2, long l3) {
        this.interpolator = null;
        this.repeatCount = 0;
        this.repeatMode = 1;
        this.delay = l2;
        this.duration = l3;
    }

    public MotionTiming(long l2, long l3, TimeInterpolator timeInterpolator) {
        this.repeatCount = 0;
        this.repeatMode = 1;
        this.delay = l2;
        this.duration = l3;
        this.interpolator = timeInterpolator;
    }

    public static MotionTiming createFromAnimator(ValueAnimator valueAnimator) {
        int n3;
        int n4;
        long l2 = valueAnimator.getStartDelay();
        long l3 = valueAnimator.getDuration();
        TimeInterpolator timeInterpolator = MotionTiming.getInterpolatorCompat(valueAnimator);
        MotionTiming motionTiming = new MotionTiming(l2, l3, timeInterpolator);
        motionTiming.repeatCount = n4 = valueAnimator.getRepeatCount();
        motionTiming.repeatMode = n3 = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    private static TimeInterpolator getInterpolatorCompat(ValueAnimator valueAnimator) {
        boolean bl2 = (valueAnimator = valueAnimator.getInterpolator()) instanceof AccelerateDecelerateInterpolator;
        if (!bl2 && valueAnimator != null) {
            bl2 = valueAnimator instanceof AccelerateInterpolator;
            if (bl2) {
                return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            }
            bl2 = valueAnimator instanceof DecelerateInterpolator;
            if (bl2) {
                valueAnimator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            return valueAnimator;
        }
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void apply(Animator animator2) {
        long l2 = this.getDelay();
        animator2.setStartDelay(l2);
        l2 = this.getDuration();
        animator2.setDuration(l2);
        TimeInterpolator timeInterpolator = this.getInterpolator();
        animator2.setInterpolator(timeInterpolator);
        int n3 = animator2 instanceof ValueAnimator;
        if (n3 != 0) {
            animator2 = (ValueAnimator)animator2;
            n3 = this.getRepeatCount();
            animator2.setRepeatCount(n3);
            n3 = this.getRepeatMode();
            animator2.setRepeatMode(n3);
        }
    }

    public boolean equals(Object clazz) {
        int n3;
        long l2;
        if (this == clazz) {
            return true;
        }
        Object object = clazz instanceof MotionTiming;
        if (object == 0) {
            return false;
        }
        clazz = (MotionTiming)((Object)clazz);
        long l3 = this.getDelay();
        long l4 = l3 - (l2 = ((MotionTiming)((Object)clazz)).getDelay());
        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != 0) {
            return false;
        }
        l3 = this.getDuration();
        long l7 = l3 - (l2 = ((MotionTiming)((Object)clazz)).getDuration());
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != 0) {
            return false;
        }
        object = this.getRepeatCount();
        if (object != (n3 = ((MotionTiming)((Object)clazz)).getRepeatCount())) {
            return false;
        }
        object = this.getRepeatMode();
        if (object != (n3 = ((MotionTiming)((Object)clazz)).getRepeatMode())) {
            return false;
        }
        Class<?> clazz2 = this.getInterpolator().getClass();
        clazz = ((MotionTiming)((Object)clazz)).getInterpolator().getClass();
        return clazz2.equals(clazz);
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.interpolator;
        if (timeInterpolator == null) {
            timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        return timeInterpolator;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        long l2 = this.getDelay();
        long l3 = this.getDelay();
        int n3 = 32;
        int n4 = (int)(l2 ^ (l3 >>>= n3)) * 31;
        l3 = this.getDuration();
        long l4 = this.getDuration() >>> n3;
        int n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        n7 = (this.getInterpolator().getClass().hashCode() + n4) * 31;
        n4 = (this.getRepeatCount() + n7) * 31;
        return this.getRepeatMode() + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n");
        Object object = this.getClass().getName();
        stringBuilder.append((String)object);
        stringBuilder.append('{');
        object = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)object);
        stringBuilder.append(" delay: ");
        long l2 = this.getDelay();
        stringBuilder.append(l2);
        stringBuilder.append(" duration: ");
        l2 = this.getDuration();
        stringBuilder.append(l2);
        stringBuilder.append(" interpolator: ");
        object = this.getInterpolator().getClass();
        stringBuilder.append(object);
        stringBuilder.append(" repeatCount: ");
        int n3 = this.getRepeatCount();
        stringBuilder.append(n3);
        stringBuilder.append(" repeatMode: ");
        n3 = this.getRepeatMode();
        stringBuilder.append(n3);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

