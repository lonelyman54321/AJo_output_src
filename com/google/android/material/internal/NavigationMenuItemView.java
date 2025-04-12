/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$Theme
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.StateListDrawable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewStub
 *  android.widget.CheckedTextView
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.internal.ForegroundLinearLayout;
import com.google.android.material.internal.NavigationMenuItemView$1;

public class NavigationMenuItemView
extends ForegroundLinearLayout
implements i$a {
    private static final int[] CHECKED_STATE_SET = new int[]{0x10100A0};
    private final a accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    boolean isBold;
    private f itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        boolean bl2;
        this.isBold = bl2 = true;
        NavigationMenuItemView$1 navigationMenuItemView$1 = new NavigationMenuItemView$1(this);
        this.accessibilityDelegate = navigationMenuItemView$1;
        this.setOrientation(0);
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        int n4 = R$layout.design_navigation_menu_item;
        layoutInflater.inflate(n4, (ViewGroup)this, bl2);
        context = context.getResources();
        int n7 = R$dimen.design_navigation_icon_size;
        int n8 = context.getDimensionPixelSize(n7);
        this.setIconSize(n8);
        n8 = R$id.design_menu_item_text;
        context = (CheckedTextView)this.findViewById(n8);
        this.textView = context;
        context.setDuplicateParentStateEnabled(bl2);
        ViewCompat.s((View)context, navigationMenuItemView$1);
    }

    private void adjustAppearance() {
        boolean bl2 = this.shouldExpandActionArea();
        if (bl2) {
            Object object = this.textView;
            int n3 = 8;
            object.setVisibility(n3);
            object = this.actionArea;
            if (object != null) {
                object = (LinearLayoutCompat$LayoutParams)object.getLayoutParams();
                object.width = n3 = -1;
                FrameLayout frameLayout = this.actionArea;
                frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
            }
        } else {
            Object object = this.textView;
            int n4 = 0;
            FrameLayout frameLayout = null;
            object.setVisibility(0);
            object = this.actionArea;
            if (object != null) {
                object = (LinearLayoutCompat$LayoutParams)object.getLayoutParams();
                object.width = n4 = -2;
                frameLayout = this.actionArea;
                frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
            }
        }
    }

    private StateListDrawable createDefaultBackground() {
        boolean bl2;
        int n3;
        Object object = new TypedValue();
        Resources.Theme theme = this.getContext().getTheme();
        boolean bl3 = theme.resolveAttribute(n3 = R$attr.colorControlHighlight, object, bl2 = true);
        if (bl3) {
            theme = new StateListDrawable();
            Object object2 = CHECKED_STATE_SET;
            int n4 = object.data;
            ColorDrawable colorDrawable = new ColorDrawable(n4);
            theme.addState(object2, (Drawable)colorDrawable);
            object = ViewGroup.EMPTY_STATE_SET;
            object2 = new ColorDrawable;
            object2(0);
            theme.addState((int[])object, (Drawable)object2);
            return theme;
        }
        return null;
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout == null) {
                int n3 = R$id.design_menu_item_action_area_stub;
                this.actionArea = frameLayout = (FrameLayout)((ViewStub)this.findViewById(n3)).inflate();
            }
            if ((frameLayout = view.getParent()) != null) {
                frameLayout = (ViewGroup)view.getParent();
                frameLayout.removeView(view);
            }
            this.actionArea.removeAllViews();
            frameLayout = this.actionArea;
            frameLayout.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        boolean bl2;
        f f5 = this.itemData;
        CharSequence charSequence = f5.e;
        if (charSequence == null && (f5 = f5.getIcon()) == null && (f5 = this.itemData.getActionView()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            f5 = null;
        }
        return bl2;
    }

    public f getItemData() {
        return this.itemData;
    }

    public void initialize(f object, int n3) {
        Object object2;
        this.itemData = object;
        n3 = ((f)object).a;
        if (n3 > 0) {
            this.setId(n3);
        }
        if ((n3 = (int)(((f)object).isVisible() ? 1 : 0)) != 0) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = 8;
        }
        this.setVisibility(n3);
        object2 = this.getBackground();
        if (object2 == null) {
            object2 = this.createDefaultBackground();
            this.setBackground((Drawable)object2);
        }
        n3 = (int)(((f)object).isCheckable() ? 1 : 0);
        this.setCheckable(n3 != 0);
        n3 = (int)(((f)object).isChecked() ? 1 : 0);
        this.setChecked(n3 != 0);
        n3 = (int)(((f)object).isEnabled() ? 1 : 0);
        this.setEnabled(n3 != 0);
        object2 = ((f)object).e;
        this.setTitle((CharSequence)object2);
        object2 = ((f)object).getIcon();
        this.setIcon((Drawable)object2);
        object2 = ((f)object).getActionView();
        this.setActionView((View)object2);
        object2 = ((f)object).q;
        this.setContentDescription((CharSequence)object2);
        object = ((f)object).r;
        vo3_0.a((View)this, (CharSequence)object);
        this.adjustAppearance();
    }

    public void initialize(f f5, boolean bl2) {
        this.isBold = bl2;
        this.initialize(f5, 0);
    }

    public int[] onCreateDrawableState(int n3) {
        boolean bl2;
        int[] nArray = super.onCreateDrawableState(++n3);
        Object object = this.itemData;
        if (object != null && (bl2 = ((f)object).isCheckable()) && (bl2 = ((f)(object = this.itemData)).isChecked())) {
            object = CHECKED_STATE_SET;
            View.mergeDrawableStates((int[])nArray, (int[])object);
        }
        return nArray;
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean bl2) {
        this.refreshDrawableState();
        boolean bl3 = this.checkable;
        if (bl3 != bl2) {
            this.checkable = bl2;
            a a2 = this.accessibilityDelegate;
            CheckedTextView checkedTextView = this.textView;
            int n3 = 2048;
            a2.sendAccessibilityEvent((View)checkedTextView, n3);
        }
    }

    public void setChecked(boolean bl2) {
        this.refreshDrawableState();
        this.textView.setChecked(bl2);
        CheckedTextView checkedTextView = this.textView;
        Typeface typeface = checkedTextView.getTypeface();
        bl2 = bl2 && (bl2 = this.isBold);
        checkedTextView.setTypeface(typeface, (int)(bl2 ? 1 : 0));
    }

    public void setHorizontalPadding(int n3) {
        int n4 = this.getPaddingTop();
        int n7 = this.getPaddingBottom();
        this.setPadding(n3, n4, n3, n7);
    }

    public void setIcon(Drawable drawable2) {
        if (drawable2 != null) {
            int n3 = this.hasIconTintList;
            if (n3 != 0) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                if (constantState != null) {
                    drawable2 = constantState.newDrawable();
                }
                drawable2 = ut0_0.h(drawable2).mutate();
                constantState = this.iconTintList;
                drawable2.setTintList((ColorStateList)constantState);
            }
            n3 = this.iconSize;
            drawable2.setBounds(0, 0, n3, n3);
        } else {
            int n4 = this.needsEmptyIcon;
            if (n4 != 0) {
                drawable2 = this.emptyDrawable;
                if (drawable2 == null) {
                    drawable2 = this.getResources();
                    n4 = R$drawable.navigation_empty_icon;
                    Resources.Theme theme = this.getContext().getTheme();
                    this.emptyDrawable = drawable2 = drawable2.getDrawable(n4, theme);
                    if (drawable2 != null) {
                        n4 = this.iconSize;
                        drawable2.setBounds(0, 0, n4, n4);
                    }
                }
                drawable2 = this.emptyDrawable;
            }
        }
        this.textView.setCompoundDrawablesRelative(drawable2, null, null, null);
    }

    public void setIconPadding(int n3) {
        this.textView.setCompoundDrawablePadding(n3);
    }

    public void setIconSize(int n3) {
        this.iconSize = n3;
    }

    public void setIconTintList(ColorStateList object) {
        boolean bl2;
        this.iconTintList = object;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.hasIconTintList = bl2;
        object = this.itemData;
        if (object != null) {
            object = ((f)object).getIcon();
            this.setIcon((Drawable)object);
        }
    }

    public void setMaxLines(int n3) {
        this.textView.setMaxLines(n3);
    }

    public void setNeedsEmptyIcon(boolean bl2) {
        this.needsEmptyIcon = bl2;
    }

    public void setShortcut(boolean bl2, char c2) {
    }

    public void setTextAppearance(int n3) {
        Hm3.f((TextView)this.textView, n3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }
}

