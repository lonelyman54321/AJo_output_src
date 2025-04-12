/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Qe2
 */
public final class qe2_1
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ CartOrder e;
    public final /* synthetic */ CartEntry f;
    public final /* synthetic */ ft1_2 g;
    public final /* synthetic */ Ref$IntRef h;

    public qe2_1(boolean bl2, boolean bl3, i90_0 i90_02, qz1_2 qz1_22, CartOrder cartOrder, CartEntry cartEntry, ft1_2 ft1_22, Ref$IntRef ref$IntRef) {
        this.a = bl2;
        this.b = bl3;
        this.c = i90_02;
        this.d = qz1_22;
        this.e = cartOrder;
        this.f = cartEntry;
        this.g = ft1_22;
        this.h = ref$IntRef;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        qe2_1 qe2_12 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            object4 = LP1$a.b;
            f5 = 4;
            object4 = androidx.compose.foundation.layout.h.g((LP1)object4, f5, 0.0f, 2);
            f5 = 100;
            object4 = j.d((LP1)object4, f5);
            f5 = 0.8f;
            object4 = androidx.compose.foundation.layout.c.a((LP1)object4, f5);
            long l2 = OX.f;
            rp2_0 rp2_02 = SP2.a(12);
            object4 = androidx.compose.foundation.a.b((LP1)object4, l2, rp2_02);
            CartEntry cartEntry = qe2_12.f;
            object7 = qe2_12.g;
            i90_0 i90_02 = qe2_12.c;
            qz1_2 qz1_22 = qe2_12.d;
            CartOrder cartOrder = qe2_12.e;
            object6 = new pe2_1(i90_02, qz1_22, cartOrder, cartEntry, (ft1_2)object7);
            object7 = null;
            int n7 = 7;
            u10 u102 = null;
            ref$ObjectRef.element = object4 = androidx.compose.foundation.d.b((LP1)object4, false, null, (Function0)object6, n7);
            n3 = (int)(qe2_12.a ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(qe2_12.b ? 1 : 0)) != 0) {
                n3 = 0x3F000000;
                f5 = 0.5f;
                ref$ObjectRef.element = object4 = be_1.b((LP1)object4, f5);
            }
            boolean bl2 = qe2_12.a;
            boolean bl3 = qe2_12.b;
            CartEntry cartEntry2 = qe2_12.f;
            Ref$IntRef ref$IntRef = qe2_12.h;
            object4 = new ne2_1(cartEntry2, ref$IntRef, ref$ObjectRef, bl2, bl3);
            u102 = v10.c(-1343649975, (fx0_2)object4, (b30_0)object5);
            int n8 = 3072;
            int n10 = 7;
            n3 = 0;
            f5 = 0.0f;
            object6 = null;
            object7 = null;
            n7 = 0;
            rp2_02 = null;
            OA.a(null, null, false, u102, (b30_0)object5, n8, n10);
        }
        return Unit.a;
    }
}

