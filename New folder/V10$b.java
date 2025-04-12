/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class V10$b
implements Function2 {
    public static final V10$b a;

    static {
        V10$b v10$b;
        a = v10$b = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        block14: {
            block15: {
                block16: {
                    block13: {
                        Integer n3;
                        Object object3;
                        float f5;
                        float f6;
                        int n4;
                        Object object4;
                        Object object5;
                        block12: {
                            boolean bl2;
                            object5 = object;
                            object5 = (b30_0)object;
                            object4 = object2;
                            object4 = (Number)object2;
                            int bl3 = ((Number)object4).intValue();
                            n4 = 11;
                            f6 = 1.5E-44f;
                            int n7 = bl3 & n4;
                            int n8 = 2;
                            f5 = 2.8E-45f;
                            if (n7 != n8 || !(bl2 = object5.h())) break block12;
                            object5.D();
                            break block13;
                        }
                        object4 = LP1$a.b;
                        Object object6 = j.c;
                        Object object7 = zp.a;
                        Object object8 = Nc$a.j;
                        int n10 = 0;
                        Object object9 = null;
                        object7 = iQ2.a((zp$e)object7, (Gx$b)object8, (b30_0)object5, 0);
                        int n14 = object5.F();
                        Object object10 = object5.m();
                        Object object11 = a30_0.c((b30_0)object5, (LP1)object6);
                        N20.W.getClass();
                        Xp1$a xp1$a = N20$a.b;
                        Object object12 = object5.i();
                        boolean bl3 = object12 instanceof mp;
                        if (!bl3) break block14;
                        object5.A();
                        bl3 = object5.e();
                        if (bl3) {
                            object5.C(xp1$a);
                        } else {
                            object5.n();
                        }
                        object12 = N20$a.e;
                        Ow3.a((b30_0)object5, object7, (Function2)object12);
                        object7 = N20$a.d;
                        Ow3.a((b30_0)object5, object10, (Function2)object7);
                        object10 = N20$a.f;
                        boolean bl4 = object5.e();
                        if (bl4 || !(bl4 = Intrinsics.areEqual(object3 = object5.v(), n3 = Integer.valueOf(n14)))) {
                            re0_0.a(n14, (b30_0)object5, n14, (N20$a$a)object10);
                        }
                        object8 = N20$a.c;
                        Ow3.a((b30_0)object5, object11, (Function2)object8);
                        object3 = mq2_0.a;
                        float f7 = 1.0f;
                        object11 = j.b((LP1)object4, f7);
                        int n15 = 1057803469;
                        float f8 = 0.55f;
                        object11 = ((mq2_0)object3).a((LP1)object11, f8, true);
                        Object object13 = HA.e(Nc$a.a, false);
                        int n16 = object5.F();
                        object9 = object5.m();
                        object11 = a30_0.c((b30_0)object5, (LP1)object11);
                        mp mp2 = object5.i();
                        boolean bl5 = mp2 instanceof mp;
                        if (!bl5) break block15;
                        object5.A();
                        bl5 = object5.e();
                        if (bl5) {
                            object5.C(xp1$a);
                        } else {
                            object5.n();
                        }
                        Ow3.a((b30_0)object5, object13, (Function2)object12);
                        Ow3.a((b30_0)object5, object9, (Function2)object7);
                        n10 = object5.e();
                        if (n10 != 0 || (n10 = Intrinsics.areEqual(object9 = object5.v(), object13 = Integer.valueOf(n16))) == 0) {
                            re0_0.a(n16, (b30_0)object5, n16, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object5, object11, (Function2)object8);
                        object11 = zp.d;
                        object9 = Nc$a.k;
                        object6 = dz3_0.a((LP1)object6);
                        n16 = 54;
                        object11 = iQ2.a((zp$e)object11, (Gx$b)object9, (b30_0)object5, n16);
                        n10 = object5.F();
                        Object object14 = object5.m();
                        object6 = a30_0.c((b30_0)object5, (LP1)object6);
                        object13 = object5.i();
                        n15 = object13 instanceof mp;
                        if (n15 == 0) break block16;
                        object5.A();
                        n15 = (int)(object5.e() ? 1 : 0);
                        if (n15 != 0) {
                            object5.C(xp1$a);
                        } else {
                            object5.n();
                        }
                        Ow3.a((b30_0)object5, object11, (Function2)object12);
                        Ow3.a((b30_0)object5, object14, (Function2)object7);
                        int n17 = object5.e();
                        if (n17 != 0 || (n17 = Intrinsics.areEqual(object7 = object5.v(), object11 = Integer.valueOf(n10))) == 0) {
                            re0_0.a(n10, (b30_0)object5, n10, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object5, object6, (Function2)object8);
                        f5 = 58;
                        object6 = j.k((LP1)object4, f5);
                        f6 = n4;
                        object6 = j.d((LP1)object6, f6);
                        long l2 = xx_1.Y;
                        object14 = fg2_1.a;
                        object6 = androidx.compose.foundation.a.b((LP1)object6, l2, (i13)object14);
                        Q93.b((b30_0)object5, (LP1)object6);
                        float f11 = 8;
                        n14 = 0;
                        object8 = null;
                        int n18 = 14;
                        object10 = null;
                        object11 = null;
                        object6 = object4;
                        object6 = h.i((LP1)object4, f11, 0.0f, 0.0f, 0.0f, n18);
                        n17 = 12;
                        f11 = n17;
                        object6 = j.k((LP1)object6, f11);
                        LP1 lP1 = androidx.compose.foundation.a.b(j.d((LP1)object6, f6), l2, (i13)object14);
                        Q93.b((b30_0)object5, lP1);
                        object5.p();
                        object5.p();
                        object4 = j.b((LP1)object4, f7);
                        boolean bl6 = true;
                        f5 = Float.MIN_VALUE;
                        object4 = androidx.compose.foundation.a.b(((mq2_0)object3).a((LP1)object4, 0.45f, bl6), l2, (i13)object14);
                        n4 = 0;
                        f6 = 0.0f;
                        lP1 = null;
                        HA.a((LP1)object4, (b30_0)object5, 0);
                        object5.p();
                    }
                    return Unit.a;
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

