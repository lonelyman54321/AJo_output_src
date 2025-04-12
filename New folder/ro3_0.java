/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.compose.animation.a;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.focus.c;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ro3
 */
public final class ro3_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(String string2, b30_0 b30_02, int n3) {
        Object object;
        Object object2 = string2;
        int n4 = n3;
        Object object3 = "coinBalanceText";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        Object object4 = b30_02;
        j30_0 j30_02 = b30_02.g(-361294492);
        int n7 = n3 & 0xE;
        int n8 = 2;
        if (n7 == 0) {
            n7 = (int)(j30_02.J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n10 = n7 & 0xB;
        if (n10 == n8 && (n8 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object4 = j30_02;
        } else {
            Object object5;
            Object object6;
            boolean bl2;
            object4 = LP1$a.b;
            Object object7 = j.c((LP1)object4, 1.0f);
            n10 = 12;
            float f5 = 1.7E-44f;
            float f6 = n10;
            boolean bl3 = false;
            float f7 = 0.0f;
            Object object8 = null;
            Object object9 = h.i((LP1)object7, 0.0f, 0.0f, f6, 0.0f, 11);
            Object object10 = Nc$a.f;
            int n14 = 0;
            float f8 = 0.0f;
            object7 = null;
            object10 = HA.e((Nc)object10, false);
            int n15 = j30_02.P;
            Object object11 = j30_02.P();
            object9 = a30_0.c(j30_02, (LP1)object9);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = j30_02.a;
            int n16 = mp2 instanceof mp;
            if (n16 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n16 = j30_02.O;
            if (n16 != 0) {
                j30_02.C(xp1$a);
            } else {
                j30_02.n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a(j30_02, object10, n20$a$b);
            object10 = N20$a.d;
            Ow3.a(j30_02, object11, (Function2)object10);
            object11 = N20$a.f;
            boolean bl4 = j30_02.O;
            if (bl4 || !(bl2 = Intrinsics.areEqual(object6 = j30_02.v(), object5 = Integer.valueOf(n15)))) {
                rk_0.a(n15, j30_02, n15, (N20$a$a)object11);
            }
            object8 = N20$a.c;
            Ow3.a(j30_02, object9, (Function2)object8);
            object9 = Nc$a.k;
            object5 = zp.d;
            N20$a$c n20$a$c = object8;
            double d2 = 0.5;
            f8 = (float)d2;
            long l2 = xx_1.k;
            f7 = 16;
            object8 = SP2.a(f7);
            object = gz.a((LP1)object4, f8, l2, (i13)object8);
            n10 = 8;
            f5 = n10;
            f8 = 4;
            object = h.h((LP1)object, f5, f8, f5, f8);
            n14 = 54;
            f8 = 7.6E-44f;
            object8 = object9;
            object7 = iQ2.a((zp$e)object5, (Gx$b)object9, j30_02, n14);
            n15 = j30_02.P;
            object5 = j30_02.P();
            object = a30_0.c(j30_02, (LP1)object);
            bl3 = mp2 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            j30_02.A();
            bl3 = j30_02.O;
            if (bl3) {
                j30_02.C(xp1$a);
            } else {
                j30_02.n();
            }
            Ow3.a(j30_02, object7, n20$a$b);
            Ow3.a(j30_02, object5, (Function2)object10);
            boolean bl5 = j30_02.O;
            if (bl5 || !(bl5 = Intrinsics.areEqual(object10 = j30_02.v(), object7 = Integer.valueOf(n15)))) {
                rk_0.a(n15, j30_02, n15, (N20$a$a)object11);
            }
            object10 = n20$a$c;
            Ow3.a(j30_02, object, n20$a$c);
            object7 = km2.a(R$drawable.ic_bonanza_coin, j30_02, 0);
            float f11 = 24;
            object11 = j.i((LP1)object4, f11, f11);
            n20$a$b = null;
            bl2 = false;
            object5 = null;
            object8 = "";
            object6 = j30_02;
            Pd1.a((im2)object7, (String)object8, (LP1)object11, null, null, 0.0f, null, j30_02, 440, 120);
            long l3 = Em3.f(10);
            long l4 = xx_1.e;
            Object object12 = tv0_0.n;
            object11 = null;
            n16 = 10;
            object7 = object4;
            f7 = f5;
            f6 = f5;
            object4 = h.i((LP1)object4, f5, 0.0f, f5, 0.0f, n16);
            int n17 = 200112;
            f11 = 2.80417E-40f;
            int n18 = n7 & 0xE | n17;
            bl5 = false;
            object10 = null;
            n14 = 0;
            f8 = 0.0f;
            object7 = null;
            long l7 = 0L;
            f6 = 0.0f;
            xp1$a = null;
            bl3 = false;
            mp2 = null;
            long l8 = 0L;
            bl4 = false;
            object6 = null;
            n20$a$c = null;
            int n19 = 131024;
            object3 = string2;
            l2 = l4;
            b30_02 = j30_02;
            object2 = object12;
            object12 = j30_02;
            Ll3.b(string2, (LP1)object4, l4, l3, null, (tv0_0)object2, null, l7, null, null, l8, 0, false, 0, 0, null, null, j30_02, n18, 0, n19);
            n7 = 1;
            object4 = j30_02;
            j30_02.T(n7 != 0);
            j30_02.T(n7 != 0);
        }
        object3 = ((j30_0)object4).X();
        if (object3 != null) {
            object = string2;
            n10 = n3;
            ((CF2)object3).d = object4 = new mo3_0(string2, n3);
        }
    }

    public static final void b(String string2, String string3, b30_0 b30_02, int n3) {
        j30_0 j30_02;
        Object object = string2;
        String string4 = string3;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(string2, "title");
        Object object2 = "desc";
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        Object object3 = b30_02;
        j30_0 j30_03 = b30_02.g(-202175351);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(j30_03.J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n8 = n4 & 0x70;
        if (n8 == 0) {
            n8 = (int)(j30_03.J(string4) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        int n10 = n7;
        n8 = 18;
        if ((n7 &= 0x5B) == n8 && (n7 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            j30_02 = j30_03;
        } else {
            int n14 = 14;
            long l2 = Em3.f(n14);
            Object object4 = tv0_0.n;
            long l3 = xx_1.e;
            n7 = n10 & 0xE;
            int n15 = 200064;
            int n16 = n7 | n15;
            object2 = string2;
            j30_02 = j30_03;
            long l4 = l2;
            object = object4;
            object4 = j30_03;
            Ll3.b(string2, null, l3, l2, null, (tv0_0)object, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, j30_03, n16, 0, 131026);
            l4 = Em3.f(12);
            object = tv0_0.m;
            n7 = n10 >> 3 & 0xE;
            n16 = n7 | n15;
            n8 = 0;
            object3 = null;
            long l7 = 0L;
            long l8 = 0L;
            int n17 = 131026;
            object2 = string3;
            Ll3.b(string3, null, l3, l4, null, (tv0_0)object, null, l7, null, null, l8, 0, false, 0, 0, null, null, j30_03, n16, 0, n17);
        }
        object2 = j30_02.X();
        if (object2 != null) {
            int n18 = 1;
            string4 = string3;
            n4 = n3;
            ((CF2)object2).d = object3 = new ym0_2(string2, n3, n18, string3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void c(boolean bl2, ob0_1 ob0_12, String string2, String string3, String string4, Function0 function0, u10 u102, b30_0 b30_02, int n3, int n4) {
        void var13_16;
        po3_0 po3_02;
        u10 u103 = u102;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onBackPressed");
        Intrinsics.checkNotNullParameter(u102, "content");
        int n7 = 1411926511;
        Object object = b30_02.g(n7);
        int bl3 = n4 & 1;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        int n8 = R$string.coupon_quest;
        String string5 = nk_0.f((b30_0)object, n8);
        String string6 = ob0_12.l();
        int n10 = n4 & 0x10;
        String string7 = n10 != 0 ? "" : string4;
        fx0_2 fx0_22 = po3_02;
        Object object2 = ob0_12;
        Object object3 = string5;
        po3_02 = new po3_0((boolean)var13_16, ob0_12, string5, string6, string7, function0);
        object2 = v10.c(1486368308, po3_02, (b30_0)object);
        fx0_22 = new qo3_0(u103);
        u10 u104 = v10.c(2127353773, fx0_22, (b30_0)object);
        long l2 = 0L;
        int n14 = 384;
        fx0_22 = null;
        object3 = null;
        po3_02 = null;
        long l3 = 0L;
        long l4 = 0L;
        long l7 = 0L;
        long l8 = 0L;
        int n15 = 0xC00000;
        int n16 = 131067;
        HS2.a(null, null, (Function2)object2, null, null, null, 0, false, null, false, null, 0.0f, l3, l4, l7, l8, l2, u104, (b30_0)object, n14, n15, n16);
        object2 = ((j30_0)object).X();
        if (object2 != null) {
            object = object3;
            u103 = u102;
            ((CF2)object2).d = object3 = new jo3_0((boolean)var13_16, ob0_12, string5, string6, string7, function0, u102, n3, n4);
        }
    }

    public static final void d(String string2, b30_0 b30_02, int n3) {
        j30_0 j30_02;
        Object object = string2;
        int n4 = n3;
        Object object2 = "title";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        Object object3 = b30_02;
        j30_0 j30_03 = b30_02.g(-852209063);
        int n7 = n3 & 0xE;
        int n8 = 2;
        if (n7 == 0) {
            n7 = (int)(j30_03.J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n10 = n7 & 0xB;
        if (n10 == n8 && (n8 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            j30_02 = j30_03;
        } else {
            n8 = 14;
            long l2 = Em3.f(n8);
            Object object4 = tv0_0.n;
            long l3 = xx_1.e;
            int n14 = (n7 &= n8) | 0x30D80;
            n8 = 0;
            object3 = null;
            long l4 = 0L;
            long l7 = 0L;
            int n15 = 131026;
            object2 = string2;
            j30_02 = j30_03;
            object = object4;
            object4 = j30_03;
            Ll3.b(string2, null, l3, l2, null, (tv0_0)object, null, l4, null, null, l7, 0, false, 0, 0, null, null, j30_03, n14, 0, n15);
        }
        object2 = j30_02.X();
        if (object2 != null) {
            ((CF2)object2).d = object3 = new ko3_0(string2, n3);
        }
    }

    public static final void e(Function0 function0, b30_0 object, int n3) {
        Object object2 = "onClick";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(-391489335);
        int n4 = n3 & 0xE;
        int n7 = 4;
        int n8 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n8 && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            ((j30_0)object).K(-611829342);
            n10 = 0;
            boolean bl2 = true;
            if ((n4 &= 0xE) == n7) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object3 = ((j30_0)object).v();
            if (n4 != 0 || object3 == (object2 = b30$a.a)) {
                n4 = 1;
                object3 = new lc2_2(function0, n4);
                ((j30_0)object).o(object3);
            }
            object3 = (Function0)object3;
            ((j30_0)object).T(false);
            object2 = FocusableKt.b(LP1$a.b, bl2, n8);
            Object object4 = new Object();
            object2 = CY2.b((LP1)object2, false, (Function1)object4);
            object4 = ou0_0.b;
            object4 = c.a((LP1)object2, (ou0_0)object4);
            u10 u102 = l20_0.a;
            n10 = 0;
            bl2 = false;
            int n14 = 24576;
            int n15 = 12;
            pc1_0.a((Function0)object3, (LP1)object4, false, null, u102, (b30_0)object, n14, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new io3_0(function0, n3);
        }
    }

    public static final void f(ob0_1 ob0_12, String string2, String string3, b30_0 b30_02, int n3) {
        Object object = ob0_12;
        String string4 = string2;
        String string5 = string3;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "desc");
        int n7 = 124798804;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n7);
        object2 = (Boolean)ob0_12.j.getValue();
        boolean bl2 = (Boolean)object2;
        Object object4 = zp.d;
        Object object5 = Nc$a.k;
        LP1 lP1 = LP1$a.b;
        object5 = iQ2.a((zp$e)object4, (Gx$b)object5, (b30_0)object3, 54);
        int n8 = ((j30_0)object3).P;
        Object object6 = ((j30_0)object3).P();
        Object object7 = a30_0.c((b30_0)object3, lP1);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object3).a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            Object object8;
            boolean bl4;
            ((j30_0)object3).A();
            bl3 = ((j30_0)object3).O;
            if (bl3) {
                ((j30_0)object3).C(xp1$a);
            } else {
                ((j30_0)object3).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object3, object5, n20$a$b);
            object5 = N20$a.d;
            Ow3.a((b30_0)object3, object6, (Function2)object5);
            object6 = N20$a.f;
            boolean bl5 = ((j30_0)object3).O;
            if (bl5 || !(bl4 = Intrinsics.areEqual(object8 = ((j30_0)object3).v(), object = Integer.valueOf(n8)))) {
                rk_0.a(n8, (j30_0)object3, n8, (N20$a$a)object6);
            }
            object = N20$a.c;
            Ow3.a((b30_0)object3, object7, (Function2)object);
            Gx$a gx$a = Nc$a.m;
            int n10 = 6;
            object4 = oZ.a((zp$l)object4, gx$a, (b30_0)object3, n10);
            n8 = ((j30_0)object3).P;
            object7 = ((j30_0)object3).P();
            lP1 = a30_0.c((b30_0)object3, lP1);
            boolean bl6 = mp2 instanceof mp;
            if (bl6) {
                ((j30_0)object3).A();
                bl6 = ((j30_0)object3).O;
                if (bl6) {
                    ((j30_0)object3).C(xp1$a);
                } else {
                    ((j30_0)object3).n();
                }
                Ow3.a((b30_0)object3, object4, n20$a$b);
                Ow3.a((b30_0)object3, object7, (Function2)object5);
                boolean bl7 = ((j30_0)object3).O;
                if (bl7 || !(bl7 = Intrinsics.areEqual(object4 = ((j30_0)object3).v(), object5 = Integer.valueOf(n8)))) {
                    rk_0.a(n8, (j30_0)object3, n8, (N20$a$a)object6);
                }
                Ow3.a((b30_0)object3, lP1, (Function2)object);
                int n14 = n4 >> 3 & 0x7E;
                ro3_0.b(string4, string5, (b30_0)object3, n14);
                boolean bl8 = true;
                ((j30_0)object3).T(bl8);
                object4 = ob0_12.i();
                if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)object4))) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                object5 = new ro3$a((String)object4);
                object6 = v10.c(463512464, (fx0_2)object5, (b30_0)object3);
                lP1 = null;
                n8 = 0;
                gx$a = null;
                bl7 = false;
                object4 = null;
                object5 = null;
                int n15 = 1572870;
                object7 = object3;
                a.b(bl2, null, null, null, null, (u10)object6, (b30_0)object3, n15);
                ((j30_0)object3).T(bl8);
                object = ((j30_0)object3).X();
                if (object != null) {
                    object2 = ob0_12;
                    ((CF2)object).d = object3 = new lo3_0(ob0_12, string4, string5, n4);
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

