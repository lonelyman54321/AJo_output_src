/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ld3$c
implements Function2 {
    public final /* synthetic */ ld3_1 a;

    public Ld3$c(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                block6: {
                    int n3;
                    object = (b30_0)object;
                    int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = j.c;
                Object object3 = HA.e(Nc$a.e, false);
                int n7 = object.F();
                Object object4 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
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
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = object.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object3 = this.a;
                object2 = new pd3_1((ld3_1)object3);
                rB0.a((Function0)object2, (b30_0)object, 0);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

