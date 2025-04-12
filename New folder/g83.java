/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class g83 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    static {
        float f5;
        a = 30;
        b = 16;
        c = f5 = (float)8;
        d = 2;
        e = 6;
        f = f5;
        g = 12;
        h = 48;
        i = 68;
    }

    /*
     * WARNING - void declaration
     */
    public static final void a(LP1 lP1, Function2 function2, boolean bl2, i13 i132, long l2, long l3, float f5, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        Function2 function22 = function2;
        boolean bl3 = bl2;
        u10 u103 = u102;
        int n16 = n3;
        int n17 = -558258760;
        Object object3 = b30_02.g(n17);
        int n18 = n3 & 6;
        if (n18 == 0) {
            n15 = (int)(((j30_0)object3).J(lP1) ? 1 : 0);
            n15 = n15 != 0 ? 4 : 2;
            n15 |= n16;
        } else {
            n15 = n3;
        }
        int n19 = n16 & 0x30;
        if (n19 == 0) {
            n19 = (int)(((j30_0)object3).x(function22) ? 1 : 0);
            n19 = n19 != 0 ? 32 : 16;
            n15 |= n19;
        }
        if ((n19 = n16 & 0x180) == 0) {
            n19 = (int)(((j30_0)object3).a(bl3) ? 1 : 0);
            n19 = n19 != 0 ? 256 : 128;
            n15 |= n19;
        }
        if ((n19 = n16 & 0xC00) == 0) {
            void var21_22;
            boolean n142 = ((j30_0)object3).J(i132);
            if (n142) {
                int n20 = 2048;
            } else {
                int n21 = 1024;
            }
            n15 |= var21_22;
        }
        if ((n14 = n16 & 0x6000) == 0) {
            void var22_27;
            boolean bl4 = ((j30_0)object3).d(l2);
            if (bl4) {
                int n22 = 16384;
            } else {
                int n24 = 8192;
            }
            n15 |= var22_27;
        }
        if ((n10 = 0x30000 & n16) == 0) {
            n8 = (int)(((j30_0)object3).d(l3) ? 1 : 0);
            n8 = n8 != 0 ? 131072 : 65536;
            n15 |= n8;
        }
        if ((n7 = n16 & (n8 = 0x180000)) == 0) {
            n7 = (int)(((j30_0)object3).b(f5) ? 1 : 0);
            n7 = n7 != 0 ? 0x100000 : 524288;
            n15 |= n7;
        }
        if ((n7 = 0xC00000 & n16) == 0) {
            n7 = (int)(((j30_0)object3).x(u103) ? 1 : 0);
            n7 = n7 != 0 ? 0x800000 : 0x400000;
            n15 |= n7;
        }
        if ((n7 = 0x492493 & n15) == (n4 = 0x492492) && (n7 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            ((j30_0)object3).r0();
            n7 = n16 & 1;
            if (n7 != 0 && (n7 = (int)(((j30_0)object3).c0() ? 1 : 0)) == 0) {
                ((j30_0)object3).D();
            }
            ((j30_0)object3).U();
            object2 = new X73(function22, u103, bl3);
            u10 u104 = v10.c(-2084221700, (fx0_2)object2, (b30_0)object3);
            n7 = n15 & 0xE;
            n8 |= n7;
            n7 = n15 >> 6;
            n4 = n7 & 0x70;
            n8 |= n4;
            n4 = n7 & 0x380;
            n8 |= n4;
            n15 >>= 3;
            n7 = 458752;
            int n25 = (n8 |= (n7 &= 0x1C00)) | (n15 &= n7);
            int n26 = 16;
            object = lP1;
            object2 = i132;
            jg3_0.a(lP1, i132, l2, l3, null, f5, u104, (b30_0)object3, n25, n26);
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            object3 = object2;
            function22 = function2;
            bl3 = bl2;
            u103 = u102;
            n16 = n3;
            object2 = new Y73(lP1, function2, bl2, i132, l2, l3, f5, u102, n3);
            ((CF2)object).d = object2;
        }
    }

    public static final void b(D73 d73, LP1 lP1, boolean bl2, i13 i132, long l2, long l3, long l4, float f5, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        float f6;
        long l7;
        long l8;
        long l12;
        Object object3;
        int n4;
        D73 d732 = d73;
        int n7 = n3;
        int n8 = 258660814;
        Object object4 = b30_02;
        Object object5 = b30_02.g(n8);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = n3 & 8;
            n10 = n10 == 0 ? (int)(((j30_0)object5).J(d73) ? 1 : 0) : (int)(((j30_0)object5).x(d73) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n10 | 0x1B0;
        int n15 = n7 & 0xC00;
        if (n15 == 0) {
            n14 = n10 | 0x5B0;
        }
        if ((n10 = n7 & 0x6000) == 0) {
            n14 |= 0x2000;
        }
        if ((n10 = 0x30000 & n7) == 0) {
            n10 = 65536;
            n14 |= n10;
        }
        if ((n10 = 0x180000 & n7) == 0) {
            n10 = 524288;
            n14 |= n10;
        }
        if ((n15 = 0x492493 & (n14 |= (n10 = 0xC00000))) == (n4 = 0x492492) && (n15 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
            object4 = lP1;
            n14 = (int)(bl2 ? 1 : 0);
            object3 = i132;
            l12 = l2;
            l8 = l3;
            l7 = l4;
            f6 = f5;
        } else {
            float f7;
            Object object6;
            float f8;
            int n16;
            Object object7;
            ((j30_0)object5).r0();
            n15 = n7 & 1;
            n4 = -4193281;
            if (n15 != 0 && (n15 = (int)(((j30_0)object5).c0() ? 1 : 0)) == 0) {
                ((j30_0)object5).D();
                n14 &= n4;
                object3 = lP1;
                n10 = (int)(bl2 ? 1 : 0);
                object7 = i132;
                l7 = l2;
                l12 = l3;
                l8 = l4;
                n16 = n14;
                f8 = f5;
            } else {
                long l14;
                int n17;
                object3 = LP1$a.b;
                Object object8 = B13.a;
                object8 = ((A13)((j30_0)object5).j((H30)object8)).a;
                Object object9 = mz_0.a;
                lZ lZ2 = (lZ)((j30_0)object5).j((H30)object9);
                l7 = lZ2.e();
                f6 = 0.8f;
                l7 = OX.b(l7, f6);
                long l15 = ((lZ)((j30_0)object5).j((H30)object9)).h();
                l7 = zx_0.f(l7, l15);
                object7 = (lZ)((j30_0)object5).j((H30)object9);
                l15 = ((lZ)object7).h();
                boolean bl3 = ((lZ)(object9 = (lZ)((j30_0)object5).j((H30)object9))).i();
                if (bl3) {
                    object7 = object8;
                    long l16 = ((lZ)object9).f();
                    n17 = n14;
                    l14 = ((lZ)object9).h();
                    float f11 = 0.6f;
                    l14 = zx_0.f(OX.b(l14, f11), l16);
                } else {
                    n17 = n14;
                    object7 = object8;
                    object4 = (OX)((lZ)object9).b.getValue();
                    l14 = ((OX)object4).a;
                }
                n4 = n17 & n4;
                int n18 = 6;
                float f12 = n18;
                l8 = l14;
                f8 = f12;
                n10 = 0;
                object4 = null;
                n16 = n4;
                l12 = l15;
            }
            ((j30_0)object5).U();
            object2 = d73.a();
            if (object2 != null) {
                ((j30_0)object5).K(1609178760);
                object6 = new d83_0(l8, d732, (String)object2);
                int n19 = 1843479216;
                object2 = v10.c(n19, (fx0_2)object6, (b30_0)object5);
                f7 = 0.0f;
                object6 = null;
                ((j30_0)object5).T(false);
            } else {
                f7 = 0.0f;
                object6 = null;
                ((j30_0)object5).K(1609445763);
                ((j30_0)object5).T(false);
                boolean bl4 = false;
                object2 = null;
            }
            f7 = 12;
            object6 = androidx.compose.foundation.layout.h.e((LP1)object3, f7);
            Object object10 = object3;
            object3 = new Z73(d732);
            u10 u102 = v10.c(-261845785, (fx0_2)object3, (b30_0)object5);
            int n20 = n16 & 0x380 | 0xC00000;
            n15 = n16 >> 3;
            n16 = 0x380000;
            int n21 = n20 | (n15 &= n16);
            object = object6;
            long l17 = l12;
            g83.a((LP1)object6, (Function2)object2, n10 != 0, (i13)object7, l7, l12, f8, u102, (b30_0)object5, n21);
            object3 = object7;
            f6 = f8;
            n14 = n10;
            object4 = object10;
            l12 = l7;
            l7 = l8;
            l8 = l17;
        }
        object = ((j30_0)object5).X();
        if (object != null) {
            object5 = object2;
            d732 = d73;
            n7 = n3;
            ((CF2)object).d = object2 = new a83_0(d73, (LP1)object4, n14 != 0, (i13)object3, l12, l8, l7, f6, n3);
        }
    }

    public static final void c(u10 u102, Function2 function2, b30_0 b30_02, int n3) {
        block18: {
            block19: {
                block20: {
                    Object object;
                    int n4;
                    Object object2;
                    Function2 function22;
                    u10 u103;
                    block17: {
                        Object object3;
                        Object object4;
                        float f5;
                        int n7;
                        int n8;
                        Object object5;
                        int n10;
                        block16: {
                            u103 = u102;
                            function22 = function2;
                            n10 = n3;
                            int n14 = -1229075900;
                            object5 = b30_02;
                            object2 = b30_02.g(n14);
                            n4 = n3 & 6;
                            if (n4 == 0) {
                                n4 = (int)(((j30_0)object2).x(u102) ? 1 : 0);
                                n4 = n4 != 0 ? 4 : 2;
                                n4 |= n10;
                            } else {
                                n4 = n3;
                            }
                            n8 = n10 & 0x30;
                            if (n8 == 0) {
                                n8 = (int)(((j30_0)object2).x(function22) ? 1 : 0);
                                n8 = n8 != 0 ? 32 : 16;
                                n4 |= n8;
                            }
                            n8 = n4 & 0x13;
                            n7 = 18;
                            f5 = 2.5E-44f;
                            if (n8 != n7 || (n8 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block16;
                            ((j30_0)object2).D();
                            break block17;
                        }
                        Object object6 = LP1$a.b;
                        n7 = 1065353216;
                        f5 = 1.0f;
                        Object object7 = j.c((LP1)object6, f5);
                        float f6 = b;
                        float f7 = c;
                        float f8 = d;
                        object6 = androidx.compose.foundation.layout.h.i((LP1)object7, f6, 0.0f, f7, f8, 2);
                        Object object8 = zp.c;
                        object7 = Nc$a.m;
                        f6 = 0.0f;
                        Object object9 = null;
                        object8 = oZ.a((zp$l)object8, (Gx$a)object7, (b30_0)object2, 0);
                        int n15 = ((j30_0)object2).P;
                        Object object10 = ((j30_0)object2).P();
                        object6 = a30_0.c((b30_0)object2, (LP1)object6);
                        N20.W.getClass();
                        Xp1$a xp1$a = N20$a.b;
                        mp mp2 = ((j30_0)object2).a;
                        boolean bl2 = mp2 instanceof mp;
                        if (!bl2) break block18;
                        ((j30_0)object2).A();
                        bl2 = ((j30_0)object2).O;
                        if (bl2) {
                            ((j30_0)object2).C(xp1$a);
                        } else {
                            ((j30_0)object2).n();
                        }
                        N20$a$b n20$a$b = N20$a.e;
                        Ow3.a((b30_0)object2, object8, n20$a$b);
                        object8 = N20$a.d;
                        Ow3.a((b30_0)object2, object10, (Function2)object8);
                        object10 = N20$a.f;
                        int n16 = ((j30_0)object2).O;
                        if (n16 != 0 || (n16 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object3 = Integer.valueOf(n15))) == 0) {
                            rk_0.a(n15, (j30_0)object2, n15, (N20$a$a)object10);
                        }
                        object7 = N20$a.c;
                        Ow3.a((b30_0)object2, object6, (Function2)object7);
                        object4 = androidx.compose.foundation.layout.a.a();
                        int n17 = 11;
                        object6 = androidx.compose.foundation.layout.h.i((LP1)object4, 0.0f, 0.0f, f7, 0.0f, n17);
                        object4 = Nc$a.a;
                        object3 = HA.e((Nc)object4, false);
                        int n18 = ((j30_0)object2).P;
                        object9 = ((j30_0)object2).P();
                        object6 = a30_0.c((b30_0)object2, (LP1)object6);
                        n10 = mp2 instanceof mp;
                        if (n10 == 0) break block19;
                        ((j30_0)object2).A();
                        n10 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n10 != 0) {
                            ((j30_0)object2).C(xp1$a);
                        } else {
                            ((j30_0)object2).n();
                        }
                        Ow3.a((b30_0)object2, object3, n20$a$b);
                        Ow3.a((b30_0)object2, object9, (Function2)object8);
                        n10 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object = ((j30_0)object2).v(), object9 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                            rk_0.a(n18, (j30_0)object2, n18, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object2, object6, (Function2)object7);
                        object = n4 & 0xE;
                        u103.invoke(object2, object);
                        n10 = 1;
                        ((j30_0)object2).T(n10 != 0);
                        object6 = Nc$a.o;
                        object9 = new HorizontalAlignElement((Gx$a)object6);
                        n8 = 0;
                        object6 = HA.e((Nc)object4, false);
                        n16 = ((j30_0)object2).P;
                        object3 = ((j30_0)object2).P();
                        object9 = a30_0.c((b30_0)object2, (LP1)object9);
                        boolean bl3 = mp2 instanceof mp;
                        if (!bl3) break block20;
                        ((j30_0)object2).A();
                        bl3 = ((j30_0)object2).O;
                        if (bl3) {
                            ((j30_0)object2).C(xp1$a);
                        } else {
                            ((j30_0)object2).n();
                        }
                        Ow3.a((b30_0)object2, object6, n20$a$b);
                        Ow3.a((b30_0)object2, object3, (Function2)object8);
                        n8 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object2).v(), object8 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                            rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object2, object9, (Function2)object7);
                        n4 = n4 >> 3 & 0xE;
                        object5 = n4;
                        function22.invoke(object2, object5);
                        ((j30_0)object2).T(n10 != 0);
                        ((j30_0)object2).T(n10 != 0);
                    }
                    object = ((j30_0)object2).X();
                    if (object != null) {
                        n4 = n3;
                        ((CF2)object).d = object2 = new S73(u103, function22, n3);
                    }
                    return;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void d(u10 u102, Function2 function2, b30_0 b30_02, int n3) {
        block19: {
            block20: {
                block21: {
                    Object object;
                    int n4;
                    Object object2;
                    Function2 function22;
                    u10 u103;
                    block18: {
                        Integer n7;
                        Object object3;
                        Object object4;
                        int n8;
                        int n10;
                        block17: {
                            int n14;
                            u103 = u102;
                            function22 = function2;
                            n10 = n3;
                            int n15 = -534813202;
                            object2 = b30_02.g(n15);
                            n4 = n3 & 6;
                            if (n4 == 0) {
                                n4 = (int)(((j30_0)object2).x(u102) ? 1 : 0);
                                n4 = n4 != 0 ? 4 : 2;
                                n4 |= n10;
                            } else {
                                n4 = n3;
                            }
                            n8 = n10 & 0x30;
                            if (n8 == 0) {
                                n8 = (int)(((j30_0)object2).x(function22) ? 1 : 0);
                                n8 = n8 != 0 ? 32 : 16;
                                n4 |= n8;
                            }
                            if ((n8 = n4 & 0x13) != (n14 = 18) || (n8 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block17;
                            ((j30_0)object2).D();
                            break block18;
                        }
                        Object object5 = LP1$a.b;
                        Object object6 = null;
                        int n16 = 10;
                        float f5 = b;
                        float f6 = c;
                        boolean bl2 = false;
                        mp mp2 = null;
                        Object object7 = androidx.compose.foundation.layout.h.i((LP1)object5, f5, 0.0f, f6, 0.0f, n16);
                        object5 = ((j30_0)object2).v();
                        if (object5 == (object4 = b30$a.a)) {
                            object5 = new Object();
                            ((j30_0)object2).o(object5);
                        }
                        object5 = (al1_1)object5;
                        int n17 = ((j30_0)object2).P;
                        object6 = ((j30_0)object2).P();
                        object7 = a30_0.c((b30_0)object2, (LP1)object7);
                        N20.W.getClass();
                        Xp1$a xp1$a = N20$a.b;
                        mp2 = ((j30_0)object2).a;
                        n16 = mp2 instanceof mp;
                        if (n16 == 0) break block19;
                        ((j30_0)object2).A();
                        n16 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n16 != 0) {
                            ((j30_0)object2).C(xp1$a);
                        } else {
                            ((j30_0)object2).n();
                        }
                        N20$a$b n20$a$b = N20$a.e;
                        Ow3.a((b30_0)object2, object5, n20$a$b);
                        object5 = N20$a.d;
                        Ow3.a((b30_0)object2, object6, (Function2)object5);
                        object6 = N20$a.f;
                        boolean bl3 = ((j30_0)object2).O;
                        if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object2).v(), n7 = Integer.valueOf(n17)))) {
                            rk_0.a(n17, (j30_0)object2, n17, (N20$a$a)object6);
                        }
                        object4 = N20$a.c;
                        Ow3.a((b30_0)object2, object7, (Function2)object4);
                        object7 = androidx.compose.ui.layout.a.b("text");
                        bl3 = false;
                        float f7 = e;
                        int n18 = 1;
                        object7 = androidx.compose.foundation.layout.h.g((LP1)object7, 0.0f, f7, n18);
                        object3 = Nc$a.a;
                        f7 = 0.0f;
                        n7 = null;
                        Object object8 = HA.e((Nc)object3, false);
                        int n19 = ((j30_0)object2).P;
                        rq2_1 rq2_12 = ((j30_0)object2).P();
                        object7 = a30_0.c((b30_0)object2, (LP1)object7);
                        n10 = mp2 instanceof mp;
                        if (n10 == 0) break block20;
                        ((j30_0)object2).A();
                        n10 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n10 != 0) {
                            ((j30_0)object2).C(xp1$a);
                        } else {
                            ((j30_0)object2).n();
                        }
                        Ow3.a((b30_0)object2, object8, n20$a$b);
                        Ow3.a((b30_0)object2, rq2_12, (Function2)object5);
                        n10 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object = ((j30_0)object2).v(), object8 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                            rk_0.a(n19, (j30_0)object2, n19, (N20$a$a)object6);
                        }
                        Ow3.a((b30_0)object2, object7, (Function2)object4);
                        object = n4 & 0xE;
                        u103.invoke(object2, object);
                        n10 = 1;
                        ((j30_0)object2).T(n10 != 0);
                        object = androidx.compose.ui.layout.a.b("action");
                        n8 = 0;
                        object7 = HA.e((Nc)object3, false);
                        int n20 = ((j30_0)object2).P;
                        object3 = ((j30_0)object2).P();
                        object = a30_0.c((b30_0)object2, (LP1)object);
                        bl2 = mp2 instanceof mp;
                        if (!bl2) break block21;
                        ((j30_0)object2).A();
                        bl2 = ((j30_0)object2).O;
                        if (bl2) {
                            ((j30_0)object2).C(xp1$a);
                        } else {
                            ((j30_0)object2).n();
                        }
                        Ow3.a((b30_0)object2, object7, n20$a$b);
                        Ow3.a((b30_0)object2, object3, (Function2)object5);
                        n8 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object7 = ((j30_0)object2).v(), object5 = Integer.valueOf(n20)) ? 1 : 0)) == 0) {
                            rk_0.a(n20, (j30_0)object2, n20, (N20$a$a)object6);
                        }
                        Ow3.a((b30_0)object2, object, (Function2)object4);
                        object = n4 >> 3 & 0xE;
                        function22.invoke(object2, object);
                        n10 = 1;
                        ((j30_0)object2).T(n10 != 0);
                        ((j30_0)object2).T(n10 != 0);
                    }
                    object = ((j30_0)object2).X();
                    if (object != null) {
                        n4 = n3;
                        ((CF2)object).d = object2 = new U73(u103, function22, n3);
                    }
                    return;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void e(u10 u102, b30_0 object, int n3) {
        block14: {
            block15: {
                Serializable serializable;
                block13: {
                    Object object2;
                    Object object3;
                    int n4;
                    int n7;
                    block12: {
                        object = object.g(917397959);
                        n7 = n3 & 6;
                        n4 = 2;
                        if (n7 == 0) {
                            n7 = (int)(((j30_0)object).x(u102) ? 1 : 0);
                            n7 = n7 != 0 ? 4 : 2;
                            n7 |= n3;
                        } else {
                            n7 = n3;
                        }
                        int n8 = n7 & 3;
                        if (n8 != n4 || (n4 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block12;
                        ((j30_0)object).D();
                        break block13;
                    }
                    Object object4 = e83.a;
                    LP1 lP1 = LP1$a.b;
                    int n10 = ((j30_0)object).P;
                    Object object5 = ((j30_0)object).P();
                    Object object6 = a30_0.c((b30_0)object, lP1);
                    N20.W.getClass();
                    Xp1$a xp1$a = N20$a.b;
                    mp mp2 = ((j30_0)object).a;
                    boolean bl2 = mp2 instanceof mp;
                    if (!bl2) break block14;
                    ((j30_0)object).A();
                    bl2 = ((j30_0)object).O;
                    if (bl2) {
                        ((j30_0)object).C(xp1$a);
                    } else {
                        ((j30_0)object).n();
                    }
                    N20$a$b n20$a$b = N20$a.e;
                    Ow3.a((b30_0)object, object4, n20$a$b);
                    object4 = N20$a.d;
                    Ow3.a((b30_0)object, object5, (Function2)object4);
                    object5 = N20$a.f;
                    int n14 = ((j30_0)object).O;
                    if (n14 != 0 || (n14 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), object2 = Integer.valueOf(n10))) == 0) {
                        rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object5);
                    }
                    N20$a$c n20$a$c = N20$a.c;
                    Ow3.a((b30_0)object, object6, n20$a$c);
                    float f5 = b;
                    float f6 = e;
                    lP1 = androidx.compose.foundation.layout.h.f(lP1, f5, f6);
                    object6 = Nc$a.a;
                    f6 = 0.0f;
                    object3 = null;
                    object6 = HA.e((Nc)object6, false);
                    n14 = ((j30_0)object).P;
                    object2 = ((j30_0)object).P();
                    lP1 = a30_0.c((b30_0)object, lP1);
                    boolean bl3 = mp2 instanceof mp;
                    if (!bl3) break block15;
                    ((j30_0)object).A();
                    bl3 = ((j30_0)object).O;
                    if (bl3) {
                        ((j30_0)object).C(xp1$a);
                    } else {
                        ((j30_0)object).n();
                    }
                    Ow3.a((b30_0)object, object6, n20$a$b);
                    Ow3.a((b30_0)object, object2, (Function2)object4);
                    n4 = (int)(((j30_0)object).O ? 1 : 0);
                    if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object4 = ((j30_0)object).v(), object6 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                        rk_0.a(n14, (j30_0)object, n14, (N20$a$a)object5);
                    }
                    Ow3.a((b30_0)object, lP1, n20$a$c);
                    serializable = Integer.valueOf(n7 & 0xE);
                    u102.invoke(object, serializable);
                    n7 = 1;
                    ((j30_0)object).T(n7 != 0);
                    ((j30_0)object).T(n7 != 0);
                }
                object = ((j30_0)object).X();
                if (object != null) {
                    serializable = new f83_0(u102, n3);
                    ((CF2)object).d = serializable;
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

