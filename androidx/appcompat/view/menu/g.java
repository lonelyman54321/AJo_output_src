/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.Gravity
 *  android.view.View
 *  android.view.WindowManager
 *  android.widget.PopupWindow$OnDismissListener
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g$a;
import androidx.appcompat.view.menu.h$a;

public class g {
    public final Context a;
    public final d b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g = 0x800003;
    public boolean h;
    public h$a i;
    public eo1_1 j;
    public PopupWindow.OnDismissListener k;
    public final g$a l;

    public g(int n3, int n4, Context context, View view, d d2, boolean bl2) {
        g$a g$a;
        this.l = g$a = new g$a(this);
        this.a = context;
        this.b = d2;
        this.f = view;
        this.c = bl2;
        this.d = n3;
        this.e = n4;
    }

    public final eo1_1 a() {
        eo1_1 eo1_12 = this.j;
        if (eo1_12 == null) {
            Object object = this.a;
            eo1_12 = ((WindowManager)object.getSystemService("window")).getDefaultDisplay();
            Object object2 = new Point();
            eo1_12.getRealSize((Point)object2);
            int n3 = object2.x;
            int n4 = object2.y;
            n3 = Math.min(n3, n4);
            object = object.getResources();
            n4 = R$dimen.abc_cascading_menus_min_smallest_width;
            int n7 = object.getDimensionPixelSize(n4);
            if (n3 >= n7) {
                View view = this.f;
                int n8 = this.e;
                boolean bl2 = this.c;
                Context context = this.a;
                int n10 = this.d;
                object2 = eo1_12;
                eo1_12 = new CascadingMenuPopup(context, view, n10, n8, bl2);
            } else {
                View view = this.f;
                int n14 = this.e;
                boolean bl3 = this.c;
                Context context = this.a;
                d d2 = this.b;
                int n15 = this.d;
                eo1_12 = new StandardMenuPopup(n15, n14, context, view, d2, bl3);
            }
            object = this.b;
            eo1_12.b((d)object);
            object = this.l;
            eo1_12.h((PopupWindow.OnDismissListener)object);
            object = this.f;
            eo1_12.d((View)object);
            object = this.i;
            eo1_12.setCallback((h$a)object);
            n7 = (int)(this.h ? 1 : 0);
            eo1_12.e(n7 != 0);
            n7 = this.g;
            eo1_12.f(n7);
            this.j = eo1_12;
        }
        return this.j;
    }

    public final boolean b() {
        boolean bl2;
        eo1_1 eo1_12 = this.j;
        if (eo1_12 != null && (bl2 = eo1_12.a())) {
            bl2 = true;
        } else {
            bl2 = false;
            eo1_12 = null;
        }
        return bl2;
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void d(int n3, int n4, boolean bl2, boolean bl3) {
        void var4_8;
        eo1_1 eo1_12 = this.a();
        eo1_12.i((boolean)var4_8);
        if (bl2) {
            View view;
            int n7 = this.g;
            View view2 = this.f;
            int n8 = view2.getLayoutDirection();
            int n10 = Gravity.getAbsoluteGravity((int)n7, (int)n8) & 7;
            int n14 = 5;
            float f5 = 7.0E-45f;
            if (n10 == n14) {
                view = this.f;
                int n15 = view.getWidth();
                n3 -= n15;
            }
            eo1_12.g(n3);
            eo1_12.j(n4);
            view = this.a.getResources().getDisplayMetrics();
            float f6 = view.density * 48.0f;
            int n16 = 0x40000000;
            f5 = 2.0f;
            int n17 = (int)(f6 /= f5);
            int n18 = n3 - n17;
            int n19 = n4 - n17;
            view2 = new Rect(n18, n19, n3 += n17, n4 += n17);
            eo1_12.a = view2;
        }
        eo1_12.show();
    }
}

