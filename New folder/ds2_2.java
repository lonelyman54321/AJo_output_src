/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from ds2
 */
public final class ds2_2
extends rw_2
implements View.OnClickListener {
    public final dv_0 b;
    public final co2_0 c;
    public final op2_2 d;
    public final PEToggleButton e;
    public final AjioCustomExpandablePanel f;
    public final NewCustomEventsRevamp g;
    public final ku1_2 h;

    public ds2_2(dv_0 object, mu1_1 mu1_12, co2_0 object2, op2_2 object3, View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        Intrinsics.checkNotNullParameter(object2, "paymentInfoProvider");
        super(view);
        this.b = object;
        this.c = object2;
        this.d = object3;
        int n3 = R$id.netbanking_toggle_expand;
        Object object4 = view.findViewById(n3);
        Object object5 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
        object4 = (PEToggleButton)object4;
        this.e = object4;
        int n4 = R$id.expandable_payment_netbanking;
        Object object6 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
        object6 = (AjioCustomExpandablePanel)((Object)object6);
        this.f = object6;
        n4 = R$id.view_netbanking_tv_showMorebank;
        object6 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
        object6 = (TextView)object6;
        this.g = object5 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.h = object5 = new ku1_2(view, (dv_0)object, this, (TextView)object6, (co2_0)object2);
        int n7 = og1_1.b();
        if (n7 != 0) {
            n7 = object6.getPaintFlags() | 8;
            object6.setPaintFlags(n7);
        }
        if (mu1_12 != null && object3 != null && (object = ((op2_2)object3).s) != null) {
            object2 = new iu1_2((ku1_2)object5, (op2_2)object3);
            object3 = new KU1$a((iu1_2)object2);
            ((LiveData)object).e(mu1_12, (F62)object3);
        }
        object = new bs2_2(this);
        object4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
        object = new bb_2(this, 1);
        object6.setOnClickListener((View.OnClickListener)object);
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        ds2_2 ds2_22 = this;
        Object object2 = "v";
        Object object3 = view;
        Intrinsics.checkNotNullParameter(view, (String)object2);
        int n7 = view.getId();
        object3 = this.h;
        Object object4 = ((ku1_2)object3).i;
        int n8 = 0;
        Object object5 = null;
        object4 = object4[0];
        boolean bl2 = true;
        if (object4 != null && n7 == (n4 = object4.getId())) {
            this.w(0);
        } else {
            object4 = ((ku1_2)object3).i;
            object5 = object4[bl2];
            if (object5 != null && n7 == (n8 = object5.getId())) {
                ds2_22.w((int)(bl2 ? 1 : 0));
            } else {
                n8 = 2;
                object = object4[n8];
                if (object != null && n7 == (n3 = object.getId())) {
                    ds2_22.w(n8);
                } else {
                    n8 = 3;
                    if ((object4 = object4[n8]) != null && n7 == (n4 = object4.getId())) {
                        ds2_22.w(n8);
                    }
                }
            }
        }
        object2 = ((ku1_2)object3).b;
        n4 = 0;
        object4 = null;
        if (object2 != null) {
            object5 = Boolean.TRUE;
            object2.Ka(null, (Boolean)object5);
        }
        if ((object5 = ((ku1_2)object3).h) != null) {
            n3 = ((ku1_2)object3).j;
            object5 = (PaymentInstrumentInfo)object5.get(n3);
        } else {
            n8 = 0;
            object5 = null;
        }
        if (object5 != null) {
            int n10;
            object5 = ((ku1_2)object3).k;
            if (object5 != null) {
                object5 = ((PaymentInstrumentInfo)object5).getCode();
            } else {
                n8 = 0;
                object5 = null;
            }
            object = ((ku1_2)object3).h;
            if (object != null && (object = (PaymentInstrumentInfo)object.get(n10 = ((ku1_2)object3).j)) != null) {
                object = ((PaymentInstrumentInfo)object).getCode();
            } else {
                n3 = 0;
                object = null;
            }
            n8 = (int)(kotlin.text.b.i((String)object5, (String)object, bl2) ? 1 : 0);
            if (n8 == 0) {
                object5 = ((ku1_2)object3).k;
                if (object5 != null) {
                    ((PaymentInstrumentInfo)object5).setOfferDetails(null);
                    ((PaymentInstrumentInfo)object5).setPriceValidation(null);
                }
                if (object2 != null) {
                    object2.a();
                }
                if ((object2 = ((ku1_2)object3).h) != null) {
                    n8 = ((ku1_2)object3).j;
                    object2 = (PaymentInstrumentInfo)object2.get(n8);
                } else {
                    n7 = 0;
                    object2 = null;
                }
                ((ku1_2)object3).k = object2;
                object5 = ds2_22.d;
                if (object5 != null) {
                    Object object6 = object2;
                    int n14 = 1048575;
                    n3 = 0;
                    object = null;
                    n10 = 0;
                    TenantResponse tenantResponse = null;
                    hj_1 hj_12 = null;
                    HashSet hashSet = null;
                    object2 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n14, null);
                    object6 = ((ku1_2)object3).k;
                    if (object6 != null) {
                        object6 = ((PaymentInstrumentInfo)object6).getCode();
                    } else {
                        bl2 = false;
                        object6 = null;
                    }
                    ((PriceRequest)object2).setInstrumentInstanceCode((String)object6);
                    object6 = (PaymentInstrumentType)((ku1_2)object3).f.getValue();
                    if (object6 != null) {
                        object4 = ((PaymentInstrumentType)object6).getPaymentInstrumentCode();
                    }
                    ((PriceRequest)object2).setPaymentInstrument((String)object4);
                    object3 = ((ku1_2)object3).d;
                    object = object3.j0();
                    tenantResponse = object3.n8();
                    hj_12 = hj_1.NET_BANKING;
                    hashSet = object3.H();
                    object6 = object2;
                    ((op2_2)object5).k((PriceRequest)object2, (PaymentInstruments)object, tenantResponse, hj_12, hashSet);
                }
            }
        }
    }

    public final void w(int n3) {
        int n4;
        ku1_2 ku1_22 = this.h;
        ku1_22.j = n3;
        for (int i3 = 0; i3 < (n4 = 4); ++i3) {
            int n7;
            Object object = ku1_22.i[i3];
            if (object != null) {
                n7 = R$id.proceed_btn_tv;
                object = (AjioTextView)object.findViewById(n7);
            } else {
                n4 = 0;
                object = null;
            }
            if (i3 == n3) {
                if (object == null) continue;
                object.setVisibility(0);
                continue;
            }
            if (object == null) continue;
            n7 = 8;
            object.setVisibility(n7);
        }
    }
}

