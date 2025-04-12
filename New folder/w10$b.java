/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class w10$b
implements Function2 {
    public static final w10$b a;

    static {
        w10$b w10$b;
        a = w10$b = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                float f5;
                int n3;
                float f6;
                int n4;
                block6: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    int n7 = ((Number)object2).intValue();
                    n4 = 11;
                    f6 = 1.5E-44f;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if ((n7 &= n4) != n3 || (n7 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = LP1$a.b;
                n3 = 1065353216;
                f5 = 1.0f;
                LP1 lP1 = j.c((LP1)object2, f5);
                int n8 = 90;
                float f7 = n8;
                lP1 = dz3_0.a(j.d(lP1, f7));
                Object object3 = Nc$a.a;
                fG2$a fG2$a = null;
                object3 = HA.e((Nc)object3, false);
                int n10 = object.F();
                Object object4 = object.m();
                lP1 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)((Object)serializable));
                } else {
                    object.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = object.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = object.v(), serializable = Integer.valueOf(n10)))) {
                    re0_0.a(n10, (b30_0)object, n10, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, lP1, (Function2)object3);
                f5 = 16;
                object2 = h.e((LP1)object2, f5);
                long l2 = xx_1.X;
                fG2$a = fg2_1.a;
                object2 = androidx.compose.foundation.a.b((LP1)object2, l2, fG2$a);
                n3 = 63;
                f5 = n3;
                object2 = j.k((LP1)object2, f5);
                f6 = n4;
                object2 = j.d((LP1)object2, f6);
                Q93.b((b30_0)object, (LP1)object2);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

