/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.drawerlayout.widget;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public final class DrawerLayout$a
implements E2 {
    public final /* synthetic */ DrawerLayout a;

    public DrawerLayout$a(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
    }

    public final boolean perform(View view, E2$a object) {
        int n3;
        int n4;
        object = this.a;
        boolean n42 = ((DrawerLayout)((Object)object)).isDrawerOpen(view);
        if (n42 && (n4 = ((DrawerLayout)((Object)object)).getDrawerLockMode(view)) != (n3 = 2)) {
            ((DrawerLayout)((Object)object)).closeDrawer(view);
            return true;
        }
        return false;
    }
}

