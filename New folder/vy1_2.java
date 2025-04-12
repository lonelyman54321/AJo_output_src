/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$DoubleRef;

/*
 * Renamed from VY1
 */
public final class vy1_2
implements Function0 {
    public final /* synthetic */ Ref$DoubleRef a;
    public final /* synthetic */ CartOrder b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ LuxeDetails d;
    public final /* synthetic */ AppsFlyerEventsItem e;

    public /* synthetic */ vy1_2(Ref$DoubleRef ref$DoubleRef, CartOrder cartOrder, ArrayList arrayList, LuxeDetails luxeDetails, AppsFlyerEventsItem appsFlyerEventsItem) {
        this.a = ref$DoubleRef;
        this.b = cartOrder;
        this.c = arrayList;
        this.d = luxeDetails;
        this.e = appsFlyerEventsItem;
    }

    public final Object invoke() {
        LuxeDetails luxeDetails = this.d;
        AppsFlyerEventsItem appsFlyerEventsItem = this.e;
        Ref$DoubleRef ref$DoubleRef = this.a;
        CartOrder cartOrder = this.b;
        ArrayList arrayList = this.c;
        return NewEEcommerceEventsRevamp.a(ref$DoubleRef, cartOrder, arrayList, luxeDetails, appsFlyerEventsItem);
    }
}

