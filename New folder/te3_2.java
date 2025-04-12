/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from TE3
 */
public final class te3_2
extends BaseAdapter
implements PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public final List a;
    public final xe3_1 b;
    public final co2_0 c;
    public final LayoutInflater d;
    public int e;

    public te3_2(Context context, ArrayList arrayList, xe3_1 xe3_12, co2_0 co2_02) {
        Intrinsics.checkNotNullParameter(xe3_12, "listener");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        this.a = arrayList;
        this.b = xe3_12;
        this.c = co2_02;
        context = LayoutInflater.from((Context)context);
        Intrinsics.checkNotNullExpressionValue(context, "from(...)");
        this.d = context;
        this.e = -1;
    }

    public final int getCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final Object getItem(int n3) {
        List list = this.a;
        Intrinsics.checkNotNull(list);
        return (PaymentInstrumentInfo)list.get(n3);
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final View getView(int n3, View view, ViewGroup object) {
        String string2;
        Object object2;
        Object object3;
        Object object4;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(object, "parent");
        if (view == null) {
            int n7 = og1_1.b();
            object4 = this.d;
            if (n7 != 0) {
                n7 = R$layout.pesdk_lux_list_row_payment_wallet;
                view = object4.inflate(n7, object, false);
            } else {
                n7 = R$layout.pesdk_list_row_payment_wallet;
                view = object4.inflate(n7, object, false);
            }
            object4 = "element";
            Intrinsics.checkNotNullExpressionValue(view, (String)object4);
            object = new TE3$a(this, view);
            view.setTag(object);
        } else {
            object = view.getTag();
            object4 = "null cannot be cast to non-null type com.ril.ajio.payment.adapter.WalletAdapter.MyViewHolder";
            Intrinsics.checkNotNull(object, (String)object4);
            object = (TE3$a)object;
        }
        int n8 = this.e;
        int n10 = 8;
        if (n8 == n3) {
            object4 = object.c;
            if (object4 != null) {
                object4.setVisibility(0);
            }
            if ((object4 = object.c) != null) {
                object3 = StringCompanionObject.INSTANCE;
                float f5 = this.c.D();
                object3 = kq2_1.a(f5);
                object2 = new Object[n4];
                object2[0] = object3;
                object3 = "PAY \u20b9%s SECURELY";
                string2 = "format(...)";
                n40_0.a((Object[])object2, n4, (String)object3, string2, (AjioTextView)object4);
            }
        } else {
            object4 = object.c;
            if (object4 != null) {
                object4.setVisibility(n10);
            }
        }
        if ((object4 = object.d) != null) {
            ((PesdkLoyaltyCardInfoView)((Object)object4)).setCardClickListener(this);
        }
        if ((object4 = this.a) != null && (object3 = (PaymentInstrumentInfo)object4.get(n3)) != null) {
            Object object5;
            object2 = ((PaymentInstrumentInfo)object3).getPriceValidation();
            string2 = null;
            if ((object2 = object2 != null && (object2 = ((PriceValidation)object2).getPriceSplitup()) != null ? ((PriceSplitUp)object2).getOfferDetails() : null) != null && (object5 = ((PaymentInstrumentInfo)object3).getPriceValidation()) != null) {
                boolean bl2;
                object5 = ((PaymentInstrumentInfo)object3).getPriceValidation();
                if (object5 != null) {
                    object5 = ((PriceValidation)object5).getInstantDiscountMsg();
                } else {
                    bl2 = false;
                    object5 = null;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object5);
                if (!bl2) {
                    object5 = ((PaymentInstrumentInfo)object3).getPriceValidation();
                    if (object5 != null) {
                        object5 = ((PriceValidation)object5).getInstantDiscountMsg();
                    } else {
                        bl2 = false;
                        object5 = null;
                    }
                    ((OfferDetails)object2).setInstantDiscountMsg((String)object5);
                }
                if ((object5 = ((PaymentInstrumentInfo)object3).getPriceValidation()) != null && (object5 = ((PriceValidation)object5).getPriceSplitup()) != null) {
                    object5 = ((PriceSplitUp)object5).getNetPayableAmount();
                } else {
                    bl2 = false;
                    object5 = null;
                }
                ((OfferDetails)object2).setNetPayableAmount((Float)object5);
            }
            if ((object5 = object.d) != null) {
                object3 = ((PaymentInstrumentInfo)object3).getName();
                String string3 = "wallet-";
                object3 = kp1_0.c(string3, (String)object3);
                ((PesdkLoyaltyCardInfoView)((Object)object5)).setData(null, (OfferDetails)object2, n4, (String)object3);
            }
        }
        if (object4 != null) {
            object2 = object4;
            object2 = (ArrayList)object4;
            object3 = new O12(n4, this, object2);
            view.setOnClickListener((View.OnClickListener)object3);
            object4 = (PaymentInstrumentInfo)object4.get(n3);
            if (object4 != null) {
                Object object6;
                object3 = ((PaymentInstrumentInfo)object4).getName();
                object2 = object.a;
                object2.setText((CharSequence)object3);
                object.f = n3;
                Object object7 = new da$a();
                ((da$a)object7).k = n4;
                ((da$a)object7).g = n4;
                ((da$a)object7).n = object6 = ((PaymentInstrumentInfo)object4).getIconURL();
                object6 = object.b;
                ((da$a)object7).u = object6;
                ((da$a)object7).a();
                object7 = ((PaymentInstrumentInfo)object4).getLowSuccessRate();
                object6 = Boolean.TRUE;
                n3 = (int)(Intrinsics.areEqual(object7, object6) ? 1 : 0);
                object = object.e;
                if (n3 != 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object7 = ((PaymentInstrumentInfo)object4).getMessage())) ? 1 : 0)) == 0) {
                    object.setVisibility(0);
                    object7 = ((PaymentInstrumentInfo)object4).getMessage();
                    object.setText((CharSequence)object7);
                } else {
                    object.setVisibility(n10);
                }
            }
        }
        Intrinsics.checkNotNull(view);
        return view;
    }

    public final void onLoyaltyDeSelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltyDeSelected(this, lpStoredCardBalance);
    }

    public final void onLoyaltySelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltySelected(this, lpStoredCardBalance);
    }

    public final void onOfferClicked(OfferDetails offerDetails) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetail");
        this.b.b(offerDetails);
    }

    public final void onRegisterMobileClicked(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onRegisterMobileClicked(this, lpStoredCardBalance);
    }

    public final void showLoyaltyInfoFragment() {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.showLoyaltyInfoFragment(this);
    }
}

