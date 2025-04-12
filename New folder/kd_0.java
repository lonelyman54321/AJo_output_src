/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Product.AllOfferMerge;
import com.ril.ajio.services.data.Product.ProductPromotion;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.StringsKt;

/*
 * Renamed from Kd
 */
public final class kd_0
extends RecyclerView$f {
    public final ArrayList a;
    public final cq1_2 b;
    public final t82_0 c;
    public final yi2_1 d;
    public final t30_0 e;
    public final int f;
    public final int g;

    public kd_0(ArrayList object, cq1_2 cq1_22, t82_0 t82_02, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(object, "offerList");
        Intrinsics.checkNotNullParameter(cq1_22, "moreProductOfferCallback");
        Intrinsics.checkNotNullParameter(t82_02, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        this.a = object;
        this.b = cq1_22;
        this.c = t82_02;
        this.d = yi2_12;
        this.e = object = new t30_0();
        this.f = 1;
        this.g = 2;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = ((AllOfferMerge)arrayList.get(n3)).getBankOffers();
        n3 = arrayList2 != null && (n3 = (int)(arrayList2.isEmpty() ? 1 : 0)) == 0 ? this.f : this.g;
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block92: {
            block98: {
                block89: {
                    block103: {
                        block102: {
                            block101: {
                                block87: {
                                    block100: {
                                        block99: {
                                            block91: {
                                                block96: {
                                                    block85: {
                                                        block97: {
                                                            block95: {
                                                                block94: {
                                                                    block93: {
                                                                        var3_3 = var1_1;
                                                                        var4_4 = var2_2;
                                                                        var5_5 = "holder";
                                                                        Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
                                                                        var6_6 = var1_1 instanceof Kd$b;
                                                                        var7_7 = "Offer Price ";
                                                                        var8_8 = " ";
                                                                        var9_9 /* !! */  = " Coupon offers";
                                                                        var10_10 = "+";
                                                                        var11_11 = "get(...)";
                                                                        var12_12 = 0;
                                                                        var13_13 = null;
                                                                        var14_14 = "list";
                                                                        var15_15 = this;
                                                                        var16_16 = this.a;
                                                                        if (var6_6 == 0) break block91;
                                                                        var17_17 = ((AllOfferMerge)var16_16.get(var2_2)).getCouponList();
                                                                        if (var17_17 == null) break block92;
                                                                        var3_3 = (Kd$b)var1_1;
                                                                        var3_3.getClass();
                                                                        Intrinsics.checkNotNullParameter(var17_17, (String)var14_14);
                                                                        var5_5 = var17_17.get(0);
                                                                        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var11_11);
                                                                        var5_5 = (ProductPromotion)var5_5;
                                                                        var16_16 = var3_3.itemView;
                                                                        var18_21 = R$id.offer_price;
                                                                        var16_16 = (AjioTextView)var16_16.findViewById(var18_21);
                                                                        var11_11 = var3_3.itemView;
                                                                        var19_23 = R$id.offer_code;
                                                                        var11_11 = (AjioTextView)var11_11.findViewById(var19_23);
                                                                        var14_14 = var3_3.itemView;
                                                                        var20_25 = R$id.offer_desc;
                                                                        var21_29 = (AjioTextView)var14_14.findViewById(var20_25);
                                                                        var14_14 = var3_3.itemView;
                                                                        var12_12 = R$id.total_coupons;
                                                                        var13_13 = (AjioTextView)var14_14.findViewById(var12_12);
                                                                        var14_14 = var3_3.itemView;
                                                                        var22_31 = R$id.terms_conditions;
                                                                        var23_33 = (AjioTextView)var14_14.findViewById(var22_31);
                                                                        var14_14 = var3_3.itemView;
                                                                        var24_35 = R$id.coupon_image;
                                                                        var25_39 = (AjioImageView)var14_14.findViewById(var24_35);
                                                                        var26_43 = var3_3.itemView;
                                                                        var19_23 = R$id.coupon_item;
                                                                        var26_43 = var26_43.findViewById(var19_23);
                                                                        var14_14 = var3_3.itemView;
                                                                        var27_47 = R$id.timer_text;
                                                                        var15_15 = (AjioTextView)var14_14.findViewById(var27_47);
                                                                        Intrinsics.checkNotNull(var15_15);
                                                                        var28_51 = k7.p();
                                                                        var14_14 = k7.s(var5_5.getEndTime());
                                                                        var30_53 = k7.t(var5_5.getTimerShowDuration());
                                                                        var1_1 = var21_29;
                                                                        var21_29 = var5_5.getShowEndTimer();
                                                                        var32_55 = var23_33;
                                                                        var23_33 = var30_53;
                                                                        var33_57 = var11_11;
                                                                        var11_11 = var28_51;
                                                                        var20_25 = (int)hv3_0.i0((Boolean)var21_29, (Long)var23_33, (Long)var14_14, (Long)var11_11);
                                                                        var23_33 = var3_3.c;
                                                                        if (var20_25 == 0 || (var20_25 = (int)var23_33.u7()) != 0) break block93;
                                                                        var21_29 = new Ref$LongRef();
                                                                        if (var14_14 != null && (var18_21 = (int)((cfr_temp_0 = (var34_59 = var14_14.longValue()) - (var36_61 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) ** GOTO lbl-1000
                                                                        Intrinsics.checkNotNull(var14_14);
                                                                        var36_61 = var14_14.longValue();
                                                                        var18_21 = (int)(var36_61 == var28_51 ? 0 : (var36_61 < var28_51 ? -1 : 1));
                                                                        if (var18_21 > 0) {
                                                                            var36_61 = var14_14.longValue();
                                                                            var38_63 = var7_7;
                                                                            var39_64 = var8_8;
                                                                            var21_29.element = var40_65 = var36_61 - var28_51;
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var38_63 = var7_7;
                                                                            var39_64 = var8_8;
                                                                        }
                                                                        var7_7 = t62_0.d(TimeUnit.MILLISECONDS);
                                                                        var8_8 = qt2_2.b;
                                                                        var7_7 = var7_7.g((Scheduler)var8_8);
                                                                        var8_8 = ti_2.a();
                                                                        var7_7 = var7_7.e((HandlerScheduler)var8_8);
                                                                        var8_8 = new qd_1((Ref$LongRef)var21_29, (AjioTextView)var15_15, (Kd$b)var3_3);
                                                                        var7_7.c((e62_0)var8_8);
                                                                        break block94;
                                                                    }
                                                                    var38_63 = var7_7;
                                                                    var39_64 = var8_8;
                                                                }
                                                                var7_7 = new ld_0((Kd$b)var3_3, var17_17);
                                                                var13_13.setOnClickListener((View.OnClickListener)var7_7);
                                                                var42_66 = var17_17.size();
                                                                var43_69 = 1;
                                                                var44_73 = 1.4E-45f;
                                                                if ((var42_66 -= var43_69) >= var43_69) {
                                                                    var43_69 = 0;
                                                                    var44_73 = 0.0f;
                                                                    var13_13.setVisibility(0);
                                                                    var8_8 = new StringBuilder(var10_10);
                                                                    var8_8.append(var42_66);
                                                                    var8_8.append(var9_9 /* !! */ );
                                                                    var7_7 = var8_8.toString();
                                                                    var13_13.setText((CharSequence)var7_7);
                                                                }
                                                                var7_7 = tr2_2.a;
                                                                var42_66 = (int)tr2_2.j(var23_33.c9());
                                                                if ((var42_66 != 0 || (var42_66 = (int)tr2_2.m()) != 0) && (var42_66 = (int)var23_33.u7()) == 0 && (var42_66 = (int)var23_33.S5()) != 0) {
                                                                    var42_66 = (int)tr2_2.m();
                                                                    var7_7 = var42_66 != 0 ? tr2_2.c() : tr2_2.d().q;
                                                                    var8_8 = new da$a();
                                                                    var8_8.k = true;
                                                                    var8_8.b = var20_25 = R$drawable.ic_sale_default;
                                                                    var8_8.c = var20_25;
                                                                    var8_8.n = var7_7;
                                                                    var8_8.u = var25_39;
                                                                    var8_8.a();
                                                                    var45_76 = var5_5.getMaxSavingPrice();
                                                                    var43_69 = 0;
                                                                    var44_73 = 0.0f;
                                                                    var8_8 = null;
                                                                    cfr_temp_1 = var45_76 - 0.0f;
                                                                    var42_66 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                                                    if (var42_66 > 0) {
                                                                        var42_66 = 0;
                                                                        var45_76 = 0.0f;
                                                                        var16_16.setVisibility(0);
                                                                        var7_7 = tr2_2.d().s;
                                                                        var44_73 = var5_5.getMaxSavingPrice();
                                                                        var43_69 = ok1_1.b(var44_73);
                                                                        var8_8 = qz2_0.o(String.valueOf(var43_69));
                                                                        var21_29 = new StringBuilder();
                                                                        var21_29.append((String)var7_7);
                                                                        var7_7 = var39_64;
                                                                        var21_29.append((String)var39_64);
                                                                        var21_29.append((String)var8_8);
                                                                        var7_7 = var21_29.toString();
                                                                        var16_16.setText((CharSequence)var7_7);
                                                                    } else {
                                                                        var42_66 = 8;
                                                                        var45_76 = 1.1E-44f;
                                                                        var16_16.setVisibility(var42_66);
                                                                    }
                                                                    var46_78 = (int)tr2_2.m();
                                                                    var16_16 = var46_78 != 0 ? tr2_2.a() : tr2_2.d().i;
                                                                    var46_78 = Color.parseColor((String)var16_16);
                                                                    var26_43.setBackgroundColor(var46_78);
                                                                } else {
                                                                    var45_76 = var5_5.getMaxSavingPrice();
                                                                    var43_69 = 0;
                                                                    var44_73 = 0.0f;
                                                                    var8_8 = null;
                                                                    cfr_temp_2 = var45_76 - 0.0f;
                                                                    var42_66 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                                                    if (var42_66 > 0) {
                                                                        var16_16.setVisibility(0);
                                                                        var45_76 = var5_5.getMaxSavingPrice();
                                                                        var42_66 = ok1_1.b(var45_76);
                                                                        var7_7 = qz2_0.o(String.valueOf(var42_66));
                                                                        var21_29 = var38_63;
                                                                        var8_8 = new StringBuilder((String)var38_63);
                                                                        var8_8.append((String)var7_7);
                                                                        var7_7 = var8_8.toString();
                                                                        var16_16.setText((CharSequence)var7_7);
                                                                    } else {
                                                                        var42_66 = 8;
                                                                        var45_76 = 1.1E-44f;
                                                                        var16_16.setVisibility(var42_66);
                                                                    }
                                                                }
                                                                var16_16 = var5_5.getCode();
                                                                var11_11 = var33_57;
                                                                var33_57.setText((CharSequence)var16_16);
                                                                var16_16 = var5_5.getTermsLink();
                                                                if (var16_16 == null || (var46_78 = var16_16.length()) <= 0) ** GOTO lbl187
                                                                var46_78 = (int)var23_33.u7();
                                                                var7_7 = var32_55;
                                                                if (var46_78 == 0) {
                                                                    var32_55.setVisibility(0);
                                                                    var16_16 = new md_0((Kd$b)var3_3, (ProductPromotion)var5_5);
                                                                    var32_55.setOnClickListener((View.OnClickListener)var16_16);
                                                                    var46_78 = 8;
                                                                    var47_80 = 1.1E-44f;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl187:
                                                                    // 1 sources

                                                                    var7_7 = var32_55;
                                                                    ** continue;
                                                                    var46_78 = 8;
                                                                    var47_80 = 1.1E-44f;
                                                                    var7_7.setVisibility(var46_78);
                                                                }
                                                                var42_66 = (int)var23_33.u7();
                                                                if (var42_66 == 0) break block95;
                                                                var21_29 = var1_1;
                                                                var1_1.setVisibility(var46_78);
                                                                break block96;
                                                            }
                                                            var21_29 = var1_1;
                                                            var16_16 = hv3_0.a;
                                                            var7_7 = var5_5.getDescription();
                                                            if (var7_7 != null) {
                                                                block84: {
                                                                    var43_69 = var7_7.length() - 1;
                                                                    var48_82 = 0;
                                                                    var9_9 /* !! */  = null;
                                                                    var24_35 = 0;
                                                                    var25_39 = null;
                                                                    while (var48_82 <= var43_69) {
                                                                        var27_47 = var24_35 == 0 ? var48_82 : var43_69;
                                                                        var27_47 = var7_7.charAt(var27_47);
                                                                        var22_31 = 32;
                                                                        if ((var27_47 = Intrinsics.compare(var27_47, var22_31)) <= 0) {
                                                                            var27_47 = 1;
                                                                        } else {
                                                                            var27_47 = 0;
                                                                            var15_15 = null;
                                                                        }
                                                                        if (var24_35 == 0) {
                                                                            if (var27_47 == 0) {
                                                                                var24_35 = 1;
                                                                                continue;
                                                                            }
                                                                            var22_31 = 1;
                                                                            var48_82 += var22_31;
                                                                            continue;
                                                                        }
                                                                        var22_31 = 1;
                                                                        if (var27_47 != 0) {
                                                                            var43_69 += -1;
                                                                            continue;
                                                                        }
                                                                        break block84;
                                                                    }
                                                                    var22_31 = 1;
                                                                }
                                                                var7_7 = com.jio.jioads.adinterfaces.a.a(var43_69, var22_31, var48_82, (String)var7_7);
                                                            } else {
                                                                var22_31 = 1;
                                                                var42_66 = 0;
                                                                var45_76 = 0.0f;
                                                                var7_7 = null;
                                                            }
                                                            var16_16.getClass();
                                                            var16_16 = hv3_0.I((String)var7_7);
                                                            var21_29.setText((CharSequence)var16_16);
                                                            var21_29.setClickable((boolean)var22_31);
                                                            var16_16 = var5_5.getDetailsURL();
                                                            var46_78 = (int)TextUtils.isEmpty((CharSequence)var16_16);
                                                            if (var46_78 != 0) break block97;
                                                            var16_16 = new nd_0((Kd$b)var3_3, (ProductPromotion)var5_5);
                                                            var21_29.setOnClickListener((View.OnClickListener)var16_16);
                                                            break block96;
                                                        }
                                                        var16_16 = var5_5.getDescription();
                                                        if (var16_16 == null) ** GOTO lbl-1000
                                                        var42_66 = var16_16.length() - var22_31;
                                                        var43_69 = 0;
                                                        var44_73 = 0.0f;
                                                        var8_8 = null;
                                                        var48_82 = 0;
                                                        var9_9 /* !! */  = null;
                                                        while (var43_69 <= var42_66) {
                                                            var24_35 = var48_82 == 0 ? var43_69 : var42_66;
                                                            var24_35 = var16_16.charAt(var24_35);
                                                            var27_47 = 32;
                                                            if ((var24_35 = Intrinsics.compare(var24_35, var27_47)) <= 0) {
                                                                var24_35 = 1;
                                                            } else {
                                                                var24_35 = 0;
                                                                var25_39 = null;
                                                            }
                                                            if (var48_82 == 0) {
                                                                if (var24_35 == 0) {
                                                                    var48_82 = 1;
                                                                    continue;
                                                                }
                                                                var27_47 = 1;
                                                                var43_69 += var27_47;
                                                                continue;
                                                            }
                                                            var27_47 = 1;
                                                            if (var24_35 != 0) {
                                                                var42_66 += -1;
                                                                continue;
                                                            }
                                                            break block85;
                                                        }
                                                        var27_47 = 1;
                                                    }
                                                    var16_16 = com.jio.jioads.adinterfaces.a.a(var42_66, var27_47, var43_69, (String)var16_16);
                                                    if (var16_16 == null) ** GOTO lbl-1000
                                                    var42_66 = R$string.pdp_bundleoffer_description;
                                                    var7_7 = hv3_0.K(var42_66);
                                                    var43_69 = 0;
                                                    var44_73 = 0.0f;
                                                    var8_8 = null;
                                                    var46_78 = (int)StringsKt.F((CharSequence)var16_16, (CharSequence)var7_7, false);
                                                    if (var46_78 == var27_47) {
                                                        if ((var5_5 = var5_5.getDescription()) != null) {
                                                            block86: {
                                                                var46_78 = var5_5.length() - var27_47;
                                                                var42_66 = 0;
                                                                var45_76 = 0.0f;
                                                                var7_7 = null;
                                                                var43_69 = 0;
                                                                var44_73 = 0.0f;
                                                                var8_8 = null;
                                                                while (var42_66 <= var46_78) {
                                                                    var48_82 = var43_69 == 0 ? var42_66 : var46_78;
                                                                    var48_82 = var5_5.charAt(var48_82);
                                                                    var24_35 = 32;
                                                                    if ((var48_82 = Intrinsics.compare(var48_82, var24_35)) <= 0) {
                                                                        var48_82 = 1;
                                                                    } else {
                                                                        var48_82 = 0;
                                                                        var9_9 /* !! */  = null;
                                                                    }
                                                                    if (var43_69 == 0) {
                                                                        if (var48_82 == 0) {
                                                                            var43_69 = 1;
                                                                            var44_73 = 1.4E-45f;
                                                                            continue;
                                                                        }
                                                                        var24_35 = 1;
                                                                        var42_66 += var24_35;
                                                                        continue;
                                                                    }
                                                                    var24_35 = 1;
                                                                    if (var48_82 != 0) {
                                                                        var46_78 += -1;
                                                                        continue;
                                                                    }
                                                                    break block86;
                                                                }
                                                                var24_35 = 1;
                                                            }
                                                            var15_15 = com.jio.jioads.adinterfaces.a.a(var46_78, var24_35, var42_66, (String)var5_5);
                                                        } else {
                                                            var27_47 = 0;
                                                            var15_15 = null;
                                                        }
                                                        var5_5 = new SpannableString((CharSequence)var15_15);
                                                        var21_29.setText((CharSequence)var5_5);
                                                        var5_5 = LinkMovementMethod.getInstance();
                                                        var21_29.setMovementMethod((MovementMethod)var5_5);
                                                    } else lbl-1000:
                                                    // 3 sources

                                                    {
                                                        var5_5 = new pd_1((Kd$b)var3_3);
                                                        var21_29.setMovementMethod((MovementMethod)var5_5);
                                                    }
                                                }
                                                var5_5 = new od_0((Kd$b)var3_3, var17_17);
                                                var26_43.setOnClickListener((View.OnClickListener)var5_5);
                                                break block92;
                                            }
                                            var21_30 = var7_7;
                                            var7_7 = var8_8;
                                            var6_6 = var1_1 instanceof Kd$d;
                                            if (var6_6 == 0) break block98;
                                            var17_18 = ((AllOfferMerge)var16_16.get(var2_2)).getCouponList();
                                            if (var17_18 == null) break block92;
                                            var3_3 = (Kd$d)var1_1;
                                            var3_3.getClass();
                                            Intrinsics.checkNotNullParameter(var17_18, (String)var14_14);
                                            var6_6 = 0;
                                            var16_16 = var17_18.get(0);
                                            Intrinsics.checkNotNullExpressionValue(var16_16, (String)var11_11);
                                            var16_16 = (ProductPromotion)var16_16;
                                            var5_5 = var3_3.itemView;
                                            var43_70 = R$id.offer_price;
                                            var5_5 = (AjioTextView)var5_5.findViewById(var43_70);
                                            var8_8 = var3_3.itemView;
                                            var24_36 = R$id.offer_code;
                                            var8_8 = (AjioTextView)var8_8.findViewById(var24_36);
                                            var25_40 = var3_3.itemView;
                                            var49_85 = R$id.offer_desc;
                                            var25_40 = (AjioTextView)var25_40.findViewById(var49_85);
                                            var26_44 /* !! */  = var3_3.itemView;
                                            var27_48 = R$id.total_coupons;
                                            var26_44 /* !! */  = (AjioTextView)var26_44 /* !! */ .findViewById(var27_48);
                                            var15_15 = var3_3.itemView;
                                            var22_32 = R$id.terms_conditions;
                                            var15_15 = (AjioTextView)var15_15.findViewById(var22_32);
                                            var23_34 /* !! */  = var3_3.itemView;
                                            var18_22 = R$id.timer_text;
                                            var23_34 /* !! */  = (AjioTextView)var23_34 /* !! */ .findViewById(var18_22);
                                            var11_11 = var3_3.itemView;
                                            var12_12 = R$id.coupon_image;
                                            var11_11 = (AjioImageView)var11_11.findViewById(var12_12);
                                            var13_13 = var3_3.itemView;
                                            var19_24 = R$id.coupon_item;
                                            var13_13 = var13_13.findViewById(var19_24);
                                            Intrinsics.checkNotNull(var23_34 /* !! */ );
                                            var28_52 = k7.p();
                                            var14_14 = k7.s(var16_16.getEndTime());
                                            var30_54 = k7.t(var16_16.getTimerShowDuration());
                                            var1_1 = var25_40;
                                            var25_40 = var16_16.getShowEndTimer();
                                            var32_56 = var15_15;
                                            var15_15 = var30_54;
                                            var33_58 = var8_8;
                                            var8_8 = var28_52;
                                            var43_70 = (int)hv3_0.i0((Boolean)var25_40, (Long)var15_15, (Long)var14_14, (Long)var8_8);
                                            var25_40 = var3_3.c;
                                            if (var43_70 == 0 || (var43_70 = (int)var25_40.u7()) != 0) break block99;
                                            var8_8 = new Ref$LongRef();
                                            if (var14_14 != null && (var27_48 = (int)((cfr_temp_3 = (var34_60 = var14_14.longValue()) - (var36_62 = 0L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) == 0) ** GOTO lbl-1000
                                            Intrinsics.checkNotNull(var14_14);
                                            var36_62 = var14_14.longValue();
                                            var27_48 = (int)(var36_62 == var28_52 ? 0 : (var36_62 < var28_52 ? -1 : 1));
                                            if (var27_48 > 0) {
                                                var36_62 = var14_14.longValue();
                                                var14_14 = var5_5;
                                                var15_15 = var16_16;
                                                var8_8.element = var50_88 = var36_62 - var28_52;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var14_14 = var5_5;
                                                var15_15 = var16_16;
                                            }
                                            var5_5 = t62_0.d(TimeUnit.MILLISECONDS);
                                            var16_16 = qt2_2.b;
                                            var5_5 = var5_5.g((Scheduler)var16_16);
                                            var16_16 = ti_2.a();
                                            var5_5 = var5_5.e((HandlerScheduler)var16_16);
                                            var16_16 = new zd_0((Ref$LongRef)var8_8, (AjioTextView)var23_34 /* !! */ , (Kd$d)var3_3);
                                            var5_5.c((e62_0)var16_16);
                                            break block100;
                                        }
                                        var14_14 = var5_5;
                                        var15_15 = var16_16;
                                    }
                                    var5_5 = new ud_0((Kd$d)var3_3, (ArrayList)var17_18);
                                    var26_44 /* !! */ .setOnClickListener((View.OnClickListener)var5_5);
                                    var46_79 = 0;
                                    var47_81 = 0.0f;
                                    var16_16 = null;
                                    var5_5 = new vd_0((RecyclerView$B)var3_3, (Serializable)var17_18, 0);
                                    var13_13.setOnClickListener((View.OnClickListener)var5_5);
                                    var4_4 = var17_18.size();
                                    var6_6 = 1;
                                    if ((var4_4 -= var6_6) >= var6_6) {
                                        var26_44 /* !! */ .setVisibility(0);
                                        var5_5 = new StringBuilder(var10_10);
                                        var5_5.append(var4_4);
                                        var5_5.append(var9_9 /* !! */ );
                                        var17_18 = var5_5.toString();
                                        var26_44 /* !! */ .setText((CharSequence)var17_18);
                                    }
                                    var17_18 = tr2_2.a;
                                    var4_4 = (int)tr2_2.j(var25_40.c9());
                                    if (var4_4 == 0 && (var4_4 = (int)tr2_2.m()) == 0) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            break block87;
                                            break;
                                        }
                                    }
                                    ** while ((var4_4 = (int)var25_40.u7()) != 0 || (var4_4 = (int)var25_40.S5()) == 0)
lbl436:
                                    // 1 sources

                                    var4_4 = (int)tr2_2.m();
                                    var17_18 = var4_4 != 0 ? tr2_2.c() : tr2_2.d().q;
                                    var5_5 = new da$a();
                                    var47_81 = 1.4E-45f;
                                    var5_5.k = true;
                                    var5_5.b = var46_79 = R$drawable.ic_sale_default;
                                    var5_5.c = var46_79;
                                    var5_5.n = var17_18;
                                    var5_5.u = var11_11;
                                    var5_5.a();
                                    var52_89 = var15_15.getMaxSavingPrice();
                                    var6_6 = 0;
                                    var5_5 = null;
                                    cfr_temp_4 = var52_89 - 0.0f;
                                    var4_4 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                                    if (var4_4 > 0) {
                                        var5_5 = var14_14;
                                        var4_4 = 0;
                                        var52_89 = 0.0f;
                                        var14_14.setVisibility(0);
                                        var17_18 = tr2_2.d().s;
                                        var47_81 = var15_15.getMaxSavingPrice();
                                        var46_79 = ok1_1.b(var47_81);
                                        var16_16 = qz2_0.o(String.valueOf(var46_79));
                                        var8_8 = new StringBuilder();
                                        var8_8.append((String)var17_18);
                                        var8_8.append((String)var7_7);
                                        var8_8.append((String)var16_16);
                                        var17_18 = var8_8.toString();
                                        var14_14.setText((CharSequence)var17_18);
                                    } else {
                                        var5_5 = var14_14;
                                        var4_4 = 8;
                                        var52_89 = 1.1E-44f;
                                        var14_14.setVisibility(var4_4);
                                    }
                                    var4_4 = (int)tr2_2.m();
                                    var17_18 = var4_4 != 0 ? tr2_2.a() : tr2_2.d().i;
                                    var4_4 = Color.parseColor((String)var17_18);
                                    var13_13.setBackgroundColor(var4_4);
                                    break block101;
                                }
                                var5_5 = var14_14;
                                var52_89 = var15_15.getMaxSavingPrice();
                                var46_79 = 0;
                                var47_81 = 0.0f;
                                var16_16 = null;
                                cfr_temp_5 = var52_89 - 0.0f;
                                var4_4 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                                if (var4_4 > 0) {
                                    var14_14.setVisibility(0);
                                    var52_89 = var15_15.getMaxSavingPrice();
                                    var4_4 = ok1_1.b(var52_89);
                                    var17_18 = qz2_0.o(String.valueOf(var4_4));
                                    var16_16 = new StringBuilder((String)var21_30);
                                    var16_16.append((String)var17_18);
                                    var17_18 = var16_16.toString();
                                    var14_14.setText((CharSequence)var17_18);
                                } else {
                                    var4_4 = 8;
                                    var52_89 = 1.1E-44f;
                                    var14_14.setVisibility(var4_4);
                                }
                            }
                            var17_18 = var15_15.getCode();
                            var8_8 = var33_58;
                            var33_58.setText((CharSequence)var17_18);
                            var17_18 = var15_15.getTermsLink();
                            if (var17_18 == null || (var4_4 = var17_18.length()) <= 0) ** GOTO lbl520
                            var4_4 = (int)var25_40.u7();
                            var5_5 = var32_56;
                            if (var4_4 == 0) {
                                var17_18 = null;
                                var32_56.setVisibility(0);
                                var16_16 = new wd_0(0, var15_15, var3_3);
                                var32_56.setOnClickListener((View.OnClickListener)var16_16);
                                var4_4 = 8;
                                var52_89 = 1.1E-44f;
                            } else lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
lbl520:
                                // 1 sources

                                var5_5 = var32_56;
                                ** continue;
                                var4_4 = 8;
                                var52_89 = 1.1E-44f;
                                var5_5.setVisibility(var4_4);
                            }
                            var6_6 = (int)var25_40.u7();
                            if (var6_6 == 0) break block102;
                            var25_40 = var1_1;
                            var1_1.setVisibility(var4_4);
                            break block92;
                        }
                        var25_40 = var1_1;
                        var17_18 = var15_15.getDescription();
                        if (var17_18 != null) {
                            block88: {
                                var6_6 = var17_18.length() - 1;
                                var46_79 = 0;
                                var47_81 = 0.0f;
                                var16_16 = null;
                                var42_67 = 0;
                                var45_77 = 0.0f;
                                var7_7 = null;
                                while (var46_79 <= var6_6) {
                                    var43_70 = var42_67 == 0 ? var46_79 : var6_6;
                                    var43_70 = var17_18.charAt(var43_70);
                                    var20_26 = 32;
                                    if ((var43_70 = Intrinsics.compare(var43_70, var20_26)) <= 0) {
                                        var43_70 = 1;
                                        var44_74 = 1.4E-45f;
                                    } else {
                                        var43_70 = 0;
                                        var44_74 = 0.0f;
                                        var8_8 = null;
                                    }
                                    if (var42_67 == 0) {
                                        if (var43_70 == 0) {
                                            var42_67 = 1;
                                            var45_77 = 1.4E-45f;
                                            continue;
                                        }
                                        var20_26 = 1;
                                        var46_79 += var20_26;
                                        continue;
                                    }
                                    var20_26 = 1;
                                    if (var43_70 != 0) {
                                        var6_6 += -1;
                                        continue;
                                    }
                                    break block88;
                                }
                                var20_26 = 1;
                            }
                            var17_18 = com.jio.jioads.adinterfaces.a.a(var6_6, var20_26, var46_79, (String)var17_18);
                        } else {
                            var20_26 = 1;
                            var4_4 = 0;
                            var52_89 = 0.0f;
                            var17_18 = null;
                        }
                        var17_18 = hv3_0.f((String)var17_18);
                        var25_40.setText((CharSequence)var17_18);
                        var25_40.setClickable((boolean)var20_26);
                        var17_18 = var15_15.getDetailsURL();
                        var4_4 = (int)TextUtils.isEmpty((CharSequence)var17_18);
                        if (var4_4 != 0) break block103;
                        var17_18 = new Xd((Kd$d)var3_3, (ProductPromotion)var15_15);
                        var25_40.setOnClickListener((View.OnClickListener)var17_18);
                        break block92;
                    }
                    var17_18 = var15_15.getDescription();
                    if (var17_18 == null) ** GOTO lbl-1000
                    var6_6 = var17_18.length() - var20_26;
                    var46_79 = 0;
                    var47_81 = 0.0f;
                    var16_16 = null;
                    var42_67 = 0;
                    var45_77 = 0.0f;
                    var7_7 = null;
                    while (var46_79 <= var6_6) {
                        var43_70 = var42_67 == 0 ? var46_79 : var6_6;
                        var43_70 = var17_18.charAt(var43_70);
                        var20_26 = 32;
                        if ((var43_70 = Intrinsics.compare(var43_70, var20_26)) <= 0) {
                            var43_70 = 1;
                            var44_74 = 1.4E-45f;
                        } else {
                            var43_70 = 0;
                            var44_74 = 0.0f;
                            var8_8 = null;
                        }
                        if (var42_67 == 0) {
                            if (var43_70 == 0) {
                                var42_67 = 1;
                                var45_77 = 1.4E-45f;
                                continue;
                            }
                            var20_26 = 1;
                            var46_79 += var20_26;
                            continue;
                        }
                        var20_26 = 1;
                        if (var43_70 != 0) {
                            var6_6 += -1;
                            continue;
                        }
                        break block89;
                    }
                    var20_26 = 1;
                }
                var17_18 = com.jio.jioads.adinterfaces.a.a(var6_6, var20_26, var46_79, (String)var17_18);
                if (var17_18 == null) ** GOTO lbl-1000
                var6_6 = R$string.pdp_bundleoffer_description;
                var5_5 = hv3_0.K(var6_6);
                var46_79 = 0;
                var47_81 = 0.0f;
                var16_16 = null;
                var4_4 = (int)StringsKt.F((CharSequence)var17_18, (CharSequence)var5_5, false);
                if (var4_4 == var20_26) {
                    var3_3 = var15_15.getDescription();
                    if (var3_3 != null) {
                        block90: {
                            var4_4 = var3_3.length() - var20_26;
                            var6_6 = 0;
                            var5_5 = null;
                            var46_79 = 0;
                            var47_81 = 0.0f;
                            var16_16 = null;
                            while (var6_6 <= var4_4) {
                                var42_67 = var46_79 == 0 ? var6_6 : var4_4;
                                var42_67 = var3_3.charAt(var42_67);
                                var43_70 = 32;
                                var44_74 = 4.5E-44f;
                                if ((var42_67 = Intrinsics.compare(var42_67, var43_70)) <= 0) {
                                    var42_67 = 1;
                                    var45_77 = 1.4E-45f;
                                } else {
                                    var42_67 = 0;
                                    var45_77 = 0.0f;
                                    var7_7 = null;
                                }
                                if (var46_79 == 0) {
                                    if (var42_67 == 0) {
                                        var46_79 = 1;
                                        var47_81 = 1.4E-45f;
                                        continue;
                                    }
                                    var20_26 = 1;
                                    var6_6 += var20_26;
                                    continue;
                                }
                                var20_26 = 1;
                                if (var42_67 != 0) {
                                    var4_4 += -1;
                                    continue;
                                }
                                break block90;
                            }
                            var20_26 = 1;
                        }
                        var15_15 = com.jio.jioads.adinterfaces.a.a(var4_4, var20_26, var6_6, (String)var3_3);
                    } else {
                        var27_48 = 0;
                        var15_15 = null;
                    }
                    var3_3 = new SpannableString((CharSequence)var15_15);
                    var25_40.setText((CharSequence)var3_3);
                    var3_3 = LinkMovementMethod.getInstance();
                    var25_40.setMovementMethod((MovementMethod)var3_3);
                } else lbl-1000:
                // 3 sources

                {
                    var17_18 = new yd_0((Kd$d)var3_3);
                    var25_40.setMovementMethod((MovementMethod)var17_18);
                }
                break block92;
            }
            var6_6 = var1_1 instanceof Kd$a;
            var7_7 = " Bank offers";
            if (var6_6 != 0) {
                var17_19 = ((AllOfferMerge)var16_16.get(var2_2)).getBankOffers();
                if (var17_19 != null) {
                    var3_3 = (Kd$a)var1_1;
                    var3_3.getClass();
                    Intrinsics.checkNotNullParameter(var17_19, (String)var14_14);
                    var6_6 = 0;
                    var16_16 = var17_19.get(0);
                    Intrinsics.checkNotNullExpressionValue(var16_16, (String)var11_11);
                    var16_16 = (BankOfferItem)var16_16;
                    var5_5 = var3_3.itemView;
                    var43_71 = R$id.offer_desc;
                    var5_5 = (AjioTextView)var5_5.findViewById(var43_71);
                    var8_8 = var3_3.itemView;
                    var20_27 = R$id.total_coupons;
                    var8_8 = (AjioTextView)var8_8.findViewById(var20_27);
                    var21_30 = var3_3.itemView;
                    var48_83 = R$id.terms_conditions;
                    var21_30 = (AjioTextView)var21_30.findViewById(var48_83);
                    var9_9 /* !! */  = var3_3.itemView;
                    var24_37 = R$id.coupon_image;
                    var9_9 /* !! */  = (AjioImageView)var9_9 /* !! */ .findViewById(var24_37);
                    var25_41 = var3_3.itemView;
                    var49_86 = R$id.coupon_item;
                    var25_41 = var25_41.findViewById(var49_86);
                    var27_49 = false;
                    var15_15 = null;
                    var26_45 = new hd_0(var3_3, 0);
                    var8_8.setOnClickListener((View.OnClickListener)var26_45);
                    var26_45 = new Id(var3_3, 0);
                    var25_41.setOnClickListener((View.OnClickListener)var26_45);
                    var4_4 = var17_19.size();
                    var49_86 = 1;
                    if ((var4_4 -= var49_86) >= var49_86) {
                        var8_8.setVisibility(0);
                        var26_45 = new StringBuilder(var10_10);
                        var26_45.append(var4_4);
                        var26_45.append((String)var7_7);
                        var17_19 = var26_45.toString();
                        var8_8.setText((CharSequence)var17_19);
                    }
                    var17_19 = tr2_2.a;
                    var17_19 = var3_3.c;
                    var42_68 = tr2_2.j(var17_19.c9());
                    if ((var42_68 != 0 || (var42_68 = tr2_2.m()) != 0) && (var42_68 = var17_19.u7()) == 0 && (var42_68 = var17_19.S5()) != 0) {
                        var42_68 = tr2_2.m();
                        var7_7 = var42_68 != 0 ? tr2_2.c() : tr2_2.d().q;
                        var8_8 = new da$a();
                        var8_8.k = true;
                        var8_8.b = var49_86 = R$drawable.ic_sale_default;
                        var8_8.c = var49_86;
                        var8_8.n = var7_7;
                        var8_8.u = var9_9 /* !! */ ;
                        var8_8.a();
                        var42_68 = tr2_2.m();
                        var7_7 = var42_68 != 0 ? tr2_2.a() : tr2_2.d().i;
                        var42_68 = Color.parseColor((String)var7_7);
                        var25_41.setBackgroundColor(var42_68);
                    }
                    var7_7 = var16_16.getDescription();
                    var5_5.setText((CharSequence)var7_7);
                    var5_5 = var16_16.getTncUrl();
                    if (var5_5 != null && (var6_6 = var5_5.length()) > 0 && (var4_4 = (int)var17_19.u7()) == 0) {
                        var4_4 = 0;
                        var52_90 = 0.0f;
                        var21_30.setVisibility(0);
                        var17_19 = new jd_0((Kd$a)var3_3, (BankOfferItem)var16_16);
                        var21_30.setOnClickListener((View.OnClickListener)var17_19);
                    } else {
                        var53_92 = 8;
                        var21_30.setVisibility(var53_92);
                    }
                }
            } else {
                var6_6 = var1_1 instanceof Kd$c;
                if (var6_6 != 0 && (var17_20 = ((AllOfferMerge)var16_16.get(var2_2)).getBankOffers()) != null) {
                    var3_3 = (Kd$c)var1_1;
                    var3_3.getClass();
                    Intrinsics.checkNotNullParameter(var17_20, (String)var14_14);
                    var6_6 = 0;
                    var16_16 = var17_20.get(0);
                    Intrinsics.checkNotNullExpressionValue(var16_16, (String)var11_11);
                    var16_16 = (BankOfferItem)var16_16;
                    var5_5 = var3_3.itemView;
                    var43_72 = R$id.offer_desc;
                    var5_5 = (AjioTextView)var5_5.findViewById(var43_72);
                    var8_8 = var3_3.itemView;
                    var20_28 = R$id.total_coupons;
                    var8_8 = (AjioTextView)var8_8.findViewById(var20_28);
                    var21_30 = var3_3.itemView;
                    var48_84 = R$id.terms_conditions;
                    var21_30 = (AjioTextView)var21_30.findViewById(var48_84);
                    var9_9 /* !! */  = var3_3.itemView;
                    var24_38 = R$id.coupon_image;
                    var9_9 /* !! */  = (AjioImageView)var9_9 /* !! */ .findViewById(var24_38);
                    var25_42 = var3_3.itemView;
                    var49_87 = R$id.coupon_item;
                    var25_42 = var25_42.findViewById(var49_87);
                    var27_50 = false;
                    var15_15 = null;
                    var26_46 = new rd_0(var3_3, 0);
                    var8_8.setOnClickListener((View.OnClickListener)var26_46);
                    var26_46 = new sd_0((Kd$c)var3_3);
                    var25_42.setOnClickListener((View.OnClickListener)var26_46);
                    var4_4 = var17_20.size();
                    var49_87 = 1;
                    if ((var4_4 -= var49_87) >= var49_87) {
                        var8_8.setVisibility(0);
                        var26_46 = new StringBuilder(var10_10);
                        var26_46.append(var4_4);
                        var26_46.append((String)var7_7);
                        var17_20 = var26_46.toString();
                        var8_8.setText((CharSequence)var17_20);
                    }
                    var17_20 = var16_16.getDescription();
                    var5_5.setText((CharSequence)var17_20);
                    var17_20 = tr2_2.a;
                    var17_20 = var3_3.c;
                    var6_6 = tr2_2.j(var17_20.c9());
                    if ((var6_6 != 0 || (var6_6 = tr2_2.m()) != 0) && (var6_6 = var17_20.u7()) == 0 && (var6_6 = (int)var17_20.S5()) != 0) {
                        var6_6 = (int)tr2_2.m();
                        var5_5 = var6_6 != 0 ? tr2_2.c() : tr2_2.d().q;
                        var7_7 = new da$a();
                        var44_75 = 1.4E-45f;
                        var7_7.k = true;
                        var7_7.b = var43_72 = R$drawable.ic_sale_default;
                        var7_7.c = var43_72;
                        var7_7.n = var5_5;
                        var7_7.u = var9_9 /* !! */ ;
                        var7_7.a();
                        var6_6 = (int)tr2_2.m();
                        var5_5 = var6_6 != 0 ? tr2_2.a() : tr2_2.d().i;
                        var6_6 = Color.parseColor((String)var5_5);
                        var25_42.setBackgroundColor(var6_6);
                    }
                    if ((var5_5 = var16_16.getTncUrl()) != null && (var6_6 = var5_5.length()) > 0 && (var4_4 = (int)var17_20.u7()) == 0) {
                        var4_4 = 0;
                        var52_91 = 0.0f;
                        var17_20 = null;
                        var21_30.setVisibility(0);
                        var5_5 = new td_0(0, var16_16, var3_3);
                        var21_30.setOnClickListener((View.OnClickListener)var5_5);
                    } else {
                        var53_93 = 8;
                        var21_30.setVisibility(var53_93);
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        int n4;
        kd_0 kd_02 = this;
        Object object = viewGroup;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        yi2_1 yi2_12 = this.d;
        t82_0 t82_02 = this.c;
        cq1_2 cq1_22 = this.b;
        int n8 = 1;
        ArrayList arrayList = this.a;
        String string2 = "inflate(...)";
        int n10 = this.f;
        if (n3 == n10 && (n4 = arrayList.size()) == n8) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n14 = R$layout.bank_offer_merge_item;
            object = layoutInflater.inflate(n14, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            recyclerView$B = new Kd$c(cq1_22, t82_02, yi2_12, (View)object);
        } else {
            int n15;
            n4 = kd_02.g;
            if (n7 == n4 && (n15 = arrayList.size()) == n8) {
                yi2_12 = LayoutInflater.from((Context)viewGroup.getContext());
                int n16 = R$layout.offers_merge_coupon_item;
                View view = yi2_12.inflate(n16, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(view, string2);
                yi2_1 yi2_13 = kd_02.d;
                object = kd_02.e;
                cq1_2 cq1_23 = kd_02.b;
                t82_0 t82_03 = kd_02.c;
                RecyclerView$B recyclerView$B2 = recyclerView$B;
                recyclerView$B = new Kd$d(view, cq1_23, t82_03, yi2_13, (t30_0)object);
            } else if (n7 == n10) {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n15 = R$layout.half_bank_offer_item;
                object = layoutInflater.inflate(n15, object, false);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                recyclerView$B = new Kd$a(cq1_22, t82_02, yi2_12, (View)object);
            } else {
                yi2_12 = LayoutInflater.from((Context)viewGroup.getContext());
                int n17 = R$layout.half_coupon_merge_item;
                View view = yi2_12.inflate(n17, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(view, string2);
                yi2_1 yi2_14 = kd_02.d;
                t30_0 t30_02 = kd_02.e;
                cq1_2 cq1_24 = kd_02.b;
                t82_0 t82_04 = kd_02.c;
                recyclerView$B = new Kd$b(view, cq1_24, t82_04, yi2_14, t30_02);
            }
        }
        return recyclerView$B;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.e.d();
    }
}

