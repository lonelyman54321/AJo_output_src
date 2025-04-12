/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.Window
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
package com.google.android.material.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar$f;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView$1;
import com.google.android.material.search.SearchView$Behavior;
import com.google.android.material.search.SearchView$SavedState;
import com.google.android.material.search.SearchView$TransitionListener;
import com.google.android.material.search.SearchView$TransitionState;
import com.google.android.material.search.SearchViewAnimationHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SearchView
extends FrameLayout
implements CoordinatorLayout$b,
MaterialBackHandler {
    private static final int DEF_STYLE_RES = 0;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100L;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;
    private final MaterialBackOrchestrator backOrchestrator;
    private final int backgroundColor;
    final View backgroundView;
    private Map childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;
    private SearchView$TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set transitionListeners;
    private boolean useWindowInsetsController;

    static {
        DEF_STYLE_RES = R$style.Widget_Material3_SearchView;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialSearchViewStyle;
        this(context, attributeSet, n3);
    }

    public SearchView(Context object, AttributeSet object2, int n3) {
        boolean bl2;
        boolean bl3;
        int bl22 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, object2, n3, bl22);
        super(object, object2, n3);
        object = new MaterialBackOrchestrator((View)this);
        this.backOrchestrator = object;
        object = new LinkedHashSet();
        this.transitionListeners = object;
        this.softInputMode = 16;
        object = SearchView$TransitionState.HIDDEN;
        this.currentTransitionState = object;
        object = this.getContext();
        Object object3 = R$styleable.SearchView;
        int[] nArray = new int[]{};
        Object object4 = object2;
        int n4 = n3;
        object2 = ThemeEnforcement.obtainStyledAttributes(object, object2, object3, n3, bl22, nArray);
        n3 = R$styleable.SearchView_backgroundTint;
        this.backgroundColor = n3 = object2.getColor(n3, 0);
        n3 = R$styleable.SearchView_headerLayout;
        int n7 = -1;
        n3 = object2.getResourceId(n3, n7);
        int n8 = R$styleable.SearchView_android_textAppearance;
        n7 = object2.getResourceId(n8, n7);
        n8 = R$styleable.SearchView_android_text;
        object4 = object2.getString(n8);
        int n10 = R$styleable.SearchView_android_hint;
        object3 = object2.getString(n10);
        n4 = R$styleable.SearchView_searchPrefixText;
        String string2 = object2.getString(n4);
        int n14 = R$styleable.SearchView_useDrawerArrowDrawable;
        boolean bl4 = object2.getBoolean(n14, false);
        int n15 = R$styleable.SearchView_animateNavigationIcon;
        boolean bl5 = true;
        this.animatedNavigationIcon = bl3 = object2.getBoolean(n15, bl5);
        int n16 = R$styleable.SearchView_animateMenuItems;
        this.animatedMenuItems = bl2 = object2.getBoolean(n16, bl5);
        int n17 = R$styleable.SearchView_hideNavigationIcon;
        boolean bl6 = object2.getBoolean(n17, false);
        int n18 = R$styleable.SearchView_autoShowKeyboard;
        n18 = (int)(object2.getBoolean(n18, bl5) ? 1 : 0);
        this.autoShowKeyboard = n18;
        n18 = R$styleable.SearchView_backHandlingEnabled;
        n18 = (int)(object2.getBoolean(n18, bl5) ? 1 : 0);
        this.backHandlingEnabled = n18;
        object2.recycle();
        object2 = LayoutInflater.from((Context)object);
        n18 = R$layout.mtrl_search_view;
        object2.inflate(n18, (ViewGroup)this);
        this.layoutInflated = bl5;
        int n19 = R$id.open_search_view_scrim;
        object2 = this.findViewById(n19);
        this.scrim = object2;
        n19 = R$id.open_search_view_root;
        object2 = (ClippableRoundedCornerLayout)this.findViewById(n19);
        this.rootView = object2;
        n19 = R$id.open_search_view_background;
        object2 = this.findViewById(n19);
        this.backgroundView = object2;
        n19 = R$id.open_search_view_status_bar_spacer;
        object2 = this.findViewById(n19);
        this.statusBarSpacer = object2;
        n19 = R$id.open_search_view_header_container;
        object2 = (FrameLayout)this.findViewById(n19);
        this.headerContainer = object2;
        n19 = R$id.open_search_view_toolbar_container;
        object2 = (FrameLayout)this.findViewById(n19);
        this.toolbarContainer = object2;
        n19 = R$id.open_search_view_toolbar;
        object2 = (MaterialToolbar)this.findViewById(n19);
        this.toolbar = object2;
        n19 = R$id.open_search_view_dummy_toolbar;
        object2 = (Toolbar)this.findViewById(n19);
        this.dummyToolbar = object2;
        n19 = R$id.open_search_view_search_prefix;
        object2 = (TextView)this.findViewById(n19);
        this.searchPrefix = object2;
        n19 = R$id.open_search_view_edit_text;
        object2 = (EditText)this.findViewById(n19);
        this.editText = object2;
        n19 = R$id.open_search_view_clear_button;
        object2 = (ImageButton)this.findViewById(n19);
        this.clearButton = object2;
        n19 = R$id.open_search_view_divider;
        object2 = this.findViewById(n19);
        this.divider = object2;
        n19 = R$id.open_search_view_content_container;
        object2 = (TouchObserverFrameLayout)this.findViewById(n19);
        this.contentContainer = object2;
        super(this);
        this.searchViewAnimationHelper = object2;
        super((Context)object);
        this.elevationOverlayProvider = object2;
        this.setUpRootView();
        this.setUpBackgroundViewElevationOverlay();
        this.setUpHeaderLayout(n3);
        this.setSearchPrefixText(string2);
        this.setUpEditText(n7, (String)object4, (String)object3);
        this.setUpBackButton(bl4, bl6);
        this.setUpClearButton();
        this.setUpContentOnTouchListener();
        this.setUpInsetListeners();
    }

    public static /* synthetic */ void a(SearchView searchView, View view) {
        searchView.lambda$setupWithSearchBar$7(view);
    }

    public static /* synthetic */ f b(ViewGroup.MarginLayoutParams marginLayoutParams, int n3, int n4, View view, f f5) {
        return SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, n3, n4, view, f5);
    }

    public static /* synthetic */ boolean c(SearchView searchView, View view, MotionEvent motionEvent) {
        return searchView.lambda$setUpContentOnTouchListener$3(view, motionEvent);
    }

    public static /* synthetic */ void d(SearchView searchView) {
        searchView.lambda$clearFocusAndHideKeyboard$9();
    }

    public static /* synthetic */ void e(SearchView searchView) {
        searchView.lambda$requestFocusAndShowKeyboard$8();
    }

    public static /* synthetic */ void f(SearchView searchView, View view) {
        searchView.lambda$setUpClearButton$2(view);
    }

    public static /* synthetic */ f g(SearchView searchView, View view, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        return searchView.lambda$setUpToolbarInsetListener$4(view, f5, viewUtils$RelativePadding);
    }

    private Window getActivityWindow() {
        Object object = ContextUtils.getActivity(this.getContext());
        object = object == null ? null : object.getWindow();
        return object;
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        searchBar = this.getResources();
        int n3 = R$dimen.m3_searchview_elevation;
        return searchBar.getDimension(n3);
    }

    private int getStatusBarHeight() {
        String string2;
        String string3;
        String string4;
        Resources resources = this.getResources();
        int n3 = resources.getIdentifier(string4 = "status_bar_height", string3 = "dimen", string2 = "android");
        if (n3 > 0) {
            return this.getResources().getDimensionPixelSize(n3);
        }
        return 0;
    }

    public static /* synthetic */ f h(SearchView searchView, View view, f f5) {
        return searchView.lambda$setUpStatusBarSpacerInsetListener$5(view, f5);
    }

    public static /* synthetic */ boolean i(View view, MotionEvent motionEvent) {
        return SearchView.lambda$setUpRootView$0(view, motionEvent);
    }

    private boolean isHiddenOrHiding() {
        SearchView$TransitionState searchView$TransitionState = this.currentTransitionState;
        SearchView$TransitionState searchView$TransitionState2 = SearchView$TransitionState.HIDDEN;
        boolean bl2 = ((Object)((Object)searchView$TransitionState)).equals((Object)searchView$TransitionState2);
        if (!bl2 && !(bl2 = ((Object)((Object)(searchView$TransitionState = this.currentTransitionState))).equals((Object)(searchView$TransitionState2 = SearchView$TransitionState.HIDING)))) {
            bl2 = false;
            searchView$TransitionState = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isNavigationIconDrawerArrowDrawable(Toolbar toolbar) {
        return ut0_0.g(toolbar.getNavigationIcon()) instanceof yu0_2;
    }

    public static /* synthetic */ void j(SearchView searchView, View view) {
        searchView.lambda$setUpBackButton$1(view);
    }

    private /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        searchBar = this.editText;
        boolean bl2 = this.useWindowInsetsController;
        ViewUtils.hideKeyboard((View)searchBar, bl2);
    }

    private /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        EditText editText = this.editText;
        boolean bl3 = editText.requestFocus();
        if (bl3) {
            editText = this.editText;
            int bl2 = 8;
            editText.sendAccessibilityEvent(bl2);
        }
        editText = this.editText;
        boolean bl2 = this.useWindowInsetsController;
        ViewUtils.showKeyboard((View)editText, bl2);
    }

    private /* synthetic */ void lambda$setUpBackButton$1(View view) {
        this.hide();
    }

    private /* synthetic */ void lambda$setUpClearButton$2(View view) {
        this.clearText();
        this.requestFocusAndShowKeyboardIfNeeded();
    }

    private /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        boolean bl2 = this.isAdjustNothingSoftInputMode();
        if (bl2) {
            this.clearFocusAndHideKeyboard();
        }
        return false;
    }

    private static /* synthetic */ f lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int n3, int n4, View view, f f5) {
        int n7;
        marginLayoutParams.leftMargin = n7 = f5.b() + n3;
        marginLayoutParams.rightMargin = n3 = f5.c() + n4;
        return f5;
    }

    private static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ f lambda$setUpStatusBarSpacerInsetListener$5(View view, f f5) {
        int bl2 = f5.d();
        this.setUpStatusBarSpacer(bl2);
        boolean bl3 = this.statusBarSpacerEnabledOverride;
        if (!bl3) {
            void var3_6;
            if (bl2 > 0) {
                boolean bl4 = true;
            } else {
                boolean bl5 = false;
            }
            this.setStatusBarSpacerEnabledInternal((boolean)var3_6);
        }
        return f5;
    }

    private /* synthetic */ f lambda$setUpToolbarInsetListener$4(View object, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        object = this.toolbar;
        int n3 = ViewUtils.isLayoutRtl(object);
        int n4 = n3 != 0 ? viewUtils$RelativePadding.end : viewUtils$RelativePadding.start;
        n3 = n3 != 0 ? viewUtils$RelativePadding.start : viewUtils$RelativePadding.end;
        MaterialToolbar materialToolbar = this.toolbar;
        int n7 = f5.b() + n4;
        n4 = viewUtils$RelativePadding.top;
        int n8 = f5.c() + n3;
        n3 = viewUtils$RelativePadding.bottom;
        materialToolbar.setPadding(n7, n4, n8, n3);
        return f5;
    }

    private /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        this.show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean n3) {
        View view = this.statusBarSpacer;
        n3 = n3 != 0 ? 0 : 8;
        view.setVisibility(n3);
    }

    private void setTransitionState(SearchView$TransitionState searchView$TransitionState, boolean bl2) {
        boolean bl3;
        SearchView$TransitionState searchView$TransitionState2;
        Object object = this.currentTransitionState;
        boolean bl4 = ((Object)object).equals((Object)searchView$TransitionState);
        if (bl4) {
            return;
        }
        if (bl2) {
            searchView$TransitionState2 = SearchView$TransitionState.SHOWN;
            if (searchView$TransitionState == searchView$TransitionState2) {
                bl2 = true;
                this.setModalForAccessibility(bl2);
            } else {
                searchView$TransitionState2 = SearchView$TransitionState.HIDDEN;
                if (searchView$TransitionState == searchView$TransitionState2) {
                    bl2 = false;
                    searchView$TransitionState2 = null;
                    this.setModalForAccessibility(false);
                }
            }
        }
        searchView$TransitionState2 = this.currentTransitionState;
        this.currentTransitionState = searchView$TransitionState;
        Object object2 = this.transitionListeners;
        object = new LinkedHashSet(object2);
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            object2 = (SearchView$TransitionListener)object.next();
            object2.onStateChanged(this, searchView$TransitionState2, searchView$TransitionState);
        }
        this.updateListeningForBackCallbacks(searchView$TransitionState);
    }

    private void setUpBackButton(boolean bl2, boolean n3) {
        if (n3 != 0) {
            this.toolbar.setNavigationIcon(null);
            return;
        }
        MaterialToolbar materialToolbar = this.toolbar;
        gw2_2 gw2_22 = new gw2_2(this);
        materialToolbar.setNavigationOnClickListener(gw2_22);
        if (bl2) {
            int n4;
            materialToolbar = this.getContext();
            yu0_2 yu0_22 = new yu0_2((Context)materialToolbar);
            n3 = R$attr.colorOnSurface;
            if ((n3 = MaterialColors.getColor((View)this, n3)) != (n4 = (gw2_22 = yu0_22.a).getColor())) {
                gw2_22.setColor(n3);
                yu0_22.invalidateSelf();
            }
            materialToolbar = this.toolbar;
            materialToolbar.setNavigationIcon(yu0_22);
        }
    }

    private void setUpBackgroundViewElevationOverlay() {
        float f5 = this.getOverlayElevation();
        this.setUpBackgroundViewElevationOverlay(f5);
    }

    private void setUpBackgroundViewElevationOverlay(float f5) {
        View view;
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider != null && (view = this.backgroundView) != null) {
            int n3 = this.backgroundColor;
            int n4 = elevationOverlayProvider.compositeOverlayIfNeeded(n3, f5);
            elevationOverlayProvider = this.backgroundView;
            elevationOverlayProvider.setBackgroundColor(n4);
        }
    }

    private void setUpClearButton() {
        ImageButton imageButton = this.clearButton;
        Object object = new hb_0(this, 1);
        imageButton.setOnClickListener((View.OnClickListener)object);
        imageButton = this.editText;
        object = new SearchView$1(this);
        imageButton.addTextChangedListener((TextWatcher)object);
    }

    private void setUpContentOnTouchListener() {
        TouchObserverFrameLayout touchObserverFrameLayout = this.contentContainer;
        mw2_0 mw2_02 = new mw2_0(this);
        touchObserverFrameLayout.setOnTouchListener(mw2_02);
    }

    private void setUpDividerInsetListener() {
        Object object = (ViewGroup.MarginLayoutParams)this.divider.getLayoutParams();
        int n3 = object.leftMargin;
        int n4 = object.rightMargin;
        View view = this.divider;
        iw2_2 iw2_22 = new iw2_2((ViewGroup.MarginLayoutParams)object, n3, n4);
        object = ViewCompat.a;
        ViewCompat$c.o(view, iw2_22);
    }

    private void setUpEditText(int n3, String string2, String string3) {
        int n4 = -1;
        if (n3 != n4) {
            EditText editText = this.editText;
            Hm3.f((TextView)editText, n3);
        }
        this.editText.setText((CharSequence)string2);
        this.editText.setHint((CharSequence)string3);
    }

    private void setUpHeaderLayout(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
            FrameLayout frameLayout = this.headerContainer;
            View view = layoutInflater.inflate(n3, (ViewGroup)frameLayout, false);
            this.addHeaderView(view);
        }
    }

    private void setUpInsetListeners() {
        this.setUpToolbarInsetListener();
        this.setUpDividerInsetListener();
        this.setUpStatusBarSpacerInsetListener();
    }

    private void setUpRootView() {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        lw2_1 lw2_12 = new Object();
        clippableRoundedCornerLayout.setOnTouchListener(lw2_12);
    }

    private void setUpStatusBarSpacer(int n3) {
        ViewGroup.LayoutParams layoutParams = this.statusBarSpacer.getLayoutParams();
        int n4 = layoutParams.height;
        if (n4 != n3) {
            layoutParams = this.statusBarSpacer.getLayoutParams();
            layoutParams.height = n3;
            View view = this.statusBarSpacer;
            view.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        int n3 = this.getStatusBarHeight();
        this.setUpStatusBarSpacer(n3);
        View view = this.statusBarSpacer;
        af0_0 af0_02 = new af0_0(this);
        ViewCompat$c.o(view, af0_02);
    }

    private void setUpToolbarInsetListener() {
        MaterialToolbar materialToolbar = this.toolbar;
        jw2_1 jw2_12 = new jw2_1(this);
        ViewUtils.doOnApplyWindowInsets((View)materialToolbar, jw2_12);
    }

    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean bl2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = viewGroup.getChildCount()); ++i3) {
            Object object;
            View view = viewGroup.getChildAt(i3);
            if (view == this) continue;
            int n4 = this.rootView.getId();
            Object object2 = view.findViewById(n4);
            if (object2 != null) {
                view = (ViewGroup)view;
                this.updateChildImportantForAccessibility((ViewGroup)view, bl2);
                continue;
            }
            if (!bl2) {
                object2 = this.childImportantForAccessibilityMap;
                if (object2 == null || (n4 = (int)(object2.containsKey(view) ? 1 : 0)) == 0) continue;
                object2 = (Integer)this.childImportantForAccessibilityMap.get(view);
                n4 = (Integer)object2;
                object = ViewCompat.a;
                view.setImportantForAccessibility(n4);
                continue;
            }
            object2 = this.childImportantForAccessibilityMap;
            int n7 = view.getImportantForAccessibility();
            object = n7;
            object2.put(view, object);
            object2 = ViewCompat.a;
            n4 = 4;
            view.setImportantForAccessibility(n4);
        }
    }

    private void updateListeningForBackCallbacks(SearchView$TransitionState object) {
        boolean bl2;
        Object object2 = this.searchBar;
        if (object2 != null && (bl2 = this.backHandlingEnabled)) {
            object2 = SearchView$TransitionState.SHOWN;
            bl2 = object.equals(object2);
            if (bl2) {
                object = this.backOrchestrator;
                ((MaterialBackOrchestrator)object).startListeningForBackCallbacks();
            } else {
                object2 = SearchView$TransitionState.HIDDEN;
                boolean bl3 = object.equals(object2);
                if (bl3) {
                    object = this.backOrchestrator;
                    ((MaterialBackOrchestrator)object).stopListeningForBackCallbacks();
                }
            }
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null) {
            return;
        }
        int n3 = this.isNavigationIconDrawerArrowDrawable(materialToolbar);
        if (n3 != 0) {
            return;
        }
        n3 = this.getDefaultNavigationIconResource();
        Object object = this.searchBar;
        if (object == null) {
            object = this.toolbar;
            ((Toolbar)object).setNavigationIcon(n3);
        } else {
            materialToolbar = ut0_0.h(xn.a(this.getContext(), n3).mutate());
            object = this.toolbar.getNavigationIconTint();
            if (object != null) {
                object = this.toolbar.getNavigationIconTint();
                int n4 = (Integer)object;
                materialToolbar.setTint(n4);
            }
            object = this.toolbar;
            Drawable drawable2 = this.searchBar.getNavigationIcon();
            FadeThroughDrawable fadeThroughDrawable = new FadeThroughDrawable(drawable2, (Drawable)materialToolbar);
            ((MaterialToolbar)object).setNavigationIcon(fadeThroughDrawable);
            this.updateNavigationIconProgressIfNeeded();
        }
    }

    private void updateNavigationIconProgressIfNeeded() {
        float f5;
        Object object = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (object == null) {
            return;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        int n3 = clippableRoundedCornerLayout.getVisibility();
        if (n3 == 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            clippableRoundedCornerLayout = null;
        }
        object = ut0_0.g(object.getDrawable());
        boolean bl2 = object instanceof yu0_2;
        if (bl2) {
            Object object2 = object;
            object2 = (yu0_2)((Object)object);
            float f6 = n3;
            ((yu0_2)((Object)object2)).b(f6);
        }
        if (bl2 = object instanceof FadeThroughDrawable) {
            object = (FadeThroughDrawable)((Object)object);
            f5 = n3;
            ((FadeThroughDrawable)((Object)object)).setProgress(f5);
        }
    }

    public void addHeaderView(View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(SearchView$TransitionListener searchView$TransitionListener) {
        this.transitionListeners.add(searchView$TransitionListener);
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        boolean bl2 = this.layoutInflated;
        if (bl2) {
            TouchObserverFrameLayout touchObserverFrameLayout = this.contentContainer;
            touchObserverFrameLayout.addView(view, n3, layoutParams);
        } else {
            super.addView(view, n3, layoutParams);
        }
    }

    public void cancelBackProgress() {
        int n3;
        Object object;
        int n4 = this.isHiddenOrHiding();
        if (n4 == 0 && (object = this.searchBar) != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            object = this.searchViewAnimationHelper;
            ((SearchViewAnimationHelper)object).cancelBackProgress();
        }
    }

    public void clearFocusAndHideKeyboard() {
        EditText editText = this.editText;
        hw2_2 hw2_22 = new hw2_2(this);
        editText.post((Runnable)hw2_22);
    }

    public void clearText() {
        this.editText.setText((CharSequence)"");
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    public CoordinatorLayout$Behavior getBehavior() {
        SearchView$Behavior searchView$Behavior = new SearchView$Behavior();
        return searchView$Behavior;
    }

    public SearchView$TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    public int getDefaultNavigationIconResource() {
        return R$drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getHint() {
        return this.editText.getHint();
    }

    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    public int getSoftInputMode() {
        return this.softInputMode;
    }

    public Editable getText() {
        return this.editText.getText();
    }

    public Toolbar getToolbar() {
        return this.toolbar;
    }

    public void handleBackInvoked() {
        SearchBar searchBar;
        boolean bl2 = this.isHiddenOrHiding();
        if (bl2) {
            return;
        }
        Object object = this.searchViewAnimationHelper.onHandleBackInvoked();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4 && (searchBar = this.searchBar) != null && object != null) {
            object = this.searchViewAnimationHelper;
            ((SearchViewAnimationHelper)object).finishBackProgress();
        } else {
            this.hide();
        }
    }

    public void hide() {
        Object object = this.currentTransitionState;
        SearchView$TransitionState searchView$TransitionState = SearchView$TransitionState.HIDDEN;
        boolean bl2 = ((Object)object).equals((Object)searchView$TransitionState);
        if (!bl2 && !(bl2 = ((Object)(object = this.currentTransitionState)).equals((Object)(searchView$TransitionState = SearchView$TransitionState.HIDING)))) {
            object = this.searchViewAnimationHelper;
            ((SearchViewAnimationHelper)object).hide();
        }
    }

    public void inflateMenu(int n3) {
        this.toolbar.inflateMenu(n3);
    }

    public boolean isAdjustNothingSoftInputMode() {
        int n3 = this.softInputMode;
        int n4 = 48;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        boolean bl2;
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            bl2 = true;
        } else {
            bl2 = false;
            searchBar = null;
        }
        return bl2;
    }

    public boolean isShowing() {
        SearchView$TransitionState searchView$TransitionState = this.currentTransitionState;
        SearchView$TransitionState searchView$TransitionState2 = SearchView$TransitionState.SHOWN;
        boolean bl2 = ((Object)((Object)searchView$TransitionState)).equals((Object)searchView$TransitionState2);
        if (!bl2 && !(bl2 = ((Object)((Object)(searchView$TransitionState = this.currentTransitionState))).equals((Object)(searchView$TransitionState2 = SearchView$TransitionState.SHOWING)))) {
            bl2 = false;
            searchView$TransitionState = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.updateSoftInputMode();
    }

    /*
     * WARNING - void declaration
     */
    public void onRestoreInstanceState(Parcelable parcelable) {
        void var4_7;
        boolean bl2 = parcelable instanceof SearchView$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SearchView$SavedState)parcelable;
        Object object = parcelable.getSuperState();
        super.onRestoreInstanceState(object);
        object = parcelable.text;
        this.setText((CharSequence)object);
        int bl3 = parcelable.visibility;
        if (bl3 == 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            parcelable = null;
        }
        this.setVisible((boolean)var4_7);
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Object object = super.onSaveInstanceState();
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState((Parcelable)object);
        object = this.getText();
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            object = object.toString();
        }
        searchView$SavedState.text = object;
        searchView$SavedState.visibility = n3 = this.rootView.getVisibility();
        return searchView$SavedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(View view) {
        FrameLayout frameLayout = this.headerContainer;
        frameLayout.removeView(view);
        view = this.headerContainer;
        int n3 = view.getChildCount();
        if (n3 == 0) {
            view = this.headerContainer;
            int n4 = 8;
            view.setVisibility(n4);
        }
    }

    public void removeTransitionListener(SearchView$TransitionListener searchView$TransitionListener) {
        this.transitionListeners.remove(searchView$TransitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        EditText editText = this.editText;
        Tt1 tt1 = new Tt1(this, 2);
        editText.postDelayed((Runnable)tt1, (long)100);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        boolean bl2 = this.autoShowKeyboard;
        if (bl2) {
            this.requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean bl2) {
        this.animatedNavigationIcon = bl2;
    }

    public void setAutoShowKeyboard(boolean bl2) {
        this.autoShowKeyboard = bl2;
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        this.setUpBackgroundViewElevationOverlay(f5);
    }

    public void setHint(int n3) {
        this.editText.setHint(n3);
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean bl2) {
        this.animatedMenuItems = bl2;
    }

    public void setModalForAccessibility(boolean bl2) {
        ViewGroup viewGroup = (ViewGroup)this.getRootView();
        if (bl2) {
            HashMap hashMap;
            int n3 = viewGroup.getChildCount();
            this.childImportantForAccessibilityMap = hashMap = new HashMap(n3);
        }
        this.updateChildImportantForAccessibility(viewGroup, bl2);
        if (!bl2) {
            bl2 = false;
            this.childImportantForAccessibilityMap = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar$f toolbar$f) {
        this.toolbar.setOnMenuItemClickListener(toolbar$f);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        TextView textView = this.searchPrefix;
        int n3 = TextUtils.isEmpty((CharSequence)charSequence);
        if (n3 != 0) {
            n3 = 8;
        } else {
            n3 = 0;
            charSequence = null;
        }
        textView.setVisibility(n3);
    }

    public void setStatusBarSpacerEnabled(boolean bl2) {
        this.statusBarSpacerEnabledOverride = true;
        this.setStatusBarSpacerEnabledInternal(bl2);
    }

    public void setText(int n3) {
        this.editText.setText(n3);
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean bl2) {
        this.toolbar.setTouchscreenBlocksFocus(bl2);
    }

    public void setTransitionState(SearchView$TransitionState searchView$TransitionState) {
        this.setTransitionState(searchView$TransitionState, true);
    }

    public void setUseWindowInsetsController(boolean bl2) {
        this.useWindowInsetsController = bl2;
    }

    public void setVisible(boolean n3) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        int n4 = clippableRoundedCornerLayout.getVisibility();
        boolean bl2 = true;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            clippableRoundedCornerLayout = null;
        }
        Object object = this.rootView;
        int n7 = n3 != 0 ? 0 : 8;
        object.setVisibility(n7);
        this.updateNavigationIconProgressIfNeeded();
        object = n3 != 0 ? SearchView$TransitionState.SHOWN : SearchView$TransitionState.HIDDEN;
        if (n4 == n3) {
            bl2 = false;
        }
        this.setTransitionState((SearchView$TransitionState)((Object)object), bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setupWithSearchBar(SearchBar object) {
        this.searchBar = object;
        Object object2 = this.searchViewAnimationHelper;
        ((SearchViewAnimationHelper)object2).setSearchBar((SearchBar)object);
        if (object != null) {
            object2 = new oc0_0(this, 1);
            object.setOnClickListener((View.OnClickListener)object2);
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 34;
            if (n3 >= n4) {
                try {
                    object2 = new kw2_1(this);
                    ew2_2.a(object, (kw2_1)object2);
                    EditText editText = this.editText;
                    fw2_2.a(editText);
                }
                catch (LinkageError linkageError) {}
            }
        }
        this.updateNavigationIconIfNeeded();
        this.setUpBackgroundViewElevationOverlay();
        SearchView$TransitionState searchView$TransitionState = this.getCurrentTransitionState();
        this.updateListeningForBackCallbacks(searchView$TransitionState);
    }

    public void show() {
        Object object = this.currentTransitionState;
        SearchView$TransitionState searchView$TransitionState = SearchView$TransitionState.SHOWN;
        boolean bl2 = ((Object)object).equals((Object)searchView$TransitionState);
        if (!bl2 && !(bl2 = ((Object)(object = this.currentTransitionState)).equals((Object)(searchView$TransitionState = SearchView$TransitionState.SHOWING)))) {
            object = this.searchViewAnimationHelper;
            ((SearchViewAnimationHelper)object).show();
        }
    }

    public void startBackProgress(uu_0 uu_02) {
        Object object;
        boolean bl2 = this.isHiddenOrHiding();
        if (!bl2 && (object = this.searchBar) != null) {
            object = this.searchViewAnimationHelper;
            ((SearchViewAnimationHelper)object).startBackProgress(uu_02);
        }
    }

    public void updateBackProgress(uu_0 uu_02) {
        int n3;
        Object object;
        int n4 = this.isHiddenOrHiding();
        if (n4 == 0 && (object = this.searchBar) != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            object = this.searchViewAnimationHelper;
            ((SearchViewAnimationHelper)object).updateBackProgress(uu_02);
        }
    }

    public void updateSoftInputMode() {
        Window window = this.getActivityWindow();
        if (window != null) {
            int n3;
            window = window.getAttributes();
            this.softInputMode = n3 = window.softInputMode;
        }
    }
}

