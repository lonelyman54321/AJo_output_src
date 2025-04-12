/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class De2$w
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ SelectedOrderItem c;

    public De2$w(qz1_2 qz1_22, yT1 yT12, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = selectedOrderItem;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            yT1 yT12 = this.b;
            SelectedOrderItem selectedOrderItem = this.c;
            int n7 = 584;
            de2_0.P((qz1_2)object2, yT12, selectedOrderItem, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

