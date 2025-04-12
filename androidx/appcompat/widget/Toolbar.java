/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Gravity
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar$LayoutParams;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ActionMenuView$d;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar$2;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import androidx.appcompat.widget.Toolbar$SavedState;
import androidx.appcompat.widget.Toolbar$a;
import androidx.appcompat.widget.Toolbar$b;
import androidx.appcompat.widget.Toolbar$c;
import androidx.appcompat.widget.Toolbar$d;
import androidx.appcompat.widget.Toolbar$e;
import androidx.appcompat.widget.Toolbar$f;
import androidx.appcompat.widget.d;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.i$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toolbar
extends ViewGroup
implements WN1 {
    private static final String TAG = "Toolbar";
    private h$a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private rQ2 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private Toolbar$e mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    d$a mMenuBuilderCallback;
    final ZN1 mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView$d mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    Toolbar$f mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private d mWrapper;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.toolbarStyle;
        this(context, attributeSet, n3);
    }

    public Toolbar(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        this.mGravity = 8388627;
        Object object2 = new ArrayList();
        this.mTempViews = object2;
        object2 = new ArrayList();
        this.mHiddenViews = object2;
        int n4 = 2;
        object2 = new int[n4];
        this.mTempMargins = (int[])object2;
        Object object3 = new fa_1(this, 2);
        this.mMenuHostHelper = object2 = new ZN1((Runnable)object3);
        object2 = new ArrayList();
        this.mProvidedMenuItems = object2;
        this.mMenuViewItemClickListener = object2 = new Toolbar$a(this);
        this.mShowOverflowMenuRunnable = object2 = new Toolbar$2(this);
        object2 = this.getContext();
        object3 = R$styleable.Toolbar;
        object2 = Tn3.f((Context)object2, attributeSet, (int[])object3, n3, 0);
        Object object4 = R$styleable.Toolbar;
        TypedArray typedArray = ((Tn3)object2).b;
        ViewCompat.r((View)this, object, (int[])object4, attributeSet, typedArray, n3, 0);
        int n7 = R$styleable.Toolbar_titleTextAppearance;
        attributeSet = ((Tn3)object2).b;
        this.mTitleTextAppearance = n7 = attributeSet.getResourceId(n7, 0);
        n7 = R$styleable.Toolbar_subtitleTextAppearance;
        this.mSubtitleTextAppearance = n7 = attributeSet.getResourceId(n7, 0);
        n7 = R$styleable.Toolbar_android_gravity;
        n3 = this.mGravity;
        this.mGravity = n7 = attributeSet.getInteger(n7, n3);
        n7 = R$styleable.Toolbar_buttonGravity;
        this.mButtonGravity = n7 = attributeSet.getInteger(n7, 48);
        n7 = R$styleable.Toolbar_titleMargin;
        n7 = attributeSet.getDimensionPixelOffset(n7, 0);
        n3 = R$styleable.Toolbar_titleMargins;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.Toolbar_titleMargins;
            n7 = attributeSet.getDimensionPixelOffset(n3, n7);
        }
        this.mTitleMarginBottom = n7;
        this.mTitleMarginTop = n7;
        this.mTitleMarginEnd = n7;
        this.mTitleMarginStart = n7;
        n7 = R$styleable.Toolbar_titleMarginStart;
        n3 = -1;
        if ((n7 = attributeSet.getDimensionPixelOffset(n7, n3)) >= 0) {
            this.mTitleMarginStart = n7;
        }
        n7 = R$styleable.Toolbar_titleMarginEnd;
        if ((n7 = attributeSet.getDimensionPixelOffset(n7, n3)) >= 0) {
            this.mTitleMarginEnd = n7;
        }
        n7 = R$styleable.Toolbar_titleMarginTop;
        if ((n7 = attributeSet.getDimensionPixelOffset(n7, n3)) >= 0) {
            this.mTitleMarginTop = n7;
        }
        n7 = R$styleable.Toolbar_titleMarginBottom;
        if ((n7 = attributeSet.getDimensionPixelOffset(n7, n3)) >= 0) {
            this.mTitleMarginBottom = n7;
        }
        n7 = R$styleable.Toolbar_maxButtonHeight;
        this.mMaxButtonHeight = n7 = attributeSet.getDimensionPixelSize(n7, n3);
        n7 = R$styleable.Toolbar_contentInsetStart;
        n3 = -1 << -1;
        n7 = attributeSet.getDimensionPixelOffset(n7, n3);
        int n8 = R$styleable.Toolbar_contentInsetEnd;
        n8 = attributeSet.getDimensionPixelOffset(n8, n3);
        int n10 = R$styleable.Toolbar_contentInsetLeft;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        int n14 = R$styleable.Toolbar_contentInsetRight;
        n14 = attributeSet.getDimensionPixelSize(n14, 0);
        this.ensureContentInsets();
        object4 = this.mContentInsets;
        ((rQ2)object4).h = false;
        if (n10 != n3) {
            ((rQ2)object4).e = n10;
            ((rQ2)object4).a = n10;
        }
        if (n14 != n3) {
            ((rQ2)object4).f = n14;
            ((rQ2)object4).b = n14;
        }
        if (n7 != n3 || n8 != n3) {
            ((rQ2)object4).a(n7, n8);
        }
        n7 = R$styleable.Toolbar_contentInsetStartWithNavigation;
        this.mContentInsetStartWithNavigation = n7 = attributeSet.getDimensionPixelOffset(n7, n3);
        n7 = R$styleable.Toolbar_contentInsetEndWithActions;
        this.mContentInsetEndWithActions = n7 = attributeSet.getDimensionPixelOffset(n7, n3);
        n7 = R$styleable.Toolbar_collapseIcon;
        object = ((Tn3)object2).b(n7);
        this.mCollapseIcon = object;
        n7 = R$styleable.Toolbar_collapseContentDescription;
        object = attributeSet.getText(n7);
        this.mCollapseDescription = object;
        n7 = R$styleable.Toolbar_title;
        object = attributeSet.getText(n7);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n3 == 0) {
            this.setTitle((CharSequence)object);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object = attributeSet.getText(n7 = R$styleable.Toolbar_subtitle))) ? 1 : 0)) == 0) {
            this.setSubtitle((CharSequence)object);
        }
        this.mPopupContext = object = this.getContext();
        n7 = R$styleable.Toolbar_popupTheme;
        n7 = attributeSet.getResourceId(n7, 0);
        this.setPopupTheme(n7);
        n7 = R$styleable.Toolbar_navigationIcon;
        object = ((Tn3)object2).b(n7);
        if (object != null) {
            this.setNavigationIcon((Drawable)object);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object = attributeSet.getText(n7 = R$styleable.Toolbar_navigationContentDescription))) ? 1 : 0)) == 0) {
            this.setNavigationContentDescription((CharSequence)object);
        }
        if ((object = ((Tn3)object2).b(n7 = R$styleable.Toolbar_logo)) != null) {
            this.setLogo((Drawable)object);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object = attributeSet.getText(n7 = R$styleable.Toolbar_logoDescription))) ? 1 : 0)) == 0) {
            this.setLogoDescription((CharSequence)object);
        }
        n7 = R$styleable.Toolbar_titleTextColor;
        if ((n7 = (int)(attributeSet.hasValue(n7) ? 1 : 0)) != 0) {
            n7 = R$styleable.Toolbar_titleTextColor;
            object = ((Tn3)object2).a(n7);
            this.setTitleTextColor((ColorStateList)object);
        }
        n7 = R$styleable.Toolbar_subtitleTextColor;
        if ((n7 = (int)(attributeSet.hasValue(n7) ? 1 : 0)) != 0) {
            n7 = R$styleable.Toolbar_subtitleTextColor;
            object = ((Tn3)object2).a(n7);
            this.setSubtitleTextColor((ColorStateList)object);
        }
        n7 = R$styleable.Toolbar_menu;
        if ((n7 = (int)(attributeSet.hasValue(n7) ? 1 : 0)) != 0) {
            n7 = R$styleable.Toolbar_menu;
            n7 = attributeSet.getResourceId(n7, 0);
            this.inflateMenu(n7);
        }
        ((Tn3)object2).g();
    }

    private void addCustomViewsWithGravity(List list, int n3) {
        View view;
        int n4 = this.getLayoutDirection();
        int n7 = 0;
        Toolbar$LayoutParams toolbar$LayoutParams = null;
        int n8 = 1;
        if (n4 == n8) {
            n4 = 1;
        } else {
            n4 = 0;
            view = null;
        }
        int n10 = this.getChildCount();
        int n14 = this.getLayoutDirection();
        n3 = Gravity.getAbsoluteGravity((int)n3, (int)n14);
        list.clear();
        if (n4 != 0) {
            n10 -= n8;
            while (n10 >= 0) {
                view = this.getChildAt(n10);
                toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
                n8 = toolbar$LayoutParams.b;
                if (n8 == 0 && (n8 = (int)(this.shouldLayout(view) ? 1 : 0)) != 0) {
                    n7 = toolbar$LayoutParams.a;
                    if ((n7 = this.getChildHorizontalGravity(n7)) == n3) {
                        list.add(view);
                    }
                }
                n10 += -1;
            }
        } else {
            while (n7 < n10) {
                view = this.getChildAt(n7);
                Toolbar$LayoutParams toolbar$LayoutParams2 = (Toolbar$LayoutParams)view.getLayoutParams();
                n14 = toolbar$LayoutParams2.b;
                if (n14 == 0 && (n14 = (int)(this.shouldLayout(view) ? 1 : 0)) != 0) {
                    n8 = toolbar$LayoutParams2.a;
                    if ((n8 = this.getChildHorizontalGravity(n8)) == n3) {
                        list.add(view);
                    }
                }
                ++n7;
            }
        }
    }

    private void addSystemView(View view, boolean bl2) {
        Object object;
        boolean bl3;
        Object object2 = view.getLayoutParams();
        object2 = object2 == null ? this.generateDefaultLayoutParams() : (!(bl3 = this.checkLayoutParams((ViewGroup.LayoutParams)object2)) ? this.generateLayoutParams((ViewGroup.LayoutParams)object2) : (Toolbar$LayoutParams)((Object)object2));
        bl3 = true;
        object2.b = (int)(bl3 ? 1 : 0);
        if (bl2 && (object = this.mExpandedActionView) != null) {
            view.setLayoutParams(object2);
            object = this.mHiddenViews;
            ((ArrayList)object).add(view);
        } else {
            this.addView(view, (ViewGroup.LayoutParams)object2);
        }
    }

    private void ensureContentInsets() {
        rQ2 rQ22 = this.mContentInsets;
        if (rQ22 == null) {
            int n3;
            rQ22 = new Object();
            rQ22.a = 0;
            rQ22.b = 0;
            rQ22.c = n3 = -1 << -1;
            rQ22.d = n3;
            rQ22.e = 0;
            rQ22.f = 0;
            rQ22.g = false;
            rQ22.h = false;
            this.mContentInsets = rQ22;
        }
    }

    private void ensureLogoView() {
        ImageView imageView = this.mLogoView;
        if (imageView == null) {
            Context context = this.getContext();
            this.mLogoView = imageView = new AppCompatImageView(context);
        }
    }

    private void ensureMenu() {
        this.ensureMenuView();
        Object object = this.mMenuView;
        Object object2 = ((ActionMenuView)object).a;
        if (object2 == null) {
            object = (androidx.appcompat.view.menu.d)((ActionMenuView)object).getMenu();
            object2 = this.mExpandedMenuPresenter;
            if (object2 == null) {
                this.mExpandedMenuPresenter = object2 = new Toolbar$e(this);
            }
            object2 = this.mMenuView;
            boolean bl2 = true;
            ((ActionMenuView)object2).setExpandedActionViewsExclusive(bl2);
            object2 = this.mExpandedMenuPresenter;
            Context context = this.mPopupContext;
            ((androidx.appcompat.view.menu.d)object).addMenuPresenter((h)object2, context);
            this.updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        Object object = this.mMenuView;
        if (object == null) {
            Object object2 = this.getContext();
            this.mMenuView = object = new ActionMenuView((Context)object2);
            int n3 = this.mPopupTheme;
            object.setPopupTheme(n3);
            object = this.mMenuView;
            object2 = this.mMenuViewItemClickListener;
            object.setOnMenuItemClickListener((ActionMenuView$d)object2);
            object = this.mMenuView;
            object2 = this.mActionMenuPresenterCallback;
            Toolbar$b toolbar$b = new Toolbar$b(this);
            object.setMenuCallbacks((h$a)object2, toolbar$b);
            object = this.generateDefaultLayoutParams();
            n3 = this.mButtonGravity & 0x70;
            int n4 = 0x800005;
            ((ActionBar$LayoutParams)((Object)object)).a = n3 |= n4;
            this.mMenuView.setLayoutParams((ViewGroup.LayoutParams)object);
            object = this.mMenuView;
            n3 = 0;
            object2 = null;
            this.addSystemView((View)object, false);
        }
    }

    private void ensureNavButtonView() {
        Object object = this.mNavButtonView;
        if (object == null) {
            Context context = this.getContext();
            int n3 = R$attr.toolbarNavigationButtonStyle;
            this.mNavButtonView = object = new AppCompatImageButton(context, null, n3);
            object = this.generateDefaultLayoutParams();
            int n4 = this.mButtonGravity & 0x70;
            int n7 = 0x800003;
            object.a = n4 |= n7;
            context = this.mNavButtonView;
            context.setLayoutParams((ViewGroup.LayoutParams)object);
        }
    }

    private int getChildHorizontalGravity(int n3) {
        int n4;
        int n7;
        int n8;
        int n10 = this.getLayoutDirection();
        if ((n3 = Gravity.getAbsoluteGravity((int)n3, (int)n10) & 7) != (n8 = 1) && n3 != (n7 = 3) && n3 != (n4 = 5)) {
            if (n10 == n8) {
                n7 = 5;
            }
            return n7;
        }
        return n3;
    }

    private int getChildTop(View view, int n3) {
        int n4;
        Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
        int n7 = view.getMeasuredHeight();
        int n8 = 0;
        n3 = n3 > 0 ? (n7 - n3) / 2 : 0;
        int n10 = toolbar$LayoutParams.a;
        if ((n10 = this.getChildVerticalGravity(n10)) != (n4 = 48)) {
            n4 = 80;
            if (n10 != n4) {
                int n14;
                n3 = this.getPaddingTop();
                n10 = this.getPaddingBottom();
                n4 = this.getHeight();
                int n15 = (n4 - n3 - n10 - n7) / 2;
                if (n15 < (n14 = toolbar$LayoutParams.topMargin)) {
                    n15 = n14;
                } else if ((n4 = n4 - n10 - n7 - n15 - n3) < (n7 = toolbar$LayoutParams.bottomMargin)) {
                    n15 -= (n7 -= n4);
                    n15 = Math.max(0, n15);
                }
                return n3 + n15;
            }
            n8 = this.getHeight();
            n10 = this.getPaddingBottom();
            n8 = n8 - n10 - n7;
            n7 = toolbar$LayoutParams.bottomMargin;
            return n8 - n7 - n3;
        }
        return this.getPaddingTop() - n3;
    }

    private int getChildVerticalGravity(int n3) {
        int n4 = 16;
        if ((n3 &= 0x70) != n4 && n3 != (n4 = 48) && n3 != (n4 = 80)) {
            n3 = this.mGravity & 0x70;
        }
        return n3;
    }

    private ArrayList getCurrentMenuItems() {
        int n3;
        ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
        Menu menu2 = this.getMenu();
        for (int i3 = 0; i3 < (n3 = menu2.size()); ++i3) {
            MenuItem menuItem = menu2.getItem(i3);
            arrayList.add(menuItem);
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n3 = view.getMarginStart();
        return view.getMarginEnd() + n3;
    }

    private MenuInflater getMenuInflater() {
        Context context = this.getContext();
        vg3_1 vg3_12 = new vg3_1(context);
        return vg3_12;
    }

    private int getVerticalMargins(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n3 = view.topMargin;
        int n4 = view.bottomMargin;
        return n3 + n4;
    }

    private int getViewListMeasuredWidth(List list, int[] nArray) {
        int n3 = nArray[0];
        int n4 = nArray[1];
        int n7 = list.size();
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            View view = (View)list.get(i3);
            Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
            int n10 = toolbar$LayoutParams.leftMargin - n3;
            n3 = toolbar$LayoutParams.rightMargin - n4;
            n4 = Math.max(0, n10);
            int n14 = Math.max(0, n3);
            n10 = -n10;
            n10 = Math.max(0, n10);
            n3 = -n3;
            n3 = Math.max(0, n3);
            int n15 = view.getMeasuredWidth() + n4 + n14;
            n8 += n15;
            n4 = n3;
            n3 = n10;
        }
        return n8;
    }

    private boolean isChildOrHidden(View view) {
        boolean bl2;
        Object object = view.getParent();
        if (object != this && !(bl2 = ((ArrayList)(object = this.mHiddenViews)).contains(view))) {
            bl2 = false;
            view = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private int layoutChildLeft(View view, int n3, int[] nArray, int n4) {
        Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
        int n7 = toolbar$LayoutParams.leftMargin;
        int n8 = nArray[0];
        n7 -= n8;
        n8 = Math.max(0, n7) + n3;
        n3 = -n7;
        nArray[0] = n3 = Math.max(0, n3);
        n3 = this.getChildTop(view, n4);
        int n10 = view.getMeasuredWidth();
        n4 = n8 + n10;
        n7 = view.getMeasuredHeight() + n3;
        view.layout(n8, n3, n4, n7);
        int n14 = toolbar$LayoutParams.rightMargin;
        return n10 + n14 + n8;
    }

    private int layoutChildRight(View view, int n3, int[] nArray, int n4) {
        Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
        int n7 = toolbar$LayoutParams.rightMargin;
        int n8 = 1;
        int n10 = nArray[n8];
        int n14 = Math.max(0, n7 -= n10);
        n7 = -n7;
        nArray[n8] = n7 = Math.max(0, n7);
        int n15 = this.getChildTop(view, n4);
        n4 = view.getMeasuredWidth();
        n7 = (n3 -= n14) - n4;
        n8 = view.getMeasuredHeight() + n15;
        view.layout(n7, n15, n3, n8);
        int n16 = toolbar$LayoutParams.leftMargin;
        return n3 - (n4 += n16);
    }

    private int measureChildCollapseMargins(View view, int n3, int n4, int n7, int n8, int[] nArray) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n10 = marginLayoutParams.leftMargin;
        int n14 = nArray[0];
        n10 -= n14;
        n14 = marginLayoutParams.rightMargin;
        int n15 = 1;
        int n16 = nArray[n15];
        n14 -= n16;
        n16 = Math.max(0, n10);
        int n17 = Math.max(0, n14) + n16;
        n10 = -n10;
        nArray[0] = n10 = Math.max(0, n10);
        n10 = -n14;
        nArray[n15] = n10 = Math.max(0, n10);
        int n18 = this.getPaddingLeft();
        n10 = this.getPaddingRight() + n18 + n17 + n4;
        n4 = marginLayoutParams.width;
        n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)n10, (int)n4);
        n4 = this.getPaddingTop();
        n18 = this.getPaddingBottom() + n4;
        n4 = marginLayoutParams.topMargin;
        n18 += n4;
        n4 = marginLayoutParams.bottomMargin;
        n18 = n18 + n4 + n8;
        n4 = marginLayoutParams.height;
        n4 = ViewGroup.getChildMeasureSpec((int)n7, (int)n18, (int)n4);
        view.measure(n3, n4);
        return view.getMeasuredWidth() + n17;
    }

    private void measureChildConstrained(View view, int n3, int n4, int n7, int n8, int n10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n14 = this.getPaddingLeft();
        int n15 = this.getPaddingRight() + n14;
        n14 = marginLayoutParams.leftMargin;
        n15 += n14;
        n14 = marginLayoutParams.rightMargin;
        n15 = n15 + n14 + n4;
        n4 = marginLayoutParams.width;
        n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)n15, (int)n4);
        n4 = this.getPaddingTop();
        n14 = this.getPaddingBottom() + n4;
        n4 = marginLayoutParams.topMargin;
        n14 += n4;
        n4 = marginLayoutParams.bottomMargin;
        n14 = n14 + n4 + n8;
        n4 = marginLayoutParams.height;
        if ((n7 = View.MeasureSpec.getMode((int)(n4 = ViewGroup.getChildMeasureSpec((int)n7, (int)n14, (int)n4)))) != (n8 = 0x40000000) && n10 >= 0) {
            if (n7 != 0) {
                n4 = View.MeasureSpec.getSize((int)n4);
                n10 = Math.min(n4, n10);
            }
            n4 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)n8);
        }
        view.measure(n3, n4);
    }

    private void onCreateMenu() {
        boolean bl2;
        Object object = this.getMenu();
        ArrayList arrayList = this.getCurrentMenuItems();
        Object object2 = this.mMenuHostHelper;
        MenuInflater menuInflater = this.getMenuInflater();
        object2 = ((ZN1)object2).b.iterator();
        while (bl2 = object2.hasNext()) {
            fo1_0 fo1_02 = (fo1_0)object2.next();
            fo1_02.d((Menu)object, menuInflater);
        }
        object = this.getCurrentMenuItems();
        ((ArrayList)object).removeAll(arrayList);
        this.mProvidedMenuItems = object;
    }

    private void postShowOverflowMenu() {
        Runnable runnable2 = this.mShowOverflowMenuRunnable;
        this.removeCallbacks(runnable2);
        runnable2 = this.mShowOverflowMenuRunnable;
        this.post(runnable2);
    }

    private boolean shouldCollapse() {
        int n3 = this.mCollapsible;
        if (n3 == 0) {
            return false;
        }
        n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            View view = this.getChildAt(i3);
            int n7 = this.shouldLayout(view);
            if (n7 == 0 || (n7 = view.getMeasuredWidth()) <= 0 || (n4 = view.getMeasuredHeight()) <= 0) continue;
            return false;
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        int n3;
        int n4;
        ViewParent viewParent;
        if (view != null && (viewParent = view.getParent()) == this && (n4 = view.getVisibility()) != (n3 = 8)) {
            n4 = 1;
        } else {
            n4 = 0;
            view = null;
        }
        return n4 != 0;
    }

    public void addChildrenForExpandedActionView() {
        ArrayList arrayList = this.mHiddenViews;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            View view = (View)this.mHiddenViews.get(i3);
            this.addView(view);
        }
        this.mHiddenViews.clear();
    }

    public void addMenuProvider(fo1_0 fo1_02) {
        ZN1 zN1 = this.mMenuHostHelper;
        zN1.b.add(fo1_02);
        zN1.a.run();
    }

    public void addMenuProvider(fo1_0 fo1_02, mu1_1 mu1_12) {
        this.mMenuHostHelper.a(fo1_02, mu1_12);
    }

    public void addMenuProvider(fo1_0 fo1_02, mu1_1 mu1_12, i$b i$b) {
        this.mMenuHostHelper.b(fo1_02, mu1_12, i$b);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        int n3 = this.getVisibility();
        if (!n3 && (actionMenuView = this.mMenuView) != null && (n3 = actionMenuView.d)) {
            n3 = 1;
        } else {
            n3 = 0;
            actionMenuView = null;
        }
        return n3 != 0;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = super.checkLayoutParams(layoutParams);
        if (bl3 && (bl2 = layoutParams instanceof Toolbar$LayoutParams)) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public void collapseActionView() {
        Object object = this.mExpandedMenuPresenter;
        object = object == null ? null : ((Toolbar$e)object).b;
        if (object != null) {
            ((f)object).collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        Object object = this.mMenuView;
        if (object != null && (object = ((ActionMenuView)object).e) != null) {
            boolean bl2;
            ((ActionMenuPresenter)object).b();
            object = ((ActionMenuPresenter)object).u;
            if (object != null && (bl2 = ((g)object).b())) {
                object = ((g)object).j;
                object.dismiss();
            }
        }
    }

    public void ensureCollapseButtonView() {
        Object object = this.mCollapseButtonView;
        if (object == null) {
            Object object2 = this.getContext();
            int n3 = R$attr.toolbarNavigationButtonStyle;
            this.mCollapseButtonView = object = new AppCompatImageButton((Context)object2, null, n3);
            object2 = this.mCollapseIcon;
            object.setImageDrawable((Drawable)object2);
            object = this.mCollapseButtonView;
            object2 = this.mCollapseDescription;
            object.setContentDescription((CharSequence)object2);
            object = this.generateDefaultLayoutParams();
            int n4 = this.mButtonGravity & 0x70;
            int n7 = 0x800003;
            object.a = n4 |= n7;
            object.b = n4 = 2;
            this.mCollapseButtonView.setLayoutParams((ViewGroup.LayoutParams)object);
            object = this.mCollapseButtonView;
            object2 = new Toolbar$c(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }

    public Toolbar$LayoutParams generateDefaultLayoutParams() {
        int n3 = -2;
        Toolbar$LayoutParams toolbar$LayoutParams = new ViewGroup.MarginLayoutParams(n3, n3);
        toolbar$LayoutParams.b = 0;
        toolbar$LayoutParams.a = 8388627;
        return toolbar$LayoutParams;
    }

    public Toolbar$LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        Toolbar$LayoutParams toolbar$LayoutParams = new Toolbar$LayoutParams(context, attributeSet);
        return toolbar$LayoutParams;
    }

    public Toolbar$LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        boolean bl2 = object instanceof Toolbar$LayoutParams;
        int n3 = 0;
        if (bl2) {
            int n4;
            object = (Toolbar$LayoutParams)((Object)object);
            Toolbar$LayoutParams toolbar$LayoutParams = new ActionBar$LayoutParams((ActionBar$LayoutParams)((Object)object));
            toolbar$LayoutParams.b = 0;
            toolbar$LayoutParams.b = n4 = object.b;
            return toolbar$LayoutParams;
        }
        bl2 = object instanceof ActionBar$LayoutParams;
        if (bl2) {
            object = (ActionBar$LayoutParams)((Object)object);
            Toolbar$LayoutParams toolbar$LayoutParams = new ActionBar$LayoutParams((ActionBar$LayoutParams)((Object)object));
            toolbar$LayoutParams.b = 0;
            return toolbar$LayoutParams;
        }
        bl2 = object instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            int n7;
            object = (ViewGroup.MarginLayoutParams)object;
            Toolbar$LayoutParams toolbar$LayoutParams = new ActionBar$LayoutParams((ViewGroup.LayoutParams)object);
            toolbar$LayoutParams.b = 0;
            toolbar$LayoutParams.leftMargin = n3 = object.leftMargin;
            toolbar$LayoutParams.topMargin = n3 = object.topMargin;
            toolbar$LayoutParams.rightMargin = n3 = object.rightMargin;
            toolbar$LayoutParams.bottomMargin = n7 = object.bottomMargin;
            return toolbar$LayoutParams;
        }
        Toolbar$LayoutParams toolbar$LayoutParams = new ActionBar$LayoutParams((ViewGroup.LayoutParams)object);
        toolbar$LayoutParams.b = 0;
        return toolbar$LayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        Object object = this.mCollapseButtonView;
        object = object != null ? object.getContentDescription() : null;
        return object;
    }

    public Drawable getCollapseIcon() {
        Object object = this.mCollapseButtonView;
        object = object != null ? object.getDrawable() : null;
        return object;
    }

    public int getContentInsetEnd() {
        int n3;
        rQ2 rQ22 = this.mContentInsets;
        if (rQ22 != null) {
            boolean bl2 = rQ22.g;
            n3 = bl2 ? rQ22.a : rQ22.b;
        } else {
            n3 = 0;
            rQ22 = null;
        }
        return n3;
    }

    public int getContentInsetEndWithActions() {
        int n3 = this.mContentInsetEndWithActions;
        int n4 = -1 << -1;
        if (n3 == n4) {
            n3 = this.getContentInsetEnd();
        }
        return n3;
    }

    public int getContentInsetLeft() {
        int n3;
        rQ2 rQ22 = this.mContentInsets;
        if (rQ22 != null) {
            n3 = rQ22.a;
        } else {
            n3 = 0;
            rQ22 = null;
        }
        return n3;
    }

    public int getContentInsetRight() {
        int n3;
        rQ2 rQ22 = this.mContentInsets;
        if (rQ22 != null) {
            n3 = rQ22.b;
        } else {
            n3 = 0;
            rQ22 = null;
        }
        return n3;
    }

    public int getContentInsetStart() {
        int n3;
        rQ2 rQ22 = this.mContentInsets;
        if (rQ22 != null) {
            boolean bl2 = rQ22.g;
            n3 = bl2 ? rQ22.b : rQ22.a;
        } else {
            n3 = 0;
            rQ22 = null;
        }
        return n3;
    }

    public int getContentInsetStartWithNavigation() {
        int n3 = this.mContentInsetStartWithNavigation;
        int n4 = -1 << -1;
        if (n3 == n4) {
            n3 = this.getContentInsetStart();
        }
        return n3;
    }

    public int getCurrentContentInsetEnd() {
        int n3;
        Object object = this.mMenuView;
        if (object != null && (object = ((ActionMenuView)object).a) != null && (n3 = (int)(((androidx.appcompat.view.menu.d)object).hasVisibleItems() ? 1 : 0)) != 0) {
            n3 = this.getContentInsetEnd();
            int n4 = Math.max(this.mContentInsetEndWithActions, 0);
            n3 = Math.max(n3, n4);
        } else {
            n3 = this.getContentInsetEnd();
        }
        return n3;
    }

    public int getCurrentContentInsetLeft() {
        int n3;
        int n4 = this.getLayoutDirection();
        n4 = n4 == (n3 = 1) ? this.getCurrentContentInsetEnd() : this.getCurrentContentInsetStart();
        return n4;
    }

    public int getCurrentContentInsetRight() {
        int n3;
        int n4 = this.getLayoutDirection();
        n4 = n4 == (n3 = 1) ? this.getCurrentContentInsetStart() : this.getCurrentContentInsetEnd();
        return n4;
    }

    public int getCurrentContentInsetStart() {
        int n3;
        Drawable drawable2 = this.getNavigationIcon();
        if (drawable2 != null) {
            n3 = this.getContentInsetStart();
            int n4 = Math.max(this.mContentInsetStartWithNavigation, 0);
            n3 = Math.max(n3, n4);
        } else {
            n3 = this.getContentInsetStart();
        }
        return n3;
    }

    public Drawable getLogo() {
        Object object = this.mLogoView;
        object = object != null ? object.getDrawable() : null;
        return object;
    }

    public CharSequence getLogoDescription() {
        Object object = this.mLogoView;
        object = object != null ? object.getContentDescription() : null;
        return object;
    }

    public Menu getMenu() {
        this.ensureMenu();
        return this.mMenuView.getMenu();
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        Object object = this.mNavButtonView;
        object = object != null ? object.getContentDescription() : null;
        return object;
    }

    public Drawable getNavigationIcon() {
        Object object = this.mNavButtonView;
        object = object != null ? object.getDrawable() : null;
        return object;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        this.ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public jj0 getWrapper() {
        d d2 = this.mWrapper;
        if (d2 == null) {
            boolean bl2 = true;
            this.mWrapper = d2 = new d(this, bl2);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        boolean bl2;
        Object object = this.mExpandedMenuPresenter;
        if (object != null && (object = ((Toolbar$e)object).b) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean hideOverflowMenu() {
        boolean bl2;
        Object object = this.mMenuView;
        if (object != null && (object = ((ActionMenuView)object).e) != null && (bl2 = ((ActionMenuPresenter)object).b())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void inflateMenu(int n3) {
        MenuInflater menuInflater = this.getMenuInflater();
        Menu menu2 = this.getMenu();
        menuInflater.inflate(n3, menu2);
    }

    public void invalidateMenu() {
        int n3;
        Iterator iterator = this.mProvidedMenuItems.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            MenuItem menuItem = (MenuItem)iterator.next();
            Menu menu2 = this.getMenu();
            n3 = menuItem.getItemId();
            menu2.removeItem(n3);
        }
        this.onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        boolean bl2;
        ActionMenuPresenter$OpenOverflowRunnable actionMenuPresenter$OpenOverflowRunnable;
        Object object = this.mMenuView;
        if (object != null && (object = ((ActionMenuView)object).e) != null && ((actionMenuPresenter$OpenOverflowRunnable = ((ActionMenuPresenter)object).v) != null || (bl2 = ((ActionMenuPresenter)object).c()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean isOverflowMenuShowing() {
        boolean bl2;
        Object object = this.mMenuView;
        if (object != null && (object = ((ActionMenuView)object).e) != null && (bl2 = ((ActionMenuPresenter)object).c())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean isTitleTruncated() {
        TextView textView = this.mTitleTextView;
        if (textView == null) {
            return false;
        }
        if ((textView = textView.getLayout()) == null) {
            return false;
        }
        int n3 = textView.getLineCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = textView.getEllipsisCount(i3);
            if (n4 <= 0) continue;
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.updateBackInvokedCallbackState();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable2 = this.mShowOverflowMenuRunnable;
        this.removeCallbacks(runnable2);
        this.updateBackInvokedCallbackState();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n3;
        int n4;
        int n7 = motionEvent.getActionMasked();
        if (n7 == (n4 = 9)) {
            this.mEatingHover = false;
        }
        boolean bl2 = this.mEatingHover;
        boolean bl3 = true;
        if (!bl2) {
            n3 = (int)(super.onHoverEvent(motionEvent) ? 1 : 0);
            if (n7 == n4 && n3 == 0) {
                this.mEatingHover = bl3;
            }
        }
        if (n7 == (n3 = 10) || n7 == (n3 = 3)) {
            this.mEatingHover = false;
        }
        return bl3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block54: {
            var6_6 = this;
            var7_7 = this.getLayoutDirection();
            var8_8 = 0;
            var9_9 = null;
            var10_10 = 1;
            if (var7_7 == var10_10) {
                var7_7 = 1;
            } else {
                var7_7 = 0;
                var11_11 /* !! */  = null;
            }
            var12_12 = this.getWidth();
            var13_13 = this.getHeight();
            var14_14 = this.getPaddingLeft();
            var15_15 = this.getPaddingRight();
            var16_16 = this.getPaddingTop();
            var17_17 = this.getPaddingBottom();
            var18_18 = var12_12 - var15_15;
            var19_19 = var6_6.mTempMargins;
            var19_19[var10_10] = 0;
            var19_19[0] = 0;
            var20_20 = this.getMinimumHeight();
            if (var20_20 >= 0) {
                var21_21 = var5_5 - var3_3;
                var20_20 = Math.min(var20_20, var21_21);
            } else {
                var20_20 = 0;
            }
            var22_22 = var6_6.mNavButtonView;
            var21_21 = (int)var6_6.shouldLayout((View)var22_22);
            if (var21_21 == 0) ** GOTO lbl41
            if (var7_7 != 0) {
                var22_22 = var6_6.mNavButtonView;
                var23_23 = var6_6.layoutChildRight((View)var22_22, var18_18, var19_19, var20_20);
                var21_21 = var14_14;
            } else {
                var22_22 = var6_6.mNavButtonView;
                var21_21 = var6_6.layoutChildLeft((View)var22_22, var14_14, var19_19, var20_20);
lbl38:
                // 2 sources

                while (true) {
                    var23_23 = var18_18;
                    break block54;
                    break;
                }
lbl41:
                // 1 sources

                var21_21 = var14_14;
                ** continue;
            }
        }
        var24_24 /* !! */  = var6_6.mCollapseButtonView;
        var25_25 = var6_6.shouldLayout((View)var24_24 /* !! */ );
        if (var25_25 != 0) {
            if (var7_7 != 0) {
                var24_24 /* !! */  = var6_6.mCollapseButtonView;
                var23_23 = var6_6.layoutChildRight((View)var24_24 /* !! */ , var23_23, var19_19, var20_20);
            } else {
                var24_24 /* !! */  = var6_6.mCollapseButtonView;
                var21_21 = var6_6.layoutChildLeft((View)var24_24 /* !! */ , var21_21, var19_19, var20_20);
            }
        }
        if ((var25_25 = var6_6.shouldLayout((View)(var24_24 /* !! */  = var6_6.mMenuView))) != 0) {
            if (var7_7 != 0) {
                var24_24 /* !! */  = var6_6.mMenuView;
                var21_21 = var6_6.layoutChildLeft((View)var24_24 /* !! */ , var21_21, var19_19, var20_20);
            } else {
                var24_24 /* !! */  = var6_6.mMenuView;
                var23_23 = var6_6.layoutChildRight((View)var24_24 /* !! */ , var23_23, var19_19, var20_20);
            }
        }
        var25_25 = this.getCurrentContentInsetLeft();
        var26_26 = this.getCurrentContentInsetRight();
        var10_10 = var25_25 - var21_21;
        var19_19[0] = var10_10 = Math.max(0, var10_10);
        var10_10 = var18_18 - var23_23;
        var10_10 = var26_26 - var10_10;
        var10_10 = Math.max(0, var10_10);
        var27_27 = 1;
        var19_19[var27_27] = var10_10;
        var10_10 = Math.max(var21_21, var25_25);
        var18_18 -= var26_26;
        var18_18 = Math.min(var23_23, var18_18);
        var22_22 = var6_6.mExpandedActionView;
        var21_21 = (int)var6_6.shouldLayout((View)var22_22);
        if (var21_21 != 0) {
            if (var7_7 != 0) {
                var22_22 = var6_6.mExpandedActionView;
                var18_18 = var6_6.layoutChildRight((View)var22_22, var18_18, var19_19, var20_20);
            } else {
                var22_22 = var6_6.mExpandedActionView;
                var10_10 = var6_6.layoutChildLeft((View)var22_22, var10_10, var19_19, var20_20);
            }
        }
        if ((var21_21 = (int)var6_6.shouldLayout((View)(var22_22 = var6_6.mLogoView))) != 0) {
            if (var7_7 != 0) {
                var22_22 = var6_6.mLogoView;
                var18_18 = var6_6.layoutChildRight((View)var22_22, var18_18, var19_19, var20_20);
            } else {
                var22_22 = var6_6.mLogoView;
                var10_10 = var6_6.layoutChildLeft((View)var22_22, var10_10, var19_19, var20_20);
            }
        }
        var22_22 = var6_6.mTitleTextView;
        var21_21 = (int)var6_6.shouldLayout((View)var22_22);
        var28_28 = var6_6.mSubtitleTextView;
        var23_23 = (int)var6_6.shouldLayout((View)var28_28);
        if (var21_21 != 0) {
            var24_24 /* !! */  = (Toolbar$LayoutParams)var6_6.mTitleTextView.getLayoutParams();
            var8_8 = var24_24 /* !! */ .topMargin;
            var4_4 = var15_15;
            var29_29 /* !! */  = var6_6.mTitleTextView;
            var15_15 = var29_29 /* !! */ .getMeasuredHeight() + var8_8;
            var8_8 = var24_24 /* !! */ .bottomMargin + var15_15;
        } else {
            var4_4 = var15_15;
            var8_8 = 0;
            var9_9 = null;
        }
        if (var23_23 != 0) {
            var29_29 /* !! */  = (Toolbar$LayoutParams)var6_6.mSubtitleTextView.getLayoutParams();
            var25_25 = var29_29 /* !! */ .topMargin;
            var26_26 = var12_12;
            var30_30 /* !! */  = var6_6.mSubtitleTextView;
            var12_12 = var30_30 /* !! */ .getMeasuredHeight() + var25_25;
            var15_15 = var29_29 /* !! */ .bottomMargin;
            var8_8 += (var12_12 += var15_15);
        } else {
            var26_26 = var12_12;
        }
        if (var21_21 == 0 && var23_23 == 0) {
            var27_27 = var14_14;
            var3_3 = var20_20;
lbl116:
            // 2 sources

            while (true) {
                var8_8 = 0;
                var9_9 = null;
                break;
            }
        } else {
            var30_30 /* !! */  = var21_21 != 0 ? var6_6.mTitleTextView : var6_6.mSubtitleTextView;
            var29_29 /* !! */  = var23_23 != 0 ? var6_6.mSubtitleTextView : var6_6.mTitleTextView;
            var30_30 /* !! */  = (Toolbar$LayoutParams)var30_30 /* !! */ .getLayoutParams();
            var29_29 /* !! */  = (Toolbar$LayoutParams)var29_29 /* !! */ .getLayoutParams();
            if (var21_21 != 0 && (var25_25 = (var24_24 /* !! */  = var6_6.mTitleTextView).getMeasuredWidth()) > 0 || var23_23 != 0 && (var25_25 = (var24_24 /* !! */  = var6_6.mSubtitleTextView).getMeasuredWidth()) > 0) {
                var27_27 = var14_14;
                var25_25 = 1;
            } else {
                var27_27 = var14_14;
                var25_25 = 0;
                var24_24 /* !! */  = null;
            }
            var14_14 = var6_6.mGravity & 112;
            var3_3 = var20_20;
            var20_20 = 48;
            if (var14_14 != var20_20) {
                var20_20 = 80;
                if (var14_14 != var20_20) {
                    var14_14 = (var13_13 - var16_16 - var17_17 - var8_8) / 2;
                    var20_20 = var30_30 /* !! */ .topMargin;
                    var5_5 = var10_10;
                    var10_10 = var6_6.mTitleMarginTop;
                    var31_31 = var23_23;
                    var23_23 = var20_20 + var10_10;
                    if (var14_14 < var23_23) {
                        var14_14 = var20_20 + var10_10;
                    } else {
                        var13_13 = var13_13 - var17_17 - var8_8 - var14_14 - var16_16;
                        var8_8 = var30_30 /* !! */ .bottomMargin;
                        var10_10 = var6_6.mTitleMarginBottom;
                        if (var13_13 < (var8_8 += var10_10)) {
                            var8_8 = var29_29 /* !! */ .bottomMargin + var10_10 - var13_13;
                            var14_14 -= var8_8;
                            var8_8 = 0;
                            var9_9 = null;
                            var14_14 = Math.max(0, var14_14);
                        }
                    }
                    var16_16 += var14_14;
                } else {
                    var5_5 = var10_10;
                    var31_31 = var23_23;
                    var13_13 -= var17_17;
                    var10_10 = var29_29 /* !! */ .bottomMargin;
                    var13_13 -= var10_10;
                    var10_10 = var6_6.mTitleMarginBottom;
                    var16_16 = (var13_13 -= var10_10) - var8_8;
                }
            } else {
                var5_5 = var10_10;
                var31_31 = var23_23;
                var8_8 = this.getPaddingTop();
                var10_10 = var30_30 /* !! */ .topMargin;
                var8_8 += var10_10;
                var10_10 = var6_6.mTitleMarginTop;
                var16_16 = var8_8 + var10_10;
            }
            if (var7_7 != 0) {
                if (var25_25 != 0) {
                    var7_7 = var6_6.mTitleMarginStart;
lbl175:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var7_7 = 0;
                var11_11 /* !! */  = null;
                ** continue;
                var8_8 = 1;
                var10_10 = var19_19[var8_8];
                var7_7 -= var10_10;
                var10_10 = 0;
                var32_32 = null;
                var12_12 = Math.max(0, var7_7);
                var18_18 -= var12_12;
                var7_7 = -var7_7;
                var19_19[var8_8] = var7_7 = Math.max(0, var7_7);
                if (var21_21 != 0) {
                    var11_11 /* !! */  = (Toolbar$LayoutParams)var6_6.mTitleTextView.getLayoutParams();
                    var9_9 = var6_6.mTitleTextView;
                    var8_8 = var9_9.getMeasuredWidth();
                    var8_8 = var18_18 - var8_8;
                    var32_32 = var6_6.mTitleTextView;
                    var10_10 = var32_32.getMeasuredHeight() + var16_16;
                    var30_30 /* !! */  = var6_6.mTitleTextView;
                    var30_30 /* !! */ .layout(var8_8, var16_16, var18_18, var10_10);
                    var12_12 = var6_6.mTitleMarginEnd;
                    var8_8 -= var12_12;
                    var7_7 = var11_11 /* !! */ .bottomMargin;
                    var16_16 = var10_10 + var7_7;
                } else {
                    var8_8 = var18_18;
                }
                if (var31_31 != 0) {
                    var7_7 = ((Toolbar$LayoutParams)var6_6.mSubtitleTextView.getLayoutParams()).topMargin;
                    var16_16 += var7_7;
                    var11_11 /* !! */  = var6_6.mSubtitleTextView;
                    var7_7 = var11_11 /* !! */ .getMeasuredWidth();
                    var7_7 = var18_18 - var7_7;
                    var32_32 = var6_6.mSubtitleTextView;
                    var10_10 = var32_32.getMeasuredHeight() + var16_16;
                    var30_30 /* !! */  = var6_6.mSubtitleTextView;
                    var30_30 /* !! */ .layout(var7_7, var16_16, var18_18, var10_10);
                    var7_7 = var6_6.mTitleMarginEnd;
                    var7_7 = var18_18 - var7_7;
                } else {
                    var7_7 = var18_18;
                }
                if (var25_25 != 0) {
                    var18_18 = var7_7 = Math.min(var8_8, var7_7);
                }
                var10_10 = var5_5;
                ** continue;
            }
            if (var25_25 != 0) {
                var7_7 = var8_8 = var6_6.mTitleMarginStart;
lbl224:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var7_7 = 0;
            var11_11 /* !! */  = null;
            ** continue;
            var8_8 = 0;
            var9_9 = null;
            var10_10 = var19_19[0];
            var7_7 -= var10_10;
            var10_10 = Math.max(0, var7_7) + var5_5;
            var7_7 = -var7_7;
            var19_19[0] = var7_7 = Math.max(0, var7_7);
            if (var21_21 != 0) {
                var11_11 /* !! */  = (Toolbar$LayoutParams)var6_6.mTitleTextView.getLayoutParams();
                var30_30 /* !! */  = var6_6.mTitleTextView;
                var12_12 = var30_30 /* !! */ .getMeasuredWidth() + var10_10;
                var33_33 = var6_6.mTitleTextView;
                var13_13 = var33_33.getMeasuredHeight() + var16_16;
                var34_34 = var6_6.mTitleTextView;
                var34_34.layout(var10_10, var16_16, var12_12, var13_13);
                var14_14 = var6_6.mTitleMarginEnd;
                var12_12 += var14_14;
                var7_7 = var11_11 /* !! */ .bottomMargin;
                var16_16 = var13_13 + var7_7;
            } else {
                var12_12 = var10_10;
            }
            if (var31_31 != 0) {
                var7_7 = ((Toolbar$LayoutParams)var6_6.mSubtitleTextView.getLayoutParams()).topMargin;
                var16_16 += var7_7;
                var11_11 /* !! */  = var6_6.mSubtitleTextView;
                var7_7 = var11_11 /* !! */ .getMeasuredWidth() + var10_10;
                var33_33 = var6_6.mSubtitleTextView;
                var13_13 = var33_33.getMeasuredHeight() + var16_16;
                var34_34 = var6_6.mSubtitleTextView;
                var34_34.layout(var10_10, var16_16, var7_7, var13_13);
                var13_13 = var6_6.mTitleMarginEnd;
                var7_7 += var13_13;
            } else {
                var7_7 = var10_10;
            }
            if (var25_25 != 0) {
                var10_10 = Math.max(var12_12, var7_7);
            }
        }
        var11_11 /* !! */  = var6_6.mTempViews;
        var6_6.addCustomViewsWithGravity(var11_11 /* !! */ , 3);
        var11_11 /* !! */  = var6_6.mTempViews;
        var7_7 = var11_11 /* !! */ .size();
        var12_12 = var10_10;
        var32_32 = null;
        for (var10_10 = 0; var10_10 < var7_7; var10_10 += var13_13) {
            var33_33 = (View)var6_6.mTempViews.get(var10_10);
            var20_20 = var3_3;
            var12_12 = var6_6.layoutChildLeft(var33_33, var12_12, var19_19, var3_3);
            var13_13 = 1;
        }
        var20_20 = var3_3;
        var11_11 /* !! */  = var6_6.mTempViews;
        var6_6.addCustomViewsWithGravity(var11_11 /* !! */ , 5);
        var11_11 /* !! */  = var6_6.mTempViews;
        var7_7 = var11_11 /* !! */ .size();
        var32_32 = null;
        for (var10_10 = 0; var10_10 < var7_7; var10_10 += var13_13) {
            var33_33 = (View)var6_6.mTempViews.get(var10_10);
            var18_18 = var6_6.layoutChildRight(var33_33, var18_18, var19_19, var20_20);
            var13_13 = 1;
        }
        var11_11 /* !! */  = var6_6.mTempViews;
        var6_6.addCustomViewsWithGravity(var11_11 /* !! */ , 1);
        var11_11 /* !! */  = var6_6.mTempViews;
        var7_7 = var6_6.getViewListMeasuredWidth(var11_11 /* !! */ , var19_19);
        var10_10 = (var26_26 - var27_27 - var4_4) / 2 + var27_27;
        var13_13 = var7_7 / 2;
        var7_7 += (var10_10 -= var13_13);
        if (var10_10 >= var12_12) {
            var12_12 = var7_7 > var18_18 ? var10_10 - (var7_7 -= var18_18) : var10_10;
        }
        var11_11 /* !! */  = var6_6.mTempViews;
        var7_7 = var11_11 /* !! */ .size();
        while (var8_8 < var7_7) {
            var32_32 = (View)var6_6.mTempViews.get(var8_8);
            var12_12 = var6_6.layoutChildLeft(var32_32, var12_12, var19_19, var20_20);
            var10_10 = 1;
            var8_8 += var10_10;
        }
        var6_6.mTempViews.clear();
    }

    public void onMeasure(int n3, int n4) {
        Object object;
        int n7;
        int n8;
        Object object2;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        Object object3;
        int n18;
        int n19;
        Toolbar toolbar = this;
        int n20 = 1;
        int[] nArray = this.mTempMargins;
        int n21 = dE3.a;
        n21 = this.getLayoutDirection();
        int n22 = 0;
        if (n21 == n20) {
            n19 = 1;
            n18 = 0;
        } else {
            n19 = 0;
            n18 = 1;
        }
        Object object4 = toolbar.mNavButtonView;
        n21 = (int)(toolbar.shouldLayout((View)object4) ? 1 : 0);
        int n24 = 0;
        if (n21 != 0) {
            object3 = toolbar.mNavButtonView;
            n17 = 0;
            n16 = toolbar.mMaxButtonHeight;
            object4 = this;
            n15 = n3;
            n14 = 0;
            this.measureChildConstrained((View)object3, n3, 0, n4, 0, n16);
            object4 = toolbar.mNavButtonView;
            n21 = object4.getMeasuredWidth();
            object3 = toolbar.mNavButtonView;
            n10 = toolbar.getHorizontalMargins((View)object3);
            n21 += n10;
            object3 = toolbar.mNavButtonView;
            n10 = object3.getMeasuredHeight();
            object2 = toolbar.mNavButtonView;
            n15 = toolbar.getVerticalMargins((View)object2);
            n10 += n15;
            n10 = Math.max(0, n10);
            object2 = toolbar.mNavButtonView;
            n15 = object2.getMeasuredState();
            n15 = View.combineMeasuredStates((int)0, (int)n15);
            n8 = n10;
            n7 = n15;
        } else {
            n21 = 0;
            object4 = null;
            n8 = 0;
            n7 = 0;
        }
        object3 = toolbar.mCollapseButtonView;
        n10 = toolbar.shouldLayout((View)object3);
        if (n10 != 0) {
            object3 = toolbar.mCollapseButtonView;
            n17 = 0;
            n16 = toolbar.mMaxButtonHeight;
            object4 = this;
            n15 = n3;
            n14 = 0;
            this.measureChildConstrained((View)object3, n3, 0, n4, 0, n16);
            object4 = toolbar.mCollapseButtonView;
            n21 = object4.getMeasuredWidth();
            object3 = toolbar.mCollapseButtonView;
            n10 = toolbar.getHorizontalMargins((View)object3);
            n21 += n10;
            n10 = toolbar.mCollapseButtonView.getMeasuredHeight();
            object2 = toolbar.mCollapseButtonView;
            n15 = toolbar.getVerticalMargins((View)object2);
            n8 = Math.max(n8, n10 += n15);
            object3 = toolbar.mCollapseButtonView;
            n10 = object3.getMeasuredState();
            n7 = View.combineMeasuredStates((int)n7, (int)n10);
        }
        n10 = this.getCurrentContentInsetStart();
        n24 = Math.max(n10, n21);
        n10 -= n21;
        nArray[n19] = n21 = Math.max(0, n10);
        object4 = toolbar.mMenuView;
        n21 = (int)(toolbar.shouldLayout((View)object4) ? 1 : 0);
        if (n21 != 0) {
            object3 = toolbar.mMenuView;
            n17 = 0;
            n16 = toolbar.mMaxButtonHeight;
            object4 = this;
            n15 = n3;
            n14 = n24;
            this.measureChildConstrained((View)object3, n3, n24, n4, 0, n16);
            object4 = toolbar.mMenuView;
            n21 = object4.getMeasuredWidth();
            object3 = toolbar.mMenuView;
            n10 = toolbar.getHorizontalMargins((View)object3);
            n21 += n10;
            n10 = toolbar.mMenuView.getMeasuredHeight();
            object2 = toolbar.mMenuView;
            n15 = toolbar.getVerticalMargins((View)object2);
            n8 = Math.max(n8, n10 += n15);
            object3 = toolbar.mMenuView;
            n10 = object3.getMeasuredState();
            n7 = View.combineMeasuredStates((int)n7, (int)n10);
        } else {
            n21 = 0;
            object4 = null;
        }
        n10 = this.getCurrentContentInsetEnd();
        n15 = Math.max(n10, n21);
        n19 = n15 + n24;
        n10 -= n21;
        nArray[n18] = n21 = Math.max(0, n10);
        object4 = toolbar.mExpandedActionView;
        n21 = (int)(toolbar.shouldLayout((View)object4) ? 1 : 0);
        if (n21 != 0) {
            object3 = toolbar.mExpandedActionView;
            n17 = 0;
            object4 = this;
            n15 = n3;
            n14 = n19;
            object = nArray;
            n21 = this.measureChildCollapseMargins((View)object3, n3, n19, n4, 0, nArray);
            n19 += n21;
            n21 = toolbar.mExpandedActionView.getMeasuredHeight();
            object3 = toolbar.mExpandedActionView;
            n10 = toolbar.getVerticalMargins((View)object3);
            n8 = Math.max(n8, n21 += n10);
            object4 = toolbar.mExpandedActionView;
            n21 = object4.getMeasuredState();
            n7 = View.combineMeasuredStates((int)n7, (int)n21);
        }
        if ((n21 = (int)(toolbar.shouldLayout((View)(object4 = toolbar.mLogoView)) ? 1 : 0)) != 0) {
            object3 = toolbar.mLogoView;
            n17 = 0;
            object4 = this;
            n15 = n3;
            n14 = n19;
            object = nArray;
            n21 = this.measureChildCollapseMargins((View)object3, n3, n19, n4, 0, nArray);
            n19 += n21;
            n21 = toolbar.mLogoView.getMeasuredHeight();
            object3 = toolbar.mLogoView;
            n10 = toolbar.getVerticalMargins((View)object3);
            n8 = Math.max(n8, n21 += n10);
            object4 = toolbar.mLogoView;
            n21 = object4.getMeasuredState();
            n7 = View.combineMeasuredStates((int)n7, (int)n21);
        }
        n18 = this.getChildCount();
        for (n24 = 0; n24 < n18; n24 += n20) {
            object = toolbar.getChildAt(n24);
            object4 = (Toolbar$LayoutParams)object.getLayoutParams();
            n21 = object4.b;
            if (n21 != 0 || (n21 = (int)(toolbar.shouldLayout((View)object) ? 1 : 0)) == 0) continue;
            n17 = 0;
            object4 = this;
            object3 = object;
            n15 = n3;
            n14 = n19;
            object = nArray;
            n21 = this.measureChildCollapseMargins((View)object3, n3, n19, n4, 0, nArray);
            n19 += n21;
            n21 = object3.getMeasuredHeight();
            n15 = toolbar.getVerticalMargins((View)object3);
            n21 += n15;
            n21 = Math.max(n8, n21);
            n10 = object3.getMeasuredState();
            n10 = View.combineMeasuredStates((int)n7, (int)n10);
            n8 = n21;
            n7 = n10;
        }
        n21 = toolbar.mTitleMarginTop;
        n10 = toolbar.mTitleMarginBottom;
        n20 = n21 + n10;
        n21 = toolbar.mTitleMarginStart;
        n10 = toolbar.mTitleMarginEnd;
        n18 = n21 + n10;
        object4 = toolbar.mTitleTextView;
        n21 = (int)(toolbar.shouldLayout((View)object4) ? 1 : 0);
        if (n21 != 0) {
            object3 = toolbar.mTitleTextView;
            n14 = n19 + n18;
            object4 = this;
            n15 = n3;
            n17 = n20;
            object = nArray;
            this.measureChildCollapseMargins((View)object3, n3, n14, n4, n20, nArray);
            object4 = toolbar.mTitleTextView;
            n21 = object4.getMeasuredWidth();
            object3 = toolbar.mTitleTextView;
            n10 = toolbar.getHorizontalMargins((View)object3);
            n21 += n10;
            object3 = toolbar.mTitleTextView;
            n10 = object3.getMeasuredHeight();
            object2 = toolbar.mTitleTextView;
            n15 = toolbar.getVerticalMargins((View)object2);
            n10 += n15;
            object2 = toolbar.mTitleTextView;
            n15 = object2.getMeasuredState();
            n7 = View.combineMeasuredStates((int)n7, (int)n15);
            n24 = n21;
            n16 = n7;
            n7 = n10;
        } else {
            n16 = n7;
            n24 = 0;
            n7 = 0;
        }
        object4 = toolbar.mSubtitleTextView;
        n21 = (int)(toolbar.shouldLayout((View)object4) ? 1 : 0);
        if (n21 != 0) {
            object3 = toolbar.mSubtitleTextView;
            n14 = n19 + n18;
            n17 = n7 + n20;
            object4 = this;
            n15 = n3;
            n20 = n16;
            object = nArray;
            n21 = this.measureChildCollapseMargins((View)object3, n3, n14, n4, n17, nArray);
            n24 = Math.max(n24, n21);
            n21 = toolbar.mSubtitleTextView.getMeasuredHeight();
            object3 = toolbar.mSubtitleTextView;
            n10 = toolbar.getVerticalMargins((View)object3);
            n7 += (n21 += n10);
            object4 = toolbar.mSubtitleTextView;
            n21 = object4.getMeasuredState();
            n16 = View.combineMeasuredStates((int)n16, (int)n21);
        } else {
            n20 = n16;
        }
        n21 = Math.max(n8, n7);
        n10 = this.getPaddingLeft();
        n15 = this.getPaddingRight() + n10 + (n19 += n24);
        n10 = this.getPaddingTop();
        n14 = this.getPaddingBottom() + n10 + n21;
        n21 = this.getSuggestedMinimumWidth();
        n21 = Math.max(n15, n21);
        n10 = 0xFF000000 & n16;
        n15 = n3;
        n21 = View.resolveSizeAndState((int)n21, (int)n3, (int)n10);
        n10 = this.getSuggestedMinimumHeight();
        n10 = Math.max(n14, n10);
        n15 = n16 << 16;
        n14 = n4;
        n10 = View.resolveSizeAndState((int)n10, (int)n4, (int)n15);
        n15 = (int)(this.shouldCollapse() ? 1 : 0);
        if (n15 == 0) {
            n22 = n10;
        }
        toolbar.setMeasuredDimension(n21, n22);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2;
        Toolbar$e toolbar$e;
        boolean bl3 = parcelable instanceof Toolbar$SavedState;
        if (!bl3) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (Toolbar$SavedState)parcelable;
        Object object = parcelable.getSuperState();
        super.onRestoreInstanceState(object);
        object = this.mMenuView;
        if (object != null) {
            object = object.a;
        } else {
            bl3 = false;
            object = null;
        }
        int n3 = parcelable.a;
        if (n3 != 0 && (toolbar$e = this.mExpandedMenuPresenter) != null && object != null && (object = object.findItem(n3)) != null) {
            object.expandActionView();
        }
        if (bl2 = parcelable.b) {
            this.postShowOverflowMenu();
        }
    }

    public void onRtlPropertiesChanged(int n3) {
        super.onRtlPropertiesChanged(n3);
        this.ensureContentInsets();
        rQ2 rQ22 = this.mContentInsets;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        n3 = (int)(rQ22.g ? 1 : 0);
        if (n4 != n3) {
            rQ22.g = n4;
            n3 = (int)(rQ22.h ? 1 : 0);
            if (n3 != 0) {
                n3 = -1 << -1;
                if (n4 != 0) {
                    n4 = rQ22.d;
                    if (n4 == n3) {
                        n4 = rQ22.e;
                    }
                    rQ22.a = n4;
                    n4 = rQ22.c;
                    if (n4 == n3) {
                        n4 = rQ22.f;
                    }
                    rQ22.b = n4;
                } else {
                    n4 = rQ22.c;
                    if (n4 == n3) {
                        n4 = rQ22.e;
                    }
                    rQ22.a = n4;
                    n4 = rQ22.d;
                    if (n4 == n3) {
                        n4 = rQ22.f;
                    }
                    rQ22.b = n4;
                }
            } else {
                rQ22.a = n3 = rQ22.e;
                rQ22.b = n3 = rQ22.f;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Object object = super.onSaveInstanceState();
        Toolbar$SavedState toolbar$SavedState = new AbsSavedState((Parcelable)object);
        object = this.mExpandedMenuPresenter;
        if (object != null && (object = object.b) != null) {
            toolbar$SavedState.a = n3 = object.a;
        }
        toolbar$SavedState.b = n3 = this.isOverflowMenuShowing();
        return toolbar$SavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionMasked();
        if (!n4) {
            this.mEatingTouch = false;
        }
        boolean bl2 = this.mEatingTouch;
        int n7 = 1;
        if (!bl2) {
            n3 = super.onTouchEvent(motionEvent);
            if (!n4 && !n3) {
                this.mEatingTouch = n7;
            }
        }
        if (n4 == n7 || n4 == (n3 = 3)) {
            this.mEatingTouch = false;
        }
        return n7 != 0;
    }

    public void removeChildrenForExpandedActionView() {
        for (int i3 = this.getChildCount() + -1; i3 >= 0; i3 += -1) {
            View view = this.getChildAt(i3);
            Object object = (Toolbar$LayoutParams)view.getLayoutParams();
            int n3 = ((Toolbar$LayoutParams)((Object)object)).b;
            int n4 = 2;
            if (n3 == n4 || view == (object = this.mMenuView)) continue;
            this.removeViewAt(i3);
            object = this.mHiddenViews;
            ((ArrayList)object).add(view);
        }
    }

    public void removeMenuProvider(fo1_0 fo1_02) {
        this.mMenuHostHelper.c(fo1_02);
    }

    public void setBackInvokedCallbackEnabled(boolean bl2) {
        boolean bl3 = this.mBackInvokedCallbackEnabled;
        if (bl3 != bl2) {
            this.mBackInvokedCallbackEnabled = bl2;
            this.updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Context context = this.getContext();
            charSequence = context.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setCollapseContentDescription(charSequence);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        ImageButton imageButton;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            this.ensureCollapseButtonView();
        }
        if ((imageButton = this.mCollapseButtonView) != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setCollapseIcon(drawable2);
    }

    public void setCollapseIcon(Drawable drawable2) {
        if (drawable2 != null) {
            this.ensureCollapseButtonView();
            ImageButton imageButton = this.mCollapseButtonView;
            imageButton.setImageDrawable(drawable2);
        } else {
            drawable2 = this.mCollapseButtonView;
            if (drawable2 != null) {
                Drawable drawable3 = this.mCollapseIcon;
                drawable2.setImageDrawable(drawable3);
            }
        }
    }

    public void setCollapsible(boolean bl2) {
        this.mCollapsible = bl2;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int n3) {
        int n4;
        if (n3 < 0) {
            n3 = -1 << -1;
        }
        if (n3 != (n4 = this.mContentInsetEndWithActions)) {
            this.mContentInsetEndWithActions = n3;
            Drawable drawable2 = this.getNavigationIcon();
            if (drawable2 != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int n3) {
        int n4;
        if (n3 < 0) {
            n3 = -1 << -1;
        }
        if (n3 != (n4 = this.mContentInsetStartWithNavigation)) {
            this.mContentInsetStartWithNavigation = n3;
            Drawable drawable2 = this.getNavigationIcon();
            if (drawable2 != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int n3, int n4) {
        this.ensureContentInsets();
        rQ2 rQ22 = this.mContentInsets;
        rQ22.h = false;
        int n7 = -1 << -1;
        if (n3 != n7) {
            rQ22.e = n3;
            rQ22.a = n3;
        }
        if (n4 != n7) {
            rQ22.f = n4;
            rQ22.b = n4;
        }
    }

    public void setContentInsetsRelative(int n3, int n4) {
        this.ensureContentInsets();
        this.mContentInsets.a(n3, n4);
    }

    public void setLogo(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setLogo(drawable2);
    }

    public void setLogo(Drawable drawable2) {
        Object object;
        if (drawable2 != null) {
            this.ensureLogoView();
            object = this.mLogoView;
            boolean bl2 = this.isChildOrHidden((View)object);
            if (!bl2) {
                object = this.mLogoView;
                boolean bl3 = true;
                this.addSystemView((View)object, bl3);
            }
        } else {
            boolean bl4;
            object = this.mLogoView;
            if (object != null && (bl4 = this.isChildOrHidden((View)object))) {
                object = this.mLogoView;
                this.removeView((View)object);
                object = this.mHiddenViews;
                ImageView imageView = this.mLogoView;
                ((ArrayList)object).remove(imageView);
            }
        }
        if ((object = this.mLogoView) != null) {
            object.setImageDrawable(drawable2);
        }
    }

    public void setLogoDescription(int n3) {
        CharSequence charSequence = this.getContext().getText(n3);
        this.setLogoDescription(charSequence);
    }

    public void setLogoDescription(CharSequence charSequence) {
        ImageView imageView;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            this.ensureLogoView();
        }
        if ((imageView = this.mLogoView) != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(androidx.appcompat.view.menu.d object, ActionMenuPresenter actionMenuPresenter) {
        boolean bl2;
        h h3;
        Object object2;
        if (object == null && (object2 = this.mMenuView) == null) {
            return;
        }
        this.ensureMenuView();
        object2 = this.mMenuView.a;
        if (object2 == object) {
            return;
        }
        if (object2 != null) {
            h3 = this.mOuterActionMenuPresenter;
            ((androidx.appcompat.view.menu.d)object2).removeMenuPresenter(h3);
            h3 = this.mExpandedMenuPresenter;
            ((androidx.appcompat.view.menu.d)object2).removeMenuPresenter(h3);
        }
        if ((object2 = this.mExpandedMenuPresenter) == null) {
            this.mExpandedMenuPresenter = object2 = new Toolbar$e(this);
        }
        actionMenuPresenter.r = bl2 = true;
        if (object != null) {
            object2 = this.mPopupContext;
            ((androidx.appcompat.view.menu.d)object).addMenuPresenter(actionMenuPresenter, (Context)object2);
            object2 = this.mExpandedMenuPresenter;
            h3 = this.mPopupContext;
            ((androidx.appcompat.view.menu.d)object).addMenuPresenter((h)object2, (Context)h3);
        } else {
            object = this.mPopupContext;
            h3 = null;
            actionMenuPresenter.initForMenu((Context)object, null);
            object = this.mExpandedMenuPresenter;
            Context context = this.mPopupContext;
            ((Toolbar$e)object).initForMenu(context, null);
            actionMenuPresenter.updateMenuView(bl2);
            object = this.mExpandedMenuPresenter;
            ((Toolbar$e)object).updateMenuView(bl2);
        }
        object = this.mMenuView;
        int n3 = this.mPopupTheme;
        ((ActionMenuView)object).setPopupTheme(n3);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        this.updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(h$a h$a, d$a d$a) {
        this.mActionMenuPresenterCallback = h$a;
        this.mMenuBuilderCallback = d$a;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(h$a, d$a);
        }
    }

    public void setNavigationContentDescription(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Context context = this.getContext();
            charSequence = context.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setNavigationContentDescription(charSequence);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        ImageButton imageButton;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            this.ensureNavButtonView();
        }
        if ((imageButton = this.mNavButtonView) != null) {
            imageButton.setContentDescription(charSequence);
            imageButton = this.mNavButtonView;
            vo3_0.a((View)imageButton, charSequence);
        }
    }

    public void setNavigationIcon(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setNavigationIcon(drawable2);
    }

    public void setNavigationIcon(Drawable drawable2) {
        Object object;
        if (drawable2 != null) {
            this.ensureNavButtonView();
            object = this.mNavButtonView;
            boolean bl2 = this.isChildOrHidden((View)object);
            if (!bl2) {
                object = this.mNavButtonView;
                boolean bl3 = true;
                this.addSystemView((View)object, bl3);
            }
        } else {
            boolean bl4;
            object = this.mNavButtonView;
            if (object != null && (bl4 = this.isChildOrHidden((View)object))) {
                object = this.mNavButtonView;
                this.removeView((View)object);
                object = this.mHiddenViews;
                ImageButton imageButton = this.mNavButtonView;
                ((ArrayList)object).remove(imageButton);
            }
        }
        if ((object = this.mNavButtonView) != null) {
            object.setImageDrawable(drawable2);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(Toolbar$f toolbar$f) {
        this.mOnMenuItemClickListener = toolbar$f;
    }

    public void setOverflowIcon(Drawable drawable2) {
        this.ensureMenu();
        this.mMenuView.setOverflowIcon(drawable2);
    }

    public void setPopupTheme(int n3) {
        int n4 = this.mPopupTheme;
        if (n4 != n3) {
            this.mPopupTheme = n3;
            if (n3 == 0) {
                Context context;
                this.mPopupContext = context = this.getContext();
            } else {
                Context context = this.getContext();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
                this.mPopupContext = contextThemeWrapper;
            }
        }
    }

    public void setSubtitle(int n3) {
        CharSequence charSequence = this.getContext().getText(n3);
        this.setSubtitle(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        Object object;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            int n3;
            object = this.mSubtitleTextView;
            if (object == null) {
                object = this.getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView((Context)object);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                appCompatTextView = this.mSubtitleTextView;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                appCompatTextView.setEllipsize(truncateAt);
                n3 = this.mSubtitleTextAppearance;
                if (n3 != 0) {
                    truncateAt = this.mSubtitleTextView;
                    truncateAt.setTextAppearance((Context)object, n3);
                }
                if ((object = this.mSubtitleTextColor) != null) {
                    appCompatTextView = this.mSubtitleTextView;
                    appCompatTextView.setTextColor((ColorStateList)object);
                }
            }
            if (!(bl2 = this.isChildOrHidden((View)(object = this.mSubtitleTextView)))) {
                object = this.mSubtitleTextView;
                n3 = 1;
                this.addSystemView((View)object, n3 != 0);
            }
        } else {
            object = this.mSubtitleTextView;
            if (object != null && (bl2 = this.isChildOrHidden((View)object))) {
                object = this.mSubtitleTextView;
                this.removeView((View)object);
                object = this.mHiddenViews;
                TextView textView = this.mSubtitleTextView;
                ((ArrayList)object).remove(textView);
            }
        }
        if ((object = this.mSubtitleTextView) != null) {
            object.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int n3) {
        this.mSubtitleTextAppearance = n3;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, n3);
        }
    }

    public void setSubtitleTextColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setSubtitleTextColor(colorStateList);
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int n3) {
        CharSequence charSequence = this.getContext().getText(n3);
        this.setTitle(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        Object object;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            int n3;
            object = this.mTitleTextView;
            if (object == null) {
                object = this.getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView((Context)object);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                appCompatTextView = this.mTitleTextView;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                appCompatTextView.setEllipsize(truncateAt);
                n3 = this.mTitleTextAppearance;
                if (n3 != 0) {
                    truncateAt = this.mTitleTextView;
                    truncateAt.setTextAppearance((Context)object, n3);
                }
                if ((object = this.mTitleTextColor) != null) {
                    appCompatTextView = this.mTitleTextView;
                    appCompatTextView.setTextColor((ColorStateList)object);
                }
            }
            if (!(bl2 = this.isChildOrHidden((View)(object = this.mTitleTextView)))) {
                object = this.mTitleTextView;
                n3 = 1;
                this.addSystemView((View)object, n3 != 0);
            }
        } else {
            object = this.mTitleTextView;
            if (object != null && (bl2 = this.isChildOrHidden((View)object))) {
                object = this.mTitleTextView;
                this.removeView((View)object);
                object = this.mHiddenViews;
                TextView textView = this.mTitleTextView;
                ((ArrayList)object).remove(textView);
            }
        }
        if ((object = this.mTitleTextView) != null) {
            object.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int n3, int n4, int n7, int n8) {
        this.mTitleMarginStart = n3;
        this.mTitleMarginTop = n4;
        this.mTitleMarginEnd = n7;
        this.mTitleMarginBottom = n8;
        this.requestLayout();
    }

    public void setTitleMarginBottom(int n3) {
        this.mTitleMarginBottom = n3;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int n3) {
        this.mTitleMarginEnd = n3;
        this.requestLayout();
    }

    public void setTitleMarginStart(int n3) {
        this.mTitleMarginStart = n3;
        this.requestLayout();
    }

    public void setTitleMarginTop(int n3) {
        this.mTitleMarginTop = n3;
        this.requestLayout();
    }

    public void setTitleTextAppearance(Context context, int n3) {
        this.mTitleTextAppearance = n3;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, n3);
        }
    }

    public void setTitleTextColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setTitleTextColor(colorStateList);
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean showOverflowMenu() {
        boolean bl2;
        Object object = this.mMenuView;
        if (object != null && (object = ((ActionMenuView)object).e) != null && (bl2 = ((ActionMenuPresenter)object).e())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void updateBackInvokedCallbackState() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            Object object;
            OnBackInvokedDispatcher onBackInvokedDispatcher2 = Toolbar$d.a((View)this);
            n4 = (int)(this.hasExpandedActionView() ? 1 : 0);
            if (n4 != 0 && onBackInvokedDispatcher2 != null && (n4 = (int)(this.isAttachedToWindow() ? 1 : 0)) != 0 && (n4 = (int)(this.mBackInvokedCallbackEnabled ? 1 : 0)) != 0) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            if (n4 != 0 && (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                object = this.mBackInvokedCallback;
                if (object == null) {
                    int n7 = 1;
                    object = new wB2(this, n7);
                    this.mBackInvokedCallback = object = Toolbar$d.b((Runnable)object);
                }
                object = this.mBackInvokedCallback;
                Toolbar$d.c(onBackInvokedDispatcher2, object);
                this.mBackInvokedDispatcher = onBackInvokedDispatcher2;
            } else if (n4 == 0 && (onBackInvokedDispatcher2 = this.mBackInvokedDispatcher) != null) {
                object = this.mBackInvokedCallback;
                Toolbar$d.d(onBackInvokedDispatcher2, object);
                n3 = 0;
                onBackInvokedDispatcher2 = null;
                this.mBackInvokedDispatcher = null;
            }
        }
    }
}

