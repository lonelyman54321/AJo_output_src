/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.StateListAnimator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.R$color;
import com.google.android.material.floatingactionbutton.BorderDrawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

class FloatingActionButtonImplLollipop
extends FloatingActionButtonImpl {
    private StateListAnimator stateListAnimator;

    public FloatingActionButtonImplLollipop(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    private StateListAnimator createDefaultStateListAnimator(float f5, float f6, float f7) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        Object object = FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET;
        Object object2 = this.createElevationAnimator(f5, f7);
        stateListAnimator.addState(object, (Animator)object2);
        object2 = FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET;
        object = this.createElevationAnimator(f5, f6);
        stateListAnimator.addState((int[])object2, (Animator)object);
        object2 = FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET;
        object = this.createElevationAnimator(f5, f6);
        stateListAnimator.addState((int[])object2, (Animator)object);
        object2 = FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET;
        Animator animator2 = this.createElevationAnimator(f5, f6);
        stateListAnimator.addState((int[])object2, animator2);
        animator2 = new AnimatorSet();
        object2 = new ArrayList();
        object = this.view;
        String string2 = "elevation";
        int n3 = 1;
        float[] fArray = new float[n3];
        fArray[0] = f5;
        Object object3 = ObjectAnimator.ofFloat((Object)object, (String)string2, (float[])fArray);
        long l2 = 0L;
        object3 = object3.setDuration(l2);
        ((ArrayList)object2).add(object3);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 22;
        long l3 = 100;
        if (n4 >= n7 && n4 <= (n7 = 24)) {
            object3 = this.view;
            object = View.TRANSLATION_Z;
            float f8 = object3.getTranslationZ();
            fArray = new float[n3];
            fArray[0] = f8;
            object3 = ObjectAnimator.ofFloat((Object)object3, (Property)object, (float[])fArray).setDuration(l3);
            ((ArrayList)object2).add(object3);
        }
        object3 = this.view;
        object = View.TRANSLATION_Z;
        float[] fArray2 = new float[n3];
        fArray2[0] = 0.0f;
        object3 = ObjectAnimator.ofFloat((Object)object3, (Property)object, (float[])fArray2).setDuration(l3);
        ((ArrayList)object2).add(object3);
        object3 = new TimeInterpolator[]{};
        object3 = (TimeInterpolator)((ArrayList)object2).toArray((T[])object3);
        animator2.playSequentially((Animator[])object3);
        object3 = FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR;
        animator2.setInterpolator(object3);
        object3 = FloatingActionButtonImpl.ENABLED_STATE_SET;
        stateListAnimator.addState((int[])object3, animator2);
        object3 = FloatingActionButtonImpl.EMPTY_STATE_SET;
        animator2 = this.createElevationAnimator(0.0f, 0.0f);
        stateListAnimator.addState((int[])object3, animator2);
        return stateListAnimator;
    }

    private Animator createElevationAnimator(float f5, float f6) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.view;
        int n3 = 1;
        float[] fArray = new float[n3];
        fArray[0] = f5;
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)floatingActionButton, (String)"elevation", (float[])fArray).setDuration(0L);
        objectAnimator = animatorSet.play((Animator)objectAnimator);
        floatingActionButton = this.view;
        Property property = View.TRANSLATION_Z;
        float[] fArray2 = new float[n3];
        fArray2[0] = f6;
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat((Object)floatingActionButton, (Property)property, (float[])fArray2).setDuration((long)100);
        objectAnimator.with((Animator)objectAnimator2);
        objectAnimator = FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR;
        animatorSet.setInterpolator((TimeInterpolator)objectAnimator);
        return animatorSet;
    }

    public BorderDrawable createBorderDrawable(int n3, ColorStateList colorStateList) {
        Context context = this.view.getContext();
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearance;
        shapeAppearanceModel.getClass();
        BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel);
        int n4 = R$color.design_fab_stroke_top_outer_color;
        n4 = t70.getColor(context, n4);
        int n7 = R$color.design_fab_stroke_top_inner_color;
        n7 = t70.getColor(context, n7);
        int n8 = R$color.design_fab_stroke_end_inner_color;
        n8 = t70.getColor(context, n8);
        int n10 = R$color.design_fab_stroke_end_outer_color;
        int n14 = t70.getColor(context, n10);
        borderDrawable.setGradientColors(n4, n7, n8, n14);
        float f5 = n3;
        borderDrawable.setBorderWidth(f5);
        borderDrawable.setBorderTint(colorStateList);
        return borderDrawable;
    }

    public MaterialShapeDrawable createShapeDrawable() {
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearance;
        shapeAppearanceModel.getClass();
        FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable floatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable = new FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
        return floatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable;
    }

    public float getElevation() {
        return this.view.getElevation();
    }

    public void getPadding(Rect rect) {
        ShadowViewDelegate shadowViewDelegate = this.shadowViewDelegate;
        int n3 = shadowViewDelegate.isCompatPaddingEnabled();
        if (n3 != 0) {
            super.getPadding(rect);
        } else {
            n3 = this.shouldExpandBoundsForA11y();
            if (n3 == 0) {
                n3 = this.minTouchTargetSize;
                FloatingActionButton floatingActionButton = this.view;
                int n4 = floatingActionButton.getSizeDimension();
                n3 = (n3 - n4) / 2;
                rect.set(n3, n3, n3, n3);
            } else {
                n3 = 0;
                shadowViewDelegate = null;
                rect.set(0, 0, 0, 0);
            }
        }
    }

    public void initializeBackgroundDrawable(ColorStateList object, PorterDuff.Mode object2, ColorStateList colorStateList, int n3) {
        Object object3;
        MaterialShapeDrawable materialShapeDrawable;
        this.shapeDrawable = materialShapeDrawable = this.createShapeDrawable();
        materialShapeDrawable.setTintList((ColorStateList)object);
        if (object2 != null) {
            materialShapeDrawable = this.shapeDrawable;
            materialShapeDrawable.setTintMode((PorterDuff.Mode)object2);
        }
        object2 = this.shapeDrawable;
        materialShapeDrawable = this.view.getContext();
        ((MaterialShapeDrawable)object2).initializeElevationOverlay((Context)materialShapeDrawable);
        object2 = null;
        if (n3 > 0) {
            object = this.createBorderDrawable(n3, (ColorStateList)object);
            this.borderDrawable = object;
            object3 = this.borderDrawable;
            object3.getClass();
            materialShapeDrawable = this.shapeDrawable;
            materialShapeDrawable.getClass();
            int n4 = 2;
            Drawable[] drawableArray = new Drawable[n4];
            drawableArray[0] = object3;
            n3 = 1;
            drawableArray[n3] = materialShapeDrawable;
            object = new LayerDrawable(drawableArray);
        } else {
            this.borderDrawable = null;
            object = this.shapeDrawable;
        }
        colorStateList = RippleUtils.sanitizeRippleDrawableColor(colorStateList);
        object3 = new RippleDrawable(colorStateList, (Drawable)object, null);
        this.rippleDrawable = object3;
        this.contentBackground = object3;
    }

    public void jumpDrawableToCurrentState() {
    }

    public void onCompatShadowChanged() {
        this.updatePadding();
    }

    public void onDrawableStateChanged(int[] object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 21;
        float f5 = 2.9E-44f;
        if (n3 == n4) {
            object = this.view;
            n3 = (int)(object.isEnabled() ? 1 : 0);
            n4 = 0;
            f5 = 0.0f;
            if (n3 != 0) {
                object = this.view;
                float f6 = this.elevation;
                ((FloatingActionButton)object).setElevation(f6);
                object = this.view;
                n3 = (int)(object.isPressed() ? 1 : 0);
                if (n3 != 0) {
                    object = this.view;
                    f5 = this.pressedTranslationZ;
                    ((FloatingActionButton)object).setTranslationZ(f5);
                } else {
                    object = this.view;
                    n3 = (int)(object.isFocused() ? 1 : 0);
                    if (n3 == 0 && (n3 = (int)((object = this.view).isHovered() ? 1 : 0)) == 0) {
                        object = this.view;
                        ((FloatingActionButton)object).setTranslationZ(0.0f);
                    } else {
                        object = this.view;
                        f5 = this.hoveredFocusedTranslationZ;
                        ((FloatingActionButton)object).setTranslationZ(f5);
                    }
                }
            } else {
                this.view.setElevation(0.0f);
                object = this.view;
                ((FloatingActionButton)object).setTranslationZ(0.0f);
            }
        }
    }

    public void onElevationsChanged(float f5, float f6, float f7) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 21;
        if (n3 == n4) {
            FloatingActionButton floatingActionButton = this.view;
            floatingActionButton.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator;
            StateListAnimator stateListAnimator2 = this.view.getStateListAnimator();
            if (stateListAnimator2 == (stateListAnimator = this.stateListAnimator)) {
                StateListAnimator stateListAnimator3;
                this.stateListAnimator = stateListAnimator3 = this.createDefaultStateListAnimator(f5, f6, f7);
                FloatingActionButton floatingActionButton = this.view;
                floatingActionButton.setStateListAnimator(stateListAnimator3);
            }
        }
        boolean bl2 = this.shouldAddPadding();
        if (bl2) {
            this.updatePadding();
        }
    }

    public boolean requirePreDrawListener() {
        return false;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable2 = this.rippleDrawable;
        boolean bl2 = drawable2 instanceof RippleDrawable;
        if (bl2) {
            drawable2 = (RippleDrawable)drawable2;
            colorStateList = RippleUtils.sanitizeRippleDrawableColor(colorStateList);
            drawable2.setColor(colorStateList);
        } else {
            super.setRippleColor(colorStateList);
        }
    }

    public boolean shouldAddPadding() {
        ShadowViewDelegate shadowViewDelegate = this.shadowViewDelegate;
        boolean bl2 = shadowViewDelegate.isCompatPaddingEnabled();
        if (!bl2 && (bl2 = this.shouldExpandBoundsForA11y())) {
            bl2 = false;
            shadowViewDelegate = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public void updateFromViewRotation() {
    }
}

