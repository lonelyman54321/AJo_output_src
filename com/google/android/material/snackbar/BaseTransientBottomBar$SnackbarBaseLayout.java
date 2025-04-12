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
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.FrameLayout
 */
package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class BaseTransientBottomBar$SnackbarBaseLayout
extends FrameLayout {
    private static final View.OnTouchListener consumeAllTouchListener;
    private final float actionTextColorAlpha;
    private boolean addingToTargetParent;
    private int animationMode;
    private final float backgroundOverlayColorAlpha;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private BaseTransientBottomBar baseTransientBottomBar;
    private final int maxInlineActionWidth;
    private final int maxWidth;
    private Rect originalMargins;
    ShapeAppearanceModel shapeAppearanceModel;

    static {
        BaseTransientBottomBar$SnackbarBaseLayout$1 baseTransientBottomBar$SnackbarBaseLayout$1 = new BaseTransientBottomBar$SnackbarBaseLayout$1();
        consumeAllTouchListener = baseTransientBottomBar$SnackbarBaseLayout$1;
    }

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context) {
        this(context, null);
    }

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet object) {
        int n3;
        int n4;
        float f5;
        float f6;
        Object object2;
        float f7;
        block6: {
            block5: {
                f7 = 0.0f;
                context = MaterialThemeOverlay.wrap(context, (AttributeSet)object, 0, 0);
                super(context, (AttributeSet)object);
                context = this.getContext();
                object2 = R$styleable.SnackbarLayout;
                object2 = context.obtainStyledAttributes((AttributeSet)object, object2);
                int n32 = R$styleable.SnackbarLayout_elevation;
                n32 = (int)(object2.hasValue(n32) ? 1 : 0);
                if (n32 != 0) {
                    n32 = R$styleable.SnackbarLayout_elevation;
                    n32 = object2.getDimensionPixelSize(n32, 0);
                    float f8 = n32;
                    ViewCompat$c.m((View)this, f8);
                }
                n32 = R$styleable.SnackbarLayout_animationMode;
                this.animationMode = n32 = object2.getInt(n32, 0);
                n32 = R$styleable.SnackbarLayout_shapeAppearance;
                if ((n32 = (int)(object2.hasValue(n32) ? 1 : 0)) != 0) break block5;
                n32 = R$styleable.SnackbarLayout_shapeAppearanceOverlay;
                if ((n32 = (int)(object2.hasValue(n32) ? 1 : 0)) == 0) break block6;
            }
            this.shapeAppearanceModel = object = ShapeAppearanceModel.builder(context, (AttributeSet)object, 0, 0).build();
        }
        int n42 = R$styleable.SnackbarLayout_backgroundOverlayColorAlpha;
        f7 = 1.0f;
        this.backgroundOverlayColorAlpha = f6 = object2.getFloat(n42, f7);
        n42 = R$styleable.SnackbarLayout_backgroundTint;
        context = MaterialResources.getColorStateList(context, (TypedArray)object2, n42);
        this.setBackgroundTintList((ColorStateList)context);
        int bl2 = R$styleable.SnackbarLayout_backgroundTintMode;
        n42 = -1;
        f6 = 0.0f / 0.0f;
        int n7 = object2.getInt(bl2, n42);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        context = ViewUtils.parseTintMode(n7, mode);
        this.setBackgroundTintMode((PorterDuff.Mode)context);
        int n8 = R$styleable.SnackbarLayout_actionTextColorAlpha;
        this.actionTextColorAlpha = f5 = object2.getFloat(n8, f7);
        int n10 = R$styleable.SnackbarLayout_android_maxWidth;
        this.maxWidth = n4 = object2.getDimensionPixelSize(n10, n42);
        int n14 = R$styleable.SnackbarLayout_maxActionInlineWidth;
        this.maxInlineActionWidth = n3 = object2.getDimensionPixelSize(n14, n42);
        object2.recycle();
        context = consumeAllTouchListener;
        this.setOnTouchListener((View.OnTouchListener)context);
        boolean bl3 = true;
        f5 = Float.MIN_VALUE;
        this.setFocusable(bl3);
        context = this.getBackground();
        if (context == null) {
            context = this.createThemedBackground();
            object = ViewCompat.a;
            this.setBackground((Drawable)context);
        }
    }

    public static /* synthetic */ Rect access$1000(BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout) {
        return baseTransientBottomBar$SnackbarBaseLayout.originalMargins;
    }

    public static /* synthetic */ void access$500(BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout, BaseTransientBottomBar baseTransientBottomBar) {
        baseTransientBottomBar$SnackbarBaseLayout.setBaseTransientBottomBar(baseTransientBottomBar);
    }

    private Drawable createThemedBackground() {
        MaterialShapeDrawable materialShapeDrawable;
        int n3 = R$attr.colorSurface;
        int n4 = R$attr.colorOnSurface;
        float f5 = this.getBackgroundOverlayColorAlpha();
        n3 = MaterialColors.layer((View)this, n3, n4, f5);
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        if (shapeAppearanceModel != null) {
            materialShapeDrawable = BaseTransientBottomBar.access$1900(n3, shapeAppearanceModel);
        } else {
            shapeAppearanceModel = this.getResources();
            materialShapeDrawable = BaseTransientBottomBar.access$2000(n3, (Resources)shapeAppearanceModel);
        }
        shapeAppearanceModel = this.backgroundTint;
        if (shapeAppearanceModel != null) {
            materialShapeDrawable = ut0_0.h(materialShapeDrawable);
            shapeAppearanceModel = this.backgroundTint;
            materialShapeDrawable.setTintList((ColorStateList)shapeAppearanceModel);
            return materialShapeDrawable;
        }
        return ut0_0.h(materialShapeDrawable);
    }

    private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        this.baseTransientBottomBar = baseTransientBottomBar;
    }

    private void updateOriginalMargins(ViewGroup.MarginLayoutParams marginLayoutParams) {
        Rect rect;
        int n3 = marginLayoutParams.leftMargin;
        int n4 = marginLayoutParams.topMargin;
        int n7 = marginLayoutParams.rightMargin;
        int n8 = marginLayoutParams.bottomMargin;
        this.originalMargins = rect = new Rect(n3, n4, n7, n8);
    }

    public void addToTargetParent(ViewGroup viewGroup) {
        this.addingToTargetParent = true;
        viewGroup.addView((View)this);
        this.addingToTargetParent = false;
    }

    public float getActionTextColorAlpha() {
        return this.actionTextColorAlpha;
    }

    public int getAnimationMode() {
        return this.animationMode;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.backgroundOverlayColorAlpha;
    }

    public int getMaxInlineActionWidth() {
        return this.maxInlineActionWidth;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.baseTransientBottomBar;
        if (object != null) {
            ((BaseTransientBottomBar)object).onAttachedToWindow();
        }
        object = ViewCompat.a;
        ViewCompat$b.c((View)this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BaseTransientBottomBar baseTransientBottomBar = this.baseTransientBottomBar;
        if (baseTransientBottomBar != null) {
            baseTransientBottomBar.onDetachedFromWindow();
        }
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        BaseTransientBottomBar baseTransientBottomBar = this.baseTransientBottomBar;
        if (baseTransientBottomBar != null) {
            baseTransientBottomBar.onLayoutChange();
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7;
        super.onMeasure(n3, n4);
        n3 = this.maxWidth;
        if (n3 > 0 && (n3 = this.getMeasuredWidth()) > (n7 = this.maxWidth)) {
            n3 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)0x40000000);
            super.onMeasure(n3, n4);
        }
    }

    public void setAnimationMode(int n3) {
        this.animationMode = n3;
    }

    public void setBackground(Drawable drawable2) {
        this.setBackgroundDrawable(drawable2);
    }

    public void setBackgroundDrawable(Drawable drawable2) {
        ColorStateList colorStateList;
        if (drawable2 != null && (colorStateList = this.backgroundTint) != null) {
            drawable2 = ut0_0.h(drawable2.mutate());
            colorStateList = this.backgroundTint;
            drawable2.setTintList(colorStateList);
            colorStateList = this.backgroundTintMode;
            drawable2.setTintMode((PorterDuff.Mode)colorStateList);
        }
        super.setBackgroundDrawable(drawable2);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.backgroundTint = colorStateList;
        Drawable drawable2 = this.getBackground();
        if (drawable2 != null) {
            drawable2 = ut0_0.h(this.getBackground().mutate());
            drawable2.setTintList(colorStateList);
            colorStateList = this.backgroundTintMode;
            drawable2.setTintMode((PorterDuff.Mode)colorStateList);
            colorStateList = this.getBackground();
            if (drawable2 != colorStateList) {
                super.setBackgroundDrawable(drawable2);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.backgroundTintMode = mode;
        Drawable drawable2 = this.getBackground();
        if (drawable2 != null) {
            drawable2 = ut0_0.h(this.getBackground().mutate());
            drawable2.setTintMode(mode);
            mode = this.getBackground();
            if (drawable2 != mode) {
                super.setBackgroundDrawable(drawable2);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams object) {
        super.setLayoutParams(object);
        boolean bl2 = this.addingToTargetParent;
        if (!bl2 && (bl2 = object instanceof ViewGroup.MarginLayoutParams)) {
            object = (ViewGroup.MarginLayoutParams)object;
            this.updateOriginalMargins((ViewGroup.MarginLayoutParams)object);
            object = this.baseTransientBottomBar;
            if (object != null) {
                BaseTransientBottomBar.access$900((BaseTransientBottomBar)object);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener = onClickListener != null ? null : consumeAllTouchListener;
        this.setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }
}

