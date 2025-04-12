/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

public final class ym3 {
    /*
     * Enabled aggressive block sorting
     */
    public static final xm3 a(xm3 xm32, bp1_0 bp1_02) {
        int n3;
        int n4;
        float f5;
        int n7;
        int n8;
        Object object = xm32;
        Object object2 = xm32.a;
        Object object3 = U93.d;
        object3 = ((S93)object2).a;
        Object object4 = T93.c;
        Object object5 = object3.b((Function0)object4);
        long l2 = ((S93)object2).b;
        int n10 = Em3.g(l2);
        if (n10 != 0) {
            l2 = U93.a;
        }
        long l3 = l2;
        object3 = ((S93)object2).c;
        if (object3 == null) {
            object3 = tv0_0.m;
        }
        Object object6 = object3;
        object3 = ((S93)object2).d;
        if (object3 != null) {
            n8 = ((nV0)object3).a;
        } else {
            n8 = 0;
            object3 = null;
        }
        Object object7 = new nV0(n8);
        object4 = ((S93)object2).e;
        if (object4 != null) {
            n7 = ((oV0)object4).a;
        } else {
            n7 = 1;
            f5 = Float.MIN_VALUE;
        }
        Object object8 = new oV0(n7);
        object4 = ((S93)object2).f;
        if (object4 == null) {
            object4 = RU0.a;
        }
        Object object9 = object4;
        object4 = ((S93)object2).g;
        if (object4 == null) {
            object4 = "";
        }
        Object object10 = object4;
        long l4 = ((S93)object2).h;
        boolean bl2 = Em3.g(l4);
        if (bl2) {
            l4 = U93.b;
        }
        long l7 = l4;
        object4 = ((S93)object2).i;
        if (object4 != null) {
            f5 = ((Rw)object4).a;
        } else {
            n7 = 0;
            f5 = 0.0f;
            object4 = null;
        }
        Object object11 = new Rw(f5);
        object4 = ((S93)object2).j;
        if (object4 == null) {
            object4 = tl3_0.c;
        }
        Object object12 = object4;
        object4 = ((S93)object2).k;
        if (object4 == null) {
            object4 = iw1.c;
            object4 = jt2_0.a.a();
        }
        Object object13 = object4;
        l2 = ((S93)object2).l;
        long l8 = 16;
        long l12 = l2 - l8;
        Object object14 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object14 == false) {
            l2 = U93.c;
        }
        l8 = l2;
        object3 = ((S93)object2).m;
        if (object3 == null) {
            object3 = Jj3.b;
        }
        Object object15 = object3;
        object3 = ((S93)object2).n;
        if (object3 == null) {
            object3 = b13_0.d;
        }
        Object object16 = object3;
        object3 = ((S93)object2).p;
        if (object3 == null) {
            object3 = rM0.a;
        }
        Object object17 = object3;
        object4 = object11;
        object11 = object3;
        object2 = ((S93)object2).o;
        object3 = new S93((sl3_0)object5, l3, (tv0_0)object6, (nV0)object7, (oV0)object8, (RU0)object9, (String)object10, l7, (Rw)object4, (tl3_0)object12, (iw1)object13, l8, (Jj3)object15, (b13_0)object16, (st2_1)object2, (Qt0)object17);
        object4 = ((xm3)object).b;
        n10 = ((ym2_0)object4).a;
        int n14 = -1 << -1;
        n10 = (int)(Cj3.a(n10, n14) ? 1 : 0);
        int n15 = 5;
        n10 = n10 != 0 ? 5 : ((ym2_0)object4).a;
        int n16 = ((ym2_0)object4).b;
        int n17 = Pj3.a(n16, 3);
        int n18 = 2;
        if (n17 != 0) {
            int[] nArray = ym3$a.$EnumSwitchMapping$0;
            n16 = bp1_02.ordinal();
            n17 = nArray[n16];
            if (n17 != (n16 = 1)) {
                if (n17 != n18) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            } else {
                n15 = 4;
            }
            n17 = 1;
        } else {
            n15 = (int)(Pj3.a(n16, n14) ? 1 : 0);
            if (n15 != 0) {
                int[] nArray = ym3$a.$EnumSwitchMapping$0;
                n17 = bp1_02.ordinal();
                n15 = nArray[n17];
                if (n15 != (n17 = 1)) {
                    if (n15 != n18) {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    n15 = 2;
                } else {
                    n15 = 1;
                }
            } else {
                n17 = 1;
                n15 = n16;
            }
        }
        long l14 = ((ym2_0)object4).c;
        boolean bl3 = Em3.g(l14);
        if (bl3) {
            l14 = zm2_1.a;
        }
        if ((object8 = ((ym2_0)object4).d) == null) {
            object8 = vl3_0.c;
        }
        if ((n4 = ((ym2_0)object4).g) == 0) {
            n4 = wu1_1.b;
        }
        if ((n14 = (int)(gc1_1.a(n3 = ((ym2_0)object4).h, n14) ? 1 : 0)) != 0) {
            n3 = 1;
        }
        if ((object5 = ((ym2_0)object4).i) == null) {
            object5 = im3_0.c;
        }
        ot2_1 ot2_12 = ((ym2_0)object4).e;
        yu1_1 yu1_12 = ((ym2_0)object4).f;
        object4 = object2;
        n14 = n15;
        l3 = l14;
        object6 = object8;
        object7 = ot2_12;
        object8 = yu1_12;
        object2 = new ym2_0(n10, n15, l14, (vl3_0)object6, ot2_12, yu1_12, n4, n3, (im3_0)object5);
        object = ((xm3)object).c;
        return new xm3((S93)object3, (ym2_0)object2, (ct2_0)object);
    }
}

