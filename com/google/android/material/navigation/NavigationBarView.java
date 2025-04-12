/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.FrameLayout
 */
package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.navigation.NavigationBarMenu;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarPresenter;
import com.google.android.material.navigation.NavigationBarView$1;
import com.google.android.material.navigation.NavigationBarView$OnItemReselectedListener;
import com.google.android.material.navigation.NavigationBarView$OnItemSelectedListener;
import com.google.android.material.navigation.NavigationBarView$SavedState;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public abstract class NavigationBarView
extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = 255;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    private final NavigationBarMenuView menuView;
    private final NavigationBarPresenter presenter;
    private NavigationBarView$OnItemReselectedListener reselectedListener;
    private NavigationBarView$OnItemSelectedListener selectedListener;

    public NavigationBarView(Context object, AttributeSet object2, int n3, int n4) {
        float f5;
        object = MaterialThemeOverlay.wrap((Context)object, object2, n3, n4);
        super((Context)object, object2, n3);
        this.presenter = object = new NavigationBarPresenter();
        Context context = this.getContext();
        Object object3 = R$styleable.NavigationBarView;
        int n7 = R$styleable.NavigationBarView_itemTextAppearanceInactive;
        int n8 = R$styleable.NavigationBarView_itemTextAppearanceActive;
        Object object4 = new int[]{n7, n8};
        Object object5 = context;
        Object attributeSet = object2;
        int bl2 = n3;
        int n10 = n4;
        object5 = ThemeEnforcement.obtainTintedStyledAttributes(context, object2, (int[])object3, n3, n4, object4);
        object3 = ((Object)((Object)this)).getClass();
        int n14 = this.getMaxItemCount();
        this.menu = attributeSet = new NavigationBarMenu(context, (Class)object3, n14);
        object3 = this.createNavigationBarMenuView(context);
        this.menuView = object3;
        ((NavigationBarPresenter)object).setMenuView((NavigationBarMenuView)object3);
        boolean bl3 = true;
        ((NavigationBarPresenter)object).setId((int)(bl3 ? 1 : 0));
        ((NavigationBarMenuView)object3).setPresenter((NavigationBarPresenter)object);
        ((d)attributeSet).addMenuPresenter((h)object);
        Context context2 = this.getContext();
        ((NavigationBarPresenter)object).initForMenu(context2, (d)attributeSet);
        int n15 = R$styleable.NavigationBarView_itemIconTint;
        context2 = ((Tn3)object5).b;
        n15 = (int)(context2.hasValue(n15) ? 1 : 0);
        if (n15 != 0) {
            n15 = R$styleable.NavigationBarView_itemIconTint;
            object = ((Tn3)object5).a(n15);
            ((NavigationBarMenuView)object3).setIconTintList((ColorStateList)object);
        } else {
            n15 = 16842808;
            f5 = 2.3693715E-38f;
            object = ((NavigationBarMenuView)object3).createDefaultColorStateList(n15);
            ((NavigationBarMenuView)object3).setIconTintList((ColorStateList)object);
        }
        n15 = R$styleable.NavigationBarView_itemIconSize;
        context2 = this.getResources();
        int n16 = R$dimen.mtrl_navigation_bar_item_default_icon_size;
        n10 = context2.getDimensionPixelSize(n16);
        object4 = ((Tn3)object5).b;
        n15 = object4.getDimensionPixelSize(n15, n10);
        this.setItemIconSize(n15);
        n15 = R$styleable.NavigationBarView_itemTextAppearanceInactive;
        n15 = (int)(object4.hasValue(n15) ? 1 : 0);
        n10 = 0;
        context2 = null;
        if (n15 != 0) {
            n15 = R$styleable.NavigationBarView_itemTextAppearanceInactive;
            n15 = object4.getResourceId(n15, 0);
            this.setItemTextAppearanceInactive(n15);
        }
        n15 = R$styleable.NavigationBarView_itemTextAppearanceActive;
        if ((n15 = (int)(object4.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationBarView_itemTextAppearanceActive;
            n15 = object4.getResourceId(n15, 0);
            this.setItemTextAppearanceActive(n15);
        }
        n15 = R$styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled;
        n15 = (int)(object4.getBoolean(n15, bl3) ? 1 : 0);
        this.setItemTextAppearanceActiveBoldEnabled(n15 != 0);
        n15 = R$styleable.NavigationBarView_itemTextColor;
        n15 = (int)(object4.hasValue(n15) ? 1 : 0);
        if (n15 != 0) {
            n15 = R$styleable.NavigationBarView_itemTextColor;
            object = ((Tn3)object5).a(n15);
            this.setItemTextColor((ColorStateList)object);
        }
        object = this.getBackground();
        ColorStateList colorStateList = DrawableUtils.getColorStateListOrNull((Drawable)object);
        if (object == null || colorStateList != null) {
            object = ShapeAppearanceModel.builder(context, object2, n3, n4).build();
            object2 = new MaterialShapeDrawable((ShapeAppearanceModel)object);
            if (colorStateList != null) {
                object2.setFillColor(colorStateList);
            }
            object2.initializeElevationOverlay(context);
            object = ViewCompat.a;
            this.setBackground((Drawable)object2);
        }
        n15 = R$styleable.NavigationBarView_itemPaddingTop;
        if ((n15 = (int)(object4.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationBarView_itemPaddingTop;
            n15 = object4.getDimensionPixelSize(n15, 0);
            this.setItemPaddingTop(n15);
        }
        n15 = R$styleable.NavigationBarView_itemPaddingBottom;
        if ((n15 = (int)(object4.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationBarView_itemPaddingBottom;
            n15 = object4.getDimensionPixelSize(n15, 0);
            this.setItemPaddingBottom(n15);
        }
        n15 = R$styleable.NavigationBarView_activeIndicatorLabelPadding;
        if ((n15 = (int)(object4.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationBarView_activeIndicatorLabelPadding;
            n15 = object4.getDimensionPixelSize(n15, 0);
            this.setActiveIndicatorLabelPadding(n15);
        }
        n15 = R$styleable.NavigationBarView_elevation;
        if ((n15 = (int)(object4.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationBarView_elevation;
            n15 = object4.getDimensionPixelSize(n15, 0);
            f5 = n15;
            this.setElevation(f5);
        }
        n15 = R$styleable.NavigationBarView_backgroundTint;
        object = MaterialResources.getColorStateList(context, (Tn3)object5, n15);
        object2 = this.getBackground().mutate();
        object2.setTintList((ColorStateList)object);
        n15 = R$styleable.NavigationBarView_labelVisibilityMode;
        int n17 = -1;
        n15 = object4.getInteger(n15, n17);
        this.setLabelVisibilityMode(n15);
        n15 = R$styleable.NavigationBarView_itemBackground;
        n15 = object4.getResourceId(n15, 0);
        if (n15 != 0) {
            ((NavigationBarMenuView)object3).setItemBackgroundRes(n15);
        } else {
            n15 = R$styleable.NavigationBarView_itemRippleColor;
            object = MaterialResources.getColorStateList(context, (Tn3)object5, n15);
            this.setItemRippleColor((ColorStateList)object);
        }
        n15 = R$styleable.NavigationBarView_itemActiveIndicatorStyle;
        n15 = object4.getResourceId(n15, 0);
        if (n15 != 0) {
            this.setItemActiveIndicatorEnabled(bl3);
            object2 = R$styleable.NavigationBarActiveIndicator;
            object = context.obtainStyledAttributes(n15, (int[])object2);
            n17 = R$styleable.NavigationBarActiveIndicator_android_width;
            n17 = object.getDimensionPixelSize(n17, 0);
            this.setItemActiveIndicatorWidth(n17);
            n17 = R$styleable.NavigationBarActiveIndicator_android_height;
            n17 = object.getDimensionPixelSize(n17, 0);
            this.setItemActiveIndicatorHeight(n17);
            n17 = R$styleable.NavigationBarActiveIndicator_marginHorizontal;
            n17 = object.getDimensionPixelOffset(n17, 0);
            this.setItemActiveIndicatorMarginHorizontal(n17);
            n17 = R$styleable.NavigationBarActiveIndicator_android_color;
            object2 = MaterialResources.getColorStateList(context, (TypedArray)object, n17);
            this.setItemActiveIndicatorColor((ColorStateList)object2);
            n17 = R$styleable.NavigationBarActiveIndicator_shapeAppearance;
            n17 = object.getResourceId(n17, 0);
            object2 = ShapeAppearanceModel.builder(context, n17, 0).build();
            this.setItemActiveIndicatorShapeAppearance((ShapeAppearanceModel)object2);
            object.recycle();
        }
        n15 = R$styleable.NavigationBarView_menu;
        if ((n15 = (int)(object4.hasValue(n15) ? 1 : 0)) != 0) {
            n15 = R$styleable.NavigationBarView_menu;
            n15 = object4.getResourceId(n15, 0);
            this.inflateMenu(n15);
        }
        ((Tn3)object5).g();
        this.addView((View)object3);
        object = new NavigationBarView$1(this);
        ((d)attributeSet).setCallback((d$a)object);
    }

    public static /* synthetic */ NavigationBarView$OnItemReselectedListener access$000(NavigationBarView navigationBarView) {
        return navigationBarView.reselectedListener;
    }

    public static /* synthetic */ NavigationBarView$OnItemSelectedListener access$100(NavigationBarView navigationBarView) {
        return navigationBarView.selectedListener;
    }

    private MenuInflater getMenuInflater() {
        MenuInflater menuInflater = this.menuInflater;
        if (menuInflater == null) {
            Context context = this.getContext();
            this.menuInflater = menuInflater = new vg3_1(context);
        }
        return this.menuInflater;
    }

    public abstract NavigationBarMenuView createNavigationBarMenuView(Context var1);

    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    public BadgeDrawable getBadge(int n3) {
        return this.menuView.getBadge(n3);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.menu;
    }

    public i getMenuView() {
        return this.menuView;
    }

    public BadgeDrawable getOrCreateBadge(int n3) {
        return this.menuView.getOrCreateBadge(n3);
    }

    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int n3) {
        NavigationBarPresenter navigationBarPresenter = this.presenter;
        boolean bl2 = true;
        navigationBarPresenter.setUpdateSuspended(bl2);
        navigationBarPresenter = this.getMenuInflater();
        NavigationBarMenu navigationBarMenu = this.menu;
        navigationBarPresenter.inflate(n3, navigationBarMenu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(bl2);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof NavigationBarView$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (NavigationBarView$SavedState)parcelable;
        Object object = parcelable.getSuperState();
        super.onRestoreInstanceState((Parcelable)object);
        object = this.menu;
        parcelable = parcelable.menuPresenterState;
        ((d)object).restorePresenterStates((Bundle)parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(parcelable);
        parcelable = new Bundle();
        navigationBarView$SavedState.menuPresenterState = parcelable;
        this.menu.savePresenterStates((Bundle)parcelable);
        return navigationBarView$SavedState;
    }

    public void removeBadge(int n3) {
        this.menuView.removeBadge(n3);
    }

    public void setActiveIndicatorLabelPadding(int n3) {
        this.menuView.setActiveIndicatorLabelPadding(n3);
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation((View)this, f5);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean bl2) {
        this.menuView.setItemActiveIndicatorEnabled(bl2);
    }

    public void setItemActiveIndicatorHeight(int n3) {
        this.menuView.setItemActiveIndicatorHeight(n3);
    }

    public void setItemActiveIndicatorMarginHorizontal(int n3) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(n3);
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(int n3) {
        this.menuView.setItemActiveIndicatorWidth(n3);
    }

    public void setItemBackground(Drawable drawable2) {
        this.menuView.setItemBackground(drawable2);
    }

    public void setItemBackgroundResource(int n3) {
        this.menuView.setItemBackgroundRes(n3);
    }

    public void setItemIconSize(int n3) {
        this.menuView.setItemIconSize(n3);
    }

    public void setItemIconSizeRes(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setItemIconSize(n3);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int n3, View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(n3, onTouchListener);
    }

    public void setItemPaddingBottom(int n3) {
        this.menuView.setItemPaddingBottom(n3);
    }

    public void setItemPaddingTop(int n3) {
        this.menuView.setItemPaddingTop(n3);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int n3) {
        this.menuView.setItemTextAppearanceActive(n3);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean bl2) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(bl2);
    }

    public void setItemTextAppearanceInactive(int n3) {
        this.menuView.setItemTextAppearanceInactive(n3);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int n3) {
        NavigationBarMenuView navigationBarMenuView = this.menuView;
        int n4 = navigationBarMenuView.getLabelVisibilityMode();
        if (n4 != n3) {
            this.menuView.setLabelVisibilityMode(n3);
            NavigationBarPresenter navigationBarPresenter = this.presenter;
            n4 = 0;
            navigationBarMenuView = null;
            navigationBarPresenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(NavigationBarView$OnItemReselectedListener navigationBarView$OnItemReselectedListener) {
        this.reselectedListener = navigationBarView$OnItemReselectedListener;
    }

    public void setOnItemSelectedListener(NavigationBarView$OnItemSelectedListener navigationBarView$OnItemSelectedListener) {
        this.selectedListener = navigationBarView$OnItemSelectedListener;
    }

    public void setSelectedItemId(int n3) {
        NavigationBarPresenter navigationBarPresenter;
        boolean bl2;
        NavigationBarMenu navigationBarMenu = this.menu;
        MenuItem menuItem = navigationBarMenu.findItem(n3);
        if (menuItem != null && !(bl2 = (navigationBarMenu = this.menu).performItemAction(menuItem, navigationBarPresenter = this.presenter, 0))) {
            bl2 = true;
            menuItem.setChecked(bl2);
        }
    }
}

