/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.services.data.Order.orderhistory.OrderHistory;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from uW1
 */
public final class uw1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uw1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1) {
        block32: {
            block31: {
                block33: {
                    block30: {
                        var2_2 = "this$0";
                        var3_3 = this.b;
                        var4_4 = 0;
                        var5_5 = null;
                        var6_6 = 1;
                        var7_7 = this.a;
                        switch (var7_7) {
                            default: {
                                var8_8 /* !! */  = var1_1;
                                var8_8 /* !! */  = (OrderHistory)var1_1;
                                var3_3 = (Z52)var3_3;
                                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                                var2_2 = var3_3.o;
                                hv3_0.s0((ShimmerFrameLayout)var2_2);
                                if (var8_8 /* !! */  != null) {
                                    var2_2 = OrderListFunctionalRepo.INSTANCE;
                                    var2_2.parseResponse((OrderHistory)var8_8 /* !! */ );
                                    var2_2 = var2_2.getOrderList();
                                    var8_8 /* !! */  = new ArrayList();
                                    var2_2 = var2_2.iterator();
                                    while ((var9_10 = var2_2.hasNext()) != 0) {
                                        var10_12 = (OrderItemLine)var2_2.next();
                                        var11_14 = var10_12.getImpsFailed();
                                        if (var11_14 == null || (var13_18 = (int)Intrinsics.areEqual(var11_14 = var10_12.getImpsFailed(), var12_16 = Boolean.TRUE)) == 0) continue;
                                        var8_8 /* !! */ .add(var10_12);
                                    }
                                    var14_20 = var8_8 /* !! */ .size();
                                    var10_12 = h40_0.a;
                                    var10_12 = h40_0.r0();
                                    var9_10 = var10_12 != null ? var10_12.getRefundFailureHomePageCount() : 5;
                                    if (var9_10 < (var13_18 = 5)) {
                                        var13_18 = var9_10;
                                    }
                                    if (var14_20 > var13_18) {
                                        var14_20 = var13_18;
                                    }
                                    var2_2 = CollectionsKt.f0(var8_8 /* !! */ , var14_20);
                                    Intrinsics.checkNotNullParameter(var2_2, "<this>");
                                    var8_8 /* !! */  = new ArrayList();
                                    var2_2 = (Collection)var2_2;
                                    var8_8 /* !! */ .addAll(var2_2);
                                    var3_3.m = var8_8 /* !! */ ;
                                    var14_20 = var8_8 /* !! */ .isEmpty() ^ var6_6;
                                    if (var14_20 == var6_6) {
                                        var2_2 = var3_3.e;
                                        Intrinsics.checkNotNullExpressionValue(var2_2, "pageTitle");
                                        ai0_2.B((View)var2_2);
                                        var2_2 = var3_3.d;
                                        ai0_2.B((View)var2_2);
                                        var8_8 /* !! */  = var3_3.g;
                                        if (var8_8 /* !! */  != null) {
                                            ai0_2.B((View)var8_8 /* !! */ );
                                        }
                                        if (var8_8 /* !! */  != null) {
                                            var8_8 /* !! */ .removeAllViews();
                                        }
                                        var10_12 = var3_3.f;
                                        var10_12.clear();
                                        var11_14 = var3_3.m;
                                        Intrinsics.checkNotNull(var11_14);
                                        var13_18 = var11_14.size();
                                        var12_16 = null;
                                        for (var15_22 = 0; var15_22 < var13_18; var15_22 += var6_6) {
                                            var16_23 /* !! */  = LayoutInflater.from((Context)var3_3.h);
                                            var17_26 = R$layout.rotating_banner_progress_bar;
                                            var16_23 /* !! */  = var16_23 /* !! */ .inflate(var17_26, (ViewGroup)var8_8 /* !! */ , false);
                                            var17_26 = R$id.row_rotate_progressbar_one;
                                            var16_23 /* !! */  = (ProgressBar)var16_23 /* !! */ .findViewById(var17_26);
                                            if (var8_8 /* !! */  != null) {
                                                var8_8 /* !! */ .addView((View)var16_23 /* !! */ );
                                            }
                                            var10_12.add(var16_23 /* !! */ );
                                        }
                                        var8_8 /* !! */  = var3_3.m;
                                        Intrinsics.checkNotNull(var8_8 /* !! */ );
                                        var9_10 = var3_3.getBindingAdapterPosition();
                                        var10_12 = String.valueOf(var9_10);
                                        var11_14 = var3_3.i;
                                        var12_16 = var3_3.a;
                                        var5_5 = new y52_0((ArrayList)var8_8 /* !! */ , (g71_0)var12_16, (String)var10_12, (Z52$b)var11_14);
                                        var2_2.setAdapter((Uk2)var5_5);
                                        var5_5 = var3_3.m;
                                        Intrinsics.checkNotNull(var5_5);
                                        var4_4 = var5_5.size();
                                        if (var4_4 > var6_6) {
                                            var5_5 = var3_3.m;
                                            Intrinsics.checkNotNull(var5_5);
                                            var4_4 = var5_5.size() * 50;
                                            var2_2.setCurrentItem(var4_4);
                                        }
                                        var2_2 = zE2.a;
                                        var2_2 = var3_3.m;
                                        Intrinsics.checkNotNull(var2_2);
                                        var14_20 = var2_2.size();
                                        var3_3 = "isrefundfail";
                                        var18_27 = dk0.a(var6_6, (String)var3_3);
                                        var12_16 = String.valueOf(var14_20);
                                        var2_2 = AnalyticsManager.Companion;
                                        var19_28 = av_0.a((AnalyticsManager$Companion)var2_2);
                                        var20_29 = av_0.a((AnalyticsManager$Companion)var2_2);
                                        var21_30 = bv_0.a((AnalyticsManager$Companion)var2_2);
                                        var22_31 = cv_0.a((AnalyticsManager$Companion)var2_2);
                                        var8_8 /* !! */  = zE2.a;
                                        var23_32 = 1536;
                                        var10_12 = "landing screen interaction";
                                        var11_14 = "home order widget impression";
                                        var16_23 /* !! */  = "lp_order_widget_interaction";
                                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var8_8 /* !! */ , (String)var10_12, (String)var11_14, (String)var12_16, (String)var16_23 /* !! */ , var19_28, var20_29, var21_30, var18_27, var22_31, false, null, var23_32, null);
                                    }
                                }
                                return Unit.a;
                            }
                            case 0: 
                        }
                        var8_9 = var1_1;
                        var8_9 = (DataCallback)var1_1;
                        var3_3 = (ex1_0)var3_3;
                        Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                        var2_2 = cp_1.Companion;
                        var14_21 = nn_2.b((cp$a)var2_2, (DataCallback)var8_9);
                        if (var14_21 == 0) break block32;
                        kx3_0.a = var6_6;
                        var2_2 = var3_3.m;
                        var9_11 = false;
                        var10_13 = null;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                            var14_21 = 0;
                            var2_2 = null;
                        }
                        var2_2.stopLoader();
                        var14_21 = var8_9.getStatus();
                        var11_15 = "format(...)";
                        var12_17 = "closetViewModel";
                        if (var14_21 != 0) break block33;
                        var2_2 = var3_3.getActivity();
                        if (var2_2 == null) break block31;
                        var2_2 = StringCompanionObject.INSTANCE;
                        var14_21 = R$string.acc_alert_message;
                        var2_2 = hv3_0.K(var14_21);
                        var7_7 = R$string.removed_wishlist_refresh;
                        var8_9 = var3_3.getString(var7_7);
                        var16_24 = new Object[var6_6];
                        var16_24[0] = var8_9;
                        var2_2 = xh2_0.a(var16_24, var6_6, (String)var2_2, (String)var11_15);
                        var4_4 = R$string.removed_wishlist_refresh;
                        var5_5 = hv3_0.K(var4_4);
                        var3_3.Kb((String)var5_5, (String)var2_2);
                        var2_2 = var3_3.I0;
                        if (var2_2 != null) {
                            var5_5 = var3_3.u;
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var12_17);
                                var4_4 = 0;
                                var5_5 = null;
                            }
                            var4_4 = (var5_5 = var5_5.i.c) != null ? var5_5.getViewHolderPos() : -1;
                            var2_2.Oa(var4_4);
                        }
                        if ((var2_2 = var3_3.S) != null) {
                            var2_2 = var2_2.g();
                        } else {
                            var14_21 = 0;
                            var2_2 = null;
                        }
                        Intrinsics.checkNotNull(var2_2, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.Product>");
                        var5_5 = var3_3.u;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var12_17);
                            var4_4 = 0;
                            var5_5 = null;
                        }
                        if ((var5_5 = var5_5.i.c) == null) break block31;
                        try {
                            var2_2 = var2_2.iterator();
                            var24_33 = "iterator(...)";
                            Intrinsics.checkNotNullExpressionValue(var2_2, (String)var24_33);
lbl166:
                            // 3 sources

                            while ((var6_6 = (int)var2_2.hasNext()) != 0) {
                                var24_33 = var2_2.next();
                                var8_9 = "next(...)";
                                Intrinsics.checkNotNullExpressionValue(var24_33, (String)var8_9);
                                var24_33 = (Product)var24_33;
                                var8_9 = var24_33.getCode();
                                var11_15 = var5_5.getFnlColorVariantData();
                                if (var11_15 == null) break block30;
                                var11_15 = var11_15.getColorGroup();
                                ** GOTO lbl-1000
                            }
                            ** GOTO lbl199
                        }
                        catch (ConcurrentModificationException v0) {}
                        break block31;
                    }
                    var13_19 = false;
                    var11_15 = null;
lbl-1000:
                    // 2 sources

                    {
                        block34: {
                            var7_7 = (int)Intrinsics.areEqual(var8_9, var11_15);
                            if (var7_7 != 0) break block34;
                            if ((var24_33 = var24_33.getFnlColorVariantData()) != null) {
                                var24_33 = var24_33.getColorGroup();
                            } else {
                                var6_6 = 0;
                                var24_33 = null;
                            }
                            var8_9 = var5_5.getFnlColorVariantData();
                            if (var8_9 != null) {
                                var8_9 = var8_9.getColorGroup();
                            } else {
                                var7_7 = 0;
                                var8_9 = null;
                            }
                            if ((var6_6 = (int)Intrinsics.areEqual(var24_33, var8_9)) == 0) ** GOTO lbl166
                        }
                        var2_2.remove();
                        ** GOTO lbl166
lbl199:
                        // 1 sources

                        var2_2 = var3_3.S;
                        if (var2_2 != null) {
                            var2_2.h();
                        }
                        break block31;
                    }
                }
                var14_21 = var8_9.getStatus();
                if (var14_21 == var6_6) {
                    var2_2 = StringCompanionObject.INSTANCE;
                    var14_21 = R$string.acc_alert_message;
                    var2_2 = hv3_0.K(var14_21);
                    var7_7 = R$string.remove_wish_list_alert;
                    var8_9 = var3_3.getString(var7_7);
                    var16_25 = new Object[var6_6];
                    var16_25[0] = var8_9;
                    var2_2 = xh2_0.a(var16_25, var6_6, (String)var2_2, (String)var11_15);
                    var4_4 = R$string.remove_wish_list_alert;
                    var5_5 = hv3_0.K(var4_4);
                    var3_3.Kb((String)var5_5, (String)var2_2);
                }
            }
            if ((var2_2 = var3_3.u) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var12_17);
                var14_21 = 0;
                var2_2 = null;
            }
            var2_2 = var2_2.i;
            var2_2.c = null;
        }
        return Unit.a;
    }
}

