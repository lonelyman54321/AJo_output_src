/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.FragmentOrderRefundBreakupBinding;
import com.ril.ajio.services.data.Order.RefundAmount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from OH2
 */
public final class oh2_2
extends i61_0 {
    public static final /* synthetic */ gn1_2[] h;
    public final cc3_2 f;
    public final D g;

    static {
        in1_2 in1_22 = jz.a(oh2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentOrderRefundBreakupBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{in1_22};
        h = gn1_2Array;
    }

    public oh2_2() {
        Object object = z80_0.c(OH2$a.a, this);
        this.f = object;
        object = Reflection.getOrCreateKotlinClass(qh2_0.class);
        OH2$b oH2$b = new OH2$b(this);
        OH2$c oH2$c = new OH2$c(this);
        OH2$d oH2$d = new OH2$d(this);
        this.g = object = LW0.a(this, (yn1_2)object, oH2$b, oH2$c, oH2$d);
    }

    public final FragmentOrderRefundBreakupBinding Pa() {
        Object object = h[0];
        object = this.f.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentOrderRefundBreakupBinding)object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        nh2_0 nh2_02 = new nh2_0((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)nh2_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_order_refund_breakup;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block36: {
            block32: {
                block33: {
                    var3_3 = this;
                    var4_4 = var1_1 /* !! */ ;
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "view");
                    super.onViewCreated(var1_1 /* !! */ , var2_2);
                    var5_5 /* !! */  = ((qh2_0)this.g.getValue()).a;
                    if (var5_5 /* !! */  == null) break block32;
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "container");
                    var6_6 = R$id.refund_breakup_total_amt_tv;
                    var7_7 /* !! */  = var1_1 /* !! */ .findViewById(var6_6);
                    var8_8 = "findViewById(...)";
                    Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , (String)var8_8);
                    var7_7 /* !! */  = (TextView)var7_7 /* !! */ ;
                    var9_9 = R$id.refund_breakup_total_amt_val_tv;
                    var10_10 = var1_1 /* !! */ .findViewById(var9_9);
                    Intrinsics.checkNotNullExpressionValue(var10_10, (String)var8_8);
                    var10_10 = (TextView)var10_10;
                    var11_11 = R$id.refund_breakup_bank_transfer_amt_tv;
                    var12_12 = var1_1 /* !! */ .findViewById(var11_11);
                    Intrinsics.checkNotNullExpressionValue(var12_12, (String)var8_8);
                    var12_12 = (TextView)var12_12;
                    var13_13 = R$id.refund_breakup_bank_transfer_amt_val_tv;
                    var14_14 = var1_1 /* !! */ .findViewById(var13_13);
                    Intrinsics.checkNotNullExpressionValue(var14_14, (String)var8_8);
                    var14_14 = (TextView)var14_14;
                    var15_15 = R$id.refund_breakup_prepaid_amt_tv;
                    var16_16 = var1_1 /* !! */ .findViewById(var15_15);
                    Intrinsics.checkNotNullExpressionValue(var16_16, (String)var8_8);
                    var16_16 = (TextView)var16_16;
                    var17_17 = R$id.refund_breakup_prepaid_amt_val_tv;
                    var18_18 = var1_1 /* !! */ .findViewById(var17_17);
                    Intrinsics.checkNotNullExpressionValue(var18_18, (String)var8_8);
                    var18_18 = (TextView)var18_18;
                    var19_19 = R$id.refund_breakup_r1_amt_tv;
                    var20_20 = var1_1 /* !! */ .findViewById(var19_19);
                    Intrinsics.checkNotNullExpressionValue(var20_20, (String)var8_8);
                    var20_20 = (TextView)var20_20;
                    var21_21 = R$id.refund_breakup_r1_amt_val_tv;
                    var22_22 = var1_1 /* !! */ .findViewById(var21_21);
                    Intrinsics.checkNotNullExpressionValue(var22_22, (String)var8_8);
                    var22_22 = (TextView)var22_22;
                    var23_23 = R$id.refund_breakup_mahacashback_amt_tv;
                    var24_24 = var1_1 /* !! */ .findViewById(var23_23);
                    Intrinsics.checkNotNullExpressionValue(var24_24, (String)var8_8);
                    var24_24 = (TextView)var24_24;
                    var25_25 = R$id.refund_breakup_mahacashback_amt_val_tv;
                    var26_26 = var1_1 /* !! */ .findViewById(var25_25);
                    Intrinsics.checkNotNullExpressionValue(var26_26, (String)var8_8);
                    var26_26 = (TextView)var26_26;
                    var27_27 = R$id.refund_breakup_lr_amt_tv;
                    var28_28 = var1_1 /* !! */ .findViewById(var27_27);
                    Intrinsics.checkNotNullExpressionValue(var28_28, (String)var8_8);
                    var28_28 = (TextView)var28_28;
                    var29_29 = R$id.refund_breakup_lr_amt_val_tv;
                    var30_30 /* !! */  = var1_1 /* !! */ .findViewById(var29_29);
                    Intrinsics.checkNotNullExpressionValue(var30_30 /* !! */ , (String)var8_8);
                    var30_30 /* !! */  = (TextView)var30_30 /* !! */ ;
                    var31_32 = R$id.refund_breakup_ajio_wallet_header_tv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var2_2 = (TextView)var3_3;
                    var31_32 = R$id.refund_breakup_ajio_cash_amt_tv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var32_33 = (TextView)var3_3;
                    var31_32 = R$id.refund_breakup_ajio_cash_val_tv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var33_34 = (TextView)var3_3;
                    var31_32 = R$id.refund_breakup_ajio_points_amt_tv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var34_35 = (TextView)var3_3;
                    var31_32 = R$id.refund_breakup_ajio_points_val_tv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var35_36 = (TextView)var3_3;
                    var31_32 = R$id.refund_breakup_ajio_cash_iv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var36_37 = (ImageView)var3_3;
                    var31_32 = R$id.refund_breakup_ajio_points_iv;
                    var3_3 = var1_1 /* !! */ .findViewById(var31_32);
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8);
                    var3_3 = (ImageView)var3_3;
                    var4_4 = var5_5 /* !! */ .getRefundAmounts();
                    var8_8 = "";
                    var37_38 = null;
                    if (var4_4 == null) break block33;
                    var4_4 = var4_4.iterator();
                    var38_39 = var8_8;
                    var39_40 = var8_8;
                    var40_41 = var8_8;
                    var41_42 = var8_8;
                    var42_43 = var8_8;
                    var43_44 = var8_8;
                    var44_45 = 0.0f;
                    var45_46 = null;
                    block11: while (var46_47 = var4_4.hasNext()) {
                        block35: {
                            block34: {
                                var47_48 = (RefundAmount)var4_4.next();
                                var48_50 = var47_48.component1();
                                var47_48 = var47_48.component2();
                                var1_1 /* !! */  = var4_4;
                                var4_4 = var47_48.toUpperCase();
                                var47_48 = var8_8;
                                var8_8 = "toUpperCase(...)";
                                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var8_8);
                                var49_51 = mz3_0.w((String)var4_4);
                                if (var49_51 != 0) {
                                    var4_4 = rh2_0.a(var48_50);
                                    var50_52 = mz3_0.G((String)var4_4);
                                    var44_45 = var50_52 + var44_45;
lbl112:
                                    // 8 sources

                                    while (true) {
                                        var4_4 = var1_1 /* !! */ ;
                                        var8_8 = var47_48;
                                        continue block11;
                                        break;
                                    }
                                }
                                var49_51 = var4_4.hashCode();
                                switch (var49_51) {
                                    default: {
                                        break block34;
                                    }
                                    case 1518091846: {
                                        var8_8 = "RELIANCE_ONE";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  == false) break block34;
                                        var4_4 = rh2_0.a(var48_50);
                                        var50_52 = mz3_0.G((String)var4_4);
                                        var41_42 = qz2_0.u(var50_52);
                                        ** GOTO lbl112
                                    }
                                    case 1386827418: {
                                        var8_8 = "RAZORPAY";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  != false) ** GOTO lbl163
                                        break block34;
                                    }
                                    case 1313280611: {
                                        var8_8 = "AJIO_CASH";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  == false) break block34;
                                        var4_4 = rh2_0.a(var48_50);
                                        var50_52 = mz3_0.G((String)var4_4);
                                        var43_44 = qz2_0.u(var50_52);
                                        ** GOTO lbl112
                                    }
                                    case 668082691: {
                                        var8_8 = "PAYTMGATEWAY";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  != false) ** GOTO lbl163
                                        break block34;
                                    }
                                    case 553358315: {
                                        var8_8 = "LOYALTY_REWARDS";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  == false) break block34;
                                        var4_4 = rh2_0.a(var48_50);
                                        var50_52 = mz3_0.G((String)var4_4);
                                        var40_41 = qz2_0.u(var50_52);
                                        ** GOTO lbl112
                                    }
                                    case 339673041: {
                                        var8_8 = "BILL_DESK";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  == false) break block34;
                                        ** GOTO lbl163
                                    }
                                    case 314639668: {
                                        var8_8 = "JIOGATEWAY";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  == false) break block34;
lbl163:
                                        // 4 sources

                                        var4_4 = rh2_0.a(var48_50);
                                        var50_52 = mz3_0.G((String)var4_4);
                                        var38_39 = qz2_0.u(var50_52);
                                        ** GOTO lbl112
                                    }
                                    case 2251303: {
                                        var8_8 = "IMPS";
                                        var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                        if (var51_53 /* !! */  == false) break block34;
                                        var4_4 = rh2_0.a(var48_50);
                                        var50_52 = mz3_0.G((String)var4_4);
                                        var39_40 = qz2_0.u(var50_52);
                                        ** GOTO lbl112
                                    }
                                    case -839073524: 
                                }
                                var8_8 = "MAHA_CASHBACK";
                                var51_53 /* !! */  = (float)var4_4.equals(var8_8);
                                if (var51_53 /* !! */  != false) break block35;
                            }
                            var4_4 = rh2_0.a(var48_50);
                            var50_52 = mz3_0.G((String)var4_4);
                            var38_39 = qz2_0.u(var50_52);
                            ** GOTO lbl112
                        }
                        var4_4 = rh2_0.a(var48_50);
                        var50_52 = mz3_0.G((String)var4_4);
                        var42_43 = qz2_0.u(var50_52);
                        ** continue;
                    }
                    var47_48 = var8_8;
                    cfr_temp_0 = var44_45 - 0.0f;
                    var51_53 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var51_53 /* !! */  > 0) {
                        var8_8 = qz2_0.u(var44_45);
                    }
                    var4_4 = var39_40;
                    var1_1 /* !! */  = var40_41;
                    var45_46 = var41_42;
                    var40_41 = var43_44;
                    var41_42 = var3_3;
                    var39_40 = var8_8;
                    var8_8 = var38_39;
                    var38_39 = var42_43;
lbl202:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var47_49 = var8_8;
                var41_42 = var3_3;
                var1_1 /* !! */  = var8_8;
                var4_4 = var8_8;
                var45_46 = var8_8;
                var38_39 = var8_8;
                var39_40 = var8_8;
                var40_41 = var8_8;
                ** while (true)
                var31_32 = 0;
                var52_54 = 0.0f;
                var3_3 = null;
                var7_7 /* !! */ .setVisibility(0);
                var3_3 = var5_5 /* !! */ .getRefundAmountSection();
                if (var3_3 != null && (var3_3 = var3_3.getRefundAmount()) != null) {
                    var52_54 = var3_3.floatValue();
                } else {
                    var31_32 = 0;
                    var52_54 = 0.0f;
                    var3_3 = null;
                }
                var6_6 = (int)((cfr_temp_1 = var52_54 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                if (var6_6 > 0) {
                    ai0_2.B(var10_10);
                    var3_3 = qz2_0.u(var52_54);
                    var10_10.setText((CharSequence)var3_3);
                    var6_6 = R$string.total_refund_amount_text;
                    var37_38 = var5_5 /* !! */ ;
                    var53_55 = 1;
                    var5_5 /* !! */  = new Object[var53_55];
                    var42_43 = var26_26;
                    var25_25 = 0;
                    var26_26 = null;
                    var5_5 /* !! */ [0] = var3_3;
                    var3_3 = hv3_0.L(var6_6, var5_5 /* !! */ );
                    var10_10.setContentDescription((CharSequence)var3_3);
                } else {
                    var37_38 = var5_5 /* !! */ ;
                    var42_43 = var26_26;
                    var25_25 = 0;
                    var26_26 = null;
                    ai0_2.i(var10_10);
                }
                var31_32 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                if (var31_32 == 0) {
                    var16_16.setVisibility(0);
                    var18_18.setVisibility(0);
                    var18_18.setText((CharSequence)var8_8);
                }
                if ((var31_32 = (int)TextUtils.isEmpty((CharSequence)var4_4)) == 0) {
                    var12_12.setVisibility(0);
                    var14_14.setVisibility(0);
                    var14_14.setText((CharSequence)var4_4);
                }
                if ((var31_32 = (int)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ )) == 0) {
                    var28_28.setVisibility(0);
                    var30_30 /* !! */ .setVisibility(0);
                    var3_3 = var1_1 /* !! */ ;
                    var30_30 /* !! */ .setText((CharSequence)var1_1 /* !! */ );
                }
                if ((var31_32 = (int)TextUtils.isEmpty((CharSequence)var45_46)) == 0) {
                    var20_20.setVisibility(0);
                    var22_22.setVisibility(0);
                    var3_3 = var45_46;
                    var22_22.setText((CharSequence)var45_46);
                }
                if ((var31_32 = (int)TextUtils.isEmpty((CharSequence)var38_39)) == 0) {
                    var24_24.setVisibility(0);
                    var3_3 = var42_43;
                    var42_43.setVisibility(0);
                    var4_4 = var38_39;
                    var42_43.setText((CharSequence)var38_39);
                }
                if ((var31_32 = (int)TextUtils.isEmpty((CharSequence)var39_40)) == 0 || (var31_32 = (int)TextUtils.isEmpty((CharSequence)var40_41)) == 0) {
                    var3_3 = var2_2;
                    var2_2.setVisibility(0);
                    var31_32 = (int)TextUtils.isEmpty((CharSequence)var39_40);
                    if (var31_32 == 0) {
                        var3_3 = var36_37;
                        var36_37.setVisibility(0);
                        var3_3 = var32_33;
                        var32_33.setVisibility(0);
                        var3_3 = var33_34;
                        var33_34.setVisibility(0);
                        var8_8 = var39_40;
                        var33_34.setText((CharSequence)var39_40);
                    }
                    if ((var31_32 = (int)TextUtils.isEmpty((CharSequence)var40_41)) == 0) {
                        var3_3 = var41_42;
                        var41_42.setVisibility(0);
                        var3_3 = var34_35;
                        var34_35.setVisibility(0);
                        var3_3 = var35_36;
                        var35_36.setVisibility(0);
                        var4_4 = var40_41;
                        var35_36.setText((CharSequence)var40_41);
                    }
                }
                var3_3 = this.Pa().cancelBtn;
                var30_30 /* !! */  = this;
                var4_4 = new MH2(this, 0);
                var3_3.setOnClickListener((View.OnClickListener)var4_4);
                var3_3 = var37_38.getReturnEntries();
                if (var3_3 != null && (var31_32 = (var3_3 = var37_38.getReturnEntries()).size()) > 0) {
                    var3_3 = var37_38.getReturnEntries();
                } else {
                    var4_4 = "RETURN CANCELLED";
                    var3_3 = var37_38.getReturnStatus();
                    var31_32 = (int)var4_4.equalsIgnoreCase((String)var3_3);
                    if (var31_32 != 0) {
                        var3_3 = var37_38.getReturnCancelledEntries();
                    } else {
                        var31_32 = 0;
                        var52_54 = 0.0f;
                        var3_3 = null;
                    }
                }
                var4_4 = this.Pa().orderList;
                var7_7 /* !! */  = this.requireActivity();
                var5_5 /* !! */  = new LinearLayoutManager((Context)var7_7 /* !! */ );
                var4_4.setLayoutManager((RecyclerView$o)var5_5 /* !! */ );
                var4_4 = this.Pa().orderList;
                var5_5 /* !! */  = new lh2_1((List)var3_3);
                var4_4.setAdapter((RecyclerView$f)var5_5 /* !! */ );
                break block36;
            }
            var30_31 = this;
        }
    }
}

