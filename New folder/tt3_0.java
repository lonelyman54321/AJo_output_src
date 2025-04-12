/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Tt3
 */
public final class tt3_0
extends BaseAdapter
implements PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public final List a;
    public final dv_0 b;
    public final co2_0 c;
    public final xt3_0 d;
    public final LayoutInflater e;
    public int f;
    public final cu3 g;

    public tt3_0(Context context, ArrayList arrayList, dv_0 dv_02, co2_0 co2_02, xt3_0 xt3_02, cu3 cu32) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        Intrinsics.checkNotNullParameter(xt3_02, "upiListener");
        Intrinsics.checkNotNullParameter(cu32, "upiUtil");
        this.a = arrayList;
        this.b = dv_02;
        this.c = co2_02;
        this.d = xt3_02;
        context = LayoutInflater.from((Context)context);
        Intrinsics.checkNotNullExpressionValue(context, "from(...)");
        this.e = context;
        this.f = -1;
        this.g = cu32;
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Object getItem(int n3) {
        return (UpiAppInfo)this.a.get(n3);
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final View getView(int n3, View view, ViewGroup object) {
        Object object2;
        Object object3;
        float f5;
        Object object4;
        int n4;
        Object object5;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "parent");
        Object object6 = null;
        if (view == null) {
            int n8 = og1_1.b();
            object5 = this.e;
            if (n8 != 0) {
                n8 = R$layout.pesdk_lux_list_row_upi;
                view = object5.inflate(n8, object, false);
            } else {
                n8 = R$layout.pesdk_list_row_upi;
                view = object5.inflate(n8, object, false);
            }
            Intrinsics.checkNotNull(view);
            Intrinsics.checkNotNullParameter(view, "item");
            object = new Object();
            n4 = R$id.proceed_btn_txt;
            object5 = (AjioTextView)view.findViewById(n4);
            object.a = object5;
            n4 = R$id.tv_upi;
            object5 = view.findViewById(n4);
            object4 = "findViewById(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
            object5 = (AjioTextView)object5;
            object.b = object5;
            n4 = R$id.img_upi;
            object5 = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
            object5 = (ImageView)object5;
            object.c = object5;
            n4 = R$id.layout_loyaltyCardInfo;
            object5 = (PesdkLoyaltyCardInfoView)view.findViewById(n4);
            object.d = object5;
            view.setTag(object);
        } else {
            object = view.getTag();
            object5 = "null cannot be cast to non-null type com.ril.ajio.payment.adapter.UPIAdapter.UPIViewHolder";
            Intrinsics.checkNotNull(object, (String)object5);
            object = (Tt3$a)object;
        }
        n4 = this.f;
        if (n4 == n3) {
            object5 = object.a;
            if (object5 != null) {
                object5.setVisibility(0);
            }
            if ((object5 = object.d) != null) {
                object5.setVisibility(0);
            }
            if ((object5 = object.a) != null) {
                object4 = StringCompanionObject.INSTANCE;
                f5 = this.c.D();
                object4 = kq2_1.a(f5);
                object3 = new Object[n7];
                object3[0] = object4;
                object6 = "PAY \u20b9%s SECURELY";
                object4 = "format(...)";
                n40_0.a((Object[])object3, n7, (String)object6, (String)object4, (AjioTextView)object5);
            }
        } else {
            object6 = object.a;
            n4 = 8;
            if (object6 != null) {
                object6.setVisibility(n4);
            }
            if ((object6 = object.d) != null) {
                object6.setVisibility(n4);
            }
        }
        n4 = 2;
        object6 = new pt_0(this, n4);
        view.setOnClickListener((View.OnClickListener)object6);
        object6 = this.a;
        object5 = (UpiAppInfo)object6.get(n3);
        f5 = 0.0f;
        object4 = null;
        object3 = object5 != null && (object3 = ((UpiAppInfo)object5).getPriceValidation()) != null && (object3 = ((PriceValidation)object3).getPriceSplitup()) != null ? ((PriceSplitUp)object3).getOfferDetails() : null;
        if (object3 != null && (object2 = ((UpiAppInfo)object5).getPriceValidation()) != null) {
            boolean bl2;
            object2 = ((UpiAppInfo)object5).getPriceValidation();
            if (object2 != null) {
                object2 = ((PriceValidation)object2).getInstantDiscountMsg();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                object2 = ((UpiAppInfo)object5).getPriceValidation();
                if (object2 != null) {
                    object2 = ((PriceValidation)object2).getInstantDiscountMsg();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                ((OfferDetails)object3).setInstantDiscountMsg((String)object2);
            }
            if ((object2 = ((UpiAppInfo)object5).getPriceValidation()) != null && (object2 = ((PriceValidation)object2).getPriceSplitup()) != null) {
                object2 = ((PriceSplitUp)object2).getNetPayableAmount();
            } else {
                bl2 = false;
                object2 = null;
            }
            ((OfferDetails)object3).setNetPayableAmount((Float)object2);
        }
        if ((object2 = object.d) != null) {
            if (object5 == null || (object5 = ((UpiAppInfo)object5).getName()) == null) {
                object5 = "";
            }
            String string2 = "upi-";
            object5 = string2.concat((String)object5);
            ((PesdkLoyaltyCardInfoView)((Object)object2)).setData(null, (OfferDetails)object3, n7, (String)object5);
        }
        Object object7 = (UpiAppInfo)object6.get(n3);
        object5 = this.g;
        object5.getClass();
        if (object7 != null) {
            object5 = ((UpiAppInfo)object7).getDisplayUPIInfo();
        } else {
            n4 = 0;
            object5 = null;
        }
        n4 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
        if (n4 == 0) {
            if (object7 != null) {
                object4 = ((UpiAppInfo)object7).getDisplayUPIInfo();
            }
        } else if (object7 != null) {
            object4 = ((UpiAppInfo)object7).getName();
        }
        object.b.setText((CharSequence)object4);
        object.e = n3;
        object7 = cp_1.Companion;
        object7.getClass();
        n7 = (int)(cp$a.s() ? 1 : 0);
        object5 = object.c;
        if (n7 != 0 && (object7 = ((UpiAppInfo)object6.get(n3)).getAppDrawabe()) == null) {
            n7 = R$drawable.ic_spc_upi_image;
            object5.setImageResource(n7);
            n7 = R$string.acc_upi_icon;
            object7 = hv3_0.K(n7);
            object5.setContentDescription((CharSequence)object7);
        } else {
            object7 = ((UpiAppInfo)object6.get(n3)).getAppDrawabe();
            object5.setImageDrawable((Drawable)object7);
        }
        object = object.a;
        if (object != null) {
            object7 = new st3_0(this, n3);
            object.setOnClickListener((View.OnClickListener)object7);
        }
        if (object2 != null) {
            ((PesdkLoyaltyCardInfoView)((Object)object2)).setCardClickListener(this);
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
}

