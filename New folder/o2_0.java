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
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from O2
 */
public final class o2_0
implements wg3_1 {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public final Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;

    public o2_0(Context context, CharSequence charSequence) {
        int n3;
        this.e = n3 = 4096;
        this.g = n3;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.p = 16;
        this.i = context;
        this.a = charSequence;
    }

    public final wg3_1 a(Q2 object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final Q2 b() {
        return null;
    }

    public final void c() {
        boolean bl2;
        Drawable drawable2 = this.h;
        if (drawable2 != null && ((bl2 = this.n) || (bl2 = this.o))) {
            boolean bl3;
            ColorStateList colorStateList;
            this.h = drawable2 = ut0_0.h(drawable2);
            this.h = drawable2 = drawable2.mutate();
            bl2 = this.n;
            if (bl2) {
                colorStateList = this.l;
                drawable2.setTintList(colorStateList);
            }
            if (bl3 = this.o) {
                drawable2 = this.h;
                colorStateList = this.m;
                drawable2.setTintMode((PorterDuff.Mode)colorStateList);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.g;
    }

    public final char getAlphabeticShortcut() {
        return this.f;
    }

    public final CharSequence getContentDescription() {
        return this.j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.h;
    }

    public final ColorStateList getIconTintList() {
        return this.l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            charSequence = this.a;
        }
        return charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        int n3 = this.p;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final boolean isChecked() {
        int n3 = this.p & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isEnabled() {
        int n3 = this.p & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isVisible() {
        int n3 = this.p & 8;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final MenuItem setActionProvider(ActionProvider object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final MenuItem setActionView(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final MenuItem setActionView(View object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f = c2 = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int n3) {
        this.f = c2 = Character.toLowerCase(c2);
        c2 = (char)KeyEvent.normalizeMetaState((int)n3);
        this.g = c2;
        return this;
    }

    public final MenuItem setCheckable(boolean bl2) {
        int n3 = this.p & 0xFFFFFFFE;
        this.p = (int)((bl2 |= n3) ? 1 : 0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public final MenuItem setChecked(boolean bl2) {
        void var1_4;
        int n3;
        int n4 = this.p & 0xFFFFFFFD;
        if (bl2) {
            int n7 = 2;
        } else {
            boolean bl3 = false;
        }
        this.p = n3 = var1_4 | n4;
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public final wg3_1 setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public final MenuItem setEnabled(boolean bl2) {
        void var1_4;
        int n3;
        int n4 = this.p & 0xFFFFFFEF;
        if (bl2) {
            int n7 = 16;
        } else {
            boolean bl3 = false;
        }
        this.p = n3 = var1_4 | n4;
        return this;
    }

    public final MenuItem setIcon(int n3) {
        Drawable drawable2;
        this.h = drawable2 = t70.getDrawable(this.i, n3);
        this.c();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable2) {
        this.h = drawable2;
        this.c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        this.c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        this.c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int n3) {
        this.d = c2;
        c2 = (char)KeyEvent.normalizeMetaState((int)n3);
        this.e = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f = c2 = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int n3, int n4) {
        this.d = c2;
        c2 = (char)KeyEvent.normalizeMetaState((int)n3);
        this.e = c2;
        this.f = c2 = Character.toLowerCase(c3);
        c2 = (char)KeyEvent.normalizeMetaState((int)n4);
        this.g = c2;
        return this;
    }

    public final void setShowAsAction(int n3) {
    }

    public final MenuItem setShowAsActionFlags(int n3) {
        return this;
    }

    public final MenuItem setTitle(int n3) {
        String string2 = this.i.getResources().getString(n3);
        this.a = string2;
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final wg3_1 setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean bl2) {
        int n3;
        int n4 = this.p;
        int n7 = 8;
        n4 &= n7;
        if (bl2) {
            n7 = 0;
        }
        this.p = n3 = n4 | n7;
        return this;
    }
}

