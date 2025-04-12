/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.search.SearchBar$1;
import com.google.android.material.search.SearchBar$OnLoadAnimationCallback;
import com.google.android.material.search.SearchBar$SavedState;
import com.google.android.material.search.SearchBarAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class SearchBar
extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = 0;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    private Integer navigationIconTint;
    private Drawable originalNavigationIconBackground;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final Q1 touchExplorationStateChangeListener;

    static {
        DEF_STYLE_RES = R$style.Widget_Material3_SearchBar;
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialSearchBarStyle;
        this(context, attributeSet, n3);
    }

    public SearchBar(Context context, AttributeSet object, int n3) {
        int n4;
        int n7 = DEF_STYLE_RES;
        context = MaterialThemeOverlay.wrap(context, (AttributeSet)object, n3, n7);
        super(context, (AttributeSet)object, n3);
        this.menuResId = n4 = -1;
        Object object2 = new aa_2(this);
        this.touchExplorationStateChangeListener = object2;
        Context context2 = this.getContext();
        this.validateAttributes((AttributeSet)object);
        int n8 = this.getDefaultNavigationIconResource();
        object2 = xn.a(context2, n8);
        this.defaultNavigationIcon = object2;
        this.searchBarAnimationHelper = object2 = new SearchBarAnimationHelper();
        Object object3 = R$styleable.SearchBar;
        int n10 = 0;
        Object object4 = new int[]{};
        object2 = context2;
        Object object5 = object;
        int n14 = n3;
        object2 = ThemeEnforcement.obtainStyledAttributes(context2, (AttributeSet)object, object3, n3, n7, object4);
        object = ShapeAppearanceModel.builder(context2, (AttributeSet)object, n3, n7);
        object3 = ((ShapeAppearanceModel$Builder)object).build();
        int n15 = R$styleable.SearchBar_backgroundTint;
        n14 = object2.getColor(n15, 0);
        n15 = R$styleable.SearchBar_elevation;
        float f5 = object2.getDimension(n15, 0.0f);
        n15 = R$styleable.SearchBar_defaultMarginsEnabled;
        n3 = 1;
        n15 = (int)(object2.getBoolean(n15, n3 != 0) ? 1 : 0);
        this.defaultMarginsEnabled = n15;
        n15 = R$styleable.SearchBar_defaultScrollFlagsEnabled;
        n15 = (int)(object2.getBoolean(n15, n3 != 0) ? 1 : 0);
        this.defaultScrollFlagsEnabled = n15;
        n15 = R$styleable.SearchBar_hideNavigationIcon;
        n15 = (int)(object2.getBoolean(n15, false) ? 1 : 0);
        int n16 = R$styleable.SearchBar_forceDefaultNavigationOnClickListener;
        n16 = (int)(object2.getBoolean(n16, false) ? 1 : 0);
        this.forceDefaultNavigationOnClickListener = n16;
        n16 = R$styleable.SearchBar_tintNavigationIcon;
        n16 = (int)(object2.getBoolean(n16, n3 != 0) ? 1 : 0);
        this.tintNavigationIcon = n16;
        n16 = R$styleable.SearchBar_navigationIconTint;
        n16 = (int)(object2.hasValue(n16) ? 1 : 0);
        if (n16 != 0) {
            n16 = R$styleable.SearchBar_navigationIconTint;
            n16 = object2.getColor(n16, n4);
            object5 = n16;
            this.navigationIconTint = object5;
        }
        n16 = R$styleable.SearchBar_android_textAppearance;
        n4 = object2.getResourceId(n16, n4);
        n16 = R$styleable.SearchBar_android_text;
        object5 = object2.getString(n16);
        int n17 = R$styleable.SearchBar_android_hint;
        object4 = object2.getString(n17);
        n7 = R$styleable.SearchBar_strokeWidth;
        float f6 = -1.0f;
        float f7 = object2.getDimension(n7, f6);
        int n18 = R$styleable.SearchBar_strokeColor;
        n10 = object2.getColor(n18, 0);
        object2.recycle();
        if (n15 == 0) {
            this.initNavigationIcon();
        }
        this.setClickable(n3 != 0);
        this.setFocusable(n3 != 0);
        object = LayoutInflater.from((Context)context2);
        n8 = R$layout.mtrl_search_bar;
        object.inflate(n8, (ViewGroup)this);
        this.layoutInflated = n3;
        n15 = R$id.open_search_bar_text_view;
        object = (TextView)this.findViewById(n15);
        this.textView = object;
        object = ViewCompat.a;
        ViewCompat$c.m((View)this, f5);
        this.initTextView(n4, (String)object5, (String)object4);
        object5 = this;
        n7 = n10;
        this.initBackground((ShapeAppearanceModel)object3, n14, f5, f7, n10);
        context = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.accessibilityManager = context;
        this.setupTouchExplorationStateChangeListener();
    }

    public static /* synthetic */ void a(SearchBar searchBar, boolean bl2) {
        searchBar.lambda$new$0(bl2);
    }

    public static /* synthetic */ AccessibilityManager access$000(SearchBar searchBar) {
        return searchBar.accessibilityManager;
    }

    public static /* synthetic */ Q1 access$100(SearchBar searchBar) {
        return searchBar.touchExplorationStateChangeListener;
    }

    public static /* synthetic */ void b(SearchBar searchBar) {
        searchBar.lambda$startOnLoadAnimation$1();
    }

    private int defaultIfZero(int n3, int n4) {
        if (n3 == 0) {
            n3 = n4;
        }
        return n3;
    }

    private ColorStateList getCompatBackgroundColorStateList(int n3, int n4) {
        int[] nArray = new int[]{};
        int[][] nArrayArray = new int[3][];
        int[] nArray2 = new int[]{16842919};
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[]{16842908};
        nArrayArray[1] = nArray3;
        nArrayArray[2] = nArray;
        n4 = MaterialColors.layer(n3, n4);
        int[] nArray4 = new int[]{n4, n4, n3};
        ColorStateList colorStateList = new ColorStateList((int[][])nArrayArray, nArray4);
        return colorStateList;
    }

    private void initBackground(ShapeAppearanceModel object, int n3, float f5, float f6, int n4) {
        MaterialShapeDrawable materialShapeDrawable;
        this.backgroundShape = materialShapeDrawable = new MaterialShapeDrawable((ShapeAppearanceModel)object);
        object = this.getContext();
        materialShapeDrawable.initializeElevationOverlay((Context)object);
        this.backgroundShape.setElevation(f5);
        object = null;
        float f7 = f6 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 >= 0) {
            object = this.backgroundShape;
            ((MaterialShapeDrawable)object).setStroke(f6, n4);
        }
        f8 = R$attr.colorControlHighlight;
        f8 = MaterialColors.getColor((View)this, (int)f8);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        materialShapeDrawable2.setFillColor(colorStateList);
        object = ColorStateList.valueOf((int)f8);
        materialShapeDrawable2 = this.backgroundShape;
        colorStateList = new RippleDrawable((ColorStateList)object, (Drawable)materialShapeDrawable2, (Drawable)materialShapeDrawable2);
        object = ViewCompat.a;
        this.setBackground((Drawable)colorStateList);
    }

    private void initNavigationIcon() {
        Drawable drawable2 = this.getNavigationIcon();
        drawable2 = drawable2 == null ? this.defaultNavigationIcon : this.getNavigationIcon();
        this.setNavigationIcon(drawable2);
        this.setNavigationIconDecorative(true);
    }

    private void initTextView(int n3, String string2, String string3) {
        int n4 = -1;
        if (n3 != n4) {
            TextView textView = this.textView;
            Hm3.f(textView, n3);
        }
        this.setText(string2);
        this.setHint(string3);
        Drawable drawable2 = this.getNavigationIcon();
        if (drawable2 == null) {
            drawable2 = (ViewGroup.MarginLayoutParams)this.textView.getLayoutParams();
            string2 = this.getResources();
            int n7 = R$dimen.m3_searchbar_text_margin_start_no_navigation_icon;
            int n8 = string2.getDimensionPixelSize(n7);
            drawable2.setMarginStart(n8);
        }
    }

    private /* synthetic */ void lambda$new$0(boolean bl2) {
        this.setFocusableInTouchMode(bl2);
    }

    private /* synthetic */ void lambda$startOnLoadAnimation$1() {
        this.searchBarAnimationHelper.startOnLoadAnimation(this);
    }

    private void layoutCenterView() {
        View view = this.centerView;
        if (view == null) {
            return;
        }
        int n3 = view.getMeasuredWidth();
        int n4 = this.getMeasuredWidth() / 2;
        int n7 = n3 / 2;
        int n8 = n4 - n7;
        int n10 = n8 + n3;
        n3 = this.centerView.getMeasuredHeight();
        n4 = this.getMeasuredHeight() / 2;
        n7 = n3 / 2;
        int n14 = n4 - n7;
        int n15 = n14 + n3;
        View view2 = this.centerView;
        this.layoutChild(view2, n8, n14, n10, n15);
    }

    private void layoutChild(View view, int n3, int n4, int n7, int n8) {
        int n10;
        int n14 = this.getLayoutDirection();
        if (n14 == (n10 = 1)) {
            n14 = this.getMeasuredWidth() - n7;
            n7 = this.getMeasuredWidth() - n3;
            view.layout(n14, n4, n7, n8);
        } else {
            view.layout(n3, n4, n7, n8);
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable2) {
        int n3 = this.tintNavigationIcon;
        if (n3 != 0 && drawable2 != null) {
            Integer n4 = this.navigationIconTint;
            if (n4 != null) {
                n3 = n4;
            } else {
                n4 = this.defaultNavigationIcon;
                n3 = drawable2 == n4 ? R$attr.colorOnSurfaceVariant : R$attr.colorOnSurface;
                n3 = MaterialColors.getColor((View)this, n3);
            }
            drawable2 = ut0_0.h(drawable2.mutate());
            drawable2.setTint(n3);
        }
        return drawable2;
    }

    private void measureCenterView(int n3, int n4) {
        View view = this.centerView;
        if (view != null) {
            view.measure(n3, n4);
        }
    }

    private void setDefaultMargins() {
        ViewGroup.LayoutParams layoutParams;
        int n3 = this.defaultMarginsEnabled;
        if (n3 != 0 && (n3 = (layoutParams = this.getLayoutParams()) instanceof ViewGroup.MarginLayoutParams) != 0) {
            layoutParams = this.getResources();
            int n4 = R$dimen.m3_searchbar_margin_horizontal;
            n4 = layoutParams.getDimensionPixelSize(n4);
            int n7 = this.getDefaultMarginVerticalResource();
            n3 = layoutParams.getDimensionPixelSize(n7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
            int n8 = marginLayoutParams.leftMargin;
            marginLayoutParams.leftMargin = n8 = this.defaultIfZero(n8, n4);
            n8 = marginLayoutParams.topMargin;
            marginLayoutParams.topMargin = n8 = this.defaultIfZero(n8, n3);
            n8 = marginLayoutParams.rightMargin;
            marginLayoutParams.rightMargin = n4 = this.defaultIfZero(n8, n4);
            n4 = marginLayoutParams.bottomMargin;
            marginLayoutParams.bottomMargin = n3 = this.defaultIfZero(n4, n3);
        }
    }

    private void setHandwritingBoundsInsets() {
        int n3;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 34;
        float f5 = 4.8E-44f;
        if (n4 < n7) {
            return;
        }
        n4 = this.getLayoutDirection();
        n7 = 1;
        f5 = Float.MIN_VALUE;
        int n8 = 0;
        if (n4 != n7) {
            n7 = 0;
            f5 = 0.0f;
        }
        Object object = ToolbarUtils.getNavigationIconButton(this);
        if (object != null && (n3 = object.isClickable()) != 0) {
            if (n7 != 0) {
                n3 = this.getWidth();
                n4 = object.getLeft();
                n3 -= n4;
            } else {
                n3 = object.getRight();
            }
        } else {
            n3 = 0;
        }
        object = ToolbarUtils.getActionMenuView(this);
        if (object != null) {
            if (n7 != 0) {
                n8 = n4 = object.getRight();
            } else {
                n8 = this.getWidth();
                n4 = object.getLeft();
                n8 -= n4;
            }
        }
        n4 = n7 != 0 ? n8 : n3;
        n4 = -n4;
        float f6 = n4;
        if (n7 == 0) {
            n3 = n8;
        }
        f5 = -n3;
        gu2_1.a(this, f6, f5);
    }

    private void setNavigationIconDecorative(boolean bl2) {
        Drawable drawable2;
        ImageButton imageButton = ToolbarUtils.getNavigationIconButton(this);
        if (imageButton == null) {
            return;
        }
        boolean bl3 = bl2 ^ true;
        imageButton.setClickable(bl3);
        bl3 = bl2 ^ true;
        imageButton.setFocusable(bl3);
        Drawable drawable3 = imageButton.getBackground();
        if (drawable3 != null) {
            this.originalNavigationIconBackground = drawable3;
        }
        if (bl2) {
            bl2 = false;
            drawable2 = null;
        } else {
            drawable2 = this.originalNavigationIconBackground;
        }
        imageButton.setBackgroundDrawable(drawable2);
        this.setHandwritingBoundsInsets();
    }

    private void setOrClearDefaultScrollFlags() {
        Object object = this.getLayoutParams();
        boolean bl2 = object instanceof AppBarLayout$LayoutParams;
        if (bl2) {
            object = (AppBarLayout$LayoutParams)this.getLayoutParams();
            int n3 = this.defaultScrollFlagsEnabled;
            int n4 = 53;
            if (n3 != 0) {
                n3 = ((AppBarLayout$LayoutParams)((Object)object)).getScrollFlags();
                if (n3 == 0) {
                    ((AppBarLayout$LayoutParams)((Object)object)).setScrollFlags(n4);
                }
            } else {
                n3 = ((AppBarLayout$LayoutParams)((Object)object)).getScrollFlags();
                if (n3 == n4) {
                    n3 = 0;
                    ((AppBarLayout$LayoutParams)((Object)object)).setScrollFlags(0);
                }
            }
        }
    }

    private void setupTouchExplorationStateChangeListener() {
        Object object = this.accessibilityManager;
        if (object != null) {
            boolean bl2 = object.isEnabled();
            if (bl2 && (bl2 = (object = this.accessibilityManager).isTouchExplorationEnabled())) {
                bl2 = true;
                this.setFocusableInTouchMode(bl2);
            }
            object = new SearchBar$1(this);
            this.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        }
    }

    private void validateAttributes(AttributeSet object) {
        if (object == null) {
            return;
        }
        String string2 = NAMESPACE_APP;
        String string3 = object.getAttributeValue(string2, "title");
        if (string3 == null) {
            string3 = "subtitle";
            if ((object = object.getAttributeValue(string2, string3)) == null) {
                return;
            }
            object = new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            throw object;
        }
        object = new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        throw object;
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(SearchBar$OnLoadAnimationCallback searchBar$OnLoadAnimationCallback) {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(searchBar$OnLoadAnimationCallback);
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        View view2;
        boolean bl2 = this.layoutInflated;
        if (bl2 && (view2 = this.centerView) == null && !(bl2 = view instanceof ActionMenuView)) {
            this.centerView = view;
            bl2 = false;
            view2 = null;
            view.setAlpha(0.0f);
        }
        super.addView(view, n3, layoutParams);
    }

    public void clearText() {
        this.textView.setText((CharSequence)"");
    }

    public boolean collapse(View view) {
        return this.collapse(view, null);
    }

    public boolean collapse(View view, AppBarLayout appBarLayout) {
        return this.collapse(view, appBarLayout, false);
    }

    public boolean collapse(View view, AppBarLayout appBarLayout, boolean bl2) {
        int n3 = view.getVisibility();
        if (n3 == 0 && (n3 = (int)(this.isCollapsing() ? 1 : 0)) == 0 || (n3 = (int)(this.isExpanding() ? 1 : 0)) != 0) {
            this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, bl2);
            return true;
        }
        return false;
    }

    public boolean expand(View view) {
        return this.expand(view, null);
    }

    public boolean expand(View view, AppBarLayout appBarLayout) {
        return this.expand(view, appBarLayout, false);
    }

    public boolean expand(View view, AppBarLayout appBarLayout, boolean bl2) {
        int n3 = view.getVisibility();
        if (n3 != 0 && (n3 = (int)(this.isExpanding() ? 1 : 0)) == 0 || (n3 = (int)(this.isCollapsing() ? 1 : 0)) != 0) {
            this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, bl2);
            return true;
        }
        return false;
    }

    public View getCenterView() {
        return this.centerView;
    }

    public float getCompatElevation() {
        float f5;
        Object object = this.backgroundShape;
        if (object != null) {
            f5 = ((MaterialShapeDrawable)object).getElevation();
        } else {
            object = ViewCompat.a;
            f5 = ViewCompat$c.e((View)this);
        }
        return f5;
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    public int getDefaultMarginVerticalResource() {
        return R$dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R$drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.textView.getHint();
    }

    public int getMenuResId() {
        return this.menuResId;
    }

    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public TextView getTextView() {
        return this.textView;
    }

    public void inflateMenu(int n3) {
        Menu menu2 = this.getMenu();
        boolean bl2 = menu2 instanceof d;
        if (bl2) {
            Menu menu3 = menu2;
            menu3 = (d)menu2;
            menu3.stopDispatchingItemsChanged();
        }
        super.inflateMenu(n3);
        this.menuResId = n3;
        if (bl2) {
            menu2 = (d)menu2;
            menu2.startDispatchingItemsChanged();
        }
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        MaterialShapeUtils.setParentAbsoluteElevation((View)this, materialShapeDrawable);
        this.setDefaultMargins();
        this.setOrClearDefaultScrollFlags();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence charSequence = EditText.class.getCanonicalName();
        accessibilityNodeInfo.setClassName(charSequence);
        int n3 = Build.VERSION.SDK_INT;
        boolean bl2 = this.isEnabled();
        accessibilityNodeInfo.setEditable(bl2);
        CharSequence charSequence2 = this.getText();
        boolean bl3 = TextUtils.isEmpty((CharSequence)charSequence2);
        int n4 = 26;
        if (n3 >= n4) {
            charSequence = this.getHint();
            d2_0.b(accessibilityNodeInfo, charSequence);
            e2_0.b(accessibilityNodeInfo, bl3);
        }
        if (bl3) {
            charSequence2 = this.getHint();
        }
        accessibilityNodeInfo.setText(charSequence2);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        this.layoutCenterView();
        this.setHandwritingBoundsInsets();
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        this.measureCenterView(n3, n4);
    }

    public void onRestoreInstanceState(Parcelable object) {
        boolean bl2 = object instanceof SearchBar$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState((Parcelable)object);
            return;
        }
        object = (SearchBar$SavedState)object;
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        object = object.text;
        this.setText((CharSequence)object);
    }

    public Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        SearchBar$SavedState searchBar$SavedState = new SearchBar$SavedState((Parcelable)object);
        object = this.getText();
        object = object == null ? null : object.toString();
        searchBar$SavedState.text = object;
        return searchBar$SavedState;
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(SearchBar$OnLoadAnimationCallback searchBar$OnLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(searchBar$OnLoadAnimationCallback);
    }

    public void setCenterView(View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            this.removeView(view2);
            view2 = null;
            this.centerView = null;
        }
        if (view != null) {
            this.addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean bl2) {
        this.defaultScrollFlagsEnabled = bl2;
        this.setOrClearDefaultScrollFlags();
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f5);
        }
    }

    public void setHint(int n3) {
        this.textView.setHint(n3);
    }

    public void setHint(CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    public void setNavigationIcon(Drawable drawable2) {
        drawable2 = this.maybeTintNavigationIcon(drawable2);
        super.setNavigationIcon(drawable2);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean bl2;
        boolean bl3 = this.forceDefaultNavigationOnClickListener;
        if (bl3) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            bl2 = true;
        } else {
            bl2 = false;
            onClickListener = null;
        }
        this.setNavigationIconDecorative(bl2);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean bl2) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(bl2);
    }

    public void setStrokeColor(int n3) {
        int n4 = this.getStrokeColor();
        if (n4 != n3) {
            MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
            ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
            materialShapeDrawable.setStrokeColor(colorStateList);
        }
    }

    public void setStrokeWidth(float f5) {
        float f6 = this.getStrokeWidth();
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
            materialShapeDrawable.setStrokeWidth(f5);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(int n3) {
        this.textView.setText(n3);
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        hu2_2 hu2_22 = new hu2_2(this);
        this.post(hu2_22);
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }
}

