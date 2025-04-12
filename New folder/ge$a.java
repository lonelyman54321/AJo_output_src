/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ge$a
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public ge$a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block8: {
            block7: {
                float f5;
                int n3;
                Object object4;
                int n4;
                Object object5;
                Object object6;
                Object object7;
                ge$a ge$a;
                block6: {
                    ge$a = this;
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n4 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    n3 = n4 & 0x51;
                    n4 = 16;
                    f5 = 2.2E-44f;
                    if (n3 != n4 || (n3 = (int)(object6.h() ? 1 : 0)) == 0) break block6;
                    object6.D();
                    break block7;
                }
                object7 = zp.f;
                object4 = Nc$a.k;
                Object object8 = LP1$a.b;
                Object object9 = j.c((LP1)object8, 1.0f);
                f5 = n4;
                object5 = h.e((LP1)object9, f5);
                int n7 = 54;
                object7 = iQ2.a((zp$e)object7, (Gx$b)object4, (b30_0)object6, n7);
                int n8 = object6.F();
                object9 = object6.m();
                object5 = a30_0.c((b30_0)object6, (LP1)object5);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object6.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object6.A();
                bl2 = object6.e();
                if (bl2) {
                    object6.C((Function0)((Object)serializable));
                } else {
                    object6.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object6, object7, (Function2)((Object)serializable));
                object7 = N20$a.d;
                Ow3.a((b30_0)object6, object9, (Function2)object7);
                object7 = N20$a.f;
                n7 = (int)(object6.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object9 = object6.v(), serializable = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    re0_0.a(n8, (b30_0)object6, n8, (N20$a$a)object7);
                }
                object7 = N20$a.c;
                Ow3.a((b30_0)object6, object5, (Function2)object7);
                n3 = R$string.already_received_this_product;
                object5 = nk_0.f((b30_0)object6, n3);
                n3 = 12;
                long l2 = Em3.f(n3);
                long l3 = xx_1.g;
                tv0_0 tv0_02 = tv0_0.o;
                av0_0 av0_02 = y20_0.a;
                long l4 = l2;
                LP1$a lP1$a = object8;
                object8 = tv0_02;
                object = object6;
                object6 = av0_02;
                Ll3.b((String)object5, null, l3, l2, null, tv0_02, av0_02, 0L, null, null, 0L, 0, false, 0, 0, null, null, (b30_0)object, 1772928, 0, 130962);
                n4 = R$string.mark_as_delivered;
                object6 = object;
                object5 = nk_0.f((b30_0)object, n4);
                l4 = Em3.f(n3);
                l3 = xx_1.h;
                object4 = ge$a.a;
                SelectedOrderItem selectedOrderItem = ge$a.b;
                object7 = new fe_2((qz1_2)object4, selectedOrderItem);
                n8 = 0;
                object8 = lP1$a;
                object4 = d.b(lP1$a, false, null, (Function0)object7, 7);
                int n10 = 130960;
                selectedOrderItem = null;
                long l7 = 0L;
                long l8 = 0L;
                int n14 = 1772928;
                object8 = tv0_02;
                object7 = object;
                object6 = av0_02;
                Ll3.b((String)object5, (LP1)object4, l3, l4, null, tv0_02, av0_02, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object, n14, 0, n10);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

