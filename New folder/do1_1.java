/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.CollapsibleActionView
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/*
 * Renamed from dO1
 */
public final class do1_1
extends pw
implements MenuItem {
    public final wg3_1 d;
    public Method e;

    public do1_1(Context object, wg3_1 wg3_12) {
        super((Context)object);
        if (wg3_12 != null) {
            this.d = wg3_12;
            return;
        }
        super("Wrapped Object can not be null.");
        throw object;
    }

    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        Q2 q2 = this.d.b();
        boolean bl2 = q2 instanceof dO1$a;
        if (bl2) {
            return ((dO1$a)q2).c;
        }
        return null;
    }

    public final View getActionView() {
        View view = this.d.getActionView();
        boolean bl2 = view instanceof dO1$b;
        if (bl2) {
            view = (View)((dO1$b)view).a;
        }
        return view;
    }

    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public final int getGroupId() {
        return this.d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.d.getIntent();
    }

    public final int getItemId() {
        return this.d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.d.getOrder();
    }

    public final SubMenu getSubMenu() {
        SubMenu subMenu = this.d.getSubMenu();
        return this.d(subMenu);
    }

    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    public final boolean isChecked() {
        return this.d.isChecked();
    }

    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    public final boolean isVisible() {
        return this.d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        dO1$a dO1$a = new dO1$a(this, actionProvider);
        if (actionProvider == null) {
            dO1$a = null;
        }
        this.d.a(dO1$a);
        return this;
    }

    public final MenuItem setActionView(int n3) {
        wg3_1 wg3_12 = this.d;
        wg3_12.setActionView(n3);
        View view = wg3_12.getActionView();
        boolean bl2 = view instanceof CollapsibleActionView;
        if (bl2) {
            dO1$b dO1$b = new dO1$b(view);
            wg3_12.setActionView((View)dO1$b);
        }
        return this;
    }

    public final MenuItem setActionView(View object) {
        boolean bl2 = object instanceof CollapsibleActionView;
        if (bl2) {
            dO1$b dO1$b = new dO1$b((View)object);
            object = dO1$b;
        }
        this.d.setActionView((View)object);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int n3) {
        this.d.setAlphabeticShortcut(c2, n3);
        return this;
    }

    public final MenuItem setCheckable(boolean bl2) {
        this.d.setCheckable(bl2);
        return this;
    }

    public final MenuItem setChecked(boolean bl2) {
        this.d.setChecked(bl2);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean bl2) {
        this.d.setEnabled(bl2);
        return this;
    }

    public final MenuItem setIcon(int n3) {
        this.d.setIcon(n3);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable2) {
        this.d.setIcon(drawable2);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int n3) {
        this.d.setNumericShortcut(c2, n3);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        dO1$c dO1$c = onActionExpandListener != null ? new dO1$c(this, onActionExpandListener) : null;
        this.d.setOnActionExpandListener(dO1$c);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        dO1$d dO1$d = onMenuItemClickListener != null ? new dO1$d(this, onMenuItemClickListener) : null;
        this.d.setOnMenuItemClickListener(dO1$d);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int n3, int n4) {
        this.d.setShortcut(c2, c3, n3, n4);
        return this;
    }

    public final void setShowAsAction(int n3) {
        this.d.setShowAsAction(n3);
    }

    public final MenuItem setShowAsActionFlags(int n3) {
        this.d.setShowAsActionFlags(n3);
        return this;
    }

    public final MenuItem setTitle(int n3) {
        this.d.setTitle(n3);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean bl2) {
        return this.d.setVisible(bl2);
    }
}

