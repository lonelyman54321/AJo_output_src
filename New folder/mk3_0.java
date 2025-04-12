/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from mk3
 */
public final class mk3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;

    public mk3_0(float f5, long l2, Function2 function2, boolean bl2, long l3) {
        this.c = f5;
        this.d = l2;
        this.e = function2;
        this.f = bl2;
        this.g = l3;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3;
        Object object4;
        int n4;
        float f5;
        int n7;
        float f6;
        float f7;
        Object object5;
        long l2;
        long l3;
        int n8;
        long l4;
        float f8;
        Object object6;
        int n10;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        int n14;
        Object object12;
        Object object13;
        Object object14;
        block28: {
            block29: {
                block27: {
                    int n15;
                    object14 = this;
                    object13 = object;
                    object13 = (b30_0)object;
                    object12 = object2;
                    object12 = (Number)object2;
                    n14 = ((Number)object12).intValue() & 3;
                    if (n14 == (n15 = 2) && (n14 = (int)(object13.h() ? 1 : 0)) != 0) {
                        object13.D();
                        return Unit.a;
                    }
                    object12 = Bt3.b;
                    object11 = ((At3)object13.j((H30)object12)).g;
                    object12 = ((At3)object13.j((H30)object12)).l;
                    object10 = ((xm3)object11).a;
                    object9 = ((xm3)object12).a;
                    object8 = U93.d;
                    object8 = ((S93)object10).a;
                    object7 = ((S93)object9).a;
                    n10 = object8 instanceof be_2;
                    object6 = sl3$a.a;
                    f8 = ((mk3_0)object14).c;
                    l4 = 16;
                    if (n10 != 0 || (n8 = object7 instanceof be_2) != 0) break block27;
                    l3 = object8.a();
                    l2 = object7.a();
                    long l7 = (l2 = zx_0.g(l3, l2, f8)) - l4;
                    Object object15 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object15 != false) {
                        object6 = new gz_1(l2);
                    }
                    break block28;
                }
                if (n10 == 0 || (n10 = object7 instanceof be_2) == 0) break block29;
                object5 = object8;
                object5 = ((be_2)object8).a;
                Object object16 = object7;
                object16 = ((be_2)object7).a;
                object5 = (ZD)U93.b(f8, object5, object16);
                object8 = (be_2)object8;
                f7 = ((be_2)object8).b;
                object7 = (be_2)object7;
                f6 = ((be_2)object7).b;
                f7 = LK1.c(f7, f6, f8);
                if (object5 != null) {
                    n7 = object5 instanceof i93_0;
                    if (n7 != 0) {
                        object5 = (i93_0)object5;
                        l2 = Tj3.a(((i93_0)object5).a, f7);
                        long l8 = l2 - l4;
                        Object object17 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object17 != false) {
                            object6 = new gz_1(l2);
                        }
                        break block28;
                    } else {
                        n7 = object5 instanceof Z03;
                        if (n7 == 0) {
                            object12 = new NoWhenBranchMatchedException();
                            throw object12;
                        }
                        object5 = (Z03)object5;
                        object6 = new be_2((Z03)object5, f7);
                    }
                }
                break block28;
            }
            object6 = object8 = U93.b(f8, object8, object7);
            object6 = (sl3_0)object8;
        }
        Object object18 = object6;
        object8 = ((S93)object10).f;
        object7 = ((S93)object9).f;
        Object object19 = object8 = U93.b(f8, object8, object7);
        object19 = (RU0)object8;
        l2 = ((S93)object10).b;
        l3 = ((S93)object9).b;
        l3 = U93.c(l2, l3, f8);
        object8 = ((S93)object10).c;
        if (object8 == null) {
            object8 = tv0_0.m;
        }
        if ((object7 = ((S93)object9).c) == null) {
            object7 = tv0_0.m;
        }
        int n16 = ((tv0_0)object8).a;
        n7 = ((tv0_0)object7).a;
        int n17 = LK1.d(n16, n7, f8);
        n7 = 1;
        f6 = Float.MIN_VALUE;
        n10 = 1000;
        float f11 = 1.401E-42f;
        int n18 = kotlin.ranges.f.g(n17, n7, n10);
        object7 = new tv0_0(n18);
        object8 = ((S93)object10).d;
        object5 = ((S93)object9).d;
        Object object20 = object8 = U93.b(f8, object8, object5);
        object20 = (nV0)object8;
        object8 = ((S93)object10).e;
        object5 = ((S93)object9).e;
        Object object21 = object8 = U93.b(f8, object8, object5);
        object21 = (oV0)object8;
        object8 = ((S93)object10).g;
        object5 = ((S93)object9).g;
        Object object22 = object8 = U93.b(f8, object8, object5);
        object22 = (String)object8;
        long l12 = ((S93)object10).h;
        object = object13;
        long l14 = ((S93)object9).h;
        long l15 = U93.c(l12, l14, f8);
        boolean bl2 = false;
        f7 = 0.0f;
        object8 = null;
        object13 = ((S93)object10).i;
        if (object13 != null) {
            f5 = ((Rw)object13).a;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object13 = null;
        }
        object5 = ((S93)object9).i;
        if (object5 != null) {
            f7 = ((Rw)object5).a;
        }
        f7 = LK1.c(f5, f7, f8);
        object13 = tl3_0.c;
        object5 = ((S93)object10).j;
        if (object5 == null) {
            object5 = object13;
        }
        if ((object6 = ((S93)object9).j) != null) {
            object13 = object6;
        }
        float f12 = ((tl3_0)object5).a;
        float f14 = ((tl3_0)object13).a;
        f14 = LK1.c(f12, f14, f8);
        f11 = ((tl3_0)object5).b;
        f5 = ((tl3_0)object13).b;
        f5 = LK1.c(f11, f5, f8);
        object6 = new tl3_0(f14, f5);
        object14 = ((S93)object10).k;
        object13 = ((S93)object9).k;
        Object object23 = object14 = U93.b(f8, object14, object13);
        object23 = (iw1)object14;
        object2 = object4;
        long l16 = ((S93)object10).l;
        object5 = object12;
        long l17 = ((S93)object9).l;
        long l18 = zx_0.g(l16, l17, f8);
        object14 = ((S93)object10).m;
        object12 = ((S93)object9).m;
        Object object24 = object14 = U93.b(f8, object14, object12);
        object24 = (Jj3)object14;
        object14 = ((S93)object10).n;
        if (object14 == null) {
            object14 = new b13_0();
        }
        if ((object12 = ((S93)object9).n) == null) {
            object12 = new b13_0();
        }
        Object object25 = object5;
        object4 = object6;
        l12 = ((b13_0)object14).a;
        Object object26 = object6;
        Object object27 = object7;
        long l19 = ((b13_0)object12).a;
        long l20 = zx_0.g(l12, l19, f8);
        l19 = ((b13_0)object14).b;
        n10 = 32;
        f11 = 4.5E-44f;
        long l21 = l3;
        int n19 = (int)(l19 >> n10);
        float f15 = Float.intBitsToFloat(n19);
        l3 = ((b13_0)object12).b;
        Object object28 = object18;
        int n20 = (int)(l3 >> n10);
        f12 = Float.intBitsToFloat(n20);
        f15 = LK1.c(f15, f12, f8);
        l4 = 0xFFFFFFFFL;
        float f16 = Float.intBitsToFloat((int)(l19 & l4));
        f6 = Float.intBitsToFloat((int)(l3 & l4));
        f16 = LK1.c(f16, f6, f8);
        n7 = Float.floatToRawIntBits(f15);
        l3 = n7;
        int n21 = Float.floatToRawIntBits(f16);
        l19 = n21;
        l12 = l3 << n10;
        long l22 = l12 | (l19 &= l4);
        f14 = ((b13_0)object14).c;
        float f17 = ((b13_0)object12).c;
        float f18 = LK1.c(f14, f17, f8);
        object13 = new b13_0(l20, l22, f18);
        object12 = ((S93)object10).o;
        if (object12 == null && (object4 = ((S93)object9).o) == null) {
            object3 = null;
        } else {
            if (object12 == null) {
                object12 = st2_1.a;
            }
            object3 = object12;
        }
        object12 = ((S93)object10).p;
        object10 = ((S93)object9).p;
        Object object29 = object12 = U93.b(f8, object12, object10);
        object29 = (Qt0)object12;
        object10 = new Rw(f7);
        object18 = object28;
        l3 = l21;
        object28 = object10;
        object12 = new S93((sl3_0)object18, l21, (tv0_0)object27, (nV0)object20, (oV0)object21, (RU0)object19, (String)object22, l15, (Rw)object10, (tl3_0)object26, (iw1)object23, l18, (Jj3)object24, (b13_0)object13, (st2_1)object3, (Qt0)object29);
        object11 = ((xm3)object11).b;
        int n22 = ((ym2_0)object11).a;
        object8 = new Cj3(n22);
        object9 = object25;
        object9 = ((xm3)object25).b;
        n4 = ((ym2_0)object9).a;
        object4 = new Cj3(n4);
        n20 = ((Cj3)U93.b((float)f8, (Object)object8, (Object)object4)).a;
        n4 = ((ym2_0)object11).b;
        object8 = new Pj3(n4);
        n21 = ((ym2_0)object9).b;
        object13 = new Pj3(n21);
        n8 = ((Pj3)U93.b((float)f8, (Object)object8, (Object)object13)).a;
        l14 = ((ym2_0)object11).c;
        l19 = ((ym2_0)object9).c;
        long l23 = U93.c(l14, l19, f8);
        object8 = ((ym2_0)object11).d;
        if (object8 == null) {
            object8 = vl3_0.c;
        }
        if ((object13 = ((ym2_0)object9).d) == null) {
            object13 = vl3_0.c;
        }
        l2 = ((vl3_0)object8).a;
        object28 = object12;
        l17 = ((vl3_0)object13).a;
        l17 = U93.c(l2, l17, f8);
        l2 = ((vl3_0)object8).b;
        l14 = ((vl3_0)object13).b;
        l14 = U93.c(l2, l14, f8);
        object4 = new vl3_0(l17, l14);
        object14 = ((ym2_0)object11).e;
        object12 = ((ym2_0)object9).e;
        if (object14 == null && object12 == null) {
            object21 = null;
        } else {
            int n24;
            if (object14 == null) {
                object14 = ot2_1.c;
            }
            if (object12 == null) {
                object12 = ot2_1.c;
            }
            if ((n24 = ((ot2_1)object14).a) != (n4 = (int)(((ot2_1)object12).a ? 1 : 0))) {
                n7 = ((ot2_1)object14).b;
                object13 = new Uy0(n7);
                n10 = ((ot2_1)object12).b;
                object7 = new Uy0(n10);
                object13 = (Uy0)U93.b(f8, object13, object7);
                n4 = ((Uy0)object13).a;
                object14 = ((ot2_1)object14).a;
                n14 = (int)(((ot2_1)object12).a ? 1 : 0);
                object12 = n14 != 0;
                n3 = (int)(((Boolean)U93.b(f8, object14, object12)).booleanValue() ? 1 : 0);
                object14 = object8 = new ot2_1(n4, n3 != 0);
            }
            object21 = object14;
        }
        object14 = ((ym2_0)object11).f;
        object12 = ((ym2_0)object9).f;
        object19 = object14 = U93.b(f8, object14, object12);
        object19 = (yu1_1)object14;
        n14 = ((ym2_0)object11).g;
        object14 = new wu1_1(n14);
        int n25 = ((ym2_0)object9).g;
        object12 = new wu1_1(n25);
        n3 = ((wu1_1)U93.b((float)f8, (Object)object14, (Object)object12)).a;
        int n26 = ((ym2_0)object11).h;
        object12 = new gc1_1(n26);
        n4 = ((ym2_0)object9).h;
        object8 = new gc1_1(n4);
        n14 = ((gc1_1)U93.b((float)f8, (Object)object12, (Object)object8)).a;
        object11 = ((ym2_0)object11).i;
        object9 = ((ym2_0)object9).i;
        Object object30 = object11 = U93.b(f8, object11, object9);
        object30 = (im3_0)object11;
        object20 = object4;
        int n27 = n14;
        object10 = new ym2_0(n20, n8, l23, (vl3_0)object4, (ot2_1)object21, (yu1_1)object19, n3, n14, (im3_0)object30);
        object14 = object2;
        object12 = object28;
        ((xm3)object2)((S93)object28, (ym2_0)object10);
        object13 = this;
        n14 = (int)(this.f ? 1 : 0);
        if (n14 != 0) {
            object22 = null;
            n27 = 0xFFFFFE;
            l2 = this.g;
            long l24 = 0L;
            f12 = 0.0f;
            n20 = 0;
            object18 = null;
            l3 = 0L;
            object27 = null;
            long l25 = 0L;
            object19 = null;
            object4 = object2;
            object14 = xm3.a((xm3)object2, l2, l24, null, null, l3, 0, l25, null, null, n27);
        }
        object10 = object14;
        n21 = 384;
        f16 = 5.38E-43f;
        n7 = 0;
        f6 = 0.0f;
        object7 = null;
        long l26 = ((mk3_0)object13).d;
        n22 = 0;
        object9 = null;
        object8 = ((mk3_0)object13).e;
        object13 = object;
        lk3_0.b(l26, (xm3)object14, null, (Function2)object8, (b30_0)object, n21, 0);
        return Unit.a;
    }
}

