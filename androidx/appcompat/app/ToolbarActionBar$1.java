/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.Window$Callback
 */
package androidx.appcompat.app;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.menu.d;

class ToolbarActionBar$1
implements Runnable {
    public final /* synthetic */ ToolbarActionBar a;

    public ToolbarActionBar$1(ToolbarActionBar toolbarActionBar) {
        this.a = toolbarActionBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        Object object;
        block8: {
            block7: {
                ToolbarActionBar toolbarActionBar = this.a;
                Window.Callback callback2 = toolbarActionBar.b;
                boolean bl2 = (toolbarActionBar = toolbarActionBar.A()) instanceof d;
                if (bl2) {
                    object = toolbarActionBar;
                    object = (d)((Object)toolbarActionBar);
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    ((d)object).stopDispatchingItemsChanged();
                }
                try {
                    boolean bl3;
                    toolbarActionBar.clear();
                    boolean bl4 = callback2.onCreatePanelMenu(0, (Menu)toolbarActionBar);
                    if (bl4 && (bl3 = callback2.onPreparePanel(0, null, (Menu)toolbarActionBar))) break block7;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                toolbarActionBar.clear();
            }
            if (object != null) {
                ((d)object).startDispatchingItemsChanged();
            }
            return;
        }
        if (object != null) {
            ((d)object).startDispatchingItemsChanged();
        }
        throw throwable2;
    }
}

