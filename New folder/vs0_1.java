/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vS0
 */
public final class vs0_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;

    public vs0_1(u10 u102) {
        this.c = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                float f5;
                block6: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    int n3 = ((Number)object2).intValue() & 3;
                    int n4 = 2;
                    f5 = 2.8E-45f;
                    if (n3 != n4 || (n3 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = LP1$a.b;
                f5 = zs0_0.a;
                object2 = j.a((LP1)object2, f5, f5);
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
                object2 = 0;
                object3 = this.c;
                object3.invoke(object, object2);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

