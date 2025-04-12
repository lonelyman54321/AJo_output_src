/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Paint$Style
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.Menu
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener;
import com.google.android.material.bottomappbar.BottomAppBar$1;
import com.google.android.material.bottomappbar.BottomAppBar$3;
import com.google.android.material.bottomappbar.BottomAppBar$4;
import com.google.android.material.bottomappbar.BottomAppBar$5;
import com.google.android.material.bottomappbar.BottomAppBar$6;
import com.google.android.material.bottomappbar.BottomAppBar$7;
import com.google.android.material.bottomappbar.BottomAppBar$8;
import com.google.android.material.bottomappbar.BottomAppBar$9;
import com.google.android.material.bottomappbar.BottomAppBar$AnimationListener;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar
extends Toolbar
implements CoordinatorLayout$b {
    private static final int DEF_STYLE_RES = 0;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = 0;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    private static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = 0;
    private static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    private static final int NO_FAB_END_MARGIN = 255;
    private static final int NO_MENU_RES_ID;
    private int animatingModeChangeCounter;
    private ArrayList animationListeners;
    private BottomAppBar$Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;
    private int fabAlignmentModeEndMargin;
    private int fabAnchorMode;
    AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    TransformationCallback fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final MaterialShapeDrawable materialShapeDrawable;
    private int menuAlignmentMode;
    private boolean menuAnimatingWithFabAlignmentMode;
    private Animator menuAnimator;
    private Animator modeAnimator;
    private Integer navigationIconTint;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;
    private int pendingMenuResId;
    private final boolean removeEmbeddedFabElevation;
    private int rightInset;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_BottomAppBar;
        FAB_ALIGNMENT_ANIM_DURATION_ATTR = R$attr.motionDurationLong2;
        FAB_ALIGNMENT_ANIM_EASING_ATTR = R$attr.motionEasingEmphasizedInterpolator;
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.bottomAppBarStyle;
        this(context, attributeSet, n3);
    }

    public BottomAppBar(Context object, AttributeSet attributeSet, int n3) {
        float f5;
        int n4;
        int n7 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap((Context)object, attributeSet, n3, n7);
        super((Context)object, attributeSet, n3);
        super();
        this.materialShapeDrawable = object;
        int n8 = 0;
        this.animatingModeChangeCounter = 0;
        this.pendingMenuResId = 0;
        this.menuAnimatingWithFabAlignmentMode = false;
        int n10 = 1;
        this.fabAttached = n10;
        Object object2 = new BottomAppBar$1(this);
        this.fabAnimationListener = object2;
        super(this);
        this.fabTransformationCallback = object2;
        Context context = this.getContext();
        int[] nArray = R$styleable.BottomAppBar;
        int[] nArray2 = new int[]{};
        object2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int n14 = n3;
        int n15 = n7;
        object2 = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n7, nArray2);
        int n16 = R$styleable.BottomAppBar_backgroundTint;
        attributeSet2 = MaterialResources.getColorStateList(context, (TypedArray)object2, n16);
        int n17 = R$styleable.BottomAppBar_navigationIconTint;
        n17 = (int)(object2.hasValue(n17) ? 1 : 0);
        n14 = -1;
        if (n17 != 0) {
            n17 = R$styleable.BottomAppBar_navigationIconTint;
            n17 = object2.getColor(n17, n14);
            this.setNavigationIconTint(n17);
        }
        n17 = R$styleable.BottomAppBar_elevation;
        n17 = object2.getDimensionPixelSize(n17, 0);
        n15 = R$styleable.BottomAppBar_fabCradleMargin;
        n15 = object2.getDimensionPixelOffset(n15, 0);
        float f6 = n15;
        int n18 = R$styleable.BottomAppBar_fabCradleRoundedCornerRadius;
        n18 = object2.getDimensionPixelOffset(n18, 0);
        float f7 = n18;
        int n19 = R$styleable.BottomAppBar_fabCradleVerticalOffset;
        n19 = object2.getDimensionPixelOffset(n19, 0);
        float f8 = n19;
        int n20 = R$styleable.BottomAppBar_fabAlignmentMode;
        this.fabAlignmentMode = n20 = object2.getInt(n20, 0);
        n20 = R$styleable.BottomAppBar_fabAnimationMode;
        this.fabAnimationMode = n20 = object2.getInt(n20, 0);
        n20 = R$styleable.BottomAppBar_fabAnchorMode;
        this.fabAnchorMode = n20 = object2.getInt(n20, n10);
        n20 = R$styleable.BottomAppBar_removeEmbeddedFabElevation;
        n20 = (int)(object2.getBoolean(n20, n10 != 0) ? 1 : 0);
        this.removeEmbeddedFabElevation = n20;
        n20 = R$styleable.BottomAppBar_menuAlignmentMode;
        this.menuAlignmentMode = n20 = object2.getInt(n20, 0);
        n20 = R$styleable.BottomAppBar_hideOnScroll;
        n20 = (int)(object2.getBoolean(n20, false) ? 1 : 0);
        this.hideOnScroll = n20;
        n20 = R$styleable.BottomAppBar_paddingBottomSystemWindowInsets;
        n20 = (int)(object2.getBoolean(n20, false) ? 1 : 0);
        this.paddingBottomSystemWindowInsets = n20;
        n20 = R$styleable.BottomAppBar_paddingLeftSystemWindowInsets;
        n20 = (int)(object2.getBoolean(n20, false) ? 1 : 0);
        this.paddingLeftSystemWindowInsets = n20;
        n20 = R$styleable.BottomAppBar_paddingRightSystemWindowInsets;
        this.paddingRightSystemWindowInsets = n8 = object2.getBoolean(n20, false);
        n8 = R$styleable.BottomAppBar_fabAlignmentModeEndMargin;
        this.fabAlignmentModeEndMargin = n14 = object2.getDimensionPixelOffset(n8, n14);
        n14 = R$styleable.BottomAppBar_addElevationShadow;
        n14 = (int)(object2.getBoolean(n14, n10 != 0) ? 1 : 0);
        object2.recycle();
        object2 = this.getResources();
        n8 = R$dimen.mtrl_bottomappbar_fabOffsetEndMode;
        this.fabOffsetEndMode = n4 = object2.getDimensionPixelOffset(n8);
        super(f6, f7, f8);
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = ShapeAppearanceModel.builder();
        object2 = shapeAppearanceModel$Builder.setTopEdge((EdgeTreatment)object2).build();
        ((MaterialShapeDrawable)object).setShapeAppearanceModel((ShapeAppearanceModel)object2);
        if (n14 != 0) {
            n4 = 2;
            f5 = 2.8E-45f;
            ((MaterialShapeDrawable)object).setShadowCompatibilityMode(n4);
        } else {
            ((MaterialShapeDrawable)object).setShadowCompatibilityMode(n10);
            n4 = Build.VERSION.SDK_INT;
            n14 = 28;
            if (n4 >= n14) {
                uz_0.a(this);
                vz_0.a(this);
            }
        }
        object2 = Paint.Style.FILL;
        ((MaterialShapeDrawable)object).setPaintStyle((Paint.Style)object2);
        ((MaterialShapeDrawable)object).initializeElevationOverlay(context);
        f5 = n17;
        this.setElevation(f5);
        ((MaterialShapeDrawable)object).setTintList((ColorStateList)attributeSet2);
        object2 = ViewCompat.a;
        this.setBackground((Drawable)object);
        object = new BottomAppBar$3(this);
        ViewUtils.doOnApplyWindowInsets((View)this, attributeSet, n3, n7, (ViewUtils$OnApplyWindowInsetsListener)object);
    }

    public static /* synthetic */ void a(View view) {
        view.requestLayout();
    }

    public static /* synthetic */ boolean access$000(BottomAppBar bottomAppBar) {
        return bottomAppBar.menuAnimatingWithFabAlignmentMode;
    }

    public static /* synthetic */ boolean access$002(BottomAppBar bottomAppBar, boolean bl2) {
        bottomAppBar.menuAnimatingWithFabAlignmentMode = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$100(BottomAppBar bottomAppBar) {
        return bottomAppBar.fabAlignmentMode;
    }

    public static /* synthetic */ int access$1000(BottomAppBar bottomAppBar) {
        return bottomAppBar.leftInset;
    }

    public static /* synthetic */ int access$1002(BottomAppBar bottomAppBar, int n3) {
        bottomAppBar.leftInset = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$1100(BottomAppBar bottomAppBar) {
        return bottomAppBar.paddingRightSystemWindowInsets;
    }

    public static /* synthetic */ int access$1200(BottomAppBar bottomAppBar) {
        return bottomAppBar.rightInset;
    }

    public static /* synthetic */ int access$1202(BottomAppBar bottomAppBar, int n3) {
        bottomAppBar.rightInset = n3;
        return n3;
    }

    public static /* synthetic */ void access$1300(BottomAppBar bottomAppBar) {
        bottomAppBar.cancelAnimations();
    }

    public static /* synthetic */ void access$1400(BottomAppBar bottomAppBar) {
        bottomAppBar.setCutoutStateAndTranslateFab();
    }

    public static /* synthetic */ void access$1500(BottomAppBar bottomAppBar) {
        bottomAppBar.setActionMenuViewPosition();
    }

    public static /* synthetic */ void access$1600(BottomAppBar bottomAppBar) {
        bottomAppBar.dispatchAnimationStart();
    }

    public static /* synthetic */ void access$1700(BottomAppBar bottomAppBar) {
        bottomAppBar.dispatchAnimationEnd();
    }

    public static /* synthetic */ Animator access$1802(BottomAppBar bottomAppBar, Animator animator2) {
        bottomAppBar.modeAnimator = animator2;
        return animator2;
    }

    public static /* synthetic */ float access$1900(BottomAppBar bottomAppBar, int n3) {
        return bottomAppBar.getFabTranslationX(n3);
    }

    public static /* synthetic */ boolean access$200(BottomAppBar bottomAppBar) {
        return bottomAppBar.fabAttached;
    }

    public static /* synthetic */ Animator access$2002(BottomAppBar bottomAppBar, Animator animator2) {
        bottomAppBar.menuAnimator = animator2;
        return animator2;
    }

    public static /* synthetic */ int access$2100(BottomAppBar bottomAppBar) {
        return bottomAppBar.pendingMenuResId;
    }

    public static /* synthetic */ void access$2200(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int n3, boolean bl2, boolean bl3) {
        bottomAppBar.translateActionMenuView(actionMenuView, n3, bl2, bl3);
    }

    public static /* synthetic */ FloatingActionButton access$2300(BottomAppBar bottomAppBar) {
        return bottomAppBar.findDependentFab();
    }

    public static /* synthetic */ float access$2400(BottomAppBar bottomAppBar) {
        return bottomAppBar.getFabTranslationX();
    }

    public static /* synthetic */ int access$2800(BottomAppBar bottomAppBar) {
        return bottomAppBar.getBottomInset();
    }

    public static /* synthetic */ int access$2900(BottomAppBar bottomAppBar) {
        return bottomAppBar.getLeftInset();
    }

    public static /* synthetic */ void access$300(BottomAppBar bottomAppBar, int n3, boolean bl2) {
        bottomAppBar.maybeAnimateMenuView(n3, bl2);
    }

    public static /* synthetic */ int access$3000(BottomAppBar bottomAppBar) {
        return bottomAppBar.getRightInset();
    }

    public static /* synthetic */ int access$3100(BottomAppBar bottomAppBar) {
        return bottomAppBar.fabOffsetEndMode;
    }

    public static /* synthetic */ View access$3200(BottomAppBar bottomAppBar) {
        return bottomAppBar.findDependentView();
    }

    public static /* synthetic */ void access$3300(BottomAppBar bottomAppBar, View view) {
        BottomAppBar.updateFabAnchorGravity(bottomAppBar, view);
    }

    public static /* synthetic */ boolean access$3400(BottomAppBar bottomAppBar) {
        return bottomAppBar.removeEmbeddedFabElevation;
    }

    public static /* synthetic */ void access$3500(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        bottomAppBar.addFabAnimationListeners(floatingActionButton);
    }

    public static /* synthetic */ int access$400(BottomAppBar bottomAppBar) {
        return bottomAppBar.fabAnchorMode;
    }

    public static /* synthetic */ MaterialShapeDrawable access$500(BottomAppBar bottomAppBar) {
        return bottomAppBar.materialShapeDrawable;
    }

    public static /* synthetic */ BottomAppBarTopEdgeTreatment access$600(BottomAppBar bottomAppBar) {
        return bottomAppBar.getTopEdgeTreatment();
    }

    public static /* synthetic */ boolean access$700(BottomAppBar bottomAppBar) {
        return bottomAppBar.paddingBottomSystemWindowInsets;
    }

    public static /* synthetic */ int access$802(BottomAppBar bottomAppBar, int n3) {
        bottomAppBar.bottomInset = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$900(BottomAppBar bottomAppBar) {
        return bottomAppBar.paddingLeftSystemWindowInsets;
    }

    private void addFabAnimationListeners(FloatingActionButton floatingActionButton) {
        Object object = this.fabAnimationListener;
        floatingActionButton.addOnHideAnimationListener((Animator.AnimatorListener)object);
        object = new BottomAppBar$9(this);
        floatingActionButton.addOnShowAnimationListener((Animator.AnimatorListener)object);
        object = this.fabTransformationCallback;
        floatingActionButton.addTransformationCallback((TransformationCallback)object);
    }

    private void cancelAnimations() {
        Animator animator2 = this.menuAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
        if ((animator2 = this.modeAnimator) != null) {
            animator2.cancel();
        }
    }

    private void createFabTranslationXAnimation(int n3, List list) {
        FloatingActionButton floatingActionButton = this.findDependentFab();
        float f5 = this.getFabTranslationX(n3);
        float[] fArray = new float[]{f5};
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)floatingActionButton, (String)"translationX", (float[])fArray);
        long l2 = this.getFabAlignmentAnimationDuration();
        objectAnimator.setDuration(l2);
        list.add(objectAnimator);
    }

    /*
     * WARNING - void declaration
     */
    private void createMenuViewTranslationAnimation(int n3, boolean bl2, List list) {
        void var3_4;
        int n4 = 1;
        ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        int n7 = this.getFabAlignmentAnimationDuration();
        float f5 = n7;
        float f6 = 1.0f;
        Object object = new float[n4];
        object[0] = f6;
        String string2 = "alpha";
        object = ObjectAnimator.ofFloat((Object)actionMenuView, (String)string2, (float[])object);
        long l2 = (long)(0.8f * f5);
        object.setDuration(l2);
        float f7 = actionMenuView.getTranslationX();
        int n8 = this.getActionMenuViewTranslationX(actionMenuView, n3, bl2);
        float f8 = n8;
        f7 = Math.abs(f7 - f8);
        float f11 = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
        if (f11 > 0) {
            Object object2 = new float[n4];
            f11 = 0.0f;
            f7 = 0.0f;
            object2[0] = 0.0f;
            object2 = ObjectAnimator.ofFloat((Object)actionMenuView, (String)string2, (float[])object2);
            float f12 = 0.2f;
            long l3 = (long)(f5 *= f12);
            object2.setDuration(l3);
            BottomAppBar$7 bottomAppBar$7 = new BottomAppBar$7(this, actionMenuView, n3, bl2);
            object2.addListener((Animator.AnimatorListener)bottomAppBar$7);
            AnimatorSet animatorSet = new AnimatorSet();
            int n10 = 2;
            Animator[] animatorArray = new Animator[n10];
            animatorArray[0] = (Animator)object2;
            animatorArray[n4] = (Animator)object;
            animatorSet.playSequentially(animatorArray);
            var3_4.add(animatorSet);
        } else {
            float f14 = actionMenuView.getAlpha();
            float f15 = f14 - f6;
            n3 = (int)(f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1));
            if (n3 < 0) {
                var3_4.add(object);
            }
        }
    }

    private void dispatchAnimationEnd() {
        Object object;
        int n3;
        this.animatingModeChangeCounter = n3 = this.animatingModeChangeCounter + -1;
        if (n3 == 0 && (object = this.animationListeners) != null) {
            boolean bl2;
            object = ((ArrayList)object).iterator();
            while (bl2 = object.hasNext()) {
                BottomAppBar$AnimationListener bottomAppBar$AnimationListener = (BottomAppBar$AnimationListener)object.next();
                bottomAppBar$AnimationListener.onAnimationEnd(this);
            }
        }
    }

    private void dispatchAnimationStart() {
        Object object;
        int n3;
        int n4 = this.animatingModeChangeCounter;
        this.animatingModeChangeCounter = n3 = n4 + 1;
        if (n4 == 0 && (object = this.animationListeners) != null) {
            object = ((ArrayList)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                BottomAppBar$AnimationListener bottomAppBar$AnimationListener = (BottomAppBar$AnimationListener)object.next();
                bottomAppBar$AnimationListener.onAnimationStart(this);
            }
        }
    }

    private FloatingActionButton findDependentFab() {
        Object object = this.findDependentView();
        boolean bl2 = object instanceof FloatingActionButton;
        object = bl2 ? (FloatingActionButton)object : null;
        return object;
    }

    private View findDependentView() {
        boolean bl2;
        Object object = this.getParent();
        boolean bl3 = object instanceof CoordinatorLayout;
        if (!bl3) {
            return null;
        }
        object = ((CoordinatorLayout)this.getParent()).getDependents((View)this).iterator();
        while (bl2 = object.hasNext()) {
            View view = (View)object.next();
            boolean bl4 = view instanceof FloatingActionButton;
            if (!bl4 && !(bl4 = view instanceof ExtendedFloatingActionButton)) continue;
            return view;
        }
        return null;
    }

    private ActionMenuView getActionMenuView() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            View view = this.getChildAt(i3);
            boolean bl2 = view instanceof ActionMenuView;
            if (!bl2) continue;
            return (ActionMenuView)view;
        }
        return null;
    }

    private int getBottomInset() {
        return this.bottomInset;
    }

    private int getFabAlignmentAnimationDuration() {
        Context context = this.getContext();
        int n3 = FAB_ALIGNMENT_ANIM_DURATION_ATTR;
        return MotionUtils.resolveThemeDuration(context, n3, 300);
    }

    private float getFabTranslationX() {
        int n3 = this.fabAlignmentMode;
        return this.getFabTranslationX(n3);
    }

    private float getFabTranslationX(int n3) {
        boolean bl2 = ViewUtils.isLayoutRtl((View)this);
        int n4 = 1;
        if (n3 == n4) {
            View view = this.findDependentView();
            int n7 = bl2 ? this.leftInset : this.rightInset;
            int n8 = this.fabAlignmentModeEndMargin;
            int n10 = -1;
            if (n8 != n10 && view != null) {
                n3 = view.getMeasuredWidth() / 2;
                n8 = this.fabAlignmentModeEndMargin;
                n3 = n3 + n8 + n7;
            } else {
                n3 = this.fabOffsetEndMode + n7;
            }
            n7 = this.getMeasuredWidth() / 2 - n3;
            if (bl2) {
                n4 = -1;
            }
            return n7 * n4;
        }
        return 0.0f;
    }

    private float getFabTranslationY() {
        int n3 = this.fabAnchorMode;
        int n4 = 1;
        if (n3 == n4) {
            return -this.getTopEdgeTreatment().getCradleVerticalOffset();
        }
        View view = this.findDependentView();
        if (view != null) {
            n4 = this.getMeasuredHeight();
            int n7 = this.getBottomInset();
            n4 += n7;
            n3 = view.getMeasuredHeight();
            n4 -= n3;
            n3 = -n4 / 2;
        } else {
            n3 = 0;
            view = null;
        }
        return n3;
    }

    private int getLeftInset() {
        return this.leftInset;
    }

    private int getRightInset() {
        return this.rightInset;
    }

    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment)this.materialShapeDrawable.getShapeAppearanceModel().getTopEdge();
    }

    private boolean isFabVisibleOrWillBeShown() {
        boolean bl2;
        FloatingActionButton floatingActionButton = this.findDependentFab();
        if (floatingActionButton != null && (bl2 = floatingActionButton.isOrWillBeShown())) {
            bl2 = true;
        } else {
            bl2 = false;
            floatingActionButton = null;
        }
        return bl2;
    }

    private void maybeAnimateMenuView(int n3, boolean bl2) {
        BottomAppBar$6 bottomAppBar$6;
        AnimatorSet animatorSet;
        Animator animator2 = ViewCompat.a;
        boolean bl3 = this.isLaidOut();
        if (!bl3) {
            this.menuAnimatingWithFabAlignmentMode = false;
            n3 = this.pendingMenuResId;
            this.replaceMenu(n3);
            return;
        }
        animator2 = this.menuAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
        animator2 = new Animator();
        boolean bl4 = this.isFabVisibleOrWillBeShown();
        if (!bl4) {
            n3 = 0;
            animatorSet = null;
            bl2 = false;
            bottomAppBar$6 = null;
        }
        this.createMenuViewTranslationAnimation(n3, bl2, (List)animator2);
        animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator2);
        this.menuAnimator = animatorSet;
        bottomAppBar$6 = new BottomAppBar$6(this);
        animatorSet.addListener((Animator.AnimatorListener)bottomAppBar$6);
        this.menuAnimator.start();
    }

    private void maybeAnimateModeChange(int n3) {
        int n4 = this.fabAlignmentMode;
        if (n4 != n3) {
            Object object = ViewCompat.a;
            n4 = (int)(this.isLaidOut() ? 1 : 0);
            if (n4 != 0) {
                object = this.modeAnimator;
                if (object != null) {
                    object.cancel();
                }
                object = new ArrayList();
                int n7 = this.fabAnimationMode;
                int n8 = 1;
                if (n7 == n8) {
                    this.createFabTranslationXAnimation(n3, (List)object);
                } else {
                    this.createFabDefaultXAnimation(n3, (List)object);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(object);
                object = this.getContext();
                n7 = FAB_ALIGNMENT_ANIM_EASING_ATTR;
                TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
                object = MotionUtils.resolveThemeInterpolator(object, n7, timeInterpolator);
                animatorSet.setInterpolator((TimeInterpolator)object);
                this.modeAnimator = animatorSet;
                object = new BottomAppBar$4(this);
                animatorSet.addListener((Animator.AnimatorListener)object);
                animatorSet = this.modeAnimator;
                animatorSet.start();
            }
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable2) {
        Integer n3;
        if (drawable2 != null && (n3 = this.navigationIconTint) != null) {
            drawable2 = ut0_0.h(drawable2.mutate());
            n3 = this.navigationIconTint;
            int n4 = n3;
            drawable2.setTint(n4);
        }
        return drawable2;
    }

    private void setActionMenuViewPosition() {
        Animator animator2;
        ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView != null && (animator2 = this.menuAnimator) == null) {
            float f5 = 1.0f;
            actionMenuView.setAlpha(f5);
            int n3 = this.isFabVisibleOrWillBeShown();
            if (n3 == 0) {
                n3 = 0;
                f5 = 0.0f;
                animator2 = null;
                this.translateActionMenuView(actionMenuView, 0, false);
            } else {
                n3 = this.fabAlignmentMode;
                boolean bl2 = this.fabAttached;
                this.translateActionMenuView(actionMenuView, n3, bl2);
            }
        }
    }

    private void setCutoutStateAndTranslateFab() {
        int n3;
        Object object = this.getTopEdgeTreatment();
        float f5 = this.getFabTranslationX();
        ((BottomAppBarTopEdgeTreatment)object).setHorizontalOffset(f5);
        object = this.materialShapeDrawable;
        int n4 = this.fabAttached;
        if (n4 != 0 && (n4 = this.isFabVisibleOrWillBeShown()) != 0 && (n4 = this.fabAnchorMode) == (n3 = 1)) {
            n4 = 1065353216;
            f5 = 1.0f;
        } else {
            n4 = 0;
            f5 = 0.0f;
        }
        ((MaterialShapeDrawable)object).setInterpolation(f5);
        object = this.findDependentView();
        if (object != null) {
            f5 = this.getFabTranslationY();
            object.setTranslationY(f5);
            f5 = this.getFabTranslationX();
            object.setTranslationX(f5);
        }
    }

    private void translateActionMenuView(ActionMenuView actionMenuView, int n3, boolean bl2) {
        this.translateActionMenuView(actionMenuView, n3, bl2, false);
    }

    private void translateActionMenuView(ActionMenuView actionMenuView, int n3, boolean bl2, boolean bl3) {
        BottomAppBar$8 bottomAppBar$8 = new BottomAppBar$8(this, actionMenuView, n3, bl2);
        if (bl3) {
            actionMenuView.post(bottomAppBar$8);
        } else {
            bottomAppBar$8.run();
        }
    }

    private static void updateFabAnchorGravity(BottomAppBar bottomAppBar, View object) {
        int n3;
        object = (CoordinatorLayout$e)object.getLayoutParams();
        object.d = n3 = 17;
        int n4 = bottomAppBar.fabAnchorMode;
        int n7 = 1;
        if (n4 == n7) {
            object.d = n3 |= 0x30;
        }
        if (n4 == 0) {
            object.d = n4 = object.d | 0x50;
        }
    }

    public void addAnimationListener(BottomAppBar$AnimationListener bottomAppBar$AnimationListener) {
        ArrayList arrayList = this.animationListeners;
        if (arrayList == null) {
            this.animationListeners = arrayList = new ArrayList();
        }
        this.animationListeners.add(bottomAppBar$AnimationListener);
    }

    public void addOnScrollStateChangedListener(HideBottomViewOnScrollBehavior$OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener) {
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).addOnScrollStateChangedListener(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).clearOnScrollStateChangedListeners();
    }

    public void createFabDefaultXAnimation(int n3, List object) {
        boolean bl2;
        object = this.findDependentFab();
        if (object != null && !(bl2 = ((FloatingActionButton)object).isOrWillBeHidden())) {
            this.dispatchAnimationStart();
            BottomAppBar$5 bottomAppBar$5 = new BottomAppBar$5(this, n3);
            ((FloatingActionButton)object).hide(bottomAppBar$5);
        }
    }

    public int getActionMenuViewTranslationX(ActionMenuView actionMenuView, int n3, boolean bl2) {
        int n4;
        View view;
        int n7 = this.menuAlignmentMode;
        int n8 = 0;
        Resources resources = null;
        int n10 = 1;
        if (!(n7 == n10 || n3 == n10 && bl2)) {
            return 0;
        }
        n3 = (int)(ViewUtils.isLayoutRtl((View)this) ? 1 : 0);
        if (n3 != 0) {
            int n14 = this.getMeasuredWidth();
        } else {
            boolean bl3 = false;
        }
        for (n7 = 0; n7 < (n10 = this.getChildCount()); ++n7) {
            view = this.getChildAt(n7);
            Object object = view.getLayoutParams();
            int n15 = object instanceof Toolbar$LayoutParams;
            if (n15 == 0) continue;
            object = (Toolbar$LayoutParams)view.getLayoutParams();
            n15 = object.a & 0x800007;
            int n16 = 0x800003;
            if (n15 != n16) continue;
            if (n3 != 0) {
                n10 = view.getLeft();
                n4 = Math.min(n4, n10);
                continue;
            }
            n10 = view.getRight();
            n4 = Math.max(n4, n10);
        }
        int n17 = n3 != 0 ? actionMenuView.getRight() : actionMenuView.getLeft();
        n7 = n3 != 0 ? this.rightInset : -this.leftInset;
        view = this.getNavigationIcon();
        if (view == null) {
            resources = this.getResources();
            n10 = R$dimen.m3_bottomappbar_horizontal_padding;
            n8 = resources.getDimensionPixelOffset(n10);
            if (n3 == 0) {
                n8 = n3 = -n8;
            }
        }
        n17 = n17 + n7 + n8;
        return (int)(n4 - n17);
    }

    public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    public BottomAppBar$Behavior getBehavior() {
        BottomAppBar$Behavior bottomAppBar$Behavior = this.behavior;
        if (bottomAppBar$Behavior == null) {
            this.behavior = bottomAppBar$Behavior = new BottomAppBar$Behavior();
        }
        return this.behavior;
    }

    public float getCradleVerticalOffset() {
        return this.getTopEdgeTreatment().getCradleVerticalOffset();
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.fabAlignmentModeEndMargin;
    }

    public int getFabAnchorMode() {
        return this.fabAnchorMode;
    }

    public int getFabAnimationMode() {
        return this.fabAnimationMode;
    }

    public float getFabCradleMargin() {
        return this.getTopEdgeTreatment().getFabCradleMargin();
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.getTopEdgeTreatment().getFabCradleRoundedCornerRadius();
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public int getMenuAlignmentMode() {
        return this.menuAlignmentMode;
    }

    public boolean isScrolledDown() {
        return ((HideBottomViewOnScrollBehavior)this.getBehavior()).isScrolledDown();
    }

    public boolean isScrolledUp() {
        return ((HideBottomViewOnScrollBehavior)this.getBehavior()).isScrolledUp();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        MaterialShapeUtils.setParentAbsoluteElevation((View)this, materialShapeDrawable);
        materialShapeDrawable = this.getParent();
        boolean bl2 = materialShapeDrawable instanceof ViewGroup;
        if (bl2) {
            materialShapeDrawable = (ViewGroup)this.getParent();
            materialShapeDrawable.setClipChildren(false);
        }
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        if (bl2) {
            this.cancelAnimations();
            this.setCutoutStateAndTranslateFab();
            View view = this.findDependentView();
            if (view != null) {
                Object object = ViewCompat.a;
                n3 = (int)(view.isLaidOut() ? 1 : 0);
                if (n3 != 0) {
                    n4 = 0;
                    object = new wz_1(view, 0);
                    view.post((Runnable)object);
                }
            }
        }
        this.setActionMenuViewPosition();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2;
        int n3 = parcelable instanceof BottomAppBar$SavedState;
        if (n3 == 0) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (BottomAppBar$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable2);
        this.fabAlignmentMode = n3 = parcelable.fabAlignmentMode;
        this.fabAttached = bl2 = parcelable.fabAttached;
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Parcelable parcelable = super.onSaveInstanceState();
        BottomAppBar$SavedState bottomAppBar$SavedState = new BottomAppBar$SavedState(parcelable);
        bottomAppBar$SavedState.fabAlignmentMode = n3 = this.fabAlignmentMode;
        n3 = (int)(this.fabAttached ? 1 : 0);
        bottomAppBar$SavedState.fabAttached = n3;
        return bottomAppBar$SavedState;
    }

    public void performHide() {
        this.performHide(true);
    }

    public void performHide(boolean bl2) {
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).slideDown((View)this, bl2);
    }

    public void performShow() {
        this.performShow(true);
    }

    public void performShow(boolean bl2) {
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).slideUp((View)this, bl2);
    }

    public void removeAnimationListener(BottomAppBar$AnimationListener bottomAppBar$AnimationListener) {
        ArrayList arrayList = this.animationListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bottomAppBar$AnimationListener);
    }

    public void removeOnScrollStateChangedListener(HideBottomViewOnScrollBehavior$OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener) {
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).removeOnScrollStateChangedListener(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener);
    }

    public void replaceMenu(int n3) {
        if (n3 != 0) {
            this.pendingMenuResId = 0;
            Menu menu2 = this.getMenu();
            menu2.clear();
            this.inflateMenu(n3);
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.materialShapeDrawable.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f5) {
        float f6 = this.getCradleVerticalOffset();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = this.getTopEdgeTreatment();
            bottomAppBarTopEdgeTreatment.setCradleVerticalOffset(f5);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            materialShapeDrawable.invalidateSelf();
            this.setCutoutStateAndTranslateFab();
        }
    }

    public void setElevation(float f5) {
        this.materialShapeDrawable.setElevation(f5);
        int n3 = this.materialShapeDrawable.getShadowRadius();
        int n4 = this.materialShapeDrawable.getShadowOffsetY();
        ((HideBottomViewOnScrollBehavior)this.getBehavior()).setAdditionalHiddenOffsetY((View)this, n3 -= n4);
    }

    public void setFabAlignmentMode(int n3) {
        this.setFabAlignmentModeAndReplaceMenu(n3, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int n3, int n4) {
        this.pendingMenuResId = n4;
        this.menuAnimatingWithFabAlignmentMode = true;
        n4 = (int)(this.fabAttached ? 1 : 0);
        this.maybeAnimateMenuView(n3, n4 != 0);
        this.maybeAnimateModeChange(n3);
        this.fabAlignmentMode = n3;
    }

    public void setFabAlignmentModeEndMargin(int n3) {
        int n4 = this.fabAlignmentModeEndMargin;
        if (n4 != n3) {
            this.fabAlignmentModeEndMargin = n3;
            this.setCutoutStateAndTranslateFab();
        }
    }

    public void setFabAnchorMode(int n3) {
        this.fabAnchorMode = n3;
        this.setCutoutStateAndTranslateFab();
        Object object = this.findDependentView();
        if (object != null) {
            BottomAppBar.updateFabAnchorGravity(this, (View)object);
            object.requestLayout();
            object = this.materialShapeDrawable;
            ((MaterialShapeDrawable)object).invalidateSelf();
        }
    }

    public void setFabAnimationMode(int n3) {
        this.fabAnimationMode = n3;
    }

    public void setFabCornerSize(float f5) {
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = this.getTopEdgeTreatment();
        float f6 = bottomAppBarTopEdgeTreatment.getFabCornerRadius();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            bottomAppBarTopEdgeTreatment = this.getTopEdgeTreatment();
            bottomAppBarTopEdgeTreatment.setFabCornerSize(f5);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f5) {
        float f6 = this.getFabCradleMargin();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = this.getTopEdgeTreatment();
            bottomAppBarTopEdgeTreatment.setFabCradleMargin(f5);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f5) {
        float f6 = this.getFabCradleRoundedCornerRadius();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = this.getTopEdgeTreatment();
            bottomAppBarTopEdgeTreatment.setFabCradleRoundedCornerRadius(f5);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            materialShapeDrawable.invalidateSelf();
        }
    }

    public boolean setFabDiameter(int n3) {
        float f5 = n3;
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = this.getTopEdgeTreatment();
        float f6 = bottomAppBarTopEdgeTreatment.getFabDiameter();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.getTopEdgeTreatment().setFabDiameter(f5);
            this.materialShapeDrawable.invalidateSelf();
            return true;
        }
        return false;
    }

    public void setHideOnScroll(boolean bl2) {
        this.hideOnScroll = bl2;
    }

    public void setMenuAlignmentMode(int n3) {
        int n4 = this.menuAlignmentMode;
        if (n4 != n3) {
            this.menuAlignmentMode = n3;
            ActionMenuView actionMenuView = this.getActionMenuView();
            if (actionMenuView != null) {
                n4 = this.fabAlignmentMode;
                boolean bl2 = this.isFabVisibleOrWillBeShown();
                this.translateActionMenuView(actionMenuView, n4, bl2);
            }
        }
    }

    public void setNavigationIcon(Drawable drawable2) {
        drawable2 = this.maybeTintNavigationIcon(drawable2);
        super.setNavigationIcon(drawable2);
    }

    public void setNavigationIconTint(int n3) {
        Integer n4;
        this.navigationIconTint = n4 = Integer.valueOf(n3);
        n4 = this.getNavigationIcon();
        if (n4 != null) {
            this.setNavigationIcon((Drawable)n4);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}

