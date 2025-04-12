/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.MenuItem;

public final class dO1$d
implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    public final /* synthetic */ do1_1 b;

    public dO1$d(do1_1 do1_12, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = do1_12;
        this.a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        menuItem = this.b.c(menuItem);
        return this.a.onMenuItemClick(menuItem);
    }
}

