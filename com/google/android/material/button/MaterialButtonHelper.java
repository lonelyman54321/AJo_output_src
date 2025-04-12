/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.view.View
 */
package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP;
    private static final boolean IS_MIN_LOLLIPOP;
    private boolean backgroundOverwritten = false;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private boolean cornerRadiusSet = false;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private Drawable maskDrawable;
    private final MaterialButton materialButton;
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private boolean shouldDrawSurfaceColorStroke = false;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean toggleCheckedStateOnClick = true;

    static {
        boolean bl2;
        int n3 = Build.VERSION.SDK_INT;
        IS_MIN_LOLLIPOP = bl2 = true;
        int n4 = 22;
        if (n3 > n4) {
            bl2 = false;
        }
        IS_LOLLIPOP = bl2;
    }

    public MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.materialButton = materialButton;
        this.shapeAppearanceModel = shapeAppearanceModel;
    }

    /*
     * WARNING - void declaration
     */
    private Drawable createBackground() {
        void var10_13;
        Object object;
        int n3 = 1;
        int n4 = 2;
        Object object2 = this.shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable((ShapeAppearanceModel)object2);
        object2 = this.materialButton.getContext();
        materialShapeDrawable.initializeElevationOverlay((Context)object2);
        object2 = this.backgroundTint;
        materialShapeDrawable.setTintList((ColorStateList)object2);
        object2 = this.backgroundTintMode;
        if (object2 != null) {
            materialShapeDrawable.setTintMode((PorterDuff.Mode)object2);
        }
        int n7 = this.strokeWidth;
        float f5 = n7;
        Object object3 = this.strokeColor;
        materialShapeDrawable.setStroke(f5, (ColorStateList)object3);
        object3 = this.shapeAppearanceModel;
        object2 = new MaterialShapeDrawable((ShapeAppearanceModel)object3);
        ((MaterialShapeDrawable)object2).setTint(0);
        int n8 = this.strokeWidth;
        float f6 = n8;
        boolean n10 = this.shouldDrawSurfaceColorStroke;
        if (n10) {
            object = this.materialButton;
            int n14 = R$attr.colorSurface;
            int n15 = MaterialColors.getColor((View)object, n14);
        } else {
            boolean bl2 = false;
            object = null;
        }
        ((MaterialShapeDrawable)object2).setStroke(f6, (int)var10_13);
        n8 = (int)(IS_MIN_LOLLIPOP ? 1 : 0);
        if (n8 != 0) {
            object = this.shapeAppearanceModel;
            object3 = new MaterialShapeDrawable((ShapeAppearanceModel)object);
            this.maskDrawable = object3;
            object3.setTint(-1);
            object = RippleUtils.sanitizeRippleDrawableColor(this.rippleColor);
            Drawable drawable2 = new Drawable[n4];
            drawable2[0] = object2;
            drawable2[n3] = materialShapeDrawable;
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[])drawable2);
            InsetDrawable insetDrawable = this.wrapDrawableWithInset((Drawable)layerDrawable);
            drawable2 = this.maskDrawable;
            object3 = new RippleDrawable((ColorStateList)object, (Drawable)insetDrawable, drawable2);
            this.rippleDrawable = object3;
            return object3;
        }
        object = this.shapeAppearanceModel;
        object3 = new RippleDrawableCompat((ShapeAppearanceModel)object);
        this.maskDrawable = object3;
        object = RippleUtils.sanitizeRippleDrawableColor(this.rippleColor);
        object3.setTintList((ColorStateList)object);
        object = this.maskDrawable;
        Drawable[] drawableArray = new Drawable[3];
        drawableArray[0] = object2;
        drawableArray[n3] = materialShapeDrawable;
        drawableArray[n4] = object;
        object3 = new LayerDrawable(drawableArray);
        this.rippleDrawable = object3;
        return this.wrapDrawableWithInset((Drawable)object3);
    }

    private MaterialShapeDrawable getMaterialShapeDrawable(boolean bl2) {
        int n3;
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable != null && (n3 = layerDrawable.getNumberOfLayers()) > 0) {
            n3 = (int)(IS_MIN_LOLLIPOP ? 1 : 0);
            if (n3 != 0) {
                layerDrawable = (LayerDrawable)((InsetDrawable)this.rippleDrawable.getDrawable(0)).getDrawable();
                return (MaterialShapeDrawable)layerDrawable.getDrawable((int)((bl2 ^= true) ? 1 : 0));
            }
            layerDrawable = this.rippleDrawable;
            return (MaterialShapeDrawable)layerDrawable.getDrawable((int)((bl2 ^= true) ? 1 : 0));
        }
        return null;
    }

    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return this.getMaterialShapeDrawable(true);
    }

    private void setVerticalInsets(int n3, int n4) {
        MaterialButton materialButton = this.materialButton;
        Object object = ViewCompat.a;
        int n7 = materialButton.getPaddingStart();
        object = this.materialButton;
        int n8 = object.getPaddingTop();
        MaterialButton materialButton2 = this.materialButton;
        int n10 = materialButton2.getPaddingEnd();
        MaterialButton materialButton3 = this.materialButton;
        int n14 = materialButton3.getPaddingBottom();
        int n15 = this.insetTop;
        int n16 = this.insetBottom;
        this.insetBottom = n4;
        this.insetTop = n3;
        boolean bl2 = this.backgroundOverwritten;
        if (!bl2) {
            this.updateBackground();
        }
        MaterialButton materialButton4 = this.materialButton;
        n8 = n8 + n3 - n15;
        n14 = n14 + n4 - n16;
        materialButton4.setPaddingRelative(n7, n8, n10, n14);
    }

    private void updateBackground() {
        Shapeable shapeable = this.materialButton;
        Object object = this.createBackground();
        ((MaterialButton)shapeable).setInternalBackground((Drawable)object);
        shapeable = this.getMaterialShapeDrawable();
        if (shapeable != null) {
            int n3 = this.elevation;
            float f5 = n3;
            ((MaterialShapeDrawable)shapeable).setElevation(f5);
            object = this.materialButton.getDrawableState();
            shapeable.setState((int[])object);
        }
    }

    private void updateButtonShape(ShapeAppearanceModel object) {
        int n3 = IS_LOLLIPOP;
        if (n3 != 0 && (n3 = this.backgroundOverwritten) == 0) {
            object = this.materialButton;
            Object object2 = ViewCompat.a;
            int n4 = object.getPaddingStart();
            object2 = this.materialButton;
            n3 = object2.getPaddingTop();
            MaterialButton materialButton = this.materialButton;
            int n7 = materialButton.getPaddingEnd();
            MaterialButton materialButton2 = this.materialButton;
            int n8 = materialButton2.getPaddingBottom();
            this.updateBackground();
            MaterialButton materialButton3 = this.materialButton;
            materialButton3.setPaddingRelative(n4, n3, n7, n8);
        } else {
            Shapeable shapeable = this.getMaterialShapeDrawable();
            if (shapeable != null) {
                shapeable = this.getMaterialShapeDrawable();
                ((MaterialShapeDrawable)shapeable).setShapeAppearanceModel((ShapeAppearanceModel)object);
            }
            if ((shapeable = this.getSurfaceColorStrokeDrawable()) != null) {
                shapeable = this.getSurfaceColorStrokeDrawable();
                ((MaterialShapeDrawable)shapeable).setShapeAppearanceModel((ShapeAppearanceModel)object);
            }
            if ((shapeable = this.getMaskDrawable()) != null) {
                shapeable = this.getMaskDrawable();
                shapeable.setShapeAppearanceModel((ShapeAppearanceModel)object);
            }
        }
    }

    private void updateStroke() {
        MaterialShapeDrawable materialShapeDrawable = this.getMaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = this.getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            int n3 = this.strokeWidth;
            float f5 = n3;
            ColorStateList colorStateList = this.strokeColor;
            materialShapeDrawable.setStroke(f5, colorStateList);
            if (materialShapeDrawable2 != null) {
                int n4 = this.strokeWidth;
                float f6 = n4;
                n3 = (int)(this.shouldDrawSurfaceColorStroke ? 1 : 0);
                if (n3 != 0) {
                    MaterialButton materialButton = this.materialButton;
                    int n7 = R$attr.colorSurface;
                    n3 = MaterialColors.getColor((View)materialButton, n7);
                } else {
                    n3 = 0;
                    f5 = 0.0f;
                    Object var8_9 = null;
                }
                materialShapeDrawable2.setStroke(f6, n3);
            }
        }
    }

    private InsetDrawable wrapDrawableWithInset(Drawable drawable2) {
        int n3 = this.insetLeft;
        int n4 = this.insetTop;
        int n7 = this.insetRight;
        int n8 = this.insetBottom;
        InsetDrawable insetDrawable = new InsetDrawable(drawable2, n3, n4, n7, n8);
        return insetDrawable;
    }

    public int getCornerRadius() {
        return this.cornerRadius;
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public int getInsetTop() {
        return this.insetTop;
    }

    public Shapeable getMaskDrawable() {
        int n3;
        int n4;
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable != null && (n4 = layerDrawable.getNumberOfLayers()) > (n3 = 1)) {
            int n7;
            layerDrawable = this.rippleDrawable;
            n4 = layerDrawable.getNumberOfLayers();
            if (n4 > (n7 = 2)) {
                return (Shapeable)this.rippleDrawable.getDrawable(n7);
            }
            return (Shapeable)this.rippleDrawable.getDrawable(n3);
        }
        return null;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.getMaterialShapeDrawable(false);
    }

    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    public void loadFromAttributes(TypedArray object) {
        Object object2;
        int n3 = R$styleable.MaterialButton_android_insetLeft;
        int n4 = 0;
        Object object3 = null;
        this.insetLeft = n3 = object.getDimensionPixelOffset(n3, 0);
        n3 = R$styleable.MaterialButton_android_insetRight;
        this.insetRight = n3 = object.getDimensionPixelOffset(n3, 0);
        n3 = R$styleable.MaterialButton_android_insetTop;
        this.insetTop = n3 = object.getDimensionPixelOffset(n3, 0);
        n3 = R$styleable.MaterialButton_android_insetBottom;
        this.insetBottom = n3 = object.getDimensionPixelOffset(n3, 0);
        n3 = R$styleable.MaterialButton_cornerRadius;
        n3 = (int)(object.hasValue(n3) ? 1 : 0);
        int n7 = 1;
        int n8 = -1;
        if (n3 != 0) {
            n3 = R$styleable.MaterialButton_cornerRadius;
            this.cornerRadius = n3 = object.getDimensionPixelSize(n3, n8);
            ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
            float f5 = n3;
            object2 = shapeAppearanceModel.withCornerSize(f5);
            this.setShapeAppearanceModel((ShapeAppearanceModel)object2);
            this.cornerRadiusSet = n7;
        }
        n3 = R$styleable.MaterialButton_strokeWidth;
        this.strokeWidth = n3 = object.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.MaterialButton_backgroundTintMode;
        n3 = object.getInt(n3, n8);
        Object object4 = PorterDuff.Mode.SRC_IN;
        object2 = ViewUtils.parseTintMode(n3, object4);
        this.backgroundTintMode = object2;
        object2 = this.materialButton.getContext();
        n8 = R$styleable.MaterialButton_backgroundTint;
        object2 = MaterialResources.getColorStateList((Context)object2, object, n8);
        this.backgroundTint = object2;
        object2 = this.materialButton.getContext();
        n8 = R$styleable.MaterialButton_strokeColor;
        object2 = MaterialResources.getColorStateList((Context)object2, object, n8);
        this.strokeColor = object2;
        object2 = this.materialButton.getContext();
        n8 = R$styleable.MaterialButton_rippleColor;
        object2 = MaterialResources.getColorStateList((Context)object2, object, n8);
        this.rippleColor = object2;
        n3 = R$styleable.MaterialButton_android_checkable;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        this.checkable = n3;
        n3 = R$styleable.MaterialButton_elevation;
        this.elevation = n3 = object.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.MaterialButton_toggleCheckedStateOnClick;
        n3 = (int)(object.getBoolean(n3, n7 != 0) ? 1 : 0);
        this.toggleCheckedStateOnClick = n3;
        object2 = this.materialButton;
        object3 = ViewCompat.a;
        n3 = object2.getPaddingStart();
        object3 = this.materialButton;
        n4 = object3.getPaddingTop();
        MaterialButton materialButton = this.materialButton;
        n7 = materialButton.getPaddingEnd();
        object4 = this.materialButton;
        n8 = object4.getPaddingBottom();
        int n10 = R$styleable.MaterialButton_android_background;
        boolean bl2 = object.hasValue(n10);
        if (bl2) {
            this.setBackgroundOverwritten();
        } else {
            this.updateBackground();
        }
        object = this.materialButton;
        n10 = this.insetLeft;
        n3 += n10;
        n10 = this.insetTop;
        n4 += n10;
        n10 = this.insetRight;
        n7 += n10;
        n10 = this.insetBottom;
        object.setPaddingRelative(n3, n4, n7, n8 += n10);
    }

    public void setBackgroundColor(int n3) {
        MaterialShapeDrawable materialShapeDrawable = this.getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable = this.getMaterialShapeDrawable();
            materialShapeDrawable.setTint(n3);
        }
    }

    public void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        MaterialButton materialButton = this.materialButton;
        ColorStateList colorStateList = this.backgroundTint;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton = this.materialButton;
        colorStateList = this.backgroundTintMode;
        materialButton.setSupportBackgroundTintMode((PorterDuff.Mode)colorStateList);
    }

    public void setCheckable(boolean bl2) {
        this.checkable = bl2;
    }

    public void setCornerRadius(int n3) {
        int n4 = this.cornerRadiusSet;
        if (n4 == 0 || (n4 = this.cornerRadius) != n3) {
            this.cornerRadius = n3;
            n4 = 1;
            this.cornerRadiusSet = n4;
            ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
            float f5 = n3;
            ShapeAppearanceModel shapeAppearanceModel2 = shapeAppearanceModel.withCornerSize(f5);
            this.setShapeAppearanceModel(shapeAppearanceModel2);
        }
    }

    public void setInsetBottom(int n3) {
        int n4 = this.insetTop;
        this.setVerticalInsets(n4, n3);
    }

    public void setInsetTop(int n3) {
        int n4 = this.insetBottom;
        this.setVerticalInsets(n3, n4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        Object object = this.rippleColor;
        if (object != colorStateList) {
            Drawable drawable2;
            boolean bl2;
            this.rippleColor = colorStateList;
            boolean bl3 = IS_MIN_LOLLIPOP;
            if (bl3 && (bl2 = (drawable2 = this.materialButton.getBackground()) instanceof RippleDrawable)) {
                object = (RippleDrawable)this.materialButton.getBackground();
                colorStateList = RippleUtils.sanitizeRippleDrawableColor(colorStateList);
                object.setColor(colorStateList);
            } else if (!bl3 && (bl3 = (object = this.materialButton.getBackground()) instanceof RippleDrawableCompat)) {
                object = (RippleDrawableCompat)this.materialButton.getBackground();
                colorStateList = RippleUtils.sanitizeRippleDrawableColor(colorStateList);
                ((RippleDrawableCompat)object).setTintList(colorStateList);
            }
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.updateButtonShape(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean bl2) {
        this.shouldDrawSurfaceColorStroke = bl2;
        this.updateStroke();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.strokeColor;
        if (colorStateList2 != colorStateList) {
            this.strokeColor = colorStateList;
            this.updateStroke();
        }
    }

    public void setStrokeWidth(int n3) {
        int n4 = this.strokeWidth;
        if (n4 != n3) {
            this.strokeWidth = n3;
            this.updateStroke();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList object) {
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != object) {
            this.backgroundTint = object;
            object = this.getMaterialShapeDrawable();
            if (object != null) {
                object = this.getMaterialShapeDrawable();
                colorStateList = this.backgroundTint;
                ((MaterialShapeDrawable)object).setTintList(colorStateList);
            }
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode object) {
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != object) {
            this.backgroundTintMode = object;
            object = this.getMaterialShapeDrawable();
            if (object != null && (object = this.backgroundTintMode) != null) {
                object = this.getMaterialShapeDrawable();
                mode = this.backgroundTintMode;
                ((MaterialShapeDrawable)object).setTintMode(mode);
            }
        }
    }

    public void setToggleCheckedStateOnClick(boolean bl2) {
        this.toggleCheckedStateOnClick = bl2;
    }

    public void updateMaskBounds(int n3, int n4) {
        Drawable drawable2 = this.maskDrawable;
        if (drawable2 != null) {
            int n7 = this.insetLeft;
            int n8 = this.insetTop;
            int n10 = this.insetRight;
            n4 -= n10;
            n10 = this.insetBottom;
            drawable2.setBounds(n7, n8, n4, n3 -= n10);
        }
    }
}

