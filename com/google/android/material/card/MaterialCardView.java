/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Checkable
 */
package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.card.MaterialCardView$OnCheckedChangeListener;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialCardView
extends CardView
implements Checkable,
Shapeable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    private static final int[] CHECKABLE_STATE_SET = new int[]{16842911};
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 0x800055;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 0x800033;
    private static final int[] CHECKED_STATE_SET = new int[]{0x10100A0};
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DRAGGED_STATE_SET;
    private static final String LOG_TAG = "MaterialCardView";
    private final MaterialCardViewHelper cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private MaterialCardView$OnCheckedChangeListener onCheckedChangeListener;

    static {
        int n3 = R$attr.state_dragged;
        DRAGGED_STATE_SET = new int[]{n3};
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_CardView;
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialCardViewStyle;
        this(context, attributeSet, n3);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int n3) {
        int n4 = DEF_STYLE_RES;
        context = MaterialThemeOverlay.wrap(context, attributeSet, n3, n4);
        super(context, attributeSet, n3);
        this.checked = false;
        this.dragged = false;
        this.isParentCardViewDoneInitializing = true;
        Context context2 = this.getContext();
        int[] nArray = R$styleable.MaterialCardView;
        int[] nArray2 = new int[]{};
        context = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, nArray, n3, n4, nArray2);
        super(this, attributeSet, n3, n4);
        this.cardViewHelper = context2;
        attributeSet = super.getCardBackgroundColor();
        context2.setCardBackgroundColor((ColorStateList)attributeSet);
        int n7 = super.getContentPaddingLeft();
        n3 = super.getContentPaddingTop();
        int n8 = super.getContentPaddingRight();
        int n10 = super.getContentPaddingBottom();
        context2.setUserContentPadding(n7, n3, n8, n10);
        context2.loadFromAttributes((TypedArray)context);
        context.recycle();
    }

    private void forceRippleRedrawIfNeeded() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 > n4) {
            MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
            materialCardViewHelper.forceRippleRedraw();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        Rect rect = this.cardViewHelper.getBackground().getBounds();
        rectF.set(rect);
        return rectF;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.getCardBackgroundColor();
    }

    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.getCardForegroundColor();
    }

    public float getCardViewRadius() {
        return MaterialCardView.super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.cardViewHelper.getCheckedIcon();
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.getCheckedIconGravity();
    }

    public int getCheckedIconMargin() {
        return this.cardViewHelper.getCheckedIconMargin();
    }

    public int getCheckedIconSize() {
        return this.cardViewHelper.getCheckedIconSize();
    }

    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.getCheckedIconTint();
    }

    public int getContentPaddingBottom() {
        return this.cardViewHelper.getUserContentPadding().bottom;
    }

    public int getContentPaddingLeft() {
        return this.cardViewHelper.getUserContentPadding().left;
    }

    public int getContentPaddingRight() {
        return this.cardViewHelper.getUserContentPadding().right;
    }

    public int getContentPaddingTop() {
        return this.cardViewHelper.getUserContentPadding().top;
    }

    public float getProgress() {
        return this.cardViewHelper.getProgress();
    }

    public float getRadius() {
        return this.cardViewHelper.getCornerRadius();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.getRippleColor();
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.cardViewHelper.getShapeAppearanceModel();
    }

    public int getStrokeColor() {
        return this.cardViewHelper.getStrokeColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.getStrokeColorStateList();
    }

    public int getStrokeWidth() {
        return this.cardViewHelper.getStrokeWidth();
    }

    public boolean isCheckable() {
        boolean bl2;
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null && (bl2 = materialCardViewHelper.isCheckable())) {
            bl2 = true;
        } else {
            bl2 = false;
            materialCardViewHelper = null;
        }
        return bl2;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cardViewHelper.updateClickable();
        MaterialShapeDrawable materialShapeDrawable = this.cardViewHelper.getBackground();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this, materialShapeDrawable);
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray;
        int[] nArray2 = super.onCreateDrawableState(n3 += 3);
        boolean bl2 = this.isCheckable();
        if (bl2) {
            nArray = CHECKABLE_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        if (bl2 = this.isChecked()) {
            nArray = CHECKED_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        if (bl2 = this.isDragged()) {
            nArray = DRAGGED_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        return nArray2;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)ACCESSIBILITY_CLASS_NAME);
        boolean bl2 = this.isChecked();
        accessibilityEvent.setChecked(bl2);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)ACCESSIBILITY_CLASS_NAME);
        boolean bl2 = this.isCheckable();
        accessibilityNodeInfo.setCheckable(bl2);
        bl2 = this.isClickable();
        accessibilityNodeInfo.setClickable(bl2);
        bl2 = this.isChecked();
        accessibilityNodeInfo.setChecked(bl2);
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        n4 = this.getMeasuredWidth();
        int n7 = this.getMeasuredHeight();
        materialCardViewHelper.recalculateCheckedIconPosition(n4, n7);
    }

    public void setAncestorContentPadding(int n3, int n4, int n7, int n8) {
        super.setContentPadding(n3, n4, n7, n8);
    }

    public void setBackground(Drawable drawable2) {
        this.setBackgroundDrawable(drawable2);
    }

    public void setBackgroundDrawable(Drawable drawable2) {
        boolean bl2 = this.isParentCardViewDoneInitializing;
        if (bl2) {
            MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
            bl2 = materialCardViewHelper.isBackgroundOverwritten();
            if (!bl2) {
                materialCardViewHelper = this.cardViewHelper;
                boolean bl3 = true;
                materialCardViewHelper.setBackgroundOverwritten(bl3);
            }
            super.setBackgroundDrawable(drawable2);
        }
    }

    public void setBackgroundInternal(Drawable drawable2) {
        super.setBackgroundDrawable(drawable2);
    }

    public void setCardBackgroundColor(int n3) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        materialCardViewHelper.setCardBackgroundColor(colorStateList);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.setCardBackgroundColor(colorStateList);
    }

    public void setCardElevation(float f5) {
        super.setCardElevation(f5);
        this.cardViewHelper.updateElevation();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.setCardForegroundColor(colorStateList);
    }

    public void setCheckable(boolean bl2) {
        this.cardViewHelper.setCheckable(bl2);
    }

    public void setChecked(boolean bl2) {
        boolean bl3 = this.checked;
        if (bl3 != bl2) {
            this.toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable2) {
        this.cardViewHelper.setCheckedIcon(drawable2);
    }

    public void setCheckedIconGravity(int n3) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        int n4 = materialCardViewHelper.getCheckedIconGravity();
        if (n4 != n3) {
            materialCardViewHelper = this.cardViewHelper;
            materialCardViewHelper.setCheckedIconGravity(n3);
        }
    }

    public void setCheckedIconMargin(int n3) {
        this.cardViewHelper.setCheckedIconMargin(n3);
    }

    public void setCheckedIconMarginResource(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
            Resources resources = this.getResources();
            n3 = resources.getDimensionPixelSize(n3);
            materialCardViewHelper.setCheckedIconMargin(n3);
        }
    }

    public void setCheckedIconResource(int n3) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        Drawable drawable2 = xn.a(this.getContext(), n3);
        materialCardViewHelper.setCheckedIcon(drawable2);
    }

    public void setCheckedIconSize(int n3) {
        this.cardViewHelper.setCheckedIconSize(n3);
    }

    public void setCheckedIconSizeResource(int n3) {
        if (n3 != 0) {
            MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
            Resources resources = this.getResources();
            n3 = resources.getDimensionPixelSize(n3);
            materialCardViewHelper.setCheckedIconSize(n3);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.cardViewHelper.setCheckedIconTint(colorStateList);
    }

    public void setClickable(boolean bl2) {
        super.setClickable(bl2);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.updateClickable();
        }
    }

    public void setContentPadding(int n3, int n4, int n7, int n8) {
        this.cardViewHelper.setUserContentPadding(n3, n4, n7, n8);
    }

    public void setDragged(boolean bl2) {
        boolean bl3 = this.dragged;
        if (bl3 != bl2) {
            this.dragged = bl2;
            this.refreshDrawableState();
            this.forceRippleRedrawIfNeeded();
            this.invalidate();
        }
    }

    public void setMaxCardElevation(float f5) {
        super.setMaxCardElevation(f5);
        this.cardViewHelper.updateInsets();
    }

    public void setOnCheckedChangeListener(MaterialCardView$OnCheckedChangeListener materialCardView$OnCheckedChangeListener) {
        this.onCheckedChangeListener = materialCardView$OnCheckedChangeListener;
    }

    public void setPreventCornerOverlap(boolean bl2) {
        super.setPreventCornerOverlap(bl2);
        this.cardViewHelper.updateInsets();
        this.cardViewHelper.updateContentPadding();
    }

    public void setProgress(float f5) {
        this.cardViewHelper.setProgress(f5);
    }

    public void setRadius(float f5) {
        super.setRadius(f5);
        this.cardViewHelper.setCornerRadius(f5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.cardViewHelper.setRippleColor(colorStateList);
    }

    public void setRippleColorResource(int n3) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        ColorStateList colorStateList = t70.getColorStateList(this.getContext(), n3);
        materialCardViewHelper.setRippleColor(colorStateList);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        RectF rectF = this.getBoundsAsRectF();
        boolean bl2 = shapeAppearanceModel.isRoundRect(rectF);
        this.setClipToOutline(bl2);
        this.cardViewHelper.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setStrokeColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setStrokeColor(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.cardViewHelper.setStrokeColor(colorStateList);
        this.invalidate();
    }

    public void setStrokeWidth(int n3) {
        this.cardViewHelper.setStrokeWidth(n3);
        this.invalidate();
    }

    public void setUseCompatPadding(boolean bl2) {
        super.setUseCompatPadding(bl2);
        this.cardViewHelper.updateInsets();
        this.cardViewHelper.updateContentPadding();
    }

    public void toggle() {
        boolean bl2 = this.isCheckable();
        if (bl2 && (bl2 = this.isEnabled())) {
            bl2 = this.checked;
            boolean bl3 = true;
            this.checked = bl2 ^= bl3;
            this.refreshDrawableState();
            this.forceRippleRedrawIfNeeded();
            Object object = this.cardViewHelper;
            boolean bl4 = this.checked;
            ((MaterialCardViewHelper)object).setChecked(bl4, bl3);
            object = this.onCheckedChangeListener;
            if (object != null) {
                bl3 = this.checked;
                object.onCheckedChanged(this, bl3);
            }
        }
    }
}

