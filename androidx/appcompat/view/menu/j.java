/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.f;

public class j
extends d
implements SubMenu {
    private f mItem;
    private d mParentMenu;

    public j(Context context, d d2, f f5) {
        super(context);
        this.mParentMenu = d2;
        this.mItem = f5;
    }

    public boolean collapseItemActionView(f f5) {
        return this.mParentMenu.collapseItemActionView(f5);
    }

    public boolean dispatchMenuItemSelected(d d2, MenuItem menuItem) {
        d d5;
        boolean bl2;
        boolean bl3 = super.dispatchMenuItemSelected(d2, menuItem);
        if (!bl3 && !(bl2 = (d5 = this.mParentMenu).dispatchMenuItemSelected(d2, menuItem))) {
            bl2 = false;
            d2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean expandItemActionView(f f5) {
        return this.mParentMenu.expandItemActionView(f5);
    }

    public String getActionViewStatesKey() {
        int n3;
        f f5 = this.mItem;
        if (f5 != null) {
            n3 = f5.a;
        } else {
            n3 = 0;
            f5 = null;
        }
        if (n3 == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = super.getActionViewStatesKey();
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    public d getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    public void setCallback(d$a d$a) {
        this.mParentMenu.setCallback(d$a);
    }

    public void setGroupDividerEnabled(boolean bl2) {
        this.mParentMenu.setGroupDividerEnabled(bl2);
    }

    public SubMenu setHeaderIcon(int n3) {
        return (SubMenu)super.setHeaderIconInt(n3);
    }

    public SubMenu setHeaderIcon(Drawable drawable2) {
        return (SubMenu)super.setHeaderIconInt(drawable2);
    }

    public SubMenu setHeaderTitle(int n3) {
        return (SubMenu)super.setHeaderTitleInt(n3);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu)super.setHeaderTitleInt(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu)super.setHeaderViewInt(view);
    }

    public SubMenu setIcon(int n3) {
        this.mItem.setIcon(n3);
        return this;
    }

    public SubMenu setIcon(Drawable drawable2) {
        this.mItem.setIcon(drawable2);
        return this;
    }

    public void setQwertyMode(boolean bl2) {
        this.mParentMenu.setQwertyMode(bl2);
    }

    public void setShortcutsVisible(boolean bl2) {
        this.mParentMenu.setShortcutsVisible(bl2);
    }
}

