/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.myaccount.order.imps.b;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from Td
 */
public final class td_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View view) {
        Object object;
        String string2;
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                b b2 = (b)this.b;
                Intrinsics.checkNotNullParameter(b2, "this$0");
                String string3 = (String)this.c;
                Intrinsics.checkNotNullParameter(string3, "$ifscUrl");
                FragmentActivity fragmentActivity = b2.getActivity();
                if (fragmentActivity != null) {
                    fragmentActivity = b2.requireActivity();
                    String string4 = "requireActivity(...)";
                    Intrinsics.checkNotNullExpressionValue(fragmentActivity, string4);
                    int n4 = -1;
                    at2_1.k((Context)fragmentActivity, n4, string3);
                }
                b2.dismiss();
                return;
            }
            case 0: 
        }
        Object object2 = (BankOfferItem)this.b;
        Intrinsics.checkNotNullParameter(object2, "$displayCoupon");
        Kd$c kd$c = (Kd$c)this.c;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(kd$c, (String)object3);
        object2 = ((BankOfferItem)object2).getTncUrl();
        if (object2 != null) {
            bl2 = StringsKt.G((CharSequence)object2, '|');
            if (bl2) {
                object3 = kd$c.b;
                string2 = "\\|";
                object = new Regex(string2);
                object2 = ((Regex)object).e((CharSequence)object2);
                int n7 = 1;
                object2 = (String)object2.get(n7);
                object3.V3((String)object2);
            } else {
                object3 = kd$c.b;
                object3.V3((String)object2);
            }
        }
        Bundle bundle = new Bundle();
        object2 = kd$c.d.getPRODUCT_ID();
        object3 = kd$c.c;
        object = object3.l6();
        bundle.putString((String)object2, (String)object);
        object = kd$c.d;
        object2 = ((NewCustomEventsRevamp)object).getPRODUCT_NAME();
        object3 = object3.x5();
        if (object3 != null) {
            object3 = ((Product)object3).getName();
        } else {
            bl2 = false;
            object3 = null;
        }
        bundle.putString((String)object2, (String)object3);
        string2 = ((NewCustomEventsRevamp)object).getEC_PRODUCT_DETAILS_INTERACTION();
        object2 = kd$c.e;
        String string5 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string6 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string2, "bank offers mini card -  T&C click", "", "product_details_interactions", "pdp screen", "pdp screen", string5, bundle, string6, false, null, 1536, null);
    }
}

