/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class De2$I
implements gx0_2 {
    public final /* synthetic */ String a;

    public De2$I(String string2) {
        this.a = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block8: {
            block7: {
                int n3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                block6: {
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    int n4 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    n3 = n4 & 0x51;
                    n4 = 16;
                    if (n3 != n4 || (n3 = (int)(object6.h() ? 1 : 0)) == 0) break block6;
                    object6.D();
                    break block7;
                }
                object7 = LP1$a.b;
                object5 = zp.c;
                object4 = Nc$a.m;
                boolean bl2 = false;
                object5 = oZ.a((zp$l)object5, (Gx$a)object4, (b30_0)object6, 0);
                int n7 = object6.F();
                Object object8 = object6.m();
                object7 = a30_0.c((b30_0)object6, (LP1)object7);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                Object object9 = object6.i();
                boolean bl3 = object9 instanceof mp;
                if (!bl3) break block8;
                object6.A();
                bl3 = object6.e();
                if (bl3) {
                    object6.C((Function0)((Object)serializable));
                } else {
                    object6.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object6, object5, (Function2)((Object)serializable));
                object5 = N20$a.d;
                Ow3.a((b30_0)object6, object8, (Function2)object5);
                object5 = N20$a.f;
                bl2 = object6.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object8 = object6.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object6, n7, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object6, object7, (Function2)object5);
                object7 = new StringBuilder("Return ID: ");
                object9 = this;
                object5 = this.a;
                ((StringBuilder)object7).append((String)object5);
                object5 = ((StringBuilder)object7).toString();
                n3 = 12;
                long l2 = Em3.f(n3);
                object7 = tv0_0.m;
                long l3 = xx_1.e;
                int n8 = 131026;
                n7 = 0;
                object4 = null;
                long l4 = 0L;
                long l7 = 0L;
                int n10 = 200064;
                Object object10 = object6;
                object6 = object7;
                Ll3.b((String)object5, null, l3, l2, null, (tv0_0)object7, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object10, n10, 0, n8);
                object10.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

