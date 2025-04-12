/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Po2
 */
public final class po2_0
implements View.OnClickListener {
    public final /* synthetic */ qo2_0 a;
    public final /* synthetic */ OrderItemLine b;
    public final /* synthetic */ int c;

    public /* synthetic */ po2_0(qo2_0 qo2_02, OrderItemLine orderItemLine, int n3) {
        this.a = qo2_02;
        this.b = orderItemLine;
        this.c = n3;
    }

    public final void onClick(View object) {
        qo2_0 qo2_02 = this.a;
        Intrinsics.checkNotNullParameter(qo2_02, "this$0");
        OrderItemLine orderItemLine = this.b;
        Intrinsics.checkNotNullParameter(orderItemLine, "$orderItemLine");
        object = qo2_02.a;
        if (object != null) {
            int n3 = this.c;
            object.a(n3, orderItemLine);
        }
    }
}

