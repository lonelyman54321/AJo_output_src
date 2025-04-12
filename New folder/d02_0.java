/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from d02
 */
public final class d02_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;

    public d02_0(qz1_2 qz1_22, f80_0 f80_02) {
        this.a = qz1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        object = new d02_0(qz1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d02_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d02_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        qz1_2 qz1_22 = this.a;
        Object object2 = (CartOrder)qz1_22.l.getValue();
        Bundle bundle = new Bundle();
        String string2 = qz1_22.g;
        String string3 = "product_id";
        bundle.putString(string3, string2);
        object2 = object2 != null ? ((CartOrder)object2).getCode() : null;
        bundle.putString("order_id", (String)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(qz1_22.M, "order item details interaction", "other products", null, "order_item_details_interaction", "Order item Details Screen", null, null, bundle, "", false, null, 1636, null);
        return Unit.a;
    }
}

