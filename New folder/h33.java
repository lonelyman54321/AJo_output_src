/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class h33 {
    public static final void a(LP1 lP1, b30_0 object, int n3) {
        Object object2 = "modifier";
        Intrinsics.checkNotNullParameter(lP1, (String)object2);
        object = object.g(-1689294806);
        int n4 = n3 & 0xE;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n8 = n4 & 0xB;
        if (n8 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Gx$b gx$b = Nc$a.k;
            zp$i zp$i = zp.g(8);
            f33 f332 = new Object();
            n7 = 0x6036000;
            int n10 = (n4 &= 0xE) | n7;
            n8 = 0;
            int n14 = 206;
            xq1_0.b(lP1, null, null, false, zp$i, gx$b, null, false, f332, (b30_0)object, n10, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new g33(lP1, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(b30_0 b30_02, int n3) {
        Object object;
        int n4;
        int n7 = n3;
        int n8 = -2026903953;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n8);
        if (n3 == 0 && (n4 = ((j30_0)object3).h()) != 0) {
            ((j30_0)object3).D();
        } else {
            boolean bl2;
            Integer n10;
            LP1$a lP1$a = LP1$a.b;
            float f5 = 1.0f;
            object2 = j.c(lP1$a, f5);
            int n14 = 16;
            float f6 = 2.2E-44f;
            float f7 = n14;
            object2 = h.e((LP1)object2, f7);
            zp$j zp$j = zp.a;
            Object object4 = Nc$a.j;
            int n15 = 0;
            float f8 = 0.0f;
            Object object5 = null;
            Object object6 = iQ2.a(zp$j, (Gx$b)object4, (b30_0)object3, 0);
            int n16 = ((j30_0)object3).P;
            Object object7 = ((j30_0)object3).P();
            object2 = a30_0.c((b30_0)object3, (LP1)object2);
            Object object8 = N20.W;
            object8.getClass();
            Object object9 = N20$a.b;
            Object object10 = ((j30_0)object3).a;
            int n17 = object10 instanceof mp;
            if (n17 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            n17 = ((j30_0)object3).O;
            if (n17 != 0) {
                ((j30_0)object3).C((Function0)object9);
            } else {
                ((j30_0)object3).n();
            }
            Object object11 = N20$a.e;
            Ow3.a((b30_0)object3, object6, (Function2)object11);
            object8 = N20$a.d;
            Ow3.a((b30_0)object3, object7, (Function2)object8);
            object7 = N20$a.f;
            n14 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object3).v(), n10 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, (j30_0)object3, n16, (N20$a$a)object7);
            }
            N20$a$c n20$a$c = N20$a.c;
            Ow3.a((b30_0)object3, object2, n20$a$c);
            n4 = 2;
            float f11 = n4;
            object2 = SP2.a(f11);
            object2 = QV.a(lP1$a, (i13)object2);
            f6 = 26;
            object2 = j.k((LP1)object2, f6);
            n14 = 17;
            f6 = n14;
            object2 = dz3_0.a(j.d((LP1)object2, f6));
            object6 = HA.e(Nc$a.a, false);
            n16 = ((j30_0)object3).P;
            object5 = ((j30_0)object3).P();
            object2 = a30_0.c((b30_0)object3, (LP1)object2);
            Gx$b gx$b = object4;
            int n18 = object10 instanceof mp;
            if (n18 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            n18 = ((j30_0)object3).O;
            if (n18 != 0) {
                ((j30_0)object3).C((Function0)object9);
            } else {
                ((j30_0)object3).n();
            }
            Ow3.a((b30_0)object3, object6, (Function2)object11);
            Ow3.a((b30_0)object3, object5, (Function2)object8);
            n14 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object3).v(), object5 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, (j30_0)object3, n16, (N20$a$a)object7);
            }
            Ow3.a((b30_0)object3, object2, n20$a$c);
            object2 = d.a;
            n14 = R$drawable.ic_star_white_8;
            object5 = null;
            object6 = km2.a(n14, (b30_0)object3, 0);
            Object object12 = Nc$a.i;
            Object object13 = ((d)object2).a(lP1$a, (Nc)object12);
            f11 = 3;
            int n19 = 3;
            float f12 = f11;
            float f14 = f11;
            object12 = h.i((LP1)object13, 0.0f, 0.0f, f11, f11, n19);
            object13 = "Reviews Star";
            float f15 = 0.0f;
            int n20 = 56;
            f12 = 7.8E-44f;
            int n21 = 120;
            f14 = 1.68E-43f;
            object2 = object6;
            object6 = object13;
            Object object14 = object7;
            int n22 = 0;
            float f16 = 0.0f;
            Object object15 = object8;
            object8 = null;
            N20$a$b n20$a$b = object11;
            boolean bl3 = false;
            object11 = null;
            object4 = object10;
            object10 = null;
            Xp1$a xp1$a = object9;
            object9 = object3;
            n15 = n20;
            f8 = f12;
            object = object4;
            n18 = n21;
            float f17 = f14;
            Pd1.a((im2)object2, (String)object13, (LP1)object12, null, null, 0.0f, null, (b30_0)object3, n20, n21);
            n15 = 1;
            f8 = Float.MIN_VALUE;
            ((j30_0)object3).T(n15 != 0);
            n4 = 12;
            f11 = 1.7E-44f;
            f17 = n4;
            object2 = h.e(lP1$a, f17);
            Q93.b((b30_0)object3, (LP1)object2);
            object2 = zp.c;
            object6 = Nc$a.m;
            int n24 = 0;
            float f18 = 0.0f;
            object9 = null;
            object2 = oZ.a((zp$l)object2, (Gx$a)object6, (b30_0)object3, 0);
            n14 = ((j30_0)object3).P;
            object12 = ((j30_0)object3).P();
            object7 = a30_0.c((b30_0)object3, lP1$a);
            n17 = object4 instanceof mp;
            if (n17 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            n17 = ((j30_0)object3).O;
            if (n17 != 0) {
                object10 = xp1$a;
                ((j30_0)object3).C(xp1$a);
            } else {
                object10 = xp1$a;
                ((j30_0)object3).n();
            }
            object11 = n20$a$b;
            Ow3.a((b30_0)object3, object2, n20$a$b);
            object8 = object15;
            Ow3.a((b30_0)object3, object12, (Function2)object15);
            n4 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object2 = ((j30_0)object3).v(), object12 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                object12 = object14;
                rk_0.a(n14, (j30_0)object3, n14, (N20$a$a)object14);
            } else {
                object12 = object14;
            }
            Ow3.a((b30_0)object3, object7, n20$a$c);
            object2 = j.c(lP1$a, 0.7f);
            n14 = 15;
            f16 = n14;
            HA.a(dz3_0.a(j.d((LP1)object2, f16)), (b30_0)object3, 0);
            f6 = 4;
            object2 = h.e(lP1$a, f6);
            Q93.b((b30_0)object3, (LP1)object2);
            HA.a(dz3_0.a(j.d(j.c(lP1$a, 0.5f), f16)), (b30_0)object3, 0);
            n4 = 8;
            f11 = n4;
            object5 = h.e(lP1$a, f11);
            Q93.b((b30_0)object3, (LP1)object5);
            object9 = j.c(lP1$a, 1.0f);
            n15 = 6;
            f8 = 8.4E-45f;
            h33.a((LP1)object9, (b30_0)object3, n15);
            object9 = h.e(lP1$a, f11);
            Q93.b((b30_0)object3, (LP1)object9);
            f18 = 1.0f;
            object5 = j.c(lP1$a, f18);
            object9 = Nc$a.k;
            float f19 = f6;
            object6 = zp.g(f11);
            f15 = f16;
            f16 = 7.6E-44f;
            object6 = iQ2.a((zp$e)object6, (Gx$b)object9, (b30_0)object3, 54);
            n22 = ((j30_0)object3).P;
            f12 = f11;
            object2 = ((j30_0)object3).P();
            object5 = a30_0.c((b30_0)object3, (LP1)object5);
            Object object16 = object9;
            n24 = object instanceof mp;
            if (n24 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            n24 = ((j30_0)object3).O;
            if (n24 != 0) {
                ((j30_0)object3).C((Function0)object10);
            } else {
                ((j30_0)object3).n();
            }
            Ow3.a((b30_0)object3, object6, (Function2)object11);
            Ow3.a((b30_0)object3, object2, (Function2)object8);
            n4 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object2 = ((j30_0)object3).v(), object6 = Integer.valueOf(n22)) ? 1 : 0)) == 0) {
                rk_0.a(n22, (j30_0)object3, n22, (N20$a$a)object12);
            }
            Ow3.a((b30_0)object3, object5, n20$a$c);
            f11 = 56;
            object2 = j.k(lP1$a, f11);
            f8 = 11;
            object2 = dz3_0.a(j.d((LP1)object2, f8));
            object9 = null;
            HA.a((LP1)object2, (b30_0)object3, 0);
            f6 = 1.0f;
            object2 = j.k(lP1$a, f6);
            f6 = 10;
            object2 = dz3_0.a(j.d((LP1)object2, f6));
            f16 = 0.0f;
            long l2 = 0L;
            n20$a$b = null;
            int n25 = 14;
            float f20 = 2.0E-44f;
            f6 = f12;
            Object object17 = object12;
            float f22 = f19;
            float f23 = f15;
            Object object18 = object8;
            N20$a$b n20$a$b2 = object11;
            object11 = object3;
            Object object19 = object10;
            object10 = null;
            object14 = zp$j;
            Object object20 = object16;
            zp$j = null;
            n24 = n25;
            f18 = f20;
            Rr0.a((LP1)object2, l2, 0.0f, 0.0f, (b30_0)object3, 0, n25);
            object2 = j.d(j.k(lP1$a, f17), f17);
            object6 = SP2.a;
            HA.a(dz3_0.a(QV.a((LP1)object2, (i13)object6)), (b30_0)object3, 0);
            f11 = 82;
            HA.a(dz3_0.a(j.d(j.k(lP1$a, f11), f8)), (b30_0)object3, 0);
            ((j30_0)object3).T(true);
            n4 = 92;
            f11 = n4;
            object13 = j.d(j.k(lP1$a, f11), f7);
            n20 = 0;
            n21 = 0;
            object16 = null;
            object2 = dz3_0.a(h.i((LP1)object13, 0.0f, f19, 0.0f, 0.0f, 13));
            HA.a((LP1)object2, (b30_0)object3, 0);
            f11 = f12;
            object6 = h.e(lP1$a, f12);
            Q93.b((b30_0)object3, (LP1)object6);
            n14 = 1065353216;
            f6 = 1.0f;
            object13 = j.c(lP1$a, f6);
            f15 = 0.0f;
            n19 = 3;
            f12 = f19;
            f14 = f19;
            object6 = h.i((LP1)object13, 0.0f, 0.0f, f19, f19, n19);
            object12 = zp.f;
            object7 = object20;
            n17 = 54;
            object12 = iQ2.a((zp$e)object12, (Gx$b)object20, (b30_0)object3, n17);
            n22 = ((j30_0)object3).P;
            object8 = ((j30_0)object3).P();
            object6 = a30_0.c((b30_0)object3, (LP1)object6);
            bl3 = object instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            bl3 = ((j30_0)object3).O;
            if (bl3) {
                object11 = object19;
                ((j30_0)object3).C((Function0)object19);
            } else {
                object11 = object19;
                ((j30_0)object3).n();
            }
            object10 = n20$a$b2;
            Ow3.a((b30_0)object3, object12, n20$a$b2);
            object12 = object18;
            Ow3.a((b30_0)object3, object8, (Function2)object18);
            n17 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object8 = ((j30_0)object3).v(), object9 = Integer.valueOf(n22)) ? 1 : 0)) == 0) {
                object8 = object17;
                rk_0.a(n22, (j30_0)object3, n22, (N20$a$a)object17);
            } else {
                object8 = object17;
            }
            Ow3.a((b30_0)object3, object6, n20$a$c);
            object7 = gx$b;
            object6 = object14;
            object6 = iQ2.a((zp$e)object14, gx$b, (b30_0)object3, 0);
            n22 = ((j30_0)object3).P;
            object9 = ((j30_0)object3).P();
            object5 = a30_0.c((b30_0)object3, lP1$a);
            boolean bl4 = object instanceof mp;
            if (!bl4) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            boolean bl5 = ((j30_0)object3).O;
            if (bl5) {
                ((j30_0)object3).C((Function0)object11);
            } else {
                ((j30_0)object3).n();
            }
            Ow3.a((b30_0)object3, object6, (Function2)object10);
            Ow3.a((b30_0)object3, object9, (Function2)object12);
            boolean bl6 = ((j30_0)object3).O;
            if (bl6 || !(bl2 = Intrinsics.areEqual(object = ((j30_0)object3).v(), object6 = Integer.valueOf(n22)))) {
                rk_0.a(n22, (j30_0)object3, n22, (N20$a$a)object8);
            }
            Ow3.a((b30_0)object3, object5, n20$a$c);
            float f24 = f23;
            object = j.k(lP1$a, f23);
            f6 = 14;
            HA.a(dz3_0.a(j.d((LP1)object, f6)), (b30_0)object3, 0);
            f24 = f22;
            object = h.e(lP1$a, f22);
            Q93.b((b30_0)object3, (LP1)object);
            f24 = 111;
            HA.a(dz3_0.a(j.d(j.k(lP1$a, f24), f6)), (b30_0)object3, 0);
            ((j30_0)object3).T(true);
            f24 = 127;
            object = j.k(lP1$a, f24);
            n14 = 32;
            f6 = n14;
            object = j.d((LP1)object, f6);
            object2 = SP2.a(f11);
            object = dz3_0.a(QV.a((LP1)object, (i13)object2));
            HA.a((LP1)object, (b30_0)object3, 0);
            boolean bl7 = true;
            f24 = Float.MIN_VALUE;
            ((j30_0)object3).T(bl7);
            ((j30_0)object3).T(bl7);
            ((j30_0)object3).T(bl7);
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            n4 = n3;
            ((CF2)object).d = object3 = new e33(n3);
        }
    }
}

