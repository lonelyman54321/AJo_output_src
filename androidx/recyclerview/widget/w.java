/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.t;

public final class w {
    public static int a(RecyclerView$y recyclerView$y, t t3, View view, View view2, RecyclerView$o recyclerView$o, boolean bl2) {
        int n3;
        int n4 = recyclerView$o.getChildCount();
        if (n4 != 0 && (n3 = recyclerView$y.b()) != 0 && view != null && view2 != null) {
            if (!bl2) {
                n3 = recyclerView$o.getPosition(view);
                int n7 = recyclerView$o.getPosition(view2);
                return Math.abs(n3 - n7) + 1;
            }
            n3 = t3.b(view2);
            int n8 = t3.e(view);
            return Math.min(t3.l(), n3 -= n8);
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int b(RecyclerView$y recyclerView$y, t t3, View view, View view2, RecyclerView$o recyclerView$o, boolean bl2, boolean bl3) {
        int n3 = recyclerView$o.getChildCount();
        if (n3 != 0 && (n3 = recyclerView$y.b()) != 0 && view != null && view2 != null) {
            int n4;
            void var6_8;
            n3 = recyclerView$o.getPosition(view);
            int n7 = recyclerView$o.getPosition(view2);
            n3 = Math.min(n3, n7);
            n7 = recyclerView$o.getPosition(view);
            int n8 = recyclerView$o.getPosition(view2);
            n7 = Math.max(n7, n8);
            if (var6_8 != false) {
                n4 = recyclerView$y.b() - n7 + -1;
                n4 = Math.max(0, n4);
            } else {
                n4 = Math.max(0, n3);
            }
            if (!bl2) {
                return n4;
            }
            int n10 = t3.b(view2);
            int n14 = t3.e(view);
            int n15 = Math.abs(n10 - n14);
            int n16 = recyclerView$o.getPosition(view);
            int n17 = recyclerView$o.getPosition(view2);
            n17 = Math.abs(n16 - n17) + 1;
            float f5 = n15;
            float f6 = n17;
            float f7 = (float)n4 * (f5 /= f6);
            n17 = t3.k();
            int n18 = t3.e(view);
            float f8 = n17 - n18;
            return Math.round(f7 + f8);
        }
        return 0;
    }

    public static int c(RecyclerView$y recyclerView$y, t t3, View view, View view2, RecyclerView$o recyclerView$o, boolean bl2) {
        int n3 = recyclerView$o.getChildCount();
        if (n3 != 0 && (n3 = recyclerView$y.b()) != 0 && view != null && view2 != null) {
            if (!bl2) {
                return recyclerView$y.b();
            }
            int n4 = t3.b(view2);
            int n7 = t3.e(view);
            int n8 = n4 - n7;
            n7 = recyclerView$o.getPosition(view);
            int n10 = recyclerView$o.getPosition(view2);
            n7 = Math.abs(n7 - n10) + 1;
            float f5 = n8;
            float f6 = n7;
            float f7 = recyclerView$y.b();
            return (int)((f5 /= f6) * f7);
        }
        return 0;
    }
}

