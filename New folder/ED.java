/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ED
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;

    public ED(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block9: {
            block8: {
                int n3;
                Object object4;
                block7: {
                    object = (PA)object;
                    object2 = (b30_0)object2;
                    object3 = (Number)object3;
                    int n4 = ((Number)object3).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    n3 = n4 & 0xE;
                    if (n3 == 0) {
                        n3 = (int)(object2.J(object) ? 1 : 0);
                        n3 = n3 != 0 ? 4 : 2;
                        n4 |= n3;
                    }
                    if ((n4 &= 0x5B) != (n3 = 18) || (n4 = (int)(object2.h() ? 1 : 0)) == 0) break block7;
                    object2.D();
                    break block8;
                }
                object3 = LP1$a.b;
                object4 = Nc$a.e;
                object = object.a((LP1)object3, (Nc)object4);
                object3 = Nc$a.a;
                n3 = 0;
                object4 = null;
                object3 = HA.e((Nc)object3, false);
                int n7 = object2.F();
                Object object5 = object2.m();
                object = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object2.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block9;
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
                Ow3.a((b30_0)object2, object5, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = object2.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = object2.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object2, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object2, object, (Function2)object3);
                object3 = this.a;
                n7 = 1;
                object = new ha_2(object3, n7);
                yd3_2.a((Function0)object, (b30_0)object2, 0);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

