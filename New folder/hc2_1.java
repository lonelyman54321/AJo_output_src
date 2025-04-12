/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hc2
 */
public final class hc2_1
implements gx0_2 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ ou0_0 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function1 d;

    public hc2_1(tr1_0 tr1_02, ou0_0 ou0_02, Function2 function2, Function1 function1) {
        this.a = tr1_02;
        this.b = ou0_02;
        this.c = function2;
        this.d = function1;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block9: {
            block8: {
                Object object4;
                int n3;
                Object object5;
                Object object6;
                Object object7;
                hc2_1 hc2_12;
                block7: {
                    hc2_12 = this;
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n3 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    int n4 = n3 & 0x51;
                    n3 = 16;
                    if (n4 != n3 || (n4 = (int)(object6.h() ? 1 : 0)) == 0) break block7;
                    object6.D();
                    break block8;
                }
                object7 = LP1$a.b;
                float f5 = 80;
                Object object8 = j.d((LP1)object7, f5);
                float f6 = n3;
                boolean bl2 = false;
                int n7 = 11;
                object5 = h.i((LP1)object8, 0.0f, 0.0f, f6, 0.0f, n7);
                long l2 = xx_1.m;
                int n8 = 8;
                float f7 = n8;
                Object object9 = SP2.a(f7);
                object5 = androidx.compose.foundation.a.b((LP1)object5, l2, (i13)object9);
                f5 = 0.7f;
                object5 = androidx.compose.foundation.layout.c.a((LP1)object5, f5);
                object4 = Nc$a.a;
                Object object10 = null;
                object4 = HA.e((Nc)object4, false);
                int n10 = object6.F();
                object9 = object6.m();
                object5 = a30_0.c((b30_0)object6, (LP1)object5);
                N20.W.getClass();
                Object object11 = N20$a.b;
                Object object12 = object6.i();
                boolean bl3 = object12 instanceof mp;
                if (!bl3) break block9;
                object6.A();
                bl3 = object6.e();
                if (bl3) {
                    object6.C((Function0)object11);
                } else {
                    object6.n();
                }
                object11 = N20$a.e;
                Ow3.a((b30_0)object6, object4, (Function2)object11);
                object4 = N20$a.d;
                Ow3.a((b30_0)object6, object9, (Function2)object4);
                object4 = N20$a.f;
                n8 = (int)(object6.e() ? 1 : 0);
                if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object9 = object6.v(), object11 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                    re0_0.a(n10, (b30_0)object6, n10, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object6, object5, (Function2)object4);
                object5 = androidx.compose.foundation.layout.d.a;
                object4 = hc2_12.a;
                object10 = (String)object4.getValue();
                object12 = new yo1_0(3, 6, 115);
                long l3 = Em3.f(30);
                tv0_0 tv0_02 = tv0_0.o;
                long l4 = 0L;
                int n14 = 0xFF7FF9;
                long l7 = 0L;
                long l8 = 0L;
                int n15 = 0;
                int n16 = 3;
                xm3 xm32 = new xm3(l7, l3, tv0_02, null, l8, null, n16, l4, n14);
                f7 = 1.0f;
                object7 = j.c((LP1)object7, f7);
                object9 = Nc$a.e;
                object7 = ((d)object5).a((LP1)object7, (Nc)object9);
                object5 = hc2_12.b;
                object7 = androidx.compose.ui.focus.c.a((LP1)object7, (ou0_0)object5);
                n3 = -310447864;
                object6.K(n3);
                object5 = hc2_12.c;
                n8 = (int)(object6.J(object5) ? 1 : 0);
                int n17 = object6.J(object4);
                n8 |= n17;
                object11 = hc2_12.d;
                int n4 = object6.J(object11);
                object8 = object6.v();
                if ((n8 |= n4) != 0 || object8 == (object9 = b30$a.a)) {
                    n8 = 1;
                    f7 = Float.MIN_VALUE;
                    object8 = new cn0_2(object5, n8, object4, object11);
                    object6.o(object8);
                }
                object4 = object8;
                object4 = (Function1)object8;
                object6.E();
                n16 = 0;
                int n18 = 65176;
                n8 = 0;
                f7 = 0.0f;
                object9 = null;
                boolean bl4 = false;
                object11 = null;
                boolean bl5 = false;
                object8 = null;
                bl2 = true;
                f6 = 0.0f;
                n7 = 0;
                tv0_02 = null;
                n15 = 102236160;
                object5 = object10;
                object10 = object7;
                object7 = object12;
                object12 = xm32;
                Object object13 = object6;
                object6 = object7;
                cx_0.a((String)object5, (Function1)object4, (LP1)object10, false, false, xm32, (yo1_0)object7, null, bl2, 0, 0, null, null, null, null, null, (b30_0)object13, n15, 0, n18);
                object13.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

