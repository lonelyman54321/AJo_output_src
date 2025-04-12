/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton$1;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton$ShadowDelegateImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButton$TransformationCallbackWrapper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class FloatingActionButton
extends VisibilityAwareImageButton
implements ExpandableTransformationWidget,
Shapeable,
CoordinatorLayout$b {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = 0;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = 255;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;
    private final ExpandableWidgetHelper expandableWidgetHelper;
    private final un imageHelper;
    private PorterDuff.Mode imageMode;
    private int imagePadding;
    private ColorStateList imageTint;
    private FloatingActionButtonImpl impl;
    private int maxImageSize;
    private ColorStateList rippleColor;
    final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_FloatingActionButton;
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.floatingActionButtonStyle;
        this(context, attributeSet, n3);
    }

    public FloatingActionButton(Context object, AttributeSet object2, int n3) {
        int bl2 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap((Context)object, (AttributeSet)object2, n3, bl2);
        super((Context)object, (AttributeSet)object2, n3);
        object = new Rect();
        this.shadowPadding = object;
        object = new Rect();
        this.touchArea = object;
        object = this.getContext();
        int[] nArray = R$styleable.FloatingActionButton;
        Object object3 = new int[]{};
        Object object4 = object;
        Object object5 = object2;
        int n4 = n3;
        int n7 = bl2;
        object4 = ThemeEnforcement.obtainStyledAttributes((Context)object, (AttributeSet)object2, nArray, n3, bl2, object3);
        int n8 = R$styleable.FloatingActionButton_backgroundTint;
        object5 = MaterialResources.getColorStateList((Context)object, (TypedArray)object4, n8);
        this.backgroundTint = object5;
        n8 = R$styleable.FloatingActionButton_backgroundTintMode;
        int n10 = -1;
        object5 = ViewUtils.parseTintMode(object4.getInt(n8, n10), null);
        this.backgroundTintMode = object5;
        n8 = R$styleable.FloatingActionButton_rippleColor;
        object5 = MaterialResources.getColorStateList((Context)object, (TypedArray)object4, n8);
        this.rippleColor = object5;
        n8 = R$styleable.FloatingActionButton_fabSize;
        this.size = n8 = object4.getInt(n8, n10);
        n8 = R$styleable.FloatingActionButton_fabCustomSize;
        this.customSize = n8 = object4.getDimensionPixelSize(n8, 0);
        n8 = R$styleable.FloatingActionButton_borderWidth;
        this.borderWidth = n8 = object4.getDimensionPixelSize(n8, 0);
        n8 = R$styleable.FloatingActionButton_elevation;
        float f5 = object4.getDimension(n8, 0.0f);
        n4 = R$styleable.FloatingActionButton_hoveredFocusedTranslationZ;
        float f6 = object4.getDimension(n4, 0.0f);
        n7 = R$styleable.FloatingActionButton_pressedTranslationZ;
        float f7 = object4.getDimension(n7, 0.0f);
        n7 = R$styleable.FloatingActionButton_useCompatPadding;
        n7 = (int)(object4.getBoolean(n7, false) ? 1 : 0);
        this.compatPadding = n7;
        Resources resources = this.getResources();
        int n14 = R$dimen.mtrl_fab_min_touch_target;
        n7 = resources.getDimensionPixelSize(n14);
        n14 = R$styleable.FloatingActionButton_maxImageSize;
        n14 = object4.getDimensionPixelSize(n14, 0);
        this.setMaxImageSize(n14);
        n14 = R$styleable.FloatingActionButton_showMotionSpec;
        object3 = MotionSpec.createFromAttribute((Context)object, (TypedArray)object4, n14);
        int n15 = R$styleable.FloatingActionButton_hideMotionSpec;
        MotionSpec motionSpec = MotionSpec.createFromAttribute((Context)object, (TypedArray)object4, n15);
        CornerSize cornerSize = ShapeAppearanceModel.PILL;
        object = ShapeAppearanceModel.builder((Context)object, (AttributeSet)object2, n3, bl2, cornerSize).build();
        int n16 = R$styleable.FloatingActionButton_ensureMinTouchTargetSize;
        boolean bl3 = object4.getBoolean(n16, false);
        int n17 = R$styleable.FloatingActionButton_android_enabled;
        n17 = (int)(object4.getBoolean(n17, true) ? 1 : 0);
        this.setEnabled(n17 != 0);
        object4.recycle();
        this.imageHelper = object4 = new un((ImageView)this);
        ((un)object4).b((AttributeSet)object2, n3);
        this.expandableWidgetHelper = object2 = new ExpandableWidgetHelper(this);
        this.getImpl().setShapeAppearance((ShapeAppearanceModel)object);
        object = this.getImpl();
        object2 = this.backgroundTint;
        PorterDuff.Mode mode = this.backgroundTintMode;
        object4 = this.rippleColor;
        n17 = this.borderWidth;
        ((FloatingActionButtonImpl)object).initializeBackgroundDrawable((ColorStateList)object2, mode, (ColorStateList)object4, n17);
        this.getImpl().setMinTouchTargetSize(n7);
        this.getImpl().setElevation(f5);
        this.getImpl().setHoveredFocusedTranslationZ(f6);
        this.getImpl().setPressedTranslationZ(f7);
        this.getImpl().setShowMotionSpec((MotionSpec)object3);
        this.getImpl().setHideMotionSpec(motionSpec);
        this.getImpl().setEnsureMinTouchTargetSize(bl3);
        object = ImageView.ScaleType.MATRIX;
        this.setScaleType((ImageView.ScaleType)object);
    }

    public static /* synthetic */ int access$000(FloatingActionButton floatingActionButton) {
        return floatingActionButton.imagePadding;
    }

    public static /* synthetic */ void access$101(FloatingActionButton floatingActionButton, Drawable drawable2) {
        super.setBackgroundDrawable(drawable2);
    }

    private FloatingActionButtonImpl createImpl() {
        FloatingActionButton$ShadowDelegateImpl floatingActionButton$ShadowDelegateImpl = new FloatingActionButton$ShadowDelegateImpl(this);
        FloatingActionButtonImplLollipop floatingActionButtonImplLollipop = new FloatingActionButtonImplLollipop(this, floatingActionButton$ShadowDelegateImpl);
        return floatingActionButtonImplLollipop;
    }

    private FloatingActionButtonImpl getImpl() {
        FloatingActionButtonImpl floatingActionButtonImpl = this.impl;
        if (floatingActionButtonImpl == null) {
            this.impl = floatingActionButtonImpl = this.createImpl();
        }
        return this.impl;
    }

    private int getSizeDimension(int n3) {
        int n4 = this.customSize;
        if (n4 != 0) {
            return n4;
        }
        Resources resources = this.getResources();
        int n7 = -1;
        int n8 = 1;
        if (n3 != n7) {
            if (n3 != n8) {
                n3 = R$dimen.design_fab_size_normal;
                return resources.getDimensionPixelSize(n3);
            }
            n3 = R$dimen.design_fab_size_mini;
            return resources.getDimensionPixelSize(n3);
        }
        Configuration configuration = resources.getConfiguration();
        n3 = configuration.screenWidthDp;
        resources = resources.getConfiguration();
        n4 = resources.screenHeightDp;
        if ((n3 = Math.max(n3, n4)) < (n4 = 470)) {
            n3 = this.getSizeDimension(n8);
        } else {
            configuration = null;
            n3 = this.getSizeDimension(0);
        }
        return n3;
    }

    private void getTouchTargetRect(Rect rect) {
        this.getMeasuredContentRect(rect);
        int n3 = -this.impl.getTouchTargetPadding();
        rect.inset(n3, n3);
    }

    private void offsetRectWithShadow(Rect rect) {
        int n3 = rect.left;
        Rect rect2 = this.shadowPadding;
        int n4 = rect2.left;
        rect.left = n3 += n4;
        n3 = rect.top;
        n4 = rect2.top;
        rect.top = n3 += n4;
        n3 = rect.right;
        n4 = rect2.right;
        rect.right = n3 -= n4;
        n3 = rect.bottom;
        int n7 = rect2.bottom;
        rect.bottom = n3 -= n7;
    }

    private void onApplySupportImageTint() {
        Drawable drawable2 = this.getDrawable();
        if (drawable2 == null) {
            return;
        }
        ColorStateList colorStateList = this.imageTint;
        if (colorStateList == null) {
            ut0_0.a(drawable2);
            return;
        }
        Object object = this.getDrawableState();
        int n3 = colorStateList.getColorForState(object, 0);
        object = this.imageMode;
        if (object == null) {
            object = PorterDuff.Mode.SRC_IN;
        }
        drawable2 = drawable2.mutate();
        colorStateList = qn.c(n3, (PorterDuff.Mode)object);
        drawable2.setColorFilter((ColorFilter)colorStateList);
    }

    private FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener) {
        if (floatingActionButton$OnVisibilityChangedListener == null) {
            return null;
        }
        FloatingActionButton$1 floatingActionButton$1 = new FloatingActionButton$1(this, floatingActionButton$OnVisibilityChangedListener);
        return floatingActionButton$1;
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.getImpl().addOnHideAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.getImpl().addOnShowAnimationListener(animatorListener);
    }

    public void addTransformationCallback(TransformationCallback transformationCallback) {
        FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
        FloatingActionButton$TransformationCallbackWrapper floatingActionButton$TransformationCallbackWrapper = new FloatingActionButton$TransformationCallbackWrapper(this, transformationCallback);
        floatingActionButtonImpl.addTransformationCallback(floatingActionButton$TransformationCallbackWrapper);
    }

    public void clearCustomSize() {
        this.setCustomSize(0);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
        int[] nArray = this.getDrawableState();
        floatingActionButtonImpl.onDrawableStateChanged(nArray);
    }

    public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public CoordinatorLayout$Behavior getBehavior() {
        FloatingActionButton$Behavior floatingActionButton$Behavior = new FloatingActionButton$Behavior();
        return floatingActionButton$Behavior;
    }

    public float getCompatElevation() {
        return this.getImpl().getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().getHoveredFocusedTranslationZ();
    }

    public float getCompatPressedTranslationZ() {
        return this.getImpl().getPressedTranslationZ();
    }

    public Drawable getContentBackground() {
        return this.getImpl().getContentBackground();
    }

    public boolean getContentRect(Rect rect) {
        int n3 = this.isLaidOut();
        if (n3 != 0) {
            n3 = this.getWidth();
            int n4 = this.getHeight();
            rect.set(0, 0, n3, n4);
            this.offsetRectWithShadow(rect);
            return true;
        }
        return false;
    }

    public int getCustomSize() {
        return this.customSize;
    }

    public int getExpandedComponentIdHint() {
        return this.expandableWidgetHelper.getExpandedComponentIdHint();
    }

    public MotionSpec getHideMotionSpec() {
        return this.getImpl().getHideMotionSpec();
    }

    public void getMeasuredContentRect(Rect rect) {
        int n3 = this.getMeasuredWidth();
        int n4 = this.getMeasuredHeight();
        rect.set(0, 0, n3, n4);
        this.offsetRectWithShadow(rect);
    }

    public int getRippleColor() {
        int n3;
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != null) {
            n3 = colorStateList.getDefaultColor();
        } else {
            n3 = 0;
            colorStateList = null;
        }
        return n3;
    }

    public ColorStateList getRippleColorStateList() {
        return this.rippleColor;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        ShapeAppearanceModel shapeAppearanceModel = this.getImpl().getShapeAppearance();
        shapeAppearanceModel.getClass();
        return shapeAppearanceModel;
    }

    public MotionSpec getShowMotionSpec() {
        return this.getImpl().getShowMotionSpec();
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeDimension() {
        int n3 = this.size;
        return this.getSizeDimension(n3);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.imageTint;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.imageMode;
    }

    public boolean getUseCompatPadding() {
        return this.compatPadding;
    }

    public void hide() {
        this.hide(null);
    }

    public void hide(FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener) {
        this.hide(floatingActionButton$OnVisibilityChangedListener, true);
    }

    public void hide(FloatingActionButton$OnVisibilityChangedListener object, boolean bl2) {
        FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
        object = this.wrapOnVisibilityChangedListener((FloatingActionButton$OnVisibilityChangedListener)object);
        floatingActionButtonImpl.hide((FloatingActionButtonImpl$InternalVisibilityChangedListener)object, bl2);
    }

    public boolean isExpanded() {
        return this.expandableWidgetHelper.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        return this.getImpl().isOrWillBeHidden();
    }

    public boolean isOrWillBeShown() {
        return this.getImpl().isOrWillBeShown();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().jumpDrawableToCurrentState();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getImpl().onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getImpl().onDetachedFromWindow();
    }

    public void onMeasure(int n3, int n4) {
        int n7 = this.getSizeDimension();
        int n8 = this.maxImageSize;
        this.imagePadding = n8 = (n7 - n8) / 2;
        this.getImpl().updatePadding();
        n3 = View.resolveSize((int)n7, (int)n3);
        n4 = View.resolveSize((int)n7, (int)n4);
        n3 = Math.min(n3, n4);
        Rect rect = this.shadowPadding;
        n7 = rect.left + n3;
        n8 = rect.right;
        n7 += n8;
        n8 = rect.top;
        n3 += n8;
        n4 = rect.bottom;
        this.setMeasuredDimension(n7, n3 += n4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof ExtendableSavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (ExtendableSavedState)parcelable;
        Object object = parcelable.getSuperState();
        super.onRestoreInstanceState((Parcelable)object);
        object = this.expandableWidgetHelper;
        parcelable = (Bundle)parcelable.extendableStates.get(EXPANDABLE_WIDGET_HELPER_KEY);
        parcelable.getClass();
        ((ExpandableWidgetHelper)object).onRestoreInstanceState((Bundle)parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        if (object == null) {
            object = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState((Parcelable)object);
        object = extendableSavedState.extendableStates;
        Bundle bundle = this.expandableWidgetHelper.onSaveInstanceState();
        ((a53)object).put(EXPANDABLE_WIDGET_HELPER_KEY, bundle);
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        if (n3 == 0) {
            Rect rect = this.touchArea;
            this.getTouchTargetRect(rect);
            rect = this.touchArea;
            float f5 = motionEvent.getX();
            int n4 = (int)f5;
            float f6 = motionEvent.getY();
            int n7 = (int)f6;
            n3 = (int)(rect.contains(n4, n7) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.getImpl().removeOnHideAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.getImpl().removeOnShowAnimationListener(animatorListener);
    }

    public void removeTransformationCallback(TransformationCallback transformationCallback) {
        FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
        FloatingActionButton$TransformationCallbackWrapper floatingActionButton$TransformationCallbackWrapper = new FloatingActionButton$TransformationCallbackWrapper(this, transformationCallback);
        floatingActionButtonImpl.removeTransformationCallback(floatingActionButton$TransformationCallbackWrapper);
    }

    public void setBackgroundColor(int n3) {
    }

    public void setBackgroundDrawable(Drawable drawable2) {
    }

    public void setBackgroundResource(int n3) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Object object = this.backgroundTint;
        if (object != colorStateList) {
            this.backgroundTint = colorStateList;
            object = this.getImpl();
            ((FloatingActionButtonImpl)object).setBackgroundTintList(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Object object = this.backgroundTintMode;
        if (object != mode) {
            this.backgroundTintMode = mode;
            object = this.getImpl();
            ((FloatingActionButtonImpl)object).setBackgroundTintMode(mode);
        }
    }

    public void setCompatElevation(float f5) {
        this.getImpl().setElevation(f5);
    }

    public void setCompatElevationResource(int n3) {
        float f5 = this.getResources().getDimension(n3);
        this.setCompatElevation(f5);
    }

    public void setCompatHoveredFocusedTranslationZ(float f5) {
        this.getImpl().setHoveredFocusedTranslationZ(f5);
    }

    public void setCompatHoveredFocusedTranslationZResource(int n3) {
        float f5 = this.getResources().getDimension(n3);
        this.setCompatHoveredFocusedTranslationZ(f5);
    }

    public void setCompatPressedTranslationZ(float f5) {
        this.getImpl().setPressedTranslationZ(f5);
    }

    public void setCompatPressedTranslationZResource(int n3) {
        float f5 = this.getResources().getDimension(n3);
        this.setCompatPressedTranslationZ(f5);
    }

    public void setCustomSize(int n3) {
        if (n3 >= 0) {
            int n4 = this.customSize;
            if (n3 != n4) {
                this.customSize = n3;
                this.requestLayout();
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Custom size must be non-negative");
        throw illegalArgumentException;
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        this.getImpl().updateShapeElevation(f5);
    }

    public void setEnsureMinTouchTargetSize(boolean bl2) {
        FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
        boolean bl3 = floatingActionButtonImpl.getEnsureMinTouchTargetSize();
        if (bl2 != bl3) {
            floatingActionButtonImpl = this.getImpl();
            floatingActionButtonImpl.setEnsureMinTouchTargetSize(bl2);
            this.requestLayout();
        }
    }

    public boolean setExpanded(boolean bl2) {
        return this.expandableWidgetHelper.setExpanded(bl2);
    }

    public void setExpandedComponentIdHint(int n3) {
        this.expandableWidgetHelper.setExpandedComponentIdHint(n3);
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.getImpl().setHideMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.getContext(), n3);
        this.setHideMotionSpec(motionSpec);
    }

    public void setImageDrawable(Drawable drawable2) {
        Drawable drawable3 = this.getDrawable();
        if (drawable3 != drawable2) {
            super.setImageDrawable(drawable2);
            this.getImpl().updateImageMatrixScale();
            drawable2 = this.imageTint;
            if (drawable2 != null) {
                this.onApplySupportImageTint();
            }
        }
    }

    public void setImageResource(int n3) {
        this.imageHelper.c(n3);
        this.onApplySupportImageTint();
    }

    public void setMaxImageSize(int n3) {
        this.maxImageSize = n3;
        this.getImpl().setMaxImageSize(n3);
    }

    public void setRippleColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setRippleColor(colorStateList);
    }

    public void setRippleColor(ColorStateList object) {
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != object) {
            this.rippleColor = object;
            object = this.getImpl();
            colorStateList = this.rippleColor;
            ((FloatingActionButtonImpl)object).setRippleColor(colorStateList);
        }
    }

    public void setScaleX(float f5) {
        super.setScaleX(f5);
        this.getImpl().onScaleChanged();
    }

    public void setScaleY(float f5) {
        super.setScaleY(f5);
        this.getImpl().onScaleChanged();
    }

    public void setShadowPaddingEnabled(boolean bl2) {
        this.getImpl().setShadowPaddingEnabled(bl2);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.getImpl().setShapeAppearance(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.getImpl().setShowMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.getContext(), n3);
        this.setShowMotionSpec(motionSpec);
    }

    public void setSize(int n3) {
        this.customSize = 0;
        int n4 = this.size;
        if (n3 != n4) {
            this.size = n3;
            this.requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        this.setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        this.setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.imageTint;
        if (colorStateList2 != colorStateList) {
            this.imageTint = colorStateList;
            this.onApplySupportImageTint();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2 = this.imageMode;
        if (mode2 != mode) {
            this.imageMode = mode;
            this.onApplySupportImageTint();
        }
    }

    public void setTranslationX(float f5) {
        super.setTranslationX(f5);
        this.getImpl().onTranslationChanged();
    }

    public void setTranslationY(float f5) {
        super.setTranslationY(f5);
        this.getImpl().onTranslationChanged();
    }

    public void setTranslationZ(float f5) {
        super.setTranslationZ(f5);
        this.getImpl().onTranslationChanged();
    }

    public void setUseCompatPadding(boolean bl2) {
        boolean bl3 = this.compatPadding;
        if (bl3 != bl2) {
            this.compatPadding = bl2;
            FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
            floatingActionButtonImpl.onCompatShadowChanged();
        }
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.getImpl().getEnsureMinTouchTargetSize();
    }

    public void show() {
        this.show(null);
    }

    public void show(FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener) {
        this.show(floatingActionButton$OnVisibilityChangedListener, true);
    }

    public void show(FloatingActionButton$OnVisibilityChangedListener object, boolean bl2) {
        FloatingActionButtonImpl floatingActionButtonImpl = this.getImpl();
        object = this.wrapOnVisibilityChangedListener((FloatingActionButton$OnVisibilityChangedListener)object);
        floatingActionButtonImpl.show((FloatingActionButtonImpl$InternalVisibilityChangedListener)object, bl2);
    }
}

