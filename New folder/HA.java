/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class HA {
    public static final HashMap a = HA.c(true);
    public static final HashMap b = HA.c(false);
    public static final HA$b c = HA$b.a;

    /*
     * WARNING - void declaration
     */
    public static final void a(LP1 lP1, b30_0 object, int bl2) {
        block13: {
            block12: {
                block11: {
                    boolean bl3;
                    void var3_10;
                    object = object.g(-211209833);
                    int bl32 = bl2 & 6;
                    int n3 = 2;
                    if (bl32 == 0) {
                        void var3_7;
                        boolean bl4 = ((j30_0)object).J(lP1);
                        if (bl4) {
                            int n4 = 4;
                        } else {
                            int n7 = 2;
                        }
                        int n8 = var3_7 | bl2;
                    } else {
                        boolean bl5 = bl2;
                    }
                    int n10 = var3_10 & 3;
                    if (n10 != n3 || !(bl3 = ((j30_0)object).h())) break block11;
                    ((j30_0)object).D();
                    break block12;
                }
                int n14 = ((j30_0)object).P;
                Object object2 = a30_0.c((b30_0)object, lP1);
                Object object3 = ((j30_0)object).P();
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                Object object4 = ((j30_0)object).a;
                boolean bl6 = object4 instanceof mp;
                if (!bl6) break block13;
                ((j30_0)object).A();
                bl6 = ((j30_0)object).O;
                if (bl6) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                object4 = c;
                Ow3.a((b30_0)object, object4, (Function2)((Object)serializable));
                serializable = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = N20$a.f;
                boolean bl7 = ((j30_0)object).O;
                if (bl7 || !(bl7 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), serializable = Integer.valueOf(n14)))) {
                    rk_0.a(n14, (j30_0)object, n14, (N20$a$a)object2);
                }
                boolean bl8 = true;
                ((j30_0)object).T(bl8);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                HA$a hA$a = new HA$a(lP1, bl2 ? 1 : 0);
                ((CF2)object).d = hA$a;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(Ns2$a ns2$a, Ns2 ns2, xk1_0 object, bp1_0 bp1_02, int n3, int n4, Nc nc) {
        int n7;
        boolean bl2 = (object = object.B()) instanceof ga_0;
        if (bl2) {
            object = (ga_0)object;
        } else {
            n7 = 0;
            object = null;
        }
        Object object2 = object != null && (object = ((ga_0)object).n) != null ? object : nc;
        n7 = ns2.a;
        int n8 = ns2.b;
        long l2 = dj1.a(n7, n8);
        long l3 = dj1.a(n3, n4);
        long l4 = object2.a(l2, l3, bp1_02);
        Ns2$a.e(ns2$a, ns2, l4);
    }

    public static final HashMap c(boolean bl2) {
        HashMap hashMap = new HashMap(9);
        Gx gx = Nc$a.a;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.b;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.c;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.d;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.e;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.f;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.g;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.h;
        HA.d(hashMap, bl2, gx);
        gx = Nc$a.i;
        HA.d(hashMap, bl2, gx);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean bl2, Gx gx) {
        IA iA = new IA(gx, bl2);
        hashMap.put(gx, iA);
    }

    public static final al1_1 e(Nc nc, boolean bl2) {
        Object object = bl2 ? a : b;
        if ((object = (al1_1)((HashMap)object).get(nc)) == null) {
            object = new IA(nc, bl2);
        }
        return object;
    }
}

