/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Order.CartOrder;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from wc2
 */
public final class wc2_1
implements gx0_2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ Ref$IntRef b;

    public wc2_1(CartOrder cartOrder, Ref$IntRef ref$IntRef) {
        this.a = cartOrder;
        this.b = ref$IntRef;
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
                wc2_1 wc2_12;
                block6: {
                    wc2_12 = this;
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
                object5 = oZ.a((zp$l)object5, (Gx$a)object4, (b30_0)object6, 0);
                int n8 = object6.F();
                Object object8 = object6.m();
                LP1 lP1 = a30_0.c((b30_0)object6, (LP1)object7);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object6.i();
                boolean bl3 = mp2 instanceof mp;
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
                if (bl2 || !(bl2 = Intrinsics.areEqual(object8 = object6.v(), serializable = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object6, n8, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object6, lP1, (Function2)object5);
                n7 = R$string.download_invoice;
                object5 = nk_0.f((b30_0)object6, n7);
                long l2 = Em3.f(n3);
                Object object9 = tv0_0.o;
                long l3 = xx_1.e;
                long l4 = l2;
                object = object6;
                object6 = object9;
                object9 = object;
                Ll3.b((String)object5, null, l3, l2, null, (tv0_0)object6, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (b30_0)object, 200064, 0, 131026);
                n7 = R$string.invoice_available_only_after_product_delivery;
                object6 = object;
                object5 = nk_0.f((b30_0)object, n7);
                l4 = Em3.f(12);
                object9 = tv0_0.m;
                float f5 = 8;
                float f6 = 24;
                int n10 = 5;
                Object object10 = object7;
                object4 = h.i((LP1)object7, 0.0f, f5, 0.0f, f6, n10);
                int n14 = 131024;
                long l7 = 0L;
                f6 = 0.0f;
                long l8 = 0L;
                int n15 = 200112;
                object6 = object9;
                object9 = object;
                Ll3.b((String)object5, (LP1)object4, l3, l4, null, (tv0_0)object6, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object, n15, 0, n14);
                n7 = 1065353216;
                float f7 = 1.0f;
                object5 = j.c((LP1)object7, f7);
                n4 = 16;
                float f8 = n4;
                zp$i zp$i = zp.g(f8);
                object7 = wc2_12.a;
                object4 = wc2_12.b;
                object10 = new rc2_1((CartOrder)object7, (Ref$IntRef)object4);
                int n16 = 24582;
                f5 = 3.4447E-41f;
                int n17 = 238;
                n8 = 0;
                object4 = null;
                bl2 = false;
                object8 = null;
                lP1 = null;
                serializable = null;
                bl3 = false;
                mp2 = null;
                object6 = null;
                xq1_0.a((LP1)object5, null, null, false, zp$i, null, null, false, (Function1)object10, (b30_0)object, n16, n17);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

