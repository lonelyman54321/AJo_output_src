/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 */
package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;

public final class Toolbar$b
implements d$a {
    public final /* synthetic */ Toolbar a;

    public Toolbar$b(Toolbar toolbar) {
        this.a = toolbar;
    }

    public final boolean onMenuItemSelected(d d2, MenuItem menuItem) {
        boolean bl2;
        d$a d$a = this.a.mMenuBuilderCallback;
        if (d$a != null && (bl2 = d$a.onMenuItemSelected(d2, menuItem))) {
            bl2 = true;
        } else {
            bl2 = false;
            d2 = null;
        }
        return bl2;
    }

    public final void onMenuModeChange(d d2) {
        boolean bl2;
        Object object = this.a;
        Object object2 = ((Toolbar)object).mMenuView.e;
        if (object2 == null || !(bl2 = ((ActionMenuPresenter)object2).c())) {
            boolean bl3;
            object2 = ((Toolbar)object).mMenuHostHelper.b.iterator();
            while (bl3 = object2.hasNext()) {
                fo1_0 fo1_02 = (fo1_0)object2.next();
                fo1_02.b(d2);
            }
        }
        object = ((Toolbar)object).mMenuBuilderCallback;
        if (object != null) {
            object.onMenuModeChange(d2);
        }
    }
}

