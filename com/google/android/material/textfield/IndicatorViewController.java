/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.text.TextUtils
 *  android.util.Property
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.IndicatorViewController$1;
import com.google.android.material.textfield.IndicatorViewController$2;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

final class IndicatorViewController {
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    static final int COUNTER_INDEX = 2;
    private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
    private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;
    private Animator captionAnimator;
    private FrameLayout captionArea;
    private int captionDisplayed;
    private final int captionFadeInAnimationDuration;
    private final TimeInterpolator captionFadeInAnimationInterpolator;
    private final int captionFadeOutAnimationDuration;
    private final TimeInterpolator captionFadeOutAnimationInterpolator;
    private int captionToShow;
    private final int captionTranslationYAnimationDuration;
    private final TimeInterpolator captionTranslationYAnimationInterpolator;
    private final float captionTranslationYPx;
    private final Context context;
    private boolean errorEnabled;
    private CharSequence errorText;
    private int errorTextAppearance;
    private TextView errorView;
    private int errorViewAccessibilityLiveRegion;
    private CharSequence errorViewContentDescription;
    private ColorStateList errorViewTextColor;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private TextView helperTextView;
    private ColorStateList helperTextViewTextColor;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final TextInputLayout textInputView;
    private Typeface typeface;

    public IndicatorViewController(TextInputLayout textInputLayout) {
        float f5;
        Context context;
        this.context = context = textInputLayout.getContext();
        this.textInputView = textInputLayout;
        textInputLayout = context.getResources();
        int n3 = R$dimen.design_textinput_caption_translate_y;
        this.captionTranslationYPx = f5 = (float)textInputLayout.getDimensionPixelSize(n3);
        int n4 = R$attr.motionDurationShort4;
        this.captionTranslationYAnimationDuration = n4 = MotionUtils.resolveThemeDuration(context, n4, 217);
        n4 = R$attr.motionDurationMedium4;
        n3 = 167;
        this.captionFadeInAnimationDuration = n4 = MotionUtils.resolveThemeDuration(context, n4, n3);
        n4 = R$attr.motionDurationShort4;
        this.captionFadeOutAnimationDuration = n4 = MotionUtils.resolveThemeDuration(context, n4, n3);
        n4 = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        textInputLayout = MotionUtils.resolveThemeInterpolator(context, n4, timeInterpolator);
        this.captionTranslationYAnimationInterpolator = textInputLayout;
        n4 = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        textInputLayout = MotionUtils.resolveThemeInterpolator(context, n4, timeInterpolator);
        this.captionFadeInAnimationInterpolator = textInputLayout;
        n4 = R$attr.motionEasingLinearInterpolator;
        textInputLayout = MotionUtils.resolveThemeInterpolator(context, n4, timeInterpolator);
        this.captionFadeOutAnimationInterpolator = textInputLayout;
    }

    public static /* synthetic */ int access$002(IndicatorViewController indicatorViewController, int n3) {
        indicatorViewController.captionDisplayed = n3;
        return n3;
    }

    public static /* synthetic */ Animator access$102(IndicatorViewController indicatorViewController, Animator animator2) {
        indicatorViewController.captionAnimator = animator2;
        return animator2;
    }

    public static /* synthetic */ TextView access$200(IndicatorViewController indicatorViewController) {
        return indicatorViewController.errorView;
    }

    public static /* synthetic */ TextInputLayout access$300(IndicatorViewController indicatorViewController) {
        return indicatorViewController.textInputView;
    }

    private boolean canAdjustIndicatorPadding() {
        boolean bl2;
        LinearLayout linearLayout = this.indicatorArea;
        if (linearLayout != null && (linearLayout = this.textInputView.getEditText()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            linearLayout = null;
        }
        return bl2;
    }

    private void createCaptionAnimators(List list, boolean bl2, TextView textView, int n3, int n4, int n7) {
        if (textView != null && bl2 && (n3 == n7 || n3 == n4)) {
            ObjectAnimator objectAnimator;
            if (n7 == n3) {
                bl2 = true;
            } else {
                bl2 = false;
                objectAnimator = null;
            }
            objectAnimator = this.createCaptionOpacityAnimator(textView, bl2);
            if (n3 == n7 && n4 != 0) {
                int n8 = this.captionFadeOutAnimationDuration;
                long l2 = n8;
                objectAnimator.setStartDelay(l2);
            }
            list.add(objectAnimator);
            if (n7 == n3 && n4 != 0) {
                objectAnimator = this.createCaptionTranslationYAnimator(textView);
                int n10 = this.captionFadeOutAnimationDuration;
                long l3 = n10;
                objectAnimator.setStartDelay(l3);
                list.add(objectAnimator);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean bl2) {
        float f5;
        int n3;
        if (bl2) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        Property property = View.ALPHA;
        int n4 = 1;
        float[] fArray = new float[n4];
        fArray[0] = f5;
        textView = ObjectAnimator.ofFloat((Object)textView, (Property)property, (float[])fArray);
        n3 = bl2 ? this.captionFadeInAnimationDuration : this.captionFadeOutAnimationDuration;
        long l2 = n3;
        textView.setDuration(l2);
        TimeInterpolator timeInterpolator = bl2 ? this.captionFadeInAnimationInterpolator : this.captionFadeOutAnimationInterpolator;
        textView.setInterpolator(timeInterpolator);
        return textView;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        Property property = View.TRANSLATION_Y;
        float f5 = -this.captionTranslationYPx;
        float[] fArray = new float[]{f5, 0.0f};
        textView = ObjectAnimator.ofFloat((Object)textView, (Property)property, (float[])fArray);
        long l2 = this.captionTranslationYAnimationDuration;
        textView.setDuration(l2);
        property = this.captionTranslationYAnimationInterpolator;
        textView.setInterpolator((TimeInterpolator)property);
        return textView;
    }

    private TextView getCaptionViewFromDisplayState(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                return null;
            }
            return this.helperTextView;
        }
        return this.errorView;
    }

    private int getIndicatorPadding(boolean bl2, int n3, int n4) {
        if (bl2) {
            Resources resources = this.context.getResources();
            n4 = resources.getDimensionPixelSize(n3);
        }
        return n4;
    }

    private boolean isCaptionStateError(int n3) {
        Object object;
        int n4 = 1;
        if (n3 != n4 || (object = this.errorView) == null || (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = this.errorText)) ? 1 : 0)) != 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    private boolean isCaptionStateHelperText(int n3) {
        Object object;
        int n4 = 2;
        if (n3 == n4 && (object = this.helperTextView) != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = this.helperText)) ? 1 : 0)) == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    private void setCaptionViewVisibilities(int n3, int n4) {
        float f5;
        int n7;
        TextView textView;
        if (n3 == n4) {
            return;
        }
        if (n4 != 0 && (textView = this.getCaptionViewFromDisplayState(n4)) != null) {
            textView.setVisibility(0);
            n7 = 1065353216;
            f5 = 1.0f;
            textView.setAlpha(f5);
        }
        if (n3 != 0 && (textView = this.getCaptionViewFromDisplayState(n3)) != null) {
            textView.setVisibility(4);
            n7 = 1;
            f5 = Float.MIN_VALUE;
            if (n3 == n7) {
                n3 = 0;
                textView.setText(null);
            }
        }
        this.captionDisplayed = n4;
    }

    private void setTextViewTypeface(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void setViewGroupGoneIfEmpty(ViewGroup viewGroup, int n3) {
        if (n3 == 0) {
            n3 = 8;
            viewGroup.setVisibility(n3);
        }
    }

    private boolean shouldAnimateCaptionView(TextView object, CharSequence charSequence) {
        boolean bl2;
        int n3;
        TextInputLayout textInputLayout = this.textInputView;
        int n4 = textInputLayout.isLaidOut();
        if (!(n4 == 0 || (n4 = (textInputLayout = this.textInputView).isEnabled()) == 0 || (n4 = this.captionToShow) == (n3 = this.captionDisplayed) && object != null && (bl2 = TextUtils.equals((CharSequence)(object = object.getText()), (CharSequence)charSequence)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void updateCaptionViewsVisibility(int n3, int n4, boolean bl2) {
        IndicatorViewController indicatorViewController = this;
        boolean bl3 = bl2;
        if (n3 == n4) {
            return;
        }
        if (bl2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.captionAnimator = animatorSet;
            ArrayList arrayList = new ArrayList();
            int n7 = this.helperTextEnabled;
            TextView textView = this.helperTextView;
            this.createCaptionAnimators(arrayList, n7 != 0, textView, 2, n3, n4);
            n7 = this.errorEnabled;
            textView = this.errorView;
            this.createCaptionAnimators(arrayList, n7 != 0, textView, 1, n3, n4);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            textView = this.getCaptionViewFromDisplayState(n3);
            TextView textView2 = this.getCaptionViewFromDisplayState(n4);
            n7 = n4;
            IndicatorViewController$1 indicatorViewController$1 = new IndicatorViewController$1(this, n4, textView, n3, textView2);
            animatorSet.addListener((Animator.AnimatorListener)indicatorViewController$1);
            animatorSet.start();
        } else {
            this.setCaptionViewVisibilities(n3, n4);
        }
        indicatorViewController.textInputView.updateEditTextBackground();
        indicatorViewController.textInputView.updateLabelState(bl3);
        indicatorViewController.textInputView.updateTextInputBoxState();
    }

    public void addIndicator(TextView textView, int n3) {
        int n4;
        LinearLayout linearLayout = this.indicatorArea;
        int n7 = -2;
        if (linearLayout == null && (linearLayout = this.captionArea) == null) {
            Context context = this.context;
            this.indicatorArea = linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout = this.textInputView;
            context = this.indicatorArea;
            int n8 = -1;
            linearLayout.addView((View)context, n8, n7);
            context = this.context;
            linearLayout = new FrameLayout(context);
            this.captionArea = linearLayout;
            float f5 = 1.0f;
            linearLayout = new LinearLayout.LayoutParams(0, n7, f5);
            context = this.indicatorArea;
            FrameLayout frameLayout = this.captionArea;
            context.addView((View)frameLayout, (ViewGroup.LayoutParams)linearLayout);
            linearLayout = this.textInputView.getEditText();
            if (linearLayout != null) {
                this.adjustIndicatorPadding();
            }
        }
        if ((n3 = (int)(this.isCaptionView(n3) ? 1 : 0)) != 0) {
            this.captionArea.setVisibility(0);
            FrameLayout frameLayout = this.captionArea;
            frameLayout.addView((View)textView);
        } else {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n7, n7);
            linearLayout = this.indicatorArea;
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded = n4 = this.indicatorsAdded + 1;
    }

    public void adjustIndicatorPadding() {
        int n3 = this.canAdjustIndicatorPadding();
        if (n3 != 0) {
            EditText editText = this.textInputView.getEditText();
            boolean bl2 = MaterialResources.isFontScaleAtLeast1_3(this.context);
            LinearLayout linearLayout = this.indicatorArea;
            int n4 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
            int n7 = editText.getPaddingStart();
            n4 = this.getIndicatorPadding(bl2, n4, n7);
            n7 = R$dimen.material_helper_text_font_1_3_padding_top;
            Resources resources = this.context.getResources();
            int n8 = R$dimen.material_helper_text_default_padding_top;
            int n10 = resources.getDimensionPixelSize(n8);
            n7 = this.getIndicatorPadding(bl2, n7, n10);
            n10 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
            n3 = editText.getPaddingEnd();
            n3 = this.getIndicatorPadding(bl2, n10, n3);
            bl2 = false;
            linearLayout.setPaddingRelative(n4, n7, n3, 0);
        }
    }

    public void cancelCaptionAnimator() {
        Animator animator2 = this.captionAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public boolean errorIsDisplayed() {
        int n3 = this.captionDisplayed;
        return this.isCaptionStateError(n3);
    }

    public boolean errorShouldBeShown() {
        int n3 = this.captionToShow;
        return this.isCaptionStateError(n3);
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.errorViewAccessibilityLiveRegion;
    }

    public CharSequence getErrorContentDescription() {
        return this.errorViewContentDescription;
    }

    public CharSequence getErrorText() {
        return this.errorText;
    }

    public int getErrorViewCurrentTextColor() {
        TextView textView = this.errorView;
        int n3 = textView != null ? textView.getCurrentTextColor() : -1;
        return n3;
    }

    public ColorStateList getErrorViewTextColors() {
        Object object = this.errorView;
        object = object != null ? object.getTextColors() : null;
        return object;
    }

    public CharSequence getHelperText() {
        return this.helperText;
    }

    public View getHelperTextView() {
        return this.helperTextView;
    }

    public ColorStateList getHelperTextViewColors() {
        Object object = this.helperTextView;
        object = object != null ? object.getTextColors() : null;
        return object;
    }

    public int getHelperTextViewCurrentTextColor() {
        TextView textView = this.helperTextView;
        int n3 = textView != null ? textView.getCurrentTextColor() : -1;
        return n3;
    }

    public boolean helperTextIsDisplayed() {
        int n3 = this.captionDisplayed;
        return this.isCaptionStateHelperText(n3);
    }

    public boolean helperTextShouldBeShown() {
        int n3 = this.captionToShow;
        return this.isCaptionStateHelperText(n3);
    }

    public void hideError() {
        CharSequence charSequence = null;
        this.errorText = null;
        this.cancelCaptionAnimator();
        int n3 = this.captionDisplayed;
        int n4 = 1;
        if (n3 == n4) {
            n3 = (int)(this.helperTextEnabled ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(charSequence = this.helperText)) ? 1 : 0)) == 0) {
                this.captionToShow = n3 = 2;
            } else {
                n3 = 0;
                charSequence = null;
                this.captionToShow = 0;
            }
        }
        n3 = this.captionDisplayed;
        n4 = this.captionToShow;
        TextView textView = this.errorView;
        boolean bl2 = this.shouldAnimateCaptionView(textView, "");
        this.updateCaptionViewsVisibility(n3, n4, bl2);
    }

    public void hideHelperText() {
        this.cancelCaptionAnimator();
        int n3 = this.captionDisplayed;
        int n4 = 2;
        if (n3 == n4) {
            n4 = 0;
            this.captionToShow = 0;
        }
        n4 = this.captionToShow;
        TextView textView = this.helperTextView;
        boolean bl2 = this.shouldAnimateCaptionView(textView, "");
        this.updateCaptionViewsVisibility(n3, n4, bl2);
    }

    public boolean isCaptionView(int n3) {
        int n4 = 1;
        if (n3 != 0 && n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    public boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    public void removeIndicator(TextView textView, int n3) {
        int n4;
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.indicatorArea;
        if (linearLayout == null) {
            return;
        }
        if ((n3 = (int)(this.isCaptionView(n3) ? 1 : 0)) != 0 && (frameLayout = this.captionArea) != null) {
            frameLayout.removeView((View)textView);
        } else {
            frameLayout = this.indicatorArea;
            frameLayout.removeView((View)textView);
        }
        this.indicatorsAdded = n4 = this.indicatorsAdded + -1;
        frameLayout = this.indicatorArea;
        this.setViewGroupGoneIfEmpty((ViewGroup)frameLayout, n4);
    }

    public void setErrorAccessibilityLiveRegion(int n3) {
        this.errorViewAccessibilityLiveRegion = n3;
        TextView textView = this.errorView;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(n3);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.errorViewContentDescription = charSequence;
        TextView textView = this.errorView;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean bl2) {
        boolean bl3 = this.errorEnabled;
        if (bl3 == bl2) {
            return;
        }
        this.cancelCaptionAnimator();
        bl3 = false;
        TextInputLayout textInputLayout = null;
        if (bl2) {
            Context context = this.context;
            Object object = new AppCompatTextView(context);
            this.errorView = object;
            int n3 = R$id.textinput_error;
            object.setId(n3);
            object = this.errorView;
            n3 = 5;
            object.setTextAlignment(n3);
            object = this.typeface;
            if (object != null) {
                context = this.errorView;
                context.setTypeface((Typeface)object);
            }
            int n4 = this.errorTextAppearance;
            this.setErrorTextAppearance(n4);
            object = this.errorViewTextColor;
            this.setErrorViewTextColor((ColorStateList)object);
            object = this.errorViewContentDescription;
            this.setErrorContentDescription((CharSequence)object);
            n4 = this.errorViewAccessibilityLiveRegion;
            this.setErrorAccessibilityLiveRegion(n4);
            object = this.errorView;
            n3 = 4;
            object.setVisibility(n3);
            object = this.errorView;
            this.addIndicator((TextView)object, 0);
        } else {
            this.hideError();
            TextView textView = this.errorView;
            this.removeIndicator(textView, 0);
            bl3 = false;
            this.errorView = null;
            this.textInputView.updateEditTextBackground();
            textInputLayout = this.textInputView;
            textInputLayout.updateTextInputBoxState();
        }
        this.errorEnabled = bl2;
    }

    public void setErrorTextAppearance(int n3) {
        this.errorTextAppearance = n3;
        TextView textView = this.errorView;
        if (textView != null) {
            TextInputLayout textInputLayout = this.textInputView;
            textInputLayout.setTextAppearanceCompatWithErrorFallback(textView, n3);
        }
    }

    public void setErrorViewTextColor(ColorStateList colorStateList) {
        this.errorViewTextColor = colorStateList;
        TextView textView = this.errorView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextAppearance(int n3) {
        this.helperTextTextAppearance = n3;
        TextView textView = this.helperTextView;
        if (textView != null) {
            Hm3.f(textView, n3);
        }
    }

    public void setHelperTextEnabled(boolean n3) {
        int n4 = (int)(this.helperTextEnabled ? 1 : 0);
        if (n4 == n3) {
            return;
        }
        this.cancelCaptionAnimator();
        n4 = 1;
        if (n3) {
            Object object = this.context;
            Object object2 = new AppCompatTextView((Context)object);
            this.helperTextView = object2;
            int n7 = R$id.textinput_helper_text;
            object2.setId(n7);
            object2 = this.helperTextView;
            n7 = 5;
            object2.setTextAlignment(n7);
            object2 = this.typeface;
            if (object2 != null) {
                object = this.helperTextView;
                object.setTypeface((Typeface)object2);
            }
            object2 = this.helperTextView;
            n7 = 4;
            object2.setVisibility(n7);
            object2 = this.helperTextView;
            object = ViewCompat.a;
            object2.setAccessibilityLiveRegion(n4);
            int n8 = this.helperTextTextAppearance;
            this.setHelperTextAppearance(n8);
            object2 = this.helperTextViewTextColor;
            this.setHelperTextViewTextColor((ColorStateList)object2);
            object2 = this.helperTextView;
            this.addIndicator((TextView)object2, n4);
            TextView textView = this.helperTextView;
            object2 = new IndicatorViewController$2(this);
            textView.setAccessibilityDelegate((View.AccessibilityDelegate)object2);
        } else {
            this.hideHelperText();
            TextView textView = this.helperTextView;
            this.removeIndicator(textView, n4);
            n4 = 0;
            this.helperTextView = null;
            this.textInputView.updateEditTextBackground();
            TextInputLayout textInputLayout = this.textInputView;
            textInputLayout.updateTextInputBoxState();
        }
        this.helperTextEnabled = n3;
    }

    public void setHelperTextViewTextColor(ColorStateList colorStateList) {
        this.helperTextViewTextColor = colorStateList;
        TextView textView = this.helperTextView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTypefaces(Typeface typeface) {
        Typeface typeface2 = this.typeface;
        if (typeface != typeface2) {
            this.typeface = typeface;
            typeface2 = this.errorView;
            this.setTextViewTypeface((TextView)typeface2, typeface);
            typeface2 = this.helperTextView;
            this.setTextViewTypeface((TextView)typeface2, typeface);
        }
    }

    public void showError(CharSequence charSequence) {
        this.cancelCaptionAnimator();
        this.errorText = charSequence;
        TextView textView = this.errorView;
        textView.setText(charSequence);
        int n3 = this.captionDisplayed;
        int n4 = 1;
        if (n3 != n4) {
            this.captionToShow = n4;
        }
        n4 = this.captionToShow;
        TextView textView2 = this.errorView;
        boolean bl2 = this.shouldAnimateCaptionView(textView2, charSequence);
        this.updateCaptionViewsVisibility(n3, n4, bl2);
    }

    public void showHelper(CharSequence charSequence) {
        this.cancelCaptionAnimator();
        this.helperText = charSequence;
        TextView textView = this.helperTextView;
        textView.setText(charSequence);
        int n3 = this.captionDisplayed;
        int n4 = 2;
        if (n3 != n4) {
            this.captionToShow = n4;
        }
        n4 = this.captionToShow;
        TextView textView2 = this.helperTextView;
        boolean bl2 = this.shouldAnimateCaptionView(textView2, charSequence);
        this.updateCaptionViewsVisibility(n3, n4, bl2);
    }
}

