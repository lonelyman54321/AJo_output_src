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
 * Renamed from c02
 */
public final class c02_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ CartOrder b;

    public c02_0(qz1_2 qz1_22, CartOrder cartOrder, f80_0 f80_02) {
        this.a = qz1_22;
        this.b = cartOrder;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        CartOrder cartOrder = this.b;
        object = new c02_0(qz1_22, cartOrder, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (c02_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c02_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Bundle bundle = new Bundle();
        object2 = this.a;
        Object object3 = ((qz1_2)object2).g;
        String string2 = "product_id";
        bundle.putString(string2, (String)object3);
        object3 = this.b;
        object3 = object3 != null ? ((CartOrder)object3).getCode() : null;
        bundle.putString("order_id", (String)object3);
        NewCustomEventsRevamp.newPushCustomEvent$default(((qz1_2)object2).M, "orders detail interactions", "chat", "chat", "orders_detail_interaction", "Order item Details Screen", null, null, bundle, "", false, null, 1632, null);
        return Unit.a;
    }
}

