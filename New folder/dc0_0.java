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
 * Renamed from Dc0
 */
public final class dc0_0
extends TextViewLinkHandler {
    public final /* synthetic */ Fc0$a a;

    public dc0_0(Fc0$a fc0$a) {
        this.a = fc0$a;
    }

    public final void onLinkClick(String string2) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "url");
        Fc0$a fc0$a = this.a;
        fc0$a.a.z(string2);
        fc0$a.d.e4();
        Bundle bundle = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = fc0$a.e;
        object = newCustomEventsRevamp.getPRODUCT_ID();
        Object object2 = fc0$a.b;
        String string3 = object2.l6();
        bundle.putString((String)object, string3);
        object = newCustomEventsRevamp.getPRODUCT_NAME();
        object2 = object2.x5();
        object2 = object2 != null ? ((Product)object2).getName() : null;
        bundle.putString((String)object, (String)object2);
        object2 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTION();
        object = fc0$a.f;
        String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object2, "coupon  mini card - view all products click", "", "product_details_interactions", "pdp screen", "pdp screen", string4, bundle, string5, false, null, 1536, null);
    }
}

