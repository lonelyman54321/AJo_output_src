/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class R10$a
implements hx0_2 {
    public static final R10$a a;

    static {
        R10$a r10$a;
        a = r10$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block8: {
            block7: {
                float f5;
                block6: {
                    object = (wr1_2)object;
                    object2 = (Number)object2;
                    ((Number)object2).intValue();
                    object3 = (b30_0)object3;
                    int n3 = ((Number)object4).intValue();
                    object4 = "$this$items";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    int n4 = n3 & 0x281;
                    n3 = 128;
                    f5 = 1.8E-43f;
                    if (n4 != n3 || (n4 = (int)(object3.h() ? 1 : 0)) == 0) break block6;
                    object3.D();
                    break block7;
                }
                object = LP1$a.b;
                float f6 = uq0_0.o;
                int n7 = 10;
                float f7 = 0.0f;
                Object object5 = object;
                object2 = h.i((LP1)object, f6, 0.0f, f6, 0.0f, n7);
                object4 = zp.c;
                object5 = Nc$a.m;
                object4 = oZ.a((zp$l)object4, (Gx$a)object5, (b30_0)object3, 0);
                int n8 = object3.F();
                Object object6 = object3.m();
                object2 = a30_0.c((b30_0)object3, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object3.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object3.A();
                bl2 = object3.e();
                if (bl2) {
                    object3.C((Function0)((Object)serializable));
                } else {
                    object3.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object3, object4, (Function2)((Object)serializable));
                object4 = N20$a.d;
                Ow3.a((b30_0)object3, object6, (Function2)object4);
                object4 = N20$a.f;
                boolean bl3 = object3.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = object3.v(), serializable = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object3, n8, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object3, object2, (Function2)object4);
                f5 = uq0_0.E;
                object4 = j.h((LP1)object, f5);
                object5 = SP2.a;
                object4 = x20_0.f(QV.a((LP1)object4, (i13)object5));
                HA.a((LP1)object4, (b30_0)object3, 0);
                f7 = uq0_0.g;
                bl3 = false;
                object6 = null;
                n7 = 13;
                bl2 = false;
                f6 = 0.0f;
                mp2 = null;
                object5 = object;
                object = j.k(h.i((LP1)object, 0.0f, f7, 0.0f, 0.0f, n7), f5);
                f5 = uq0_0.m;
                object = x20_0.f(j.d((LP1)object, f5));
                HA.a((LP1)object, (b30_0)object3, 0);
                object3.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

