/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.EndCompoundLayout$1;
import com.google.android.material.textfield.EndCompoundLayout$2;
import com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.IconHelper;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener;
import com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

class EndCompoundLayout
extends LinearLayout {
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet endIconChangedListeners;
    private final EndCompoundLayout$EndIconDelegates endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout$OnEditTextAttachedListener onEditTextAttachedListener;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;
    private Q1 touchExplorationStateChangeListener;

    public EndCompoundLayout(TextInputLayout object, Tn3 tn3) {
        Object object2;
        Context context = object.getContext();
        super(context);
        this.endIconMode = 0;
        Object object3 = new LinkedHashSet();
        this.endIconChangedListeners = object3;
        object3 = new EndCompoundLayout$1(this);
        this.editTextWatcher = object3;
        this.onEditTextAttachedListener = object3 = new EndCompoundLayout$2(this);
        this.accessibilityManager = object2 = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.textInputLayout = object;
        int n3 = 8;
        this.setVisibility(n3);
        this.setOrientation(0);
        int n4 = -2;
        int n7 = -1;
        super(n4, n7, 0x800005);
        this.setLayoutParams((ViewGroup.LayoutParams)context);
        Object object4 = this.getContext();
        super(object4);
        this.endIconFrame = context;
        context.setVisibility(n3);
        super(n4, n7);
        context.setLayoutParams((ViewGroup.LayoutParams)object2);
        object2 = LayoutInflater.from((Context)this.getContext());
        int n8 = R$id.text_input_error_icon;
        object4 = this.createIconView((ViewGroup)this, (LayoutInflater)object2, n8);
        this.errorIconView = object4;
        n4 = R$id.text_input_end_icon;
        object2 = this.createIconView((ViewGroup)context, (LayoutInflater)object2, n4);
        this.endIconView = object2;
        Object object5 = new EndCompoundLayout$EndIconDelegates(this, tn3);
        this.endIconDelegates = object5;
        Context context2 = this.getContext();
        object5 = new AppCompatTextView(context2);
        this.suffixTextView = object5;
        this.initErrorIconView(tn3);
        this.initEndIconView(tn3);
        this.initSuffixTextView(tn3);
        context.addView((View)object2);
        this.addView((View)object5);
        this.addView((View)context);
        this.addView((View)object4);
        object.addOnEditTextAttachedListener((TextInputLayout$OnEditTextAttachedListener)object3);
        super(this);
        this.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
    }

    public static /* synthetic */ EditText access$000(EndCompoundLayout endCompoundLayout) {
        return endCompoundLayout.editText;
    }

    public static /* synthetic */ EditText access$002(EndCompoundLayout endCompoundLayout, EditText editText) {
        endCompoundLayout.editText = editText;
        return editText;
    }

    public static /* synthetic */ TextWatcher access$100(EndCompoundLayout endCompoundLayout) {
        return endCompoundLayout.editTextWatcher;
    }

    public static /* synthetic */ void access$200(EndCompoundLayout endCompoundLayout, EndIconDelegate endIconDelegate) {
        endCompoundLayout.setOnFocusChangeListenersIfNeeded(endIconDelegate);
    }

    public static /* synthetic */ void access$300(EndCompoundLayout endCompoundLayout) {
        endCompoundLayout.addTouchExplorationStateChangeListenerIfNeeded();
    }

    public static /* synthetic */ void access$400(EndCompoundLayout endCompoundLayout) {
        endCompoundLayout.removeTouchExplorationStateChangeListenerIfNeeded();
    }

    private void addTouchExplorationStateChangeListenerIfNeeded() {
        Object object = this.touchExplorationStateChangeListener;
        if (object != null && (object = this.accessibilityManager) != null) {
            object = ViewCompat.a;
            boolean bl2 = this.isAttachedToWindow();
            if (bl2) {
                object = this.accessibilityManager;
                Q1 q1 = this.touchExplorationStateChangeListener;
                R1 r1 = new R1(q1);
                object.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)r1);
            }
        }
    }

    private CheckableImageButton createIconView(ViewGroup object, LayoutInflater layoutInflater, int n3) {
        int n4 = R$layout.design_text_input_end_icon;
        object = (CheckableImageButton)layoutInflater.inflate(n4, object, false);
        object.setId(n3);
        IconHelper.setCompatRippleBackgroundIfNeeded((CheckableImageButton)((Object)object));
        layoutInflater = this.getContext();
        boolean bl2 = MaterialResources.isFontScaleAtLeast1_3((Context)layoutInflater);
        if (bl2) {
            layoutInflater = (ViewGroup.MarginLayoutParams)object.getLayoutParams();
            layoutInflater.setMarginStart(0);
        }
        return object;
    }

    private void dispatchOnEndIconChanged(int n3) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this.endIconChangedListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            TextInputLayout$OnEndIconChangedListener textInputLayout$OnEndIconChangedListener = (TextInputLayout$OnEndIconChangedListener)iterator.next();
            TextInputLayout textInputLayout = this.textInputLayout;
            textInputLayout$OnEndIconChangedListener.onEndIconChanged(textInputLayout, n3);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        EndCompoundLayout$EndIconDelegates endCompoundLayout$EndIconDelegates = this.endIconDelegates;
        int n3 = EndCompoundLayout$EndIconDelegates.access$500(endCompoundLayout$EndIconDelegates);
        if (n3 == 0) {
            n3 = endIconDelegate.getIconDrawableResId();
        }
        return n3;
    }

    private void initEndIconView(Tn3 object) {
        int n3;
        int n4;
        Context context;
        int bl2 = R$styleable.TextInputLayout_passwordToggleEnabled;
        boolean bl3 = ((Tn3)object).b.hasValue(bl2);
        int n7 = 0;
        int n8 = -1;
        TypedArray typedArray = ((Tn3)object).b;
        if (!bl3) {
            int n10;
            boolean bl4;
            int n14 = R$styleable.TextInputLayout_endIconTint;
            boolean bl5 = typedArray.hasValue(n14);
            if (bl5) {
                context = this.getContext();
                n4 = R$styleable.TextInputLayout_endIconTint;
                context = MaterialResources.getColorStateList(context, (Tn3)object, n4);
                this.endIconTintList = context;
            }
            if (bl4 = typedArray.hasValue(n10 = R$styleable.TextInputLayout_endIconTintMode)) {
                int n16 = R$styleable.TextInputLayout_endIconTintMode;
                n16 = typedArray.getInt(n16, n8);
                context = ViewUtils.parseTintMode(n16, null);
                this.endIconTintMode = context;
            }
        }
        int n17 = R$styleable.TextInputLayout_endIconMode;
        boolean bl6 = typedArray.hasValue(n17);
        n4 = 0;
        if (bl6) {
            n3 = R$styleable.TextInputLayout_endIconMode;
            n3 = typedArray.getInt(n3, 0);
            this.setEndIconMode(n3);
            n3 = R$styleable.TextInputLayout_endIconContentDescription;
            n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
            if (n3 != 0) {
                n3 = R$styleable.TextInputLayout_endIconContentDescription;
                object = typedArray.getText(n3);
                this.setEndIconContentDescription((CharSequence)object);
            }
            n3 = R$styleable.TextInputLayout_endIconCheckable;
            boolean bl7 = true;
            n3 = (int)(typedArray.getBoolean(n3, bl7) ? 1 : 0);
            this.setEndIconCheckable(n3 != 0);
        } else {
            int n18 = R$styleable.TextInputLayout_passwordToggleEnabled;
            boolean bl8 = typedArray.hasValue(n18);
            if (bl8) {
                int n19 = R$styleable.TextInputLayout_passwordToggleTint;
                boolean bl9 = typedArray.hasValue(n19);
                if (bl9) {
                    context = this.getContext();
                    int n20 = R$styleable.TextInputLayout_passwordToggleTint;
                    object = MaterialResources.getColorStateList(context, (Tn3)object, n20);
                    this.endIconTintList = object;
                }
                n3 = R$styleable.TextInputLayout_passwordToggleTintMode;
                if ((n3 = (int)(typedArray.hasValue(n3) ? 1 : 0)) != 0) {
                    n3 = R$styleable.TextInputLayout_passwordToggleTintMode;
                    n3 = typedArray.getInt(n3, n8);
                    object = ViewUtils.parseTintMode(n3, null);
                    this.endIconTintMode = object;
                }
                n3 = R$styleable.TextInputLayout_passwordToggleEnabled;
                n3 = (int)(typedArray.getBoolean(n3, false) ? 1 : 0);
                this.setEndIconMode(n3);
                n3 = R$styleable.TextInputLayout_passwordToggleContentDescription;
                object = typedArray.getText(n3);
                this.setEndIconContentDescription((CharSequence)object);
            }
        }
        n3 = R$styleable.TextInputLayout_endIconMinSize;
        context = this.getResources();
        n7 = R$dimen.mtrl_min_touch_target_size;
        int n21 = context.getDimensionPixelSize(n7);
        n3 = typedArray.getDimensionPixelSize(n3, n21);
        this.setEndIconMinSize(n3);
        n3 = R$styleable.TextInputLayout_endIconScaleType;
        n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.TextInputLayout_endIconScaleType;
            n3 = typedArray.getInt(n3, n8);
            object = IconHelper.convertScaleType(n3);
            this.setEndIconScaleType((ImageView.ScaleType)object);
        }
    }

    private void initErrorIconView(Tn3 object) {
        int n3;
        Object object2;
        int n4 = R$styleable.TextInputLayout_errorIconTint;
        TypedArray typedArray = object.b;
        if ((n4 = (int)(typedArray.hasValue(n4) ? 1 : 0)) != 0) {
            object2 = this.getContext();
            n3 = R$styleable.TextInputLayout_errorIconTint;
            object2 = MaterialResources.getColorStateList(object2, object, n3);
            this.errorIconTintList = object2;
        }
        n4 = R$styleable.TextInputLayout_errorIconTintMode;
        typedArray = object.b;
        if ((n4 = (int)(typedArray.hasValue(n4) ? 1 : 0)) != 0) {
            n4 = R$styleable.TextInputLayout_errorIconTintMode;
            n4 = typedArray.getInt(n4, -1);
            object2 = ViewUtils.parseTintMode(n4, null);
            this.errorIconTintMode = object2;
        }
        n4 = R$styleable.TextInputLayout_errorIconDrawable;
        if ((n4 = (int)(typedArray.hasValue(n4) ? 1 : 0)) != 0) {
            n4 = R$styleable.TextInputLayout_errorIconDrawable;
            object = object.b(n4);
            this.setErrorIconDrawable((Drawable)object);
        }
        object = this.errorIconView;
        object2 = this.getResources();
        n3 = R$string.error_icon_content_description;
        object2 = object2.getText(n3);
        object.setContentDescription((CharSequence)object2);
        object = this.errorIconView;
        object2 = ViewCompat.a;
        object.setImportantForAccessibility(2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(Tn3 object) {
        this.suffixTextView.setVisibility(8);
        TextView textView = this.suffixTextView;
        int n3 = R$id.textinput_suffix_text;
        textView.setId(n3);
        textView = this.suffixTextView;
        int n4 = -2;
        float f5 = 80.0f;
        Object object2 = new LinearLayout.LayoutParams(n4, n4, f5);
        textView.setLayoutParams((ViewGroup.LayoutParams)object2);
        textView = this.suffixTextView;
        object2 = ViewCompat.a;
        n3 = 1;
        textView.setAccessibilityLiveRegion(n3);
        int n7 = R$styleable.TextInputLayout_suffixTextAppearance;
        object2 = ((Tn3)object).b;
        n4 = 0;
        n7 = object2.getResourceId(n7, 0);
        this.setSuffixTextAppearance(n7);
        n7 = R$styleable.TextInputLayout_suffixTextColor;
        object2 = ((Tn3)object).b;
        n7 = (int)(object2.hasValue(n7) ? 1 : 0);
        if (n7 != 0) {
            n7 = R$styleable.TextInputLayout_suffixTextColor;
            object = ((Tn3)object).a(n7);
            this.setSuffixTextColor((ColorStateList)object);
        }
        int n8 = R$styleable.TextInputLayout_suffixText;
        object = object2.getText(n8);
        this.setSuffixText((CharSequence)object);
    }

    private void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        Q1 q1 = this.touchExplorationStateChangeListener;
        if (q1 != null && (accessibilityManager = this.accessibilityManager) != null) {
            R1 r1 = new R1(q1);
            accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)r1);
        }
    }

    private void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        Object object = this.editText;
        if (object == null) {
            return;
        }
        object = endIconDelegate.getOnEditTextFocusChangeListener();
        if (object != null) {
            object = this.editText;
            View.OnFocusChangeListener onFocusChangeListener = endIconDelegate.getOnEditTextFocusChangeListener();
            object.setOnFocusChangeListener(onFocusChangeListener);
        }
        if ((object = endIconDelegate.getOnIconViewFocusChangeListener()) != null) {
            object = this.endIconView;
            endIconDelegate = endIconDelegate.getOnIconViewFocusChangeListener();
            object.setOnFocusChangeListener((View.OnFocusChangeListener)endIconDelegate);
        }
    }

    private void setUpDelegate(EndIconDelegate object) {
        ((EndIconDelegate)object).setUp();
        this.touchExplorationStateChangeListener = object = ((EndIconDelegate)object).getTouchExplorationStateChangeListener();
        this.addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(EndIconDelegate endIconDelegate) {
        this.removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean bl2) {
        Object object;
        if (bl2 && (object = this.getEndIconDrawable()) != null) {
            object = ut0_0.h(this.getEndIconDrawable()).mutate();
            int n3 = this.textInputLayout.getErrorCurrentTextColors();
            object.setTint(n3);
            CheckableImageButton checkableImageButton = this.endIconView;
            checkableImageButton.setImageDrawable((Drawable)object);
        } else {
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.endIconView;
            ColorStateList colorStateList = this.endIconTintList;
            PorterDuff.Mode mode = this.endIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    private void updateEndLayoutVisibility() {
        int n3;
        Object object = this.endIconFrame;
        CheckableImageButton checkableImageButton = this.endIconView;
        int n4 = checkableImageButton.getVisibility();
        int n7 = 8;
        if (n4 == 0 && (n4 = (int)(this.isErrorIconVisible() ? 1 : 0)) == 0) {
            n4 = 0;
            checkableImageButton = null;
        } else {
            n4 = 8;
        }
        object.setVisibility(n4);
        object = this.suffixText;
        if (object != null && (n3 = (int)(this.hintExpanded ? 1 : 0)) == 0) {
            n3 = 0;
            object = null;
        } else {
            n3 = 8;
        }
        n4 = (int)(this.isEndIconVisible() ? 1 : 0);
        if (n4 != 0 || (n4 = (int)(this.isErrorIconVisible() ? 1 : 0)) != 0 || n3 == 0) {
            n7 = 0;
        }
        this.setVisibility(n7);
    }

    private void updateErrorIconVisibility() {
        boolean bl2;
        Object object = this.getErrorIconDrawable();
        int n3 = 0;
        if (object != null && (bl2 = ((TextInputLayout)((Object)(object = this.textInputLayout))).isErrorEnabled()) && (bl2 = ((TextInputLayout)((Object)(object = this.textInputLayout))).shouldShowError())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        CheckableImageButton checkableImageButton = this.errorIconView;
        if (!bl2) {
            n3 = 8;
        }
        checkableImageButton.setVisibility(n3);
        this.updateEndLayoutVisibility();
        this.updateSuffixTextViewPadding();
        bl2 = this.hasEndIcon();
        if (!bl2) {
            object = this.textInputLayout;
            ((TextInputLayout)((Object)object)).updateDummyDrawables();
        }
    }

    private void updateSuffixTextVisibility() {
        int n3;
        Object object = this.suffixTextView;
        int n4 = object.getVisibility();
        CharSequence charSequence = this.suffixText;
        boolean bl2 = false;
        if (charSequence != null && (n3 = (int)(this.hintExpanded ? 1 : 0)) == 0) {
            n3 = 0;
            charSequence = null;
        } else {
            n3 = 8;
        }
        if (n4 != n3) {
            object = this.getEndIconDelegate();
            if (n3 == 0) {
                bl2 = true;
            }
            ((EndIconDelegate)object).onSuffixVisibilityChanged(bl2);
        }
        this.updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(n3);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(TextInputLayout$OnEndIconChangedListener textInputLayout$OnEndIconChangedListener) {
        ((AbstractCollection)this.endIconChangedListeners).add(textInputLayout$OnEndIconChangedListener);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        ((AbstractCollection)this.endIconChangedListeners).clear();
    }

    public CheckableImageButton getCurrentEndIconView() {
        boolean bl2 = this.isErrorIconVisible();
        if (bl2) {
            return this.errorIconView;
        }
        bl2 = this.hasEndIcon();
        if (bl2 && (bl2 = this.isEndIconVisible())) {
            return this.endIconView;
        }
        return null;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public EndIconDelegate getEndIconDelegate() {
        EndCompoundLayout$EndIconDelegates endCompoundLayout$EndIconDelegates = this.endIconDelegates;
        int n3 = this.endIconMode;
        return endCompoundLayout$EndIconDelegates.get(n3);
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public int getSuffixTextEndOffset() {
        int n3;
        Object object;
        int n4 = this.isEndIconVisible();
        if (n4 == 0 && (n4 = this.isErrorIconVisible()) == 0) {
            n4 = 0;
            Object var2_2 = null;
        } else {
            CheckableImageButton checkableImageButton = this.endIconView;
            n4 = checkableImageButton.getMeasuredWidth();
            object = (ViewGroup.MarginLayoutParams)this.endIconView.getLayoutParams();
            n3 = object.getMarginStart();
            n4 += n3;
        }
        object = ViewCompat.a;
        n3 = this.getPaddingEnd();
        return this.suffixTextView.getPaddingEnd() + n3 + n4;
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        int n3 = this.endIconMode;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        CheckableImageButton checkableImageButton;
        boolean bl2 = this.hasEndIcon();
        if (bl2 && (bl2 = (checkableImageButton = this.endIconView).isChecked())) {
            bl2 = true;
        } else {
            bl2 = false;
            checkableImageButton = null;
        }
        return bl2;
    }

    public boolean isEndIconVisible() {
        Object object = this.endIconFrame;
        int n3 = object.getVisibility();
        if (!n3 && !(n3 = (object = this.endIconView).getVisibility())) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public boolean isErrorIconVisible() {
        CheckableImageButton checkableImageButton = this.errorIconView;
        int n3 = checkableImageButton.getVisibility();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            checkableImageButton = null;
        }
        return n3 != 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        int n3 = this.endIconMode;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public void onHintStateChanged(boolean bl2) {
        this.hintExpanded = bl2;
        this.updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        this.updateErrorIconVisibility();
        this.refreshErrorIconDrawableState();
        this.refreshEndIconDrawableState();
        Object object = this.getEndIconDelegate();
        boolean bl2 = ((EndIconDelegate)object).shouldTintIconOnError();
        if (bl2) {
            object = this.textInputLayout;
            bl2 = ((TextInputLayout)((Object)object)).shouldShowError();
            this.tintEndIconOnError(bl2);
        }
    }

    public void refreshEndIconDrawableState() {
        TextInputLayout textInputLayout = this.textInputLayout;
        CheckableImageButton checkableImageButton = this.endIconView;
        ColorStateList colorStateList = this.endIconTintList;
        IconHelper.refreshIconDrawableState(textInputLayout, checkableImageButton, colorStateList);
    }

    public void refreshErrorIconDrawableState() {
        TextInputLayout textInputLayout = this.textInputLayout;
        CheckableImageButton checkableImageButton = this.errorIconView;
        ColorStateList colorStateList = this.errorIconTintList;
        IconHelper.refreshIconDrawableState(textInputLayout, checkableImageButton, colorStateList);
    }

    public void refreshIconState(boolean bl2) {
        boolean bl3;
        CheckableImageButton checkableImageButton;
        boolean bl4;
        CheckableImageButton checkableImageButton2;
        EndIconDelegate endIconDelegate = this.getEndIconDelegate();
        boolean bl5 = endIconDelegate.isIconCheckable();
        boolean bl6 = true;
        if (bl5 && (bl5 = (checkableImageButton2 = this.endIconView).isChecked()) != (bl4 = endIconDelegate.isIconChecked())) {
            checkableImageButton = this.endIconView;
            checkableImageButton.setChecked(bl5 ^= bl6);
            bl5 = true;
        } else {
            bl5 = false;
            checkableImageButton2 = null;
        }
        bl4 = endIconDelegate.isIconActivable();
        if (bl4 && (bl4 = (checkableImageButton = this.endIconView).isActivated()) != (bl3 = endIconDelegate.isIconActivated())) {
            bl3 = bl4 ^ true;
            this.setEndIconActivated(bl3);
        } else {
            bl6 = bl5;
        }
        if (bl2 || bl6) {
            this.refreshEndIconDrawableState();
        }
    }

    public void removeOnEndIconChangedListener(TextInputLayout$OnEndIconChangedListener textInputLayout$OnEndIconChangedListener) {
        ((AbstractCollection)this.endIconChangedListeners).remove(textInputLayout$OnEndIconChangedListener);
    }

    public void setEndIconActivated(boolean bl2) {
        this.endIconView.setActivated(bl2);
    }

    public void setEndIconCheckable(boolean bl2) {
        this.endIconView.setCheckable(bl2);
    }

    public void setEndIconContentDescription(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Resources resources = this.getResources();
            charSequence = resources.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setEndIconContentDescription(charSequence);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        Object object = this.getEndIconContentDescription();
        if (object != charSequence) {
            object = this.endIconView;
            object.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setEndIconDrawable(drawable2);
    }

    public void setEndIconDrawable(Drawable object) {
        CheckableImageButton checkableImageButton = this.endIconView;
        checkableImageButton.setImageDrawable((Drawable)object);
        if (object != null) {
            object = this.textInputLayout;
            checkableImageButton = this.endIconView;
            ColorStateList colorStateList = this.endIconTintList;
            PorterDuff.Mode mode = this.endIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
            this.refreshEndIconDrawableState();
        }
    }

    public void setEndIconMinSize(int n3) {
        if (n3 >= 0) {
            int n4 = this.endIconMinSize;
            if (n3 != n4) {
                this.endIconMinSize = n3;
                IconHelper.setIconMinSize(this.endIconView, n3);
                CheckableImageButton checkableImageButton = this.errorIconView;
                IconHelper.setIconMinSize(checkableImageButton, n3);
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("endIconSize cannot be less than 0");
        throw illegalArgumentException;
    }

    public void setEndIconMode(int n3) {
        Object object;
        boolean bl2;
        int n4 = this.endIconMode;
        if (n4 == n3) {
            return;
        }
        Object object2 = this.getEndIconDelegate();
        this.tearDownDelegate((EndIconDelegate)object2);
        n4 = this.endIconMode;
        this.endIconMode = n3;
        this.dispatchOnEndIconChanged(n4);
        n4 = 1;
        if (n3 != 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.setEndIconVisible(bl2);
        object = this.getEndIconDelegate();
        int n7 = this.getIconResId((EndIconDelegate)object);
        this.setEndIconDrawable(n7);
        n7 = ((EndIconDelegate)object).getIconContentDescriptionResId();
        this.setEndIconContentDescription(n7);
        n7 = (int)(((EndIconDelegate)object).isIconCheckable() ? 1 : 0);
        this.setEndIconCheckable(n7 != 0);
        TextInputLayout textInputLayout = this.textInputLayout;
        n7 = textInputLayout.getBoxBackgroundMode();
        n7 = (int)(((EndIconDelegate)object).isBoxBackgroundModeSupported(n7) ? 1 : 0);
        if (n7 != 0) {
            this.setUpDelegate((EndIconDelegate)object);
            Object object3 = ((EndIconDelegate)object).getOnIconClickListener();
            this.setEndIconOnClickListener((View.OnClickListener)object3);
            object3 = this.editText;
            if (object3 != null) {
                ((EndIconDelegate)object).onEditTextAttached((EditText)object3);
                this.setOnFocusChangeListenersIfNeeded((EndIconDelegate)object);
            }
            object3 = this.textInputLayout;
            object = this.endIconView;
            textInputLayout = this.endIconTintList;
            PorterDuff.Mode mode = this.endIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object3), (CheckableImageButton)((Object)object), (ColorStateList)textInputLayout, mode);
            this.refreshIconState(n4 != 0);
            return;
        }
        object = new StringBuilder("The current box background mode ");
        n7 = this.textInputLayout.getBoxBackgroundMode();
        ((StringBuilder)object).append(n7);
        ((StringBuilder)object).append(" is not supported by the end icon mode ");
        ((StringBuilder)object).append(n3);
        String string2 = ((StringBuilder)object).toString();
        object2 = new IllegalStateException(string2);
        throw object2;
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.endIconView;
        View.OnLongClickListener onLongClickListener = this.endIconOnLongClickListener;
        IconHelper.setIconOnClickListener(checkableImageButton, onClickListener, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        Object object = this.endIconTintList;
        if (object != colorStateList) {
            this.endIconTintList = colorStateList;
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.endIconView;
            PorterDuff.Mode mode = this.endIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        Object object = this.endIconTintMode;
        if (object != mode) {
            this.endIconTintMode = mode;
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.endIconView;
            ColorStateList colorStateList = this.endIconTintList;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setEndIconVisible(boolean bl2) {
        boolean bl3 = this.isEndIconVisible();
        if (bl3 != bl2) {
            void var1_4;
            TextInputLayout textInputLayout;
            CheckableImageButton checkableImageButton = this.endIconView;
            if (bl2) {
                boolean bl4 = false;
                textInputLayout = null;
            } else {
                int n3 = 8;
            }
            checkableImageButton.setVisibility((int)var1_4);
            this.updateEndLayoutVisibility();
            this.updateSuffixTextViewPadding();
            textInputLayout = this.textInputLayout;
            textInputLayout.updateDummyDrawables();
        }
    }

    public void setErrorIconDrawable(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setErrorIconDrawable(drawable2);
        this.refreshErrorIconDrawableState();
    }

    public void setErrorIconDrawable(Drawable object) {
        this.errorIconView.setImageDrawable((Drawable)object);
        this.updateErrorIconVisibility();
        object = this.textInputLayout;
        CheckableImageButton checkableImageButton = this.errorIconView;
        ColorStateList colorStateList = this.errorIconTintList;
        PorterDuff.Mode mode = this.errorIconTintMode;
        IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.errorIconView;
        View.OnLongClickListener onLongClickListener = this.errorIconOnLongClickListener;
        IconHelper.setIconOnClickListener(checkableImageButton, onClickListener, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Object object = this.errorIconTintList;
        if (object != colorStateList) {
            this.errorIconTintList = colorStateList;
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.errorIconView;
            PorterDuff.Mode mode = this.errorIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Object object = this.errorIconTintMode;
        if (object != mode) {
            this.errorIconTintMode = mode;
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.errorIconView;
            ColorStateList colorStateList = this.errorIconTintList;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Resources resources = this.getResources();
            charSequence = resources.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setPasswordVisibilityToggleDrawable(drawable2);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable2) {
        this.endIconView.setImageDrawable(drawable2);
    }

    public void setPasswordVisibilityToggleEnabled(boolean bl2) {
        int n3;
        int n4;
        if (bl2 && (n4 = this.endIconMode) != (n3 = 1)) {
            this.setEndIconMode(n3);
        } else if (!bl2) {
            bl2 = false;
            this.setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        TextInputLayout textInputLayout = this.textInputLayout;
        CheckableImageButton checkableImageButton = this.endIconView;
        PorterDuff.Mode mode = this.endIconTintMode;
        IconHelper.applyIconTint(textInputLayout, checkableImageButton, colorStateList, mode);
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        TextInputLayout textInputLayout = this.textInputLayout;
        CheckableImageButton checkableImageButton = this.endIconView;
        ColorStateList colorStateList = this.endIconTintList;
        IconHelper.applyIconTint(textInputLayout, checkableImageButton, colorStateList, mode);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl2) {
            bl2 = false;
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.suffixText = charSequence2;
        this.suffixTextView.setText(charSequence);
        this.updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int n3) {
        Hm3.f(this.suffixTextView, n3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean bl2) {
        int n3 = this.endIconMode;
        int n4 = 1;
        if (n3 == n4) {
            CheckableImageButton checkableImageButton = this.endIconView;
            checkableImageButton.performClick();
            if (bl2) {
                CheckableImageButton checkableImageButton2 = this.endIconView;
                checkableImageButton2.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        Object object;
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        int n3 = this.isEndIconVisible();
        if (n3 == 0 && (n3 = this.isErrorIconVisible()) == 0) {
            editText = this.textInputLayout.editText;
            object = ViewCompat.a;
            n3 = editText.getPaddingEnd();
        } else {
            n3 = 0;
            editText = null;
        }
        object = this.suffixTextView;
        Resources resources = this.getContext().getResources();
        int n4 = R$dimen.material_input_text_to_prefix_suffix_padding;
        int n7 = resources.getDimensionPixelSize(n4);
        n4 = this.textInputLayout.editText.getPaddingTop();
        int n8 = this.textInputLayout.editText.getPaddingBottom();
        object.setPaddingRelative(n7, n4, n3, n8);
    }
}

