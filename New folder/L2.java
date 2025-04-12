/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.appcompat.app.a;
import androidx.drawerlayout.widget.DrawerLayout;

public final class L2
implements View.OnClickListener {
    public final /* synthetic */ a a;

    public L2(a a2) {
        this.a = a2;
    }

    public final void onClick(View object) {
        a a2 = this.a;
        int n3 = a2.e;
        if (n3 != 0) {
            int n4;
            object = a2.b;
            int n42 = 0x800003;
            n3 = ((DrawerLayout)((Object)object)).getDrawerLockMode(n42);
            boolean n7 = ((DrawerLayout)((Object)object)).isDrawerVisible(n42);
            if (n7 && n3 != (n4 = 2)) {
                ((DrawerLayout)((Object)object)).closeDrawer(n42);
            } else {
                int n8 = 1;
                if (n3 != n8) {
                    ((DrawerLayout)((Object)object)).openDrawer(n42);
                }
            }
        } else {
            a2 = a2.h;
            if (a2 != null) {
                a2.onClick((View)object);
            }
        }
    }
}

