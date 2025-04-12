/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 */
import android.view.MenuItem;

public final class dO1$c
implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ do1_1 b;

    public dO1$c(do1_1 do1_12, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = do1_12;
        this.a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        menuItem = this.b.c(menuItem);
        return this.a.onMenuItemActionCollapse(menuItem);
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        menuItem = this.b.c(menuItem);
        return this.a.onMenuItemActionExpand(menuItem);
    }
}

