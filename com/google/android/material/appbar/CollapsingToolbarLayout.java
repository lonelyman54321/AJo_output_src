/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.Region$Op
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.animation.AnimationUtils
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.Toolbar
 */
package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.CollapsingToolbarLayout$2;
import com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams;
import com.google.android.material.appbar.CollapsingToolbarLayout$OffsetUpdateListener;
import com.google.android.material.appbar.CollapsingToolbarLayout$StaticLayoutBuilderConfigurer;
import com.google.android.material.appbar.ViewOffsetHelper;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Objects;

public class CollapsingToolbarLayout
extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = 0;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE;
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;
    f lastInsets;
    private AppBarLayout$OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;
    private ViewGroup toolbar;
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_CollapsingToolbar;
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.collapsingToolbarLayoutStyle;
        this(context, attributeSet, n3);
    }

    public CollapsingToolbarLayout(Context object, AttributeSet object2, int n3) {
        long l2;
        CollapsingTextHelper collapsingTextHelper;
        int n4;
        Object object3;
        int n7;
        int n8 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, object2, n3, n8);
        super(object, object2, n3);
        this.refreshToolbar = n7 = 1;
        this.tmpRect = object3 = new Rect();
        this.scrimVisibleHeightTrigger = n4 = -1;
        this.topInsetApplied = 0;
        this.extraMultilineHeight = 0;
        Context context = this.getContext();
        this.collapsingTextHelper = collapsingTextHelper = new CollapsingTextHelper((View)this);
        object3 = AnimationUtils.DECELERATE_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator((TimeInterpolator)object3);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        super(context);
        this.elevationOverlayProvider = object3;
        int[] nArray = R$styleable.CollapsingToolbarLayout;
        int[] nArray2 = new int[]{};
        object3 = context;
        object2 = ThemeEnforcement.obtainStyledAttributes(context, object2, nArray, n3, n8, nArray2);
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleGravity;
        n3 = object2.getInt(n3, 8388691);
        collapsingTextHelper.setExpandedTextGravity(n3);
        n3 = R$styleable.CollapsingToolbarLayout_collapsedTitleGravity;
        int n10 = 8388627;
        n3 = object2.getInt(n3, n10);
        collapsingTextHelper.setCollapsedTextGravity(n3);
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMargin;
        this.expandedMarginBottom = n3 = object2.getDimensionPixelSize(n3, 0);
        this.expandedMarginEnd = n3;
        this.expandedMarginTop = n3;
        this.expandedMarginStart = n3;
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        n3 = (int)(object2.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
            this.expandedMarginStart = n3 = object2.getDimensionPixelSize(n3, 0);
        }
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
            this.expandedMarginEnd = n3 = object2.getDimensionPixelSize(n3, 0);
        }
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
            this.expandedMarginTop = n3 = object2.getDimensionPixelSize(n3, 0);
        }
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
            this.expandedMarginBottom = n3 = object2.getDimensionPixelSize(n3, 0);
        }
        n3 = R$styleable.CollapsingToolbarLayout_titleEnabled;
        n3 = (int)(object2.getBoolean(n3, n7 != 0) ? 1 : 0);
        this.collapsingTitleEnabled = n3;
        n3 = R$styleable.CollapsingToolbarLayout_title;
        CharSequence charSequence = object2.getText(n3);
        this.setTitle(charSequence);
        n3 = R$style.TextAppearance_Design_CollapsingToolbar_Expanded;
        collapsingTextHelper.setExpandedTextAppearance(n3);
        n3 = androidx.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title;
        collapsingTextHelper.setCollapsedTextAppearance(n3);
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        n3 = (int)(object2.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
            n3 = object2.getResourceId(n3, 0);
            collapsingTextHelper.setExpandedTextAppearance(n3);
        }
        n3 = R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
            n3 = object2.getResourceId(n3, 0);
            collapsingTextHelper.setCollapsedTextAppearance(n3);
        }
        n3 = R$styleable.CollapsingToolbarLayout_titleTextEllipsize;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_titleTextEllipsize;
            n3 = object2.getInt(n3, n4);
            charSequence = this.convertEllipsizeToTruncateAt(n3);
            this.setTitleEllipsize((TextUtils.TruncateAt)charSequence);
        }
        n3 = R$styleable.CollapsingToolbarLayout_expandedTitleTextColor;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_expandedTitleTextColor;
            charSequence = MaterialResources.getColorStateList(context, (TypedArray)object2, n3);
            collapsingTextHelper.setExpandedTextColor((ColorStateList)charSequence);
        }
        n3 = R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
            charSequence = MaterialResources.getColorStateList(context, (TypedArray)object2, n3);
            collapsingTextHelper.setCollapsedTextColor((ColorStateList)charSequence);
        }
        n3 = R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger;
        this.scrimVisibleHeightTrigger = n3 = object2.getDimensionPixelSize(n3, n4);
        n3 = R$styleable.CollapsingToolbarLayout_maxLines;
        if ((n3 = (int)(object2.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.CollapsingToolbarLayout_maxLines;
            n7 = object2.getInt(n3, n7);
            collapsingTextHelper.setMaxLines(n7);
        }
        n7 = R$styleable.CollapsingToolbarLayout_titlePositionInterpolator;
        if ((n7 = (int)(object2.hasValue(n7) ? 1 : 0)) != 0) {
            n7 = R$styleable.CollapsingToolbarLayout_titlePositionInterpolator;
            n7 = object2.getResourceId(n7, 0);
            object = android.view.animation.AnimationUtils.loadInterpolator((Context)context, (int)n7);
            collapsingTextHelper.setPositionInterpolator((TimeInterpolator)object);
        }
        n7 = R$styleable.CollapsingToolbarLayout_scrimAnimationDuration;
        this.scrimAnimationDuration = l2 = (long)object2.getInt(n7, 600);
        n7 = R$attr.motionEasingStandardInterpolator;
        charSequence = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        object = MotionUtils.resolveThemeInterpolator(context, n7, (TimeInterpolator)charSequence);
        this.scrimAnimationFadeInInterpolator = object;
        n7 = R$attr.motionEasingStandardInterpolator;
        charSequence = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        object = MotionUtils.resolveThemeInterpolator(context, n7, (TimeInterpolator)charSequence);
        this.scrimAnimationFadeOutInterpolator = object;
        n7 = R$styleable.CollapsingToolbarLayout_contentScrim;
        object = object2.getDrawable(n7);
        this.setContentScrim((Drawable)object);
        n7 = R$styleable.CollapsingToolbarLayout_statusBarScrim;
        object = object2.getDrawable(n7);
        this.setStatusBarScrim((Drawable)object);
        n7 = R$styleable.CollapsingToolbarLayout_titleCollapseMode;
        n7 = object2.getInt(n7, 0);
        this.setTitleCollapseMode(n7);
        n7 = R$styleable.CollapsingToolbarLayout_toolbarId;
        this.toolbarId = n7 = object2.getResourceId(n7, n4);
        n7 = R$styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop;
        n7 = (int)(object2.getBoolean(n7, false) ? 1 : 0);
        this.forceApplySystemWindowInsetTop = n7;
        n7 = R$styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled;
        n7 = (int)(object2.getBoolean(n7, false) ? 1 : 0);
        this.extraMultilineHeightEnabled = n7;
        object2.recycle();
        this.setWillNotDraw(false);
        super(this);
        object2 = ViewCompat.a;
        ViewCompat$c.o((View)this, (T72)object);
    }

    private void animateScrim(int n3) {
        int n4;
        this.ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            this.scrimAnimator = valueAnimator = new ValueAnimator();
            n4 = this.scrimAlpha;
            Object object = n3 > n4 ? this.scrimAnimationFadeInInterpolator : this.scrimAnimationFadeOutInterpolator;
            valueAnimator.setInterpolator(object);
            valueAnimator = this.scrimAnimator;
            object = new CollapsingToolbarLayout$2(this);
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        } else {
            boolean bl2 = valueAnimator.isRunning();
            if (bl2) {
                valueAnimator = this.scrimAnimator;
                valueAnimator.cancel();
            }
        }
        valueAnimator = this.scrimAnimator;
        long l2 = this.scrimAnimationDuration;
        valueAnimator.setDuration(l2);
        valueAnimator = this.scrimAnimator;
        n4 = this.scrimAlpha;
        int[] nArray = new int[]{n4, n3};
        valueAnimator.setIntValues(nArray);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return TextUtils.TruncateAt.END;
                }
                return TextUtils.TruncateAt.MARQUEE;
            }
            return TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        boolean bl2 = this.isTitleCollapseFadeMode();
        if (bl2) {
            bl2 = false;
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        ViewGroup viewGroup;
        boolean bl2 = this.refreshToolbar;
        if (!bl2) {
            return;
        }
        bl2 = false;
        View view = null;
        this.toolbar = null;
        this.toolbarDirectChild = null;
        int n3 = this.toolbarId;
        int n4 = -1;
        if (n3 != n4) {
            this.toolbar = viewGroup = (ViewGroup)this.findViewById(n3);
            if (viewGroup != null) {
                viewGroup = this.findDirectChild((View)viewGroup);
                this.toolbarDirectChild = viewGroup;
            }
        }
        viewGroup = this.toolbar;
        n4 = 0;
        if (viewGroup == null) {
            n3 = this.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = this.getChildAt(i3);
                boolean bl3 = CollapsingToolbarLayout.isToolbar(view2);
                if (!bl3) continue;
                view = view2;
                view = (ViewGroup)view2;
                break;
            }
            this.toolbar = view;
        }
        this.updateDummyView();
        this.refreshToolbar = false;
    }

    private View findDirectChild(View view) {
        for (ViewParent viewParent = view.getParent(); viewParent != this && viewParent != null; viewParent = viewParent.getParent()) {
            boolean bl2 = viewParent instanceof View;
            if (!bl2) continue;
            view = viewParent;
            view = (View)viewParent;
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = this.getContext();
        int n3 = R$attr.colorSurfaceContainer;
        if ((context = MaterialColors.getColorStateListOrNull(context, n3)) != null) {
            return context.getDefaultColor();
        }
        context = this.getResources();
        n3 = R$dimen.design_appbar_elevation;
        float f5 = context.getDimension(n3);
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(f5);
    }

    private static int getHeightWithMargins(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int n3 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (n3 != 0) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            int n4 = view.getMeasuredHeight();
            n3 = layoutParams.topMargin;
            int n7 = layoutParams.bottomMargin;
            return (n4 += n3) + n7;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence getToolbarTitle(View view) {
        boolean bl2 = view instanceof Toolbar;
        if (bl2) {
            return ((Toolbar)view).getTitle();
        }
        bl2 = view instanceof android.widget.Toolbar;
        if (bl2) {
            return ((android.widget.Toolbar)view).getTitle();
        }
        return null;
    }

    public static ViewOffsetHelper getViewOffsetHelper(View view) {
        int n3 = R$id.view_offset_helper;
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper)view.getTag(n3);
        if (viewOffsetHelper == null) {
            viewOffsetHelper = new ViewOffsetHelper(view);
            int n4 = R$id.view_offset_helper;
            view.setTag(n4, (Object)viewOffsetHelper);
        }
        return viewOffsetHelper;
    }

    private boolean isTitleCollapseFadeMode() {
        int n3 = this.titleCollapseMode;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    private static boolean isToolbar(View view) {
        boolean bl2;
        boolean bl3 = view instanceof Toolbar;
        if (!bl3 && !(bl2 = view instanceof android.widget.Toolbar)) {
            bl2 = false;
            view = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        boolean bl2 = false;
        if (view2 != null && view2 != this) {
            if (view != view2) return bl2;
            return true;
        }
        view2 = this.toolbar;
        if (view != view2) return bl2;
        return true;
    }

    private void updateCollapsedBounds(boolean bl2) {
        int n3;
        int n4;
        int n7;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int n8 = this.getMaxOffsetForPinChild(view);
        Object object = this.dummyView;
        Rect rect = this.tmpRect;
        DescendantOffsetUtils.getDescendantRect((ViewGroup)this, (View)object, rect);
        object = this.toolbar;
        int n10 = object instanceof Toolbar;
        if (n10 != 0) {
            object = (Toolbar)object;
            n10 = ((Toolbar)object).getTitleMarginStart();
            n7 = ((Toolbar)object).getTitleMarginEnd();
            n4 = ((Toolbar)object).getTitleMarginTop();
            n3 = ((Toolbar)object).getTitleMarginBottom();
        } else {
            n10 = Build.VERSION.SDK_INT;
            n7 = 24;
            if (n10 >= n7 && (n10 = object instanceof android.widget.Toolbar) != 0) {
                object = (android.widget.Toolbar)object;
                n10 = mx_1.a((android.widget.Toolbar)object);
                n7 = nx_1.a((android.widget.Toolbar)object);
                n4 = ox_1.a((android.widget.Toolbar)object);
                n3 = px_2.a((android.widget.Toolbar)object);
            } else {
                n10 = 0;
                rect = null;
                n3 = 0;
                object = null;
                n7 = 0;
                n4 = 0;
            }
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        Rect rect2 = this.tmpRect;
        int n14 = rect2.left;
        int n15 = bl2 ? n7 : n10;
        n14 += n15;
        n15 = rect2.top + n8 + n4;
        n4 = rect2.right;
        if (!bl2) {
            n10 = n7;
        }
        int n16 = rect2.bottom + n8 - n3;
        collapsingTextHelper.setCollapsedBounds(n14, n15, n4 -= n10, n16);
    }

    private void updateContentDescriptionFromTitle() {
        CharSequence charSequence = this.getTitle();
        this.setContentDescription(charSequence);
    }

    private void updateContentScrimBounds(Drawable drawable2, int n3, int n4) {
        ViewGroup viewGroup = this.toolbar;
        this.updateContentScrimBounds(drawable2, (View)viewGroup, n3, n4);
    }

    private void updateContentScrimBounds(Drawable drawable2, View view, int n3, int n4) {
        boolean bl2 = this.isTitleCollapseFadeMode();
        if (bl2 && view != null && (bl2 = this.collapsingTitleEnabled)) {
            n4 = view.getBottom();
        }
        drawable2.setBounds(0, 0, n3, n4);
    }

    private void updateDummyView() {
        View view;
        boolean bl2;
        View view2;
        boolean bl3 = this.collapsingTitleEnabled;
        if (!bl3 && (view2 = this.dummyView) != null && (bl2 = (view2 = view2.getParent()) instanceof ViewGroup)) {
            view2 = (ViewGroup)view2;
            view = this.dummyView;
            view2.removeView(view);
        }
        if ((bl3 = this.collapsingTitleEnabled) && (view2 = this.toolbar) != null) {
            view2 = this.dummyView;
            if (view2 == null) {
                view = this.getContext();
                this.dummyView = view2 = new View((Context)view);
            }
            if ((view2 = this.dummyView.getParent()) == null) {
                view2 = this.toolbar;
                view = this.dummyView;
                int n3 = -1;
                view2.addView(view, n3, n3);
            }
        }
    }

    private void updateTextBounds(int n3, int n4, int n7, int n8, boolean bl2) {
        Object object;
        int n10 = this.collapsingTitleEnabled;
        if (n10 != 0 && (object = this.dummyView) != null) {
            n10 = object.isAttachedToWindow();
            boolean bl3 = false;
            int n14 = 1;
            if (n10 != 0 && (n10 = (object = this.dummyView).getVisibility()) == 0) {
                n10 = 1;
            } else {
                n10 = 0;
                object = null;
            }
            this.drawCollapsingTitle = n10;
            if (n10 != 0 || bl2) {
                n10 = this.getLayoutDirection();
                if (n10 == n14) {
                    bl3 = true;
                }
                this.updateCollapsedBounds(bl3);
                object = this.collapsingTextHelper;
                n14 = bl3 ? this.expandedMarginEnd : this.expandedMarginStart;
                Rect rect = this.tmpRect;
                int n15 = rect.top;
                int n16 = this.expandedMarginTop;
                n15 += n16;
                n7 -= n3;
                n3 = bl3 ? this.expandedMarginStart : this.expandedMarginEnd;
                n7 -= n3;
                n8 -= n4;
                n3 = this.expandedMarginBottom;
                ((CollapsingTextHelper)object).setExpandedBounds(n14, n15, n7, n8 -= n3);
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                collapsingTextHelper.recalculate(bl2);
            }
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        boolean bl2;
        Object object = this.toolbar;
        if (object != null && (bl2 = this.collapsingTitleEnabled) && (bl2 = TextUtils.isEmpty((CharSequence)(object = this.collapsingTextHelper.getText())))) {
            object = CollapsingToolbarLayout.getToolbarTitle((View)this.toolbar);
            this.setTitle((CharSequence)object);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CollapsingToolbarLayout$LayoutParams;
    }

    public void draw(Canvas canvas) {
        Drawable drawable2;
        CollapsingTextHelper collapsingTextHelper;
        float f5;
        float f6;
        int n3;
        int n4;
        super.draw(canvas);
        this.ensureToolbar();
        Object object = this.toolbar;
        if (object == null && (object = this.contentScrim) != null && (n4 = this.scrimAlpha) > 0) {
            object = object.mutate();
            n4 = this.scrimAlpha;
            object.setAlpha(n4);
            object = this.contentScrim;
            object.draw(canvas);
        }
        if ((n3 = this.collapsingTitleEnabled) != 0 && (n3 = this.drawCollapsingTitle) != 0) {
            float f7;
            object = this.toolbar;
            if (object != null && (object = this.contentScrim) != null && (n3 = this.scrimAlpha) > 0 && (n3 = (int)(this.isTitleCollapseFadeMode() ? 1 : 0)) != 0 && (n3 = (int)((f7 = (f6 = ((CollapsingTextHelper)(object = this.collapsingTextHelper)).getExpansionFraction()) - (f5 = (collapsingTextHelper = this.collapsingTextHelper).getFadeModeThresholdFraction())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0) {
                n3 = canvas.save();
                collapsingTextHelper = this.contentScrim.getBounds();
                drawable2 = Region.Op.DIFFERENCE;
                canvas.clipRect((Rect)collapsingTextHelper, (Region.Op)drawable2);
                collapsingTextHelper = this.collapsingTextHelper;
                collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(n3);
            } else {
                object = this.collapsingTextHelper;
                ((CollapsingTextHelper)object).draw(canvas);
            }
        }
        if ((object = this.statusBarScrim) != null && (n3 = this.scrimAlpha) > 0) {
            object = this.lastInsets;
            n4 = 0;
            f5 = 0.0f;
            collapsingTextHelper = null;
            if (object != null) {
                n3 = ((f)object).d();
            } else {
                n3 = 0;
                f6 = 0.0f;
                object = null;
            }
            if (n3 > 0) {
                drawable2 = this.statusBarScrim;
                int n7 = -this.currentOffset;
                int n8 = this.getWidth();
                int n10 = this.currentOffset;
                drawable2.setBounds(0, n7, n8, n3 -= n10);
                object = this.statusBarScrim.mutate();
                n4 = this.scrimAlpha;
                object.setAlpha(n4);
                object = this.statusBarScrim;
                object.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l2) {
        int n3;
        Drawable drawable2 = this.contentScrim;
        boolean bl2 = true;
        if (drawable2 != null && (n3 = this.scrimAlpha) > 0 && (n3 = (int)(this.isToolbarChild(view) ? 1 : 0)) != 0) {
            drawable2 = this.contentScrim;
            int n4 = this.getWidth();
            int n7 = this.getHeight();
            this.updateContentScrimBounds(drawable2, view, n4, n7);
            drawable2 = this.contentScrim.mutate();
            n4 = this.scrimAlpha;
            drawable2.setAlpha(n4);
            drawable2 = this.contentScrim;
            drawable2.draw(canvas);
            n3 = 1;
        } else {
            n3 = 0;
            drawable2 = null;
        }
        boolean bl3 = super.drawChild(canvas, view, l2);
        if (!bl3 && n3 == 0) {
            bl2 = false;
        }
        return bl2;
    }

    public void drawableStateChanged() {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != null && (bl4 = drawable2.isStateful())) {
            bl3 = drawable2.setState(nArray);
        } else {
            bl3 = false;
            drawable2 = null;
        }
        Object object = this.contentScrim;
        if (object != null && (bl2 = object.isStateful())) {
            bl4 = object.setState(nArray);
            bl3 |= bl4;
        }
        if ((object = this.collapsingTextHelper) != null) {
            boolean bl5 = ((CollapsingTextHelper)object).setState(nArray);
            bl3 |= bl5;
        }
        if (bl3) {
            this.invalidate();
        }
    }

    public CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams() {
        int n3 = -1;
        CollapsingToolbarLayout$LayoutParams collapsingToolbarLayout$LayoutParams = new CollapsingToolbarLayout$LayoutParams(n3, n3);
        return collapsingToolbarLayout$LayoutParams;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        CollapsingToolbarLayout$LayoutParams collapsingToolbarLayout$LayoutParams = new CollapsingToolbarLayout$LayoutParams(context, attributeSet);
        return collapsingToolbarLayout$LayoutParams;
    }

    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        CollapsingToolbarLayout$LayoutParams collapsingToolbarLayout$LayoutParams = new CollapsingToolbarLayout$LayoutParams(layoutParams);
        return collapsingToolbarLayout$LayoutParams;
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTextHelper.getCollapsedTextSize();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTextHelper.getExpandedTextSize();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public final int getMaxOffsetForPinChild(View view) {
        ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(view);
        CollapsingToolbarLayout$LayoutParams collapsingToolbarLayout$LayoutParams = (CollapsingToolbarLayout$LayoutParams)view.getLayoutParams();
        int n3 = this.getHeight();
        int n4 = viewOffsetHelper.getLayoutTop();
        n3 -= n4;
        int n7 = view.getHeight();
        n3 -= n7;
        n7 = collapsingToolbarLayout$LayoutParams.bottomMargin;
        return n3 - n7;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int n3 = this.scrimVisibleHeightTrigger;
        if (n3 >= 0) {
            int n4 = this.topInsetApplied;
            n3 += n4;
            n4 = this.extraMultilineHeight;
            return n3 + n4;
        }
        f f5 = this.lastInsets;
        if (f5 != null) {
            n3 = f5.d();
        } else {
            n3 = 0;
            f5 = null;
        }
        int n7 = this.getMinimumHeight();
        if (n7 > 0) {
            n7 = n7 * 2 + n3;
            n3 = this.getHeight();
            return Math.min(n7, n3);
        }
        return this.getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    public CharSequence getTitle() {
        CharSequence charSequence;
        boolean bl2 = this.collapsingTitleEnabled;
        if (bl2) {
            charSequence = this.collapsingTextHelper.getText();
        } else {
            bl2 = false;
            charSequence = null;
        }
        return charSequence;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.getParent();
        boolean bl2 = object instanceof AppBarLayout;
        if (bl2) {
            object = (AppBarLayout)object;
            this.disableLiftOnScrollIfNeeded((AppBarLayout)object);
            Object object2 = ViewCompat.a;
            bl2 = object.getFitsSystemWindows();
            this.setFitsSystemWindows(bl2);
            object2 = this.onOffsetChangedListener;
            if (object2 == null) {
                this.onOffsetChangedListener = object2 = new CollapsingToolbarLayout$OffsetUpdateListener(this);
            }
            object2 = this.onOffsetChangedListener;
            ((AppBarLayout)object).addOnOffsetChangedListener((AppBarLayout$OnOffsetChangedListener)object2);
            ViewCompat$b.c((View)this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    public void onDetachedFromWindow() {
        boolean bl2;
        Object object = this.getParent();
        AppBarLayout$OnOffsetChangedListener appBarLayout$OnOffsetChangedListener = this.onOffsetChangedListener;
        if (appBarLayout$OnOffsetChangedListener != null && (bl2 = object instanceof AppBarLayout)) {
            object = (AppBarLayout)object;
            ((AppBarLayout)object).removeOnOffsetChangedListener(appBarLayout$OnOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        int n14;
        Object object;
        int n15;
        super.onLayout(n3 != 0, n4, n7, n8, n10);
        f f5 = this.lastInsets;
        int n16 = 0;
        if (f5 != null) {
            n3 = f5.d();
            n15 = this.getChildCount();
            object = null;
            for (int i3 = 0; i3 < n15; ++i3) {
                View view = this.getChildAt(i3);
                n14 = (int)(view.getFitsSystemWindows() ? 1 : 0);
                if (n14 != 0 || (n14 = view.getTop()) >= n3) continue;
                ViewCompat.m(n3, view);
            }
        }
        n3 = this.getChildCount();
        for (n15 = 0; n15 < n3; ++n15) {
            object = CollapsingToolbarLayout.getViewOffsetHelper(this.getChildAt(n15));
            ((ViewOffsetHelper)object).onViewLayout();
        }
        object = this;
        n14 = n7;
        this.updateTextBounds(n4, n7, n8, n10, false);
        this.updateTitleFromToolbarIfNeeded();
        this.updateScrimVisibility();
        n3 = this.getChildCount();
        while (n16 < n3) {
            ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(this.getChildAt(n16));
            viewOffsetHelper.applyOffsets();
            ++n16;
        }
    }

    public void onMeasure(int n3, int n4) {
        ViewGroup viewGroup;
        CollapsingTextHelper collapsingTextHelper;
        int n7;
        this.ensureToolbar();
        super.onMeasure(n3, n4);
        n4 = View.MeasureSpec.getMode((int)n4);
        f f5 = this.lastInsets;
        if (f5 != null) {
            n7 = f5.d();
        } else {
            n7 = 0;
            f5 = null;
        }
        int n8 = 0x40000000;
        if ((n4 == 0 || (n4 = (int)(this.forceApplySystemWindowInsetTop ? 1 : 0)) != 0) && n7 > 0) {
            this.topInsetApplied = n7;
            n4 = View.MeasureSpec.makeMeasureSpec((int)(this.getMeasuredHeight() + n7), (int)n8);
            super.onMeasure(n3, n4);
        }
        if ((n4 = (int)(this.extraMultilineHeightEnabled ? 1 : 0)) != 0 && (n4 = (collapsingTextHelper = this.collapsingTextHelper).getMaxLines()) > (n7 = 1)) {
            this.updateTitleFromToolbarIfNeeded();
            int n10 = this.getMeasuredWidth();
            int n14 = this.getMeasuredHeight();
            boolean bl2 = true;
            Object object = this;
            this.updateTextBounds(0, 0, n10, n14, bl2);
            collapsingTextHelper = this.collapsingTextHelper;
            n4 = collapsingTextHelper.getExpandedLineCount();
            if (n4 > n7) {
                object = this.collapsingTextHelper;
                float f6 = ((CollapsingTextHelper)object).getExpandedTextFullHeight();
                int n15 = Math.round(f6);
                this.extraMultilineHeight = n4 = (n4 - n7) * n15;
                n4 = this.getMeasuredHeight();
                n7 = this.extraMultilineHeight;
                n4 = View.MeasureSpec.makeMeasureSpec((int)(n4 + n7), (int)n8);
                super.onMeasure(n3, n4);
            }
        }
        if ((viewGroup = this.toolbar) != null) {
            collapsingTextHelper = this.toolbarDirectChild;
            if (collapsingTextHelper != null && collapsingTextHelper != this) {
                n3 = CollapsingToolbarLayout.getHeightWithMargins((View)collapsingTextHelper);
                this.setMinimumHeight(n3);
            } else {
                n3 = CollapsingToolbarLayout.getHeightWithMargins((View)viewGroup);
                this.setMinimumHeight(n3);
            }
        }
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null) {
            this.updateContentScrimBounds(drawable2, n3, n4);
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
            this.requestLayout();
        }
        return f5.a.c();
    }

    public void setCollapsedTitleGravity(int n3) {
        this.collapsingTextHelper.setCollapsedTextGravity(n3);
    }

    public void setCollapsedTitleTextAppearance(int n3) {
        this.collapsingTextHelper.setCollapsedTextAppearance(n3);
    }

    public void setCollapsedTitleTextColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setCollapsedTitleTextColor(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleTextSize(float f5) {
        this.collapsingTextHelper.setCollapsedTextSize(f5);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(Drawable object) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != object) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (object != null) {
                drawable3 = object.mutate();
            }
            this.contentScrim = drawable3;
            if (drawable3 != null) {
                int n3 = this.getWidth();
                int n4 = this.getHeight();
                this.updateContentScrimBounds(drawable3, n3, n4);
                this.contentScrim.setCallback((Drawable.Callback)this);
                object = this.contentScrim;
                n4 = this.scrimAlpha;
                object.setAlpha(n4);
            }
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int n3) {
        ColorDrawable colorDrawable = new ColorDrawable(n3);
        this.setContentScrim((Drawable)colorDrawable);
    }

    public void setContentScrimResource(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setContentScrim(drawable2);
    }

    public void setExpandedTitleColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setExpandedTitleTextColor(colorStateList);
    }

    public void setExpandedTitleGravity(int n3) {
        this.collapsingTextHelper.setExpandedTextGravity(n3);
    }

    public void setExpandedTitleMargin(int n3, int n4, int n7, int n8) {
        this.expandedMarginStart = n3;
        this.expandedMarginTop = n4;
        this.expandedMarginEnd = n7;
        this.expandedMarginBottom = n8;
        this.requestLayout();
    }

    public void setExpandedTitleMarginBottom(int n3) {
        this.expandedMarginBottom = n3;
        this.requestLayout();
    }

    public void setExpandedTitleMarginEnd(int n3) {
        this.expandedMarginEnd = n3;
        this.requestLayout();
    }

    public void setExpandedTitleMarginStart(int n3) {
        this.expandedMarginStart = n3;
        this.requestLayout();
    }

    public void setExpandedTitleMarginTop(int n3) {
        this.expandedMarginTop = n3;
        this.requestLayout();
    }

    public void setExpandedTitleTextAppearance(int n3) {
        this.collapsingTextHelper.setExpandedTextAppearance(n3);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f5) {
        this.collapsingTextHelper.setExpandedTextSize(f5);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean bl2) {
        this.extraMultilineHeightEnabled = bl2;
    }

    public void setForceApplySystemWindowInsetTop(boolean bl2) {
        this.forceApplySystemWindowInsetTop = bl2;
    }

    public void setHyphenationFrequency(int n3) {
        this.collapsingTextHelper.setHyphenationFrequency(n3);
    }

    public void setLineSpacingAdd(float f5) {
        this.collapsingTextHelper.setLineSpacingAdd(f5);
    }

    public void setLineSpacingMultiplier(float f5) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f5);
    }

    public void setMaxLines(int n3) {
        this.collapsingTextHelper.setMaxLines(n3);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean bl2) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(bl2);
    }

    public void setScrimAlpha(int n3) {
        int n4 = this.scrimAlpha;
        if (n3 != n4) {
            Drawable drawable2 = this.contentScrim;
            if (drawable2 != null && (drawable2 = this.toolbar) != null) {
                drawable2.postInvalidateOnAnimation();
            }
            this.scrimAlpha = n3;
            this.postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long l2) {
        this.scrimAnimationDuration = l2;
    }

    public void setScrimVisibleHeightTrigger(int n3) {
        int n4 = this.scrimVisibleHeightTrigger;
        if (n4 != n3) {
            this.scrimVisibleHeightTrigger = n3;
            this.updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean bl2) {
        boolean bl3 = this.isLaidOut();
        bl3 = bl3 && !(bl3 = this.isInEditMode());
        this.setScrimsShown(bl2, bl3);
    }

    public void setScrimsShown(boolean n3, boolean bl2) {
        int n4 = this.scrimsAreShown;
        if (n4 != n3) {
            n4 = 0;
            if (bl2) {
                if (n3) {
                    n4 = 255;
                }
                this.animateScrim(n4);
            } else {
                if (n3) {
                    n4 = 255;
                }
                this.setScrimAlpha(n4);
            }
            this.scrimsAreShown = n3;
        }
    }

    public void setStaticLayoutBuilderConfigurer(CollapsingToolbarLayout$StaticLayoutBuilderConfigurer collapsingToolbarLayout$StaticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(collapsingToolbarLayout$StaticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(Drawable object) {
        Object object2 = this.statusBarScrim;
        if (object2 != object) {
            Drawable drawable2 = null;
            if (object2 != null) {
                object2.setCallback(null);
            }
            if (object != null) {
                drawable2 = object.mutate();
            }
            this.statusBarScrim = drawable2;
            if (drawable2 != null) {
                boolean bl2 = drawable2.isStateful();
                if (bl2) {
                    object = this.statusBarScrim;
                    object2 = this.getDrawableState();
                    object.setState((int[])object2);
                }
                object = this.statusBarScrim;
                object2 = ViewCompat.a;
                int n3 = this.getLayoutDirection();
                ut0_0.c(object, n3);
                object = this.statusBarScrim;
                n3 = this.getVisibility();
                drawable2 = null;
                if (n3 == 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object.setVisible(n3 != 0, false);
                this.statusBarScrim.setCallback((Drawable.Callback)this);
                object = this.statusBarScrim;
                n3 = this.scrimAlpha;
                object.setAlpha(n3);
            }
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int n3) {
        ColorDrawable colorDrawable = new ColorDrawable(n3);
        this.setStatusBarScrim((Drawable)colorDrawable);
    }

    public void setStatusBarScrimResource(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setStatusBarScrim(drawable2);
    }

    public void setTitle(CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        this.updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int n3) {
        Drawable drawable2;
        this.titleCollapseMode = n3;
        n3 = (int)(this.isTitleCollapseFadeMode() ? 1 : 0);
        this.collapsingTextHelper.setFadeModeEnabled(n3 != 0);
        Object object = this.getParent();
        boolean bl2 = object instanceof AppBarLayout;
        if (bl2) {
            object = (AppBarLayout)object;
            this.disableLiftOnScrollIfNeeded((AppBarLayout)object);
        }
        if (n3 != 0 && (drawable2 = this.contentScrim) == null) {
            n3 = this.getDefaultContentScrimColorForTitleCollapseFadeMode();
            this.setContentScrimColor(n3);
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean bl2) {
        boolean bl3 = this.collapsingTitleEnabled;
        if (bl2 != bl3) {
            this.collapsingTitleEnabled = bl2;
            this.updateContentDescriptionFromTitle();
            this.updateDummyView();
            this.requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    public void setVisibility(int n3) {
        int n4;
        super.setVisibility(n3);
        n3 = n3 == 0 ? 1 : 0;
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != null && (n4 = drawable2.isVisible()) != n3) {
            drawable2 = this.statusBarScrim;
            drawable2.setVisible(n3 != 0, false);
        }
        if ((drawable2 = this.contentScrim) != null && (n4 = (int)(drawable2.isVisible() ? 1 : 0)) != n3) {
            drawable2 = this.contentScrim;
            drawable2.setVisible(n3 != 0, false);
        }
    }

    public final void updateScrimVisibility() {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null || (drawable2 = this.statusBarScrim) != null) {
            int n3 = this.getHeight();
            int n4 = this.currentOffset;
            if ((n3 += n4) < (n4 = this.getScrimVisibleHeightTrigger())) {
                n3 = 1;
            } else {
                n3 = 0;
                drawable2 = null;
            }
            this.setScrimsShown(n3 != 0);
        }
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.contentScrim) && drawable2 != (drawable3 = this.statusBarScrim)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

