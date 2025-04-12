/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.payment.fragment.c$a;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.SubWallet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class c
extends BottomSheetDialogFragment {
    public static final c$a Companion;
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public PaymentInstrumentInfo g;
    public RecyclerView h;
    public TextView i;
    public Float j;
    public float k;
    public final hh3_2 l;

    static {
        c$a c$a;
        Companion = c$a = new Object();
    }

    public c() {
        Object object = Float.valueOf(0.0f);
        this.j = object;
        this.k = 10.0f;
        object = new aj1_2(this);
        this.l = object = yr1_2.b((Function0)object);
    }

    public static SubWallet Oa(String string2, List object) {
        SubWallet subWallet = null;
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                boolean bl4;
                String string3;
                SubWallet subWallet2 = (SubWallet)object.next();
                if (subWallet2 != null) {
                    string3 = subWallet2.getCode();
                } else {
                    bl4 = false;
                    string3 = null;
                }
                if (!(bl4 = kotlin.text.b.i(string3, string2, bl3 = true))) continue;
                subWallet = subWallet2;
                break;
            }
        }
        return subWallet;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.MobileBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_dialog_internal_wallet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_dialog_internal_wallet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = 2;
        var6_6 = 2.8E-45f;
        var7_7 = 1;
        Intrinsics.checkNotNullParameter(var1_1, "view");
        super.onViewCreated(var1_1, var2_2);
        var8_8 /* !! */  = (PaymentInstrumentInfo)((io2_1)this.l.getValue()).c.d();
        if (var8_8 /* !! */  != null) {
            this.g = var8_8 /* !! */ ;
        }
        if ((var8_8 /* !! */  = this.getArguments()) != null) {
            var8_8 /* !! */  = this.getArguments();
            if (var8_8 /* !! */  != null) {
                var9_9 = "OrderTotal";
                var10_10 = var8_8 /* !! */ .getFloat((String)var9_9);
                var8_8 /* !! */  = Float.valueOf(var10_10);
            } else {
                var11_11 = 0;
                var10_10 = 0.0f;
                var8_8 /* !! */  = null;
            }
            var3_3.j = var8_8 /* !! */ ;
        }
        var11_11 = R$id.imv_dialog_close;
        var8_8 /* !! */  = (ImageView)var4_4.findViewById(var11_11);
        var12_12 = R$id.tv_ajio_wallet_usable_total_amount_value;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.a = var9_9;
        var12_12 = R$id.tv_ajio_wallet_usable_total_cash_value;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.b = var9_9;
        var12_12 = R$id.tv_ajio_wallet_usable_total_points_value;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.c = var9_9;
        var12_12 = R$id.lbl_point;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.d = var9_9;
        var12_12 = R$id.tv_ajio_wallet_balance_value;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.e = var9_9;
        var12_12 = R$id.tv_ajio_wallet_usable_points_message;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.f = var9_9;
        var12_12 = R$id.wallet_excluded_products;
        var3_3.h = var9_9 = (RecyclerView)var4_4.findViewById(var12_12);
        var12_12 = R$id.tvWalletExProductTitle;
        var9_9 = (TextView)var4_4.findViewById(var12_12);
        var3_3.i = var9_9;
        var12_12 = R$id.tvOkay;
        var4_4 = var4_4.findViewById(var12_12);
        Intrinsics.checkNotNullExpressionValue(var4_4, "findViewById(...)");
        var4_4 = (TextView)var4_4;
        var9_9 = new bj1_2(var3_3);
        var4_4.setOnClickListener((View.OnClickListener)var9_9);
        var4_4 = var3_3.g;
        var9_9 = "paymentInstrumentInfo";
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var13_13 = 0;
            var4_4 = null;
        }
        var4_4 = qz2_0.l(var4_4.getAmount());
        var14_14 = var3_3.g;
        if (var14_14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var14_14 = null;
        }
        var14_14 = qz2_0.l(var14_14.getAmount());
        var15_15 /* !! */  = var3_3.g;
        if (var15_15 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var16_16 = 0;
            var15_15 /* !! */  = null;
        }
        var15_15 /* !! */  = qz2_0.l(var15_15 /* !! */ .getAvailableAmount());
        var17_17 = "/";
        var14_14 = n1.a((String)var14_14, var17_17, (String)var15_15 /* !! */ );
        var15_15 /* !! */  = new SpannableStringBuilder((CharSequence)var14_14);
        var14_14 = new StyleSpan(var7_7);
        var13_13 = var4_4.length();
        var18_18 = 18;
        var19_19 = 2.5E-44f;
        var15_15 /* !! */ .setSpan(var14_14, 0, var13_13, var18_18);
        var4_4 = var3_3.a;
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewActiveCash");
            var13_13 = 0;
            var4_4 = null;
        }
        var4_4.setText((CharSequence)var15_15 /* !! */ );
        var13_13 = R$string.super_cash;
        var4_4 = hv3_0.K(var13_13);
        var14_14 = var3_3.d;
        if (var14_14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewSuperCashLabel");
            var14_14 = null;
        }
        var16_16 = R$string.pesdk_points_tag;
        var20_20 = new Object[var7_7];
        var20_20[0] = var4_4;
        var15_15 /* !! */  = hv3_0.L(var16_16, (Object[])var20_20);
        var14_14.setText((CharSequence)var15_15 /* !! */ );
        var14_14 = var3_3.g;
        if (var14_14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var14_14 = null;
        }
        var14_14 = var14_14.getSubWallets();
        var15_15 /* !! */  = "getString(...)";
        if (var14_14 == null) ** GOTO lbl-1000
        var14_14 = var3_3.g;
        if (var14_14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var14_14 = null;
        }
        var14_14 = var14_14.getSubWallets();
        var14_14 = com.ril.ajio.payment.fragment.c.Oa("AJIO_CASH_POINTS_WALLET", (List)var14_14);
        var21_21 = var3_3.g;
        if (var21_21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var22_22 = 0;
            var23_23 = 0.0f;
            var21_21 = null;
        }
        var21_21 = var21_21.getSubWallets();
        var24_24 = "AJIO_CASH_RCS_WALLET";
        Intrinsics.checkNotNullExpressionValue(var24_24, var24_24);
        var21_21 = com.ril.ajio.payment.fragment.c.Oa(var24_24, (List)var21_21);
        var24_24 = "format(...)";
        if (var21_21 != null) {
            var25_25 = var3_3.b;
            var26_26 = "textViewCashValue";
            if (var25_25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var26_26);
                var27_27 = 0.0f;
                var25_25 = null;
            }
            var28_28 = StringCompanionObject.INSTANCE;
            var29_29 = var3_3.b;
            if (var29_29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var26_26);
                var30_30 = 0;
                var31_31 = 0.0f;
                var29_29 = null;
            }
            var29_29 = var29_29.getContext();
            var18_18 = R$string.acc_wallet_details_wallet_value;
            var29_29 = var29_29.getString(var18_18);
            Intrinsics.checkNotNullExpressionValue(var29_29, (String)var15_15 /* !! */ );
            var20_20 = var21_21.getAmount();
            if (var20_20 != null) {
                var19_19 = var20_20.floatValue();
            } else {
                var18_18 = 0;
                var19_19 = 0.0f;
                var20_20 = null;
            }
            var20_20 = kq2_1.b(var19_19);
            var28_28 = var21_21.getAvailableAmount();
            if (var28_28 != null) {
                var32_32 = var28_28.floatValue();
            } else {
                var32_32 = 0.0f;
                var28_28 = null;
            }
            var28_28 = kq2_1.b(var32_32);
            var33_33 = new Object[var5_5];
            var33_33[0] = var20_20;
            var33_33[var7_7] = var28_28;
            He1.a((Object[])var33_33, var5_5, (String)var29_29, var24_24, (TextView)var25_25);
            var33_33 = var3_3.b;
            if (var33_33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var26_26);
                var34_34 = 0;
                var35_35 = 0.0f;
                var33_33 = null;
            }
            if ((var29_29 = var21_21.getAmount()) != null) {
                var31_31 = var29_29.floatValue();
            } else {
                var30_30 = 0;
                var31_31 = 0.0f;
                var29_29 = null;
            }
            var29_29 = kq2_1.b(var31_31);
            var20_20 = var21_21.getAvailableAmount();
            if (var20_20 != null) {
                var19_19 = var20_20.floatValue();
            } else {
                var18_18 = 0;
                var19_19 = 0.0f;
                var20_20 = null;
            }
            var20_20 = kq2_1.b(var19_19);
            var21_21 = new StringBuilder();
            var21_21.append((String)var29_29);
            var21_21.append(var17_17);
            var21_21.append((String)var20_20);
            var29_29 = var21_21.toString();
            var33_33.setText((CharSequence)var29_29);
        }
        if (var14_14 != null) {
            var3_3.k = var35_35 = var14_14.getMaximumEligibleBurnPercentage();
            var33_33 = var3_3.c;
            var29_29 = "textViewPointsValue";
            if (var33_33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var29_29);
                var34_34 = 0;
                var35_35 = 0.0f;
                var33_33 = null;
            }
            var20_20 = StringCompanionObject.INSTANCE;
            var20_20 = var3_3.c;
            if (var20_20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var29_29);
                var18_18 = 0;
                var19_19 = 0.0f;
                var20_20 = null;
            }
            var20_20 = var20_20.getContext();
            var22_22 = R$string.acc_wallet_details_points_value;
            var20_20 = var20_20.getString(var22_22);
            Intrinsics.checkNotNullExpressionValue(var20_20, (String)var15_15 /* !! */ );
            var21_21 = var14_14.getAmount();
            if (var21_21 != null) {
                var23_23 = var21_21.floatValue();
            } else {
                var22_22 = 0;
                var23_23 = 0.0f;
                var21_21 = null;
            }
            var21_21 = kq2_1.b(var23_23);
            var25_25 = var14_14.getAvailableAmount();
            if (var25_25 != null) {
                var27_27 = var25_25.floatValue();
            } else {
                var27_27 = 0.0f;
                var25_25 = null;
            }
            var25_25 = kq2_1.b(var27_27);
            var28_28 = var15_15 /* !! */ ;
            var5_5 = 3;
            var6_6 = 4.2E-45f;
            var15_15 /* !! */  = new Object[var5_5];
            var15_15 /* !! */ [0] = var4_4;
            var15_15 /* !! */ [var7_7] = var21_21;
            var13_13 = 2;
            var15_15 /* !! */ [var13_13] = var25_25;
            He1.a((Object[])var15_15 /* !! */ , var5_5, (String)var20_20, var24_24, (TextView)var33_33);
            var4_4 = var3_3.c;
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var29_29);
                var13_13 = 0;
                var4_4 = null;
            }
            if ((var33_33 = var14_14.getAmount()) != null) {
                var35_35 = var33_33.floatValue();
            } else {
                var34_34 = 0;
                var35_35 = 0.0f;
                var33_33 = null;
            }
            var33_33 = kq2_1.b(var35_35);
            var36_36 = var14_14.getAvailableAmount();
            if (var36_36 != null) {
                var6_6 = var36_36.floatValue();
            } else {
                var5_5 = 0;
                var6_6 = 0.0f;
                var36_36 = null;
            }
            var36_36 = kq2_1.b(var6_6);
            var29_29 = new StringBuilder();
            var29_29.append((String)var33_33);
            var29_29.append(var17_17);
            var29_29.append((String)var36_36);
            var33_33 = var29_29.toString();
            var4_4.setText((CharSequence)var33_33);
        } else lbl-1000:
        // 2 sources

        {
            var28_28 = var15_15 /* !! */ ;
        }
        var4_4 = new cj1_2(var3_3);
        var8_8 /* !! */ .setOnClickListener((View.OnClickListener)var4_4);
        var4_4 = var3_3.e;
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewWalletBalance");
            var13_13 = 0;
            var4_4 = null;
        }
        var34_34 = R$string.pesdk_wallet_message_1;
        var36_36 = var3_3.g;
        if (var36_36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var5_5 = 0;
            var6_6 = 0.0f;
            var36_36 = null;
        }
        if ((var36_36 = var36_36.getAvailableAmount()) != null) {
            var6_6 = var36_36.floatValue();
        } else {
            var5_5 = 0;
            var6_6 = 0.0f;
            var36_36 = null;
        }
        var8_8 /* !! */  = var3_3.g;
        if (var8_8 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var11_11 = 0;
            var10_10 = 0.0f;
            var8_8 /* !! */  = null;
        }
        if ((var8_8 /* !! */  = var8_8 /* !! */ .getAmount()) != null) {
            var10_10 = var8_8 /* !! */ .floatValue();
        } else {
            var11_11 = 0;
            var10_10 = 0.0f;
            var8_8 /* !! */  = null;
        }
        var36_36 = kq2_1.a(var6_6 -= var10_10);
        var8_8 /* !! */  = new Object[var7_7];
        var8_8 /* !! */ [0] = var36_36;
        var33_33 = hv3_0.L(var34_34, (Object[])var8_8 /* !! */ );
        var4_4.setText((CharSequence)var33_33);
        var4_4 = var3_3.f;
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewWalletPointsUsableMessage");
            var13_13 = 0;
            var4_4 = null;
        }
        var34_34 = R$string.pesdk_points_message_1;
        var6_6 = var3_3.k;
        var5_5 = ok1_1.b(var6_6);
        var36_36 = var5_5;
        var8_8 /* !! */  = var3_3.j;
        if (var8_8 /* !! */  != null) {
            var19_19 = var8_8 /* !! */ .floatValue();
        } else {
            var18_18 = 0;
            var19_19 = 0.0f;
            var20_20 = null;
        }
        var8_8 /* !! */  = kq2_1.a(var19_19);
        var30_30 = 2;
        var31_31 = 2.8E-45f;
        var29_29 = new Object[var30_30];
        var29_29[0] = var36_36;
        var29_29[var7_7] = var8_8 /* !! */ ;
        var33_33 = hv3_0.L(var34_34, (Object[])var29_29);
        var4_4.setText((CharSequence)var33_33);
        var4_4 = var3_3.g;
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
            var13_13 = 0;
            var4_4 = null;
        }
        var4_4 = var4_4.getExcludedProducts();
        var33_33 = "walletExcludedProducts";
        if (var4_4 == null || (var13_13 = (int)var4_4.isEmpty()) != 0) ** GOTO lbl-1000
        var4_4 = h40_0.a;
        var13_13 = (int)h40_0.h1();
        if (var13_13 != 0) {
            var4_4 = var3_3.i;
            var36_36 = "tvListTitle";
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var36_36);
                var13_13 = 0;
                var4_4 = null;
            }
            var37_37 = z40_0.Companion;
            var37_37 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var37_37).a.d("hm_preorder_json");
            var30_30 = (int)var37_37.has((String)(var8_8 /* !! */  = "hm_preorder_wallet_excluded_text"));
            if (var30_30 != 0) {
                var37_37 = var37_37.getString((String)var8_8 /* !! */ );
                var8_8 /* !! */  = var28_28;
                Intrinsics.checkNotNullExpressionValue(var37_37, (String)var28_28);
            } else {
                var7_7 = R$string.hm_preorder_title;
                var37_37 = hv3_0.K(var7_7);
            }
            var4_4.setText((CharSequence)var37_37);
            var4_4 = var3_3.i;
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var36_36);
                var13_13 = 0;
                var4_4 = null;
            }
            ai0_2.B((View)var4_4);
            var36_36 = this.getContext();
            var4_4 = new LinearLayoutManager((Context)var36_36, 0, false);
            var36_36 = var3_3.h;
            if (var36_36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var5_5 = 0;
                var6_6 = 0.0f;
                var36_36 = null;
            }
            var36_36.setLayoutManager((RecyclerView$o)var4_4);
            var4_4 = var3_3.h;
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var13_13 = 0;
                var4_4 = null;
            }
            if ((var36_36 = var3_3.g) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                var30_30 = 0;
                var31_31 = 0.0f;
                var29_29 = null;
            } else {
                var29_29 = var36_36;
            }
            var36_36 = var29_29.getExcludedProducts();
            var33_33 = new ve3_0((List)var36_36);
            var4_4.setAdapter((RecyclerView$f)var33_33);
        } else lbl-1000:
        // 2 sources

        {
            if ((var4_4 = var3_3.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var30_30 = 0;
                var31_31 = 0.0f;
                var29_29 = null;
            } else {
                var29_29 = var4_4;
            }
            ai0_2.i((View)var29_29);
        }
    }
}

