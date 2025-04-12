/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.content.Context
 *  android.util.Property
 *  android.view.View
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Property;
import android.view.View;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.AnimatorTracker;
import com.google.android.material.floatingactionbutton.BaseMotionStrategy$1;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.MotionStrategy;
import java.util.ArrayList;
import java.util.List;

abstract class BaseMotionStrategy
implements MotionStrategy {
    private final Context context;
    private MotionSpec defaultMotionSpec;
    private final ExtendedFloatingActionButton fab;
    private final ArrayList listeners;
    private MotionSpec motionSpec;
    private final AnimatorTracker tracker;

    public BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        ArrayList arrayList;
        this.listeners = arrayList = new ArrayList();
        this.fab = extendedFloatingActionButton;
        extendedFloatingActionButton = extendedFloatingActionButton.getContext();
        this.context = extendedFloatingActionButton;
        this.tracker = animatorTracker;
    }

    public static /* synthetic */ ExtendedFloatingActionButton access$000(BaseMotionStrategy baseMotionStrategy) {
        return baseMotionStrategy.fab;
    }

    public final void addAnimationListener(Animator.AnimatorListener animatorListener) {
        this.listeners.add(animatorListener);
    }

    public AnimatorSet createAnimator() {
        MotionSpec motionSpec = this.getCurrentMotionSpec();
        return this.createAnimator(motionSpec);
    }

    public AnimatorSet createAnimator(MotionSpec motionSpec) {
        Property property;
        ExtendedFloatingActionButton extendedFloatingActionButton;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string2 = "opacity";
        boolean bl2 = motionSpec.hasPropertyValues(string2);
        if (bl2) {
            extendedFloatingActionButton = this.fab;
            property = View.ALPHA;
            string2 = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(string2);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "scale")) {
            extendedFloatingActionButton = this.fab;
            property = View.SCALE_Y;
            extendedFloatingActionButton = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(extendedFloatingActionButton);
            extendedFloatingActionButton = this.fab;
            property = View.SCALE_X;
            string2 = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(string2);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "width")) {
            extendedFloatingActionButton = this.fab;
            property = ExtendedFloatingActionButton.WIDTH;
            string2 = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(string2);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "height")) {
            extendedFloatingActionButton = this.fab;
            property = ExtendedFloatingActionButton.HEIGHT;
            string2 = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(string2);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "paddingStart")) {
            extendedFloatingActionButton = this.fab;
            property = ExtendedFloatingActionButton.PADDING_START;
            string2 = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(string2);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "paddingEnd")) {
            extendedFloatingActionButton = this.fab;
            property = ExtendedFloatingActionButton.PADDING_END;
            string2 = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(string2);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "labelOpacity")) {
            extendedFloatingActionButton = this.fab;
            Class<Float> clazz = Float.class;
            String string3 = "LABEL_OPACITY_PROPERTY";
            property = new BaseMotionStrategy$1(this, clazz, string3);
            motionSpec = motionSpec.getAnimator(string2, extendedFloatingActionButton, property);
            arrayList.add(motionSpec);
        }
        motionSpec = new AnimatorSet();
        AnimatorSetCompat.playTogether((AnimatorSet)motionSpec, arrayList);
        return motionSpec;
    }

    public final MotionSpec getCurrentMotionSpec() {
        MotionSpec motionSpec = this.motionSpec;
        if (motionSpec != null) {
            return motionSpec;
        }
        motionSpec = this.defaultMotionSpec;
        if (motionSpec == null) {
            motionSpec = this.context;
            int n3 = this.getDefaultMotionSpecResource();
            this.defaultMotionSpec = motionSpec = MotionSpec.createFromResource((Context)motionSpec, n3);
        }
        motionSpec = this.defaultMotionSpec;
        motionSpec.getClass();
        return motionSpec;
    }

    public final List getListeners() {
        return this.listeners;
    }

    public MotionSpec getMotionSpec() {
        return this.motionSpec;
    }

    public void onAnimationCancel() {
        this.tracker.clear();
    }

    public void onAnimationEnd() {
        this.tracker.clear();
    }

    public void onAnimationStart(Animator animator2) {
        this.tracker.onNextAnimationStart(animator2);
    }

    public final void removeAnimationListener(Animator.AnimatorListener animatorListener) {
        this.listeners.remove(animatorListener);
    }

    public final void setMotionSpec(MotionSpec motionSpec) {
        this.motionSpec = motionSpec;
    }
}

