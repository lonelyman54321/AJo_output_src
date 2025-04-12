/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/*
 * Renamed from pf3
 */
public final class pf3_1
extends go1_0
implements SubMenu {
    public final cg3_1 e;

    public pf3_1(Context context, cg3_1 cg3_12) {
        super(context, cg3_12);
        this.e = cg3_12;
    }

    public final void clearHeader() {
        this.e.clearHeader();
    }

    public final MenuItem getItem() {
        MenuItem menuItem = this.e.getItem();
        return this.c(menuItem);
    }

    public final SubMenu setHeaderIcon(int n3) {
        this.e.setHeaderIcon(n3);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable2) {
        this.e.setHeaderIcon(drawable2);
        return this;
    }

    public final SubMenu setHeaderTitle(int n3) {
        this.e.setHeaderTitle(n3);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int n3) {
        this.e.setIcon(n3);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable2) {
        this.e.setIcon(drawable2);
        return this;
    }
}

