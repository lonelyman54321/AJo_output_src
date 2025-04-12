/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gb2
 */
public final class gb2_1
implements gx0_2 {
    public final /* synthetic */ Function2 a;

    public gb2_1(u10 u102) {
        this.a = u102;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block8: {
            block7: {
                float f5;
                int n3;
                block6: {
                    object = (PA)object;
                    object2 = (b30_0)object2;
                    object3 = (Number)object3;
                    n3 = ((Number)object3).intValue();
                    String string2 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object, string2);
                    int n4 = n3 & 0x51;
                    n3 = 16;
                    f5 = 2.2E-44f;
                    if (n4 != n3 || (n4 = (int)(object2.h() ? 1 : 0)) == 0) break block6;
                    object2.D();
                    break block7;
                }
                object = LP1$a.b;
                long l2 = OX.f;
                n3 = 12;
                f5 = n3;
                Object object4 = SP2.a;
                Object object5 = new ys0_0(f5);
                Object object6 = new ys0_0(f5);
                Object object7 = new ys0_0(f5);
                ys0_0 ys0_02 = new ys0_0(f5);
                object4 = new q90_0((t90_0)object5, (t90_0)object6, (t90_0)object7, ys0_02);
                object = androidx.compose.foundation.a.b((LP1)object, l2, (i13)object4);
                object3 = new Object();
                boolean bl2 = false;
                object4 = null;
                object = d.b((LP1)object, false, null, (Function0)object3, 6);
                object3 = HA.e(Nc$a.a, false);
                int n7 = object2.F();
                object5 = object2.m();
                object = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                object6 = N20$a.b;
                object7 = object2.i();
                boolean bl3 = object7 instanceof mp;
                if (!bl3) break block8;
                object2.A();
                bl2 = object2.e();
                if (bl2) {
                    object2.C((Function0)object6);
                } else {
                    object2.n();
                }
                object4 = N20$a.e;
                Ow3.a((b30_0)object2, object3, (Function2)object4);
                object3 = N20$a.d;
                Ow3.a((b30_0)object2, object5, (Function2)object3);
                object3 = N20$a.f;
                bl2 = object2.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object4 = object2.v(), object5 = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object2, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object2, object, (Function2)object3);
                object = 0;
                object3 = this.a;
                object3.invoke(object2, object);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

