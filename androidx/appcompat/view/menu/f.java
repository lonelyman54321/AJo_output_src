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
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f$a;
import androidx.appcompat.view.menu.j;

public final class f
implements wg3_1 {
    public Q2 A;
    public MenuItem.OnActionExpandListener B;
    public boolean C;
    public ContextMenu.ContextMenuInfo D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public final d n;
    public j o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s;
    public PorterDuff.Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public View z;

    public f(d d2, int n3, int n4, int n7, int n8, CharSequence charSequence, int n10) {
        int n14;
        this.i = n14 = 4096;
        this.k = n14;
        this.m = 0;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 16;
        this.C = false;
        this.n = d2;
        this.a = n4;
        this.b = n3;
        this.c = n7;
        this.d = n8;
        this.e = charSequence;
        this.y = n10;
    }

    public static void c(String string2, int n3, int n4, StringBuilder stringBuilder) {
        if ((n3 &= n4) == n4) {
            stringBuilder.append(string2);
        }
    }

    public final wg3_1 a(Q2 object) {
        Object object2 = this.A;
        if (object2 != null) {
            ((Q2)object2).a = null;
        }
        this.z = null;
        this.A = object;
        object = this.n;
        boolean bl2 = true;
        ((d)object).onItemsChanged(bl2);
        object = this.A;
        if (object != null) {
            object2 = new f$a(this);
            ((Q2)object).h((f$a)object2);
        }
        return this;
    }

    public final Q2 b() {
        return this.A;
    }

    public final boolean collapseActionView() {
        int n3 = this.y & 8;
        if (n3 == 0) {
            return false;
        }
        View view = this.z;
        if (view == null) {
            return true;
        }
        view = this.B;
        if (view != null && (n3 = (int)(view.onMenuItemActionCollapse((MenuItem)this) ? 1 : 0)) == 0) {
            return false;
        }
        return this.n.collapseItemActionView(this);
    }

    public final Drawable d(Drawable drawable2) {
        boolean bl2;
        if (drawable2 != null && (bl2 = this.w) && ((bl2 = this.u) || (bl2 = this.v))) {
            ColorStateList colorStateList;
            drawable2 = ut0_0.h(drawable2).mutate();
            bl2 = this.u;
            if (bl2) {
                colorStateList = this.s;
                drawable2.setTintList(colorStateList);
            }
            if (bl2 = this.v) {
                colorStateList = this.t;
                drawable2.setTintMode((PorterDuff.Mode)colorStateList);
            }
            bl2 = false;
            colorStateList = null;
            this.w = false;
        }
        return drawable2;
    }

    public final boolean e() {
        int n3 = this.y & 8;
        boolean bl2 = false;
        if (n3 != 0) {
            Object object = this.z;
            if (object == null && (object = this.A) != null) {
                object = ((Q2)object).d(this);
                this.z = object;
            }
            if ((object = this.z) != null) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean expandActionView() {
        boolean bl2 = this.e();
        if (!bl2) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !(bl2 = onActionExpandListener.onMenuItemActionExpand((MenuItem)this))) {
            return false;
        }
        return this.n.expandItemActionView(this);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean f() {
        void var1_5;
        int bl2 = this.x;
        int n3 = 32;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    /*
     * WARNING - void declaration
     */
    public final void g(boolean bl2) {
        void var1_4;
        int n3;
        int n4 = this.x & 0xFFFFFFFB;
        if (bl2) {
            int n7 = 4;
        } else {
            boolean bl3 = false;
        }
        this.x = n3 = var1_4 | n4;
    }

    public final ActionProvider getActionProvider() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
        throw unsupportedOperationException;
    }

    public final View getActionView() {
        Object object = this.z;
        if (object != null) {
            return object;
        }
        object = this.A;
        if (object != null) {
            object = ((Q2)object).d(this);
            this.z = object;
            return object;
        }
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.k;
    }

    public final char getAlphabeticShortcut() {
        return this.j;
    }

    public final CharSequence getContentDescription() {
        return this.q;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            return this.d(drawable2);
        }
        int n3 = this.m;
        if (n3 != 0) {
            drawable2 = this.n.getContext();
            int n4 = this.m;
            drawable2 = xn.a((Context)drawable2, n4);
            this.m = 0;
            this.l = drawable2;
            return this.d(drawable2);
        }
        return null;
    }

    public final ColorStateList getIconTintList() {
        return this.s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public final Intent getIntent() {
        return this.g;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public final int getNumericModifiers() {
        return this.i;
    }

    public final char getNumericShortcut() {
        return this.h;
    }

    public final int getOrder() {
        return this.c;
    }

    public final SubMenu getSubMenu() {
        return this.o;
    }

    public final CharSequence getTitle() {
        return this.e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.r;
    }

    public final void h(boolean bl2) {
        int n3;
        int n4;
        this.x = bl2 ? (n4 = this.x | 0x20) : (n3 = this.x & 0xFFFFFFDF);
    }

    public final boolean hasSubMenu() {
        boolean bl2;
        j j3 = this.o;
        if (j3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            j3 = null;
        }
        return bl2;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        int bl2 = this.x;
        int n3 = 1;
        int n4 = bl2 & n3;
        if (n4 != n3) {
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isChecked() {
        void var1_5;
        int bl2 = this.x;
        int n3 = 2;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    public final boolean isEnabled() {
        int n3 = this.x & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isVisible() {
        int n3;
        Q2 q2 = this.A;
        boolean bl2 = false;
        if (q2 != null && (n3 = q2.g()) != 0) {
            n3 = this.x & 8;
            if (n3 == 0 && (n3 = (int)((q2 = this.A).b() ? 1 : 0)) != 0) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = this.x & 8;
        if (n3 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final MenuItem setActionProvider(ActionProvider object) {
        object = new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
        throw object;
    }

    public final MenuItem setActionView(int n3) {
        int n4;
        View view;
        Context context = this.n.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.z = view = layoutInflater.inflate(n3, (ViewGroup)linearLayout, false);
        int n7 = 0;
        context = null;
        this.A = null;
        if (view != null && (n7 = view.getId()) == (n4 = -1) && (n7 = this.a) > 0) {
            view.setId(n7);
        }
        this.n.onItemActionRequestChanged(this);
        return this;
    }

    public final MenuItem setActionView(View view) {
        int n3;
        this.z = view;
        int n4 = 0;
        this.A = null;
        if (view != null && (n4 = view.getId()) == (n3 = -1) && (n4 = this.a) > 0) {
            view.setId(n4);
        }
        this.n.onItemActionRequestChanged(this);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        char c3 = this.j;
        if (c3 == c2) {
            return this;
        }
        this.j = c2 = Character.toLowerCase(c2);
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int n3) {
        int n4 = this.j;
        if (n4 == c2 && (n4 = this.k) == n3) {
            return this;
        }
        this.j = c2 = Character.toLowerCase(c2);
        c2 = (char)KeyEvent.normalizeMetaState((int)n3);
        this.k = c2;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setCheckable(boolean n3) {
        int n4 = this.x;
        int n7 = n4 & 0xFFFFFFFE;
        this.x = n3 |= n7;
        if (n4 != n3) {
            d d2 = this.n;
            n4 = 0;
            d2.onItemsChanged(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean n3) {
        int n4 = this.x;
        int n7 = n4 & 4;
        if (n7 != 0) {
            d d2 = this.n;
            d2.setExclusiveItemChecked(this);
        } else {
            d d5;
            n7 = n4 & 0xFFFFFFFD;
            if (n3 != 0) {
                n3 = 2;
            } else {
                n3 = 0;
                d5 = null;
            }
            this.x = n3 |= n7;
            if (n4 != n3) {
                d5 = this.n;
                d5.onItemsChanged(false);
            }
        }
        return this;
    }

    public final wg3_1 setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setEnabled(boolean bl2) {
        int n3;
        int n4;
        this.x = bl2 ? (n4 = this.x | 0x10) : (n3 = this.x & 0xFFFFFFEF);
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIcon(int n3) {
        this.l = null;
        this.m = n3;
        this.w = true;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable2) {
        this.m = 0;
        this.l = drawable2;
        this.w = true;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        boolean bl2;
        this.s = colorStateList;
        this.u = bl2 = true;
        this.w = bl2;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        boolean bl2;
        this.t = mode;
        this.v = bl2 = true;
        this.w = bl2;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        char c3 = this.h;
        if (c3 == c2) {
            return this;
        }
        this.h = c2;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int n3) {
        int n4 = this.h;
        if (n4 == c2 && (n4 = this.i) == n3) {
            return this;
        }
        this.h = c2;
        c2 = (char)KeyEvent.normalizeMetaState((int)n3);
        this.i = c2;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = c2 = Character.toLowerCase(c3);
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int n3, int n4) {
        this.h = c2;
        c2 = (char)KeyEvent.normalizeMetaState((int)n3);
        this.i = c2;
        this.j = c2 = Character.toLowerCase(c3);
        c2 = (char)KeyEvent.normalizeMetaState((int)n4);
        this.k = c2;
        this.n.onItemsChanged(false);
        return this;
    }

    public final void setShowAsAction(int n3) {
        int n4;
        int n7 = n3 & 3;
        if (n7 != 0 && n7 != (n4 = 1) && n7 != (n4 = 2)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            throw illegalArgumentException;
        }
        this.y = n3;
        this.n.onItemActionRequestChanged(this);
    }

    public final MenuItem setShowAsActionFlags(int n3) {
        this.setShowAsAction(n3);
        return this;
    }

    public final MenuItem setTitle(int n3) {
        String string2 = this.n.getContext().getString(n3);
        this.setTitle(string2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.onItemsChanged(false);
        j j3 = this.o;
        if (j3 != null) {
            j3.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.onItemsChanged(false);
        return this;
    }

    public final wg3_1 setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.onItemsChanged(false);
        return this;
    }

    public final MenuItem setVisible(boolean n3) {
        d d2;
        int n4 = this.x;
        int n7 = n4 & 0xFFFFFFF7;
        if (n3 != 0) {
            n3 = 0;
            d2 = null;
        } else {
            n3 = 8;
        }
        this.x = n3 |= n7;
        if (n4 != n3) {
            d2 = this.n;
            d2.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        charSequence = charSequence != null ? charSequence.toString() : null;
        return charSequence;
    }
}

