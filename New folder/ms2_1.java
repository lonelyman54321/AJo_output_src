/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ms2
 */
public final class ms2_1
extends rw_2
implements xt3_0,
PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener,
View.OnClickListener {
    public final dv_0 b;
    public final co2_0 c;
    public final op2_2 d;
    public final mu1_1 e;
    public final PEToggleButton f;
    public final AjioCustomExpandablePanel g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final ImageView j;
    public final PesdkLoyaltyCardInfoView k;
    public final NewEEcommerceEventsRevamp l;
    public final NewCustomEventsRevamp m;
    public UpiAppInfo n;
    public final cu3 o;

    public ms2_1(dv_0 dv_02, mu1_1 mu1_12, co2_0 co2_02, op2_2 op2_22, View view) {
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "v");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        super(view);
        this.b = dv_02;
        this.c = co2_02;
        this.d = op2_22;
        this.e = mu1_12;
        Object object2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(object2, "getContext(...)");
        int n3 = R$id.upi_toggle_expand;
        Object object3 = view.findViewById(n3);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object3, object4);
        object3 = (PEToggleButton)object3;
        this.f = object3;
        int n4 = R$id.expandable_payment_upi;
        Object object5 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object5, object4);
        object5 = (AjioCustomExpandablePanel)((Object)object5);
        this.g = object5;
        n4 = R$id.proceed_btn_txt;
        object5 = (AjioTextView)view.findViewById(n4);
        this.h = object5;
        int n7 = R$id.tv_upi;
        Object object6 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object6, object4);
        object6 = (AjioTextView)object6;
        this.i = object6;
        n7 = R$id.img_upi;
        object6 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object6, object4);
        object6 = (ImageView)object6;
        this.j = object6;
        int n8 = R$id.layout_loyaltyCardInfo;
        object4 = (PesdkLoyaltyCardInfoView)view.findViewById(n8);
        this.k = object4;
        n7 = R$id.tv_preferred_upi_title;
        object = (AjioTextView)view.findViewById(n7);
        object6 = AnalyticsManager.Companion;
        Object object7 = ((AnalyticsManager$Companion)object6).getInstance().getNewEEcommerceEventsRevamp();
        this.l = object7;
        this.m = object6 = ((AnalyticsManager$Companion)object6).getInstance().getNewCustomEventsRevamp();
        this.o = object6 = new cu3((Context)object2);
        object2 = h40_0.a;
        object2 = h40_0.i0();
        object7 = "mop_header";
        boolean bl2 = object2.has((String)object7);
        if (bl2) {
            object2 = h40_0.i0().getString((String)object7);
            object7 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object7);
        } else {
            object2 = "";
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl3 && object != null) {
            object.setText((CharSequence)object2);
        }
        super(this);
        object3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
        ((PEToggleButton)object3).setSpanText();
        object = object6;
        object2 = object4;
        object3 = object5;
        ((cu3)object6).d(op2_22, mu1_12, co2_02, dv_02, (PesdkLoyaltyCardInfoView)((Object)object4), (TextView)object5);
    }

    public final void a(hj_1 hj_12, UpiAppInfo upiAppInfo) {
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        this.o.a(hj_12, upiAppInfo);
    }

    public final void c(PriceValidation object) {
        object = this.o.i;
        if (object != null) {
            Boolean bl2 = Boolean.TRUE;
            object.Ka(null, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        PriceValidation priceValidation = null;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.proceed_btn_txt;
        if (object == null) {
            return;
        }
        n3 = (Integer)object;
        if (n3 != n4) return;
        object = cp_1.Companion;
        object.getClass();
        n3 = (int)(cp$a.s() ? 1 : 0);
        dv_0 dv_02 = this.b;
        Object object2 = this.o;
        if (n3 != 0) {
            object = this.n;
            if (object != null) {
                object = ((UpiAppInfo)object).getPackageName();
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null || (n3 = ((String)object).length()) == 0) {
                object = this.n;
                if (object != null) {
                    object = ((UpiAppInfo)object).getName();
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null && (n3 = ((String)object).length()) != 0) {
                    object = this.n;
                    if (object != null) {
                        object = ((UpiAppInfo)object).getPaymentInstrumentId();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    uy2_1.a = object;
                    int n7 = 255;
                    Object object3 = object;
                    object = new UPI(null, null, null, null, null, null, null, null, n7, null);
                    object3 = this.n;
                    object3 = object3 != null ? ((UpiAppInfo)object3).getName() : null;
                    ((UPI)object).setVpa((String)object3);
                    object3 = Boolean.TRUE;
                    ((UPI)object).setSaveUPI((Boolean)object3);
                    object3 = this.n;
                    object3 = object3 != null ? ((UpiAppInfo)object3).getPaymentInstrumentId() : null;
                    ((UPI)object).setPaymentInstrumentId((String)object3);
                    object3 = object2 != null && (object3 = ((cu3)object2).n) != null ? ((UPI)object3).getOfferDetails() : null;
                    ((UPI)object).setOfferDetails((OfferDetails)object3);
                    if (object2 != null && (object2 = ((cu3)object2).n) != null) {
                        priceValidation = ((UPI)object2).getPriceValidation();
                    }
                    ((UPI)object).setPriceValidation(priceValidation);
                    if (dv_02 == null) return;
                    dv_02.g9((UPI)object);
                    return;
                }
            }
        }
        if ((object = this.n) != null) {
            if (object2 != null && (object2 = ((cu3)object2).n) != null) {
                priceValidation = ((UPI)object2).getPriceValidation();
            }
            ((UpiAppInfo)object).setPriceValidation(priceValidation);
        }
        if (dv_02 == null) return;
        object = this.n;
        dv_02.y8((UpiAppInfo)object);
    }

    public final void onLoyaltyDeSelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltyDeSelected(this, lpStoredCardBalance);
    }

    public final void onLoyaltySelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltySelected(this, lpStoredCardBalance);
    }

    public final void onOfferClicked(OfferDetails offerDetails) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetail");
        dv_0 dv_02 = this.b;
        if (dv_02 != null) {
            dv_02.b(offerDetails);
        }
    }

    public final void onRegisterMobileClicked(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onRegisterMobileClicked(this, lpStoredCardBalance);
    }

    public final void showLoyaltyInfoFragment() {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.showLoyaltyInfoFragment(this);
    }

    public final void w(String string2) {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.l;
        String string3 = newEEcommerceEventsRevamp.getPrevScreen();
        String string4 = newEEcommerceEventsRevamp.getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(this.m, "checkout interactions", string2, "UPI", "spc_interactions", "single page checkout", "single page checkout", string3, null, string4, false, null, 1536, null);
    }
}

