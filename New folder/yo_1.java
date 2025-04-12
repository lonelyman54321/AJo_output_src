/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.Cart;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from YO
 */
public final class yo_1
extends RecyclerView$B {
    public final View a;
    public final boolean b;
    public final j82_0 c;
    public TextView d;
    public TextView e;
    public final NewCustomEventsRevamp f;
    public final String g;
    public final String h;
    public final ConstraintLayout i;
    public final ConstraintLayout j;
    public final AjioTextView k;
    public final AjioTextView l;

    public yo_1(j82_0 object, View view, boolean bl2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "cartClickListener");
        super(view);
        this.a = view;
        this.b = bl2;
        this.c = object;
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.f = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.g = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.h = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        int n3 = R$id.seek_barll;
        object = (AjioImageView)view.findViewById(n3);
        n3 = R$id.rvp_ajio_avg_l;
        object = (ConstraintLayout)view.findViewById(n3);
        this.i = object;
        n3 = R$id.rvp_your_avg_l;
        object = (ConstraintLayout)view.findViewById(n3);
        this.j = object;
        n3 = R$id.zero_percent_view;
        object = (AjioTextView)view.findViewById(n3);
        this.k = object;
        n3 = R$id.hundred_percent_view;
        object = (AjioTextView)view.findViewById(n3);
        this.l = object;
        n3 = R$id.layout_seek_bar;
        object = (ConstraintLayout)view.findViewById(n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(Cart var1_1) {
        block30: {
            var2_2 = this;
            var3_3 = R$id.rvp_cart_title;
            var4_4 = this.a;
            var5_5 = (TextView)var4_4.findViewById(var3_3);
            this.e = var5_5;
            var3_3 = R$id.rvp_message;
            var5_5 = (TextView)var4_4.findViewById(var3_3);
            this.d = var5_5;
            var3_3 = (int)this.b;
            if (var3_3 == 0) ** GOTO lbl18
            if (var1_1 != null) {
                var5_5 = var1_1.getRvpReturnFee();
            } else {
                while (true) {
                    var3_3 = 0;
                    var5_5 = null;
                    break block30;
                    break;
                }
lbl18:
                // 1 sources

                if (var1_1 == null) ** continue;
                var5_5 = var1_1.getPROFILE_HEALTH();
            }
        }
        var6_6 = var2_2.e;
        if (var6_6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvpCartTitle");
            var7_7 = 0;
            var8_8 = 0.0f;
            var6_6 = null;
        }
        var9_9 = "";
        if (var5_5 == null || (var10_10 = var5_5.getActionContent()) == null || (var10_10 = var10_10.getCart_section_title()) == null) {
            var10_10 = var9_9;
        }
        var6_6.setText((CharSequence)var10_10);
        if (var5_5 != null && (var6_6 = var5_5.getActionContent()) != null && (var6_6 = var6_6.getReturn_fee()) != null) {
            var8_8 = var6_6.floatValue();
            var11_11 = var7_7 = (int)var8_8;
        } else {
            var11_11 = 0;
            var10_10 = null;
        }
        if (var5_5 == null || (var6_6 = var5_5.getActionContent()) == null || (var6_6 = var6_6.getCart_section_desc()) == null) {
            var6_6 = var9_9;
        }
        if (var5_5 == null || (var12_12 = var5_5.getActionContent()) == null || (var12_12 = var12_12.getReturn_fee_banner_text()) == null) {
            var12_12 = var9_9;
        }
        if (var5_5 != null && (var13_13 = var5_5.getExtra()) != null) {
            var14_14 = var13_13.getRvpPercent();
            var15_15 /* !! */  = var5_5.getActionContent();
            if (var15_15 /* !! */  != null && (var15_15 /* !! */  = var15_15 /* !! */ .getAjio_avg_perc()) != null) {
                var16_16 = var15_15 /* !! */ .intValue();
                var17_17 = Resources.getSystem().getDisplayMetrics();
                var18_18 = var17_17.widthPixels;
                var19_19 = var2_2.k.getLayoutParams();
                var20_20 = var19_19.width;
                var21_21 = var2_2.l.getLayoutParams().width;
                var18_18 = var18_18 - var20_20 - var21_21 + -84;
                var22_22 = var2_2.i;
                var23_23 /* !! */  = var22_22.getLayoutParams();
                var24_24 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                Intrinsics.checkNotNull(var23_23 /* !! */ , (String)var24_24);
                var23_23 /* !! */  = (ConstraintLayout$LayoutParams)var23_23 /* !! */ ;
                var25_25 = var18_18 * var16_16 / 100 + var20_20;
                var26_26 = var25_25 + -100;
                if (var26_26 >= 0) {
                    var23_23 /* !! */ .setMargins(var26_26, 0, 0, 0);
                } else {
                    var23_23 /* !! */ .t = var26_26 = R$id.seek_bar_layout;
                }
                var22_22.setLayoutParams(var23_23 /* !! */ );
                var27_27 = h40_0.a;
                var26_26 = (int)h40_0.k2();
                if (var26_26 != 0) {
                    var27_27 = "ajioAvgLayout";
                    if (var16_16 <= 0) {
                        Intrinsics.checkNotNullExpressionValue((Object)var22_22, (String)var27_27);
                        ai0_2.i((View)var22_22);
                    } else {
                        Intrinsics.checkNotNullExpressionValue((Object)var22_22, (String)var27_27);
                        ai0_2.B((View)var22_22);
                    }
                }
                var27_27 = var2_2.j;
                var15_15 /* !! */  = var27_27.getLayoutParams();
                Intrinsics.checkNotNull(var15_15 /* !! */ , (String)var24_24);
                var15_15 /* !! */  = (ConstraintLayout$LayoutParams)var15_15 /* !! */ ;
                var18_18 = var18_18 * var14_14 / 100 + var20_20 + -80;
                if (var18_18 >= 0) {
                    var15_15 /* !! */ .setMargins(var18_18, 0, 0, 0);
                } else {
                    var15_15 /* !! */ .t = var28_28 = R$id.seek_bar_layout;
                }
                var27_27.setLayoutParams((ViewGroup.LayoutParams)var15_15 /* !! */ );
            }
        }
        if (var11_11 > 0) {
            var26_26 = 1;
            var29_29 = 1.4E-45f;
        } else {
            var26_26 = 0;
            var29_29 = 0.0f;
            var27_27 = null;
        }
        if (var5_5 != null && (var24_24 = var5_5.getActionContent()) != null && (var24_24 = var24_24.getReturn_fee_cta()) != null) {
            var9_9 = var24_24;
        }
        if (var26_26 == 0) {
            var4_4 = var4_4.getContext();
            var28_28 = R$string.know_more_refresh;
            var13_13 = var4_4 = var4_4.getString(var28_28);
        } else {
            var13_13 = var9_9;
        }
        if (var26_26 != 0 && (var30_30 = var12_12.length()) > 0) {
            var4_4 = String.valueOf(var11_11);
            var24_24 = "{return_fee}";
            var12_12 = var4_4 = kotlin.text.b.n((String)var12_12, (String)var24_24, (String)var4_4, false);
        } else {
            var12_12 = var6_6;
        }
        var4_4 = hv3_0.a;
        var24_24 = var2_2.d;
        if (var24_24 == null) {
            var24_24 = "rvpMessage";
            Intrinsics.throwUninitializedPropertyAccessException((String)var24_24);
            var16_16 = 0;
            var15_15 /* !! */  = null;
        } else {
            var15_15 /* !! */  = var24_24;
        }
        var18_18 = R$color.accent_color_4;
        var19_19 = new xo_1((boolean)var26_26, var2_2);
        var4_4.getClass();
        hv3_0.d0(var11_11, (String)var12_12, (String)var13_13, (TextView)var15_15 /* !! */ , var18_18, (Function0)var19_19);
        var27_27 = var2_2.g;
        var4_4 = var2_2.h;
        var24_24 = var2_2.f;
        var31_31 = "rvp alert message impression";
        var32_32 = "impression";
        var33_33 = "";
        var34_34 = "bag_interaction";
        var35_35 = "bag screen";
        var36_36 = "bag screen";
        var37_37 = 1664;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var24_24, var31_31, var32_32, var33_33, var34_34, var35_35, var36_36, (String)var27_27, null, (String)var4_4, false, null, var37_37, null);
        var27_27 = h40_0.a;
        var26_26 = (int)h40_0.k2();
        if (var26_26 != 0) {
            if (var5_5 != null && (var27_27 = var5_5.getActionContent()) != null && (var27_27 = var27_27.getReturn_fee()) != null) {
                var29_29 = var27_27.floatValue();
                var26_26 = (int)var29_29;
            } else {
                var26_26 = 0;
                var29_29 = 0.0f;
                var27_27 = null;
            }
            var27_27 = var26_26;
            var5_5 = new Pair("return_fee", var27_27);
            var26_26 = 1;
            var29_29 = 1.4E-45f;
            var27_27 = new Pair[var26_26];
            var27_27[0] = var5_5;
            var17_17 = DE.b((Pair[])var27_27);
            var15_15 /* !! */  = var2_2.g;
            var19_19 = var2_2.h;
            var21_21 = 0;
            var22_22 = null;
            var23_23 /* !! */  = null;
            var4_4 = var2_2.f;
            var24_24 = "rvp alert message impression";
            var6_6 = "impression";
            var9_9 = "";
            var10_10 = "RVP_fraud_engine_response";
            var12_12 = "bag screen";
            var13_13 = "bag screen";
            var38_38 = 1536;
            var25_25 = 0;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var4_4, (String)var24_24, (String)var6_6, (String)var9_9, (String)var10_10, (String)var12_12, (String)var13_13, (String)var15_15 /* !! */ , (Bundle)var17_17, (String)var19_19, false, null, var38_38, null);
        }
    }
}

