/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.BorderDrawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$3;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$4;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$6;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$ShadowAnimatorImpl;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;

class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100L;
    static final long ELEVATION_ANIM_DURATION = 100L;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    static final int[] EMPTY_STATE_SET;
    static final int[] ENABLED_STATE_SET;
    static final int[] FOCUSED_ENABLED_STATE_SET;
    private static final int HIDE_ANIM_DURATION_ATTR = 0;
    private static final int HIDE_ANIM_EASING_ATTR = 0;
    private static final float HIDE_ICON_SCALE = 0.4f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.4f;
    static final int[] HOVERED_ENABLED_STATE_SET;
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET;
    static final int[] PRESSED_ENABLED_STATE_SET;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final int SHOW_ANIM_DURATION_ATTR = 0;
    private static final int SHOW_ANIM_EASING_ATTR = 0;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private static final float SPEC_HIDE_ICON_SCALE;
    private static final float SPEC_HIDE_SCALE;
    private int animState = 0;
    BorderDrawable borderDrawable;
    Drawable contentBackground;
    private Animator currentAnimator;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private ArrayList hideListeners;
    private MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private float imageMatrixScale = 1.0f;
    private int maxImageSize;
    int minTouchTargetSize;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;
    Drawable rippleDrawable;
    private float rotation;
    boolean shadowPaddingEnabled = true;
    final ShadowViewDelegate shadowViewDelegate;
    ShapeAppearanceModel shapeAppearance;
    MaterialShapeDrawable shapeDrawable;
    private ArrayList showListeners;
    private MotionSpec showMotionSpec;
    private final StateListAnimator stateListAnimator;
    private final Matrix tmpMatrix;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;
    private ArrayList transformationCallbacks;
    final FloatingActionButton view;

    static {
        SHOW_ANIM_DURATION_ATTR = R$attr.motionDurationLong2;
        SHOW_ANIM_EASING_ATTR = R$attr.motionEasingEmphasizedInterpolator;
        HIDE_ANIM_DURATION_ATTR = R$attr.motionDurationMedium1;
        HIDE_ANIM_EASING_ATTR = R$attr.motionEasingEmphasizedAccelerateInterpolator;
        int n3 = 16842910;
        PRESSED_ENABLED_STATE_SET = new int[]{16842919, n3};
        int n4 = 16843623;
        int n7 = 16842908;
        HOVERED_FOCUSED_ENABLED_STATE_SET = new int[]{n4, n7, n3};
        FOCUSED_ENABLED_STATE_SET = new int[]{n7, n3};
        HOVERED_ENABLED_STATE_SET = new int[]{n4, n3};
        ENABLED_STATE_SET = new int[]{n3};
        EMPTY_STATE_SET = new int[0];
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate object) {
        float f5;
        Object object2;
        this.tmpRect = object2 = new Rect();
        this.tmpRectF1 = object2;
        super();
        this.tmpRectF2 = object2;
        super();
        this.tmpMatrix = object2;
        this.view = floatingActionButton;
        this.shadowViewDelegate = object;
        this.stateListAnimator = object = new StateListAnimator();
        object2 = PRESSED_ENABLED_STATE_SET;
        FloatingActionButtonImpl$ShadowAnimatorImpl floatingActionButtonImpl$ShadowAnimatorImpl = new FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation(this);
        floatingActionButtonImpl$ShadowAnimatorImpl = this.createElevationAnimator(floatingActionButtonImpl$ShadowAnimatorImpl);
        ((StateListAnimator)object).addState((int[])object2, (ValueAnimator)floatingActionButtonImpl$ShadowAnimatorImpl);
        object2 = HOVERED_FOCUSED_ENABLED_STATE_SET;
        super(this);
        floatingActionButtonImpl$ShadowAnimatorImpl = this.createElevationAnimator(floatingActionButtonImpl$ShadowAnimatorImpl);
        ((StateListAnimator)object).addState((int[])object2, (ValueAnimator)floatingActionButtonImpl$ShadowAnimatorImpl);
        object2 = FOCUSED_ENABLED_STATE_SET;
        super(this);
        floatingActionButtonImpl$ShadowAnimatorImpl = this.createElevationAnimator(floatingActionButtonImpl$ShadowAnimatorImpl);
        ((StateListAnimator)object).addState((int[])object2, (ValueAnimator)floatingActionButtonImpl$ShadowAnimatorImpl);
        object2 = HOVERED_ENABLED_STATE_SET;
        super(this);
        floatingActionButtonImpl$ShadowAnimatorImpl = this.createElevationAnimator(floatingActionButtonImpl$ShadowAnimatorImpl);
        ((StateListAnimator)object).addState((int[])object2, (ValueAnimator)floatingActionButtonImpl$ShadowAnimatorImpl);
        object2 = ENABLED_STATE_SET;
        super(this);
        floatingActionButtonImpl$ShadowAnimatorImpl = this.createElevationAnimator(floatingActionButtonImpl$ShadowAnimatorImpl);
        ((StateListAnimator)object).addState((int[])object2, (ValueAnimator)floatingActionButtonImpl$ShadowAnimatorImpl);
        object2 = EMPTY_STATE_SET;
        super(this);
        floatingActionButtonImpl$ShadowAnimatorImpl = this.createElevationAnimator(floatingActionButtonImpl$ShadowAnimatorImpl);
        ((StateListAnimator)object).addState((int[])object2, (ValueAnimator)floatingActionButtonImpl$ShadowAnimatorImpl);
        this.rotation = f5 = floatingActionButton.getRotation();
    }

    public static /* synthetic */ int access$002(FloatingActionButtonImpl floatingActionButtonImpl, int n3) {
        floatingActionButtonImpl.animState = n3;
        return n3;
    }

    public static /* synthetic */ Animator access$102(FloatingActionButtonImpl floatingActionButtonImpl, Animator animator2) {
        floatingActionButtonImpl.currentAnimator = animator2;
        return animator2;
    }

    public static /* synthetic */ float access$202(FloatingActionButtonImpl floatingActionButtonImpl, float f5) {
        floatingActionButtonImpl.imageMatrixScale = f5;
        return f5;
    }

    public static /* synthetic */ void access$300(FloatingActionButtonImpl floatingActionButtonImpl, float f5, Matrix matrix) {
        floatingActionButtonImpl.calculateImageMatrixFromScale(f5, matrix);
    }

    private void calculateImageMatrixFromScale(float f5, Matrix matrix) {
        int n3;
        matrix.reset();
        Drawable drawable2 = this.view.getDrawable();
        if (drawable2 != null && (n3 = this.maxImageSize) != 0) {
            RectF rectF = this.tmpRectF1;
            RectF rectF2 = this.tmpRectF2;
            int n4 = drawable2.getIntrinsicWidth();
            float f6 = n4;
            float f7 = drawable2.getIntrinsicHeight();
            rectF.set(0.0f, 0.0f, f6, f7);
            int n7 = this.maxImageSize;
            f6 = n7;
            f7 = n7;
            rectF2.set(0.0f, 0.0f, f6, f7);
            drawable2 = Matrix.ScaleToFit.CENTER;
            matrix.setRectToRect(rectF, rectF2, (Matrix.ScaleToFit)drawable2);
            n7 = this.maxImageSize;
            float f8 = n7;
            float f11 = 2.0f;
            f7 = (float)n7 / f11;
            matrix.postScale(f5, f5, f8 /= f11, f7);
        }
    }

    private AnimatorSet createAnimator(MotionSpec motionSpec, float f5, float f6, float f7) {
        ArrayList<ObjectAnimator> arrayList = new ArrayList<ObjectAnimator>();
        Object object = this.view;
        Object[] objectArray = View.ALPHA;
        int n3 = 1;
        float[] fArray = new float[n3];
        fArray[0] = f5;
        Object object2 = ObjectAnimator.ofFloat((Object)object, (Property)objectArray, (float[])fArray);
        motionSpec.getTiming("opacity").apply((Animator)object2);
        arrayList.add((ObjectAnimator)object2);
        object2 = this.view;
        object = View.SCALE_X;
        objectArray = new float[n3];
        objectArray[0] = (Property)f6;
        object2 = ObjectAnimator.ofFloat((Object)object2, (Property)object, (float[])objectArray);
        object = "scale";
        motionSpec.getTiming((String)object).apply((Animator)object2);
        this.workAroundOreoBug((ObjectAnimator)object2);
        arrayList.add((ObjectAnimator)object2);
        object2 = this.view;
        objectArray = View.SCALE_Y;
        fArray = new float[n3];
        fArray[0] = f6;
        object2 = ObjectAnimator.ofFloat((Object)object2, (Property)objectArray, (float[])fArray);
        motionSpec.getTiming((String)object).apply((Animator)object2);
        this.workAroundOreoBug((ObjectAnimator)object2);
        arrayList.add((ObjectAnimator)object2);
        object2 = this.tmpMatrix;
        this.calculateImageMatrixFromScale(f7, (Matrix)object2);
        object2 = this.view;
        ImageMatrixProperty imageMatrixProperty = new ImageMatrixProperty();
        FloatingActionButtonImpl$3 floatingActionButtonImpl$3 = new FloatingActionButtonImpl$3(this);
        objectArray = this.tmpMatrix;
        object = new Matrix((Matrix)objectArray);
        objectArray = new Matrix[n3];
        objectArray[0] = object;
        object2 = ObjectAnimator.ofObject((Object)object2, (Property)imageMatrixProperty, (TypeEvaluator)floatingActionButtonImpl$3, (Object[])objectArray);
        motionSpec.getTiming("iconScale").apply((Animator)object2);
        arrayList.add((ObjectAnimator)object2);
        motionSpec = new AnimatorSet();
        AnimatorSetCompat.playTogether((AnimatorSet)motionSpec, arrayList);
        return motionSpec;
    }

    private AnimatorSet createDefaultAnimator(float f5, float f6, float f7, int n3, int n4) {
        FloatingActionButtonImpl$4 floatingActionButtonImpl$4;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList<ValueAnimator> arrayList = new ArrayList<ValueAnimator>();
        Object object = new float[]{0.0f, 1.0f};
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object);
        float f8 = this.view.getAlpha();
        float f11 = this.view.getScaleX();
        float f12 = this.view.getScaleY();
        float f14 = this.imageMatrixScale;
        object = this.tmpMatrix;
        Matrix matrix = new Matrix((Matrix)object);
        object = floatingActionButtonImpl$4;
        FloatingActionButtonImpl floatingActionButtonImpl = this;
        floatingActionButtonImpl$4 = new FloatingActionButtonImpl$4(this, f8, f5, f11, f6, f12, f14, f7, matrix);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)floatingActionButtonImpl$4);
        arrayList.add(valueAnimator);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        object = this.view.getContext();
        floatingActionButtonImpl = this.view.getContext().getResources();
        int n7 = R$integer.material_motion_duration_long_1;
        int n8 = floatingActionButtonImpl.getInteger(n7);
        n7 = n3;
        long l2 = MotionUtils.resolveThemeDuration((Context)object, n3, n8);
        animatorSet.setDuration(l2);
        object = this.view.getContext();
        floatingActionButtonImpl = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        n7 = n4;
        object = MotionUtils.resolveThemeInterpolator((Context)object, n4, (TimeInterpolator)floatingActionButtonImpl);
        animatorSet.setInterpolator((TimeInterpolator)object);
        return animatorSet;
    }

    private ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl object) {
        ValueAnimator valueAnimator = new ValueAnimator();
        TimeInterpolator timeInterpolator = ELEVATION_ANIM_INTERPOLATOR;
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration((long)100);
        valueAnimator.addListener((Animator.AnimatorListener)object);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        Object object2 = object = (Object)new float[2];
        object2[0] = (FloatingActionButtonImpl$ShadowAnimatorImpl)0.0f;
        object2[1] = (FloatingActionButtonImpl$ShadowAnimatorImpl)1.0f;
        valueAnimator.setFloatValues((float[])object);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener == null) {
            this.preDrawListener = onPreDrawListener = new FloatingActionButtonImpl$6(this);
        }
        return this.preDrawListener;
    }

    private boolean shouldAnimateVisibilityChange() {
        FloatingActionButton floatingActionButton = this.view;
        boolean bl2 = floatingActionButton.isLaidOut();
        if (bl2 && !(bl2 = (floatingActionButton = this.view).isInEditMode())) {
            bl2 = true;
        } else {
            bl2 = false;
            floatingActionButton = null;
        }
        return bl2;
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 != n4) {
            return;
        }
        FloatingActionButtonImpl$5 floatingActionButtonImpl$5 = new FloatingActionButtonImpl$5(this);
        objectAnimator.setEvaluator((TypeEvaluator)floatingActionButtonImpl$5);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.hideListeners;
        if (arrayList == null) {
            this.hideListeners = arrayList = new ArrayList();
        }
        this.hideListeners.add(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.showListeners;
        if (arrayList == null) {
            this.showListeners = arrayList = new ArrayList();
        }
        this.showListeners.add(animatorListener);
    }

    public void addTransformationCallback(FloatingActionButtonImpl$InternalTransformationCallback floatingActionButtonImpl$InternalTransformationCallback) {
        ArrayList arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            this.transformationCallbacks = arrayList = new ArrayList();
        }
        this.transformationCallbacks.add(floatingActionButtonImpl$InternalTransformationCallback);
    }

    public MaterialShapeDrawable createShapeDrawable() {
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearance;
        shapeAppearanceModel.getClass();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        return materialShapeDrawable;
    }

    public final Drawable getContentBackground() {
        return this.contentBackground;
    }

    public float getElevation() {
        return this.elevation;
    }

    public boolean getEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    public final MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    public void getPadding(Rect rect) {
        float f5;
        int n3 = this.getTouchTargetPadding();
        int n4 = this.shadowPaddingEnabled;
        if (n4 != 0) {
            f5 = this.getElevation();
            float f6 = this.pressedTranslationZ;
            f5 += f6;
        } else {
            n4 = 0;
            f5 = 0.0f;
        }
        int n7 = (int)Math.ceil(f5);
        n7 = Math.max(n3, n7);
        n4 = (int)Math.ceil(f5 * 1.5f);
        n3 = Math.max(n3, n4);
        rect.set(n7, n3, n7, n3);
    }

    public float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    public final ShapeAppearanceModel getShapeAppearance() {
        return this.shapeAppearance;
    }

    public final MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    public int getTouchTargetPadding() {
        int n3 = this.ensureMinTouchTargetSize;
        int n4 = 0;
        if (n3 != 0) {
            n3 = this.minTouchTargetSize;
            FloatingActionButton floatingActionButton = this.view;
            int n7 = floatingActionButton.getSizeDimension();
            n3 = (n3 - n7) / 2;
            n4 = Math.max(n3, 0);
        }
        return n4;
    }

    public void hide(FloatingActionButtonImpl$InternalVisibilityChangedListener iterator, boolean bl2) {
        boolean bl3 = this.isOrWillBeHidden();
        if (bl3) {
            return;
        }
        Object object = this.currentAnimator;
        if (object != null) {
            object.cancel();
        }
        if (bl3 = this.shouldAnimateVisibilityChange()) {
            Object object2;
            object = this.hideMotionSpec;
            if (object != null) {
                boolean bl4 = false;
                object2 = null;
                object = this.createAnimator((MotionSpec)object, 0.0f, 0.0f, 0.0f);
            } else {
                int n3 = HIDE_ANIM_DURATION_ATTR;
                int n4 = HIDE_ANIM_EASING_ATTR;
                float f5 = 0.4f;
                float f6 = 0.4f;
                object2 = this;
                object = this.createDefaultAnimator(0.0f, f5, f6, n3, n4);
            }
            object2 = new FloatingActionButtonImpl$1(this, bl2, (FloatingActionButtonImpl$InternalVisibilityChangedListener)((Object)iterator));
            object.addListener((Animator.AnimatorListener)object2);
            iterator = this.hideListeners;
            if (iterator != null) {
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (bl2 = iterator.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener)iterator.next();
                    object.addListener(animatorListener);
                }
            }
            object.start();
        } else {
            object = this.view;
            int n7 = bl2 ? 8 : 4;
            ((VisibilityAwareImageButton)((Object)object)).internalSetVisibility(n7, bl2);
            if (iterator != null) {
                iterator.onHidden();
            }
        }
    }

    public void initializeBackgroundDrawable(ColorStateList object, PorterDuff.Mode object2, ColorStateList drawableArray, int n3) {
        MaterialShapeDrawable materialShapeDrawable;
        this.shapeDrawable = materialShapeDrawable = this.createShapeDrawable();
        materialShapeDrawable.setTintList((ColorStateList)object);
        if (object2 != null) {
            object = this.shapeDrawable;
            ((MaterialShapeDrawable)object).setTintMode((PorterDuff.Mode)object2);
        }
        this.shapeDrawable.setShadowColor(-12303292);
        object = this.shapeDrawable;
        object2 = this.view.getContext();
        ((MaterialShapeDrawable)object).initializeElevationOverlay((Context)object2);
        object2 = this.shapeDrawable.getShapeAppearanceModel();
        object = new RippleDrawableCompat((ShapeAppearanceModel)object2);
        object2 = RippleUtils.sanitizeRippleDrawableColor((ColorStateList)drawableArray);
        ((RippleDrawableCompat)object).setTintList((ColorStateList)object2);
        this.rippleDrawable = object;
        object2 = this.shapeDrawable;
        object2.getClass();
        drawableArray = new Drawable[]{object2, object};
        object = new LayerDrawable(drawableArray);
        this.contentBackground = object;
    }

    public boolean isOrWillBeHidden() {
        FloatingActionButton floatingActionButton = this.view;
        int n3 = floatingActionButton.getVisibility();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == 0) {
            n3 = this.animState;
            if (n3 == n4) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = this.animState;
        int n7 = 2;
        if (n3 != n7) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isOrWillBeShown() {
        FloatingActionButton floatingActionButton = this.view;
        int n3 = floatingActionButton.getVisibility();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != 0) {
            n3 = this.animState;
            int n7 = 2;
            if (n3 == n7) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = this.animState;
        if (n3 != n4) {
            bl2 = true;
        }
        return bl2;
    }

    public void jumpDrawableToCurrentState() {
        this.stateListAnimator.jumpToCurrentState();
    }

    public void onAttachedToWindow() {
        boolean bl2;
        FloatingActionButton floatingActionButton;
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            floatingActionButton = this.view;
            MaterialShapeUtils.setParentAbsoluteElevation((View)floatingActionButton, materialShapeDrawable);
        }
        if (bl2 = this.requirePreDrawListener()) {
            materialShapeDrawable = this.view.getViewTreeObserver();
            floatingActionButton = this.getOrCreatePreDrawListener();
            materialShapeDrawable.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)floatingActionButton);
        }
    }

    public void onCompatShadowChanged() {
    }

    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            viewTreeObserver = null;
            this.preDrawListener = null;
        }
    }

    public void onDrawableStateChanged(int[] nArray) {
        this.stateListAnimator.setState(nArray);
    }

    public void onElevationsChanged(float f5, float f6, float f7) {
        this.jumpDrawableToCurrentState();
        this.updatePadding();
        this.updateShapeElevation(f5);
    }

    public void onPaddingUpdated(Rect object) {
        Drawable drawable2 = this.contentBackground;
        String string2 = "Didn't initialize content background";
        B41.c(drawable2, string2);
        boolean bl2 = this.shouldAddPadding();
        if (bl2) {
            Drawable drawable3 = this.contentBackground;
            int n3 = ((Rect)object).left;
            int n4 = ((Rect)object).top;
            int n7 = ((Rect)object).right;
            int n8 = ((Rect)object).bottom;
            string2 = drawable2;
            drawable2 = new InsetDrawable(drawable3, n3, n4, n7, n8);
            object = this.shadowViewDelegate;
            object.setBackgroundDrawable(drawable2);
        } else {
            object = this.shadowViewDelegate;
            drawable2 = this.contentBackground;
            object.setBackgroundDrawable(drawable2);
        }
    }

    public void onPreDraw() {
        float f5 = this.rotation;
        FloatingActionButton floatingActionButton = this.view;
        float f6 = floatingActionButton.getRotation();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.rotation = f6;
            this.updateFromViewRotation();
        }
    }

    public void onScaleChanged() {
        Object object = this.transformationCallbacks;
        if (object != null) {
            boolean bl2;
            object = ((ArrayList)object).iterator();
            while (bl2 = object.hasNext()) {
                FloatingActionButtonImpl$InternalTransformationCallback floatingActionButtonImpl$InternalTransformationCallback = (FloatingActionButtonImpl$InternalTransformationCallback)object.next();
                floatingActionButtonImpl$InternalTransformationCallback.onScaleChanged();
            }
        }
    }

    public void onTranslationChanged() {
        Object object = this.transformationCallbacks;
        if (object != null) {
            boolean bl2;
            object = ((ArrayList)object).iterator();
            while (bl2 = object.hasNext()) {
                FloatingActionButtonImpl$InternalTransformationCallback floatingActionButtonImpl$InternalTransformationCallback = (FloatingActionButtonImpl$InternalTransformationCallback)object.next();
                floatingActionButtonImpl$InternalTransformationCallback.onTranslationChanged();
            }
        }
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.hideListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.showListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeTransformationCallback(FloatingActionButtonImpl$InternalTransformationCallback floatingActionButtonImpl$InternalTransformationCallback) {
        ArrayList arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(floatingActionButtonImpl$InternalTransformationCallback);
    }

    public boolean requirePreDrawListener() {
        return true;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Drawable drawable2 = this.shapeDrawable;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
        if ((drawable2 = this.borderDrawable) != null) {
            drawable2.setBorderTint(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    public final void setElevation(float f5) {
        float f6 = this.elevation;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.elevation = f5;
            f6 = this.hoveredFocusedTranslationZ;
            float f8 = this.pressedTranslationZ;
            this.onElevationsChanged(f5, f6, f8);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean bl2) {
        this.ensureMinTouchTargetSize = bl2;
    }

    public final void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public final void setHoveredFocusedTranslationZ(float f5) {
        float f6 = this.hoveredFocusedTranslationZ;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.hoveredFocusedTranslationZ = f5;
            f6 = this.elevation;
            float f8 = this.pressedTranslationZ;
            this.onElevationsChanged(f6, f5, f8);
        }
    }

    public final void setImageMatrixScale(float f5) {
        this.imageMatrixScale = f5;
        Matrix matrix = this.tmpMatrix;
        this.calculateImageMatrixFromScale(f5, matrix);
        this.view.setImageMatrix(matrix);
    }

    public final void setMaxImageSize(int n3) {
        int n4 = this.maxImageSize;
        if (n4 != n3) {
            this.maxImageSize = n3;
            this.updateImageMatrixScale();
        }
    }

    public void setMinTouchTargetSize(int n3) {
        this.minTouchTargetSize = n3;
    }

    public final void setPressedTranslationZ(float f5) {
        float f6 = this.pressedTranslationZ;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.pressedTranslationZ = f5;
            f6 = this.elevation;
            float f8 = this.hoveredFocusedTranslationZ;
            this.onElevationsChanged(f6, f8, f5);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable2 = this.rippleDrawable;
        if (drawable2 != null) {
            colorStateList = RippleUtils.sanitizeRippleDrawableColor(colorStateList);
            drawable2.setTintList(colorStateList);
        }
    }

    public void setShadowPaddingEnabled(boolean bl2) {
        this.shadowPaddingEnabled = bl2;
        this.updatePadding();
    }

    public final void setShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        boolean bl2;
        this.shapeAppearance = shapeAppearanceModel;
        Object object = this.shapeDrawable;
        if (object != null) {
            ((MaterialShapeDrawable)object).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (bl2 = (object = this.rippleDrawable) instanceof Shapeable) {
            object = (Shapeable)object;
            object.setShapeAppearanceModel(shapeAppearanceModel);
        }
        if ((object = this.borderDrawable) != null) {
            ((BorderDrawable)((Object)object)).setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final void setShowMotionSpec(MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public boolean shouldAddPadding() {
        return true;
    }

    public final boolean shouldExpandBoundsForA11y() {
        int n3;
        FloatingActionButton floatingActionButton;
        int n4 = this.ensureMinTouchTargetSize;
        if (n4 != 0 && (n4 = (floatingActionButton = this.view).getSizeDimension()) < (n3 = this.minTouchTargetSize)) {
            n4 = 0;
            floatingActionButton = null;
        } else {
            n4 = 1;
        }
        return n4 != 0;
    }

    public void show(FloatingActionButtonImpl$InternalVisibilityChangedListener iterator, boolean bl2) {
        boolean bl3 = this.isOrWillBeShown();
        if (bl3) {
            return;
        }
        Object object = this.currentAnimator;
        if (object != null) {
            object.cancel();
        }
        object = this.showMotionSpec;
        int n3 = 0;
        Object object2 = null;
        if (object == null) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        int n4 = this.shouldAnimateVisibilityChange();
        float f5 = 1.0f;
        if (n4 != 0) {
            int n7;
            float f6;
            float f7;
            object2 = this.view;
            n3 = object2.getVisibility();
            if (n3 != 0) {
                float f8;
                object2 = this.view;
                n4 = 0;
                f7 = 0.0f;
                object2.setAlpha(0.0f);
                object2 = this.view;
                f6 = 0.4f;
                if (bl3) {
                    n7 = 1053609165;
                    f8 = 0.4f;
                } else {
                    n7 = 0;
                    f8 = 0.0f;
                }
                ((FloatingActionButton)object2).setScaleY(f8);
                object2 = this.view;
                if (bl3) {
                    n7 = 1053609165;
                    f8 = 0.4f;
                } else {
                    n7 = 0;
                    f8 = 0.0f;
                }
                ((FloatingActionButton)object2).setScaleX(f8);
                if (bl3) {
                    n4 = 1053609165;
                    f7 = 0.4f;
                }
                this.setImageMatrixScale(f7);
            }
            if ((object = this.showMotionSpec) != null) {
                object = this.createAnimator((MotionSpec)object, f5, f5, f5);
            } else {
                n7 = SHOW_ANIM_DURATION_ATTR;
                int n8 = SHOW_ANIM_EASING_ATTR;
                n4 = 1065353216;
                f7 = 1.0f;
                f5 = 1.0f;
                f6 = 1.0f;
                object2 = this;
                object = this.createDefaultAnimator(f7, f5, f6, n7, n8);
            }
            object2 = new FloatingActionButtonImpl$2(this, bl2, (FloatingActionButtonImpl$InternalVisibilityChangedListener)((Object)iterator));
            object.addListener((Animator.AnimatorListener)object2);
            iterator = this.showListeners;
            if (iterator != null) {
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (bl2 = iterator.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener)iterator.next();
                    object.addListener(animatorListener);
                }
            }
            object.start();
        } else {
            object = this.view;
            ((VisibilityAwareImageButton)((Object)object)).internalSetVisibility(0, bl2);
            this.view.setAlpha(f5);
            this.view.setScaleY(f5);
            FloatingActionButton floatingActionButton = this.view;
            floatingActionButton.setScaleX(f5);
            this.setImageMatrixScale(f5);
            if (iterator != null) {
                iterator.onShown();
            }
        }
    }

    public void updateFromViewRotation() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            float f5 = this.rotation;
            int n3 = (int)f5;
            materialShapeDrawable.setShadowCompatRotation(n3);
        }
    }

    public final void updateImageMatrixScale() {
        float f5 = this.imageMatrixScale;
        this.setImageMatrixScale(f5);
    }

    public final void updatePadding() {
        Rect rect = this.tmpRect;
        this.getPadding(rect);
        this.onPaddingUpdated(rect);
        ShadowViewDelegate shadowViewDelegate = this.shadowViewDelegate;
        int n3 = rect.left;
        int n4 = rect.top;
        int n7 = rect.right;
        int n8 = rect.bottom;
        shadowViewDelegate.setShadowPadding(n3, n4, n7, n8);
    }

    public void updateShapeElevation(float f5) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f5);
        }
    }
}

