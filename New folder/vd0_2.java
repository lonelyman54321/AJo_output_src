/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeConfirmedActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.ReturnData;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.returnexchange.Errors$Messages;
import com.ril.ajio.services.data.returnexchange.ReturnEntries;
import com.ril.ajio.services.data.returnexchange.ReturnExchange;
import com.ril.ajio.services.data.returnexchange.ReturnExchangeResponse;
import com.ril.ajio.services.data.user.AffiliateData;
import com.ril.ajio.services.query.QueryIntitateRequestReturn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;

/*
 * Renamed from VD0
 */
public final class vd0_2
implements F62 {
    public final /* synthetic */ ExchangeReturnVerifyActivity a;

    public /* synthetic */ vd0_2(ExchangeReturnVerifyActivity exchangeReturnVerifyActivity) {
        this.a = exchangeReturnVerifyActivity;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        block83: {
            block84: {
                block85: {
                    block86: {
                        var2_2 = 1;
                        var3_3 = var1_1;
                        var3_3 = (DataCallback)var1_1;
                        var4_4 = this.a;
                        Intrinsics.checkNotNullParameter(var4_4, "this$0");
                        var5_5 = 0;
                        var6_6 = null;
                        var4_4.u0 = false;
                        var7_7 /* !! */  = cp_1.Companion;
                        var8_8 = nn_2.b(var7_7 /* !! */ , (DataCallback)var3_3);
                        if (var8_8 == 0) break block83;
                        var7_7 /* !! */  = var4_4.y0;
                        if (var7_7 /* !! */  != null) {
                            var7_7 /* !! */ .stopLoader();
                        }
                        var4_4.p2((boolean)var2_2);
                        Intrinsics.checkNotNull(var3_3);
                        var8_8 = var3_3.getStatus();
                        var9_9 = "returnorder failure";
                        var10_10 = "exchange";
                        var11_11 = "IS_FROM_JOUNRNEY";
                        var12_12 = "Return Screen";
                        var13_13 = "Return";
                        var14_14 = "";
                        if (var8_8 != 0) break block84;
                        var8_8 = (int)h40_0.l1();
                        if (var8_8 != 0 && (var8_8 = (int)b.i((String)(var7_7 /* !! */  = var4_4.getIntent().getStringExtra((String)var11_11)), (String)var10_10, false)) != 0) {
                            var15_15 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                            var16_18 = 0;
                            var17_21 = "buttonTap";
                            var18_24 = "exchange";
                            var19_27 = "exchangeordersuccessfull";
                            var20_30 = "buttonTap";
                            var21_33 = "exchange size & reason selection screen";
                            var22_36 = 0;
                            var23_39 = null;
                            var24_42 = null;
                            var7_7 /* !! */  = var4_4.O0;
                            var25_45 = 1760;
                            var26_48 = var7_7 /* !! */ ;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var15_15, (String)var17_21, (String)var18_24, (String)var19_27, (String)var20_30, (String)var21_33, null, null, null, (String)var7_7 /* !! */ , false, null, var25_45, null);
                        }
                        var7_7 /* !! */  = dk0.a(var2_2, (String)var13_13);
                        var10_10 = AnalyticsManager.Companion;
                        var11_11 = var10_10.getInstance().getGtmEvents().getScreenName();
                        var15_15 = "screenname";
                        var7_7 /* !! */ .putString((String)var15_15, (String)var11_11);
                        var10_10 = var10_10.getInstance().getGtmEvents().getScreenName();
                        var11_11 = "screen_name";
                        var7_7 /* !! */ .putString((String)var11_11, (String)var10_10);
                        var10_10 = FirebaseEvents.Companion.getInstance();
                        var10_10.sendEvent((String)var13_13, (Bundle)var7_7 /* !! */ );
                        var7_7 /* !! */  = var3_3.getData();
                        if (var7_7 /* !! */  == null) break block83;
                        var3_3 = (ReturnExchangeResponse)var3_3.getData();
                        var8_8 = 0;
                        var7_7 /* !! */  = null;
                        if (var3_3 != null && (var10_10 = var3_3.getResponseDetails()) != null) {
                            var10_10 = var10_10.iterator();
                            var27_51 = 0;
                            var11_11 = null;
                            while ((var28_52 = var10_10.hasNext()) != 0) {
                                var15_15 = ((ReturnExchange)var10_10.next()).getMessages();
                                if (var15_15 != null) {
                                    var15_15 = var15_15.iterator();
                                    while (var29_53 = var15_15.hasNext()) {
                                        var17_21 = (Errors$Messages)var15_15.next();
                                        var18_24 = var17_21.getKey();
                                        if (var18_24 == null || (var30_54 = var18_24.length()) == 0 || (var30_54 = (int)Intrinsics.areEqual(var18_24 = var17_21.getKey(), var19_27 = "error")) == 0) continue;
                                        var11_11 = var17_21.getValue();
                                    }
                                }
                                if (var11_11 == null) continue;
                                var28_52 = var11_11.length();
                            }
                        } else {
                            var27_51 = 0;
                            var11_11 = null;
                        }
                        if (var11_11 != null && (var31_55 = var11_11.length()) != 0) {
                            var4_4.v2((String)var11_11);
                            var32_56 = AnalyticsManager.Companion;
lbl80:
                            // 2 sources

                            while (true) {
                                tj2_0.e((AnalyticsManager$Companion)var32_56, (String)var13_13, (String)var9_9, (String)var12_12);
                                break block83;
                                break;
                            }
                        }
                        if (var3_3 == null) break block85;
                        var9_9 = var4_4.s0;
                        Intrinsics.checkNotNull(var9_9);
                        var33_58 = var9_9.isRefundToBankSelected();
                        if (var33_58) break block86;
                        var9_9 = var4_4.s0;
                        Intrinsics.checkNotNull(var9_9);
                        var33_58 = var9_9.isAjioStoreCreditsSelected();
                        if (!var33_58) break block85;
                    }
                    var9_9 = var4_4.s0;
                    Intrinsics.checkNotNull(var9_9);
                    var33_58 = var9_9.isRefundToBankSelected();
                    if (var33_58) {
                        var9_9 = "IFSC";
                        var3_3.setMethodOfPayment((String)var9_9);
                    } else {
                        var9_9 = "ajio wallet";
                        var3_3.setMethodOfPayment((String)var9_9);
                    }
                }
                if ((var9_9 = var4_4.s0) == null || (var9_9 = var9_9.getIfscCode()) == null) {
                    var9_9 = var14_14;
                }
                if (var3_3 != null) {
                    var10_10 = (ReturnExchange)var3_3.getResponseDetails().get(0);
                    if (var10_10 != null && (var10_10 = var10_10.getReturnEntries()) != null) {
                        var31_55 = var10_10.size();
                    } else {
                        var31_55 = 0;
                        var10_10 = null;
                    }
                    if (var31_55 > 0) {
                        var10_10 = new Bundle();
                        var11_11 = var4_4.s0;
                        if (var11_11 != null) {
                            var11_11 = var11_11.getOrderCode();
                        } else {
                            var27_51 = 0;
                            var11_11 = null;
                        }
                        var13_13 = "order_id";
                        var10_10.putString((String)var13_13, (String)var11_11);
                        var11_11 = (ReturnExchange)var3_3.getResponseDetails().get(0);
                        if (var11_11 != null && (var11_11 = var11_11.getReturnEntries()) != null && (var11_11 = (ReturnEntries)var11_11.get(0)) != null) {
                            var11_11 = var11_11.getProductCode();
                        } else {
                            var27_51 = 0;
                            var11_11 = null;
                        }
                        var13_13 = var4_4.p0;
                        var10_10.putString((String)var13_13, (String)var11_11);
                        var13_13 = a21.a;
                        var15_15 = var4_4.t0;
                        if (var15_15 != null) {
                            var15_15 = (ArrayList)var15_15.get(var11_11);
                        } else {
                            var28_52 = 0;
                            var15_15 = null;
                        }
                        var13_13.getClass();
                        var34_59 = a21.c((ArrayList)var15_15);
                        if (var34_59 != 0) {
                            var13_13 = var4_4.t0;
                            if (var13_13 != null) {
                                var11_11 = (ArrayList)var13_13.get(var11_11);
                            } else {
                                var27_51 = 0;
                                var11_11 = null;
                            }
                            var11_11 = String.valueOf(a21.e((List)var11_11));
                            var13_13 = "offer_count";
                            var10_10.putString((String)var13_13, (String)var11_11);
                        }
                        if ((var11_11 = var4_4.s0) != null && (var11_11 = var11_11.getSelectedControllerConfirmedList()) != null && (var11_11 = (CartEntry)var11_11.get(0)) != null && (var11_11 = var11_11.getOrderEntry()) != null && (var11_11 = var11_11.getProduct()) != null) {
                            var11_11 = var11_11.getName();
                        } else {
                            var27_51 = 0;
                            var11_11 = null;
                        }
                        var13_13 = var4_4.q0;
                        var10_10.putString((String)var13_13, (String)var11_11);
                        var16_18 = 0;
                        var15_15 = var4_4.M0;
                        var23_39 = "order management screen";
                        var11_11 = var4_4.N0;
                        var13_13 = var4_4.O0;
                        var25_45 = 1536;
                        var24_42 = var10_10;
                        var26_48 = var13_13;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var15_15, "", "Return", "returnordersuccessful", "buttonTap", "Return Screen", var23_39, var11_11, (Bundle)var10_10, (String)var13_13, false, null, var25_45, null);
                        var11_11 = AnalyticsManager.Companion.getInstance();
                        var15_15 = var11_11.getGtmEvents();
                        var20_30 = ne_0.b((Bundle)var10_10);
                        var19_27 = "Return Screen";
                        var21_33 = null;
                        var17_21 = "Return";
                        var18_24 = "returnordersuccessful";
                        var22_36 = 16;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)var15_15, (String)var17_21, var18_24, (String)var19_27, (AnalyticsData)var20_30, null, var22_36, null);
                    }
                    if ((var10_10 = var3_3.getResponseDetails()) != null) {
                        var5_5 = var10_10.size();
                    }
                    if (var5_5 > 0) {
                        var6_6 = var3_3.getResponseDetails();
                        var10_10 = "getResponseDetails(...)";
                        Intrinsics.checkNotNullExpressionValue(var6_6, (String)var10_10);
                        var6_6 = var6_6.iterator();
                        while ((var31_55 = (int)var6_6.hasNext()) != 0) {
                            var10_10 = (ReturnExchange)var6_6.next();
                            var11_11 = var10_10.getReturnEntries();
                            if (var11_11 == null || (var27_51 = (var11_11 = var10_10.getReturnEntries()).size()) <= 0) continue;
                            var11_11 = GAEcommerceEvents.INSTANCE;
                            var13_13 = var10_10.getReturnOrderCode();
                            var15_15 = var10_10.getReturnEntries();
                            var17_21 = "getReturnEntries(...)";
                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var17_21);
                            var18_24 = var4_4.s0;
                            if (var18_24 != null) {
                                var18_24 = var18_24.getSelectedControllerConfirmedList();
                            } else {
                                var30_54 = 0;
                                var18_24 = null;
                            }
                            var11_11.pushOrderReturnEvent((String)var13_13, (ArrayList)var15_15, (String)var12_12, (ArrayList)var18_24);
                            var20_30 = var10_10.getReturnOrderCode();
                            var11_11 = var10_10.getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var17_21);
                            var23_39 = "Return Screen";
                            var13_13 = var4_4.N0;
                            var19_27 = var4_4.L0;
                            var24_42 = "order management screen";
                            var15_15 = var4_4.O0;
                            var21_33 = var11_11;
                            var26_48 = var15_15;
                            var19_27.pushEERefund((String)var20_30, (ArrayList)var11_11, var23_39, (String)var13_13, (String)var24_42, (String)var15_15);
                            var11_11 = var10_10.getReturnOrderCode();
                            var13_13 = var10_10.getReturnEntries();
                            Intrinsics.checkNotNullExpressionValue(var13_13, (String)var17_21);
                            var15_15 = var10_10.getRefundAmount();
                            Intrinsics.checkNotNull(var10_10);
                            var17_21 = var4_4.L0;
                            var17_21.pushPurchaseReturnAppsflyerEvent((String)var11_11, (ArrayList)var13_13, (Float)var15_15, (ReturnExchange)var10_10);
                        }
                    }
                }
                var5_5 = var4_4.T0;
                var10_10 = "order id - ";
                if (var5_5 != 0) {
                    if (var5_5 == var2_2) {
                        var32_57 = rw2_1.a;
                        var32_57 = var4_4.s0;
                        var6_6 = new Bundle();
                        var7_7 /* !! */  = rw2_1.a;
                        var11_11 = var7_7 /* !! */ .getPRODUCT_ID();
                        if (var32_57 == null || (var12_12 = var32_57.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)CollectionsKt.firstOrNull((List)var12_12)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getCode()) == null) {
                            var12_12 = var14_14;
                        }
                        var6_6.putString((String)var11_11, (String)var12_12);
                        var11_11 = var7_7 /* !! */ .getPRODUCT_NAME();
                        if (var32_57 == null || (var12_12 = var32_57.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)CollectionsKt.firstOrNull((List)var12_12)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getName()) == null) {
                            var12_12 = var14_14;
                        }
                        var6_6.putString((String)var11_11, (String)var12_12);
                        var11_11 = var7_7 /* !! */ .getPRODUCT_BRAND();
                        if (var32_57 == null || (var12_12 = var32_57.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)CollectionsKt.firstOrNull((List)var12_12)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getBrandName()) == null) {
                            var12_12 = var14_14;
                        }
                        var6_6.putString((String)var11_11, (String)var12_12);
                        var11_11 = var7_7 /* !! */ .getPRODUCT_SIZE();
                        if (var32_57 == null || (var12_12 = var32_57.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)CollectionsKt.firstOrNull((List)var12_12)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getOriginalSize()) == null) {
                            var12_12 = var14_14;
                        }
                        if (var32_57 == null || (var13_13 = var32_57.getSelectedControllerConfirmedList()) == null || (var13_13 = (CartEntry)CollectionsKt.firstOrNull((List)var13_13)) == null || (var13_13 = var13_13.getOrderEntry()) == null || (var13_13 = var13_13.getProduct()) == null || (var13_13 = var13_13.getSelectedSize()) == null) {
                            var13_13 = var14_14;
                        }
                        var15_15 = "current size - ";
                        var17_21 = "| exchange size - ";
                        var12_12 = UX.c((String)var15_15, (String)var12_12, (String)var17_21, (String)var13_13);
                        var6_6.putString((String)var11_11, (String)var12_12);
                        var7_7 /* !! */  = var7_7 /* !! */ .getORDER_ID();
                        if (var32_57 == null || (var11_11 = var32_57.getSelectedControllerConfirmedList()) == null || (var11_11 = (CartEntry)CollectionsKt.firstOrNull((List)var11_11)) == null || (var11_11 = var11_11.getOrderEntry()) == null || (var11_11 = var11_11.getOrderId()) == null) {
                            var11_11 = var14_14;
                        }
                        if (var3_3 == null || (var12_12 = var3_3.getResponseDetails()) == null || (var12_12 = (ReturnExchange)CollectionsKt.firstOrNull((List)var12_12)) == null || (var12_12 = var12_12.getExchangeRequestCode()) == null) {
                            var12_12 = var14_14;
                        }
                        var13_13 = "| exchange id - ";
                        var10_10 = UX.c((String)var10_10, (String)var11_11, (String)var13_13, (String)var12_12);
                        var6_6.putString((String)var7_7 /* !! */ , (String)var10_10);
                        var7_7 /* !! */  = AnalyticsManager.Companion.getInstance();
                        var15_15 = var7_7 /* !! */ .getGtmEvents();
                        var18_24 = var32_57 != null && (var32_57 = var32_57.getExchangeReasons()) != null && (var32_57 = (String)CollectionsKt.firstOrNull((List)var32_57)) != null ? var32_57 : var14_14;
                        var20_30 = ne_0.b(var6_6);
                        var22_36 = 16;
                        var17_21 = "Exchange Reason";
                        var19_27 = "exchange/return screen";
                        var21_33 = null;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)var15_15, (String)var17_21, var18_24, (String)var19_27, (AnalyticsData)var20_30, null, var22_36, null);
                    }
                } else {
                    var6_6 = rw2_1.a;
                    var6_6 = var4_4.s0;
                    var11_11 = new Bundle();
                    var12_12 = rw2_1.a;
                    var13_13 = var12_12.getPRODUCT_ID();
                    if (var6_6 == null || (var15_15 = var6_6.getSelectedControllerConfirmedList()) == null || (var15_15 = (CartEntry)CollectionsKt.firstOrNull((List)var15_15)) == null || (var15_15 = var15_15.getOrderEntry()) == null || (var15_15 = var15_15.getProduct()) == null || (var15_15 = var15_15.getCode()) == null) {
                        var15_15 = var14_14;
                    }
                    var11_11.putString((String)var13_13, (String)var15_15);
                    var13_13 = var12_12.getPRODUCT_NAME();
                    if (var6_6 == null || (var15_15 = var6_6.getSelectedControllerConfirmedList()) == null || (var15_15 = (CartEntry)CollectionsKt.firstOrNull((List)var15_15)) == null || (var15_15 = var15_15.getOrderEntry()) == null || (var15_15 = var15_15.getProduct()) == null || (var15_15 = var15_15.getName()) == null) {
                        var15_15 = var14_14;
                    }
                    var11_11.putString((String)var13_13, (String)var15_15);
                    var13_13 = var12_12.getPRODUCT_BRAND();
                    if (var6_6 == null || (var15_15 = var6_6.getSelectedControllerConfirmedList()) == null || (var15_15 = (CartEntry)CollectionsKt.firstOrNull((List)var15_15)) == null || (var15_15 = var15_15.getOrderEntry()) == null || (var15_15 = var15_15.getProduct()) == null || (var15_15 = var15_15.getBrandName()) == null) {
                        var15_15 = var14_14;
                    }
                    var11_11.putString((String)var13_13, (String)var15_15);
                    var13_13 = var12_12.getPRODUCT_SIZE();
                    if (var6_6 == null || (var15_15 = var6_6.getSelectedControllerConfirmedList()) == null || (var15_15 = (CartEntry)CollectionsKt.firstOrNull((List)var15_15)) == null || (var15_15 = var15_15.getOrderEntry()) == null || (var15_15 = var15_15.getProduct()) == null || (var15_15 = var15_15.getOriginalSize()) == null) {
                        var15_15 = var14_14;
                    }
                    var11_11.putString((String)var13_13, (String)var15_15);
                    var12_12 = var12_12.getORDER_ID();
                    if (var6_6 == null || (var13_13 = var6_6.getSelectedControllerConfirmedList()) == null || (var13_13 = (CartEntry)CollectionsKt.firstOrNull((List)var13_13)) == null || (var13_13 = var13_13.getOrderEntry()) == null || (var13_13 = var13_13.getOrderId()) == null) {
                        var13_13 = var14_14;
                    }
                    var10_10 = var10_10.concat((String)var13_13);
                    var11_11.putString((String)var12_12, (String)var10_10);
                    var10_10 = AnalyticsManager.Companion.getInstance();
                    var15_15 = var10_10.getGtmEvents();
                    var18_24 = var6_6 != null && (var10_10 = var6_6.getReturnReasons()) != null && (var10_10 = (String)CollectionsKt.firstOrNull((List)var10_10)) != null ? var10_10 : var14_14;
                    var20_30 = ne_0.b((Bundle)var11_11);
                    var22_36 = 16;
                    var17_21 = "Return Reason";
                    var19_27 = "exchange/return screen";
                    var21_33 = null;
                    GTMEvents.pushButtonTapEvent$default((GTMEvents)var15_15, (String)var17_21, var18_24, (String)var19_27, (AnalyticsData)var20_30, null, var22_36, null);
                    if (var6_6 != null) {
                        var10_10 = new CartOrder();
                        var11_11 = new ArrayList();
                        var12_12 = var6_6.getConsignment();
                        if (var12_12 != null && (var12_12 = var12_12.getEntries()) != null) {
                            var12_12 = xx_2.g((Collection)var12_12);
                        } else {
                            var35_60 = 0;
                            var12_12 = null;
                        }
                        Intrinsics.checkNotNull(var12_12);
                        var34_59 = var12_12.a;
                        var35_60 = var12_12.b;
                        if (var34_59 <= var35_60) {
                            while (true) {
                                var15_15 = (CartEntry)bU1.a((ReturnOrderItemDetails)var6_6, var34_59);
                                var17_21 = var6_6.getSelectedControllerConfirmedList();
                                if (var17_21 != null && (var17_21 = (CartEntry)CollectionsKt.firstOrNull((List)var17_21)) != null && (var17_21 = var17_21.getOrderEntry()) != null) {
                                    var17_21 = var17_21.getProduct();
                                } else {
                                    var29_53 = false;
                                    var17_21 = null;
                                }
                                var15_15.setProduct((Product)var17_21);
                                var11_11.add(var15_15);
                                if (var34_59 == var35_60) break;
                                var34_59 += var2_2;
                            }
                        }
                        var10_10.setEntries((ArrayList)var11_11);
                        var10_10.affiliateData = var11_11 = var6_6.getAffiliateData();
                        var11_11 = var6_6.getOriginalOrderId();
                        var10_10.setOriginalOrderId((String)var11_11);
                        var11_11 = var6_6.getSelectedControllerConfirmedList();
                        if (var11_11 != null && (var11_11 = (CartEntry)CollectionsKt.firstOrNull((List)var11_11)) != null && (var11_11 = var11_11.getOrderEntry()) != null) {
                            var11_11 = var11_11.getOrderId();
                        } else {
                            var27_51 = 0;
                            var11_11 = null;
                        }
                        var10_10.setCode((String)var11_11);
                        var6_6 = var6_6.getSelectedControllerConfirmedList();
                        var26_48 = var6_6 != null && (var6_6 = (CartEntry)CollectionsKt.firstOrNull((List)var6_6)) != null ? (var6_6 = var6_6.getOrderEntry()) : null;
                        var6_6 = p5_0.a;
                        var16_18 = var26_48 != null ? (var2_2 = var26_48.getReturnEditedQuantity()) : 1;
                        var6_6.getClass();
                        var32_57 = h40_0.a;
                        var2_2 = (int)h40_0.N0();
                        if (var2_2 != 0) {
                            var32_57 = new Ref$ObjectRef();
                            var32_57.element = var14_14;
                            var6_6 = var10_10.affiliateData;
                            if (var6_6 != null) {
                                var11_11 = var6_6.getUtmMedium();
                            } else {
                                var27_51 = 0;
                                var11_11 = null;
                            }
                            var12_12 = "affiliate";
                            var27_51 = (int)Intrinsics.areEqual(var11_11, var12_12);
                            if (var27_51 != 0) {
                                var11_11 = p5_0.b;
                                var24_42 = var12_12;
                                var12_12 = new r5_0((CartEntry)var26_48, (CartOrder)var10_10, var16_18, (AffiliateData)var6_6, (Ref$ObjectRef)var32_57, null);
                                var2_2 = 3;
                                Ae3.d((i90_0)var11_11, null, null, (Function2)var12_12, var2_2);
                            }
                        }
                    }
                }
                var32_57 = new Intent((Context)var4_4, ExchangeConfirmedActivity.class);
                var32_57.putExtra("INITIATE_RETURN_REQUEST_DATA", (Serializable)var3_3);
                var32_57.putExtra("RETURN_EXCHANGE_IFSC_VALUE", (String)var9_9);
                var6_6 = var4_4.s0;
                var32_57.putExtra("RETURN_ORDER_ITEM_DETAILS", var6_6);
                var36_61 = 0x2000000;
                var32_57.setFlags(var36_61);
                var4_4.startActivity((Intent)var32_57);
                var32_57 = AB0.a();
                var3_3 = "finish";
                var32_57.post(var3_3);
                var4_4.finish();
                break block83;
            }
            var8_8 = var3_3.getStatus();
            if (var8_8 == var2_2 && (var32_56 = var3_3.getError()) != null) {
                var32_56 = var3_3.getError();
                Intrinsics.checkNotNull(var32_56);
                var32_56 = var32_56.getErrors();
                if (var32_56 != null) {
                    var32_56 = var3_3.getError();
                    Intrinsics.checkNotNull(var32_56);
                    var32_56 = var32_56.getErrors();
                    var2_2 = var32_56.size();
                    if (var2_2 > 0) {
                        var32_56 = var3_3.getError();
                        Intrinsics.checkNotNull(var32_56);
                        var32_56 = ((DataError$ErrorMessage)var32_56.getErrors().get(0)).getMessage();
                        var2_2 = (int)TextUtils.isEmpty((CharSequence)var32_56);
                        if (var2_2 == 0) {
                            var32_56 = var3_3.getError();
                            Intrinsics.checkNotNull(var32_56);
                            var32_56 = ((DataError$ErrorMessage)var32_56.getErrors().get(0)).getMessage();
                            var4_4.v2((String)var32_56);
                            var2_2 = (int)h40_0.l1();
                            if (var2_2 != 0) {
                                var32_56 = new QueryIntitateRequestReturn();
                                var4_4.u2((QueryIntitateRequestReturn)var32_56);
                                var32_56 = var32_56.getReturnData();
                                var3_3 = new Bundle();
                                if (var32_56 != null && (var8_8 = var32_56.size()) > 0 && (var7_7 /* !! */  = (ReturnData)var32_56.get(0)) != null && (var9_9 = var7_7 /* !! */ .getReason()) != null) {
                                    var9_9 = var4_4.M0;
                                    var12_12 = var9_9.getPRODUCT_ID();
                                    if ((var32_56 = ((ReturnData)var32_56.get(0)).getProductCode()) == null) {
                                        var32_56 = var14_14;
                                    }
                                    var3_3.putString((String)var12_12, (String)var32_56);
                                    var32_56 = var9_9.getPRODUCT_NAME();
                                    var12_12 = var4_4.s0;
                                    if (var12_12 == null || (var12_12 = var12_12.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)var12_12.get(0)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getName()) == null) {
                                        var12_12 = var14_14;
                                    }
                                    var3_3.putString((String)var32_56, (String)var12_12);
                                    var32_56 = var9_9.getPRODUCT_BRAND();
                                    var12_12 = var4_4.s0;
                                    if (var12_12 == null || (var12_12 = var12_12.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)var12_12.get(0)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getBrandName()) == null) {
                                        var12_12 = var14_14;
                                    }
                                    var3_3.putString((String)var32_56, (String)var12_12);
                                    var32_56 = var9_9.getPRODUCT_SIZE();
                                    var12_12 = var4_4.s0;
                                    if (var12_12 == null || (var12_12 = var12_12.getSelectedControllerConfirmedList()) == null || (var12_12 = (CartEntry)var12_12.get(0)) == null || (var12_12 = var12_12.getOrderEntry()) == null || (var12_12 = var12_12.getProduct()) == null || (var12_12 = var12_12.getSelectedSize()) == null) {
                                        var12_12 = var14_14;
                                    }
                                    var3_3.putString((String)var32_56, (String)var12_12);
                                    var32_56 = var9_9.getORDER_ID();
                                    var9_9 = var4_4.s0;
                                    if (var9_9 == null || (var9_9 = var9_9.getSelectedControllerConfirmedList()) == null || (var9_9 = (CartEntry)var9_9.get(0)) == null || (var9_9 = var9_9.getOrderEntry()) == null || (var9_9 = var9_9.getOrderId()) == null) {
                                        var9_9 = var14_14;
                                    }
                                    var3_3.putString((String)var32_56, (String)var9_9);
                                    var32_56 = var4_4.getIntent().getStringExtra((String)var11_11);
                                    var2_2 = (int)b.i((String)var32_56, (String)var10_10, false);
                                    var6_6 = "|";
                                    if (var2_2 != 0) {
                                        var15_16 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                                        var32_56 = var7_7 /* !! */ .getReason();
                                        if (var32_56 == null) {
                                            var32_56 = var14_14;
                                        }
                                        if ((var7_7 /* !! */  = var7_7 /* !! */ .getSubReason()) != null) {
                                            var14_14 = var7_7 /* !! */ ;
                                        }
                                        var19_28 = n1.a((String)var32_56, (String)var6_6, (String)var14_14);
                                        var16_19 = false;
                                        var17_22 = "buttonTap";
                                        var18_25 = "Exchange reason submit failure";
                                        var20_31 = "buttonTap";
                                        var21_34 = "exchange size & reason selection screen";
                                        var22_37 = false;
                                        var23_40 = null;
                                        var32_56 = var4_4.O0;
                                        var25_46 = 1632;
                                        var24_43 = var3_3;
                                        var26_49 = var32_56;
                                        NewCustomEventsRevamp.newPushCustomEvent$default(var15_16, var17_22, var18_25, var19_28, var20_31, var21_34, null, null, (Bundle)var3_3, (String)var32_56, false, null, var25_46, null);
                                    } else {
                                        var15_17 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                                        var32_56 = var7_7 /* !! */ .getReason();
                                        if (var32_56 == null) {
                                            var32_56 = var14_14;
                                        }
                                        if ((var7_7 /* !! */  = var7_7 /* !! */ .getSubReason()) != null) {
                                            var14_14 = var7_7 /* !! */ ;
                                        }
                                        var19_29 = n1.a((String)var32_56, (String)var6_6, (String)var14_14);
                                        var16_20 = false;
                                        var17_23 = "buttonTap";
                                        var18_26 = "Return reason submit failure";
                                        var20_32 = "buttonTap";
                                        var21_35 = "return size & reason selection screen";
                                        var22_38 = false;
                                        var23_41 = null;
                                        var32_56 = var4_4.O0;
                                        var25_47 = 1632;
                                        var24_44 = var3_3;
                                        var26_50 = var32_56;
                                        NewCustomEventsRevamp.newPushCustomEvent$default(var15_17, var17_23, var18_26, var19_29, var20_32, var21_35, null, null, (Bundle)var3_3, (String)var32_56, false, null, var25_47, null);
                                    }
                                }
                            } else {
                                var32_56 = AnalyticsManager.Companion;
                                ** continue;
                            }
                        }
                    }
                }
            }
        }
    }
}

