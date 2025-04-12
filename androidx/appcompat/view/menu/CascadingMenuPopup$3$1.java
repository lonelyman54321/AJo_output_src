/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 */
package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.CascadingMenuPopup$b;
import androidx.appcompat.view.menu.CascadingMenuPopup$c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;

class CascadingMenuPopup$3$1
implements Runnable {
    public final /* synthetic */ CascadingMenuPopup$c a;
    public final /* synthetic */ MenuItem b;
    public final /* synthetic */ d c;
    public final /* synthetic */ CascadingMenuPopup$b d;

    public CascadingMenuPopup$3$1(CascadingMenuPopup$b b2, CascadingMenuPopup$c cascadingMenuPopup$c, f f5, d d2) {
        this.d = b2;
        this.a = cascadingMenuPopup$c;
        this.b = f5;
        this.c = d2;
    }

    public final void run() {
        boolean bl2;
        int n3;
        Object object;
        Object object2 = this.a;
        if (object2 != null) {
            boolean bl3;
            object = this.d;
            CascadingMenuPopup cascadingMenuPopup = ((CascadingMenuPopup$b)object).a;
            cascadingMenuPopup.A = bl3 = true;
            object2 = ((CascadingMenuPopup$c)object2).b;
            n3 = 0;
            cascadingMenuPopup = null;
            ((d)object2).close(false);
            object2 = ((CascadingMenuPopup$b)object).a;
            ((CascadingMenuPopup)object2).A = false;
        }
        if ((bl2 = (object2 = this.b).isEnabled()) && (bl2 = object2.hasSubMenu())) {
            object = this.c;
            n3 = 4;
            ((d)object).performItemAction((MenuItem)object2, n3);
        }
    }
}

