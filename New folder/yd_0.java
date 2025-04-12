/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.TextViewLinkHandler;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yd
 */
public final class yd_0
extends TextViewLinkHandler {
    public final /* synthetic */ Kd$d a;

    public yd_0(Kd$d kd$d) {
        this.a = kd$d;
    }

    public final void onLinkClick(String string2) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "url");
        Kd$d kd$d = this.a;
        kd$d.b.z(string2);
        Bundle bundle = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = kd$d.e;
        object = newCustomEventsRevamp.getPRODUCT_ID();
        Object object2 = kd$d.c;
        String string3 = object2.l6();
        bundle.putString((String)object, string3);
        object = newCustomEventsRevamp.getPRODUCT_NAME();
        object2 = object2.x5();
        object2 = object2 != null ? ((Product)object2).getName() : null;
        bundle.putString((String)object, (String)object2);
        string3 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTION();
        object = kd$d.f;
        String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, "coupon  mini card - view all products click", "", "product_details_interactions", "pdp screen", "pdp screen", string4, bundle, string5, false, null, 1536, null);
    }
}

