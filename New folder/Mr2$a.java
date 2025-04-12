/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Mr2$a
implements View.OnClickListener {
    public PesdkLoyaltyCardInfoView a;
    public View b;
    public TextView c;
    public RelativeLayout d;
    public TextView e;
    public CheckBox f;
    public AjioTextView g;
    public ImageView h;
    public RelativeLayout i;
    public EditText j;
    public TextInputLayout k;
    public TextView l;
    public int m;
    public TextView n;
    public PEProgressView o;
    public final /* synthetic */ mr2_0 p;

    public Mr2$a(mr2_0 mr2_02) {
        this.p = mr2_02;
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.view_credit_card_layout;
        if (n3 == n4) {
            object = this.p;
            object2 = ((mr2_0)object).e;
            String string2 = null;
            if (object2 != null) {
                object2 = ((PaymentInstrumentInfo)object2).getPaymentInstrumentId();
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object3 = ((mr2_0)object).a;
            int bl2 = this.m;
            object3 = (PaymentInstrumentInfo)object3.get(bl2);
            object3 = object3 != null ? ((PaymentInstrumentInfo)object3).getPaymentInstrumentId() : null;
            boolean bl3 = true;
            n4 = (int)(kotlin.text.b.i((String)object2, (String)object3, bl3) ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            object2 = ((mr2_0)object).e;
            if (object2 != null) {
                object3 = Boolean.FALSE;
                ((PaymentInstrumentInfo)object2).setCLicked((Boolean)object3);
                object2 = ((mr2_0)object).e;
                if (object2 != null) {
                    ((PaymentInstrumentInfo)object2).setOfferExpand((Boolean)object3);
                }
                if ((object2 = ((mr2_0)object).e) != null) {
                    ((PaymentInstrumentInfo)object2).setLoyalty(null);
                }
            }
            object2 = oo2_0.a;
            object3 = ((mr2_0)object).d;
            Object object4 = object3.Y8();
            object2.getClass();
            int n7 = 0;
            oo2_0.r("", false, (ArrayList)object4);
            object2 = ((mr2_0)object).a;
            int n8 = this.m;
            ((mr2_0)object).e = object2 = (PaymentInstrumentInfo)object2.get(n8);
            object2 = ((mr2_0)object).a;
            n8 = this.m;
            object2 = (PaymentInstrumentInfo)object2.get(n8);
            if (object2 != null) {
                object4 = Boolean.TRUE;
                ((PaymentInstrumentInfo)object2).setCLicked((Boolean)object4);
            }
            if ((object2 = ((mr2_0)object).b) != null) {
                object2.u();
            }
            if (object2 != null) {
                object2.c(null);
            }
            object4 = ((mr2_0)object).a;
            n7 = this.m;
            if ((object4 = (PaymentInstrumentInfo)object4.get(n7)) != null) {
                string2 = ((PaymentInstrumentInfo)object4).getPaymentInstrumentId();
            }
            object3 = object3.Y8();
            oo2_0.r(string2, bl3, (ArrayList)object3);
            if (object2 != null) {
                object = ((mr2_0)object).e;
                object2.s((PaymentInstrumentInfo)object);
            }
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            string2 = "Savedcard_clicked";
            object3 = "Saved cards selected";
            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string2, (String)object3);
        }
    }
}

