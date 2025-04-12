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
 * Renamed from Cf2
 */
public final class cf2_0
implements View.OnClickListener {
    public final /* synthetic */ hf2_0 a;
    public final /* synthetic */ OrderItemLine b;
    public final /* synthetic */ int c;

    public /* synthetic */ cf2_0(hf2_0 hf2_02, OrderItemLine orderItemLine, int n3) {
        this.a = hf2_02;
        this.b = orderItemLine;
        this.c = n3;
    }

    public final void onClick(View object) {
        hf2_0 hf2_02 = this.a;
        Intrinsics.checkNotNullParameter(hf2_02, "this$0");
        OrderItemLine orderItemLine = this.b;
        Intrinsics.checkNotNullParameter(orderItemLine, "$orderItemLine");
        object = hf2_02.a;
        if (object != null) {
            int n3 = this.c;
            object.a(n3, orderItemLine);
        }
    }
}

