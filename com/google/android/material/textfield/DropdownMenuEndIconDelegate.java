/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.AutoCompleteTextView
 *  android.widget.AutoCompleteTextView$OnDismissListener
 *  android.widget.EditText
 *  android.widget.Spinner
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$1;
import com.google.android.material.textfield.EditTextUtils;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.f;
import com.google.android.material.textfield.g;
import com.google.android.material.textfield.h;
import com.google.android.material.textfield.i;
import com.google.android.material.textfield.j;
import com.google.android.material.textfield.k;
import com.google.android.material.textfield.l;

class DropdownMenuEndIconDelegate
extends EndIconDelegate {
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 67;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = true;
    private AccessibilityManager accessibilityManager;
    private final int animationFadeInDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final View.OnClickListener onIconClickListener;
    private final Q1 touchExplorationStateChangeListener;

    public DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        int n3;
        Object object = new i(this);
        this.onIconClickListener = object;
        object = new j(this);
        this.onEditTextFocusChangeListener = object;
        this.touchExplorationStateChangeListener = object = new k(this);
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
        object = endCompoundLayout.getContext();
        int n4 = R$attr.motionDurationShort3;
        this.animationFadeInDuration = n3 = MotionUtils.resolveThemeDuration((Context)object, n4, 67);
        object = endCompoundLayout.getContext();
        n4 = R$attr.motionDurationShort3;
        this.animationFadeOutDuration = n3 = MotionUtils.resolveThemeDuration((Context)object, n4, 50);
        endCompoundLayout = endCompoundLayout.getContext();
        n3 = R$attr.motionEasingLinearInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        endCompoundLayout = MotionUtils.resolveThemeInterpolator((Context)endCompoundLayout, n3, timeInterpolator);
        this.animationFadeInterpolator = endCompoundLayout;
    }

    public static /* synthetic */ void a(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        dropdownMenuEndIconDelegate.lambda$afterEditTextChanged$3();
    }

    public static /* synthetic */ ValueAnimator access$000(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        return dropdownMenuEndIconDelegate.fadeInAnim;
    }

    public static /* synthetic */ void b(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, boolean bl2) {
        dropdownMenuEndIconDelegate.lambda$new$2(bl2);
    }

    public static /* synthetic */ void c(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, ValueAnimator valueAnimator) {
        dropdownMenuEndIconDelegate.lambda$getAlphaAnimator$6(valueAnimator);
    }

    private static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText object) {
        boolean bl2 = object instanceof AutoCompleteTextView;
        if (bl2) {
            return (AutoCompleteTextView)object;
        }
        object = new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        throw object;
    }

    public static /* synthetic */ void d(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view, boolean bl2) {
        dropdownMenuEndIconDelegate.lambda$new$1(view, bl2);
    }

    public static /* synthetic */ boolean e(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view, MotionEvent motionEvent) {
        return dropdownMenuEndIconDelegate.lambda$setUpDropdownShowHideBehavior$4(view, motionEvent);
    }

    public static /* synthetic */ void f(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        dropdownMenuEndIconDelegate.lambda$setUpDropdownShowHideBehavior$5();
    }

    public static /* synthetic */ void g(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, View view) {
        dropdownMenuEndIconDelegate.lambda$new$0(view);
    }

    private ValueAnimator getAlphaAnimator(int n3, float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        TimeInterpolator timeInterpolator = this.animationFadeInterpolator;
        object.setInterpolator(timeInterpolator);
        long l2 = n3;
        object.setDuration(l2);
        f f5 = new f(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)f5);
        return object;
    }

    private void initAnimators() {
        ValueAnimator valueAnimator;
        int n3 = this.animationFadeInDuration;
        int n4 = 2;
        float[] fArray = new float[n4];
        fArray[0] = 0.0f;
        fArray[1] = 1.0f;
        this.fadeInAnim = valueAnimator = this.getAlphaAnimator(n3, fArray);
        n3 = this.animationFadeOutDuration;
        Object object = new float[n4];
        object[0] = 1.0f;
        object[1] = 0.0f;
        this.fadeOutAnim = valueAnimator = this.getAlphaAnimator(n3, (float)object);
        object = (Object)new DropdownMenuEndIconDelegate$1;
        object(this);
        valueAnimator.addListener((Animator.AnimatorListener)object);
    }

    private boolean isDropdownPopupActive() {
        long l2;
        long l3 = System.currentTimeMillis();
        long l4 = this.dropdownPopupActivatedAt;
        long l7 = (l3 -= l4) - (l4 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object < 0 || (object = (l2 = l3 - (l4 = 300L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0;
        return bl2;
    }

    private /* synthetic */ void lambda$afterEditTextChanged$3() {
        boolean bl2 = this.autoCompleteTextView.isPopupShowing();
        this.setEndIconChecked(bl2);
        this.dropdownPopupDirty = bl2;
    }

    private /* synthetic */ void lambda$getAlphaAnimator$6(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setAlpha(f5);
    }

    private /* synthetic */ void lambda$new$0(View view) {
        this.showHideDropdown();
    }

    private /* synthetic */ void lambda$new$1(View view, boolean bl2) {
        this.editTextHasFocus = bl2;
        this.refreshIconState();
        if (!bl2) {
            this.setEndIconChecked(false);
            this.dropdownPopupDirty = false;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void lambda$new$2(boolean bl2) {
        boolean bl3;
        Object object = this.autoCompleteTextView;
        if (object != null && !(bl3 = EditTextUtils.isEditable((EditText)object))) {
            void var1_4;
            object = this.endIconView;
            if (bl2) {
                int n3 = 2;
            } else {
                boolean bl4 = true;
            }
            object.setImportantForAccessibility((int)var1_4);
        }
    }

    private /* synthetic */ boolean lambda$setUpDropdownShowHideBehavior$4(View view, MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getAction();
        if (n4 == (n3 = 1)) {
            n4 = (int)(this.isDropdownPopupActive() ? 1 : 0);
            if (n4 != 0) {
                this.dropdownPopupDirty = false;
            }
            this.showHideDropdown();
            this.updateDropdownPopupDirty();
        }
        return false;
    }

    private /* synthetic */ void lambda$setUpDropdownShowHideBehavior$5() {
        this.updateDropdownPopupDirty();
        this.setEndIconChecked(false);
    }

    private void setEndIconChecked(boolean bl2) {
        boolean bl3 = this.isEndIconChecked;
        if (bl3 != bl2) {
            this.isEndIconChecked = bl2;
            this.fadeInAnim.cancel();
            ValueAnimator valueAnimator = this.fadeOutAnim;
            valueAnimator.start();
        }
    }

    private void setUpDropdownShowHideBehavior() {
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        Object object = new g(this);
        autoCompleteTextView.setOnTouchListener((View.OnTouchListener)object);
        boolean bl2 = IS_LOLLIPOP;
        if (bl2) {
            autoCompleteTextView = this.autoCompleteTextView;
            object = new h(this);
            autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener)object);
        }
        this.autoCompleteTextView.setThreshold(0);
    }

    private void showHideDropdown() {
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView == null) {
            return;
        }
        boolean bl2 = this.isDropdownPopupActive();
        if (bl2) {
            this.dropdownPopupDirty = false;
        }
        if (!(bl2 = this.dropdownPopupDirty)) {
            bl2 = IS_LOLLIPOP;
            if (bl2) {
                bl2 = this.isEndIconChecked ^ true;
                this.setEndIconChecked(bl2);
            } else {
                this.isEndIconChecked = bl2 = this.isEndIconChecked ^ true;
                this.refreshIconState();
            }
            bl2 = this.isEndIconChecked;
            if (bl2) {
                this.autoCompleteTextView.requestFocus();
                autoCompleteTextView = this.autoCompleteTextView;
                autoCompleteTextView.showDropDown();
            } else {
                autoCompleteTextView = this.autoCompleteTextView;
                autoCompleteTextView.dismissDropDown();
            }
        } else {
            this.dropdownPopupDirty = false;
        }
    }

    private void updateDropdownPopupDirty() {
        long l2;
        this.dropdownPopupDirty = true;
        this.dropdownPopupActivatedAt = l2 = System.currentTimeMillis();
    }

    public void afterEditTextChanged(Editable object) {
        object = this.accessibilityManager;
        boolean bl2 = object.isTouchExplorationEnabled();
        if (bl2 && (bl2 = EditTextUtils.isEditable((EditText)(object = this.autoCompleteTextView))) && !(bl2 = (object = this.endIconView).hasFocus())) {
            object = this.autoCompleteTextView;
            object.dismissDropDown();
        }
        object = this.autoCompleteTextView;
        l l2 = new l(this);
        object.post((Runnable)l2);
    }

    public int getIconContentDescriptionResId() {
        return R$string.exposed_dropdown_menu_content_description;
    }

    public int getIconDrawableResId() {
        int n3 = IS_LOLLIPOP;
        n3 = n3 != 0 ? R$drawable.mtrl_dropdown_arrow : R$drawable.mtrl_ic_arrow_drop_down;
        return n3;
    }

    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onEditTextFocusChangeListener;
    }

    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    public Q1 getTouchExplorationStateChangeListener() {
        return this.touchExplorationStateChangeListener;
    }

    public boolean isBoxBackgroundModeSupported(int n3) {
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isIconActivable() {
        return true;
    }

    public boolean isIconActivated() {
        return this.editTextHasFocus;
    }

    public boolean isIconCheckable() {
        return true;
    }

    public boolean isIconChecked() {
        return this.isEndIconChecked;
    }

    public void onEditTextAttached(EditText object) {
        Object object2 = DropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(object);
        this.autoCompleteTextView = object2;
        this.setUpDropdownShowHideBehavior();
        object2 = this.textInputLayout;
        ((TextInputLayout)((Object)object2)).setErrorIconDrawable(null);
        boolean bl2 = EditTextUtils.isEditable(object);
        if (!bl2 && (bl2 = (object = this.accessibilityManager).isTouchExplorationEnabled())) {
            object = this.endIconView;
            object2 = ViewCompat.a;
            int n3 = 2;
            object.setImportantForAccessibility(n3);
        }
        this.textInputLayout.setEndIconVisible(true);
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        int n3;
        object = this.autoCompleteTextView;
        int n4 = EditTextUtils.isEditable((EditText)object);
        if (n4 == 0) {
            object = Spinner.class.getName();
            c2.l((CharSequence)object);
        }
        if ((n4 = Build.VERSION.SDK_INT) >= (n3 = 26)) {
            object = c2.a;
            n4 = (int)(g2.b((AccessibilityNodeInfo)object) ? 1 : 0);
        } else {
            n4 = (int)(c2.e(4) ? 1 : 0);
        }
        if (n4 != 0) {
            n4 = 0;
            object = null;
            c2.q(null);
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view = this.accessibilityManager;
        int n3 = view.isEnabled();
        if (n3 != 0 && (n3 = EditTextUtils.isEditable((EditText)(view = this.autoCompleteTextView))) == 0) {
            n3 = accessibilityEvent.getEventType();
            int n4 = 32768;
            int n7 = 1;
            if ((n3 == n4 || (n3 = accessibilityEvent.getEventType()) == (n4 = 8)) && (n3 = (int)(this.isEndIconChecked ? 1 : 0)) != 0 && (n3 = (int)((view = this.autoCompleteTextView).isPopupShowing() ? 1 : 0)) == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                view = null;
            }
            int n8 = accessibilityEvent.getEventType();
            if (n8 == n7 || n3 != 0) {
                this.showHideDropdown();
                this.updateDropdownPopupDirty();
            }
        }
    }

    public void setUp() {
        AccessibilityManager accessibilityManager;
        this.initAnimators();
        this.accessibilityManager = accessibilityManager = (AccessibilityManager)this.context.getSystemService("accessibility");
    }

    public boolean shouldTintIconOnError() {
        return true;
    }

    public void tearDown() {
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            boolean bl2 = IS_LOLLIPOP;
            if (bl2) {
                autoCompleteTextView = this.autoCompleteTextView;
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }
}

