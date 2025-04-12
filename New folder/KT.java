/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.FEPayment;
import com.ril.ajio.services.data.Payment.FEResult;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class KT {
    public final kj2_1 a;
    public final ps_0 b;
    public final NewCustomEventsRevamp c;
    public final NewEEcommerceEventsRevamp d;

    public KT(kj2_1 object, ps_0 object2) {
        Intrinsics.checkNotNullParameter(object, "peSharedVM");
        Intrinsics.checkNotNullParameter(object2, "checkOutViewModel");
        this.a = object;
        this.b = object2;
        object = AnalyticsManager.Companion;
        this.c = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.d = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
    }

    public final void a() {
        Object object;
        boolean bl2;
        String string2;
        Object object2 = this.a.s;
        if (object2 != null && (object2 = ((PaymentInstruments)object2).getFraudEngineResponseDetails()) != null && (object2 = ((FraudEngineResponse)object2).getResult()) != null && (object2 = ((FEResult)object2).getCOD()) != null && (string2 = ((FEPayment)object2).getAction()) != null && (bl2 = string2.equalsIgnoreCase((String)(object = "COD_BLOCK")))) {
            object = oT.a;
            object2 = ((FEPayment)object2).getRule();
            Intrinsics.checkNotNullParameter(string2, "action");
            object = "NO_ACTION";
            bl2 = Intrinsics.areEqual(string2, object);
            if (!bl2) {
                object = AnalyticsManager.Companion;
                Object object3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
                if (object2 == null) {
                    object2 = "";
                }
                Object object4 = object2;
                String string3 = cv_0.a((AnalyticsManager$Companion)object);
                object2 = "Fraud engine";
                String string4 = "COD_fraud_engine_response";
                String string5 = "single page checkout";
                int n3 = 1760;
                object = object3;
                object3 = object2;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, string2, (String)object4, string4, string5, null, null, null, string3, false, null, n3, null);
            }
        }
    }

    public final void b() {
        Object object = this.a.s;
        if (object != null && (object = ((PaymentInstruments)object).getFraudEngineResponseDetails()) != null && (object = ((FraudEngineResponse)object).getResult()) != null && (object = ((FEResult)object).getRVP()) != null) {
            boolean bl2;
            Object object2 = oT.a;
            String string2 = ((FEPayment)object).getAction();
            object = ((FEPayment)object).getRule();
            if (string2 != null && !(bl2 = Intrinsics.areEqual(string2, object2 = "NO_ACTION"))) {
                object2 = AnalyticsManager.Companion;
                NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                if (object == null) {
                    object = "";
                }
                String string3 = cv_0.a((AnalyticsManager$Companion)object2);
                String string4 = "Fraud engine";
                String string5 = "RVP_fraud_engine_response";
                String string6 = "single page checkout";
                int n3 = 1760;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string2, (String)object, string5, string6, null, null, null, string3, false, null, n3, null);
            }
        }
    }

    public final void c() {
        int n3;
        Bundle bundle = new Bundle();
        Object object = oo2_0.a;
        Object object2 = null;
        Object object3 = this.a;
        object3 = object3 != null ? ((kj2_1)object3).s : null;
        object.getClass();
        object = oo2_0.c("SAVED_CARD", (PaymentInstruments)object3);
        if (object != null && (object = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
            n3 = ((ArrayList)object).size();
            object2 = n3;
        }
        if (object2 != null) {
            n3 = (Integer)object2;
        } else {
            n3 = 0;
            object = null;
        }
        bundle.putInt("card_count", n3);
        object = oT.a;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getEC_PAYMENT_INSTRUMENT_SCR_TYPE();
        String string2 = oT.b;
        String string3 = oT.c;
        object = object2;
        object2 = object3;
        object3 = "saved cards on spc";
        String string4 = "";
        String string5 = "saved_card_count";
        String string6 = "single page checkout";
        String string7 = "single page checkout";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, (String)object3, string4, string5, string6, string7, string2, bundle, string3, false, null, 1536, null);
    }

    public final void d() {
        boolean bl2;
        Serializable serializable = this.b.k;
        if (serializable == null) {
            return;
        }
        if ((serializable = serializable != null ? ((Cart)serializable).getEntries() : null) != null && !(bl2 = serializable.isEmpty())) {
            int n3;
            Object object = new ArrayList();
            serializable = serializable.iterator();
            Intrinsics.checkNotNullExpressionValue(serializable, "iterator(...)");
            int n4 = 0;
            while ((n3 = serializable.hasNext()) != 0) {
                Comparable comparable = (CartEntry)serializable.next();
                Object object2 = ((CartEntry)comparable).getProduct();
                if (object2 == null) continue;
                object2 = ((CartEntry)comparable).getProduct().getBaseProduct();
                ((ArrayList)object).add(object2);
                comparable = ((CartEntry)comparable).getQuantity();
                if (comparable != null) {
                    n3 = (Integer)comparable;
                } else {
                    n3 = 0;
                    comparable = null;
                }
                n4 += n3;
            }
            serializable = object.toString();
            object = this.a;
            ((kj2_1)object).k = serializable;
            ((kj2_1)object).l = n4;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void e(CartDeliveryAddress var1_1, Boolean var2_2) {
        block34: {
            block36: {
                block35: {
                    if (var1_1 == null) break block34;
                    var3_3 = new Bundle();
                    var4_4 = var1_1.getEstimateDeliveryDate();
                    var5_5 = "edd_type";
                    if (var4_4 == null) ** GOTO lbl-1000
                    var4_4 = var1_1.getEstimateDeliveryDate();
                    Intrinsics.checkNotNullExpressionValue(var4_4, "getEstimateDeliveryDate(...)");
                    var6_6 = false;
                    var7_7 = null;
                    var8_8 = "-";
                    var9_9 = StringsKt.F((CharSequence)var4_4, (CharSequence)var8_8, false);
                    if (var9_9) {
                        var4_4 = "range";
                        var3_3.putString((String)var5_5, (String)var4_4);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 = "single";
                        var3_3.putString((String)var5_5, (String)var4_4);
                    }
                    var5_5 = TimeUnit.DAYS;
                    var10_10 = var1_1.getEddTimeDiff();
                    var1_1 = TimeUnit.MILLISECONDS;
                    var10_10 = var5_5.convert(var10_10, (TimeUnit)var1_1);
                    var3_3.putLong("edd_delivery_date_difference", var10_10);
                    Intrinsics.checkNotNull(var2_2);
                    var6_6 = var2_2.booleanValue();
                    var3_3.putBoolean("default_address", var6_6);
                    var7_7 = this.c;
                    var8_8 = var7_7.getSV_EP_CTA_DISABLE();
                    var12_11 = this.b;
                    var13_12 = var12_11.k;
                    var14_13 = null;
                    var13_12 = var13_12 != null && (var13_12 = var13_12.getError()) != null ? var13_12.toString() : null;
                    var3_3.putString((String)var8_8, (String)var13_12);
                    var8_8 = var7_7.getSV_EP_RONE();
                    var13_12 = "viewed";
                    var3_3.putString((String)var8_8, (String)var13_12);
                    var8_8 = var12_11.k;
                    if (var8_8 != null) {
                        var15_14 = var8_8.getLoyaltyEarnedPoints();
                        var8_8 = Float.valueOf(var15_14);
                    } else {
                        var16_15 = 0;
                        var8_8 = null;
                        var15_14 = 0.0f;
                    }
                    if (var8_8 == null) break block35;
                    var8_8 = var12_11.k;
                    if (var8_8 != null) {
                        var15_14 = var8_8.getLoyaltyEarnedPoints();
                        var8_8 = Float.valueOf(var15_14);
                    } else {
                        var16_15 = 0;
                        var8_8 = null;
                        var15_14 = 0.0f;
                    }
                    Intrinsics.checkNotNull(var8_8);
                    var15_14 = var8_8.floatValue();
                    cfr_temp_0 = var15_14 - 0.0f;
                    var16_15 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    if (var16_15 > 0) break block36;
                }
                var13_12 = "not_available";
            }
            var8_8 = var7_7.getSV_EP_AJIO_WALLET();
            var3_3.putString((String)var8_8, (String)var13_12);
            var8_8 = var7_7.getSV_EP_OUTTAGE_MESG();
            var13_12 = var12_11.k;
            var13_12 = var13_12 != null && (var13_12 = var13_12.getServiceError()) != null ? var13_12.getMessageDescription() : null;
            var3_3.putString((String)var8_8, (String)var13_12);
            var8_8 = var7_7.getSV_EP_OFFERS();
            var13_12 = var12_11.j;
            var13_12 = var13_12 != null && (var13_12 = var13_12.getTotalDiscounts()) != null ? var13_12.getValue() : null;
            var3_3.putString((String)var8_8, (String)var13_12);
            var8_8 = var12_11.j;
            if (var8_8 != null && (var8_8 = var8_8.getTotalPriceWithTax()) != null) {
                var8_8 = var8_8.getValue();
            } else {
                var16_15 = 0;
                var8_8 = null;
                var15_14 = 0.0f;
            }
            var13_12 = "amount_payable";
            var3_3.putString((String)var13_12, (String)var8_8);
            var8_8 = var7_7.getSV_EP_DEF_ADD();
            var2_2 = var2_2.toString();
            var3_3.putString((String)var8_8, (String)var2_2);
            var2_2 = var7_7.getSV_EP_DEF_ADD_PIN();
            var8_8 = var12_11.o;
            if (var8_8 != null) {
                var8_8 = var8_8.getPostalCode();
            } else {
                var16_15 = 0;
                var8_8 = null;
                var15_14 = 0.0f;
            }
            var3_3.putString((String)var2_2, (String)var8_8);
            var2_2 = var7_7.getSV_EP_EDD_TYPE();
            var3_3.putString((String)var2_2, (String)var4_4);
            var2_2 = var12_11.o;
            if (var2_2 != null) {
                var17_16 = var2_2.getEddTimeDiff();
                var2_2 = Long.valueOf(var17_16).toString();
            } else {
                var19_17 = false;
                var2_2 = null;
            }
            var19_17 = TextUtils.isEmpty((CharSequence)var2_2);
            var4_4 = "";
            if (!var19_17) {
                var2_2 = var12_11.o;
                if (var2_2 != null) {
                    var17_16 = var2_2.getEddTimeDiff();
                    var20_18 = var5_5.convert(var17_16, (TimeUnit)var1_1);
                    var1_1 = var20_18;
                } else {
                    var22_19 = false;
                    var1_1 = null;
                }
            } else {
                var1_1 = var4_4;
            }
            var2_2 = var7_7.getSV_EP_EDD_MAX();
            var1_1 = String.valueOf(var1_1);
            var3_3.putString((String)var2_2, (String)var1_1);
            var1_1 = var12_11.o;
            if (var1_1 != null) {
                var1_1 = var1_1.getEstimateDeliveryDateYYYYMMDD();
            } else {
                var22_19 = false;
                var1_1 = null;
            }
            var22_19 = TextUtils.isEmpty((CharSequence)var1_1);
            if (!var22_19) {
                var1_1 = var12_11.o;
                if (var1_1 != null) {
                    var4_4 = var1_1.getEstimateDeliveryDateYYYYMMDD();
                } else {
                    var9_9 = false;
                    var4_4 = null;
                }
            }
            var1_1 = var7_7.getSV_ESTIMATE_DELIVERY_DATE();
            var3_3.putString((String)var1_1, (String)var4_4);
            var1_1 = var7_7.getSV_EP_EDD_MODE();
            var2_2 = var12_11.o;
            if (var2_2 != null) {
                var14_13 = var2_2.getDeliveryModeValue();
            }
            var3_3.putString((String)var1_1, var14_13);
            var1_1 = this.a.e;
            var22_19 = var1_1.e();
            if (var22_19 && (var1_1 = var12_11.j) != null && (var1_1 = var1_1.getConvenienceFee()) != null) {
                var2_2 = ss_1.a;
                var2_2 = new Bundle();
                var4_4 = ss_1.a;
                var5_5 = var1_1.getCOD();
                if (var5_5 != null) {
                    var7_7 = var5_5.getAmount();
                    if (var7_7 != null && (var7_7 = var7_7.getValue()) != null) {
                        var8_8 = var4_4.getSV_EP_COD_FEE_SLASHED();
                        var2_2.putString((String)var8_8, (String)var7_7);
                    }
                    if ((var5_5 = var5_5.getNetAmount()) != null && (var5_5 = var5_5.getValue()) != null) {
                        var7_7 = var4_4.getSV_EP_COD_FEE_ACTUAL();
                        var2_2.putString((String)var7_7, (String)var5_5);
                    }
                }
                if ((var5_5 = var1_1.getRVP()) != null && (var5_5 = var5_5.getAmount()) != null && (var5_5 = var5_5.getValue()) != null) {
                    var7_7 = var4_4.getSV_EP_RVP_FEE();
                    var2_2.putString((String)var7_7, (String)var5_5);
                }
                if ((var5_5 = var1_1.getDelivery()) != null) {
                    var7_7 = var5_5.getNetAmount();
                    if (var7_7 != null && (var7_7 = var7_7.getValue()) != null) {
                        var8_8 = var4_4.getSV_EP_DELIVERY_FEE();
                        var2_2.putString((String)var8_8, (String)var7_7);
                    }
                    if ((var5_5 = var5_5.getAmount()) != null && (var5_5 = var5_5.getValue()) != null) {
                        var7_7 = var4_4.getSV_EP_DELIVERY_SLASHED_FEE();
                        var2_2.putString((String)var7_7, (String)var5_5);
                    }
                }
                if ((var1_1 = var1_1.getTotal()) != null && (var1_1 = var1_1.getNetAmount()) != null && (var1_1 = var1_1.getValue()) != null) {
                    var4_4 = var4_4.getSV_EP_TOTAL_CONV_FEE();
                    var2_2.putString((String)var4_4, (String)var1_1);
                }
                var3_3.putAll((Bundle)var2_2);
            }
            var1_1 = this.d;
            var8_8 = var1_1.getPrevScreen();
            var13_12 = var1_1.getPrevScreenType();
            var5_5 = "single page checkout";
            var7_7 = "single page checkout";
            var4_4 = this.c;
            var12_11 = var3_3;
            var4_4.newPushCustomScreenView((String)var5_5, (String)var7_7, (String)var8_8, var3_3, (String)var13_12);
            var1_1 = AnalyticsManager.Companion;
            var2_2 = "single page checkout";
            vb0_0.a((AnalyticsManager$Companion)var1_1, (String)var2_2, var3_3);
        }
    }
}

