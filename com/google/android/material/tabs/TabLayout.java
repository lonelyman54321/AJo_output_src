/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.database.DataSetObserver
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.HorizontalScrollView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$g;
import androidx.viewpager.widget.ViewPager$h;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.tabs.ElasticTabIndicatorInterpolator;
import com.google.android.material.tabs.FadeTabIndicatorInterpolator;
import com.google.android.material.tabs.TabIndicatorInterpolator;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout$1;
import com.google.android.material.tabs.TabLayout$AdapterChangeListener;
import com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$PagerAdapterObserver;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener;
import com.google.android.material.tabs.TabLayout$TabView;
import com.google.android.material.tabs.TabLayout$ViewPagerOnTabSelectedListener;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;

public class TabLayout
extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES = 0;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = 255;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = 255;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final yw2 tabPool;
    private TabLayout$AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private TabLayout$BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayout$TabLayoutOnPageChangeListener pageChangeListener;
    private Uk2 pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private TabLayout$BaseOnTabSelectedListener selectedListener;
    private final ArrayList selectedListeners;
    private TabLayout$Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    final TabLayout$SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final yw2 tabViewPool;
    private final ArrayList tabs;
    boolean unboundedRipple;
    ViewPager viewPager;
    private int viewPagerScrollState;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_TabLayout;
        bw2_1 bw2_12 = new bw2_1(16);
        tabPool = bw2_12;
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.tabStyle;
        this(context, attributeSet, n3);
    }

    /*
     * Loose catch block
     */
    public TabLayout(Context context, AttributeSet attributeSet, int n3) {
        float f5;
        Object object;
        Object object2;
        int n4;
        int n7;
        Context context2;
        int n8;
        block25: {
            Throwable throwable2222222222;
            block26: {
                block24: {
                    TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator;
                    int n10 = DEF_STYLE_RES;
                    context = MaterialThemeOverlay.wrap(context, attributeSet, n3, n10);
                    super(context, attributeSet, n3);
                    this.indicatorPosition = n8 = -1;
                    Object object3 = new ArrayList();
                    this.tabs = object3;
                    this.selectedTabTextAppearance = n8;
                    this.tabSelectedIndicatorColor = 0;
                    this.tabMaxWidth = -1 >>> 1;
                    this.tabIndicatorHeight = n8;
                    object3 = new ArrayList();
                    this.selectedListeners = object3;
                    this.tabViewPool = object3 = new zw2_0(12);
                    context2 = this.getContext();
                    this.setHorizontalScrollBarEnabled(false);
                    this.slidingTabIndicator = tabLayout$SlidingTabIndicator = new TabLayout$SlidingTabIndicator(this, context2);
                    n7 = -2;
                    float f6 = 0.0f / 0.0f;
                    object3 = new FrameLayout.LayoutParams(n7, n8);
                    super.addView((View)tabLayout$SlidingTabIndicator, 0, (ViewGroup.LayoutParams)object3);
                    Object object4 = R$styleable.TabLayout;
                    n4 = R$styleable.TabLayout_tabTextAppearance;
                    int[] nArray = new int[]{n4};
                    object3 = context2;
                    object2 = attributeSet;
                    int n14 = n3;
                    attributeSet = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, object4, n3, n10, nArray);
                    object = DrawableUtils.getColorStateListOrNull(this.getBackground());
                    if (object != null) {
                        object3 = new MaterialShapeDrawable();
                        ((MaterialShapeDrawable)object3).setFillColor((ColorStateList)object);
                        ((MaterialShapeDrawable)object3).initializeElevationOverlay(context2);
                        object = ViewCompat.a;
                        float f7 = ViewCompat$c.e((View)this);
                        ((MaterialShapeDrawable)object3).setElevation(f7);
                        this.setBackground((Drawable)object3);
                    }
                    n3 = R$styleable.TabLayout_tabIndicator;
                    object = MaterialResources.getDrawable(context2, (TypedArray)attributeSet, n3);
                    this.setSelectedTabIndicator((Drawable)object);
                    n3 = R$styleable.TabLayout_tabIndicatorColor;
                    n3 = attributeSet.getColor(n3, 0);
                    this.setSelectedTabIndicatorColor(n3);
                    n3 = R$styleable.TabLayout_tabIndicatorHeight;
                    n3 = attributeSet.getDimensionPixelSize(n3, n8);
                    tabLayout$SlidingTabIndicator.setSelectedIndicatorHeight(n3);
                    n3 = R$styleable.TabLayout_tabIndicatorGravity;
                    n3 = attributeSet.getInt(n3, 0);
                    this.setSelectedTabIndicatorGravity(n3);
                    n3 = R$styleable.TabLayout_tabIndicatorAnimationMode;
                    n3 = attributeSet.getInt(n3, 0);
                    this.setTabIndicatorAnimationMode(n3);
                    n3 = R$styleable.TabLayout_tabIndicatorFullWidth;
                    n4 = 1;
                    n3 = (int)(attributeSet.getBoolean(n3, n4 != 0) ? 1 : 0);
                    this.setTabIndicatorFullWidth(n3 != 0);
                    n3 = R$styleable.TabLayout_tabPadding;
                    this.tabPaddingBottom = n3 = attributeSet.getDimensionPixelSize(n3, 0);
                    this.tabPaddingEnd = n3;
                    this.tabPaddingTop = n3;
                    this.tabPaddingStart = n3;
                    n7 = R$styleable.TabLayout_tabPaddingStart;
                    this.tabPaddingStart = n3 = attributeSet.getDimensionPixelSize(n7, n3);
                    n3 = R$styleable.TabLayout_tabPaddingTop;
                    n7 = this.tabPaddingTop;
                    this.tabPaddingTop = n3 = attributeSet.getDimensionPixelSize(n3, n7);
                    n3 = R$styleable.TabLayout_tabPaddingEnd;
                    n7 = this.tabPaddingEnd;
                    this.tabPaddingEnd = n3 = attributeSet.getDimensionPixelSize(n3, n7);
                    n3 = R$styleable.TabLayout_tabPaddingBottom;
                    n7 = this.tabPaddingBottom;
                    this.tabPaddingBottom = n3 = attributeSet.getDimensionPixelSize(n3, n7);
                    n3 = (int)(ThemeEnforcement.isMaterial3Theme(context2) ? 1 : 0);
                    this.defaultTabTextAppearance = n3 != 0 ? (n3 = R$attr.textAppearanceTitleSmall) : (n3 = R$attr.textAppearanceButton);
                    n3 = R$styleable.TabLayout_tabTextAppearance;
                    n7 = R$style.TextAppearance_Design_Tab;
                    this.tabTextAppearance = n3 = attributeSet.getResourceId(n3, n7);
                    object2 = androidx.appcompat.R$styleable.TextAppearance;
                    object2 = context2.obtainStyledAttributes(n3, (int[])object2);
                    int n15 = androidx.appcompat.R$styleable.TextAppearance_android_textSize;
                    n15 = object2.getDimensionPixelSize(n15, 0);
                    float f8 = n15;
                    this.tabTextSize = f8;
                    n15 = androidx.appcompat.R$styleable.TextAppearance_android_textColor;
                    object4 = MaterialResources.getColorStateList(context2, (TypedArray)object2, n15);
                    this.tabTextColors = (ColorStateList)object4;
                    n7 = R$styleable.TabLayout_tabSelectedTextAppearance;
                    n7 = (int)(attributeSet.hasValue(n7) ? 1 : 0);
                    if (n7 != 0) {
                        n7 = R$styleable.TabLayout_tabSelectedTextAppearance;
                        this.selectedTabTextAppearance = n3 = attributeSet.getResourceId(n7, n3);
                    }
                    if ((n3 = this.selectedTabTextAppearance) == n8) break block25;
                    object2 = androidx.appcompat.R$styleable.TextAppearance;
                    object = context2.obtainStyledAttributes(n3, (int[])object2);
                    try {
                        n7 = androidx.appcompat.R$styleable.TextAppearance_android_textSize;
                    }
                    catch (Throwable throwable2222222222) {}
                    f8 = this.tabTextSize;
                    n15 = (int)f8;
                    n7 = object.getDimensionPixelSize(n7, n15);
                    f6 = n7;
                    this.selectedTabTextSize = f6;
                    n7 = androidx.appcompat.R$styleable.TextAppearance_android_textColor;
                    object2 = MaterialResources.getColorStateList(context2, (TypedArray)object, n7);
                    if (object2 == null) break block24;
                    object4 = this.tabTextColors;
                    n15 = object4.getDefaultColor();
                    n14 = 0x10100A1;
                    int[] nArray2 = new int[]{n14};
                    n10 = object2.getDefaultColor();
                    n7 = object2.getColorForState(nArray2, n10);
                    object2 = TabLayout.createColorStateList(n15, n7);
                    this.tabTextColors = object2;
                    break block26;
                }
                object.recycle();
                break block25;
            }
            object.recycle();
            throw throwable2222222222;
        }
        n3 = R$styleable.TabLayout_tabTextColor;
        if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.TabLayout_tabTextColor;
            this.tabTextColors = object = MaterialResources.getColorStateList(context2, (TypedArray)attributeSet, n3);
        }
        n3 = R$styleable.TabLayout_tabSelectedTextColor;
        if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.TabLayout_tabSelectedTextColor;
            n3 = attributeSet.getColor(n3, 0);
            object2 = this.tabTextColors;
            n7 = object2.getDefaultColor();
            this.tabTextColors = object = TabLayout.createColorStateList(n7, n3);
        }
        n3 = R$styleable.TabLayout_tabIconTint;
        this.tabIconTint = object = MaterialResources.getColorStateList(context2, (TypedArray)attributeSet, n3);
        n3 = R$styleable.TabLayout_tabIconTintMode;
        object = ViewUtils.parseTintMode(attributeSet.getInt(n3, n8), null);
        this.tabIconTintMode = object;
        n3 = R$styleable.TabLayout_tabRippleColor;
        this.tabRippleColorStateList = object = MaterialResources.getColorStateList(context2, (TypedArray)attributeSet, n3);
        n3 = R$styleable.TabLayout_tabIndicatorAnimationDuration;
        this.tabIndicatorAnimationDuration = n3 = attributeSet.getInt(n3, 300);
        n3 = R$attr.motionEasingEmphasizedInterpolator;
        object2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        object = MotionUtils.resolveThemeInterpolator(context2, n3, (TimeInterpolator)object2);
        this.tabIndicatorTimeInterpolator = object;
        n3 = R$styleable.TabLayout_tabMinWidth;
        this.requestedTabMinWidth = n3 = attributeSet.getDimensionPixelSize(n3, n8);
        n3 = R$styleable.TabLayout_tabMaxWidth;
        this.requestedTabMaxWidth = n8 = attributeSet.getDimensionPixelSize(n3, n8);
        n8 = R$styleable.TabLayout_tabBackground;
        this.tabBackgroundResId = n8 = attributeSet.getResourceId(n8, 0);
        n8 = R$styleable.TabLayout_tabContentStart;
        this.contentInsetStart = n8 = attributeSet.getDimensionPixelSize(n8, 0);
        n8 = R$styleable.TabLayout_tabMode;
        this.mode = n8 = attributeSet.getInt(n8, n4);
        n8 = R$styleable.TabLayout_tabGravity;
        this.tabGravity = n8 = attributeSet.getInt(n8, 0);
        n8 = R$styleable.TabLayout_tabInlineLabel;
        n8 = (int)(attributeSet.getBoolean(n8, false) ? 1 : 0);
        this.inlineLabel = n8;
        n8 = R$styleable.TabLayout_tabUnboundedRipple;
        n8 = (int)(attributeSet.getBoolean(n8, false) ? 1 : 0);
        this.unboundedRipple = n8;
        attributeSet.recycle();
        context = this.getResources();
        int n16 = R$dimen.design_tab_text_size_2line;
        this.tabTextMultiLineSize = f5 = (float)context.getDimensionPixelSize(n16);
        n16 = R$dimen.design_tab_scrollable_min_width;
        this.scrollableTabMinWidth = n8 = context.getDimensionPixelSize(n16);
        this.applyModeAndGravity();
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            object2.recycle();
        }
    }

    public static /* synthetic */ int access$1100(TabLayout tabLayout) {
        return tabLayout.defaultTabTextAppearance;
    }

    public static /* synthetic */ int access$1200(TabLayout tabLayout) {
        return tabLayout.selectedTabTextAppearance;
    }

    public static /* synthetic */ int access$1300(TabLayout tabLayout) {
        return tabLayout.tabTextAppearance;
    }

    public static /* synthetic */ int access$1600(TabLayout tabLayout) {
        return tabLayout.viewPagerScrollState;
    }

    public static /* synthetic */ TabIndicatorInterpolator access$1700(TabLayout tabLayout) {
        return tabLayout.tabIndicatorInterpolator;
    }

    public static /* synthetic */ TimeInterpolator access$1900(TabLayout tabLayout) {
        return tabLayout.tabIndicatorTimeInterpolator;
    }

    private void addTabFromItemView(TabItem object) {
        int n3;
        TabLayout$Tab tabLayout$Tab = this.newTab();
        CharSequence charSequence = object.text;
        if (charSequence != null) {
            tabLayout$Tab.setText(charSequence);
        }
        if ((charSequence = object.icon) != null) {
            tabLayout$Tab.setIcon((Drawable)charSequence);
        }
        if ((n3 = object.customLayout) != 0) {
            tabLayout$Tab.setCustomView(n3);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(charSequence = object.getContentDescription())) ? 1 : 0)) == 0) {
            object = object.getContentDescription();
            tabLayout$Tab.setContentDescription((CharSequence)object);
        }
        this.addTab(tabLayout$Tab);
    }

    private void addTabView(TabLayout$Tab tabLayout$Tab) {
        TabLayout$TabView tabLayout$TabView = tabLayout$Tab.view;
        tabLayout$TabView.setSelected(false);
        tabLayout$TabView.setActivated(false);
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
        int n3 = tabLayout$Tab.getPosition();
        LinearLayout.LayoutParams layoutParams = this.createLayoutParamsForTabs();
        tabLayout$SlidingTabIndicator.addView((View)tabLayout$TabView, n3, (ViewGroup.LayoutParams)layoutParams);
    }

    private void addViewInternal(View object) {
        boolean bl2 = object instanceof TabItem;
        if (bl2) {
            object = (TabItem)((Object)object);
            this.addTabFromItemView((TabItem)((Object)object));
            return;
        }
        object = new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        throw object;
    }

    private void animateToTab(int n3) {
        int n4 = -1;
        if (n3 == n4) {
            return;
        }
        Object object = this.getWindowToken();
        int n7 = 0;
        if (object != null) {
            object = ViewCompat.a;
            n4 = (int)(this.isLaidOut() ? 1 : 0);
            if (n4 != 0 && (n4 = (int)((object = this.slidingTabIndicator).childrenNeedLayout() ? 1 : 0)) == 0) {
                n4 = this.getScrollX();
                if (n4 != (n7 = this.calculateScrollXForTab(n3, 0.0f))) {
                    this.ensureScrollAnimator();
                    ValueAnimator valueAnimator = this.scrollAnimator;
                    object = new int[]{n4, n7};
                    valueAnimator.setIntValues((int[])object);
                    object = this.scrollAnimator;
                    object.start();
                }
                object = this.slidingTabIndicator;
                n7 = this.tabIndicatorAnimationDuration;
                object.animateIndicatorToPosition(n3, n7);
                return;
            }
        }
        this.setScrollPosition(n3, 0.0f, true);
    }

    private void applyGravityForModeScrollable(int n3) {
        block2: {
            int n4;
            block0: {
                block1: {
                    if (n3 == 0) break block0;
                    n4 = 1;
                    if (n3 == n4) break block1;
                    n4 = 2;
                    if (n3 == n4) break block0;
                    break block2;
                }
                TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
                tabLayout$SlidingTabIndicator.setGravity(n4);
                break block2;
            }
            TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
            n4 = 0x800003;
            tabLayout$SlidingTabIndicator.setGravity(n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void applyModeAndGravity() {
        void var1_6;
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator;
        int bl2 = this.mode;
        int n3 = 2;
        int n4 = 0;
        if (bl2 != 0 && bl2 != n3) {
            boolean bl3 = false;
            tabLayout$SlidingTabIndicator = null;
        } else {
            int n7 = this.contentInsetStart;
            int n8 = this.tabPaddingStart;
            int n14 = n7 - n8;
            n14 = Math.max(0, n14);
        }
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator2 = this.slidingTabIndicator;
        tabLayout$SlidingTabIndicator2.setPaddingRelative((int)var1_6, 0, 0, 0);
        int n15 = this.mode;
        n4 = 1;
        if (n15 != 0) {
            if (n15 == n4 || n15 == n3) {
                tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
                tabLayout$SlidingTabIndicator.setGravity(n4);
            }
        } else {
            int n16 = this.tabGravity;
            this.applyGravityForModeScrollable(n16);
        }
        this.updateTabViews(n4 != 0);
    }

    private int calculateScrollXForTab(int n3, float f5) {
        float f6;
        View view;
        int n4 = this.mode;
        int n7 = 0;
        float f7 = 0.0f;
        int n8 = 2;
        if (n4 != 0 && n4 != n8) {
            return 0;
        }
        View view2 = this.slidingTabIndicator.getChildAt(n3);
        if (view2 == null) {
            return 0;
        }
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
        int n10 = tabLayout$SlidingTabIndicator.getChildCount();
        if (++n3 < n10) {
            tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
            view = tabLayout$SlidingTabIndicator.getChildAt(n3);
        } else {
            n3 = 0;
            f6 = 0.0f;
            view = null;
        }
        n10 = view2.getWidth();
        if (view != null) {
            n7 = view.getWidth();
        }
        n3 = view2.getLeft();
        n4 = n10 / 2 + n3;
        n3 = this.getWidth() / n8;
        n4 -= n3;
        f6 = n10 += n7;
        n7 = 0x3F000000;
        f7 = 0.5f;
        f6 = f6 * f7 * f5;
        n3 = (int)f6;
        int n14 = this.getLayoutDirection();
        n4 = n14 == 0 ? (n4 += n3) : (n4 -= n3);
        return n4;
    }

    private void configureTab(TabLayout$Tab object, int n3) {
        ((TabLayout$Tab)object).setPosition(n3);
        ArrayList arrayList = this.tabs;
        arrayList.add(n3, object);
        object = this.tabs;
        int n4 = ((ArrayList)object).size();
        ++n3;
        int n7 = -1;
        while (n3 < n4) {
            int n8;
            TabLayout$Tab tabLayout$Tab = (TabLayout$Tab)this.tabs.get(n3);
            int n10 = tabLayout$Tab.getPosition();
            if (n10 == (n8 = this.indicatorPosition)) {
                n7 = n3;
            }
            tabLayout$Tab = (TabLayout$Tab)this.tabs.get(n3);
            tabLayout$Tab.setPosition(n3);
            ++n3;
        }
        this.indicatorPosition = n7;
    }

    private static ColorStateList createColorStateList(int n3, int n4) {
        int n7 = 2;
        int[][] nArrayArray = new int[n7][];
        int[] nArray = new int[n7];
        int[] nArray2 = HorizontalScrollView.SELECTED_STATE_SET;
        nArrayArray[0] = nArray2;
        nArray[0] = n4;
        int[] nArray3 = HorizontalScrollView.EMPTY_STATE_SET;
        int n8 = 1;
        nArrayArray[n8] = nArray3;
        nArray[n8] = n3;
        ColorStateList colorStateList = new ColorStateList((int[][])nArrayArray, nArray);
        return colorStateList;
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private TabLayout$TabView createTabView(TabLayout$Tab object) {
        Object object2;
        Object object3 = this.tabViewPool;
        object3 = object3 != null ? (TabLayout$TabView)((Object)object3.b()) : null;
        if (object3 == null) {
            object2 = this.getContext();
            object3 = new TabLayout$TabView(this, (Context)object2);
        }
        ((TabLayout$TabView)((Object)object3)).setTab((TabLayout$Tab)object);
        object3.setFocusable(true);
        int n3 = this.getTabMinWidth();
        object3.setMinimumWidth(n3);
        object2 = TabLayout$Tab.access$300((TabLayout$Tab)object);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            object = TabLayout$Tab.access$400((TabLayout$Tab)object);
            object3.setContentDescription((CharSequence)object);
        } else {
            object = TabLayout$Tab.access$300((TabLayout$Tab)object);
            object3.setContentDescription((CharSequence)object);
        }
        return object3;
    }

    private void dispatchTabReselected(TabLayout$Tab tabLayout$Tab) {
        ArrayList arrayList = this.selectedListeners;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener = (TabLayout$BaseOnTabSelectedListener)this.selectedListeners.get(i3);
            tabLayout$BaseOnTabSelectedListener.onTabReselected(tabLayout$Tab);
        }
    }

    private void dispatchTabSelected(TabLayout$Tab tabLayout$Tab) {
        ArrayList arrayList = this.selectedListeners;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener = (TabLayout$BaseOnTabSelectedListener)this.selectedListeners.get(i3);
            tabLayout$BaseOnTabSelectedListener.onTabSelected(tabLayout$Tab);
        }
    }

    private void dispatchTabUnselected(TabLayout$Tab tabLayout$Tab) {
        ArrayList arrayList = this.selectedListeners;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener = (TabLayout$BaseOnTabSelectedListener)this.selectedListeners.get(i3);
            tabLayout$BaseOnTabSelectedListener.onTabUnselected(tabLayout$Tab);
        }
    }

    private void ensureScrollAnimator() {
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator == null) {
            this.scrollAnimator = valueAnimator = new ValueAnimator();
            Object object = this.tabIndicatorTimeInterpolator;
            valueAnimator.setInterpolator(object);
            valueAnimator = this.scrollAnimator;
            int n3 = this.tabIndicatorAnimationDuration;
            long l2 = n3;
            valueAnimator.setDuration(l2);
            valueAnimator = this.scrollAnimator;
            object = new TabLayout$1(this);
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        }
    }

    private int getDefaultHeight() {
        int n3;
        block1: {
            ArrayList arrayList = this.tabs;
            n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                Drawable drawable2;
                Object object = (TabLayout$Tab)this.tabs.get(i3);
                if (object == null || (drawable2 = ((TabLayout$Tab)object).getIcon()) == null || (bl2 = TextUtils.isEmpty((CharSequence)(object = ((TabLayout$Tab)object).getText())))) continue;
                n3 = (int)(this.inlineLabel ? 1 : 0);
                if (n3 != 0) break;
                n3 = 72;
                break block1;
            }
            n3 = 48;
        }
        return n3;
    }

    private int getTabMinWidth() {
        int n3 = this.requestedTabMinWidth;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = this.mode;
        n3 = n3 != 0 && n3 != (n4 = 2) ? 0 : this.scrollableTabMinWidth;
        return n3;
    }

    private int getTabScrollRange() {
        int n3 = this.slidingTabIndicator.getWidth();
        int n4 = this.getWidth();
        n3 -= n4;
        n4 = this.getPaddingLeft();
        n3 -= n4;
        n4 = this.getPaddingRight();
        return Math.max(0, n3 -= n4);
    }

    private boolean isScrollingEnabled() {
        int n3;
        int n4 = this.getTabMode();
        n4 = n4 != 0 && (n4 = this.getTabMode()) != (n3 = 2) ? 0 : 1;
        return n4 != 0;
    }

    private void removeTabViewAt(int n3) {
        TabLayout$TabView tabLayout$TabView = (TabLayout$TabView)this.slidingTabIndicator.getChildAt(n3);
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
        tabLayout$SlidingTabIndicator.removeViewAt(n3);
        if (tabLayout$TabView != null) {
            tabLayout$TabView.reset();
            yw2 yw22 = this.tabViewPool;
            yw22.a((Object)tabLayout$TabView);
        }
        this.requestLayout();
    }

    private void setSelectedTabView(int n3) {
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
        int n4 = tabLayout$SlidingTabIndicator.getChildCount();
        if (n3 < n4) {
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl2;
                Object object = this.slidingTabIndicator.getChildAt(i3);
                boolean bl3 = true;
                if (i3 == n3 && !(bl2 = object.isSelected()) || i3 != n3 && (bl2 = object.isSelected())) {
                    bl2 = i3 == n3;
                    object.setSelected(bl2);
                    if (i3 != n3) {
                        bl3 = false;
                    }
                    object.setActivated(bl3);
                    bl3 = object instanceof TabLayout$TabView;
                    if (!bl3) continue;
                    object = (TabLayout$TabView)((Object)object);
                    ((TabLayout$TabView)((Object)object)).updateTab();
                    continue;
                }
                bl2 = i3 == n3;
                object.setSelected(bl2);
                if (i3 != n3) {
                    bl3 = false;
                }
                object.setActivated(bl3);
            }
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean bl2, boolean bl3) {
        Object object;
        Object object2 = this.viewPager;
        if (object2 != null) {
            object = this.pageChangeListener;
            if (object != null) {
                object2.removeOnPageChangeListener((ViewPager$h)object);
            }
            if ((object2 = this.adapterChangeListener) != null) {
                object = this.viewPager;
                ((ViewPager)((Object)object)).removeOnAdapterChangeListener((ViewPager$g)object2);
            }
        }
        object2 = this.currentVpSelectedListener;
        object = null;
        if (object2 != null) {
            this.removeOnTabSelectedListener((TabLayout$BaseOnTabSelectedListener)object2);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            object2 = this.pageChangeListener;
            if (object2 == null) {
                this.pageChangeListener = object2 = new TabLayout$TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            object2 = this.pageChangeListener;
            viewPager.addOnPageChangeListener((ViewPager$h)object2);
            this.currentVpSelectedListener = object2 = new TabLayout$ViewPagerOnTabSelectedListener(viewPager);
            this.addOnTabSelectedListener((TabLayout$BaseOnTabSelectedListener)object2);
            object2 = viewPager.getAdapter();
            if (object2 != null) {
                this.setPagerAdapter((Uk2)object2, bl2);
            }
            if ((object2 = this.adapterChangeListener) == null) {
                this.adapterChangeListener = object2 = new TabLayout$AdapterChangeListener(this);
            }
            object2 = this.adapterChangeListener;
            ((TabLayout$AdapterChangeListener)object2).setAutoRefresh(bl2);
            TabLayout$AdapterChangeListener tabLayout$AdapterChangeListener = this.adapterChangeListener;
            viewPager.addOnAdapterChangeListener(tabLayout$AdapterChangeListener);
            int n3 = viewPager.getCurrentItem();
            bl2 = false;
            tabLayout$AdapterChangeListener = null;
            boolean bl4 = true;
            this.setScrollPosition(n3, 0.0f, bl4);
        } else {
            this.viewPager = null;
            boolean bl5 = false;
            viewPager = null;
            this.setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = bl3;
    }

    private void updateAllTabs() {
        ArrayList arrayList = this.tabs;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            TabLayout$Tab tabLayout$Tab = (TabLayout$Tab)this.tabs.get(i3);
            tabLayout$Tab.updateView();
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        int n3 = this.mode;
        int n4 = 1;
        if (n3 == n4 && (n3 = this.tabGravity) == 0) {
            float f5;
            layoutParams.width = 0;
            n3 = 1065353216;
            layoutParams.weight = f5 = 1.0f;
        } else {
            layoutParams.width = -2;
            n3 = 0;
            float f6 = 0.0f;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener) {
        ArrayList arrayList = this.selectedListeners;
        boolean bl2 = arrayList.contains(tabLayout$BaseOnTabSelectedListener);
        if (!bl2) {
            arrayList = this.selectedListeners;
            arrayList.add(tabLayout$BaseOnTabSelectedListener);
        }
    }

    public void addOnTabSelectedListener(TabLayout$OnTabSelectedListener tabLayout$OnTabSelectedListener) {
        this.addOnTabSelectedListener((TabLayout$BaseOnTabSelectedListener)tabLayout$OnTabSelectedListener);
    }

    public void addTab(TabLayout$Tab tabLayout$Tab) {
        boolean bl2 = this.tabs.isEmpty();
        this.addTab(tabLayout$Tab, bl2);
    }

    public void addTab(TabLayout$Tab tabLayout$Tab, int n3) {
        boolean bl2 = this.tabs.isEmpty();
        this.addTab(tabLayout$Tab, n3, bl2);
    }

    public void addTab(TabLayout$Tab object, int n3, boolean bl2) {
        TabLayout tabLayout = ((TabLayout$Tab)object).parent;
        if (tabLayout == this) {
            this.configureTab((TabLayout$Tab)object, n3);
            this.addTabView((TabLayout$Tab)object);
            if (bl2) {
                ((TabLayout$Tab)object).select();
            }
            return;
        }
        object = new IllegalArgumentException("Tab belongs to a different TabLayout.");
        throw object;
    }

    public void addTab(TabLayout$Tab tabLayout$Tab, boolean bl2) {
        int n3 = this.tabs.size();
        this.addTab(tabLayout$Tab, n3, bl2);
    }

    public void addView(View view) {
        this.addViewInternal(view);
    }

    public void addView(View view, int n3) {
        this.addViewInternal(view);
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        this.addViewInternal(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public TabLayout$Tab createTabFromPool() {
        TabLayout$Tab tabLayout$Tab = (TabLayout$Tab)tabPool.b();
        if (tabLayout$Tab == null) {
            tabLayout$Tab = new TabLayout$Tab();
        }
        return tabLayout$Tab;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return this.generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        TabLayout$Tab tabLayout$Tab = this.selectedTab;
        int n3 = tabLayout$Tab != null ? tabLayout$Tab.getPosition() : -1;
        return n3;
    }

    public TabLayout$Tab getTabAt(int n3) {
        TabLayout$Tab tabLayout$Tab;
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.getTabCount())) {
            ArrayList arrayList = this.tabs;
            tabLayout$Tab = (TabLayout$Tab)arrayList.get(n3);
        } else {
            n3 = 0;
            tabLayout$Tab = null;
        }
        return tabLayout$Tab;
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public TabLayout$Tab newTab() {
        int n3;
        TabLayout$TabView tabLayout$TabView;
        TabLayout$Tab tabLayout$Tab = this.createTabFromPool();
        tabLayout$Tab.parent = this;
        tabLayout$Tab.view = tabLayout$TabView = this.createTabView(tabLayout$Tab);
        int n4 = TabLayout$Tab.access$000(tabLayout$Tab);
        if (n4 != (n3 = -1)) {
            tabLayout$TabView = tabLayout$Tab.view;
            n3 = TabLayout$Tab.access$000(tabLayout$Tab);
            tabLayout$TabView.setId(n3);
        }
        return tabLayout$Tab;
    }

    public void onAttachedToWindow() {
        boolean bl2;
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this);
        ViewPager viewPager = this.viewPager;
        if (viewPager == null && (bl2 = (viewPager = this.getParent()) instanceof ViewPager)) {
            bl2 = true;
            this.setupWithViewPager(viewPager, bl2, bl2);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean bl2 = this.setupViewPagerImplicitly;
        if (bl2) {
            this.setupWithViewPager(null);
            bl2 = false;
            this.setupViewPagerImplicitly = false;
        }
    }

    public void onDraw(Canvas canvas) {
        LinearLayout linearLayout;
        int n3;
        for (int i3 = 0; i3 < (n3 = (linearLayout = this.slidingTabIndicator).getChildCount()); ++i3) {
            linearLayout = this.slidingTabIndicator.getChildAt(i3);
            boolean bl2 = linearLayout instanceof TabLayout$TabView;
            if (!bl2) continue;
            linearLayout = (TabLayout$TabView)linearLayout;
            TabLayout$TabView.access$500((TabLayout$TabView)linearLayout, canvas);
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int n3 = this.getTabCount();
        int n4 = 1;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = (AccessibilityNodeInfo.CollectionInfo)C2$e.a((int)n4, (int)n3, (int)n4, (boolean)false).a;
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3 = this.isScrollingEnabled();
        if (bl3 && (bl2 = super.onInterceptTouchEvent(motionEvent))) {
            bl2 = true;
        } else {
            bl2 = false;
            motionEvent = null;
        }
        return bl2;
    }

    public void onMeasure(int n3, int n4) {
        block10: {
            View view;
            int n7;
            int n8;
            int n10;
            Context context;
            block13: {
                block11: {
                    block12: {
                        float f5;
                        View view2;
                        context = this.getContext();
                        n10 = this.getDefaultHeight();
                        float f6 = ViewUtils.dpToPx(context, n10);
                        n8 = Math.round(f6);
                        n10 = View.MeasureSpec.getMode((int)n4);
                        int n14 = -1 << -1;
                        n7 = 0x40000000;
                        int n15 = 1;
                        if (n10 != n14) {
                            if (n10 == 0) {
                                n4 = this.getPaddingTop() + n8;
                                n8 = this.getPaddingBottom() + n4;
                                n4 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n7);
                            }
                        } else {
                            n10 = this.getChildCount();
                            if (n10 == n15 && (n10 = View.MeasureSpec.getSize((int)n4)) >= n8) {
                                view2 = this.getChildAt(0);
                                view2.setMinimumHeight(n8);
                            }
                        }
                        n8 = View.MeasureSpec.getSize((int)n3);
                        n10 = View.MeasureSpec.getMode((int)n3);
                        if (n10 != 0) {
                            n10 = this.requestedTabMaxWidth;
                            if (n10 <= 0) {
                                f6 = n8;
                                view2 = this.getContext();
                                n14 = 56;
                                f5 = ViewUtils.dpToPx((Context)view2, n14);
                                n10 = (int)(f6 -= f5);
                            }
                            this.tabMaxWidth = n10;
                        }
                        super.onMeasure(n3, n4);
                        n3 = this.getChildCount();
                        if (n3 != n15) break block10;
                        view = this.getChildAt(0);
                        n8 = this.mode;
                        if (n8 == 0) break block11;
                        if (n8 == n15) break block12;
                        n10 = 2;
                        f5 = 2.8E-45f;
                        if (n8 == n10) break block11;
                        break block10;
                    }
                    n8 = view.getMeasuredWidth();
                    if (n8 == (n10 = this.getMeasuredWidth())) break block10;
                    break block13;
                }
                if ((n8 = view.getMeasuredWidth()) >= (n10 = this.getMeasuredWidth())) break block10;
            }
            n8 = this.getPaddingTop();
            n10 = this.getPaddingBottom() + n8;
            context = view.getLayoutParams();
            n8 = context.height;
            n4 = ViewGroup.getChildMeasureSpec((int)n4, (int)n10, (int)n8);
            n8 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)n7);
            view.measure(n8, n4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionMasked();
        if (n4 == (n3 = 8) && (n4 = (int)(this.isScrollingEnabled() ? 1 : 0)) == 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void populateFromPagerAdapter() {
        this.removeAllTabs();
        Object object = this.pagerAdapter;
        if (object != null) {
            int n3 = ((Uk2)object).c();
            int n4 = 0;
            ViewPager viewPager = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                TabLayout$Tab tabLayout$Tab = this.newTab();
                CharSequence charSequence = this.pagerAdapter.e(i3);
                tabLayout$Tab = tabLayout$Tab.setText(charSequence);
                this.addTab(tabLayout$Tab, false);
            }
            viewPager = this.viewPager;
            if (viewPager != null && n3 > 0 && (n3 = viewPager.getCurrentItem()) != (n4 = this.getSelectedTabPosition()) && n3 < (n4 = this.getTabCount())) {
                object = this.getTabAt(n3);
                this.selectTab((TabLayout$Tab)object);
            }
        }
    }

    public boolean releaseFromTabPool(TabLayout$Tab tabLayout$Tab) {
        return tabPool.a(tabLayout$Tab);
    }

    public void removeAllTabs() {
        boolean bl2;
        Object object = this.slidingTabIndicator;
        for (int i3 = object.getChildCount() + -1; i3 >= 0; i3 += -1) {
            this.removeTabViewAt(i3);
        }
        object = this.tabs.iterator();
        while (bl2 = object.hasNext()) {
            TabLayout$Tab tabLayout$Tab = (TabLayout$Tab)object.next();
            object.remove();
            tabLayout$Tab.reset();
            this.releaseFromTabPool(tabLayout$Tab);
        }
        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener) {
        this.selectedListeners.remove(tabLayout$BaseOnTabSelectedListener);
    }

    public void removeOnTabSelectedListener(TabLayout$OnTabSelectedListener tabLayout$OnTabSelectedListener) {
        this.removeOnTabSelectedListener((TabLayout$BaseOnTabSelectedListener)tabLayout$OnTabSelectedListener);
    }

    public void removeTab(TabLayout$Tab object) {
        TabLayout tabLayout = ((TabLayout$Tab)object).parent;
        if (tabLayout == this) {
            int n3 = ((TabLayout$Tab)object).getPosition();
            this.removeTabAt(n3);
            return;
        }
        object = new IllegalArgumentException("Tab does not belong to this TabLayout.");
        throw object;
    }

    public void removeTabAt(int n3) {
        int n4;
        Object object = this.selectedTab;
        if (object != null) {
            n4 = ((TabLayout$Tab)object).getPosition();
        } else {
            n4 = 0;
            object = null;
        }
        this.removeTabViewAt(n3);
        Object object2 = (TabLayout$Tab)this.tabs.remove(n3);
        if (object2 != null) {
            ((TabLayout$Tab)object2).reset();
            this.releaseFromTabPool((TabLayout$Tab)object2);
        }
        object2 = this.tabs;
        int n7 = ((ArrayList)object2).size();
        int n8 = -1;
        for (int i3 = n3; i3 < n7; ++i3) {
            int n10;
            TabLayout$Tab tabLayout$Tab = (TabLayout$Tab)this.tabs.get(i3);
            int n14 = tabLayout$Tab.getPosition();
            if (n14 == (n10 = this.indicatorPosition)) {
                n8 = i3;
            }
            tabLayout$Tab = (TabLayout$Tab)this.tabs.get(i3);
            tabLayout$Tab.setPosition(i3);
        }
        this.indicatorPosition = n8;
        if (n4 == n3) {
            TabLayout$Tab tabLayout$Tab;
            object = this.tabs;
            n4 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n4 != 0) {
                n3 = 0;
                tabLayout$Tab = null;
            } else {
                object = this.tabs;
                n3 += -1;
                n3 = Math.max(0, n3);
                tabLayout$Tab = (TabLayout$Tab)((ArrayList)object).get(n3);
            }
            this.selectTab(tabLayout$Tab);
        }
    }

    public void selectTab(TabLayout$Tab tabLayout$Tab) {
        this.selectTab(tabLayout$Tab, true);
    }

    public void selectTab(TabLayout$Tab tabLayout$Tab, boolean n3) {
        TabLayout$Tab tabLayout$Tab2 = this.selectedTab;
        if (tabLayout$Tab2 == tabLayout$Tab) {
            if (tabLayout$Tab2 != null) {
                this.dispatchTabReselected(tabLayout$Tab);
                int n4 = tabLayout$Tab.getPosition();
                this.animateToTab(n4);
            }
        } else {
            TabLayout tabLayout;
            int n7 = -1;
            int n8 = tabLayout$Tab != null ? tabLayout$Tab.getPosition() : -1;
            if (n3 != 0) {
                if ((tabLayout$Tab2 == null || (n3 = tabLayout$Tab2.getPosition()) == n7) && n8 != n7) {
                    n3 = 0;
                    tabLayout = null;
                    boolean bl2 = true;
                    this.setScrollPosition(n8, 0.0f, bl2);
                } else {
                    this.animateToTab(n8);
                }
                if (n8 != n7) {
                    this.setSelectedTabView(n8);
                }
            }
            this.selectedTab = tabLayout$Tab;
            if (tabLayout$Tab2 != null && (tabLayout = tabLayout$Tab2.parent) != null) {
                this.dispatchTabUnselected(tabLayout$Tab2);
            }
            if (tabLayout$Tab != null) {
                this.dispatchTabSelected(tabLayout$Tab);
            }
        }
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation((View)this, f5);
    }

    public void setInlineLabel(boolean n3) {
        int n4 = this.inlineLabel;
        if (n4 != n3) {
            LinearLayout linearLayout;
            this.inlineLabel = n3;
            for (n3 = 0; n3 < (n4 = (linearLayout = this.slidingTabIndicator).getChildCount()); ++n3) {
                linearLayout = this.slidingTabIndicator.getChildAt(n3);
                boolean bl2 = linearLayout instanceof TabLayout$TabView;
                if (!bl2) continue;
                linearLayout = (TabLayout$TabView)linearLayout;
                linearLayout.updateOrientation();
            }
            this.applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int n3) {
        n3 = (int)(this.getResources().getBoolean(n3) ? 1 : 0);
        this.setInlineLabel(n3 != 0);
    }

    public void setOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener) {
        TabLayout$BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener2 = this.selectedListener;
        if (tabLayout$BaseOnTabSelectedListener2 != null) {
            this.removeOnTabSelectedListener(tabLayout$BaseOnTabSelectedListener2);
        }
        this.selectedListener = tabLayout$BaseOnTabSelectedListener;
        if (tabLayout$BaseOnTabSelectedListener != null) {
            this.addOnTabSelectedListener(tabLayout$BaseOnTabSelectedListener);
        }
    }

    public void setOnTabSelectedListener(TabLayout$OnTabSelectedListener tabLayout$OnTabSelectedListener) {
        this.setOnTabSelectedListener((TabLayout$BaseOnTabSelectedListener)tabLayout$OnTabSelectedListener);
    }

    public void setPagerAdapter(Uk2 uk2, boolean bl2) {
        DataSetObserver dataSetObserver;
        Uk2 uk22 = this.pagerAdapter;
        if (uk22 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            uk22 = uk22.a;
            uk22.unregisterObserver(dataSetObserver);
        }
        this.pagerAdapter = uk2;
        if (bl2 && uk2 != null) {
            DataSetObserver dataSetObserver2 = this.pagerAdapterObserver;
            if (dataSetObserver2 == null) {
                this.pagerAdapterObserver = dataSetObserver2 = new TabLayout$PagerAdapterObserver(this);
            }
            dataSetObserver2 = this.pagerAdapterObserver;
            uk2 = uk2.a;
            uk2.registerObserver(dataSetObserver2);
        }
        this.populateFromPagerAdapter();
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int n3, float f5, boolean bl2) {
        this.setScrollPosition(n3, f5, bl2, true);
    }

    public void setScrollPosition(int n3, float f5, boolean bl2, boolean bl3) {
        this.setScrollPosition(n3, f5, bl2, bl3, true);
    }

    public void setScrollPosition(int n3, float f5, boolean bl2, boolean n4, boolean bl3) {
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator;
        int n7;
        float f6 = (float)n3 + f5;
        int n8 = Math.round(f6);
        if (n8 >= 0 && n8 < (n7 = (tabLayout$SlidingTabIndicator = this.slidingTabIndicator).getChildCount())) {
            TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator2;
            if (n4 != 0) {
                tabLayout$SlidingTabIndicator2 = this.slidingTabIndicator;
                tabLayout$SlidingTabIndicator2.setIndicatorPositionFromTabPosition(n3, f5);
            }
            if ((tabLayout$SlidingTabIndicator2 = this.scrollAnimator) != null && (n4 = tabLayout$SlidingTabIndicator2.isRunning()) != 0) {
                tabLayout$SlidingTabIndicator2 = this.scrollAnimator;
                tabLayout$SlidingTabIndicator2.cancel();
            }
            int n10 = this.calculateScrollXForTab(n3, f5);
            n4 = this.getScrollX();
            n7 = this.getSelectedTabPosition();
            int n14 = 1;
            if (n3 < n7 && n10 >= n4 || n3 > (n7 = this.getSelectedTabPosition()) && n10 <= n4 || n3 == (n7 = this.getSelectedTabPosition())) {
                n7 = 1;
            } else {
                n7 = 0;
                tabLayout$SlidingTabIndicator = null;
            }
            int n15 = this.getLayoutDirection();
            if (n15 == n14) {
                n7 = this.getSelectedTabPosition();
                if (n3 < n7 && n10 <= n4 || n3 > (n7 = this.getSelectedTabPosition()) && n10 >= n4 || n3 == (n4 = this.getSelectedTabPosition())) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    tabLayout$SlidingTabIndicator = null;
                }
            }
            if (n7 != 0 || (n4 = this.viewPagerScrollState) == n14 || bl3) {
                if (n3 < 0) {
                    n10 = 0;
                    f5 = 0.0f;
                }
                this.scrollTo(n10, 0);
            }
            if (bl2) {
                this.setSelectedTabView(n8);
            }
        }
    }

    public void setSelectedTabIndicator(int n3) {
        if (n3 != 0) {
            Context context = this.getContext();
            Drawable drawable2 = xn.a(context, n3);
            this.setSelectedTabIndicator(drawable2);
        } else {
            n3 = 0;
            Object var3_4 = null;
            this.setSelectedTabIndicator(null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable2) {
        if (drawable2 == null) {
            drawable2 = new GradientDrawable();
        }
        this.tabSelectedIndicator = drawable2 = ut0_0.h(drawable2).mutate();
        int n3 = this.tabSelectedIndicatorColor;
        DrawableUtils.setTint(drawable2, n3);
        int n4 = this.tabIndicatorHeight;
        n3 = -1;
        if (n4 == n3) {
            drawable2 = this.tabSelectedIndicator;
            n4 = drawable2.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(n4);
    }

    public void setSelectedTabIndicatorColor(int n3) {
        this.tabSelectedIndicatorColor = n3;
        DrawableUtils.setTint(this.tabSelectedIndicator, n3);
        this.updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int n3) {
        int n4 = this.tabIndicatorGravity;
        if (n4 != n3) {
            this.tabIndicatorGravity = n3;
            TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
            tabLayout$SlidingTabIndicator.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int n3) {
        this.tabIndicatorHeight = n3;
        this.slidingTabIndicator.setSelectedIndicatorHeight(n3);
    }

    public void setTabGravity(int n3) {
        int n4 = this.tabGravity;
        if (n4 != n3) {
            this.tabGravity = n3;
            this.applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.tabIconTint;
        if (colorStateList2 != colorStateList) {
            this.tabIconTint = colorStateList;
            this.updateAllTabs();
        }
    }

    public void setTabIconTintResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.getContext(), n3);
        this.setTabIconTint(colorStateList);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTabIndicatorAnimationMode(int n3) {
        this.tabIndicatorAnimationMode = n3;
        if (n3 == 0) {
            TabIndicatorInterpolator tabIndicatorInterpolator;
            this.tabIndicatorInterpolator = tabIndicatorInterpolator = new TabIndicatorInterpolator();
            return;
        }
        int n4 = 1;
        if (n3 == n4) {
            ElasticTabIndicatorInterpolator elasticTabIndicatorInterpolator = new ElasticTabIndicatorInterpolator();
            this.tabIndicatorInterpolator = elasticTabIndicatorInterpolator;
            return;
        }
        n4 = 2;
        if (n3 == n4) {
            FadeTabIndicatorInterpolator fadeTabIndicatorInterpolator = new FadeTabIndicatorInterpolator();
            this.tabIndicatorInterpolator = fadeTabIndicatorInterpolator;
            return;
        }
        String string2 = UX.a(n3, " is not a valid TabIndicatorAnimationMode");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void setTabIndicatorFullWidth(boolean bl2) {
        this.tabIndicatorFullWidth = bl2;
        TabLayout$SlidingTabIndicator.access$100(this.slidingTabIndicator);
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.slidingTabIndicator;
        tabLayout$SlidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int n3) {
        int n4 = this.mode;
        if (n3 != n4) {
            this.mode = n3;
            this.applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        Object object = this.tabRippleColorStateList;
        if (object != colorStateList) {
            int n3;
            this.tabRippleColorStateList = colorStateList;
            colorStateList = null;
            for (int i3 = 0; i3 < (n3 = (object = this.slidingTabIndicator).getChildCount()); ++i3) {
                object = this.slidingTabIndicator.getChildAt(i3);
                boolean bl2 = object instanceof TabLayout$TabView;
                if (!bl2) continue;
                object = (TabLayout$TabView)((Object)object);
                Context context = this.getContext();
                TabLayout$TabView.access$200((TabLayout$TabView)((Object)object), context);
            }
        }
    }

    public void setTabRippleColorResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.getContext(), n3);
        this.setTabRippleColor(colorStateList);
    }

    public void setTabTextColors(int n3, int n4) {
        ColorStateList colorStateList = TabLayout.createColorStateList(n3, n4);
        this.setTabTextColors(colorStateList);
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.tabTextColors;
        if (colorStateList2 != colorStateList) {
            this.tabTextColors = colorStateList;
            this.updateAllTabs();
        }
    }

    public void setTabsFromPagerAdapter(Uk2 uk2) {
        this.setPagerAdapter(uk2, false);
    }

    public void setUnboundedRipple(boolean n3) {
        int n4 = this.unboundedRipple;
        if (n4 != n3) {
            LinearLayout linearLayout;
            this.unboundedRipple = n3;
            for (n3 = 0; n3 < (n4 = (linearLayout = this.slidingTabIndicator).getChildCount()); ++n3) {
                linearLayout = this.slidingTabIndicator.getChildAt(n3);
                boolean bl2 = linearLayout instanceof TabLayout$TabView;
                if (!bl2) continue;
                linearLayout = (TabLayout$TabView)linearLayout;
                Context context = this.getContext();
                TabLayout$TabView.access$200((TabLayout$TabView)linearLayout, context);
            }
        }
    }

    public void setUnboundedRippleResource(int n3) {
        n3 = (int)(this.getResources().getBoolean(n3) ? 1 : 0);
        this.setUnboundedRipple(n3 != 0);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        this.setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean bl2) {
        this.setupWithViewPager(viewPager, bl2, false);
    }

    public boolean shouldDelayChildPressedState() {
        int n3 = this.getTabScrollRange();
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public void updateTabViews(boolean bl2) {
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator;
        int n3;
        for (int i3 = 0; i3 < (n3 = (tabLayout$SlidingTabIndicator = this.slidingTabIndicator).getChildCount()); ++i3) {
            tabLayout$SlidingTabIndicator = this.slidingTabIndicator.getChildAt(i3);
            int n4 = this.getTabMinWidth();
            tabLayout$SlidingTabIndicator.setMinimumWidth(n4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)tabLayout$SlidingTabIndicator.getLayoutParams();
            this.updateTabViewLayoutParams(layoutParams);
            if (!bl2) continue;
            tabLayout$SlidingTabIndicator.requestLayout();
        }
    }

    public void updateViewPagerScrollState(int n3) {
        this.viewPagerScrollState = n3;
    }
}

