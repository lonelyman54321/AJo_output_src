/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceValidation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Mr2
 */
public final class mr2_0
extends BaseAdapter
implements PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public final List a;
    public final eg_1 b;
    public final OnCheckoutClickListener c;
    public final co2_0 d;
    public PaymentInstrumentInfo e;

    public mr2_0(ArrayList arrayList, eg_1 eg_12, OnCheckoutClickListener onCheckoutClickListener, co2_0 co2_02) {
        Intrinsics.checkNotNullParameter(arrayList, "objects");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        this.a = arrayList;
        this.b = eg_12;
        this.c = onCheckoutClickListener;
        this.d = co2_02;
        this.b();
    }

    public final void b() {
        int n3;
        Object object = this.a;
        int n4 = object.size();
        if (n4 == (n3 = 1)) {
            n4 = 0;
            Serializable serializable = null;
            this.e = object = (PaymentInstrumentInfo)object.get(0);
            if (object != null) {
                serializable = Boolean.TRUE;
                ((PaymentInstrumentInfo)object).setCLicked((Boolean)serializable);
            }
            object = oo2_0.a;
            serializable = this.d.Y8();
            Object object2 = this.e;
            if (object2 != null) {
                object2 = ((PaymentInstrumentInfo)object2).getPaymentInstrumentId();
            } else {
                n3 = 0;
                object2 = null;
            }
            object.getClass();
            object = oo2_0.d((String)object2, (ArrayList)serializable);
            if (object != null) {
                serializable = Boolean.TRUE;
                ((LpStoredCardBalance)object).setSelected((Boolean)serializable);
                this.onLoyaltySelected((LpStoredCardBalance)object);
            }
        }
    }

    public final void c(List collection) {
        List list = this.a;
        list.clear();
        if (collection != null) {
            collection = collection;
            list.addAll(collection);
            this.b();
        }
        this.notifyDataSetChanged();
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Object getItem(int n3) {
        List list = this.a;
        Serializable serializable = (PaymentInstrumentInfo)list.get(n3);
        if (serializable == null) {
            n3 = 0;
            serializable = Integer.valueOf(0);
        }
        return serializable;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final View getView(int var1_1, View var2_2, ViewGroup var3_3) {
        var4_4 = this;
        var5_5 = var1_1;
        var6_6 /* !! */  = var3_3;
        var7_7 = 1;
        Intrinsics.checkNotNullParameter(var3_3, "parent");
        var8_8 = (PaymentInstrumentInfo)this.a.get(var1_1);
        var9_9 = 8;
        if (var2_2 == null) {
            var10_10 = new Mr2$a(this);
            AJIOApplication.Companion.getClass();
            var11_11 = LayoutInflater.from((Context)AJIOApplication$a.a());
            var12_12 = og1_1.b();
            if (var12_12 != 0) {
                var12_12 = R$layout.pesdk_lux_row_card_detail;
                var6_6 /* !! */  = var11_11.inflate(var12_12, var3_3, false);
            } else {
                var12_12 = R$layout.pesdk_row_card_detail;
                var6_6 /* !! */  = var11_11.inflate(var12_12, var3_3, false);
            }
            var13_13 = R$id.card_lr_layout;
            var11_11 = (RelativeLayout)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.d = var11_11;
            var13_13 = R$id.tv_lr_balance;
            var11_11 = (TextView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.e = var11_11;
            var13_13 = R$id.lr_check_box;
            var11_11 = (CheckBox)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.f = var11_11;
            var13_13 = R$id.layout_loyaltyCardInfo;
            var11_11 = (PesdkLoyaltyCardInfoView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.a = var11_11;
            var13_13 = R$id.view_credit_card_layout;
            var11_11 = var6_6 /* !! */ .findViewById(var13_13);
            var10_10.b = var11_11;
            var13_13 = R$id.credit_card_tv_bank;
            var11_11 = (TextView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.c = var11_11;
            var13_13 = R$id.star_text;
            var11_11 = (TextView)var6_6 /* !! */ .findViewById(var13_13);
            var13_13 = R$id.pe_creditcard_progress_bar;
            var11_11 = (PEProgressView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.o = var11_11;
            var13_13 = R$id.credit_card_imv;
            var11_11 = (ImageView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.h = var11_11;
            var13_13 = R$id.cvv_layout;
            var11_11 = (RelativeLayout)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.i = var11_11;
            var13_13 = R$id.credit_card_et_cvv;
            var11_11 = (EditText)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.j = var11_11;
            var13_13 = R$id.card_cvv_input;
            var11_11 = (TextInputLayout)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.k = var11_11;
            var13_13 = R$id.credit_card_lbl_whatsThis;
            var11_11 = (AjioTextView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.g = var11_11;
            var13_13 = R$id.proceed_btn_tv;
            var11_11 = (TextView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.n = var11_11;
            var13_13 = R$id.pf_container;
            var11_11 = (TextView)var6_6 /* !! */ .findViewById(var13_13);
            var10_10.l = var11_11;
            if (var11_11 != null) {
                var11_11.setVisibility(var9_9);
            }
            if ((var11_11 = var10_10.a) != null) {
                var11_11.setCardClickListener(var4_4);
            }
            var6_6 /* !! */ .setTag((Object)var10_10);
        } else {
            var6_6 /* !! */  = var2_2.getTag();
            Intrinsics.checkNotNull(var6_6 /* !! */ , "null cannot be cast to non-null type com.ril.ajio.payment.adapter.PesdkCreditCardAdapter.ViewHolder");
            var10_10 = var6_6 /* !! */ ;
            var10_10 = (Mr2$a)var6_6 /* !! */ ;
            var6_6 /* !! */  = var2_2;
        }
        var10_10.m = var5_5;
        var14_14 /* !! */  = var10_10.n;
        var11_11 = "PAY \u20b9%s SECURELY";
        var15_15 = "format(...)";
        var16_16 = var4_4.d;
        if (var14_14 /* !! */  != null) {
            var17_17 = StringCompanionObject.INSTANCE;
            var18_18 = var16_16.D();
            var17_17 = kq2_1.a(var18_18);
            var19_19 = new Object[var7_7];
            var19_19[0] = var17_17;
            zn0_1.b((Object[])var19_19, var7_7, (String)var11_11, (String)var15_15, var14_14 /* !! */ );
        }
        if ((var5_5 = (int)og1_1.b()) != 0 && (var14_14 /* !! */  = var10_10.g) != null) {
            var14_14 /* !! */ .underlineText();
        }
        if ((var14_14 /* !! */  = var10_10.g) != null) {
            var17_17 = new RF1(var4_4, var7_7);
            var14_14 /* !! */ .setOnClickListener((View.OnClickListener)var17_17);
        }
        if ((var14_14 /* !! */  = var10_10.n) != null) {
            var17_17 = new jr2_2(var4_4, var10_10, var8_8);
            var14_14 /* !! */ .setOnClickListener((View.OnClickListener)var17_17);
        }
        if ((var14_14 /* !! */  = var10_10.j) != null) {
            var17_17 = new Mr2$b(var10_10);
            var14_14 /* !! */ .addTextChangedListener((TextWatcher)var17_17);
        }
        var5_5 = 0;
        var20_20 = 0.0f;
        var14_14 /* !! */  = null;
        if (var8_8 == null || !(var22_22 = (boolean)Intrinsics.areEqual(var19_19 = var8_8.isCLicked(), var21_21 /* !! */  = Boolean.TRUE)) || (var19_19 = var8_8.getPriceValidation()) == null) ** GOTO lbl-1000
        var19_19 = var8_8.getPriceValidation();
        if (var19_19 != null) {
            var19_19 = var19_19.getPriceSplitup();
        } else {
            var22_22 = false;
            var23_23 = 0.0f;
            var19_19 = null;
        }
        if (var19_19 != null) {
            var19_19 = var8_8.getPriceValidation();
            if (var19_19 != null && (var19_19 = var19_19.getPriceSplitup()) != null && (var19_19 = var19_19.getNetPayableAmount()) != null) {
                var23_23 = var19_19.floatValue();
            } else {
                var22_22 = false;
                var23_23 = 0.0f;
                var19_19 = null;
            }
        } else lbl-1000:
        // 2 sources

        {
            var22_22 = 2139095039 != 0;
            var23_23 = 3.4028235E38f;
        }
        if (var8_8 == null || !(var25_25 = Intrinsics.areEqual(var21_21 /* !! */  = var8_8.isCLicked(), var24_24 = Boolean.TRUE)) || (var21_21 /* !! */  = var8_8.getPriceValidation()) == null) ** GOTO lbl-1000
        var21_21 /* !! */  = var8_8.getPriceValidation();
        if (var21_21 /* !! */  != null) {
            var21_21 /* !! */  = var21_21 /* !! */ .getPriceSplitup();
        } else {
            var25_25 = false;
            var26_26 = 0.0f;
            var21_21 /* !! */  = null;
        }
        if (var21_21 /* !! */  == null) ** GOTO lbl-1000
        var21_21 /* !! */  = var8_8.getPriceValidation();
        if (var21_21 /* !! */  != null && (var21_21 /* !! */  = var21_21 /* !! */ .getPriceSplitup()) != null) {
            var21_21 /* !! */  = var21_21 /* !! */ .getLoyalty();
        } else {
            var25_25 = false;
            var26_26 = 0.0f;
            var21_21 /* !! */  = null;
        }
        if (var21_21 /* !! */  != null && (var21_21 /* !! */  = var8_8.getPriceValidation()) != null && (var21_21 /* !! */  = var21_21 /* !! */ .getPriceSplitup()) != null && (var21_21 /* !! */  = var21_21 /* !! */ .getLoyalty()) != null && (var21_21 /* !! */  = var21_21 /* !! */ .getLoyaltyPoints()) != null) {
            var26_26 = var21_21 /* !! */ .floatValue();
        } else lbl-1000:
        // 3 sources

        {
            var25_25 = false;
            var26_26 = 0.0f;
            var21_21 /* !! */  = null;
        }
        if (var8_8 == null || !(var28_28 = Intrinsics.areEqual(var24_24 = var8_8.isCLicked(), var27_27 /* !! */  = Boolean.TRUE)) || (var24_24 = var8_8.getPriceValidation()) == null) ** GOTO lbl-1000
        var24_24 = var8_8.getPriceValidation();
        if (var24_24 != null) {
            var24_24 = var24_24.getPriceSplitup();
        } else {
            var28_28 = false;
            var29_29 = 0.0f;
            var24_24 = null;
        }
        if (var24_24 == null) ** GOTO lbl-1000
        var24_24 = var8_8.getPriceValidation();
        if (var24_24 != null && (var24_24 = var24_24.getPriceSplitup()) != null) {
            var24_24 = var24_24.getOfferDetails();
        } else {
            var28_28 = false;
            var29_29 = 0.0f;
            var24_24 = null;
        }
        if (var24_24 != null) {
            var24_24 = var8_8.getPriceValidation();
            var27_27 /* !! */  = var10_10.n;
            if (var27_27 /* !! */  != null) {
                var30_30 = StringCompanionObject.INSTANCE;
                var30_30 = var24_24 != null && (var30_30 = var24_24.getPriceSplitup()) != null ? var30_30.getNetPayableAmount() : null;
                var17_17 = new Object[var7_7];
                var17_17[0] = var30_30;
                zn0_1.b((Object[])var17_17, var7_7, (String)var11_11, (String)var15_15, var27_27 /* !! */ );
            }
            if ((var17_17 = var4_4.b) != null) {
                var17_17.c((PriceValidation)var24_24);
            }
            var17_17 = AnalyticsManager.Companion.getInstance().getGa();
            var24_24 = "Bankoffer_communicated";
            var27_27 /* !! */  = "Instant bank offers communication after user select cards";
            var17_17.trackBannerImpressionEvent((String)var24_24, (String)var27_27 /* !! */ );
        } else if ((var17_17 = var10_10.n) != null) {
            var24_24 = StringCompanionObject.INSTANCE;
            var29_29 = var16_16.D();
            var24_24 = kq2_1.a(var29_29);
            var27_27 /* !! */  = new Object[var7_7];
            var27_27 /* !! */ [0] = var24_24;
            zn0_1.b((Object[])var27_27 /* !! */ , var7_7, (String)var11_11, (String)var15_15, (TextView)var17_17);
        }
        var31_31 = (cfr_temp_0 = var26_26 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var31_31 > 0 && !(var22_22 = (boolean)((cfr_temp_1 = var23_23 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)))) {
            var11_11 = var10_10.n;
            if (var11_11 != null) {
                var31_31 = R$string.pe_pay_using_lr_points;
                var17_17 = hv3_0.K((int)var31_31);
                var11_11.setText((CharSequence)var17_17);
            }
        } else if (var31_31 > 0 && var8_8 != null && (var31_31 = (float)Intrinsics.areEqual(var17_17 = var8_8.isCLicked(), var19_19 = Boolean.TRUE)) != false && (var17_17 = var8_8.getPriceValidation()) != null) {
            var17_17 = var8_8.getPriceValidation();
            if (var17_17 != null) {
                var17_17 = var17_17.getPriceSplitup();
            } else {
                var31_31 = (float)false;
                var18_18 = 0.0f;
                var17_17 = null;
            }
            if (var17_17 != null) {
                var17_17 = var8_8.getPriceValidation();
                var19_19 = var10_10.n;
                if (var19_19 != null) {
                    var21_21 /* !! */  = StringCompanionObject.INSTANCE;
                    if (var17_17 != null && (var17_17 = var17_17.getPriceSplitup()) != null) {
                        var17_17 = var17_17.getNetPayableAmount();
                    } else {
                        var31_31 = (float)false;
                        var18_18 = 0.0f;
                        var17_17 = null;
                    }
                    var21_21 /* !! */  = new Object[var7_7];
                    var21_21 /* !! */ [0] = var17_17;
                    zn0_1.b(var21_21 /* !! */ , var7_7, (String)var11_11, (String)var15_15, (TextView)var19_19);
                }
            }
        }
        if (var8_8 != null && (var11_11 = var8_8.getPriceValidation()) != null && (var11_11 = var11_11.getPriceSplitup()) != null) {
            var11_11 = var11_11.getOfferDetails();
        } else {
            var13_13 = 0;
            var11_11 = null;
        }
        if (var8_8 != null && (var17_17 = var8_8.getPriceValidation()) != null && (var17_17 = var17_17.getPriceSplitup()) != null) {
            var17_17 = var17_17.getLoyalty();
        } else {
            var31_31 = (float)false;
            var18_18 = 0.0f;
            var17_17 = null;
        }
        if (var11_11 != null && (var19_19 = var8_8.getPriceValidation()) != null) {
            var19_19 = var8_8.getPriceValidation();
            if (var19_19 != null) {
                var19_19 = var19_19.getInstantDiscountMsg();
            } else {
                var22_22 = false;
                var23_23 = 0.0f;
                var19_19 = null;
            }
            var22_22 = TextUtils.isEmpty((CharSequence)var19_19);
            if (!var22_22) {
                var19_19 = var8_8.getPriceValidation();
                if (var19_19 != null) {
                    var19_19 = var19_19.getInstantDiscountMsg();
                } else {
                    var22_22 = false;
                    var23_23 = 0.0f;
                    var19_19 = null;
                }
                var11_11.setInstantDiscountMsg((String)var19_19);
            }
            if ((var19_19 = var8_8.getPriceValidation()) != null && (var19_19 = var19_19.getPriceSplitup()) != null) {
                var19_19 = var19_19.getNetPayableAmount();
            } else {
                var22_22 = false;
                var23_23 = 0.0f;
                var19_19 = null;
            }
            var11_11.setNetPayableAmount((Float)var19_19);
        }
        var19_19 = oo2_0.a;
        var16_16 = var16_16.Y8();
        if (var8_8 != null) {
            var21_21 /* !! */  = var8_8.getPaymentInstrumentId();
        } else {
            var25_25 = false;
            var26_26 = 0.0f;
            var21_21 /* !! */  = null;
        }
        var19_19.getClass();
        var16_16 = oo2_0.d((String)var21_21 /* !! */ , (ArrayList)var16_16);
        if (var16_16 != null) {
            if (var8_8 != null) {
                var19_19 = var8_8.getLastFourDigits();
            } else {
                var22_22 = false;
                var23_23 = 0.0f;
                var19_19 = null;
            }
            var16_16.setCardNumber((String)var19_19);
        }
        if (var17_17 != null && var16_16 != null) {
            var19_19 = var17_17.getRemainingPoints();
            var16_16.setRemainingPoints((Float)var19_19);
            var17_17 = var17_17.getLoyaltyPoints();
            var16_16.setUsablePoints((Float)var17_17);
        } else if (var16_16 != null) {
            var17_17 = Float.valueOf(0.0f);
            var16_16.setRemainingPoints((Float)var17_17);
            var17_17 = Float.valueOf(0.0f);
            var16_16.setUsablePoints((Float)var17_17);
        }
        if (var16_16 != null && (var17_17 = var16_16.getLoyaltyPoints()) != null) {
            var18_18 = var17_17.floatValue();
        } else {
            var31_31 = (float)false;
            var18_18 = 0.0f;
            var17_17 = null;
        }
        var31_31 = (cfr_temp_2 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
        if (var31_31 <= 0) ** GOTO lbl-1000
        if (var16_16 != null) {
            var17_17 = var16_16.getMobileNumberRegistered();
            var19_19 = Boolean.TRUE;
            var31_31 = (float)Intrinsics.areEqual(var17_17, var19_19);
        } else {
            var31_31 = (float)false;
            var18_18 = 0.0f;
            var17_17 = null;
        }
        if (var31_31 != false) {
            var31_31 = (float)true;
            var18_18 = 1.4E-45f;
        } else lbl-1000:
        // 2 sources

        {
            var31_31 = (float)false;
            var18_18 = 0.0f;
            var17_17 = null;
        }
        if (var31_31 != false) {
            var17_17 = var10_10.f;
            if (var17_17 != null) {
                if (var16_16 != null && (var19_19 = var16_16.isSelected()) != null) {
                    var22_22 = var19_19.booleanValue();
                } else {
                    var22_22 = false;
                    var23_23 = 0.0f;
                    var19_19 = null;
                }
                var17_17.setChecked(var22_22);
            }
            if ((var17_17 = var10_10.d) != null) {
                var19_19 = new kr2_1((LpStoredCardBalance)var16_16, var4_4);
                var17_17.setOnClickListener((View.OnClickListener)var19_19);
            }
            if ((var17_17 = var10_10.f) != null) {
                var19_19 = new lr2_1((LpStoredCardBalance)var16_16, var4_4);
                var17_17.setOnClickListener((View.OnClickListener)var19_19);
            }
            if ((var17_17 = var10_10.d) != null) {
                var17_17.setVisibility(0);
            }
            if (var16_16 != null && (var17_17 = var16_16.getRemainingPoints()) != null) {
                var18_18 = var17_17.floatValue();
            } else {
                var31_31 = (float)false;
                var18_18 = 0.0f;
                var17_17 = null;
            }
            var31_31 = (cfr_temp_3 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
            if (var31_31 > 0) {
                var17_17 = var10_10.e;
                if (var17_17 != null) {
                    var17_17.setVisibility(0);
                }
                if ((var17_17 = var10_10.e) != null) {
                    var19_19 = StringCompanionObject.INSTANCE;
                    if (var16_16 != null && (var19_19 = var16_16.getRemainingPoints()) != null) {
                        var20_20 = var19_19.floatValue();
                    }
                    var14_14 /* !! */  = hv3_0.v(var20_20);
                    var19_19 = new Object[var7_7];
                    var19_19[0] = var14_14 /* !! */ ;
                    var14_14 /* !! */  = "Remaining balance after purchase %s";
                    zn0_1.b((Object[])var19_19, var7_7, (String)var14_14 /* !! */ , (String)var15_15, (TextView)var17_17);
                }
            } else {
                var14_14 /* !! */  = var10_10.e;
                if (var14_14 /* !! */  != null) {
                    var14_14 /* !! */ .setVisibility(var9_9);
                }
            }
        } else {
            var14_14 /* !! */  = var10_10.d;
            if (var14_14 /* !! */  != null) {
                var14_14 /* !! */ .setVisibility(var9_9);
            }
        }
        if (var8_8 != null) {
            var14_14 /* !! */  = var8_8.isCLicked();
            var15_15 = Boolean.TRUE;
            var5_5 = (int)Intrinsics.areEqual(var14_14 /* !! */ , var15_15);
        } else {
            var5_5 = 0;
            var20_20 = 0.0f;
            var14_14 /* !! */  = null;
        }
        var15_15 = "credit/debitcard-saved card-";
        if (var5_5 == 0) {
            var14_14 /* !! */  = var10_10.a;
            if (var14_14 /* !! */  != null) {
                if (var8_8 != null) {
                    var17_17 = var8_8.getCardNetwork();
                } else {
                    var31_31 = (float)false;
                    var18_18 = 0.0f;
                    var17_17 = null;
                }
                var19_19 = " ?: ";
                var15_15 = cP.a((String)var15_15, (String)var17_17, (String)var19_19);
                var14_14 /* !! */ .setData((LpStoredCardBalance)var16_16, (OfferDetails)var11_11, var7_7, (String)var15_15);
            }
            if ((var14_14 /* !! */  = var10_10.i) != null) {
                var14_14 /* !! */ .setVisibility(var9_9);
            }
            if ((var14_14 /* !! */  = var10_10.n) != null) {
                var14_14 /* !! */ .setVisibility(var9_9);
            }
        } else {
            var14_14 /* !! */  = var10_10.a;
            if (var14_14 /* !! */  != null) {
                if (var8_8 == null || (var17_17 = var8_8.getCardNetwork()) == null) {
                    var17_17 = "";
                }
                var15_15 = var15_15.concat((String)var17_17);
                var14_14 /* !! */ .setData((LpStoredCardBalance)var16_16, (OfferDetails)var11_11, var7_7, (String)var15_15);
            }
            if ((var14_14 /* !! */  = var10_10.i) != null) {
                var14_14 /* !! */ .setVisibility(0);
            }
            if ((var14_14 /* !! */  = var10_10.n) != null) {
                var14_14 /* !! */ .setVisibility(0);
            }
        }
        if ((var14_14 /* !! */  = var10_10.o) != null) {
            var5_5 = var14_14 /* !! */ .getVisibility();
            if (var5_5 == 0) {
                var5_5 = 1;
                var20_20 = 1.4E-45f;
            } else {
                var5_5 = 0;
                var20_20 = 0.0f;
                var14_14 /* !! */  = null;
            }
            if (var5_5 != 0 && (var14_14 /* !! */  = var10_10.o) != null) {
                var14_14 /* !! */ .dismiss();
            }
        }
        if ((var14_14 /* !! */  = var10_10.c) != null) {
            if (var8_8 != null) {
                var11_11 = var8_8.getLastFourDigits();
            } else {
                var13_13 = 0;
                var11_11 = null;
            }
            var14_14 /* !! */ .setText((CharSequence)var11_11);
        }
        if ((var14_14 /* !! */  = var10_10.c) != null) {
            AJIOApplication.Companion.getClass();
            var11_11 = AJIOApplication$a.a();
            var12_12 = R$string.acc_last_four_digits_of_card_number_text;
            var16_16 = cp_1.Companion;
            if (var8_8 != null) {
                var17_17 = var8_8.getLastFourDigits();
            } else {
                var31_31 = (float)false;
                var18_18 = 0.0f;
                var17_17 = null;
            }
            var16_16.getClass();
            var16_16 = cp$a.B((String)var17_17);
            var17_17 = new Object[var7_7];
            var17_17[0] = var16_16;
            var11_11 = var11_11.getString(var12_12, (Object[])var17_17);
            var14_14 /* !! */ .setContentDescription((CharSequence)var11_11);
        }
        if ((var14_14 /* !! */  = var10_10.h) != null) {
            var11_11 = new da$a();
            var11_11.k = var7_7;
            var11_11.g = var7_7;
            if (var8_8 != null) {
                var17_17 = var8_8.getIconUrl();
            } else {
                var31_31 = (float)false;
                var18_18 = 0.0f;
                var17_17 = null;
            }
            var11_11.n = var17_17;
            var11_11.u = var14_14 /* !! */ ;
            var11_11.a();
        }
        if (var8_8 != null) {
            var14_14 /* !! */  = var8_8.getLowSuccessRate();
            var32_32 = Boolean.TRUE;
            var5_5 = (int)Intrinsics.areEqual(var14_14 /* !! */ , var32_32);
        } else {
            var5_5 = 0;
            var20_20 = 0.0f;
            var14_14 /* !! */  = null;
        }
        if (var5_5 != 0 && (var5_5 = (int)TextUtils.isEmpty((CharSequence)(var14_14 /* !! */  = var8_8.getMessage()))) == 0) {
            var14_14 /* !! */  = var10_10.l;
            if (var14_14 /* !! */  != null) {
                var14_14 /* !! */ .setVisibility(0);
            }
            if ((var14_14 /* !! */  = var10_10.l) != null) {
                var32_32 = var8_8.getMessage();
                var14_14 /* !! */ .setText((CharSequence)var32_32);
            }
        } else {
            var14_14 /* !! */  = var10_10.l;
            if (var14_14 /* !! */  != null) {
                var14_14 /* !! */ .setVisibility(var9_9);
            }
        }
        if ((var14_14 /* !! */  = var10_10.b) != null) {
            var14_14 /* !! */ .setOnClickListener((View.OnClickListener)var10_10);
        }
        Intrinsics.checkNotNull(var6_6 /* !! */ );
        return var6_6 /* !! */ ;
    }

    public final void onLoyaltyDeSelected(LpStoredCardBalance object) {
        Intrinsics.checkNotNullParameter(object, "lpStoredCardBalance");
        Object object2 = oo2_0.a;
        object = ((LpStoredCardBalance)object).getPayId();
        Object object3 = this.d.Y8();
        object2.getClass();
        object2 = null;
        oo2_0.r((String)object, false, (ArrayList)object3);
        object = this.e;
        if (object == null) {
            return;
        }
        ((PaymentInstrumentInfo)object).setLoyalty(null);
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object3 = "LoyaltyRewards_LRUnclicked";
        String string2 = "SavedCard";
        ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, (String)object3, string2);
        object = this.b;
        if (object != null) {
            object2 = this.e;
            object.s((PaymentInstrumentInfo)object2);
        }
        this.notifyDataSetChanged();
    }

    public final void onLoyaltySelected(LpStoredCardBalance object) {
        Intrinsics.checkNotNullParameter(object, "lpStoredCardBalance");
        Object object2 = oo2_0.a;
        object = ((LpStoredCardBalance)object).getPayId();
        ArrayList arrayList = this.d.Y8();
        object2.getClass();
        boolean bl2 = true;
        oo2_0.r((String)object, bl2, arrayList);
        this.notifyDataSetChanged();
        object = this.b;
        if (object != null) {
            object2 = this.e;
            object.s((PaymentInstrumentInfo)object2);
        }
    }

    public final void onOfferClicked(OfferDetails offerDetails) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetail");
        eg_1 eg_12 = this.b;
        if (eg_12 != null) {
            eg_12.b(offerDetails);
        }
    }

    public final void onRegisterMobileClicked(LpStoredCardBalance lpStoredCardBalance) {
        Intrinsics.checkNotNullParameter(lpStoredCardBalance, "lpStoredCardBalance");
        eg_1 eg_12 = this.b;
        if (eg_12 != null) {
            eg_12.r(lpStoredCardBalance);
        }
    }

    public final void showLoyaltyInfoFragment() {
        eg_1 eg_12 = this.b;
        if (eg_12 != null) {
            eg_12.showLoyaltyInfoFragment();
        }
    }
}

