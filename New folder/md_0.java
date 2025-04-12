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
 * Renamed from Md
 */
public final class md_0
implements View.OnClickListener {
    public final /* synthetic */ ProductPromotion a;
    public final /* synthetic */ Kd$b b;

    public /* synthetic */ md_0(Kd$b kd$b, ProductPromotion productPromotion) {
        this.a = productPromotion;
        this.b = kd$b;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$displayCoupon");
        Kd$b kd$b = this.b;
        Intrinsics.checkNotNullParameter(kd$b, "this$0");
        object = ((ProductPromotion)object).getTermsLink();
        Intrinsics.checkNotNull(object);
        Object object2 = "\\|";
        object = fT1.a((String)object2, (String)object);
        int n3 = object.size();
        int n4 = 1;
        if (n3 > n4) {
            object2 = kd$b.b;
            object = (String)object.get(n4);
            object2.V3((String)object);
            Bundle bundle = new Bundle();
            NewCustomEventsRevamp newCustomEventsRevamp = kd$b.e;
            object = newCustomEventsRevamp.getPRODUCT_ID();
            object2 = kd$b.c;
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
            object = kd$b.f;
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

