/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Html
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.ProductPromotion;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.StringsKt;

public final class h32
extends RecyclerView$f
implements yA2 {
    public final t82_0 a;
    public final List b;
    public final zi2_1 c;
    public final boolean d;
    public final yi2_1 e;
    public final sj2_0 f;
    public final t30_0 g;
    public final int h;
    public boolean i;
    public double j;
    public boolean k;
    public o62_0 l;

    public h32(t82_0 object, ArrayList arrayList, zi2_1 zi2_12, boolean bl2, yi2_1 yi2_12, sj2_0 sj2_02) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(zi2_12, "pdpInfoSetter");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        this.a = object;
        this.b = arrayList;
        this.c = zi2_12;
        this.d = bl2;
        this.e = yi2_12;
        this.f = sj2_02;
        this.g = object = new t30_0();
        this.h = n3 = ok1_1.b((float)hv3_0.F() * 0.9f);
    }

    public final void G(boolean bl2) {
        this.c.G(bl2);
        this.i = bl2;
    }

    public final boolean b() {
        return this.k;
    }

    public final boolean c() {
        return this.i;
    }

    public final double f() {
        return this.j;
    }

    public final int getItemCount() {
        int n3;
        List list = this.b;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block76: {
            block81: {
                block82: {
                    block83: {
                        block80: {
                            block78: {
                                block79: {
                                    block77: {
                                        var3_3 = this;
                                        var4_4 = var2_2;
                                        var5_5 = 1;
                                        var6_6 = var1_1;
                                        var6_6 = (f32)var1_1;
                                        Intrinsics.checkNotNullParameter(var6_6, "viewHolder");
                                        var7_7 = this.b;
                                        if (var7_7 == null) break block76;
                                        var8_8 = (ProductPromotion)var7_7.get(var2_2);
                                        var6_6.getClass();
                                        var9_9 = "productPromotion";
                                        Intrinsics.checkNotNullParameter(var8_8, (String)var9_9);
                                        var6_6.s = var8_8;
                                        var10_10 = var6_6.getAdapterPosition();
                                        var11_11 = 0;
                                        var12_12 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams";
                                        var13_13 = 8;
                                        if (var10_10 == 0) {
                                            var14_14 = var6_6.itemView.getLayoutParams();
                                            Intrinsics.checkNotNull(var14_14, (String)var12_12);
                                            var14_14 = (RecyclerView$LayoutParams)var14_14;
                                            var14_14.setMargins(0, 0, 0, 0);
                                        } else {
                                            var14_14 = var6_6.itemView.getLayoutParams();
                                            Intrinsics.checkNotNull(var14_14, (String)var12_12);
                                            var14_14 = (RecyclerView$LayoutParams)var14_14;
                                            var15_15 /* !! */  = mz3_0.d(var13_13);
                                            var14_14.setMargins(0, var15_15 /* !! */ , 0, 0);
                                        }
                                        var14_14 = var8_8.getTitle();
                                        var10_10 = (int)TextUtils.isEmpty((CharSequence)var14_14);
                                        var15_15 /* !! */  = 32;
                                        var16_16 = 4.5E-44f;
                                        var17_17 = var6_6.i;
                                        if (var10_10 == 0) {
                                            var17_17.setVisibility(0);
                                            var14_14 = var8_8.getTitle();
                                            if (var14_14 != null) {
                                                var18_18 = var14_14.length() - var5_5;
                                                var19_19 = 0;
                                                var20_20 = null;
                                                var21_21 = 0;
                                                var22_22 = null;
                                                while (var19_19 <= var18_18) {
                                                    var23_23 = var21_21 == 0 ? var19_19 : var18_18;
                                                    if ((var23_23 = Intrinsics.compare(var14_14.charAt(var23_23), var15_15 /* !! */ )) <= 0) {
                                                        var23_23 = 1;
                                                    } else {
                                                        var23_23 = 0;
                                                        var24_24 = null;
                                                    }
                                                    if (var21_21 == 0) {
                                                        if (var23_23 == 0) {
                                                            var21_21 = 1;
                                                            continue;
                                                        }
                                                        var19_19 += var5_5;
                                                        continue;
                                                    }
                                                    if (var23_23 == 0) break;
                                                    var18_18 += -1;
                                                }
                                                var14_14 = com.jio.jioads.adinterfaces.a.a(var18_18, var5_5, var19_19, (String)var14_14);
                                            } else {
                                                var10_10 = 0;
                                                var14_14 = null;
                                            }
                                            var14_14 = hv3_0.f((String)var14_14);
                                            var17_17.setText((CharSequence)var14_14);
                                            var17_17.setClickable((boolean)var5_5);
                                            var14_14 = new d32_0((f32)var6_6);
                                            var17_17.setMovementMethod((MovementMethod)var14_14);
                                        } else {
                                            var17_17.setVisibility(var13_13);
                                        }
                                        var14_14 = var6_6.e;
                                        var17_17 = var6_6.k;
                                        if (var14_14 == null || (var23_23 = var14_14.u7()) != var5_5) break block77;
                                        var17_17.setVisibility(var13_13);
                                        break block78;
                                    }
                                    var24_24 = var8_8.getDescription();
                                    var23_23 = (int)TextUtils.isEmpty((CharSequence)var24_24);
                                    if (var23_23 != 0) break block78;
                                    var23_23 = var6_6.t;
                                    if (var23_23 != 0) {
                                        var24_24 = Html.fromHtml((String)var8_8.getDescription());
                                        var25_25 = new SpannableString((CharSequence)var24_24);
                                        if (var24_24 != null) {
                                            var20_20 = "View All Products";
                                            var21_21 = 6;
                                            var19_19 = StringsKt.O((CharSequence)var24_24, var20_20, 0, false, var21_21);
                                            if (var19_19 <= 0) {
                                                var20_20 = "View Products";
                                                var19_19 = StringsKt.O((CharSequence)var24_24, var20_20, 0, false, var21_21);
                                            }
                                            if (var19_19 > 0) {
                                                var26_26 = R$color.bg_color_accent_3;
                                                var13_13 = hv3_0.m(var26_26);
                                                var22_22 = new ForegroundColorSpan(var13_13);
                                                var13_13 = var24_24.length();
                                                var23_23 = 33;
                                                var25_25.setSpan((Object)var22_22, var19_19, var13_13, var23_23);
                                            }
                                        }
                                        var13_13 = var25_25.length() - var5_5;
                                        var23_23 = 0;
                                        var24_24 = null;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        while (var23_23 <= var13_13) {
                                            var21_21 = var19_19 == 0 ? var23_23 : var13_13;
                                            if ((var21_21 = Intrinsics.compare(var25_25.charAt(var21_21), var15_15 /* !! */ )) <= 0) {
                                                var21_21 = 1;
                                            } else {
                                                var21_21 = 0;
                                                var22_22 = null;
                                            }
                                            if (var19_19 == 0) {
                                                if (var21_21 == 0) {
                                                    var19_19 = 1;
                                                    continue;
                                                }
                                                var23_23 += var5_5;
                                                continue;
                                            }
                                            if (var21_21 == 0) break;
                                            var13_13 += -1;
                                        }
                                        var27_27 = var25_25.subSequence(var23_23, var13_13 += var5_5);
                                        var24_24 = TextView.BufferType.SPANNABLE;
                                        var17_17.setText((CharSequence)var27_27, (TextView.BufferType)var24_24);
                                    } else {
                                        var27_27 = var8_8.getDescription();
                                        if (var27_27 != null) {
                                            var23_23 = var27_27.length() - var5_5;
                                            var18_18 = 0;
                                            var25_25 = null;
                                            var19_19 = 0;
                                            var20_20 = null;
                                            while (var18_18 <= var23_23) {
                                                var21_21 = var19_19 == 0 ? var18_18 : var23_23;
                                                if ((var21_21 = Intrinsics.compare(var27_27.charAt(var21_21), var15_15 /* !! */ )) <= 0) {
                                                    var21_21 = 1;
                                                } else {
                                                    var21_21 = 0;
                                                    var22_22 = null;
                                                }
                                                if (var19_19 == 0) {
                                                    if (var21_21 == 0) {
                                                        var19_19 = 1;
                                                        continue;
                                                    }
                                                    var18_18 += var5_5;
                                                    continue;
                                                }
                                                if (var21_21 == 0) break;
                                                var23_23 += -1;
                                            }
                                            var27_27 = com.jio.jioads.adinterfaces.a.a(var23_23, var5_5, var18_18, (String)var27_27);
                                        } else {
                                            var13_13 = 0;
                                            var27_27 = null;
                                        }
                                        var27_27 = hv3_0.f((String)var27_27);
                                        var17_17.setText((CharSequence)var27_27);
                                    }
                                    var17_17.setClickable((boolean)var5_5);
                                    var27_27 = var8_8.getDetailsURL();
                                    var13_13 = (int)TextUtils.isEmpty((CharSequence)var27_27);
                                    if (var13_13 != 0) break block79;
                                    var12_12 = new c32_0((f32)var6_6, (ProductPromotion)var8_8);
                                    var17_17.setOnClickListener((View.OnClickListener)var12_12);
                                    break block78;
                                }
                                var27_27 = var8_8.getDescription();
                                if (var27_27 == null) ** GOTO lbl-1000
                                var23_23 = var27_27.length() - var5_5;
                                var18_18 = 0;
                                var25_25 = null;
                                var19_19 = 0;
                                var20_20 = null;
                                while (var18_18 <= var23_23) {
                                    var21_21 = var19_19 == 0 ? var18_18 : var23_23;
                                    if ((var21_21 = Intrinsics.compare(var27_27.charAt(var21_21), var15_15 /* !! */ )) <= 0) {
                                        var21_21 = 1;
                                    } else {
                                        var21_21 = 0;
                                        var22_22 = null;
                                    }
                                    if (var19_19 == 0) {
                                        if (var21_21 == 0) {
                                            var19_19 = 1;
                                            continue;
                                        }
                                        var18_18 += var5_5;
                                        continue;
                                    }
                                    if (var21_21 == 0) break;
                                    var23_23 += -1;
                                }
                                if ((var27_27 = com.jio.jioads.adinterfaces.a.a(var23_23, var5_5, var18_18, (String)var27_27)) != null && (var13_13 = (int)StringsKt.F((CharSequence)var27_27, (CharSequence)(var24_24 = hv3_0.K(var23_23 = R$string.pdp_bundleoffer_description)), false)) == var5_5) {
                                    var27_27 = var8_8.getDescription();
                                    if (var27_27 != null) {
                                        var23_23 = var27_27.length() - var5_5;
                                        var18_18 = 0;
                                        var25_25 = null;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        while (var18_18 <= var23_23) {
                                            var21_21 = var19_19 == 0 ? var18_18 : var23_23;
                                            if ((var21_21 = Intrinsics.compare(var27_27.charAt(var21_21), var15_15 /* !! */ )) <= 0) {
                                                var21_21 = 1;
                                            } else {
                                                var21_21 = 0;
                                                var22_22 = null;
                                            }
                                            if (var19_19 == 0) {
                                                if (var21_21 == 0) {
                                                    var19_19 = 1;
                                                    continue;
                                                }
                                                var18_18 += var5_5;
                                                continue;
                                            }
                                            if (var21_21 == 0) break;
                                            var23_23 += -1;
                                        }
                                        var12_12 = com.jio.jioads.adinterfaces.a.a(var23_23, var5_5, var18_18, (String)var27_27);
                                    } else {
                                        var15_15 /* !! */  = 0;
                                        var16_16 = 0.0f;
                                        var12_12 = null;
                                    }
                                    var27_27 = new SpannableString((CharSequence)var12_12);
                                    var17_17.setText((CharSequence)var27_27);
                                    var12_12 = LinkMovementMethod.getInstance();
                                    var17_17.setMovementMethod((MovementMethod)var12_12);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var12_12 = new e32((f32)var6_6, (ProductPromotion)var8_8);
                                    var17_17.setMovementMethod((MovementMethod)var12_12);
                                }
                            }
                            var12_12 = var8_8.getTermsLink();
                            var15_15 /* !! */  = (int)TextUtils.isEmpty((CharSequence)var12_12);
                            var27_27 = var6_6.j;
                            if (var15_15 /* !! */  == 0 && (var14_14 == null || (var15_15 /* !! */  = (int)var14_14.u7()) != var5_5)) {
                                var27_27.setVisibility(0);
                            } else {
                                var15_15 /* !! */  = 8;
                                var16_16 = 1.1E-44f;
                                var27_27.setVisibility(var15_15 /* !! */ );
                            }
                            var8_8 = var8_8.getCode();
                            var12_12 = hv3_0.K(R$string.acc_teams_condition);
                            var17_17 = new StringBuilder();
                            var17_17.append((String)var8_8);
                            var17_17.append((String)var12_12);
                            var17_17.append(" index ");
                            var17_17.append(var4_4);
                            var8_8 = var17_17.toString();
                            var27_27.setContentDescription((CharSequence)var8_8);
                            var8_8 = var6_6.b;
                            var15_15 /* !! */  = (int)var8_8.b();
                            var13_13 = 0;
                            var27_27 = null;
                            var28_28 = 0.0;
                            if (var15_15 /* !! */  == 0) break block80;
                            var30_29 = var8_8.f();
                            cfr_temp_0 = var30_29 - var28_28;
                            var15_15 /* !! */  = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                            if (var15_15 /* !! */  != 0) {
                                var12_12 = var6_6.s;
                                if (var12_12 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                                    var15_15 /* !! */  = 0;
                                    var16_16 = 0.0f;
                                    var12_12 = null;
                                }
                                if ((var15_15 /* !! */  = (int)((cfr_temp_1 = (var16_16 = var12_12.getMaxSavingPrice()) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                                    var15_15 /* !! */  = 1;
                                    var16_16 = 1.4E-45f;
                                } else {
                                    var15_15 /* !! */  = 0;
                                    var16_16 = 0.0f;
                                    var12_12 = null;
                                }
                                var8_8.G((boolean)var15_15 /* !! */ );
                            }
                            if ((var32_31 = var8_8.c()) != 0) {
                                var8_8 = tr2_2.a;
                                var32_31 = (int)tr2_2.j(var14_14.c9());
                                if ((var32_31 != 0 || (var32_31 = (int)tr2_2.m()) != 0) && (var32_31 = var6_6.getAdapterPosition()) == 0 && (var32_31 = (int)var14_14.u7()) == 0 && (var32_31 = (int)var14_14.S5()) != 0) {
                                    var6_6.x();
                                } else {
                                    var6_6.w(var4_4);
                                }
                            } else {
                                var6_6.y();
                            }
                            break block81;
                        }
                        var15_15 /* !! */  = var6_6.getAdapterPosition();
                        if (var15_15 /* !! */  != 0) break block82;
                        var12_12 = var6_6.s;
                        if (var12_12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                            var15_15 /* !! */  = 0;
                            var16_16 = 0.0f;
                            var12_12 = null;
                        }
                        if ((var15_15 /* !! */  = (int)((cfr_temp_2 = (var16_16 = var12_12.getMaxSavingPrice()) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) <= 0 || (var15_15 /* !! */  = (int)var8_8.c()) == 0) break block82;
                        var30_30 = var8_8.f();
                        cfr_temp_3 = var30_30 - var28_28;
                        var15_15 /* !! */  = (int)(cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                        if (var15_15 /* !! */  == 0) break block83;
                        var12_12 = var6_6.s;
                        if (var12_12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                            var15_15 /* !! */  = 0;
                            var16_16 = 0.0f;
                            var12_12 = null;
                        }
                        if ((var15_15 /* !! */  = (int)((cfr_temp_4 = (var16_16 = var12_12.getMaxSavingPrice()) - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) <= 0) ** GOTO lbl-1000
                        var12_12 = var6_6.s;
                        if (var12_12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                            var15_15 /* !! */  = 0;
                            var16_16 = 0.0f;
                            var12_12 = null;
                        }
                        if ((var18_18 = (int)((cfr_temp_5 = (var33_32 = (double)(var15_15 /* !! */  = (int)Math.ceil(var16_16 = var12_12.getMaxSavingPrice()))) - (var28_28 = var8_8.f())) == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1))) < 0) {
                            var15_15 /* !! */  = 1;
                            var16_16 = 1.4E-45f;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var15_15 /* !! */  = 0;
                            var16_16 = 0.0f;
                            var12_12 = null;
                        }
                        var8_8.G((boolean)var15_15 /* !! */ );
                    }
                    if ((var32_31 = (int)var8_8.c()) != 0) {
                        var8_8 = tr2_2.a;
                        var32_31 = (int)tr2_2.j(var14_14.c9());
                        if ((var32_31 != 0 || (var32_31 = (int)tr2_2.m()) != 0) && (var32_31 = var6_6.getAdapterPosition()) == 0 && (var32_31 = (int)var14_14.u7()) == 0 && (var32_31 = (int)var14_14.S5()) != 0) {
                            var6_6.x();
                        } else {
                            var6_6.w(var4_4);
                        }
                    } else {
                        var6_6.y();
                    }
                    break block81;
                }
                var6_6.y();
            }
            var8_8 = z40_0.Companion;
            var8_8 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8).a;
            var12_12 = "pdp_new_user_offer";
            var32_31 = var8_8.g((String)var12_12);
            var15_15 /* !! */  = (int)var6_6.d;
            if (var15_15 /* !! */  == 0) {
                if (var14_14 != null) {
                    var15_15 /* !! */  = (int)var14_14.u7();
                    var12_12 = (boolean)var15_15 /* !! */ ;
                } else {
                    var15_15 /* !! */  = 0;
                    var16_16 = 0.0f;
                    var12_12 = null;
                }
                if ((var12_12 == null || (var10_10 = (int)var14_14.u7()) == 0) && var32_31 == var5_5) {
                    var35_33 = var6_6.s;
                    if (var35_33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                        var23_23 = 0;
                        var24_24 = null;
                    } else {
                        var24_24 = var35_33;
                    }
                    var35_33 = var24_24.getRestrictedToNewUser();
                    var8_8 = Boolean.TRUE;
                    var5_5 = (int)Intrinsics.areEqual(var35_33, var8_8);
                    var8_8 = var6_6.r;
                    if (var5_5 != 0) {
                        if (var8_8 != null) {
                            var8_8.setVisibility(0);
                        }
                    } else if (var8_8 != null) {
                        var5_5 = 8;
                        var8_8.setVisibility(var5_5);
                    }
                }
            }
            if ((var5_5 = (int)var3_3.d) == 0) {
                var36_34 = (ProductPromotion)var7_7.get(var4_4);
                var37_35 = k7.p();
                var35_33 = k7.s(var36_34.getEndTime());
                var39_36 = k7.t(var36_34.getTimerShowDuration());
                var4_4 = (int)hv3_0.i0((Boolean)(var36_34 = var36_34.getShowEndTimer()), (Long)(var9_9 = Long.valueOf(var39_36)), (Long)var35_33, (Long)(var14_14 = Long.valueOf(var37_35)));
                if (var4_4 != 0 && (var4_4 = (int)(var36_34 = var3_3.e).u7()) == 0) {
                    var36_34 = new Ref$LongRef();
                    if (var35_33 == null || (var13_13 = (int)((cfr_temp_6 = (var39_36 = var35_33.longValue()) - (var41_37 = 0L)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1))) != 0) {
                        Intrinsics.checkNotNull(var35_33);
                        var39_36 = var35_33.longValue();
                        var11_11 = var39_36 == var37_35 ? 0 : (var39_36 < var37_35 ? -1 : 1);
                        if (var11_11 > 0) {
                            var36_34.element = var39_36 = var35_33.longValue() - var37_35;
                        }
                    }
                    var35_33 = cp_1.Companion;
                    var35_33.getClass();
                    var5_5 = (int)cp$a.o();
                    if (var5_5 != 0) {
                        var35_33 = var6_6.h;
                        var43_38 = R$drawable.bottom_corners_rounded_accent_color_19_bg;
                        var35_33.setBackgroundResource(var43_38);
                    }
                    var35_33 = t62_0.d(TimeUnit.MILLISECONDS);
                    var7_7 = qt2_2.b;
                    var35_33 = var35_33.g((Scheduler)var7_7);
                    var7_7 = ti_2.a();
                    var35_33 = var35_33.e((HandlerScheduler)var7_7);
                    var7_7 = new g32((Ref$LongRef)var36_34, (f32)var6_6, var3_3);
                    var35_33.c((e62_0)var7_7);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        void var1_3;
        Object object2 = "parent";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.d;
        if (bl2) {
            object2 = LayoutInflater.from((Context)object.getContext());
            int n4 = R$layout.luxe_pdp_offer_row;
            View view = object2.inflate(n4, object, false);
        } else {
            object2 = this.e;
            bl2 = object2.u7();
            if (bl2) {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n7 = R$layout.pdp_offer_row_mini;
                View view = object2.inflate(n7, object, false);
            } else {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n8 = R$layout.pdp_offer_row;
                View view = object2.inflate(n8, object, false);
            }
        }
        void var5_12 = var1_3;
        Intrinsics.checkNotNull(var5_12);
        o62_0 o62_02 = this.l;
        t82_0 t82_02 = this.a;
        boolean bl3 = this.d;
        int n10 = this.h;
        yi2_1 yi2_12 = this.e;
        sj2_0 sj2_02 = this.f;
        return new f32((View)var5_12, n10, t82_02, this, o62_02, bl3, yi2_12, sj2_02);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.g.d();
    }
}

