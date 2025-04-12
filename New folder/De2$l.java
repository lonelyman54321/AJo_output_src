/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$l
implements gx0_2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ ft1_2 d;

    public De2$l(CartOrder cartOrder, p83_0 p83_02, qz1_2 qz1_22, ft1_2 ft1_22) {
        this.a = cartOrder;
        this.b = p83_02;
        this.c = qz1_22;
        this.d = ft1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            p83_0 p83_02 = this.b;
            qz1_2 qz1_22 = this.c;
            object4 = this.a;
            ft1_2 ft1_22 = this.d;
            int n7 = 520;
            de2_0.s((CartOrder)object4, p83_02, qz1_22, ft1_22, (b30_0)object2, n7);
            n4 = 8;
            float f5 = n4;
            n3 = 6;
            vb2.h(f5, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

