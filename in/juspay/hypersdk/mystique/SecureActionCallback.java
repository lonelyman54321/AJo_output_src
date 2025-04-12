/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 */
package in.juspay.hypersdk.mystique;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

public class SecureActionCallback
implements ActionMode.Callback {
    private boolean disableCopy;
    private boolean disableCut;
    private boolean disablePaste;
    private boolean disableShare;

    public SecureActionCallback(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.disableCopy = bl2;
        this.disableCut = bl3;
        this.disableShare = bl4;
        this.disablePaste = bl5;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu2) {
        int n3;
        int n4 = this.disableCopy;
        if (n4 != 0) {
            n4 = 0x1020021;
            menu2.removeItem(n4);
        }
        if ((n4 = (int)(this.disableCut ? 1 : 0)) != 0) {
            n4 = 0x1020020;
            menu2.removeItem(n4);
        }
        if ((n4 = (int)(this.disableShare ? 1 : 0)) != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            n4 = 16908341;
            menu2.removeItem(n4);
        }
        if ((n4 = (int)(this.disablePaste ? 1 : 0)) != 0) {
            n4 = 0x1020022;
            menu2.removeItem(n4);
        }
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu2) {
        int n3;
        int n4 = this.disableCopy;
        if (n4 != 0) {
            n4 = 0x1020021;
            menu2.removeItem(n4);
        }
        if ((n4 = (int)(this.disableCut ? 1 : 0)) != 0) {
            n4 = 0x1020020;
            menu2.removeItem(n4);
        }
        if ((n4 = (int)(this.disableShare ? 1 : 0)) != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            n4 = 16908341;
            menu2.removeItem(n4);
        }
        if ((n4 = (int)(this.disablePaste ? 1 : 0)) != 0) {
            n4 = 0x1020022;
            menu2.removeItem(n4);
        }
        return true;
    }
}

