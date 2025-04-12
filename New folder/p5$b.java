/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedLong;
import com.affise.attribution.events.parameters.PredefinedString;
import com.affise.attribution.events.predefined.OrderEvent;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class p5$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ CartOrder a;

    public p5$b(CartOrder cartOrder, f80_0 f80_02) {
        this.a = cartOrder;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartOrder cartOrder = this.a;
        object = new p5$b(cartOrder, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (p5$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((p5$b)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block28: {
            block27: {
                var2_4 = "getCode(...)";
                var3_5 = this.a;
                var4_6 = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(var1_1);
                try {
                    var1_1 = p5_0.a;
                    p5_0.a((p5_0)var1_1);
                    var1_1 = var3_5.getEntries();
                    if (var1_1 == null) return Unit.a;
                    var4_6 = var3_5.getEntries();
                    var1_1 = new ArrayList(var4_6);
                    var1_1 = var1_1.iterator();
                    var4_6 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var4_6);
lbl15:
                    // 3 sources

                    while (var5_7 = var1_1.hasNext()) {
                        var4_6 = var1_1.next();
                        var6_8 = (var4_6 = (CartEntry)var4_6) != null ? var4_6.getProduct() : null;
                        break block27;
                    }
                    return Unit.a;
                }
                catch (Exception var1_2) {
                    break block28;
                }
            }
            var8_10 = 0;
            var9_11 = 0.0f;
            var10_12 = null;
            var11_13 = 0L;
            var13_14 = 3;
            var14_15 = var7_9;
            var7_9 = new OrderEvent(null, var11_13, var13_14, null);
            var14_15 = PredefinedString.ORDER_ID;
            var10_12 = var3_5.getCode();
            Intrinsics.checkNotNullExpressionValue(var10_12, (String)var2_4);
            var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
            var14_15 = PredefinedLong.QUANTITY;
            if (var4_6 != null && (var10_12 = var4_6.getOrderTotalQuantity()) != null) {
                var8_10 = var10_12.intValue();
                var15_16 = var8_10;
            } else {
                var15_16 = 1L;
                var17_17 = 4.9E-324;
            }
            var7_9.addPredefinedParameter((PredefinedLong)var14_15, var15_16);
            if (var4_6 == null) ** GOTO lbl74
            var14_15 = p5_0.a;
            var14_15.getClass();
            var14_15 = var4_6.getShippingChargePromoAmt();
            var15_16 = 0L;
            var17_17 = 0.0;
            var19_18 = var14_15 != null ? var14_15.doubleValue() : var17_17;
            var14_15 = var4_6.getTotalPrice();
            var14_15 = var14_15.getValue();
            var21_19 = var14_15 != null ? Double.parseDouble((String)var14_15) : var17_17;
            var21_19 += var19_18;
            var14_15 = var4_6.getShippingChargePromoAmt();
            var19_18 = var14_15 != null ? var14_15.doubleValue() : var17_17;
            var14_15 = var4_6.getTotalPrice();
            var14_15 = var14_15.getValue();
            if (var14_15 != null) {
                var17_17 = Double.parseDouble((String)var14_15);
            }
            var17_17 += var19_18;
            {
                var14_15 = var4_6.getOrderTotalQuantity();
                var23_20 = var14_15 != null ? var14_15.intValue() : 1;
            }
            var19_18 = var23_20;
            {
                var14_15 = PredefinedFloat.PRICE;
            }
            var9_11 = (float)(var17_17 /= var19_18);
            {
                var7_9.addPredefinedParameter((PredefinedFloat)var14_15, var9_11);
                var14_15 = PredefinedFloat.REVENUE;
            }
            var9_11 = (float)var21_19;
            {
                block29: {
                    block30: {
                        block32: {
                            block31: {
                                var7_9.addPredefinedParameter((PredefinedFloat)var14_15, var9_11);
lbl74:
                                // 2 sources

                                if (var6_8 == null) break block29;
                                var14_15 = PredefinedString.CONTENT_ID;
                                var10_12 = var6_8.getCode();
                                if (var10_12 == null) {
                                    var10_12 = "default_content";
                                }
                                var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                                var14_15 = PredefinedString.CHANNEL_TYPE;
                                var10_12 = "Android";
                                var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                                var14_15 = PredefinedString.CATALOGUE_ID;
                                var10_12 = var6_8.getCatalogName();
                                if (var10_12 == null && (var10_12 = var6_8.getCatalog()) == null) {
                                    var10_12 = "default_catalogue";
                                }
                                var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                                var14_15 = PredefinedString.SEGMENT;
                                var10_12 = var6_8.getSegmentName();
                                if (var10_12 == null) {
                                    var10_12 = "default_segment";
                                }
                                var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                                var14_15 = PredefinedString.VERTICAL;
                                var10_12 = var6_8.getVerticalName();
                                if (var10_12 == null) {
                                    var10_12 = "default_vertical";
                                }
                                var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                                var14_15 = PredefinedString.BRICK;
                                var10_12 = var6_8.getBrickName();
                                if (var10_12 == null) {
                                    var10_12 = "default_brick";
                                }
                                var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                                var14_15 = p5_0.a;
                                var5_7 = p5_0.c((p5_0)var14_15, (CartEntry)var4_6);
                                if (!var5_7) break block30;
                                var4_6 = PredefinedString.VOUCHER_CODE;
                                var14_15 = var3_5.getAppliedVouchers();
                                if (var14_15 == null) break block31;
                                var14_15 = CollectionsKt.firstOrNull((List)var14_15);
                                if ((var14_15 = (CartAppliedVoucher)var14_15) != null && (var14_15 = var14_15.getVoucherCode()) != null) break block32;
                            }
                            var14_15 = "default_voucher";
                        }
                        var7_9.addPredefinedParameter((PredefinedString)var4_6, (String)var14_15);
                    }
                    if ((var14_15 = (var4_6 = p5_0.c).f()) == null || (var8_10 = var14_15.length()) == 0) {
                        var14_15 = "New";
                    }
                    var10_12 = PredefinedString.CUSTOMER_TYPE;
                    var7_9.addPredefinedParameter((PredefinedString)var10_12, (String)var14_15);
                    var14_15 = PredefinedString.BRAND;
                    var10_12 = var6_8.getBrandName();
                    if (var10_12 == null) {
                        var10_12 = "default_brand";
                    }
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                    var14_15 = PredefinedString.UTM_SOURCE;
                    var10_12 = var4_6.b();
                    if (var10_12 == null || (var10_12 = var10_12.getUtmSource()) == null) {
                        var10_12 = "default_utm_source";
                    }
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                    var14_15 = PredefinedString.UTM_CAMPAIGN;
                    var10_12 = var4_6.b();
                    if (var10_12 == null || (var10_12 = var10_12.getUtmCampaign()) == null) {
                        var10_12 = "default_utm_campaign";
                    }
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                    var14_15 = PredefinedString.UTM_MEDIUM;
                    var10_12 = var4_6.b();
                    if (var10_12 == null || (var10_12 = var10_12.getUtmMedium()) == null) {
                        var10_12 = "default_utm_medium";
                    }
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                    var14_15 = PredefinedString.STATUS;
                    var10_12 = "5";
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                    var14_15 = var7_9.customPredefined();
                    var10_12 = var3_5.getCode();
                    Intrinsics.checkNotNullExpressionValue(var10_12, (String)var2_4);
                    var24_21 = var6_8.getCode();
                    if (var24_21 == null) {
                        var24_21 = "";
                    }
                    var14_15 = var14_15.conversionId((String)var10_12, var24_21);
                    var10_12 = PredefinedString.RECEIPT_ID;
                    var7_9.addPredefinedParameter((PredefinedString)var10_12, (String)var14_15);
                    var14_15 = PredefinedString.CLICK_ID;
                    var10_12 = var4_6.b();
                    if (var10_12 == null || (var10_12 = var10_12.getClickId()) == null) {
                        var10_12 = "default_click_id";
                    }
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var10_12);
                    var14_15 = PredefinedString.PID;
                    var4_6 = var4_6.b();
                    if (var4_6 == null || (var4_6 = var4_6.getAffiliateId()) == null) {
                        var4_6 = "default_pid";
                    }
                    var7_9.addPredefinedParameter((PredefinedString)var14_15, (String)var4_6);
                }
                var4_6 = new p5$b$a(var7_9, (CartOrder)var3_5, var6_8);
                var14_15 = new p5$b$b(var7_9, (CartOrder)var3_5, var6_8);
                var7_9.sendNow((OnSendSuccessCallback)var4_6, (OnSendFailedCallback)var14_15);
                var4_6 = h40_0.a;
                var5_7 = h40_0.M0();
                if (!var5_7) ** GOTO lbl15
                var14_15 = Looper.getMainLooper();
                var4_6 = new Handler((Looper)var14_15);
                var14_15 = new s5(var7_9, (CartOrder)var3_5, var6_8);
                var15_16 = 2000L;
                var17_17 = 9.88E-321;
                var4_6.postDelayed((Runnable)var14_15, var15_16);
                ** GOTO lbl15
            }
        }
        Intrinsics.checkNotNullParameter(var1_2, "<this>");
        var2_4 = FirebaseCrashlytics.getInstance();
        var1_3 = var1_2.getMessage();
        var4_6 = "Affise Exception Purchase Complete Event ";
        var1_3 = kp1_0.c((String)var4_6, var1_3);
        var3_5 = new Exception(var1_3);
        var2_4.recordException((Throwable)var3_5);
        return Unit.a;
    }
}

