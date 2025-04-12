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
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CouponNudgeData;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from SM
 */
public final class sm_2
extends RecyclerView$B
implements View.OnClickListener {
    public final j82_0 a;
    public final TextView b;
    public final TextView c;
    public final ConstraintLayout d;
    public final TextView e;
    public boolean f;
    public final RelativeLayout g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final hh3_2 k;

    public sm_2(View object, j82_0 object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        String string2 = "onCartClickListener";
        Intrinsics.checkNotNullParameter(object2, string2);
        super((View)object);
        this.a = object2;
        super();
        object = yr1_2.b((Function0)object);
        this.k = object;
        object = this.itemView;
        object2 = "itemView";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = R$id.couponContainer;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.couponTextTv;
        object2 = (TextView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.changeCoupon;
        object2 = (TextView)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.couponSavingTv;
        object2 = (TextView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.couponNudgeLayout;
        object2 = (RelativeLayout)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.couponNudgeIv;
        object2 = (ImageView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.couponNudgeTitleTv;
        object2 = (TextView)object.findViewById(n3);
        this.i = object2;
        n3 = R$id.couponNudgeDescTv;
        object = (TextView)object.findViewById(n3);
        this.j = object;
        object = this.d;
        n3 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowCoupon");
            bl2 = false;
            object = null;
        }
        ai0_2.t(object);
        bl2 = og1_1.b();
        string2 = "couponChange";
        if (bl2) {
            int n4;
            TextView textView;
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            if ((textView = this.b) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                textView = null;
            }
            n4 = textView.getPaintFlags() | 8;
            object.setPaintFlags(n4);
        }
        if ((object = this.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        object2.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.couponContainer;
        if (n3 == n4 || n3 == (n4 = R$id.changeCoupon)) {
            object = this.a;
            n4 = (int)(this.f ? 1 : 0);
            object.X5(n4 != 0);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(Object var1_1) {
        block45: {
            var2_2 = this;
            var3_3 = var1_1;
            var4_4 /* !! */  = this.d;
            var5_5 = 2;
            var6_6 = this.g;
            var7_7 = this.c;
            var8_8 = 1;
            var9_9 = this.e;
            var10_10 = this.b;
            var11_11 = var1_1 instanceof Cart;
            if (!var11_11) break block45;
            var3_3 = (Cart)var1_1;
            var12_12 = z40_0.Companion;
            var12_12 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var12_12).a;
            var13_13 = "enable_coupon_nudge_view";
            var11_11 = var12_12.a((String)var13_13);
            var14_14 = 8;
            var15_15 = "couponNudgeLayout";
            if (!var11_11) ** GOTO lbl-1000
            var12_12 = this.k.getValue();
            var16_16 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(var12_12, (String)var16_16);
            var12_12 = (UserInformation)var12_12;
            var11_11 = var12_12.isUserOnline();
            if (!var11_11) ** GOTO lbl-1000
            var16_16 = AJIOApplication$a.a();
            var12_12 = new jo_2((Context)var16_16);
            var11_11 = kotlin.text.b.i((String)(var12_12 = var12_12.f()), (String)(var16_16 = "New"), (boolean)var8_8);
            if (var11_11) lbl-1000:
            // 2 sources

            {
                if (var3_3 != null) {
                    var12_12 = var3_3.getCouponNudgeData();
                } else {
                    var11_11 = false;
                    var12_12 = null;
                }
                if (var12_12 == null) {
                    var12_12 = z40$a.a((Context)AJIOApplication$a.a()).a.b("coupon_nudge_data");
                    var16_16 = CouponNudgeData.class;
                    var12_12 = Z90.a((Class)var16_16, (String)var12_12);
                }
                var16_16 = (var12_12 = (CouponNudgeData)var12_12) != null ? var12_12.getTitle() : null;
                if (var12_12 != null) {
                    var17_17 = var12_12.getSubTitle();
                } else {
                    var18_18 = 0;
                    var17_17 = null;
                }
                if (var12_12 != null) {
                    var12_12 = var12_12.getImageUrl();
                } else {
                    var11_11 = false;
                    var12_12 = null;
                }
                if (var16_16 != null && var17_17 != null && var12_12 != null) {
                    var19_19 = var2_2.i;
                    if (var19_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("couponNudgeTitleTv");
                        var20_20 = 0;
                        var19_19 = null;
                    }
                    var19_19.setText((CharSequence)var16_16);
                    var19_19 = var2_2.j;
                    if (var19_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("couponNudgeDescTv");
                        var20_20 = 0;
                        var19_19 = null;
                    }
                    var19_19.setText((CharSequence)var17_17);
                    var19_19 = new da$a();
                    var19_19.k = var8_8;
                    var19_19.g = var8_8;
                    var16_16 = var2_2.h;
                    if (var16_16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("couponNudgeIv");
                        var16_16 = null;
                    }
                    var19_19.n = var12_12;
                    var19_19.u = var16_16;
                    var19_19.a();
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var21_21 = 0;
                        var22_22 = 0.0f;
                        var6_6 = null;
                    }
                    var6_6.setVisibility(0);
                    var6_6 = AnalyticsManager.Companion.getInstance();
                    var19_19 = var6_6.getGtmEvents();
                    var23_23 = "Bag screen";
                    var15_15 = "widget interaction";
                    var16_16 = "widget_view_offer_widget";
                    var17_17 = "offer widget view";
                    var24_24 = "";
                    var25_25 = 32;
                    GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)var19_19, var15_15, (String)var16_16, (String)var17_17, var24_24, var23_23, null, var25_25, null);
                }
            } else lbl-1000:
            // 2 sources

            {
                if (var6_6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                    var21_21 = 0;
                    var22_22 = 0.0f;
                    var6_6 = null;
                }
                var6_6.setVisibility(var14_14);
            }
            if ((var6_6 = var3_3.getAppliedVouchers()) != null) {
                var21_21 = var6_6.size();
            } else {
                var21_21 = 0;
                var22_22 = 0.0f;
                var6_6 = null;
            }
            var12_12 = "rowCoupon";
            var19_19 = "couponTv";
            var15_15 = "couponAmount";
            var16_16 = "couponChange";
            if (var21_21 <= 0 || (var21_21 = (int)TextUtils.isEmpty((CharSequence)(var6_6 = ((CartAppliedVoucher)var3_3.getAppliedVouchers().get(0)).getVoucherCode()))) != 0) ** GOTO lbl-1000
            var6_6 = var3_3.getVoucherAmount();
            var18_18 = 0;
            var17_17 = null;
            if (var6_6 != null && (var6_6 = var6_6.getValue()) != null) {
                var22_22 = Float.parseFloat((String)var6_6);
            } else {
                var21_21 = 0;
                var22_22 = 0.0f;
                var6_6 = null;
            }
            var21_21 = (int)((cfr_temp_0 = var22_22 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var21_21 > 0 || (var21_21 = (int)var3_3.isFreeGiftApplicable()) != 0) {
                var6_6 = StringCompanionObject.INSTANCE;
                var6_6 = hv3_0.K(R$string.cart_coupon_refresh);
                var13_13 = ((CartAppliedVoucher)var3_3.getAppliedVouchers().get(0)).getVoucherCode();
                var17_17 = new Object[var5_5];
                var17_17[0] = var6_6;
                var17_17[var8_8] = var13_13;
                var6_6 = "%s%s";
                var13_13 = "format(...)";
                var26_27 = xh2_0.a((Object[])var17_17, var5_5, (String)var6_6, (String)var13_13);
                var21_21 = (int)og1_1.b();
                if (var21_21 != 0) {
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                        var7_7 = null;
                    }
                    var7_7.setText((CharSequence)var26_27);
                } else {
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                        var7_7 = null;
                    }
                    var13_13 = AJIOApplication$a.a();
                    var20_20 = 10;
                    var13_13 = mz3_0.t((AJIOApplication)var13_13, var20_20);
                    var19_19 = "";
                    var6_6 = new AjioCustomTypefaceSpan((String)var19_19, (Typeface)var13_13);
                    var13_13 = hv3_0.K(R$string.cart_coupon_refresh);
                    var14_14 = var13_13.length() - var8_8;
                    if (var14_14 >= 0 && (var20_20 = var26_27.length()) > 0) {
                        var17_17 = Spannable.Factory.getInstance();
                        var26_27 = var17_17.newSpannable((CharSequence)var26_27);
                        var18_18 = 17;
                        var26_27.setSpan(var6_6, var14_14, var20_20, var18_18);
                        var7_7.setText((CharSequence)var26_27);
                    } else {
                        var7_7.setText((CharSequence)var26_27);
                    }
                }
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                    var5_5 = 0;
                    var26_27 = null;
                } else {
                    var26_27 = var10_10;
                }
                var21_21 = R$string.remove_refresh;
                var6_6 = hv3_0.K(var21_21);
                var26_27.setText((CharSequence)var6_6);
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                    var10_10 = null;
                }
                var26_27 = "Remove coupon";
                var10_10.setContentDescription((CharSequence)var26_27);
                if (var4_4 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                    var27_28 = 0;
                    var4_4 /* !! */  = null;
                }
                var5_5 = 0;
                var26_27 = null;
                var4_4 /* !! */ .setOnClickListener(null);
                var2_2.f = var8_8;
                var4_4 /* !! */  = var3_3.getVoucherAmount();
                if (var4_4 /* !! */  != null) {
                    var3_3 = var3_3.getVoucherAmount().getValue();
                    var28_30 = mz3_0.J((String)var3_3);
                    var27_28 = 0;
                    var4_4 /* !! */  = null;
                    var28_30 += 0.0f;
                } else {
                    var27_28 = 0;
                    var4_4 /* !! */  = null;
                    var29_32 = 0;
                    var28_30 = 0.0f;
                    var3_3 = null;
                }
                var27_28 = (cfr_temp_1 = var28_30 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                if (var27_28 > 0) {
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var27_28 = 0;
                        var4_4 /* !! */  = null;
                    } else {
                        var4_4 /* !! */  = var9_9;
                    }
                    var4_4 /* !! */ .setVisibility(0);
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var9_9 = null;
                    }
                    var27_28 = R$string.coupon_saving_refresh;
                    var3_3 = qz2_0.u(var28_30);
                    var26_27 = new Object[var8_8];
                    var26_27[0] = var3_3;
                    var3_3 = hv3_0.L(var27_28, var26_27);
                    var9_9.setText((CharSequence)var3_3);
                } else {
                    if (var9_9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var9_9 = null;
                    }
                    var29_32 = 8;
                    var28_30 = 1.1E-44f;
                    var9_9.setVisibility(var29_32);
                }
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = 0;
                var26_26 = null;
                if (var4_4 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                    var27_29 = 0;
                    var4_4 /* !! */  = null;
                }
                var4_4 /* !! */ .setOnClickListener(var2_2);
                if (var7_7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                    var7_7 = null;
                }
                var29_33 = R$string.apply_coupon_refresh;
                var3_3 = hv3_0.K(var29_33);
                var7_7.setText((CharSequence)var3_3);
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                    var29_33 = 0;
                    var3_3 = null;
                    var28_31 = 0.0f;
                } else {
                    var3_3 = var10_10;
                }
                var27_29 = R$string.select;
                var4_4 /* !! */  = hv3_0.K(var27_29);
                var3_3.setText((CharSequence)var4_4 /* !! */ );
                if (var10_10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var16_16);
                    var10_10 = null;
                }
                var3_3 = "Select coupon";
                var10_10.setContentDescription((CharSequence)var3_3);
                var2_2.f = false;
                if (var9_9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                    var9_9 = null;
                }
                var29_33 = 8;
                var28_31 = 1.1E-44f;
                var9_9.setVisibility(var29_33);
            }
        }
    }
}

