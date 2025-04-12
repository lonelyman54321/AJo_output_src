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
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.EditText
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.IconHelper;
import com.google.android.material.textfield.TextInputLayout;

class StartCompoundLayout
extends LinearLayout {
    private boolean hintExpanded;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout object, Tn3 tn3) {
        Object object2 = object.getContext();
        super(object2);
        this.textInputLayout = object;
        this.setVisibility(8);
        this.setOrientation(0);
        super(-2, -1, 0x800003);
        this.setLayoutParams((ViewGroup.LayoutParams)object2);
        object2 = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.design_text_input_start_icon;
        object = (CheckableImageButton)object2.inflate(n3, (ViewGroup)this, false);
        this.startIconView = object;
        IconHelper.setCompatRippleBackgroundIfNeeded((CheckableImageButton)((Object)object));
        Context context = this.getContext();
        super(context);
        this.prefixTextView = object2;
        this.initStartIconView(tn3);
        this.initPrefixTextView(tn3);
        this.addView((View)object);
        this.addView((View)object2);
    }

    private void initPrefixTextView(Tn3 object) {
        this.prefixTextView.setVisibility(8);
        TextView textView = this.prefixTextView;
        int n3 = R$id.textinput_prefix_text;
        textView.setId(n3);
        textView = this.prefixTextView;
        int n4 = -2;
        Object object2 = new LinearLayout.LayoutParams(n4, n4);
        textView.setLayoutParams((ViewGroup.LayoutParams)object2);
        textView = this.prefixTextView;
        object2 = ViewCompat.a;
        n3 = 1;
        textView.setAccessibilityLiveRegion(n3);
        int n7 = R$styleable.TextInputLayout_prefixTextAppearance;
        object2 = ((Tn3)object).b;
        n4 = 0;
        n7 = object2.getResourceId(n7, 0);
        this.setPrefixTextAppearance(n7);
        n7 = R$styleable.TextInputLayout_prefixTextColor;
        object2 = ((Tn3)object).b;
        n7 = (int)(object2.hasValue(n7) ? 1 : 0);
        if (n7 != 0) {
            n7 = R$styleable.TextInputLayout_prefixTextColor;
            object = ((Tn3)object).a(n7);
            this.setPrefixTextColor((ColorStateList)object);
        }
        int n8 = R$styleable.TextInputLayout_prefixText;
        object = object2.getText(n8);
        this.setPrefixText((CharSequence)object);
    }

    private void initStartIconView(Tn3 object) {
        int n3;
        int n4;
        boolean bl2;
        Context context;
        int n7;
        Context context2 = this.getContext();
        boolean bl22 = MaterialResources.isFontScaleAtLeast1_3(context2);
        if (bl22) {
            context2 = (ViewGroup.MarginLayoutParams)this.startIconView.getLayoutParams();
            n7 = 0;
            context = null;
            context2.setMarginEnd(0);
        }
        boolean bl3 = false;
        context2 = null;
        this.setStartIconOnClickListener(null);
        this.setStartIconOnLongClickListener(null);
        n7 = R$styleable.TextInputLayout_startIconTint;
        TypedArray typedArray = ((Tn3)object).b;
        n7 = (int)(typedArray.hasValue(n7) ? 1 : 0);
        if (n7 != 0) {
            context = this.getContext();
            int n8 = R$styleable.TextInputLayout_startIconTint;
            context = MaterialResources.getColorStateList(context, (Tn3)object, n8);
            this.startIconTintList = context;
        }
        n7 = R$styleable.TextInputLayout_startIconTintMode;
        typedArray = ((Tn3)object).b;
        n7 = (int)(typedArray.hasValue(n7) ? 1 : 0);
        int n10 = -1;
        if (n7 != 0) {
            n7 = R$styleable.TextInputLayout_startIconTintMode;
            n7 = typedArray.getInt(n7, n10);
            context2 = ViewUtils.parseTintMode(n7, null);
            this.startIconTintMode = context2;
        }
        if (bl2 = typedArray.hasValue(n4 = R$styleable.TextInputLayout_startIconDrawable)) {
            int n14 = R$styleable.TextInputLayout_startIconDrawable;
            object = ((Tn3)object).b(n14);
            this.setStartIconDrawable((Drawable)object);
            n3 = R$styleable.TextInputLayout_startIconContentDescription;
            n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
            if (n3 != 0) {
                n3 = R$styleable.TextInputLayout_startIconContentDescription;
                object = typedArray.getText(n3);
                this.setStartIconContentDescription((CharSequence)object);
            }
            n3 = R$styleable.TextInputLayout_startIconCheckable;
            boolean bl4 = true;
            n3 = (int)(typedArray.getBoolean(n3, bl4) ? 1 : 0);
            this.setStartIconCheckable(n3 != 0);
        }
        n3 = R$styleable.TextInputLayout_startIconMinSize;
        context2 = this.getResources();
        n7 = R$dimen.mtrl_min_touch_target_size;
        int n15 = context2.getDimensionPixelSize(n7);
        n3 = typedArray.getDimensionPixelSize(n3, n15);
        this.setStartIconMinSize(n3);
        n3 = R$styleable.TextInputLayout_startIconScaleType;
        n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.TextInputLayout_startIconScaleType;
            n3 = typedArray.getInt(n3, n10);
            object = IconHelper.convertScaleType(n3);
            this.setStartIconScaleType((ImageView.ScaleType)object);
        }
    }

    private void updateVisibility() {
        int n3;
        CharSequence charSequence = this.prefixText;
        int n4 = 8;
        if (charSequence != null && (n3 = (int)(this.hintExpanded ? 1 : 0)) == 0) {
            n3 = 0;
            charSequence = null;
        } else {
            n3 = 8;
        }
        CheckableImageButton checkableImageButton = this.startIconView;
        int n7 = checkableImageButton.getVisibility();
        if (n7 == 0 || n3 == 0) {
            n4 = 0;
        }
        this.setVisibility(n4);
        this.prefixTextView.setVisibility(n3);
        this.textInputLayout.updateDummyDrawables();
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public int getPrefixTextStartOffset() {
        int n3;
        Object object;
        int n4 = this.isStartIconVisible();
        if (n4 != 0) {
            object = this.startIconView;
            n4 = object.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.startIconView.getLayoutParams();
            n3 = marginLayoutParams.getMarginEnd() + n4;
        } else {
            n3 = 0;
            Object var3_4 = null;
        }
        object = ViewCompat.a;
        n4 = this.getPaddingStart();
        return this.prefixTextView.getPaddingStart() + n4 + n3;
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        CheckableImageButton checkableImageButton = this.startIconView;
        int n3 = checkableImageButton.getVisibility();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            checkableImageButton = null;
        }
        return n3 != 0;
    }

    public void onHintStateChanged(boolean bl2) {
        this.hintExpanded = bl2;
        this.updateVisibility();
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        this.updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        TextInputLayout textInputLayout = this.textInputLayout;
        CheckableImageButton checkableImageButton = this.startIconView;
        ColorStateList colorStateList = this.startIconTintList;
        IconHelper.refreshIconDrawableState(textInputLayout, checkableImageButton, colorStateList);
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl2) {
            bl2 = false;
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.prefixText = charSequence2;
        this.prefixTextView.setText(charSequence);
        this.updateVisibility();
    }

    public void setPrefixTextAppearance(int n3) {
        Hm3.f(this.prefixTextView, n3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean bl2) {
        this.startIconView.setCheckable(bl2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        Object object = this.getStartIconContentDescription();
        if (object != charSequence) {
            object = this.startIconView;
            object.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable object) {
        CheckableImageButton checkableImageButton = this.startIconView;
        checkableImageButton.setImageDrawable((Drawable)object);
        if (object != null) {
            object = this.textInputLayout;
            checkableImageButton = this.startIconView;
            ColorStateList colorStateList = this.startIconTintList;
            PorterDuff.Mode mode = this.startIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
            boolean bl2 = true;
            this.setStartIconVisible(bl2);
            this.refreshStartIconDrawableState();
        } else {
            this.setStartIconVisible(false);
            boolean bl3 = false;
            object = null;
            this.setStartIconOnClickListener(null);
            this.setStartIconOnLongClickListener(null);
            this.setStartIconContentDescription(null);
        }
    }

    public void setStartIconMinSize(int n3) {
        if (n3 >= 0) {
            int n4 = this.startIconMinSize;
            if (n3 != n4) {
                this.startIconMinSize = n3;
                CheckableImageButton checkableImageButton = this.startIconView;
                IconHelper.setIconMinSize(checkableImageButton, n3);
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("startIconSize cannot be less than 0");
        throw illegalArgumentException;
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.startIconView;
        View.OnLongClickListener onLongClickListener = this.startIconOnLongClickListener;
        IconHelper.setIconOnClickListener(checkableImageButton, onClickListener, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        Object object = this.startIconTintList;
        if (object != colorStateList) {
            this.startIconTintList = colorStateList;
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.startIconView;
            PorterDuff.Mode mode = this.startIconTintMode;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        Object object = this.startIconTintMode;
        if (object != mode) {
            this.startIconTintMode = mode;
            object = this.textInputLayout;
            CheckableImageButton checkableImageButton = this.startIconView;
            ColorStateList colorStateList = this.startIconTintList;
            IconHelper.applyIconTint((TextInputLayout)((Object)object), checkableImageButton, colorStateList, mode);
        }
    }

    public void setStartIconVisible(boolean n3) {
        int n4 = this.isStartIconVisible();
        if (n4 != n3) {
            CheckableImageButton checkableImageButton = this.startIconView;
            n3 = n3 != 0 ? 0 : 8;
            checkableImageButton.setVisibility(n3);
            this.updatePrefixTextViewPadding();
            this.updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(C2 c2) {
        Object object = this.prefixTextView;
        int n3 = object.getVisibility();
        if (n3 == 0) {
            object = this.prefixTextView;
            AccessibilityNodeInfo accessibilityNodeInfo = c2.a;
            accessibilityNodeInfo.setLabelFor((View)object);
            object = this.prefixTextView;
            c2.u((View)object);
        } else {
            object = this.startIconView;
            c2.u((View)object);
        }
    }

    public void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        int n3 = this.isStartIconVisible();
        n3 = n3 != 0 ? 0 : editText.getPaddingStart();
        TextView textView = this.prefixTextView;
        int n4 = editText.getCompoundPaddingTop();
        Resources resources = this.getContext().getResources();
        int n7 = R$dimen.material_input_text_to_prefix_suffix_padding;
        int n8 = resources.getDimensionPixelSize(n7);
        int n10 = editText.getCompoundPaddingBottom();
        textView.setPaddingRelative(n3, n4, n8, n10);
    }
}

