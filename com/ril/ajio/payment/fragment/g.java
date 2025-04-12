/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ToggleButton
 */
package com.ril.ajio.payment.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.payment.activity.TermsAndConditionActivity;
import com.ril.ajio.payment.fragment.a;
import com.ril.ajio.payment.fragment.c;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.payment.fragment.d$a;
import com.ril.ajio.payment.fragment.g$a;
import com.ril.ajio.payment.fragment.g$b;
import com.ril.ajio.payment.fragment.g$c;
import com.ril.ajio.payment.fragment.g$d;
import com.ril.ajio.payment.fragment.g$e;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.payment.fragment.i;
import com.ril.ajio.payment.juspay.JuspayActivity;
import com.ril.ajio.payment.offer.OfferBottomSheetFragment;
import com.ril.ajio.payment.query.QueryLPOtp;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel;
import com.ril.ajio.services.data.Payment.BannerInfo;
import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.EMI;
import com.ril.ajio.services.data.Payment.FEPayment;
import com.ril.ajio.services.data.Payment.FEResult;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.NetBanking;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.OrderSummary;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.PaymentInformation;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import com.ril.ajio.services.data.Payment.VerifyVpaRequest;
import com.ril.ajio.services.data.Payment.VerifyVpaRequestUPI;
import com.ril.ajio.services.data.Payment.Wallet;
import com.ril.ajio.services.data.ajiocash.GiftCard;
import com.ril.ajio.services.data.user.AffiliateData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;

public final class g
extends fw_2
implements dv_0,
vp1_2,
k0,
dn2_1 {
    public static final g$a Companion;
    public static boolean w = true;
    public op2_2 a;
    public do2_0 b;
    public n82_0 c;
    public boolean d = true;
    public fq2_2 e;
    public String f;
    public PayNowResponse g;
    public String h;
    public String i;
    public String j;
    public PriceValidation k;
    public LpStoredCardBalance l;
    public final D m;
    public final String n;
    public final String o;
    public final NewCustomEventsRevamp p;
    public boolean q;
    public String r;
    public String s;
    public String t;
    public String u;
    public final hh3_2 v;

    static {
        g$a g$a;
        Companion = g$a = new Object();
    }

    public g() {
        Object object = "";
        this.h = object;
        Object object2 = Reflection.getOrCreateKotlinClass(kj2_1.class);
        Object object3 = new g$c(this);
        Object object4 = new g$d(this);
        g$e g$e = new g$e(this);
        this.m = object2 = LW0.a(this, (yn1_2)object2, (Function0)object3, (Function0)object4, g$e);
        object2 = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.n = object4 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        this.o = object3 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        this.p = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.r = object;
        this.s = object;
        this.t = object;
        this.u = object;
        object = new tp0_2(this, 1);
        this.v = object = yr1_2.b((Function0)object);
    }

    public final void D0(PayNowRequest object, PaymentInstrumentInfo object2) {
        boolean bl2;
        boolean bl3;
        Object object3;
        Object object4 = this.Va();
        object4.getClass();
        int n3 = 0;
        Object object5 = null;
        if (object2 != null) {
            object3 = ((PaymentInstrumentInfo)object2).isTokenized();
            Boolean bl4 = Boolean.FALSE;
            bl3 = Intrinsics.areEqual(object3, bl4);
        } else {
            bl3 = false;
            object3 = null;
        }
        if (bl3 && (bl2 = ((Boolean)(object4 = (Boolean)((op2_2)object4).J.getValue())).booleanValue())) {
            object4 = this.getActivity();
            if (object4 != null && !(bl2 = object4.isFinishing()) && (bl2 = this.isAdded())) {
                bl2 = false;
                object4 = null;
                if (object2 != null) {
                    object5 = ((PaymentInstrumentInfo)object2).getCardType();
                } else {
                    n3 = 0;
                    object5 = null;
                }
                if (object5 != null && (n3 = ((String)object5).length()) != 0) {
                    if (object2 != null) {
                        object5 = ((PaymentInstrumentInfo)object2).getCardType();
                    } else {
                        n3 = 0;
                        object5 = null;
                    }
                } else {
                    n3 = R$string.default_card_type;
                    object5 = this.getString(n3);
                }
                object3 = "";
                if (object5 == null) {
                    object5 = object3;
                }
                if ((object2 = object2 != null ? ((PaymentInstrumentInfo)object2).getIconUrl() : null) != null) {
                    object3 = object2;
                }
                int n4 = 1;
                object2 = new y12_0(n4, this, object);
                Intrinsics.checkNotNullParameter(object2, "callback");
                object = new i();
                ((i)object).b = object2;
                ((i)object).h = object3;
                ((i)object).i = object5;
                object2 = this.b;
                if (object2 == null) {
                    object2 = "paymentListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object4 = object2;
                }
                object2 = "SecurePayment";
                object4.p0((fw_2)object, (String)object2);
            }
        } else {
            this.Pa((PayNowRequest)object, false);
        }
    }

    public final void Ea(boolean bl2) {
        Object object;
        boolean bl3 = bl2;
        Object object2 = this.Wa().e;
        boolean bl4 = ((m80_0)object2).d();
        if (!bl4) {
            return;
        }
        this.q = bl2;
        object2 = this.c;
        if (object2 != null) {
            object2.a();
        }
        op2_2 op2_22 = this.Va();
        PaymentInstruments paymentInstruments = this.Wa().s;
        TenantResponse tenantResponse = this.Wa().E;
        hj_1 hj_12 = hj_1.COD;
        object2 = this.Wa();
        HashSet hashSet = ((kj2_1)object2).w;
        int n3 = 1048575;
        PriceRequest priceRequest = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n3, null);
        if (bl3) {
            object = "COD";
            priceRequest.setPaymentInstrument((String)object);
        }
        op2_22.getClass();
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        object = md3_0.c(op2_22);
        object2 = new jp2_2(op2_22, paymentInstruments, tenantResponse, hashSet, priceRequest, hj_12, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    public final void Ga() {
        boolean bl2;
        Object object = null;
        this.k = null;
        Object object2 = this.getActivity();
        if (object2 != null && !(bl2 = object2.isFinishing()) && (bl2 = this.isAdded())) {
            boolean bl3;
            object2 = oo2_0.a;
            Object object3 = this.Wa().s;
            object2.getClass();
            object2 = oo2_0.c("EMI", (PaymentInstruments)object3);
            if (object2 != null) {
                object3 = ((PaymentInstrumentType)object2).getPaymentInstrumentsInfo();
            } else {
                bl3 = false;
                object3 = null;
            }
            if (object3 != null && !(bl3 = object3.isEmpty())) {
                Serializable serializable;
                object3 = this.Wa();
                serializable = object2 != null && (serializable = ((PaymentInstrumentType)object2).getPaymentInstrumentsInfo()) != null && (serializable = (PaymentInstrumentInfo)CollectionsKt.N(0, (List)((Object)serializable))) != null ? ((PaymentInstrumentInfo)serializable).getStandard_emi() : null;
                ((kj2_1)object3).m = serializable;
                object3 = this.Wa();
                if (object2 != null && (object2 = ((PaymentInstrumentType)object2).getPaymentInstrumentsInfo()) != null && (object2 = (PaymentInstrumentInfo)CollectionsKt.N(0, (List)object2)) != null) {
                    object2 = ((PaymentInstrumentInfo)object2).getNo_cost_emi();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                ((kj2_1)object3).n = object2;
                object2 = this.b;
                if (object2 == null) {
                    object2 = "paymentListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object = object2;
                }
                object2 = new hy0_2();
                object3 = "EmiListFragment";
                object.p0((fw_2)object2, (String)object3);
            }
        }
    }

    public final void H9(AjioGiftCardModel ajioGiftCardModel) {
        ajioGiftCardModel.getAmount();
        double d2 = ajioGiftCardModel.getAmount();
        double d5 = 0.0;
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (d7 > 0) {
            InternalWalletUtil internalWalletUtil = InternalWalletUtil.a;
            double d9 = ajioGiftCardModel.getAmount();
            internalWalletUtil.getClass();
            InternalWalletUtil.b = d9;
            this.Ua();
        }
    }

    public final void I2(UPI object, PayNowRequest object2) {
        Object object3 = this.Wa().E;
        if (object3 != null) {
            this.k = null;
            this.Va().I = object;
            object = "collect upi";
            this.bb((PayNowRequest)object2, (String)object);
            object2 = this.Wa();
            object3 = "UPI";
            int n3 = 6;
            kj2_1.e((kj2_1)object2, (String)object3, 0, (String)object, n3);
        }
    }

    public final void I3(int n3, ArrayList arrayList) {
        char c2;
        int n4;
        Object object;
        boolean bl2;
        Object object2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList, "installedApps");
        Bundle bundle = new Bundle();
        int c22 = n3;
        bundle.putInt("upi_count", n3);
        Object object3 = arrayList.iterator();
        object2 = "";
        while (bl2 = object3.hasNext()) {
            object = ((UpiAppInfo)object3.next()).getName();
            String string2 = ",";
            object2 = n1.a((String)object2, (String)object, string2);
        }
        int n7 = ((String)object2).length();
        if (n7 > (n4 = 100)) {
            n7 = 0;
            object2 = ((String)object2).substring(0, n4);
            object3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        }
        Object object4 = (n7 = ((String)object2).length()) != 0 && (n7 = (int)((object3 = Character.valueOf(le3_2.D((CharSequence)object2))).equals(object = Character.valueOf(c2 = ',')) ? 1 : 0)) != 0 ? (object3 = le3_2.C((String)object2)) : object2;
        object3 = oT.a;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(object4, "label");
        object3 = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        object = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp().getEC_PAYMENT_INSTRUMENT_SCR_TYPE();
        String string3 = oT.b;
        String string4 = oT.c;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, (String)object, "saved upi on spc", (String)object4, "saved_upi_count", "single page checkout", "single page checkout", string3, bundle, string4, false, null, 1536, null);
    }

    public final void J1(PayNowRequest object) {
        Object object2 = this.Wa().E;
        if (object2 != null) {
            object2 = null;
            this.k = null;
            Object object3 = this.c;
            if (object3 != null) {
                object3.a();
            }
            op2_2 op2_22 = this.Va();
            PaymentInstruments paymentInstruments = this.Wa().s;
            TenantResponse tenantResponse = this.Wa().E;
            float f5 = this.Wa().o;
            HashSet hashSet = this.Wa().w;
            op2_22.j((PayNowRequest)object, paymentInstruments, tenantResponse, f5, hashSet);
            object3 = this.Wa();
            object = ((PayNowRequest)object).getNetBanking();
            if (object != null) {
                object2 = ((NetBanking)object).getCode();
            }
            object = kp1_0.c("Net Banking-", (String)object2);
            object2 = "Net Banking";
            op2_22 = null;
            int n3 = 6;
            kj2_1.e((kj2_1)object3, (String)object2, 0, (String)object, n3);
        }
    }

    public final void J7() {
        boolean bl2;
        sz_2 sz_22 = new sz_2();
        sz_22.c = bl2 = true;
        Object object = "payment screen";
        String string2 = "calledFrom";
        Intrinsics.checkNotNullParameter(object, string2);
        sz_22.d = object;
        Intrinsics.checkNotNullParameter(this, "ajioGiftCardListener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        sz_22.o = this;
        object = this.Wa().s;
        if (object != null && (object = ((PaymentInstruments)object).getEGiftCard()) != null) {
            object = ((GiftCard)object).getWalletType();
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null) {
            object = "AJIO Wallet";
        }
        sz_22.r = object;
        object = this.requireActivity().getSupportFragmentManager();
        sz_22.show((FragmentManager)object, "AddGiftCardPaymentDialog");
    }

    public final void Ka(PriceValidation priceValidation, Boolean object) {
        Boolean bl2 = Boolean.TRUE;
        boolean bl3 = Intrinsics.areEqual(object, bl2);
        if (bl3 && (object = this.c) != null) {
            object.h();
        }
        if (priceValidation == (object = this.k)) {
            return;
        }
        this.k = priceValidation;
        this.Wa().f = priceValidation;
        this.fb(priceValidation);
        object = this.c;
        if (object != null) {
            object.C9(priceValidation);
        }
        this.eb();
    }

    public final void L2() {
        n82_0 n82_02 = this.c;
        if (n82_02 != null) {
            n82_02.L7();
        }
    }

    public final void M5(Intent intent) {
        Fragment fragment = this.getTargetFragment();
        if (fragment != null) {
            int n3 = this.getTargetRequestCode();
            int n4 = -1;
            fragment.onActivityResult(n3, n4, intent);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void M7() {
        block22: {
            block18: {
                block23: {
                    block21: {
                        block25: {
                            block20: {
                                block19: {
                                    block24: {
                                        var1_1 = this;
                                        var2_2 = this.Wa().E;
                                        if (var2_2 == null) break block22;
                                        var3_5 = h40_0.a;
                                        var3_5 = z40_0.Companion;
                                        var3_5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var3_5).a.d("cod_fraud_check_new_configValue");
                                        var4_6 = "enable";
                                        var5_7 = var3_5.has((String)var4_6);
                                        var6_8 = "ENABLE_FRICTION";
                                        var7_9 = null;
                                        if (!var5_7) break block23;
                                        var8_10 = var3_5.getBoolean((String)var4_6);
                                        var9_11 = 1;
                                        var10_12 = 1.4E-45f;
                                        if (var8_10 != var9_11 || (var8_10 = com.ril.ajio.payment.fragment.g.w) == 0) break block23;
                                        var3_5 = this.Wa().s;
                                        if (var3_5 != null && (var3_5 = var3_5.getFraudEngineResponseDetails()) != null && (var3_5 = var3_5.getResult()) != null && (var3_5 = var3_5.getOutcomeWithPayment()) != null) {
                                            var3_5 = var3_5.getAction();
                                        } else {
                                            var8_10 = 0;
                                            var3_5 = null;
                                            var11_13 = 0.0f;
                                        }
                                        var8_10 = var6_8.equalsIgnoreCase((String)var3_5);
                                        if (var8_10 != 0) break block24;
                                        var3_5 = this.Wa().s;
                                        if (var3_5 != null && (var3_5 = var3_5.getFraudEngineResponseDetails()) != null && (var3_5 = var3_5.getResult()) != null && (var3_5 = var3_5.getCOD()) != null) {
                                            var3_5 = var3_5.getAction();
                                        } else {
                                            var8_10 = 0;
                                            var3_5 = null;
                                            var11_13 = 0.0f;
                                        }
                                        var8_10 = (int)var6_8.equalsIgnoreCase((String)var3_5);
                                        if (var8_10 == 0) break block23;
                                    }
                                    var2_2 = "Popup_Shown_";
                                    try {
                                        var8_10 = this.isAdded();
                                        if (var8_10 == 0) break block18;
                                        var3_5 = this.Wa();
                                        var3_5 = var3_5.E;
                                        if (var3_5 == null || (var3_5 = var3_5.getCartRequest()) == null) break block19;
                                        var3_5 = var3_5.getCartId();
                                        break block20;
                                    }
                                    catch (Exception var2_3) {
                                        break block21;
                                    }
                                }
                                var8_10 = 0;
                                var3_5 = null;
                                var11_13 = 0.0f;
                            }
                            if (var3_5 != null) {
                                var3_5 = this.Wa();
                                var3_5 = var3_5.E;
                                if (var3_5 != null && (var3_5 = var3_5.getCartRequest()) != null) {
                                    var7_9 = var3_5.getCartId();
                                }
                                var3_5 = new StringBuilder((String)var2_2);
                                var3_5.append((String)var7_9);
                                var2_2 = var3_5.toString();
                                var3_5 = "Fraud Popup Shown";
                                var4_6 = AnalyticsManager.Companion;
                                var12_14 = var4_6.getInstance();
                                var12_14 = var12_14.getGtmEvents();
                                var4_6 = var4_6.getInstance();
                                var4_6 = var4_6.getGtmEvents();
                                var4_6 = var4_6.getScreenName();
                                var12_14.pushButtonTapEvent((String)var3_5, var2_2, (String)var4_6);
                            }
                            var2_2 = this.Wa();
                            var2_2 = var2_2.E;
                            if (var2_2 == null || (var2_2 = var2_2.getOrder()) == null || (var2_2 = var2_2.getAmount()) == null) break block25;
                            var13_16 = var2_2.floatValue();
                            var14_18 = (int)var13_16;
                            ** GOTO lbl-1000
                        }
                        var14_18 = 0;
                        var13_17 = 0.0f;
                        var2_2 = null;
lbl-1000:
                        // 2 sources

                        {
                            var3_5 = var1_1.j;
                            var4_6 = "cod friction popup";
                            GAEcommerceEvents.pushCodPopOpenScreenEvent(var14_18, (String)var3_5, (String)var4_6);
                            com.ril.ajio.payment.fragment.g.w = false;
                            var2_2 = com.ril.ajio.payment.fragment.a.Companion;
                            var2_2.getClass();
                            var2_2 = new a();
                            var3_5 = new Bundle();
                            var2_2.setArguments((Bundle)var3_5);
                            var3_5 = this.getChildFragmentManager();
                            var4_6 = "CODFriction";
                            var2_2.show((FragmentManager)var3_5, (String)var4_6);
                            break block18;
                        }
                    }
                    var3_5 = yn3_0.a;
                    var3_5.e(var2_3);
                    break block18;
                }
                if ((var8_10 = (var3_5 = this.Wa().e).d()) == 0 || (var3_5 = var1_1.k) == null || (var3_5 = var3_5.getPriceSplitup()) == null || (var3_5 = var3_5.getConvenienceFee()) == null || (var3_5 = var3_5.getCOD()) == null) ** GOTO lbl-1000
                var10_12 = var3_5.getNetAmount();
                var11_13 = var3_5.getAmount();
                var5_7 = false;
                var12_15 = null;
                cfr_temp_0 = var10_12 - 0.0f;
                var9_11 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var9_11 > 0 || (var8_10 = (int)((cfr_temp_1 = var11_13 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                    var2_2 = var1_1.k;
                    if (var2_2 != null) {
                        var7_9 = var2_2.getPriceSplitup();
                    }
                    Intrinsics.checkNotNull(var7_9);
                    var2_2 = "convenienceFeePriceSplitUp";
                    Intrinsics.checkNotNullParameter(var7_9, (String)var2_2);
                    try {
                        var14_19 = this.isAdded();
                        if (var14_19) {
                            var2_2 = var1_1.v;
                            var2_2 = var2_2.getValue();
                            var2_2 = (io2_1)var2_2;
                            var2_2 = var2_2.b;
                            var2_2.k(var7_9);
                            var2_2 = new rh_2();
                            var2_2.l = var3_5 = var1_1.c;
                            var3_5 = this.Wa();
                            var3_5 = var3_5.e;
                            var4_6 = "configInitializer";
                            Intrinsics.checkNotNullParameter(var3_5, (String)var4_6);
                            var2_2.k = var3_5;
                            var3_5 = this.getChildFragmentManager();
                            var4_6 = "CODFee";
                            var2_2.show((FragmentManager)var3_5, (String)var4_6);
                        }
                    }
                    catch (Exception var2_4) {
                        var3_5 = yn3_0.a;
                        var3_5.e(var2_4);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var3_5 = oo2_0.a;
                    var4_6 = var1_1.k;
                    if (var4_6 != null) {
                        var7_9 = var4_6.getPriceSplitup();
                    }
                    var4_6 = this.Wa().e;
                    var9_11 = var4_6.d();
                    var3_5.getClass();
                    var2_2 = oo2_0.m((TenantResponse)var2_2, (PriceSplitUp)var7_9, (boolean)var9_11);
                    var1_1.ab((PayNowRequest)var2_2);
                }
            }
            var2_2 = this.Wa();
            var8_10 = 6;
            var11_13 = 8.4E-45f;
            var4_6 = "COD";
            kj2_1.e((kj2_1)var2_2, (String)var4_6, 0, (String)var4_6, var8_10);
            var2_2 = this.Wa().s;
            if (var2_2 != null && (var2_2 = var2_2.getFraudEngineResponseDetails()) != null && (var2_2 = var2_2.getResult()) != null && (var2_2 = var2_2.getCOD()) != null && (var15_20 = var2_2.getAction()) != null && ((var8_10 = (int)var15_20.equalsIgnoreCase((String)(var3_5 = "COD_FEE"))) != 0 || (var8_10 = (int)var15_20.equalsIgnoreCase(var6_8)) != 0)) {
                var3_5 = AnalyticsManager.Companion;
                var4_6 = var3_5.getInstance();
                var7_9 = var4_6.getNewCustomEventsRevamp();
                if ((var2_2 = var2_2.getRule()) == null) {
                    var2_2 = "";
                }
                var16_21 = cv_0.a((AnalyticsManager$Companion)var3_5);
                var17_22 = 1760;
                var18_23 = "Fraud engine";
                var19_24 = "COD_fraud_engine_response";
                var20_25 = "single page checkout";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var7_9, var18_23, var15_20, (String)var2_2, var19_24, var20_25, null, null, null, var16_21, false, null, var17_22, null);
            }
        }
    }

    public final void Oa() {
        Object object = this.c;
        if (object != null) {
            object.a();
        }
        object = this.Va();
        PaymentInstruments paymentInstruments = this.Wa().s;
        TenantResponse tenantResponse = this.Wa().E;
        hj_1 hj_12 = hj_1.INTERNAL_WALLET;
        HashSet hashSet = this.Wa().w;
        op2_2.d((op2_2)object, paymentInstruments, tenantResponse, hj_12, hashSet);
    }

    public final void Pa(PayNowRequest object, boolean bl2) {
        Object object2;
        boolean bl3 = false;
        this.g = null;
        Object object3 = this.Va();
        object3.getClass();
        if (bl2 && (object2 = ((PayNowRequest)object).getCard()) != null) {
            bl3 = true;
            ((Card)object2).setTokenizationRequired(bl3);
        }
        if ((object2 = this.c) != null) {
            object2.a();
        }
        this.f = object2 = ((PayNowRequest)object).getRegisteredMobile();
        object2 = this.Va();
        object3 = this.Wa().s;
        Object object4 = this.Wa().E;
        HashSet hashSet = this.Wa().w;
        ((op2_2)object2).h((PayNowRequest)object, (PaymentInstruments)object3, (TenantResponse)object4, hashSet);
        object = this.Wa();
        object4 = "Credit/Debit Card";
        kj2_1.e((kj2_1)object, (String)object4, 0, (String)object4, 6);
    }

    public final void Qa() {
        boolean bl2 = dm0_0.e;
        if (bl2 && (bl2 = this.d)) {
            this.d = false;
            dm0_0.d = bl2 = true;
        }
    }

    public final void R1(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "code");
        Object object = this.c;
        if (object != null) {
            object.Q7(n3);
        }
        op2_2 op2_22 = this.Va();
        PaymentInstruments paymentInstruments = this.Wa().s;
        TenantResponse tenantResponse = this.Wa().E;
        op2_22.getClass();
        Object object2 = "walletCode";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(string2);
        if (paymentInstruments != null) {
            object2 = md3_0.c(op2_22);
            object = new mp2_2(op2_22, paymentInstruments, tenantResponse, arrayList, string2, null);
            int n4 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object, n4);
        }
    }

    public final void Ra() {
        Object object;
        String string2;
        boolean bl2;
        op2_2 op2_22 = this.Va();
        PaymentInstruments paymentInstruments = this.Wa().s;
        TenantResponse tenantResponse = this.Wa().E;
        Object object2 = this.Wa().u;
        boolean bl3 = this.Wa().v;
        op2_22.getClass();
        Intrinsics.checkNotNullParameter(object2, "internalWalletsAvailable");
        ArrayList<String> arrayList = new ArrayList<String>();
        object2 = ((HashSet)object2).iterator();
        while (bl2 = object2.hasNext()) {
            string2 = (String)object2.next();
            boolean bl4 = Intrinsics.areEqual(string2, object = "AJIO_CASH_WALLET");
            if (bl4) continue;
            arrayList.add(string2);
        }
        int n3 = arrayList.isEmpty() ^ 1;
        if (n3 != 0 && paymentInstruments != null) {
            lp2_2 lp2_22;
            object = md3_0.c(op2_22);
            bl2 = false;
            string2 = null;
            object2 = lp2_22;
            lp2_22 = new lp2_2(op2_22, paymentInstruments, tenantResponse, arrayList, bl3, null);
            n3 = 3;
            op2_22 = null;
            Ae3.d((i90_0)object, null, null, lp2_22, n3);
        }
    }

    public final void Sa(Boolean object, boolean bl2) {
        Object object2 = Boolean.TRUE;
        int n3 = Intrinsics.areEqual(object, object2);
        if (n3 != 0) {
            Bundle bundle = new Bundle();
            object = AnalyticsManager.Companion;
            String string2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getPAYMENT_MODE();
            bundle.putString(string2, "cod");
            String string3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getEC_CHECKOUT_INTERACTIONS();
            String string4 = "checkout_interactions";
            String string5 = "sustainable & empathetic halfcut ";
            String string6 = "review order";
            object2 = this;
            this.g(string3, string5, string6, bundle, string4);
            object = this.getActivity();
            if (object != null && (n3 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                object = this.requireActivity();
                ((ComponentActivity)object).onBackPressed();
            }
            return;
        }
        object = this.Wa().E;
        if (object != null) {
            object2 = null;
            if (bl2) {
                oo2_0 oo2_02 = oo2_0.a;
                Object object3 = this.k;
                if (object3 != null) {
                    object2 = ((PriceValidation)object3).getPriceSplitup();
                }
                object3 = this.Wa().e;
                boolean bl3 = ((m80_0)object3).d();
                oo2_02.getClass();
                object = oo2_0.m((TenantResponse)object, (PriceSplitUp)object2, bl3);
                this.ab((PayNowRequest)object);
            } else {
                n3 = -1;
                this.k(null, n3);
            }
        }
    }

    public final void Ta(Intent object) {
        Object object2;
        if (object != null) {
            object2 = "Status";
            object.getStringExtra((String)object2);
        }
        object = this.i;
        object2 = PayNowResponse.class;
        if ((object = (PayNowResponse)JsonUtils.fromJson((String)object, (Class)object2)) != null) {
            long l2;
            object2 = object.getTransactionInformation();
            long l3 = object2 != null && (object2 = ((TransactionInformation)object2).getPollingTime()) != null ? (Long)object2 : l2;
            long l4 = l3 - (l2 = 0L);
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 > 0) {
                if ((object = object.getTransactionInformation()) != null && (object = object.getPollingTime()) != null) {
                    l2 = object.longValue();
                }
            } else {
                l2 = 3000L;
            }
            object = new fq2_2(l2, this);
            this.e = object;
            object = this.Wa().E;
            if (object != null) {
                oo2_0.a.getClass();
                object2 = oo2_0.s((TenantResponse)object);
                Object object4 = this.c;
                if (object4 != null) {
                    object4.a();
                }
                object4 = this.Va();
                ((op2_2)object4).l((TransactionStatusRequest)object2, (TenantResponse)object);
            }
            if ((object = this.e) != null) {
                object.start();
            }
        }
    }

    public final void Ua() {
        int n3;
        Object object = no2_0.a;
        int n4 = 3;
        if (object != null && (n3 = ((String)object).length()) != 0 && (object = no2_0.b) != null && (n3 = ((String)object).length()) != 0) {
            object = this.Va();
            TenantResponse tenantResponse = this.Wa().E;
            String string2 = this.Wa().D;
            object.getClass();
            aW aW2 = md3_0.c((jD3)object);
            np2_2 np2_22 = new np2_2((op2_2)object, string2, tenantResponse, null);
            Ae3.d(aW2, null, null, np2_22, n4);
        } else {
            op2_2 op2_22 = this.Va();
            if (op2_22 != null) {
                PaymentInstruments paymentInstruments = this.Wa().s;
                TenantResponse tenantResponse = this.Wa().E;
                HashSet hashSet = this.Wa().w;
                Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
                hj_1 hj_12 = hj_1.INTERNAL_WALLET;
                Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
                object = md3_0.c(op2_22);
                ip2_2 ip2_22 = new ip2_2(op2_22, paymentInstruments, tenantResponse, hashSet, null, hj_12, null);
                Ae3.d((i90_0)object, null, null, ip2_22, n4);
            }
        }
    }

    public final op2_2 Va() {
        op2_2 op2_22 = this.a;
        if (op2_22 != null) {
            return op2_22;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentViewModel");
        return null;
    }

    public final void W9(ka0_0 object) {
        Object object2 = ka0_0.NET_BANKING_PAYMENT;
        if (object == object2) {
            object = this.r;
            object2 = this.s;
            this.Xa((String)object, (String)object2);
        } else {
            object2 = ka0_0.UPI_PAYMENT;
            if (object == object2) {
                this.Ya();
            }
        }
    }

    public final kj2_1 Wa() {
        return (kj2_1)this.m.getValue();
    }

    public final void Xa(String object, String string2) {
        qn1$a qn1$a = qn1_2.Companion;
        qn1$a.getClass();
        boolean bl2 = qn1$a.a();
        int n3 = 1004;
        String string3 = "TENANT_RESPONSE";
        String string4 = "NET_PAYABLE";
        String string5 = "html";
        if (bl2) {
            FragmentActivity fragmentActivity = this.getActivity();
            Class<JuspayActivity> clazz = JuspayActivity.class;
            qn1$a = new Intent((Context)fragmentActivity, clazz);
            qn1$a.putExtra(string5, (String)object);
            object = this.Wa();
            float f5 = ((kj2_1)object).o;
            qn1$a.putExtra(string4, f5);
            qn1$a.putExtra(string3, string2);
            this.startActivityForResult((Intent)qn1$a, n3);
        } else {
            FragmentActivity fragmentActivity = this.getActivity();
            Class<PeWebViewActivity> clazz = PeWebViewActivity.class;
            qn1$a = new Intent((Context)fragmentActivity, clazz);
            qn1$a.putExtra(string5, (String)object);
            object = this.Wa();
            float f6 = ((kj2_1)object).o;
            qn1$a.putExtra(string4, f6);
            qn1$a.putExtra(string3, string2);
            this.startActivityForResult((Intent)qn1$a, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ya() {
        Object object = this.u;
        int n3 = TextUtils.isEmpty((CharSequence)object);
        Object object2 = null;
        Object object3 = PayNowResponse.class;
        if (n3 == 0) {
            Exception exception2;
            block13: {
                Object object4;
                block12: {
                    boolean bl2;
                    block11: {
                        object = this.t;
                        try {
                            object4 = this.getActivity();
                            if (object4 == null) return;
                            bl2 = object4.isFinishing();
                            if (bl2) return;
                            bl2 = this.isAdded();
                            if (!bl2) return;
                            object3 = JsonUtils.fromJson((String)object, (Class)object3);
                            if ((object3 = (PayNowResponse)object3) == null) break block11;
                            object4 = ((PayNowResponse)object3).getTransactionInformation();
                            break block12;
                        }
                        catch (Exception exception2) {
                            break block13;
                        }
                    }
                    bl2 = false;
                    object4 = null;
                }
                if (object4 == null) return;
                if ((object3 = ((PayNowResponse)object3).getTransactionInformation()) != null && (object3 = ((TransactionInformation)object3).getPaymentInformation()) != null) {
                    object2 = ((PaymentInformation)object3).getIntentURI();
                }
                if (object2 == null) return;
                int n4 = ((String)object2).length();
                if (n4 == 0) {
                    return;
                }
                object4 = "android.intent.action.VIEW";
                object3 = new Intent((String)object4);
                object4 = this.h;
                object3.setPackage((String)object4);
                this.i = object;
                object = Uri.parse((String)object2);
                object3.setData((Uri)object);
                object = this.getActivity();
                if (object == null) return;
                n3 = object.isFinishing();
                if (n3 != 0) return;
                n3 = this.isAdded();
                if (n3 == 0) return;
                n3 = 1006;
                this.startActivityForResult((Intent)object3, n3);
                return;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception2);
            return;
        }
        object = this.t;
        object3 = (PayNowResponse)JsonUtils.fromJson((String)object, object3);
        Object object5 = this.getActivity();
        if (object5 == null) return;
        boolean bl3 = object5.isFinishing();
        if (bl3) return;
        bl3 = this.isAdded();
        if (!bl3) return;
        if (object3 == null) return;
        object5 = ((PayNowResponse)object3).getTransactionInformation();
        if (object5 == null) {
            return;
        }
        object5 = ((PayNowResponse)object3).getTransactionInformation();
        if (object5 != null) {
            object5 = ((TransactionInformation)object5).getTransactionStatus();
        } else {
            bl3 = false;
            object5 = null;
        }
        Object object6 = "PENDING";
        bl3 = ((String)object6).equalsIgnoreCase((String)object5);
        if (!bl3) {
            object2 = this.Wa();
            bl3 = dm0_0.b;
            object6 = null;
            int n7 = 12;
            object3 = new hj2_0((String)object, n7, bl3, false);
            ((kj2_1)object2).c((hj2_0)object3);
            return;
        }
        object = this.Wa();
        object6 = this.Va().I;
        object6 = object6 != null ? ((UPI)object6).getVpa() : null;
        ((kj2_1)object).q = object5 = new au3((PayNowResponse)object3, (String)object6);
        object = this.b;
        if (object == null) {
            object = "paymentListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object = new zt3_0();
        object3 = "AddCardFragment";
        object2.p0((fw_2)object, (String)object3);
    }

    public final void Z0(LpStoredCardBalance object, String string2) {
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        ak0_0.a((AnalyticsManager$Companion)object, gTMEvents, "OTPAuthenticatedSavedCard", "MobileNoenteredSavedCard");
        this.f = string2;
        this.db();
    }

    public final void Z3(PayNowRequest object) {
        Object object2 = this.Wa().E;
        if (object2 != null) {
            int n3 = 0;
            object2 = null;
            this.k = null;
            Object object3 = this.c;
            if (object3 != null) {
                object3.a();
            }
            Object object4 = this.Va();
            PaymentInstruments paymentInstruments = this.Wa().s;
            TenantResponse tenantResponse = this.Wa().E;
            float f5 = this.Wa().o;
            HashSet hashSet = this.Wa().w;
            Object object5 = object;
            ((op2_2)object4).i((PayNowRequest)object, paymentInstruments, tenantResponse, f5, hashSet);
            object3 = ((PayNowRequest)object).getEmi();
            object3 = object3 != null ? ((EMI)object3).getBankName() : null;
            object4 = "EMI-";
            object3 = kp1_0.c((String)object4, (String)object3);
            object5 = this.Wa();
            object = ((PayNowRequest)object).getEmi();
            if (object != null) {
                object2 = ((EMI)object).getBankName();
            }
            object = kp1_0.c((String)object4, (String)object2);
            n3 = 4;
            int n4 = 1;
            kj2_1.e((kj2_1)object5, (String)object3, n4, (String)object, n3);
        }
    }

    public final void Za(Intent object) {
        Object object2;
        Object object3 = this.c;
        if (object3 != null) {
            object3.h();
        }
        if (object != null) {
            object3 = "transactionresponse";
            object2 = object.getStringExtra((String)object3);
            if (object2 == null && (object = object.getExtras()) != null) {
                boolean bl2 = (object = object.get((String)object3)) instanceof String;
                if (bl2) {
                    object2 = object;
                } else {
                    bl2 = object instanceof Serializable;
                    if (bl2 && (bl2 = object instanceof PayNowResponse)) {
                        object2 = JsonUtils.toJson(object);
                    }
                }
            }
        } else {
            object2 = null;
        }
        object = this.Wa();
        boolean bl3 = dm0_0.b;
        object3 = new hj2_0((String)object2, 12, bl3, false);
        ((kj2_1)object).c((hj2_0)object3);
    }

    public final void a() {
        n82_0 n82_02 = this.c;
        if (n82_02 != null) {
            n82_02.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void ab(PayNowRequest payNowRequest) {
        boolean bl2;
        boolean bl3;
        Object object = this;
        Object object2 = payNowRequest;
        Object object3 = this.c;
        if (object3 != null) {
            object3.a();
        }
        object3 = this.Va();
        Object object4 = this.Wa().s;
        Object object5 = this.Wa().E;
        Object object6 = this.Wa();
        float f5 = ((kj2_1)object6).o;
        HashSet hashSet = this.Wa().w;
        Object object7 = this.Wa().f;
        object7 = this.Wa().e;
        boolean bl4 = ((m80_0)object7).d();
        object3.getClass();
        Object object8 = "query";
        Intrinsics.checkNotNullParameter(object2, (String)object8);
        Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
        InternalWalletUtil.a.getClass();
        Object object9 = InternalWalletUtil.g((PaymentInstruments)object4, hashSet);
        Bundle bundle = new Bundle();
        Object object10 = ((op2_2)object3).c;
        Object object11 = ((NewCustomEventsRevamp)object10).getPAYMENT_MODE();
        bundle.putString((String)object11, "cod");
        Object object12 = ((NewCustomEventsRevamp)object10).getEC_CHECKOUT_INTERACTIONS();
        int n3 = 1536;
        Object object13 = "payment accordian select";
        String string2 = "cash on delivery";
        object11 = ((op2_2)object3).d;
        object = ((op2_2)object3).e;
        Object object14 = object11;
        object11 = object10;
        NewCustomEventsRevamp newCustomEventsRevamp = object10;
        object10 = "payment_accordian_select";
        Bundle bundle2 = bundle;
        String string3 = "single page checkout";
        String string4 = "single page checkout";
        String string5 = object14;
        object14 = object;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object11, (String)object12, (String)object13, string2, (String)object10, string3, string4, string5, bundle2, (String)object, false, null, n3, null);
        object = bundle2;
        bundle2.putAll((Bundle)object9);
        boolean bl5 = dm0_0.b;
        if (bl5) {
            object12 = ((NewCustomEventsRevamp)object11).getEC_CHECKOUT_INTERACTIONS();
            n3 = 1536;
            object13 = "proceed to pay - retry";
            string2 = "cash on delivery";
            object10 = "proceed_to_pay_retry";
            String string6 = "single page checkout";
            string4 = "single page checkout";
            object9 = ((op2_2)object3).d;
            object14 = ((op2_2)object3).e;
            object11 = newCustomEventsRevamp;
            string5 = object9;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object12, (String)object13, string2, (String)object10, string6, string4, (String)object9, bundle2, (String)object14, false, null, n3, null);
        } else {
            object12 = ((NewCustomEventsRevamp)object11).getEC_CHECKOUT_INTERACTIONS();
            n3 = 1536;
            object13 = "proceed to pay";
            string2 = "cash on delivery";
            object10 = "proceed_to_pay";
            String string7 = "single page checkout";
            string4 = "single page checkout";
            object9 = ((op2_2)object3).d;
            object14 = ((op2_2)object3).e;
            object11 = newCustomEventsRevamp;
            string5 = object9;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object12, (String)object13, string2, (String)object10, string7, string4, (String)object9, bundle2, (String)object14, false, null, n3, null);
        }
        object = ((op2_2)object3).a;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, (String)object8);
        object8 = UrlHelper.Companion.getInstance();
        bl5 = false;
        object9 = new Object[]{};
        object12 = "pay_now";
        object8 = ((UrlHelper)object8).getApiUrl("payment", (String)object12, (Object[])object9);
        object9 = new HashMap();
        object11 = "";
        if (object5 == null || (object12 = ((TenantResponse)object5).getDeviceChecksum()) == null) {
            object12 = object11;
        }
        object13 = "deviceChecksum";
        ((HashMap)object9).put(object13, object12);
        if (object5 == null || (object12 = ((TenantResponse)object5).getDeviceId()) == null) {
            object12 = object11;
        }
        ((HashMap)object9).put("deviceId", object12);
        ((HashMap)object9).put("paymentChannelInformation.appType", "ANDROID");
        ((HashMap)object9).put("paymentChannelInformation.paymentChannel", "APP");
        object12 = "paymentChannelInformation.appVersion";
        object13 = "9.20.0";
        ((HashMap)object9).put(object12, object13);
        if (object5 == null || (object12 = ((TenantResponse)object5).getAccessToken()) == null) {
            object12 = object11;
        }
        object13 = "accessToken";
        ((HashMap)object9).put(object13, object12);
        object12 = payNowRequest.getCustomer();
        if (object12 != null) {
            object12 = payNowRequest.getCustomer();
            if (object12 == null || (object12 = ((Customer)object12).getEmail()) == null) {
                object12 = object11;
            }
            object13 = "customer.email";
            ((HashMap)object9).put(object13, object12);
            object12 = payNowRequest.getCustomer();
            if (object12 == null || (object12 = ((Customer)object12).getMobile()) == null) {
                object12 = object11;
            }
            object13 = "customer.mobile";
            ((HashMap)object9).put(object13, object12);
            object12 = payNowRequest.getCustomer();
            if (object12 == null || (object12 = ((Customer)object12).getUuid()) == null) {
                object12 = object11;
            }
            object13 = "customer.uuid";
            ((HashMap)object9).put(object13, object12);
        }
        if ((object12 = payNowRequest.getOrder()) != null) {
            float f6;
            object12 = payNowRequest.getOrder();
            if (object12 != null && (object12 = ((Order)object12).getAmount()) != null) {
                f6 = ((Float)object12).floatValue();
            } else {
                f6 = 0.0f;
                object12 = null;
            }
            object12 = String.valueOf(f6);
            object13 = "order.amount";
            ((HashMap)object9).put(object13, object12);
            object12 = payNowRequest.getOrder();
            if (object12 == null || (object12 = ((Order)object12).getOrderId()) == null) {
                object12 = object11;
            }
            object13 = "order.orderId";
            ((HashMap)object9).put(object13, object12);
        }
        object12 = payNowRequest.getOnepTotalPrice();
        object13 = "0";
        if (object12 == null) {
            object12 = object13;
        }
        string2 = "order.totalPrice1p";
        ((HashMap)object9).put(string2, object12);
        object12 = payNowRequest.getThreepTotalPrice();
        if (object12 != null) {
            object13 = object12;
        }
        ((HashMap)object9).put("order.totalPrice3p", object13);
        object12 = payNowRequest.getPaymentInstrument();
        if (object12 == null) {
            object12 = object11;
        }
        object13 = "paymentInstrument";
        ((HashMap)object9).put(object13, object12);
        object12 = payNowRequest.getTenant();
        if (object12 == null || (object12 = ((Tenant)object12).getCode()) == null) {
            object12 = object11;
        }
        object13 = "tenant.code";
        ((HashMap)object9).put(object13, object12);
        object12 = "order.netPayableAmount";
        object6 = String.valueOf(f5);
        ((HashMap)object9).put(object12, object6);
        if (object5 != null) {
            object6 = ((TenantResponse)object5).getTenantTransactionId();
            if (object6 == null) {
                object6 = object11;
            }
            object12 = "tenantTransactionId";
            ((HashMap)object9).put(object12, object6);
            object6 = ((TenantResponse)object5).getRequestChecksum();
            if (object6 == null) {
                object6 = object11;
            }
            object12 = "requestChecksum";
            ((HashMap)object9).put(object12, object6);
            object6 = ((TenantResponse)object5).getTransactionToken();
            if (object6 == null) {
                object6 = object11;
            }
            object12 = "transactionToken";
            ((HashMap)object9).put(object12, object6);
            if (bl4 ? (object6 = ((TenantResponse)object5).getCartCheckSumCOD()) == null : (object6 = ((TenantResponse)object5).getCartCheckSum()) == null) {
                object6 = object11;
            }
            object7 = "cartCheckSum";
            ((HashMap)object9).put(object7, object6);
        } else {
            object6 = "TenantResponse is null";
            mz3_0.F((String)object6);
        }
        f5 = Float.MIN_VALUE;
        dm0_0.b = true;
        int n4 = hashSet.size();
        if (n4 > 0 && object5 != null) {
            object6 = oo2_0.a;
            object6.getClass();
            object4 = oo2_0.i((PaymentInstruments)object4, (TenantResponse)object5, hashSet);
            ((HashMap)object9).putAll(object4);
        }
        object4 = (bl3 = ((HashSet)(object4 = InternalWalletUtil.a())).isEmpty()) ? "false" : "true";
        object5 = "notes[eligibleToEarnLoyalty]";
        ((HashMap)object9).put(object5, object4);
        object4 = ((oo2_1)object).c.b();
        if (object4 != null) {
            object5 = ((AffiliateData)object4).getUtmMedium();
        } else {
            bl2 = false;
            object5 = null;
        }
        object6 = "affiliate";
        bl2 = Intrinsics.areEqual(object5, object6);
        if (bl2) {
            if (object4 == null || (object5 = ((AffiliateData)object4).getUtmSource()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.utmSource";
            ((HashMap)object9).put(object6, object5);
            if (object4 == null || (object5 = ((AffiliateData)object4).getUtmMedium()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.utmMedium";
            ((HashMap)object9).put(object6, object5);
            if (object4 == null || (object5 = ((AffiliateData)object4).getClickId()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.clickId";
            ((HashMap)object9).put(object6, object5);
            if (object4 == null || (object5 = ((AffiliateData)object4).getOfferId()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.offerId";
            ((HashMap)object9).put(object6, object5);
            if (object4 == null || (object5 = ((AffiliateData)object4).getReturnCancellationWindow()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.returnCancellationWindow";
            ((HashMap)object9).put(object6, object5);
            if (object4 == null || (object5 = ((AffiliateData)object4).getUtmCampaign()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.utmCampaign";
            ((HashMap)object9).put(object6, object5);
            if (object4 == null || (object5 = ((AffiliateData)object4).getAttributionWindow()) == null) {
                object5 = object11;
            }
            object6 = "affiliateData.attributionWindow";
            ((HashMap)object9).put(object6, object5);
            if (object4 != null && (object4 = ((AffiliateData)object4).getAffiliateId()) != null) {
                object11 = object4;
            }
            ((HashMap)object9).put("affiliateData.affiliateId", object11);
            object2 = oo2_1.e(payNowRequest);
            object4 = "affiliateData.conversionId";
            ((HashMap)object9).put(object4, object2);
        }
        object9.toString();
        dm0_0.a = object9;
        object2 = ((oo2_1)object).a.payNow((String)object8, "PAYMENT_PayNowByCOD", (Map)object9);
        object4 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object4);
        object4 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object4);
        object4 = new ln_2(object, 3);
        object = new ty1_1(1, (Function1)object4);
        object4 = new s53_0((q63_0)object2, (bx0_2)object);
        object = new Object();
        object2 = new u53_0((q63_0)object4, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        object = new ta_0(object3, 1);
        object4 = new kp2_1((ta_0)object);
        object = new lp2_1((op2_2)object3);
        object5 = new mp2_1(object, 0);
        object = ((g53_0)object2).f((o60_0)object4, (o60_0)object5);
        ((op2_2)object3).b.b((yr0_2)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(OfferDetails object) {
        Exception exception2;
        block4: {
            Object object2;
            block3: {
                boolean bl2;
                block2: {
                    try {
                        bl2 = this.isAdded();
                        if (!bl2) return;
                        if (object == null) break block2;
                        object2 = ((OfferDetails)object).getNetPayableAmount();
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                bl2 = false;
                object2 = null;
            }
            object = OfferBottomSheetFragment.Oa((OfferDetails)object, (Float)object2);
            object2 = this.getChildFragmentManager();
            String string2 = "OfferBottomSheetFragment";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        String string2;
        Object object;
        Serializable serializable;
        Object object2 = this.Wa().s;
        Serializable serializable2 = null;
        if (object2 != null && (object2 = ((PaymentInstruments)object2).getPaymentInstrumentDetails()) != null) {
            boolean bl2;
            object2 = ((Iterable)object2).iterator();
            while (bl2 = object2.hasNext()) {
                boolean bl3;
                serializable = object2.next();
                object = serializable;
                object = (PaymentInstrumentType)serializable;
                if (object != null) {
                    object = ((PaymentInstrumentType)object).getPaymentInstrumentCode();
                } else {
                    bl3 = false;
                    object = null;
                }
                if (!(bl3 = Intrinsics.areEqual(object, string2 = "EMI"))) continue;
                serializable2 = serializable;
                break;
            }
            serializable2 = (PaymentInstrumentType)serializable2;
        }
        if (serializable2 != null) {
            object2 = new ArrayList();
            int n3 = 4095;
            string2 = null;
            double d2 = 0.0;
            int n4 = -2;
            int n7 = -1;
            object = "EMI";
            serializable = new PaymentInstrumentInfo((String)object, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, d2, null, false, null, null, null, null, null, null, null, arrayList2, arrayList3, arrayList, n4, n7, n3, null);
            ((ArrayList)object2).add(serializable);
            if (serializable2 != null) {
                serializable = Boolean.TRUE;
                ((PaymentInstrumentType)serializable2).setEmiDataSent((Boolean)serializable);
            }
            if (serializable2 != null) {
                ((PaymentInstrumentType)serializable2).setPaymentInstrumentsInfo((ArrayList)object2);
            }
            object2 = this.Wa().B;
            serializable2 = Boolean.TRUE;
            ((LiveData)object2).k(serializable2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void bb(PayNowRequest var1_1, String var2_2) {
        block57: {
            block58: {
                block56: {
                    var3_3 = var1_1;
                    var4_4 = var2_2;
                    var5_5 = this;
                    var6_6 = this.c;
                    if (var6_6 != null) {
                        var6_6.a();
                    }
                    var6_6 = this.Va();
                    var7_7 = this.Wa().s;
                    var8_8 = this.Wa().E;
                    var9_9 = this.Wa();
                    var10_10 = var9_9.o;
                    var11_11 = this.Wa().w;
                    var6_6.getClass();
                    var12_12 = "query";
                    Intrinsics.checkNotNullParameter(var3_3, (String)var12_12);
                    Intrinsics.checkNotNullParameter(var11_11, "internalWalletSelectedViews");
                    var13_13 = "paymentType";
                    Intrinsics.checkNotNullParameter(var4_4, (String)var13_13);
                    InternalWalletUtil.a.getClass();
                    InternalWalletUtil.g((PaymentInstruments)var7_7, var11_11);
                    var14_14 = new Bundle();
                    var15_15 = var6_6.c;
                    var16_16 = var15_15.getPAYMENT_MODE();
                    var14_14.putString((String)var16_16, "upi");
                    var17_17 = var15_15.getEC_CHECKOUT_INTERACTIONS();
                    var18_18 = 1536;
                    var19_19 = "payment accordian select";
                    var20_20 = "upi";
                    var16_16 = var6_6.d;
                    var5_5 = var6_6.e;
                    var21_21 = var16_16;
                    var16_16 = var15_15;
                    var22_22 = var15_15;
                    var15_15 = "payment_accordian_select";
                    var23_23 = "single page checkout";
                    var24_24 = "single page checkout";
                    var25_25 = var21_21;
                    var21_21 = var14_14;
                    var26_26 = var5_5;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var16_16, (String)var17_17, (String)var19_19, (String)var20_20, (String)var15_15, var23_23, var24_24, (String)var25_25, (Bundle)var14_14, (String)var5_5, false, null, var18_18, null);
                    var27_27 = dm0_0.b;
                    if (var27_27) {
                        var17_17 = var16_16.getEC_CHECKOUT_INTERACTIONS();
                        var18_18 = 1536;
                        var19_19 = "proceed to pay - retry";
                        var20_20 = "upi";
                        var15_15 = "proceed_to_pay_retry";
                        var23_23 = "single page checkout";
                        var24_24 = "single page checkout";
                        var5_5 = var6_6.d;
                        var26_26 = var6_6.e;
                        var16_16 = var22_22;
                        var25_25 = var5_5;
                        NewCustomEventsRevamp.newPushCustomEvent$default(var22_22, (String)var17_17, (String)var19_19, (String)var20_20, (String)var15_15, var23_23, var24_24, (String)var5_5, (Bundle)var14_14, (String)var26_26, false, null, var18_18, null);
                    } else {
                        var17_17 = var16_16.getEC_CHECKOUT_INTERACTIONS();
                        var18_18 = 1536;
                        var19_19 = "proceed to pay";
                        var20_20 = "upi";
                        var15_15 = "proceed_to_pay";
                        var23_23 = "single page checkout";
                        var24_24 = "single page checkout";
                        var5_5 = var6_6.d;
                        var26_26 = var6_6.e;
                        var16_16 = var22_22;
                        var25_25 = var5_5;
                        NewCustomEventsRevamp.newPushCustomEvent$default(var22_22, (String)var17_17, (String)var19_19, (String)var20_20, (String)var15_15, var23_23, var24_24, (String)var5_5, (Bundle)var14_14, (String)var26_26, false, null, var18_18, null);
                    }
                    var5_5 = var6_6.a;
                    var5_5.getClass();
                    Intrinsics.checkNotNullParameter(var3_3, (String)var12_12);
                    Intrinsics.checkNotNullParameter(var4_4, (String)var13_13);
                    var12_12 = UrlHelper.Companion.getInstance();
                    var28_28 = 0;
                    var13_13 = null;
                    var14_14 = new Object[]{};
                    var17_17 = "pay_now";
                    var12_12 = var12_12.getApiUrl("payment", (String)var17_17, (Object[])var14_14);
                    var14_14 = new HashMap();
                    var16_16 = "";
                    if (var8_8 == null || (var17_17 = var8_8.getDeviceChecksum()) == null) {
                        var17_17 = var16_16;
                    }
                    var19_19 = "deviceChecksum";
                    var14_14.put(var19_19, var17_17);
                    if (var8_8 == null || (var17_17 = var8_8.getDeviceId()) == null) {
                        var17_17 = var16_16;
                    }
                    var14_14.put("deviceId", var17_17);
                    var17_17 = "paymentChannelInformation.appType";
                    var19_19 = "ANDROID";
                    var14_14.put(var17_17, var19_19);
                    if (var8_8 == null || (var17_17 = var8_8.getAccessToken()) == null) {
                        var17_17 = var16_16;
                    }
                    var19_19 = "accessToken";
                    var14_14.put(var19_19, var17_17);
                    var17_17 = var1_1.getCustomer();
                    if (var17_17 != null) {
                        var17_17 = var1_1.getCustomer();
                        if (var17_17 == null || (var17_17 = var17_17.getEmail()) == null) {
                            var17_17 = var16_16;
                        }
                        var19_19 = "customer.email";
                        var14_14.put(var19_19, var17_17);
                        var17_17 = var1_1.getCustomer();
                        if (var17_17 == null || (var17_17 = var17_17.getMobile()) == null) {
                            var17_17 = var16_16;
                        }
                        var19_19 = "customer.mobile";
                        var14_14.put(var19_19, var17_17);
                        var17_17 = var1_1.getCustomer();
                        if (var17_17 == null || (var17_17 = var17_17.getUuid()) == null) {
                            var17_17 = var16_16;
                        }
                        var19_19 = "customer.uuid";
                        var14_14.put(var19_19, var17_17);
                    }
                    if ((var17_17 = var1_1.getOrder()) != null) {
                        var17_17 = var1_1.getOrder();
                        if (var17_17 != null && (var17_17 = var17_17.getAmount()) != null) {
                            var29_29 = var17_17.floatValue();
                        } else {
                            var29_29 = 0.0f;
                            var17_17 = null;
                        }
                        var17_17 = String.valueOf(var29_29);
                        var19_19 = "order.amount";
                        var14_14.put(var19_19, var17_17);
                        var17_17 = var1_1.getOrder();
                        if (var17_17 == null || (var17_17 = var17_17.getOrderId()) == null) {
                            var17_17 = var16_16;
                        }
                        var19_19 = "order.orderId";
                        var14_14.put(var19_19, var17_17);
                    }
                    var17_17 = var1_1.getOnepTotalPrice();
                    var19_19 = "0";
                    if (var17_17 == null) {
                        var17_17 = var19_19;
                    }
                    var20_20 = "order.totalPrice1p";
                    var14_14.put(var20_20, var17_17);
                    var17_17 = var1_1.getThreepTotalPrice();
                    if (var17_17 != null) {
                        var19_19 = var17_17;
                    }
                    var14_14.put("order.totalPrice3p", var19_19);
                    var14_14.put("paymentChannelInformation.paymentChannel", "APP");
                    var19_19 = "9.20.0";
                    var14_14.put("paymentChannelInformation.appVersion", var19_19);
                    var17_17 = var1_1.getPaymentInstrument();
                    if (var17_17 == null) {
                        var17_17 = var16_16;
                    }
                    var19_19 = "paymentInstrument";
                    var14_14.put(var19_19, var17_17);
                    var17_17 = var1_1.getUpi();
                    if (var17_17 != null) {
                        var13_13 = var17_17.getIntent();
                        var17_17 = Boolean.TRUE;
                        var28_28 = Intrinsics.areEqual(var13_13, var17_17);
                    }
                    var17_17 = "true";
                    var19_19 = null;
                    if (var28_28 == 0) break block56;
                    var13_13 = var1_1.getUpi();
                    if (var13_13 != null) {
                        var13_13 = var13_13.getIntent();
                    } else {
                        var28_28 = 0;
                        var13_13 = null;
                    }
                    var13_13 = String.valueOf(var13_13);
                    var20_20 = "upi.intent";
                    var14_14.put(var20_20, var13_13);
                    break block57;
                }
                var13_13 = var1_1.getUpi();
                if (var13_13 != null) {
                    var13_13 = var13_13.getPaymentInstrumentId();
                } else {
                    var28_28 = 0;
                    var13_13 = null;
                }
                if (var13_13 == null) break block58;
                var13_13 = var1_1.getUpi();
                if (var13_13 == null || (var13_13 = var13_13.getPaymentInstrumentId()) == null) {
                    var13_13 = var16_16;
                }
                var20_20 = "upi.paymentInstrumentId";
                var14_14.put(var20_20, var13_13);
                break block57;
            }
            if (var7_7 != null && (var13_13 = var7_7.getEncryptionData()) != null) {
                var13_13 = var13_13.getPublicKey();
            } else {
                var28_28 = 0;
                var13_13 = null;
            }
            if (var13_13 == null || (var28_28 = var13_13.length()) == 0) ** GOTO lbl-1000
            if (var7_7 != null && (var13_13 = var7_7.getEncryptionData()) != null) {
                var13_13 = var13_13.getVersion();
            } else {
                var28_28 = 0;
                var13_13 = null;
            }
            if (var13_13 != null && (var28_28 = var13_13.length()) != 0) {
                if (var7_7 == null || (var20_20 = var7_7.getEncryptionData()) == null || (var20_20 = var20_20.getPublicKey()) == null) {
                    var20_20 = var16_16;
                }
                if (var7_7 == null || (var15_15 = var7_7.getEncryptionData()) == null || (var15_15 = var15_15.getVersion()) == null) {
                    var15_15 = var16_16;
                }
                var13_13 = new gq2_2((String)var20_20, (String)var15_15);
                var14_14.put("encryptedPaymentInstrumentPresent", var17_17);
                var20_20 = var1_1.getUpi();
                var20_20 = var20_20 != null ? var20_20.getVpa() : null;
                var13_13 = var13_13.a((String)var20_20);
                if (var13_13 == null) {
                    var13_13 = var16_16;
                }
                var20_20 = "upi.encryptedUPIInfo";
                var14_14.put(var20_20, var13_13);
            } else lbl-1000:
            // 2 sources

            {
                if ((var13_13 = var1_1.getUpi()) == null || (var13_13 = var13_13.getVpa()) == null) {
                    var13_13 = var16_16;
                }
                var20_20 = "upi.vpa";
                var14_14.put(var20_20, var13_13);
            }
            var13_13 = var1_1.getUpi();
            if (var13_13 != null) {
                var13_13 = var13_13.getSaveUPI();
            } else {
                var28_28 = 0;
                var13_13 = null;
            }
            var13_13 = String.valueOf(var13_13);
            var20_20 = "upi.saveUPI";
            var14_14.put(var20_20, var13_13);
        }
        var13_13 = var1_1.getTenant();
        if (var13_13 == null || (var13_13 = var13_13.getCode()) == null) {
            var13_13 = var16_16;
        }
        var20_20 = "tenant.code";
        var14_14.put(var20_20, var13_13);
        var13_13 = "order.netPayableAmount";
        var9_9 = String.valueOf(var10_10);
        var14_14.put(var13_13, var9_9);
        if (var8_8 != null) {
            var9_9 = var8_8.getTenantTransactionId();
            if (var9_9 == null) {
                var9_9 = var16_16;
            }
            var13_13 = "tenantTransactionId";
            var14_14.put(var13_13, var9_9);
            var9_9 = var8_8.getRequestChecksum();
            if (var9_9 == null) {
                var9_9 = var16_16;
            }
            var13_13 = "requestChecksum";
            var14_14.put(var13_13, var9_9);
            var9_9 = var8_8.getTransactionToken();
            if (var9_9 == null) {
                var9_9 = var16_16;
            }
            var13_13 = "transactionToken";
            var14_14.put(var13_13, var9_9);
            var9_9 = var8_8.getCartCheckSum();
            if (var9_9 == null) {
                var9_9 = var16_16;
            }
            var13_13 = "cartCheckSum";
            var14_14.put(var13_13, var9_9);
        } else {
            var9_9 = "TenantResponse is null";
            mz3_0.F((String)var9_9);
        }
        var30_30 = var11_11.size();
        if (var30_30 > 0 && var8_8 != null) {
            var9_9 = oo2_0.a;
            var9_9.getClass();
            var7_7 = oo2_0.i(var7_7, (TenantResponse)var8_8, var11_11);
            var14_14.putAll(var7_7);
        }
        if ((var7_7 = var1_1.getOfferDetails()) != null) {
            var7_7 = var7_7.entrySet().iterator();
            while (var31_31 = var7_7.hasNext()) {
                var8_8 = (Map.Entry)var7_7.next();
                var9_9 = (String)var8_8.getKey();
                if ((var8_8 = (String)var8_8.getValue()) == null || (var32_32 = var8_8.length()) == 0) continue;
                var14_14.put(var9_9, var8_8);
            }
        }
        InternalWalletUtil.a.getClass();
        var7_7 = InternalWalletUtil.a();
        var33_33 = var7_7.isEmpty();
        if (var33_33) {
            var17_17 = "false";
        }
        var14_14.put("notes[eligibleToEarnLoyalty]", var17_17);
        var7_7 = var5_5.c.b();
        if (var7_7 != null) {
            var19_19 = var7_7.getUtmMedium();
        }
        if (var31_31 = Intrinsics.areEqual(var19_19, var8_8 = "affiliate")) {
            if (var7_7 == null || (var8_8 = var7_7.getUtmSource()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.utmSource";
            var14_14.put(var9_9, var8_8);
            if (var7_7 == null || (var8_8 = var7_7.getUtmMedium()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.utmMedium";
            var14_14.put(var9_9, var8_8);
            if (var7_7 == null || (var8_8 = var7_7.getClickId()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.clickId";
            var14_14.put(var9_9, var8_8);
            if (var7_7 == null || (var8_8 = var7_7.getOfferId()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.offerId";
            var14_14.put(var9_9, var8_8);
            if (var7_7 == null || (var8_8 = var7_7.getReturnCancellationWindow()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.returnCancellationWindow";
            var14_14.put(var9_9, var8_8);
            if (var7_7 == null || (var8_8 = var7_7.getUtmCampaign()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.utmCampaign";
            var14_14.put(var9_9, var8_8);
            if (var7_7 == null || (var8_8 = var7_7.getAttributionWindow()) == null) {
                var8_8 = var16_16;
            }
            var9_9 = "affiliateData.attributionWindow";
            var14_14.put(var9_9, var8_8);
            if (var7_7 != null && (var7_7 = var7_7.getAffiliateId()) != null) {
                var16_16 = var7_7;
            }
            var14_14.put("affiliateData.affiliateId", var16_16);
            var3_3 = oo2_1.e(var1_1);
            var7_7 = "affiliateData.conversionId";
            var14_14.put(var7_7, var3_3);
        }
        var14_14.put("upi.code", var4_4);
        dm0_0.b = true;
        var14_14.toString();
        dm0_0.a = var14_14;
        var3_3 = var5_5.a.payNow((String)var12_12, "PAYMENT_PayNowByUPI", (Map)var14_14);
        var4_4 = qt2_2.c;
        var3_3 = var3_3.h((Scheduler)var4_4);
        var4_4 = ti_2.a();
        var3_3 = var3_3.e((Scheduler)var4_4);
        var4_4 = new m5_0(var5_5, 2);
        var5_5 = new pn2_2((m5_0)var4_4);
        var4_4 = new s53_0((q63_0)var3_3, (bx0_2)var5_5);
        var3_3 = new Object();
        var5_5 = new u53_0((q63_0)var4_4, (bx0_2)var3_3);
        Intrinsics.checkNotNullExpressionValue(var5_5, "onErrorReturn(...)");
        var3_3 = new jm0_2((jD3)var6_6, 1);
        var4_4 = new to2_1((jm0_2)var3_3);
        var3_3 = new uo2_1((op2_2)var6_6);
        var7_7 = new wo2_0(var3_3);
        var3_3 = var5_5.f((o60_0)var4_4, (o60_0)var7_7);
        var6_6.b.b((yr0_2)var3_3);
    }

    public final void c() {
        Object object = this.c;
        if (object != null) {
            object.c();
        }
        if ((object = this.Wa().s) != null && (object = ((PaymentInstruments)object).getFraudEngineResponseDetails()) != null && (object = ((FraudEngineResponse)object).getResult()) != null && (object = ((FEResult)object).getOTP_VALIDATION()) != null) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
            String string2 = ((FEPayment)object).getAction();
            String string3 = "";
            String string4 = string2 == null ? string3 : string2;
            object = ((FEPayment)object).getRule();
            Object object2 = object == null ? string3 : object;
            String string5 = cv_0.a(analyticsManager$Companion);
            string3 = "Fraud engine";
            String string6 = "OTP_VALIDATION_fraud_engine_response";
            String string7 = "single page checkout";
            int n3 = 1760;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, (String)object2, string6, string7, null, null, null, string5, false, null, n3, null);
        }
    }

    public final void cb(PriceValidation object, hj_1 object2, boolean bl2) {
        if (object != null) {
            hj_1 hj_12;
            this.i4((PriceValidation)object);
            boolean bl3 = this.d;
            if (bl3 && object2 == (hj_12 = hj_1.INTERNAL_WALLET) && !(bl3 = dm0_0.e)) {
                dm0_0.c = true;
                bl3 = false;
                hj_12 = null;
                this.d = false;
            }
            if (object2 == (hj_12 = hj_1.INTERNAL_WALLET) && (object2 = this.c) != null) {
                object2.c1();
            }
            object2 = bl2;
            this.Ka((PriceValidation)object, (Boolean)object2);
            object = this.c;
            if (object != null) {
                object.K3();
            }
        }
    }

    public final void d6(String object) {
        boolean bl2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Intent intent = new Intent((Context)aJIOApplication, TermsAndConditionActivity.class);
        aJIOApplication = new Bundle();
        String string2 = "url";
        aJIOApplication.putString(string2, (String)object);
        intent.putExtras((Bundle)aJIOApplication);
        object = this.getActivity();
        if (object != null && !(bl2 = object.isFinishing()) && (object = this.getActivity()) != null) {
            object.startActivity(intent);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void db() {
        block93: {
            block101: {
                block100: {
                    block90: {
                        block89: {
                            block87: {
                                block94: {
                                    block92: {
                                        var1_1 = 1;
                                        var2_2 = this.Wa();
                                        var3_3 = go2_0.a;
                                        var3_3 = this.Wa().s;
                                        var4_4 = "INTERNAL_WALLET";
                                        Intrinsics.checkNotNullExpressionValue(var4_4, (String)var4_4);
                                        if (var3_3 != null && (var3_3 = var3_3.getPaymentInstrumentDetails()) != null) {
                                            var3_3 = ((Iterable)var3_3).iterator();
                                            while ((var5_5 = var3_3.hasNext()) != 0) {
                                                var6_6 = (PaymentInstrumentType)var3_3.next();
                                                if (var6_6 != null) {
                                                    var7_7 = var6_6.getPaymentInstrumentCode();
                                                } else {
                                                    var8_8 = 0;
                                                    var7_7 = null;
                                                }
                                                if ((var8_8 = kotlin.text.b.i((String)var7_7, (String)var4_4, (boolean)var1_1)) == 0) continue;
                                                break;
                                            }
                                        } else {
                                            var5_5 = 0;
                                            var9_9 = 0.0f;
                                            var6_6 = null;
                                        }
                                        var3_3 = "AJIO_CASH_WALLET";
                                        if (var6_6 != null && (var6_6 = var6_6.getPaymentInstrumentsInfo()) != null) {
                                            var6_6 = var6_6.iterator();
                                            while (var10_10 = var6_6.hasNext()) {
                                                var11_11 = (PaymentInstrumentInfo)var6_6.next();
                                                if (var11_11 != null) {
                                                    var12_12 = var11_11.getType();
                                                } else {
                                                    var13_13 = false;
                                                    var12_12 = null;
                                                }
                                                if (!(var13_13 = Intrinsics.areEqual(var3_3, var12_12))) continue;
                                                var6_6 = var11_11.getEarn();
                                                if (var6_6 == null) break;
                                                var9_9 = var6_6.floatValue();
                                                break;
                                            }
                                        } else {
                                            var5_5 = 0;
                                            var9_9 = 0.0f;
                                            var6_6 = null;
                                        }
                                        var2_2.j = var9_9;
                                        var2_2 = this.Va();
                                        var6_6 = this.Wa().s;
                                        var11_11 = this.Wa();
                                        var14_14 = var11_11.j;
                                        var12_12 = this.Wa().p;
                                        var15_15 = this.Wa().w;
                                        var16_16 = this.Wa().u;
                                        var2_2.getClass();
                                        var17_17 = "internalWalletSelectedViews";
                                        Intrinsics.checkNotNullParameter(var15_15, (String)var17_17);
                                        var18_18 = "internalWalletsAvailable";
                                        Intrinsics.checkNotNullParameter(var16_16, (String)var18_18);
                                        var19_19 = cp_1.Companion;
                                        var19_19.getClass();
                                        var20_20 = cp$a.i();
                                        if (var20_20 == 0) {
                                            var15_15.clear();
                                        }
                                        var16_16.clear();
                                        var2_2 = var2_2.x;
                                        var19_19 = DataCallback.Companion;
                                        var21_21 = go2_0.a;
                                        Intrinsics.checkNotNullParameter(var15_15, (String)var17_17);
                                        Intrinsics.checkNotNullParameter(var16_16, (String)var18_18);
                                        if (var6_6 != null) break block92;
                                        var22_22 = new ArrayList();
                                        var3_3 = var19_19;
                                        break block93;
                                    }
                                    var21_21 = new ArrayList<Object>();
                                    var23_23 = var6_6.getBanners();
                                    if (var23_23 != null) {
                                        var24_24 = var23_23.size();
                                    } else {
                                        var24_24 = 0;
                                        var23_23 = null;
                                    }
                                    var25_25 = "";
                                    if (var24_24 > 0) {
                                        var23_23 = new qq2_2(var25_25, var1_1);
                                        var21_21.add(var23_23);
                                    }
                                    if ((var23_23 = var6_6.getEGiftCard()) != null) {
                                        var24_24 = (int)var23_23.isGiftCardLiveSPC();
                                    } else {
                                        var24_24 = 0;
                                        var23_23 = null;
                                    }
                                    var26_26 = cp$a.t();
                                    if (var26_26 && var24_24 != 0) {
                                        var24_24 = 1;
                                    } else {
                                        var24_24 = 0;
                                        var23_23 = null;
                                    }
                                    var27_27 = InternalWalletUtil.a;
                                    var27_27.getClass();
                                    var7_7 = "internalWalletsData";
                                    Intrinsics.checkNotNullParameter(var21_21, (String)var7_7);
                                    Intrinsics.checkNotNullParameter(var15_15, (String)var17_17);
                                    Intrinsics.checkNotNullParameter(var16_16, (String)var18_18);
                                    var8_8 = go2_0.a((PaymentInstruments)var6_6);
                                    var17_17 = var6_6.getPaymentInstrumentDetails();
                                    if (var17_17 == null) break block94;
                                    var17_17 = ((Iterable)var17_17).iterator();
                                    while ((var28_28 = var17_17.hasNext()) != 0) {
                                        var29_29 = (PaymentInstrumentType)var17_17.next();
                                        if (var29_29 != null) {
                                            var30_30 = var29_29.getPaymentInstrumentCode();
                                            var18_18 = var30_30;
                                        } else {
                                            var31_31 = 0;
                                            var32_32 = 0.0f;
                                            var18_18 = null;
                                        }
                                        if ((var31_31 = kotlin.text.b.i((String)var18_18, (String)var4_4, (boolean)var1_1)) == 0) continue;
                                        if (var29_29 != null && (var4_4 = var29_29.getPaymentInstrumentsInfo()) != null) {
                                            var33_33 = var4_4.size();
                                        } else {
                                            var33_33 = 0;
                                            var4_4 = null;
                                        }
                                        if (var29_29 == null || (var17_17 = var29_29.getPaymentInstrumentsInfo()) == null) break;
                                        var17_17 = var17_17.iterator();
                                        var31_31 = 0;
                                        var32_32 = 0.0f;
                                        var18_18 = null;
                                        while ((var28_28 = var17_17.hasNext()) != 0) {
                                            block99: {
                                                block95: {
                                                    block86: {
                                                        block96: {
                                                            block97: {
                                                                block98: {
                                                                    var22_22 = var29_29 = var17_17.next();
                                                                    var22_22 = (PaymentInstrumentInfo)var29_29;
                                                                    var34_34 = var17_17;
                                                                    if (var22_22 == null || (var17_17 = var22_22.getCode()) == null) break block95;
                                                                    var28_28 = var17_17.length();
                                                                    if (var28_28 <= 0) break block96;
                                                                    var16_16.add(var17_17);
                                                                    var35_35 = var31_31;
                                                                    var36_36 = var32_32;
                                                                    var18_18 = var22_22.getCode();
                                                                    var31_31 = Intrinsics.areEqual(var18_18, var3_3);
                                                                    if (var31_31 == 0) break block97;
                                                                    var18_18 = var22_22.getAvailableAmount();
                                                                    if (var18_18 != null) {
                                                                        var37_37 = var18_18.floatValue();
                                                                        var31_31 = 0;
                                                                        var32_32 = 0.0f;
                                                                        var18_18 = null;
                                                                    } else {
                                                                        var31_31 = 0;
                                                                        var32_32 = 0.0f;
                                                                        var18_18 = null;
                                                                        var26_26 = false;
                                                                        var37_37 = 0.0f;
                                                                        var27_27 = null;
                                                                    }
                                                                    var28_28 = (int)((cfr_temp_0 = var37_37 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                                    if (var28_28 <= 0) break block97;
                                                                    var38_38 = var19_19;
                                                                    var39_39 = InternalWalletUtil.b;
                                                                    var22_22.setGiftCardAmount(var39_39);
                                                                    if (var8_8 == 0) {
                                                                        var18_18 = cp_1.Companion;
                                                                        var18_18.getClass();
                                                                        var31_31 = cp$a.i();
                                                                        if (var31_31 == 0) {
                                                                            var15_15.add(var17_17);
                                                                        }
                                                                    }
                                                                    var41_40 = 31;
                                                                    var31_31 = 1;
                                                                    var32_32 = 1.4E-45f;
                                                                    if (var33_33 <= var31_31) break block98;
                                                                    var18_18 = var6_6.getDisplayAjioWalletAboveLoader();
                                                                    var31_31 = (int)Intrinsics.areEqual(var18_18, var19_19 = Boolean.TRUE);
                                                                    if (var31_31 != 0) {
                                                                        var42_41 = 12;
                                                                        var29_29 = var19_19;
                                                                        var19_19 = new InternalWalletDataHolder((boolean)var8_8, (PaymentInstrumentInfo)var22_22, null, null, var42_41, null);
                                                                        var18_18 = new qq2_2((InternalWalletDataHolder)var19_19, var41_40);
                                                                        var21_21.add(var18_18);
                                                                        var31_31 = 0;
                                                                        var32_32 = 0.0f;
                                                                        var18_18 = null;
                                                                        var20_20 = 29;
                                                                        var22_22 = new qq2_2(null, var20_20);
                                                                        var21_21.add(var22_22);
                                                                    } else {
                                                                        var31_31 = 0;
                                                                        var32_32 = 0.0f;
                                                                        var20_20 = 29;
                                                                        var17_17 = new qq2_2(null, var20_20);
                                                                        var21_21.add(var17_17);
                                                                        var42_41 = 12;
                                                                        var29_29 = var18_18;
                                                                        var18_18 = new InternalWalletDataHolder((boolean)var8_8, (PaymentInstrumentInfo)var22_22, null, null, var42_41, null);
                                                                        var1_1 = 31;
                                                                        var17_17 = new qq2_2((InternalWalletDataHolder)var18_18, var1_1);
                                                                        var21_21.add(var17_17);
                                                                    }
                                                                    var31_31 = 1;
                                                                    var32_32 = 1.4E-45f;
                                                                    break block99;
                                                                }
                                                                var42_41 = 12;
                                                                var29_29 = var18_18;
                                                                var18_18 = new InternalWalletDataHolder((boolean)var8_8, (PaymentInstrumentInfo)var22_22, null, null, var42_41, null);
                                                                var1_1 = 31;
                                                                var17_17 = new qq2_2((InternalWalletDataHolder)var18_18, var1_1);
                                                                var21_21.add(var17_17);
                                                                break block86;
                                                            }
lbl211:
                                                            // 2 sources

                                                            while (true) {
                                                                var38_38 = var19_19;
                                                                break block86;
                                                                break;
                                                            }
                                                        }
                                                        var35_35 = var31_31;
                                                        var36_36 = var32_32;
                                                        ** continue;
                                                    }
                                                    var31_31 = var35_35;
                                                    var32_32 = var36_36;
                                                    break block99;
                                                }
                                                var35_35 = var31_31;
                                                var36_36 = var32_32;
                                                var38_38 = var19_19;
                                            }
                                            var17_17 = var34_34;
                                            var19_19 = var38_38;
                                            var1_1 = 1;
                                        }
                                        var35_35 = var31_31;
                                        var36_36 = var32_32;
                                        var38_38 = var19_19;
                                        break block87;
                                    }
                                }
                                var38_38 = var19_19;
                                var35_35 = 0;
                                var36_36 = 0.0f;
                            }
                            if (var35_35 == 0) {
                                block88: {
                                    var1_1 = (int)var16_16.contains(var3_3);
                                    if (var1_1 != 0) {
                                        var1_1 = var16_16.size();
                                        if (var1_1 > (var43_42 = 1)) {
                                            while (true) {
                                                var1_1 = 1;
                                                break block88;
                                                break;
                                            }
                                        }
                                    } else if ((var1_1 = var16_16.size()) > 0) ** continue;
                                    var1_1 = 0;
                                    var22_22 = null;
                                }
                                if (var1_1 != 0) {
                                    var43_42 = 0;
                                    var3_3 = null;
                                    var33_33 = 29;
                                    var22_22 = new qq2_2(null, var33_33);
                                    var21_21.add(var22_22);
                                }
                            }
                            var22_22 = var21_21.iterator();
                            var43_42 = 0;
                            var3_3 = null;
                            while (true) {
                                var33_33 = var22_22.hasNext();
                                var44_43 = -1;
                                if (var33_33 == 0) break block89;
                                var4_4 = var22_22.next();
                                var45_44 = 1;
                                var41_40 = var43_42 + 1;
                                if (var43_42 < 0) break;
                                var4_4 = (qq2_2)var4_4;
                                var16_16 = (HashSet)InternalWalletUtil.c.getValue();
                                var33_33 = (int)var16_16.contains(var4_4 = Integer.valueOf(var4_4.a));
                                if (var33_33 == 0) {
                                    var43_42 = var41_40;
                                    continue;
                                }
                                break block90;
                                break;
                            }
                            xx_2.n();
                            throw null;
                        }
                        var43_42 = -1;
                    }
                    var1_1 = 4;
                    if (var43_42 > var44_43) {
                        var33_33 = 1;
                        var44_43 = var43_42 + 1;
                        var45_44 = R$string.redemption_options;
                        var16_16 = hv3_0.K(var45_44);
                        var41_40 = 2;
                        var4_4 = new qq2_2((String)var16_16, var41_40);
                        var21_21.add(var43_42, var4_4);
                        if (var8_8 != 0) {
                            var33_33 = 28;
                            var8_8 = 0;
                            var7_7 = null;
                            var3_3 = new qq2_2(null, var33_33);
                            var21_21.add(var44_43, var3_3);
                        }
                        if (var24_24 == 0) {
                            var3_3 = new qq2_2(var25_25, var1_1);
                            var21_21.add(var3_3);
                        }
                    }
                    if (var24_24 != 0) {
                        var33_33 = 34;
                        var3_3 = new qq2_2(var25_25, var33_33);
                        var21_21.add(var3_3);
                        var3_3 = new qq2_2(var25_25, var1_1);
                        var21_21.add(var3_3);
                    }
                    var3_3 = oo2_0.a;
                    AJIOApplication.Companion.getClass();
                    var4_4 = AJIOApplication$a.a();
                    var3_3.getClass();
                    var31_31 = 0;
                    var32_32 = 0.0f;
                    var18_18 = null;
                    var3_3 = oo2_0.f((PaymentInstruments)var6_6, (Context)var4_4, null);
                    if (var3_3 == null) break block100;
                    var46_45 = go2_0.a;
                    var47_46 = var46_45.getEC_PAYMENT_MODE_SAVED_ACTION();
                    var48_47 = var46_45.getEC_SPC_PAYMENT_MODE_SAVED_EVENT_NAME();
                    var3_3 = go2_0.b;
                    var49_48 = var3_3.getPrevScreen();
                    var50_49 = var3_3.getPrevScreenType();
                    var51_50 = 1536;
                    var52_51 = "checkout interactions";
                    var53_52 = "UPI";
                    var54_53 = "single page checkout";
                    var55_54 = "single page checkout";
                    NewCustomEventsRevamp.newPushCustomEvent$default(var46_45, var52_51, var47_46, var53_52, var48_47, var54_53, var55_54, var49_48, null, var50_49, false, null, var51_50, null);
                    var3_3 = cp_1.Companion;
                    var3_3.getClass();
                    var43_42 = (int)cp$a.s();
                    if (var43_42 == 0) ** GOTO lbl-1000
                    var3_3 = h40_0.a;
                    var3_3 = h40_0.i0();
                    var43_42 = (int)var3_3.has((String)(var4_4 = "master_flag"));
                    if (var43_42 != 0 && (var43_42 = (int)(var3_3 = h40_0.i0()).getBoolean((String)var4_4)) != 0) {
                        var43_42 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var43_42 = 0;
                        var3_3 = null;
                    }
                    if (var43_42 != 0) {
                        var43_42 = 1;
                        dm0_0.e = var43_42;
                        var33_33 = 35;
                        var3_3 = new qq2_2(var25_25, var33_33);
                        var21_21.add(var3_3);
                    }
                }
                if ((var3_3 = var6_6.getPaymentInstrumentDetails()) == null) break block101;
                var3_3 = ((Iterable)var3_3).iterator();
                while ((var33_33 = (int)var3_3.hasNext()) != 0) {
                    block102: {
                        block91: {
                            var4_4 = (PaymentInstrumentType)var3_3.next();
                            if (var4_4 != null) {
                                var6_6 = var4_4.getPaymentInstrumentCode();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                                var9_9 = 0.0f;
                            }
                            var7_7 = "CARD";
                            var44_43 = 1;
                            var5_5 = kotlin.text.b.i((String)var6_6, (String)var7_7, (boolean)var44_43);
                            if (var5_5 != 0) {
                                var8_8 = 8;
                                var6_6 = new qq2_2(var25_25, var8_8);
                                var21_21.add(var6_6);
                                var6_6 = new qq2_2(var25_25, var1_1);
                                var21_21.add(var6_6);
                            }
                            if (var4_4 != null) {
                                var6_6 = var4_4.getPaymentInstrumentCode();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                                var9_9 = 0.0f;
                            }
                            var7_7 = "NET_BANKING";
                            var44_43 = 1;
                            var5_5 = kotlin.text.b.i((String)var6_6, (String)var7_7, (boolean)var44_43);
                            if (var5_5 != 0) {
                                if (var12_12 != null && (var5_5 = var12_12.containsKey(var7_7)) == var44_43) {
                                    var5_5 = 1;
                                    var9_9 = 1.4E-45f;
                                } else {
                                    var5_5 = 0;
                                    var9_9 = 0.0f;
                                    var6_6 = null;
                                }
                                var44_43 = 9;
                                var16_16 = "Credit / Debit Card";
                                if (var5_5 != 0) {
                                    var7_7 = (ArrayList)var12_12.get(var7_7);
                                    var8_8 = 0;
                                    var7_7 = null;
                                    var6_6 = new qq2_2((String)var16_16, var44_43, 0);
                                    var21_21.add(var6_6);
                                } else {
                                    var6_6 = new qq2_2((String)var16_16, var44_43);
                                    var21_21.add(var6_6);
                                }
                                var6_6 = new qq2_2(var25_25, var1_1);
                                var21_21.add(var6_6);
                            }
                            if (var4_4 != null) {
                                var6_6 = var4_4.getPaymentInstrumentCode();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                                var9_9 = 0.0f;
                            }
                            var7_7 = "WALLET";
                            var44_43 = 1;
                            var5_5 = kotlin.text.b.i((String)var6_6, (String)var7_7, (boolean)var44_43);
                            if (var5_5 != 0) {
                                if (var12_12 != null && (var5_5 = var12_12.containsKey(var7_7)) == var44_43) {
                                    var5_5 = 1;
                                    var9_9 = 1.4E-45f;
                                } else {
                                    var5_5 = 0;
                                    var9_9 = 0.0f;
                                    var6_6 = null;
                                }
                                var44_43 = 11;
                                var16_16 = "Wallets";
                                if (var5_5 != 0) {
                                    var7_7 = (ArrayList)var12_12.get(var7_7);
                                    var8_8 = 0;
                                    var7_7 = null;
                                    var6_6 = new qq2_2((String)var16_16, var44_43, 0);
                                    var21_21.add(var6_6);
                                } else {
                                    var6_6 = new qq2_2((String)var16_16, var44_43);
                                    var21_21.add(var6_6);
                                }
                                var6_6 = new qq2_2(var25_25, var1_1);
                                var21_21.add(var6_6);
                            }
                            if (var4_4 != null) {
                                var6_6 = var4_4.getPaymentInstrumentCode();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                                var9_9 = 0.0f;
                            }
                            var7_7 = "UPI";
                            var44_43 = 1;
                            var5_5 = kotlin.text.b.i((String)var6_6, (String)var7_7, (boolean)var44_43);
                            if (var5_5 != 0) {
                                if (var12_12 != null && (var5_5 = (int)var12_12.containsKey(var7_7)) == var44_43) {
                                    var5_5 = 1;
                                    var9_9 = 1.4E-45f;
                                } else {
                                    var5_5 = 0;
                                    var9_9 = 0.0f;
                                    var6_6 = null;
                                }
                                var44_43 = 12;
                                if (var5_5 != 0) {
                                    var16_16 = (ArrayList)var12_12.get(var7_7);
                                    var45_44 = 0;
                                    var16_16 = null;
                                    var6_6 = new qq2_2((String)var7_7, var44_43, 0);
                                    var21_21.add(var6_6);
                                } else {
                                    var6_6 = new qq2_2((String)var7_7, var44_43);
                                    var21_21.add(var6_6);
                                }
                                var6_6 = new qq2_2(var25_25, var1_1);
                                var21_21.add(var6_6);
                            }
                            if (var4_4 != null) {
                                var6_6 = var4_4.getPaymentInstrumentCode();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                                var9_9 = 0.0f;
                            }
                            var7_7 = "COD";
                            var44_43 = 1;
                            var5_5 = kotlin.text.b.i((String)var6_6, (String)var7_7, (boolean)var44_43);
                            if (var5_5 != 0) {
                                if (var12_12 != null && (var5_5 = (int)var12_12.containsKey(var7_7)) == var44_43) {
                                    var5_5 = 1;
                                    var9_9 = 1.4E-45f;
                                } else {
                                    var5_5 = 0;
                                    var9_9 = 0.0f;
                                    var6_6 = null;
                                }
                                var44_43 = 13;
                                var16_16 = "Cash On Delivery";
                                if (var5_5 != 0) {
                                    var7_7 = (ArrayList)var12_12.get(var7_7);
                                    var8_8 = 0;
                                    var7_7 = null;
                                    var6_6 = new qq2_2((String)var16_16, var44_43, 0);
                                    var21_21.add(var6_6);
                                } else {
                                    var6_6 = new qq2_2((String)var16_16, var44_43);
                                    var21_21.add(var6_6);
                                }
                                var6_6 = new qq2_2(var25_25, var1_1);
                                var21_21.add(var6_6);
                            }
                            if (var4_4 != null) {
                                var4_4 = var4_4.getPaymentInstrumentCode();
                            } else {
                                var33_33 = 0;
                                var4_4 = null;
                            }
                            var6_6 = "EMI";
                            var8_8 = 1;
                            var33_33 = (int)kotlin.text.b.i((String)var4_4, (String)var6_6, (boolean)var8_8);
                            if (var33_33 == 0) break block102;
                            var4_4 = h40_0.a;
                            var4_4 = z40_0.Companion;
                            var4_4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var4_4).a;
                            var7_7 = "emi_enabled";
                            var33_33 = (int)var4_4.a((String)var7_7);
                            if (var33_33 == 0) break block102;
                            if (var12_12 == null) ** GOTO lbl530
                            var33_33 = (int)var12_12.containsKey(var6_6);
                            if (var33_33 == (var8_8 = 1)) {
                                var33_33 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var33_33 = 0;
                                    var4_4 = null;
                                    break block91;
                                    break;
                                }
lbl530:
                                // 1 sources

                                var8_8 = 1;
                                ** continue;
                            }
                        }
                        var44_43 = 36;
                        if (var33_33 != 0) {
                            var16_16 = (ArrayList)var12_12.get(var6_6);
                            var45_44 = 0;
                            var16_16 = null;
                            var4_4 = new qq2_2((String)var6_6, var44_43, 0);
                            var21_21.add(var4_4);
                        } else {
                            var45_44 = 0;
                            var16_16 = null;
                            var4_4 = new qq2_2((String)var6_6, var44_43);
                            var21_21.add(var4_4);
                        }
                        var4_4 = new qq2_2(var25_25, var1_1);
                        var21_21.add(var4_4);
                        continue;
                    }
                    var8_8 = 1;
                    var45_44 = 0;
                    var16_16 = null;
                }
            }
            var22_22 = null;
            cfr_temp_1 = var14_14 - 0.0f;
            var1_1 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
            if (var1_1 > 0) {
                var43_42 = 7;
                var22_22 = new qq2_2(var25_25, var43_42);
                var21_21.add(var22_22);
            }
            var22_22 = var21_21;
            var3_3 = var38_38;
        }
        var22_22 = var3_3.onSuccess(var22_22);
        var2_2.k(var22_22);
    }

    public final void eb() {
        boolean bl2 = this.q;
        if (bl2) {
            bl2 = false;
            this.q = false;
            Serializable serializable = this.k;
            if (serializable != null && (serializable = ((PriceValidation)serializable).getPriceSplitup()) != null) {
                serializable = ((PriceSplitUp)serializable).getConvenienceFee();
            } else {
                bl2 = false;
                serializable = null;
            }
            serializable = mz3_0.f((ConvenienceFeePriceSplitUp)serializable);
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            AnalyticsManager analyticsManager = analyticsManager$Companion.getInstance();
            GTMEvents gTMEvents = analyticsManager.getGtmEvents();
            String string2 = av_0.a(analyticsManager$Companion);
            AnalyticsData analyticsData = ne_0.b((Bundle)serializable);
            String string3 = "COD selected";
            int n3 = 16;
            String string4 = "COD_clicked";
            GTMEvents.pushButtonTapEvent$default(gTMEvents, string4, string3, string2, analyticsData, null, n3, null);
        }
    }

    public final void fb(PriceValidation serializable) {
        Float f5 = null;
        Object object = serializable != null ? ((PriceValidation)serializable).getPriceSplitup() : null;
        if (object != null) {
            float f6;
            object = this.Wa();
            Serializable serializable2 = ((PriceValidation)serializable).getPriceSplitup();
            if (serializable2 != null && (serializable2 = ((PriceSplitUp)serializable2).getNetPayableAmount()) != null) {
                f6 = ((Float)serializable2).floatValue();
            } else {
                f6 = 0.0f;
                serializable2 = null;
            }
            ((kj2_1)object).o = f6;
            object = ((PriceValidation)serializable).getPriceSplitup();
            object = object != null ? ((PriceSplitUp)object).getOfferDetails() : null;
            if (object != null) {
                object = this.Wa().E;
                if (object != null && (object = ((TenantResponse)object).getOrderSummary()) != null) {
                    serializable2 = ((PriceValidation)serializable).getPriceSplitup();
                    if (serializable2 != null && (serializable2 = ((PriceSplitUp)serializable2).getOfferDetails()) != null) {
                        serializable2 = ((OfferDetails)serializable2).getOfferAmountApplied();
                    } else {
                        serializable2 = null;
                        f6 = 0.0f;
                    }
                    ((OrderSummary)object).setBankOfferAmt((Float)serializable2);
                }
            } else {
                object = this.Wa().E;
                if (object != null && (object = ((TenantResponse)object).getOrderSummary()) != null) {
                    serializable2 = Float.valueOf(0.0f);
                    ((OrderSummary)object).setBankOfferAmt((Float)serializable2);
                }
            }
            if ((object = (object = ((PriceValidation)serializable).getPriceSplitup()) != null ? ((PriceSplitUp)object).getLoyalty() : null) != null) {
                object = this.Wa().E;
                if (object != null && (object = ((TenantResponse)object).getOrderSummary()) != null) {
                    if ((serializable = ((PriceValidation)serializable).getPriceSplitup()) != null && (serializable = ((PriceSplitUp)serializable).getLoyalty()) != null) {
                        f5 = ((Loyalty)serializable).getLoyaltyPoints();
                    }
                    ((OrderSummary)object).setLoyaltyPoint(f5);
                }
            } else {
                serializable = this.Wa().E;
                if (serializable != null && (serializable = ((TenantResponse)serializable).getOrderSummary()) != null) {
                    f5 = Float.valueOf(0.0f);
                    ((OrderSummary)serializable).setLoyaltyPoint(f5);
                }
            }
        } else {
            serializable = this.Wa().E;
            if (serializable != null && (serializable = ((TenantResponse)serializable).getOrderSummary()) != null) {
                f5 = Float.valueOf(0.0f);
                ((OrderSummary)serializable).setBankOfferAmt(f5);
            }
            if ((serializable = this.Wa().E) != null && (serializable = ((TenantResponse)serializable).getOrderSummary()) != null) {
                f5 = Float.valueOf(0.0f);
                ((OrderSummary)serializable).setLoyaltyPoint(f5);
            }
        }
    }

    public final void g(String string2, String string3, String string4, Bundle bundle, String string5) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        Intrinsics.checkNotNullParameter(string3, "eventAction");
        Intrinsics.checkNotNullParameter(string4, "eventLabel");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        String string6 = this.n;
        String string7 = this.o;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.p, string2, string3, string4, string5, "single page checkout", "single page checkout", string6, bundle, string7, false, null, 1536, null);
    }

    public final void g9(UPI object) {
        boolean bl2;
        Object object2;
        Object object3 = this.Wa().s;
        Object object4 = null;
        if (object3 != null) {
            object3 = ((PaymentInstruments)object3).getVerifyVpa();
            object2 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object3, object2);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2) {
            object3 = this.c;
            if (object3 != null) {
                object3.a();
            }
            this.Va().I = object;
            object = ((UPI)object).getVpa();
            Object object5 = new VerifyVpaRequestUPI("UPI", (String)object);
            int n3 = 3;
            object2 = object;
            object = new VerifyVpaRequest(null, null, (VerifyVpaRequestUPI)object5, n3, null);
            object3 = this.Va();
            object2 = this.Wa().E;
            object3.getClass();
            Object object6 = "request";
            Intrinsics.checkNotNullParameter(object, (String)object6);
            oo2_1 oo2_12 = ((op2_2)object3).a;
            oo2_12.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object6);
            object6 = UrlHelper.Companion.getInstance();
            object4 = new Object[]{};
            object5 = "payment";
            String string2 = "verify_vpa";
            object4 = ((UrlHelper)object6).getApiUrl((String)object5, string2, object4);
            object6 = object2 != null ? ((TenantResponse)object2).getTenant() : null;
            ((VerifyVpaRequest)object).setTenant((Tenant)object6);
            if (object2 != null) {
                object2 = ((TenantResponse)object2).getAccessToken();
                ((VerifyVpaRequest)object).setAccessToken((String)object2);
            } else {
                object2 = "TenantResponse is null";
                mz3_0.F((String)object2);
            }
            object = JsonUtils.toJson(object);
            object2 = JsonObject.class;
            object = (JsonObject)JsonUtils.fromJson((String)object, object2);
            if (object == null) {
                object = new JsonObject();
            }
            object = oo2_12.a.verifyVpa((String)object4, (JsonObject)object, "PAYMENT_Verify_vpa");
            object4 = qt2_2.c;
            object = ((g53_0)object).h((Scheduler)object4);
            object4 = ti_2.a();
            object = ((g53_0)object).e((Scheduler)object4);
            object4 = new no2_2(oo2_12);
            object2 = new ih1_0(object4);
            object4 = new s53_0((q63_0)object, (bx0_2)object2);
            object = new Object();
            object2 = new u53_0((q63_0)object4, (bx0_2)object);
            Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
            object = new xo2_1((op2_2)object3);
            object4 = new Yo2(object);
            object = new zo2_0((op2_2)object3);
            object6 = new ap2_0((zo2_0)object);
            object = ((g53_0)object2).f((o60_0)object4, (o60_0)object6);
            object3 = ((op2_2)object3).b;
            ((t30_0)object3).b((yr0_2)object);
        } else {
            object3 = this.Wa().E;
            if (object3 != null) {
                object4 = oo2_0.a;
                float f5 = this.Wa().o;
                object2 = Float.valueOf(f5);
                object4.getClass();
                object3 = oo2_0.q((UPI)object, (TenantResponse)object3, (Float)object2);
                this.I2((UPI)object, (PayNowRequest)object3);
            }
        }
    }

    public final void h5() {
        block5: {
            boolean bl2 = this.isAdded();
            if (!bl2) break block5;
            es2_2 es2_22 = new es2_2();
            Object object = this.getChildFragmentManager();
            String string2 = "PesdkOfferBsFragment";
            try {
                es2_22.show((FragmentManager)object, string2);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public final void hideProgressView() {
        n82_0 n82_02 = this.c;
        if (n82_02 != null) {
            n82_02.h();
        }
    }

    public final void i4(PriceValidation object) {
        this.fb((PriceValidation)object);
        object = this.c;
        if (object != null) {
            object.l3();
        }
    }

    public final void j(PaymentInstrumentInfo object) {
        block15: {
            boolean bl2 = this.isAdded();
            if (!bl2) break block15;
            Object object2 = this.Wa();
            float f5 = ((kj2_1)object2).o;
            Object object3 = this.v;
            object3 = ((hh3_2)object3).getValue();
            object3 = (io2_1)object3;
            object3 = ((io2_1)object3).c;
            ((LiveData)object3).k(object);
            object = com.ril.ajio.payment.fragment.c.Companion;
            object.getClass();
            object = new c();
            object3 = new Bundle();
            String string2 = "OrderTotal";
            object3.putFloat(string2, f5);
            ((Fragment)object).setArguments((Bundle)object3);
            object2 = this.getChildFragmentManager();
            object3 = "InternalWalletBottomFragment";
            try {
                ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
    }

    public final void k(ToggleButton toggleButton, int n3) {
        n82_0 n82_02 = this.c;
        if (n82_02 != null) {
            n82_02.k(toggleButton, n3);
        }
    }

    public final void l5() {
        boolean bl2;
        Object object = null;
        this.k = null;
        Object object2 = this.getActivity();
        if (object2 != null && !(bl2 = object2.isFinishing()) && (bl2 = this.isAdded())) {
            boolean bl3;
            object2 = oo2_0.a;
            Object object3 = this.Wa().s;
            object2.getClass();
            object2 = oo2_0.c("NET_BANKING", (PaymentInstruments)object3);
            if (object2 != null) {
                object3 = ((PaymentInstrumentType)object2).getPaymentInstrumentsInfo();
            } else {
                bl3 = false;
                object3 = null;
            }
            if (object3 != null && !(bl3 = object3.isEmpty())) {
                object3 = this.Wa();
                if (object2 != null) {
                    object2 = ((PaymentInstrumentType)object2).getPaymentInstrumentsInfo();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                ((kj2_1)object3).m = object2;
                object2 = this.b;
                if (object2 == null) {
                    object2 = "paymentListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object = object2;
                }
                object2 = new gu1_2();
                object3 = "AddCardFragment";
                object.p0((fw_2)object2, (String)object3);
            }
        }
    }

    public final void o3() {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = object.isFinishing()) && (bl2 = this.isAdded())) {
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentListener");
                bl2 = false;
                object = null;
            }
            h h3 = new h();
            String string2 = "AddCardFragment";
            object.p0(h3, string2);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        int n7 = -1;
        int n8 = 1006;
        int n10 = 1004;
        if (n4 != n7) {
            if (n4 == 0) {
                n4 = (int)(dm0_0.b ? 1 : 0);
                if (n4 == 0) {
                    return;
                }
                if (intent == null) {
                    intent = new Intent();
                }
                String string2 = "paymentfailedstatus";
                n7 = 1;
                intent.putExtra(string2, n7 != 0);
                if (n3 != n10) {
                    if (n3 == n8) {
                        this.Ta(intent);
                    }
                } else {
                    this.Za(intent);
                }
            }
        } else if (n3 != n10) {
            if (n3 == n8) {
                this.Ta(intent);
            }
        } else {
            this.Za(intent);
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof do2_0;
        if (bl2) {
            object = (do2_0)object;
            this.b = object;
            return;
        }
        object = pn_2.b(object, " Must implement PaymentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Class<op2_2> clazz = op2_2.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, clazz, string2);
        object2 = ef0_0.a(clazz, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            object = (op2_2)((pD3)object).a((yn1_2)object2, (String)object3);
            Intrinsics.checkNotNullParameter(object, "<set-?>");
            this.a = object;
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_pecheckout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        String string2;
        this.t = string2 = "";
        this.s = string2;
        this.r = string2;
        this.u = string2;
        super.onDestroyView();
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.Va().k;
        object2 = this.getViewLifecycleOwner();
        Object object3 = new ge1_2(this, 1);
        Object object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().j;
        object2 = this.getViewLifecycleOwner();
        object3 = new dq2_2(this);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().l;
        object2 = this.getViewLifecycleOwner();
        object3 = new eq2_2(this, 0);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().q;
        object2 = this.getViewLifecycleOwner();
        object3 = new c71_0(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().u;
        object2 = this.getViewLifecycleOwner();
        object3 = new d71_0(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().t;
        object2 = this.getViewLifecycleOwner();
        object3 = new k9_0(this, 4);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().h;
        object2 = this.getViewLifecycleOwner();
        object3 = new t9_0(this, 2);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().m;
        object2 = this.getViewLifecycleOwner();
        object3 = new bq2_2(this);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().n;
        object2 = this.getViewLifecycleOwner();
        object3 = new aq2_1(this);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().o;
        object2 = this.getViewLifecycleOwner();
        object3 = new cq2_1(this, 0);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().p;
        object2 = this.getViewLifecycleOwner();
        object3 = new ks_0(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().A;
        object2 = this.getViewLifecycleOwner();
        object3 = new A12(this, 2);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().B;
        object2 = this.getViewLifecycleOwner();
        object3 = new cs_0(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().E;
        object2 = this.getViewLifecycleOwner();
        object3 = new DS(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().F;
        object2 = this.getViewLifecycleOwner();
        object3 = new gs_0(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().G;
        object2 = this.getViewLifecycleOwner();
        object3 = new zm1_1(this, 1);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Va().H;
        object2 = this.getViewLifecycleOwner();
        int n3 = 3;
        object3 = new A9(this, n3);
        object4 = new g$b((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Wa().E;
        if (object != null) {
            object2 = this.Wa().p;
            if (object2 == null) {
                object2 = new HashMap();
                object3 = this.Wa();
                ((kj2_1)object3).p = object2;
            }
            if ((object = ((TenantResponse)object).getBanners()) != null) {
                boolean bl2;
                object = ((Iterable)object).iterator();
                while (bl2 = object.hasNext()) {
                    boolean bl3;
                    Object object5;
                    int n4;
                    object3 = (BannerInfo)object.next();
                    if (object3 == null || (object4 = ((BannerInfo)object3).getDescription()) == null || (n4 = ((String)object4).length()) == 0 || (object5 = ((BannerInfo)object3).getEligiblePaymentMode()) == null) continue;
                    object5 = object5.iterator();
                    while (bl3 = object5.hasNext()) {
                        int n7;
                        Object object6 = (String)object5.next();
                        if (object6 == null || (n7 = ((String)object6).length()) == 0) continue;
                        n7 = (int)(((HashMap)object2).containsKey(object6) ? 1 : 0);
                        if (n7 != 0) {
                            if ((object6 = (ArrayList)((HashMap)object2).get(object6)) == null) continue;
                            ((ArrayList)object6).add(object4);
                            continue;
                        }
                        Object object7 = ((BannerInfo)object3).getDescription();
                        if (object7 == null || (n7 = ((String)object7).length()) == 0) continue;
                        object7 = new Object();
                        ((ArrayList)object7).add(object4);
                        object2.put(object6, object7);
                    }
                }
            }
        }
        this.Ua();
    }

    public final void p(String object, boolean bl2) {
        int n3;
        if (object != null && (n3 = object.length()) != 0) {
            if (bl2) {
                this.Wa().w.add(object);
                kj2_1 kj2_12 = this.Wa();
                kj2_12.y = object = String.valueOf(object);
            } else {
                String string2;
                this.Wa().w.remove(object);
                object = this.Wa();
                ((kj2_1)object).y = string2 = "";
            }
            this.Oa();
        }
    }

    public final void p9(String object) {
        Object object2 = this.g;
        if (object2 != null) {
            object2 = new QueryLPOtp();
            Object object3 = this.g;
            String string2 = null;
            object3 = object3 != null ? ((PayNowResponse)object3).getDisplay_message() : null;
            ((QueryLPOtp)object2).setDisplayMessage((String)object3);
            object3 = this.g;
            object3 = object3 != null ? ((PayNowResponse)object3).getMD() : null;
            ((QueryLPOtp)object2).setMD((String)object3);
            object3 = this.g;
            if (object3 != null) {
                string2 = ((PayNowResponse)object3).getTransactionId();
            }
            ((QueryLPOtp)object2).setTransactionId(string2);
            ((QueryLPOtp)object2).setOtpdata((String)object);
            object = this.c;
            if (object != null) {
                object.a();
            }
            object = this.Va();
            ((op2_2)object).g((QueryLPOtp)object2);
        }
    }

    public final void q8() {
        boolean bl2;
        boolean bl3;
        Object object = this.getActivity();
        if (object != null && !(bl3 = object.isFinishing()) && (bl2 = (object = this.getActivity()) instanceof AppCompatActivity)) {
            lh0_2.Companion.getClass();
            lh0_2 lh0_22 = new lh0_2();
            object = ((AppCompatActivity)object).getSupportFragmentManager();
            String string2 = "CvvInfoBottomFragment";
            lh0_22.show((FragmentManager)object, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r(LpStoredCardBalance object) {
        Object object2 = "";
        this.f = object2;
        this.l = object;
        try {
            boolean bl2 = this.isAdded();
            if (!bl2) return;
            object2 = "RegisteredPhoneNumberEnteredSavedCard";
            Object object3 = "LoyaltyRewards_MobileUnmatch";
            Object object4 = AnalyticsManager.Companion;
            Object object5 = ((AnalyticsManager$Companion)object4).getInstance();
            object5 = ((AnalyticsManager)object5).getGtmEvents();
            object4 = ((AnalyticsManager$Companion)object4).getInstance();
            object4 = ((AnalyticsManager)object4).getGtmEvents();
            object4 = ((GTMEvents)object4).getScreenName();
            ((GTMEvents)object5).pushButtonTapEvent((String)object3, object2, (String)object4);
            object2 = com.ril.ajio.payment.fragment.d.Companion;
            object5 = "";
            String string2 = "";
            object3 = object != null ? ((LpStoredCardBalance)object).getCardNumber() : null;
            String string3 = object3;
            object2.getClass();
            int n3 = 1;
            object3 = this;
            object = d$a.a(this, n3, (String)object5, string2, string3, false, (LpStoredCardBalance)object);
            object2 = this.getChildFragmentManager();
            object3 = "MobileBottomSheetFragment";
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            return;
        }
        catch (Exception exception) {}
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception);
    }

    public final void r4() {
        Object object = this.Wa().s;
        if (object != null) {
            oo2_0.a.getClass();
            Object object2 = "INTERNAL_WALLET";
            object = oo2_0.c((String)object2, (PaymentInstruments)object);
            if (object != null && (object = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
                boolean bl2;
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    String string2;
                    boolean bl3;
                    String string3;
                    object2 = (PaymentInstrumentInfo)object.next();
                    if (object2 != null) {
                        string3 = ((PaymentInstrumentInfo)object2).getType();
                    } else {
                        bl3 = false;
                        string3 = null;
                    }
                    if (!(bl3 = Intrinsics.areEqual(string2 = "AJIO_CASH_WALLET", string3))) continue;
                    object = ((PaymentInstrumentInfo)object2).getDescription();
                    bl2 = TextUtils.isEmpty((CharSequence)object);
                    if (bl2 || (object2 = this.getActivity()) == null || (bl2 = object2.isFinishing())) break;
                    object2 = new ib_2();
                    string3 = new Bundle();
                    string2 = "WALLET_INFO";
                    string3.putString(string2, (String)object);
                    ((Fragment)object2).setArguments((Bundle)string3);
                    object = this.getChildFragmentManager();
                    string3 = "AjioWalletInfoBTS";
                    try {
                        ((DialogFragment)object2).show((FragmentManager)object, string3);
                        break;
                    }
                    catch (Exception exception) {
                        object2 = yn3_0.a;
                        ((yn3$a)object2).e(exception);
                        break;
                    }
                }
            }
        }
    }

    public final void r9() {
        Object object = this.Wa().E;
        if (object != null) {
            boolean bl2;
            Object object2;
            int n3 = 0;
            Object object3 = null;
            this.k = null;
            oo2_0.a.getClass();
            Intrinsics.checkNotNullParameter(object, "tenantResponse");
            Object object4 = object2;
            int n4 = 0x3FFFFF;
            int n7 = 0;
            Object object5 = null;
            int n8 = 0;
            float f5 = 0.0f;
            Object object6 = null;
            HashSet hashSet = null;
            Object object7 = null;
            boolean bl3 = false;
            Object object8 = null;
            Object object9 = null;
            Object object10 = null;
            float f6 = 0.0f;
            Object object11 = null;
            boolean bl4 = false;
            Object object12 = null;
            Object object13 = null;
            Object object14 = null;
            String string2 = null;
            String string3 = null;
            Object object15 = null;
            int n10 = 0;
            NewCustomEventsRevamp newCustomEventsRevamp = null;
            Bundle bundle = null;
            object2 = new PayNowRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, n4, null);
            object4 = ((TenantResponse)object).getCustomer();
            ((PayNowRequest)object2).setCustomer((Customer)object4);
            object4 = ((TenantResponse)object).getOrder();
            ((PayNowRequest)object2).setOrder((Order)object4);
            object4 = "INTERNAL_WALLET";
            ((PayNowRequest)object2).setPaymentInstrument((String)object4);
            object = ((TenantResponse)object).getTenant();
            ((PayNowRequest)object2).setTenant((Tenant)object);
            object = this.c;
            if (object != null) {
                object.a();
            }
            object = this.Va();
            object4 = this.Wa().s;
            object5 = this.Wa().E;
            object6 = this.Wa();
            f5 = ((kj2_1)object6).o;
            hashSet = this.Wa().w;
            object.getClass();
            object7 = "query";
            Intrinsics.checkNotNullParameter(object2, (String)object7);
            Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
            InternalWalletUtil.a.getClass();
            object8 = InternalWalletUtil.g((PaymentInstruments)object4, hashSet);
            object14 = new Bundle();
            object13 = ((op2_2)object).c;
            object9 = ((NewCustomEventsRevamp)object13).getPAYMENT_MODE();
            object14.putString((String)object9, "ajio wallet");
            object10 = ((NewCustomEventsRevamp)object13).getEC_CHECKOUT_INTERACTIONS();
            object11 = "payment accordian select";
            object12 = "ajio wallet";
            object9 = ((op2_2)object).d;
            object3 = ((op2_2)object).e;
            n10 = 1536;
            object15 = object9;
            object9 = object13;
            newCustomEventsRevamp = object13;
            object13 = "payment_accordian_select";
            bundle = object14;
            object14 = "single page checkout";
            string2 = "single page checkout";
            string3 = object15;
            object15 = object3;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object9, (String)object10, (String)object11, (String)object12, (String)object13, (String)object14, string2, string3, bundle, (String)object3, false, null, n10, null);
            object3 = bundle;
            bundle.putAll(object8);
            bl3 = dm0_0.b;
            if (bl3) {
                object10 = ((NewCustomEventsRevamp)object9).getEC_CHECKOUT_INTERACTIONS();
                object11 = "proceed to pay - retry";
                object12 = "ajio wallet";
                object13 = "proceed_to_pay_retry";
                object14 = "single page checkout";
                string2 = "single page checkout";
                object8 = ((op2_2)object).d;
                object9 = ((op2_2)object).e;
                n10 = 1536;
                object15 = object9;
                object9 = newCustomEventsRevamp;
                string3 = object8;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object10, (String)object11, (String)object12, (String)object13, (String)object14, string2, (String)object8, bundle, (String)object15, false, null, n10, null);
            } else {
                object10 = ((NewCustomEventsRevamp)object9).getEC_CHECKOUT_INTERACTIONS();
                object11 = "proceed to pay";
                object12 = "ajio wallet";
                object13 = "proceed_to_pay";
                object14 = "single page checkout";
                string2 = "single page checkout";
                object8 = ((op2_2)object).d;
                object9 = ((op2_2)object).e;
                n10 = 1536;
                object15 = object9;
                object9 = newCustomEventsRevamp;
                string3 = object8;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object10, (String)object11, (String)object12, (String)object13, (String)object14, string2, (String)object8, bundle, (String)object15, false, null, n10, null);
            }
            object3 = ((op2_2)object).a;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object2, (String)object7);
            object7 = UrlHelper.Companion.getInstance();
            bl3 = false;
            object8 = null;
            object9 = new Object[]{};
            object11 = "pay_now";
            object7 = ((UrlHelper)object7).getApiUrl("payment", (String)object11, (Object[])object9);
            object9 = new HashMap();
            object10 = "";
            if (object5 == null || (object11 = ((TenantResponse)object5).getDeviceChecksum()) == null) {
                object11 = object10;
            }
            object12 = "deviceChecksum";
            ((HashMap)object9).put(object12, object11);
            if (object5 == null || (object11 = ((TenantResponse)object5).getDeviceId()) == null) {
                object11 = object10;
            }
            ((HashMap)object9).put("deviceId", object11);
            object11 = "paymentChannelInformation.appType";
            object12 = "ANDROID";
            ((HashMap)object9).put(object11, object12);
            if (object5 == null || (object11 = ((TenantResponse)object5).getAccessToken()) == null) {
                object11 = object10;
            }
            object12 = "accessToken";
            ((HashMap)object9).put(object12, object11);
            object11 = ((PayNowRequest)object2).getCustomer();
            if (object11 != null) {
                object11 = ((PayNowRequest)object2).getCustomer();
                if (object11 == null || (object11 = ((Customer)object11).getEmail()) == null) {
                    object11 = object10;
                }
                object12 = "customer.email";
                ((HashMap)object9).put(object12, object11);
                object11 = ((PayNowRequest)object2).getCustomer();
                if (object11 == null || (object11 = ((Customer)object11).getMobile()) == null) {
                    object11 = object10;
                }
                object12 = "customer.mobile";
                ((HashMap)object9).put(object12, object11);
                object11 = ((PayNowRequest)object2).getCustomer();
                if (object11 == null || (object11 = ((Customer)object11).getUuid()) == null) {
                    object11 = object10;
                }
                object12 = "customer.uuid";
                ((HashMap)object9).put(object12, object11);
            }
            if ((object11 = ((PayNowRequest)object2).getOrder()) != null) {
                object11 = ((PayNowRequest)object2).getOrder();
                if (object11 != null && (object11 = ((Order)object11).getAmount()) != null) {
                    f6 = ((Float)object11).floatValue();
                } else {
                    f6 = 0.0f;
                    object11 = null;
                }
                object11 = String.valueOf(f6);
                object12 = "order.amount";
                ((HashMap)object9).put(object12, object11);
                object11 = ((PayNowRequest)object2).getOrder();
                if (object11 == null || (object11 = ((Order)object11).getOrderId()) == null) {
                    object11 = object10;
                }
                object12 = "order.orderId";
                ((HashMap)object9).put(object12, object11);
            }
            object11 = ((PayNowRequest)object2).getOnepTotalPrice();
            object12 = "0";
            if (object11 == null) {
                object11 = object12;
            }
            object13 = "order.totalPrice1p";
            ((HashMap)object9).put(object13, object11);
            object11 = ((PayNowRequest)object2).getThreepTotalPrice();
            if (object11 == null) {
                object11 = object12;
            }
            ((HashMap)object9).put("order.totalPrice3p", object11);
            ((HashMap)object9).put("paymentChannelInformation.paymentChannel", "APP");
            object13 = "9.20.0";
            ((HashMap)object9).put("paymentChannelInformation.appVersion", object13);
            object11 = ((PayNowRequest)object2).getPaymentInstrument();
            if (object11 == null) {
                object11 = object10;
            }
            object13 = "paymentInstrument";
            ((HashMap)object9).put(object13, object11);
            object11 = ((PayNowRequest)object2).getTenant();
            if (object11 == null || (object11 = ((Tenant)object11).getCode()) == null) {
                object11 = object10;
            }
            object13 = "tenant.code";
            ((HashMap)object9).put(object13, object11);
            object11 = "order.netPayableAmount";
            ((HashMap)object9).put(object11, object12);
            object12 = InternalWalletUtil.a();
            bl4 = ((HashSet)object12).isEmpty();
            object12 = bl4 ? "false" : "true";
            object13 = "notes[eligibleToEarnLoyalty]";
            ((HashMap)object9).put(object13, object12);
            object6 = String.valueOf(f5);
            ((HashMap)object9).put(object11, object6);
            if (object5 != null) {
                object4 = oo2_0.i((PaymentInstruments)object4, (TenantResponse)object5, hashSet);
                ((HashMap)object9).putAll(object4);
                object4 = ((TenantResponse)object5).getTenantTransactionId();
                if (object4 == null) {
                    object4 = object10;
                }
                object6 = "tenantTransactionId";
                ((HashMap)object9).put(object6, object4);
                object4 = ((TenantResponse)object5).getRequestChecksum();
                if (object4 == null) {
                    object4 = object10;
                }
                object6 = "requestChecksum";
                ((HashMap)object9).put(object6, object4);
                object4 = ((TenantResponse)object5).getTransactionToken();
                if (object4 == null) {
                    object4 = object10;
                }
                object6 = "transactionToken";
                ((HashMap)object9).put(object6, object4);
                object4 = ((TenantResponse)object5).getCartCheckSum();
                if (object4 == null) {
                    object4 = object10;
                }
                object5 = "cartCheckSum";
                ((HashMap)object9).put(object5, object4);
            } else {
                object4 = "TenantResponse is null";
                mz3_0.F((String)object4);
            }
            object4 = ((oo2_1)object3).c.b();
            if (object4 != null) {
                object5 = ((AffiliateData)object4).getUtmMedium();
            } else {
                n7 = 0;
                object5 = null;
            }
            object6 = "affiliate";
            n7 = Intrinsics.areEqual(object5, object6);
            if (n7 != 0) {
                if (object4 == null || (object5 = ((AffiliateData)object4).getUtmSource()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.utmSource";
                ((HashMap)object9).put(object6, object5);
                if (object4 == null || (object5 = ((AffiliateData)object4).getUtmMedium()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.utmMedium";
                ((HashMap)object9).put(object6, object5);
                if (object4 == null || (object5 = ((AffiliateData)object4).getClickId()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.clickId";
                ((HashMap)object9).put(object6, object5);
                if (object4 == null || (object5 = ((AffiliateData)object4).getOfferId()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.offerId";
                ((HashMap)object9).put(object6, object5);
                if (object4 == null || (object5 = ((AffiliateData)object4).getReturnCancellationWindow()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.returnCancellationWindow";
                ((HashMap)object9).put(object6, object5);
                if (object4 == null || (object5 = ((AffiliateData)object4).getUtmCampaign()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.utmCampaign";
                ((HashMap)object9).put(object6, object5);
                if (object4 == null || (object5 = ((AffiliateData)object4).getAttributionWindow()) == null) {
                    object5 = object10;
                }
                object6 = "affiliateData.attributionWindow";
                ((HashMap)object9).put(object6, object5);
                if (object4 != null && (object4 = ((AffiliateData)object4).getAffiliateId()) != null) {
                    object10 = object4;
                }
                ((HashMap)object9).put("affiliateData.affiliateId", object10);
                object2 = oo2_1.e((PayNowRequest)object2);
                object4 = "affiliateData.conversionId";
                ((HashMap)object9).put(object4, object2);
            }
            object9.toString();
            dm0_0.b = bl2 = true;
            dm0_0.a = object9;
            object2 = ((oo2_1)object3).a.payNow((String)object7, "PAYMENT_PayNowByIW", (Map)object9);
            object4 = qt2_2.c;
            object2 = ((g53_0)object2).h((Scheduler)object4);
            object4 = ti_2.a();
            object2 = ((g53_0)object2).e((Scheduler)object4);
            object4 = new vn2_2(object3, 0);
            object3 = new wn2_1((Function1)object4);
            object4 = new s53_0((q63_0)object2, (bx0_2)object3);
            object3 = new Object();
            object2 = new u53_0((q63_0)object4, (bx0_2)object3);
            Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
            object3 = new ip2_1((op2_2)object);
            object4 = new u02(1, (Function1)object3);
            n7 = 2;
            object3 = new qa_0(object, n7);
            n8 = 1;
            f5 = Float.MIN_VALUE;
            object5 = new x02(object3, n8);
            object3 = ((g53_0)object2).f((o60_0)object4, (o60_0)object5);
            ((op2_2)object).b.b((yr0_2)object3);
            object = this.Wa();
            n3 = 6;
            object2 = "Internal Wallet";
            kj2_1.e((kj2_1)object, (String)object2, 0, (String)object2, n3);
        }
    }

    public final void s(PaymentInstrumentInfo object) {
        block9: {
            boolean bl2 = this.isAdded();
            if (!bl2) break block9;
            Object object2 = this.v;
            object2 = ((hh3_2)object2).getValue();
            object2 = (io2_1)object2;
            object2 = ((io2_1)object2).c;
            ((LiveData)object2).k(object);
            object = new fj1_2();
            object2 = this.getChildFragmentManager();
            String string2 = "InternalWalletDescBottomFragment";
            try {
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
    }

    public final void showLoyaltyInfoFragment() {
        block5: {
            boolean bl2 = this.isAdded();
            if (!bl2) break block5;
            ap1_2 ap1_22 = new ap1_2();
            Object object = this.getChildFragmentManager();
            String string2 = "LPInfoBottomSheetFragment";
            try {
                ap1_22.show((FragmentManager)object, string2);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public final void v1(PayNowRequest payNowRequest) {
        Object object = payNowRequest;
        Object object2 = this.Wa().E;
        if (object2 != null) {
            boolean bl2;
            float f5;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            boolean bl3;
            object2 = null;
            this.k = null;
            Object object8 = this.c;
            if (object8 != null) {
                object8.a();
            }
            object8 = this.Va();
            Object object9 = this.Wa().s;
            Object object10 = this.Wa().E;
            Object object11 = this.Wa();
            float f6 = ((kj2_1)object11).o;
            HashSet hashSet = this.Wa().w;
            object8.getClass();
            Object object12 = "query";
            Intrinsics.checkNotNullParameter(object, (String)object12);
            Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
            Object object13 = payNowRequest.getWallet();
            if (object13 != null) {
                object13 = ((Wallet)object13).getCode();
            } else {
                bl3 = false;
                object13 = null;
            }
            if (object13 != null) {
                InternalWalletUtil.a.getClass();
                object13 = InternalWalletUtil.g((PaymentInstruments)object9, hashSet);
                Object object14 = new Bundle();
                object7 = ((op2_2)object8).c;
                object6 = ((NewCustomEventsRevamp)object7).getPAYMENT_MODE();
                object14.putString((String)object6, "wallet");
                object5 = ((NewCustomEventsRevamp)object7).getEC_CHECKOUT_INTERACTIONS();
                object4 = "payment accordian select";
                object3 = "wallet";
                object6 = ((op2_2)object8).d;
                object2 = ((op2_2)object8).e;
                int n3 = 1536;
                Object object15 = object6;
                object6 = object7;
                NewCustomEventsRevamp newCustomEventsRevamp = object7;
                object7 = "payment_accordian_select";
                Bundle bundle = object14;
                object14 = "single page checkout";
                String string2 = "single page checkout";
                Object object16 = object15;
                object15 = object2;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object5, (String)object4, (String)object3, (String)object7, (String)object14, string2, (String)object16, bundle, (String)object2, false, null, n3, null);
                object2 = bundle;
                bundle.putAll((Bundle)object13);
                bl3 = dm0_0.b;
                if (bl3) {
                    object5 = ((NewCustomEventsRevamp)object6).getEC_CHECKOUT_INTERACTIONS();
                    object4 = "proceed to pay - retry";
                    object3 = "wallet";
                    object7 = "proceed_to_pay_retry";
                    object14 = "single page checkout";
                    string2 = "single page checkout";
                    object13 = ((op2_2)object8).d;
                    object6 = ((op2_2)object8).e;
                    n3 = 1536;
                    object15 = object6;
                    object6 = newCustomEventsRevamp;
                    object16 = object13;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object5, (String)object4, (String)object3, (String)object7, (String)object14, string2, (String)object13, bundle, (String)object15, false, null, n3, null);
                } else {
                    object5 = ((NewCustomEventsRevamp)object6).getEC_CHECKOUT_INTERACTIONS();
                    object4 = "proceed to pay";
                    object3 = "wallet";
                    object7 = "proceed_to_pay";
                    object14 = "single page checkout";
                    string2 = "single page checkout";
                    object13 = ((op2_2)object8).d;
                    object6 = ((op2_2)object8).e;
                    n3 = 1536;
                    object15 = object6;
                    object6 = newCustomEventsRevamp;
                    object16 = object13;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object5, (String)object4, (String)object3, (String)object7, (String)object14, string2, (String)object13, bundle, (String)object15, false, null, n3, null);
                }
            }
            object2 = ((op2_2)object8).a;
            object2.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object12);
            object12 = UrlHelper.Companion.getInstance();
            bl3 = false;
            object13 = null;
            object6 = new Object[]{};
            object4 = "pay_now";
            object12 = ((UrlHelper)object12).getApiUrl("payment", (String)object4, (Object[])object6);
            object6 = new HashMap();
            object5 = "";
            if (object10 == null || (object4 = ((TenantResponse)object10).getDeviceChecksum()) == null) {
                object4 = object5;
            }
            object3 = "deviceChecksum";
            ((HashMap)object6).put(object3, object4);
            if (object10 == null || (object4 = ((TenantResponse)object10).getDeviceId()) == null) {
                object4 = object5;
            }
            ((HashMap)object6).put("deviceId", object4);
            object4 = "paymentChannelInformation.appType";
            object3 = "ANDROID";
            ((HashMap)object6).put(object4, object3);
            if (object10 == null || (object4 = ((TenantResponse)object10).getAccessToken()) == null) {
                object4 = object5;
            }
            object3 = "accessToken";
            ((HashMap)object6).put(object3, object4);
            object4 = payNowRequest.getCustomer();
            if (object4 != null) {
                object4 = payNowRequest.getCustomer();
                if (object4 == null || (object4 = ((Customer)object4).getEmail()) == null) {
                    object4 = object5;
                }
                object3 = "customer.email";
                ((HashMap)object6).put(object3, object4);
                object4 = payNowRequest.getCustomer();
                if (object4 == null || (object4 = ((Customer)object4).getMobile()) == null) {
                    object4 = object5;
                }
                object3 = "customer.mobile";
                ((HashMap)object6).put(object3, object4);
                object4 = payNowRequest.getCustomer();
                if (object4 == null || (object4 = ((Customer)object4).getUuid()) == null) {
                    object4 = object5;
                }
                object3 = "customer.uuid";
                ((HashMap)object6).put(object3, object4);
            }
            if ((object4 = payNowRequest.getWallet()) == null || (object4 = ((Wallet)object4).getCode()) == null) {
                object4 = object5;
            }
            object3 = "wallet.code";
            ((HashMap)object6).put(object3, object4);
            object4 = payNowRequest.getOrder();
            if (object4 != null) {
                object4 = payNowRequest.getOrder();
                if (object4 != null && (object4 = ((Order)object4).getAmount()) != null) {
                    f5 = ((Float)object4).floatValue();
                } else {
                    bl2 = false;
                    f5 = 0.0f;
                    object4 = null;
                }
                object4 = String.valueOf(f5);
                object3 = "order.amount";
                ((HashMap)object6).put(object3, object4);
                object4 = payNowRequest.getOrder();
                if (object4 == null || (object4 = ((Order)object4).getOrderId()) == null) {
                    object4 = object5;
                }
                object3 = "order.orderId";
                ((HashMap)object6).put(object3, object4);
            }
            object4 = payNowRequest.getOnepTotalPrice();
            object3 = "0";
            if (object4 == null) {
                object4 = object3;
            }
            object7 = "order.totalPrice1p";
            ((HashMap)object6).put(object7, object4);
            object4 = payNowRequest.getThreepTotalPrice();
            if (object4 != null) {
                object3 = object4;
            }
            ((HashMap)object6).put("order.totalPrice3p", object3);
            ((HashMap)object6).put("paymentChannelInformation.paymentChannel", "APP");
            object3 = "9.20.0";
            ((HashMap)object6).put("paymentChannelInformation.appVersion", object3);
            object4 = payNowRequest.getPaymentInstrument();
            if (object4 == null) {
                object4 = object5;
            }
            object3 = "paymentInstrument";
            ((HashMap)object6).put(object3, object4);
            object4 = payNowRequest.getTenant();
            if (object4 == null || (object4 = ((Tenant)object4).getCode()) == null) {
                object4 = object5;
            }
            object3 = "tenant.code";
            ((HashMap)object6).put(object3, object4);
            object4 = "order.netPayableAmount";
            object11 = String.valueOf(f6);
            ((HashMap)object6).put(object4, object11);
            if (object10 != null) {
                object11 = ((TenantResponse)object10).getTenantTransactionId();
                if (object11 == null) {
                    object11 = object5;
                }
                object4 = "tenantTransactionId";
                ((HashMap)object6).put(object4, object11);
                object11 = ((TenantResponse)object10).getRequestChecksum();
                if (object11 == null) {
                    object11 = object5;
                }
                object4 = "requestChecksum";
                ((HashMap)object6).put(object4, object11);
                object11 = ((TenantResponse)object10).getTransactionToken();
                if (object11 == null) {
                    object11 = object5;
                }
                object4 = "transactionToken";
                ((HashMap)object6).put(object4, object11);
                object11 = ((TenantResponse)object10).getCartCheckSum();
                if (object11 == null) {
                    object11 = object5;
                }
                object4 = "cartCheckSum";
                ((HashMap)object6).put(object4, object11);
            } else {
                object11 = "TenantResponse is null";
                mz3_0.F((String)object11);
            }
            object11 = payNowRequest.getOfferDetails();
            if (object11 != null) {
                object11 = object11.entrySet().iterator();
                while (bl2 = object11.hasNext()) {
                    int n4;
                    object4 = (Map.Entry)object11.next();
                    object3 = (String)object4.getKey();
                    if ((object4 = (String)object4.getValue()) == null || (n4 = ((String)object4).length()) == 0) continue;
                    ((HashMap)object6).put(object3, object4);
                }
            }
            if ((object11 = ((oo2_1)object2).c.b()) != null) {
                object4 = ((AffiliateData)object11).getUtmMedium();
            } else {
                bl2 = false;
                f5 = 0.0f;
                object4 = null;
            }
            object3 = "affiliate";
            bl2 = Intrinsics.areEqual(object4, object3);
            if (bl2) {
                if (object11 == null || (object4 = ((AffiliateData)object11).getUtmSource()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.utmSource";
                ((HashMap)object6).put(object3, object4);
                if (object11 == null || (object4 = ((AffiliateData)object11).getUtmMedium()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.utmMedium";
                ((HashMap)object6).put(object3, object4);
                if (object11 == null || (object4 = ((AffiliateData)object11).getClickId()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.clickId";
                ((HashMap)object6).put(object3, object4);
                if (object11 == null || (object4 = ((AffiliateData)object11).getOfferId()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.offerId";
                ((HashMap)object6).put(object3, object4);
                if (object11 == null || (object4 = ((AffiliateData)object11).getReturnCancellationWindow()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.returnCancellationWindow";
                ((HashMap)object6).put(object3, object4);
                if (object11 == null || (object4 = ((AffiliateData)object11).getUtmCampaign()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.utmCampaign";
                ((HashMap)object6).put(object3, object4);
                if (object11 == null || (object4 = ((AffiliateData)object11).getAttributionWindow()) == null) {
                    object4 = object5;
                }
                object3 = "affiliateData.attributionWindow";
                ((HashMap)object6).put(object3, object4);
                if (object11 != null && (object11 = ((AffiliateData)object11).getAffiliateId()) != null) {
                    object5 = object11;
                }
                ((HashMap)object6).put("affiliateData.affiliateId", object5);
                object11 = oo2_1.e(payNowRequest);
                object5 = "affiliateData.conversionId";
                ((HashMap)object6).put(object5, object11);
            }
            object6.toString();
            int n7 = 1;
            f6 = Float.MIN_VALUE;
            dm0_0.b = n7;
            if (hashSet != null) {
                n7 = hashSet.size();
            } else {
                n7 = 0;
                f6 = 0.0f;
                object11 = null;
            }
            if (n7 > 0 && object10 != null) {
                object11 = oo2_0.a;
                object11.getClass();
                object9 = oo2_0.i((PaymentInstruments)object9, (TenantResponse)object10, hashSet);
                ((HashMap)object6).putAll(object9);
            }
            InternalWalletUtil.a.getClass();
            object9 = InternalWalletUtil.a();
            boolean bl4 = ((HashSet)object9).isEmpty();
            object9 = bl4 ? "false" : "true";
            ((HashMap)object6).put("notes[eligibleToEarnLoyalty]", object9);
            dm0_0.a = object6;
            object9 = ((oo2_1)object2).a.payNow((String)object12, "PAYMENT_PayNowByWallet", (Map)object6);
            object10 = qt2_2.c;
            object9 = ((g53_0)object9).h((Scheduler)object10);
            object10 = ti_2.a();
            object9 = ((g53_0)object9).e((Scheduler)object10);
            object10 = new io2_2((oo2_1)object2);
            object2 = new jo2_1((io2_2)object10);
            object10 = new s53_0((q63_0)object9, (bx0_2)object2);
            object2 = new Object();
            object9 = new u53_0((q63_0)object10, (bx0_2)object2);
            Intrinsics.checkNotNullExpressionValue(object9, "onErrorReturn(...)");
            int n8 = 2;
            object2 = new L8(object8, n8);
            object10 = new zn0_0(object2);
            n7 = 1;
            f6 = Float.MIN_VALUE;
            object2 = new N8(object8, n7);
            object11 = new ep2_1((N8)object2);
            object2 = ((g53_0)object9).f((o60_0)object10, (o60_0)object11);
            object8 = ((op2_2)object8).b;
            ((t30_0)object8).b((yr0_2)object2);
            object2 = this.Wa();
            object = payNowRequest.getWallet();
            object = object != null ? ((Wallet)object).getCode() : null;
            object8 = "Wallet-";
            object = kp1_0.c((String)object8, (String)object);
            int n10 = 6;
            object9 = "Wallet";
            kj2_1.e((kj2_1)object2, (String)object9, 0, (String)object, n10);
        }
    }

    public final void x1(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        Intrinsics.checkNotNullParameter(string3, "eventAction");
        Intrinsics.checkNotNullParameter(string4, "eventLabel");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        String string6 = "Payment Screen";
        Intrinsics.checkNotNullParameter(string6, "screenName");
        String string7 = this.n;
        String string8 = this.o;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.p, string2, string3, string4, string5, string6, string6, string7, null, string8, false, null, 1536, null);
    }

    public final void y8(UpiAppInfo object) {
        Object object2 = this.Wa().E;
        if (object2 != null && object != null) {
            this.k = null;
            Object object3 = ((UpiAppInfo)object).getPackageName();
            if (object3 == null) {
                object3 = "";
            }
            this.h = object3;
            uy2_1.a = object3;
            int n3 = 255;
            Object object4 = object3;
            object3 = new UPI(null, null, null, null, null, null, null, null, n3, null);
            object4 = Boolean.TRUE;
            ((UPI)object3).setIntent((Boolean)object4);
            object4 = ((UpiAppInfo)object).getName();
            ((UPI)object3).setAppName((String)object4);
            object4 = ((UpiAppInfo)object).getPriceValidation();
            ((UPI)object3).setPriceValidation((PriceValidation)object4);
            object4 = ((UpiAppInfo)object).getOfferDetails();
            ((UPI)object3).setOfferDetails((OfferDetails)object4);
            object4 = ((UpiAppInfo)object).getPaymentInstrumentId();
            ((UPI)object3).setPaymentInstrumentId((String)object4);
            object4 = oo2_0.a;
            Float f5 = Float.valueOf(this.Wa().o);
            object4.getClass();
            object2 = oo2_0.q((UPI)object3, (TenantResponse)object2, f5);
            object3 = ((UpiAppInfo)object).getName();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object3);
            object3 = ((StringBuilder)object4).toString();
            this.bb((PayNowRequest)object2, (String)object3);
            object2 = this.Wa();
            object = ((UpiAppInfo)object).getName();
            object = kp1_0.c("UPI-", (String)object);
            object3 = "UPI";
            object4 = null;
            int n4 = 6;
            kj2_1.e((kj2_1)object2, (String)object3, 0, (String)object, n4);
        }
    }
}

