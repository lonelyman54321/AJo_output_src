/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.text.Editable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.ClearTextEndIconDelegate$1;
import com.google.android.material.textfield.ClearTextEndIconDelegate$2;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.a;
import com.google.android.material.textfield.b;
import com.google.android.material.textfield.c;
import com.google.android.material.textfield.d;
import com.google.android.material.textfield.e;

class ClearTextEndIconDelegate
extends EndIconDelegate {
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private static final int DEFAULT_ANIMATION_FADE_DURATION = 100;
    private static final int DEFAULT_ANIMATION_SCALE_DURATION = 150;
    private final int animationFadeDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationScaleDuration;
    private final TimeInterpolator animationScaleInterpolator;
    private EditText editText;
    private AnimatorSet iconInAnim;
    private ValueAnimator iconOutAnim;
    private final View.OnFocusChangeListener onFocusChangeListener;
    private final View.OnClickListener onIconClickListener;

    public ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        int n3;
        Object object = new a(this);
        this.onIconClickListener = object;
        object = new b(this);
        this.onFocusChangeListener = object;
        object = endCompoundLayout.getContext();
        int n4 = R$attr.motionDurationShort3;
        this.animationFadeDuration = n3 = MotionUtils.resolveThemeDuration((Context)object, n4, 100);
        object = endCompoundLayout.getContext();
        n4 = R$attr.motionDurationShort3;
        this.animationScaleDuration = n3 = MotionUtils.resolveThemeDuration((Context)object, n4, 150);
        object = endCompoundLayout.getContext();
        n4 = R$attr.motionEasingLinearInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        object = MotionUtils.resolveThemeInterpolator((Context)object, n4, timeInterpolator);
        this.animationFadeInterpolator = object;
        endCompoundLayout = endCompoundLayout.getContext();
        n3 = R$attr.motionEasingEmphasizedInterpolator;
        TimeInterpolator timeInterpolator2 = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        endCompoundLayout = MotionUtils.resolveThemeInterpolator((Context)endCompoundLayout, n3, timeInterpolator2);
        this.animationScaleInterpolator = endCompoundLayout;
    }

    public static /* synthetic */ void a(ClearTextEndIconDelegate clearTextEndIconDelegate, View view) {
        clearTextEndIconDelegate.lambda$new$0(view);
    }

    private void animateIcon(boolean bl2) {
        AnimatorSet animatorSet;
        boolean bl3;
        EndCompoundLayout endCompoundLayout = this.endLayout;
        boolean bl4 = endCompoundLayout.isEndIconVisible();
        if (bl4 == bl2) {
            bl4 = true;
        } else {
            bl4 = false;
            endCompoundLayout = null;
        }
        if (bl2 && !(bl3 = (animatorSet = this.iconInAnim).isRunning())) {
            this.iconOutAnim.cancel();
            AnimatorSet animatorSet2 = this.iconInAnim;
            animatorSet2.start();
            if (bl4) {
                animatorSet2 = this.iconInAnim;
                animatorSet2.end();
            }
        } else if (!bl2) {
            this.iconInAnim.cancel();
            ValueAnimator valueAnimator = this.iconOutAnim;
            valueAnimator.start();
            if (bl4) {
                valueAnimator = this.iconOutAnim;
                valueAnimator.end();
            }
        }
    }

    public static /* synthetic */ void b(ClearTextEndIconDelegate clearTextEndIconDelegate, View view, boolean bl2) {
        clearTextEndIconDelegate.lambda$new$1(view, bl2);
    }

    public static /* synthetic */ void c(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
        clearTextEndIconDelegate.lambda$getAlphaAnimator$3(valueAnimator);
    }

    public static /* synthetic */ void d(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
        clearTextEndIconDelegate.lambda$getScaleAnimator$4(valueAnimator);
    }

    public static /* synthetic */ void e(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        clearTextEndIconDelegate.lambda$tearDown$2();
    }

    private ValueAnimator getAlphaAnimator(float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        Object object2 = this.animationFadeInterpolator;
        object.setInterpolator(object2);
        long l2 = this.animationFadeDuration;
        object.setDuration(l2);
        object2 = new c(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return object;
    }

    private ValueAnimator getScaleAnimator() {
        Object object = new float[]{0.8f, 1.0f};
        object = ValueAnimator.ofFloat((float[])object);
        Object object2 = this.animationScaleInterpolator;
        object.setInterpolator(object2);
        long l2 = this.animationScaleDuration;
        object.setDuration(l2);
        object2 = new e(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return object;
    }

    private void initAnimators() {
        AnimatorSet animatorSet;
        Object object = this.getScaleAnimator();
        int n3 = 2;
        Object object2 = new float[n3];
        object2[0] = 0.0f;
        object2[1] = 1.0f;
        object2 = this.getAlphaAnimator((float)object2);
        this.iconInAnim = animatorSet = new AnimatorSet();
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = object;
        animatorArray[1] = (Animator)object2;
        animatorSet.playTogether(animatorArray);
        object = this.iconInAnim;
        object2 = (Object)new ClearTextEndIconDelegate$1;
        object2(this);
        object.addListener((Animator.AnimatorListener)object2);
        Object object3 = object = (Object)new float[n3];
        object3[0] = (ValueAnimator)1.0f;
        object3[1] = (ValueAnimator)0.0f;
        this.iconOutAnim = object = this.getAlphaAnimator((float[])object);
        ClearTextEndIconDelegate$2 clearTextEndIconDelegate$2 = new ClearTextEndIconDelegate$2(this);
        object.addListener((Animator.AnimatorListener)clearTextEndIconDelegate$2);
    }

    private /* synthetic */ void lambda$getAlphaAnimator$3(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setAlpha(f5);
    }

    private /* synthetic */ void lambda$getScaleAnimator$4(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setScaleX(f5);
        this.endIconView.setScaleY(f5);
    }

    private /* synthetic */ void lambda$new$0(View view) {
        view = this.editText;
        if (view == null) {
            return;
        }
        if ((view = view.getText()) != null) {
            view.clear();
        }
        this.refreshIconState();
    }

    private /* synthetic */ void lambda$new$1(View view, boolean bl2) {
        boolean bl3 = this.shouldBeVisible();
        this.animateIcon(bl3);
    }

    private /* synthetic */ void lambda$tearDown$2() {
        this.animateIcon(true);
    }

    private boolean shouldBeVisible() {
        int n3;
        Object object = this.editText;
        if (object != null && ((n3 = object.hasFocus()) != 0 || (n3 = (object = this.endIconView).hasFocus()) != 0) && (n3 = (object = this.editText.getText()).length()) > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public void afterEditTextChanged(Editable object) {
        object = this.endLayout.getSuffixText();
        if (object != null) {
            return;
        }
        boolean bl2 = this.shouldBeVisible();
        this.animateIcon(bl2);
    }

    public int getIconContentDescriptionResId() {
        return R$string.clear_text_end_icon_content_description;
    }

    public int getIconDrawableResId() {
        return R$drawable.mtrl_ic_cancel;
    }

    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    public void onEditTextAttached(EditText object) {
        this.editText = object;
        object = this.textInputLayout;
        boolean bl2 = this.shouldBeVisible();
        ((TextInputLayout)((Object)object)).setEndIconVisible(bl2);
    }

    public void onSuffixVisibilityChanged(boolean bl2) {
        CharSequence charSequence = this.endLayout.getSuffixText();
        if (charSequence == null) {
            return;
        }
        this.animateIcon(bl2);
    }

    public void setUp() {
        this.initAnimators();
    }

    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            d d2 = new d(this);
            editText.post((Runnable)d2);
        }
    }
}

