/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Rr2
 */
public final class rr2_1
extends rw_2
implements View.OnClickListener {
    public final dv_0 b;
    public final co2_0 c;
    public final op2_2 d;
    public final PEToggleButton e;
    public final AjioCustomExpandablePanel f;
    public final NewCustomEventsRevamp g;
    public final uw0_1 h;

    public rr2_1(dv_0 object, mu1_1 object2, co2_0 object3, op2_2 object4, View object5) {
        Intrinsics.checkNotNullParameter(object5, "rootView");
        Intrinsics.checkNotNullParameter(object3, "paymentInfoProvider");
        super((View)object5);
        this.b = object;
        this.c = object3;
        this.d = object4;
        int n3 = R$id.emi_toggle_expand;
        Object object6 = object5.findViewById(n3);
        Object object7 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
        object6 = (PEToggleButton)object6;
        this.e = object6;
        int n4 = R$id.emi_payment;
        Object object8 = object5.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
        object8 = (AjioCustomExpandablePanel)((Object)object8);
        this.f = object8;
        n4 = R$id.view_emi_tv_showMorebank;
        object8 = object5.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
        object8 = (TextView)object8;
        Object object9 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.g = object9;
        this.h = object9 = new uw0_1((View)object5, (dv_0)object, this, (co2_0)object3);
        int n7 = R$id.emi_refresh_button;
        object = object5.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, (String)object7);
        object = (LinearLayout)object;
        int n8 = og1_1.b();
        if (n8 != 0) {
            n8 = object8.getPaintFlags() | 8;
            object8.setPaintFlags(n8);
        }
        no2_0.c = true;
        object5 = oo2_0.a;
        object3 = object3.j0();
        object5.getClass();
        object3 = oo2_0.c("EMI", (PaymentInstruments)object3);
        n8 = 0;
        object5 = null;
        if (object6 != null) {
            object7 = object3 != null ? ((PaymentInstrumentType)object3).getPaymentInstrumentName() : null;
            object6.setText((CharSequence)object7);
        }
        if (object6 != null) {
            object7 = object3 != null ? ((PaymentInstrumentType)object3).getPaymentInstrumentName() : null;
            object6.setTextOff((CharSequence)object7);
        }
        if (object6 != null) {
            if (object3 != null) {
                object5 = ((PaymentInstrumentType)object3).getPaymentInstrumentName();
            }
            object6.setTextOn((CharSequence)object5);
        }
        if (object2 != null) {
            if (object4 != null && (object3 = ((op2_2)object4).s) != null) {
                object5 = new sw0_1((uw0_1)object9, (op2_2)object4);
                object7 = new Uw0$a((Function1)object5);
                ((LiveData)object3).e((mu1_1)object2, (F62)object7);
            }
            if (object4 != null && (object3 = ((op2_2)object4).C) != null) {
                n8 = 0;
                object4 = new tw0_1(object9, 0);
                object5 = new Uw0$a((Function1)object4);
                ((LiveData)object3).e((mu1_1)object2, (F62)object5);
            }
        }
        object2 = new pr2_1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = new qr2_0(this);
        object6.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
        object = new sb_2(this, 2);
        object8.setOnClickListener((View.OnClickListener)object);
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        rr2_1 rr2_12 = this;
        Object object2 = "v";
        Object object3 = view;
        Intrinsics.checkNotNullParameter(view, (String)object2);
        int n7 = view.getId();
        object3 = this.h;
        Object object4 = ((uw0_1)object3).e;
        int n8 = 0;
        Object object5 = null;
        object4 = object4[0];
        int n10 = 1;
        if (object4 != null && n7 == (n4 = object4.getId())) {
            this.w(0);
        } else {
            object4 = ((uw0_1)object3).e;
            object5 = object4[n10];
            if (object5 != null && n7 == (n8 = object5.getId())) {
                rr2_12.w(n10);
            } else {
                n8 = 2;
                object = object4[n8];
                if (object != null && n7 == (n3 = object.getId())) {
                    rr2_12.w(n8);
                } else {
                    n8 = 3;
                    if ((object4 = object4[n8]) != null && n7 == (n4 = object4.getId())) {
                        rr2_12.w(n8);
                    }
                }
            }
        }
        object2 = ((uw0_1)object3).a;
        n4 = 0;
        object4 = null;
        if (object2 != null) {
            object5 = Boolean.TRUE;
            object2.Ka(null, (Boolean)object5);
        }
        if ((object5 = ((uw0_1)object3).d) != null) {
            n3 = ((uw0_1)object3).f;
            object5 = (PaymentInstrumentInfo)CollectionsKt.N(n3, (List)object5);
        } else {
            n8 = 0;
            object5 = null;
        }
        if (object5 != null) {
            int n14;
            object5 = ((uw0_1)object3).g;
            if (object5 != null) {
                object5 = ((PaymentInstrumentInfo)object5).getInstrument_code();
            } else {
                n8 = 0;
                object5 = null;
            }
            object = ((uw0_1)object3).d;
            if (object != null && (object = (PaymentInstrumentInfo)CollectionsKt.N(n14 = ((uw0_1)object3).f, (List)object)) != null) {
                object = ((PaymentInstrumentInfo)object).getInstrument_code();
            } else {
                n3 = 0;
                object = null;
            }
            n8 = (int)(kotlin.text.b.i((String)object5, (String)object, n10 != 0) ? 1 : 0);
            if (n8 == 0) {
                op2_2 op2_22;
                object5 = ((uw0_1)object3).g;
                if (object5 != null) {
                    ((PaymentInstrumentInfo)object5).setOfferDetails(null);
                    ((PaymentInstrumentInfo)object5).setPriceValidation(null);
                }
                if (object2 != null) {
                    object2.a();
                }
                if ((object5 = ((uw0_1)object3).d) != null) {
                    n10 = ((uw0_1)object3).f;
                    object5 = (PaymentInstrumentInfo)CollectionsKt.N(n10, (List)object5);
                } else {
                    n8 = 0;
                    object5 = null;
                }
                ((uw0_1)object3).g = object5;
                if (object2 != null) {
                    object5 = ((uw0_1)object3).o.getEC_CHECKOUT_INTERACTIONS();
                    Object object6 = ((uw0_1)object3).g;
                    if (object6 == null || (object6 = ((PaymentInstrumentInfo)object6).getName()) == null) {
                        object6 = "";
                    }
                    object6 = "IndividualBankEMI_selected_".concat((String)object6);
                    object = "payment accordian select";
                    String string2 = "payment_accordian_select";
                    object2.x1((String)object5, (String)object, (String)object6, string2);
                }
                if ((op2_22 = rr2_12.d) != null) {
                    int n15 = 1048575;
                    PaymentInstruments paymentInstruments = null;
                    TenantResponse tenantResponse = null;
                    hj_1 hj_12 = null;
                    HashSet hashSet = null;
                    object2 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n15, null);
                    object5 = ((uw0_1)object3).g;
                    if (object5 != null) {
                        object5 = ((PaymentInstrumentInfo)object5).getInstrument_code();
                    } else {
                        n8 = 0;
                        object5 = null;
                    }
                    ((PriceRequest)object2).setInstrumentInstanceCode((String)object5);
                    object5 = (PaymentInstrumentType)((uw0_1)object3).c.getValue();
                    if (object5 != null) {
                        object4 = ((PaymentInstrumentType)object5).getPaymentInstrumentCode();
                    }
                    ((PriceRequest)object2).setPaymentInstrument((String)object4);
                    object3 = ((uw0_1)object3).b;
                    paymentInstruments = object3.j0();
                    tenantResponse = object3.n8();
                    hj_12 = hj_1.EMI;
                    hashSet = object3.H();
                    op2_22.k((PriceRequest)object2, paymentInstruments, tenantResponse, hj_12, hashSet);
                }
            }
        }
    }

    public final void w(int n3) {
        int n4;
        uw0_1 uw0_12 = this.h;
        uw0_12.f = n3;
        for (int i3 = 0; i3 < (n4 = 4); ++i3) {
            int n7;
            View view = uw0_12.e[i3];
            if (view != null) {
                n7 = R$id.emi_proceed_button;
                view = (LinearLayout)view.findViewById(n7);
            } else {
                n4 = 0;
                view = null;
            }
            if (i3 == n3) {
                if (view == null) continue;
                view.setVisibility(0);
                continue;
            }
            if (view == null) continue;
            n7 = 8;
            view.setVisibility(n7);
        }
    }
}

