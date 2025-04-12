/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class De2$u
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ SelectedOrderItem d;

    public De2$u(int n3, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, String string2) {
        this.a = string2;
        this.b = n3;
        this.c = qz1_22;
        this.d = selectedOrderItem;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            this.c.getClass();
            object = this.d;
            boolean bl2 = qz1_2.I((SelectedOrderItem)object);
            if (object != null) {
                object = ((SelectedOrderItem)object).getReturnId();
            } else {
                n4 = 0;
                object = null;
            }
            int n7 = 16;
            String string2 = this.a;
            int n8 = this.b;
            de2_0.n(string2, n8, bl2, (String)object, false, (b30_0)object3, 0, n7);
        }
        return Unit.a;
    }
}

