/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback;

class DrawerLayout$ViewDragCallback$1
implements Runnable {
    public final /* synthetic */ DrawerLayout$ViewDragCallback a;

    public DrawerLayout$ViewDragCallback$1(DrawerLayout$ViewDragCallback viewDragCallback) {
        this.a = viewDragCallback;
    }

    public final void run() {
        View view;
        Object object = this.a;
        Object object2 = ((DrawerLayout$ViewDragCallback)object).b;
        int n3 = object2.o;
        int n4 = 3;
        int n7 = ((DrawerLayout$ViewDragCallback)object).a;
        int n8 = 0;
        boolean bl2 = true;
        int n10 = n7 == n4 ? 1 : 0;
        int n14 = 5;
        DrawerLayout drawerLayout = ((DrawerLayout$ViewDragCallback)object).d;
        if (n10 != 0) {
            view = drawerLayout.findDrawerWithGravity(n4);
            if (view != null) {
                n8 = -view.getWidth();
            }
            n8 += n3;
        } else {
            view = drawerLayout.findDrawerWithGravity(n14);
            n8 = drawerLayout.getWidth() - n3;
        }
        if (view != null && (n10 != 0 && (n3 = view.getLeft()) < n8 || n10 == 0 && (n3 = view.getLeft()) > n8) && (n3 = drawerLayout.getDrawerLockMode(view)) == 0) {
            object2 = (DrawerLayout$LayoutParams)view.getLayoutParams();
            object = ((DrawerLayout$ViewDragCallback)object).b;
            n10 = view.getTop();
            ((ViewDragHelper)object).u(view, n8, n10);
            ((DrawerLayout$LayoutParams)((Object)object2)).c = bl2;
            drawerLayout.invalidate();
            if (n7 == n4) {
                n4 = 5;
            }
            if ((object = drawerLayout.findDrawerWithGravity(n4)) != null) {
                drawerLayout.closeDrawer((View)object);
            }
            drawerLayout.cancelChildViewTouch();
        }
    }
}

