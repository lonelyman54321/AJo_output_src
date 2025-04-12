/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class bw2 {
    public final pb1_0 a;

    public bw2() {
        pb1_0 pb1_02;
        this.a = pb1_02 = new pb1_0(null);
    }

    public final zj1 a(cw2_0 cw2_02, Ow2 ow2) {
        cw2_0 cw2_03 = cw2_02;
        int n3 = cw2_02.a.size();
        pb1_0 pb1_02 = new pb1_0(n3);
        Object object = cw2_02.a;
        int n4 = object.size();
        int n7 = 0;
        while (n7 < n4) {
            Object object2;
            int n8;
            List list;
            long l2;
            boolean bl2;
            long l3;
            long l4;
            long l7;
            dw2_1 dw2_12 = (dw2_1)object.get(n7);
            pb1_0 pb1_03 = this.a;
            long l8 = dw2_12.a;
            Object object3 = (bw2$a)pb1_03.f(l8);
            if (object3 == null) {
                l8 = dw2_12.b;
                l7 = dw2_12.d;
                l4 = l8;
                l3 = l7;
                bl2 = false;
            } else {
                boolean bl3;
                l7 = ((bw2$a)object3).b;
                l7 = ow2.n(l7);
                l2 = ((bw2$a)object3).a;
                bl2 = bl3 = ((bw2$a)object3).c;
                l3 = l7;
                l4 = l2;
            }
            long l12 = dw2_12.k;
            List list2 = list = dw2_12.i;
            list2 = (ArrayList)list;
            l7 = dw2_12.a;
            long l14 = dw2_12.b;
            long l15 = dw2_12.d;
            int n10 = dw2_12.e;
            float f5 = dw2_12.f;
            int n14 = dw2_12.g;
            l2 = dw2_12.j;
            object3 = new aw2_0(l7, l14, l15, n10 != 0, f5, l4, l3, bl2, n14, (ArrayList)list2, l2, l12);
            pb1_02.l(l7, object3);
            l7 = dw2_12.a;
            boolean bl4 = dw2_12.e;
            if (bl4) {
                n8 = n7;
                long l16 = dw2_12.b;
                object2 = object;
                n10 = n4;
                long l17 = dw2_12.c;
                object3 = new bw2$a(bl4, l16, l17);
                pb1_03.l(l7, object3);
            } else {
                object2 = object;
                n10 = n4;
                n8 = n7;
                pb1_03.m(l7);
            }
            n7 = n8 + 1;
            object = object2;
            n4 = n10;
        }
        object = new zj1(pb1_02, cw2_03);
        return object;
    }
}

