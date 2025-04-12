/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.widget.ToggleButton
 */
import android.os.Bundle;
import android.widget.ToggleButton;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eo2
 */
public final class eo2_0 {
    public final NewCustomEventsRevamp a;
    public final String b;
    public final String c;
    public PriceValidation d;
    public boolean e;

    public eo2_0() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        this.b = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.c = object = cv_0.a((AnalyticsManager$Companion)object);
    }

    public static void a(ToggleButton toggleButton, int n3, TenantResponse tenantResponse, float f5, HashSet hashSet, Boolean bl2) {
        Boolean bl3;
        String string2 = "toggleBtn";
        Intrinsics.checkNotNullParameter(toggleButton, string2);
        n3 = (int)(oo2_0.l(n3, tenantResponse, f5, hashSet) ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(bl2, bl3 = Boolean.TRUE) ? 1 : 0)) == 0) {
            n3 = 1;
            toggleButton.setClickable(n3 != 0);
            toggleButton.setEnabled(n3 != 0);
            n3 = 1065353216;
            float f6 = 1.0f;
            toggleButton.setAlpha(f6);
        } else {
            bl3 = null;
            toggleButton.setClickable(false);
            toggleButton.setEnabled(false);
            float f7 = 0.5f;
            toggleButton.setAlpha(f7);
            n3 = (int)(toggleButton.isChecked() ? 1 : 0);
            if (n3 != 0) {
                toggleButton.toggle();
            }
        }
    }

    public final void b(int n3) {
        Object object = this.a;
        switch (n3) {
            default: {
                break;
            }
            case 13: {
                Object object2 = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
                String string2 = this.b;
                String string3 = this.c;
                Object object3 = "payment accordian open";
                String string4 = "cod click";
                String string5 = "payment_accordian_open";
                String string6 = "payment screen";
                Object object4 = "payment screen";
                int n4 = 0;
                int n7 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, (String)object3, string4, string5, string6, (String)object4, string2, null, string3, false, null, n7, null);
                n3 = (int)(this.e ? 1 : 0);
                if (n3 != 0) break;
                Serializable serializable = this.d;
                if (serializable != null && (serializable = ((PriceValidation)serializable).getPriceSplitup()) != null) {
                    serializable = ((PriceSplitUp)serializable).getConvenienceFee();
                } else {
                    n3 = 0;
                    serializable = null;
                }
                serializable = mz3_0.f((ConvenienceFeePriceSplitUp)serializable);
                object = AnalyticsManager.Companion;
                object2 = ((AnalyticsManager$Companion)object).getInstance();
                object3 = ((AnalyticsManager)object2).getGtmEvents();
                string6 = av_0.a((AnalyticsManager$Companion)object);
                object4 = ne_0.b((Bundle)serializable);
                string5 = "COD selected";
                n4 = 16;
                string4 = "COD_clicked";
                string2 = null;
                string3 = null;
                GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, string4, string5, string6, (AnalyticsData)object4, null, n4, null);
                break;
            }
            case 12: {
                String string7 = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
                String string8 = this.b;
                String string9 = this.c;
                String string10 = "upi click";
                String string11 = "payment_accordian_open";
                String string12 = "payment screen";
                String string13 = "payment screen";
                boolean bl2 = false;
                int n8 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string7, "payment accordian open", string10, string11, string12, string13, string8, null, string9, false, null, n8, null);
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                object = analyticsManager$Companion.getInstance().getGtmEvents();
                string7 = "UPI_clicked";
                String string14 = "UPI  selected";
                ak0_0.a(analyticsManager$Companion, (GTMEvents)object, string7, string14);
                break;
            }
            case 11: {
                String string15 = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
                String string16 = this.b;
                String string17 = this.c;
                String string18 = "wallet click";
                String string19 = "payment_accordian_open";
                String string20 = "payment screen";
                String string21 = "payment screen";
                boolean bl3 = false;
                int n10 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string15, "payment accordian open", string18, string19, string20, string21, string16, null, string17, false, null, n10, null);
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                object = analyticsManager$Companion.getInstance().getGtmEvents();
                string15 = "Wallets_clicked";
                String string22 = "Wallets selected";
                ak0_0.a(analyticsManager$Companion, (GTMEvents)object, string15, string22);
                break;
            }
            case 9: {
                String string23 = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
                String string24 = this.b;
                String string25 = this.c;
                String string26 = "net banking click";
                String string27 = "payment_accordian_open";
                String string28 = "payment screen";
                String string29 = "payment screen";
                boolean bl4 = false;
                int n14 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string23, "payment accordian open", string26, string27, string28, string29, string24, null, string25, false, null, n14, null);
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                object = analyticsManager$Companion.getInstance().getGtmEvents();
                string23 = "Net_Banking_clicked";
                String string30 = "Net Banking selected";
                ak0_0.a(analyticsManager$Companion, (GTMEvents)object, string23, string30);
                break;
            }
            case 8: {
                String string31 = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
                String string32 = this.b;
                String string33 = this.c;
                String string34 = "debit/credit card click";
                String string35 = "payment_accordian_open";
                String string36 = "payment screen";
                String string37 = "payment screen";
                boolean bl5 = false;
                int n15 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string31, "payment accordian open", string34, string35, string36, string37, string32, null, string33, false, null, n15, null);
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                object = analyticsManager$Companion.getInstance().getGtmEvents();
                string31 = "Card_clicked";
                String string38 = "Credit / Debit Cards";
                ak0_0.a(analyticsManager$Companion, (GTMEvents)object, string31, string38);
            }
        }
    }
}

