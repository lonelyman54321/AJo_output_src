/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialSwitch
extends SwitchCompat {
    private static final int DEF_STYLE_RES = R$style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] STATE_SET_WITH_ICON;
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;
    private Drawable thumbDrawable;
    private Drawable thumbIconDrawable;
    private int thumbIconSize;
    private ColorStateList thumbIconTintList;
    private PorterDuff.Mode thumbIconTintMode;
    private ColorStateList thumbTintList;
    private Drawable trackDecorationDrawable;
    private ColorStateList trackDecorationTintList;
    private PorterDuff.Mode trackDecorationTintMode;
    private Drawable trackDrawable;
    private ColorStateList trackTintList;

    static {
        int n3 = R$attr.state_with_icon;
        STATE_SET_WITH_ICON = new int[]{n3};
    }

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialSwitchStyle;
        this(context, attributeSet, n3);
    }

    public MaterialSwitch(Context context, AttributeSet object, int n3) {
        Drawable drawable2;
        Object object2;
        Drawable drawable3;
        int n4;
        int n7 = DEF_STYLE_RES;
        context = MaterialThemeOverlay.wrap(context, (AttributeSet)object, n3, n7);
        super(context, (AttributeSet)object, n3);
        this.thumbIconSize = n4 = -1;
        Context context2 = this.getContext();
        this.thumbDrawable = drawable3 = super.getThumbDrawable();
        drawable3 = super.getThumbTintList();
        this.thumbTintList = drawable3;
        super.setThumbTintList(null);
        this.trackDrawable = object2 = super.getTrackDrawable();
        object2 = super.getTrackTintList();
        this.trackTintList = object2;
        super.setTrackTintList(null);
        object2 = R$styleable.MaterialSwitch;
        int[] nArray = new int[]{};
        drawable3 = object;
        object = ThemeEnforcement.obtainTintedStyledAttributes(context2, (AttributeSet)object, (int[])object2, n3, n7, nArray);
        n3 = R$styleable.MaterialSwitch_thumbIcon;
        this.thumbIconDrawable = drawable2 = ((Tn3)object).b(n3);
        n3 = R$styleable.MaterialSwitch_thumbIconSize;
        context2 = ((Tn3)object).b;
        this.thumbIconSize = n3 = context2.getDimensionPixelSize(n3, n4);
        n3 = R$styleable.MaterialSwitch_thumbIconTint;
        drawable2 = ((Tn3)object).a(n3);
        this.thumbIconTintList = drawable2;
        n3 = R$styleable.MaterialSwitch_thumbIconTintMode;
        n3 = context2.getInt(n3, n4);
        drawable3 = PorterDuff.Mode.SRC_IN;
        drawable2 = ViewUtils.parseTintMode(n3, (PorterDuff.Mode)drawable3);
        this.thumbIconTintMode = drawable2;
        n3 = R$styleable.MaterialSwitch_trackDecoration;
        this.trackDecorationDrawable = drawable2 = ((Tn3)object).b(n3);
        n3 = R$styleable.MaterialSwitch_trackDecorationTint;
        drawable2 = ((Tn3)object).a(n3);
        this.trackDecorationTintList = drawable2;
        n3 = R$styleable.MaterialSwitch_trackDecorationTintMode;
        context = ViewUtils.parseTintMode(context2.getInt(n3, n4), (PorterDuff.Mode)drawable3);
        this.trackDecorationTintMode = context;
        ((Tn3)object).g();
        this.setEnforceSwitchWidth(false);
        this.refreshThumbDrawable();
        this.refreshTrackDrawable();
    }

    private void refreshThumbDrawable() {
        Drawable drawable2 = this.thumbDrawable;
        ColorStateList colorStateList = this.thumbTintList;
        PorterDuff.Mode mode = this.getThumbTintMode();
        this.thumbDrawable = drawable2 = DrawableUtils.createTintableDrawableIfNeeded(drawable2, colorStateList, mode);
        drawable2 = this.thumbIconDrawable;
        colorStateList = this.thumbIconTintList;
        mode = this.thumbIconTintMode;
        this.thumbIconDrawable = drawable2 = DrawableUtils.createTintableDrawableIfNeeded(drawable2, colorStateList, mode);
        this.updateDrawableTints();
        drawable2 = this.thumbDrawable;
        colorStateList = this.thumbIconDrawable;
        int n3 = this.thumbIconSize;
        drawable2 = DrawableUtils.compositeTwoLayeredDrawable(drawable2, (Drawable)colorStateList, n3, n3);
        super.setThumbDrawable(drawable2);
        this.refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        int n3;
        Drawable drawable2 = this.trackDrawable;
        ColorStateList colorStateList = this.trackTintList;
        PorterDuff.Mode mode = this.getTrackTintMode();
        this.trackDrawable = drawable2 = DrawableUtils.createTintableDrawableIfNeeded(drawable2, colorStateList, mode);
        drawable2 = this.trackDecorationDrawable;
        colorStateList = this.trackDecorationTintList;
        mode = this.trackDecorationTintMode;
        this.trackDecorationDrawable = drawable2 = DrawableUtils.createTintableDrawableIfNeeded(drawable2, colorStateList, mode);
        this.updateDrawableTints();
        drawable2 = this.trackDrawable;
        if (drawable2 != null && (colorStateList = this.trackDecorationDrawable) != null) {
            colorStateList = this.trackDrawable;
            mode = this.trackDecorationDrawable;
            int n4 = 2;
            Drawable[] drawableArray = new Drawable[n4];
            drawableArray[0] = colorStateList;
            n3 = 1;
            drawableArray[n3] = mode;
            drawable2 = new LayerDrawable(drawableArray);
        } else if (drawable2 == null) {
            drawable2 = this.trackDecorationDrawable;
        }
        if (drawable2 != null) {
            n3 = drawable2.getIntrinsicWidth();
            this.setSwitchMinWidth(n3);
        }
        super.setTrackDrawable(drawable2);
    }

    private static void setInterpolatedDrawableTintIfPossible(Drawable drawable2, ColorStateList colorStateList, int[] nArray, int[] nArray2, float f5) {
        if (drawable2 != null && colorStateList != null) {
            int n3 = colorStateList.getColorForState(nArray, 0);
            int n4 = colorStateList.getColorForState(nArray2, 0);
            n4 = hZ.c(n3, n4, f5);
            drawable2.setTint(n4);
        }
    }

    private void updateDrawableTints() {
        int[] nArray;
        int[] nArray2;
        Drawable drawable2;
        ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList == null && (colorStateList = this.thumbIconTintList) == null && (colorStateList = this.trackTintList) == null && (colorStateList = this.trackDecorationTintList) == null) {
            return;
        }
        float f5 = this.getThumbPosition();
        ColorStateList colorStateList2 = this.thumbTintList;
        if (colorStateList2 != null) {
            drawable2 = this.thumbDrawable;
            nArray2 = this.currentStateUnchecked;
            nArray = this.currentStateChecked;
            MaterialSwitch.setInterpolatedDrawableTintIfPossible(drawable2, colorStateList2, nArray2, nArray, f5);
        }
        if ((colorStateList2 = this.thumbIconTintList) != null) {
            drawable2 = this.thumbIconDrawable;
            nArray2 = this.currentStateUnchecked;
            nArray = this.currentStateChecked;
            MaterialSwitch.setInterpolatedDrawableTintIfPossible(drawable2, colorStateList2, nArray2, nArray, f5);
        }
        if ((colorStateList2 = this.trackTintList) != null) {
            drawable2 = this.trackDrawable;
            nArray2 = this.currentStateUnchecked;
            nArray = this.currentStateChecked;
            MaterialSwitch.setInterpolatedDrawableTintIfPossible(drawable2, colorStateList2, nArray2, nArray, f5);
        }
        if ((colorStateList2 = this.trackDecorationTintList) != null) {
            drawable2 = this.trackDecorationDrawable;
            nArray2 = this.currentStateUnchecked;
            nArray = this.currentStateChecked;
            MaterialSwitch.setInterpolatedDrawableTintIfPossible(drawable2, colorStateList2, nArray2, nArray, f5);
        }
    }

    public Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    public Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    public int getThumbIconSize() {
        return this.thumbIconSize;
    }

    public ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    public void invalidate() {
        this.updateDrawableTints();
        super.invalidate();
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray = super.onCreateDrawableState(++n3);
        Object object = this.thumbIconDrawable;
        if (object != null) {
            object = STATE_SET_WITH_ICON;
            View.mergeDrawableStates((int[])nArray, (int[])object);
        }
        object = DrawableUtils.getUncheckedState(nArray);
        this.currentStateUnchecked = (int[])object;
        object = DrawableUtils.getCheckedState(nArray);
        this.currentStateChecked = (int[])object;
        return nArray;
    }

    public void setThumbDrawable(Drawable drawable2) {
        this.thumbDrawable = drawable2;
        this.refreshThumbDrawable();
    }

    public void setThumbIconDrawable(Drawable drawable2) {
        this.thumbIconDrawable = drawable2;
        this.refreshThumbDrawable();
    }

    public void setThumbIconResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setThumbIconDrawable(drawable2);
    }

    public void setThumbIconSize(int n3) {
        int n4 = this.thumbIconSize;
        if (n4 != n3) {
            this.thumbIconSize = n3;
            this.refreshThumbDrawable();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        this.refreshThumbDrawable();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        this.refreshThumbDrawable();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        this.refreshThumbDrawable();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        this.refreshThumbDrawable();
    }

    public void setTrackDecorationDrawable(Drawable drawable2) {
        this.trackDecorationDrawable = drawable2;
        this.refreshTrackDrawable();
    }

    public void setTrackDecorationResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setTrackDecorationDrawable(drawable2);
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        this.refreshTrackDrawable();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        this.refreshTrackDrawable();
    }

    public void setTrackDrawable(Drawable drawable2) {
        this.trackDrawable = drawable2;
        this.refreshTrackDrawable();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        this.refreshTrackDrawable();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        this.refreshTrackDrawable();
    }
}

