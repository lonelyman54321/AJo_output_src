/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Pair
 *  android.util.TypedValue
 *  android.view.Gravity
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 */
package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$e;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MaterialBackAnimationHelper;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.google.android.material.navigation.NavigationView$3;
import com.google.android.material.navigation.NavigationView$OnNavigationItemSelectedListener;
import com.google.android.material.navigation.NavigationView$SavedState;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class NavigationView
extends ScrimInsetsFrameLayout
implements MaterialBackHandler {
    private static final int[] CHECKED_STATE_SET = new int[]{0x10100A0};
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DISABLED_STATE_SET = new int[]{-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout$e backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    NavigationView$OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_NavigationView;
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.navigationViewStyle;
        this(context, attributeSet, n3);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int n3) {
        Object object;
        boolean bl2;
        int n4;
        Drawable drawable2;
        ColorStateList colorStateList;
        MaterialShapeDrawable materialShapeDrawable;
        float f5;
        NavigationMenu navigationMenu;
        int n7;
        NavigationMenuPresenter navigationMenuPresenter;
        NavigationView navigationView = this;
        AttributeSet attributeSet2 = attributeSet;
        int bl3 = n3;
        int n8 = DEF_STYLE_RES;
        Object object2 = context;
        object2 = MaterialThemeOverlay.wrap(context, attributeSet, n3, n8);
        super((Context)object2, attributeSet, n3);
        this.presenter = navigationMenuPresenter = new NavigationMenuPresenter();
        int n10 = 2;
        object2 = new int[n10];
        this.tmpLocation = (int[])object2;
        this.topInsetScrimEnabled = n7 = 1;
        this.bottomInsetScrimEnabled = n7;
        int n14 = 0;
        Drawable drawable3 = null;
        this.drawerLayoutCornerSize = 0;
        object2 = ShapeableDelegate.create((View)this);
        this.shapeableDelegate = object2;
        super((View)this);
        this.sideContainerBackHelper = object2;
        super((View)this);
        this.backOrchestrator = object2;
        super(this);
        this.backDrawerListener = object2;
        Context context2 = this.getContext();
        this.menu = navigationMenu = new NavigationMenu(context2);
        Object object3 = R$styleable.NavigationView;
        Object object4 = new int[]{};
        object2 = context2;
        Object object5 = attributeSet;
        int n15 = n3;
        int n16 = n8;
        object2 = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, object3, n3, n8, object4);
        int n17 = R$styleable.NavigationView_android_background;
        object3 = ((Tn3)object2).b;
        n17 = (int)(object3.hasValue(n17) ? 1 : 0);
        if (n17 != 0) {
            n17 = R$styleable.NavigationView_android_background;
            object5 = ((Tn3)object2).b(n17);
            object3 = ViewCompat.a;
            this.setBackground((Drawable)object5);
        }
        n17 = R$styleable.NavigationView_drawerLayoutCornerSize;
        object3 = ((Tn3)object2).b;
        navigationView.drawerLayoutCornerSize = n17 = object3.getDimensionPixelSize(n17, 0);
        if (n17 == 0) {
            n17 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n17 = 0;
            f5 = 0.0f;
            object5 = null;
        }
        navigationView.drawerLayoutCornerSizeBackAnimationEnabled = n17;
        object5 = this.getResources();
        n15 = R$dimen.m3_navigation_drawer_layout_corner_size;
        navigationView.drawerLayoutCornerSizeBackAnimationMax = n17 = object5.getDimensionPixelSize(n15);
        object5 = this.getBackground();
        ColorStateList colorStateList2 = DrawableUtils.getColorStateListOrNull((Drawable)object5);
        if (object5 == null || colorStateList2 != null) {
            object5 = ShapeAppearanceModel.builder(context2, attributeSet2, bl3, n8).build();
            materialShapeDrawable = new MaterialShapeDrawable((ShapeAppearanceModel)object5);
            if (colorStateList2 != null) {
                materialShapeDrawable.setFillColor(colorStateList2);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            object5 = ViewCompat.a;
            navigationView.setBackground(materialShapeDrawable);
        }
        n17 = R$styleable.NavigationView_elevation;
        if ((n17 = (int)(object3.hasValue(n17) ? 1 : 0)) != 0) {
            n17 = R$styleable.NavigationView_elevation;
            n17 = object3.getDimensionPixelSize(n17, 0);
            f5 = n17;
            navigationView.setElevation(f5);
        }
        n17 = R$styleable.NavigationView_android_fitsSystemWindows;
        n17 = (int)(object3.getBoolean(n17, false) ? 1 : 0);
        navigationView.setFitsSystemWindows(n17 != 0);
        n17 = R$styleable.NavigationView_android_maxWidth;
        navigationView.maxWidth = n17 = object3.getDimensionPixelSize(n17, 0);
        n17 = R$styleable.NavigationView_subheaderColor;
        n17 = (int)(object3.hasValue(n17) ? 1 : 0);
        n15 = 0;
        colorStateList2 = null;
        if (n17 != 0) {
            n17 = R$styleable.NavigationView_subheaderColor;
            object5 = ((Tn3)object2).a(n17);
        } else {
            n17 = 0;
            object5 = null;
            f5 = 0.0f;
        }
        n16 = R$styleable.NavigationView_subheaderTextAppearance;
        n16 = (int)(object3.hasValue(n16) ? 1 : 0);
        if (n16 != 0) {
            n16 = R$styleable.NavigationView_subheaderTextAppearance;
            n16 = object3.getResourceId(n16, 0);
        } else {
            n16 = 0;
            materialShapeDrawable = null;
        }
        int n18 = 16842808;
        if (n16 == 0 && object5 == null) {
            object5 = navigationView.createDefaultColorStateList(n18);
        }
        int n19 = R$styleable.NavigationView_itemIconTint;
        if ((n19 = (int)(object3.hasValue(n19) ? 1 : 0)) != 0) {
            n18 = R$styleable.NavigationView_itemIconTint;
            object4 = ((Tn3)object2).a(n18);
        } else {
            object4 = navigationView.createDefaultColorStateList(n18);
        }
        n19 = R$styleable.NavigationView_itemTextAppearance;
        n19 = (int)(object3.hasValue(n19) ? 1 : 0);
        if (n19 != 0) {
            n19 = R$styleable.NavigationView_itemTextAppearance;
            n19 = object3.getResourceId(n19, 0);
        } else {
            n19 = 0;
            attributeSet2 = null;
        }
        int n20 = R$styleable.NavigationView_itemTextAppearanceActiveBoldEnabled;
        boolean bl4 = object3.getBoolean(n20, n7 != 0);
        n8 = R$styleable.NavigationView_itemIconSize;
        n8 = (int)(object3.hasValue(n8) ? 1 : 0);
        if (n8 != 0) {
            n8 = R$styleable.NavigationView_itemIconSize;
            n8 = object3.getDimensionPixelSize(n8, 0);
            navigationView.setItemIconSize(n8);
        }
        n8 = R$styleable.NavigationView_itemTextColor;
        if ((n8 = (int)(object3.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.NavigationView_itemTextColor;
            colorStateList = ((Tn3)object2).a(n8);
        } else {
            n8 = 0;
            colorStateList = null;
        }
        if (n19 == 0 && colorStateList == null) {
            n8 = 16842806;
            colorStateList = navigationView.createDefaultColorStateList(n8);
        }
        if ((drawable2 = ((Tn3)object2).b(n4 = R$styleable.NavigationView_itemBackground)) == null && (bl2 = navigationView.hasShapeAppearance((Tn3)object2))) {
            drawable2 = navigationView.createDefaultItemBackground((Tn3)object2);
            n7 = R$styleable.NavigationView_itemRippleColor;
            object = MaterialResources.getColorStateList(context2, (Tn3)object2, n7);
            if (object != null) {
                drawable3 = navigationView.createDefaultItemDrawable((Tn3)object2, null);
                attributeSet = drawable2;
                object = RippleUtils.sanitizeRippleDrawableColor(object);
                super(object, null, drawable3);
                navigationMenuPresenter.setItemForeground((RippleDrawable)drawable2);
            } else {
                attributeSet = drawable2;
            }
            drawable2 = attributeSet;
        }
        n15 = R$styleable.NavigationView_itemHorizontalPadding;
        if ((n15 = (int)(object3.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationView_itemHorizontalPadding;
            n7 = 0;
            object = null;
            n15 = object3.getDimensionPixelSize(n15, 0);
            navigationView.setItemHorizontalPadding(n15);
        }
        n15 = R$styleable.NavigationView_itemVerticalPadding;
        if ((n15 = (int)(object3.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationView_itemVerticalPadding;
            n7 = 0;
            object = null;
            n15 = object3.getDimensionPixelSize(n15, 0);
            navigationView.setItemVerticalPadding(n15);
        } else {
            n7 = 0;
            object = null;
        }
        n15 = R$styleable.NavigationView_dividerInsetStart;
        n15 = object3.getDimensionPixelSize(n15, 0);
        navigationView.setDividerInsetStart(n15);
        n15 = R$styleable.NavigationView_dividerInsetEnd;
        n15 = object3.getDimensionPixelSize(n15, 0);
        navigationView.setDividerInsetEnd(n15);
        n15 = R$styleable.NavigationView_subheaderInsetStart;
        n15 = object3.getDimensionPixelSize(n15, 0);
        navigationView.setSubheaderInsetStart(n15);
        n15 = R$styleable.NavigationView_subheaderInsetEnd;
        n15 = object3.getDimensionPixelSize(n15, 0);
        navigationView.setSubheaderInsetEnd(n15);
        n15 = R$styleable.NavigationView_topInsetScrimEnabled;
        n7 = (int)(navigationView.topInsetScrimEnabled ? 1 : 0);
        n15 = (int)(object3.getBoolean(n15, n7 != 0) ? 1 : 0);
        navigationView.setTopInsetScrimEnabled(n15 != 0);
        n15 = R$styleable.NavigationView_bottomInsetScrimEnabled;
        n7 = navigationView.bottomInsetScrimEnabled;
        n15 = (int)(object3.getBoolean(n15, n7 != 0) ? 1 : 0);
        navigationView.setBottomInsetScrimEnabled(n15 != 0);
        n15 = R$styleable.NavigationView_itemIconPadding;
        n15 = object3.getDimensionPixelSize(n15, 0);
        n7 = R$styleable.NavigationView_itemMaxLines;
        n14 = 1;
        n7 = object3.getInt(n7, n14);
        navigationView.setItemMaxLines(n7);
        super(navigationView);
        navigationMenu.setCallback((d$a)object);
        navigationMenuPresenter.setId(n14);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (n16 != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(n16);
        }
        navigationMenuPresenter.setSubheaderColor((ColorStateList)object5);
        navigationMenuPresenter.setItemIconTintList((ColorStateList)object4);
        n17 = this.getOverScrollMode();
        navigationMenuPresenter.setOverScrollMode(n17);
        if (n19 != 0) {
            navigationMenuPresenter.setItemTextAppearance(n19);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(bl4);
        navigationMenuPresenter.setItemTextColor(colorStateList);
        navigationMenuPresenter.setItemBackground(drawable2);
        navigationMenuPresenter.setItemIconPadding(n15);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        object5 = (View)navigationMenuPresenter.getMenuView((ViewGroup)navigationView);
        navigationView.addView((View)object5);
        n17 = R$styleable.NavigationView_menu;
        n17 = (int)(object3.hasValue(n17) ? 1 : 0);
        if (n17 != 0) {
            n17 = R$styleable.NavigationView_menu;
            n15 = 0;
            colorStateList2 = null;
            n17 = object3.getResourceId(n17, 0);
            navigationView.inflateMenu(n17);
        }
        n17 = R$styleable.NavigationView_headerLayout;
        if ((n17 = (int)(object3.hasValue(n17) ? 1 : 0)) != 0) {
            n17 = R$styleable.NavigationView_headerLayout;
            n15 = 0;
            colorStateList2 = null;
            n17 = object3.getResourceId(n17, 0);
            navigationView.inflateHeaderView(n17);
        }
        ((Tn3)object2).g();
        this.setupInsetScrimsListener();
    }

    public static /* synthetic */ void a(NavigationView navigationView, Canvas canvas) {
        navigationView.lambda$dispatchDraw$0(canvas);
    }

    public static /* synthetic */ MaterialBackOrchestrator access$000(NavigationView navigationView) {
        return navigationView.backOrchestrator;
    }

    public static /* synthetic */ void access$100(NavigationView navigationView) {
        navigationView.maybeClearCornerSizeAnimationForDrawerLayout();
    }

    public static /* synthetic */ int[] access$200(NavigationView navigationView) {
        return navigationView.tmpLocation;
    }

    public static /* synthetic */ NavigationMenuPresenter access$300(NavigationView navigationView) {
        return navigationView.presenter;
    }

    private ColorStateList createDefaultColorStateList(int n3) {
        int n4;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.getContext().getTheme();
        int n7 = 1;
        n3 = (int)(theme.resolveAttribute(n3, typedValue, n7 != 0) ? 1 : 0);
        int n8 = 0;
        theme = null;
        if (n3 == 0) {
            return null;
        }
        Object object = this.getContext();
        int n10 = typedValue.resourceId;
        object = t70.getColorStateList(object, n10);
        Resources.Theme theme2 = this.getContext().getTheme();
        n10 = (int)(theme2.resolveAttribute(n4 = androidx.appcompat.R$attr.colorPrimary, typedValue, n7 != 0) ? 1 : 0);
        if (n10 == 0) {
            return null;
        }
        int n14 = typedValue.data;
        n8 = object.getDefaultColor();
        int[] nArray = DISABLED_STATE_SET;
        int[][] nArrayArray = new int[3][];
        nArrayArray[0] = nArray;
        int[] nArray2 = CHECKED_STATE_SET;
        nArrayArray[n7] = nArray2;
        int[] nArray3 = FrameLayout.EMPTY_STATE_SET;
        nArrayArray[2] = nArray3;
        n3 = object.getColorForState(nArray, n8);
        object = new int[]{n3, n14, n8};
        theme2 = new ColorStateList((int[][])nArrayArray, (int[])object);
        return theme2;
    }

    private Drawable createDefaultItemBackground(Tn3 tn3) {
        Context context = this.getContext();
        int n3 = R$styleable.NavigationView_itemShapeFillColor;
        context = MaterialResources.getColorStateList(context, tn3, n3);
        return this.createDefaultItemDrawable(tn3, (ColorStateList)context);
    }

    private Drawable createDefaultItemDrawable(Tn3 tn3, ColorStateList colorStateList) {
        int n3 = R$styleable.NavigationView_itemShapeAppearance;
        n3 = tn3.b.getResourceId(n3, 0);
        int n4 = R$styleable.NavigationView_itemShapeAppearanceOverlay;
        tn3 = tn3.b;
        n4 = tn3.getResourceId(n4, 0);
        ShapeAppearanceModel shapeAppearanceModel = ShapeAppearanceModel.builder(this.getContext(), n3, n4).build();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        materialShapeDrawable.setFillColor(colorStateList);
        int n7 = R$styleable.NavigationView_itemShapeInsetStart;
        int n8 = tn3.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.NavigationView_itemShapeInsetTop;
        int n10 = tn3.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.NavigationView_itemShapeInsetEnd;
        int n14 = tn3.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.NavigationView_itemShapeInsetBottom;
        int n15 = tn3.getDimensionPixelSize(n7, 0);
        tn3 = new InsetDrawable((Drawable)materialShapeDrawable, n8, n10, n14, n15);
        return tn3;
    }

    private MenuInflater getMenuInflater() {
        MenuInflater menuInflater = this.menuInflater;
        if (menuInflater == null) {
            Context context = this.getContext();
            this.menuInflater = menuInflater = new vg3_1(context);
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(Tn3 tn3) {
        boolean bl2;
        int n3 = R$styleable.NavigationView_itemShapeAppearance;
        TypedArray typedArray = tn3.b;
        if ((n3 = (int)(typedArray.hasValue(n3) ? 1 : 0)) == 0 && !(bl2 = (tn3 = tn3.b).hasValue(n3 = R$styleable.NavigationView_itemShapeAppearanceOverlay))) {
            bl2 = false;
            tn3 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    private void maybeClearCornerSizeAnimationForDrawerLayout() {
        int n3 = this.drawerLayoutCornerSizeBackAnimationEnabled;
        if (n3 != 0 && (n3 = this.drawerLayoutCornerSize) != 0) {
            this.drawerLayoutCornerSize = 0;
            n3 = this.getWidth();
            int n4 = this.getHeight();
            this.maybeUpdateCornerSizeForDrawerLayout(n3, n4);
        }
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int n3, int n4) {
        Object object = this.getParent();
        int n7 = object instanceof DrawerLayout;
        if (n7 != 0 && (n7 = (object = this.getLayoutParams()) instanceof DrawerLayout$LayoutParams) != 0 && ((n7 = this.drawerLayoutCornerSize) > 0 || (n7 = (int)(this.drawerLayoutCornerSizeBackAnimationEnabled ? 1 : 0)) != 0) && (n7 = (object = this.getBackground()) instanceof MaterialShapeDrawable) != 0) {
            object = (DrawerLayout$LayoutParams)this.getLayoutParams();
            n7 = ((DrawerLayout$LayoutParams)((Object)object)).a;
            Object object2 = ViewCompat.a;
            int n8 = this.getLayoutDirection();
            n7 = Gravity.getAbsoluteGravity((int)n7, (int)n8);
            n8 = 3;
            boolean bl2 = true;
            if (n7 == n8) {
                n7 = 1;
            } else {
                n7 = 0;
                object = null;
            }
            object2 = (MaterialShapeDrawable)this.getBackground();
            ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = ((MaterialShapeDrawable)object2).getShapeAppearanceModel().toBuilder();
            float f5 = this.drawerLayoutCornerSize;
            shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setAllCornerSizes(f5);
            f5 = 0.0f;
            if (n7 != 0) {
                shapeAppearanceModel$Builder.setTopLeftCornerSize(0.0f);
                shapeAppearanceModel$Builder.setBottomLeftCornerSize(0.0f);
            } else {
                shapeAppearanceModel$Builder.setTopRightCornerSize(0.0f);
                shapeAppearanceModel$Builder.setBottomRightCornerSize(0.0f);
            }
            object = shapeAppearanceModel$Builder.build();
            ((MaterialShapeDrawable)object2).setShapeAppearanceModel((ShapeAppearanceModel)object);
            this.shapeableDelegate.onShapeAppearanceChanged((View)this, (ShapeAppearanceModel)object);
            object = this.shapeableDelegate;
            float f6 = n3;
            float f7 = n4;
            object2 = new RectF(0.0f, 0.0f, f6, f7);
            ((ShapeableDelegate)object).onMaskChanged((View)this, (RectF)object2);
            ShapeableDelegate shapeableDelegate = this.shapeableDelegate;
            shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled((View)this, bl2);
        }
    }

    private Pair requireDrawerLayoutParent() {
        Object object = this.getParent();
        Object object2 = this.getLayoutParams();
        boolean bl2 = object instanceof DrawerLayout;
        if (bl2 && (bl2 = object2 instanceof DrawerLayout$LayoutParams)) {
            object = (DrawerLayout)((Object)object);
            object2 = (DrawerLayout$LayoutParams)((Object)object2);
            Pair pair = new Pair(object, object2);
            return pair;
        }
        object = new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        throw object;
    }

    private void setupInsetScrimsListener() {
        NavigationView$3 navigationView$3 = new NavigationView$3(this);
        this.onGlobalLayoutListener = navigationView$3;
        navigationView$3 = this.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.onGlobalLayoutListener;
        navigationView$3.addOnGlobalLayoutListener(onGlobalLayoutListener2);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    public void cancelBackProgress() {
        this.requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        this.maybeClearCornerSizeAnimationForDrawerLayout();
    }

    public void dispatchDraw(Canvas canvas) {
        ShapeableDelegate shapeableDelegate = this.shapeableDelegate;
        iu1_1 iu1_12 = new iu1_1(this);
        shapeableDelegate.maybeClip(canvas, iu1_12);
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int n3) {
        return this.presenter.getHeaderView(n3);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public void handleBackInvoked() {
        int n3;
        int n4;
        Pair pair = this.requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout)((Object)pair.first);
        uu_0 uu_02 = this.sideContainerBackHelper.onHandleBackInvoked();
        if (uu_02 != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            int n7 = ((DrawerLayout$LayoutParams)((Object)pair.second)).a;
            Animator.AnimatorListener animatorListener = DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, (View)this);
            drawerLayout = DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout);
            this.sideContainerBackHelper.finishBackProgress(uu_02, n7, animatorListener, (ValueAnimator.AnimatorUpdateListener)drawerLayout);
            return;
        }
        drawerLayout.closeDrawer((View)this);
    }

    public View inflateHeaderView(int n3) {
        return this.presenter.inflateHeaderView(n3);
    }

    public void inflateMenu(int n3) {
        this.presenter.setUpdateSuspended(true);
        MenuInflater menuInflater = this.getMenuInflater();
        NavigationMenu navigationMenu = this.menu;
        menuInflater.inflate(n3, (Menu)navigationMenu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    public void onAttachedToWindow() {
        Object object;
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this);
        Object object2 = this.getParent();
        boolean bl2 = object2 instanceof DrawerLayout;
        if (bl2 && (bl2 = ((MaterialBackOrchestrator)(object = this.backOrchestrator)).shouldListenForBackCallbacks())) {
            object2 = (DrawerLayout)((Object)object2);
            object = this.backDrawerListener;
            ((DrawerLayout)((Object)object2)).removeDrawerListener((DrawerLayout$e)object);
            object = this.backDrawerListener;
            ((DrawerLayout)((Object)object2)).addDrawerListener((DrawerLayout$e)object);
            boolean bl3 = ((DrawerLayout)((Object)object2)).isDrawerOpen((View)this);
            if (bl3) {
                object2 = this.backOrchestrator;
                ((MaterialBackOrchestrator)object2).startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.getViewTreeObserver();
        Object object2 = this.onGlobalLayoutListener;
        object.removeOnGlobalLayoutListener(object2);
        object = this.getParent();
        boolean bl2 = object instanceof DrawerLayout;
        if (bl2) {
            object = (DrawerLayout)((Object)object);
            object2 = this.backDrawerListener;
            ((DrawerLayout)((Object)object)).removeDrawerListener((DrawerLayout$e)object2);
        }
    }

    public void onInsetsChanged(f f5) {
        this.presenter.dispatchApplyWindowInsets(f5);
    }

    public void onMeasure(int n3, int n4) {
        int n7 = View.MeasureSpec.getMode((int)n3);
        int n8 = -1 << -1;
        int n10 = 0x40000000;
        if (n7 != n8) {
            if (n7 == 0) {
                n3 = View.MeasureSpec.makeMeasureSpec((int)this.maxWidth, (int)n10);
            }
        } else {
            n3 = View.MeasureSpec.getSize((int)n3);
            n7 = this.maxWidth;
            n3 = View.MeasureSpec.makeMeasureSpec((int)Math.min(n3, n7), (int)n10);
        }
        super.onMeasure(n3, n4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof NavigationView$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (NavigationView$SavedState)parcelable;
        Object object = parcelable.getSuperState();
        super.onRestoreInstanceState((Parcelable)object);
        object = this.menu;
        parcelable = parcelable.menuState;
        ((d)object).restorePresenterStates((Bundle)parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        NavigationView$SavedState navigationView$SavedState = new NavigationView$SavedState(parcelable);
        parcelable = new Bundle();
        navigationView$SavedState.menuState = parcelable;
        this.menu.savePresenterStates((Bundle)parcelable);
        return navigationView$SavedState;
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        this.maybeUpdateCornerSizeForDrawerLayout(n3, n4);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean bl2) {
        this.bottomInsetScrimEnabled = bl2;
    }

    public void setCheckedItem(int n3) {
        Object object = this.menu;
        MenuItem menuItem = ((d)object).findItem(n3);
        if (menuItem != null) {
            object = this.presenter;
            menuItem = (androidx.appcompat.view.menu.f)menuItem;
            ((NavigationMenuPresenter)object).setCheckedItem((androidx.appcompat.view.menu.f)menuItem);
        }
    }

    public void setCheckedItem(MenuItem object) {
        Object object2 = this.menu;
        int n3 = object.getItemId();
        if ((object = ((d)object2).findItem(n3)) != null) {
            object2 = this.presenter;
            object = (androidx.appcompat.view.menu.f)object;
            ((NavigationMenuPresenter)object2).setCheckedItem((androidx.appcompat.view.menu.f)object);
            return;
        }
        object = new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        throw object;
    }

    public void setDividerInsetEnd(int n3) {
        this.presenter.setDividerInsetEnd(n3);
    }

    public void setDividerInsetStart(int n3) {
        this.presenter.setDividerInsetStart(n3);
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation((View)this, f5);
    }

    public void setForceCompatClippingEnabled(boolean bl2) {
        this.shapeableDelegate.setForceCompatClippingEnabled((View)this, bl2);
    }

    public void setItemBackground(Drawable drawable2) {
        this.presenter.setItemBackground(drawable2);
    }

    public void setItemBackgroundResource(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setItemBackground(drawable2);
    }

    public void setItemHorizontalPadding(int n3) {
        this.presenter.setItemHorizontalPadding(n3);
    }

    public void setItemHorizontalPaddingResource(int n3) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        n3 = this.getResources().getDimensionPixelSize(n3);
        navigationMenuPresenter.setItemHorizontalPadding(n3);
    }

    public void setItemIconPadding(int n3) {
        this.presenter.setItemIconPadding(n3);
    }

    public void setItemIconPaddingResource(int n3) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        n3 = this.getResources().getDimensionPixelSize(n3);
        navigationMenuPresenter.setItemIconPadding(n3);
    }

    public void setItemIconSize(int n3) {
        this.presenter.setItemIconSize(n3);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int n3) {
        this.presenter.setItemMaxLines(n3);
    }

    public void setItemTextAppearance(int n3) {
        this.presenter.setItemTextAppearance(n3);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean bl2) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(bl2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int n3) {
        this.presenter.setItemVerticalPadding(n3);
    }

    public void setItemVerticalPaddingResource(int n3) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        n3 = this.getResources().getDimensionPixelSize(n3);
        navigationMenuPresenter.setItemVerticalPadding(n3);
    }

    public void setNavigationItemSelectedListener(NavigationView$OnNavigationItemSelectedListener navigationView$OnNavigationItemSelectedListener) {
        this.listener = navigationView$OnNavigationItemSelectedListener;
    }

    public void setOverScrollMode(int n3) {
        super.setOverScrollMode(n3);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(n3);
        }
    }

    public void setSubheaderInsetEnd(int n3) {
        this.presenter.setSubheaderInsetEnd(n3);
    }

    public void setSubheaderInsetStart(int n3) {
        this.presenter.setSubheaderInsetStart(n3);
    }

    public void setTopInsetScrimEnabled(boolean bl2) {
        this.topInsetScrimEnabled = bl2;
    }

    public void startBackProgress(uu_0 uu_02) {
        this.requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(uu_02);
    }

    public void updateBackProgress(uu_0 uu_02) {
        Object object = this.requireDrawerLayoutParent();
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        object = (DrawerLayout$LayoutParams)((Object)((Pair)object).second);
        int n3 = ((DrawerLayout$LayoutParams)((Object)object)).a;
        materialSideContainerBackHelper.updateBackProgress(uu_02, n3);
        n3 = (int)(this.drawerLayoutCornerSizeBackAnimationEnabled ? 1 : 0);
        if (n3 != 0) {
            int n4;
            object = this.sideContainerBackHelper;
            float f5 = uu_02.c;
            f5 = ((MaterialBackAnimationHelper)object).interpolateProgress(f5);
            object = null;
            int n7 = this.drawerLayoutCornerSizeBackAnimationMax;
            this.drawerLayoutCornerSize = n4 = AnimationUtils.lerp(0, n7, f5);
            n4 = this.getWidth();
            n3 = this.getHeight();
            this.maybeUpdateCornerSizeForDrawerLayout(n4, n3);
        }
    }
}

