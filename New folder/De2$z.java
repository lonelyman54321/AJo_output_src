/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$z
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ boolean d;

    public De2$z(qz1_2 qz1_22, yT1 yT12, SelectedOrderItem selectedOrderItem, boolean bl2) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = selectedOrderItem;
        this.d = bl2;
    }

    /*
     * WARNING - void declaration
     */
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
            void var12_15;
            boolean bl2 = this.d;
            int n8 = 584;
            object4 = this.a;
            Object object5 = this.b;
            Object object6 = this.c;
            de2_0.j((qz1_2)object4, (yT1)object5, (SelectedOrderItem)object6, bl2, (b30_0)object2, n8);
            n4 = 8;
            float f5 = n4;
            n3 = 6;
            vb2.h(f5, (b30_0)object2, n3);
            object4 = this.a;
            object4.getClass();
            object5 = this.c;
            if (object5 != null) {
                object6 = ((SelectedOrderItem)object5).getConsignment();
            } else {
                boolean n7 = false;
                object6 = null;
            }
            if (object6 != null) {
                boolean bl3 = qz1_2.B((Consignment)object6);
            } else {
                boolean bl4 = false;
                object6 = null;
            }
            if (var12_15 != false) {
                object6 = h40_0.a;
                object6 = z40_0.Companion;
                object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object6).a;
                String string2 = "enable_mark_delivered_forward_order_revamp";
                boolean bl5 = ((ao0_0)object6).a(string2);
                if (bl5) {
                    int n7 = 72;
                    ge_2.a((qz1_2)object4, (SelectedOrderItem)object5, (b30_0)object2, n7);
                    vb2.h(f5, (b30_0)object2, n3);
                }
            }
        }
        return Unit.a;
    }
}

