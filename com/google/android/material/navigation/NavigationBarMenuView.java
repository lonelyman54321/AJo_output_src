/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 */
package com.google.android.material.navigation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.g;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarPresenter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

public abstract class NavigationBarMenuView
extends ViewGroup
implements i {
    private static final int[] CHECKED_STATE_SET = new int[]{0x10100A0};
    private static final int[] DISABLED_STATE_SET = new int[]{-16842910};
    private static final int ITEM_POOL_SIZE = 5;
    private static final int NO_PADDING = 255;
    private final SparseArray badgeDrawables;
    private NavigationBarItemView[] buttons;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorLabelPadding;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private final yw2 itemPool;
    private ColorStateList itemRippleColor;
    private int itemTextAppearanceActive;
    private boolean itemTextAppearanceActiveBoldEnabled;
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private d menu;
    private final View.OnClickListener onClickListener;
    private final SparseArray onTouchListeners;
    private NavigationBarPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final TransitionSet set;

    public NavigationBarMenuView(Context object) {
        super(object);
        SparseArray sparseArray;
        int n3 = 5;
        super(n3);
        this.itemPool = object;
        super(n3);
        this.onTouchListeners = object;
        int n4 = 0;
        object = null;
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        this.badgeDrawables = sparseArray = new SparseArray(n3);
        this.itemPaddingTop = n3 = -1;
        this.itemPaddingBottom = n3;
        this.itemActiveIndicatorLabelPadding = n3;
        this.itemActiveIndicatorResizeable = false;
        ColorStateList colorStateList = this.createDefaultColorStateList(16842808);
        this.itemTextColorDefault = colorStateList;
        n3 = (int)(this.isInEditMode() ? 1 : 0);
        if (n3 != 0) {
            n4 = 0;
            object = null;
            this.set = null;
        } else {
            super();
            this.set = colorStateList;
            colorStateList.i(0);
            object = this.getContext();
            int n7 = R$attr.motionDurationMedium4;
            Resources resources = this.getResources();
            int n8 = R$integer.material_motion_duration_long_1;
            int n10 = resources.getInteger(n8);
            n4 = MotionUtils.resolveThemeDuration(object, n7, n10);
            long l2 = n4;
            colorStateList.f(l2);
            object = this.getContext();
            n7 = R$attr.motionEasingStandard;
            resources = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            object = MotionUtils.resolveThemeInterpolator(object, n7, (TimeInterpolator)resources);
            colorStateList.g((TimeInterpolator)object);
            super();
            colorStateList.b((Transition)object);
        }
        super(this);
        this.onClickListener = object;
        object = ViewCompat.a;
        this.setImportantForAccessibility(1);
    }

    public static /* synthetic */ NavigationBarPresenter access$000(NavigationBarMenuView navigationBarMenuView) {
        return navigationBarMenuView.presenter;
    }

    public static /* synthetic */ d access$100(NavigationBarMenuView navigationBarMenuView) {
        return navigationBarMenuView.menu;
    }

    private Drawable createItemActiveIndicatorDrawable() {
        Object object = this.itemActiveIndicatorShapeAppearance;
        if (object != null && (object = this.itemActiveIndicatorColor) != null) {
            ShapeAppearanceModel shapeAppearanceModel = this.itemActiveIndicatorShapeAppearance;
            object = new MaterialShapeDrawable(shapeAppearanceModel);
            shapeAppearanceModel = this.itemActiveIndicatorColor;
            ((MaterialShapeDrawable)object).setFillColor((ColorStateList)shapeAppearanceModel);
            return object;
        }
        return null;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView)this.itemPool.b();
        if (navigationBarItemView == null) {
            navigationBarItemView = this.getContext();
            navigationBarItemView = this.createNavigationBarItemView((Context)navigationBarItemView);
        }
        return navigationBarItemView;
    }

    private boolean isValidId(int n3) {
        int n4 = -1;
        n3 = n3 != n4 ? 1 : 0;
        return n3 != 0;
    }

    private void removeUnusedBadges() {
        Object object;
        int n3;
        int n4;
        HashSet<Object> hashSet = new HashSet<Object>();
        int n7 = 0;
        SparseArray sparseArray = null;
        for (n4 = 0; n4 < (n3 = ((d)(object = this.menu)).size()); ++n4) {
            n3 = this.menu.getItem(n4).getItemId();
            object = n3;
            hashSet.add(object);
        }
        while (n7 < (n4 = (sparseArray = this.badgeDrawables).size())) {
            sparseArray = this.badgeDrawables;
            n4 = sparseArray.keyAt(n7);
            object = n4;
            n3 = (int)(hashSet.contains(object) ? 1 : 0);
            if (n3 == 0) {
                object = this.badgeDrawables;
                object.delete(n4);
            }
            ++n7;
        }
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        int n3 = navigationBarItemView.getId();
        boolean bl2 = this.isValidId(n3);
        if (!bl2) {
            return;
        }
        SparseArray sparseArray = this.badgeDrawables;
        BadgeDrawable badgeDrawable = (BadgeDrawable)sparseArray.get(n3);
        if (badgeDrawable != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void validateMenuItemId(int n3) {
        boolean bl2 = this.isValidId(n3);
        if (bl2) {
            return;
        }
        String string2 = UX.a(n3, " is not a valid view id");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void buildMenuView() {
        int n3;
        int n4;
        int bl2;
        yw2 yw22;
        Object object;
        int n42;
        Object object2;
        int n7;
        this.removeAllViews();
        Object object3 = this.buttons;
        int n8 = 0;
        if (object3 != null) {
            n7 = ((NavigationBarItemView[])object3).length;
            object2 = null;
            for (n42 = 0; n42 < n7; ++n42) {
                object = object3[n42];
                if (object == null) continue;
                yw22 = this.itemPool;
                yw22.a(object);
                ((NavigationBarItemView)object).clear();
            }
        }
        if ((bl2 = ((d)(object3 = this.menu)).size()) == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        this.removeUnusedBadges();
        object3 = new NavigationBarItemView[this.menu.size()];
        this.buttons = object3;
        int n10 = this.labelVisibilityMode;
        n7 = this.menu.getVisibleItems().size();
        boolean bl3 = this.isShifting(n10, n7);
        n7 = 0;
        while (true) {
            object2 = this.menu;
            n42 = ((d)object2).size();
            n4 = 1;
            if (n7 >= n42) break;
            this.presenter.setUpdateSuspended(n4 != 0);
            this.menu.getItem(n7).setCheckable(n4 != 0);
            this.presenter.setUpdateSuspended(false);
            this.buttons[n7] = object2 = this.getNewItem();
            object = this.itemIconTint;
            ((NavigationBarItemView)object2).setIconTintList((ColorStateList)object);
            n4 = this.itemIconSize;
            ((NavigationBarItemView)object2).setIconSize(n4);
            object = this.itemTextColorDefault;
            ((NavigationBarItemView)object2).setTextColor((ColorStateList)object);
            n4 = this.itemTextAppearanceInactive;
            ((NavigationBarItemView)object2).setTextAppearanceInactive(n4);
            n4 = this.itemTextAppearanceActive;
            ((NavigationBarItemView)object2).setTextAppearanceActive(n4);
            n4 = (int)(this.itemTextAppearanceActiveBoldEnabled ? 1 : 0);
            ((NavigationBarItemView)object2).setTextAppearanceActiveBoldEnabled(n4 != 0);
            object = this.itemTextColorFromUser;
            ((NavigationBarItemView)object2).setTextColor((ColorStateList)object);
            n4 = this.itemPaddingTop;
            int n14 = -1;
            if (n4 != n14) {
                ((NavigationBarItemView)object2).setItemPaddingTop(n4);
            }
            if ((n4 = this.itemPaddingBottom) != n14) {
                ((NavigationBarItemView)object2).setItemPaddingBottom(n4);
            }
            if ((n4 = this.itemActiveIndicatorLabelPadding) != n14) {
                ((NavigationBarItemView)object2).setActiveIndicatorLabelPadding(n4);
            }
            n4 = this.itemActiveIndicatorWidth;
            ((NavigationBarItemView)object2).setActiveIndicatorWidth(n4);
            n4 = this.itemActiveIndicatorHeight;
            ((NavigationBarItemView)object2).setActiveIndicatorHeight(n4);
            n4 = this.itemActiveIndicatorMarginHorizontal;
            ((NavigationBarItemView)object2).setActiveIndicatorMarginHorizontal(n4);
            object = this.createItemActiveIndicatorDrawable();
            ((NavigationBarItemView)object2).setActiveIndicatorDrawable((Drawable)object);
            n4 = (int)(this.itemActiveIndicatorResizeable ? 1 : 0);
            ((NavigationBarItemView)object2).setActiveIndicatorResizeable(n4 != 0);
            n4 = this.itemActiveIndicatorEnabled;
            ((NavigationBarItemView)object2).setActiveIndicatorEnabled(n4 != 0);
            object = this.itemBackground;
            if (object != null) {
                ((NavigationBarItemView)object2).setItemBackground((Drawable)object);
            } else {
                n4 = this.itemBackgroundRes;
                ((NavigationBarItemView)object2).setItemBackground(n4);
            }
            object = this.itemRippleColor;
            ((NavigationBarItemView)object2).setItemRippleColor((ColorStateList)object);
            ((NavigationBarItemView)object2).setShifting(bl3);
            n4 = this.labelVisibilityMode;
            ((NavigationBarItemView)object2).setLabelVisibilityMode(n4);
            object = (f)this.menu.getItem(n7);
            ((NavigationBarItemView)object2).initialize((f)object, 0);
            ((NavigationBarItemView)object2).setItemPosition(n7);
            n4 = ((f)object).a;
            yw22 = (View.OnTouchListener)this.onTouchListeners.get(n4);
            object2.setOnTouchListener((View.OnTouchListener)yw22);
            yw22 = this.onClickListener;
            object2.setOnClickListener((View.OnClickListener)yw22);
            n14 = this.selectedItemId;
            if (n14 != 0 && n4 == n14) {
                this.selectedItemPosition = n7;
            }
            this.setBadgeIfNeeded((NavigationBarItemView)object2);
            this.addView((View)object2);
            ++n7;
        }
        int n15 = this.menu.size() - n4;
        n8 = this.selectedItemPosition;
        this.selectedItemPosition = n3 = Math.min(n15, n8);
        this.menu.getItem(n3).setChecked(n4 != 0);
    }

    public ColorStateList createDefaultColorStateList(int n3) {
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
        int[] nArray3 = ViewGroup.EMPTY_STATE_SET;
        nArrayArray[2] = nArray3;
        n3 = object.getColorForState(nArray, n8);
        object = new int[]{n3, n14, n8};
        theme2 = new ColorStateList((int[][])nArrayArray, (int[])object);
        return theme2;
    }

    public abstract NavigationBarItemView createNavigationBarItemView(Context var1);

    public NavigationBarItemView findItemView(int n3) {
        this.validateMenuItemId(n3);
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                int n4 = navigationBarItemView.getId();
                if (n4 != n3) continue;
                return navigationBarItemView;
            }
        }
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.itemActiveIndicatorLabelPadding;
    }

    public BadgeDrawable getBadge(int n3) {
        return (BadgeDrawable)this.badgeDrawables.get(n3);
    }

    public SparseArray getBadgeDrawables() {
        return this.badgeDrawables;
    }

    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.itemActiveIndicatorColor;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.itemActiveIndicatorEnabled;
    }

    public int getItemActiveIndicatorHeight() {
        return this.itemActiveIndicatorHeight;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.itemActiveIndicatorMarginHorizontal;
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.itemActiveIndicatorShapeAppearance;
    }

    public int getItemActiveIndicatorWidth() {
        return this.itemActiveIndicatorWidth;
    }

    public Drawable getItemBackground() {
        int n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null && (n3 = navigationBarItemViewArray.length) > 0) {
            return navigationBarItemViewArray[0].getBackground();
        }
        return this.itemBackground;
    }

    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public int getItemIconSize() {
        return this.itemIconSize;
    }

    public int getItemPaddingBottom() {
        return this.itemPaddingBottom;
    }

    public int getItemPaddingTop() {
        return this.itemPaddingTop;
    }

    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    public d getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int n3) {
        NavigationBarItemView navigationBarItemView;
        this.validateMenuItemId(n3);
        BadgeDrawable badgeDrawable = (BadgeDrawable)this.badgeDrawables.get(n3);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.create(this.getContext());
            SparseArray sparseArray = this.badgeDrawables;
            sparseArray.put(n3, (Object)badgeDrawable);
        }
        if ((navigationBarItemView = this.findItemView(n3)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public int getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(d d2) {
        this.menu = d2;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.itemActiveIndicatorResizeable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isShifting(int n3, int n4) {
        int n7 = -1;
        boolean bl2 = false;
        if (n3 == n7) {
            n3 = 3;
            if (n4 <= n3) return bl2;
            return true;
        }
        if (n3 != 0) return bl2;
        return true;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int n3 = this.menu.getVisibleItems().size();
        int n4 = 1;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = (AccessibilityNodeInfo.CollectionInfo)C2$e.a((int)n4, (int)n3, (int)n4, (boolean)false).a;
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void removeBadge(int n3) {
        this.validateMenuItemId(n3);
        NavigationBarItemView navigationBarItemView = this.findItemView(n3);
        if (navigationBarItemView != null) {
            navigationBarItemView.removeBadge();
        }
        this.badgeDrawables.put(n3, null);
    }

    public void restoreBadgeDrawables(SparseArray navigationBarItemViewArray) {
        Object object;
        int n3;
        int n4;
        int n7 = 0;
        for (n4 = 0; n4 < (n3 = navigationBarItemViewArray.size()); ++n4) {
            object = this.badgeDrawables;
            n3 = navigationBarItemViewArray.keyAt(n4);
            int n8 = object.indexOfKey(n3);
            if (n8 >= 0) continue;
            object = this.badgeDrawables;
            BadgeDrawable badgeDrawable = (BadgeDrawable)navigationBarItemViewArray.get(n3);
            object.append(n3, (Object)badgeDrawable);
        }
        navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            n4 = navigationBarItemViewArray.length;
            while (n7 < n4) {
                NavigationBarItemView navigationBarItemView = navigationBarItemViewArray[n7];
                object = this.badgeDrawables;
                int n10 = navigationBarItemView.getId();
                if ((object = (BadgeDrawable)object.get(n10)) != null) {
                    navigationBarItemView.setBadge((BadgeDrawable)object);
                }
                ++n7;
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int n3) {
        this.itemActiveIndicatorLabelPadding = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setActiveIndicatorLabelPadding(n3);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList navigationBarItemViewArray) {
        this.itemActiveIndicatorColor = navigationBarItemViewArray;
        navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                Drawable drawable2 = this.createItemActiveIndicatorDrawable();
                navigationBarItemView.setActiveIndicatorDrawable(drawable2);
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean bl2) {
        this.itemActiveIndicatorEnabled = bl2;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setActiveIndicatorEnabled(bl2);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int n3) {
        this.itemActiveIndicatorHeight = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setActiveIndicatorHeight(n3);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int n3) {
        this.itemActiveIndicatorMarginHorizontal = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(n3);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean bl2) {
        this.itemActiveIndicatorResizeable = bl2;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setActiveIndicatorResizeable(bl2);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel navigationBarItemViewArray) {
        this.itemActiveIndicatorShapeAppearance = navigationBarItemViewArray;
        navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                Drawable drawable2 = this.createItemActiveIndicatorDrawable();
                navigationBarItemView.setActiveIndicatorDrawable(drawable2);
            }
        }
    }

    public void setItemActiveIndicatorWidth(int n3) {
        this.itemActiveIndicatorWidth = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setActiveIndicatorWidth(n3);
            }
        }
    }

    public void setItemBackground(Drawable drawable2) {
        this.itemBackground = drawable2;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setItemBackground(drawable2);
            }
        }
    }

    public void setItemBackgroundRes(int n3) {
        this.itemBackgroundRes = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setItemBackground(n3);
            }
        }
    }

    public void setItemIconSize(int n3) {
        this.itemIconSize = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setIconSize(n3);
            }
        }
    }

    public void setItemOnTouchListener(int n3, View.OnTouchListener onTouchListener) {
        NavigationBarItemView[] navigationBarItemViewArray;
        if (onTouchListener == null) {
            navigationBarItemViewArray = this.onTouchListeners;
            navigationBarItemViewArray.remove(n3);
        } else {
            navigationBarItemViewArray = this.onTouchListeners;
            navigationBarItemViewArray.put(n3, (Object)onTouchListener);
        }
        navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                f f5 = navigationBarItemView.getItemData();
                int n4 = f5.a;
                if (n4 != n3) continue;
                navigationBarItemView.setOnTouchListener(onTouchListener);
            }
        }
    }

    public void setItemPaddingBottom(int n3) {
        this.itemPaddingBottom = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setItemPaddingBottom(n3);
            }
        }
    }

    public void setItemPaddingTop(int n3) {
        this.itemPaddingTop = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setItemPaddingTop(n3);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int n3) {
        this.itemTextAppearanceActive = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setTextAppearanceActive(n3);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList == null) continue;
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean bl2) {
        this.itemTextAppearanceActiveBoldEnabled = bl2;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(bl2);
            }
        }
    }

    public void setItemTextAppearanceInactive(int n3) {
        this.itemTextAppearanceInactive = n3;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setTextAppearanceInactive(n3);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList == null) continue;
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArray = this.buttons;
        if (navigationBarItemViewArray != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArray) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int n3) {
        this.labelVisibilityMode = n3;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.presenter = navigationBarPresenter;
    }

    public void tryRestoreSelectedItemId(int n3) {
        d d2 = this.menu;
        int n4 = d2.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            MenuItem menuItem = this.menu.getItem(i3);
            int n7 = menuItem.getItemId();
            if (n3 != n7) continue;
            this.selectedItemId = n3;
            this.selectedItemPosition = i3;
            n3 = 1;
            menuItem.setChecked(n3 != 0);
            break;
        }
    }

    public void updateMenuView() {
        Object object;
        d d2 = this.menu;
        if (d2 != null && (object = this.buttons) != null) {
            int n3;
            Object object2;
            int n4;
            int n7;
            int n8 = d2.size();
            if (n8 != (n7 = ((NavigationBarItemView[])(object = this.buttons)).length)) {
                this.buildMenuView();
                return;
            }
            n7 = this.selectedItemId;
            for (n4 = 0; n4 < n8; ++n4) {
                int n10;
                object2 = this.menu.getItem(n4);
                n3 = object2.isChecked();
                if (n3 == 0) continue;
                this.selectedItemId = n10 = object2.getItemId();
                this.selectedItemPosition = n4;
            }
            n4 = this.selectedItemId;
            if (n7 != n4 && (object = this.set) != null) {
                g.a(this, (Transition)object);
            }
            n7 = this.labelVisibilityMode;
            n4 = this.menu.getVisibleItems().size();
            n7 = (int)(this.isShifting(n7, n4) ? 1 : 0);
            for (n4 = 0; n4 < n8; ++n4) {
                this.presenter.setUpdateSuspended(true);
                object2 = this.buttons[n4];
                n3 = this.labelVisibilityMode;
                ((NavigationBarItemView)object2).setLabelVisibilityMode(n3);
                this.buttons[n4].setShifting(n7 != 0);
                object2 = this.buttons[n4];
                f f5 = (f)this.menu.getItem(n4);
                ((NavigationBarItemView)object2).initialize(f5, 0);
                object2 = this.presenter;
                ((NavigationBarPresenter)object2).setUpdateSuspended(false);
            }
        }
    }
}

