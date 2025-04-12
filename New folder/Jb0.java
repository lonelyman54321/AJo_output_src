/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Jb0 {
    public static final void a(ob0_1 ob0_12, p83_0 p83_02, b30_0 b30_02, int n3) {
        ob0_1 ob0_13 = ob0_12;
        p83_0 p83_03 = p83_02;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(p83_02, "unlockedCouponsList");
        int n7 = -1155163408;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = LP1$a.b;
        LP1 lP1 = j.c((LP1)object, 1.0f);
        long l2 = OX.f;
        fG2$a fG2$a = fg2_1.a;
        Object object3 = a.b(lP1, l2, fG2$a);
        int n8 = 8;
        float f5 = n8;
        boolean bl2 = false;
        int n10 = 7;
        Object object4 = h.i((LP1)object3, 0.0f, 0.0f, 0.0f, f5, n10);
        Object object5 = Nc$a.a;
        int n14 = 0;
        fG2$a = null;
        object5 = HA.e((Nc)object5, false);
        int n15 = ((j30_0)object2).P;
        Object object6 = ((j30_0)object2).P();
        object4 = a30_0.c((b30_0)object2, (LP1)object4);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            Object object7;
            Object object8;
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C(xp1$a);
            } else {
                ((j30_0)object2).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object2, object5, n20$a$b);
            object5 = N20$a.d;
            Ow3.a((b30_0)object2, object6, (Function2)object5);
            object6 = N20$a.f;
            boolean bl4 = ((j30_0)object2).O;
            if (bl4 || (n10 = (int)(Intrinsics.areEqual(object8 = ((j30_0)object2).v(), object7 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
                rk_0.a(n15, (j30_0)object2, n15, (N20$a$a)object6);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object2, object4, (Function2)object3);
            object4 = zp.c;
            object7 = Nc$a.m;
            object4 = oZ.a((zp$l)object4, (Gx$a)object7, (b30_0)object2, 0);
            n14 = ((j30_0)object2).P;
            object7 = ((j30_0)object2).P();
            object = a30_0.c((b30_0)object2, (LP1)object);
            bl2 = mp2 instanceof mp;
            if (bl2) {
                ((j30_0)object2).A();
                bl2 = ((j30_0)object2).O;
                if (bl2) {
                    ((j30_0)object2).C(xp1$a);
                } else {
                    ((j30_0)object2).n();
                }
                Ow3.a((b30_0)object2, object4, n20$a$b);
                Ow3.a((b30_0)object2, object7, (Function2)object5);
                boolean bl5 = ((j30_0)object2).O;
                if (bl5 || !(bl5 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object5 = Integer.valueOf(n14)))) {
                    rk_0.a(n14, (j30_0)object2, n14, (N20$a$a)object6);
                }
                Ow3.a((b30_0)object2, object, (Function2)object3);
                Jb0.d(ob0_13, (b30_0)object2, n8);
                int bl6 = n4 & 0x70 | n8;
                Jb0.e(ob0_13, p83_03, (b30_0)object2, bl6);
                boolean bl7 = true;
                object2 = fn0_2.a((j30_0)object2, bl7, bl7);
                if (object2 != null) {
                    ((CF2)object2).d = object = new xb0_1(ob0_13, p83_03, n4);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void b(ob0_1 ob0_12, ICoupon iCoupon, Jb0$b jb0$b, b30_0 object, int n3) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Object object2 = "coupon";
        Intrinsics.checkNotNullParameter(iCoupon, (String)object2);
        Intrinsics.checkNotNullParameter(jb0$b, "onCopyClicked");
        object = object.g(1882306866);
        LP1 lP1 = LP1$a.b;
        double d2 = 7.5;
        float f5 = (float)d2;
        lP1 = h.e(lP1, f5);
        f5 = 220;
        lP1 = j.d(lP1, f5);
        f5 = 0.8f;
        Object object3 = c.a(lP1, f5);
        float f6 = 2;
        Object object4 = SP2.a(20);
        long l2 = 0L;
        long l3 = 0L;
        int n4 = 28;
        lP1 = c13_0.c((LP1)object3, f6, (i13)object4, l2, l3, n4);
        long l4 = OX.f;
        fG2$a fG2$a = fg2_1.a;
        LP1 lP12 = a.b(lP1, l4, fG2$a);
        ob0_12.getClass();
        Intrinsics.checkNotNullParameter(iCoupon, (String)object2);
        object2 = iCoupon.getStatus();
        int n7 = 0;
        lP1 = null;
        if (object2 != null) {
            boolean bl4;
            object2 = iCoupon.getStatus();
            Intrinsics.checkNotNull(object2);
            object3 = "REDEEMED";
            bl3 = true;
            f6 = Float.MIN_VALUE;
            bl2 = b.i((String)object2, (String)object3, bl3);
            if (bl2 || (bl4 = b.i((String)object2, (String)(object3 = "EXPIRED"), bl3))) {
                n7 = 1;
            }
        }
        object2 = new eb0_0(n7 != 0, iCoupon, jb0$b, ob0_12);
        n7 = 1921206684;
        object4 = v10.c(n7, (fx0_2)object2, (b30_0)object);
        bl2 = false;
        object3 = null;
        bl3 = false;
        f6 = 0.0f;
        fG2$a = null;
        int n8 = 3072;
        int n10 = 6;
        OA.a(lP12, null, false, (u10)object4, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new cb0_1(ob0_12, iCoupon, jb0$b, n3);
        }
    }

    public static final void c(ICoupon iCoupon, boolean bl2, Jb0$b jb0$b, b30_0 object, int n3) {
        Object object2;
        float f5;
        int n4;
        long l2;
        Intrinsics.checkNotNullParameter(iCoupon, "coupon");
        Intrinsics.checkNotNullParameter(jb0$b, "onCheckBoxPressed");
        int n7 = -72096124;
        object = object.g(n7);
        Object object3 = LP1$a.b;
        float f6 = 1.0f;
        LP1 lP1 = j.c((LP1)object3, f6);
        float f7 = 8;
        lP1 = h.e(lP1, f7);
        int n8 = 25;
        f7 = n8;
        lP1 = j.d(lP1, f7);
        if (bl2) {
            l2 = xx_1.m;
            n4 = 0x3F000000;
            f5 = 0.5f;
            l2 = OX.b(l2, f5);
        } else {
            l2 = xx_1.m;
        }
        Object object4 = SP2.a(6);
        lP1 = a.b(lP1, l2, (i13)object4);
        f7 = -6.6384637E19f;
        ((j30_0)object).K(-530165401);
        n8 = n3 & 0x380 ^ 0x180;
        boolean bl3 = true;
        int n10 = 0;
        Object object5 = null;
        n4 = 256;
        f5 = 3.59E-43f;
        if (n8 > n4 && (n8 = (int)(((j30_0)object).J(jb0$b) ? 1 : 0)) != 0 || (n8 = n3 & 0x180) == n4) {
            n8 = 1;
            f7 = Float.MIN_VALUE;
        } else {
            n8 = 0;
            f7 = 0.0f;
            object2 = null;
        }
        object4 = ((j30_0)object).v();
        if (n8 != 0 || object4 == (object2 = b30$a.a)) {
            n8 = 1;
            f7 = Float.MIN_VALUE;
            object4 = new ya_1(jb0$b, n8);
            ((j30_0)object).o(object4);
        }
        object4 = (Function0)object4;
        ((j30_0)object).T(false);
        n8 = 7;
        f7 = 9.8E-45f;
        boolean bl4 = false;
        Object object6 = null;
        lP1 = d.b(lP1, false, null, (Function0)object4, n8);
        object2 = Nc$a.k;
        object5 = zp.d;
        n4 = 54;
        f5 = 7.6E-44f;
        object2 = iQ2.a((zp$e)object5, (Gx$b)object2, (b30_0)object, n4);
        n10 = ((j30_0)object).P;
        object4 = ((j30_0)object).P();
        lP1 = a30_0.c((b30_0)object, lP1);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object).a;
        int n14 = mp2 instanceof mp;
        if (n14 != 0) {
            ((j30_0)object).A();
            bl4 = ((j30_0)object).O;
            if (bl4) {
                ((j30_0)object).C(xp1$a);
            } else {
                ((j30_0)object).n();
            }
            object6 = N20$a.e;
            Ow3.a((b30_0)object, object2, (Function2)object6);
            object2 = N20$a.d;
            Ow3.a((b30_0)object, object4, (Function2)object2);
            object2 = N20$a.f;
            n4 = (int)(((j30_0)object).O ? 1 : 0);
            if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object4 = ((j30_0)object).v(), object6 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object2);
            }
            object2 = N20$a.c;
            Ow3.a((b30_0)object, lP1, (Function2)object2);
            mq2_0 mq2_02 = mq2_0.a;
            object2 = Nc$a.d;
            lP1 = mq2_02.a((LP1)object3, 0.65f, bl3);
            object5 = new gb0_2(iCoupon, jb0$b, bl2);
            n4 = -1588285634;
            f5 = -7.2060325E-19f;
            object4 = v10.c(n4, (fx0_2)object5, (b30_0)object);
            object6 = object;
            OA.a(lP1, (Nc)object2, false, (u10)object4, (b30_0)object, 3120, 4);
            object3 = j.c((LP1)object3, f6);
            float f8 = 0.35f;
            lP1 = mq2_02.a((LP1)object3, f8, bl3);
            object2 = Nc$a.f;
            object3 = new Ib0(bl2, jb0$b);
            object4 = v10.c(1749882229, (fx0_2)object3, (b30_0)object);
            n14 = 4;
            n10 = 0;
            object5 = null;
            int n15 = 3120;
            OA.a(lP1, (Nc)object2, false, (u10)object4, (b30_0)object, n15, n14);
            ((j30_0)object).T(bl3);
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object3 = new wb0_1(iCoupon, bl2, jb0$b, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void d(ob0_1 ob0_12, b30_0 b30_02, int n3) {
        ob0_1 ob0_13 = ob0_12;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int bl2 = -1109196837;
        Object object = b30_02;
        Object object2 = b30_02.g(bl2);
        object = ((j30_0)object2).v();
        Object object3 = b30$a.a;
        if (object == object3) {
            object = Qx2.a(ly0_0.f(f.a, (b30_0)object2), (j30_0)object2);
        }
        Object object4 = ((Q30)object).a;
        object = AndroidCompositionLocals_androidKt.b;
        object = ((j30_0)object2).j((H30)object);
        int n4 = object instanceof Activity;
        boolean bl3 = false;
        Object object5 = null;
        Object object6 = n4 != 0 ? (object = (Activity)object) : null;
        Object object7 = LP1$a.b;
        int n7 = 8;
        float f5 = n7;
        object3 = h.e((LP1)object7, f5);
        int n8 = 1065353216;
        float f6 = 1.0f;
        object3 = j.c((LP1)object3, f6);
        Object object8 = Nc$a.k;
        Object object9 = zp.a;
        int n10 = 48;
        object8 = iQ2.a((zp$e)object9, (Gx$b)object8, (b30_0)object2, n10);
        int n14 = ((j30_0)object2).P;
        Object object10 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        N20.W.getClass();
        Object object11 = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        int n15 = mp2 instanceof mp;
        if (n15 != 0) {
            Object object12;
            Object object13;
            ((j30_0)object2).A();
            n15 = ((j30_0)object2).O;
            if (n15 != 0) {
                ((j30_0)object2).C((Function0)object11);
            } else {
                ((j30_0)object2).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object2, object8, n20$a$b);
            object8 = N20$a.d;
            Ow3.a((b30_0)object2, object10, (Function2)object8);
            object10 = N20$a.f;
            int n16 = ((j30_0)object2).O;
            if (n16 != 0 || (n16 = Intrinsics.areEqual(object13 = ((j30_0)object2).v(), object12 = Integer.valueOf(n14))) == 0) {
                rk_0.a(n14, (j30_0)object2, n14, (N20$a$a)object10);
            }
            object9 = N20$a.c;
            Ow3.a((b30_0)object2, object3, (Function2)object9);
            object3 = zp.d;
            object = h.e((LP1)object7, f5);
            object13 = Nc$a.m;
            int n17 = 6;
            object3 = oZ.a((zp$l)object3, (Gx$a)object13, (b30_0)object2, n17);
            n16 = ((j30_0)object2).P;
            object12 = ((j30_0)object2).P();
            object = a30_0.c((b30_0)object2, (LP1)object);
            int n18 = mp2 instanceof mp;
            if (n18 != 0) {
                S93 s93;
                ((j30_0)object2).A();
                bl3 = ((j30_0)object2).O;
                if (bl3) {
                    ((j30_0)object2).C((Function0)object11);
                } else {
                    ((j30_0)object2).n();
                }
                Ow3.a((b30_0)object2, object3, n20$a$b);
                Ow3.a((b30_0)object2, object12, (Function2)object8);
                n4 = ((j30_0)object2).O;
                if (n4 != 0 || (n4 = Intrinsics.areEqual(object3 = ((j30_0)object2).v(), object5 = Integer.valueOf(n16))) == 0) {
                    rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object10);
                }
                Ow3.a((b30_0)object2, object, (Function2)object9);
                n7 = R$string.my_unlocked_coupons;
                object = nk_0.f((b30_0)object2, n7);
                tv0_0 tv0_02 = tv0_0.o;
                long l2 = Em3.f(14);
                long l3 = xx_1.e;
                n10 = 0;
                object10 = null;
                long l4 = 0L;
                int n19 = 131026;
                long l7 = l2;
                i90_0 i90_02 = object4;
                object4 = tv0_02;
                Ll3.b((String)object, null, l3, l2, null, tv0_02, null, l4, null, null, 0L, 0, false, 0, 0, null, null, (b30_0)object2, 200064, 0, n19);
                n7 = R$string.my_unlocked_coupons_desc;
                object = nk_0.f((b30_0)object2, n7);
                n4 = R$string.my_unlocked_coup_desc_ext;
                object3 = nk_0.f((b30_0)object2, n4);
                object5 = new Sl$a();
                l7 = xx_1.l;
                object11 = tv0_0.m;
                int n20 = 12;
                long l8 = Em3.f(n20);
                object8 = s93;
                n18 = 0;
                mp2 = null;
                n15 = 0;
                float f7 = 0.0f;
                n20$a$b = null;
                n16 = 0;
                object13 = null;
                n17 = 0;
                object12 = null;
                long l12 = 0L;
                long l14 = 0L;
                char c2 = (char)-8;
                s93 = new S93(l7, l8, (tv0_0)object11, null, null, null, null, l12, null, null, null, l14, null, null, c2);
                n8 = ((Sl$a)object5).g(s93);
                ((Sl$a)object5).c((String)object);
                object = Unit.a;
                ((Sl$a)object5).c(" ");
                object = "MyRewards";
                ((Sl$a)object5).f((String)object, (String)object);
                long l15 = xx_1.h;
                long l16 = Em3.f(n20);
                long l17 = 0L;
                long l18 = 0L;
                char c3 = (char)-8;
                object = new S93(l15, l16, tv0_02, null, null, null, null, l17, null, null, null, l18, null, null, c3);
                n7 = ((Sl$a)object5).g((S93)object);
                try {
                    ((Sl$a)object5).c((String)object3);
                    ((Sl$a)object5).e(n7);
                    ((Sl$a)object5).d();
                    object9 = ((Sl$a)object5).h();
                }
                catch (Throwable throwable) {
                    object2 = throwable;
                    ((Sl$a)object5).e(n7);
                    throw throwable;
                }
                f7 = 4;
                n16 = 0;
                n17 = 0;
                object12 = null;
                mp2 = null;
                int n21 = 13;
                object11 = object7;
                object10 = h.i((LP1)object7, 0.0f, f7, 0.0f, 0.0f, n21);
                object5 = i90_02;
                object5 = (c80)i90_02;
                n7 = 0;
                f5 = 0.0f;
                object13 = object2;
                object2 = object4;
                object3 = object9;
                object8 = object6;
                object7 = ob0_12;
                object4 = new yb0_1(0, object9, object5, object6, ob0_12);
                bl3 = false;
                object5 = null;
                n8 = 0;
                f6 = 0.0f;
                object8 = null;
                object7 = null;
                n18 = 48;
                n15 = 124;
                f7 = 1.74E-43f;
                object = object9;
                object3 = object10;
                n14 = 0;
                object9 = null;
                n10 = 0;
                object10 = null;
                object11 = object13;
                IV.a((Sl)object, (LP1)object3, null, false, 0, 0, null, (Function1)object4, (b30_0)object13, n18, n15);
                boolean bl4 = true;
                object2 = fn0_2.a((j30_0)object13, bl4, bl4);
                if (object2 != null) {
                    n4 = n3;
                    ((CF2)object2).d = object = new zb0_0(ob0_13, n3);
                }
                return;
                finally {
                    ((Sl$a)object5).e(n8);
                }
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void e(ob0_1 ob0_12, p83_0 p83_02, b30_0 b30_02, int n3) {
        p83_0 p83_03 = p83_02;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(p83_02, "unlockedCouponsList");
        int n4 = 1011522413;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = ((j30_0)object2).v();
        Object object3 = b30$a.a;
        if (object == object3) {
            object = Qx2.a(ly0_0.f(f.a, (b30_0)object2), (j30_0)object2);
        }
        object = ((Q30)object).a;
        object3 = jt1.a((b30_0)object2);
        LP1 lP1 = j.c(LP1$a.b, 1.0f);
        long l2 = OX.f;
        fG2$a fG2$a = fg2_1.a;
        lP1 = a.b(lP1, l2, fG2$a);
        object = (c80)object;
        ab0_1 ab0_12 = new ab0_1(p83_03, ob0_12, (c80)object);
        int n7 = 6;
        int n8 = 252;
        object = lP1;
        lP1 = null;
        fG2$a = null;
        xq1_0.b((LP1)object, (ft1_2)object3, null, false, null, null, null, false, ab0_12, (b30_0)object2, n7, n8);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new bb0_1(ob0_12, p83_03, n3);
        }
    }
}

