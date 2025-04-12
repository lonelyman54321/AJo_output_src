/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pc1
 */
public final class pc1_0 {
    public static final float a = 24;

    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Function0 function0, LP1 lP1, boolean bl2, wr1_1 wr1_12, u10 u102, b30_0 b30_02, int n3, int n4) {
        CF2 cF2;
        Object object;
        Object object2;
        wr1_1 wr1_13;
        float f5;
        int n7;
        Object object3;
        int n8;
        int n10;
        Object object4;
        Object object5;
        int n14;
        int n15;
        u10 u103;
        block16: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            u103 = u102;
                            n15 = n3;
                            n14 = 2;
                            int n16 = -111063634;
                            object5 = b30_02;
                            object4 = b30_02.g(n16);
                            int n17 = n3 & 6;
                            if (n17 == 0) {
                                object5 = function0;
                                n10 = ((j30_0)object4).x(function0) ? 1 : 0;
                                n10 = n10 != 0 ? 4 : 2;
                                n10 |= n15;
                            } else {
                                object5 = function0;
                                n10 = n3;
                            }
                            n14 = n4 & 2;
                            if (n14 == 0) break block12;
                            n10 |= 0x30;
                            break block13;
                        }
                        n8 = n15 & 0x30;
                        if (n8 != 0) break block13;
                        object3 = lP1;
                        n7 = ((j30_0)object4).J(lP1);
                        if (n7 == 0) break block14;
                        n7 = 32;
                        f5 = 4.5E-44f;
                        break block15;
                    }
                    object3 = lP1;
                    break block16;
                }
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n10 |= n7;
        }
        n10 |= 0xD80;
        n7 = n15 & 0x6000;
        if (n7 == 0) {
            n7 = ((j30_0)object4).x(u103) ? 1 : 0;
            if (n7 != 0) {
                n7 = 16384;
                f5 = 2.2959E-41f;
            } else {
                n7 = 8192;
                f5 = 1.148E-41f;
            }
            n10 |= n7;
        }
        n7 = n10 & 0x2493;
        int n18 = 9362;
        float f6 = 1.3119E-41f;
        if (n7 == n18 && (n7 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            n10 = bl2 ? 1 : 0;
            wr1_13 = wr1_12;
        } else {
            Integer n19;
            object2 = n14 != 0 ? LP1$a.b : object3;
            object3 = lj1.a;
            object3 = MinimumInteractiveModifier.b;
            object3 = object2.then((LP1)object3);
            f6 = a;
            long l2 = 0L;
            n7 = 0;
            f5 = 0.0f;
            int n20 = 54;
            Object object6 = object4;
            object = vp2_0.a(false, f6, l2, (b30_0)object4, n20, 4);
            object6 = new CP2(0);
            int n21 = 8;
            wr1_13 = null;
            boolean bl3 = true;
            Object object7 = object3;
            cF2 = null;
            f6 = 0.0f;
            object3 = d.a((LP1)object3, null, (Lg1)object, bl3, (CP2)object6, function0, n21);
            object7 = HA.e(Nc$a.e, false);
            n18 = ((j30_0)object4).P;
            object = ((j30_0)object4).P();
            object3 = a30_0.c((b30_0)object4, (LP1)object3);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            object6 = ((j30_0)object4).a;
            boolean bl4 = object6 instanceof mp;
            if (!bl4) {
                s20.a();
                throw null;
            }
            ((j30_0)object4).A();
            bl4 = ((j30_0)object4).O;
            if (bl4) {
                ((j30_0)object4).C(xp1$a);
            } else {
                ((j30_0)object4).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object4, object7, n20$a$b);
            object7 = N20$a.d;
            Ow3.a((b30_0)object4, object, (Function2)object7);
            object7 = N20$a.f;
            boolean bl5 = ((j30_0)object4).O;
            if (bl5 || !(bl5 = Intrinsics.areEqual(object = ((j30_0)object4).v(), n19 = Integer.valueOf(n18)))) {
                rk_0.a(n18, (j30_0)object4, n18, (N20$a$a)object7);
            }
            object7 = N20$a.c;
            Ow3.a((b30_0)object4, object3, (Function2)object7);
            n8 = 1885392311;
            ((j30_0)object4).K(n8);
            object3 = s60_0.a;
            f5 = ((Number)((j30_0)object4).j((H30)object3)).floatValue();
            ((j30_0)object4).T(false);
            object7 = Float.valueOf(f5);
            object3 = ((nw0_1)object3).c(object7);
            n10 = n10 >> 9 & 0x70;
            n7 = 8;
            f5 = 1.1E-44f;
            L30.a((MB2)object3, u103, (b30_0)object4, n10 |= n7);
            ((j30_0)object4).T(true);
            object3 = object2;
            n10 = 1;
        }
        cF2 = ((j30_0)object4).X();
        if (cF2 != null) {
            object2 = object;
            object4 = function0;
            object5 = object3;
            object3 = wr1_13;
            u103 = u102;
            n15 = n3;
            n7 = n4;
            cF2.d = object = new oc1_1(function0, (LP1)object5, n10 != 0, wr1_13, u102, n3, n4);
        }
    }
}

