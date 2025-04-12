/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jv
 */
public final class jv_1 {
    public static final void a(int n3, int n4, b30_0 b30_02, int n7) {
        int n8 = n3;
        int n10 = n4;
        int n14 = n7;
        int n15 = 1551155;
        Object object = b30_02;
        Object object2 = b30_02.g(n15);
        int n16 = n7 & 0xE;
        int n17 = 4;
        if (n16 == 0) {
            n16 = (int)(((j30_0)object2).c(n3) ? 1 : 0);
            n16 = n16 != 0 ? 4 : 2;
            n16 |= n14;
        } else {
            n16 = n7;
        }
        int n18 = n14 & 0x70;
        int n19 = 32;
        if (n18 == 0) {
            n18 = (int)(((j30_0)object2).c(n10) ? 1 : 0);
            n18 = n18 != 0 ? 32 : 16;
            n16 |= n18;
        }
        n18 = n16 & 0x5B;
        int n20 = 18;
        float f5 = 2.5E-44f;
        if (n18 == n20 && (n18 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
        } else {
            Object object3;
            LP1 lP1 = LP1$a.b;
            n20 = 1065353216;
            lP1 = j.c(lP1, 1.0f);
            f5 = uq0_0.k;
            lP1 = j.d(lP1, f5);
            zp$c zp$c = zp.d;
            ((j30_0)object2).K(2002845508);
            int n21 = n16 & 0xE;
            int n22 = 1;
            if (n21 == n17) {
                n17 = 1;
            } else {
                n17 = 0;
                object3 = null;
            }
            if ((n16 &= 0x70) != n19) {
                n22 = 0;
            }
            n16 = n17 | n22;
            object3 = ((j30_0)object2).v();
            if (n16 != 0 || object3 == (object = b30$a.a)) {
                object3 = new dv_1(n8, n10);
                ((j30_0)object2).o(object3);
            }
            Object object4 = object3;
            object4 = (Function1)object3;
            ((j30_0)object2).T(false);
            n22 = 0;
            n17 = 0;
            object3 = null;
            int n24 = 24582;
            int n25 = 238;
            object = lP1;
            n18 = 0;
            lP1 = null;
            n19 = 0;
            n21 = 0;
            xq1_0.b((LP1)object, null, null, false, zp$c, null, null, false, (Function1)object4, (b30_0)object2, n24, n25);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new ev_1(n8, n10, n14);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(ArrayList arrayList, Function1 function1, g71_0 g71_02, Function1 function12, boolean n3, float f5, boolean bl2, float f6, b30_0 b30_02, int n4, int n7) {
        block20: {
            void var42_49;
            Object object;
            N20$a$b n20$a$b;
            float f7;
            N20$a n20$a;
            int n8;
            Object object2;
            Object object3;
            int n10;
            Object object4;
            Object object5;
            int n14;
            Object object6;
            Object object7;
            float f8;
            float f11;
            int n16;
            N20$a$c n20$a$c;
            int n17;
            int n18;
            Object object8;
            Object object9;
            int n19;
            int n20;
            Object object10;
            Function1 function13;
            ArrayList arrayList2;
            block22: {
                block23: {
                    void var25_27;
                    block21: {
                        float f12;
                        arrayList2 = arrayList;
                        function13 = function1;
                        object10 = function12;
                        n20 = n4;
                        n19 = n7;
                        Intrinsics.checkNotNullParameter(arrayList, "bannerDataList");
                        Intrinsics.checkNotNullParameter(function1, "onBannerClick");
                        Intrinsics.checkNotNullParameter(function12, "sendImpression");
                        int n21 = -1150221530;
                        object9 = b30_02;
                        object8 = b30_02.g(n21);
                        n18 = n7 & 0x10;
                        n17 = 0;
                        n20$a$c = null;
                        n16 = n18 != 0 ? 0 : n3;
                        n18 = n19 & 0x20;
                        f11 = n18 != 0 ? (f12 = uq0_0.a) : f5;
                        n18 = n19 & 0x40;
                        if (n18 != 0) {
                            boolean bl4 = false;
                            f8 = 0.0f;
                            object7 = null;
                        } else {
                            boolean bl3 = bl2;
                        }
                        n18 = n19 & 0x80;
                        f12 = n18 != 0 ? uq0_0.a : f6;
                        object6 = new fv_1(arrayList2);
                        object6 = El2.b((Function0)object6, (b30_0)object8);
                        ((j30_0)object8).K(158139035);
                        int n15 = ((j30_0)object8).J(object6);
                        n14 = n20 & 0x1C00 ^ 0xC00;
                        int n22 = 2048;
                        if (n14 > n22 && (n14 = (int)(((j30_0)object8).J(object10) ? 1 : 0)) != 0 || (n14 = n20 & 0xC00) == n22) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object5 = null;
                        }
                        int n24 = n15 | n14;
                        object5 = ((j30_0)object8).v();
                        object4 = b30$a.a;
                        n10 = 0;
                        object3 = null;
                        if (n24 != 0 || object5 == object4) {
                            object5 = new Jv$b((hm0_0)object6, (Function1)object10, null);
                            ((j30_0)object8).o(object5);
                        }
                        object5 = (Function2)object5;
                        ((j30_0)object8).T(false);
                        ly0_0.d((b30_0)object8, object6, (Function2)object5);
                        object5 = LP1$a.b;
                        object2 = j.m((LP1)object5);
                        ((j30_0)object8).K(158148257);
                        n10 = 0x70000 & n20;
                        n8 = 196608;
                        n17 = 131072;
                        if ((n10 ^= n8) > n17 && (n10 = (int)(((j30_0)object8).b(f11) ? 1 : 0)) != 0 || (n10 = n20 & n8) == n17) {
                            n17 = 1;
                        } else {
                            n17 = 0;
                            n20$a$c = null;
                        }
                        object3 = ((j30_0)object8).v();
                        if (n17 != 0 || object3 == object4) {
                            object3 = new gv_2(f11);
                            ((j30_0)object8).o(object3);
                        }
                        object3 = (Function1)object3;
                        ((j30_0)object8).T(false);
                        n20$a$c = null;
                        object2 = x20_0.a((LP1)object2, n16 != 0, (Function1)object3, null);
                        ((j30_0)object8).K(158150791);
                        n17 = 0x1C00000 & n20 ^ 0xC00000;
                        n10 = 0x800000;
                        if (n17 > n10 && (n17 = (int)(((j30_0)object8).b(f12) ? 1 : 0)) != 0 || (n17 = 0xC00000 & n20) == n10) {
                            n17 = 1;
                        } else {
                            n17 = 0;
                            n20$a$c = null;
                        }
                        object3 = ((j30_0)object8).v();
                        if (n17 != 0 || object3 == object4) {
                            object3 = new hv_2(f12);
                            ((j30_0)object8).o(object3);
                        }
                        object3 = (Function1)object3;
                        n20$a$c = null;
                        ((j30_0)object8).T(false);
                        n22 = 0;
                        object2 = x20_0.a((LP1)object2, (boolean)var25_27, (Function1)object3, null);
                        object4 = zp.c;
                        object3 = Nc$a.m;
                        object4 = oZ.a((zp$l)object4, (Gx$a)object3, (b30_0)object8, 0);
                        n17 = ((j30_0)object8).P;
                        object3 = ((j30_0)object8).P();
                        object2 = a30_0.c((b30_0)object8, (LP1)object2);
                        n20$a = N20.W;
                        n20$a.getClass();
                        f7 = f12;
                        object9 = N20$a.b;
                        object10 = ((j30_0)object8).a;
                        n20 = object10 instanceof mp;
                        if (n20 == 0) break block20;
                        ((j30_0)object8).A();
                        n20 = (int)(((j30_0)object8).O ? 1 : 0);
                        if (n20 != 0) {
                            ((j30_0)object8).C((Function0)object9);
                        } else {
                            ((j30_0)object8).n();
                        }
                        n20$a$b = N20$a.e;
                        Ow3.a((b30_0)object8, object4, n20$a$b);
                        object4 = N20$a.d;
                        Ow3.a((b30_0)object8, object3, (Function2)object4);
                        object3 = N20$a.f;
                        n19 = (int)(((j30_0)object8).O ? 1 : 0);
                        if (n19 != 0) break block21;
                        object = ((j30_0)object8).v();
                        var42_49 = var25_27;
                        object7 = n17;
                        boolean bl4 = Intrinsics.areEqual(object, object7);
                        if (bl4) break block22;
                        break block23;
                    }
                    var42_49 = var25_27;
                }
                rk_0.a(n17, (j30_0)object8, n17, (N20$a$a)object3);
            }
            n20$a$c = N20$a.c;
            Ow3.a((b30_0)object8, object2, n20$a$c);
            f8 = uq0_0.o;
            object7 = h.g((LP1)object5, f8, 0.0f, 2);
            n19 = 1065353216;
            float f12 = 1.0f;
            object7 = j.c((LP1)object7, f12);
            object = Nc$a.a;
            object2 = null;
            object = HA.e((Nc)object, false);
            int n25 = ((j30_0)object8).P;
            Object object11 = object5;
            object5 = ((j30_0)object8).P();
            object7 = a30_0.c((b30_0)object8, (LP1)object7);
            boolean bl5 = object10 instanceof mp;
            if (bl5) {
                ((j30_0)object8).A();
                bl5 = ((j30_0)object8).O;
                if (bl5) {
                    ((j30_0)object8).C((Function0)object9);
                } else {
                    ((j30_0)object8).n();
                }
                Ow3.a((b30_0)object8, object, n20$a$b);
                Ow3.a((b30_0)object8, object5, (Function2)object4);
                n18 = (int)(((j30_0)object8).O ? 1 : 0);
                if (n18 != 0 || (n18 = (int)(Intrinsics.areEqual(object9 = ((j30_0)object8).v(), object10 = Integer.valueOf(n25)) ? 1 : 0)) == 0) {
                    rk_0.a(n25, (j30_0)object8, n25, (N20$a$a)object3);
                }
                Ow3.a((b30_0)object8, object7, n20$a$c);
                object4 = ok2$a_0.a;
                object10 = g71_02;
                object9 = new Jv$c(arrayList2, g71_02, function13, (hm0_0)object6);
                u10 u102 = v10.c(-2105534008, (fx0_2)object9, (b30_0)object8);
                int n26 = 3072;
                boolean bl6 = false;
                object2 = null;
                n14 = 0;
                object5 = null;
                object9 = object11;
                n10 = 0;
                object3 = null;
                n17 = 1;
                n8 = 0;
                n20$a = null;
                int n27 = 3072;
                int n28 = 8182;
                object7 = object6;
                jl2.a((hm0_0)object6, null, null, (ok2_0)object4, 0, 0.0f, null, null, false, false, null, null, null, u102, (b30_0)object8, n26, n27, n28);
                ((j30_0)object8).T(n17 != 0);
                float f14 = 2.3865628E-34f;
                ((j30_0)object8).K(127835459);
                n20 = arrayList.size();
                if (n20 > n17) {
                    f14 = uq0_0.e;
                    object9 = h.e((LP1)object11, f14);
                    Q93.b((b30_0)object8, (LP1)object9);
                    n18 = arrayList.size();
                    int n29 = ((Cl2)object6).j();
                    n20 = 0;
                    f14 = 0.0f;
                    n20$a$b = null;
                    jv_1.a(n18, n29, (b30_0)object8, 0);
                } else {
                    n20 = 0;
                    f14 = 0.0f;
                    n20$a$b = null;
                }
                object6 = fn0_2.a((j30_0)object8, false, n17 != 0);
                if (object6 != null) {
                    object8 = object2;
                    arrayList2 = arrayList;
                    function13 = function1;
                    f8 = f7;
                    object9 = g71_02;
                    object10 = function12;
                    n17 = n16;
                    n20 = n4;
                    n19 = n7;
                    ((CF2)object6).d = object2 = new iv_2(arrayList, function1, g71_02, function12, n16 != 0, f11, (boolean)var42_49, f7, n4, n7);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

