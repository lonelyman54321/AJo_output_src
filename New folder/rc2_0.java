/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rc2
 */
public final class rc2_0
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public rc2_0(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, md2_2 md2_22, nb_1 nb_12) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        this.c = md2_22;
        this.d = nb_12;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block8: {
            block7: {
                int n3;
                int n4;
                Object object4;
                int n7;
                Object object5;
                Object object6;
                Object object7;
                rc2_0 rc2_02;
                block6: {
                    rc2_02 = this;
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n7 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    n4 = n7 & 0x51;
                    n3 = 16;
                    if (n4 != n3 || (n4 = (int)(object6.h() ? 1 : 0)) == 0) break block6;
                    object6.D();
                    break block7;
                }
                object7 = LP1$a.b;
                object5 = zp.c;
                object4 = Nc$a.m;
                boolean bl2 = false;
                float f5 = 0.0f;
                object5 = oZ.a((zp$l)object5, (Gx$a)object4, (b30_0)object6, 0);
                int n8 = object6.F();
                Object object8 = object6.m();
                Object object9 = a30_0.c((b30_0)object6, (LP1)object7);
                N20.W.getClass();
                Object object10 = N20$a.b;
                mp mp2 = object6.i();
                int n10 = mp2 instanceof mp;
                if (n10 == 0) break block8;
                object6.A();
                n10 = object6.e();
                if (n10 != 0) {
                    object6.C((Function0)object10);
                } else {
                    object6.n();
                }
                object10 = N20$a.e;
                Ow3.a((b30_0)object6, object5, (Function2)object10);
                object5 = N20$a.d;
                Ow3.a((b30_0)object6, object8, (Function2)object5);
                object5 = N20$a.f;
                bl2 = object6.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object8 = object6.v(), object10 = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object6, n8, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object6, object9, (Function2)object5);
                n7 = R$string.return_ex_orders;
                object5 = nk_0.f((b30_0)object6, n7);
                long l2 = Em3.f(n3);
                Object object11 = tv0_0.o;
                av0_0 av0_02 = y20_0.a;
                long l3 = xx_1.e;
                Object object12 = object11;
                object = object6;
                object6 = av0_02;
                object11 = object;
                Ll3.b((String)object5, null, l3, l2, null, (tv0_0)object12, av0_02, 0L, null, null, 0L, 0, false, 0, 0, null, null, (b30_0)object, 1772928, 0, 130962);
                n7 = R$string.return_ex_orders_attempted_msg;
                object6 = object;
                object12 = nk_0.f((b30_0)object, n7);
                long l4 = Em3.f(12);
                object11 = tv0_0.m;
                float f6 = 8;
                object5 = object7;
                f5 = f6;
                object4 = h.i((LP1)object7, 0.0f, f6, 0.0f, 0.0f, 13);
                long l7 = Em3.f(18);
                int n14 = 6;
                int n15 = 129936;
                long l8 = 0L;
                f6 = 0.0f;
                int n16 = 1772976;
                object5 = object12;
                l2 = l4;
                object12 = object11;
                object6 = av0_02;
                object11 = object;
                Ll3.b((String)object5, (LP1)object4, l3, l4, null, (tv0_0)object12, av0_02, l8, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object, n16, n14, n15);
                float f7 = 182;
                object5 = j.d((LP1)object7, f7);
                object4 = rc2_02.a;
                object8 = (md2_2)rc2_02.c;
                object9 = rc2_02.b;
                object6 = new en0_2(object4, 1, object9, object8);
                int n17 = 6;
                int n18 = 254;
                mp2 = null;
                n3 = 0;
                xq1_0.a((LP1)object5, null, null, false, null, null, null, false, (Function1)object6, (b30_0)object, n17, n18);
                n7 = 1065353216;
                f7 = 1.0f;
                object4 = j.c((LP1)object7, f7);
                n4 = 16;
                float f8 = n4;
                object5 = h.i((LP1)object4, 0.0f, f8, 0.0f, f5, 5);
                object4 = (nb_1)rc2_02.d;
                object7 = new nc2_1((nb_1)object4);
                object12 = object;
                object9 = v10.c(-1382196956, (fx0_2)object7, (b30_0)object);
                n10 = 3078;
                int n19 = 6;
                n8 = 0;
                object4 = null;
                bl2 = false;
                f5 = 0.0f;
                object8 = null;
                object10 = object;
                OA.a((LP1)object5, null, false, (u10)object9, (b30_0)object, n10, n19);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

