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
 *  android.graphics.Canvas
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewOutlineProvider
 *  android.view.animation.Interpolator
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$integer;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;
import com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$LiftOnScrollListener;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.ViewUtilsLollipop;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class AppBarLayout
extends LinearLayout
implements CoordinatorLayout$b {
    private static final int DEF_STYLE_RES = 0;
    private static final int INVALID_SCROLL_RANGE = 255;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE;
    private final float appBarElevation;
    private AppBarLayout$Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;
    private f lastInsets;
    private boolean liftOnScroll;
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List liftOnScrollListeners;
    private WeakReference liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_AppBarLayout;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.appBarLayoutStyle;
        this(context, attributeSet, n3);
    }

    public AppBarLayout(Context object, AttributeSet attributeSet, int n3) {
        float f5;
        long l2;
        Object object2;
        int n4;
        int n7 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, attributeSet, n3, n7);
        super(object, attributeSet, n3);
        this.totalScrollRange = n4 = -1;
        this.downPreScrollRange = n4;
        this.downScrollRange = n4;
        this.pendingAction = 0;
        this.liftOnScrollListeners = object2 = new ArrayList();
        Context context = this.getContext();
        int n8 = 1;
        this.setOrientation(n8);
        int n10 = Build.VERSION.SDK_INT;
        object2 = this.getOutlineProvider();
        Object object3 = ViewOutlineProvider.BACKGROUND;
        if (object2 == object3) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider((View)this);
        }
        ViewUtilsLollipop.setStateListAnimatorFromAttrs((View)this, attributeSet, n3, n7);
        int[] nArray = R$styleable.AppBarLayout;
        int[] nArray2 = new int[]{};
        object2 = context;
        object3 = attributeSet;
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n7, nArray2);
        n3 = R$styleable.AppBarLayout_android_background;
        Drawable drawable2 = attributeSet.getDrawable(n3);
        object2 = ViewCompat.a;
        this.setBackground(drawable2);
        n3 = R$styleable.AppBarLayout_liftOnScrollColor;
        drawable2 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
        if (drawable2 == null) {
            n8 = 0;
        }
        this.hasLiftOnScrollColor = n8;
        object2 = DrawableUtils.getColorStateListOrNull(this.getBackground());
        if (object2 != null) {
            super();
            ((MaterialShapeDrawable)object3).setFillColor((ColorStateList)object2);
            if (drawable2 != null) {
                this.initializeLiftOnScrollWithColor((MaterialShapeDrawable)object3, (ColorStateList)object2, (ColorStateList)drawable2);
            } else {
                this.initializeLiftOnScrollWithElevation(context, (MaterialShapeDrawable)object3);
            }
        }
        n3 = R$attr.motionDurationMedium2;
        object2 = this.getResources();
        int n14 = R$integer.app_bar_elevation_anim_duration;
        int n15 = object2.getInteger(n14);
        this.liftOnScrollColorDuration = l2 = (long)MotionUtils.resolveThemeDuration(context, n3, n15);
        n3 = R$attr.motionEasingStandardInterpolator;
        object2 = AnimationUtils.LINEAR_INTERPOLATOR;
        drawable2 = MotionUtils.resolveThemeInterpolator(context, n3, (TimeInterpolator)object2);
        this.liftOnScrollColorInterpolator = drawable2;
        n3 = R$styleable.AppBarLayout_expanded;
        if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.AppBarLayout_expanded;
            n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
            this.setExpanded(n3 != 0, false, false);
        }
        n3 = R$styleable.AppBarLayout_elevation;
        if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.AppBarLayout_elevation;
            n3 = attributeSet.getDimensionPixelSize(n3, 0);
            f5 = n3;
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator((View)this, f5);
        }
        n3 = 26;
        f5 = 3.6E-44f;
        if (n10 >= n3) {
            n3 = R$styleable.AppBarLayout_android_keyboardNavigationCluster;
            if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
                n3 = R$styleable.AppBarLayout_android_keyboardNavigationCluster;
                n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
                lm_0.b(this, n3 != 0);
            }
            n3 = R$styleable.AppBarLayout_android_touchscreenBlocksFocus;
            if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
                n3 = R$styleable.AppBarLayout_android_touchscreenBlocksFocus;
                n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
                this.setTouchscreenBlocksFocus(n3 != 0);
            }
        }
        drawable2 = this.getResources();
        n15 = R$dimen.design_appbar_elevation;
        this.appBarElevation = f5 = drawable2.getDimension(n15);
        n3 = R$styleable.AppBarLayout_liftOnScroll;
        n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
        this.liftOnScroll = n3;
        n3 = R$styleable.AppBarLayout_liftOnScrollTargetViewId;
        this.liftOnScrollTargetViewId = n4 = attributeSet.getResourceId(n3, n4);
        n4 = R$styleable.AppBarLayout_statusBarForeground;
        object = attributeSet.getDrawable(n4);
        this.setStatusBarForeground((Drawable)object);
        attributeSet.recycle();
        super(this);
        ViewCompat$c.o((View)this, (T72)object);
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        appBarLayout.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer n3, ValueAnimator valueAnimator) {
        appBarLayout.lambda$initializeLiftOnScrollWithColor$0(colorStateList, colorStateList2, materialShapeDrawable, n3, valueAnimator);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private Integer extractStatusBarForegroundColor() {
        Drawable drawable2 = this.statusBarForeground;
        boolean bl2 = drawable2 instanceof MaterialShapeDrawable;
        if (bl2) {
            return ((MaterialShapeDrawable)drawable2).getResolvedTintColor();
        }
        if ((drawable2 = DrawableUtils.getColorStateListOrNull(drawable2)) != null) {
            return drawable2.getDefaultColor();
        }
        return null;
    }

    private View findLiftOnScrollTargetView(View object) {
        int n3;
        int n4;
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        Object object2 = null;
        if (weakReference == null && (n4 = this.liftOnScrollTargetViewId) != (n3 = -1)) {
            if ((object = object != null ? object.findViewById(n4) : null) == null && (n4 = (weakReference = this.getParent()) instanceof ViewGroup) != 0) {
                object = (ViewGroup)this.getParent();
                n4 = this.liftOnScrollTargetViewId;
                object = object.findViewById(n4);
            }
            if (object != null) {
                this.liftOnScrollTargetView = weakReference = new WeakReference<View>((View)object);
            }
        }
        if ((object = this.liftOnScrollTargetView) != null) {
            object2 = object = object.get();
            object2 = object;
        }
        return object2;
    }

    private boolean hasCollapsibleChild() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)this.getChildAt(i3).getLayoutParams();
            boolean bl2 = appBarLayout$LayoutParams.isCollapsible();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(MaterialShapeDrawable materialShapeDrawable, ColorStateList object, ColorStateList colorStateList) {
        Object object2 = this.getContext();
        int n3 = R$attr.colorSurface;
        Integer n4 = MaterialColors.getColorOrNull(object2, n3);
        object2 = new mm_0(this, (ColorStateList)object, colorStateList, materialShapeDrawable, n4);
        this.liftOnScrollColorUpdateListener = object2;
        object = ViewCompat.a;
        this.setBackground(materialShapeDrawable);
    }

    private void initializeLiftOnScrollWithElevation(Context object, MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay((Context)object);
        object = new nm_0(this, materialShapeDrawable);
        this.liftOnScrollColorUpdateListener = object;
        object = ViewCompat.a;
        this.setBackground(materialShapeDrawable);
    }

    private void invalidateScrollRanges() {
        AbsSavedState absSavedState;
        int n3;
        Object object = this.behavior;
        int n4 = -1;
        if (object != null && (n3 = this.totalScrollRange) != n4 && (n3 = this.pendingAction) == 0) {
            absSavedState = AbsSavedState.EMPTY_STATE;
            object = ((AppBarLayout$BaseBehavior)object).saveScrollState(absSavedState, this);
        } else {
            object = null;
        }
        this.totalScrollRange = n4;
        this.downPreScrollRange = n4;
        this.downScrollRange = n4;
        if (object != null) {
            AppBarLayout$Behavior appBarLayout$Behavior = this.behavior;
            n3 = 0;
            absSavedState = null;
            appBarLayout$Behavior.restoreScrollState((AppBarLayout$BaseBehavior$SavedState)object, false);
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return this.getBackground() instanceof MaterialShapeDrawable;
    }

    private void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, ColorStateList object, MaterialShapeDrawable materialShapeDrawable, Integer object2, ValueAnimator object3) {
        object3 = (Float)object3.getAnimatedValue();
        float f5 = ((Float)object3).floatValue();
        int n3 = colorStateList.getDefaultColor();
        int n4 = object.getDefaultColor();
        n3 = MaterialColors.layer(n3, n4, f5);
        object = ColorStateList.valueOf((int)n3);
        materialShapeDrawable.setFillColor((ColorStateList)object);
        object = this.statusBarForeground;
        if (object != null && (object = this.statusBarForegroundOriginalColor) != null && (n4 = (int)(((Integer)object).equals(object2) ? 1 : 0)) != 0) {
            object = this.statusBarForeground;
            object.setTint(n3);
        }
        if ((n4 = (int)((object = this.liftOnScrollListeners).isEmpty() ? 1 : 0)) == 0) {
            boolean bl2;
            object = this.liftOnScrollListeners.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (AppBarLayout$LiftOnScrollListener)object.next();
                object3 = materialShapeDrawable.getFillColor();
                if (object3 == null) continue;
                f5 = 0.0f;
                object3 = null;
                object2.onUpdate(0.0f, n3);
            }
        }
    }

    private /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator object) {
        object = (Float)object.getAnimatedValue();
        float f5 = ((Float)object).floatValue();
        materialShapeDrawable.setElevation(f5);
        Object object2 = this.statusBarForeground;
        boolean bl2 = object2 instanceof MaterialShapeDrawable;
        if (bl2) {
            object2 = (MaterialShapeDrawable)object2;
            ((MaterialShapeDrawable)object2).setElevation(f5);
        }
        object2 = this.liftOnScrollListeners.iterator();
        while (bl2 = object2.hasNext()) {
            AppBarLayout$LiftOnScrollListener appBarLayout$LiftOnScrollListener = (AppBarLayout$LiftOnScrollListener)object2.next();
            int n3 = materialShapeDrawable.getResolvedTintColor();
            appBarLayout$LiftOnScrollListener.onUpdate(f5, n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void setExpanded(boolean n3, boolean bl2, boolean bl3) {
        void var3_6;
        void var2_5;
        n3 = n3 != 0 ? 1 : 2;
        int n4 = 0;
        if (bl2) {
            int n7 = 4;
        } else {
            boolean bl4 = false;
        }
        n3 |= var2_5;
        if (var3_6 != false) {
            n4 = 8;
        }
        this.pendingAction = n3 |= n4;
        this.requestLayout();
    }

    private boolean setLiftableState(boolean bl2) {
        boolean bl3 = this.liftable;
        if (bl3 != bl2) {
            this.liftable = bl2;
            this.refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean shouldDrawStatusBarForeground() {
        boolean bl2;
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != null && (bl2 = this.getTopInset()) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    private boolean shouldOffsetFirstChild() {
        int n3;
        View view;
        int n4;
        int n7 = this.getChildCount();
        boolean bl2 = false;
        if (n7 > 0 && (n4 = (view = this.getChildAt(0)).getVisibility()) != (n3 = 8)) {
            n7 = (int)(view.getFitsSystemWindows() ? 1 : 0);
            if (n7 == 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private void startLiftOnScrollColorAnimation(float f5, float f6) {
        ValueAnimator valueAnimator;
        Object object = this.liftOnScrollColorAnimator;
        if (object != null) {
            object.cancel();
        }
        int n3 = 2;
        object = new float[n3];
        object[0] = (ValueAnimator)f5;
        int n4 = 1;
        f5 = Float.MIN_VALUE;
        object[n4] = (ValueAnimator)f6;
        this.liftOnScrollColorAnimator = valueAnimator = ValueAnimator.ofFloat((float[])object);
        long l2 = this.liftOnScrollColorDuration;
        valueAnimator.setDuration(l2);
        valueAnimator = this.liftOnScrollColorAnimator;
        TimeInterpolator timeInterpolator = this.liftOnScrollColorInterpolator;
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator = this.liftOnScrollColorUpdateListener;
        if (valueAnimator != null) {
            timeInterpolator = this.liftOnScrollColorAnimator;
            timeInterpolator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)valueAnimator);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        boolean bl2 = this.shouldDrawStatusBarForeground() ^ true;
        this.setWillNotDraw(bl2);
    }

    public void addLiftOnScrollListener(AppBarLayout$LiftOnScrollListener appBarLayout$LiftOnScrollListener) {
        this.liftOnScrollListeners.add(appBarLayout$LiftOnScrollListener);
    }

    public void addOnOffsetChangedListener(AppBarLayout$BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener) {
        boolean bl2;
        List<AppBarLayout$BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null) {
            this.listeners = list = new List<AppBarLayout$BaseOnOffsetChangedListener>();
        }
        if (appBarLayout$BaseOnOffsetChangedListener != null && !(bl2 = (list = this.listeners).contains(appBarLayout$BaseOnOffsetChangedListener))) {
            list = this.listeners;
            list.add(appBarLayout$BaseOnOffsetChangedListener);
        }
    }

    public void addOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener appBarLayout$OnOffsetChangedListener) {
        this.addOnOffsetChangedListener((AppBarLayout$BaseOnOffsetChangedListener)appBarLayout$OnOffsetChangedListener);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AppBarLayout$LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int n3 = this.shouldDrawStatusBarForeground();
        if (n3 != 0) {
            n3 = canvas.save();
            int n4 = -this.currentOffset;
            float f5 = n4;
            canvas.translate(0.0f, f5);
            Drawable drawable2 = this.statusBarForeground;
            drawable2.draw(canvas);
            canvas.restoreToCount(n3);
        }
    }

    public void drawableStateChanged() {
        boolean bl2;
        boolean bl3;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != null && (bl3 = drawable2.isStateful()) && (bl2 = drawable2.setState(nArray))) {
            this.invalidateDrawable(drawable2);
        }
    }

    public AppBarLayout$LayoutParams generateDefaultLayoutParams() {
        AppBarLayout$LayoutParams appBarLayout$LayoutParams = new AppBarLayout$LayoutParams(-1, -2);
        return appBarLayout$LayoutParams;
    }

    public AppBarLayout$LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        AppBarLayout$LayoutParams appBarLayout$LayoutParams = new AppBarLayout$LayoutParams(context, attributeSet);
        return appBarLayout$LayoutParams;
    }

    public AppBarLayout$LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2 = layoutParams instanceof LinearLayout.LayoutParams;
        if (bl2) {
            layoutParams = (LinearLayout.LayoutParams)layoutParams;
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = new AppBarLayout$LayoutParams((LinearLayout.LayoutParams)layoutParams);
            return appBarLayout$LayoutParams;
        }
        bl2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = new AppBarLayout$LayoutParams((ViewGroup.MarginLayoutParams)layoutParams);
            return appBarLayout$LayoutParams;
        }
        AppBarLayout$LayoutParams appBarLayout$LayoutParams = new AppBarLayout$LayoutParams(layoutParams);
        return appBarLayout$LayoutParams;
    }

    public CoordinatorLayout$Behavior getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior;
        this.behavior = appBarLayout$Behavior = new AppBarLayout$Behavior();
        return appBarLayout$Behavior;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getDownNestedPreScrollRange() {
        var1_1 = 5;
        var2_2 = 8;
        var3_3 = this.downPreScrollRange;
        var4_4 = -1;
        if (var3_3 != var4_4) {
            return var3_3;
        }
        var5_5 = 0;
        for (var3_3 = this.getChildCount() + -1; var3_3 >= 0; var3_3 += var4_4) {
            var6_6 = this.getChildAt(var3_3);
            var7_7 = var6_6.getVisibility();
            if (var7_7 == var2_2) continue;
            var8_8 /* !! */  = (AppBarLayout$LayoutParams)var6_6.getLayoutParams();
            var9_9 = var6_6.getMeasuredHeight();
            var10_10 = var8_8 /* !! */ .scrollFlags;
            var11_11 = var10_10 & 5;
            if (var11_11 == var1_1) {
                var11_11 = var8_8 /* !! */ .topMargin;
                var7_7 = var8_8 /* !! */ .bottomMargin;
                var11_11 += var7_7;
                var7_7 = var10_10 & 8;
                if (var7_7 != 0) {
                    var8_8 /* !! */  = ViewCompat.a;
                    var7_7 = var6_6.getMinimumHeight();
lbl24:
                    // 2 sources

                    while (true) {
                        var7_7 += var11_11;
                        break;
                    }
                } else {
                    var7_7 = var10_10 & 2;
                    if (var7_7 != 0) {
                        var8_8 /* !! */  = ViewCompat.a;
                        var7_7 = var6_6.getMinimumHeight();
                        var7_7 = var9_9 - var7_7;
                        ** continue;
                    }
                    var7_7 = var11_11 + var9_9;
                }
                if (var3_3 == 0) {
                    var12_12 = var6_6.getFitsSystemWindows();
                    if (var12_12 != 0) {
                        var12_12 = this.getTopInset();
                        var7_7 = Math.min(var7_7, var9_9 -= var12_12);
                    }
                }
                var5_5 += var7_7;
                continue;
            }
            if (var5_5 > 0) break;
        }
        this.downPreScrollRange = var1_1 = Math.max(0, var5_5);
        return var1_1;
    }

    public int getDownNestedScrollRange() {
        int n3 = this.downScrollRange;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = this.getChildCount();
        n4 = 0;
        int n7 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n8;
            View view = this.getChildAt(i3);
            int n10 = view.getVisibility();
            if (n10 == (n8 = 8)) continue;
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)view.getLayoutParams();
            n8 = view.getMeasuredHeight();
            int n14 = appBarLayout$LayoutParams.topMargin;
            int n15 = appBarLayout$LayoutParams.bottomMargin;
            n14 = n14 + n15 + n8;
            n10 = appBarLayout$LayoutParams.scrollFlags;
            n8 = n10 & 1;
            if (n8 == 0) break;
            n7 += n14;
            if ((n10 &= 2) == 0) continue;
            n3 = view.getMinimumHeight();
            n7 -= n3;
            break;
        }
        this.downScrollRange = n3 = Math.max(0, n7);
        return n3;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable drawable2 = this.getBackground();
        boolean bl2 = drawable2 instanceof MaterialShapeDrawable;
        drawable2 = bl2 ? (MaterialShapeDrawable)drawable2 : null;
        return drawable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        int n3;
        int n4 = this.getTopInset();
        WeakHashMap weakHashMap = ViewCompat.a;
        int n7 = this.getMinimumHeight();
        if (n7 != 0) {
            return n7 * 2 + n4;
        }
        n7 = this.getChildCount();
        if (n7 >= (n3 = 1)) {
            weakHashMap = this.getChildAt(n7 -= n3);
            n7 = weakHashMap.getMinimumHeight();
        } else {
            n7 = 0;
            weakHashMap = null;
        }
        if (n7 == 0) return this.getHeight() / 3;
        return n7 * 2 + n4;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        int n3;
        f f5 = this.lastInsets;
        if (f5 != null) {
            n3 = f5.d();
        } else {
            n3 = 0;
            f5 = null;
        }
        return n3;
    }

    public final int getTotalScrollRange() {
        int n3 = this.totalScrollRange;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = this.getChildCount();
        n4 = 0;
        int n7 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n8;
            View view = this.getChildAt(i3);
            int n10 = view.getVisibility();
            if (n10 == (n8 = 8)) continue;
            AppBarLayout$LayoutParams appBarLayout$LayoutParams = (AppBarLayout$LayoutParams)view.getLayoutParams();
            n8 = view.getMeasuredHeight();
            int n14 = appBarLayout$LayoutParams.scrollFlags;
            int n15 = n14 & 1;
            if (n15 == 0) break;
            n15 = appBarLayout$LayoutParams.topMargin;
            n8 += n15;
            n10 = appBarLayout$LayoutParams.bottomMargin;
            n8 = n8 + n10 + n7;
            if (i3 == 0) {
                n7 = (int)(view.getFitsSystemWindows() ? 1 : 0);
                if (n7 != 0) {
                    n7 = this.getTopInset();
                    n8 -= n7;
                }
            }
            n7 = n8;
            n10 = n14 & 2;
            if (n10 == 0) continue;
            n3 = view.getMinimumHeight();
            n7 = n8 - n3;
            break;
        }
        this.totalScrollRange = n3 = Math.max(0, n7);
        return n3;
    }

    public int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean hasScrollableChildren() {
        int n3 = this.getTotalScrollRange();
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this);
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray = this.tmpStatesArray;
        if (nArray == null) {
            int n4 = 4;
            this.tmpStatesArray = nArray = new int[n4];
        }
        nArray = this.tmpStatesArray;
        int n7 = nArray.length;
        int[] nArray2 = super.onCreateDrawableState(n3 += n7);
        n7 = (int)(this.liftable ? 1 : 0);
        int n8 = R$attr.state_liftable;
        if (n7 == 0) {
            n8 = -n8;
        }
        int n10 = 0;
        nArray[0] = n8;
        n8 = n7 != 0 && (n8 = (int)(this.lifted ? 1 : 0)) != 0 ? R$attr.state_lifted : -R$attr.state_lifted;
        n10 = 1;
        nArray[n10] = n8;
        n8 = R$attr.state_collapsible;
        if (n7 == 0) {
            n8 = -n8;
        }
        n10 = 2;
        nArray[n10] = n8;
        n7 = n7 != 0 && (n7 = (int)(this.lifted ? 1 : 0)) != 0 ? R$attr.state_collapsed : -R$attr.state_collapsed;
        nArray[3] = n7;
        return View.mergeDrawableStates((int[])nArray2, (int[])nArray);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.clearLiftOnScrollTargetView();
    }

    /*
     * WARNING - void declaration
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        Drawable drawable2;
        View view;
        boolean bl3;
        void var5_9;
        int n10;
        int n14;
        int n15;
        int n16 = 1;
        super.onLayout(bl2, n15, n14, n10, (int)var5_9);
        boolean bl4 = this.getFitsSystemWindows();
        if (bl4 && (bl3 = this.shouldOffsetFirstChild())) {
            int n17 = this.getTopInset();
            for (n15 = this.getChildCount() - n16; n15 >= 0; n15 += -1) {
                view = this.getChildAt(n15);
                ViewCompat.m(n17, view);
            }
        }
        this.invalidateScrollRanges();
        boolean bl5 = false;
        this.haveChildWithInterpolator = false;
        n15 = this.getChildCount();
        view = null;
        for (n14 = 0; n14 < n15; n14 += n16) {
            Interpolator interpolator2 = ((AppBarLayout$LayoutParams)this.getChildAt(n14).getLayoutParams()).getScrollInterpolator();
            if (interpolator2 == null) continue;
            this.haveChildWithInterpolator = n16;
            break;
        }
        if ((drawable2 = this.statusBarForeground) != null) {
            n14 = this.getWidth();
            n10 = this.getTopInset();
            drawable2.setBounds(0, 0, n14, n10);
        }
        if ((n15 = (int)(this.liftableOverride ? 1 : 0)) == 0) {
            n15 = (int)(this.liftOnScroll ? 1 : 0);
            if (n15 == 0 && (n15 = (int)(this.hasCollapsibleChild() ? 1 : 0)) == 0) {
                n16 = 0;
            }
            this.setLiftableState(n16 != 0);
        }
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = View.MeasureSpec.getMode((int)n4);
        int n7 = 0x40000000;
        if (n3 != n7) {
            n7 = (int)(this.getFitsSystemWindows() ? 1 : 0);
            if (n7 != 0 && (n7 = (int)(this.shouldOffsetFirstChild() ? 1 : 0)) != 0) {
                n7 = this.getMeasuredHeight();
                int n8 = -1 << -1;
                if (n3 != n8) {
                    if (n3 == 0) {
                        n3 = this.getTopInset();
                        n7 += n3;
                    }
                } else {
                    n3 = this.getMeasuredHeight();
                    n7 = this.getTopInset() + n3;
                    n3 = 0;
                    n4 = View.MeasureSpec.getSize((int)n4);
                    n7 = PK1.b(n7, 0, n4);
                }
                n3 = this.getMeasuredWidth();
                this.setMeasuredDimension(n3, n7);
            }
        }
        this.invalidateScrollRanges();
    }

    public void onOffsetChanged(int n3) {
        Object object;
        this.currentOffset = n3;
        int n4 = this.willNotDraw();
        if (n4 == 0) {
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
        if ((object = this.listeners) != null) {
            n4 = object.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                AppBarLayout$BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener = (AppBarLayout$BaseOnOffsetChangedListener)this.listeners.get(i3);
                if (appBarLayout$BaseOnOffsetChangedListener == null) continue;
                appBarLayout$BaseOnOffsetChangedListener.onOffsetChanged(this, n3);
            }
        }
    }

    public f onWindowInsetChanged(f f5) {
        Object object = ViewCompat.a;
        boolean bl2 = this.getFitsSystemWindows();
        if (bl2) {
            object = f5;
        } else {
            bl2 = false;
            object = null;
        }
        f f6 = this.lastInsets;
        boolean bl3 = Objects.equals(f6, object);
        if (!bl3) {
            this.lastInsets = object;
            this.updateWillNotDraw();
            this.requestLayout();
        }
        return f5;
    }

    public boolean removeLiftOnScrollListener(AppBarLayout$LiftOnScrollListener appBarLayout$LiftOnScrollListener) {
        return this.liftOnScrollListeners.remove(appBarLayout$LiftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(AppBarLayout$BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener) {
        List list = this.listeners;
        if (list != null && appBarLayout$BaseOnOffsetChangedListener != null) {
            list.remove(appBarLayout$BaseOnOffsetChangedListener);
        }
    }

    public void removeOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener appBarLayout$OnOffsetChangedListener) {
        this.removeOnOffsetChangedListener((AppBarLayout$BaseOnOffsetChangedListener)appBarLayout$OnOffsetChangedListener);
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation((View)this, f5);
    }

    public void setExpanded(boolean bl2) {
        boolean bl3 = this.isLaidOut();
        this.setExpanded(bl2, bl3);
    }

    public void setExpanded(boolean bl2, boolean bl3) {
        this.setExpanded(bl2, bl3, true);
    }

    public void setLiftOnScroll(boolean bl2) {
        this.liftOnScroll = bl2;
    }

    public void setLiftOnScrollTargetView(View view) {
        int n3;
        this.liftOnScrollTargetViewId = n3 = -1;
        if (view == null) {
            this.clearLiftOnScrollTargetView();
        } else {
            WeakReference<View> weakReference;
            this.liftOnScrollTargetView = weakReference = new WeakReference<View>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int n3) {
        this.liftOnScrollTargetViewId = n3;
        this.clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean bl2) {
        this.liftableOverride = true;
        return this.setLiftableState(bl2);
    }

    public void setLiftableOverrideEnabled(boolean bl2) {
        this.liftableOverride = bl2;
    }

    public boolean setLifted(boolean bl2) {
        return this.setLiftedState(bl2, true);
    }

    public boolean setLiftedState(boolean bl2) {
        boolean bl3 = this.liftableOverride ^ true;
        return this.setLiftedState(bl2, bl3);
    }

    public boolean setLiftedState(boolean bl2, boolean bl3) {
        boolean bl4;
        if (bl3 && (bl4 = this.lifted) != bl2) {
            this.lifted = bl2;
            this.refreshDrawableState();
            boolean bl5 = this.isLiftOnScrollCompatibleBackground();
            if (bl5) {
                boolean bl6 = this.hasLiftOnScrollColor;
                float f5 = 0.0f;
                if (bl6) {
                    int n3 = 1065353216;
                    float f6 = 1.0f;
                    float f7 = bl2 ? 0.0f : 1.0f;
                    if (bl2) {
                        f5 = 1.0f;
                    }
                    this.startLiftOnScrollColorAnimation(f7, f5);
                } else {
                    boolean bl7 = this.liftOnScroll;
                    if (bl7) {
                        float f8;
                        if (bl2) {
                            boolean bl8 = false;
                            f8 = 0.0f;
                        } else {
                            f8 = this.appBarElevation;
                        }
                        if (bl2) {
                            f5 = this.appBarElevation;
                        }
                        this.startLiftOnScrollColorAnimation(f8, f5);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void setOrientation(int n3) {
        int n4 = 1;
        if (n3 == n4) {
            super.setOrientation(n3);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        throw illegalArgumentException;
    }

    /*
     * WARNING - void declaration
     */
    public void setStatusBarForeground(Drawable object) {
        Object object2 = this.statusBarForeground;
        if (object2 != object) {
            Drawable drawable2 = null;
            if (object2 != null) {
                object2.setCallback(null);
            }
            if (object != null) {
                drawable2 = object.mutate();
            }
            this.statusBarForeground = drawable2;
            this.statusBarForegroundOriginalColor = object = this.extractStatusBarForegroundColor();
            object = this.statusBarForeground;
            if (object != null) {
                void var5_9;
                boolean bl2 = object.isStateful();
                if (bl2) {
                    object = this.statusBarForeground;
                    object2 = this.getDrawableState();
                    object.setState((int[])object2);
                }
                object = this.statusBarForeground;
                object2 = ViewCompat.a;
                int bl3 = this.getLayoutDirection();
                ut0_0.c((Drawable)object, bl3);
                object = this.statusBarForeground;
                int n3 = this.getVisibility();
                drawable2 = null;
                if (n3 == 0) {
                    boolean bl4 = true;
                } else {
                    boolean bl5 = false;
                    object2 = null;
                }
                object.setVisible((boolean)var5_9, false);
                object = this.statusBarForeground;
                object.setCallback((Drawable.Callback)this);
            }
            this.updateWillNotDraw();
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int n3) {
        ColorDrawable colorDrawable = new ColorDrawable(n3);
        this.setStatusBarForeground((Drawable)colorDrawable);
    }

    public void setStatusBarForegroundResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setStatusBarForeground(drawable2);
    }

    public void setTargetElevation(float f5) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator((View)this, f5);
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
        n3 = n3 == 0 ? 1 : 0;
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != null) {
            drawable2.setVisible(n3 != 0, false);
        }
    }

    public boolean shouldLift(View view) {
        int n3;
        boolean bl2;
        View view2 = this.findLiftOnScrollTargetView(view);
        if (view2 != null) {
            view = view2;
        }
        if (view != null && ((bl2 = view.canScrollVertically(-1)) || (n3 = view.getScrollY()) > 0)) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.statusBarForeground)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

