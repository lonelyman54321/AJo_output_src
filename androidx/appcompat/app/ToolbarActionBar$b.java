/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 */
package androidx.appcompat.app;

import android.view.Menu;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h$a;

public final class ToolbarActionBar$b
implements h$a {
    public boolean a;
    public final /* synthetic */ ToolbarActionBar b;

    public ToolbarActionBar$b(ToolbarActionBar toolbarActionBar) {
        this.b = toolbarActionBar;
    }

    public final boolean a(d d2) {
        this.b.b.onMenuOpened(108, (Menu)d2);
        return true;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        bl2 = this.a;
        if (bl2) {
            return;
        }
        this.a = true;
        ToolbarActionBar toolbarActionBar = this.b;
        toolbarActionBar.a.k();
        toolbarActionBar.b.onPanelClosed(108, (Menu)d2);
        this.a = false;
    }
}

