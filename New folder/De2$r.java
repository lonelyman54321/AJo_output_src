/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class De2$r
implements gx0_2 {
    public final /* synthetic */ la2_0 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ qz1_2 c;

    public De2$r(la2_0 la2_02, SelectedOrderItem selectedOrderItem, qz1_2 qz1_22) {
        this.a = la2_02;
        this.b = selectedOrderItem;
        this.c = qz1_22;
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
            object = this.b;
            Object object5 = ((SelectedOrderItem)object).getForwardPacketNumber();
            Intrinsics.checkNotNull(object5);
            object3 = this.c;
            fe2_1 fe2_12 = new fe2_1(object3, 0);
            long l2 = OX.f;
            object4 = this.a;
            int n7 = 3072;
            kk2_2.a((la2_0)object4, (String)object5, fe2_12, l2, (b30_0)object2, n7);
            int n8 = 4;
            float f5 = n8;
            int n10 = 6;
            vb2.h(f5, (b30_0)object2, n10);
            object4 = Unit.a;
            fe2_12 = null;
            object5 = new ge2_1((qz1_2)object3, (SelectedOrderItem)object, null);
            ly0_0.d((b30_0)object2, object4, (Function2)object5);
        }
        return Unit.a;
    }
}

