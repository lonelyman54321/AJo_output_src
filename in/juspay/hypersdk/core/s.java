/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.widget.PopupMenu$OnMenuItemClickListener
 */
package in.juspay.hypersdk.core;

import android.view.MenuItem;
import android.widget.PopupMenu;
import in.juspay.hypersdk.core.AndroidInterface;

public final class s
implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;

    public /* synthetic */ s(AndroidInterface androidInterface, String string2) {
        this.a = androidInterface;
        this.b = string2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AndroidInterface androidInterface = this.a;
        String string2 = this.b;
        return AndroidInterface.p(androidInterface, string2, menuItem);
    }
}

