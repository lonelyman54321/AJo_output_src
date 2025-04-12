/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ht
 */
public final class ht_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ ht_0(Object object, Serializable serializable, int n3) {
        this.a = n3;
        this.b = object;
        this.c = serializable;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (y52_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                OrderItemLine orderItemLine = (OrderItemLine)this.c;
                Intrinsics.checkNotNullParameter(orderItemLine, "$orderItemLine");
                g71_0 g71_02 = ((y52_0)object).d;
                String string2 = no_2.a(orderItemLine);
                String string3 = orderItemLine.getItemId();
                String string4 = orderItemLine.getReturnId();
                Intrinsics.checkNotNullExpressionValue(string4, "getReturnId(...)");
                String string5 = orderItemLine.getOrderId();
                Intrinsics.checkNotNullExpressionValue(string5, "getOrderId(...)");
                String string6 = ((y52_0)object).e.a();
                g71_02.Y9(string2, string3, string4, string5, string6);
                return;
            }
            case 0: 
        }
        object = (jt_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = (CouponEntity)this.c;
        Intrinsics.checkNotNullParameter(object2, "$entity");
        object = ((jt_0)object).a;
        object2 = ((CouponEntity)object2).getDetailsURL();
        object.e6((String)object2);
    }
}

