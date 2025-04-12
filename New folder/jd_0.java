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
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/*
 * Renamed from Jd
 */
public final class jd_0
implements View.OnClickListener {
    public final /* synthetic */ Kd$a a;
    public final /* synthetic */ BankOfferItem b;

    public /* synthetic */ jd_0(Kd$a kd$a, BankOfferItem bankOfferItem) {
        this.a = kd$a;
        this.b = bankOfferItem;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$displayCoupon");
        Object object3 = ((Kd$a)object).b;
        object2 = ((BankOfferItem)object2).getTncUrl();
        Intrinsics.checkNotNull(object2);
        Object object4 = new Regex("\\|");
        object2 = (String)((Regex)object4).e((CharSequence)object2).get(0);
        object3.V3((String)object2);
        Bundle bundle = new Bundle();
        object4 = ((Kd$a)object).d;
        object2 = ((NewCustomEventsRevamp)object4).getPRODUCT_ID();
        object3 = ((Kd$a)object).c;
        String string2 = object3.l6();
        bundle.putString((String)object2, string2);
        object2 = ((NewCustomEventsRevamp)object4).getPRODUCT_NAME();
        object3 = object3.x5();
        object3 = object3 != null ? ((Product)object3).getName() : null;
        bundle.putString((String)object2, (String)object3);
        string2 = ((NewCustomEventsRevamp)object4).getEC_PRODUCT_DETAILS_INTERACTION();
        object = ((Kd$a)object).e;
        String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string2, "bank offers mini card -  T&C click", "", "product_details_interactions", "pdp screen", "pdp screen", string3, bundle, string4, false, null, 1536, null);
    }
}

