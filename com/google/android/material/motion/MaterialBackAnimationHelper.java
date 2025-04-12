/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.view.View
 *  android.view.animation.PathInterpolator
 */
package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.material.R$attr;
import com.google.android.material.motion.MotionUtils;

public abstract class MaterialBackAnimationHelper {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";
    private uu_0 backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    private final TimeInterpolator progressInterpolator;
    protected final View view;

    public MaterialBackAnimationHelper(View view) {
        int n3;
        TimeInterpolator timeInterpolator;
        this.view = view;
        view = view.getContext();
        int n4 = R$attr.motionEasingStandardDecelerateInterpolator;
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        this.progressInterpolator = timeInterpolator = MotionUtils.resolveThemeInterpolator((Context)view, n4, (TimeInterpolator)pathInterpolator);
        n4 = R$attr.motionDurationMedium2;
        this.hideDurationMax = n4 = MotionUtils.resolveThemeDuration((Context)view, n4, 300);
        n4 = R$attr.motionDurationShort3;
        this.hideDurationMin = n4 = MotionUtils.resolveThemeDuration((Context)view, n4, 150);
        n4 = R$attr.motionDurationShort2;
        this.cancelDuration = n3 = MotionUtils.resolveThemeDuration((Context)view, n4, 100);
    }

    public float interpolateProgress(float f5) {
        return this.progressInterpolator.getInterpolation(f5);
    }

    public uu_0 onCancelBackProgress() {
        uu_0 uu_02 = this.backEvent;
        this.backEvent = null;
        return uu_02;
    }

    public uu_0 onHandleBackInvoked() {
        uu_0 uu_02 = this.backEvent;
        this.backEvent = null;
        return uu_02;
    }

    public void onStartBackProgress(uu_0 uu_02) {
        this.backEvent = uu_02;
    }

    public uu_0 onUpdateBackProgress(uu_0 uu_02) {
        uu_0 uu_03 = this.backEvent;
        this.backEvent = uu_02;
        return uu_03;
    }
}

