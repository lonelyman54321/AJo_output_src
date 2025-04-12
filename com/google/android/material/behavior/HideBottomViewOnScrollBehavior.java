/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewPropertyAnimator
 */
package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.R$attr;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior$1;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener;
import com.google.android.material.motion.MotionUtils;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior
extends CoordinatorLayout$Behavior {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    private static final int ENTER_ANIM_DURATION_ATTR = 0;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = 0;
    private static final int EXIT_ANIM_DURATION_ATTR = 0;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;
    private final LinkedHashSet onScrollStateChangedListeners;

    static {
        ENTER_ANIM_DURATION_ATTR = R$attr.motionDurationLong2;
        EXIT_ANIM_DURATION_ATTR = R$attr.motionDurationMedium4;
        ENTER_EXIT_ANIM_EASING_ATTR = R$attr.motionEasingEmphasizedInterpolator;
    }

    public HideBottomViewOnScrollBehavior() {
        LinkedHashSet linkedHashSet;
        this.onScrollStateChangedListeners = linkedHashSet = new LinkedHashSet();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    public HideBottomViewOnScrollBehavior(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        super();
        this.onScrollStateChangedListeners = object;
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    public static /* synthetic */ ViewPropertyAnimator access$002(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, ViewPropertyAnimator viewPropertyAnimator) {
        hideBottomViewOnScrollBehavior.currentAnimator = viewPropertyAnimator;
        return viewPropertyAnimator;
    }

    private void animateChildTo(View view, int n3, long l2, TimeInterpolator timeInterpolator) {
        view = view.animate();
        float f5 = n3;
        view = view.translationY(f5).setInterpolator(timeInterpolator).setDuration(l2);
        HideBottomViewOnScrollBehavior$1 hideBottomViewOnScrollBehavior$1 = new HideBottomViewOnScrollBehavior$1(this);
        view = view.setListener((Animator.AnimatorListener)hideBottomViewOnScrollBehavior$1);
        this.currentAnimator = view;
    }

    private void updateCurrentState(View view, int n3) {
        boolean bl2;
        this.currentState = n3;
        Iterator iterator = ((AbstractCollection)this.onScrollStateChangedListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            HideBottomViewOnScrollBehavior$OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener = (HideBottomViewOnScrollBehavior$OnScrollStateChangedListener)iterator.next();
            int n4 = this.currentState;
            hideBottomViewOnScrollBehavior$OnScrollStateChangedListener.onStateChanged(view, n4);
        }
    }

    public void addOnScrollStateChangedListener(HideBottomViewOnScrollBehavior$OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener) {
        ((AbstractCollection)this.onScrollStateChangedListeners).add(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        ((AbstractCollection)this.onScrollStateChangedListeners).clear();
    }

    public boolean isScrolledDown() {
        int n3 = this.currentState;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isScrolledUp() {
        int n3 = this.currentState;
        int n4 = 2;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int n3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n4 = view.getMeasuredHeight();
        int n7 = marginLayoutParams.bottomMargin;
        this.height = n4 += n7;
        marginLayoutParams = view.getContext();
        n4 = ENTER_ANIM_DURATION_ATTR;
        this.enterAnimDuration = n7 = MotionUtils.resolveThemeDuration((Context)marginLayoutParams, n4, 225);
        marginLayoutParams = view.getContext();
        n4 = EXIT_ANIM_DURATION_ATTR;
        this.exitAnimDuration = n7 = MotionUtils.resolveThemeDuration((Context)marginLayoutParams, n4, 175);
        marginLayoutParams = view.getContext();
        n4 = ENTER_EXIT_ANIM_EASING_ATTR;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        marginLayoutParams = MotionUtils.resolveThemeInterpolator((Context)marginLayoutParams, n4, timeInterpolator);
        this.enterAnimInterpolator = marginLayoutParams;
        marginLayoutParams = view.getContext();
        timeInterpolator = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        marginLayoutParams = MotionUtils.resolveThemeInterpolator((Context)marginLayoutParams, n4, timeInterpolator);
        this.exitAnimInterpolator = marginLayoutParams;
        return super.onLayoutChild(coordinatorLayout, view, n3);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        if (n4 > 0) {
            this.slideDown(view);
        } else if (n4 < 0) {
            this.slideUp(view);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3, int n4) {
        int n7 = 2;
        n7 = n3 == n7 ? 1 : 0;
        return n7 != 0;
    }

    public void removeOnScrollStateChangedListener(HideBottomViewOnScrollBehavior$OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener) {
        ((AbstractCollection)this.onScrollStateChangedListeners).remove(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(View view, int n3) {
        this.additionalHiddenOffsetY = n3;
        int n4 = this.currentState;
        int n7 = 1;
        if (n4 == n7) {
            n4 = this.height + n3;
            float f5 = n4;
            view.setTranslationY(f5);
        }
    }

    public void slideDown(View view) {
        this.slideDown(view, true);
    }

    public void slideDown(View view, boolean bl2) {
        int n3 = this.isScrolledDown();
        if (n3 != 0) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.updateCurrentState(view, 1);
        n3 = this.height;
        int n4 = this.additionalHiddenOffsetY;
        int n7 = n3 + n4;
        if (bl2) {
            int n8 = this.exitAnimDuration;
            long l2 = n8;
            TimeInterpolator timeInterpolator = this.exitAnimInterpolator;
            this.animateChildTo(view, n7, l2, timeInterpolator);
        } else {
            float f5 = n7;
            view.setTranslationY(f5);
        }
    }

    public void slideUp(View view) {
        this.slideUp(view, true);
    }

    public void slideUp(View view, boolean bl2) {
        int n3 = this.isScrolledUp();
        if (n3 != 0) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        n3 = 2;
        this.updateCurrentState(view, n3);
        if (bl2) {
            int n4 = this.enterAnimDuration;
            long l2 = n4;
            TimeInterpolator timeInterpolator = this.enterAnimInterpolator;
            this.animateChildTo(view, 0, l2, timeInterpolator);
        } else {
            float f5 = 0.0f;
            view.setTranslationY(f5);
        }
    }
}

