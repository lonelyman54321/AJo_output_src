/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductPromotion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bc0
 */
public final class bc0_0
implements View.OnClickListener {
    public final /* synthetic */ ProductPromotion a;
    public final /* synthetic */ Fc0$a b;

    public /* synthetic */ bc0_0(Fc0$a a2, ProductPromotion productPromotion) {
        this.a = productPromotion;
        this.b = a2;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$item");
        Fc0$a fc0$a = this.b;
        Intrinsics.checkNotNullParameter(fc0$a, "this$0");
        object = ((ProductPromotion)object).getTermsLink();
        Intrinsics.checkNotNull(object);
        Object object2 = "\\|";
        object = fT1.a((String)object2, (String)object);
        int n3 = object.size();
        int n4 = 1;
        if (n3 > n4) {
            object2 = fc0$a.a;
            object = (String)object.get(n4);
            object2.V3((String)object);
            Bundle bundle = new Bundle();
            NewCustomEventsRevamp newCustomEventsRevamp = fc0$a.e;
            object = newCustomEventsRevamp.getPRODUCT_ID();
            object2 = fc0$a.b;
            String string2 = object2.l6();
            bundle.putString((String)object, string2);
            object = newCustomEventsRevamp.getPRODUCT_NAME();
            object2 = object2.x5();
            if (object2 != null) {
                object2 = ((Product)object2).getName();
            } else {
                n3 = 0;
                object2 = null;
            }
            bundle.putString((String)object, (String)object2);
            string2 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTION();
            object = fc0$a.f;
            String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            String string5 = "coupon mini card -  T&C click";
            String string6 = "";
            String string7 = "product_details_interactions";
            String string8 = "pdp screen";
            String string9 = "pdp screen";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string8, string9, string3, bundle, string4, false, null, n7, null);
        }
    }
}

