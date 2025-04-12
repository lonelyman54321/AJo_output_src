/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.IndeterminateDrawable;
import java.util.ArrayList;
import java.util.List;

abstract class IndeterminateAnimatorDelegate {
    protected final List activeIndicators;
    protected IndeterminateDrawable drawable;

    public IndeterminateAnimatorDelegate(int n3) {
        ArrayList arrayList;
        this.activeIndicators = arrayList = new ArrayList();
        arrayList = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            List list = this.activeIndicators;
            DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = new DrawingDelegate$ActiveIndicator();
            list.add(drawingDelegate$ActiveIndicator);
        }
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int n3, int n4, int n7) {
        float f5 = n3 - n4;
        float f6 = n7;
        return f5 / f6;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(Mj var1);

    public void registerDrawable(IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void resetPropertiesForNewStart();

    public abstract void setAnimationFraction(float var1);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}

