/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.g$e;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iF0
 */
public final class if0_0
implements g$e,
g82_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ if0_0(Object object) {
        this.a = object;
    }

    /*
     * Unable to fully structure code
     */
    public void a(int var1_1, Object var2_2) {
        var3_3 = var2_2;
        var3_3 = (OrderItemLine)var2_2;
        var4_4 = b.Companion;
        var5_5 = (b)this.a;
        Intrinsics.checkNotNullParameter(var5_5, "this$0");
        Intrinsics.checkNotNullParameter(var3_3, "orderItemLine");
        var5_5.R = var4_4 = Integer.valueOf(var1_1);
        var4_4 = OrderListFunctionalRepo.INSTANCE;
        var6_6 = var4_4.getOrderHistory();
        var7_7 = b.Z;
        var8_8 = "order_status";
        var9_9 = "product_id";
        var10_10 = "order_id";
        var11_11 = "mListener";
        var12_12 = "product_code";
        var13_13 = "clicked_item_code";
        var14_14 = null;
        var15_15 = 1;
        if (var6_6 == null || (var16_16 = var6_6.getReturnRevampNewFlowEnabled()) != var15_15 || (var16_16 = hv3_0.D()) == 0 || (var16_16 = TextUtils.isEmpty((CharSequence)(var6_6 = var3_3.getReturnId()))) != 0) ** GOTO lbl-1000
        var6_6 = var5_5.r;
        if (var6_6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderListViewModel");
            var16_16 = 0;
            var6_6 = null;
        }
        var6_6.getClass();
        Intrinsics.checkNotNullParameter(var3_3, "orderItemLines");
        var6_6 = var3_3.getOrderLevelType();
        var17_17 = "EXCHANGE";
        var16_16 = kotlin.text.b.i((String)var6_6, var17_17, (boolean)var15_15);
        if ((var16_16 == 0 || (var16_16 = kotlin.text.b.i((String)(var6_6 = var3_3.getOrderType()), (String)(var18_18 = "RTO"), (boolean)var15_15)) == 0) && ((var6_6 = var3_3.getOrderType()) == null || (var16_16 = (var18_18 = "FORWARD").equalsIgnoreCase((String)(var6_6 = var3_3.getOrderType()))) == 0 && (var16_16 = var17_17.equalsIgnoreCase((String)(var6_6 = var3_3.getOrderType()))) == 0 && (var16_16 = (var17_17 = "Exchange Return").equalsIgnoreCase((String)(var6_6 = var3_3.getOrderType()))) == 0)) {
            var4_4 = new Bundle();
            var6_6 = var3_3.getItemId();
            var16_16 = TextUtils.isEmpty((CharSequence)var6_6);
            if (var16_16 == 0) {
                var6_6 = var3_3.getItemId();
                var4_4.putString(var13_13, (String)var6_6);
            }
            var13_13 = var3_3.getReturnId();
            var4_4.putString("return_refund_return_id", var13_13);
            var6_6 = var3_3.getOrderId();
            var4_4.putString((String)var12_12, (String)var6_6);
            var6_6 = var5_5.o;
            if (var6_6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
            } else {
                var14_14 = var6_6;
            }
            var16_16 = 2;
            var14_14.onFragmentInteraction(var7_7, var16_16, (Bundle)var4_4);
            var4_4 = var3_3.getImpsFailed();
            if (var4_4 != null && (var19_19 = (int)Intrinsics.areEqual(var4_4 = var3_3.getImpsFailed(), var6_6 = Boolean.TRUE)) != 0) {
                var4_4 = zE2.a;
                var14_14 = var3_3.getReturnId();
                Intrinsics.checkNotNullExpressionValue(var14_14, "getReturnId(...)");
                var4_4 = var3_3.getOrderId();
                Intrinsics.checkNotNullExpressionValue(var4_4, "getOrderId(...)");
                var6_6 = var3_3.getItemId();
                Intrinsics.checkNotNullExpressionValue(var6_6, "getItemId(...)");
                var7_7 = no_2.a((OrderItemLine)var3_3);
                Intrinsics.checkNotNullParameter(var14_14, "returnId");
                Intrinsics.checkNotNullParameter(var4_4, "orderId");
                var18_18 = dm_1.a((String)var6_6, "productId", var7_7, "orderStatus");
                var18_18.putString(var10_10, (String)var4_4);
                var18_18.putString(var9_9, (String)var6_6);
                var18_18.putString(var8_8, var7_7);
                var4_4 = AnalyticsManager.Companion;
                var17_17 = av_0.a((AnalyticsManager$Companion)var4_4);
                var6_6 = av_0.a((AnalyticsManager$Companion)var4_4);
                var20_20 = bv_0.a((AnalyticsManager$Companion)var4_4);
                var21_21 = cv_0.a((AnalyticsManager$Companion)var4_4);
                var11_11 = zE2.a;
                var12_12 = "order listing interaction";
                var13_13 = "refund failed";
                var22_22 = "order_listing_interaction";
                var23_23 = 1536;
                var24_24 = 0;
                var4_4 = var18_18;
                var18_18 = var6_6;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var11_11, (String)var12_12, var13_13, (String)var14_14, var22_22, var17_17, (String)var6_6, var20_20, (Bundle)var4_4, (String)var21_21, false, null, var23_23, null);
            }
        } else if ((var6_6 = var4_4.getOrderHistory()) != null && (var16_16 = var6_6.getForwardOrderRevampFlowEnabled()) == var15_15) {
            var6_6 = new Bundle();
            var15_15 = var3_3.getPagenumber();
            var4_4.setClickedPageNumber(var15_15);
            var4_4 = var3_3.getOrderId();
            var6_6.putString((String)var12_12, (String)var4_4);
            var4_4 = var3_3.getItemId();
            var19_19 = TextUtils.isEmpty((CharSequence)var4_4);
            if (var19_19 == 0) {
                var4_4 = var3_3.getItemId();
                var6_6.putString(var13_13, (String)var4_4);
            }
            if ((var19_19 = TextUtils.isEmpty((CharSequence)(var4_4 = var3_3.getExchangeOrderId()))) == 0) {
                var4_4 = "exchange_id";
                var12_12 = var3_3.getExchangeOrderId();
                var6_6.putString((String)var4_4, (String)var12_12);
            }
            if ((var4_4 = var5_5.o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
            } else {
                var14_14 = var4_4;
            }
            var19_19 = 4;
            var14_14.onFragmentInteraction(var7_7, var19_19, (Bundle)var6_6);
        } else {
            var6_6 = new Bundle();
            var25_25 = var3_3.getPagenumber();
            var4_4.setClickedPageNumber(var25_25);
            var4_4 = var3_3.getOrderId();
            var6_6.putString((String)var12_12, (String)var4_4);
            var4_4 = var3_3.getItemId();
            var19_19 = TextUtils.isEmpty((CharSequence)var4_4);
            if (var19_19 == 0) {
                var4_4 = var3_3.getItemId();
                var6_6.putString(var13_13, (String)var4_4);
            }
            if ((var4_4 = var5_5.o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var11_11);
            } else {
                var14_14 = var4_4;
            }
            var14_14.onFragmentInteraction(var7_7, var15_15, (Bundle)var6_6);
        }
        if ((var19_19 = TextUtils.isEmpty((CharSequence)(var4_4 = no_2.d((OrderItemLine)var3_3)))) == 0) {
            var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            var6_6 = no_2.d((OrderItemLine)var3_3);
            var6_6 = "Clicked to open card status - ".concat((String)var6_6);
            var11_11 = "Order List";
            var4_4.pushButtonTapEvent((String)var11_11, var6_6, "order listing screen");
            var4_4 = new Bundle();
            var4_4.putInt("order_position", 0);
            var6_6 = no_2.d((OrderItemLine)var3_3);
            var4_4.putString(var8_8, (String)var6_6);
            var6_6 = var3_3.getOrderId();
            var4_4.putString(var10_10, (String)var6_6);
            var6_6 = var3_3.getItemId();
            var4_4.putString(var9_9, (String)var6_6);
            var3_3 = var3_3.getEddUpperRange();
            var7_7 = "yyyy-MM-dd'T'HH:mm:ss";
            var3_3 = k7.c((String)var3_3, "yyyyMMdd", var7_7);
            var6_6 = "event_priority_delivery_EDD";
            var4_4.putString((String)var6_6, (String)var3_3);
            var12_12 = var5_5.M;
            var13_13 = var12_12.getEC_ORDER_LIST_INTERACTION();
            var24_24 = 1536;
            var14_14 = "order clicked";
            var22_22 = "";
            var17_17 = "order_listing_interaction";
            var18_18 = "order listing screen";
            var20_20 = "order management screen";
            var3_3 = var5_5.N;
            var5_5 = var5_5.O;
            var23_23 = 0;
            var21_21 = var4_4;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var12_12, var13_13, (String)var14_14, var22_22, var17_17, (String)var18_18, var20_20, (String)var3_3, (Bundle)var4_4, (String)var5_5, false, null, var24_24, null);
        }
    }
}

