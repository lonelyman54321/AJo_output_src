/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.focus.c;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ta0
 */
public final class ta0_0 {
    public static final void a(Function0 function0, b30_0 b30_02, int n3) {
        Function0 function02 = function0;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(function0, "onBackPressed");
        int n7 = -1682125310;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        int n8 = n3 & 0xE;
        int n10 = 4;
        int n14 = 2;
        float f5 = 2.8E-45f;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object2).x(function0) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n4;
        } else {
            n8 = n3;
        }
        int n15 = n8 & 0xB;
        if (n15 == n14 && (n15 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
        } else {
            Object object3;
            n15 = -117403755;
            ((j30_0)object2).K(n15);
            Object object4 = ((j30_0)object2).v();
            b30$a$a b30$a$a = b30$a.a;
            if (object4 == b30$a$a) {
                object4 = new ou0_0();
                ((j30_0)object2).o(object4);
            }
            Object object5 = object4;
            object5 = (ou0_0)object4;
            ((j30_0)object2).T(false);
            n15 = R$drawable.ic_back;
            object4 = km2.a(n15, (b30_0)object2, 0);
            int n16 = R$string.acc_page_header_coupon_bonanza;
            Object object6 = nk_0.f((b30_0)object2, n16);
            int n17 = R$string.back_button_text;
            Object object7 = nk_0.f((b30_0)object2, n17);
            object6 = n1.a((String)object6, ", ", (String)object7);
            object7 = i70$a.a;
            LP1 lP1 = c.a(LP1$a.b, (ou0_0)object5);
            boolean bl2 = true;
            LP1 lP12 = FocusableKt.b(lP1, bl2, n14);
            n14 = 12;
            f5 = n14;
            float f6 = 16;
            int n18 = 12;
            LP1 lP13 = h.i(lP12, f5, f6, 0.0f, 0.0f, n18);
            int n19 = -117388873;
            f6 = -4.179408E34f;
            ((j30_0)object2).K(n19);
            if ((n8 &= 0xE) != n10) {
                bl2 = false;
            }
            object = ((j30_0)object2).v();
            if (bl2 || object == b30$a$a) {
                n10 = 0;
                object3 = null;
                object = new pa0_2(function02, 0);
                ((j30_0)object2).o(object);
            }
            object = (Function0)object;
            ((j30_0)object2).T(false);
            lP13 = d.b(lP13, false, null, (Function0)object, 7);
            bl2 = false;
            int n20 = 24584;
            int n21 = 104;
            object = object4;
            object3 = object6;
            n15 = 0;
            object4 = null;
            object6 = object7;
            n17 = 0;
            object7 = null;
            n19 = 0;
            lP1 = null;
            f6 = 0.0f;
            Pd1.a((im2)object, (String)object3, lP13, null, (i70_0)object6, 0.0f, null, (b30_0)object2, n20, n21);
            object = Unit.a;
            n10 = -117385880;
            ((j30_0)object2).K(n10);
            object3 = ((j30_0)object2).v();
            if (object3 == b30$a$a) {
                object3 = new ta0$a((ou0_0)object5, null);
                ((j30_0)object2).o(object3);
            }
            object3 = (Function2)object3;
            n14 = 0;
            f5 = 0.0f;
            lP13 = null;
            ((j30_0)object2).T(false);
            ly0_0.d((b30_0)object2, object, (Function2)object3);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new qa0_2(function02, n4);
        }
    }

    public static final void b(String string2, long l2, b30_0 b30_02, int n3) {
        int n4;
        String string3 = string2;
        long l3 = l2;
        int n7 = n3;
        Object object = "value";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(814190017);
        int n8 = n3 & 0xE;
        int n10 = 4;
        float f5 = 5.6E-45f;
        if (n8 == 0) {
            n8 = (int)(j30_02.J(string2) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n7;
        } else {
            n8 = n3;
        }
        int n14 = n7 & 0x70;
        if (n14 == 0) {
            n14 = (int)(j30_02.d(l3) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n8 |= n14;
        }
        if ((n14 = n8 & 0x5B) == (n4 = 18) && (n14 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            long l4 = OX.f;
            Object object3 = LP1$a.b;
            float f6 = 20;
            int n15 = 10;
            float f7 = n15;
            int n16 = 12;
            object3 = h.i((LP1)object3, f6, f7, 0.0f, 0.0f, n16);
            Object object4 = SP2.a(f7);
            object3 = androidx.compose.foundation.a.b((LP1)object3, l3, (i13)object4);
            int n17 = 8;
            f6 = n17;
            f5 = n10;
            object3 = h.h((LP1)object3, f6, f5, f6, f5);
            object4 = tv0_0.n;
            long l7 = Em3.f(12);
            double d2 = 0.5;
            long l8 = Em3.e(d2);
            n10 = 224304;
            f5 = 3.14317E-40f;
            int n18 = (n8 &= 0xE) | n10;
            object = string2;
            LP1 lP1 = object3;
            object3 = object4;
            LK1.a(string2, l4, lP1, (tv0_0)object4, l7, l8, j30_02, n18);
        }
        object = j30_02.X();
        if (object != null) {
            ((CF2)object).d = object2 = new ra0_2(string3, l3, n7);
        }
    }

    public static final void c(String string2, b30_0 object, int n3) {
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object = object.g(1989450765);
        int n4 = n3 & 0xE;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n8 = n4 & 0xB;
        if (n8 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            long l2 = OX.f;
            LP1 lP1 = LP1$a.b;
            float f5 = 20;
            int n10 = 10;
            lP1 = h.i(lP1, f5, 0.0f, f5, 0.0f, n10);
            tv0_0 tv0_02 = tv0_0.n;
            long l3 = Em3.f(26);
            long l4 = Em3.f(1);
            n7 = 224688;
            int n14 = (n4 &= 0xE) | n7;
            LK1.a(string2, l2, lP1, tv0_02, l3, l4, (b30_0)object, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new na0_1(string2, n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void d(String string2, long l2, List list, float f5, boolean bl2, boolean bl3, Function0 function0, b30_0 b30_02, int n3, int n4) {
        block30: {
            block31: {
                block32: {
                    void var24_25;
                    boolean bl4;
                    Object object;
                    Object object2;
                    boolean bl6;
                    boolean bl7;
                    j30_0 j30_02;
                    Object object3;
                    Object object4;
                    float f6;
                    Object object5;
                    Object object6;
                    block29: {
                        mp mp2;
                        Object object7;
                        float f7;
                        int n7;
                        Object object8;
                        Object object9;
                        Object object10;
                        int n8;
                        Object object11;
                        block23: {
                            block24: {
                                block28: {
                                    N20$a$b n20$a$b;
                                    int n10;
                                    float f8;
                                    block26: {
                                        block27: {
                                            block25: {
                                                object6 = string2;
                                                object5 = list;
                                                f6 = f5;
                                                object4 = function0;
                                                Intrinsics.checkNotNullParameter(string2, "saleText");
                                                object3 = "colors";
                                                Intrinsics.checkNotNullParameter(list, (String)object3);
                                                Intrinsics.checkNotNullParameter(function0, "onBackPressed");
                                                int n14 = -539731929;
                                                object11 = b30_02;
                                                j30_02 = b30_02.g(n14);
                                                n8 = n4 & 0x10;
                                                bl7 = false;
                                                object10 = null;
                                                if (n8 != 0) {
                                                    bl6 = false;
                                                    object9 = null;
                                                } else {
                                                    bl6 = bl2;
                                                }
                                                n8 = n4 & 0x20;
                                                if (n8 != 0) {
                                                    boolean bl5 = false;
                                                } else {
                                                    boolean bl5 = bl3;
                                                }
                                                object11 = Nc$a.m;
                                                object8 = Nc$a.a;
                                                object2 = LP1$a.b;
                                                n7 = 1065353216;
                                                f7 = 1.0f;
                                                object7 = "<this>";
                                                mp2 = j30_02.a;
                                                if (!bl6) break block23;
                                                j30_02.K(266402356);
                                                Intrinsics.checkNotNullParameter(object2, (String)object7);
                                                Intrinsics.checkNotNullParameter(object5, (String)object3);
                                                object3 = new oa0_1(f6, (List)object5);
                                                object3 = j.c(a.a((LP1)object2, (Function1)object3), f7);
                                                f8 = 180;
                                                object3 = j.d((LP1)object3, f8);
                                                object8 = HA.e((Nc)object8, false);
                                                n10 = j30_02.P;
                                                object = j30_02.P();
                                                object3 = a30_0.c(j30_02, (LP1)object3);
                                                N20.W.getClass();
                                                object7 = N20$a.b;
                                                boolean bl8 = mp2 instanceof mp;
                                                if (!bl8) break block24;
                                                j30_02.A();
                                                bl8 = j30_02.O;
                                                if (bl8) {
                                                    j30_02.C((Function0)object7);
                                                } else {
                                                    j30_02.n();
                                                }
                                                n20$a$b = N20$a.e;
                                                Ow3.a(j30_02, object8, n20$a$b);
                                                object8 = N20$a.d;
                                                Ow3.a(j30_02, object, (Function2)object8);
                                                object = N20$a.f;
                                                bl7 = j30_02.O;
                                                if (bl7) break block25;
                                                object10 = j30_02.v();
                                                bl4 = bl6;
                                                object9 = n10;
                                                bl7 = Intrinsics.areEqual(object10, object9);
                                                if (bl7) break block26;
                                                break block27;
                                            }
                                            bl4 = bl6;
                                        }
                                        rk_0.a(n10, j30_02, n10, (N20$a$a)object);
                                    }
                                    object10 = N20$a.c;
                                    Ow3.a(j30_02, object3, (Function2)object10);
                                    int n14 = n3 >> 18 & 0xE;
                                    ta0_0.a((Function0)object4, j30_02, n14);
                                    int n15 = R$string.coupon_bonanza;
                                    object3 = nk_0.f(j30_02, n15);
                                    object9 = zp.d;
                                    FillElement fillElement = j.c;
                                    n10 = 24;
                                    f8 = n10;
                                    int n16 = 13;
                                    object2 = h.i(fillElement, 0.0f, f8, 0.0f, 0.0f, n16);
                                    int n17 = 6;
                                    float f11 = 8.4E-45f;
                                    object6 = oZ.a((zp$l)object9, (Gx$a)object11, j30_02, n17);
                                    n8 = j30_02.P;
                                    object9 = j30_02.P();
                                    object2 = a30_0.c(j30_02, (LP1)object2);
                                    boolean bl9 = mp2 instanceof mp;
                                    if (!bl9) break block28;
                                    j30_02.A();
                                    bl9 = j30_02.O;
                                    if (bl9) {
                                        j30_02.C((Function0)object7);
                                    } else {
                                        j30_02.n();
                                    }
                                    Ow3.a(j30_02, object6, n20$a$b);
                                    Ow3.a(j30_02, object9, (Function2)object8);
                                    n17 = (int)(j30_02.O ? 1 : 0);
                                    if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object6 = j30_02.v(), object9 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                                        rk_0.a(n8, j30_02, n8, (N20$a$a)object);
                                    }
                                    Ow3.a(j30_02, object2, (Function2)object10);
                                    n17 = 0;
                                    f11 = 0.0f;
                                    object6 = null;
                                    ta0_0.c((String)object3, j30_02, 0);
                                    boolean bl10 = true;
                                    j30_02.T(bl10);
                                    j30_02.T(bl10);
                                    j30_02.T(false);
                                    object11 = string2;
                                    break block29;
                                }
                                s20.a();
                                throw null;
                            }
                            s20.a();
                            throw null;
                        }
                        bl4 = bl6;
                        j30_02.K(266893210);
                        Intrinsics.checkNotNullParameter(object2, (String)object7);
                        Intrinsics.checkNotNullParameter(object5, (String)object3);
                        object3 = new oa0_1(f6, (List)object5);
                        object3 = a.a((LP1)object2, (Function1)object3);
                        object6 = new Object();
                        bl7 = true;
                        object3 = j.c(CY2.b((LP1)object3, bl7, (Function1)object6), f7);
                        float f12 = 200;
                        object3 = j.d((LP1)object3, f12);
                        f12 = 0.0f;
                        object6 = null;
                        object10 = HA.e((Nc)object8, false);
                        int n18 = j30_02.P;
                        object9 = j30_02.P();
                        object3 = a30_0.c(j30_02, (LP1)object3);
                        N20.W.getClass();
                        object8 = N20$a.b;
                        n7 = mp2 instanceof mp;
                        if (n7 == 0) break block30;
                        j30_02.A();
                        n7 = (int)(j30_02.O ? 1 : 0);
                        if (n7 != 0) {
                            j30_02.C((Function0)object8);
                        } else {
                            j30_02.n();
                        }
                        N20$a$b n20$a$b = N20$a.e;
                        Ow3.a(j30_02, object10, n20$a$b);
                        object10 = N20$a.d;
                        Ow3.a(j30_02, object9, (Function2)object10);
                        object9 = N20$a.f;
                        n7 = (int)(j30_02.O ? 1 : 0);
                        if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object = j30_02.v(), object7 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                            rk_0.a(n18, j30_02, n18, (N20$a$a)object9);
                        }
                        object6 = N20$a.c;
                        Ow3.a(j30_02, object3, (Function2)object6);
                        int n19 = n3 >> 18 & 0xE;
                        ta0_0.a((Function0)object4, j30_02, n19);
                        int n20 = R$string.coupon_bonanza_benefits_title;
                        object3 = nk_0.f(j30_02, n20);
                        n7 = 74549473;
                        f7 = 2.8392266E-36f;
                        j30_02.K(n7);
                        if (var24_25 != false) {
                            int n21 = R$string.coupon_bonanza_ended_text_1;
                            object3 = nk_0.f(j30_02, n21);
                        }
                        n7 = 0;
                        f7 = 0.0f;
                        j30_02.T(false);
                        object = zp.d;
                        object7 = j.c;
                        object11 = oZ.a((zp$l)object, (Gx$a)object11, j30_02, 6);
                        int n22 = j30_02.P;
                        object = j30_02.P();
                        LP1 lP1 = a30_0.c(j30_02, (LP1)object7);
                        boolean bl11 = mp2 instanceof mp;
                        if (!bl11) break block31;
                        j30_02.A();
                        bl11 = j30_02.O;
                        if (bl11) {
                            j30_02.C((Function0)object8);
                        } else {
                            j30_02.n();
                        }
                        Ow3.a(j30_02, object11, n20$a$b);
                        Ow3.a(j30_02, object, (Function2)object10);
                        n8 = (int)(j30_02.O ? 1 : 0);
                        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object11 = j30_02.v(), object4 = Integer.valueOf(n22)) ? 1 : 0)) == 0) {
                            rk_0.a(n22, j30_02, n22, (N20$a$a)object9);
                        }
                        Ow3.a(j30_02, lP1, (Function2)object6);
                        ta0_0.c((String)object3, j30_02, 0);
                        boolean bl12 = true;
                        j30_02.T(bl12);
                        float f14 = 10;
                        n22 = 0;
                        n7 = 0;
                        f7 = 0.0f;
                        int n24 = 13;
                        object4 = object7;
                        object11 = mp2;
                        boolean bl13 = false;
                        mp2 = null;
                        object5 = n20$a$b;
                        boolean bl14 = false;
                        n20$a$b = null;
                        lP1 = h.i((LP1)object2, 0.0f, f14, 0.0f, 0.0f, n24);
                        Q93.b(j30_02, lP1);
                        int n25 = 16;
                        f6 = n25;
                        int n26 = 7;
                        Object object12 = object7;
                        lP1 = h.i((LP1)object7, 0.0f, 0.0f, 0.0f, f6, n26);
                        object4 = Nc$a.g;
                        float f15 = 0.0f;
                        object2 = null;
                        object4 = HA.e((Nc)object4, false);
                        int n27 = j30_02.P;
                        object = j30_02.P();
                        lP1 = a30_0.c(j30_02, lP1);
                        n8 = object11 instanceof mp;
                        if (n8 == 0) break block32;
                        j30_02.A();
                        n8 = (int)(j30_02.O ? 1 : 0);
                        if (n8 != 0) {
                            j30_02.C((Function0)object8);
                        } else {
                            j30_02.n();
                        }
                        Ow3.a(j30_02, object4, (Function2)object5);
                        Ow3.a(j30_02, object, (Function2)object10);
                        n8 = (int)(j30_02.O ? 1 : 0);
                        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object11 = j30_02.v(), object5 = Integer.valueOf(n27)) ? 1 : 0)) == 0) {
                            rk_0.a(n27, j30_02, n27, (N20$a$a)object9);
                        }
                        Ow3.a(j30_02, lP1, (Function2)object6);
                        n18 = n3 & 0x7E;
                        object11 = string2;
                        ta0_0.b(string2, l2, j30_02, n18);
                        j30_02.T(bl12);
                        j30_02.T(bl12);
                        boolean bl15 = false;
                        object3 = null;
                        j30_02.T(false);
                    }
                    object2 = j30_02.X();
                    if (object2 != null) {
                        object3 = object;
                        object6 = string2;
                        object5 = list;
                        f6 = f5;
                        bl7 = bl4;
                        bl6 = var24_25;
                        object4 = function0;
                        int n28 = n3;
                        ((CF2)object2).d = object = new ma0_1(string2, l2, list, f5, bl4, bl6, function0, n3, n4);
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
}

