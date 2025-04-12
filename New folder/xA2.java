/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class xA2 {
    public static final void a(int n3, int n4, b30_0 object, LP1 lP1) {
        block14: {
            Object object2;
            block13: {
                float f5;
                float f6;
                int n7;
                block12: {
                    object2 = "modifier";
                    Intrinsics.checkNotNullParameter(lP1, (String)object2);
                    object = object.g(-400155470);
                    n7 = n4 & 0xE;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                        n7 = n7 != 0 ? 4 : 2;
                        n7 |= n4;
                    } else {
                        n7 = n4;
                    }
                    int n8 = n4 & 0x70;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).c(n3) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 32;
                            f6 = 4.5E-44f;
                        } else {
                            n8 = 16;
                            f6 = 2.2E-44f;
                        }
                        n7 |= n8;
                    }
                    n8 = n7 & 0x5B;
                    int n10 = 18;
                    f5 = 2.5E-44f;
                    if (n8 != n10 || (n8 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block12;
                    ((j30_0)object).D();
                    break block13;
                }
                f6 = uq0_0.s;
                Object object3 = j.d(j.k(lP1, f6), f6);
                long l2 = OX.f;
                Object object4 = SP2.a;
                object3 = a.b((LP1)object3, l2, (i13)object4);
                Object object5 = Nc$a.e;
                LP1 lP12 = null;
                object5 = HA.e((Nc)object5, false);
                int n14 = ((j30_0)object).P;
                object4 = ((j30_0)object).P();
                object3 = a30_0.c((b30_0)object, (LP1)object3);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block14;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object5, (Function2)((Object)serializable));
                object5 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object5);
                object5 = N20$a.f;
                boolean bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), serializable = Integer.valueOf(n14)))) {
                    rk_0.a(n14, (j30_0)object, n14, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object, object3, (Function2)object5);
                n7 = n7 >> 3 & 0xE;
                object3 = km2.a(n3, (b30_0)object, n7);
                object2 = LP1$a.b;
                f5 = uq0_0.o;
                object2 = j.k((LP1)object2, f5);
                lP12 = j.d((LP1)object2, f5);
                bl2 = false;
                mp2 = null;
                object5 = "";
                bl3 = false;
                object4 = null;
                serializable = null;
                int n15 = 440;
                int n16 = 120;
                Pd1.a((im2)object3, (String)object5, lP12, null, null, 0.0f, null, (b30_0)object, n15, n16);
                n7 = 1;
                ((j30_0)object).T(n7 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new pa2_2(lP1, n3, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(String string2, List list, boolean bl2, Function1 function1, Function2 function2, Function2 function22, Function1 function12, dr0_0 dr0_02, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(function1, "onItemClick");
        Intrinsics.checkNotNullParameter(function2, "onViewAllClick");
        Intrinsics.checkNotNullParameter(function22, "onItemWishlist");
        Intrinsics.checkNotNullParameter(function12, "sendProductImpressionDataMiniPLP");
        Object object3 = dr0_02;
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n8 = 441322496;
        Object object4 = b30_02;
        Object object5 = b30_02.g(n8);
        if (list != null) {
            object4 = list;
            object4 = CollectionsKt.m0(list);
        } else {
            n7 = 0;
            object4 = null;
        }
        Object object6 = object4;
        n7 = 0;
        object4 = null;
        if (bl2) {
            if (object6 != null) {
                n4 = object6.size();
            } else {
                n4 = 0;
                object2 = null;
            }
        } else {
            if (object6 != null) {
                n4 = object6.size();
            } else {
                n4 = 0;
                object2 = null;
            }
            ++n4;
        }
        float f5 = -3.1551835E-17f;
        ((j30_0)object5).K(-1542356523);
        boolean bl3 = ((j30_0)object5).c(n4);
        Object object7 = ((j30_0)object5).v();
        if (bl3 || object7 == (object = b30$a.a)) {
            object7 = new qa2_2(n4);
            ((j30_0)object5).o(object7);
        }
        object7 = (Function0)object7;
        ((j30_0)object5).T(false);
        Object object8 = El2.b((Function0)object7, (b30_0)object5);
        object2 = AndroidCompositionLocals_androidKt.a;
        Object object9 = object2 = ((j30_0)object5).j((H30)object2);
        object9 = (Configuration)object2;
        double d2 = ((Configuration)object9).screenWidthDp;
        double d5 = 0.65;
        float f6 = (float)(d2 *= d5);
        double d7 = ov3.v("POST_RESOURCE-CAROUSEL");
        f5 = (float)(d2 /= d7);
        object2 = new zl2(5);
        int n10 = 28;
        pi3_0 pi3_02 = yk2_0.a((hm0_0)object8, (zl2)object2, (b30_0)object5, 0, n10);
        Object object10 = LP1$a.b;
        float f7 = uq0_0.o;
        int n14 = 13;
        LP1 lP1 = h.i((LP1)object10, 0.0f, f7, 0.0f, 0.0f, n14);
        Object object11 = object4;
        object4 = new ok2$b_0(f6);
        float f8 = uq0_0.k;
        Gx$b gx$b = Nc$a.j;
        n4 = (int)(bl2 ? 1 : 0);
        object7 = function2;
        object10 = object8;
        object8 = function1;
        object3 = function22;
        object4 = new wa2_2((ArrayList)object6, bl2, f5, function2, string2, (Configuration)object9, dr0_02, function12, function1, function22);
        n7 = 1486185122;
        u10 u102 = v10.c(n7, (fx0_2)object4, (b30_0)object5);
        int n15 = 1769520;
        f7 = 0.0f;
        int n16 = 3072;
        int n17 = 7956;
        jl2.a((hm0_0)object10, lP1, null, (ok2_0)object11, 0, f8, gx$b, pi3_02, false, false, null, null, null, u102, (b30_0)object5, n15, n16, n17);
        object8 = ((j30_0)object5).X();
        if (object8 != null) {
            object5 = object3;
            object4 = string2;
            object6 = list;
            object = function1;
            object9 = function12;
            ((CF2)object8).d = object3 = new ra2_2(string2, list, bl2, function1, function2, function22, function12, dr0_02, n3);
        }
    }

    public static final void c(LP1 lP1, Function0 function0, int n3, b30_0 b30_02, int n4) {
        int n7;
        float f5;
        LP1 lP12 = lP1;
        Function0 function02 = function0;
        int n8 = n3;
        int n10 = n4;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Object object = "onClick";
        Intrinsics.checkNotNullParameter(function0, (String)object);
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(24711220);
        int n14 = n4 & 0xE;
        if (n14 == 0) {
            n14 = (int)(j30_02.J(lP1) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n10;
        } else {
            n14 = n4;
        }
        int n15 = n10 & 0x70;
        int n16 = 32;
        if (n15 == 0) {
            n15 = (int)(j30_02.x(function02) ? 1 : 0);
            if (n15 != 0) {
                n15 = 32;
                f5 = 4.5E-44f;
            } else {
                n15 = 16;
                f5 = 2.2E-44f;
            }
            n14 |= n15;
        }
        if ((n15 = n10 & 0x380) == 0) {
            n15 = (int)(j30_02.c(n8) ? 1 : 0);
            if (n15 != 0) {
                n15 = 256;
                f5 = 3.59E-43f;
            } else {
                n15 = 128;
                f5 = 1.8E-43f;
            }
            n14 |= n15;
        }
        if ((n15 = n14 & 0x2DB) == (n7 = 146) && (n15 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            float f6 = uq0_0.c;
            nz nz4 = oz_0.a(OX.b(nz_1.h, 0.2f), f6);
            object2 = GE.a;
            long l2 = nz_1.k;
            float f7 = 0.6f;
            l2 = OX.b(l2, f7);
            int n17 = 14;
            long l3 = 0L;
            int n18 = 6;
            Object object3 = j30_02;
            object3 = GE.a(l2, l3, j30_02, n18, n17);
            f5 = uq0_0.e;
            nk2_0 nk2_02 = new nk2_0(f5, f6, f5, f6);
            rp2_0 rp2_02 = SP2.a(uq0_0.h);
            f5 = -2.1732874E-18f;
            j30_02.K(-1574937539);
            n15 = n14 & 0x70;
            n7 = 0;
            xA2$a xA2$a = null;
            if (n15 == n16) {
                n15 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n15 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            Object object4 = j30_02.v();
            if (n15 != 0 || object4 == (object2 = b30$a.a)) {
                object4 = new na2_2(function02);
                j30_02.o(object4);
            }
            object2 = object4;
            object2 = (Function0)object4;
            j30_02.T(false);
            xA2$a = new xA2$a(n8);
            int n19 = 1176517634;
            u10 u102 = v10.c(n19, xA2$a, j30_02);
            n14 = n14 << 3 & 0x70;
            int n20 = n14 | 0x30180000;
            int n21 = 28;
            n7 = 0;
            xA2$a = null;
            object = object2;
            object2 = lP1;
            object4 = nz4;
            ME.b((Function0)object, lP1, false, rp2_02, nz4, (ol0)object3, nk2_02, u102, j30_02, n20, n21);
        }
        object = j30_02.X();
        if (object != null) {
            ((CF2)object).d = object2 = new oa2_2(lP12, function02, n8, n10);
        }
    }
}

