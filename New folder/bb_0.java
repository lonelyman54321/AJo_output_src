/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BB
 */
public final class bb_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Boolean bl2, List list, dr0_0 dr0_02, jd_1 jd_12, kd_1 kd_12, ld_1 ld_12, b30_0 b30_02, int n3) {
        boolean bl3;
        Object object;
        Object object2;
        jd_1 jd_13 = jd_12;
        kd_1 kd_13 = kd_12;
        Object object3 = ld_12;
        int n4 = n3;
        Object object4 = null;
        Object object5 = dr0_02;
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(jd_12, "onShareClick");
        Intrinsics.checkNotNullParameter(kd_12, "onBackClick");
        Intrinsics.checkNotNullParameter(ld_12, "onSearchClick");
        int n7 = 716628732;
        Object object6 = b30_02;
        Object object7 = b30_02.g(n7);
        object6 = LP1$a.b;
        int n8 = 1065353216;
        float f5 = 1.0f;
        Object object8 = j.c((LP1)object6, f5);
        long l2 = nz_1.a;
        int n10 = 1064346583;
        float f6 = 0.94f;
        l2 = OX.b(l2, f6);
        Object object9 = fg2_1.a;
        object8 = a.b((LP1)object8, l2, (i13)object9);
        float f7 = uq0_0.k;
        object8 = h.e((LP1)object8, f7);
        Object object10 = zp.c;
        Object object11 = Nc$a.m;
        object10 = oZ.a((zp$l)object10, (Gx$a)object11, (b30_0)object7, 0);
        int n14 = ((j30_0)object7).P;
        object9 = ((j30_0)object7).P();
        object8 = a30_0.c((b30_0)object7, (LP1)object8);
        N20.W.getClass();
        Object object12 = N20$a.b;
        Object object13 = ((j30_0)object7).a;
        int n15 = object13 instanceof mp;
        float f8 = f7;
        if (n15 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        n15 = ((j30_0)object7).O;
        if (n15 != 0) {
            ((j30_0)object7).C((Function0)object12);
        } else {
            ((j30_0)object7).n();
        }
        object4 = N20$a.e;
        Ow3.a((b30_0)object7, object10, (Function2)object4);
        object10 = N20$a.d;
        Ow3.a((b30_0)object7, object9, (Function2)object10);
        object9 = N20$a.f;
        int n16 = ((j30_0)object7).O;
        if (n16 != 0 || (n16 = Intrinsics.areEqual(object2 = ((j30_0)object7).v(), object = Integer.valueOf(n14))) == 0) {
            rk_0.a(n14, (j30_0)object7, n14, (N20$a$a)object9);
        }
        object = N20$a.c;
        Ow3.a((b30_0)object7, object8, (Function2)object);
        int n17 = 1065353216;
        float f11 = 1.0f;
        object11 = j.c((LP1)object6, f11);
        object8 = zp.a;
        object2 = Nc$a.j;
        float f12 = 0.0f;
        object5 = null;
        object8 = iQ2.a((zp$e)object8, (Gx$b)object2, (b30_0)object7, 0);
        int n18 = ((j30_0)object7).P;
        object2 = ((j30_0)object7).P();
        object11 = a30_0.c((b30_0)object7, (LP1)object11);
        boolean bl4 = object13 instanceof mp;
        if (!bl4) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        boolean bl5 = ((j30_0)object7).O;
        if (bl5) {
            ((j30_0)object7).C((Function0)object12);
        } else {
            ((j30_0)object7).n();
        }
        Ow3.a((b30_0)object7, object8, (Function2)object4);
        Ow3.a((b30_0)object7, object2, (Function2)object10);
        boolean bl6 = ((j30_0)object7).O;
        if (bl6 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object7).v(), object8 = Integer.valueOf(n18)))) {
            rk_0.a(n18, (j30_0)object7, n18, (N20$a$a)object9);
        }
        Ow3.a((b30_0)object7, object11, (Function2)object);
        object5 = mq2_0.a;
        int n19 = R$drawable.back_arrow_fleek;
        f11 = 0.0f;
        object3 = km2.a(n19, (b30_0)object7, 0);
        n17 = R$string.acc_back_icon;
        object11 = hv3_0.K(n17);
        object2 = Nc$a.k;
        object8 = ((mq2_0)object5).b((LP1)object6, (Gx$b)object2);
        Object object14 = object2;
        Xp1$a xp1$a = object12;
        object8 = ((mq2_0)object5).a((LP1)object8, 1.0f, true);
        ((j30_0)object7).K(-418435247);
        int n20 = 0xE000 & n4 ^ 0x6000;
        n16 = 16384;
        f7 = 2.2959E-41f;
        if (n20 > n16 && (n20 = (int)(((j30_0)object7).J(kd_13) ? 1 : 0)) != 0 || (n20 = n4 & 0x6000) == n16) {
            n20 = 1;
        } else {
            n20 = 0;
            object12 = null;
        }
        object2 = ((j30_0)object7).v();
        Object object15 = object13;
        object13 = b30$a.a;
        if (n20 != 0 || object2 == object13) {
            n20 = 2;
            object2 = new sd2_2(kd_13, n20);
            ((j30_0)object7).o(object2);
        }
        object2 = (Function0)object2;
        ((j30_0)object7).T(false);
        object12 = x20_0.d((LP1)object8, (Function0)object2);
        int n21 = 0;
        int n22 = 0;
        int n24 = 8;
        int n25 = 120;
        object8 = object3;
        object3 = object10;
        object10 = object11;
        object11 = object12;
        object12 = object9;
        n10 = 0;
        object9 = null;
        f6 = 0.0f;
        Object object16 = object13;
        mp mp2 = object15;
        object13 = null;
        Object object17 = object12;
        Xp1$a xp1$a2 = xp1$a;
        n20 = 0;
        object12 = null;
        float f14 = f8;
        Object object18 = object14;
        n16 = 0;
        object2 = null;
        f7 = 0.0f;
        Serializable serializable = object;
        object = object7;
        int n26 = n24;
        int n27 = n25;
        Pd1.a((im2)object8, (String)object10, (LP1)object11, null, null, 0.0f, null, (b30_0)object7, n24, n25);
        dr0_02.getClass();
        object8 = dr0_0.r(dr0_0.q(list));
        String string2 = "";
        object10 = object8 == null ? string2 : object8;
        f6 = uq0_0.w;
        long l3 = 0L;
        long l4 = 0L;
        n17 = 0;
        f11 = 0.0f;
        n14 = 0;
        object11 = null;
        object13 = "Brand Image";
        n20 = 0;
        object12 = null;
        long l7 = 0L;
        n26 = 0;
        Object object19 = null;
        n21 = 27648;
        n22 = 997;
        object15 = object7;
        ov3.e(null, (String)object10, false, f6, (String)object13, false, l7, 0.0f, l3, l4, (b30_0)object7, n21, n22);
        object8 = dr0_0.y(dr0_0.q(list));
        object = object8 == null ? string2 : object8;
        float f15 = uq0_0.h;
        f6 = 0.0f;
        n14 = 0;
        object8 = object6;
        object8 = h.i((LP1)object6, f15, 0.0f, 0.0f, 0.0f, 14);
        object13 = object18;
        object8 = ((mq2_0)object5).b((LP1)object8, (Gx$b)object18);
        n20 = 1;
        object10 = ((mq2_0)object5).a((LP1)object8, 8.0f, n20 != 0);
        long l8 = oj3_2.c;
        object19 = tv0_0.h;
        Object object20 = y20_0.a;
        long l12 = OX.f;
        int n28 = 1772928;
        n16 = 0;
        f7 = 0.0f;
        object2 = null;
        l3 = 0L;
        xp1$a = null;
        long l14 = 0L;
        n22 = 0;
        string2 = null;
        n24 = 0;
        n25 = 0;
        int n29 = 130960;
        object8 = object;
        object = object18;
        object = object19;
        object19 = object20;
        object20 = object7;
        Ll3.b((String)object8, (LP1)object10, l12, l8, null, (tv0_0)object, (RU0)object19, l3, null, null, l14, 0, false, 0, 0, null, null, (b30_0)object7, n28, 0, n29);
        object8 = object18;
        object8 = ((mq2_0)object5).b((LP1)object6, (Gx$b)object18);
        boolean bl7 = true;
        f5 = Float.MIN_VALUE;
        object5 = ((mq2_0)object5).a((LP1)object8, 2.0f, bl7);
        object8 = Nc$a.f;
        f15 = 0.0f;
        object10 = null;
        object8 = HA.e((Nc)object8, false);
        int n30 = ((j30_0)object7).P;
        object11 = ((j30_0)object7).P();
        object5 = a30_0.c((b30_0)object7, (LP1)object5);
        object9 = mp2;
        n10 = mp2 instanceof mp;
        if (n10 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        n10 = (int)(((j30_0)object7).O ? 1 : 0);
        if (n10 != 0) {
            object9 = xp1$a2;
            ((j30_0)object7).C(xp1$a2);
        } else {
            ((j30_0)object7).n();
        }
        Ow3.a((b30_0)object7, object8, (Function2)object4);
        Ow3.a((b30_0)object7, object11, (Function2)object3);
        n15 = ((j30_0)object7).O;
        if (n15 != 0 || (n15 = Intrinsics.areEqual(object4 = ((j30_0)object7).v(), object3 = Integer.valueOf(n30))) == 0) {
            object4 = object17;
            rk_0.a(n30, (j30_0)object7, n30, (N20$a$a)object17);
        }
        object4 = serializable;
        Ow3.a((b30_0)object7, object5, (Function2)((Object)serializable));
        n15 = R$drawable.ic_share_fleek;
        n18 = 0;
        object5 = null;
        object4 = km2.a(n15, (b30_0)object7, 0);
        f12 = uq0_0.e;
        n14 = 0;
        object11 = null;
        object13 = null;
        object10 = null;
        n20 = 11;
        object8 = object6;
        f6 = f12;
        object3 = h.i((LP1)object6, 0.0f, 0.0f, f12, 0.0f, n20);
        f11 = -4.4787936E20f;
        ((j30_0)object7).K(-507364199);
        n17 = n4 & 0x1C00 ^ 0xC00;
        n30 = 2048;
        f15 = 2.87E-42f;
        if (n17 > n30 && (n17 = (int)(((j30_0)object7).J(jd_13) ? 1 : 0)) != 0 || (n17 = n4 & 0xC00) == n30) {
            n17 = 1;
            f11 = Float.MIN_VALUE;
        } else {
            n17 = 0;
            f11 = 0.0f;
            object8 = null;
        }
        object10 = ((j30_0)object7).v();
        object2 = object16;
        if (n17 == 0 && object10 != object16) {
            n17 = 0;
            f11 = 0.0f;
            object8 = null;
        } else {
            n17 = 0;
            f11 = 0.0f;
            object8 = null;
            object10 = new yb_1(jd_13, 0);
            ((j30_0)object7).o(object10);
        }
        object10 = (Function0)object10;
        ((j30_0)object7).T(false);
        object11 = x20_0.d((LP1)object3, (Function0)object10);
        n20 = 0;
        object12 = null;
        object3 = null;
        object10 = "share button";
        n10 = 0;
        f6 = 0.0f;
        object9 = null;
        object13 = null;
        n26 = 56;
        n27 = 120;
        object8 = object4;
        object4 = object2;
        n16 = 0;
        object2 = null;
        f7 = 0.0f;
        boolean bl8 = true;
        object = object7;
        Pd1.a((im2)object8, (String)object10, (LP1)object11, null, null, 0.0f, null, (b30_0)object7, n26, n27);
        ((j30_0)object7).T(bl8);
        ((j30_0)object7).T(bl8);
        f11 = 4.579095E16f;
        ((j30_0)object7).K(1528999584);
        object8 = Boolean.TRUE;
        object = bl2;
        n17 = (int)(Intrinsics.areEqual(bl2, object8) ? 1 : 0);
        if (n17 != 0) {
            object10 = j.c((LP1)object6, 1.0f);
            object13 = null;
            n20 = 0;
            object12 = null;
            object11 = null;
            n16 = 13;
            f7 = 1.8E-44f;
            f6 = f14;
            object6 = h.i((LP1)object10, 0.0f, f14, 0.0f, 0.0f, n16);
            f11 = uq0_0.x;
            object6 = j.d((LP1)object6, f11);
            ((j30_0)object7).K(1529006104);
            f11 = 6.42848E-40f;
            n17 = 0x70000 & n4;
            n30 = 196608;
            f15 = 2.75506E-40f;
            n14 = 131072;
            object2 = ld_12;
            if ((n17 ^= n30) > n14 && (n17 = (int)(((j30_0)object7).J(ld_12) ? 1 : 0)) != 0 || (n17 = n4 & n30) == n14) {
                n17 = 1;
                f11 = Float.MIN_VALUE;
            } else {
                n17 = 0;
                f11 = 0.0f;
                object8 = null;
            }
            object10 = ((j30_0)object7).v();
            if (n17 == 0 && object10 != object4) {
                n15 = 0;
                object4 = null;
            } else {
                n15 = 0;
                object4 = null;
                object10 = new zb_1(object2, 0);
                ((j30_0)object7).o(object10);
            }
            object10 = (Function0)object10;
            ((j30_0)object7).T(false);
            n17 = 7;
            f11 = 9.8E-45f;
            n14 = 0;
            object11 = null;
            object8 = d.b((LP1)object6, false, null, (Function0)object10, n17);
            object4 = dr0_0.y(dr0_0.q(list));
            object6 = "Search in ";
            object10 = kp1_0.c((String)object6, (String)object4);
            long l15 = oj3_2.b;
            long l16 = 0L;
            n20 = 0;
            object12 = null;
            n15 = 3456;
            l7 = 0L;
            object14 = object7;
            ov3.t((LP1)object8, (String)object10, f12, l15, 0.0f, l7, l16, (b30_0)object7, n15);
        }
        n15 = 0;
        object4 = null;
        object8 = fn0_2.a((j30_0)object7, false, bl8);
        if (object8 == null) return;
        object4 = object10;
        object7 = bl2;
        object6 = list;
        object5 = dr0_02;
        jd_13 = jd_12;
        kd_13 = kd_12;
        object3 = ld_12;
        n4 = n3;
        ((CF2)object8).d = object10 = new ab_0(bl2, list, dr0_02, jd_12, kd_12, ld_12, n3);
    }
}

