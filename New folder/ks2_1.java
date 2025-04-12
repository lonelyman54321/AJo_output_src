/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.view.View
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.Wallet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from ks2
 */
public final class ks2_1
extends rw_2
implements xe3_1 {
    public final dv_0 b;
    public final op2_2 c;
    public final PEToggleButton d;
    public final AjioCustomExpandablePanel e;
    public final af3_1 f;

    public ks2_1(dv_0 object, mu1_1 object2, co2_0 object3, op2_2 object4, View view) {
        af3_1 af3_12;
        Intrinsics.checkNotNullParameter(view, "v");
        Intrinsics.checkNotNullParameter(object3, "paymentInfoProvider");
        super(view);
        this.b = object;
        this.c = object4;
        int n3 = R$id.wallet_toggle_expand;
        Object object5 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object5, string2);
        object5 = (PEToggleButton)object5;
        this.d = object5;
        int n4 = R$id.expandable_payment_wallet;
        Object object6 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object6, string2);
        object6 = (AjioCustomExpandablePanel)((Object)object6);
        this.e = object6;
        Context context = view.getContext();
        int n7 = R$id.list_upi;
        view = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        Object object7 = view;
        object7 = (PENonScrollableListView)view;
        this.f = af3_12 = new af3_1(context, (dv_0)object, (PENonScrollableListView)((Object)object7), (co2_0)object3, this);
        object = new js2_1(this, (co2_0)object3);
        object5.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
        if (object4 != null && object2 != null) {
            object = ((op2_2)object4).s;
            object3 = new ze3_1(af3_12, (op2_2)object4);
            object4 = new aF3$a((ze3_1)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object4);
        }
        ai0_2.t(object6);
        object = new Handler();
        object2 = new St1(this, 1);
        object.postDelayed((Runnable)object2, (long)100);
    }

    public final void b(OfferDetails offerDetails) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetail");
        Object object = this.f;
        object.getClass();
        String string2 = "offerDetails";
        Intrinsics.checkNotNullParameter(offerDetails, string2);
        object = ((af3_1)object).b;
        if (object != null) {
            object.b(offerDetails);
        }
    }

    public final void c(PriceValidation object) {
        object = this.f.b;
        if (object != null) {
            Boolean bl2 = Boolean.TRUE;
            object.Ka(null, bl2);
        }
    }

    public final void j(PaymentInstrumentInfo paymentInstrumentInfo) {
        ks2_1 ks2_12 = this;
        Object object = paymentInstrumentInfo;
        af3_1 af3_12 = this.f;
        if (paymentInstrumentInfo != null) {
            boolean bl2;
            Object object2 = af3_12.j;
            String string2 = null;
            if (object2 != null) {
                object2 = ((PaymentInstrumentInfo)object2).getCode();
            } else {
                bl2 = false;
                object2 = null;
            }
            Object object3 = paymentInstrumentInfo.getCode();
            boolean bl3 = true;
            bl2 = kotlin.text.b.i((String)object2, (String)object3, bl3);
            if (!bl2) {
                object2 = af3_12.j;
                if (object2 != null) {
                    ((PaymentInstrumentInfo)object2).setOfferDetails(null);
                    ((PaymentInstrumentInfo)object2).setPriceValidation(null);
                }
                if ((object2 = af3_12.b) != null) {
                    object2.a();
                }
                af3_12.j = object;
                object3 = ks2_12.c;
                if (object3 != null) {
                    int n3 = 1048575;
                    PaymentInstruments paymentInstruments = null;
                    TenantResponse tenantResponse = null;
                    hj_1 hj_12 = null;
                    HashSet hashSet = null;
                    object2 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n3, null);
                    object = paymentInstrumentInfo.getCode();
                    ((PriceRequest)object2).setInstrumentInstanceCode((String)object);
                    object = af3_12.f;
                    if (object != null) {
                        string2 = ((PaymentInstrumentType)object).getPaymentInstrumentCode();
                    }
                    ((PriceRequest)object2).setPaymentInstrument(string2);
                    object = af3_12.d;
                    paymentInstruments = object.j0();
                    tenantResponse = object.n8();
                    hj_12 = hj_1.WALLET;
                    hashSet = object.H();
                    ((op2_2)object3).k((PriceRequest)object2, paymentInstruments, tenantResponse, hj_12, hashSet);
                }
            }
        } else {
            af3_12.getClass();
        }
    }

    public final void p(int n3) {
        af3_1 af3_12 = this.f;
        Serializable serializable = af3_12.f;
        if (serializable != null && (serializable = ((PaymentInstrumentType)serializable).getPaymentInstrumentsInfo()) != null) {
            Serializable serializable2;
            int n4;
            int n7 = af3_12.i;
            int n8 = -1;
            if (n7 > n8 && n7 < (n4 = ((ArrayList)serializable).size()) && (serializable2 = (PaymentInstrumentInfo)((ArrayList)serializable).get(n7 = af3_12.i)) != null) {
                Boolean bl2 = Boolean.FALSE;
                ((PaymentInstrumentInfo)serializable2).setSelected(bl2);
            }
            if (n3 > n8 && n3 < (n7 = ((ArrayList)serializable).size()) && (serializable = (PaymentInstrumentInfo)((ArrayList)serializable).get(n3)) != null) {
                serializable2 = Boolean.TRUE;
                ((PaymentInstrumentInfo)serializable).setSelected((Boolean)serializable2);
            }
            af3_12.i = n3;
            te3_2 te3_22 = af3_12.g;
            if (te3_22 != null) {
                te3_22.notifyDataSetChanged();
            }
        }
    }

    public final void q(int n3) {
        int n4;
        int n7 = n3;
        Object object = this.f;
        Serializable serializable = ((af3_1)object).f;
        if (serializable != null && (serializable = ((PaymentInstrumentType)serializable).getPaymentInstrumentsInfo()) != null && n3 > (n4 = -1) && n3 < (n4 = ((ArrayList)serializable).size())) {
            int n8 = 1;
            OfferDetails offerDetails = null;
            Object object2 = new Wallet(null, n8, null);
            Object object3 = (PaymentInstrumentInfo)((ArrayList)serializable).get(n3);
            if (object3 != null) {
                object3 = ((PaymentInstrumentInfo)object3).getCode();
            } else {
                n8 = 0;
                object3 = null;
            }
            ((Wallet)object2).setCode((String)object3);
            object3 = ((af3_1)object).d;
            Serializable serializable2 = object3.n8();
            if (serializable2 != null && (object = ((af3_1)object).b) != null) {
                Object object4 = oo2_0.a;
                Serializable serializable3 = (PaymentInstrumentInfo)((ArrayList)serializable).get(n7);
                if (serializable3 != null) {
                    serializable3 = ((PaymentInstrumentInfo)serializable3).getPriceValidation();
                } else {
                    n7 = 0;
                    serializable3 = null;
                }
                float f5 = object3.D();
                object4.getClass();
                Intrinsics.checkNotNullParameter(serializable2, "tenantResponse");
                object4 = object3;
                int n10 = 0x3FFFFF;
                object3 = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n10, null);
                object4 = serializable2.getCustomer();
                ((PayNowRequest)object3).setCustomer((Customer)object4);
                object4 = serializable2.getOrder();
                ((PayNowRequest)object3).setOrder((Order)object4);
                serializable2 = serializable2.getTenant();
                ((PayNowRequest)object3).setTenant((Tenant)serializable2);
                ((PayNowRequest)object3).setWallet((Wallet)object2);
                object2 = "WALLET";
                ((PayNowRequest)object3).setPaymentInstrument((String)object2);
                if (serializable3 != null) {
                    object2 = ((PriceValidation)serializable3).getPriceSplitup();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    serializable = ((PriceValidation)serializable3).getPriceSplitup();
                    if (serializable != null) {
                        object2 = ((PriceSplitUp)serializable).getNetPayableAmount();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    ((PayNowRequest)object3).setNetPayableAmount((Float)object2);
                    if (serializable != null) {
                        object2 = ((PriceSplitUp)serializable).getOnepTotalPrice();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    ((PayNowRequest)object3).setOnepTotalPrice((String)object2);
                    if (serializable != null) {
                        object2 = ((PriceSplitUp)serializable).getThreepTotalPrice();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    ((PayNowRequest)object3).setThreepTotalPrice((String)object2);
                    if (serializable != null) {
                        offerDetails = ((PriceSplitUp)serializable).getOfferDetails();
                    }
                    if (offerDetails != null) {
                        float f6;
                        int n14;
                        serializable = ((PriceSplitUp)serializable).getOfferDetails();
                        n4 = 0;
                        object2 = null;
                        if (serializable != null && (serializable = ((OfferDetails)serializable).getOfferAmountApplied()) != null) {
                            f5 = ((Float)serializable).floatValue();
                        } else {
                            n14 = 0;
                            f5 = 0.0f;
                            serializable = null;
                        }
                        n14 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                        if (n14 > 0) {
                            serializable3 = oo2_0.e((PriceValidation)serializable3);
                            ((PayNowRequest)object3).setOfferDetails((Map)((Object)serializable3));
                        }
                    }
                } else {
                    serializable3 = Float.valueOf(f5);
                    ((PayNowRequest)object3).setNetPayableAmount((Float)serializable3);
                }
                object.v1((PayNowRequest)object3);
            }
        }
    }
}

