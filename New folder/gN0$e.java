/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class gN0$e
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;

    public gN0$e(ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                int n3;
                block6: {
                    object = (b30_0)object;
                    int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = LP1$a.b;
                long l2 = xx_1.m;
                Object object3 = fg2_1.a;
                object2 = androidx.compose.foundation.a.b((LP1)object2, l2, (i13)object3);
                Object object4 = j.c;
                object2 = object2.then((LP1)object4);
                object4 = Nc$a.a;
                ob0_1 ob0_12 = null;
                object4 = HA.e((Nc)object4, false);
                int n7 = object.F();
                object3 = object.m();
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
                Ow3.a((b30_0)object, object4, (Function2)((Object)serializable));
                object4 = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)object4);
                object4 = N20$a.f;
                boolean bl3 = object.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = object.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object4);
                object2 = this.b;
                n3 = 72;
                ob0_12 = this.a;
                gn0_2.a(ob0_12, (yT1)object2, (b30_0)object, n3);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

