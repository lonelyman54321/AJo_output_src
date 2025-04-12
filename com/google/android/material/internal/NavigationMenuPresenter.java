/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.v;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.internal.NavigationMenuPresenter$1;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate;
import com.google.android.material.internal.NavigationMenuView;

public class NavigationMenuPresenter
implements h {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuPresenter$NavigationMenuAdapter adapter;
    private h$a callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;
    private int id;
    boolean isBehindStatusBar;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    d menu;
    private NavigationMenuView menuView;
    final View.OnClickListener onClickListener;
    private int overScrollMode;
    int paddingSeparator;
    private int paddingTopDefault;
    ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled;
    ColorStateList textColor;

    public NavigationMenuPresenter() {
        boolean bl2;
        this.textAppearanceActiveBoldEnabled = bl2 = true;
        this.isBehindStatusBar = bl2;
        this.overScrollMode = -1;
        NavigationMenuPresenter$1 navigationMenuPresenter$1 = new NavigationMenuPresenter$1(this);
        this.onClickListener = navigationMenuPresenter$1;
    }

    public static /* synthetic */ int access$000(NavigationMenuPresenter navigationMenuPresenter) {
        return navigationMenuPresenter.itemMaxLines;
    }

    private boolean hasHeader() {
        int n3 = this.getHeaderCount();
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    private void updateTopPadding() {
        int n3 = this.hasHeader();
        n3 = n3 == 0 && (n3 = this.isBehindStatusBar) != 0 ? this.paddingTopDefault : 0;
        NavigationMenuView navigationMenuView = this.menuView;
        int n4 = navigationMenuView.getPaddingBottom();
        navigationMenuView.setPadding(0, n3, 0, n4);
    }

    public void addHeaderView(View object) {
        this.headerLayout.addView(object);
        object = this.menuView;
        int n3 = object.getPaddingBottom();
        object.setPadding(0, 0, 0, n3);
    }

    public boolean collapseItemActionView(d d2, androidx.appcompat.view.menu.f f5) {
        return false;
    }

    public void dispatchApplyWindowInsets(f f5) {
        int n3 = this.paddingTopDefault;
        int n4 = f5.d();
        if (n3 != n4) {
            this.paddingTopDefault = n4;
            this.updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        n3 = navigationMenuView.getPaddingTop();
        int n7 = f5.a();
        navigationMenuView.setPadding(0, n3, 0, n7);
        ViewCompat.b((View)this.headerLayout, f5);
    }

    public boolean expandItemActionView(d d2, androidx.appcompat.view.menu.f f5) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public androidx.appcompat.view.menu.f getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int n3) {
        return this.headerLayout.getChildAt(n3);
    }

    public int getId() {
        return this.id;
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public i getMenuView(ViewGroup object) {
        Object object2 = this.menuView;
        if (object2 == null) {
            int n3;
            int n4;
            object2 = this.layoutInflater;
            int n7 = R$layout.design_navigation_menu;
            object = (NavigationMenuView)object2.inflate(n7, (ViewGroup)object, false);
            NavigationMenuView navigationMenuView = this.menuView = object;
            object2 = new NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate(this, navigationMenuView);
            ((RecyclerView)object).setAccessibilityDelegateCompat((v)object2);
            object = this.adapter;
            if (object == null) {
                object = new NavigationMenuPresenter$NavigationMenuAdapter(this);
                this.adapter = object;
                n4 = 1;
                ((RecyclerView$f)object).setHasStableIds(n4 != 0);
            }
            if ((n3 = this.overScrollMode) != (n4 = -1)) {
                object2 = this.menuView;
                object2.setOverScrollMode(n3);
            }
            object = this.layoutInflater;
            n4 = R$layout.design_navigation_item_header;
            navigationMenuView = this.menuView;
            object = (LinearLayout)object.inflate(n4, (ViewGroup)navigationMenuView, false);
            this.headerLayout = object;
            object2 = ViewCompat.a;
            n4 = 2;
            object.setImportantForAccessibility(n4);
            object = this.menuView;
            object2 = this.adapter;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
        return this.menuView;
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(int n3) {
        LayoutInflater layoutInflater = this.layoutInflater;
        LinearLayout linearLayout = this.headerLayout;
        View view = layoutInflater.inflate(n3, (ViewGroup)linearLayout, false);
        this.addHeaderView(view);
        return view;
    }

    public void initForMenu(Context context, d d2) {
        int n3;
        LayoutInflater layoutInflater;
        this.layoutInflater = layoutInflater = LayoutInflater.from((Context)context);
        this.menu = d2;
        context = context.getResources();
        int n4 = R$dimen.design_navigation_separator_vertical_padding;
        this.paddingSeparator = n3 = context.getDimensionPixelOffset(n4);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    public void onCloseMenu(d d2, boolean bl2) {
        h$a h$a = this.callback;
        if (h$a != null) {
            h$a.onCloseMenu(d2, bl2);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof Bundle;
        if (bl2) {
            Object object;
            Object object2 = (parcelable = (Bundle)parcelable).getSparseParcelableArray(STATE_HIERARCHY);
            if (object2 != null) {
                object = this.menuView;
                object.restoreHierarchyState(object2);
            }
            if ((object2 = parcelable.getBundle(STATE_ADAPTER)) != null) {
                object = this.adapter;
                ((NavigationMenuPresenter$NavigationMenuAdapter)object).restoreInstanceState((Bundle)object2);
            }
            if ((parcelable = parcelable.getSparseParcelableArray((String)(object2 = STATE_HEADER))) != null) {
                object2 = this.headerLayout;
                object2.restoreHierarchyState((SparseArray)parcelable);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        String string2;
        Bundle bundle = new Bundle();
        Object object = this.menuView;
        if (object != null) {
            object = new SparseArray();
            this.menuView.saveHierarchyState((SparseArray)object);
            string2 = STATE_HIERARCHY;
            bundle.putSparseParcelableArray(string2, (SparseArray)object);
        }
        if ((object = this.adapter) != null) {
            string2 = STATE_ADAPTER;
            object = ((NavigationMenuPresenter$NavigationMenuAdapter)object).createInstanceState();
            bundle.putBundle(string2, (Bundle)object);
        }
        if ((object = this.headerLayout) != null) {
            object = new SparseArray();
            this.headerLayout.saveHierarchyState((SparseArray)object);
            string2 = STATE_HEADER;
            bundle.putSparseParcelableArray(string2, (SparseArray)object);
        }
        return bundle;
    }

    public boolean onSubMenuSelected(j j3) {
        return false;
    }

    public void removeHeaderView(View object) {
        LinearLayout linearLayout = this.headerLayout;
        linearLayout.removeView(object);
        boolean bl2 = this.hasHeader();
        if (!bl2) {
            object = this.menuView;
            int n3 = this.paddingTopDefault;
            int n4 = object.getPaddingBottom();
            object.setPadding(0, n3, 0, n4);
        }
    }

    public void setBehindStatusBar(boolean bl2) {
        boolean bl3 = this.isBehindStatusBar;
        if (bl3 != bl2) {
            this.isBehindStatusBar = bl2;
            this.updateTopPadding();
        }
    }

    public void setCallback(h$a h$a) {
        this.callback = h$a;
    }

    public void setCheckedItem(androidx.appcompat.view.menu.f f5) {
        this.adapter.setCheckedItem(f5);
    }

    public void setDividerInsetEnd(int n3) {
        this.dividerInsetEnd = n3;
        this.updateMenuView(false);
    }

    public void setDividerInsetStart(int n3) {
        this.dividerInsetStart = n3;
        this.updateMenuView(false);
    }

    public void setId(int n3) {
        this.id = n3;
    }

    public void setItemBackground(Drawable drawable2) {
        this.itemBackground = drawable2;
        this.updateMenuView(false);
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        this.updateMenuView(false);
    }

    public void setItemHorizontalPadding(int n3) {
        this.itemHorizontalPadding = n3;
        this.updateMenuView(false);
    }

    public void setItemIconPadding(int n3) {
        this.itemIconPadding = n3;
        this.updateMenuView(false);
    }

    public void setItemIconSize(int n3) {
        int n4 = this.itemIconSize;
        if (n4 != n3) {
            this.itemIconSize = n3;
            this.hasCustomItemIconSize = true;
            n3 = 0;
            this.updateMenuView(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.updateMenuView(false);
    }

    public void setItemMaxLines(int n3) {
        this.itemMaxLines = n3;
        this.updateMenuView(false);
    }

    public void setItemTextAppearance(int n3) {
        this.textAppearance = n3;
        this.updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean bl2) {
        this.textAppearanceActiveBoldEnabled = bl2;
        this.updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        this.updateMenuView(false);
    }

    public void setItemVerticalPadding(int n3) {
        this.itemVerticalPadding = n3;
        this.updateMenuView(false);
    }

    public void setOverScrollMode(int n3) {
        this.overScrollMode = n3;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(n3);
        }
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        this.updateMenuView(false);
    }

    public void setSubheaderInsetEnd(int n3) {
        this.subheaderInsetEnd = n3;
        this.updateMenuView(false);
    }

    public void setSubheaderInsetStart(int n3) {
        this.subheaderInsetStart = n3;
        this.updateMenuView(false);
    }

    public void setSubheaderTextAppearance(int n3) {
        this.subheaderTextAppearance = n3;
        this.updateMenuView(false);
    }

    public void setUpdateSuspended(boolean bl2) {
        NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter = this.adapter;
        if (navigationMenuPresenter$NavigationMenuAdapter != null) {
            navigationMenuPresenter$NavigationMenuAdapter.setUpdateSuspended(bl2);
        }
    }

    public void updateMenuView(boolean bl2) {
        NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter = this.adapter;
        if (navigationMenuPresenter$NavigationMenuAdapter != null) {
            navigationMenuPresenter$NavigationMenuAdapter.update();
        }
    }
}

