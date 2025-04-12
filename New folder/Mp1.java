/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Mp1 {
    public static final void a(LP1 lP1, u10 u102, al1_1 al1_12, b30_0 object, int n3) {
        block14: {
            Serializable serializable;
            block13: {
                int n4;
                int n7;
                block12: {
                    int n8;
                    object = object.g(1949933075);
                    n7 = n3 & 6;
                    if (n7 == 0) {
                        n7 = ((j30_0)object).J(lP1) ? 1 : 0;
                        n7 = n7 != 0 ? 4 : 2;
                        n7 |= n3;
                    } else {
                        n7 = n3;
                    }
                    n4 = n3 & 0x30;
                    if (n4 == 0) {
                        n4 = ((j30_0)object).x(u102) ? 1 : 0;
                        n4 = n4 != 0 ? 32 : 16;
                        n7 |= n4;
                    }
                    if ((n4 = n3 & 0x180) == 0) {
                        n4 = ((j30_0)object).J(al1_12) ? 1 : 0;
                        n4 = n4 != 0 ? 256 : 128;
                        n7 |= n4;
                    }
                    if ((n4 = n7 & 0x93) != (n8 = 146) || (n4 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block12;
                    ((j30_0)object).D();
                    break block13;
                }
                n4 = ((j30_0)object).P;
                Object object2 = a30_0.c((b30_0)object, lP1);
                Object object3 = ((j30_0)object).P();
                Serializable serializable2 = xp1_0.K;
                n7 = n7 << 3 & 0x380 | 6;
                Object object4 = ((j30_0)object).a;
                boolean bl2 = object4 instanceof mp;
                if (!bl2) break block14;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable2));
                } else {
                    ((j30_0)object).n();
                }
                N20.W.getClass();
                serializable2 = N20$a.e;
                Ow3.a((b30_0)object, al1_12, (Function2)((Object)serializable2));
                serializable2 = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable2));
                boolean bl3 = ((j30_0)object).O;
                if (bl3) {
                    object3 = Unit.a;
                    object4 = kp1_1.c;
                    serializable2 = new nw3_0((Function1)object4);
                    ((j30_0)object).k(object3, (Function2)((Object)serializable2));
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = N20$a.f;
                bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), serializable2 = Integer.valueOf(n4)))) {
                    rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object2);
                }
                serializable = Integer.valueOf(n7 >> 6 & 0xE);
                u102.invoke(object, serializable);
                n7 = 1;
                ((j30_0)object).T(n7 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                serializable = new lp1_2(lP1, u102, al1_12, n3);
                ((CF2)object).d = serializable;
            }
            return;
        }
        s20.a();
        throw null;
    }
}

