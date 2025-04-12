/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$TabView;

public class TabLayout$Tab {
    public static final int INVALID_POSITION = 255;
    private CharSequence contentDesc;
    private View customView;
    private Drawable icon;
    private int id;
    private int labelVisibilityMode;
    public TabLayout parent;
    private int position;
    private Object tag;
    private CharSequence text;
    public TabLayout$TabView view;

    public TabLayout$Tab() {
        int n3;
        this.position = n3 = -1;
        this.labelVisibilityMode = 1;
        this.id = n3;
    }

    public static /* synthetic */ int access$000(TabLayout$Tab tabLayout$Tab) {
        return tabLayout$Tab.id;
    }

    public static /* synthetic */ int access$1500(TabLayout$Tab tabLayout$Tab) {
        return tabLayout$Tab.labelVisibilityMode;
    }

    public static /* synthetic */ CharSequence access$300(TabLayout$Tab tabLayout$Tab) {
        return tabLayout$Tab.contentDesc;
    }

    public static /* synthetic */ CharSequence access$400(TabLayout$Tab tabLayout$Tab) {
        return tabLayout$Tab.text;
    }

    public BadgeDrawable getBadge() {
        return TabLayout$TabView.access$1000(this.view);
    }

    public CharSequence getContentDescription() {
        Object object = this.view;
        object = object == null ? null : object.getContentDescription();
        return object;
    }

    public View getCustomView() {
        return this.customView;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.id;
    }

    public BadgeDrawable getOrCreateBadge() {
        return TabLayout$TabView.access$800(this.view);
    }

    public int getPosition() {
        return this.position;
    }

    public int getTabLabelVisibility() {
        return this.labelVisibilityMode;
    }

    public Object getTag() {
        return this.tag;
    }

    public CharSequence getText() {
        return this.text;
    }

    public boolean isSelected() {
        Object object = this.parent;
        if (object != null) {
            int n3;
            int n4 = object.getSelectedTabPosition();
            if (n4 != (n3 = -1) && n4 == (n3 = this.position)) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            return n4 != 0;
        }
        object = new IllegalArgumentException("Tab not attached to a TabLayout");
        throw object;
    }

    public void removeBadge() {
        TabLayout$TabView.access$900(this.view);
    }

    public void reset() {
        int n3;
        this.parent = null;
        this.view = null;
        this.tag = null;
        this.icon = null;
        this.id = n3 = -1;
        this.text = null;
        this.contentDesc = null;
        this.position = n3;
        this.customView = null;
    }

    public void select() {
        Object object = this.parent;
        if (object != null) {
            object.selectTab(this);
            return;
        }
        object = new IllegalArgumentException("Tab not attached to a TabLayout");
        throw object;
    }

    public TabLayout$Tab setContentDescription(int n3) {
        TabLayout tabLayout = this.parent;
        if (tabLayout != null) {
            CharSequence charSequence = tabLayout.getResources().getText(n3);
            return this.setContentDescription(charSequence);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Tab not attached to a TabLayout");
        throw illegalArgumentException;
    }

    public TabLayout$Tab setContentDescription(CharSequence charSequence) {
        this.contentDesc = charSequence;
        this.updateView();
        return this;
    }

    public TabLayout$Tab setCustomView(int n3) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.view.getContext());
        TabLayout$TabView tabLayout$TabView = this.view;
        View view = layoutInflater.inflate(n3, (ViewGroup)tabLayout$TabView, false);
        return this.setCustomView(view);
    }

    public TabLayout$Tab setCustomView(View view) {
        this.customView = view;
        this.updateView();
        return this;
    }

    public TabLayout$Tab setIcon(int n3) {
        TabLayout tabLayout = this.parent;
        if (tabLayout != null) {
            Drawable drawable2 = xn.a(tabLayout.getContext(), n3);
            return this.setIcon(drawable2);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Tab not attached to a TabLayout");
        throw illegalArgumentException;
    }

    public TabLayout$Tab setIcon(Drawable object) {
        int n3;
        this.icon = object;
        object = this.parent;
        int n4 = object.tabGravity;
        int n7 = 1;
        if (n4 == n7 || (n4 = object.mode) == (n3 = 2)) {
            object.updateTabViews(n7 != 0);
        }
        this.updateView();
        boolean bl2 = BadgeUtils.USE_COMPAT_PARENT;
        if (bl2 && (bl2 = TabLayout$TabView.access$600((TabLayout$TabView)((Object)(object = this.view)))) && (bl2 = (object = TabLayout$TabView.access$700(this.view)).isVisible())) {
            object = this.view;
            object.invalidate();
        }
        return this;
    }

    public TabLayout$Tab setId(int n3) {
        this.id = n3;
        TabLayout$TabView tabLayout$TabView = this.view;
        if (tabLayout$TabView != null) {
            tabLayout$TabView.setId(n3);
        }
        return this;
    }

    public void setPosition(int n3) {
        this.position = n3;
    }

    public TabLayout$Tab setTabLabelVisibility(int n3) {
        int n4;
        this.labelVisibilityMode = n3;
        Object object = this.parent;
        int n7 = object.tabGravity;
        int n8 = 1;
        if (n7 == n8 || (n7 = object.mode) == (n4 = 2)) {
            object.updateTabViews(n8 != 0);
        }
        this.updateView();
        n3 = (int)(BadgeUtils.USE_COMPAT_PARENT ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(TabLayout$TabView.access$600((TabLayout$TabView)((Object)(object = this.view))) ? 1 : 0)) != 0 && (n3 = (int)((object = TabLayout$TabView.access$700(this.view)).isVisible() ? 1 : 0)) != 0) {
            object = this.view;
            object.invalidate();
        }
        return this;
    }

    public TabLayout$Tab setTag(Object object) {
        this.tag = object;
        return this;
    }

    public TabLayout$Tab setText(int n3) {
        TabLayout tabLayout = this.parent;
        if (tabLayout != null) {
            CharSequence charSequence = tabLayout.getResources().getText(n3);
            return this.setText(charSequence);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Tab not attached to a TabLayout");
        throw illegalArgumentException;
    }

    public TabLayout$Tab setText(CharSequence charSequence) {
        Object object = this.contentDesc;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)charSequence))) {
            object = this.view;
            object.setContentDescription(charSequence);
        }
        this.text = charSequence;
        this.updateView();
        return this;
    }

    public void updateView() {
        TabLayout$TabView tabLayout$TabView = this.view;
        if (tabLayout$TabView != null) {
            tabLayout$TabView.update();
        }
    }
}

