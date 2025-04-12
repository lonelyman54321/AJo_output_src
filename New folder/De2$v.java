/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class De2$v
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ boolean d;

    public De2$v(qz1_2 qz1_22, yT1 yT12, SelectedOrderItem selectedOrderItem, boolean bl2) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = selectedOrderItem;
        this.d = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            void var10_13;
            boolean bl2 = this.d;
            int n8 = 584;
            Object object3 = this.a;
            Object object4 = this.b;
            Object object5 = this.c;
            de2_0.j((qz1_2)object3, (yT1)object4, (SelectedOrderItem)object5, bl2, (b30_0)object, n8);
            object2 = this.a;
            object2.getClass();
            object3 = this.c;
            if (object3 != null) {
                object4 = ((SelectedOrderItem)object3).getConsignment();
            } else {
                boolean n7 = false;
                object4 = null;
            }
            if (object4 != null) {
                boolean bl3 = qz1_2.B((Consignment)object4);
            } else {
                boolean bl4 = false;
                object4 = null;
            }
            if (var10_13 != false) {
                object4 = h40_0.a;
                object4 = z40_0.Companion;
                object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                object5 = "enable_mark_delivered_forward_order_revamp";
                boolean bl5 = ((ao0_0)object4).a((String)object5);
                if (bl5) {
                    int n7 = 72;
                    ge_2.a((qz1_2)object2, (SelectedOrderItem)object3, (b30_0)object, n7);
                    n4 = 8;
                    float f5 = n4;
                    n3 = 6;
                    vb2.h(f5, (b30_0)object, n3);
                }
            }
        }
        return Unit.a;
    }
}

