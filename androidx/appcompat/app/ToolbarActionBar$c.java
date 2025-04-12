/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 */
package androidx.appcompat.app;

import android.view.MenuItem;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.widget.Toolbar;

public final class ToolbarActionBar$c
implements d$a {
    public final /* synthetic */ ToolbarActionBar a;

    public ToolbarActionBar$c(ToolbarActionBar toolbarActionBar) {
        this.a = toolbarActionBar;
    }

    public final boolean onMenuItemSelected(d d2, MenuItem menuItem) {
        return false;
    }

    public final void onMenuModeChange(d d2) {
        ToolbarActionBar toolbarActionBar = this.a;
        Toolbar toolbar = toolbarActionBar.a.a;
        boolean bl2 = toolbar.isOverflowMenuShowing();
        toolbarActionBar = toolbarActionBar.b;
        int n3 = 108;
        if (bl2) {
            toolbarActionBar.onPanelClosed(n3, d2);
        } else {
            toolbar = null;
            bl2 = toolbarActionBar.onPreparePanel(0, null, d2);
            if (bl2) {
                toolbarActionBar.onMenuOpened(n3, d2);
            }
        }
    }
}

