/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.TransitionUtils;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

abstract class MaterialVisibility
extends Visibility {
    private final List additionalAnimatorProviders;
    private final VisibilityAnimatorProvider primaryAnimatorProvider;
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    public MaterialVisibility(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        ArrayList arrayList;
        this.additionalAnimatorProviders = arrayList = new ArrayList();
        this.primaryAnimatorProvider = visibilityAnimatorProvider;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider2;
    }

    private static void addAnimatorIfNeeded(List list, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean bl2) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        visibilityAnimatorProvider = bl2 ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (visibilityAnimatorProvider != null) {
            list.add(visibilityAnimatorProvider);
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean bl2) {
        boolean bl3;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Object object = this.primaryAnimatorProvider;
        MaterialVisibility.addAnimatorIfNeeded(arrayList, (VisibilityAnimatorProvider)object, viewGroup, view, bl2);
        object = this.secondaryAnimatorProvider;
        MaterialVisibility.addAnimatorIfNeeded(arrayList, (VisibilityAnimatorProvider)object, viewGroup, view, bl2);
        object = this.additionalAnimatorProviders.iterator();
        while (bl3 = object.hasNext()) {
            VisibilityAnimatorProvider visibilityAnimatorProvider = (VisibilityAnimatorProvider)object.next();
            MaterialVisibility.addAnimatorIfNeeded(arrayList, visibilityAnimatorProvider, viewGroup, view, bl2);
        }
        viewGroup = viewGroup.getContext();
        this.maybeApplyThemeValues((Context)viewGroup, bl2);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(Context context, boolean bl2) {
        int n3 = this.getDurationThemeAttrResId(bl2);
        TransitionUtils.maybeApplyThemeDuration(this, context, n3);
        n3 = this.getEasingThemeAttrResId(bl2);
        TimeInterpolator timeInterpolator = this.getDefaultEasingInterpolator(bl2);
        TransitionUtils.maybeApplyThemeInterpolator(this, context, n3, timeInterpolator);
    }

    public void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean bl2) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getDurationThemeAttrResId(boolean bl2) {
        return 0;
    }

    public int getEasingThemeAttrResId(boolean bl2) {
        return 0;
    }

    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public boolean isSeekingSupported() {
        return true;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        return this.createAnimator(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        return this.createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }
}

