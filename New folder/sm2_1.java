/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SM2
 */
public final class sm2_1 {
    public static final void a(String string2, String string3, String string4, Function0 function0, b30_0 object, int n3) {
        block22: {
            block26: {
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                int n4;
                Object object7;
                Object object8;
                block21: {
                    float f5;
                    boolean bl2;
                    block28: {
                        Object object9;
                        block27: {
                            Object object10;
                            Object object11;
                            Object object12;
                            N20$a n20$a;
                            int n7;
                            int n8;
                            Object object13;
                            Object object14;
                            Object object15;
                            int n10;
                            int n14;
                            Object object16;
                            Object object17;
                            block24: {
                                block25: {
                                    block23: {
                                        float f6;
                                        block20: {
                                            object8 = string2;
                                            object17 = string3;
                                            object16 = string4;
                                            object7 = function0;
                                            n4 = n3;
                                            object6 = " ";
                                            Intrinsics.checkNotNullParameter(string2, "title");
                                            Intrinsics.checkNotNullParameter(string3, "desc");
                                            Intrinsics.checkNotNullParameter(string4, "cta");
                                            int bl3 = -443643005;
                                            object5 = object;
                                            object4 = object.g(bl3);
                                            n14 = n3 & 0xE;
                                            if (n14 == 0) {
                                                n14 = (int)(((j30_0)object4).J(string2) ? 1 : 0);
                                                n14 = n14 != 0 ? 4 : 2;
                                                n14 |= n4;
                                            } else {
                                                n14 = n3;
                                            }
                                            int n15 = n4 & 0x70;
                                            if (n15 == 0) {
                                                n15 = (int)(((j30_0)object4).J(object17) ? 1 : 0);
                                                n15 = n15 != 0 ? 32 : 16;
                                                n14 |= n15;
                                            }
                                            if ((n15 = n4 & 0x380) == 0) {
                                                n15 = (int)(((j30_0)object4).J(object16) ? 1 : 0);
                                                n15 = n15 != 0 ? 256 : 128;
                                                n14 |= n15;
                                            }
                                            if ((n15 = n4 & 0x1C00) == 0) {
                                                n15 = (int)(((j30_0)object4).x(object7) ? 1 : 0);
                                                n15 = n15 != 0 ? 2048 : 1024;
                                                n14 |= n15;
                                            }
                                            n15 = n14 & 0x16DB;
                                            n10 = 1170;
                                            f6 = 1.64E-42f;
                                            if (n15 != n10 || (n15 = (int)(((j30_0)object4).h() ? 1 : 0)) == 0) break block20;
                                            ((j30_0)object4).D();
                                            object6 = object4;
                                            Function0 object92 = object7;
                                            break block21;
                                        }
                                        object3 = LP1$a.b;
                                        f6 = 1.0f;
                                        object15 = j.c((LP1)object3, f6);
                                        object14 = zp.c;
                                        object13 = Nc$a.m;
                                        n8 = 0;
                                        object14 = oZ.a((zp$l)object14, (Gx$a)object13, (b30_0)object4, 0);
                                        n7 = ((j30_0)object4).P;
                                        object9 = ((j30_0)object4).P();
                                        object15 = a30_0.c((b30_0)object4, (LP1)object15);
                                        n20$a = N20.W;
                                        n20$a.getClass();
                                        object2 = N20$a.b;
                                        object12 = ((j30_0)object4).a;
                                        n10 = object12 instanceof mp;
                                        if (n10 == 0) break block22;
                                        ((j30_0)object4).A();
                                        n10 = (int)(((j30_0)object4).O ? 1 : 0);
                                        if (n10 != 0) {
                                            ((j30_0)object4).C((Function0)object2);
                                        } else {
                                            ((j30_0)object4).n();
                                        }
                                        object11 = N20$a.e;
                                        Ow3.a((b30_0)object4, object14, (Function2)object11);
                                        object14 = N20$a.d;
                                        Ow3.a((b30_0)object4, object9, (Function2)object14);
                                        object9 = N20$a.f;
                                        bl2 = ((j30_0)object4).O;
                                        if (bl2) break block23;
                                        object8 = ((j30_0)object4).v();
                                        object10 = object6;
                                        object6 = n7;
                                        bl2 = Intrinsics.areEqual(object8, object6);
                                        if (bl2) break block24;
                                        break block25;
                                    }
                                    object10 = object6;
                                }
                                rk_0.a(n7, (j30_0)object4, n7, (N20$a$a)object9);
                            }
                            object8 = N20$a.c;
                            Ow3.a((b30_0)object4, object15, (Function2)object8);
                            float f7 = 1.0f;
                            object6 = j.c((LP1)object3, f7);
                            object15 = Nc$a.a;
                            object13 = null;
                            object15 = HA.e((Nc)object15, false);
                            n7 = ((j30_0)object4).P;
                            object7 = ((j30_0)object4).P();
                            object6 = a30_0.c((b30_0)object4, (LP1)object6);
                            n8 = object12 instanceof mp;
                            if (n8 == 0) break block26;
                            ((j30_0)object4).A();
                            n8 = ((j30_0)object4).O;
                            if (n8 != 0) {
                                ((j30_0)object4).C((Function0)object2);
                            } else {
                                ((j30_0)object4).n();
                            }
                            Ow3.a((b30_0)object4, object15, (Function2)object11);
                            Ow3.a((b30_0)object4, object7, (Function2)object14);
                            boolean bl3 = ((j30_0)object4).O;
                            if (bl3 || !(bl3 = Intrinsics.areEqual(object7 = ((j30_0)object4).v(), object2 = Integer.valueOf(n7)))) {
                                rk_0.a(n7, (j30_0)object4, n7, (N20$a$a)object9);
                            }
                            Ow3.a((b30_0)object4, object6, (Function2)object8);
                            object11 = d.a.e((LP1)object3);
                            object15 = R$drawable.rvp_bottom_sheet_gradient;
                            int n16 = R$drawable.rvp_bottom_sheet_gradient;
                            object9 = null;
                            bl2 = false;
                            object8 = null;
                            bl3 = false;
                            object7 = null;
                            object12 = object4;
                            Je1.a((LP1)object11, object15, n16, null, null, (b30_0)object4, 0, 24);
                            f5 = uq0_0.o;
                            f7 = uq0_0.h;
                            object6 = h.f((LP1)object3, f5, f7);
                            av0_0 av0_02 = y20_0.a;
                            tv0_0 tv0_02 = tv0_0.h;
                            long l2 = oj3_2.f;
                            n10 = n14 & 0xE;
                            int n17 = n10 | 0x1B0C30;
                            xm3 xm32 = null;
                            long l3 = 0L;
                            object12 = object3;
                            int n18 = 0;
                            object2 = null;
                            n16 = 0;
                            object14 = null;
                            n7 = 0;
                            object13 = null;
                            long l4 = 0L;
                            int n19 = n14;
                            Object object18 = object3;
                            n20$a = null;
                            int n20 = 130964;
                            object = object4;
                            object4 = string2;
                            Object object19 = object10;
                            object16 = tv0_02;
                            object17 = av0_02;
                            object10 = object;
                            Ll3.b(string2, (LP1)object6, l3, l2, null, tv0_02, av0_02, l3, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object, n17, 0, n20);
                            boolean bl4 = true;
                            object6 = object;
                            ((j30_0)object).T(bl4);
                            ((j30_0)object).K(1794470957);
                            n14 = string3.length();
                            if (n14 <= 0) break block27;
                            n14 = 1794471352;
                            ((j30_0)object).K(n14);
                            object5 = ((j30_0)object).v();
                            object3 = b30$a.a;
                            if (object5 == object3) {
                                object5 = "click";
                                ((j30_0)object).o(object5);
                            }
                            object5 = (String)object5;
                            bl3 = false;
                            object7 = null;
                            ((j30_0)object6).T(false);
                            Object object20 = new Sl$a();
                            object12 = string3;
                            ((Sl$a)object20).c(string3);
                            ((Sl$a)object20).f((String)object5, (String)object5);
                            long l7 = 4280716473L;
                            long l8 = zx_0.d(l7);
                            long l12 = 0L;
                            long l14 = 0L;
                            long l15 = 0L;
                            char c2 = (char)-6;
                            object2 = new S93(l8, l12, tv0_02, null, null, null, null, l14, null, null, null, l15, null, null, c2);
                            n18 = ((Sl$a)object20).g((S93)object2);
                            object13 = string4;
                            object16 = object19;
                            object16 = ((String)object19).concat(string4);
                            ((Sl$a)object20).c((String)object16);
                            object16 = Unit.a;
                            ((Sl$a)object20).d();
                            object9 = ((Sl$a)object20).h();
                            float f8 = uq0_0.j;
                            object2 = object18;
                            object8 = h.h((LP1)object18, f5, f8, f5, f5);
                            long l16 = oj3_2.c;
                            long l17 = oj3_2.e;
                            long l18 = 0L;
                            object15 = null;
                            long l19 = 0L;
                            n17 = 0xFDFFDD;
                            object20 = xm32;
                            object14 = av0_02;
                            object4 = object9;
                            n8 = 0;
                            object12 = null;
                            n20$a = null;
                            xm32 = new xm3(l18, l16, null, av0_02, l19, null, 0, l17, n17);
                            f8 = 1.48612375E26f;
                            ((j30_0)object6).K(1794497482);
                            n4 = (int)(((j30_0)object6).J(object9) ? 1 : 0);
                            n18 = n19;
                            n18 = n19 & 0x1C00;
                            int n21 = 2048;
                            if (n18 == n21) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object12 = null;
                            }
                            object2 = ((j30_0)object6).v();
                            if ((n4 |= n8) == 0 && object2 != object3) {
                                object9 = function0;
                            } else {
                                object9 = function0;
                                object2 = new qm2_0((Sl)object4, (String)object5, function0);
                                ((j30_0)object6).o(object2);
                            }
                            object11 = object2;
                            object11 = (Function1)object2;
                            ((j30_0)object6).T(false);
                            n21 = 0;
                            object16 = null;
                            object17 = null;
                            n4 = 0;
                            f8 = 0.0f;
                            object20 = null;
                            n18 = 0;
                            object2 = null;
                            n16 = 0;
                            object14 = null;
                            n7 = 120;
                            object5 = object4;
                            object3 = object8;
                            bl2 = false;
                            f5 = 0.0f;
                            object8 = null;
                            object7 = xm32;
                            object15 = object6;
                            IV.a((Sl)object4, (LP1)object3, xm32, false, 0, 0, null, (Function1)object11, (b30_0)object6, 0, n7);
                            break block28;
                            finally {
                                ((Sl$a)object20).e(n18);
                            }
                        }
                        object9 = function0;
                        bl2 = false;
                        f5 = 0.0f;
                        object8 = null;
                    }
                    ((j30_0)object6).T(false);
                    bl2 = true;
                    f5 = Float.MIN_VALUE;
                    ((j30_0)object6).T(bl2);
                }
                object8 = ((j30_0)object6).X();
                if (object8 != null) {
                    object4 = object2;
                    object6 = string2;
                    object5 = string3;
                    object3 = string4;
                    object7 = function0;
                    n4 = n3;
                    object2 = new rm2_1(string2, string3, string4, function0, n3);
                    ((CF2)object8).d = object2;
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

