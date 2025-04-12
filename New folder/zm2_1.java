/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zm2
 */
public final class zm2_1 {
    public static final long a = Dm3.c;
    public static final /* synthetic */ int b;

    public static final ym2_0 a(ym2_0 object, int n3, int n4, long l2, vl3_0 vl3_02, ot2_1 ot2_12, yu1_1 yu1_12, int n7, int n8, im3_0 object2) {
        boolean bl2;
        long l3;
        long l4;
        int n10;
        int n14;
        Object object3;
        int n15;
        int n16;
        yu1_1 yu1_13;
        ot2_1 ot2_13;
        vl3_0 vl3_03;
        int n17;
        int n18;
        Object object4;
        block13: {
            Object object5;
            block17: {
                block16: {
                    block15: {
                        block14: {
                            block12: {
                                object4 = object;
                                n18 = n3;
                                n17 = n4;
                                vl3_03 = vl3_02;
                                ot2_13 = ot2_12;
                                yu1_13 = yu1_12;
                                n16 = n7;
                                n15 = n8;
                                object3 = object2;
                                n14 = -1 << -1;
                                n10 = Cj3.a(n3, n14);
                                if (n10 != 0) break block12;
                                n10 = ((ym2_0)object).a;
                                if ((n10 = (int)(Cj3.a(n3, n10) ? 1 : 0)) != 0) break block12;
                                l4 = l2;
                                break block13;
                            }
                            if ((n10 = Em3.g(l2) ^ 1) == 0) break block14;
                            l3 = ((ym2_0)object4).c;
                            l4 = l2;
                            n10 = (int)(Dm3.a(l2, l3) ? 1 : 0);
                            if (n10 == 0) break block13;
                            break block15;
                        }
                        l4 = l2;
                    }
                    if (vl3_03 != null && (n10 = (int)(Intrinsics.areEqual(vl3_03, object5 = ((ym2_0)object4).d) ? 1 : 0)) == 0) break block13;
                    n10 = (int)(Pj3.a(n17, n14) ? 1 : 0);
                    if (n10 != 0) break block16;
                    n10 = ((ym2_0)object4).b;
                    if ((n10 = (int)(Pj3.a(n17, n10) ? 1 : 0)) == 0) break block13;
                }
                if (ot2_13 != null && (n10 = (int)(Intrinsics.areEqual(ot2_13, object5 = ((ym2_0)object4).e) ? 1 : 0)) == 0 || yu1_13 != null && (n10 = (int)(Intrinsics.areEqual(yu1_13, object5 = ((ym2_0)object4).f) ? 1 : 0)) == 0 || n16 != 0 && n16 != (n10 = ((ym2_0)object4).g)) break block13;
                n10 = (int)(gc1_1.a(n15, n14) ? 1 : 0);
                if (n10 != 0) break block17;
                n10 = ((ym2_0)object4).h;
                if ((n10 = (int)(gc1_1.a(n15, n10) ? 1 : 0)) == 0) break block13;
            }
            if (object3 == null || (n10 = (int)(Intrinsics.areEqual(object3, object5 = ((ym2_0)object4).i) ? 1 : 0)) != 0) {
                return object4;
            }
        }
        n10 = (int)(Em3.g(l2) ? 1 : 0);
        l3 = n10 != 0 ? ((ym2_0)object4).c : l4;
        if (vl3_03 == null) {
            vl3_03 = ((ym2_0)object4).d;
        }
        if (bl2 = Cj3.a(n3, n14)) {
            n18 = ((ym2_0)object4).a;
        }
        bl2 = Pj3.a(n17, n14);
        if (bl2) {
            n17 = ((ym2_0)object4).b;
        }
        ot2_1 ot2_14 = ((ym2_0)object4).e;
        if (ot2_14 != null && ot2_13 == null) {
            ot2_13 = ot2_14;
        }
        if (yu1_13 == null) {
            yu1_13 = ((ym2_0)object4).f;
        }
        if (n16 == 0) {
            n16 = ((ym2_0)object4).g;
        }
        if ((n14 = (int)(gc1_1.a(n15, n14) ? 1 : 0)) != 0) {
            n15 = ((ym2_0)object4).h;
        }
        if (object3 == null) {
            object3 = object4 = ((ym2_0)object4).i;
        }
        object = object4;
        n3 = n18;
        n4 = n17;
        l2 = l3;
        vl3_02 = vl3_03;
        ot2_12 = ot2_13;
        yu1_12 = yu1_13;
        n7 = n16;
        n8 = n15;
        object2 = object3;
        object4 = new ym2_0(n18, n17, l3, vl3_03, ot2_13, yu1_13, n16, n15, (im3_0)object3);
        return object4;
    }
}

