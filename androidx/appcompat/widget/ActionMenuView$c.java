/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 */
package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.app.ToolbarActionBar$a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar$a;
import java.util.Iterator;

public final class ActionMenuView$c
implements d$a {
    public final /* synthetic */ ActionMenuView a;

    public ActionMenuView$c(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    public final boolean onMenuItemSelected(d object, MenuItem menuItem) {
        object = this.a.l;
        boolean bl2 = false;
        if (object != null) {
            boolean bl3;
            boolean bl4;
            block7: {
                boolean bl5;
                object = ((Toolbar$a)object).a;
                Iterator iterator = ((Toolbar)object).mMenuHostHelper.b.iterator();
                while (bl5 = iterator.hasNext()) {
                    fo1_0 fo1_02 = (fo1_0)iterator.next();
                    bl5 = fo1_02.c(menuItem);
                    if (!bl5) continue;
                    bl4 = true;
                    break block7;
                }
                bl4 = false;
                iterator = null;
            }
            if (bl4) {
                bl3 = true;
            } else {
                object = ((Toolbar)object).mOnMenuItemClickListener;
                if (object != null) {
                    object = ((ToolbarActionBar$a)object).a.b;
                    bl3 = object.onMenuItemSelected(0, menuItem);
                } else {
                    bl3 = false;
                    object = null;
                }
            }
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void onMenuModeChange(d d2) {
        d$a d$a = this.a.g;
        if (d$a != null) {
            d$a.onMenuModeChange(d2);
        }
    }
}

