/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 *  android.view.View
 */
package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ExpandCollapseAnimationHelper$1;
import com.google.android.material.internal.ExpandCollapseAnimationHelper$2;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ViewUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExpandCollapseAnimationHelper {
    private ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final List endAnchoredViews;
    private final View expandedView;
    private int expandedViewOffsetY;
    private final List listeners;

    public ExpandCollapseAnimationHelper(View object, View view) {
        this.collapsedView = object;
        this.expandedView = view;
        this.listeners = object;
        super();
        this.endAnchoredViews = object;
    }

    public static /* synthetic */ void a(ExpandCollapseAnimationHelper expandCollapseAnimationHelper, Rect rect, ValueAnimator valueAnimator) {
        expandCollapseAnimationHelper.lambda$getExpandCollapseAnimator$0(rect, valueAnimator);
    }

    public static /* synthetic */ View access$000(ExpandCollapseAnimationHelper expandCollapseAnimationHelper) {
        return expandCollapseAnimationHelper.expandedView;
    }

    private void addListeners(Animator animator2, List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter)object.next();
            animator2.addListener((Animator.AnimatorListener)animatorListenerAdapter);
        }
    }

    private AnimatorSet getAnimatorSet(boolean bl2) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator2 = this.getExpandCollapseAnimator(bl2);
        Animator animator3 = this.getExpandedViewChildrenAlphaAnimator(bl2);
        Animator animator4 = this.getEndAnchoredViewsTranslateAnimator(bl2);
        Animator[] animatorArray = new Animator[]{animator2, animator3, animator4};
        animatorSet.playTogether(animatorArray);
        return animatorSet;
    }

    private Animator getEndAnchoredViewsTranslateAnimator(boolean bl2) {
        int n3 = this.expandedView.getLeft();
        int n4 = this.collapsedView.getLeft();
        n3 -= n4;
        n4 = this.collapsedView.getRight();
        int n7 = this.expandedView.getRight();
        float f5 = n4 - n7 + n3;
        Object object = new float[]{f5, 0.0f};
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object);
        object = MultiViewUpdateListener.translationXListener(this.endAnchoredViews);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        long l2 = this.duration;
        valueAnimator.setDuration(l2);
        object = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TimeInterpolator timeInterpolator = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)object);
        valueAnimator.setInterpolator(timeInterpolator);
        return valueAnimator;
    }

    private Animator getExpandCollapseAnimator(boolean bl2) {
        View view = this.collapsedView;
        int n3 = this.collapsedViewOffsetY;
        view = ViewUtils.calculateRectFromBounds(view, n3);
        Object object = this.expandedView;
        int n4 = this.expandedViewOffsetY;
        object = ViewUtils.calculateRectFromBounds(object, n4);
        Rect rect = new Rect((Rect)view);
        RectEvaluator rectEvaluator = new RectEvaluator(rect);
        int n7 = 2;
        Object[] objectArray = new Object[n7];
        objectArray[0] = view;
        int n8 = 1;
        objectArray[n8] = object;
        view = ValueAnimator.ofObject((TypeEvaluator)rectEvaluator, (Object[])objectArray);
        object = new jf0_1(this, rect);
        view.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object = this.additionalUpdateListener;
        if (object != null) {
            view.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        }
        long l2 = this.duration;
        view.setDuration(l2);
        object = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TimeInterpolator timeInterpolator = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)object);
        view.setInterpolator(timeInterpolator);
        return view;
    }

    private Animator getExpandedViewChildrenAlphaAnimator(boolean bl2) {
        Object object = ViewUtils.getChildren(this.expandedView);
        Object object2 = new float[]{0.0f, 1.0f};
        object2 = ValueAnimator.ofFloat((float[])object2);
        object = MultiViewUpdateListener.alphaListener((Collection)object);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        long l2 = this.duration;
        object2.setDuration(l2);
        object = AnimationUtils.LINEAR_INTERPOLATOR;
        TimeInterpolator timeInterpolator = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)object);
        object2.setInterpolator(timeInterpolator);
        return object2;
    }

    private /* synthetic */ void lambda$getExpandCollapseAnimator$0(Rect rect, ValueAnimator valueAnimator) {
        ViewUtils.setBoundsFromRect(this.expandedView, rect);
    }

    public ExpandCollapseAnimationHelper addEndAnchoredViews(Collection collection) {
        this.endAnchoredViews.addAll(collection);
        return this;
    }

    public ExpandCollapseAnimationHelper addEndAnchoredViews(View ... viewArray) {
        Collections.addAll(this.endAnchoredViews, viewArray);
        return this;
    }

    public ExpandCollapseAnimationHelper addListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.listeners.add(animatorListenerAdapter);
        return this;
    }

    public Animator getCollapseAnimator() {
        AnimatorSet animatorSet = this.getAnimatorSet(false);
        Object object = new ExpandCollapseAnimationHelper$2(this);
        animatorSet.addListener((Animator.AnimatorListener)object);
        object = this.listeners;
        this.addListeners((Animator)animatorSet, (List)object);
        return animatorSet;
    }

    public Animator getExpandAnimator() {
        AnimatorSet animatorSet = this.getAnimatorSet(true);
        Object object = new ExpandCollapseAnimationHelper$1(this);
        animatorSet.addListener((Animator.AnimatorListener)object);
        object = this.listeners;
        this.addListeners((Animator)animatorSet, (List)object);
        return animatorSet;
    }

    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.additionalUpdateListener = animatorUpdateListener;
        return this;
    }

    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int n3) {
        this.collapsedViewOffsetY = n3;
        return this;
    }

    public ExpandCollapseAnimationHelper setDuration(long l2) {
        this.duration = l2;
        return this;
    }

    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int n3) {
        this.expandedViewOffsetY = n3;
        return this;
    }
}

