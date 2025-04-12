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

public final class y10$a
implements gx0_2 {
    public static final y10$a a;

    static {
        y10$a y10$a;
        a = y10$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block8: {
            block7: {
                float f5;
                String string2;
                int n3;
                block6: {
                    object = (wr1_2)object;
                    object2 = (b30_0)object2;
                    object3 = (Number)object3;
                    n3 = ((Number)object3).intValue();
                    string2 = "$this$item";
                    Intrinsics.checkNotNullParameter(object, string2);
                    int n4 = n3 & 0x51;
                    n3 = 16;
                    f5 = 2.2E-44f;
                    if (n4 != n3 || (n4 = (int)(object2.h() ? 1 : 0)) == 0) break block6;
                    object2.D();
                    break block7;
                }
                object = LP1$a.b;
                n3 = 1065353216;
                object = j.c((LP1)object, 1.0f);
                f5 = uq0_0.o;
                object = h.e((LP1)object, f5);
                object3 = Nc$a.e;
                string2 = null;
                object3 = HA.e((Nc)object3, false);
                int n7 = object2.F();
                Object object4 = object2.m();
                object = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object2.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object2.A();
                bl2 = object2.e();
                if (bl2) {
                    object2.C((Function0)((Object)serializable));
                } else {
                    object2.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object2, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object2, object4, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = object2.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = object2.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object2, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object2, object, (Function2)object3);
                long l2 = nz_1.h;
                int n8 = 48;
                int n10 = 29;
                n7 = 0;
                string2 = null;
                bl2 = false;
                mp2 = null;
                long l3 = 0L;
                pB2.a(null, l2, 0.0f, l3, 0, (b30_0)object2, n8, n10);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

