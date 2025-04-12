/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.Spannable$Factory
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.services.data.Cart.Coupon;
import com.ril.ajio.services.data.Cart.CouponList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from hc0
 */
public final class hc0_1
extends nw_1
implements View.OnClickListener {
    public final rc0_1 a;
    public final Map b;
    public final CouponList c;
    public final RecyclerView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;

    public hc0_1(View object, rc0_1 object2, HashMap object3, CouponList couponList) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object3, "mImgMap");
        String string2 = "mCouponList";
        Intrinsics.checkNotNullParameter(couponList, string2);
        super((View)object);
        this.a = object2;
        this.b = object3;
        this.c = couponList;
        int n3 = R$id.productListRv;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.d = object2 = (RecyclerView)object2;
        n3 = R$id.eligibleProductsCountTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.e = object2;
        n3 = R$id.offerDescTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.f = object2;
        n3 = R$id.shopNow;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.g = object2;
        int n4 = R$id.couponCodeTv;
        couponList = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(couponList, (String)object3);
        couponList = (TextView)couponList;
        this.h = couponList;
        n4 = R$id.couponInfoTv;
        couponList = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(couponList, (String)object3);
        couponList = (TextView)couponList;
        this.i = couponList;
        n4 = R$id.eligibleItemsContainer;
        couponList = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(couponList, (String)object3);
        this.j = couponList;
        n4 = R$id.tnc;
        couponList = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(couponList, (String)object3);
        couponList = (TextView)couponList;
        int n7 = R$id.couponDetailsContainer;
        object = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (ConstraintLayout)((Object)object);
        object2.setOnClickListener((View.OnClickListener)this);
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            n3 = couponList.getPaintFlags() | 8;
            couponList.setPaintFlags(n3);
        }
        if ((n3 = (int)(km_1.b((cp$a)(object2 = cp_1.Companion)) ? 1 : 0)) == 0) {
            n3 = 0x3F000000;
            float f5 = 0.5f;
            object.setAlpha(f5);
        }
    }

    public static void x(TextView textView, String string2, int n3, int n4) {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        int n7 = 10;
        aJIOApplication = mz3_0.t(aJIOApplication, n7);
        String string3 = "";
        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)aJIOApplication);
        if (n3 >= 0 && n4 > n3) {
            aJIOApplication = Spannable.Factory.getInstance();
            string2 = aJIOApplication.newSpannable(string2);
            int n8 = 33;
            string2.setSpan((Object)ajioCustomTypefaceSpan, n3, n4, n8);
            textView.setText((CharSequence)string2);
        } else {
            textView.setText((CharSequence)string2);
        }
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.shopNow;
        if (n3 == n4) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.Coupon");
            object = (Coupon)object;
            object2 = bv2_0.Companion;
            Object object3 = kv2_0.PLP_COUPON;
            object2.getClass();
            bv2_0.a2 = object3;
            object3 = ((Coupon)object).getVoucherCode();
            object2.getClass();
            bv2_0.Z1 = object3;
            object2 = this.a;
            if (object2 != null) {
                object2.J5((Coupon)object);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(List var1_1, List var2_2, int var3_3) {
        block27: {
            block26: {
                var4_4 = this;
                var5_5 = 2;
                var6_6 = 0;
                var7_7 = 1;
                if (var1_1 == null || var2_2 == null) break block27;
                var8_8 = var1_1;
                var8_8 = (ArrayList)var1_1;
                var9_9 = var8_8.isEmpty();
                if (var9_9 != 0) {
                    var10_10 = var3_3 + -1;
                } else {
                    var9_9 = var3_3 + -3;
                    var10_10 = var8_8.size();
                    var10_10 = var9_9 - var10_10;
                }
                var11_11 = var2_2;
                var11_11 = (ArrayList)var2_2;
                var12_12 = (Coupon)var11_11.get(var10_10);
                if (var12_12 == null) {
                    return;
                }
                var13_13 /* !! */  = var4_4.g;
                var13_13 /* !! */ .setTag(var12_12);
                var15_15 = var4_4.itemView.getContext();
                var14_14 /* !! */  = new LinearLayoutManager((Context)var15_15, 0, false);
                var15_15 = var4_4.d;
                var15_15.setLayoutManager((RecyclerView$o)var14_14 /* !! */ );
                var14_14 /* !! */  = hv3_0.K(R$string.coupon_not_applicable_text);
                var15_15.setContentDescription((CharSequence)var14_14 /* !! */ );
                var14_14 /* !! */  = var12_12.getVoucherCode();
                var16_16 = TextUtils.isEmpty((CharSequence)var14_14 /* !! */ );
                if (var16_16 == 0) {
                    var14_14 /* !! */  = var4_4.h;
                    var17_17 = var12_12.getVoucherCode();
                    var14_14 /* !! */ .setText((CharSequence)var17_17);
                    var16_16 = R$string.shop_now_txt;
                    var17_17 = var12_12.getVoucherCode();
                    var18_18 = new Object[var7_7];
                    var18_18[0] = var17_17;
                    var14_14 /* !! */  = hv3_0.L(var16_16, (Object[])var18_18);
                    var13_13 /* !! */ .setContentDescription((CharSequence)var14_14 /* !! */ );
                }
                var14_14 /* !! */  = var12_12.getVoucherName();
                var16_16 = TextUtils.isEmpty((CharSequence)var14_14 /* !! */ );
                var17_17 = "";
                if (var16_16 == 0) {
                    var14_14 /* !! */  = var12_12.getVoucherName();
                    var18_18 = "\n";
                    var14_14 /* !! */  = cP.a((String)var17_17, (String)var14_14 /* !! */ , (String)var18_18);
                } else {
                    var14_14 /* !! */  = var17_17;
                }
                var18_18 = var12_12.getVoucherDescription();
                var19_19 = TextUtils.isEmpty((CharSequence)var18_18);
                if (var19_19 == 0) {
                    var18_18 = var12_12.getVoucherDescription();
                    var14_14 /* !! */  = Ft2.a((String)var14_14 /* !! */ , (String)var18_18);
                }
                var19_19 = TextUtils.isEmpty((CharSequence)var14_14 /* !! */ );
                var20_20 /* !! */  = var4_4.i;
                if (var19_19 == 0) {
                    var20_20 /* !! */ .setText((CharSequence)var14_14 /* !! */ );
                } else {
                    var20_20 /* !! */ .setText((CharSequence)var17_17);
                }
                var14_14 /* !! */  = var12_12.getProductsApplicable();
                var21_21 = R$string.applicable_coupon;
                var18_18 = var12_12.getCartRequiredValue();
                var22_22 = TextUtils.isEmpty((CharSequence)var18_18);
                if (var22_22 != 0) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var23_28 = 0;
                        var24_23 = null;
                        break block26;
                        break;
                    }
                }
                var20_20 /* !! */  = "0.0";
                var22_22 = kotlin.text.b.i((String)var18_18, (String)var20_20 /* !! */ , (boolean)var7_7);
                if (var22_22 != 0 || (var25_24 = kotlin.text.b.i((String)var18_18, (String)(var20_20 /* !! */  = "0"), (boolean)var7_7))) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var18_18);
                var27_26 = "\\.";
                var26_25 /* !! */  = new Regex((String)var27_26);
                var18_18 = var26_25 /* !! */ .e((CharSequence)var18_18);
                var26_25 /* !! */  = new String[]{};
                var18_18 = var18_18.toArray(var26_25 /* !! */ );
                var26_25 /* !! */  = var18_18[0];
                var28_27 = ((Object)var18_18).length;
                if (var28_27 > var7_7) {
                    var27_26 = var18_18[var7_7];
                    var28_27 = (int)TextUtils.isEmpty((CharSequence)var27_26);
                    if (var28_27 != 0) {
                        var26_25 /* !! */  = ".00";
                    } else {
                        var27_26 = var18_18[var7_7];
                        var28_27 = var27_26.length();
                        var24_23 = ".";
                        if (var28_27 > var7_7) {
                            var20_20 /* !! */  = var18_18[var7_7].substring(0, var5_5);
                            var27_26 = "substring(...)";
                            Intrinsics.checkNotNullExpressionValue(var20_20 /* !! */ , (String)var27_26);
                            var18_18[var7_7] = var20_20 /* !! */ ;
                            var26_25 /* !! */  = n1.a((String)var26_25 /* !! */ , var24_23, (String)var20_20 /* !! */ );
                        } else {
                            var18_18 = var18_18[var7_7];
                            var26_25 /* !! */  = y02.a((String)var26_25 /* !! */ , var24_23, (String)var18_18, (String)var20_20 /* !! */ );
                        }
                    }
                }
                if (var26_25 /* !! */  != null) ** break;
                ** while (true)
                var18_18 = new Object[var7_7];
                var18_18[0] = var26_25 /* !! */ ;
                var24_23 = hv3_0.L(var21_21, (Object[])var18_18);
            }
            var21_21 = var12_12.getProductsApplicableCount();
            var18_18 = var4_4.j;
            var22_22 = 8;
            if (var21_21 > 0 && (var21_21 = (int)TextUtils.isEmpty(var24_23)) == 0) {
                var18_18.setVisibility(0);
                var21_21 = (int)TextUtils.isEmpty(var24_23);
                var19_19 = 6;
                var26_25 /* !! */  = var4_4.f;
                if (var21_21 != 0) {
                    var26_25 /* !! */ .setVisibility(var22_22);
                } else {
                    var26_25 /* !! */ .setVisibility(0);
                    Intrinsics.checkNotNull(var24_23);
                    var17_17 = "\u20b9";
                    var21_21 = StringsKt.O(var24_23, (String)var17_17, 0, false, var19_19);
                    var28_27 = 4;
                    var18_18 = " ";
                    var19_19 = StringsKt.O(var24_23, (String)var18_18, var21_21, false, var28_27);
                    hc0_1.x((TextView)var26_25 /* !! */ , var24_23, var21_21, var19_19);
                }
                var17_17 = var12_12.getProductUrl();
                var21_21 = (int)TextUtils.isEmpty((CharSequence)var17_17);
                if (var21_21 != 0) {
                    var13_13 /* !! */ .setVisibility(var22_22);
                } else {
                    var13_13 /* !! */ .setVisibility(0);
                }
                Intrinsics.checkNotNull(var14_14 /* !! */ );
                var17_17 = new ArrayList<String[]>();
                var19_19 = var14_14 /* !! */ .length;
                var24_23 = null;
                for (var23_28 = 0; var23_28 < var19_19; var23_28 += var7_7) {
                    var26_25 /* !! */  = var14_14 /* !! */ [var23_28];
                    var27_26 = var4_4.b;
                    var26_25 /* !! */  = var27_26.get(var26_25 /* !! */ );
                    var17_17.add(var26_25 /* !! */ );
                }
                var13_13 /* !! */  = new ic0_1(var17_17);
                var15_15.setAdapter((RecyclerView$f)var13_13 /* !! */ );
                var29_29 = R$string.eligible_coupon;
                var12_12 = var12_12.getProductsApplicableCount();
                var16_16 = var4_4.c.getCartItemsQty();
                var14_14 /* !! */  = var16_16;
                var30_30 /* !! */  = new Object[var5_5];
                var30_30 /* !! */ [0] = var12_12;
                var30_30 /* !! */ [var7_7] = var14_14 /* !! */ ;
                var30_30 /* !! */  = hv3_0.L(var29_29, var30_30 /* !! */ );
                var12_12 = "items";
                var29_29 = 6;
                var31_31 = StringsKt.O((CharSequence)var30_30 /* !! */ , (String)var12_12, 0, false, var29_29);
                var13_13 /* !! */  = var4_4.e;
                hc0_1.x(var13_13 /* !! */ , (String)var30_30 /* !! */ , 0, var31_31);
            } else {
                var18_18.setVisibility(var22_22);
            }
            var5_5 = (int)og1_1.b();
            if (var5_5 != 0) {
                var5_5 = var11_11.size() - var7_7;
                if (var10_10 < var5_5) {
                    var30_30 /* !! */  = var4_4.itemView;
                    var7_7 = R$id.couponDivider;
                    var30_30 /* !! */  = var30_30 /* !! */ .findViewById(var7_7);
                    var30_30 /* !! */ .setVisibility(0);
                } else {
                    var30_30 /* !! */  = var4_4.itemView;
                    var6_6 = R$id.couponDivider;
                    var30_30 /* !! */  = var30_30 /* !! */ .findViewById(var6_6);
                    var30_30 /* !! */ .setVisibility(var22_22);
                }
            }
        }
    }
}

