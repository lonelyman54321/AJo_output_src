/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class De2$m
implements gx0_2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public De2$m(CartOrder cartOrder, qz1_2 qz1_22, Ref$ObjectRef ref$ObjectRef) {
        this.a = cartOrder;
        this.b = qz1_22;
        this.c = ref$ObjectRef;
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
            object = (Product)this.c.element;
            object3 = this.a;
            object4 = this.b;
            int n7 = 584;
            de2_0.q((CartOrder)object3, (qz1_2)object4, (Product)object, (b30_0)object2, n7);
            n4 = 8;
            float f5 = n4;
            n3 = 6;
            vb2.h(f5, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

