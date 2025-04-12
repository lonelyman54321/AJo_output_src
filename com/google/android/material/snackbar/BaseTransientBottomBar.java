/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityManager
 */
package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar$1;
import com.google.android.material.snackbar.BaseTransientBottomBar$10;
import com.google.android.material.snackbar.BaseTransientBottomBar$11;
import com.google.android.material.snackbar.BaseTransientBottomBar$12;
import com.google.android.material.snackbar.BaseTransientBottomBar$13;
import com.google.android.material.snackbar.BaseTransientBottomBar$14;
import com.google.android.material.snackbar.BaseTransientBottomBar$15;
import com.google.android.material.snackbar.BaseTransientBottomBar$16;
import com.google.android.material.snackbar.BaseTransientBottomBar$2;
import com.google.android.material.snackbar.BaseTransientBottomBar$5;
import com.google.android.material.snackbar.BaseTransientBottomBar$6;
import com.google.android.material.snackbar.BaseTransientBottomBar$7;
import com.google.android.material.snackbar.BaseTransientBottomBar$8;
import com.google.android.material.snackbar.BaseTransientBottomBar$9;
import com.google.android.material.snackbar.BaseTransientBottomBar$Anchor;
import com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import com.google.android.material.snackbar.ContentViewCallback;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.snackbar.SnackbarManager$Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public abstract class BaseTransientBottomBar {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    static final int DEFAULT_ANIMATION_FADE_DURATION = 180;
    private static final TimeInterpolator DEFAULT_ANIMATION_FADE_INTERPOLATOR;
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 150;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 75;
    private static final TimeInterpolator DEFAULT_ANIMATION_SCALE_INTERPOLATOR;
    private static final TimeInterpolator DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
    static final int DEFAULT_SLIDE_ANIMATION_DURATION = 250;
    public static final int LENGTH_INDEFINITE = 254;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = 255;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW;
    private static final int[] SNACKBAR_STYLE_ATTR;
    private static final String TAG;
    private static final boolean USE_OFFSET_API;
    static final Handler handler;
    private final AccessibilityManager accessibilityManager;
    private BaseTransientBottomBar$Anchor anchor;
    private boolean anchorViewLayoutListenerEnabled;
    private final int animationFadeInDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private final TimeInterpolator animationScaleInterpolator;
    private final int animationSlideDuration;
    private final TimeInterpolator animationSlideInterpolator;
    private int appliedBottomMarginGestureInset;
    private BaseTransientBottomBar$Behavior behavior;
    private final Runnable bottomMarginGestureInsetRunnable;
    private List callbacks;
    private final ContentViewCallback contentViewCallback;
    private final Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;
    SnackbarManager$Callback managerCallback;
    private boolean pendingShowingView;
    private final ViewGroup targetParent;
    protected final BaseTransientBottomBar$SnackbarBaseLayout view;

    static {
        Handler handler;
        DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        DEFAULT_ANIMATION_FADE_INTERPOLATOR = AnimationUtils.LINEAR_INTERPOLATOR;
        DEFAULT_ANIMATION_SCALE_INTERPOLATOR = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        USE_OFFSET_API = false;
        int n3 = R$attr.snackbarStyle;
        SNACKBAR_STYLE_ATTR = new int[]{n3};
        TAG = "BaseTransientBottomBar";
        Looper looper = Looper.getMainLooper();
        BaseTransientBottomBar$1 baseTransientBottomBar$1 = new BaseTransientBottomBar$1();
        BaseTransientBottomBar.handler = handler = new Handler(looper, (Handler.Callback)baseTransientBottomBar$1);
    }

    public BaseTransientBottomBar(Context object, ViewGroup object2, View object3, ContentViewCallback contentViewCallback) {
        int n3 = 0;
        float f5 = 0.0f;
        this.anchorViewLayoutListenerEnabled = false;
        Object object4 = new BaseTransientBottomBar$2(this);
        this.bottomMarginGestureInsetRunnable = object4;
        this.managerCallback = object4 = new BaseTransientBottomBar$5(this);
        if (object2 != null) {
            if (object3 != null) {
                if (contentViewCallback != null) {
                    this.targetParent = object2;
                    this.contentViewCallback = contentViewCallback;
                    this.context = object;
                    ThemeEnforcement.checkAppCompatTheme(object);
                    contentViewCallback = LayoutInflater.from((Context)object);
                    int n4 = this.getSnackbarBaseLayoutResId();
                    object2 = (BaseTransientBottomBar$SnackbarBaseLayout)contentViewCallback.inflate(n4, (ViewGroup)object2, false);
                    this.view = object2;
                    BaseTransientBottomBar$SnackbarBaseLayout.access$500((BaseTransientBottomBar$SnackbarBaseLayout)((Object)object2), this);
                    boolean bl2 = object3 instanceof SnackbarContentLayout;
                    if (bl2) {
                        contentViewCallback = object3;
                        contentViewCallback = (SnackbarContentLayout)object3;
                        f5 = ((BaseTransientBottomBar$SnackbarBaseLayout)((Object)object2)).getActionTextColorAlpha();
                        ((SnackbarContentLayout)contentViewCallback).updateActionTextColorAlphaIfNeeded(f5);
                        n3 = ((BaseTransientBottomBar$SnackbarBaseLayout)((Object)object2)).getMaxInlineActionWidth();
                        ((SnackbarContentLayout)contentViewCallback).setMaxInlineActionWidth(n3);
                    }
                    object2.addView(object3);
                    object3 = ViewCompat.a;
                    boolean bl3 = true;
                    object2.setAccessibilityLiveRegion((int)(bl3 ? 1 : 0));
                    object2.setImportantForAccessibility((int)(bl3 ? 1 : 0));
                    object2.setFitsSystemWindows(bl3);
                    super(this);
                    ViewCompat$c.o((View)object2, (T72)object3);
                    super(this);
                    ViewCompat.s((View)object2, (a)object3);
                    object2 = (AccessibilityManager)object.getSystemService("accessibility");
                    this.accessibilityManager = object2;
                    int n7 = R$attr.motionDurationLong2;
                    this.animationSlideDuration = n7 = MotionUtils.resolveThemeDuration(object, n7, 250);
                    n7 = R$attr.motionDurationLong2;
                    this.animationFadeInDuration = n7 = MotionUtils.resolveThemeDuration(object, n7, 150);
                    n7 = R$attr.motionDurationMedium1;
                    this.animationFadeOutDuration = n7 = MotionUtils.resolveThemeDuration(object, n7, 75);
                    n7 = R$attr.motionEasingEmphasizedInterpolator;
                    object3 = DEFAULT_ANIMATION_FADE_INTERPOLATOR;
                    object2 = MotionUtils.resolveThemeInterpolator(object, n7, (TimeInterpolator)object3);
                    this.animationFadeInterpolator = object2;
                    n7 = R$attr.motionEasingEmphasizedInterpolator;
                    object3 = DEFAULT_ANIMATION_SCALE_INTERPOLATOR;
                    object2 = MotionUtils.resolveThemeInterpolator(object, n7, (TimeInterpolator)object3);
                    this.animationScaleInterpolator = object2;
                    n7 = R$attr.motionEasingEmphasizedInterpolator;
                    object3 = DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
                    object = MotionUtils.resolveThemeInterpolator(object, n7, (TimeInterpolator)object3);
                    this.animationSlideInterpolator = object;
                    return;
                }
                super("Transient bottom bar must have non-null callback");
                throw object;
            }
            super("Transient bottom bar must have non-null content");
            throw object;
        }
        super("Transient bottom bar must have non-null parent");
        throw object;
    }

    public BaseTransientBottomBar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        Context context = viewGroup.getContext();
        this(context, viewGroup, view, contentViewCallback);
    }

    public static /* synthetic */ Context access$000(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.context;
    }

    public static /* synthetic */ int access$100(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.getViewAbsoluteBottom();
    }

    public static /* synthetic */ void access$1200(BaseTransientBottomBar baseTransientBottomBar) {
        baseTransientBottomBar.startFadeInAnimation();
    }

    public static /* synthetic */ void access$1300(BaseTransientBottomBar baseTransientBottomBar) {
        baseTransientBottomBar.startSlideInAnimation();
    }

    public static /* synthetic */ int access$1400(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.animationSlideDuration;
    }

    public static /* synthetic */ int access$1500(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.animationFadeInDuration;
    }

    public static /* synthetic */ ContentViewCallback access$1600(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.contentViewCallback;
    }

    public static /* synthetic */ boolean access$1700() {
        return USE_OFFSET_API;
    }

    public static /* synthetic */ int access$1800(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.animationFadeOutDuration;
    }

    public static /* synthetic */ MaterialShapeDrawable access$1900(int n3, ShapeAppearanceModel shapeAppearanceModel) {
        return BaseTransientBottomBar.createMaterialShapeDrawableBackground(n3, shapeAppearanceModel);
    }

    public static /* synthetic */ int access$200(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.extraBottomMarginGestureInset;
    }

    public static /* synthetic */ GradientDrawable access$2000(int n3, Resources resources) {
        return BaseTransientBottomBar.createGradientDrawableBackground(n3, resources);
    }

    public static /* synthetic */ boolean access$2100(BaseTransientBottomBar baseTransientBottomBar) {
        return baseTransientBottomBar.anchorViewLayoutListenerEnabled;
    }

    public static /* synthetic */ void access$2200(BaseTransientBottomBar baseTransientBottomBar) {
        baseTransientBottomBar.recalculateAndUpdateMargins();
    }

    public static /* synthetic */ int access$302(BaseTransientBottomBar baseTransientBottomBar, int n3) {
        baseTransientBottomBar.appliedBottomMarginGestureInset = n3;
        return n3;
    }

    public static /* synthetic */ String access$400() {
        return TAG;
    }

    public static /* synthetic */ int access$602(BaseTransientBottomBar baseTransientBottomBar, int n3) {
        baseTransientBottomBar.extraBottomMarginWindowInset = n3;
        return n3;
    }

    public static /* synthetic */ int access$702(BaseTransientBottomBar baseTransientBottomBar, int n3) {
        baseTransientBottomBar.extraLeftMarginWindowInset = n3;
        return n3;
    }

    public static /* synthetic */ int access$802(BaseTransientBottomBar baseTransientBottomBar, int n3) {
        baseTransientBottomBar.extraRightMarginWindowInset = n3;
        return n3;
    }

    public static /* synthetic */ void access$900(BaseTransientBottomBar baseTransientBottomBar) {
        baseTransientBottomBar.updateMargins();
    }

    private void animateViewOut(int n3) {
        int n4;
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.view;
        int n7 = baseTransientBottomBar$SnackbarBaseLayout.getAnimationMode();
        if (n7 == (n4 = 1)) {
            this.startFadeOutAnimation(n3);
        } else {
            this.startSlideOutAnimation(n3);
        }
    }

    private int calculateBottomMarginForAnchorView() {
        Object object = this.getAnchorView();
        if (object == null) {
            return 0;
        }
        Object object2 = 2;
        int[] nArray = new int[object2];
        this.getAnchorView().getLocationOnScreen(nArray);
        int n3 = 1;
        int n4 = nArray[n3];
        object = new int[object2];
        this.targetParent.getLocationOnScreen((int[])object);
        object2 = object[n3];
        return this.targetParent.getHeight() + object2 - n4;
    }

    private static GradientDrawable createGradientDrawableBackground(int n3, Resources resources) {
        int n4 = R$dimen.mtrl_snackbar_background_corner_radius;
        float f5 = resources.getDimension(n4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f5);
        gradientDrawable.setColor(n3);
        return gradientDrawable;
    }

    private static MaterialShapeDrawable createMaterialShapeDrawableBackground(int n3, ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        materialShapeDrawable.setFillColor(colorStateList);
        return materialShapeDrawable;
    }

    private ValueAnimator getAlphaAnimator(float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        Object object2 = this.animationFadeInterpolator;
        object.setInterpolator(object2);
        object2 = new BaseTransientBottomBar$11(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return object;
    }

    private ValueAnimator getScaleAnimator(float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        Object object2 = this.animationScaleInterpolator;
        object.setInterpolator(object2);
        object2 = new BaseTransientBottomBar$12(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return object;
    }

    private int getTranslationYBottom() {
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.view;
        int n3 = baseTransientBottomBar$SnackbarBaseLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        boolean bl2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            int n4 = layoutParams.bottomMargin;
            n3 += n4;
        }
        return n3;
    }

    private int getViewAbsoluteBottom() {
        int[] nArray = new int[2];
        this.view.getLocationInWindow(nArray);
        int n3 = nArray[1];
        return this.view.getHeight() + n3;
    }

    private boolean isSwipeDismissable() {
        boolean bl2;
        Object object = this.view.getLayoutParams();
        boolean bl3 = object instanceof CoordinatorLayout$e;
        if (bl3 && (bl2 = (object = ((CoordinatorLayout$e)((Object)object)).a) instanceof SwipeDismissBehavior)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void recalculateAndUpdateMargins() {
        int n3;
        this.extraBottomMarginAnchorView = n3 = this.calculateBottomMarginForAnchorView();
        this.updateMargins();
    }

    private void setUpBehavior(CoordinatorLayout$e coordinatorLayout$e) {
        Object object;
        boolean bl2;
        SwipeDismissBehavior swipeDismissBehavior = this.behavior;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = this.getNewBehavior();
        }
        if (bl2 = swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior) {
            object = swipeDismissBehavior;
            object = swipeDismissBehavior;
            BaseTransientBottomBar$Behavior.access$1100((BaseTransientBottomBar$Behavior)object, this);
        }
        object = new BaseTransientBottomBar$7(this);
        ((SwipeDismissBehavior)swipeDismissBehavior).setListener((SwipeDismissBehavior$OnDismissListener)object);
        coordinatorLayout$e.b(swipeDismissBehavior);
        swipeDismissBehavior = this.getAnchorView();
        if (swipeDismissBehavior == null) {
            int n3;
            coordinatorLayout$e.g = n3 = 80;
        }
    }

    private boolean shouldUpdateGestureInset() {
        int n3 = this.extraBottomMarginGestureInset;
        n3 = n3 > 0 && (n3 = (int)(this.gestureInsetBottomIgnored ? 1 : 0)) == 0 && (n3 = this.isSwipeDismissable()) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private void showViewImpl() {
        boolean bl2 = this.shouldAnimate();
        if (bl2) {
            this.animateViewIn();
        } else {
            Object object = this.view.getParent();
            if (object != null) {
                object = this.view;
                object.setVisibility(0);
            }
            this.onViewShown();
        }
    }

    private void startFadeInAnimation() {
        int n3 = 2;
        Object object = new float[n3];
        object[0] = 0.0f;
        object[1] = 1.0f;
        object = this.getAlphaAnimator((float)object);
        Object object2 = new float[n3];
        object2[0] = 0.8f;
        object2[1] = 1.0f;
        object2 = this.getScaleAnimator((float)object2);
        AnimatorSet animatorSet = new AnimatorSet();
        Object object3 = new Animator[n3];
        object3[0] = (Animator)object;
        object3[1] = (Animator)object2;
        animatorSet.playTogether(object3);
        long l2 = this.animationFadeInDuration;
        animatorSet.setDuration(l2);
        object3 = new BaseTransientBottomBar$9(this);
        animatorSet.addListener((Animator.AnimatorListener)object3);
        animatorSet.start();
    }

    private void startFadeOutAnimation(int n3) {
        Object object = new float[]{1.0f, 0.0f};
        object = this.getAlphaAnimator((float)object);
        long l2 = this.animationFadeOutDuration;
        object.setDuration(l2);
        BaseTransientBottomBar$10 baseTransientBottomBar$10 = new BaseTransientBottomBar$10(this, n3);
        object.addListener((Animator.AnimatorListener)baseTransientBottomBar$10);
        object.start();
    }

    private void startSlideInAnimation() {
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout;
        int n3 = this.getTranslationYBottom();
        boolean bl2 = USE_OFFSET_API;
        if (bl2) {
            baseTransientBottomBar$SnackbarBaseLayout = this.view;
            ViewCompat.m(n3, (View)baseTransientBottomBar$SnackbarBaseLayout);
        } else {
            baseTransientBottomBar$SnackbarBaseLayout = this.view;
            float f5 = n3;
            baseTransientBottomBar$SnackbarBaseLayout.setTranslationY(f5);
        }
        baseTransientBottomBar$SnackbarBaseLayout = new ValueAnimator();
        Object object = new int[]{n3, 0};
        baseTransientBottomBar$SnackbarBaseLayout.setIntValues((int[])object);
        object = this.animationSlideInterpolator;
        baseTransientBottomBar$SnackbarBaseLayout.setInterpolator((TimeInterpolator)object);
        long l2 = this.animationSlideDuration;
        baseTransientBottomBar$SnackbarBaseLayout.setDuration(l2);
        object = (Object)new BaseTransientBottomBar$13;
        object(this);
        baseTransientBottomBar$SnackbarBaseLayout.addListener((Animator.AnimatorListener)object);
        object = new BaseTransientBottomBar$14;
        object(this, n3);
        baseTransientBottomBar$SnackbarBaseLayout.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        baseTransientBottomBar$SnackbarBaseLayout.start();
    }

    private void startSlideOutAnimation(int n3) {
        ValueAnimator valueAnimator = new ValueAnimator();
        int n4 = this.getTranslationYBottom();
        Object object = new int[]{0, n4};
        valueAnimator.setIntValues(object);
        object = this.animationSlideInterpolator;
        valueAnimator.setInterpolator((TimeInterpolator)object);
        long l2 = this.animationSlideDuration;
        valueAnimator.setDuration(l2);
        object = (Object)new BaseTransientBottomBar$15;
        object(this, n3);
        valueAnimator.addListener((Animator.AnimatorListener)object);
        BaseTransientBottomBar$16 baseTransientBottomBar$16 = new BaseTransientBottomBar$16(this);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)baseTransientBottomBar$16);
        valueAnimator.start();
    }

    private void updateMargins() {
        int n3;
        Object object = this.view.getLayoutParams();
        int n4 = object instanceof ViewGroup.MarginLayoutParams;
        if (n4 == 0) {
            return;
        }
        Object object2 = BaseTransientBottomBar$SnackbarBaseLayout.access$1000(this.view);
        if (object2 == null) {
            return;
        }
        object2 = this.view.getParent();
        if (object2 == null) {
            return;
        }
        object2 = this.getAnchorView();
        n4 = object2 != null ? this.extraBottomMarginAnchorView : this.extraBottomMarginWindowInset;
        object = (ViewGroup.MarginLayoutParams)object;
        Rect rect = BaseTransientBottomBar$SnackbarBaseLayout.access$1000(this.view);
        int n7 = rect.bottom + n4;
        object2 = BaseTransientBottomBar$SnackbarBaseLayout.access$1000(this.view);
        n4 = object2.left;
        int n8 = this.extraLeftMarginWindowInset;
        n4 += n8;
        Rect rect2 = BaseTransientBottomBar$SnackbarBaseLayout.access$1000(this.view);
        n8 = rect2.right;
        int n10 = this.extraRightMarginWindowInset;
        n8 += n10;
        Rect rect3 = BaseTransientBottomBar$SnackbarBaseLayout.access$1000(this.view);
        n10 = rect3.top;
        int n14 = object.bottomMargin;
        n14 = n14 == n7 && (n14 = object.leftMargin) == n4 && (n14 = object.rightMargin) == n8 && (n14 = object.topMargin) == n10 ? 0 : 1;
        if (n14 != 0) {
            object.bottomMargin = n7;
            object.leftMargin = n4;
            object.rightMargin = n8;
            object.topMargin = n10;
            object = this.view;
            object.requestLayout();
        }
        if ((n14 != 0 || (n3 = this.appliedBottomMarginGestureInset) != (n4 = this.extraBottomMarginGestureInset)) && (n3 = Build.VERSION.SDK_INT) >= (n4 = 29) && (n3 = (int)(this.shouldUpdateGestureInset() ? 1 : 0)) != 0) {
            object = this.view;
            object2 = this.bottomMarginGestureInsetRunnable;
            object.removeCallbacks((Runnable)object2);
            object = this.view;
            object2 = this.bottomMarginGestureInsetRunnable;
            object.post((Runnable)object2);
        }
    }

    public BaseTransientBottomBar addCallback(BaseTransientBottomBar$BaseCallback baseTransientBottomBar$BaseCallback) {
        if (baseTransientBottomBar$BaseCallback == null) {
            return this;
        }
        ArrayList arrayList = this.callbacks;
        if (arrayList == null) {
            this.callbacks = arrayList = new ArrayList();
        }
        this.callbacks.add(baseTransientBottomBar$BaseCallback);
        return this;
    }

    public void animateViewIn() {
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.view;
        BaseTransientBottomBar$8 baseTransientBottomBar$8 = new BaseTransientBottomBar$8(this);
        baseTransientBottomBar$SnackbarBaseLayout.post(baseTransientBottomBar$8);
    }

    public void dismiss() {
        this.dispatchDismiss(3);
    }

    public void dispatchDismiss(int n3) {
        SnackbarManager snackbarManager = SnackbarManager.getInstance();
        SnackbarManager$Callback snackbarManager$Callback = this.managerCallback;
        snackbarManager.dismiss(snackbarManager$Callback, n3);
    }

    public View getAnchorView() {
        BaseTransientBottomBar$Anchor baseTransientBottomBar$Anchor = this.anchor;
        baseTransientBottomBar$Anchor = baseTransientBottomBar$Anchor == null ? null : baseTransientBottomBar$Anchor.getAnchorView();
        return baseTransientBottomBar$Anchor;
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public BaseTransientBottomBar$Behavior getBehavior() {
        return this.behavior;
    }

    public Context getContext() {
        return this.context;
    }

    public int getDuration() {
        return this.duration;
    }

    public SwipeDismissBehavior getNewBehavior() {
        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
        return baseTransientBottomBar$Behavior;
    }

    public int getSnackbarBaseLayoutResId() {
        int n3 = this.hasSnackbarStyleAttr();
        n3 = n3 != 0 ? R$layout.mtrl_layout_snackbar : R$layout.design_layout_snackbar;
        return n3;
    }

    public View getView() {
        return this.view;
    }

    public boolean hasSnackbarStyleAttr() {
        Context context = this.context;
        int[] nArray = SNACKBAR_STYLE_ATTR;
        context = context.obtainStyledAttributes(nArray);
        boolean bl2 = false;
        nArray = null;
        int n3 = -1;
        int n4 = context.getResourceId(0, n3);
        context.recycle();
        if (n4 != n3) {
            bl2 = true;
        }
        return bl2;
    }

    public final void hideView(int n3) {
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout;
        int n4 = this.shouldAnimate();
        if (n4 != 0 && (n4 = (baseTransientBottomBar$SnackbarBaseLayout = this.view).getVisibility()) == 0) {
            this.animateViewOut(n3);
        } else {
            this.onViewHidden(n3);
        }
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.anchorViewLayoutListenerEnabled;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isShown() {
        SnackbarManager snackbarManager = SnackbarManager.getInstance();
        SnackbarManager$Callback snackbarManager$Callback = this.managerCallback;
        return snackbarManager.isCurrent(snackbarManager$Callback);
    }

    public boolean isShownOrQueued() {
        SnackbarManager snackbarManager = SnackbarManager.getInstance();
        SnackbarManager$Callback snackbarManager$Callback = this.managerCallback;
        return snackbarManager.isCurrentOrNext(snackbarManager$Callback);
    }

    public void onAttachedToWindow() {
        WindowInsets windowInsets;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4 && (windowInsets = lw_1.a(this.view)) != null) {
            windowInsets = IG3.a(windowInsets);
            this.extraBottomMarginGestureInset = n3 = su0_0.a((Insets)windowInsets);
            this.updateMargins();
        }
    }

    public void onDetachedFromWindow() {
        boolean bl2 = this.isShownOrQueued();
        if (bl2) {
            Handler handler = BaseTransientBottomBar.handler;
            BaseTransientBottomBar$6 baseTransientBottomBar$6 = new BaseTransientBottomBar$6(this);
            handler.post((Runnable)baseTransientBottomBar$6);
        }
    }

    public void onLayoutChange() {
        boolean bl2 = this.pendingShowingView;
        if (bl2) {
            this.showViewImpl();
            bl2 = false;
            this.pendingShowingView = false;
        }
    }

    public void onViewHidden(int n3) {
        ViewParent viewParent;
        int n4;
        Object object = SnackbarManager.getInstance();
        Object object2 = this.managerCallback;
        ((SnackbarManager)object).onDismissed((SnackbarManager$Callback)object2);
        object = this.callbacks;
        if (object != null) {
            for (n4 = object.size() + -1; n4 >= 0; n4 += -1) {
                object2 = (BaseTransientBottomBar$BaseCallback)this.callbacks.get(n4);
                ((BaseTransientBottomBar$BaseCallback)object2).onDismissed(this, n3);
            }
        }
        if ((n4 = (viewParent = this.view.getParent()) instanceof ViewGroup) != 0) {
            viewParent = (ViewGroup)viewParent;
            object = this.view;
            viewParent.removeView((View)object);
        }
    }

    public void onViewShown() {
        Object object = SnackbarManager.getInstance();
        Object object2 = this.managerCallback;
        ((SnackbarManager)object).onShown((SnackbarManager$Callback)object2);
        object = this.callbacks;
        if (object != null) {
            for (int i3 = object.size() + -1; i3 >= 0; i3 += -1) {
                object2 = (BaseTransientBottomBar$BaseCallback)this.callbacks.get(i3);
                ((BaseTransientBottomBar$BaseCallback)object2).onShown(this);
            }
        }
    }

    public BaseTransientBottomBar removeCallback(BaseTransientBottomBar$BaseCallback baseTransientBottomBar$BaseCallback) {
        if (baseTransientBottomBar$BaseCallback == null) {
            return this;
        }
        List list = this.callbacks;
        if (list == null) {
            return this;
        }
        list.remove(baseTransientBottomBar$BaseCallback);
        return this;
    }

    public BaseTransientBottomBar setAnchorView(int n3) {
        Object object = this.targetParent.findViewById(n3);
        if (object != null) {
            return this.setAnchorView((View)object);
        }
        String string2 = hj0_0.a(n3, "Unable to find anchor view with id: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public BaseTransientBottomBar setAnchorView(View object) {
        BaseTransientBottomBar$Anchor baseTransientBottomBar$Anchor = this.anchor;
        if (baseTransientBottomBar$Anchor != null) {
            baseTransientBottomBar$Anchor.unanchor();
        }
        object = object == null ? null : BaseTransientBottomBar$Anchor.anchor(this, object);
        this.anchor = object;
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean bl2) {
        this.anchorViewLayoutListenerEnabled = bl2;
    }

    public BaseTransientBottomBar setAnimationMode(int n3) {
        this.view.setAnimationMode(n3);
        return this;
    }

    public BaseTransientBottomBar setBehavior(BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior) {
        this.behavior = baseTransientBottomBar$Behavior;
        return this;
    }

    public BaseTransientBottomBar setDuration(int n3) {
        this.duration = n3;
        return this;
    }

    public BaseTransientBottomBar setGestureInsetBottomIgnored(boolean bl2) {
        this.gestureInsetBottomIgnored = bl2;
        return this;
    }

    public boolean shouldAnimate() {
        boolean bl2;
        Object object = this.accessibilityManager;
        boolean bl3 = true;
        if (object == null) {
            return bl3;
        }
        if ((object = object.getEnabledAccessibilityServiceList((int)(bl3 ? 1 : 0))) == null || !(bl2 = object.isEmpty())) {
            bl3 = false;
        }
        return bl3;
    }

    public void show() {
        SnackbarManager snackbarManager = SnackbarManager.getInstance();
        int n3 = this.getDuration();
        SnackbarManager$Callback snackbarManager$Callback = this.managerCallback;
        snackbarManager.show(n3, snackbarManager$Callback);
    }

    public final void showView() {
        WeakHashMap weakHashMap;
        Object object = this.view.getParent();
        if (object == null) {
            object = this.view.getLayoutParams();
            int n3 = object instanceof CoordinatorLayout$e;
            if (n3 != 0) {
                object = (CoordinatorLayout$e)((Object)object);
                this.setUpBehavior((CoordinatorLayout$e)((Object)object));
            }
            object = this.view;
            weakHashMap = this.targetParent;
            object.addToTargetParent((ViewGroup)weakHashMap);
            this.recalculateAndUpdateMargins();
            object = this.view;
            n3 = 4;
            object.setVisibility(n3);
        }
        object = this.view;
        weakHashMap = ViewCompat.a;
        boolean bl2 = object.isLaidOut();
        if (bl2) {
            this.showViewImpl();
            return;
        }
        this.pendingShowingView = true;
    }
}

