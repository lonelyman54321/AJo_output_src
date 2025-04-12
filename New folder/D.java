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
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Credit.CreditActivityDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class D
extends Ql2 {
    public static final D$b Companion;
    public static final D$a h;
    public final ja2_1 d;
    public final rv_1 e;
    public final Float f;
    public final mq3_0 g;

    static {
        Object object = new Object();
        Companion = object;
        h = object = new k$e();
    }

    public D(ja2_1 ja2_12, rv_1 rv_12, Float f5, mq3_0 mq3_02) {
        Intrinsics.checkNotNullParameter(ja2_12, "orderClickListener");
        Intrinsics.checkNotNullParameter(rv_12, "viewDetailsClickListener");
        Intrinsics.checkNotNullParameter(mq3_02, "bankTransferClick");
        D$a d$a = h;
        super(d$a);
        this.d = ja2_12;
        this.e = rv_12;
        this.f = f5;
        this.g = mq3_02;
    }

    public final int getItemViewType(int n3) {
        n3 = n3 == 0 ? 2 : 1;
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block22: {
            block21: {
                block27: {
                    block26: {
                        block25: {
                            block23: {
                                block24: {
                                    var3_3 = null;
                                    var4_4 = "holder";
                                    Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
                                    var5_5 = var1_1 instanceof k6;
                                    var6_6 = 1;
                                    if (!var5_5) break block21;
                                    var1_1 = (k6)var1_1;
                                    var4_4 = (CreditActivityDetails)this.h(var2_2);
                                    var1_1.getClass();
                                    if (var4_4 == null) break block22;
                                    var7_7 = var4_4.getTransactionDate();
                                    if (var7_7 == null) {
                                        var7_7 = "";
                                    }
                                    var7_7 = k7.a((String)var7_7, "yyyy-MM-dd HH:mm:ss.SSS", "dd MMM ''yy");
                                    var8_8 = "CREDIT";
                                    var9_9 = "DEBIT";
                                    var10_10 = "WALLET_TO_BANK_TRANSFER";
                                    var11_11 = 8;
                                    var12_12 = var1_1.e;
                                    if (var7_7 != null && (var13_13 = var7_7.length()) != 0) {
                                        var12_12.setVisibility(0);
                                        var14_14 = var4_4.getTransactionType();
                                        if (var14_14 != null && (var13_13 = (int)var14_14.equalsIgnoreCase(var9_9)) == var6_6) {
                                            var14_14 = var4_4.getTransactionReason();
                                            if (var14_14 != null && (var13_13 = (int)var14_14.equalsIgnoreCase(var10_10)) == var6_6) {
                                                var13_13 = R$string.transferred_on;
                                                var15_15 = new Object[var6_6];
                                                var15_15[0] = var7_7;
                                                var7_7 = hv3_0.L(var13_13, var15_15);
                                                var12_12.setText((CharSequence)var7_7);
                                            } else {
                                                var13_13 = R$string.debited_on;
                                                var15_15 = new Object[var6_6];
                                                var15_15[0] = var7_7;
                                                var7_7 = hv3_0.L(var13_13, var15_15);
                                                var12_12.setText((CharSequence)var7_7);
                                            }
                                        } else {
                                            var14_14 = var4_4.getTransactionType();
                                            if (var14_14 != null && (var13_13 = (int)var14_14.equalsIgnoreCase(var8_8)) == var6_6) {
                                                var13_13 = R$string.credited_on;
                                                var15_15 = new Object[var6_6];
                                                var15_15[0] = var7_7;
                                                var7_7 = hv3_0.L(var13_13, var15_15);
                                                var12_12.setText((CharSequence)var7_7);
                                            } else {
                                                var12_12.setText((CharSequence)var7_7);
                                            }
                                        }
                                    } else {
                                        var12_12.setVisibility(var11_11);
                                    }
                                    var7_7 = var4_4.getReturnReferenceid();
                                    var16_16 = TextUtils.isEmpty((CharSequence)var7_7);
                                    var12_12 = var1_1.h;
                                    var14_14 = var1_1.d;
                                    if (var16_16 != 0) break block23;
                                    var7_7 = var4_4.getTransactionReason();
                                    var15_15 = " index ";
                                    if (var7_7 == null || (var16_16 = var7_7.equalsIgnoreCase(var10_10)) != var6_6) break block24;
                                    var16_16 = R$string.transferred_id;
                                    var17_17 = var4_4.getReturnReferenceid();
                                    var18_19 = new Object[var6_6];
                                    var18_19[0] = var17_17;
                                    var7_7 = hv3_0.L(var16_16, var18_19);
                                    var14_14.setText((CharSequence)var7_7);
                                    var17_17 = new StringBuilder();
                                    var17_17.append((String)var7_7);
                                    var17_17.append((String)var15_15);
                                    var17_17.append(var2_2);
                                    var19_20 /* !! */  = var17_17.toString();
                                    var14_14.setContentDescription((CharSequence)var19_20 /* !! */ );
                                    var2_2 = hv3_0.m(R$color.accent_color_18);
                                    var14_14.setTextColor(var2_2);
                                    var19_20 /* !! */  = var4_4.getTransactionType();
                                    var2_2 = (int)kotlin.text.b.i((String)var19_20 /* !! */ , var9_9, (boolean)var6_6);
                                    if (var2_2 == 0) ** GOTO lbl-1000
                                    var19_20 /* !! */  = h40_0.a;
                                    var2_2 = (int)h40_0.O0();
                                    if (var2_2 != 0) {
                                        var12_12.setVisibility(0);
                                        var19_20 /* !! */  = new h6((CreditActivityDetails)var4_4, (k6)var1_1);
                                        var12_12.setOnClickListener((View.OnClickListener)var19_20 /* !! */ );
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var12_12.setVisibility(var11_11);
                                        var19_20 /* !! */  = new Object();
                                        var12_12.setOnClickListener((View.OnClickListener)var19_20 /* !! */ );
                                    }
                                    break block25;
                                }
                                var12_12.setVisibility(var11_11);
                                var7_7 = new Object();
                                var12_12.setOnClickListener((View.OnClickListener)var7_7);
                                var16_16 = R$string.order_number;
                                var12_12 = var4_4.getReturnReferenceid();
                                var17_18 = new Object[var6_6];
                                var17_18[0] = var12_12;
                                var7_7 = hv3_0.L(var16_16, var17_18);
                                var14_14.setText((CharSequence)var7_7);
                                var12_12 = new StringBuilder();
                                var12_12.append((String)var7_7);
                                var12_12.append((String)var15_15);
                                var12_12.append(var2_2);
                                var19_20 /* !! */  = var12_12.toString();
                                var14_14.setContentDescription((CharSequence)var19_20 /* !! */ );
                                var2_2 = hv3_0.m(R$color.accent_color_4);
                                var14_14.setTextColor(var2_2);
                                var19_20 /* !! */  = new j6((CreditActivityDetails)var4_4, (k6)var1_1);
                                var14_14.setOnClickListener((View.OnClickListener)var19_20 /* !! */ );
                                break block25;
                            }
                            var12_12.setVisibility(var11_11);
                            var19_20 /* !! */  = new Object();
                            var12_12.setOnClickListener((View.OnClickListener)var19_20 /* !! */ );
                        }
                        var19_20 /* !! */  = var4_4.getTransactionType();
                        var2_2 = (int)kotlin.text.b.i((String)var19_20 /* !! */ , var9_9, (boolean)var6_6);
                        var7_7 = var1_1.g;
                        var9_9 = "format(...)";
                        var12_12 = var1_1.f;
                        var1_1 = var1_1.c;
                        if (var2_2 == 0) break block26;
                        var19_20 /* !! */  = var4_4.getTransactionReason();
                        var8_8 = "- %s";
                        if (var19_20 /* !! */  != null && (var2_2 = (int)var19_20 /* !! */ .equalsIgnoreCase(var10_10)) == var6_6) {
                            var2_2 = R$string.bank_transfer_debit_status;
                            var19_20 /* !! */  = hv3_0.K(var2_2);
                            var1_1.setText((CharSequence)var19_20 /* !! */ );
                            var1_1 = StringCompanionObject.INSTANCE;
                            var1_1 = qz2_0.x(var4_4.getAmount());
                            var19_20 /* !! */  = new Object[var6_6];
                            var19_20 /* !! */ [0] = var1_1;
                            zn0_1.b(var19_20 /* !! */ , var6_6, var8_8, var9_9, (TextView)var12_12);
                            var14_14.setVisibility(0);
                            var20_22 = R$drawable.ic_ac_bag_debit;
                            var7_7.setImageResource(var20_22);
                        } else {
                            var2_2 = R$string.debit_desc;
                            var19_20 /* !! */  = hv3_0.K(var2_2);
                            var1_1.setText((CharSequence)var19_20 /* !! */ );
                            var1_1 = StringCompanionObject.INSTANCE;
                            var1_1 = qz2_0.x(var4_4.getAmount());
                            var19_20 /* !! */  = new Object[var6_6];
                            var19_20 /* !! */ [0] = var1_1;
                            zn0_1.b(var19_20 /* !! */ , var6_6, var8_8, var9_9, (TextView)var12_12);
                            var14_14.setVisibility(0);
                            var20_23 = R$drawable.ic_ac_bag_debit;
                            var7_7.setImageResource(var20_23);
                        }
                        break block22;
                    }
                    var19_20 /* !! */  = var4_4.getTransactionType();
                    var2_2 = (int)kotlin.text.b.i((String)var19_20 /* !! */ , var8_8, (boolean)var6_6);
                    var8_8 = "+ %s";
                    if (var2_2 == 0 || (var19_20 /* !! */  = var4_4.getTransactionReason()) == null || (var2_2 = (int)var19_20 /* !! */ .equalsIgnoreCase(var10_10)) != var6_6) break block27;
                    var2_2 = R$string.bank_transfer_refunded_status;
                    var19_20 /* !! */  = hv3_0.K(var2_2);
                    var1_1.setText((CharSequence)var19_20 /* !! */ );
                    var1_1 = StringCompanionObject.INSTANCE;
                    var1_1 = qz2_0.x(var4_4.getAmount());
                    var19_20 /* !! */  = new Object[var6_6];
                    var19_20 /* !! */ [0] = var1_1;
                    zn0_1.b(var19_20 /* !! */ , var6_6, var8_8, var9_9, (TextView)var12_12);
                    var14_14.setVisibility(0);
                    var20_24 = R$drawable.ic_ac_bag;
                    var7_7.setImageResource(var20_24);
                    break block22;
                }
                var19_20 /* !! */  = var4_4.getTransactionReason();
                if (var19_20 /* !! */  != null && (var2_2 = (int)var19_20 /* !! */ .equalsIgnoreCase(var10_10 = "referral")) == var6_6) ** GOTO lbl-1000
                var19_20 /* !! */  = var4_4.getReturnReferenceid();
                if (var19_20 /* !! */  != null) {
                    var2_2 = var19_20 /* !! */ .length();
                } else {
                    var2_2 = 0;
                    var19_20 /* !! */  = null;
                }
                var21_27 = 32;
                if (var2_2 > var21_27) {
                    var19_20 /* !! */  = var4_4.getReturnReferenceid();
                    if (var19_20 /* !! */  != null && (var2_2 = (int)StringsKt.F((CharSequence)var19_20 /* !! */ , var10_10 = "_", false)) == var6_6) {
                        var2_2 = 1;
                    } else {
                        var2_2 = 0;
                        var19_20 /* !! */  = null;
                    }
                    ** if (var2_2 == 0) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    var2_2 = R$string.referral_desc;
                    var19_20 /* !! */  = hv3_0.K(var2_2);
                    var1_1.setText((CharSequence)var19_20 /* !! */ );
                    var1_1 = StringCompanionObject.INSTANCE;
                    var1_1 = qz2_0.x(var4_4.getAmount());
                    var19_20 /* !! */  = new Object[var6_6];
                    var19_20 /* !! */ [0] = var1_1;
                    zn0_1.b(var19_20 /* !! */ , var6_6, var8_8, var9_9, (TextView)var12_12);
                    var14_14.setVisibility(var11_11);
                    var20_25 = R$drawable.ic_ac_bag;
                    var7_7.setImageResource(var20_25);
                    ** GOTO lbl220
                }
lbl-1000:
                // 2 sources

                {
                    var2_2 = R$string.credit_desc;
                    var19_20 /* !! */  = hv3_0.K(var2_2);
                    var1_1.setText((CharSequence)var19_20 /* !! */ );
                    var1_1 = StringCompanionObject.INSTANCE;
                    var1_1 = qz2_0.x(var4_4.getAmount());
                    var19_20 /* !! */  = new Object[var6_6];
                    var19_20 /* !! */ [0] = var1_1;
                    zn0_1.b(var19_20 /* !! */ , var6_6, var8_8, var9_9, (TextView)var12_12);
                    var14_14.setVisibility(0);
                    var20_26 = R$drawable.ic_ac_bag;
                    var7_7.setImageResource(var20_26);
                }
                break block22;
            }
            var2_2 = var1_1 instanceof p;
            if (var2_2 != 0) {
                var1_1 = (p)var1_1;
                var2_2 = R$string.transferable_ac;
                var19_21 = hv3_0.K(var2_2);
                var3_3 = this.f;
                var1_1.w(var19_21, (boolean)var6_6, var3_3);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 2;
        Object object2 = "inflate(...)";
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_ac_t_nt;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            object = this.g;
            recyclerView$B = new p((View)viewGroup, (mq3_0)object);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.row_ac_t;
            viewGroup = object.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            object = this.d;
            object2 = this.e;
            recyclerView$B = new k6((View)viewGroup, (ja2_1)object, (rv_1)object2);
        }
        return recyclerView$B;
    }
}

