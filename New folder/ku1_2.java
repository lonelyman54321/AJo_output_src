/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from KU1
 */
public final class ku1_2
implements PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public final View a;
    public final dv_0 b;
    public final TextView c;
    public final co2_0 d;
    public TextView e;
    public final hh3_2 f;
    public final eo2_0 g;
    public List h;
    public final View[] i;
    public int j;
    public PaymentInstrumentInfo k;
    public PaymentInstrumentType l;

    public ku1_2(View view, dv_0 viewArray, View.OnClickListener onClickListener, TextView textView, co2_0 co2_02) {
        Intrinsics.checkNotNullParameter(view, "v");
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        Intrinsics.checkNotNullParameter(textView, "more");
        String string2 = "paymentInfoProvider";
        Intrinsics.checkNotNullParameter(co2_02, string2);
        this.a = view;
        this.b = viewArray;
        this.c = textView;
        this.d = co2_02;
        viewArray = new vr0_2(this, 1);
        viewArray = yr1_2.b((Function0)viewArray);
        this.f = viewArray;
        viewArray = new eo2_0();
        this.g = viewArray;
        int n3 = 4;
        viewArray = new View[n3];
        this.i = viewArray;
        this.j = -1;
        int n4 = R$id.netbanking_bank_one;
        textView = view.findViewById(n4);
        co2_02 = null;
        viewArray[0] = textView;
        n4 = R$id.netbanking_bank_two;
        textView = view.findViewById(n4);
        int n7 = 1;
        viewArray[n7] = textView;
        n4 = R$id.netbanking_bank_three;
        textView = view.findViewById(n4);
        int n8 = 2;
        viewArray[n8] = textView;
        n4 = R$id.netbanking_bank_four;
        view = view.findViewById(n4);
        n4 = 3;
        viewArray[n4] = view;
        view = viewArray[0];
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        if ((view = viewArray[n7]) != null) {
            view.setOnClickListener(onClickListener);
        }
        if ((view = viewArray[n8]) != null) {
            view.setOnClickListener(onClickListener);
        }
        if ((view = viewArray[n4]) != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void a() {
        Object object = this.h;
        PaymentInstrumentType paymentInstrumentType = null;
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                if (paymentInstrumentInfo == null) continue;
                paymentInstrumentInfo.setPriceValidation(null);
                paymentInstrumentInfo.setOfferDetails(null);
            }
        }
        this.k = null;
        object = this.h;
        paymentInstrumentType = this.l;
        this.b((List)object, paymentInstrumentType);
    }

    /*
     * Unable to fully structure code
     */
    public final void b(List var1_1, PaymentInstrumentType var2_2) {
        block49: {
            var3_3 = 1;
            this.l = var2_2;
            if (var1_1 == null || (var4_4 = var1_1.isEmpty()) != 0) break block49;
            this.h = var1_1;
            var4_4 = var1_1.size();
            var5_5 = 8;
            var6_6 = this.c;
            var7_7 = 4;
            if (var4_4 > var7_7) {
                var6_6.setVisibility(0);
            } else {
                var6_6.setVisibility(var5_5);
            }
            var2_2 = null;
            for (var4_4 = 0; var4_4 < var7_7 && var4_4 < (var8_8 = var1_1.size()); var4_4 += var3_3) {
                var6_6 = this.i;
                var9_9 = var6_6[var4_4];
                if (var9_9 != null) {
                    var9_9.setVisibility(0);
                }
                if ((var9_9 = var6_6[var4_4]) != null) {
                    var10_10 = R$id.view_netbanking_tv_name;
                    var9_9 = (TextView)var9_9.findViewById(var10_10);
                } else {
                    var11_11 = 0;
                    var9_9 = null;
                }
                var12_12 = var6_6[var4_4];
                if (var12_12 != null) {
                    var13_13 = R$id.view_netbanking_imv;
                    var12_12 = (ImageView)var12_12.findViewById(var13_13);
                } else {
                    var10_10 = 0;
                    var12_12 = null;
                }
                var14_14 = var6_6[var4_4];
                if (var14_14 != null) {
                    var15_15 = R$id.proceed_btn_tv;
                    var14_14 = (TextView)var14_14.findViewById(var15_15);
                } else {
                    var13_13 = 0;
                    var14_14 = null;
                }
                if (var14_14 != null) {
                    var16_16 = StringCompanionObject.INSTANCE;
                    var17_17 = this.d.D();
                    var16_16 = kq2_1.a(var17_17);
                    var18_18 = new Object[var3_3];
                    var18_18[0] = var16_16;
                    var16_16 = "PAY \u20b9%s SECURELY";
                    var19_19 = "format(...)";
                    zn0_1.b(var18_18, var3_3, (String)var16_16, var19_19, (TextView)var14_14);
                }
                if (var14_14 != null) {
                    var16_16 = new ju1_2(this);
                    var14_14.setOnClickListener((View.OnClickListener)var16_16);
                }
                if (var12_12 != null) {
                    var12_12.setContentDescription((CharSequence)"");
                    var14_14 = new da$a();
                    var14_14.k = var3_3;
                    var14_14.g = var3_3;
                    var16_16 = (PaymentInstrumentInfo)var1_1.get(var4_4);
                    if (var16_16 != null) {
                        var16_16 = var16_16.getIconURL();
                    } else {
                        var15_15 = 0;
                        var16_16 = null;
                        var17_17 = 0.0f;
                    }
                    var14_14.n = var16_16;
                    var14_14.u = var12_12;
                    var14_14.a();
                }
                if (var9_9 != null) {
                    var12_12 = (PaymentInstrumentInfo)var1_1.get(var4_4);
                    if (var12_12 != null) {
                        var12_12 = var12_12.getName();
                    } else {
                        var10_10 = 0;
                        var12_12 = null;
                    }
                    var9_9.setText((CharSequence)var12_12);
                }
                if ((var9_9 = var6_6[var4_4]) != null) {
                    var10_10 = R$id.pf_container;
                    var9_9 = (TextView)var9_9.findViewById(var10_10);
                } else {
                    var11_11 = 0;
                    var9_9 = null;
                }
                this.e = var9_9;
                var9_9 = (PaymentInstrumentInfo)var1_1.get(var4_4);
                if (var9_9 != null) {
                    var9_9 = var9_9.getLowSuccessRate();
                    var12_12 = Boolean.TRUE;
                    var11_11 = Intrinsics.areEqual(var9_9, var12_12);
                } else {
                    var11_11 = 0;
                    var9_9 = null;
                }
                if (var11_11 == 0) ** GOTO lbl-1000
                var9_9 = (PaymentInstrumentInfo)var1_1.get(var4_4);
                if (var9_9 != null) {
                    var9_9 = var9_9.getMessage();
                } else {
                    var11_11 = 0;
                    var9_9 = null;
                }
                var11_11 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                if (var11_11 == 0) {
                    var9_9 = this.e;
                    if (var9_9 != null) {
                        var9_9.setVisibility(0);
                    }
                    if ((var9_9 = this.e) != null) {
                        var12_12 = (PaymentInstrumentInfo)var1_1.get(var4_4);
                        if (var12_12 != null) {
                            var12_12 = var12_12.getMessage();
                        } else {
                            var10_10 = 0;
                            var12_12 = null;
                        }
                        var9_9.setText((CharSequence)var12_12);
                    }
                } else if ((var9_9 = this.e) != null) {
                    var9_9.setVisibility(var5_5);
                }
                if ((var6_6 = var6_6[var4_4]) != null) {
                    var11_11 = R$id.layout_loyaltyCardInfo;
                    var6_6 = (PesdkLoyaltyCardInfoView)var6_6.findViewById(var11_11);
                } else {
                    var8_8 = 0;
                    var6_6 = null;
                }
                var9_9 = this.h;
                if (var9_9 != null && (var9_9 = (PaymentInstrumentInfo)var9_9.get(var4_4)) != null && (var9_9 = var9_9.getPriceValidation()) != null && (var9_9 = var9_9.getPriceSplitup()) != null) {
                    var9_9 = var9_9.getOfferDetails();
                } else {
                    var11_11 = 0;
                    var9_9 = null;
                }
                if (var9_9 != null) {
                    var12_12 = this.h;
                    if (var12_12 != null && (var12_12 = (PaymentInstrumentInfo)var12_12.get(var4_4)) != null) {
                        var12_12 = var12_12.getPriceValidation();
                    } else {
                        var10_10 = 0;
                        var12_12 = null;
                    }
                    if (var12_12 != null) {
                        var12_12 = this.h;
                        if (var12_12 != null && (var12_12 = (PaymentInstrumentInfo)var12_12.get(var4_4)) != null && (var12_12 = var12_12.getPriceValidation()) != null) {
                            var12_12 = var12_12.getInstantDiscountMsg();
                        } else {
                            var10_10 = 0;
                            var12_12 = null;
                        }
                        var10_10 = (int)TextUtils.isEmpty((CharSequence)var12_12);
                        if (var10_10 == 0) {
                            var12_12 = this.h;
                            if (var12_12 != null && (var12_12 = (PaymentInstrumentInfo)var12_12.get(var4_4)) != null && (var12_12 = var12_12.getPriceValidation()) != null) {
                                var12_12 = var12_12.getInstantDiscountMsg();
                            } else {
                                var10_10 = 0;
                                var12_12 = null;
                            }
                            var9_9.setInstantDiscountMsg((String)var12_12);
                            var12_12 = this.h;
                            if (var12_12 != null && (var12_12 = (PaymentInstrumentInfo)var12_12.get(var4_4)) != null && (var12_12 = var12_12.getPriceValidation()) != null && (var12_12 = var12_12.getPriceSplitup()) != null) {
                                var12_12 = var12_12.getNetPayableAmount();
                            } else {
                                var10_10 = 0;
                                var12_12 = null;
                            }
                            var9_9.setNetPayableAmount((Float)var12_12);
                        }
                    }
                }
                if (var6_6 != null) {
                    var12_12 = this.h;
                    if (var12_12 != null && (var12_12 = (PaymentInstrumentInfo)var12_12.get(var4_4)) != null) {
                        var12_12 = var12_12.getName();
                    } else {
                        var10_10 = 0;
                        var12_12 = null;
                    }
                    var14_14 = "netbanking-";
                    var12_12 = kp1_0.c((String)var14_14, (String)var12_12);
                    var6_6.setData(null, (OfferDetails)var9_9, var3_3, (String)var12_12);
                }
                if (var6_6 == null) continue;
                var6_6.setCardClickListener(this);
            }
        }
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

