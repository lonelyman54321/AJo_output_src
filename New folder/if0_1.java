/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from If0
 */
public final class if0_1 {
    public static final void a(boolean bl2, p93_0 p93_02, LP1 lP1, b30_0 b30_02, int n3) {
        block14: {
            Object object;
            Object object2;
            int n4;
            LP1 lP12;
            p93_0 p93_03;
            boolean bl3;
            block13: {
                float f5;
                int n7;
                int n8;
                block12: {
                    bl3 = bl2;
                    p93_03 = p93_02;
                    lP12 = lP1;
                    n4 = n3;
                    Intrinsics.checkNotNullParameter(p93_02, "onClick");
                    int n10 = 218470797;
                    object2 = b30_02;
                    object = b30_02.g(n10);
                    n8 = n3 & 0xE;
                    n7 = 2;
                    f5 = 2.8E-45f;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
                        n8 = n8 != 0 ? 4 : 2;
                        n8 |= n4;
                    } else {
                        n8 = n3;
                    }
                    int n14 = n4 & 0x70;
                    if (n14 == 0) {
                        n14 = (int)(((j30_0)object).x(p93_03) ? 1 : 0);
                        n14 = n14 != 0 ? 32 : 16;
                        n8 |= n14;
                    }
                    if ((n14 = n4 & 0x380) == 0) {
                        n14 = (int)(((j30_0)object).J(lP12) ? 1 : 0);
                        n14 = n14 != 0 ? 256 : 128;
                        n8 |= n14;
                    }
                    if ((n8 &= 0x2DB) != (n14 = 146) || (n8 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block12;
                    ((j30_0)object).D();
                    break block13;
                }
                object2 = LP1$a.b;
                long l2 = bl3 ? OX.c : OX.b;
                boolean bl4 = true;
                f5 = bl3 ? (float)n7 : (float)bl4;
                int n15 = 24;
                float f6 = n15;
                Object object3 = j.h(lP12, f6);
                int n16 = 7;
                object3 = d.b((LP1)object3, false, null, p93_03, n16);
                rp2_0 rp2_02 = SP2.a;
                LP1 lP13 = gz.a((LP1)object3, f5, l2, rp2_02);
                object3 = HA.e(Nc$a.e, false);
                int n17 = ((j30_0)object).P;
                rq2_1 rq2_12 = ((j30_0)object).P();
                lP13 = a30_0.c((b30_0)object, lP13);
                N20$a n20$a = N20.W;
                n20$a.getClass();
                Serializable serializable = N20$a.b;
                Object object4 = ((j30_0)object).a;
                bl4 = object4 instanceof mp;
                if (!bl4) break block14;
                ((j30_0)object).A();
                bl4 = ((j30_0)object).O;
                if (bl4) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                object4 = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)object4);
                object4 = N20$a.d;
                Ow3.a((b30_0)object, rq2_12, (Function2)object4);
                object4 = N20$a.f;
                n15 = (int)(((j30_0)object).O ? 1 : 0);
                if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object).v(), serializable = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                    rk_0.a(n17, (j30_0)object, n17, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, lP13, (Function2)object4);
                n7 = -125646480;
                f5 = -2.1221382E34f;
                ((j30_0)object).K(n7);
                if (bl3) {
                    n7 = 15;
                    f5 = n7;
                    object2 = a.b(j.h((LP1)object2, f5), l2, rp2_02);
                    HA.a((LP1)object2, (b30_0)object, 0);
                }
                ((j30_0)object).T(false);
                n8 = 1;
                ((j30_0)object).T(n8 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new hf0_2(bl3, p93_03, lP12, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

