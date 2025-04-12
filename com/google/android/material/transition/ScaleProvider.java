/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.transition.ScaleProvider$1;
import com.google.android.material.transition.VisibilityAnimatorProvider;

public final class ScaleProvider
implements VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    public ScaleProvider() {
        this(true);
    }

    public ScaleProvider(boolean bl2) {
        float f5;
        this.outgoingStartScale = f5 = 1.0f;
        this.outgoingEndScale = 1.1f;
        this.incomingStartScale = 0.8f;
        this.incomingEndScale = f5;
        this.scaleOnDisappear = true;
        this.growing = bl2;
    }

    private static Animator createScaleAnimator(View view, float f5, float f6) {
        float f7 = view.getScaleX();
        float f8 = view.getScaleY();
        Property property = View.SCALE_X;
        float f11 = f7 * f5;
        float f12 = f7 * f6;
        int n3 = 2;
        float[] fArray = new float[n3];
        fArray[0] = f11;
        int n4 = 1;
        fArray[n4] = f12;
        property = PropertyValuesHolder.ofFloat((Property)property, (float[])fArray);
        Property property2 = View.SCALE_Y;
        fArray = new float[n3];
        fArray[0] = f5 *= f8;
        fArray[n4] = f6 *= f8;
        PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofFloat((Property)property2, (float[])fArray);
        Object object = new PropertyValuesHolder[n3];
        object[0] = property;
        object[n4] = propertyValuesHolder;
        propertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, (PropertyValuesHolder[])object);
        object = new ScaleProvider$1(view, f7, f8);
        propertyValuesHolder.addListener((Animator.AnimatorListener)object);
        return propertyValuesHolder;
    }

    public Animator createAppear(ViewGroup viewGroup, View view) {
        boolean bl2 = this.growing;
        if (bl2) {
            float f5 = this.incomingStartScale;
            float f6 = this.incomingEndScale;
            return ScaleProvider.createScaleAnimator(view, f5, f6);
        }
        float f7 = this.outgoingEndScale;
        float f8 = this.outgoingStartScale;
        return ScaleProvider.createScaleAnimator(view, f7, f8);
    }

    public Animator createDisappear(ViewGroup viewGroup, View view) {
        boolean bl2 = this.scaleOnDisappear;
        if (!bl2) {
            return null;
        }
        bl2 = this.growing;
        if (bl2) {
            float f5 = this.outgoingStartScale;
            float f6 = this.outgoingEndScale;
            return ScaleProvider.createScaleAnimator(view, f5, f6);
        }
        float f7 = this.incomingEndScale;
        float f8 = this.incomingStartScale;
        return ScaleProvider.createScaleAnimator(view, f7, f8);
    }

    public float getIncomingEndScale() {
        return this.incomingEndScale;
    }

    public float getIncomingStartScale() {
        return this.incomingStartScale;
    }

    public float getOutgoingEndScale() {
        return this.outgoingEndScale;
    }

    public float getOutgoingStartScale() {
        return this.outgoingStartScale;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    public boolean isScaleOnDisappear() {
        return this.scaleOnDisappear;
    }

    public void setGrowing(boolean bl2) {
        this.growing = bl2;
    }

    public void setIncomingEndScale(float f5) {
        this.incomingEndScale = f5;
    }

    public void setIncomingStartScale(float f5) {
        this.incomingStartScale = f5;
    }

    public void setOutgoingEndScale(float f5) {
        this.outgoingEndScale = f5;
    }

    public void setOutgoingStartScale(float f5) {
        this.outgoingStartScale = f5;
    }

    public void setScaleOnDisappear(boolean bl2) {
        this.scaleOnDisappear = bl2;
    }
}

