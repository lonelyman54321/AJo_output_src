/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from Te2
 */
public final class te2_1
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ qz1_2 e;
    public final /* synthetic */ CartOrder f;
    public final /* synthetic */ ft1_2 g;
    public final /* synthetic */ Ref$IntRef h;

    public te2_1(List list, c80 c802, qz1_2 qz1_22, CartOrder cartOrder, ft1_2 ft1_22, Ref$IntRef ref$IntRef) {
        this.c = list;
        this.d = c802;
        this.e = qz1_22;
        this.f = cartOrder;
        this.g = ft1_22;
        this.h = ref$IntRef;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        object = (wr1_2)object;
        object2 = (Number)object2;
        int n4 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        int n7 = ((Number)(object4 = (Number)object4)).intValue();
        int n8 = n7 & 6;
        if (n8 == 0) {
            n3 = (int)(object3.J(object) ? 1 : 0);
            n3 = n3 != 0 ? 4 : 2;
            n3 |= n7;
        } else {
            n3 = n7;
        }
        if ((n7 &= 0x30) == 0) {
            n7 = (int)(object3.c(n4) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n3 |= n7;
        }
        if ((n3 &= 0x93) == (n7 = 146) && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            boolean bl2;
            Object object5 = object = this.c.get(n4);
            object5 = (CartEntry)object;
            object3.K(409050457);
            boolean bl3 = ((CartEntry)object5).isExchangeItem();
            object = no_2.b((CartEntry)object5);
            object2 = "CANCELLED";
            n3 = (int)(((String)object2).equalsIgnoreCase((String)object) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(((String)(object2 = "CANCELLATION_REQUESTED")).equalsIgnoreCase((String)(object = no_2.b((CartEntry)object5))) ? 1 : 0)) == 0) {
                n3 = 0;
                object = null;
                bl2 = false;
            } else {
                n3 = 1;
                bl2 = true;
            }
            object = LP1$a.b;
            long l2 = OX.f;
            n4 = 10;
            float f5 = n4;
            object2 = SP2.a(f5);
            object = a.b((LP1)object, l2, (i13)object2);
            ft1_2 ft1_22 = this.g;
            Ref$IntRef ref$IntRef = this.h;
            Object object6 = this.d;
            Object object7 = this.e;
            CartOrder cartOrder = this.f;
            object2 = new qe2_1(bl2, bl3, (i90_0)object6, (qz1_2)object7, cartOrder, (CartEntry)object5, ft1_22, ref$IntRef);
            n7 = -1064780301;
            object6 = v10.c(n7, (fx0_2)object2, (b30_0)object3);
            int n10 = 3072;
            int n14 = 6;
            bl2 = false;
            bl3 = false;
            object7 = object3;
            OA.a((LP1)object, null, false, (u10)object6, (b30_0)object3, n10, n14);
            object3.E();
        }
        return Unit.a;
    }
}

