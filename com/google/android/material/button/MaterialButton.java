/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Button
 *  android.widget.Checkable
 *  android.widget.CompoundButton
 */
package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton$OnCheckedChangeListener;
import com.google.android.material.button.MaterialButton$OnPressedChangeListener;
import com.google.android.material.button.MaterialButton$SavedState;
import com.google.android.material.button.MaterialButtonHelper;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.AbstractCollection;
import java.util.LinkedHashSet;

public class MaterialButton
extends AppCompatButton
implements Checkable,
Shapeable {
    private static final int[] CHECKABLE_STATE_SET = new int[]{16842911};
    private static final int[] CHECKED_STATE_SET = new int[]{0x10100A0};
    private static final int DEF_STYLE_RES = 0;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private String accessibilityClassName;
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final MaterialButtonHelper materialButtonHelper;
    private final LinkedHashSet onCheckedChangeListeners;
    private MaterialButton$OnPressedChangeListener onPressedChangeListenerInternal;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_Button;
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialButtonStyle;
        this(context, attributeSet, n3);
    }

    public MaterialButton(Context object, AttributeSet object2, int n3) {
        MaterialButtonHelper materialButtonHelper;
        int n4 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, object2, n3, n4);
        super((Context)object, (AttributeSet)object2, n3);
        super();
        this.onCheckedChangeListeners = object;
        boolean bl2 = false;
        object = null;
        this.checked = false;
        this.broadcasting = false;
        Context context = this.getContext();
        Object object3 = R$styleable.MaterialButton;
        int[] nArray = new int[]{};
        Context context2 = context;
        AttributeSet attributeSet = object2;
        context2 = ThemeEnforcement.obtainStyledAttributes(context, object2, object3, n3, n4, nArray);
        int n7 = R$styleable.MaterialButton_iconPadding;
        this.iconPadding = n7 = context2.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.MaterialButton_iconTintMode;
        n7 = context2.getInt(n7, -1);
        object3 = PorterDuff.Mode.SRC_IN;
        attributeSet = ViewUtils.parseTintMode(n7, (PorterDuff.Mode)object3);
        this.iconTintMode = attributeSet;
        attributeSet = this.getContext();
        int n8 = R$styleable.MaterialButton_iconTint;
        attributeSet = MaterialResources.getColorStateList((Context)attributeSet, (TypedArray)context2, n8);
        this.iconTint = attributeSet;
        attributeSet = this.getContext();
        n8 = R$styleable.MaterialButton_icon;
        attributeSet = MaterialResources.getDrawable((Context)attributeSet, (TypedArray)context2, n8);
        this.icon = attributeSet;
        n7 = R$styleable.MaterialButton_iconGravity;
        n8 = 1;
        this.iconGravity = n7 = context2.getInteger(n7, n8);
        n7 = R$styleable.MaterialButton_iconSize;
        this.iconSize = n7 = context2.getDimensionPixelSize(n7, 0);
        object2 = ShapeAppearanceModel.builder(context, object2, n3, n4).build();
        this.materialButtonHelper = materialButtonHelper = new MaterialButtonHelper(this, (ShapeAppearanceModel)object2);
        materialButtonHelper.loadFromAttributes((TypedArray)context2);
        context2.recycle();
        int n10 = this.iconPadding;
        this.setCompoundDrawablePadding(n10);
        object2 = this.icon;
        if (object2 != null) {
            bl2 = true;
        }
        this.updateIcon(bl2);
    }

    private Layout.Alignment getActualTextAlignment() {
        int n3;
        int n4 = this.getTextAlignment();
        if (n4 != (n3 = 1)) {
            n3 = 6;
            if (n4 != n3 && n4 != (n3 = 3)) {
                n3 = 4;
                if (n4 != n3) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return this.getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int n3;
        int n4 = this.getGravity() & 0x800007;
        if (n4 != (n3 = 1)) {
            n3 = 5;
            if (n4 != n3 && n4 != (n3 = 0x800005)) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        int n3;
        int n4 = this.getLineCount();
        if (n4 > (n3 = 1)) {
            return this.getLayout().getHeight();
        }
        TextPaint textPaint = this.getPaint();
        String string2 = this.getText().toString();
        TransformationMethod transformationMethod = this.getTransformationMethod();
        if (transformationMethod != null) {
            transformationMethod = this.getTransformationMethod();
            string2 = transformationMethod.getTransformation((CharSequence)string2, (View)this).toString();
        }
        transformationMethod = new Rect();
        int n7 = string2.length();
        textPaint.getTextBounds(string2, 0, n7, (Rect)transformationMethod);
        n4 = transformationMethod.height();
        n3 = this.getLayout().getHeight();
        return Math.min(n4, n3);
    }

    private int getTextLayoutWidth() {
        int n3 = this.getLineCount();
        float f5 = 0.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            Layout layout2 = this.getLayout();
            float f6 = layout2.getLineWidth(i3);
            f5 = Math.max(f5, f6);
        }
        return (int)Math.ceil(f5);
    }

    private boolean isIconEnd() {
        int n3 = this.iconGravity;
        int n4 = 3;
        n3 = n3 != n4 && n3 != (n4 = 4) ? 0 : 1;
        return n3 != 0;
    }

    private boolean isIconStart() {
        int n3;
        int n4 = this.iconGravity;
        int n7 = 1;
        if (n4 != n7 && n4 != (n3 = 2)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    private boolean isIconTop() {
        int n3 = this.iconGravity;
        int n4 = 16;
        n3 = n3 != n4 && n3 != (n4 = 32) ? 0 : 1;
        return n3 != 0;
    }

    private boolean isLayoutRTL() {
        int n3;
        int n4 = this.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    private boolean isUsingOriginalBackground() {
        boolean bl2;
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper != null && !(bl2 = materialButtonHelper.isBackgroundOverwritten())) {
            bl2 = true;
        } else {
            bl2 = false;
            materialButtonHelper = null;
        }
        return bl2;
    }

    private void resetIconDrawable() {
        boolean bl2 = this.isIconStart();
        if (bl2) {
            Drawable drawable2 = this.icon;
            this.setCompoundDrawablesRelative(drawable2, null, null, null);
        } else {
            bl2 = this.isIconEnd();
            if (bl2) {
                Drawable drawable3 = this.icon;
                this.setCompoundDrawablesRelative(null, null, drawable3, null);
            } else {
                bl2 = this.isIconTop();
                if (bl2) {
                    Drawable drawable4 = this.icon;
                    this.setCompoundDrawablesRelative(null, drawable4, null, null);
                }
            }
        }
    }

    private void updateIcon(boolean bl2) {
        int n3;
        int n4;
        ColorStateList colorStateList;
        Drawable drawable2 = this.icon;
        boolean bl3 = true;
        if (drawable2 != null) {
            this.icon = drawable2 = ut0_0.h(drawable2).mutate();
            colorStateList = this.iconTint;
            drawable2.setTintList(colorStateList);
            drawable2 = this.iconTintMode;
            if (drawable2 != null) {
                colorStateList = this.icon;
                colorStateList.setTintMode((PorterDuff.Mode)drawable2);
            }
            if ((n4 = this.iconSize) == 0) {
                drawable2 = this.icon;
                n4 = drawable2.getIntrinsicWidth();
            }
            n3 = this.iconSize;
            if (n3 == 0) {
                colorStateList = this.icon;
                n3 = colorStateList.getIntrinsicHeight();
            }
            Drawable drawable3 = this.icon;
            int n7 = this.iconLeft;
            int n8 = this.iconTop;
            drawable3.setBounds(n7, n8, n4 += n7, n3 += n8);
            drawable2 = this.icon;
            drawable2.setVisible(bl3, bl2);
        }
        if (bl2) {
            this.resetIconDrawable();
            return;
        }
        Drawable drawable4 = this.getCompoundDrawablesRelative();
        n4 = 0;
        drawable2 = drawable4[0];
        Drawable drawable5 = drawable4[bl3];
        drawable4 = drawable4[2];
        n3 = this.isIconStart();
        if (n3 != 0 && drawable2 != (colorStateList = this.icon) || (n4 = (int)(this.isIconEnd() ? 1 : 0)) != 0 && drawable4 != (drawable2 = this.icon) || (bl2 = this.isIconTop()) && drawable5 != (drawable4 = this.icon)) {
            this.resetIconDrawable();
        }
    }

    private void updateIconPosition(int n3, int n4) {
        block13: {
            block16: {
                block15: {
                    Layout.Alignment alignment;
                    int n7;
                    int n8;
                    Drawable drawable2;
                    int n10;
                    block14: {
                        n10 = 2;
                        drawable2 = this.icon;
                        if (drawable2 == null || (drawable2 = this.getLayout()) == null) break block13;
                        n8 = this.isIconStart();
                        if (n8 != 0 || (n8 = this.isIconEnd()) != 0) break block14;
                        n3 = (int)(this.isIconTop() ? 1 : 0);
                        if (n3 != 0) {
                            this.iconLeft = 0;
                            n3 = this.iconGravity;
                            n8 = 16;
                            if (n3 == n8) {
                                this.iconTop = 0;
                                this.updateIcon(false);
                                return;
                            }
                            n3 = this.iconSize;
                            if (n3 == 0) {
                                Drawable drawable3 = this.icon;
                                n3 = drawable3.getIntrinsicHeight();
                            }
                            n8 = this.getTextHeight();
                            n4 -= n8;
                            n8 = this.getPaddingTop();
                            n4 = n4 - n8 - n3;
                            n3 = this.iconPadding;
                            n4 -= n3;
                            n3 = this.getPaddingBottom();
                            n4 = (n4 - n3) / n10;
                            n4 = this.iconTop;
                            n3 = Math.max(0, n4);
                            if (n4 != n3) {
                                this.iconTop = n3;
                                this.updateIcon(false);
                            }
                        }
                        break block15;
                    }
                    this.iconTop = 0;
                    Layout.Alignment alignment2 = this.getActualTextAlignment();
                    n8 = this.iconGravity;
                    int n14 = 1;
                    if (n8 == n14 || n8 == (n7 = 3) || n8 == n10 && alignment2 == (alignment = Layout.Alignment.ALIGN_NORMAL) || n8 == (n7 = 4) && alignment2 == (drawable2 = Layout.Alignment.ALIGN_OPPOSITE)) break block16;
                    n8 = this.iconSize;
                    if (n8 == 0) {
                        drawable2 = this.icon;
                        n8 = drawable2.getIntrinsicWidth();
                    }
                    int n15 = this.getTextLayoutWidth();
                    n3 -= n15;
                    n15 = this.getPaddingEnd();
                    n3 = n3 - n15 - n8;
                    n8 = this.iconPadding;
                    n3 -= n8;
                    n8 = this.getPaddingStart();
                    n3 -= n8;
                    drawable2 = Layout.Alignment.ALIGN_CENTER;
                    if (alignment2 == drawable2) {
                        n3 /= n10;
                    }
                    n4 = (int)(this.isLayoutRTL() ? 1 : 0);
                    n10 = this.iconGravity;
                    if (n10 != n7) {
                        n14 = 0;
                    }
                    if (n4 != n14) {
                        n3 = -n3;
                    }
                    if ((n4 = this.iconLeft) != n3) {
                        this.iconLeft = n3;
                        this.updateIcon(false);
                    }
                }
                return;
            }
            this.iconLeft = 0;
            this.updateIcon(false);
        }
    }

    public void addOnCheckedChangeListener(MaterialButton$OnCheckedChangeListener materialButton$OnCheckedChangeListener) {
        ((AbstractCollection)this.onCheckedChangeListeners).add(materialButton$OnCheckedChangeListener);
    }

    public void clearOnCheckedChangeListeners() {
        ((AbstractCollection)this.onCheckedChangeListeners).clear();
    }

    public String getA11yClassName() {
        Object object = this.accessibilityClassName;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            return this.accessibilityClassName;
        }
        bl2 = this.isCheckable();
        object = bl2 ? CompoundButton.class : Button.class;
        return ((Class)object).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        int n3 = this.isUsingOriginalBackground();
        if (n3 != 0) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            n3 = materialButtonHelper.getCornerRadius();
        } else {
            n3 = 0;
            Object var2_3 = null;
        }
        return n3;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.getInsetBottom();
    }

    public int getInsetTop() {
        return this.materialButtonHelper.getInsetTop();
    }

    public ColorStateList getRippleColor() {
        ColorStateList colorStateList;
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            colorStateList = this.materialButtonHelper.getRippleColor();
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return colorStateList;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            return this.materialButtonHelper.getShapeAppearanceModel();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        throw illegalStateException;
    }

    public ColorStateList getStrokeColor() {
        ColorStateList colorStateList;
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            colorStateList = this.materialButtonHelper.getStrokeColor();
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return colorStateList;
    }

    public int getStrokeWidth() {
        int n3 = this.isUsingOriginalBackground();
        if (n3 != 0) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            n3 = materialButtonHelper.getStrokeWidth();
        } else {
            n3 = 0;
            Object var2_3 = null;
        }
        return n3;
    }

    public ColorStateList getSupportBackgroundTintList() {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            return this.materialButtonHelper.getSupportBackgroundTintList();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            return this.materialButtonHelper.getSupportBackgroundTintMode();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        boolean bl2;
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper != null && (bl2 = materialButtonHelper.isCheckable())) {
            bl2 = true;
        } else {
            bl2 = false;
            materialButtonHelper = null;
        }
        return bl2;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.isToggleCheckedStateOnClick();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialShapeDrawable materialShapeDrawable = this.materialButtonHelper.getMaterialShapeDrawable();
            MaterialShapeUtils.setParentAbsoluteElevation((View)this, materialShapeDrawable);
        }
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray;
        int[] nArray2 = super.onCreateDrawableState(n3 += 2);
        boolean bl2 = this.isCheckable();
        if (bl2) {
            nArray = CHECKABLE_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        if (bl2 = this.isChecked()) {
            nArray = CHECKED_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        return nArray2;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        String string2 = this.getA11yClassName();
        accessibilityEvent.setClassName((CharSequence)string2);
        boolean bl2 = this.isChecked();
        accessibilityEvent.setChecked(bl2);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string2 = this.getA11yClassName();
        accessibilityNodeInfo.setClassName((CharSequence)string2);
        boolean bl2 = this.isCheckable();
        accessibilityNodeInfo.setCheckable(bl2);
        bl2 = this.isChecked();
        accessibilityNodeInfo.setChecked(bl2);
        bl2 = this.isClickable();
        accessibilityNodeInfo.setClickable(bl2);
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        MaterialButtonHelper materialButtonHelper;
        super.onLayout(n3 != 0, n4, n7, n8, n10);
        n3 = Build.VERSION.SDK_INT;
        int n14 = 21;
        if (n3 == n14 && (materialButtonHelper = this.materialButtonHelper) != null) {
            materialButtonHelper.updateMaskBounds(n10 -= n7, n8 -= n4);
        }
        n3 = this.getMeasuredWidth();
        n4 = this.getMeasuredHeight();
        this.updateIconPosition(n3, n4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof MaterialButton$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (MaterialButton$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable2);
        boolean bl3 = parcelable.checked;
        this.setChecked(bl3);
    }

    public Parcelable onSaveInstanceState() {
        boolean bl2;
        Parcelable parcelable = super.onSaveInstanceState();
        MaterialButton$SavedState materialButton$SavedState = new MaterialButton$SavedState(parcelable);
        materialButton$SavedState.checked = bl2 = this.checked;
        return materialButton$SavedState;
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        super.onTextChanged(charSequence, n3, n4, n7);
        int n8 = this.getMeasuredWidth();
        n3 = this.getMeasuredHeight();
        this.updateIconPosition(n8, n3);
    }

    public boolean performClick() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        boolean bl2 = materialButtonHelper.isToggleCheckedStateOnClick();
        if (bl2) {
            this.toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        Drawable drawable2;
        boolean bl2;
        super.refreshDrawableState();
        Object object = this.icon;
        if (object != null && (bl2 = (drawable2 = this.icon).setState((int[])(object = (Object)this.getDrawableState())))) {
            this.invalidate();
        }
    }

    public void removeOnCheckedChangeListener(MaterialButton$OnCheckedChangeListener materialButton$OnCheckedChangeListener) {
        ((AbstractCollection)this.onCheckedChangeListeners).remove(materialButton$OnCheckedChangeListener);
    }

    public void setA11yClassName(String string2) {
        this.accessibilityClassName = string2;
    }

    public void setBackground(Drawable drawable2) {
        this.setBackgroundDrawable(drawable2);
    }

    public void setBackgroundColor(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setBackgroundColor(n3);
        } else {
            super.setBackgroundColor(n3);
        }
    }

    public void setBackgroundDrawable(Drawable object) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            Object object2 = this.getBackground();
            if (object != object2) {
                object2 = this.materialButtonHelper;
                ((MaterialButtonHelper)object2).setBackgroundOverwritten();
                super.setBackgroundDrawable((Drawable)object);
            } else {
                object2 = this.getBackground();
                object = object.getState();
                object2.setState((int[])object);
            }
        } else {
            super.setBackgroundDrawable((Drawable)object);
        }
    }

    public void setBackgroundResource(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setBackgroundDrawable(drawable2);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean bl2) {
        boolean bl3 = this.isUsingOriginalBackground();
        if (bl3) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setCheckable(bl2);
        }
    }

    public void setChecked(boolean bl2) {
        boolean bl3 = this.isCheckable();
        if (bl3 && (bl3 = this.isEnabled()) && (bl3 = this.checked) != bl2) {
            this.checked = bl2;
            this.refreshDrawableState();
            Object object = this.getParent();
            bl2 = object instanceof MaterialButtonToggleGroup;
            if (bl2) {
                object = (MaterialButtonToggleGroup)this.getParent();
                bl3 = this.checked;
                ((MaterialButtonToggleGroup)((Object)object)).onButtonCheckedStateChanged(this, bl3);
            }
            if (bl2 = this.broadcasting) {
                return;
            }
            this.broadcasting = bl2 = true;
            object = ((AbstractCollection)this.onCheckedChangeListeners).iterator();
            while (bl3 = object.hasNext()) {
                MaterialButton$OnCheckedChangeListener materialButton$OnCheckedChangeListener = (MaterialButton$OnCheckedChangeListener)object.next();
                boolean bl4 = this.checked;
                materialButton$OnCheckedChangeListener.onCheckedChanged(this, bl4);
            }
            bl2 = false;
            object = null;
            this.broadcasting = false;
        }
    }

    public void setCornerRadius(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setCornerRadius(n3);
        }
    }

    public void setCornerRadiusResource(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            Resources resources = this.getResources();
            n3 = resources.getDimensionPixelSize(n3);
            this.setCornerRadius(n3);
        }
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialShapeDrawable materialShapeDrawable = this.materialButtonHelper.getMaterialShapeDrawable();
            materialShapeDrawable.setElevation(f5);
        }
    }

    public void setIcon(Drawable drawable2) {
        Drawable drawable3 = this.icon;
        if (drawable3 != drawable2) {
            this.icon = drawable2;
            this.updateIcon(true);
            int n3 = this.getMeasuredWidth();
            int n4 = this.getMeasuredHeight();
            this.updateIconPosition(n3, n4);
        }
    }

    public void setIconGravity(int n3) {
        int n4 = this.iconGravity;
        if (n4 != n3) {
            this.iconGravity = n3;
            n3 = this.getMeasuredWidth();
            n4 = this.getMeasuredHeight();
            this.updateIconPosition(n3, n4);
        }
    }

    public void setIconPadding(int n3) {
        int n4 = this.iconPadding;
        if (n4 != n3) {
            this.iconPadding = n3;
            this.setCompoundDrawablePadding(n3);
        }
    }

    public void setIconResource(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setIcon(drawable2);
    }

    public void setIconSize(int n3) {
        if (n3 >= 0) {
            int n4 = this.iconSize;
            if (n4 != n3) {
                this.iconSize = n3;
                n3 = 1;
                this.updateIcon(n3 != 0);
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("iconSize cannot be less than 0");
        throw illegalArgumentException;
    }

    public void setIconTint(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.iconTint;
        if (colorStateList2 != colorStateList) {
            this.iconTint = colorStateList;
            colorStateList = null;
            this.updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2 = this.iconTintMode;
        if (mode2 != mode) {
            this.iconTintMode = mode;
            mode = null;
            this.updateIcon(false);
        }
    }

    public void setIconTintResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.getContext(), n3);
        this.setIconTint(colorStateList);
    }

    public void setInsetBottom(int n3) {
        this.materialButtonHelper.setInsetBottom(n3);
    }

    public void setInsetTop(int n3) {
        this.materialButtonHelper.setInsetTop(n3);
    }

    public void setInternalBackground(Drawable drawable2) {
        super.setBackgroundDrawable(drawable2);
    }

    public void setOnPressedChangeListenerInternal(MaterialButton$OnPressedChangeListener materialButton$OnPressedChangeListener) {
        this.onPressedChangeListenerInternal = materialButton$OnPressedChangeListener;
    }

    public void setPressed(boolean bl2) {
        MaterialButton$OnPressedChangeListener materialButton$OnPressedChangeListener = this.onPressedChangeListenerInternal;
        if (materialButton$OnPressedChangeListener != null) {
            materialButton$OnPressedChangeListener.onPressedChanged(this, bl2);
        }
        super.setPressed(bl2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setRippleColor(colorStateList);
        }
    }

    public void setRippleColorResource(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            Context context = this.getContext();
            ColorStateList colorStateList = t70.getColorStateList(context, n3);
            this.setRippleColor(colorStateList);
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel object) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            this.materialButtonHelper.setShapeAppearanceModel((ShapeAppearanceModel)object);
            return;
        }
        object = new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        throw object;
    }

    public void setShouldDrawSurfaceColorStroke(boolean bl2) {
        boolean bl3 = this.isUsingOriginalBackground();
        if (bl3) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setShouldDrawSurfaceColorStroke(bl2);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setStrokeColor(colorStateList);
        }
    }

    public void setStrokeColorResource(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            Context context = this.getContext();
            ColorStateList colorStateList = t70.getColorStateList(context, n3);
            this.setStrokeColor(colorStateList);
        }
    }

    public void setStrokeWidth(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setStrokeWidth(n3);
        }
    }

    public void setStrokeWidthResource(int n3) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            Resources resources = this.getResources();
            n3 = resources.getDimensionPixelSize(n3);
            this.setStrokeWidth(n3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setSupportBackgroundTintList(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        boolean bl2 = this.isUsingOriginalBackground();
        if (bl2) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.setSupportBackgroundTintMode(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int n3) {
        super.setTextAlignment(n3);
        n3 = this.getMeasuredWidth();
        int n4 = this.getMeasuredHeight();
        this.updateIconPosition(n3, n4);
    }

    public void setToggleCheckedStateOnClick(boolean bl2) {
        this.materialButtonHelper.setToggleCheckedStateOnClick(bl2);
    }

    public void toggle() {
        boolean bl2 = this.checked ^ true;
        this.setChecked(bl2);
    }
}

