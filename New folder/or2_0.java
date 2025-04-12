/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ListAdapter
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Or2
 */
public final class or2_0
extends rw_2
implements eg_1 {
    public final View b;
    public final dv_0 c;
    public final co2_0 d;
    public final il_2 e;
    public final PEToggleButton f;
    public final AjioCustomExpandablePanel g;
    public final View h;
    public final AjioTextView i;
    public final RelativeLayout j;
    public final AjioTextView k;
    public PaymentInstrumentType l;
    public PaymentInstrumentType m;
    public boolean n;

    public or2_0(dv_0 object, mu1_1 object2, co2_0 object3, op2_2 object4, View object5) {
        il_2 il_22;
        Intrinsics.checkNotNullParameter(object5, "v");
        Intrinsics.checkNotNullParameter(object3, "paymentInfoProvider");
        super((View)object5);
        this.b = object5;
        this.c = object;
        this.d = object3;
        Object object6 = il_22;
        Object object7 = object4;
        mu1_1 mu1_12 = object2;
        dv_0 dv_02 = object;
        or2_0 or2_02 = this;
        co2_0 co2_02 = object3;
        this.e = il_22 = new il_2((op2_2)object4, (mu1_1)object2, (dv_0)object, this, (co2_0)object3);
        int n3 = R$id.card_toggle_expand;
        object = object5.findViewById(n3);
        object6 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object6);
        this.f = object = (PEToggleButton)object;
        int n4 = R$id.expandable_payment_card;
        object7 = object5.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object6);
        object7 = (AjioCustomExpandablePanel)((Object)object7);
        this.g = object7;
        n4 = R$id.card_listView;
        object7 = object5.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object6);
        object7 = (PENonScrollableListView)((Object)object7);
        int n7 = R$id.view_rbi_guideline;
        mu1_12 = object5.findViewById(n7);
        this.h = mu1_12;
        int n8 = R$id.tv_rbi_guideline_subtitle;
        dv_02 = (TextView)object5.findViewById(n8);
        int n10 = R$id.tv_rbi_guideline_title;
        or2_02 = (TextView)object5.findViewById(n10);
        int n14 = R$id.credit_card_tv_addCard;
        co2_02 = object5.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(co2_02, (String)object6);
        co2_02 = (TextView)co2_02;
        int n15 = R$id.credit_card_tv_viewMore;
        Object object8 = object5.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object6);
        object8 = (AjioTextView)object8;
        this.i = object8;
        int n16 = R$id.no_card_container;
        View view = object5.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(view, (String)object6);
        view = (RelativeLayout)view;
        this.j = view;
        int n17 = R$id.credit_card_addCard;
        object5 = object5.findViewById(n17);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
        object5 = (AjioTextView)object5;
        this.k = object5;
        int n18 = og1_1.b();
        if (n18 != 0) {
            ((AjioTextView)object8).underlineText();
        }
        if ((n18 = object3.g6()) != 0) {
            if (mu1_12 != null) {
                n18 = 0;
                object5 = null;
                mu1_12.setVisibility(0);
            }
            if (or2_02 != null) {
                object5 = (CharSequence)object3.L3().a;
                or2_02.setText((CharSequence)object5);
            }
            if (dv_02 != null) {
                object3 = (CharSequence)object3.L3().b;
                dv_02.setText((CharSequence)object3);
            }
        }
        n18 = 3;
        object3 = new eV(this, n18);
        co2_02.setOnClickListener((View.OnClickListener)object3);
        object3 = il_22.i;
        object7.setAdapter((ListAdapter)object3);
        if (object2 != null && object4 != null && (object3 = ((op2_2)object4).s) != null) {
            n18 = 0;
            object4 = new hl_2(il_22, 0);
            super((hl_2)object4);
            ((LiveData)object3).e((mu1_1)object2, (F62)object5);
        }
        object2 = new nr2_0(this);
        object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object2);
        ai0_2.t(view);
    }

    public final void b(OfferDetails offerDetails) {
        dv_0 dv_02 = this.c;
        if (dv_02 != null) {
            dv_02.b(offerDetails);
        }
    }

    public final void c(PriceValidation priceValidation) {
        dv_0 dv_02 = this.e.c;
        if (dv_02 != null) {
            Boolean bl2 = Boolean.TRUE;
            dv_02.Ka(priceValidation, bl2);
        }
    }

    public final void r(LpStoredCardBalance lpStoredCardBalance) {
        dv_0 dv_02 = this.c;
        if (dv_02 != null) {
            dv_02.r(lpStoredCardBalance);
        }
    }

    public final void s(PaymentInstrumentInfo paymentInstrumentInfo) {
        Object object = paymentInstrumentInfo;
        Object object2 = this.e;
        if (paymentInstrumentInfo == null) {
            object2.getClass();
        } else {
            op2_2 op2_22;
            Object object3 = ((il_2)object2).e;
            PriceRequest priceRequest = null;
            if (object3 != null) {
                ((PaymentInstrumentInfo)object3).setLoyalty(null);
                ((PaymentInstrumentInfo)object3).setOfferDetails(null);
                ((PaymentInstrumentInfo)object3).setPriceValidation(null);
            }
            ((il_2)object2).e = object;
            object3 = ((il_2)object2).c;
            if (object3 != null) {
                object3.a();
            }
            if ((op2_22 = ((il_2)object2).a) != null) {
                PriceRequest priceRequest2;
                int n3 = 0;
                float f5 = 0.0f;
                hj_1 hj_12 = null;
                HashSet hashSet = null;
                int n4 = 0;
                Object object4 = object3;
                object3 = new Card(null, null, null, null, null, null, null, null, null, false, 1023, null);
                object4 = paymentInstrumentInfo.getPaymentInstrumentId();
                ((Card)object3).setPaymentInstrumentId((String)object4);
                object4 = oo2_0.a;
                object2 = ((il_2)object2).d;
                Object object5 = object2.Y8();
                Object object6 = paymentInstrumentInfo.getPaymentInstrumentId();
                object4.getClass();
                object4 = oo2_0.d((String)object6, (ArrayList)object5);
                object5 = priceRequest2;
                boolean bl2 = false;
                object6 = null;
                int n7 = 0;
                priceRequest = priceRequest2;
                priceRequest2 = null;
                int n8 = 1048575;
                ((PriceRequest)object5)(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                if (object4 != null) {
                    object5 = ((LpStoredCardBalance)object4).isSelected();
                    object6 = Boolean.TRUE;
                    n3 = Intrinsics.areEqual(object5, object6);
                } else {
                    n3 = 0;
                    f5 = 0.0f;
                    object5 = null;
                }
                if (n3 != 0) {
                    float f6;
                    object5 = ((LpStoredCardBalance)object4).getLoyaltyPoints();
                    bl2 = false;
                    object6 = null;
                    if (object5 != null) {
                        f5 = ((Float)object5).floatValue();
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object5 = null;
                    }
                    n3 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                    if (n3 > 0) {
                        n4 = 0;
                        priceRequest2 = null;
                        hj_12 = null;
                        hashSet = null;
                        n7 = 127;
                        object6 = object5;
                        object5 = new Customer(null, null, null, null, null, null, null, n7, null);
                        object6 = "";
                        ((Customer)object5).setFirstName((String)object6);
                        ((Customer)object5).setLastName((String)object6);
                        ((Customer)object5).setName((String)object6);
                        ((Customer)object5).setEmail((String)object6);
                        object6 = paymentInstrumentInfo.getRegisteredMobile();
                        bl2 = TextUtils.isEmpty((CharSequence)object6);
                        object = !bl2 ? paymentInstrumentInfo.getRegisteredMobile() : ((object = object2.n8()) != null && (object = ((TenantResponse)object).getCustomer()) != null ? ((Customer)object).getMobile() : null);
                        ((Customer)object5).setMobile((String)object);
                        hj_12 = null;
                        hashSet = null;
                        n4 = 31;
                        priceRequest2 = null;
                        object6 = object;
                        object = new Loyalty(null, null, null, null, null, n4, null);
                        object6 = ((LpStoredCardBalance)object4).getLoyaltyPoints();
                        ((Loyalty)object).setLoyaltyPoints((Float)object6);
                        priceRequest.setLoyalty((Loyalty)object);
                        priceRequest.setCustomer((Customer)object5);
                        object = ((LpStoredCardBalance)object4).isLRManaged();
                        priceRequest.setLRManaged((String)object);
                    }
                }
                object = ((Card)object3).getCardNumber();
                priceRequest.setCardNumber((String)object);
                object = ((Card)object3).getPaymentInstrumentId();
                priceRequest.setPaymentInstrumentId((String)object);
                object5 = object2.j0();
                object6 = object2.n8();
                hj_12 = hj_1.EXISTING_CARD;
                hashSet = object2.H();
                object4 = priceRequest;
                op2_22.k(priceRequest, (PaymentInstruments)object5, (TenantResponse)object6, hj_12, hashSet);
            }
        }
    }

    public final void showLoyaltyInfoFragment() {
        Object object = this.e;
        Object object2 = ((il_2)object).c;
        if (object2 != null) {
            object2.showLoyaltyInfoFragment();
        }
        if ((object = ((il_2)object).e) != null) {
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            String string2 = "CardExpandedLRViewDetailsClicked";
            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string2, string2);
        } else {
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            String string3 = "CardMinimisedLRViewDetailsClicked";
            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string3, string3);
        }
    }

    public final void t() {
        dv_0 dv_02 = this.c;
        if (dv_02 != null) {
            dv_02.q8();
        }
    }

    public final void u() {
        this.e.i.notifyDataSetChanged();
    }

    public final void v(Card object, PaymentInstrumentInfo paymentInstrumentInfo) {
        Intrinsics.checkNotNullParameter(paymentInstrumentInfo, "paymentInstrumentInfo");
        PriceValidation priceValidation = paymentInstrumentInfo.getPriceValidation();
        Object object2 = this.e;
        Object object3 = ((il_2)object2).d;
        Object object4 = object3.n8();
        Object object5 = null;
        if (object4 != null) {
            float f5;
            float f6 = object3.D();
            object3 = object3.Y8();
            ((il_2)object2).f.getClass();
            Intrinsics.checkNotNullParameter(object4, "tenantResponse");
            oo2_0.a.getClass();
            object2 = oo2_0.n((Card)object, priceValidation, (TenantResponse)object4, f6);
            object = oo2_0.d(((Card)object).getPaymentInstrumentId(), (ArrayList)object3);
            if (priceValidation != null && (object3 = priceValidation.getPriceSplitup()) != null && (object3 = ((PriceSplitUp)object3).getLoyalty()) != null && object != null) {
                Object object6;
                object4 = ((LpStoredCardBalance)object).getMobileNumberRegistered();
                boolean bl2 = Intrinsics.areEqual(object4, object6 = Boolean.TRUE);
                if (bl2) {
                    object4 = ((LpStoredCardBalance)object).getMobile();
                    ((PayNowRequest)object2).setRegisteredMobile((String)object4);
                }
                object4 = (bl2 = ((String)(object6 = "NA")).equalsIgnoreCase((String)(object4 = ((LpStoredCardBalance)object).isLRManaged()))) ? "YES" : ((LpStoredCardBalance)object).isLRManaged();
                ((PayNowRequest)object2).setLRManaged((String)object4);
                object = ((LpStoredCardBalance)object).getStatus();
                ((Loyalty)object3).setStatus((String)object);
                ((PayNowRequest)object2).setLoyalty((Loyalty)object3);
            }
            if (priceValidation != null) {
                object = priceValidation.getPriceSplitup();
            } else {
                object = null;
                f5 = 0.0f;
            }
            if (object != null) {
                object = priceValidation.getPriceSplitup();
                if (object != null && (object = ((PriceSplitUp)object).getNetPayableAmount()) != null) {
                    f5 = ((Float)object).floatValue();
                } else {
                    f5 = 0.0f;
                    object = null;
                }
                object = Float.valueOf(f5);
                ((PayNowRequest)object2).setNetPayableAmount((Float)object);
                object = priceValidation.getPriceSplitup();
                if (object != null) {
                    object = ((PriceSplitUp)object).getOnepTotalPrice();
                } else {
                    object = null;
                    f5 = 0.0f;
                }
                ((PayNowRequest)object2).setOnepTotalPrice((String)object);
                object = priceValidation.getPriceSplitup();
                if (object != null) {
                    object5 = ((PriceSplitUp)object).getThreepTotalPrice();
                }
                ((PayNowRequest)object2).setThreepTotalPrice((String)object5);
            } else {
                object = Float.valueOf(f6);
                ((PayNowRequest)object2).setNetPayableAmount((Float)object);
            }
            object5 = object2;
        }
        if (object5 != null && (object = this.c) != null) {
            object.D0((PayNowRequest)object5, paymentInstrumentInfo);
        }
    }

    public final int w() {
        int n3;
        Serializable serializable = this.l;
        if (serializable != null && (serializable = ((PaymentInstrumentType)serializable).getPaymentInstrumentsInfo()) != null) {
            n3 = ((ArrayList)serializable).size();
        } else {
            n3 = 0;
            serializable = null;
        }
        return n3;
    }

    public final void x(qq2_2 object, PaymentInstrumentType object2) {
        HashSet hashSet;
        float f5;
        int n3;
        Object object3 = "rvData";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        this.l = object2;
        object2 = this.e;
        ((il_2)object2).h = object;
        ((il_2)object2).i.getClass();
        object = this.d;
        int n4 = object.g6();
        boolean bl2 = true;
        Object object4 = this.g;
        String string2 = null;
        Object object5 = this.f;
        AjioTextView ajioTextView = this.i;
        if (n4 != 0) {
            object3 = this.l;
            ((il_2)object2).a(ajioTextView, (PaymentInstrumentType)object3);
        } else {
            n4 = this.w();
            if (n4 > 0) {
                object3 = this.l;
                ((il_2)object2).a(ajioTextView, (PaymentInstrumentType)object3);
            } else {
                n3 = R$drawable.pe_chevron_right;
                object2 = hv3_0.r(n3);
                object5.setCompoundDrawablesWithIntrinsicBounds(null, null, (Drawable)object2, null);
                object4.setDisableExpand(bl2);
            }
        }
        n3 = (int)(dm0_0.c ? 1 : 0);
        n4 = 0;
        object3 = null;
        int n7 = 8;
        if (n3 != 0 && (n3 = (int)(oo2_0.l(n7, (TenantResponse)(object2 = object.n8()), f5 = object.D(), hashSet = object.H()) ? 1 : 0)) == 0 && (n3 = this.w()) > 0) {
            this.n = bl2;
            object5.toggle();
            dm0_0.c = false;
        }
        n3 = this.w();
        String string3 = "findViewById(...)";
        object5 = this.c;
        View view = this.b;
        hashSet = this.j;
        if (n3 <= 0 && (n3 = (int)(object.g6() ? 1 : 0)) == 0) {
            object4.setVisibility(n7);
            hashSet.setVisibility(0);
            int n8 = 1;
            object2 = new z22_0(this, n8);
            object4 = this.k;
            object4.setOnClickListener((View.OnClickListener)object2);
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 == 0) {
                n3 = R$id.instantDiscountContainer1;
                object2 = view.findViewById(n3);
                object = object.g8();
                if (object2 != null) {
                    if (object != null) {
                        string2 = ((InstantDiscountInfo)object).getDescription();
                    }
                    if (string2 != null && (n8 = string2.length()) != 0) {
                        object2.setVisibility(0);
                        n4 = R$id.discInfo;
                        object2 = object2.findViewById(n4);
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        object2 = (TextView)object2;
                        no2_0.a((InstantDiscountInfo)object, (TextView)object2, (dv_0)object5);
                    } else {
                        object2.setVisibility(n7);
                    }
                }
            }
        } else {
            hashSet.setVisibility(n7);
            object4.setVisibility(0);
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 == 0) {
                n3 = R$id.instantDiscountContainer2;
                object2 = view.findViewById(n3);
                object = object.g8();
                if (object2 != null) {
                    int n10;
                    if (object != null) {
                        string2 = ((InstantDiscountInfo)object).getDescription();
                    }
                    if (string2 != null && (n10 = string2.length()) != 0) {
                        object2.setVisibility(0);
                        n4 = R$id.discInfo;
                        object2 = object2.findViewById(n4);
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        object2 = (TextView)object2;
                        no2_0.a((InstantDiscountInfo)object, (TextView)object2, (dv_0)object5);
                    } else {
                        object2.setVisibility(n7);
                    }
                }
            }
        }
    }
}

