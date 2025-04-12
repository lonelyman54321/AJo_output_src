/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewParent
 */
package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.card.MaterialCardViewHelper$1;
import com.google.android.material.card.a;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;

class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final Drawable CHECKED_ICON_NONE;
    private static final double COS_45 = 0.0;
    public static final int DEFAULT_FADE_ANIM_DURATION = 300;
    private static final int DEFAULT_STROKE_VALUE = 255;
    private final MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    private float checkedAnimationProgress;
    private Drawable checkedIcon;
    private int checkedIconGravity;
    private int checkedIconMargin;
    private int checkedIconSize;
    private ColorStateList checkedIconTint;
    private LayerDrawable clickableForegroundDrawable;
    private MaterialShapeDrawable compatRippleDrawable;
    private Drawable fgDrawable;
    private final MaterialShapeDrawable foregroundContentDrawable;
    private MaterialShapeDrawable foregroundShapeDrawable;
    private ValueAnimator iconAnimator;
    private final TimeInterpolator iconFadeAnimInterpolator;
    private final int iconFadeInAnimDuration;
    private final int iconFadeOutAnimDuration;
    private boolean isBackgroundOverwritten;
    private final MaterialCardView materialCardView;
    private ColorStateList rippleColor;
    private Drawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private final Rect userContentPadding;

    static {
        ColorDrawable colorDrawable;
        double d2;
        COS_45 = d2 = Math.cos(Math.toRadians(45.0));
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 <= n4) {
            colorDrawable = new ColorDrawable();
        } else {
            n3 = 0;
            colorDrawable = null;
        }
        CHECKED_ICON_NONE = colorDrawable;
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView, AttributeSet attributeSet, int n3, int n4) {
        int n7;
        MaterialShapeDrawable materialShapeDrawable;
        Rect rect;
        this.userContentPadding = rect = new Rect();
        this.isBackgroundOverwritten = false;
        int n8 = 0;
        rect = null;
        this.checkedAnimationProgress = 0.0f;
        this.materialCardView = materialCardView;
        Object object = materialCardView.getContext();
        this.bgDrawable = materialShapeDrawable = new MaterialShapeDrawable((Context)object, attributeSet, n3, n4);
        Object object2 = materialCardView.getContext();
        materialShapeDrawable.initializeElevationOverlay((Context)object2);
        n4 = -12303292;
        materialShapeDrawable.setShadowColor(n4);
        object2 = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        materialShapeDrawable = materialCardView.getContext();
        object = R$styleable.CardView;
        int n10 = R$style.CardView;
        attributeSet = materialShapeDrawable.obtainStyledAttributes(attributeSet, (int[])object, n3, n10);
        n3 = R$styleable.CardView_cardCornerRadius;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.CardView_cardCornerRadius;
            float f5 = attributeSet.getDimension(n3, 0.0f);
            ((ShapeAppearanceModel$Builder)object2).setAllCornerSizes(f5);
        }
        Object object3 = new MaterialShapeDrawable();
        this.foregroundContentDrawable = object3;
        object3 = ((ShapeAppearanceModel$Builder)object2).build();
        this.setShapeAppearanceModel((ShapeAppearanceModel)object3);
        object3 = materialCardView.getContext();
        n4 = R$attr.motionEasingLinearInterpolator;
        rect = AnimationUtils.LINEAR_INTERPOLATOR;
        object3 = MotionUtils.resolveThemeInterpolator((Context)object3, n4, (TimeInterpolator)rect);
        this.iconFadeAnimInterpolator = object3;
        object3 = materialCardView.getContext();
        n4 = R$attr.motionDurationShort2;
        n8 = 300;
        this.iconFadeInAnimDuration = n3 = MotionUtils.resolveThemeDuration((Context)object3, n4, n8);
        materialCardView = materialCardView.getContext();
        n3 = R$attr.motionDurationShort1;
        this.iconFadeOutAnimDuration = n7 = MotionUtils.resolveThemeDuration((Context)materialCardView, n3, n8);
        attributeSet.recycle();
    }

    public static /* synthetic */ void a(MaterialCardViewHelper materialCardViewHelper, ValueAnimator valueAnimator) {
        materialCardViewHelper.lambda$animateCheckedIcon$0(valueAnimator);
    }

    private float calculateActualCornerPadding() {
        CornerTreatment cornerTreatment = this.shapeAppearanceModel.getTopLeftCorner();
        float f5 = this.bgDrawable.getTopLeftCornerResolvedSize();
        float f6 = this.calculateCornerPaddingForCornerTreatment(cornerTreatment, f5);
        CornerTreatment cornerTreatment2 = this.shapeAppearanceModel.getTopRightCorner();
        float f7 = this.bgDrawable.getTopRightCornerResolvedSize();
        f5 = this.calculateCornerPaddingForCornerTreatment(cornerTreatment2, f7);
        f6 = Math.max(f6, f5);
        cornerTreatment2 = this.shapeAppearanceModel.getBottomRightCorner();
        f7 = this.bgDrawable.getBottomRightCornerResolvedSize();
        f5 = this.calculateCornerPaddingForCornerTreatment(cornerTreatment2, f7);
        CornerTreatment cornerTreatment3 = this.shapeAppearanceModel.getBottomLeftCorner();
        float f8 = this.bgDrawable.getBottomLeftCornerResolvedSize();
        f7 = this.calculateCornerPaddingForCornerTreatment(cornerTreatment3, f8);
        f5 = Math.max(f5, f7);
        return Math.max(f6, f5);
    }

    private float calculateCornerPaddingForCornerTreatment(CornerTreatment cornerTreatment, float f5) {
        boolean bl2 = cornerTreatment instanceof RoundedCornerTreatment;
        if (bl2) {
            double d2 = COS_45;
            double d5 = 1.0 - d2;
            double d7 = f5;
            return (float)(d5 * d7);
        }
        boolean bl3 = cornerTreatment instanceof CutCornerTreatment;
        if (bl3) {
            return f5 / 2.0f;
        }
        return 0.0f;
    }

    private float calculateHorizontalBackgroundPadding() {
        float f5;
        MaterialCardView materialCardView = this.materialCardView;
        float f6 = materialCardView.getMaxCardElevation();
        boolean bl2 = this.shouldAddCornerPaddingOutsideCardBackground();
        if (bl2) {
            f5 = this.calculateActualCornerPadding();
        } else {
            bl2 = false;
            f5 = 0.0f;
        }
        return f6 + f5;
    }

    private float calculateVerticalBackgroundPadding() {
        MaterialCardView materialCardView = this.materialCardView;
        float f5 = materialCardView.getMaxCardElevation();
        float f6 = 1.5f;
        f5 *= f6;
        boolean bl2 = this.shouldAddCornerPaddingOutsideCardBackground();
        if (bl2) {
            f6 = this.calculateActualCornerPadding();
        } else {
            bl2 = false;
            f6 = 0.0f;
        }
        return f5 + f6;
    }

    private boolean canClipToOutline() {
        return this.bgDrawable.isRoundRect();
    }

    private Drawable createCompatRippleDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Object object = this.createForegroundShapeDrawable();
        this.compatRippleDrawable = object;
        Object object2 = this.rippleColor;
        ((MaterialShapeDrawable)object).setFillColor((ColorStateList)object2);
        object = new int[]{16842919};
        object2 = this.compatRippleDrawable;
        stateListDrawable.addState((int[])object, (Drawable)object2);
        return stateListDrawable;
    }

    private Drawable createForegroundRippleDrawable() {
        boolean bl2 = RippleUtils.USE_FRAMEWORK_RIPPLE;
        if (bl2) {
            MaterialShapeDrawable materialShapeDrawable;
            this.foregroundShapeDrawable = materialShapeDrawable = this.createForegroundShapeDrawable();
            ColorStateList colorStateList = this.rippleColor;
            MaterialShapeDrawable materialShapeDrawable2 = this.foregroundShapeDrawable;
            materialShapeDrawable = new RippleDrawable(colorStateList, null, (Drawable)materialShapeDrawable2);
            return materialShapeDrawable;
        }
        return this.createCompatRippleDrawable();
    }

    private MaterialShapeDrawable createForegroundShapeDrawable() {
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        return materialShapeDrawable;
    }

    private Drawable getClickableForeground() {
        int n3 = 2;
        Drawable drawable2 = this.rippleDrawable;
        if (drawable2 == null) {
            this.rippleDrawable = drawable2 = this.createForegroundRippleDrawable();
        }
        if ((drawable2 = this.clickableForegroundDrawable) == null) {
            Drawable drawable3 = this.rippleDrawable;
            MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
            Drawable drawable4 = this.checkedIcon;
            int n4 = 3;
            Drawable[] drawableArray = new Drawable[n4];
            drawableArray[0] = drawable3;
            drawableArray[1] = materialShapeDrawable;
            drawableArray[n3] = drawable4;
            drawable2 = new LayerDrawable(drawableArray);
            this.clickableForegroundDrawable = drawable2;
            int n7 = R$id.mtrl_card_checked_layer_id;
            drawable2.setId(n3, n7);
        }
        return this.clickableForegroundDrawable;
    }

    private float getParentCardViewCalculatedCornerPadding() {
        MaterialCardView materialCardView = this.materialCardView;
        boolean bl2 = materialCardView.getPreventCornerOverlap();
        if (bl2 && (bl2 = (materialCardView = this.materialCardView).getUseCompatPadding())) {
            double d2 = COS_45;
            double d5 = 1.0 - d2;
            d2 = this.materialCardView.getCardViewRadius();
            return (float)(d5 * d2);
        }
        return 0.0f;
    }

    private Drawable insetDrawable(Drawable drawable2) {
        int n3;
        int n4;
        Object object = this.materialCardView;
        int n7 = object.getUseCompatPadding();
        if (n7 != 0) {
            float f5 = this.calculateVerticalBackgroundPadding();
            double d2 = Math.ceil(f5);
            n7 = (int)d2;
            float f6 = this.calculateHorizontalBackgroundPadding();
            double d5 = Math.ceil(f6);
            int n8 = (int)d5;
            n4 = n7;
            n3 = n8;
        } else {
            n7 = 0;
            float f7 = 0.0f;
            object = null;
            n3 = 0;
            n4 = 0;
        }
        object = new MaterialCardViewHelper$1(this, drawable2, n3, n4, n3, n4);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    private boolean isCheckedIconBottom() {
        void var1_5;
        int bl2 = this.checkedIconGravity;
        int n3 = 80;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    /*
     * WARNING - void declaration
     */
    private boolean isCheckedIconEnd() {
        void var1_5;
        int bl2 = this.checkedIconGravity;
        int n3 = 0x800005;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    private /* synthetic */ void lambda$animateCheckedIcon$0(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        int n3 = (int)(255.0f * f5);
        this.checkedIcon.setAlpha(n3);
        this.checkedAnimationProgress = f5;
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
        MaterialCardView materialCardView = this.materialCardView;
        boolean bl2 = materialCardView.getPreventCornerOverlap();
        if (bl2 && !(bl2 = this.canClipToOutline())) {
            bl2 = true;
        } else {
            bl2 = false;
            materialCardView = null;
        }
        return bl2;
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
        MaterialCardView materialCardView = this.materialCardView;
        boolean bl2 = materialCardView.getPreventCornerOverlap();
        if (bl2 && (bl2 = this.canClipToOutline()) && (bl2 = (materialCardView = this.materialCardView).getUseCompatPadding())) {
            bl2 = true;
        } else {
            bl2 = false;
            materialCardView = null;
        }
        return bl2;
    }

    private boolean shouldUseClickableForeground() {
        ViewParent viewParent;
        boolean bl2;
        MaterialCardView materialCardView = this.materialCardView;
        boolean bl3 = materialCardView.isClickable();
        if (bl3) {
            return true;
        }
        materialCardView = this.materialCardView;
        while ((bl2 = materialCardView.isDuplicateParentStateEnabled()) && (bl2 = (viewParent = materialCardView.getParent()) instanceof View)) {
            materialCardView = (View)materialCardView.getParent();
        }
        return materialCardView.isClickable();
    }

    private void updateInsetForeground(Drawable drawable2) {
        MaterialCardView materialCardView;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4 && (n3 = (materialCardView = this.materialCardView.getForeground()) instanceof InsetDrawable) != 0) {
            materialCardView = (InsetDrawable)this.materialCardView.getForeground();
            jr_0.b((InsetDrawable)materialCardView, drawable2);
        } else {
            materialCardView = this.materialCardView;
            drawable2 = this.insetDrawable(drawable2);
            materialCardView.setForeground(drawable2);
        }
    }

    private void updateRippleColor() {
        Drawable drawable2;
        boolean bl2 = RippleUtils.USE_FRAMEWORK_RIPPLE;
        if (bl2 && (drawable2 = this.rippleDrawable) != null) {
            drawable2 = (RippleDrawable)drawable2;
            ColorStateList colorStateList = this.rippleColor;
            drawable2.setColor(colorStateList);
        } else {
            drawable2 = this.compatRippleDrawable;
            if (drawable2 != null) {
                ColorStateList colorStateList = this.rippleColor;
                drawable2.setFillColor(colorStateList);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void animateCheckedIcon(boolean bl2) {
        void var1_3;
        int n3;
        float f5;
        ValueAnimator valueAnimator;
        float f6;
        float f7 = 1.0f;
        if (bl2) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
            valueAnimator = null;
        }
        if (bl2) {
            f5 = this.checkedAnimationProgress;
            f7 -= f5;
        } else {
            f7 = this.checkedAnimationProgress;
        }
        ValueAnimator valueAnimator2 = this.iconAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            n3 = 0;
            f5 = 0.0f;
            Object var6_10 = null;
            this.iconAnimator = null;
        }
        f5 = this.checkedAnimationProgress;
        int n4 = 2;
        float[] fArray = new float[n4];
        fArray[0] = f5;
        n3 = 1;
        f5 = Float.MIN_VALUE;
        fArray[n3] = f6;
        this.iconAnimator = valueAnimator = ValueAnimator.ofFloat((float[])fArray);
        a a2 = new a(this);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)a2);
        valueAnimator = this.iconAnimator;
        TimeInterpolator timeInterpolator = this.iconFadeAnimInterpolator;
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator = this.iconAnimator;
        if (bl2) {
            int n7 = this.iconFadeInAnimDuration;
        } else {
            int n8 = this.iconFadeOutAnimDuration;
        }
        float f8 = (float)var1_3 * f7;
        long l2 = (long)f8;
        valueAnimator.setDuration(l2);
        this.iconAnimator.start();
    }

    public void forceRippleRedraw() {
        Drawable drawable2 = this.rippleDrawable;
        if (drawable2 != null) {
            drawable2 = drawable2.getBounds();
            int n3 = drawable2.bottom;
            Drawable drawable3 = this.rippleDrawable;
            int n4 = drawable2.left;
            int n7 = drawable2.top;
            int n8 = drawable2.right;
            int n10 = n3 + -1;
            drawable3.setBounds(n4, n7, n8, n10);
            drawable3 = this.rippleDrawable;
            n4 = drawable2.left;
            n7 = drawable2.top;
            int n14 = drawable2.right;
            drawable3.setBounds(n4, n7, n14, n3);
        }
    }

    public MaterialShapeDrawable getBackground() {
        return this.bgDrawable;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.bgDrawable.getFillColor();
    }

    public ColorStateList getCardForegroundColor() {
        return this.foregroundContentDrawable.getFillColor();
    }

    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    public int getCheckedIconGravity() {
        return this.checkedIconGravity;
    }

    public int getCheckedIconMargin() {
        return this.checkedIconMargin;
    }

    public int getCheckedIconSize() {
        return this.checkedIconSize;
    }

    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    public float getCornerRadius() {
        return this.bgDrawable.getTopLeftCornerResolvedSize();
    }

    public float getProgress() {
        return this.bgDrawable.getInterpolation();
    }

    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public int getStrokeColor() {
        ColorStateList colorStateList = this.strokeColor;
        int n3 = colorStateList == null ? -1 : colorStateList.getDefaultColor();
        return n3;
    }

    public ColorStateList getStrokeColorStateList() {
        return this.strokeColor;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public Rect getUserContentPadding() {
        return this.userContentPadding;
    }

    public boolean isBackgroundOverwritten() {
        return this.isBackgroundOverwritten;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public void loadFromAttributes(TypedArray object) {
        int n3;
        Object object2 = this.materialCardView.getContext();
        int n4 = R$styleable.MaterialCardView_strokeColor;
        object2 = MaterialResources.getColorStateList(object2, (TypedArray)object, n4);
        this.strokeColor = object2;
        if (object2 == null) {
            n3 = -1;
            object2 = ColorStateList.valueOf((int)n3);
            this.strokeColor = object2;
        }
        n3 = R$styleable.MaterialCardView_strokeWidth;
        this.strokeWidth = n3 = object.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.MaterialCardView_android_checkable;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        this.checkable = n3;
        MaterialCardView materialCardView = this.materialCardView;
        materialCardView.setLongClickable(n3 != 0);
        object2 = this.materialCardView.getContext();
        int n7 = R$styleable.MaterialCardView_checkedIconTint;
        object2 = MaterialResources.getColorStateList(object2, (TypedArray)object, n7);
        this.checkedIconTint = object2;
        object2 = this.materialCardView.getContext();
        n7 = R$styleable.MaterialCardView_checkedIcon;
        object2 = MaterialResources.getDrawable(object2, (TypedArray)object, n7);
        this.setCheckedIcon((Drawable)object2);
        n3 = R$styleable.MaterialCardView_checkedIconSize;
        n3 = object.getDimensionPixelSize(n3, 0);
        this.setCheckedIconSize(n3);
        n3 = R$styleable.MaterialCardView_checkedIconMargin;
        n3 = object.getDimensionPixelSize(n3, 0);
        this.setCheckedIconMargin(n3);
        n3 = R$styleable.MaterialCardView_checkedIconGravity;
        this.checkedIconGravity = n3 = object.getInteger(n3, 8388661);
        object2 = this.materialCardView.getContext();
        n4 = R$styleable.MaterialCardView_rippleColor;
        object2 = MaterialResources.getColorStateList(object2, (TypedArray)object, n4);
        this.rippleColor = object2;
        if (object2 == null) {
            object2 = this.materialCardView;
            n4 = R$attr.colorControlHighlight;
            n3 = MaterialColors.getColor((View)object2, n4);
            object2 = ColorStateList.valueOf((int)n3);
            this.rippleColor = object2;
        }
        object2 = this.materialCardView.getContext();
        n4 = R$styleable.MaterialCardView_cardForegroundColor;
        object = MaterialResources.getColorStateList(object2, (TypedArray)object, n4);
        this.setCardForegroundColor((ColorStateList)object);
        this.updateRippleColor();
        this.updateElevation();
        this.updateStroke();
        object = this.materialCardView;
        object2 = this.bgDrawable;
        object2 = this.insetDrawable((Drawable)object2);
        ((MaterialCardView)object).setBackgroundInternal((Drawable)object2);
        boolean bl2 = this.shouldUseClickableForeground();
        object = bl2 ? this.getClickableForeground() : this.foregroundContentDrawable;
        this.fgDrawable = object;
        object2 = this.materialCardView;
        object = this.insetDrawable((Drawable)object);
        object2.setForeground((Drawable)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void recalculateCheckedIconPosition(int n3, int n4) {
        Object object = this.clickableForegroundDrawable;
        if (object != null) {
            int n7;
            int n8;
            int n10;
            int n14;
            float f5;
            object = this.materialCardView;
            int n15 = ((CardView)((Object)object)).getUseCompatPadding();
            if (n15 != 0) {
                f5 = this.calculateVerticalBackgroundPadding();
                float f6 = 2.0f;
                double d2 = Math.ceil(f5 *= f6);
                n15 = (int)d2;
                float f7 = this.calculateHorizontalBackgroundPadding() * f6;
                double d5 = Math.ceil(f7);
                n14 = (int)d5;
            } else {
                n15 = 0;
                f5 = 0.0f;
                object = null;
                n14 = 0;
                float f8 = 0.0f;
            }
            int n16 = this.isCheckedIconEnd();
            if (n16 != 0) {
                n16 = this.checkedIconMargin;
                n16 = n3 - n16;
                n10 = this.checkedIconSize;
                n16 = n16 - n10 - n14;
            } else {
                n16 = this.checkedIconMargin;
            }
            n10 = this.isCheckedIconBottom();
            if (n10 != 0) {
                n10 = this.checkedIconMargin;
            } else {
                n10 = this.checkedIconMargin;
                n10 = n4 - n10;
                int n17 = this.checkedIconSize;
                n10 = n10 - n17 - n15;
            }
            int n18 = n10;
            n10 = (int)(this.isCheckedIconEnd() ? 1 : 0);
            if (n10 != 0) {
                n3 = this.checkedIconMargin;
            } else {
                n10 = this.checkedIconMargin;
                n3 -= n10;
                n10 = this.checkedIconSize;
                n3 = n3 - n10 - n14;
            }
            n14 = (int)(this.isCheckedIconBottom() ? 1 : 0);
            if (n14 != 0) {
                n14 = this.checkedIconMargin;
                n4 -= n14;
                n14 = this.checkedIconSize;
                n4 = n4 - n14 - n15;
            } else {
                n4 = this.checkedIconMargin;
            }
            int n19 = n4;
            MaterialCardView materialCardView = this.materialCardView;
            object = ViewCompat.a;
            n4 = materialCardView.getLayoutDirection();
            n15 = 1;
            f5 = Float.MIN_VALUE;
            if (n4 == n15) {
                n8 = n3;
                n7 = n16;
            } else {
                n7 = n3;
                n8 = n16;
            }
            LayerDrawable layerDrawable = this.clickableForegroundDrawable;
            int n20 = 2;
            layerDrawable.setLayerInset(n20, n8, n19, n7, n18);
        }
    }

    public void setBackgroundOverwritten(boolean bl2) {
        this.isBackgroundOverwritten = bl2;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.bgDrawable.setFillColor(colorStateList);
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf((int)0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean bl2) {
        this.checkable = bl2;
    }

    public void setChecked(boolean bl2) {
        this.setChecked(bl2, false);
    }

    /*
     * WARNING - void declaration
     */
    public void setChecked(boolean bl2, boolean bl3) {
        Drawable drawable2 = this.checkedIcon;
        if (drawable2 != null) {
            void var2_4;
            if (var2_4 != false) {
                this.animateCheckedIcon(bl2);
            } else {
                float f5;
                void var2_7;
                if (bl2) {
                    int n3 = 255;
                } else {
                    boolean bl4 = false;
                }
                drawable2.setAlpha((int)var2_7);
                if (bl2) {
                    int n4 = 1065353216;
                    f5 = 1.0f;
                } else {
                    boolean bl5 = false;
                    f5 = 0.0f;
                }
                this.checkedAnimationProgress = f5;
            }
        }
    }

    public void setCheckedIcon(Drawable object) {
        if (object != null) {
            object = ut0_0.h((Drawable)object).mutate();
            this.checkedIcon = object;
            ColorStateList colorStateList = this.checkedIconTint;
            object.setTintList(colorStateList);
            object = this.materialCardView;
            boolean bl2 = ((MaterialCardView)object).isChecked();
            this.setChecked(bl2);
        } else {
            object = CHECKED_ICON_NONE;
            this.checkedIcon = object;
        }
        object = this.clickableForegroundDrawable;
        if (object != null) {
            int n3 = R$id.mtrl_card_checked_layer_id;
            Drawable drawable2 = this.checkedIcon;
            object.setDrawableByLayerId(n3, drawable2);
        }
    }

    public void setCheckedIconGravity(int n3) {
        this.checkedIconGravity = n3;
        n3 = this.materialCardView.getMeasuredWidth();
        int n4 = this.materialCardView.getMeasuredHeight();
        this.recalculateCheckedIconPosition(n3, n4);
    }

    public void setCheckedIconMargin(int n3) {
        this.checkedIconMargin = n3;
    }

    public void setCheckedIconSize(int n3) {
        this.checkedIconSize = n3;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.checkedIconTint = colorStateList;
        Drawable drawable2 = this.checkedIcon;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setCornerRadius(float f5) {
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        ShapeAppearanceModel shapeAppearanceModel2 = shapeAppearanceModel.withCornerSize(f5);
        this.setShapeAppearanceModel(shapeAppearanceModel2);
        shapeAppearanceModel2 = this.fgDrawable;
        shapeAppearanceModel2.invalidateSelf();
        boolean bl2 = this.shouldAddCornerPaddingOutsideCardBackground();
        if (bl2 || (bl2 = this.shouldAddCornerPaddingInsideCardBackground())) {
            this.updateContentPadding();
        }
        if (bl2 = this.shouldAddCornerPaddingOutsideCardBackground()) {
            this.updateInsets();
        }
    }

    public void setProgress(float f5) {
        this.bgDrawable.setInterpolation(f5);
        MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f5);
        }
        if ((materialShapeDrawable = this.foregroundShapeDrawable) != null) {
            materialShapeDrawable.setInterpolation(f5);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.rippleColor = colorStateList;
        this.updateRippleColor();
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.bgDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        MaterialShapeDrawable materialShapeDrawable = this.bgDrawable;
        boolean bl2 = materialShapeDrawable.isRoundRect() ^ true;
        materialShapeDrawable.setShadowBitmapDrawingEnable(bl2);
        materialShapeDrawable = this.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        if ((materialShapeDrawable = this.foregroundShapeDrawable) != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        if ((materialShapeDrawable = this.compatRippleDrawable) != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.strokeColor;
        if (colorStateList2 == colorStateList) {
            return;
        }
        this.strokeColor = colorStateList;
        this.updateStroke();
    }

    public void setStrokeWidth(int n3) {
        int n4 = this.strokeWidth;
        if (n3 == n4) {
            return;
        }
        this.strokeWidth = n3;
        this.updateStroke();
    }

    public void setUserContentPadding(int n3, int n4, int n7, int n8) {
        this.userContentPadding.set(n3, n4, n7, n8);
        this.updateContentPadding();
    }

    public void updateClickable() {
        Drawable drawable2 = this.fgDrawable;
        boolean bl2 = this.shouldUseClickableForeground();
        Object object = bl2 ? this.getClickableForeground() : this.foregroundContentDrawable;
        this.fgDrawable = object;
        if (drawable2 != object) {
            this.updateInsetForeground((Drawable)object);
        }
    }

    public void updateContentPadding() {
        float f5;
        int n3 = this.shouldAddCornerPaddingInsideCardBackground();
        if (n3 == 0 && (n3 = this.shouldAddCornerPaddingOutsideCardBackground()) == 0) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            f5 = this.calculateActualCornerPadding();
        }
        float f6 = this.getParentCardViewCalculatedCornerPadding();
        n3 = (int)(f5 - f6);
        MaterialCardView materialCardView = this.materialCardView;
        Rect rect = this.userContentPadding;
        int n4 = rect.left + n3;
        int n7 = rect.top + n3;
        int n8 = rect.right + n3;
        int n10 = rect.bottom + n3;
        materialCardView.setAncestorContentPadding(n4, n7, n8, n10);
    }

    public void updateElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.bgDrawable;
        float f5 = this.materialCardView.getCardElevation();
        materialShapeDrawable.setElevation(f5);
    }

    public void updateInsets() {
        MaterialShapeDrawable materialShapeDrawable;
        MaterialCardView materialCardView;
        boolean bl2 = this.isBackgroundOverwritten();
        if (!bl2) {
            materialCardView = this.materialCardView;
            materialShapeDrawable = this.bgDrawable;
            materialShapeDrawable = this.insetDrawable(materialShapeDrawable);
            materialCardView.setBackgroundInternal(materialShapeDrawable);
        }
        materialCardView = this.materialCardView;
        materialShapeDrawable = this.fgDrawable;
        materialShapeDrawable = this.insetDrawable(materialShapeDrawable);
        materialCardView.setForeground(materialShapeDrawable);
    }

    public void updateStroke() {
        MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        float f5 = this.strokeWidth;
        ColorStateList colorStateList = this.strokeColor;
        materialShapeDrawable.setStroke(f5, colorStateList);
    }
}

