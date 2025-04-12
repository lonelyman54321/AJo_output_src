/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.ToggleButton
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from YS
 */
public final class ys_1
extends is2_1 {
    public Context k;
    public OnCheckoutClickListener l;
    public co2_0 m;
    public int n;

    public ys_1(Context context, OnCheckoutClickListener onCheckoutClickListener, op2_2 op2_22, mu1_1 mu1_12, ArrayList arrayList, PaymentInstruments paymentInstruments, dv_0 dv_02, co2_0 co2_02, TenantResponse object) {
        int n3;
        object = "onCheckoutClickListener";
        Intrinsics.checkNotNullParameter(onCheckoutClickListener, (String)object);
        String string2 = "dataSet";
        Intrinsics.checkNotNullParameter(arrayList, string2);
        String string3 = "paymentInfoProvider";
        Intrinsics.checkNotNullParameter(co2_02, string3);
        Intrinsics.checkNotNullParameter(arrayList, string2);
        Intrinsics.checkNotNullParameter(co2_02, string3);
        Intrinsics.checkNotNullParameter(onCheckoutClickListener, (String)object);
        this.a = op2_22;
        this.b = mu1_12;
        this.c = arrayList;
        this.d = paymentInstruments;
        this.e = dv_02;
        this.f = co2_02;
        this.g = onCheckoutClickListener;
        this.h = context;
        this.i = n3 = -1;
        this.k = context;
        this.l = onCheckoutClickListener;
        this.m = co2_02;
        this.n = n3;
    }

    public final void g(Context context, OnCheckoutClickListener onCheckoutClickListener, op2_2 op2_22, mu1_1 mu1_12, ArrayList arrayList, PaymentInstruments paymentInstruments, dv_0 dv_02, co2_0 co2_02, TenantResponse tenantResponse) {
        Intrinsics.checkNotNullParameter(onCheckoutClickListener, "onCheckoutClickListener");
        Intrinsics.checkNotNullParameter(arrayList, "dataList");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        this.k = context;
        this.l = onCheckoutClickListener;
        this.a = op2_22;
        this.b = mu1_12;
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.c = arrayList;
        this.d = paymentInstruments;
        this.e = dv_02;
        this.m = co2_02;
        this.notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.c.size();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block225: {
            block226: {
                block227: {
                    var3_3 = this;
                    var4_4 = var2_2;
                    var5_5 = 0;
                    var6_6 = null;
                    var7_7 = 1;
                    var8_8 = 1.4E-45f;
                    var9_9 = var1_1;
                    var9_9 = (rw_2)var1_1;
                    var10_10 = "viewHolder";
                    Intrinsics.checkNotNullParameter(var9_9, (String)var10_10);
                    var11_11 = this.c;
                    var12_12 = var11_11.size();
                    if (var2_2 >= var12_12) break block225;
                    var11_11 = this.c.get(var2_2);
                    var13_13 = "get(...)";
                    Intrinsics.checkNotNullExpressionValue(var11_11, (String)var13_13);
                    var11_11 = (qq2_2)var11_11;
                    var14_14 = this.getItemViewType(var2_2);
                    var15_15 = 22;
                    if (var14_14 == var15_15) break block226;
                    var15_15 = 27;
                    if (var14_14 == var15_15) break block227;
                    block0 : switch (var14_14) {
                        default: {
                            Intrinsics.checkNotNullParameter(var9_9, (String)var10_10);
                            var10_10 = this.c;
                            var16_16 = var10_10.size();
                            if (var2_2 >= var16_16) break;
                            var10_10 = this.c.get(var2_2);
                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var13_13);
                            var10_10 = (qq2_2)var10_10;
                            var12_12 = this.getItemViewType(var2_2);
                            var17_17 = 0;
                            var18_18 = 0.0f;
                            var13_13 = null;
                            if (var12_12 == var7_7) ** GOTO lbl1223
                            var14_14 = 2;
                            var19_19 = 2.8E-45f;
                            var20_20 = "";
                            if (var12_12 == var14_14) ** GOTO lbl1214
                            var14_14 = 3;
                            var19_19 = 4.2E-45f;
                            if (var12_12 == var14_14) ** GOTO lbl1206
                            var21_21 = 15;
                            var22_22 = 2.1E-44f;
                            if (var12_12 == var21_21) ** GOTO lbl1201
                            var21_21 = 16;
                            var22_22 = 2.2E-44f;
                            if (var12_12 == var21_21) ** GOTO lbl1196
                            var21_21 = 29;
                            var22_22 = 4.1E-44f;
                            if (var12_12 == var21_21) ** GOTO lbl1183
                            var23_23 = "toggleBtn";
                            var24_24 = 8;
                            var25_25 = 1.1E-44f;
                            var26_26 = 1065353216;
                            var27_27 = 1.0f;
                            var28_28 = 0.5f;
                            switch (var12_12) {
                                default: {
                                    var29_29 = "format(...)";
                                    switch (var12_12) {
                                        default: {
                                            var23_23 = "_load";
                                            var30_31 = "auth";
                                            var16_16 = 34;
                                            var31_34 = "internalWalletDataHolder";
                                            switch (var12_12) {
                                                default: {
                                                    break;
                                                }
                                                case 36: {
                                                    var10_10 = oo2_0.a;
                                                    var11_11 = this.d;
                                                    var10_10.getClass();
                                                    var10_10 = oo2_0.c("EMI", (PaymentInstruments)var11_11);
                                                    if (var10_10 != null) {
                                                        var11_11 = var10_10.getPaymentInstrumentsInfo();
                                                    } else {
                                                        var12_12 = 0;
                                                        var11_11 = null;
                                                        var32_39 = 0.0f;
                                                    }
                                                    if (var11_11 != null) {
                                                        var9_9.a = var4_4;
                                                        var4_4 = var9_9 instanceof rr2_1;
                                                        if (var4_4 != 0) {
                                                            var9_9 = (rr2_1)var9_9;
                                                            var33_43 = var10_10.getPaymentInstrumentsInfo();
                                                            var10_10 = var9_9.h;
                                                            var10_10.getClass();
                                                            if (var33_43 != null && (var11_11 = (PaymentInstrumentInfo)CollectionsKt.N(0, (List)var33_43)) != null && (var11_11 = var11_11.getFeatured_emi()) != null) {
                                                                var12_12 = var11_11.size();
                                                            } else {
                                                                var12_12 = 0;
                                                                var32_39 = 0.0f;
                                                                var11_11 = null;
                                                            }
                                                            if (var33_43 != null && (var30_31 = (PaymentInstrumentInfo)CollectionsKt.N(0, (List)var33_43)) != null && (var30_31 = var30_31.getStandard_emi()) != null) {
                                                                var14_14 = var30_31.size();
                                                            } else {
                                                                var14_14 = 0;
                                                                var19_19 = 0.0f;
                                                                var30_31 = null;
                                                            }
                                                            if (var33_43 != null && (var20_20 = (PaymentInstrumentInfo)CollectionsKt.N(0, (List)var33_43)) != null && (var20_20 = var20_20.getNo_cost_emi()) != null) {
                                                                var15_15 = var20_20.size();
                                                            } else {
                                                                var15_15 = 0;
                                                                var20_20 = null;
                                                            }
                                                            var14_14 += var15_15;
                                                            var15_15 = var10_10.l;
                                                            if (var14_14 <= var15_15 || var12_12 <= 0) {
                                                                var7_7 = 0;
                                                                var8_8 = 0.0f;
                                                                var34_68 = null;
                                                            }
                                                            var10_10.q = var7_7;
                                                            var11_11 = yn3_0.a;
                                                            var20_20 = "showViewMore :";
                                                            var30_31 = new StringBuilder((String)var20_20);
                                                            var30_31.append((boolean)var7_7);
                                                            var34_68 = var30_31.toString();
                                                            var30_31 = new Object[]{};
                                                            var11_11.a((String)var34_68, var30_31);
                                                            if (var33_43 != null && (var33_43 = (PaymentInstrumentInfo)CollectionsKt.N(0, (List)var33_43)) != null) {
                                                                var13_13 = var33_43.getFeatured_emi();
                                                            }
                                                            var10_10.d((List)var13_13);
                                                            var33_43 = var9_9.c.n8();
                                                            var6_6 = var9_9.d;
                                                            var34_68 = var9_9.e;
                                                            var10_10.b((ToggleButton)var34_68, (TenantResponse)var33_43, (op2_2)var6_6);
                                                            break;
                                                        }
                                                    }
                                                    break block225;
                                                }
                                                case 35: {
                                                    var9_9.a = var2_2;
                                                    var4_4 = var9_9 instanceof ms2_1;
                                                    if (var4_4 == 0) break block225;
                                                    var9_9 = (ms2_1)var9_9;
                                                    var33_44 = oo2_0.a;
                                                    var10_10 = this.d;
                                                    var11_11 = this.f.c2();
                                                    var30_31 = this.h;
                                                    var33_44.getClass();
                                                    var33_44 = oo2_0.f((PaymentInstruments)var10_10, (Context)var30_31, (PriceValidation)var11_11);
                                                    var10_10 = var9_9.n;
                                                    if (var10_10 != null) {
                                                        var10_10 = var10_10.getPriceValidation();
                                                    } else {
                                                        var16_16 = 0;
                                                        var10_10 = null;
                                                    }
                                                    if (var10_10 == null) {
                                                        var9_9.n = var33_44;
                                                    }
                                                    var33_44 = var9_9.n;
                                                    var10_10 = var9_9.o;
                                                    var10_10.getClass();
                                                    if (var33_44 != null) {
                                                        var10_10 = var33_44.getDisplayUPIInfo();
                                                    } else {
                                                        var16_16 = 0;
                                                        var10_10 = null;
                                                    }
                                                    var16_16 = (int)TextUtils.isEmpty((CharSequence)var10_10);
                                                    if (var16_16 != 0) ** GOTO lbl172
                                                    if (var33_44 == null) ** GOTO lbl167
                                                    var33_44 = var33_44.getDisplayUPIInfo();
                                                    ** GOTO lbl174
lbl167:
                                                    // 2 sources

                                                    while (true) {
                                                        var4_4 = 0;
                                                        var33_44 = null;
                                                        var35_80 = 0.0f;
                                                        ** GOTO lbl174
                                                        break;
                                                    }
lbl172:
                                                    // 1 sources

                                                    if (var33_44 == null) ** continue;
                                                    var33_44 = var33_44.getName();
lbl174:
                                                    // 3 sources

                                                    var9_9.i.setText((CharSequence)var33_44);
                                                    var33_44 = cp_1.Companion;
                                                    var33_44.getClass();
                                                    var4_4 = cp$a.s();
                                                    var10_10 = var9_9.j;
                                                    if (var4_4 == 0) ** GOTO lbl-1000
                                                    var33_44 = var9_9.n;
                                                    if (var33_44 != null) {
                                                        var33_44 = var33_44.getAppDrawabe();
                                                    } else {
                                                        var4_4 = 0;
                                                        var33_44 = null;
                                                        var35_80 = 0.0f;
                                                    }
                                                    if (var33_44 == null) {
                                                        var4_4 = R$drawable.ic_spc_upi_image;
                                                        var10_10.setImageResource(var4_4);
                                                        var4_4 = R$string.acc_upi_icon;
                                                        var33_44 = hv3_0.K(var4_4);
                                                        var10_10.setContentDescription((CharSequence)var33_44);
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        if ((var33_44 = var9_9.n) != null) {
                                                            var13_13 = var33_44.getAppDrawabe();
                                                        }
                                                        var10_10.setImageDrawable((Drawable)var13_13);
                                                    }
                                                    var33_44 = var9_9.k;
                                                    if (var33_44 != null) {
                                                        var33_44.setVisibility(0);
                                                    }
                                                    if ((var10_10 = var9_9.h) != null) {
                                                        var10_10.setVisibility(0);
                                                    }
                                                    if (var33_44 != null) {
                                                        var33_44.setCardClickListener((PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener)var9_9);
                                                    }
                                                    var33_44 = var9_9.m.getEC_PREFERRED_MODE_ACTION();
                                                    var9_9.w((String)var33_44);
                                                    if (var10_10 != null) {
                                                        var10_10.setOnClickListener((View.OnClickListener)var9_9);
                                                    }
                                                    var33_44 = var9_9.c;
                                                    var10_10 = var33_44.n8();
                                                    var32_40 = var33_44.D();
                                                    var13_13 = var33_44.H();
                                                    var14_14 = 35;
                                                    var19_19 = 4.9E-44f;
                                                    var16_16 = (int)oo2_0.l(var14_14, (TenantResponse)var10_10, var32_40, (HashSet)var13_13);
                                                    var11_11 = var9_9.f;
                                                    if (var16_16 == 0) {
                                                        var16_16 = (int)dm0_0.d;
                                                        if (var16_16 != 0) {
                                                            dm0_0.d = false;
                                                            var11_11.toggle();
                                                        }
                                                    } else {
                                                        dm0_0.d = false;
                                                    }
                                                    var10_10 = var33_44.n8();
                                                    var18_18 = var33_44.D();
                                                    var33_44 = var33_44.H();
                                                    var4_4 = (int)oo2_0.l(var14_14, (TenantResponse)var10_10, var18_18, (HashSet)var33_44);
                                                    var9_9 = var9_9.g;
                                                    if (var4_4 != 0) {
                                                        uh_1.Companion.getClass();
                                                        var33_44 = "<set-?>";
                                                        Intrinsics.checkNotNullParameter(var20_20, (String)var33_44);
                                                        uh_1.e = var20_20;
                                                        var9_9.setAlpha(var28_28);
                                                        var11_11.setClickable(false);
                                                        var11_11.setEnabled(false);
                                                        var4_4 = var11_11.isChecked();
                                                        if (var4_4 != 0) {
                                                            var11_11.toggle();
                                                            break;
                                                        }
                                                    } else {
                                                        uh_1.Companion.getClass();
                                                        var33_44 = uh_1.e;
                                                        var6_6 = "PREFERRED_UPI";
                                                        var4_4 = (int)Intrinsics.areEqual(var33_44, var6_6);
                                                        if (var4_4 == 0) {
                                                            var9_9.setAlpha(var27_27);
                                                            var11_11.setClickable((boolean)var7_7);
                                                            var11_11.setEnabled((boolean)var7_7);
                                                            break;
                                                        }
                                                    }
                                                    break block225;
                                                }
                                                case 34: {
                                                    var4_4 = var9_9 instanceof sr2_0;
                                                    if (var4_4 != 0) {
                                                        var9_9 = (sr2_0)var9_9;
                                                        var9_9.f.setOnClickListener((View.OnClickListener)var9_9);
                                                        var33_45 = var9_9.e;
                                                        if (var33_45 != null) {
                                                            var33_45.setVisibility(0);
                                                        }
                                                        var11_11 = var9_9.c;
                                                        var13_13 = var11_11.n8();
                                                        var19_19 = var11_11.D();
                                                        var11_11 = var11_11.H();
                                                        var16_16 = (int)oo2_0.l(var16_16, (TenantResponse)var13_13, var19_19, (HashSet)var11_11);
                                                        var11_11 = var9_9.f;
                                                        var9_9 = var9_9.d;
                                                        if (var16_16 != 0) {
                                                            if (var33_45 != null) {
                                                                var33_45.setVisibility(var24_24);
                                                            }
                                                            if (var9_9 != null) {
                                                                var9_9.setClickable(false);
                                                            }
                                                            if (var11_11 != null) {
                                                                var11_11.setClickable(false);
                                                            }
                                                            if (var9_9 != null) {
                                                                ai0_2.B((View)var9_9);
                                                                break;
                                                            }
                                                        } else {
                                                            if (var9_9 != null) {
                                                                var9_9.setClickable((boolean)var7_7);
                                                            }
                                                            if (var11_11 != null) {
                                                                var11_11.setClickable((boolean)var7_7);
                                                            }
                                                            if (var9_9 != null) {
                                                                ai0_2.i((View)var9_9);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break block225;
                                                }
                                                case 33: {
                                                    var16_16 = var9_9 instanceof as2_2;
                                                    if (var16_16 != 0) {
                                                        var10_10 = this.c;
                                                        var33_46 = ((qq2_2)var10_10.get((int)var2_2)).c;
                                                        if (var33_46 != null && (var16_16 = var33_46 instanceof InternalWalletDataHolder) != 0) {
                                                            var9_9 = (as2_2)var9_9;
                                                            var33_46 = (InternalWalletDataHolder)var33_46;
                                                            var9_9.getClass();
                                                            Intrinsics.checkNotNullParameter(var33_46, (String)var31_34);
                                                            var16_16 = (int)var33_46.isDisable();
                                                            var11_11 = var9_9.f;
                                                            var30_31 = var9_9.c;
                                                            var20_20 = var9_9.d;
                                                            var23_23 = var9_9.e;
                                                            if (var16_16 != 0) {
                                                                var20_20.setAlpha(var27_27);
                                                                var23_23.setAlpha(var27_27);
                                                                var34_69 = cp_1.Companion;
                                                                var7_7 = (int)km_1.b((cp$a)var34_69);
                                                                if (var7_7 == 0) {
                                                                    var30_31.setVisibility(0);
                                                                } else {
                                                                    var30_31.setVisibility(var24_24);
                                                                }
                                                                var11_11.setOnClickListener(null);
                                                            } else {
                                                                var10_10 = cp_1.Companion;
                                                                var16_16 = (int)km_1.b((cp$a)var10_10);
                                                                if (var16_16 != 0) {
                                                                    var20_20.setAlpha(var27_27);
                                                                    var23_23.setAlpha(var27_27);
                                                                } else {
                                                                    var20_20.setAlpha(var28_28);
                                                                    var23_23.setAlpha(var28_28);
                                                                }
                                                                var30_31.setVisibility(var24_24);
                                                                var10_10 = new hG1((RecyclerView$B)var9_9, var33_46, var7_7);
                                                                var11_11.setOnClickListener((View.OnClickListener)var10_10);
                                                            }
                                                            var34_69 = var33_46.getZeroViewTitle();
                                                            var23_23.setText((CharSequence)var34_69);
                                                            var33_46 = var33_46.getPaymentInstrumentInfo();
                                                            if (var33_46 != null) {
                                                                var33_46 = var33_46.isNew();
                                                                var34_69 = Boolean.TRUE;
                                                                var4_4 = (int)Intrinsics.areEqual(var33_46, var34_69);
                                                            } else {
                                                                var4_4 = 0;
                                                                var35_81 = 0.0f;
                                                                var33_46 = null;
                                                            }
                                                            if (var4_4 == 0) {
                                                                var5_5 = 8;
                                                            }
                                                            var33_46 = var9_9.g;
                                                            var33_46.setVisibility(var5_5);
                                                            break;
                                                        }
                                                    }
                                                    break block225;
                                                }
                                                case 32: {
                                                    var7_7 = var9_9 instanceof ur2_1;
                                                    if (var7_7 != 0) {
                                                        var34_70 = this.c;
                                                        var33_47 = ((qq2_2)var34_70.get((int)var2_2)).c;
                                                        if (var33_47 != null && (var7_7 = var33_47 instanceof InternalWalletDataHolder) != 0) {
                                                            var9_9 = (ur2_1)var9_9;
                                                            var33_47 = (InternalWalletDataHolder)var33_47;
                                                            var9_9.getClass();
                                                            Intrinsics.checkNotNullParameter(var33_47, (String)var31_34);
                                                            var34_70 = var33_47.getPaymentInstrumentInfo();
                                                            if (var34_70 != null) {
                                                                var10_10 = var34_70.getName();
                                                                var11_11 = var9_9.f;
                                                                var11_11.setText((CharSequence)var10_10);
                                                                var10_10 = var34_70.isNew();
                                                                var20_20 = Boolean.TRUE;
                                                                var16_16 = (int)Intrinsics.areEqual(var10_10, var20_20);
                                                                if (var16_16 != 0) {
                                                                    var16_16 = 0;
                                                                    var10_10 = null;
                                                                } else {
                                                                    var16_16 = 8;
                                                                }
                                                                var9_9.g.setVisibility(var16_16);
                                                                var16_16 = (int)var33_47.isDisable();
                                                                var20_20 = var9_9.e;
                                                                var31_34 = var9_9.c;
                                                                var29_29 = var9_9.d;
                                                                if (var16_16 != 0) {
                                                                    var29_29.setAlpha(var27_27);
                                                                    var11_11.setAlpha(var27_27);
                                                                    var10_10 = cp_1.Companion;
                                                                    var16_16 = (int)km_1.b((cp$a)var10_10);
                                                                    if (var16_16 == 0) {
                                                                        var31_34.setVisibility(0);
                                                                    } else {
                                                                        var31_34.setVisibility(var24_24);
                                                                    }
                                                                    var20_20.setOnClickListener(null);
                                                                } else {
                                                                    var6_6 = cp_1.Companion;
                                                                    var5_5 = km_1.b((cp$a)var6_6);
                                                                    if (var5_5 != 0) {
                                                                        var29_29.setAlpha(var27_27);
                                                                        var11_11.setAlpha(var27_27);
                                                                    } else {
                                                                        var29_29.setAlpha(var28_28);
                                                                        var11_11.setAlpha(var28_28);
                                                                    }
                                                                    var31_34.setVisibility(var24_24);
                                                                    var6_6 = new tr2_0((PaymentInstrumentInfo)var34_70, (ur2_1)var9_9);
                                                                    var20_20.setOnClickListener((View.OnClickListener)var6_6);
                                                                }
                                                                var6_6 = var34_70.getErrorLoadingMessage();
                                                                if (var6_6 != null && (var5_5 = var6_6.length()) != 0) {
                                                                    var6_6 = var34_70.getErrorLoadingMessage();
                                                                } else {
                                                                    var5_5 = R$string.internal_wallet_failed;
                                                                    var6_6 = hv3_0.K(var5_5);
                                                                }
                                                                var9_9 = var9_9.h;
                                                                var9_9.setText((CharSequence)var6_6);
                                                                var6_6 = var34_70.getCode();
                                                                var4_4 = (int)var33_47.isDisable();
                                                                if (var6_6 != null) {
                                                                    var7_7 = var6_6.length();
                                                                    if (var7_7 == 0) break;
                                                                    InternalWalletUtil.a.getClass();
                                                                    var34_70 = InternalWalletUtil.e();
                                                                    var7_7 = (int)var34_70.contains(var6_6);
                                                                    if (var7_7 == 0) {
                                                                        var34_70 = InternalWalletUtil.c((String)var6_6);
                                                                        var9_9 = new Bundle();
                                                                        if (var4_4 != 0) {
                                                                            var9_9.putString((String)var34_70, (String)var30_31);
                                                                        } else {
                                                                            var33_47 = "failed";
                                                                            var9_9.putString((String)var34_70, (String)var33_47);
                                                                        }
                                                                        var31_34 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                                        var36_84 = InternalWalletUtil.f((String)var6_6);
                                                                        var37_89 = InternalWalletUtil.d((String)var6_6).concat(var23_23);
                                                                        var29_29 = "single page checkout";
                                                                        var38_91 = "wallet load";
                                                                        var39_94 /* !! */  = var9_9;
                                                                        var31_34.pushCheckoutInteractionsEvent(var38_91, var36_84, var37_89, (String)var29_29, (Bundle)var9_9);
                                                                        var33_47 = InternalWalletUtil.e();
                                                                        var33_47.add(var6_6);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break block225;
                                                }
                                                case 31: {
                                                    var12_12 = var9_9 instanceof Yr2;
                                                    if (var12_12 == 0) break block225;
                                                    var11_11 = this.c;
                                                    var33_48 = ((qq2_2)var11_11.get((int)var2_2)).c;
                                                    if (var33_48 == null || (var12_12 = var33_48 instanceof InternalWalletDataHolder) == 0) break block225;
                                                    var9_9 = (Yr2)var9_9;
                                                    var33_48 = (InternalWalletDataHolder)var33_48;
                                                    var9_9.getClass();
                                                    Intrinsics.checkNotNullParameter(var33_48, (String)var31_34);
                                                    var11_11 = var33_48.getPaymentInstrumentInfo();
                                                    if (var11_11 == null) break block225;
                                                    var31_34 = var11_11.getName();
                                                    var10_10 = var9_9.g;
                                                    var10_10.setText((CharSequence)var31_34);
                                                    var31_34 = hv3_0.K(R$string.radiobutton);
                                                    var37_90 = var11_11.getName();
                                                    var38_92 = " ";
                                                    var31_34 = n1.a((String)var31_34, (String)var38_92, var37_90);
                                                    var37_90 = var9_9.j;
                                                    var37_90.setContentDescription((CharSequence)var31_34);
                                                    var40_99 = R$string.details;
                                                    var31_34 = hv3_0.K(var40_99);
                                                    var6_6 = var11_11.getName();
                                                    var6_6 = n1.a((String)var31_34, (String)var38_92, (String)var6_6);
                                                    var31_34 = var9_9.f;
                                                    var31_34.setContentDescription((CharSequence)var6_6);
                                                    var6_6 = var9_9.c;
                                                    var38_92 = var6_6.H();
                                                    var24_24 = var38_92.size();
                                                    if (var24_24 > var7_7) {
                                                        var38_92 = var11_11.getMultipleWalletEnabledAmount();
                                                        if (var38_92 != null) {
                                                            var41_102 = var38_92.floatValue();
                                                            var24_24 = 0;
                                                            var25_25 = 0.0f;
                                                            var38_92 = null;
                                                        } else {
                                                            var24_24 = 0;
                                                            var25_25 = 0.0f;
                                                            var38_92 = null;
                                                            var41_102 = 0.0f;
                                                        }
                                                        var42_103 = (cfr_temp_0 = var41_102 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                        if (var42_103 <= 0 && (var24_24 = CollectionsKt.F((Iterable)(var38_92 = var6_6.H()), var36_85 /* !! */  = var11_11.getCode())) != 0) {
                                                            var38_92 = var6_6.H();
                                                            var36_85 /* !! */  = var11_11.getCode();
                                                            TypeIntrinsics.asMutableCollection(var38_92).remove(var36_85 /* !! */ );
                                                            var38_92 = var6_6.j0();
                                                            if (var38_92 != null) {
                                                                var38_92 = var38_92.getMultipleWalletEnabledAmountMessage();
                                                            } else {
                                                                var24_24 = 0;
                                                                var38_92 = null;
                                                                var25_25 = 0.0f;
                                                            }
                                                            if (var38_92 != null && (var26_26 = var38_92.length()) != 0) {
                                                                ig0_0.Companion.getClass();
                                                                AJIOApplication.Companion.getClass();
                                                                var36_85 /* !! */  = AJIOApplication$a.a();
                                                                var7_7 = 12;
                                                                var8_8 = 1.7E-44f;
                                                                ig0_0.b((Context)var36_85 /* !! */ , (String)var38_92, null, var7_7);
                                                            }
                                                        }
                                                    }
                                                    var34_71 = var6_6.H();
                                                    var38_92 = var11_11.getCode();
                                                    var7_7 = CollectionsKt.F((Iterable)var34_71, var38_92);
                                                    var24_24 = 1;
                                                    var25_25 = 1.4E-45f;
                                                    if (var7_7 == var24_24) {
                                                        var7_7 = 1;
                                                        var8_8 = 1.4E-45f;
                                                    } else {
                                                        var7_7 = 0;
                                                        var8_8 = 0.0f;
                                                        var34_71 = null;
                                                    }
                                                    var38_92 = var9_9.e;
                                                    var38_92.setChecked((boolean)var7_7);
                                                    var34_71 = var11_11.isNew();
                                                    var36_85 /* !! */  = Boolean.TRUE;
                                                    var7_7 = (int)Intrinsics.areEqual(var34_71, var36_85 /* !! */ );
                                                    if (var7_7 != 0) {
                                                        var7_7 = 0;
                                                        var8_8 = 0.0f;
                                                        var34_71 = null;
                                                    } else {
                                                        var7_7 = 8;
                                                        var8_8 = 1.1E-44f;
                                                    }
                                                    var9_9.h.setVisibility(var7_7);
                                                    var34_71 = InternalWalletUtil.a;
                                                    var36_85 /* !! */  = var6_6.H();
                                                    var34_71.getClass();
                                                    var8_8 = InternalWalletUtil.b((PaymentInstrumentInfo)var11_11, (HashSet)var36_85 /* !! */ );
                                                    var26_26 = (int)var33_48.isDisable();
                                                    var13_13 = var9_9.d;
                                                    if (var26_26 != 0) {
                                                        var26_26 = 1065353216;
                                                        var27_27 = 1.0f;
                                                        var38_92.setAlpha(var27_27);
                                                        var10_10.setAlpha(var27_27);
                                                        var10_10 = cp_1.Companion;
                                                        var16_16 = (int)km_1.b((cp$a)var10_10);
                                                        if (var16_16 == 0) {
                                                            var16_16 = 0;
                                                            var10_10 = null;
                                                            var13_13.setVisibility(0);
lbl539:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var16_16 = 8;
                                                        var13_13.setVisibility(var16_16);
                                                        ** continue;
                                                        var26_26 = 0;
                                                        var27_27 = 0.0f;
                                                        var36_85 /* !! */  = null;
                                                        var31_34.setOnClickListener(null);
                                                        var37_90.setOnClickListener(null);
                                                    } else {
                                                        var26_26 = 0;
                                                        var27_27 = 0.0f;
                                                        var36_85 /* !! */  = null;
                                                        var43_104 = false;
                                                        var39_95 = null;
                                                        cfr_temp_1 = var8_8 - 0.0f;
                                                        var44_107 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                        if (var44_107 /* !! */  <= 0 && !(var43_104 = km_1.b((cp$a)(var39_95 = cp_1.Companion)))) {
                                                            var36_85 /* !! */  = null;
                                                            var38_92.setChecked(false);
                                                            var26_26 = 0x3F000000;
                                                            var27_27 = 0.5f;
                                                            var38_92.setAlpha(var27_27);
                                                            var10_10.setAlpha(var27_27);
                                                            var10_10 = null;
                                                            var37_90.setOnClickListener(null);
                                                            var16_16 = 8;
                                                            var24_24 = 1;
                                                            var25_25 = 1.4E-45f;
                                                        } else {
                                                            var26_26 = 1065353216;
                                                            var27_27 = 1.0f;
                                                            var38_92.setAlpha(var27_27);
                                                            var10_10.setAlpha(var27_27);
                                                            var24_24 = 1;
                                                            var25_25 = 1.4E-45f;
                                                            var10_10 = new eg1_0(var24_24, var9_9, var11_11);
                                                            var37_90.setOnClickListener((View.OnClickListener)var10_10);
                                                            var16_16 = 8;
                                                        }
                                                        var13_13.setVisibility(var16_16);
                                                        var10_10 = new fg1_0(var24_24, var9_9, var11_11);
                                                        var31_34.setOnClickListener((View.OnClickListener)var10_10);
                                                    }
                                                    var10_10 = var9_9.k;
                                                    ai0_2.i((View)var10_10);
                                                    var13_13 = "AJIO_CASH_WALLET";
                                                    var31_34 = var11_11.getCode();
                                                    var17_17 = Intrinsics.areEqual(var13_13, var31_34);
                                                    if (var17_17 != 0 && (var17_17 = (cfr_temp_2 = (var45_108 = var11_11.getGiftCardAmount()) - (var47_109 = 0.0)) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1)) > 0) {
                                                        var13_13 = StringCompanionObject.INSTANCE;
                                                        var17_17 = R$string.ajio_gift_card_redemption_text;
                                                        var13_13 = hv3_0.K(var17_17);
                                                        var45_108 = var11_11.getGiftCardAmount();
                                                        var40_99 = ok1_1.a(var45_108);
                                                        var49_110 = var40_99;
                                                        var31_34 = qz2_0.x(Float.valueOf(var49_110));
                                                        var24_24 = 1;
                                                        var25_25 = 1.4E-45f;
                                                        var36_85 /* !! */  = new Object[var24_24];
                                                        var28_28 = 0.0f;
                                                        var37_90 = null;
                                                        var36_85 /* !! */ [0] = var31_34;
                                                        zn0_1.b(var36_85 /* !! */ , var24_24, (String)var13_13, (String)var29_29, (TextView)var10_10);
                                                        ai0_2.B((View)var10_10);
                                                    }
                                                    if ((var10_10 = var11_11.getAvailableAmount()) != null) {
                                                        var25_25 = var10_10.floatValue();
                                                    } else {
                                                        var24_24 = 0;
                                                        var25_25 = 0.0f;
                                                        var38_92 = null;
                                                    }
                                                    var10_10 = var11_11.getCode();
                                                    var16_16 = (int)Intrinsics.areEqual("RELIANCE_ONE_WALLET", var10_10);
                                                    var13_13 = "getRsFormattedString(...)";
                                                    if (var16_16 == 0) ** GOTO lbl655
                                                    var5_5 = (int)CollectionsKt.F((Iterable)(var6_6 = var6_6.H()), var10_10 = var11_11.getCode());
                                                    if (var5_5 != 0) ** GOTO lbl-1000
                                                    var6_6 = h40_0.a;
                                                    var5_5 = (int)h40_0.h1();
                                                    if (var5_5 == 0) {
                                                        var6_6 = hv3_0.K(R$string.internal_wallet_balance);
                                                        var34_71 = kq2_1.a(var25_25);
                                                        Intrinsics.checkNotNullExpressionValue(var34_71, (String)var13_13);
                                                        var10_10 = FontsManager.getInstance();
                                                        AJIOApplication.Companion.getClass();
                                                        var13_13 = AJIOApplication$a.a();
                                                        var40_99 = 10;
                                                        var49_110 = 1.4E-44f;
                                                        var10_10 = var10_10.getTypefaceWithFont((Context)var13_13, var40_99);
                                                        Intrinsics.checkNotNullExpressionValue(var10_10, "getTypefaceWithFont(...)");
                                                        var13_13 = StringCompanionObject.INSTANCE;
                                                        var17_17 = 1;
                                                        var31_34 = new Object[var17_17];
                                                        var24_24 = 0;
                                                        var25_25 = 0.0f;
                                                        var38_92 = null;
                                                        var31_34[0] = var34_71;
                                                        var6_6 = xh2_0.a((Object[])var31_34, var17_17, (String)var6_6, (String)var29_29);
                                                        var34_71 = "is ";
                                                        var17_17 = 6;
                                                        var18_18 = 8.4E-45f;
                                                        var7_7 = StringsKt.O((CharSequence)var6_6, (String)var34_71, 0, false, var17_17);
                                                        var13_13 = new SpannableStringBuilder((CharSequence)var6_6);
                                                        var31_34 = new AjioCustomTypefaceSpan((String)var20_20, (Typeface)var10_10);
                                                        var5_5 = var6_6.length();
                                                        var16_16 = 34;
                                                        var13_13.setSpan(var31_34, var7_7 += 3, var5_5, var16_16);
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var5_5 = R$string.internal_wallet_eligible;
                                                        var6_6 = hv3_0.K(var5_5);
                                                        var34_71 = kq2_1.a(var8_8);
                                                        Intrinsics.checkNotNullExpressionValue(var34_71, (String)var13_13);
                                                        var10_10 = kq2_1.a(var25_25);
                                                        Intrinsics.checkNotNullExpressionValue(var10_10, (String)var13_13);
                                                        var13_13 = Yr2.w((String)var6_6, (String)var34_71, (String)var10_10);
                                                    }
                                                    ** GOTO lbl662
lbl655:
                                                    // 1 sources

                                                    var5_5 = R$string.internal_wallet_eligible;
                                                    var6_6 = hv3_0.K(var5_5);
                                                    var34_71 = kq2_1.a(var8_8);
                                                    Intrinsics.checkNotNullExpressionValue(var34_71, (String)var13_13);
                                                    var10_10 = kq2_1.a(var25_25);
                                                    Intrinsics.checkNotNullExpressionValue(var10_10, (String)var13_13);
                                                    var13_13 = Yr2.w((String)var6_6, (String)var34_71, (String)var10_10);
lbl662:
                                                    // 3 sources

                                                    var9_9.i.setText((CharSequence)var13_13);
                                                    var6_6 = var11_11.getCode();
                                                    var4_4 = (int)var33_48.isDisable();
                                                    var34_71 = var11_11.getAvailableAmount();
                                                    if (var6_6 != null) {
                                                        var50_113 = var6_6.length();
                                                        if (var50_113 == 0) break;
                                                        var9_9 = InternalWalletUtil.e();
                                                        var50_113 = (int)var9_9.contains(var6_6);
                                                        if (var50_113 == 0) {
                                                            var9_9 = InternalWalletUtil.c((String)var6_6);
                                                            var10_10 = new Bundle();
                                                            if (var4_4 != 0) {
                                                                var10_10.putString((String)var9_9, (String)var30_31);
                                                            } else {
                                                                var33_48 = "viewed";
                                                                var10_10.putString((String)var9_9, (String)var33_48);
                                                            }
                                                            var33_48 = var9_9.concat("_cm");
                                                            if (var34_71 != null) {
                                                                var49_110 = var34_71.floatValue();
                                                            } else {
                                                                var40_99 = 0;
                                                                var49_110 = 0.0f;
                                                                var31_34 = null;
                                                            }
                                                            var10_10.putFloat((String)var33_48, var49_110);
                                                            var31_34 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                            var36_85 /* !! */  = InternalWalletUtil.f((String)var6_6);
                                                            var37_90 = InternalWalletUtil.d((String)var6_6).concat(var23_23);
                                                            var29_29 = "single page checkout";
                                                            var38_92 = "wallet load";
                                                            var39_95 = var10_10;
                                                            var31_34.pushCheckoutInteractionsEvent((String)var38_92, (String)var36_85 /* !! */ , var37_90, (String)var29_29, (Bundle)var10_10);
                                                            var33_48 = InternalWalletUtil.e();
                                                            var33_48.add(var6_6);
                                                            break;
                                                        }
                                                    }
                                                    break block225;
                                                }
                                            }
                                            break block225;
                                        }
                                        case 13: {
                                            var9_9.a = var2_2;
                                            var4_4 = var9_9 instanceof ir2_2;
                                            if (var4_4 == 0) break block225;
                                            var9_9 = (ir2_2)var9_9;
                                            var33_49 /* !! */  = this.d;
                                            if (var33_49 /* !! */  != null) {
                                                var33_49 /* !! */  = var33_49 /* !! */ .getCashOnDeliveryInformation();
                                            } else {
                                                var4_4 = 0;
                                                var35_82 = 0.0f;
                                                var33_49 /* !! */  = null;
                                            }
                                            var6_6 = var3_3.d;
                                            if (var6_6 != null) {
                                                var6_6 = var6_6.getPaymentMessage();
                                            } else {
                                                var5_5 = 0;
                                                var6_6 = null;
                                            }
                                            var34_72 = var9_9.c;
                                            var10_10 = var34_72.n8();
                                            var11_11 = var34_72.c2();
                                            var13_13 = var9_9.k;
                                            var13_13.b = var11_11;
                                            var11_11 = var9_9.g;
                                            if (var33_49 /* !! */  != null && (var14_14 = (int)Intrinsics.areEqual(var30_32 = var33_49 /* !! */ .isEligible(), var20_20 = Boolean.TRUE)) == 0 && (var14_14 = (int)TextUtils.isEmpty((CharSequence)(var30_32 = var33_49 /* !! */ .getReason()))) == 0) {
                                                if (var11_11 != null) {
                                                    var16_16 = 0;
                                                    var10_10 = null;
                                                    var11_11.setVisibility(0);
                                                }
                                                var10_10 = AnalyticsManager.Companion.getInstance().getGa();
                                                var30_32 = "CODdisabled_seen";
                                                var20_20 = "COD option Disabled";
                                                var10_10.trackBannerImpressionEvent((String)var30_32, (String)var20_20);
                                                if (var11_11 != null) {
                                                    var10_10 = var33_49 /* !! */ .getReason();
                                                    var11_11.setText((CharSequence)var10_10);
                                                }
                                            } else {
                                                if (var10_10 != null && (var30_32 = var10_10.getFraudEngineResponseDetails()) != null && (var30_32 = var30_32.getResult()) != null && (var30_32 = var30_32.getOutcomeWithoutPayment()) != null) {
                                                    var30_32 = var30_32.getAction();
                                                } else {
                                                    var14_14 = 0;
                                                    var19_19 = 0.0f;
                                                    var30_32 = null;
                                                }
                                                var20_20 = "COD_BLOCK";
                                                var14_14 = (int)var20_20.equalsIgnoreCase((String)var30_32);
                                                var31_35 = "Fraud COD Block";
                                                var38_93 = "COD_Block_";
                                                if (var14_14 != 0) {
                                                    if (var11_11 != null) {
                                                        var14_14 = 0;
                                                        var19_19 = 0.0f;
                                                        var30_32 = null;
                                                        var11_11.setVisibility(0);
                                                    }
                                                    if (var10_10 != null && (var30_32 = var10_10.getFraudEngineResponseDetails()) != null && (var30_32 = var30_32.getResult()) != null && (var30_32 = var30_32.getOutcomeWithoutPayment()) != null) {
                                                        var30_32 = var30_32.getMessage();
                                                    } else {
                                                        var14_14 = 0;
                                                        var19_19 = 0.0f;
                                                        var30_32 = null;
                                                    }
                                                    if (var11_11 != null) {
                                                        var11_11.setText((CharSequence)var30_32);
                                                    }
                                                    if (var10_10 != null && (var30_32 = var10_10.getCartRequest()) != null) {
                                                        var30_32 = var30_32.getCartId();
                                                    } else {
                                                        var14_14 = 0;
                                                        var19_19 = 0.0f;
                                                        var30_32 = null;
                                                    }
                                                    if (var30_32 != null) {
                                                        if ((var10_10 = var10_10.getCartRequest()) != null) {
                                                            var10_10 = var10_10.getCartId();
                                                        } else {
                                                            var16_16 = 0;
                                                            var10_10 = null;
                                                        }
                                                        var10_10 = kp1_0.c(var38_93, (String)var10_10);
                                                        var30_32 = AnalyticsManager.Companion.getInstance().getGa();
                                                        var30_32.trackBannerImpressionEvent((String)var31_35, (String)var10_10);
                                                    }
                                                } else {
                                                    if (var10_10 != null && (var30_32 = var10_10.getFraudEngineResponseDetails()) != null && (var30_32 = var30_32.getResult()) != null && (var30_32 = var30_32.getCOD()) != null) {
                                                        var30_32 = var30_32.getAction();
                                                    } else {
                                                        var14_14 = 0;
                                                        var19_19 = 0.0f;
                                                        var30_32 = null;
                                                    }
                                                    var14_14 = (int)var20_20.equalsIgnoreCase((String)var30_32);
                                                    if (var14_14 != 0) {
                                                        if (var11_11 != null) {
                                                            var14_14 = 0;
                                                            var19_19 = 0.0f;
                                                            var30_32 = null;
                                                            var11_11.setVisibility(0);
                                                        }
                                                        if (var10_10 != null && (var30_32 = var10_10.getFraudEngineResponseDetails()) != null && (var30_32 = var30_32.getResult()) != null && (var30_32 = var30_32.getCOD()) != null) {
                                                            var30_32 = var30_32.getMessage();
                                                        } else {
                                                            var14_14 = 0;
                                                            var19_19 = 0.0f;
                                                            var30_32 = null;
                                                        }
                                                        if (var11_11 != null) {
                                                            var11_11.setText((CharSequence)var30_32);
                                                        }
                                                        if (var10_10 != null && (var30_32 = var10_10.getCartRequest()) != null) {
                                                            var30_32 = var30_32.getCartId();
                                                        } else {
                                                            var14_14 = 0;
                                                            var19_19 = 0.0f;
                                                            var30_32 = null;
                                                        }
                                                        if (var30_32 != null) {
                                                            if ((var10_10 = var10_10.getCartRequest()) != null) {
                                                                var10_10 = var10_10.getCartId();
                                                            } else {
                                                                var16_16 = 0;
                                                                var10_10 = null;
                                                            }
                                                            var10_10 = kp1_0.c(var38_93, (String)var10_10);
                                                            var30_32 = AnalyticsManager.Companion.getInstance().getGa();
                                                            var30_32.trackBannerImpressionEvent((String)var31_35, (String)var10_10);
                                                        }
                                                    }
                                                }
                                            }
                                            if (var33_49 /* !! */  == null || (var4_4 = Intrinsics.areEqual(var33_49 /* !! */  = var33_49 /* !! */ .isEligible(), var10_10 = Boolean.TRUE)) == 0) ** GOTO lbl-1000
                                            var33_49 /* !! */  = z40_0.Companion;
                                            var33_49 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var33_49 /* !! */ ).a;
                                            var10_10 = "isCodMessageEnable";
                                            var4_4 = (int)var33_49 /* !! */ .a((String)var10_10);
                                            if (var4_4 != 0 && (var4_4 = (int)TextUtils.isEmpty((CharSequence)var6_6)) == 0) {
                                                if (var11_11 != null) {
                                                    var4_4 = 0;
                                                    var35_82 = 0.0f;
                                                    var33_49 /* !! */  = null;
                                                    var11_11.setVisibility(0);
                                                }
                                                if (var11_11 != null) {
                                                    var33_49 /* !! */  = "#666666";
                                                    var4_4 = Color.parseColor((String)var33_49 /* !! */ );
                                                    var11_11.setTextColor(var4_4);
                                                }
                                                if (var11_11 != null) {
                                                    var11_11.setText((CharSequence)var6_6);
                                                }
                                                while (true) {
                                                    var4_4 = 8;
                                                    var35_82 = 1.1E-44f;
                                                    break;
                                                }
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                if (var11_11 == null) ** continue;
                                                var4_4 = 8;
                                                var35_82 = 1.1E-44f;
                                                var11_11.setVisibility(var4_4);
                                            }
                                            var6_6 = var34_72.A();
                                            var5_5 = var6_6.d();
                                            if (var5_5 != 0) {
                                                var6_6 = var9_9.h;
                                                if (var6_6 != null) {
                                                    var6_6.setVisibility(var4_4);
                                                }
                                                if ((var33_49 /* !! */  = var34_72.c2()) != null && (var33_49 /* !! */  = var33_49 /* !! */ .getPriceSplitup()) != null && (var33_49 /* !! */  = var33_49 /* !! */ .getConvenienceFee()) != null && (var33_49 /* !! */  = var33_49 /* !! */ .getCOD()) != null) {
                                                    var35_82 = var33_49 /* !! */ .getNetAmount();
                                                    var10_10 = var34_72.A();
                                                    if (var10_10 != null) {
                                                        var16_16 = (int)var10_10.d();
                                                        var12_12 = 1;
                                                        var32_41 = 1.4E-45f;
                                                        if (var16_16 == var12_12) {
                                                            var10_10 = null;
                                                            cfr_temp_3 = var35_82 - 0.0f;
                                                            var16_16 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                                                            if (var16_16 > 0) {
                                                                if (var6_6 != null) {
                                                                    var16_16 = 0;
                                                                    var10_10 = null;
                                                                    var6_6.setVisibility(0);
                                                                }
                                                                var5_5 = (int)og1_1.c();
                                                                var10_10 = var9_9.j;
                                                                if (var5_5 != 0) {
                                                                    if (var10_10 != null) {
                                                                        var6_6 = hv3_0.a;
                                                                        var11_11 = var34_72.A().a();
                                                                        var6_6.getClass();
                                                                        hv3_0.a0((AjioTextView)var10_10, (String)var11_11);
                                                                    }
                                                                } else if (var10_10 != null) {
                                                                    var6_6 = var34_72.A().a();
                                                                    var10_10.setText((CharSequence)var6_6);
                                                                }
                                                                if ((var6_6 = var34_72.A().b) != null) {
                                                                    var6_6 = var6_6.getCodExtraDeliveryText();
                                                                } else {
                                                                    var5_5 = 0;
                                                                    var6_6 = null;
                                                                }
                                                                if (var6_6 != null && (var11_11 = var9_9.i) != null) {
                                                                    var30_32 = StringCompanionObject.INSTANCE;
                                                                    var33_49 /* !! */  = qz2_0.u(var35_82);
                                                                    var14_14 = 1;
                                                                    var19_19 = 1.4E-45f;
                                                                    var20_20 = new Object[var14_14];
                                                                    var40_100 = false;
                                                                    var49_111 = 0.0f;
                                                                    var31_35 = null;
                                                                    var20_20[0] = var33_49 /* !! */ ;
                                                                    var33_49 /* !! */  = Arrays.copyOf(var20_20, var14_14);
                                                                    var33_49 /* !! */  = String.format((String)var6_6, (Object[])var33_49 /* !! */ );
                                                                    Intrinsics.checkNotNullExpressionValue(var33_49 /* !! */ , (String)var29_29);
                                                                    var33_49 /* !! */  = hv3_0.f((String)var33_49 /* !! */ );
                                                                    var11_11.setText((CharSequence)var33_49 /* !! */ );
                                                                }
                                                                if (var10_10 != null) {
                                                                    var33_49 /* !! */  = new fr2_2((ir2_2)var9_9);
                                                                    var10_10.setOnClickListener((View.OnClickListener)var33_49 /* !! */ );
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var36_86 = var34_72.n8();
                                            var28_28 = var34_72.D();
                                            var29_29 = var34_72.H();
                                            var31_35 = var9_9.e;
                                            Intrinsics.checkNotNullParameter(var31_35, var23_23);
                                            var39_96 = Boolean.FALSE;
                                            var33_49 /* !! */  = var13_13.a;
                                            var33_49 /* !! */ .getClass();
                                            var24_24 = 13;
                                            var25_25 = 1.8E-44f;
                                            eo2_0.a((ToggleButton)var31_35, var24_24, var36_86, var28_28, (HashSet)var29_29, var39_96);
                                            break;
                                        }
                                        case 12: {
                                            this.i = var2_2;
                                            var9_9.a = var2_2;
                                            var4_4 = var9_9 instanceof ss2_2;
                                            if (var4_4 == 0) break block225;
                                            var9_9 = (ss2_2)var9_9;
                                            var33_50 = oo2_0.a;
                                            var6_6 = this.d;
                                            var33_50.getClass();
                                            var33_50 = oo2_0.c("UPI", (PaymentInstruments)var6_6);
                                            var34_73 = this.d;
                                            var6_6 = oo2_0.c("SAVED_UPI", (PaymentInstruments)var34_73);
                                            var7_7 = (int)this.j;
                                            var9_9.w((PaymentInstrumentType)var33_50, (PaymentInstrumentType)var6_6, (boolean)var7_7);
                                            var33_50 = var9_9.c;
                                            var6_6 = var33_50.n8();
                                            var8_8 = var33_50.D();
                                            var33_50 = var33_50.H();
                                            var16_16 = 12;
                                            var4_4 = (int)oo2_0.l(var16_16, (TenantResponse)var6_6, var8_8, (HashSet)var33_50);
                                            var6_6 = var9_9.j;
                                            var34_73 = var9_9.h;
                                            if (var4_4 != 0) ** GOTO lbl-1000
                                            var33_50 = var9_9.s;
                                            if (var33_50 != null) {
                                                var33_50 = var33_50.getPaymentInstrumentDisabled();
                                                var10_10 = Boolean.TRUE;
                                                var4_4 = (int)Intrinsics.areEqual(var33_50, var10_10);
                                            } else {
                                                var4_4 = 0;
                                                var35_83 = 0.0f;
                                                var33_50 = null;
                                            }
                                            if (var4_4 == 0) {
                                                var4_4 = 1;
                                                var6_6.setClickable((boolean)var4_4);
                                                var6_6.setEnabled((boolean)var4_4);
                                                var6_6 = var6_6.getBackground();
                                                var16_16 = 0;
                                                var10_10 = null;
                                                var6_6.setColorFilter(null);
                                                var34_73.setClickable((boolean)var4_4);
                                                var34_73.setEnabled((boolean)var4_4);
                                                var33_50 = var34_73.getBackground();
                                                var33_50.setColorFilter(null);
                                                var4_4 = 1065353216;
                                                var35_83 = 1.0f;
                                                var34_73.setAlpha(var35_83);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_4 = 0;
                                                var35_83 = 0.0f;
                                                var33_50 = null;
                                                var6_6.setClickable(false);
                                                var6_6.setEnabled(false);
                                                var34_73.setClickable(false);
                                                var34_73.setEnabled(false);
                                                var35_83 = 0.5f;
                                                var34_73.setAlpha(var35_83);
                                                var4_4 = (int)var34_73.isChecked();
                                                if (var4_4 != 0) {
                                                    var34_73.toggle();
                                                }
                                            }
                                            var33_50 = var9_9.i.getText();
                                            if (var33_50 != null && (var33_50 = var33_50.toString()) != null) {
                                                var4_4 = var33_50.length();
                                            } else {
                                                var4_4 = 0;
                                                var35_83 = 0.0f;
                                                var33_50 = null;
                                            }
                                            if (var4_4 > 0) {
                                                var33_50 = var9_9.k;
                                                var5_5 = 0;
                                                var6_6 = null;
                                                var33_50.setVisibility(0);
                                                break;
                                            }
                                            break block225;
                                        }
                                        case 11: {
                                            var9_9.a = var2_2;
                                            var33_51 /* !! */  = oo2_0.a;
                                            var6_6 = this.d;
                                            var33_51 /* !! */ .getClass();
                                            var33_51 /* !! */  = oo2_0.c("WALLET", (PaymentInstruments)var6_6);
                                            var5_5 = var9_9 instanceof ks2_1;
                                            if (var5_5 != 0) {
                                                var9_9 = (ks2_1)var9_9;
                                                var6_6 = var9_9.f;
                                                var6_6.f = var33_51 /* !! */ ;
                                                var34_74 = var6_6.d;
                                                if (var33_51 /* !! */  != null) {
                                                    var33_51 /* !! */  = var33_51 /* !! */ .getPaymentInstrumentsInfo();
                                                    var11_11 = var6_6.a;
                                                    var13_13 = var6_6.e;
                                                    var6_6.g = var10_10 = new te3_2((Context)var11_11, (ArrayList)var33_51 /* !! */ , (xe3_1)var13_13, var34_74);
                                                    var10_10.e = var4_4 = var6_6.i;
                                                    var33_51 /* !! */  = var6_6.c;
                                                    var33_51 /* !! */ .setAdapter((ListAdapter)var10_10);
                                                }
                                                var31_36 = var9_9.d;
                                                Intrinsics.checkNotNullParameter(var31_36, var23_23);
                                                var36_87 = var34_74.n8();
                                                var28_28 = var34_74.D();
                                                var29_29 = var34_74.H();
                                                var33_51 /* !! */  = var6_6.f;
                                                if (var33_51 /* !! */  != null) {
                                                    var39_97 = var13_13 = var33_51 /* !! */ .getPaymentInstrumentDisabled();
                                                } else {
                                                    var43_105 = false;
                                                    var39_97 = null;
                                                }
                                                var33_51 /* !! */  = var6_6.h;
                                                var33_51 /* !! */ .getClass();
                                                var24_24 = 11;
                                                var25_25 = 1.5E-44f;
                                                eo2_0.a(var31_36, var24_24, var36_87, var28_28, (HashSet)var29_29, (Boolean)var39_97);
                                                break;
                                            }
                                            break block225;
                                        }
                                    }
                                    break block225;
                                }
                                case 9: {
                                    var6_6 = oo2_0.a;
                                    var34_75 = this.d;
                                    var6_6.getClass();
                                    var6_6 = oo2_0.c("NET_BANKING", (PaymentInstruments)var34_75);
                                    if (var6_6 != null) {
                                        var34_75 = var6_6.getPaymentInstrumentsInfo();
                                    } else {
                                        var7_7 = 0;
                                        var8_8 = 0.0f;
                                        var34_75 = null;
                                    }
                                    if (var34_75 != null) {
                                        var9_9.a = var4_4;
                                        var4_4 = var9_9 instanceof ds2_2;
                                        if (var4_4 != 0) {
                                            var9_9 = (ds2_2)var9_9;
                                            var33_52 = var6_6.getPaymentInstrumentsInfo();
                                            var34_75 = var9_9.h;
                                            var34_75.b((List)var33_52, (PaymentInstrumentType)var6_6);
                                            var36_88 = var9_9.c.n8();
                                            var31_37 = var9_9.e;
                                            Intrinsics.checkNotNullParameter(var31_37, var23_23);
                                            var33_52 = var34_75.d;
                                            var28_28 = var33_52.D();
                                            var29_30 = var33_52.H();
                                            var33_52 = var34_75.l;
                                            if (var33_52 != null) {
                                                var39_98 = var13_13 = var33_52.getPaymentInstrumentDisabled();
                                            } else {
                                                var43_106 = false;
                                                var39_98 = null;
                                            }
                                            var33_52 = var34_75.g;
                                            var33_52.getClass();
                                            var24_24 = 9;
                                            var25_25 = 1.3E-44f;
                                            eo2_0.a(var31_37, var24_24, var36_88, var28_28, var29_30, (Boolean)var39_98);
                                            break block0;
                                        }
                                    }
                                    break block225;
                                }
                                case 8: {
                                    var9_9.a = var2_2;
                                    var33_53 = oo2_0.a;
                                    var6_6 = this.d;
                                    var33_53.getClass();
                                    var33_53 = oo2_0.c("CARD", (PaymentInstruments)var6_6);
                                    var5_5 = var9_9 instanceof or2_0;
                                    if (var5_5 != 0) {
                                        var9_9 = (or2_0)var9_9;
                                        var9_9.m = var33_53;
                                        var33_53 = new ArrayList();
                                        var6_6 = var9_9.f;
                                        var33_53.add(var6_6);
                                        var34_76 = var9_9.j;
                                        var33_53.add(var34_76);
                                        var34_76 = var9_9.m;
                                        var11_11 = var9_9.e;
                                        var11_11.getClass();
                                        var13_13 = "viewList";
                                        Intrinsics.checkNotNullParameter(var33_53, (String)var13_13);
                                        var30_33 = var11_11.d;
                                        var20_20 = var30_33.n8();
                                        var22_22 = var30_33.D();
                                        var30_33 = var30_33.H();
                                        if (var34_76 != null) {
                                            var34_76 = var34_76.getPaymentInstrumentDisabled();
                                        } else {
                                            var7_7 = 0;
                                            var8_8 = 0.0f;
                                            var34_76 = null;
                                        }
                                        var11_11 = var11_11.f;
                                        var11_11.getClass();
                                        Intrinsics.checkNotNullParameter(var33_53, (String)var13_13);
                                        var32_42 = 1.1E-44f;
                                        var12_12 = (int)oo2_0.l(8, (TenantResponse)var20_20, var22_22, (HashSet)var30_33);
                                        if (var12_12 == 0 && (var7_7 = (int)Intrinsics.areEqual(var34_76, var11_11 = Boolean.TRUE)) == 0) {
                                            var33_53 = var33_53.iterator();
                                            while ((var7_7 = var33_53.hasNext()) != 0) {
                                                var34_76 = (View)var33_53.next();
                                                var12_12 = 1;
                                                var34_76.setClickable((boolean)var12_12);
                                                var34_76.setEnabled((boolean)var12_12);
                                                var12_12 = 1065353216;
                                                var32_42 = 1.0f;
                                                var34_76.setAlpha(var32_42);
                                            }
                                        } else {
                                            var33_53 = var33_53.iterator();
                                            while ((var7_7 = (int)var33_53.hasNext()) != 0) {
                                                var34_76 = (View)var33_53.next();
                                                var11_11 = null;
                                                var34_76.setClickable(false);
                                                var34_76.setEnabled(false);
                                                var12_12 = 0x3F000000;
                                                var32_42 = 0.5f;
                                                var34_76.setAlpha(var32_42);
                                            }
                                            if (var6_6 != null) {
                                                var4_4 = var6_6.isChecked();
                                                var7_7 = 1;
                                                var8_8 = 1.4E-45f;
                                                if (var4_4 == var7_7) {
                                                    var6_6.toggle();
                                                }
                                            }
                                        }
                                        var6_6.setSpanText();
                                        var33_53 = oo2_0.a;
                                        var6_6 = var3_3.d;
                                        var33_53.getClass();
                                        var33_53 = oo2_0.c("SAVED_CARD", (PaymentInstruments)var6_6);
                                        var9_9.x((qq2_2)var10_10, (PaymentInstrumentType)var33_53);
                                        break block0;
                                    }
                                    break block225;
                                }
                                case 7: {
                                    var16_16 = 0;
                                    var10_10 = null;
                                    var33_54 = oo2_0.a;
                                    var6_6 = this.d;
                                    var33_54.getClass();
                                    var33_54 = oo2_0.c("INTERNAL_WALLET", (PaymentInstruments)var6_6);
                                    if (var33_54 != null) {
                                        var13_13 = var33_54.getPaymentInstrumentsInfo();
                                    } else {
                                        var17_17 = 0;
                                        var18_18 = 0.0f;
                                        var13_13 = null;
                                    }
                                    if (var13_13 != null && (var5_5 = var13_13.isEmpty()) == 0) {
                                        var7_7 = 0;
                                        var8_8 = 0.0f;
                                        var34_77 = null;
                                    }
                                    if (var7_7 == 0 && var33_54 != null && (var33_54 = var33_54.getPaymentInstrumentsInfo()) != null) {
                                        var5_5 = 0;
                                        var6_6 = null;
                                        if ((var33_54 = (PaymentInstrumentInfo)var33_54.get(0)) != null) {
                                            var9_9 = (ao2_0)var9_9;
                                            if ((var33_54 = var33_54.getEarn()) != null) {
                                                var49_112 = var33_54.floatValue();
                                            } else {
                                                var40_101 = false;
                                                var49_112 = 0.0f;
                                                var31_38 = null;
                                            }
                                            var9_9.w(var49_112);
                                            break block0;
                                        }
                                    }
                                    break block225;
                                }
                                case 6: {
                                    var9_9 = (jo2_2)var9_9;
                                    var33_55 = var10_10.b;
                                    var9_9.getClass();
                                    var4_4 = (int)TextUtils.isEmpty((CharSequence)var33_55);
                                    if (var4_4 != 0) {
                                        throw null;
                                    }
                                    throw null;
                                }
                            }
lbl1183:
                            // 1 sources

                            var5_5 = var9_9 instanceof vr2_2;
                            if (var5_5 != 0) {
                                var6_6 = this.c;
                                var33_56 = ((qq2_2)var6_6.get((int)var2_2)).c;
                                if (var33_56 != null && (var5_5 = var33_56 instanceof InternalWalletDataHolder) != 0) {
                                    var9_9 = (vr2_2)var9_9;
                                    var33_56 = (InternalWalletDataHolder)var33_56;
                                    var33_56 = var9_9.b;
                                    var5_5 = 0;
                                    var6_6 = null;
                                    var33_56.setVisibility(0);
                                    break;
                                }
                            }
                            break block225;
lbl1196:
                            // 1 sources

                            var9_9 = (xz_2)var9_9;
                            var33_57 = var10_10.b;
                            var6_6 = var9_9.b;
                            var6_6.setText((CharSequence)var33_57);
                            break;
lbl1201:
                            // 1 sources

                            var9_9 = (as3_0)var9_9;
                            var33_58 = var10_10.b;
                            var6_6 = var9_9.b;
                            var6_6.setText((CharSequence)var33_58);
                            break;
lbl1206:
                            // 1 sources

                            var9_9 = (fo2_1)var9_9;
                            var33_59 = var10_10.b;
                            var9_9.getClass();
                            var4_4 = (int)TextUtils.isEmpty((CharSequence)var33_59);
                            if (var4_4 != 0) {
                                throw null;
                            }
                            throw null;
lbl1214:
                            // 1 sources

                            var9_9 = (ns2_2)var9_9;
                            var33_60 = var10_10.b;
                            var6_6 = var9_9.b;
                            var7_7 = (int)TextUtils.isEmpty((CharSequence)var33_60);
                            if (var7_7 != 0) {
                                var6_6.setText((CharSequence)var20_20);
                                break;
                            }
                            var6_6.setText((CharSequence)var33_60);
                            break;
lbl1223:
                            // 1 sources

                            var5_5 = 0;
                            var6_6 = null;
                            var34_78 = var9_9;
                            var34_78 = (jq2_2)var9_9;
                            var10_10 = this.d;
                            if (var10_10 != null) {
                                var13_13 = var10_10.getBanners();
                            } else {
                                var17_17 = 0;
                                var13_13 = null;
                                var18_18 = 0.0f;
                            }
                            var34_78.w((List)var13_13);
                            var9_9.a = var4_4;
                            break;
                        }
                        case 20: {
                            var9_9 = (wt_0)var9_9;
                            var33_61 = var11_11.c;
                            var6_6 = (Serializable)var11_11.d;
                            var9_9.w(var33_61, (Serializable)var6_6);
                            break;
                        }
                        case 19: {
                            this.n = var2_2;
                            var9_9 = (ST)var9_9;
                            var9_9.w((qq2_2)var11_11);
                            break;
                        }
                        case 18: {
                            var4_4 = (int)h40_0.Q1();
                            if (var4_4 != 0) {
                                var9_9 = (rt_1)var9_9;
                                var33_62 = var11_11.c;
                                var6_6 = (Serializable)var11_11.d;
                                var9_9.x(var33_62, (Serializable)var6_6);
                                break;
                            }
                            var9_9 = (rt_1)var9_9;
                            var33_63 = var11_11.c;
                            var6_6 = (Serializable)var11_11.d;
                            var9_9.x(var33_63, (Serializable)var6_6);
                            break;
                        }
                        case 17: {
                            var4_4 = var9_9 instanceof mt_1;
                            if (var4_4 != 0) {
                                var9_9 = (mt_1)var9_9;
                                var33_64 = var11_11.c;
                                var9_9.w(var33_64);
                                break;
                            }
                            var4_4 = var9_9 instanceof nt_1;
                            if (var4_4 != 0) {
                                var9_9 = (nt_1)var9_9;
                                var33_65 = var11_11.c;
                                var9_9.w(var33_65);
                                break;
                            }
                            break block225;
                        }
                    }
                    break block225;
                }
                var9_9 = (YS$a)var9_9;
                var33_66 = var9_9.g;
                var6_6 = hv3_0.u(var33_66.l.t2());
                var34_79 = var9_9.c;
                var34_79.setText((CharSequence)var6_6);
                var33_66 = var33_66.l.S8();
                var6_6 = var9_9.b;
                var6_6.setText((CharSequence)var33_66);
                break block225;
            }
            var9_9 = (bx2_0)var9_9;
            var33_67 = var11_11.b;
            var9_9.getClass();
            var5_5 = TextUtils.isEmpty((CharSequence)var33_67);
            if (var5_5 == 0) {
                var6_6 = var9_9.b;
                var6_6.setText((CharSequence)var33_67);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final RecyclerView$B onCreateViewHolder(ViewGroup var1_1, int var2_2) {
        var3_3 /* !! */  = "paymentInfoProvider";
        var4_4 = 0;
        var5_5 = null;
        var6_6 /* !! */  = "itemView";
        var7_7 = 1;
        var8_8 = "viewGroup";
        Intrinsics.checkNotNullParameter(var1_1, (String)var8_8);
        var9_9 = 8;
        block0 : switch (var2_2) {
            default: {
                Intrinsics.checkNotNullParameter(var1_1, (String)var8_8);
                if (var2_2 == var7_7) ** GOTO lbl388
                var10_10 = 2;
                if (var2_2 == var10_10) ** GOTO lbl377
                var10_10 = 5;
                if (var2_2 == var10_10) ** GOTO lbl366
                var10_10 = 26;
                if (var2_2 == var10_10) ** GOTO lbl355
                var10_10 = 7;
                if (var2_2 == var10_10) ** GOTO lbl349
                if (var2_2 == var9_9) ** GOTO lbl327
                var10_10 = 9;
                if (var2_2 == var10_10) ** GOTO lbl305
                var6_6 /* !! */  = this.f;
                switch (var2_2) {
                    default: {
                        switch (var2_2) {
                            default: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_12 = R$layout.pesdk_lux_row_divider;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_12, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_13 = R$layout.pesdk_row_divider;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_13, (ViewGroup)var1_1, false);
                                }
                                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                                break block0;
                            }
                            case 36: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_14 = R$layout.pesdk_luxe_row_emi;
                                    var13_68 = var11_11 /* !! */ .inflate(var12_14, (ViewGroup)var1_1, false);
                                    var14_78 = this.e;
                                    var15_89 = this.a;
                                    var8_8 = this.b;
                                    var16_99 = this.f;
                                    var6_6 /* !! */  = var1_1;
                                    var1_1 = new rr2_1(var14_78, (mu1_1)var8_8, var16_99, var15_89, var13_68);
lbl52:
                                    // 12 sources

                                    while (true) {
                                        var11_11 /* !! */  = var1_1;
                                        break block0;
                                        break;
                                    }
                                }
                                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                var12_15 = R$layout.pesdk_row_emi;
                                var13_69 = var11_11 /* !! */ .inflate(var12_15, (ViewGroup)var1_1, false);
                                var14_79 = this.e;
                                var15_90 = this.a;
                                var8_8 = this.b;
                                var16_100 = this.f;
                                var6_6 /* !! */  = var1_1;
                                var1_1 = new rr2_1(var14_79, (mu1_1)var8_8, var16_100, var15_90, var13_69);
                                ** GOTO lbl52
                            }
                            case 35: {
                                var11_11 /* !! */  = this.a;
                                var6_6 /* !! */  = this.b;
                                var14_80 = this.e;
                                Intrinsics.checkNotNullParameter(var1_1, (String)var8_8);
                                var8_8 = this.f;
                                Intrinsics.checkNotNullParameter(var8_8, (String)var3_3 /* !! */ );
                                var12_16 = og1_1.b();
                                if (!var12_16) ** GOTO lbl83
                                var3_3 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                var9_9 = R$layout.pesdk_lux_row_payment_mop_upi;
                                var16_101 = var3_3 /* !! */ .inflate(var9_9, (ViewGroup)var1_1, false);
                                var3_3 /* !! */  = var1_1;
                                var5_5 = var14_80;
                                var14_80 = var8_8;
                                var8_8 = var11_11 /* !! */ ;
                                var1_1 = new ms2_1((dv_0)var5_5, (mu1_1)var6_6 /* !! */ , (co2_0)var14_80, (op2_2)var11_11 /* !! */ , var16_101);
                                ** GOTO lbl52
lbl83:
                                // 1 sources

                                var3_3 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                var9_9 = R$layout.pesdk_row_payment_mop_upi;
                                var16_102 = var3_3 /* !! */ .inflate(var9_9, (ViewGroup)var1_1, false);
                                var3_3 /* !! */  = var1_1;
                                var5_5 = var14_80;
                                var14_80 = var8_8;
                                var8_8 = var11_11 /* !! */ ;
                                var1_1 = new ms2_1((dv_0)var5_5, (mu1_1)var6_6 /* !! */ , (co2_0)var14_80, (op2_2)var11_11 /* !! */ , var16_102);
                                ** GOTO lbl52
                            }
                            case 34: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_17 = R$layout.pesdk_internal_wallet_gift_redemption_luxe_layout;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_17, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_18 = R$layout.pesdk_internal_wallet_gift_redemption_layout;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_18, (ViewGroup)var1_1, false);
                                }
                                var3_3 /* !! */  = this.e;
                                var11_11 /* !! */  = new sr2_0((View)var1_1, (dv_0)var3_3 /* !! */ , (co2_0)var6_6 /* !! */ );
                                break block0;
                            }
                            case 33: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_19 = R$layout.pesdk_luxe_internal_wallet_zero_balance;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_19, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_20 = R$layout.pesdk_internal_wallet_zero_balance;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_20, (ViewGroup)var1_1, false);
                                }
                                var3_3 /* !! */  = this.e;
                                var11_11 /* !! */  = new as2_2((View)var1_1, (dv_0)var3_3 /* !! */ );
                                break block0;
                            }
                            case 32: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_21 = R$layout.pesdk_luxe_internal_wallet_failure_layout;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_21, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_22 = R$layout.pesdk_internal_wallet_failure_layout;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_22, (ViewGroup)var1_1, false);
                                }
                                var3_3 /* !! */  = this.e;
                                var11_11 /* !! */  = new ur2_1((View)var1_1, (dv_0)var3_3 /* !! */ );
                                break block0;
                            }
                            case 31: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_23 = R$layout.pesdk_luxe_internal_wallet_success_layout;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_23, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_24 = R$layout.pesdk_internal_wallet_success_layout;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_24, (ViewGroup)var1_1, false);
                                }
                                var3_3 /* !! */  = this.e;
                                var11_11 /* !! */  = new Yr2((View)var1_1, (dv_0)var3_3 /* !! */ , (co2_0)var6_6 /* !! */ );
                                break block0;
                            }
                            case 30: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var17_112 = R$layout.pesdk_luxe_internal_wallet_paynow_btn;
                                    var1_1 = var11_11 /* !! */ .inflate(var17_112, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var17_113 = R$layout.pesdk_internal_wallet_paynow_btn;
                                    var1_1 = var11_11 /* !! */ .inflate(var17_113, (ViewGroup)var1_1, false);
                                }
                                var8_8 = this.e;
                                var16_103 = "view";
                                Intrinsics.checkNotNullParameter(var1_1, var16_103);
                                Intrinsics.checkNotNullParameter(var6_6 /* !! */ , (String)var3_3 /* !! */ );
                                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                                var12_25 = R$id.proceed_btn_tv;
                                var1_1 = var1_1.findViewById(var12_25);
                                Intrinsics.checkNotNullExpressionValue(var1_1, "findViewById(...)");
                                var1_1 = (TextView)var1_1;
                                var3_3 /* !! */  = StringCompanionObject.INSTANCE;
                                var3_3 /* !! */  = var6_6 /* !! */ .j0();
                                if (var3_3 /* !! */  != null) {
                                    var18_114 = var3_3 /* !! */ .getTotalInternalWalletAmountUsed();
                                } else {
                                    var12_25 = 0;
                                    var18_114 = 0.0f;
                                    var3_3 /* !! */  = null;
                                }
                                var3_3 /* !! */  = kq2_1.a(var18_114);
                                var6_6 /* !! */  = new Object[var7_7];
                                var6_6 /* !! */ [0] = var3_3 /* !! */ ;
                                var3_3 /* !! */  = Arrays.copyOf(var6_6 /* !! */ , var7_7);
                                var3_3 /* !! */  = String.format("PAY \u20b9%s SECURELY", var3_3 /* !! */ );
                                var5_5 = "format(...)";
                                Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , (String)var5_5);
                                var1_1.setText((CharSequence)var3_3 /* !! */ );
                                var3_3 /* !! */  = new Wr2((dv_0)var8_8);
                                var1_1.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
                                break block0;
                            }
                            case 29: {
                                var2_2 = (int)og1_1.b();
                                if (var2_2 != 0) {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_26 = R$layout.pesdk_luxe_internal_wallet_loading;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_26, (ViewGroup)var1_1, false);
                                } else {
                                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                                    var12_27 = R$layout.pesdk_internal_wallet_loading;
                                    var1_1 = var11_11 /* !! */ .inflate(var12_27, (ViewGroup)var1_1, false);
                                }
                                var11_11 /* !! */  = new vr2_2((View)var1_1);
                                break block0;
                            }
                            case 28: 
                        }
                        var2_2 = (int)og1_1.b();
                        if (var2_2 != 0) {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_28 = R$layout.pesdk_luxe_internal_wallet_verify_otp;
                            var1_1 = var11_11 /* !! */ .inflate(var12_28, (ViewGroup)var1_1, false);
                        } else {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_29 = R$layout.pesdk_internal_wallet_verify_otp;
                            var1_1 = var11_11 /* !! */ .inflate(var12_29, (ViewGroup)var1_1, false);
                        }
                        var3_3 /* !! */  = this.e;
                        var11_11 /* !! */  = new zr2_1((View)var1_1, (dv_0)var3_3 /* !! */ );
                        break block0;
                    }
                    case 16: {
                        var2_2 = (int)og1_1.b();
                        if (var2_2 != 0) {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_30 = R$layout.pesdk_lux_layout_bottom_msg;
                            var1_1 = var11_11 /* !! */ .inflate(var12_30, (ViewGroup)var1_1, false);
                        } else {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_31 = R$layout.pesdk_layout_bottom_msg;
                            var1_1 = var11_11 /* !! */ .inflate(var12_31, (ViewGroup)var1_1, false);
                        }
                        var11_11 /* !! */  = new xz_2((View)var1_1);
                        break block0;
                    }
                    case 15: {
                        var2_2 = (int)og1_1.b();
                        if (var2_2 != 0) {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_32 = R$layout.pesdk_lux_layout_trustmarker;
                            var1_1 = var11_11 /* !! */ .inflate(var12_32, (ViewGroup)var1_1, false);
                        } else {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_33 = R$layout.pesdk_layout_trustmarker;
                            var1_1 = var11_11 /* !! */ .inflate(var12_33, (ViewGroup)var1_1, false);
                        }
                        var11_11 /* !! */  = new as3_0((View)var1_1);
                        break block0;
                    }
                    case 14: {
                        var2_2 = (int)og1_1.b();
                        if (var2_2 != 0) {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_34 = R$layout.pesdk_lux_row_payment_tc;
                            var1_1 = var11_11 /* !! */ .inflate(var12_34, (ViewGroup)var1_1, false);
                        } else {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var12_35 = R$layout.pesdk_row_payment_tc;
                            var1_1 = var11_11 /* !! */ .inflate(var12_35, (ViewGroup)var1_1, false);
                        }
                        var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                        break block0;
                    }
                    case 13: {
                        var2_2 = (int)og1_1.b();
                        var3_3 /* !! */  = this.g;
                        if (var2_2 != 0) {
                            var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                            var7_7 = R$layout.pesdk_lux_row_payment_cod;
                            var1_1 = var11_11 /* !! */ .inflate(var7_7, (ViewGroup)var1_1, false);
                            var5_5 = this.e;
                            var11_11 /* !! */  = new ir2_2((View)var1_1, (dv_0)var5_5, (co2_0)var6_6 /* !! */ , (OnCheckoutClickListener)var3_3 /* !! */ );
                            break block0;
                        }
                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var7_7 = R$layout.pesdk_row_payment_cod;
                        var1_1 = var11_11 /* !! */ .inflate(var7_7, (ViewGroup)var1_1, false);
                        var5_5 = this.e;
                        var11_11 /* !! */  = new ir2_2((View)var1_1, (dv_0)var5_5, (co2_0)var6_6 /* !! */ , (OnCheckoutClickListener)var3_3 /* !! */ );
                        break block0;
                    }
                    case 12: {
                        var2_2 = (int)og1_1.b();
                        if (var2_2 == 0) ** GOTO lbl272
                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var12_36 = R$layout.pesdk_lux_row_payment_upi;
                        var13_70 = var11_11 /* !! */ .inflate(var12_36, (ViewGroup)var1_1, false);
                        var14_81 = this.e;
                        var15_91 = this.a;
                        var8_8 = this.b;
                        var16_104 = this.f;
                        var6_6 /* !! */  = var1_1;
                        var1_1 = new ss2_2(var14_81, (mu1_1)var8_8, var16_104, var15_91, var13_70);
                        ** GOTO lbl52
lbl272:
                        // 1 sources

                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var12_37 = R$layout.pesdk_row_payment_upi;
                        var13_71 = var11_11 /* !! */ .inflate(var12_37, (ViewGroup)var1_1, false);
                        var14_82 = this.e;
                        var15_92 = this.a;
                        var8_8 = this.b;
                        var16_105 = this.f;
                        var6_6 /* !! */  = var1_1;
                        var1_1 = new ss2_2(var14_82, (mu1_1)var8_8, var16_105, var15_92, var13_71);
                        ** GOTO lbl52
                    }
                    case 11: 
                }
                var2_2 = (int)og1_1.b();
                if (var2_2 == 0) ** GOTO lbl295
                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_38 = R$layout.pesdk_lux_row_payment_wallet;
                var13_72 = var11_11 /* !! */ .inflate(var12_38, (ViewGroup)var1_1, false);
                var14_83 = this.e;
                var15_93 = this.a;
                var8_8 = this.b;
                var16_106 = this.f;
                var6_6 /* !! */  = var1_1;
                var1_1 = new ks2_1(var14_83, (mu1_1)var8_8, var16_106, var15_93, var13_72);
                ** GOTO lbl52
lbl295:
                // 1 sources

                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_39 = R$layout.pesdk_row_payment_wallet;
                var13_73 = var11_11 /* !! */ .inflate(var12_39, (ViewGroup)var1_1, false);
                var14_84 = this.e;
                var15_94 = this.a;
                var8_8 = this.b;
                var16_107 = this.f;
                var6_6 /* !! */  = var1_1;
                var1_1 = new ks2_1(var14_84, (mu1_1)var8_8, var16_107, var15_94, var13_73);
                ** GOTO lbl52
lbl305:
                // 1 sources

                var2_2 = (int)og1_1.b();
                if (var2_2 == 0) ** GOTO lbl317
                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_40 = R$layout.pesdk_lux_row_netbanking;
                var13_74 = var11_11 /* !! */ .inflate(var12_40, (ViewGroup)var1_1, false);
                var14_85 = this.e;
                var15_95 = this.a;
                var8_8 = this.b;
                var16_108 = this.f;
                var6_6 /* !! */  = var1_1;
                var1_1 = new ds2_2(var14_85, (mu1_1)var8_8, var16_108, var15_95, var13_74);
                ** GOTO lbl52
lbl317:
                // 1 sources

                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_41 = R$layout.pesdk_row_netbanking;
                var13_75 = var11_11 /* !! */ .inflate(var12_41, (ViewGroup)var1_1, false);
                var14_86 = this.e;
                var15_96 = this.a;
                var8_8 = this.b;
                var16_109 = this.f;
                var6_6 /* !! */  = var1_1;
                var1_1 = new ds2_2(var14_86, (mu1_1)var8_8, var16_109, var15_96, var13_75);
                ** GOTO lbl52
lbl327:
                // 1 sources

                var2_2 = (int)og1_1.b();
                if (var2_2 == 0) ** GOTO lbl339
                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_42 = R$layout.pesdk_lux_row_cards;
                var13_76 = var11_11 /* !! */ .inflate(var12_42, (ViewGroup)var1_1, false);
                var15_97 = this.a;
                var8_8 = this.b;
                var14_87 = this.e;
                var16_110 = this.f;
                var6_6 /* !! */  = var1_1;
                var1_1 = new or2_0(var14_87, (mu1_1)var8_8, var16_110, var15_97, var13_76);
                ** GOTO lbl52
lbl339:
                // 1 sources

                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_43 = R$layout.pesdk_row_cards;
                var13_77 = var11_11 /* !! */ .inflate(var12_43, (ViewGroup)var1_1, false);
                var15_98 = this.a;
                var8_8 = this.b;
                var14_88 = this.e;
                var16_111 = this.f;
                var6_6 /* !! */  = var1_1;
                var1_1 = new or2_0(var14_88, (mu1_1)var8_8, var16_111, var15_98, var13_77);
                ** continue;
lbl349:
                // 1 sources

                var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                var12_44 = R$layout.row_payment_earning;
                var1_1 = var11_11 /* !! */ .inflate(var12_44, (ViewGroup)var1_1, false);
                var3_3 /* !! */  = this.e;
                var11_11 /* !! */  = new ao2_0((View)var1_1, (dv_0)var3_3 /* !! */ );
                break;
lbl355:
                // 1 sources

                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_45 = R$layout.pesdk_lux_row_big_space;
                    var1_1 = var11_11 /* !! */ .inflate(var12_45, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_46 = R$layout.pesdk_row_big_space;
                    var1_1 = var11_11 /* !! */ .inflate(var12_46, (ViewGroup)var1_1, false);
                }
                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                break;
lbl366:
                // 1 sources

                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_47 = R$layout.pesdk_lux_row_space;
                    var1_1 = var11_11 /* !! */ .inflate(var12_47, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_48 = R$layout.pesdk_row_space;
                    var1_1 = var11_11 /* !! */ .inflate(var12_48, (ViewGroup)var1_1, false);
                }
                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                break;
lbl377:
                // 1 sources

                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_49 = R$layout.pesdk_lux_row_title;
                    var1_1 = var11_11 /* !! */ .inflate(var12_49, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_50 = R$layout.pesdk_row_title;
                    var1_1 = var11_11 /* !! */ .inflate(var12_50, (ViewGroup)var1_1, false);
                }
                var11_11 /* !! */  = new ns2_2((View)var1_1);
                break;
lbl388:
                // 1 sources

                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_51 = R$layout.pesdk_lux_row_offer;
                    var1_1 = var11_11 /* !! */ .inflate(var12_51, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_52 = R$layout.pesdk_row_offer;
                    var1_1 = var11_11 /* !! */ .inflate(var12_52, (ViewGroup)var1_1, false);
                }
                var3_3 /* !! */  = this.e;
                var11_11 /* !! */  = new jq2_2((View)var1_1, (dv_0)var3_3 /* !! */ );
                break;
            }
            case 27: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_53 = R$layout.checkout_contactdetail_lux;
                    var1_1 = var11_11 /* !! */ .inflate(var12_53, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_54 = R$layout.checkout_contactdetail_revamp;
                    var1_1 = var11_11 /* !! */ .inflate(var12_54, (ViewGroup)var1_1, false);
                }
                var11_11 /* !! */  = new YS$a(this, (View)var1_1);
                break;
            }
            case 24: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_55 = R$layout.view_checkout_space_lux;
                    var1_1 = var11_11 /* !! */ .inflate(var12_55, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_56 = R$layout.view_checkout_space_revamp;
                    var1_1 = var11_11 /* !! */ .inflate(var12_56, (ViewGroup)var1_1, false);
                }
                Intrinsics.checkNotNullParameter(var1_1, (String)var6_6 /* !! */ );
                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                break;
            }
            case 23: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_57 = R$layout.row_payment_fail_lux;
                    var1_1 = var11_11 /* !! */ .inflate(var12_57, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_58 = R$layout.row_payment_fail_revamp;
                    var1_1 = var11_11 /* !! */ .inflate(var12_58, (ViewGroup)var1_1, false);
                }
                Intrinsics.checkNotNullParameter(var1_1, (String)var6_6 /* !! */ );
                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                break;
            }
            case 22: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_59 = R$layout.view_secure_payment_lux;
                    var1_1 = var11_11 /* !! */ .inflate(var12_59, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_60 = R$layout.view_secure_payment_revamp;
                    var1_1 = var11_11 /* !! */ .inflate(var12_60, (ViewGroup)var1_1, false);
                }
                var11_11 /* !! */  = new bx2_0((View)var1_1);
                break;
            }
            case 20: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_61 = R$layout.view_checkout_expandable_lux;
                    var1_1 = var11_11 /* !! */ .inflate(var12_61, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_62 = R$layout.view_checkout_expandable_revamp;
                    var1_1 = var11_11 /* !! */ .inflate(var12_62, (ViewGroup)var1_1, false);
                }
                var3_3 /* !! */  = this.k;
                var5_5 = this.l;
                var11_11 /* !! */  = new wt_0((Context)var3_3 /* !! */ , (View)var1_1, (OnCheckoutClickListener)var5_5);
                break;
            }
            case 19: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_63 = R$layout.view_checkout_summary_luxe;
                    var1_1 = var11_11 /* !! */ .inflate(var12_63, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_64 = R$layout.view_checkout_summary;
                    var1_1 = var11_11 /* !! */ .inflate(var12_64, (ViewGroup)var1_1, false);
                }
                var3_3 /* !! */  = this.k;
                var5_5 = this.l;
                var6_6 /* !! */  = this.m;
                var11_11 /* !! */  = new ST((Context)var3_3 /* !! */ , (View)var1_1, (OnCheckoutClickListener)var5_5, (co2_0)var6_6 /* !! */ );
                break;
            }
            case 18: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_65 = R$layout.view_checkout_expandable_lux;
                    var1_1 = var11_11 /* !! */ .inflate(var12_65, (ViewGroup)var1_1, false);
                } else {
                    var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                    var12_66 = R$layout.view_checkout_expandable_revamp;
                    var1_1 = var11_11 /* !! */ .inflate(var12_66, (ViewGroup)var1_1, false);
                }
                var3_3 /* !! */  = this.k;
                var5_5 = this.l;
                var11_11 /* !! */  = new rt_1((Context)var3_3 /* !! */ , (View)var1_1, (OnCheckoutClickListener)var5_5);
                break;
            }
            case 17: {
                var2_2 = (int)og1_1.b();
                if (var2_2 != 0) {
                    var2_2 = (int)h40_0.Q1();
                    if (var2_2 != 0) {
                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var12_67 = R$layout.view_checkout_address_revamp_new;
                        var1_1 = var11_11 /* !! */ .inflate(var12_67, (ViewGroup)var1_1, false);
                    } else {
                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var12_67 = R$layout.view_checkout_address_lux;
                        var1_1 = var11_11 /* !! */ .inflate(var12_67, (ViewGroup)var1_1, false);
                    }
                } else {
                    var2_2 = (int)h40_0.Q1();
                    if (var2_2 != 0) {
                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var12_67 = R$layout.view_checkout_address_revamp_new;
                        var1_1 = var11_11 /* !! */ .inflate(var12_67, (ViewGroup)var1_1, false);
                    } else {
                        var11_11 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var12_67 = R$layout.view_checkout_address_revamp;
                        var1_1 = var11_11 /* !! */ .inflate(var12_67, (ViewGroup)var1_1, false);
                    }
                }
                var2_2 = (int)h40_0.Q1();
                if (var2_2 != 0) {
                    var11_11 /* !! */  = new nt_1((View)var1_1);
                    break;
                }
                var3_3 /* !! */  = this.l;
                Intrinsics.checkNotNullParameter(var1_1, (String)var6_6 /* !! */ );
                var11_11 /* !! */  = new RecyclerView$B((View)var1_1);
                var11_11 /* !! */ .b = var3_3 /* !! */ ;
                var12_67 = R$id.checkout_address_imv_arrow;
                var3_3 /* !! */  = var1_1.findViewById(var12_67);
                var11_11 /* !! */ .e = var3_3 /* !! */ ;
                var12_67 = R$id.home_delivery_layout;
                var3_3 /* !! */  = (LinearLayout)var1_1.findViewById(var12_67);
                var12_67 = R$id.checkout_address_layout_option;
                var3_3 /* !! */  = var1_1.findViewById(var12_67);
                var11_11 /* !! */ .d = var3_3 /* !! */ ;
                var4_4 = R$id.checkout_address_tv_option;
                var5_5 = (TextView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .c = var5_5;
                var4_4 = R$id.checkout_address_tv_delivery_detail;
                var5_5 = (TextView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .g = var5_5;
                var4_4 = R$id.checkout_address_imv_type;
                var5_5 = (ImageView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .f = var5_5;
                var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var11_11 /* !! */ );
                var4_4 = R$id.parent_layout;
                var5_5 = (ConstraintLayout)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .h = var5_5;
                var4_4 = R$id.id_address_name;
                var5_5 = (TextView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .j = var5_5;
                var4_4 = R$id.id_address_pincode;
                var5_5 = (TextView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .k = var5_5;
                var4_4 = R$id.id_address_details;
                var5_5 = (TextView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .i = var5_5;
                var4_4 = R$id.id_address_change;
                var5_5 = (TextView)var1_1.findViewById(var4_4);
                var11_11 /* !! */ .l = var5_5;
                var4_4 = R$id.relative_address_change;
                ((RelativeLayout)var1_1.findViewById(var4_4)).setOnClickListener((View.OnClickListener)var11_11 /* !! */ );
                var1_1 = z40_0.Companion;
                var1_1 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var1_1).a;
                var19_115 = var1_1.a("masterFlagToEnablePickupstore");
                var5_5 = z40$a.a((Context)AJIOApplication$a.a()).a;
                var6_6 /* !! */  = "enablePickupstore";
                var4_4 = (int)var5_5.a((String)var6_6 /* !! */ );
                if (var19_115 && var4_4 != 0) break;
                var3_3 /* !! */ .setVisibility(var9_9);
            }
        }
        return var11_11 /* !! */ ;
    }
}

