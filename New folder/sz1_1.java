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
 * Renamed from SZ1
 */
public final class sz1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public sz1_1(qz1_2 qz1_22, String string2, String string3, f80_0 f80_02) {
        this.a = qz1_22;
        this.b = string2;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.c;
        qz1_2 qz1_22 = this.a;
        object = new sz1_1(qz1_22, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (sz1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sz1_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        sz1_1 sz1_12 = this;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a;
        Object object3 = (CartOrder)((qz1_2)object2).l.getValue();
        Bundle bundle = new Bundle();
        Object object4 = ((qz1_2)object2).g;
        String string2 = "product_id";
        bundle.putString(string2, (String)object4);
        object3 = object3 != null ? ((CartOrder)object3).getCode() : null;
        bundle.putString("order_id", (String)object3);
        object4 = sz1_12.b;
        bundle.putString("order_status", (String)object4);
        String string3 = ((qz1_2)object2).N.getPrevScreenType();
        object4 = ((qz1_2)object2).M;
        String string4 = sz1_12.c;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, "order item details interaction", string4, null, "order_item_details_interaction", "Order item Details Screen", null, null, bundle, string3, false, null, 1636, null);
        return Unit.a;
    }
}

