/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$A
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public De2$A(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
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
            object3 = this.a;
            object4 = this.b;
            km2_0.b((qz1_2)object3, (SelectedOrderItem)object4, (b30_0)object2, 72);
            n4 = 8;
            float f5 = n4;
            n3 = 6;
            vb2.h(f5, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

