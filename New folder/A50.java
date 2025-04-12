/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class A50 {
    public static final void a(eb3_2 eb3_22, List list) {
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            boolean bl3;
            Object object = (xk1_0)list.get(i3);
            Object object2 = a.a((xk1_0)object);
            String string2 = null;
            if (object2 == null) {
                object2 = object.B();
                bl3 = object2 instanceof E50;
                object2 = bl3 ? (E50)object2 : null;
                if ((object2 = object2 != null ? object2.a() : null) == null) {
                    object2 = new Object();
                }
            }
            Object object3 = object2.toString();
            if ((object3 = eb3_22.b(object3)) != null) {
                ((G50)object3).g0 = object;
                object3 = ((G50)object3).h0;
                if (object3 != null) {
                    ((Y50)object3).j0 = object;
                }
            }
            if (bl3 = (object = object.B()) instanceof E50) {
                object = (E50)object;
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                string2 = object.b();
            }
            if (string2 == null || !(bl2 = object2 instanceof String) || !(bl3 = (object = eb3_22.b(object2 = (String)object2)) instanceof G50)) continue;
            object.getClass();
            object = eb3_22.e;
            bl3 = ((HashMap)object).containsKey(string2);
            if (!bl3) {
                object3 = new ArrayList();
                ((HashMap)object).put(string2, object3);
            } else {
                object3 = object = ((HashMap)object).get(string2);
                object3 = (ArrayList)object;
            }
            ((ArrayList)object3).add(object2);
        }
    }

    public static void b(Ns2$a ns2$a, Ns2 ns2, UF3 uF3) {
        int n3 = uF3.r;
        int n4 = 8;
        float f5 = 1.1E-44f;
        if (n3 != n4) {
            float f6 = uF3.h;
            n3 = Float.isNaN(f6) ? 1 : 0;
            long l2 = 0L;
            if (n3 != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.i) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.j) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.k) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.l) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.m) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.n) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.o) ? 1 : 0)) != 0 && (n3 = (int)(Float.isNaN(f6 = uF3.p) ? 1 : 0)) != 0) {
                n3 = uF3.b;
                int n7 = (int)l2;
                int n8 = uF3.c;
                int n10 = (int)l2;
                long l3 = Ti1.a(n3 -= n7, n8 -= n10);
                Ns2$a.e(ns2$a, ns2, l3);
            } else {
                float f7;
                z50_0 z50_02 = new z50_0(uF3);
                int n14 = uF3.b;
                int n15 = (int)l2;
                n14 -= n15;
                n15 = uF3.c;
                int n16 = (int)l2;
                n15 -= n16;
                f5 = uF3.m;
                n4 = Float.isNaN(f5) ? 1 : 0;
                if (n4 != 0) {
                    boolean bl2 = false;
                    f7 = 0.0f;
                    uF3 = null;
                } else {
                    f7 = uF3.m;
                }
                ns2$a.getClass();
                l2 = Ti1.a(n14, n15);
                Ns2$a.a(ns2$a, ns2);
                long l4 = ns2.e;
                l2 = Si1.d(l2, l4);
                ns2.k0(l2, f7, z50_02);
            }
        }
    }
}

