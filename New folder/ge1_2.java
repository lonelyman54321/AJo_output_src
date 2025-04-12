/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.query.QueryLPBalance;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import com.ril.ajio.services.data.Payment.BannerInfo;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gE1
 */
public final class ge1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ge1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.b;
        var3_3 = 1;
        var4_4 = this.a;
        switch (var4_4) {
            default: {
                var5_5 = var1_1;
                var5_5 = (DataCallback)var1_1;
                var2_2 = (g)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, "this$0");
                Intrinsics.checkNotNullParameter(var5_5, "paymentInstrumentDataCallback");
                var6_7 = cp_1.Companion;
                var7_9 = nn_2.b((cp$a)var6_7, (DataCallback)var5_5);
                if (var7_9 != 0) {
                    var7_9 = var5_5.getStatus();
                    var8_10 = 0;
                    if (var7_9 == 0) {
                        if ((var5_5 = (PaymentInstruments)var5_5.getData()) != null && (var6_7 = var5_5.getPaymentInstrumentDetails()) != null) {
                            var7_9 = var6_7.size();
                        } else {
                            var7_9 = 0;
                            var6_7 = null;
                        }
                        var9_11 = null;
                        if (var7_9 > 0) {
                            var6_7 = var2_2.Wa();
                            if (var5_5 != null) {
                                var6_7.s = var5_5;
                                var10_12 = var5_5.getCashOnDeliveryInformation();
                                if (var10_12 != null && !(var13_15 = Intrinsics.areEqual(var11_13 = var10_12.isEligible(), var12_14 = Boolean.TRUE)) && !(var13_15 = TextUtils.isEmpty((CharSequence)(var11_13 = var10_12.getGa_reason())))) {
                                    var10_12 = var10_12.getGa_reason();
                                } else {
                                    var10_12 = var6_7.E;
                                    if (var10_12 != null && (var10_12 = var10_12.getFraudEngineResponseDetails()) != null && (var10_12 = var10_12.getResult()) != null && (var10_12 = var10_12.getOutcomeWithoutPayment()) != null) {
                                        var10_12 = var10_12.getAction();
                                    } else {
                                        var14_16 = 0;
                                        var10_12 = null;
                                    }
                                    var11_13 = "COD_BLOCK";
                                    var14_16 = (int)var11_13.equalsIgnoreCase((String)var10_12);
                                    var12_14 = "others - blocked from fraud engine";
                                    if (var14_16 != 0) {
                                        while (true) {
                                            var10_12 = var12_14;
                                            break;
                                        }
                                    } else {
                                        var10_12 = var6_7.E;
                                        if (var10_12 != null && (var10_12 = var10_12.getFraudEngineResponseDetails()) != null && (var10_12 = var10_12.getResult()) != null && (var10_12 = var10_12.getCOD()) != null) {
                                            var10_12 = var10_12.getAction();
                                        } else {
                                            var14_16 = 0;
                                            var10_12 = null;
                                        }
                                        var14_16 = (int)var11_13.equalsIgnoreCase((String)var10_12);
                                        if (var14_16 != 0) ** continue;
                                        var14_16 = 0;
                                        var10_12 = null;
                                    }
                                }
                                if (var10_12 != null) {
                                    var11_13 = "spc errors - cod disable -";
                                    var15_17 = var11_13.concat((String)var10_12);
                                    Intrinsics.checkNotNullExpressionValue(var15_17, "toString(...)");
                                    var10_12 = AnalyticsManager.Companion.getInstance();
                                    var12_14 = var10_12.getGtmEvents();
                                    var16_18 = "single page checkout";
                                    var17_19 = 0;
                                    var18_20 = null;
                                    var19_21 = "errors interactions";
                                    var20_22 = "business_error";
                                    var21_23 = "business error";
                                    var22_24 = 32;
                                    GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)var12_14, (String)var19_21, (String)var20_22, (String)var21_23, (String)var15_17, (String)var16_18, null, var22_24, null);
                                }
                                if ((var10_12 = var5_5.getOrder()) != null) {
                                    var11_13 = var10_12.getNetPayableAmount();
                                    var23_25 = false;
                                    var24_26 = 0.0f;
                                    var12_14 = null;
                                    var13_15 = Intrinsics.areEqual((Float)var11_13, 0.0f);
                                    if (var13_15) {
                                        var11_13 = var10_12.getAmount();
                                        var10_12.setNetPayableAmount((Float)var11_13);
                                    }
                                    if ((var11_13 = var6_7.E) != null) {
                                        var11_13.setOrder((Order)var10_12);
                                    }
                                    if ((var10_12 = var6_7.E) != null) {
                                        var10_12 = var10_12.getOrder();
                                    } else {
                                        var14_16 = 0;
                                        var10_12 = null;
                                    }
                                    if (var10_12 != null) {
                                        var10_12 = var6_7.E;
                                        if (var10_12 != null && (var10_12 = var10_12.getOrder()) != null && (var10_12 = var10_12.getNetPayableAmount()) != null) {
                                            var24_26 = var10_12.floatValue();
                                        }
                                        var6_7.o = var24_26;
                                    }
                                }
                                var10_12 = z40_0.Companion;
                                var11_13 = var6_7.getApplication();
                                var10_12.getClass();
                                var10_12 = z40$a.a((Context)var11_13).a;
                                var11_13 = "loyaltyEnable";
                                var14_16 = (int)var10_12.a((String)var11_13);
                                if (var14_16 != 0) {
                                    var10_12 = oo2_0.a;
                                    var11_13 = var6_7.s;
                                    var10_12.getClass();
                                    var10_12 = oo2_0.c("SAVED_CARD", (PaymentInstruments)var11_13);
                                    if (var10_12 != null && (var10_12 = var10_12.getPaymentInstrumentsInfo()) != null) {
                                        var10_12 = var10_12.iterator();
                                        while (var13_15 = var10_12.hasNext()) {
                                            var11_13 = (PaymentInstrumentInfo)var10_12.next();
                                            if (var11_13 == null) continue;
                                            var12_14 = oo2_0.a;
                                            var19_21 = var11_13.isLRManaged();
                                            var12_14.getClass();
                                            var23_25 = oo2_0.k((String)var19_21);
                                            if (!var23_25) continue;
                                            var12_14 = var6_7.h;
                                            var12_14.add(var11_13);
                                        }
                                    }
                                }
                                if ((var14_16 = (int)og1_1.b()) == 0) {
                                    var10_12 = z40_0.Companion;
                                    var11_13 = var6_7.getApplication();
                                    var10_12.getClass();
                                    var10_12 = z40$a.a((Context)var11_13).a;
                                    var11_13 = "firebase_enable_instant_disc_msg";
                                    var14_16 = (int)var10_12.a((String)var11_13);
                                    if (var14_16 != 0 && (var10_12 = var6_7.E) != null && (var10_12 = var10_12.getBanners()) != null) {
                                        var10_12 = ((Iterable)var10_12).iterator();
                                        while (var13_15 = var10_12.hasNext()) {
                                            var11_13 = (BannerInfo)var10_12.next();
                                            if (var11_13 != null) {
                                                var12_14 = var11_13.getBoostPrepayEnabled();
                                                var19_21 = Boolean.TRUE;
                                                var23_25 = Intrinsics.areEqual(var12_14, var19_21);
                                            } else {
                                                var23_25 = false;
                                                var24_26 = 0.0f;
                                                var12_14 = null;
                                            }
                                            if (!var23_25) continue;
                                            var12_14 = var11_13.getDescription();
                                            var11_13 = var11_13.getTncUrl();
                                            var6_7.z = var10_12 = new InstantDiscountInfo((String)var12_14, (String)var11_13);
                                            break;
                                        }
                                    }
                                }
                                InternalWalletUtil.a.getClass();
                                var6_7 = InternalWalletUtil.e();
                                var6_7.clear();
                            } else {
                                var6_7.getClass();
                            }
                            var6_7 = var2_2.l;
                            if (var6_7 == null || (var6_7 = var6_7.getPayId()) == null) {
                                var6_7 = "";
                            }
                            if ((var14_16 = (var10_12 = var2_2.Wa().h).size()) > 0) {
                                var10_12 = var2_2.c;
                                if (var10_12 != null && (var14_16 = (int)var10_12.z5()) == var3_3 && (var10_12 = var2_2.c) != null) {
                                    var10_12.a();
                                }
                                var10_12 = var2_2.Va();
                                var11_13 = var2_2.Wa().h;
                                var12_14 = var2_2.f;
                                var19_21 = var2_2.Wa().E;
                                var10_12.getClass();
                                var20_22 = "lrManagedCardList";
                                Intrinsics.checkNotNullParameter(var11_13, (String)var20_22);
                                var21_23 = go2_0.a;
                                Intrinsics.checkNotNullParameter(var11_13, (String)var20_22);
                                var20_22 = new ArrayList();
                                var25_27 = var11_13.size();
                                while (var8_10 < var25_27) {
                                    var15_17 = var11_13.get(var8_10);
                                    Intrinsics.checkNotNullExpressionValue(var15_17, "get(...)");
                                    var15_17 = (PaymentInstrumentInfo)var15_17;
                                    var16_18 = new QueryLPBalance();
                                    var18_20 = var15_17.isLRManaged();
                                    var16_18.setIsLRManaged((String)var18_20);
                                    var18_20 = var15_17.getPaymentInstrumentId();
                                    var17_19 = var6_7.equalsIgnoreCase((String)var18_20);
                                    if (var17_19 != 0 && var12_14 != null && (var17_19 = var12_14.length()) != 0) {
                                        var16_18.setMobile((String)var12_14);
                                    } else {
                                        var18_20 = var15_17.getRegisteredMobile();
                                        var17_19 = (int)TextUtils.isEmpty((CharSequence)var18_20);
                                        if (var17_19 == 0) {
                                            var18_20 = var15_17.getRegisteredMobile();
                                            var16_18.setMobile((String)var18_20);
                                        } else {
                                            if (var19_21 != null) {
                                                var18_20 = var19_21.getCustomer();
                                            } else {
                                                var17_19 = 0;
                                                var18_20 = null;
                                            }
                                            if (var18_20 != null) {
                                                var18_20 = var19_21.getCustomer();
                                                if (var18_20 != null) {
                                                    var18_20 = var18_20.getMobile();
                                                } else {
                                                    var17_19 = 0;
                                                    var18_20 = null;
                                                }
                                                var16_18.setMobile((String)var18_20);
                                            }
                                        }
                                    }
                                    var18_20 = var15_17.getPaymentInstrumentId();
                                    var16_18.setPayId((String)var18_20);
                                    var15_17 = var15_17.getCardNumber();
                                    var16_18.setCardNumber((String)var15_17);
                                    var20_22.add(var16_18);
                                    var8_10 += var3_3;
                                }
                                var10_12.e((ArrayList)var20_22, (TenantResponse)var19_21);
                            } else {
                                var2_2.db();
                                var2_2.Ra();
                            }
                            var26_28 = Unit.a;
                        }
                        if (var5_5 != null && (var26_28 = var2_2.Wa().E) != null && (var26_28 = var26_28.getCartInternalWalletsEnabled()) != null && (var3_3 = (int)var26_28.booleanValue()) != 0 && (var3_3 = (int)go2_0.a((PaymentInstruments)var5_5)) == 0) {
                            var26_28 = var2_2.Wa();
                            var5_5 = var2_2.Wa();
                            var2_2 = var2_2.Wa().E;
                            if (var2_2 != null) {
                                var9_11 = var2_2.getInternalWallets();
                            }
                            var5_5.getClass();
                            var2_2 = kj2_1.b(var9_11);
                            var26_28.getClass();
                            var5_5 = "<set-?>";
                            Intrinsics.checkNotNullParameter(var2_2, (String)var5_5);
                            var26_28.w = var2_2;
                        }
                    } else {
                        var27_30 = var5_5.getStatus();
                        if (var27_30 == var3_3) {
                            var2_2 = yn3_0.a;
                            var26_29 = "Payment Instrument Status Failure";
                            var5_5 = new Object[]{};
                            var2_2.d(var26_29, (Object[])var5_5);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        var5_6 = var1_1;
        var5_6 = (LoginSignupBenefitsBannerData)var1_1;
        var2_2 = (oa1_1)var2_2;
        var6_8 = "$loginViewModel";
        Intrinsics.checkNotNullParameter(var2_2, var6_8);
        if (var5_6 != null) {
            var2_2.getClass();
            Intrinsics.checkNotNullParameter(var5_6, "data");
            vl0_0.a = var3_3;
            vl0_0.b = var5_6;
            var2_2 = var5_6.getAppLoginBannerUrl();
            var5_6 = re1_1.b;
            var5_6.setValue(var2_2);
            re1_1.e = var3_3;
        }
        return Unit.a;
    }
}

