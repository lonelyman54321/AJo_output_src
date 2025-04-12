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
 * Renamed from Kf2
 */
public final class kf2_0
implements View.OnClickListener {
    public final /* synthetic */ nf2_1 a;
    public final /* synthetic */ OrderItemLine b;
    public final /* synthetic */ int c;

    public /* synthetic */ kf2_0(nf2_1 nf2_12, OrderItemLine orderItemLine, int n3) {
        this.a = nf2_12;
        this.b = orderItemLine;
        this.c = n3;
    }

    public final void onClick(View object) {
        nf2_1 nf2_12 = this.a;
        Intrinsics.checkNotNullParameter(nf2_12, "this$0");
        OrderItemLine orderItemLine = this.b;
        Intrinsics.checkNotNullParameter(orderItemLine, "$orderItemLine");
        object = nf2_12.a;
        if (object != null) {
            int n3 = this.c;
            object.a(n3, orderItemLine);
        }
    }
}

