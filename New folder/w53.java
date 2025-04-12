/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class w53 {
    public static final void a(LP1 lP1, u10 u102, b30_0 object, int n3) {
        block12: {
            Serializable serializable;
            block11: {
                int n4;
                int n7;
                block10: {
                    object = object.g(-2105228848);
                    n7 = n3 & 6;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                        n7 = n7 != 0 ? 4 : 2;
                        n7 |= n3;
                    } else {
                        n7 = n3;
                    }
                    int n8 = n3 & 0x30;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).x(u102) ? 1 : 0);
                        n8 = n8 != 0 ? 32 : 16;
                        n7 |= n8;
                    }
                    if ((n8 = n7 & 0x13) != (n4 = 18) || (n8 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block10;
                    ((j30_0)object).D();
                    break block11;
                }
                Object object2 = u53.a;
                n4 = n7 >> 3 & 0xE | 0x180;
                n7 = n7 << 3 & 0x70 | n4;
                n4 = ((j30_0)object).P;
                Object object3 = ((j30_0)object).P();
                LP1 lP12 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable2 = N20$a.b;
                n7 = n7 << 6 & 0x380 | 6;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block12;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable2));
                } else {
                    ((j30_0)object).n();
                }
                serializable2 = N20$a.e;
                Ow3.a((b30_0)object, object2, (Function2)((Object)serializable2));
                object2 = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)object2);
                object2 = N20$a.f;
                boolean bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), serializable2 = Integer.valueOf(n4)))) {
                    rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object2);
                }
                object2 = N20$a.c;
                Ow3.a((b30_0)object, lP12, (Function2)object2);
                serializable = Integer.valueOf(n7 >> 6 & 0xE);
                u102.invoke(object, serializable);
                n7 = 1;
                ((j30_0)object).T(n7 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                serializable = new v53(lP1, u102, n3);
                ((CF2)object).d = serializable;
            }
            return;
        }
        s20.a();
        throw null;
    }
}

