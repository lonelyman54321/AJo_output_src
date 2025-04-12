/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.CheckBox
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.services.data.Cart.AmountDataKt;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.InternalWalletAmount;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ST
extends rw_2 {
    public final View A;
    public final TextView B;
    public final LinearLayout C;
    public final NewCustomEventsRevamp D;
    public final Context b;
    public final OnCheckoutClickListener c;
    public final co2_0 d;
    public final TextView e;
    public final CheckBox f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final LinearLayout y;
    public final RelativeLayout z;

    public ST(Context object, View view, OnCheckoutClickListener object2, co2_0 object3) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object2, "onCheckoutClickListener");
        Intrinsics.checkNotNullParameter(object3, "paymentInfoProvider");
        super(view);
        this.b = object;
        this.c = object2;
        this.d = object3;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.D = object;
        int n3 = R$id.checkout_expandable_layout;
        object = (RelativeLayout)view.findViewById(n3);
        int n4 = R$id.checkout_expandable_tv_title;
        object2 = (TextView)view.findViewById(n4);
        object3 = hv3_0.K(R$string.amount_payable_txt);
        object2.setText((CharSequence)object3);
        ai0_2.t((View)object);
        n4 = R$id.checkout_expandable_tv_status;
        object2 = (TextView)view.findViewById(n4);
        this.e = object2;
        n4 = R$id.checkout_expandable_checkbox_expand;
        object2 = (CheckBox)view.findViewById(n4);
        this.f = object2;
        n4 = R$id.checkout_summary_expandable_layout;
        this.g = view = view.findViewById(n4);
        view.setVisibility(8);
        object2 = new PT(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.checkout_layout_bag_saving;
        object = view.findViewById(n3);
        this.h = object;
        n3 = R$id.checkout_tv_discount;
        object = (TextView)view.findViewById(n3);
        this.p = object;
        n3 = R$id.checkout_layout_promo_saving;
        object = view.findViewById(n3);
        this.j = object;
        n3 = R$id.checkout_tv_promo;
        object = (TextView)view.findViewById(n3);
        this.q = object;
        n3 = R$id.checkout_layout_coupon_saving;
        object = view.findViewById(n3);
        this.i = object;
        n3 = R$id.checkout_tv_coupon;
        object = (TextView)view.findViewById(n3);
        this.r = object;
        n3 = R$id.checkout_layout_giftwrap;
        object = view.findViewById(n3);
        this.m = object;
        n3 = R$id.checkout_tv_giftwrap;
        object = (TextView)view.findViewById(n3);
        this.w = object;
        n3 = R$id.checkout_layout_gst;
        object = view.findViewById(n3);
        this.k = object;
        n3 = R$id.checkout_tv_gst;
        object = (TextView)view.findViewById(n3);
        this.s = object;
        n3 = R$id.checkout_tv_delivery;
        object = (TextView)view.findViewById(n3);
        this.u = object;
        n3 = R$id.checkout_layout_credit;
        object = (LinearLayout)view.findViewById(n3);
        this.C = object;
        n3 = R$id.checkout_layout_bankOffer;
        object = view.findViewById(n3);
        this.l = object;
        n3 = R$id.checkout_tv_bankOffer;
        object = (TextView)view.findViewById(n3);
        this.t = object;
        n3 = R$id.checkout_layout_loyalty;
        object = view.findViewById(n3);
        this.A = object;
        n3 = R$id.checkout_tv_loyalty;
        object = (TextView)view.findViewById(n3);
        this.B = object;
        n3 = R$id.checkout_tv_bag_total_header;
        object = (TextView)view.findViewById(n3);
        this.n = object;
        n3 = R$id.checkout_tv_bag_total;
        object = (TextView)view.findViewById(n3);
        this.o = object;
        n3 = R$id.checkout_tv_total;
        object = (TextView)view.findViewById(n3);
        this.v = object;
        n3 = R$id.checkout_tv_balance;
        object = (TextView)view.findViewById(n3);
        this.x = object;
        n3 = R$id.convenience_fee_cart_summary_view;
        object = (LinearLayout)view.findViewById(n3);
        this.y = object;
        n3 = R$id.checkout_layout_delivery;
        object = (RelativeLayout)view.findViewById(n3);
        this.z = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(qq2_2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 0;
        var5_5 = 0.0f;
        var6_6 = null;
        Intrinsics.checkNotNullParameter(var1_1, "rvData");
        var7_7 = var1_1.c;
        var8_8 /* !! */  = var7_7 instanceof Cart;
        var9_9 = this.v;
        var10_10 = 0;
        var11_11 = null;
        var12_12 = this.d;
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        var13_13 /* !! */  = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.Cart";
        Intrinsics.checkNotNull(var7_7, (String)var13_13 /* !! */ );
        var7_7 = (Cart)var7_7;
        if (var7_7 != null) {
            var14_14 = var7_7.getBagTotal();
            var15_15 = this.o;
            cfr_temp_0 = var14_14 - 0.0f;
            var8_8 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var8_8 /* !! */  > 0) {
                var13_13 /* !! */  = var7_7.getEntries();
                var16_16 = h40_0.a;
                var17_17 = var16_16.f1();
                var18_18 = this.n;
                if (var17_17 != 0 && var13_13 /* !! */  != null) {
                    var13_13 /* !! */  = var13_13 /* !! */ .iterator();
                    while ((var17_17 = (int)var13_13 /* !! */ .hasNext()) != 0) {
                        var16_16 = ((CartEntry)var13_13 /* !! */ .next()).isGiftProduct();
                        var17_17 = (int)var16_16.booleanValue();
                        if (var17_17 == 0) continue;
                        var8_8 /* !! */  = R$string.bag_total_freebies_included;
                        var13_13 /* !! */  = hv3_0.K(var8_8 /* !! */ );
                        var18_18.setText((CharSequence)var13_13 /* !! */ );
                        break;
                    }
                } else {
                    var8_8 /* !! */  = R$string.bag_total;
                    var13_13 /* !! */  = hv3_0.K(var8_8 /* !! */ );
                    var18_18.setText((CharSequence)var13_13 /* !! */ );
                }
                var14_14 = var7_7.getBagTotal();
                var13_13 /* !! */  = qz2_0.u(var14_14);
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            } else {
                var13_13 /* !! */  = qz2_0.z();
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            }
            var14_14 = var7_7.getTotalBagSaving();
            var15_15 = var2_2.h;
            var17_17 = 8;
            cfr_temp_1 = var14_14 - 0.0f;
            var19_19 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            if (var19_19 > 0) {
                var15_15.setVisibility(0);
                var15_15 = var2_2.p;
                var13_13 /* !! */  = qz2_0.q(var14_14);
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            } else {
                var15_15.setVisibility(var17_17);
            }
            var13_13 /* !! */  = var7_7.getEntries();
            if (var13_13 /* !! */  != null) {
                var13_13 /* !! */  = var7_7.getEntries();
                var8_8 /* !! */  = var13_13 /* !! */ .size();
                var21_21 = 0.0f;
                var15_15 = null;
                var19_19 = (float)false;
                var22_22 = 0.0f;
                var18_18 = null;
                for (var20_20 /* !! */  = 0; var20_20 /* !! */  < var8_8 /* !! */ ; ++var20_20 /* !! */ ) {
                    var23_23 /* !! */  = var7_7.getEntries().get(var20_20 /* !! */ );
                    if (var23_23 /* !! */  == null) continue;
                    var23_23 /* !! */  = ((CartEntry)var7_7.getEntries().get(var20_20 /* !! */ )).getMultiItemPromoAmt();
                    var24_24 = mz3_0.J(var23_23 /* !! */ );
                    var22_22 += var24_24;
                }
            } else {
                var19_19 = (float)false;
                var22_22 = 0.0f;
                var18_18 = null;
            }
            var13_13 /* !! */  = var2_2.j;
            cfr_temp_2 = var22_22 - 0.0f;
            var20_20 /* !! */  = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
            if (var20_20 /* !! */  > 0) {
                var13_13 /* !! */ .setVisibility(0);
                var13_13 /* !! */  = var2_2.q;
                var15_15 = qz2_0.q(var22_22);
                var13_13 /* !! */ .setText((CharSequence)var15_15);
            } else {
                var13_13 /* !! */ .setVisibility(var17_17);
            }
            var13_13 /* !! */  = var7_7.getVoucherAmount();
            if (var13_13 /* !! */  != null) {
                var13_13 /* !! */  = var7_7.getVoucherAmount().getValue();
                var14_14 = mz3_0.J((String)var13_13 /* !! */ ) + 0.0f;
            } else {
                var8_8 /* !! */  = 0;
                var14_14 = 0.0f;
                var13_13 /* !! */  = null;
            }
            var15_15 = var2_2.i;
            cfr_temp_3 = var14_14 - 0.0f;
            var19_19 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
            if (var19_19 > 0) {
                var15_15.setVisibility(0);
                var15_15 = var2_2.r;
                var13_13 /* !! */  = qz2_0.q(var14_14);
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            } else {
                var15_15.setVisibility(var17_17);
            }
            var13_13 /* !! */  = var7_7.getGiftWrapCharges();
            if (var13_13 /* !! */  != null) {
                var13_13 /* !! */  = var7_7.getGiftWrapCharges().getValue();
                var14_14 = mz3_0.J((String)var13_13 /* !! */ );
            } else {
                var8_8 /* !! */  = 0;
                var14_14 = 0.0f;
                var13_13 /* !! */  = null;
            }
            var15_15 = var2_2.m;
            cfr_temp_4 = var14_14 - 0.0f;
            var19_19 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
            if (var19_19 > 0) {
                var15_15.setVisibility(0);
                var15_15 = var2_2.w;
                var13_13 /* !! */  = qz2_0.u(var14_14);
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            } else {
                var15_15.setVisibility(var17_17);
            }
            var13_13 /* !! */  = var7_7.getExclusiveGST();
            if (var13_13 /* !! */  != null) {
                var13_13 /* !! */  = var7_7.getExclusiveGST().getValue();
                var14_14 = mz3_0.J((String)var13_13 /* !! */ );
            } else {
                var8_8 /* !! */  = 0;
                var14_14 = 0.0f;
                var13_13 /* !! */  = null;
            }
            var15_15 = var2_2.k;
            var18_18 = var2_2.s;
            cfr_temp_5 = var14_14 - 0.0f;
            var25_25 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
            if (var25_25 > 0) {
                var13_13 /* !! */  = qz2_0.u(var14_14);
                var18_18.setText((CharSequence)var13_13 /* !! */ );
                var15_15.setVisibility(0);
            } else {
                var13_13 /* !! */  = qz2_0.z();
                var18_18.setText((CharSequence)var13_13 /* !! */ );
                var15_15.setVisibility(var17_17);
            }
            var13_13 /* !! */  = var7_7.getDeliveryCost();
            if (var13_13 /* !! */  != null) {
                var13_13 /* !! */  = var7_7.getDeliveryCost().getValue();
                var14_14 = mz3_0.J((String)var13_13 /* !! */ );
            } else {
                var8_8 /* !! */  = 0;
                var14_14 = 0.0f;
                var13_13 /* !! */  = null;
            }
            var15_15 = var2_2.u;
            cfr_temp_6 = var14_14 - 0.0f;
            var19_19 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
            if (var19_19 > 0) {
                var13_13 /* !! */  = qz2_0.u(var14_14);
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            } else {
                var13_13 /* !! */  = "FREE";
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            }
            var13_13 /* !! */  = var12_12.n8();
            if (var13_13 /* !! */  != null && (var13_13 /* !! */  = var13_13 /* !! */ .getOrderSummary()) != null && (var13_13 /* !! */  = var13_13 /* !! */ .getLoyaltyPoint()) != null) {
                var14_14 = var13_13 /* !! */ .floatValue();
            } else {
                var8_8 /* !! */  = 0;
                var14_14 = 0.0f;
                var13_13 /* !! */  = null;
            }
            var15_15 = var2_2.B;
            var18_18 = var2_2.A;
            cfr_temp_7 = var14_14 - 0.0f;
            var8_8 /* !! */  = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1));
            if (var8_8 /* !! */  > 0) {
                var18_18.setVisibility(0);
                var13_13 /* !! */  = var12_12.n8();
                if (var13_13 /* !! */  != null && (var13_13 /* !! */  = var13_13 /* !! */ .getOrderSummary()) != null && (var13_13 /* !! */  = var13_13 /* !! */ .getLoyaltyPoint()) != null) {
                    var14_14 = var13_13 /* !! */ .floatValue();
                } else {
                    var8_8 /* !! */  = 0;
                    var14_14 = 0.0f;
                    var13_13 /* !! */  = null;
                }
                var13_13 /* !! */  = qz2_0.q(var14_14);
                var15_15.setText((CharSequence)var13_13 /* !! */ );
            } else {
                var18_18.setVisibility(var17_17);
            }
            var13_13 /* !! */  = var12_12.n8();
            if (var13_13 /* !! */  != null && (var13_13 /* !! */  = var13_13 /* !! */ .getOrderSummary()) != null && (var13_13 /* !! */  = var13_13 /* !! */ .getBankOfferAmt()) != null) {
                var14_14 = var13_13 /* !! */ .floatValue();
            } else {
                var8_8 /* !! */  = 0;
                var14_14 = 0.0f;
                var13_13 /* !! */  = null;
            }
            var23_23 /* !! */  = var2_2.t;
            var26_26 = var2_2.l;
            cfr_temp_8 = var14_14 - 0.0f;
            var8_8 /* !! */  = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1));
            if (var8_8 /* !! */  > 0) {
                var26_26.setVisibility(0);
                var13_13 /* !! */  = var12_12.n8();
                if (var13_13 /* !! */  != null && (var13_13 /* !! */  = var13_13 /* !! */ .getOrderSummary()) != null && (var13_13 /* !! */  = var13_13 /* !! */ .getBankOfferAmt()) != null) {
                    var14_14 = var13_13 /* !! */ .floatValue();
                } else {
                    var8_8 /* !! */  = 0;
                    var14_14 = 0.0f;
                    var13_13 /* !! */  = null;
                }
                var13_13 /* !! */  = qz2_0.q(var14_14);
                var23_23 /* !! */ .setText((CharSequence)var13_13 /* !! */ );
            } else {
                var26_26.setVisibility(var17_17);
            }
            var13_13 /* !! */  = var7_7.getTotalPriceWithTax();
            if (var13_13 /* !! */  != null && (var8_8 /* !! */  = (int)TextUtils.isEmpty((CharSequence)(var13_13 /* !! */  = var7_7.getTotalPriceWithTax().getFormattedValue()))) == 0) {
                var27_27 = mz3_0.J(var7_7.getTotalPriceWithTax().getValue());
                var7_7 = qz2_0.u(var27_27);
                var9_9.setText((CharSequence)var7_7);
            } else {
                var7_7 = qz2_0.z();
                var9_9.setText((CharSequence)var7_7);
            }
            var7_7 = var2_2.C;
            var7_7.setVisibility(var17_17);
            var7_7.removeAllViews();
            var13_13 /* !! */  = var12_12.n8();
            if (var13_13 /* !! */  != null && (var13_13 /* !! */  = var13_13 /* !! */ .getOrderSummary()) != null && (var13_13 /* !! */  = var13_13 /* !! */ .getInternalWalletAmountList()) != null) {
                var13_13 /* !! */  = var13_13 /* !! */ .iterator();
                while (var28_28 = var13_13 /* !! */ .hasNext()) {
                    var29_29 = (InternalWalletAmount)var13_13 /* !! */ .next();
                    var30_30 = var29_29.getAmount();
                    cfr_temp_9 = var30_30 - 0.0f;
                    var31_31 /* !! */  = (float)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1));
                    if (var31_31 /* !! */  > 0) {
                        var7_7.setVisibility(0);
                        var32_32 = LayoutInflater.from((Context)var2_2.b);
                        var17_17 = R$layout.row_order_summary_internal_wallet;
                        var16_16 = var32_32.inflate(var17_17, null);
                        var31_31 /* !! */  = R$id.credit_text;
                        var32_32 = var16_16.findViewById((int)var31_31 /* !! */ );
                        var10_10 = R$id.checkout_tv_credit;
                        var11_11 = var16_16.findViewById(var10_10);
                        var32_32 = (TextView)var32_32;
                        var6_6 = var29_29.getName();
                        var32_32.setText((CharSequence)var6_6);
                        var11_11 = (TextView)var11_11;
                        var5_5 = var29_29.getAmount();
                        var6_6 = qz2_0.q(var5_5);
                        var11_11.setText((CharSequence)var6_6);
                        var7_7.addView((View)var16_16);
                        var6_6 = var16_16.getLayoutParams();
                        var11_11 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
                        Intrinsics.checkNotNull(var6_6, (String)var11_11);
                        var6_6 = (LinearLayout.LayoutParams)var6_6;
                        var6_6.topMargin = var10_10 = mz3_0.d(10);
                        var16_16.setLayoutParams((ViewGroup.LayoutParams)var6_6);
                    }
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    var6_6 = null;
                    var10_10 = 0;
                    var11_11 = null;
                    var17_17 = 8;
                }
            }
            if ((var6_6 = var12_12.n8()) != null && (var6_6 = var6_6.getOrderSummary()) != null) {
                var7_7 = var6_6.getBankOfferAmt();
                if (var7_7 != null) {
                    var27_27 = var7_7.floatValue();
                } else {
                    var33_33 = 0;
                    var27_27 = 0.0f;
                    var7_7 = null;
                }
                var33_33 = (cfr_temp_10 = var27_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1);
                if (var33_33 > 0) {
                    var7_7 = var6_6.getBankOfferAmt();
                    if (var7_7 != null) {
                        var27_27 = var7_7.floatValue();
                    } else {
                        var33_33 = 0;
                        var27_27 = 0.0f;
                        var7_7 = null;
                    }
                    var7_7 = qz2_0.q(var27_27);
                    var23_23 /* !! */ .setText((CharSequence)var7_7);
                    var33_33 = 0;
                    var27_27 = 0.0f;
                    var7_7 = null;
                    var26_26.setVisibility(0);
                } else {
                    var33_33 = 8;
                    var27_27 = 1.1E-44f;
                    var26_26.setVisibility(var33_33);
                }
                var7_7 = var6_6.getLoyaltyPoint();
                if (var7_7 != null) {
                    var27_27 = var7_7.floatValue();
                } else {
                    var33_33 = 0;
                    var27_27 = 0.0f;
                    var7_7 = null;
                }
                var33_33 = (int)((cfr_temp_11 = var27_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1));
                if (var33_33 > 0) {
                    if ((var6_6 = var6_6.getLoyaltyPoint()) != null) {
                        var5_5 = var6_6.floatValue();
                    } else {
                        var4_4 = 0;
                        var5_5 = 0.0f;
                        var6_6 = null;
                    }
                    var6_6 = qz2_0.q(var5_5);
                    var15_15.setText((CharSequence)var6_6);
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    var6_6 = null;
                    var18_18.setVisibility(0);
                } else {
                    var4_4 = 8;
                    var5_5 = 1.1E-44f;
                    var18_18.setVisibility(var4_4);
                }
            } else {
                var4_4 = 8;
                var5_5 = 1.1E-44f;
                var26_26.setVisibility(var4_4);
                var18_18.setVisibility(var4_4);
            }
            var5_5 = var12_12.D();
            var7_7 = var2_2.e;
            var13_13 /* !! */  = var2_2.x;
            cfr_temp_12 = var5_5 - 0.0f;
            var4_4 = (int)(cfr_temp_12 == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1));
            if (var4_4 >= 0) {
                var6_6 = qz2_0.u(var12_12.D());
                var13_13 /* !! */ .setText((CharSequence)var6_6);
                var5_5 = var12_12.D();
                var6_6 = qz2_0.u(var5_5);
                var7_7.setText((CharSequence)var6_6);
            } else {
                var6_6 = qz2_0.z();
                var13_13 /* !! */ .setText((CharSequence)var6_6);
                var6_6 = qz2_0.z();
                var7_7.setText((CharSequence)var6_6);
            }
        }
        if ((var33_33 = (var6_6 = var3_3.c) instanceof Cart) != 0) {
            var6_6 = (Cart)var6_6;
        } else {
            var4_4 = 0;
            var5_5 = 0.0f;
            var6_6 = null;
        }
        if (var6_6 != null) {
            var6_6 = var6_6.getConvenienceFee();
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = 0;
            var5_5 = 0.0f;
            var6_6 = null;
        }
        var7_7 = new QT(var2_2, (qq2_2)var3_3);
        var13_13 /* !! */  = var2_2.f;
        var13_13 /* !! */ .setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)var7_7);
        var34_34 = var3_3.e;
        var13_13 /* !! */ .setChecked(var34_34);
        var3_3 = var12_12.A();
        var34_34 = var3_3.e();
        var7_7 = var2_2.y;
        if (!var34_34) ** GOTO lbl-1000
        var3_3 = var12_12.c2();
        if (var3_3 != null) {
            var3_3 = var3_3.getPriceSplitup();
        } else {
            var34_34 = false;
            var35_35 = 0.0f;
            var3_3 = null;
        }
        if (var3_3 != null) {
            var3_3 = var12_12.c2();
            if (var3_3 != null && (var3_3 = var3_3.getPriceSplitup()) != null) {
                var13_13 /* !! */  = var3_3.getConvenienceFee();
                if (var13_13 /* !! */  == null) {
                    var8_8 /* !! */  = 0;
                    var14_14 = 0.0f;
                    var13_13 /* !! */  = null;
                }
                if (var13_13 /* !! */  != null) {
                    var11_11 = var13_13 /* !! */ .getCOD();
                } else {
                    var10_10 = 0;
                    var11_11 = null;
                }
                if (var11_11 != null) {
                    if (var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getCOD()) != null) {
                        var11_11 = var11_11.isFeeCharged();
                    } else {
                        var10_10 = 0;
                        var11_11 = null;
                    }
                    if (var11_11 == null) {
                        var11_11 = var12_12.n8();
                        if (var11_11 != null && (var11_11 = var11_11.getFraudEngineResponseDetails()) != null && (var11_11 = var11_11.getResult()) != null && (var11_11 = var11_11.getCOHORT_COD_FEE()) != null) {
                            var10_10 = Intrinsics.areEqual(var11_11 = var11_11.getAction(), var15_15 = "BAD_COHORT_COD_FEE");
                            if (var10_10 != 0 && (var11_11 = var13_13 /* !! */ .getCOD()) != null) {
                                var15_15 = Boolean.TRUE;
                                var11_11.setFeeCharged((Boolean)var15_15);
                            }
                        } else {
                            var11_11 = var13_13 /* !! */ .getCOD();
                            if (var11_11 != null) {
                                if (var6_6 != null && (var15_15 = var6_6.getCOD()) != null) {
                                    var15_15 = var15_15.getCohort();
                                } else {
                                    var20_20 /* !! */  = 0;
                                    var21_21 = 0.0f;
                                    var15_15 = null;
                                }
                                var20_20 /* !! */  = AmountDataKt.isFeeCharged((String)var15_15);
                                var15_15 = (boolean)var20_20 /* !! */ ;
                                var11_11.setFeeCharged((Boolean)var15_15);
                            }
                        }
                    }
                }
                if (var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getRVP()) != null) {
                    var11_11 = var11_11.isFeeCharged();
                } else {
                    var10_10 = 0;
                    var11_11 = null;
                }
                if (var11_11 == null && var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getRVP()) != null) {
                    if (var6_6 != null && (var15_15 = var6_6.getRVP()) != null) {
                        var15_15 = var15_15.getCohort();
                    } else {
                        var20_20 /* !! */  = 0;
                        var21_21 = 0.0f;
                        var15_15 = null;
                    }
                    var20_20 /* !! */  = (int)AmountDataKt.isFeeCharged((String)var15_15);
                    var15_15 = (boolean)var20_20 /* !! */ ;
                    var11_11.setFeeCharged((Boolean)var15_15);
                }
                if (var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getDelivery()) != null) {
                    var11_11 = var11_11.isFeeCharged();
                } else {
                    var10_10 = 0;
                    var11_11 = null;
                }
                if (var11_11 == null && var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getDelivery()) != null) {
                    if (var6_6 != null && (var15_15 = var6_6.getDelivery()) != null) {
                        var15_15 = var15_15.getCohort();
                    } else {
                        var20_20 /* !! */  = 0;
                        var21_21 = 0.0f;
                        var15_15 = null;
                    }
                    var20_20 /* !! */  = AmountDataKt.isFeeCharged((String)var15_15);
                    var15_15 = (boolean)var20_20 /* !! */ ;
                    var11_11.setFeeCharged((Boolean)var15_15);
                }
                if (var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getTotal()) != null) {
                    var11_11 = var11_11.isFeeCharged();
                } else {
                    var10_10 = 0;
                    var11_11 = null;
                }
                if (var11_11 == null && var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .getTotal()) != null) {
                    if (var6_6 != null && (var6_6 = var6_6.getTotal()) != null) {
                        var6_6 = var6_6.getCohort();
                    } else {
                        var4_4 = 0;
                        var5_5 = 0.0f;
                        var6_6 = null;
                    }
                    var4_4 = AmountDataKt.isFeeCharged((String)var6_6);
                    var6_6 = (boolean)var4_4;
                    var11_11.setFeeCharged((Boolean)var6_6);
                }
                if (var13_13 /* !! */  != null && ((var6_6 = var13_13 /* !! */ .getDelivery()) != null || (var6_6 = var13_13 /* !! */ .getCOD()) != null || (var6_6 = var13_13 /* !! */ .getRVP()) != null)) {
                    ai0_2.B((View)var7_7);
                    var6_6 = var12_12.A();
                    var10_10 = og1_1.c();
                    if (var10_10 != 0) {
                        AJIOApplication.Companion.getClass();
                        var11_11 = LayoutInflater.from((Context)AJIOApplication$a.a());
                        var20_20 /* !! */  = R$layout.row_order_summary_convenience_fee_luxe;
                        var17_17 = 0;
                        var16_16 = null;
                        var11_11 = var11_11.inflate(var20_20 /* !! */ , null);
                    } else {
                        var17_17 = 0;
                        var16_16 = null;
                        AJIOApplication.Companion.getClass();
                        var11_11 = LayoutInflater.from((Context)AJIOApplication$a.a());
                        var20_20 /* !! */  = R$layout.row_order_summary_convenience_fee_ajio;
                        var11_11 = var11_11.inflate(var20_20 /* !! */ , null);
                    }
                    var20_20 /* !! */  = R$id.convenience_fee_title_tv;
                    var15_15 = (AjioTextView)var11_11.findViewById(var20_20 /* !! */ );
                    var18_18 = var6_6.b;
                    if (var18_18 != null) {
                        var18_18 = var18_18.getConvenienceFeeTitle();
                    } else {
                        var19_19 = (float)false;
                        var18_18 = null;
                        var22_22 = 0.0f;
                    }
                    var15_15.setText((CharSequence)var18_18);
                    var20_20 /* !! */  = R$id.convenience_fee_info_tv;
                    var15_15 = (AjioTextView)var11_11.findViewById(var20_20 /* !! */ );
                    var19_19 = (float)og1_1.c();
                    if (var19_19 != false) {
                        var18_18 = hv3_0.a;
                        Intrinsics.checkNotNull(var15_15);
                        var23_23 /* !! */  = var6_6.a();
                        var18_18.getClass();
                        hv3_0.a0((AjioTextView)var15_15, var23_23 /* !! */ );
                    } else {
                        var18_18 = var6_6.a();
                        var15_15.setText((CharSequence)var18_18);
                    }
                    var25_25 = (float)false;
                    var24_24 = 0.0f;
                    var23_23 /* !! */  = null;
                    var18_18 = new RT(var2_2, (Serializable)var13_13 /* !! */ , 0);
                    var15_15.setOnClickListener((View.OnClickListener)var18_18);
                    var15_15 = var13_13 /* !! */ .getDelivery();
                    if (var15_15 != null) {
                        var19_19 = R$id.delivery_fee_layout;
                        var18_18 = var11_11.findViewById((int)var19_19);
                        var23_23 /* !! */  = hv3_0.a;
                        Intrinsics.checkNotNull(var18_18);
                        var26_26 = var6_6.b;
                        if (var26_26 != null) {
                            var29_29 = var26_26 = var26_26.getDeliveryFeeLabel();
                        } else {
                            var28_28 = false;
                            var29_29 = null;
                        }
                        var36_36 = var15_15.getNetAmount();
                        var32_32 = Float.valueOf(var36_36);
                        var21_21 = var15_15.getAmount();
                        var37_37 = Float.valueOf(var21_21);
                        var38_38 = 112;
                        var39_39 = 0;
                        var26_26 = var18_18;
                        hv3_0.n0(var23_23 /* !! */ , (View)var18_18, (String)var29_29, var32_32, var37_37, null, null, null, var38_38);
                        ai0_2.B((View)var18_18);
                        var15_15 = var2_2.z;
                        ai0_2.i((View)var15_15);
                    }
                    if ((var15_15 = var13_13 /* !! */ .getRVP()) != null) {
                        var22_22 = var15_15.getNetAmount();
                        var15_15.setAmount(var22_22);
                        var19_19 = R$id.platform_fee_layout;
                        var26_26 = var11_11.findViewById((int)var19_19);
                        Intrinsics.checkNotNull(var26_26);
                        ai0_2.B((View)var26_26);
                        var23_23 /* !! */  = hv3_0.a;
                        var18_18 = var6_6.b;
                        if (var18_18 != null) {
                            var29_29 = var18_18 = var18_18.getPlatformConvenienceFeeLabel();
                        } else {
                            var28_28 = false;
                            var29_29 = null;
                        }
                        var22_22 = var15_15.getNetAmount();
                        var32_32 = Float.valueOf(var22_22);
                        var21_21 = var15_15.getAmount();
                        var37_37 = Float.valueOf(var21_21);
                        var38_38 = 112;
                        var39_39 = 0;
                        hv3_0.n0(var23_23 /* !! */ , (View)var26_26, (String)var29_29, var32_32, var37_37, null, null, null, var38_38);
                    }
                    if ((var13_13 /* !! */  = var13_13 /* !! */ .getCOD()) != null) {
                        var20_20 /* !! */  = R$id.cod_fee_layout;
                        var23_23 /* !! */  = var11_11.findViewById(var20_20 /* !! */ );
                        Intrinsics.checkNotNull(var23_23 /* !! */ );
                        ai0_2.B(var23_23 /* !! */ );
                        var3_3 = var3_3.getTotalAmount();
                        if (var3_3 != null) {
                            var35_35 = mz3_0.J(String.valueOf(var3_3.floatValue()));
                            var3_3 = qz2_0.u(var35_35);
                            var9_9.setText((CharSequence)var3_3);
                        }
                        var18_18 = hv3_0.a;
                        var3_3 = var6_6.b;
                        if (var3_3 != null) {
                            var26_26 = var3_3 = var3_3.getCashOnDeliveryFeeLabel();
                        } else {
                            var26_26 = null;
                            var36_36 = 0.0f;
                        }
                        var29_29 = Float.valueOf(var13_13 /* !! */ .getNetAmount());
                        var35_35 = var13_13 /* !! */ .getAmount();
                        var32_32 = Float.valueOf(var35_35);
                        var37_37 = null;
                        var39_39 = 112;
                        hv3_0.n0((hv3_0)var18_18, var23_23 /* !! */ , (String)var26_26, (Float)var29_29, var32_32, null, null, null, var39_39);
                    }
                    var3_3 = h40_0.a;
                    var34_34 = h40_0.O1();
                    if (var34_34 && (var3_3 = var12_12.n8()) != null && (var3_3 = var3_3.getOrderSummary()) != null && (var3_3 = var3_3.getPriorityDeliveryCharges()) != null) {
                        var35_35 = var3_3.floatValue();
                        var4_4 = R$id.priority_delivery_fee_layout;
                        var6_6 = var11_11.findViewById(var4_4);
                        Intrinsics.checkNotNull(var6_6);
                        ai0_2.B((View)var6_6);
                        var13_13 /* !! */  = h40_0.j0().getPriorityDeliveryFeeLabel();
                        var40_40 = R$id.fee_label_tv;
                        var9_9 = (AjioTextView)var6_6.findViewById(var40_40);
                        var41_41 = R$id.fee_value_free_tv;
                        var12_12 = (AjioTextView)var6_6.findViewById(var41_41);
                        var20_20 /* !! */  = R$id.fee_value_tv;
                        var6_6 = (AjioTextView)var6_6.findViewById(var20_20 /* !! */ );
                        Intrinsics.checkNotNull(var9_9);
                        ai0_2.B((View)var9_9);
                        var9_9.setText(var13_13 /* !! */ );
                        cfr_temp_13 = var35_35 - 0.0f;
                        var8_8 /* !! */  = (int)(cfr_temp_13 == 0.0f ? 0 : (cfr_temp_13 > 0.0f ? 1 : -1));
                        if (var8_8 /* !! */  > 0) {
                            var3_3 = qz2_0.u(var35_35);
                            if (var6_6 != null) {
                                var6_6.setText((CharSequence)var3_3);
                            }
                            if (var6_6 != null) {
                                var13_13 /* !! */  = var9_9.getText();
                                var9_9 = new StringBuilder();
                                var9_9.append((String)var3_3);
                                var9_9.append(var13_13 /* !! */ );
                                var3_3 = var9_9.toString();
                                var6_6.setContentDescription((CharSequence)var3_3);
                            }
                            if (var6_6 != null) {
                                ai0_2.B((View)var6_6);
                            }
                        } else {
                            if (var12_12 != null) {
                                ai0_2.B((View)var12_12);
                            }
                            if (var6_6 != null) {
                                ai0_2.i((View)var6_6);
                            }
                        }
                    }
                    var7_7.removeAllViews();
                    var7_7.addView((View)var11_11);
                } else {
                    ai0_2.i((View)var7_7);
                }
            }
        } else lbl-1000:
        // 2 sources

        {
            ai0_2.i((View)var7_7);
        }
    }
}

