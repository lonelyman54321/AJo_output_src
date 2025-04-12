/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.ajiocash.GiftCard;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sr2
 */
public final class sr2_0
extends rw_2
implements View.OnClickListener {
    public final dv_0 b;
    public final co2_0 c;
    public final View d;
    public final TextView e;
    public final TextView f;

    public sr2_0(View object, dv_0 dv_02, co2_0 co2_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        super((View)object);
        this.b = dv_02;
        this.c = co2_02;
        int n3 = R$id.disableLayer;
        dv_02 = object.findViewById(n3);
        Object[] objectArray = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(dv_02, (String)objectArray);
        this.d = dv_02;
        n3 = R$id.tvWalletInfo;
        dv_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(dv_02, (String)objectArray);
        dv_02 = (TextView)dv_02;
        this.e = dv_02;
        int n4 = R$id.tvAdd;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
        object = (TextView)object;
        this.f = object;
        int n7 = og1_1.b();
        if (n7 != 0) {
            n7 = object.getPaintFlags() | 8;
            object.setPaintFlags(n7);
        }
        object = (object = co2_02.j0()) != null && (object = ((PaymentInstruments)object).getEGiftCard()) != null ? ((GiftCard)object).getWalletType() : null;
        int n8 = R$string.ag_description_title;
        objectArray = new Object[]{object};
        object = hv3_0.L(n8, objectArray);
        dv_02.setText((CharSequence)object);
    }

    public final void onClick(View object) {
        Object object2 = this.f;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object = AnalyticsManager.Companion;
            String string2 = bv_0.a((AnalyticsManager$Companion)object);
            String string3 = cv_0.a((AnalyticsManager$Companion)object);
            object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
            String string4 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getEC_PAYMENT_INSTRUMENT_SCR_TYPE();
            String string5 = "gift card clicks";
            String string6 = "add click";
            String string7 = "gift_card_clicks";
            String string8 = "payment screen";
            String string9 = "payment screen";
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string4, string5, string6, string7, string8, string9, string2, null, string3, false, null, n3, null);
            object = this.b;
            if (object != null) {
                object.J7();
            }
        }
    }
}

