/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OptedPaymentModeOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.RefundAmount;
import com.ril.ajio.services.data.Order.ReturnRefundAmount;
import com.ril.ajio.services.data.Order.ReturnRefundBodyLink;
import com.ril.ajio.services.data.Order.ReturnRefundBottomLink;
import com.ril.ajio.services.data.Order.ReturnRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.f;
import kotlin.text.b;

/*
 * Renamed from FN2
 */
public final class fn2_2
extends vw_0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final ImageView E;
    public final RecyclerView F;
    public final AjioTextView G;
    public final View H;
    public float I;
    public String J;
    public String K;
    public String L;
    public String M;
    public final HN2 a;
    public final AjioTextView b;
    public final AjioTextView c;
    public final AjioTextView d;
    public final AjioTextView e;
    public final AjioTextView f;
    public final View g;
    public final LinearLayout h;
    public final AjioTextView i;
    public final TextView j;
    public final View k;
    public final TextView l;
    public final TextView m;
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
    public final TextView y;
    public final TextView z;

    public fn2_2(View object, HN2 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object2;
        int n3 = R$id.tv_refund_breakup;
        this.b = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.refund_amount;
        this.c = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.refund_via;
        this.d = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.error_msg;
        this.e = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.refund_info;
        this.f = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.divider;
        object2 = object.findViewById(n3);
        this.g = object2;
        n3 = R$id.link_container;
        object2 = (LinearLayout)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.link_two;
        this.i = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.row_od_return_lbl_transfer;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.j = object2;
        n3 = R$id.refundDetailContainer;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.k = object2;
        n3 = R$id.refund_breakup_total_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.l = object2;
        n3 = R$id.refund_detail_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.m = object2;
        n3 = R$id.refund_breakup_total_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.n = object2;
        n3 = R$id.refund_breakup_bank_transfer_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.o = object2;
        n3 = R$id.refund_breakup_bank_transfer_amt_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.p = object2;
        n3 = R$id.refund_breakup_prepaid_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.q = object2;
        n3 = R$id.refund_breakup_prepaid_amt_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.r = object2;
        n3 = R$id.refund_breakup_r1_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.s = object2;
        n3 = R$id.refund_breakup_r1_amt_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.t = object2;
        n3 = R$id.refund_breakup_mahacashback_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.u = object2;
        n3 = R$id.refund_breakup_mahacashback_amt_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.v = object2;
        n3 = R$id.refund_breakup_lr_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.w = object2;
        n3 = R$id.refund_breakup_lr_amt_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.x = object2;
        n3 = R$id.refund_breakup_ajio_wallet_header_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.y = object2;
        n3 = R$id.refund_breakup_ajio_cash_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.z = object2;
        n3 = R$id.refund_breakup_ajio_cash_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.A = object2;
        n3 = R$id.refund_breakup_ajio_points_amt_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.B = object2;
        n3 = R$id.refund_breakup_ajio_points_val_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.C = object2;
        n3 = R$id.refund_breakup_ajio_cash_iv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ImageView)object2;
        this.D = object2;
        n3 = R$id.refund_breakup_ajio_points_iv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ImageView)object2;
        this.E = object2;
        n3 = R$id.return_refund_mode_rv;
        this.F = object2 = (RecyclerView)object.findViewById(n3);
        n3 = R$id.refund_breakup_header_tv;
        this.G = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.breakup_divider;
        this.H = object = object.findViewById(n3);
        object = "";
        this.K = object;
        this.L = object;
        this.M = object;
    }

    public static String y(String string2) {
        if (string2 != null) {
            int n3 = string2.length();
            int n4 = 1;
            n3 -= n4;
            int n7 = 0;
            boolean bl2 = false;
            while (n7 <= n3) {
                int n8 = !bl2 ? n7 : n3;
                n8 = string2.charAt(n8);
                int n10 = 32;
                n8 = Intrinsics.compare(n8, n10);
                n8 = n8 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n8 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n7;
                    continue;
                }
                if (n8 == 0) break;
                n3 += -1;
            }
            n3 += n4;
            String string3 = ((Object)string2.subSequence(n7, n3)).toString();
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0)) == 0 && (n3 = (int)(kotlin.text.b.s(string2, string3 = "-", false) ? 1 : 0)) != 0) {
                string2 = string2.substring(n4);
                string3 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
            }
        }
        return string2;
    }

    public final void A(ReturnRequest returnRequest, CartOrder cartOrder, boolean bl2) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = bl2;
        h40_0 h40_02 = h40_0.a;
        bl2 = h40_0.B0();
        if (bl2) {
            bl2 = false;
            h40_02 = null;
            ref$BooleanRef.element = false;
        }
        h40_02 = this.h;
        Intrinsics.checkNotNullExpressionValue(h40_02, "linkConatiner");
        ai0_2.B((View)h40_02);
        h40_02 = this.g;
        Intrinsics.checkNotNullExpressionValue(h40_02, "divider");
        ai0_2.B((View)h40_02);
        h40_02 = this.j;
        ai0_2.B((View)h40_02);
        dn2_0 dn2_02 = new dn2_0(this, returnRequest, cartOrder, ref$BooleanRef);
        h40_02.setOnClickListener(dn2_02);
    }

    /*
     * Unable to fully structure code
     */
    public final void w(Object var1_1, Object var2_2) {
        block98: {
            block111: {
                block110: {
                    block104: {
                        block106: {
                            block107: {
                                block105: {
                                    block103: {
                                        block99: {
                                            block97: {
                                                var3_3 = this;
                                                var4_4 = var1_1;
                                                var5_5 = 0;
                                                var6_6 = 0.0f;
                                                var7_7 = null;
                                                var8_8 = 1;
                                                Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
                                                var4_4 = (pa2_0)var1_1;
                                                var9_9 = var4_4.b;
                                                Intrinsics.checkNotNull(var9_9, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.ReturnRefundAmount");
                                                var9_9 = (ReturnRefundAmount)var9_9;
                                                var10_10 = var4_4.d;
                                                Intrinsics.checkNotNull(var10_10, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.ReturnRequest");
                                                var10_10 = (ReturnRequest)var10_10;
                                                var4_4 = var4_4.c;
                                                Intrinsics.checkNotNull(var4_4, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.CartOrder");
                                                var11_11 = var4_4.getCode();
                                                var12_12 = "";
                                                if (var11_11 == null) {
                                                    var11_11 = var12_12;
                                                }
                                                var3_3.K = var11_11;
                                                var11_11 = var10_10.getReturnStatus();
                                                if (var11_11 == null) {
                                                    var11_11 = var12_12;
                                                }
                                                var3_3.L = var11_11;
                                                var11_11 = var10_10.getReturnId();
                                                if (var11_11 == null) {
                                                    var11_11 = var12_12;
                                                }
                                                var3_3.M = var11_11;
                                                var11_11 = var10_10.getBankReferenceNumber();
                                                var3_3.J = var11_11;
                                                var13_13 = no_2.h((CartOrder)var4_4);
                                                var14_14 = "format(...)";
                                                var15_15 = var3_3.c;
                                                var16_16 = "errorMsgTv";
                                                var17_17 = "refundViaTv";
                                                var18_18 = var3_3.e;
                                                var19_19 = var3_3.d;
                                                if (var13_13 != 0 && (var13_13 = Intrinsics.areEqual(var11_11 = var9_9.isReturnCancelled(), var20_20 = Boolean.TRUE)) != 0) {
                                                    Intrinsics.checkNotNullExpressionValue(var15_15, "refundAmountTv");
                                                    var4_4 = StringCompanionObject.INSTANCE;
                                                    var4_4 = hv3_0.K(R$string.return_refund_amount);
                                                    var10_10 = new Object[var8_8];
                                                    var10_10[0] = "\u20b90";
                                                    var7_7 = Arrays.copyOf(var10_10, var8_8);
                                                    var4_4 = String.format((String)var4_4, (Object[])var7_7);
                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var14_14);
                                                    ai0_2.z(var15_15, (String)var4_4);
                                                    var3_3.z((ReturnRefundAmount)var9_9);
                                                    var3_3.x((ReturnRefundAmount)var9_9, (boolean)var8_8);
                                                    Intrinsics.checkNotNullExpressionValue(var19_19, (String)var17_17);
                                                    ai0_2.i((View)var19_19);
                                                    Intrinsics.checkNotNullExpressionValue(var18_18, (String)var16_16);
                                                    ai0_2.i((View)var18_18);
                                                    return;
                                                }
                                                var11_11 = var9_9.getRefundAmount();
                                                var21_21 = false;
                                                var20_20 = null;
                                                if (var11_11 != null) {
                                                    var22_22 = kotlin.ranges.f.a(var11_11.floatValue(), 0.0f);
                                                } else {
                                                    var13_13 = 0;
                                                    var22_22 = 0.0f;
                                                    var11_11 = null;
                                                }
                                                var11_11 = qz2_0.u(var22_22);
                                                var23_23 = StringCompanionObject.INSTANCE;
                                                var24_24 = R$string.return_refund_amount;
                                                var23_23 = hv3_0.K(var24_24);
                                                var20_20 = new Object[var8_8];
                                                var20_20[0] = var11_11;
                                                n40_0.a((Object[])var20_20, var8_8, (String)var23_23, var14_14, var15_15);
                                                var11_11 = var9_9.getErrorMessage();
                                                var14_14 = var3_3.j;
                                                var15_15 = var3_3.k;
                                                if (var11_11 == null || (var13_13 = var11_11.length()) == 0) break block97;
                                                var4_4 = var9_9.getErrorMessage();
                                                var18_18.setText((CharSequence)var4_4);
                                                Intrinsics.checkNotNullExpressionValue(var18_18, (String)var16_16);
                                                ai0_2.B((View)var18_18);
                                                Intrinsics.checkNotNullExpressionValue(var19_19, (String)var17_17);
                                                ai0_2.i((View)var19_19);
                                                ai0_2.i((View)var15_15);
                                                var4_4 = var3_3.f;
                                                Intrinsics.checkNotNullExpressionValue(var4_4, "refundInfoTv");
                                                ai0_2.i((View)var4_4);
                                                var4_4 = var3_3.g;
                                                Intrinsics.checkNotNullExpressionValue(var4_4, "divider");
                                                ai0_2.i((View)var4_4);
                                                var4_4 = var3_3.h;
                                                var7_7 = "linkConatiner";
                                                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var7_7);
                                                ai0_2.i((View)var4_4);
                                                ai0_2.i((View)var14_14);
                                                break block98;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(var18_18, (String)var16_16);
                                            ai0_2.i((View)var18_18);
                                            var11_11 = h40_0.a;
                                            var13_13 = (int)h40_0.d2();
                                            if (var13_13 != 0) {
                                                if (var19_19 != null) {
                                                    ai0_2.i((View)var19_19);
                                                }
                                            } else {
                                                if (var19_19 != null) {
                                                    ai0_2.B((View)var19_19);
                                                }
                                                Intrinsics.checkNotNullExpressionValue(var19_19, (String)var17_17);
                                                var11_11 = var9_9.getPaymentModeOfRefundMsg();
                                                ai0_2.z((TextView)var19_19, (String)var11_11);
                                            }
                                            var3_3.z((ReturnRefundAmount)var9_9);
                                            var3_3.x((ReturnRefundAmount)var9_9, false);
                                            var11_11 = new ArrayList();
                                            var16_16 = var10_10.getReturnEntries();
                                            if (var16_16 != null) {
                                                var16_16 = ((Iterable)var16_16).iterator();
                                                while ((var25_25 = var16_16.hasNext()) != 0) {
                                                    var17_17 = ((OrderDetailLineItem)var16_16.next()).getEntry();
                                                    var18_18 = "getEntry(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var17_17, (String)var18_18);
                                                    var11_11.add(var17_17);
                                                }
                                            }
                                            var16_16 = var10_10.getRefundCTAEnabled();
                                            var17_17 = "refundBreakup";
                                            var18_18 = var3_3.b;
                                            if (var16_16 == null || !(var26_26 = Intrinsics.areEqual(var16_16 = var10_10.getRefundCTAEnabled(), var19_19 = Boolean.TRUE))) break block99;
                                            cp_1.Companion.getClass();
                                            var16_16 = "cartEntries";
                                            Intrinsics.checkNotNullParameter(var11_11, (String)var16_16);
                                            var19_19 = var11_11.iterator();
                                            var21_21 = false;
                                            var20_20 = null;
                                            while ((var24_24 = (int)var19_19.hasNext()) != 0) {
                                                block102: {
                                                    block101: {
                                                        block100: {
                                                            var20_20 = (CartEntry)var19_19.next();
                                                            if (var20_20 != null && (var23_23 = var20_20.getConvenienceFee()) != null && (var23_23 = var23_23.getDelivery()) != null) {
                                                                var23_23 = var23_23.isFeeCharged();
                                                                var7_7 = Boolean.FALSE;
                                                                var5_5 = (int)Intrinsics.areEqual(var23_23, var7_7);
                                                            } else {
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var7_7 = null;
                                                            }
                                                            if (var5_5 != 0) break block100;
                                                            if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getDelivery()) != null) {
                                                                var7_7 = var7_7.isFeeCharged();
                                                            } else {
                                                                var5_5 = 0;
                                                                var6_6 = 0.0f;
                                                                var7_7 = null;
                                                            }
                                                            if (var7_7 != null) ** GOTO lbl-1000
                                                        }
                                                        if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getCOD()) != null) {
                                                            var7_7 = var7_7.isFeeCharged();
                                                            var23_23 = Boolean.FALSE;
                                                            var5_5 = (int)Intrinsics.areEqual(var7_7, var23_23);
                                                        } else {
                                                            var5_5 = 0;
                                                            var6_6 = 0.0f;
                                                            var7_7 = null;
                                                        }
                                                        if (var5_5 != 0) break block101;
                                                        if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getCOD()) != null) {
                                                            var7_7 = var7_7.isFeeCharged();
                                                        } else {
                                                            var5_5 = 0;
                                                            var6_6 = 0.0f;
                                                            var7_7 = null;
                                                        }
                                                        if (var7_7 != null) ** GOTO lbl-1000
                                                    }
                                                    if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getRVP()) != null) {
                                                        var7_7 = var7_7.isFeeCharged();
                                                        var23_23 = Boolean.FALSE;
                                                        var5_5 = (int)Intrinsics.areEqual(var7_7, var23_23);
                                                    } else {
                                                        var5_5 = 0;
                                                        var6_6 = 0.0f;
                                                        var7_7 = null;
                                                    }
                                                    if (var5_5 != 0) break block102;
                                                    if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getRVP()) != null) {
                                                        var7_7 = var7_7.isFeeCharged();
                                                    } else {
                                                        var5_5 = 0;
                                                        var6_6 = 0.0f;
                                                        var7_7 = null;
                                                    }
                                                    if (var7_7 != null) ** GOTO lbl-1000
                                                }
                                                if ((var5_5 = (int)h40_0.P1()) == 0) ** GOTO lbl-1000
                                                if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getPriorityDelivery()) != null) {
                                                    var7_7 = var7_7.isFeeCharged();
                                                    var23_23 = Boolean.FALSE;
                                                    var5_5 = (int)Intrinsics.areEqual(var7_7, var23_23);
                                                } else {
                                                    var5_5 = 0;
                                                    var6_6 = 0.0f;
                                                    var7_7 = null;
                                                }
                                                if (var5_5 != 0) ** GOTO lbl-1000
                                                if (var20_20 != null && (var7_7 = var20_20.getConvenienceFee()) != null && (var7_7 = var7_7.getPriorityDelivery()) != null) {
                                                    var23_23 = var7_7.isFeeCharged();
                                                } else {
                                                    var24_24 = 0;
                                                    var23_23 = null;
                                                }
                                                if (var23_23 == null) lbl-1000:
                                                // 2 sources

                                                {
                                                    var21_21 = true;
                                                } else lbl-1000:
                                                // 5 sources

                                                {
                                                    var21_21 = false;
                                                    var20_20 = null;
                                                }
                                                var5_5 = 0;
                                                var6_6 = 0.0f;
                                                var7_7 = null;
                                            }
                                            if (!var21_21) ** GOTO lbl-1000
                                            cp_1.Companion.getClass();
                                            Intrinsics.checkNotNullParameter(var11_11, (String)var16_16);
                                            var7_7 = var11_11.iterator();
                                            var29_28 = var27_27 = 0.0;
                                            while ((var13_13 = (int)var7_7.hasNext()) != 0) {
                                                var11_11 = (CartEntry)var7_7.next();
                                                var31_29 = var11_11 != null && (var11_11 = var11_11.getBankDiscountPromoAmt()) != null ? var11_11.doubleValue() : var27_27;
                                                var29_28 = var31_29 + var29_28;
                                            }
                                            var5_5 = (int)(var29_28 == var27_27 ? 0 : (var29_28 > var27_27 ? 1 : -1));
                                            if (var5_5 > 0) {
                                                var5_5 = 1;
                                                var6_6 = 1.4E-45f;
                                            } else {
                                                var5_5 = 0;
                                                var6_6 = 0.0f;
                                                var7_7 = null;
                                            }
                                            if (var5_5 == 0) {
                                                Intrinsics.checkNotNullExpressionValue(var18_18, (String)var17_17);
                                                ai0_2.i((View)var18_18);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                Intrinsics.checkNotNullExpressionValue(var18_18, (String)var17_17);
                                                ai0_2.B((View)var18_18);
                                            }
                                            break block103;
                                        }
                                        Intrinsics.checkNotNullExpressionValue(var18_18, (String)var17_17);
                                        ai0_2.i((View)var18_18);
                                    }
                                    var7_7 = var10_10.getReturnEntries();
                                    if (var7_7 != null && (var7_7 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)var7_7)) != null && (var7_7 = var7_7.getEntry()) != null && (var7_7 = var7_7.getReturnFee()) != null && (var7_7 = je3_2.e((String)var7_7)) != null) {
                                        var6_6 = var7_7.floatValue();
lbl243:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var5_5 = 0;
                                    var6_6 = 0.0f;
                                    var7_7 = null;
                                    ** while (true)
                                    var13_13 = 0;
                                    var22_22 = 0.0f;
                                    var11_11 = null;
                                    cfr_temp_0 = var6_6 - 0.0f;
                                    var5_5 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                    if (var5_5 > 0) {
                                        Intrinsics.checkNotNullExpressionValue(var18_18, (String)var17_17);
                                        ai0_2.B((View)var18_18);
                                    }
                                    var7_7 = new gn_1(var3_3, (Serializable)var10_10, var8_8);
                                    var18_18.setOnClickListener((View.OnClickListener)var7_7);
                                    var7_7 = h40_0.a;
                                    var5_5 = (int)h40_0.d2();
                                    if (var5_5 == 0) ** GOTO lbl-1000
                                    var7_7 = var10_10.optedPaymentModeReturnList;
                                    if (var7_7 != null && (var5_5 = (int)var7_7.isEmpty()) == 0) {
                                        var5_5 = 0;
                                        var6_6 = 0.0f;
                                        var7_7 = null;
                                    } else {
                                        var5_5 = 1;
                                        var6_6 = 1.4E-45f;
                                    }
                                    if (var5_5 == 0) {
                                        var5_5 = 1;
                                        var6_6 = 1.4E-45f;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var5_5 = 0;
                                        var6_6 = 0.0f;
                                        var7_7 = null;
                                    }
                                    var11_11 = var9_9.getViewRefundBreakSection();
                                    var16_16 = Boolean.TRUE;
                                    var13_13 = (int)Intrinsics.areEqual(var11_11, var16_16);
                                    if (var13_13 == 0 && var5_5 == 0) break block104;
                                    var7_7 = var10_10.optedPaymentModeReturnList;
                                    var13_13 = (int)h40_0.d2();
                                    var16_16 = var3_3.H;
                                    var17_17 = var3_3.n;
                                    var18_18 = var3_3.l;
                                    if (var13_13 == 0 || var7_7 == null || (var13_13 = (int)var7_7.isEmpty()) != 0) break block105;
                                    var33_30 = var7_7.isEmpty() ^ var8_8;
                                    var13_13 = (int)var7_7.isEmpty();
                                    if (var13_13 != 0) {
                                        while (true) {
                                            var13_13 = 0;
                                            var22_22 = 0.0f;
                                            var11_11 = null;
                                            break;
                                        }
                                    } else {
                                        var11_11 = var7_7.iterator();
                                        do {
                                            if ((var34_31 = var11_11.hasNext()) == 0) ** continue;
                                        } while ((var19_19 = ((OptedPaymentModeOrder)var11_11.next()).getAmount()) == null || (var34_31 = var19_19.length()) <= 0);
                                        var13_13 = 1;
                                        var22_22 = 1.4E-45f;
                                    }
                                    if (var13_13 != 0) {
                                        ai0_2.B((View)var17_17);
                                        if (var16_16 != null) {
                                            ai0_2.B((View)var16_16);
                                        }
                                        if ((var16_16 = var10_10.getRefundAmountSection()) != null && (var16_16 = var16_16.getRefundAmount()) != null) {
                                            var35_32 = var16_16.floatValue();
lbl307:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var26_26 = false;
                                        var35_32 = 0.0f;
                                        var16_16 = null;
                                        ** continue;
                                        var25_25 = 0;
                                        var17_17 = null;
                                        cfr_temp_1 = var35_32 - 0.0f;
                                        var34_31 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                        if (var34_31 > 0) {
                                            ai0_2.B((View)var18_18);
                                            var16_16 = qz2_0.u(var35_32);
                                            var18_18.setText((CharSequence)var16_16);
                                        } else {
                                            ai0_2.i((View)var18_18);
                                        }
                                    } else {
                                        ai0_2.i((View)var17_17);
                                        if (var16_16 != null) {
                                            ai0_2.i((View)var16_16);
                                        }
                                    }
                                    var17_17 = var10_10.optedPaymentModeReturnList;
                                    var16_16 = new RecyclerView$f();
                                    var16_16.a = var17_17;
                                    var16_16.b = var13_13;
                                    var11_11 = var3_3.F;
                                    if (var11_11 != null) {
                                        var11_11.setAdapter((RecyclerView$f)var16_16);
                                    }
                                    if (var11_11 != null) {
                                        ai0_2.B((View)var11_11);
                                    }
                                    if ((var11_11 = var3_3.G) != null) {
                                        var16_16 = var3_3.itemView.getContext();
                                        var25_25 = R$string.refund_credit_mode;
                                        var16_16 = var16_16.getString(var25_25);
                                        var11_11.setText((CharSequence)var16_16);
                                    }
                                    var3_3.J = var11_11 = var10_10.getBankReferenceNumber();
                                    var11_11 = new ArrayList();
                                    var7_7 = var7_7.iterator();
                                    while (var26_26 = var7_7.hasNext()) {
                                        var17_17 = var16_16 = var7_7.next();
                                        var17_17 = ((OptedPaymentModeOrder)var16_16).getSavedMop();
                                        if (var17_17 != null && (var25_25 = var17_17.length()) != 0) {
                                            var25_25 = 0;
                                            var17_17 = null;
                                        } else {
                                            var25_25 = 1;
                                        }
                                        if ((var25_25 ^= var8_8) == 0) continue;
                                        var11_11.add(var16_16);
                                    }
                                    var5_5 = (int)var11_11.isEmpty();
                                    var7_7 = var5_5 != 0 ? "payment not saved" : "payment saved";
                                    var11_11 = var3_3.K;
                                    if (var11_11 != null) {
                                        var12_12 = var11_11;
                                    }
                                    var11_11 = var10_10.getReturnId();
                                    var16_16 = var3_3.L;
                                    var17_17 = "refund mode section viewed";
                                    IN2.b((String)var17_17, (String)var12_12, (String)var7_7, (String)var11_11, (String)var16_16);
                                    break block106;
                                }
                                var7_7 = var10_10.getRefundAmounts();
                                if (var7_7 == null) break block107;
                                var7_7 = var7_7.iterator();
                                var19_19 = var12_12;
                                var20_20 = var12_12;
                                var23_23 = var12_12;
                                var36_34 = var12_12;
                                var37_35 = var12_12;
                                var38_36 = var12_12;
                                var13_13 = 0;
                                var22_22 = 0.0f;
                                var11_11 = null;
                                block19: while (var39_37 = var7_7.hasNext()) {
                                    block109: {
                                        block108: {
                                            var40_38 = (RefundAmount)var7_7.next();
                                            var41_39 = var40_38.component1();
                                            var42_40 = var40_38.component2();
                                            var40_38 = var7_7;
                                            var7_7 = Locale.getDefault();
                                            var43_41 = var12_12;
                                            var12_12 = "getDefault(...)";
                                            Intrinsics.checkNotNullExpressionValue(var7_7, (String)var12_12);
                                            var7_7 = var42_40.toUpperCase((Locale)var7_7);
                                            var42_40 = "toUpperCase(...)";
                                            Intrinsics.checkNotNullExpressionValue(var7_7, var42_40);
                                            var8_8 = (int)mz3_0.w((String)var7_7);
                                            if (var8_8 != 0) {
                                                var7_7 = fn2_2.y(var41_39);
                                                var6_6 = mz3_0.G((String)var7_7);
                                                var22_22 += var6_6;
lbl396:
                                                // 8 sources

                                                while (true) {
                                                    var7_7 = var40_38;
                                                    var12_12 = var43_41;
                                                    var8_8 = 1;
                                                    continue block19;
                                                    break;
                                                }
                                            }
                                            var8_8 = var7_7.hashCode();
                                            switch (var8_8) {
                                                default: {
                                                    break block108;
                                                }
                                                case 1518091846: {
                                                    var42_40 = "RELIANCE_ONE";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 == 0) break block108;
                                                    var7_7 = fn2_2.y(var41_39);
                                                    var6_6 = mz3_0.G((String)var7_7);
                                                    var36_34 = qz2_0.u(var6_6);
                                                    ** GOTO lbl396
                                                }
                                                case 1386827418: {
                                                    var42_40 = "RAZORPAY";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 != 0) ** GOTO lbl448
                                                    break block108;
                                                }
                                                case 1313280611: {
                                                    var42_40 = "AJIO_CASH";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 == 0) break block108;
                                                    var7_7 = fn2_2.y(var41_39);
                                                    var6_6 = mz3_0.G((String)var7_7);
                                                    var38_36 = qz2_0.u(var6_6);
                                                    ** GOTO lbl396
                                                }
                                                case 668082691: {
                                                    var42_40 = "PAYTMGATEWAY";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 != 0) ** GOTO lbl448
                                                    break block108;
                                                }
                                                case 553358315: {
                                                    var42_40 = "LOYALTY_REWARDS";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 == 0) break block108;
                                                    var7_7 = fn2_2.y(var41_39);
                                                    var6_6 = mz3_0.G((String)var7_7);
                                                    var23_23 = qz2_0.u(var6_6);
                                                    ** GOTO lbl396
                                                }
                                                case 339673041: {
                                                    var42_40 = "BILL_DESK";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 == 0) break block108;
                                                    ** GOTO lbl448
                                                }
                                                case 314639668: {
                                                    var42_40 = "JIOGATEWAY";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 == 0) break block108;
lbl448:
                                                    // 4 sources

                                                    var7_7 = fn2_2.y(var41_39);
                                                    var6_6 = mz3_0.G((String)var7_7);
                                                    var19_19 = qz2_0.u(var6_6);
                                                    ** GOTO lbl396
                                                }
                                                case 2251303: {
                                                    var42_40 = "IMPS";
                                                    var5_5 = (int)var7_7.equals(var42_40);
                                                    if (var5_5 == 0) break block108;
                                                    var7_7 = fn2_2.y(var41_39);
                                                    var6_6 = mz3_0.G((String)var7_7);
                                                    var20_20 = qz2_0.u(var6_6);
                                                    ** GOTO lbl396
                                                }
                                                case -839073524: 
                                            }
                                            var42_40 = "MAHA_CASHBACK";
                                            var5_5 = (int)var7_7.equals(var42_40);
                                            if (var5_5 != 0) break block109;
                                        }
                                        var7_7 = fn2_2.y(var41_39);
                                        var6_6 = mz3_0.G((String)var7_7);
                                        var19_19 = qz2_0.u(var6_6);
                                        ** GOTO lbl396
                                    }
                                    var7_7 = fn2_2.y(var41_39);
                                    var6_6 = mz3_0.G((String)var7_7);
                                    var37_35 = qz2_0.u(var6_6);
                                    ** continue;
                                }
                                var43_41 = var12_12;
                                var7_7 = var36_34;
                                var42_40 = var37_35;
                                var12_12 = var38_36;
lbl478:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var43_41 = var12_12;
                            var7_7 = var12_12;
                            var42_40 = var12_12;
                            var19_19 = var12_12;
                            var20_20 = var12_12;
                            var23_23 = var12_12;
                            var13_13 = 0;
                            var22_22 = 0.0f;
                            var11_11 = null;
                            ** while (true)
                            var44_42 = 0;
                            var36_34 = null;
                            cfr_temp_2 = var22_22 - 0.0f;
                            var45_43 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                            if (var45_43 > 0) {
                                var3_3.I = var22_22;
                                var11_11 = qz2_0.u(var22_22);
                            } else {
                                var11_11 = var43_41;
                            }
                            ai0_2.B((View)var15_15);
                            ai0_2.B((View)var17_17);
                            if (var16_16 != null) {
                                ai0_2.B((View)var16_16);
                            }
                            if ((var16_16 = var10_10.getRefundAmountSection()) != null && (var16_16 = var16_16.getRefundAmount()) != null) {
                                var35_33 = var16_16.floatValue();
lbl506:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var26_26 = false;
                            var35_33 = 0.0f;
                            var16_16 = null;
                            ** while (true)
                            var25_25 = 0;
                            var17_17 = null;
                            cfr_temp_3 = var35_33 - 0.0f;
                            var44_42 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                            if (var44_42 > 0) {
                                ai0_2.B((View)var18_18);
                                var16_16 = qz2_0.u(var35_33);
                                var18_18.setText((CharSequence)var16_16);
                            } else {
                                ai0_2.i((View)var18_18);
                            }
                            var16_16 = var3_3.m;
                            var9_9 = var9_9.getRefundDescription();
                            ai0_2.z((TextView)var16_16, (String)var9_9);
                            var33_30 = (int)TextUtils.isEmpty((CharSequence)var19_19);
                            if (var33_30 == 0) {
                                ai0_2.B((View)var3_3.q);
                                var9_9 = var3_3.r;
                                ai0_2.z((TextView)var9_9, (String)var19_19);
                                var33_30 = 1;
                            } else {
                                var33_30 = 0;
                                var9_9 = null;
                            }
                            var26_26 = TextUtils.isEmpty((CharSequence)var20_20);
                            if (!var26_26) {
                                ai0_2.B((View)var3_3.o);
                                var9_9 = var3_3.p;
                                ai0_2.z((TextView)var9_9, (String)var20_20);
                                var33_30 = 1;
                            }
                            if (!(var26_26 = TextUtils.isEmpty((CharSequence)var23_23))) {
                                ai0_2.B((View)var3_3.w);
                                var9_9 = var3_3.x;
                                ai0_2.z((TextView)var9_9, (String)var23_23);
                                var33_30 = 1;
                            }
                            if (!(var26_26 = TextUtils.isEmpty((CharSequence)var7_7))) {
                                ai0_2.B((View)var3_3.s);
                                var9_9 = var3_3.t;
                                ai0_2.z((TextView)var9_9, (String)var7_7);
                                var33_30 = 1;
                            }
                            if ((var5_5 = (int)TextUtils.isEmpty((CharSequence)var42_40)) == 0) {
                                ai0_2.B((View)var3_3.u);
                                var7_7 = var3_3.v;
                                ai0_2.z((TextView)var7_7, var42_40);
                                var33_30 = 1;
                            }
                            if ((var5_5 = (int)TextUtils.isEmpty((CharSequence)var11_11)) == 0 || (var5_5 = (int)TextUtils.isEmpty((CharSequence)var12_12)) == 0) {
                                var7_7 = var3_3.y;
                                ai0_2.B((View)var7_7);
                                var5_5 = (int)TextUtils.isEmpty((CharSequence)var11_11);
                                if (var5_5 == 0) {
                                    ai0_2.B((View)var3_3.D);
                                    ai0_2.B((View)var3_3.z);
                                    var7_7 = var3_3.A;
                                    ai0_2.B((View)var7_7);
                                    ai0_2.z((TextView)var7_7, (String)var11_11);
                                }
                                if ((var5_5 = (int)TextUtils.isEmpty((CharSequence)var12_12)) == 0) {
                                    ai0_2.B((View)var3_3.E);
                                    ai0_2.B((View)var3_3.B);
                                    var7_7 = var3_3.C;
                                    ai0_2.B((View)var7_7);
                                    ai0_2.z((TextView)var7_7, (String)var12_12);
                                }
                                var33_30 = 1;
                            }
                        }
                        if (var33_30 != 0) {
                            ai0_2.B((View)var15_15);
                        } else {
                            ai0_2.i((View)var15_15);
                        }
                    }
                    var7_7 = h40_0.a;
                    var5_5 = (int)h40_0.O0();
                    if (var5_5 == 0) break block110;
                    var6_6 = var3_3.I;
                    var8_8 = 0;
                    var42_40 = null;
                    cfr_temp_4 = var6_6 - 0.0f;
                    var5_5 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                    if (var5_5 <= 0) break block111;
                    var5_5 = 1;
                    var6_6 = 1.4E-45f;
                    var3_3.A((ReturnRequest)var10_10, (CartOrder)var4_4, (boolean)var5_5);
                    break block98;
                }
                var8_8 = 0;
                var42_40 = null;
            }
            if ((var5_5 = (int)h40_0.j1()) != 0 && (var5_5 = (int)var10_10.isImpsFlag()) != 0 && (var5_5 = (int)((cfr_temp_5 = (var6_6 = var3_3.I) - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) > 0) {
                var5_5 = 0;
                var6_6 = 0.0f;
                var7_7 = null;
                var3_3.A((ReturnRequest)var10_10, (CartOrder)var4_4, false);
            } else {
                ai0_2.k((View)var14_14);
            }
        }
    }

    public final void x(ReturnRefundAmount serializable, boolean n3) {
        int n4;
        if ((serializable = ((ReturnRefundAmount)serializable).getBottomLinkContent()) != null && (n4 = ((ArrayList)serializable).size()) > 0) {
            Object object;
            int n7;
            Object object2 = this.h;
            String string2 = "linkConatiner";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ai0_2.B((View)object2);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = n7 = 1;
            String string3 = "divider";
            View view = this.g;
            if (n3 != 0) {
                n3 = 0;
                object = null;
                ref$IntRef.element = 0;
                Intrinsics.checkNotNullExpressionValue(view, string3);
                ai0_2.i(view);
            } else {
                Intrinsics.checkNotNullExpressionValue(view, string3);
                ai0_2.B(view);
            }
            n3 = ((ArrayList)serializable).size();
            int n8 = ref$IntRef.element;
            if (n3 > n8 && (object = ((ReturnRefundBottomLink)((ArrayList)serializable).get(n8)).getBottomHeader()) != null && (n3 = object.length()) != 0) {
                object2 = this.i;
                Intrinsics.checkNotNullExpressionValue(object2, "linkTwo");
                n3 = ref$IntRef.element;
                object = ((ReturnRefundBottomLink)((ArrayList)serializable).get(n3)).getBottomHeader();
                ai0_2.z((TextView)object2, (String)object);
                object = new en2_0(this, (ArrayList)serializable, ref$IntRef);
                object2.setOnClickListener((View.OnClickListener)object);
            } else {
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                ai0_2.i((View)object2);
                Intrinsics.checkNotNullExpressionValue(view, string3);
                ai0_2.i(view);
            }
        }
    }

    public final void z(ReturnRefundAmount object) {
        int n3;
        StringBuilder stringBuilder;
        String string2;
        String string3;
        Object object2;
        int n4;
        CharSequence charSequence = new StringBuilder();
        object = ((ReturnRefundAmount)object).getBodyContent();
        AjioTextView ajioTextView = this.f;
        if (object != null && (n4 = ((ArrayList)object).size()) > 0) {
            hv3_0.a.getClass();
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            n4 = (int)(((ao0_0)object2).a("enable_refunded_description") ? 1 : 0);
            int n7 = 0;
            string3 = null;
            if (n4 != 0) {
                ajioTextView.setVisibility(0);
            } else {
                n4 = 8;
                ajioTextView.setVisibility(n4);
            }
            n4 = object.size();
            while (n7 < n4) {
                int n8 = ((ArrayList)object).size() + -1;
                if (n7 == n8) {
                    string2 = ((ReturnRefundBodyLink)((ArrayList)object).get(n7)).getMessage();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("<br>");
                    string2 = stringBuilder.toString();
                    ((StringBuilder)charSequence).append(string2);
                } else {
                    string2 = ((ReturnRefundBodyLink)((ArrayList)object).get(n7)).getMessage();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("<br><br>");
                    string2 = stringBuilder.toString();
                    ((StringBuilder)charSequence).append(string2);
                }
                ++n7;
            }
        }
        object = hv3_0.f(((StringBuilder)charSequence).toString());
        ajioTextView.setText((CharSequence)object);
        object = this.J;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = this.K;
            if (object == null) {
                object = "";
            }
            object2 = object;
            string3 = this.M;
            string2 = this.L;
            charSequence = "rrn details viewed";
            stringBuilder = null;
            int n10 = 36;
            IN2.a((String)charSequence, n10, (String)object, string3, string2, null);
        }
    }
}

