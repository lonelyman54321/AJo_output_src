/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.payment.query.QueryLPBalance;
import com.ril.ajio.payment.query.QueryLPOtp;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.BaseRequest;
import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.CartItemRequest;
import com.ril.ajio.services.data.Payment.CartRequest;
import com.ril.ajio.services.data.Payment.ChannelInfo;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.EMI;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.NetBanking;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.SubWallet;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UserInfo;
import com.ril.ajio.services.data.Product.StockInfo;
import com.ril.ajio.services.data.user.AffiliateData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Op2
 */
public final class op2_2
extends Hj {
    public final zr1_1 A;
    public final zr1_1 B;
    public final zr1_1 C;
    public final zr1_1 D;
    public final zr1_1 E;
    public final zr1_1 F;
    public final zr1_1 G;
    public final zr1_1 H;
    public UPI I;
    public final hh3_2 J;
    public final oo2_1 a;
    public final t30_0 b;
    public final NewCustomEventsRevamp c;
    public final String d;
    public final String e;
    public boolean f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final zr1_1 m;
    public final zr1_1 n;
    public final zr1_1 o;
    public final zr1_1 p;
    public final zr1_1 q;
    public final zr1_1 r;
    public final zr1_1 s;
    public final zr1_1 t;
    public final zr1_1 u;
    public final zr1_1 v;
    public final zr1_1 w;
    public final zr1_1 x;
    public final zr1_1 y;
    public final zr1_1 z;

    public op2_2(Application object) {
        zr1_1 zr1_12;
        zr1_1 zr1_13;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Object object2 = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplicationContext(...)");
        Object object3 = new oo2_1((Context)object2);
        this.a = object3;
        this.b = object3 = new t30_0();
        object3 = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        this.c = object2;
        object2 = bv_0.a((AnalyticsManager$Companion)object3);
        this.d = object2;
        this.e = object3 = cv_0.a((AnalyticsManager$Companion)object3);
        new zr1_1();
        new zr1_1();
        this.g = object3 = new zr1_1();
        this.h = object3 = new zr1_1();
        this.i = object3 = new zr1_1();
        this.j = object3 = new zr1_1();
        this.k = object3 = new zr1_1();
        this.l = object3 = new zr1_1();
        this.m = object3 = new zr1_1();
        this.n = object3 = new zr1_1();
        this.o = object3 = new zr1_1();
        this.p = object3 = new zr1_1();
        this.q = object3 = new zr1_1();
        this.r = object3 = new zr1_1();
        this.s = object3 = new zr1_1();
        this.t = object3 = new zr1_1();
        this.u = object3 = new zr1_1();
        this.v = object3 = new zr1_1();
        this.w = object3 = new zr1_1();
        this.x = object3 = new zr1_1();
        super();
        this.y = object2;
        this.z = zr1_13 = new zr1_1();
        this.A = zr1_12 = new zr1_1();
        this.B = zr1_12 = new zr1_1();
        this.C = zr1_12 = new zr1_1();
        this.D = zr1_12 = new zr1_1();
        this.E = zr1_12;
        this.F = object3;
        this.G = object2;
        this.H = zr1_13;
        object3 = new ld2_1(object, 1);
        object = yr1_2.b((Function0)object3);
        this.J = object;
    }

    public static void d(op2_2 op2_22, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, hj_1 hj_12, HashSet hashSet) {
        op2_22.getClass();
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        aW aW2 = md3_0.c(op2_22);
        jp2_2 jp2_22 = new jp2_2(op2_22, paymentInstruments, tenantResponse, hashSet, null, hj_12, null);
        Ae3.d(aW2, null, null, jp2_22, 3);
    }

    public final void b(Error object, TenantResponse object2, float f5) {
        object = this.a.a("", (Error)object, (TenantResponse)object2, f5);
        object2 = new np2_1(this, 0);
        op2_1 op2_12 = new op2_1((np2_1)object2);
        object2 = new pp2_2(this);
        qp2_1 qp2_12 = new qp2_1((pp2_2)object2);
        object = ((g53_0)object).f(op2_12, qp2_12);
        this.b.b((yr0_2)object);
    }

    public final void c(String object, TenantResponse object2, float f5) {
        Intrinsics.checkNotNullParameter(object, "reason");
        object = this.a.a((String)object, null, (TenantResponse)object2, f5);
        object2 = new ri1_2(this, 1);
        vo2_1 vo2_12 = new vo2_1(object2);
        object2 = new N7(this, 1);
        jp2_1 jp2_12 = new jp2_1((Function1)object2);
        object = ((g53_0)object).f(vo2_12, jp2_12);
        this.b.b((yr0_2)object);
    }

    public final void e(ArrayList object, TenantResponse object2) {
        Object object3;
        Object object4 = "queryLPBalanceList";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Object object5 = this.a;
        object5.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object4 = UrlHelper.Companion.getInstance();
        Object object6 = new Object[]{};
        Object object7 = "payment";
        Object object8 = "lp_bulk_stored_card_balance_list";
        object4 = ((UrlHelper)object4).getApiUrl((String)object7, (String)object8, object6);
        object6 = null;
        object7 = object2 != null && (object7 = ((TenantResponse)object2).getTenant()) != null ? ((Tenant)object7).getCode() : null;
        object8 = object2 != null && (object8 = ((TenantResponse)object2).getTenant()) != null ? ((Tenant)object8).getName() : null;
        object3 = object2 != null && (object3 = ((TenantResponse)object2).getCustomer()) != null ? ((Customer)object3).getUuid() : null;
        if (object2 != null) {
            object6 = ((TenantResponse)object2).getAccessToken();
        }
        object = JsonUtils.INSTANCE.getGson().toJsonTree(object).getAsJsonArray();
        object2 = new JsonObject();
        ((JsonObject)object2).addProperty("code", (String)object7);
        ((JsonObject)object2).addProperty("name", (String)object8);
        object7 = new JsonObject();
        ((JsonObject)object7).addProperty("uuid", (String)object3);
        object8 = new JsonObject();
        ((JsonObject)object8).add("requests", (JsonElement)object);
        ((JsonObject)object8).add("tenant", (JsonElement)object2);
        ((JsonObject)object8).add("customer", (JsonElement)object7);
        ((JsonObject)object8).addProperty("accessToken", (String)object6);
        object = ((oo2_1)object5).a.getBulkStoredCardLpBalance((String)object4, (JsonObject)object8, "LP_STORED_CARD_BALANCE");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object4 = new nn2_1(object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new Object();
        object4 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
        object = new bp2_2(this);
        object2 = new cp2_1((bp2_2)object);
        object = new dp2_2(this);
        object5 = new ep2_2((dp2_2)object);
        object = ((g53_0)object4).f((o60_0)object2, (o60_0)object5);
        this.b.b((yr0_2)object);
    }

    public final void f(QueryLPBalance object, TenantResponse object2) {
        Object object3;
        Object object4 = "queryLPBalance";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Object object5 = this.a;
        object5.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object4 = UrlHelper.Companion.getInstance();
        Object object6 = new Object[]{};
        Object object7 = "payment";
        Object object8 = "lp_balance";
        object4 = ((UrlHelper)object4).getApiUrl((String)object7, (String)object8, object6);
        object6 = null;
        object7 = object2 != null && (object7 = ((TenantResponse)object2).getTenant()) != null ? ((Tenant)object7).getCode() : null;
        object8 = object2 != null && (object8 = ((TenantResponse)object2).getTenant()) != null ? ((Tenant)object8).getName() : null;
        object3 = object2 != null && (object3 = ((TenantResponse)object2).getCustomer()) != null ? ((Customer)object3).getUuid() : null;
        if (object2 != null) {
            object6 = ((TenantResponse)object2).getAccessToken();
        }
        object = JsonUtils.INSTANCE.getGson().toJsonTree(object).getAsJsonObject();
        object2 = new JsonObject();
        ((JsonObject)object2).addProperty("code", (String)object7);
        ((JsonObject)object2).addProperty("name", (String)object8);
        object7 = new JsonObject();
        ((JsonObject)object7).addProperty("uuid", (String)object3);
        ((JsonObject)object).add("tenant", (JsonElement)object2);
        ((JsonObject)object).add("customer", (JsonElement)object7);
        ((JsonObject)object).addProperty("accessToken", (String)object6);
        Intrinsics.checkNotNull(object);
        object = ((oo2_1)object5).a.getLpBalance((String)object4, (JsonObject)object, "LP_BALANCE");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new ko2_1((oo2_1)object5);
        object4 = new lo2((ko2_1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new Object();
        object4 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
        object = new V8(this, 1);
        int n3 = 1;
        object2 = new si1_2(n3, (Function1)object);
        object = new yz1_1(this, n3);
        object5 = new ui1_1(1, (Function1)object);
        object = ((g53_0)object4).f((o60_0)object2, (o60_0)object5);
        this.b.b((yr0_2)object);
    }

    public final void g(QueryLPOtp object) {
        Intrinsics.checkNotNullParameter(object, "queryLPOtp");
        Object object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "queryLpOtp");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        object3 = ((UrlHelper)object3).getApiUrl("payment", "lp_otp", object4);
        object = JsonUtils.INSTANCE.getGson().toJsonTree(object).getAsJsonObject();
        Intrinsics.checkNotNull(object);
        object = ((oo2_1)object2).a.getLPOtp((String)object3, (JsonObject)object, "LP_OTP");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new wa2_1(1);
        object3 = new xa2_1(1, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        object = new az1_1(this, 1);
        object2 = new ro2_1((az1_1)object);
        object = new so2_1(this, 0);
        object4 = new qk0_0(object);
        object = ((g53_0)object3).f((o60_0)object2, (o60_0)object4);
        this.b.b((yr0_2)object);
    }

    public final void h(PayNowRequest payNowRequest, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, HashSet hashSet) {
        boolean bl2;
        boolean bl3;
        float f5;
        int n3;
        op2_2 op2_22 = this;
        Object object = hashSet;
        Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
        InternalWalletUtil.a.getClass();
        Object object2 = paymentInstruments;
        Object object3 = InternalWalletUtil.g(paymentInstruments, hashSet);
        Bundle bundle = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = this.c;
        Object object4 = newCustomEventsRevamp.getPAYMENT_MODE();
        bundle.putString((String)object4, "debit/credit card");
        Object object5 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
        Object object6 = "payment accordian select";
        Object object7 = "debit/credit card";
        Object object8 = "payment_accordian_select";
        Object object9 = "single page checkout";
        String string2 = "single page checkout";
        Object object10 = this.d;
        String string3 = this.e;
        int n4 = 1536;
        object4 = newCustomEventsRevamp;
        Object object11 = bundle;
        newCustomEventsRevamp = null;
        bundle = null;
        int n7 = n4;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, (String)object6, (String)object7, (String)object8, (String)object9, string2, (String)object10, object11, string3, false, null, n4, null);
        object11.putAll((Bundle)object3);
        boolean bl4 = dm0_0.b;
        if (bl4) {
            object5 = ((NewCustomEventsRevamp)object4).getEC_CHECKOUT_INTERACTIONS();
            newCustomEventsRevamp = null;
            bundle = null;
            object6 = "proceed to pay - retry";
            object7 = "debit/credit card";
            object8 = "proceed_to_pay_retry";
            object9 = "single page checkout";
            string2 = "single page checkout";
            object10 = this.d;
            string3 = this.e;
            n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, (String)object6, (String)object7, (String)object8, (String)object9, string2, (String)object10, object11, string3, false, null, n7, null);
        } else {
            object5 = ((NewCustomEventsRevamp)object4).getEC_CHECKOUT_INTERACTIONS();
            newCustomEventsRevamp = null;
            bundle = null;
            object6 = "proceed to pay";
            object7 = "debit/credit card";
            object8 = "proceed_to_pay";
            object9 = "single page checkout";
            string2 = "single page checkout";
            object10 = this.d;
            string3 = this.e;
            n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, (String)object6, (String)object7, (String)object8, (String)object9, string2, (String)object10, object11, string3, false, null, n7, null);
        }
        object3 = op2_22.a;
        object3.getClass();
        object5 = payNowRequest;
        Intrinsics.checkNotNullParameter(payNowRequest, "query");
        object4 = UrlHelper.Companion.getInstance();
        boolean bl5 = false;
        float f6 = 0.0f;
        object6 = null;
        object7 = new Object[]{};
        object4 = ((UrlHelper)object4).getApiUrl("payment", "pay_now", (Object[])object7);
        object7 = new HashMap();
        object8 = payNowRequest.getPaymentInstrument();
        object9 = "";
        if (object8 == null) {
            object8 = object9;
        }
        ((HashMap)object7).put("paymentInstrument", object8);
        object8 = payNowRequest.getCard();
        string2 = null;
        if (object8 != null) {
            object8 = ((Card)object8).getPaymentInstrumentId();
        } else {
            n3 = 0;
            object8 = null;
            f5 = 0.0f;
        }
        if (object8 != null && (n3 = kotlin.text.b.k((CharSequence)object8)) == 0) {
            object8 = payNowRequest.getCard();
            if (object8 == null || (object8 = ((Card)object8).getPaymentInstrumentId()) == null) {
                object8 = object9;
            }
            object10 = "card.paymentInstrumentId";
            ((HashMap)object7).put(object10, object8);
        }
        if ((object8 = payNowRequest.getCard()) != null && (object8 = Boolean.valueOf((n3 = ((Card)object8).getTokenizationRequired()) != 0).toString()) != null) {
            object10 = "card.tokenizationRequired";
            ((HashMap)object7).put(object10, object8);
        }
        if (tenantResponse == null || (object8 = tenantResponse.getDeviceChecksum()) == null) {
            object8 = object9;
        }
        object10 = "deviceChecksum";
        ((HashMap)object7).put(object10, object8);
        if (tenantResponse == null || (object8 = tenantResponse.getDeviceId()) == null) {
            object8 = object9;
        }
        object10 = "deviceId";
        ((HashMap)object7).put(object10, object8);
        n3 = payNowRequest.getEncryptedPaymentInstrumentPresent();
        if (n3 != 0 && (object8 = payNowRequest.getEncryptedCardInfo()) != null && (n3 = ((String)object8).length()) != 0) {
            object8 = payNowRequest.getEncryptedCardInfo();
            if (object8 == null) {
                object8 = object9;
            }
            ((HashMap)object7).put("card.encryptedCardInfo", object8);
            n3 = (int)(payNowRequest.getEncryptedPaymentInstrumentPresent() ? 1 : 0);
            object8 = String.valueOf(n3 != 0);
            object10 = "encryptedPaymentInstrumentPresent";
            ((HashMap)object7).put(object10, object8);
        } else {
            object8 = payNowRequest.getCard();
            if (object8 == null || (object8 = ((Card)object8).getNameOnCard()) == null) {
                object8 = object9;
            }
            object10 = "card.nameOnCard";
            ((HashMap)object7).put(object10, object8);
            object8 = payNowRequest.getCard();
            if (object8 == null || (object8 = ((Card)object8).getCardNumber()) == null) {
                object8 = object9;
            }
            object10 = "card.cardNumber";
            ((HashMap)object7).put(object10, object8);
            object8 = payNowRequest.getCard();
            if (object8 == null || (object8 = ((Card)object8).getExpiryYear()) == null) {
                object8 = object9;
            }
            object10 = "card.expiryYear";
            ((HashMap)object7).put(object10, object8);
            object8 = payNowRequest.getCard();
            if (object8 == null || (object8 = ((Card)object8).getExpiryMonth()) == null) {
                object8 = object9;
            }
            object10 = "card.expiryMonth";
            ((HashMap)object7).put(object10, object8);
            object8 = payNowRequest.getCard();
            if (object8 == null || (object8 = ((Card)object8).getCvv()) == null) {
                object8 = object9;
            }
            object10 = "card.cvv";
            ((HashMap)object7).put(object10, object8);
        }
        object8 = payNowRequest.getCard();
        if (object8 != null && (object8 = ((Card)object8).getSaveCard()) != null) {
            bl5 = (Boolean)object8;
        }
        object6 = String.valueOf(bl5);
        ((HashMap)object7).put("card.saveCard", object6);
        object6 = "paymentChannelInformation.appType";
        object8 = "ANDROID";
        ((HashMap)object7).put(object6, object8);
        if (tenantResponse == null || (object6 = tenantResponse.getAccessToken()) == null) {
            object6 = object9;
        }
        object8 = "accessToken";
        ((HashMap)object7).put(object8, object6);
        object6 = payNowRequest.getCustomer();
        if (object6 != null) {
            object6 = payNowRequest.getCustomer();
            if (object6 == null || (object6 = ((Customer)object6).getEmail()) == null) {
                object6 = object9;
            }
            object8 = "customer.email";
            ((HashMap)object7).put(object8, object6);
            object6 = payNowRequest.getCustomer();
            if (object6 == null || (object6 = ((Customer)object6).getMobile()) == null) {
                object6 = object9;
            }
            object8 = "customer.mobile";
            ((HashMap)object7).put(object8, object6);
            object6 = payNowRequest.getCustomer();
            if (object6 == null || (object6 = ((Customer)object6).getUuid()) == null) {
                object6 = object9;
            }
            object8 = "customer.uuid";
            ((HashMap)object7).put(object8, object6);
        }
        object6 = payNowRequest.getOrder();
        n3 = 0;
        f5 = 0.0f;
        object8 = null;
        if (object6 != null) {
            object6 = payNowRequest.getOrder();
            if (object6 != null && (object6 = ((Order)object6).getAmount()) != null) {
                f6 = ((Float)object6).floatValue();
            } else {
                bl5 = false;
                f6 = 0.0f;
                object6 = null;
            }
            object6 = String.valueOf(f6);
            object10 = "order.amount";
            ((HashMap)object7).put(object10, object6);
            object6 = payNowRequest.getOrder();
            if (object6 == null || (object6 = ((Order)object6).getOrderId()) == null) {
                object6 = object9;
            }
            object10 = "order.orderId";
            ((HashMap)object7).put(object10, object6);
        }
        object6 = payNowRequest.getOnepTotalPrice();
        object10 = "0";
        if (object6 == null) {
            object6 = object10;
        }
        object11 = "order.totalPrice1p";
        ((HashMap)object7).put(object11, object6);
        object6 = payNowRequest.getThreepTotalPrice();
        if (object6 != null) {
            object10 = object6;
        }
        ((HashMap)object7).put("order.totalPrice3p", object10);
        ((HashMap)object7).put("paymentChannelInformation.paymentChannel", "APP");
        object10 = "9.20.0";
        ((HashMap)object7).put("paymentChannelInformation.appVersion", object10);
        object6 = payNowRequest.getTenant();
        if (object6 == null || (object6 = ((Tenant)object6).getCode()) == null) {
            object6 = object9;
        }
        ((HashMap)object7).put("tenant.code", object6);
        object6 = String.valueOf(payNowRequest.getNetPayableAmount());
        ((HashMap)object7).put("order.netPayableAmount", object6);
        object6 = payNowRequest.getLoyalty();
        object10 = "false";
        if (object6 != null) {
            object6 = payNowRequest.getLoyalty();
            if (object6 != null && (object6 = ((Loyalty)object6).getLoyaltyPoints()) != null) {
                f6 = ((Float)object6).floatValue();
            } else {
                bl5 = false;
                f6 = 0.0f;
                object6 = null;
            }
            object6 = String.valueOf(f6);
            object11 = "card.loyalty.loyaltyPoints";
            ((HashMap)object7).put(object11, object6);
            object6 = payNowRequest.getLoyalty();
            if (object6 != null && (object6 = ((Loyalty)object6).getEarnPoints()) != null) {
                f5 = ((Float)object6).floatValue();
            }
            object6 = String.valueOf(f5);
            object8 = "card.loyalty.earnPoints";
            ((HashMap)object7).put(object8, object6);
            object6 = payNowRequest.getLoyalty();
            if (object6 == null || (object6 = ((Loyalty)object6).getStatus()) == null) {
                object6 = object9;
            }
            object8 = "card.loyalty.status";
            ((HashMap)object7).put(object8, object6);
            object6 = payNowRequest.isLRManaged();
            if (object6 == null) {
                object6 = object9;
            }
            object8 = "card.isLRManaged";
            ((HashMap)object7).put(object8, object6);
            ((HashMap)object7).put("isPaymentInstrumentActive", object10);
            object6 = payNowRequest.getRegisteredMobile();
            if (object6 == null) {
                object6 = object9;
            }
            object8 = "card.registeredMobile";
            ((HashMap)object7).put(object8, object6);
        }
        if (tenantResponse != null) {
            object6 = tenantResponse.getTenantTransactionId();
            if (object6 == null) {
                object6 = object9;
            }
            object8 = "tenantTransactionId";
            ((HashMap)object7).put(object8, object6);
            object6 = tenantResponse.getRequestChecksum();
            if (object6 == null) {
                object6 = object9;
            }
            object8 = "requestChecksum";
            ((HashMap)object7).put(object8, object6);
            object6 = tenantResponse.getTransactionToken();
            if (object6 == null) {
                object6 = object9;
            }
            object8 = "transactionToken";
            ((HashMap)object7).put(object8, object6);
            object6 = tenantResponse.getCartCheckSum();
            if (object6 == null) {
                object6 = object9;
            }
            object8 = "cartCheckSum";
            ((HashMap)object7).put(object8, object6);
        } else {
            object6 = "TenantResponse is null";
            mz3_0.F((String)object6);
        }
        bl5 = true;
        f6 = Float.MIN_VALUE;
        dm0_0.b = bl5;
        n3 = hashSet.size();
        if (n3 > 0 && tenantResponse != null) {
            object8 = oo2_0.a;
            object8.getClass();
            object = oo2_0.i(paymentInstruments, tenantResponse, hashSet);
            ((HashMap)object7).putAll(object);
        }
        if (!(bl3 = ((HashSet)(object = InternalWalletUtil.a())).isEmpty())) {
            object10 = "true";
        }
        ((HashMap)object7).put("notes[eligibleToEarnLoyalty]", object10);
        object = payNowRequest.getOfferDetails();
        if (object != null) {
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                int n8;
                object2 = (Map.Entry)object.next();
                object8 = (String)object2.getKey();
                if ((object2 = (String)object2.getValue()) == null || (n8 = ((String)object2).length()) == 0) continue;
                ((HashMap)object7).put(object8, object2);
            }
        }
        if ((object = ((oo2_1)object3).c.b()) != null) {
            string2 = ((AffiliateData)object).getUtmMedium();
        }
        if (bl2 = Intrinsics.areEqual(string2, object2 = "affiliate")) {
            if (object == null || (object2 = ((AffiliateData)object).getUtmSource()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.utmSource";
            ((HashMap)object7).put(object8, object2);
            if (object == null || (object2 = ((AffiliateData)object).getUtmMedium()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.utmMedium";
            ((HashMap)object7).put(object8, object2);
            if (object == null || (object2 = ((AffiliateData)object).getClickId()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.clickId";
            ((HashMap)object7).put(object8, object2);
            if (object == null || (object2 = ((AffiliateData)object).getOfferId()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.offerId";
            ((HashMap)object7).put(object8, object2);
            if (object == null || (object2 = ((AffiliateData)object).getReturnCancellationWindow()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.returnCancellationWindow";
            ((HashMap)object7).put(object8, object2);
            if (object == null || (object2 = ((AffiliateData)object).getUtmCampaign()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.utmCampaign";
            ((HashMap)object7).put(object8, object2);
            if (object == null || (object2 = ((AffiliateData)object).getAttributionWindow()) == null) {
                object2 = object9;
            }
            object8 = "affiliateData.attributionWindow";
            ((HashMap)object7).put(object8, object2);
            if (object != null && (object = ((AffiliateData)object).getAffiliateId()) != null) {
                object9 = object;
            }
            ((HashMap)object7).put("affiliateData.affiliateId", object9);
            object = oo2_1.e(payNowRequest);
            object2 = "affiliateData.conversionId";
            ((HashMap)object7).put(object2, object);
        }
        dm0_0.b = bl5;
        object7.toString();
        dm0_0.a = object7;
        object = ((oo2_1)object3).a.payNow((String)object4, "PAYMENT_PayNowByCard", (Map)object7);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new ao2_2((oo2_1)object3);
        object3 = new bo2_1((ao2_2)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        object = new yp2_1(op2_22);
        object2 = new zp2_2((yp2_1)object);
        object = new e8_0(op2_22, 1);
        object4 = new cq_2(2, (Function1)object);
        object = ((g53_0)object3).f((o60_0)object2, (o60_0)object4);
        op2_22.b.b((yr0_2)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void i(PayNowRequest payNowRequest, PaymentInstruments object, TenantResponse tenantResponse, float f5, HashSet hashSet) {
        JsonObject jsonObject;
        Object object2;
        int n3;
        float f6;
        float f7;
        int n4;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        String string2;
        oo2_1 oo2_12;
        Object object7;
        Object object8 = this;
        Object object9 = payNowRequest;
        Object object10 = object;
        Object object11 = tenantResponse;
        Object object12 = hashSet;
        float f8 = 0.0f;
        Object object13 = null;
        Object object14 = "query";
        Intrinsics.checkNotNullParameter(payNowRequest, (String)object14);
        Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
        Object object15 = this.a;
        object15.getClass();
        Intrinsics.checkNotNullParameter(payNowRequest, (String)object14);
        object14 = UrlHelper.Companion.getInstance();
        Object object16 = new Object[]{};
        object14 = ((UrlHelper)object14).getApiUrl("payment", "pay_now_json", (Object[])object16);
        object16 = ((oo2_1)object15).c.b();
        Object object17 = new JsonObject();
        Object object18 = payNowRequest.getEmi();
        Object object19 = "";
        if (object18 == null || (object18 = ((EMI)object18).getCode()) == null) {
            object18 = object19;
        }
        String string3 = "code";
        ((JsonObject)object17).addProperty(string3, (String)object18);
        String string4 = "type";
        ((JsonObject)object17).addProperty(string4, "EMI");
        object18 = new JsonObject();
        InternalWalletUtil.a.getClass();
        Object object20 = InternalWalletUtil.a();
        boolean bl2 = ((HashSet)object20).isEmpty();
        object13 = "true";
        Object object21 = "eligibleToEarnLoyalty";
        object9 = "false";
        if (bl2) {
            ((JsonObject)object18).addProperty((String)object21, (String)object9);
        } else {
            ((JsonObject)object18).addProperty((String)object21, (String)object13);
        }
        object21 = new JsonObject();
        ((JsonObject)object21).addProperty("paymentChannel", "APP");
        object20 = "appType";
        ((JsonObject)object21).addProperty((String)object20, "ANDROID");
        object8 = new JsonObject();
        Object object22 = payNowRequest.getTenant();
        if (object22 != null && (object22 = ((Tenant)object22).getCode()) != null) {
            object7 = object22;
            object22 = object14;
            object14 = object7;
        } else {
            object22 = object14;
            object14 = object19;
        }
        ((JsonObject)object8).addProperty(string3, (String)object14);
        object14 = payNowRequest.getTenant();
        if (object14 != null && (object14 = ((Tenant)object14).getCallbackUrl()) != null) {
            oo2_12 = object15;
        } else {
            oo2_12 = object15;
            object14 = object19;
        }
        ((JsonObject)object8).addProperty("callbackUrl", (String)object14);
        object14 = new JsonObject();
        object15 = payNowRequest.getCustomer();
        if (object15 != null && (object15 = ((Customer)object15).getUuid()) != null) {
            string2 = object13;
        } else {
            string2 = object13;
            object15 = object19;
        }
        ((JsonObject)object14).addProperty("uuid", (String)object15);
        object13 = payNowRequest.getCustomer();
        if (object13 == null || (object13 = ((Customer)object13).getEmail()) == null) {
            object13 = object19;
        }
        object15 = "email";
        ((JsonObject)object14).addProperty((String)object15, (String)object13);
        object13 = payNowRequest.getCustomer();
        if (object13 != null && (object13 = ((Customer)object13).getMobile()) != null) {
            object6 = object8;
        } else {
            object6 = object8;
            object13 = object19;
        }
        ((JsonObject)object14).addProperty("mobile", (String)object13);
        object8 = new JsonObject();
        object13 = payNowRequest.getOrder();
        if (object13 != null && (object13 = ((Order)object13).getOrderId()) != null) {
            object5 = object14;
        } else {
            object5 = object14;
            object13 = object19;
        }
        object14 = "orderId";
        ((JsonObject)object8).addProperty((String)object14, (String)object13);
        object13 = payNowRequest.getOrder();
        if (object13 != null && (object13 = ((Order)object13).getAmount()) != null) {
            f8 = ((Float)object13).floatValue();
        } else {
            f8 = 0.0f;
            object13 = null;
        }
        object13 = String.valueOf(f8);
        object14 = "amount";
        ((JsonObject)object8).addProperty((String)object14, (String)object13);
        Object object23 = object21;
        object21 = String.valueOf(f5);
        ((JsonObject)object8).addProperty("netPayableAmount", (String)object21);
        object13 = payNowRequest.getThreepTotalPrice();
        Object object24 = object21 = "0";
        if (object13 == null) {
            object13 = object21;
        }
        object21 = "totalPrice3p";
        ((JsonObject)object8).addProperty((String)object21, (String)object13);
        object13 = payNowRequest.getOnepTotalPrice();
        object21 = object13 == null ? object24 : object13;
        ((JsonObject)object8).addProperty("totalPrice1p", (String)object21);
        object13 = new JsonObject();
        if (object16 != null && (object21 = ((AffiliateData)object16).getUtmSource()) != null) {
            object4 = object8;
        } else {
            object4 = object8;
            object21 = object19;
        }
        object8 = "utmSource";
        ((JsonObject)object13).addProperty((String)object8, (String)object21);
        if (object16 == null || (object8 = ((AffiliateData)object16).getUtmMedium()) == null) {
            object8 = object19;
        }
        object21 = "utmMedium";
        ((JsonObject)object13).addProperty((String)object21, (String)object8);
        if (object16 == null || (object8 = ((AffiliateData)object16).getUtmCampaign()) == null) {
            object8 = object19;
        }
        object21 = "utmCampaign";
        ((JsonObject)object13).addProperty((String)object21, (String)object8);
        if (object16 == null || (object8 = ((AffiliateData)object16).getClickId()) == null) {
            object8 = object19;
        }
        object21 = "clickId";
        ((JsonObject)object13).addProperty((String)object21, (String)object8);
        if (object16 == null || (object8 = ((AffiliateData)object16).getOfferId()) == null) {
            object8 = object19;
        }
        object21 = "offerId";
        ((JsonObject)object13).addProperty((String)object21, (String)object8);
        if (object16 == null || (object8 = ((AffiliateData)object16).getReturnCancellationWindow()) == null) {
            object8 = object19;
        }
        object21 = "returnCancellationWindow";
        ((JsonObject)object13).addProperty((String)object21, (String)object8);
        if (object16 == null || (object8 = ((AffiliateData)object16).getAttributionWindow()) == null) {
            object8 = object19;
        }
        object21 = "attributionWindow";
        ((JsonObject)object13).addProperty((String)object21, (String)object8);
        if (object16 == null || (object8 = ((AffiliateData)object16).getAffiliateId()) == null) {
            object8 = object19;
        }
        ((JsonObject)object13).addProperty("affiliateId", (String)object8);
        object8 = oo2_1.e(payNowRequest);
        ((JsonObject)object13).addProperty("conversionId", (String)object8);
        int n7 = 1;
        dm0_0.b = n7;
        object8 = new JsonObject();
        object21 = new JsonObject();
        if (object11 != null && (object16 = tenantResponse.getCartRequest()) != null && (object16 = ((CartRequest)object16).getBaseRequest()) != null && (object16 = ((BaseRequest)object16).getCartId()) != null) {
            object24 = object13;
        } else {
            object24 = object13;
            object16 = object19;
        }
        object13 = "cartId";
        ((JsonObject)object21).addProperty((String)object13, (String)object16);
        object16 = new JsonObject();
        if (object11 != null && (object3 = tenantResponse.getCartRequest()) != null && (object3 = ((CartRequest)object3).getBaseRequest()) != null && (object3 = ((BaseRequest)object3).getChannelInfo()) != null && (object3 = ((ChannelInfo)object3).getAppType()) != null) {
            object7 = object3;
            object3 = object18;
            object18 = object7;
        } else {
            object3 = object18;
            object18 = object19;
        }
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getAppVersion()) == null) {
            object18 = object19;
        }
        object20 = "appVersion";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getChannelType()) == null) {
            object18 = object19;
        }
        object20 = "channelType";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getDeviceId()) == null) {
            object18 = object19;
        }
        object20 = "deviceId";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getOsType()) == null) {
            object18 = object19;
        }
        Object object25 = object20;
        object20 = "osType";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getOsVersion()) == null) {
            object18 = object19;
        }
        object20 = "osVersion";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getSessionId()) == null) {
            object18 = object19;
        }
        object20 = "sessionId";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getChannelInfo()) == null || (object18 = ((ChannelInfo)object18).getNthOrderOnChannel()) == null) {
            object18 = object19;
        }
        object20 = "nthOrderOnChannel";
        ((JsonObject)object16).addProperty((String)object20, (String)object18);
        object18 = "channelInfo";
        ((JsonObject)object21).add((String)object18, (JsonElement)object16);
        if (object11 == null || (object16 = tenantResponse.getCartRequest()) == null || (object16 = ((CartRequest)object16).getBaseRequest()) == null || (object16 = ((BaseRequest)object16).getConsumerType()) == null) {
            object16 = object19;
        }
        object18 = "consumerType";
        ((JsonObject)object21).addProperty((String)object18, (String)object16);
        if (object11 == null || (object16 = tenantResponse.getCartRequest()) == null || (object16 = ((CartRequest)object16).getBaseRequest()) == null || (object16 = ((BaseRequest)object16).getPageType()) == null) {
            object16 = object19;
        }
        object18 = "pageType";
        ((JsonObject)object21).addProperty((String)object18, (String)object16);
        object16 = new JsonObject();
        if (object11 == null || (object18 = tenantResponse.getCartRequest()) == null || (object18 = ((CartRequest)object18).getBaseRequest()) == null || (object18 = ((BaseRequest)object18).getUserInfo()) == null || (object18 = ((UserInfo)object18).getEmail()) == null) {
            object18 = object19;
        }
        ((JsonObject)object16).addProperty((String)object15, (String)object18);
        if (object11 == null || (object15 = tenantResponse.getCartRequest()) == null || (object15 = ((CartRequest)object15).getBaseRequest()) == null || (object15 = ((BaseRequest)object15).getUserInfo()) == null || (object15 = ((UserInfo)object15).getPhoneNumber()) == null) {
            object15 = object19;
        }
        object18 = "phoneNumber";
        ((JsonObject)object16).addProperty((String)object18, (String)object15);
        if (object11 == null || (object15 = tenantResponse.getCartRequest()) == null || (object15 = ((CartRequest)object15).getBaseRequest()) == null || (object15 = ((BaseRequest)object15).getUserInfo()) == null || (object15 = ((UserInfo)object15).getProfileName()) == null) {
            object15 = object19;
        }
        object18 = "profileName";
        ((JsonObject)object16).addProperty((String)object18, (String)object15);
        if (object11 == null || (object15 = tenantResponse.getCartRequest()) == null || (object15 = ((CartRequest)object15).getBaseRequest()) == null || (object15 = ((BaseRequest)object15).getUserInfo()) == null || (object15 = ((UserInfo)object15).getUserId()) == null) {
            object15 = object19;
        }
        object18 = "userId";
        ((JsonObject)object16).addProperty((String)object18, (String)object15);
        object15 = "userInfo";
        ((JsonObject)object21).add((String)object15, (JsonElement)object16);
        if (object11 == null || (object15 = tenantResponse.getCartRequest()) == null || (object15 = ((CartRequest)object15).getBaseRequest()) == null || (object15 = ((BaseRequest)object15).getTenantId()) == null) {
            object15 = object19;
        }
        object16 = "tenantId";
        ((JsonObject)object21).addProperty((String)object16, (String)object15);
        object15 = "baseRequest";
        ((JsonObject)object8).add((String)object15, (JsonElement)object21);
        if (object11 == null || (object21 = tenantResponse.getCartRequest()) == null || (object21 = ((CartRequest)object21).getCartId()) == null) {
            object21 = object19;
        }
        ((JsonObject)object8).addProperty((String)object13, (String)object21);
        object13 = new JsonArray();
        if (object11 != null && (object15 = tenantResponse.getCartRequest()) != null) {
            object15 = ((CartRequest)object15).getCartItemRequests();
        } else {
            n4 = 0;
            f7 = 0.0f;
            object15 = null;
        }
        if (object15 != null) {
            boolean bl3;
            object15 = ((Iterable)object15).iterator();
            int n8 = 0;
            object16 = null;
            while (bl3 = object15.hasNext()) {
                object18 = object15.next();
                bl2 = true;
                int n10 = n8 + 1;
                if (n8 < 0) {
                    xx_2.n();
                    throw null;
                }
                object18 = (CartItemRequest)object18;
                object16 = new JsonObject();
                object20 = ((CartItemRequest)object18).getBrand();
                if (object20 == null) {
                    object20 = object19;
                }
                ((JsonObject)object16).addProperty("brand", (String)object20);
                object21 = ((CartItemRequest)object18).getBrick();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "brick";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getCatalogId();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "catalogId";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getCategory();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "category";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getName();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "name";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getPrice();
                if (object21 != null) {
                    f6 = ((Float)object21).floatValue();
                } else {
                    n3 = 0;
                    f6 = 0.0f;
                    object21 = null;
                }
                object21 = String.valueOf(f6);
                object20 = "price";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getQuantity();
                if (object21 == null) {
                    bl2 = false;
                    object20 = null;
                    object21 = Float.valueOf(0.0f);
                }
                object21 = object21.toString();
                object20 = "quantity";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getSkuId();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "skuId";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getSourceStoreId();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "sourceStoreId";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getSubCategory();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "subCategory";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = ((CartItemRequest)object18).getThumbnailImgUrl();
                if (object21 == null) {
                    object21 = object19;
                }
                object20 = "thumbnailImgUrl";
                ((JsonObject)object16).addProperty((String)object20, (String)object21);
                object21 = new JsonObject();
                object18 = ((CartItemRequest)object18).getStockInfo();
                if (object18 == null || (object18 = ((StockInfo)object18).getStockStatus()) == null) {
                    object18 = object19;
                }
                object20 = "stockStatus";
                ((JsonObject)object21).addProperty((String)object20, (String)object18);
                object18 = "stockInfo";
                ((JsonObject)object16).add((String)object18, (JsonElement)object21);
                ((JsonArray)object13).add((JsonElement)object16);
                n8 = n10;
            }
            object21 = Unit.a;
        }
        object21 = "cartItemRequests";
        ((JsonObject)object8).add((String)object21, (JsonElement)object13);
        if (object11 == null || (object13 = tenantResponse.getCartRequest()) == null || (object13 = ((CartRequest)object13).getOrderType()) == null) {
            object13 = object19;
        }
        object21 = "orderType";
        ((JsonObject)object8).addProperty((String)object21, (String)object13);
        object13 = new JsonArray();
        if (object12 != null) {
            n3 = hashSet.size();
        } else {
            n3 = 0;
            f6 = 0.0f;
            object21 = null;
        }
        if (n3 > 0 && object11 != null) {
            if (object10 != null && (object21 = ((PaymentInstruments)object).getPaymentInstrumentDetails()) != null) {
                n3 = object21.size();
            } else {
                n3 = 0;
                f6 = 0.0f;
                object21 = null;
            }
            if (n3 > 0) {
                oo2_0.a.getClass();
                object21 = "INTERNAL_WALLET";
                object10 = oo2_0.c((String)object21, (PaymentInstruments)object10);
                if (object10 != null && (object21 = ((PaymentInstrumentType)object10).getPaymentInstrumentsInfo()) != null) {
                    n3 = ((ArrayList)object21).size();
                } else {
                    n3 = 0;
                    f6 = 0.0f;
                    object21 = null;
                }
                if (n3 > 0) {
                    object10 = oo2_0.g((PaymentInstrumentType)object10, (HashSet)object12, (TenantResponse)object11);
                    int n14 = ((ArrayList)object10).isEmpty();
                    n3 = 1;
                    f6 = Float.MIN_VALUE;
                    int n15 = n14 ^ n3;
                    if (n15 != 0) {
                        void var43_46;
                        int n16 = ((ArrayList)object10).size();
                        n3 = 0;
                        f6 = 0.0f;
                        object21 = null;
                        while (n3 < var43_46) {
                            object15 = (PaymentInstrumentInfo)((ArrayList)object10).get(n3);
                            object16 = new JsonObject();
                            if (object15 == null || (object18 = ((PaymentInstrumentInfo)object15).getType()) == null) {
                                object18 = object19;
                            }
                            ((JsonObject)object16).addProperty(string4, (String)object18);
                            object18 = ((PaymentInstrumentInfo)object15).getCode();
                            if (object18 == null) {
                                object18 = object19;
                            }
                            ((JsonObject)object16).addProperty(string3, (String)object18);
                            object18 = String.valueOf(((PaymentInstrumentInfo)object15).getAmount());
                            ((JsonObject)object16).addProperty((String)object14, (String)object18);
                            object18 = String.valueOf(((PaymentInstrumentInfo)object15).getLeftPostUsage());
                            object20 = "leftPostUsage";
                            ((JsonObject)object16).addProperty((String)object20, (String)object18);
                            float f11 = ((PaymentInstrumentInfo)object15).getMinimumEarnThreshold();
                            object18 = String.valueOf(f11);
                            object = object10;
                            object10 = "minimumEarnThreshold";
                            ((JsonObject)object16).addProperty((String)object10, (String)object18);
                            object18 = String.valueOf(((PaymentInstrumentInfo)object15).getMultipleWalletEnabledAmount());
                            void var45_48 = var43_46;
                            object12 = "multipleWalletEnabledAmount";
                            ((JsonObject)object16).addProperty((String)object12, (String)object18);
                            object18 = String.valueOf(((PaymentInstrumentInfo)object15).getMultipleWalletEnabledLeftPostUsageAmount());
                            object2 = object8;
                            object8 = "multipleWalletEnabledLeftPostUsageAmount";
                            ((JsonObject)object16).addProperty((String)object8, (String)object18);
                            object18 = "3pEnabled";
                            ((JsonObject)object16).addProperty((String)object18, (String)object9);
                            object11 = new JsonArray();
                            jsonObject = object17;
                            object17 = "AJIO_CASH_WALLET";
                            int n17 = n3;
                            object21 = ((PaymentInstrumentInfo)object15).getType();
                            n3 = (int)(Intrinsics.areEqual(object17, object21) ? 1 : 0);
                            if (n3 == 0 || (object21 = ((PaymentInstrumentInfo)object15).getSubWallets()) == null) {
                                n7 = 1;
                            } else {
                                object15 = object21;
                                object15 = (Collection)object21;
                                n4 = object15.size();
                                object17 = null;
                                for (int i3 = 0; i3 < n4; i3 += n7) {
                                    Object object26;
                                    int n18;
                                    String string5;
                                    SubWallet subWallet = (SubWallet)object21.get(i3);
                                    Object object27 = object21;
                                    object21 = new JsonObject();
                                    if (subWallet != null && (string5 = subWallet.getType()) != null) {
                                        object7 = string5;
                                        n18 = n4;
                                        object15 = string5;
                                    } else {
                                        n18 = n4;
                                        object15 = object19;
                                    }
                                    ((JsonObject)object21).addProperty(string4, (String)object15);
                                    if (subWallet == null || (object15 = subWallet.getCode()) == null) {
                                        object15 = object19;
                                    }
                                    ((JsonObject)object21).addProperty(string3, (String)object15);
                                    if (subWallet != null && (object15 = subWallet.getAmount()) != null) {
                                        f7 = ((Float)object15).floatValue();
                                    } else {
                                        n4 = 0;
                                        f7 = 0.0f;
                                        object15 = null;
                                    }
                                    object15 = String.valueOf(f7);
                                    ((JsonObject)object21).addProperty((String)object14, (String)object15);
                                    if (subWallet != null) {
                                        f7 = subWallet.getLeftPostUsage();
                                    } else {
                                        n4 = 0;
                                        f7 = 0.0f;
                                        object15 = null;
                                    }
                                    object15 = String.valueOf(f7);
                                    ((JsonObject)object21).addProperty((String)object20, (String)object15);
                                    ((JsonObject)object21).addProperty((String)object10, (String)object19);
                                    if (subWallet != null && (object15 = subWallet.getMultipleWalletEnabledAmount()) != null) {
                                        f7 = ((Float)object15).floatValue();
                                    } else {
                                        n4 = 0;
                                        f7 = 0.0f;
                                        object15 = null;
                                    }
                                    object15 = String.valueOf(f7);
                                    ((JsonObject)object21).addProperty((String)object12, (String)object15);
                                    if (subWallet != null && (object15 = subWallet.getMultipleWalletEnabledLeftPostUsageAmount()) != null) {
                                        f7 = ((Float)object15).floatValue();
                                    } else {
                                        n4 = 0;
                                        f7 = 0.0f;
                                        object15 = null;
                                    }
                                    object15 = String.valueOf(f7);
                                    ((JsonObject)object21).addProperty((String)object8, (String)object15);
                                    ((JsonObject)object21).addProperty((String)object18, (String)object9);
                                    if (subWallet == null || (object15 = subWallet.getPoints()) == null) {
                                        n4 = 0;
                                        f7 = 0.0f;
                                        object15 = null;
                                        object26 = Float.valueOf(0.0f);
                                    } else {
                                        object26 = object15;
                                    }
                                    object15 = object26.toString();
                                    object26 = object8;
                                    ((JsonObject)object21).addProperty("points", (String)object15);
                                    ((JsonArray)object11).add((JsonElement)object21);
                                    n7 = 1;
                                    object21 = object27;
                                    n4 = n18;
                                }
                                n7 = 1;
                                object10 = Unit.a;
                            }
                            ((JsonObject)object16).add("subWallets", (JsonElement)object11);
                            ((JsonArray)object13).add((JsonElement)object16);
                            n3 = n17 + 1;
                            object10 = object;
                            object11 = tenantResponse;
                            var43_46 = var45_48;
                            object8 = object2;
                            object17 = jsonObject;
                        }
                    }
                }
            }
        }
        object2 = object8;
        jsonObject = object17;
        object8 = new JsonObject();
        object10 = object17;
        ((JsonObject)object8).add("emi", (JsonElement)object17);
        object9 = payNowRequest.getPaymentInstrument();
        if (object9 == null) {
            object9 = object19;
        }
        ((JsonObject)object8).addProperty("paymentInstrument", (String)object9);
        object10 = object3;
        ((JsonObject)object8).add("notes", (JsonElement)object3);
        object10 = object23;
        ((JsonObject)object8).add("paymentChannelInformation", (JsonElement)object23);
        object9 = "tenant";
        object10 = object6;
        ((JsonObject)object8).add((String)object9, (JsonElement)object6);
        if (tenantResponse == null || (object9 = tenantResponse.getTenantTransactionId()) == null) {
            object9 = object19;
        }
        ((JsonObject)object8).addProperty("tenantTransactionId", (String)object9);
        object10 = object5;
        ((JsonObject)object8).add("customer", (JsonElement)object5);
        object9 = "order";
        object10 = object4;
        ((JsonObject)object8).add((String)object9, (JsonElement)object4);
        if (tenantResponse == null || (object9 = tenantResponse.getAccessToken()) == null) {
            object9 = object19;
        }
        object10 = "accessToken";
        ((JsonObject)object8).addProperty((String)object10, (String)object9);
        if (tenantResponse == null || (object9 = tenantResponse.getRequestChecksum()) == null) {
            object9 = object19;
        }
        object10 = "requestChecksum";
        ((JsonObject)object8).addProperty((String)object10, (String)object9);
        if (tenantResponse == null || (object9 = tenantResponse.getDeviceId()) == null) {
            object9 = object19;
        }
        object10 = object25;
        ((JsonObject)object8).addProperty((String)object25, (String)object9);
        if (tenantResponse == null || (object9 = tenantResponse.getDeviceChecksum()) == null) {
            object9 = object19;
        }
        object10 = "deviceChecksum";
        ((JsonObject)object8).addProperty((String)object10, (String)object9);
        if (tenantResponse == null || (object9 = tenantResponse.getCartCheckSum()) == null) {
            object9 = object19;
        }
        object10 = "cartCheckSum";
        ((JsonObject)object8).addProperty((String)object10, (String)object9);
        if (tenantResponse != null && (object9 = tenantResponse.getTransactionToken()) != null) {
            object19 = object9;
        }
        ((JsonObject)object8).addProperty("transactionToken", (String)object19);
        object10 = object24;
        ((JsonObject)object8).add("affiliateData", (JsonElement)object24);
        object10 = string2;
        ((JsonObject)object8).addProperty("payNowJson", string2);
        object10 = object2;
        ((JsonObject)object8).add("cartRequest", (JsonElement)object2);
        ((JsonObject)object8).add("internalWallets", (JsonElement)object13);
        object9 = oo2_12;
        object10 = oo2_12.a;
        object12 = object22;
        object8 = object10.payNowJson((String)object22, "PAYMENT_PayNowByEMI", (JsonObject)object8);
        object10 = qt2_2.c;
        object8 = ((g53_0)object8).h((Scheduler)object10);
        object10 = ti_2.a();
        object8 = ((g53_0)object8).e((Scheduler)object10);
        object10 = new eo2_2(oo2_12, 0);
        object9 = new fo2_0((eo2_2)object10);
        object10 = new s53_0((q63_0)object8, (bx0_2)object9);
        object8 = new Object();
        object9 = new u53_0((q63_0)object10, (bx0_2)object8);
        Intrinsics.checkNotNullExpressionValue(object9, "onErrorReturn(...)");
        int n19 = 1;
        object10 = this;
        object8 = new n02_0(this, n19);
        object12 = new up2_1((n02_0)object8);
        object8 = new p02_0(this, n19);
        object11 = new vp2_2((p02_0)object8);
        object8 = ((g53_0)object9).f((o60_0)object12, (o60_0)object11);
        this.b.b((yr0_2)object8);
    }

    public final void j(PayNowRequest payNowRequest, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, float f5, HashSet hashSet) {
        boolean bl2;
        boolean bl3;
        String string2;
        String string3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        boolean bl4;
        op2_2 op2_22 = this;
        Object object5 = payNowRequest;
        Object object6 = paymentInstruments;
        Object object7 = tenantResponse;
        Object object8 = hashSet;
        Object object9 = "query";
        Intrinsics.checkNotNullParameter(payNowRequest, (String)object9);
        Intrinsics.checkNotNullParameter(hashSet, "internalWalletSelectedViews");
        Object object10 = payNowRequest.getNetBanking();
        if (object10 != null) {
            object10 = ((NetBanking)object10).getCode();
        } else {
            bl4 = false;
            object10 = null;
        }
        if (object10 != null) {
            InternalWalletUtil.a.getClass();
            object10 = InternalWalletUtil.g((PaymentInstruments)object6, (HashSet)object8);
            Object object11 = new Bundle();
            Object object12 = op2_22.c;
            object4 = ((NewCustomEventsRevamp)object12).getPAYMENT_MODE();
            object11.putString((String)object4, "net banking");
            object3 = ((NewCustomEventsRevamp)object12).getEC_CHECKOUT_INTERACTIONS();
            object2 = "payment accordian select";
            object = "net banking";
            string3 = "payment_accordian_select";
            String string4 = "single page checkout";
            object4 = op2_22.d;
            string2 = op2_22.e;
            int n3 = 1536;
            Object object13 = object4;
            object4 = object12;
            object12 = "single page checkout";
            Bundle bundle = object11;
            object11 = object13;
            object13 = string2;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, (String)object2, (String)object, string3, string4, (String)object12, (String)object11, bundle, string2, false, null, n3, null);
            string2 = bundle;
            bundle.putAll((Bundle)object10);
            bl4 = dm0_0.b;
            if (bl4) {
                object3 = ((NewCustomEventsRevamp)object4).getEC_CHECKOUT_INTERACTIONS();
                object2 = "proceed to pay - retry";
                object = "net banking";
                string3 = "proceed_to_pay_retry";
                string4 = "single page checkout";
                object12 = "single page checkout";
                object11 = op2_22.d;
                object10 = op2_22.e;
                n3 = 1536;
                object13 = object10;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, (String)object2, (String)object, string3, string4, (String)object12, (String)object11, bundle, (String)object10, false, null, n3, null);
            } else {
                object3 = ((NewCustomEventsRevamp)object4).getEC_CHECKOUT_INTERACTIONS();
                object2 = "proceed to pay";
                object = "net banking";
                string3 = "proceed_to_pay";
                string4 = "single page checkout";
                object12 = "single page checkout";
                object11 = op2_22.d;
                object10 = op2_22.e;
                n3 = 1536;
                object13 = object10;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, (String)object2, (String)object, string3, string4, (String)object12, (String)object11, bundle, (String)object10, false, null, n3, null);
            }
        }
        object10 = op2_22.a;
        object10.getClass();
        Intrinsics.checkNotNullParameter(object5, (String)object9);
        object9 = UrlHelper.Companion.getInstance();
        int n4 = 0;
        string2 = null;
        object4 = new Object[]{};
        object2 = "pay_now";
        object9 = ((UrlHelper)object9).getApiUrl("payment", (String)object2, (Object[])object4);
        object4 = new HashMap();
        object3 = "";
        if (object7 == null || (object2 = tenantResponse.getDeviceChecksum()) == null) {
            object2 = object3;
        }
        object = "deviceChecksum";
        ((HashMap)object4).put(object, object2);
        if (object7 == null || (object2 = tenantResponse.getDeviceId()) == null) {
            object2 = object3;
        }
        object = "deviceId";
        ((HashMap)object4).put(object, object2);
        if (object7 == null || (object2 = tenantResponse.getAccessToken()) == null) {
            object2 = object3;
        }
        ((HashMap)object4).put("accessToken", object2);
        ((HashMap)object4).put("paymentChannelInformation.appType", "ANDROID");
        ((HashMap)object4).put("paymentChannelInformation.paymentChannel", "APP");
        object = "9.20.0";
        ((HashMap)object4).put("paymentChannelInformation.appVersion", object);
        object2 = payNowRequest.getCustomer();
        if (object2 != null) {
            object2 = payNowRequest.getCustomer();
            if (object2 == null || (object2 = ((Customer)object2).getEmail()) == null) {
                object2 = object3;
            }
            object = "customer.email";
            ((HashMap)object4).put(object, object2);
            object2 = payNowRequest.getCustomer();
            if (object2 == null || (object2 = ((Customer)object2).getMobile()) == null) {
                object2 = object3;
            }
            object = "customer.mobile";
            ((HashMap)object4).put(object, object2);
            object2 = payNowRequest.getCustomer();
            if (object2 == null || (object2 = ((Customer)object2).getUuid()) == null) {
                object2 = object3;
            }
            object = "customer.uuid";
            ((HashMap)object4).put(object, object2);
        }
        if ((object2 = payNowRequest.getOrder()) != null) {
            float f6;
            object2 = payNowRequest.getOrder();
            if (object2 != null && (object2 = ((Order)object2).getAmount()) != null) {
                f6 = ((Float)object2).floatValue();
            } else {
                f6 = 0.0f;
                object2 = null;
            }
            object2 = String.valueOf(f6);
            object = "order.amount";
            ((HashMap)object4).put(object, object2);
            object2 = payNowRequest.getOrder();
            if (object2 == null || (object2 = ((Order)object2).getOrderId()) == null) {
                object2 = object3;
            }
            object = "order.orderId";
            ((HashMap)object4).put(object, object2);
        }
        object2 = payNowRequest.getOnepTotalPrice();
        object = "0";
        if (object2 == null) {
            object2 = object;
        }
        string3 = "order.totalPrice1p";
        ((HashMap)object4).put(string3, object2);
        object2 = payNowRequest.getThreepTotalPrice();
        if (object2 != null) {
            object = object2;
        }
        ((HashMap)object4).put("order.totalPrice3p", object);
        object2 = payNowRequest.getOfferDetails();
        if (object2 != null) {
            object2 = object2.entrySet().iterator();
            while (bl3 = object2.hasNext()) {
                int n7;
                object = object2.next();
                string3 = (String)object.getKey();
                if ((object = (String)object.getValue()) == null || (n7 = ((String)object).length()) == 0) continue;
                ((HashMap)object4).put(string3, object);
            }
        }
        object = String.valueOf(f5);
        ((HashMap)object4).put("order.netPayableAmount", object);
        object2 = payNowRequest.getTenant();
        if (object2 == null || (object2 = ((Tenant)object2).getCode()) == null) {
            object2 = object3;
        }
        object = "tenant.code";
        ((HashMap)object4).put(object, object2);
        object2 = payNowRequest.getPaymentInstrument();
        if (object2 == null) {
            object2 = object3;
        }
        object = "paymentInstrument";
        ((HashMap)object4).put(object, object2);
        object2 = payNowRequest.getNetBanking();
        if (object2 == null || (object2 = ((NetBanking)object2).getCode()) == null) {
            object2 = object3;
        }
        object = "netBanking.code";
        ((HashMap)object4).put(object, object2);
        if (object7 != null) {
            object2 = tenantResponse.getTenantTransactionId();
            if (object2 == null) {
                object2 = object3;
            }
            object = "tenantTransactionId";
            ((HashMap)object4).put(object, object2);
            object2 = tenantResponse.getRequestChecksum();
            if (object2 == null) {
                object2 = object3;
            }
            object = "requestChecksum";
            ((HashMap)object4).put(object, object2);
            object2 = tenantResponse.getTransactionToken();
            if (object2 == null) {
                object2 = object3;
            }
            object = "transactionToken";
            ((HashMap)object4).put(object, object2);
            object2 = tenantResponse.getCartCheckSum();
            if (object2 == null) {
                object2 = object3;
            }
            object = "cartCheckSum";
            ((HashMap)object4).put(object, object2);
        } else {
            object2 = "TenantResponse is null";
            mz3_0.F((String)object2);
        }
        object2 = ((oo2_1)object10).c.b();
        if (object2 != null) {
            object = ((AffiliateData)object2).getUtmMedium();
        } else {
            bl3 = false;
            object = null;
        }
        string3 = "affiliate";
        bl3 = Intrinsics.areEqual(object, string3);
        if (bl3) {
            if (object2 == null || (object = ((AffiliateData)object2).getUtmSource()) == null) {
                object = object3;
            }
            string3 = "affiliateData.utmSource";
            ((HashMap)object4).put(string3, object);
            if (object2 == null || (object = ((AffiliateData)object2).getUtmMedium()) == null) {
                object = object3;
            }
            string3 = "affiliateData.utmMedium";
            ((HashMap)object4).put(string3, object);
            if (object2 == null || (object = ((AffiliateData)object2).getClickId()) == null) {
                object = object3;
            }
            string3 = "affiliateData.clickId";
            ((HashMap)object4).put(string3, object);
            if (object2 == null || (object = ((AffiliateData)object2).getOfferId()) == null) {
                object = object3;
            }
            string3 = "affiliateData.offerId";
            ((HashMap)object4).put(string3, object);
            if (object2 == null || (object = ((AffiliateData)object2).getReturnCancellationWindow()) == null) {
                object = object3;
            }
            string3 = "affiliateData.returnCancellationWindow";
            ((HashMap)object4).put(string3, object);
            if (object2 == null || (object = ((AffiliateData)object2).getUtmCampaign()) == null) {
                object = object3;
            }
            string3 = "affiliateData.utmCampaign";
            ((HashMap)object4).put(string3, object);
            if (object2 == null || (object = ((AffiliateData)object2).getAttributionWindow()) == null) {
                object = object3;
            }
            string3 = "affiliateData.attributionWindow";
            ((HashMap)object4).put(string3, object);
            if (object2 != null && (object2 = ((AffiliateData)object2).getAffiliateId()) != null) {
                object3 = object2;
            }
            object2 = "affiliateData.affiliateId";
            ((HashMap)object4).put(object2, object3);
            object5 = oo2_1.e(payNowRequest);
            object3 = "affiliateData.conversionId";
            ((HashMap)object4).put(object3, object5);
        }
        object4.toString();
        dm0_0.b = bl2 = true;
        if (object8 != null) {
            n4 = hashSet.size();
        }
        if (n4 > 0 && object7 != null) {
            oo2_0.a.getClass();
            object5 = oo2_0.i((PaymentInstruments)object6, (TenantResponse)object7, (HashSet)object8);
            ((HashMap)object4).putAll(object5);
        }
        InternalWalletUtil.a.getClass();
        object5 = InternalWalletUtil.a();
        bl2 = ((HashSet)object5).isEmpty();
        object5 = bl2 ? "false" : "true";
        ((HashMap)object4).put("notes[eligibleToEarnLoyalty]", object5);
        dm0_0.a = object4;
        object5 = ((oo2_1)object10).a.payNow((String)object9, "PAYMENT_PayNowByNetBanking", (Map)object4);
        object6 = qt2_2.c;
        object5 = ((g53_0)object5).h((Scheduler)object6);
        object6 = ti_2.a();
        object5 = ((g53_0)object5).e((Scheduler)object6);
        object6 = new l21_0(object10, 1);
        object7 = new do2_2((l21_0)object6);
        object6 = new s53_0((q63_0)object5, (bx0_2)object7);
        object5 = new Object();
        object7 = new u53_0((q63_0)object6, (bx0_2)object5);
        Intrinsics.checkNotNullExpressionValue(object7, "onErrorReturn(...)");
        object5 = new tp2_2(op2_22);
        int n8 = 1;
        object6 = new L02(n8, (Function1)object5);
        object5 = new rq_2(op2_22, n8);
        object8 = new sq_1(2, (Function1)object5);
        object5 = ((g53_0)object7).f((o60_0)object6, (o60_0)object8);
        op2_22.b.b((yr0_2)object5);
    }

    public final void k(PriceRequest priceRequest, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, hj_1 hj_12, HashSet hashSet) {
        Intrinsics.checkNotNullParameter(priceRequest, "priceRequest");
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        aW aW2 = md3_0.c(this);
        Op2$a op2$a = new Op2$a(this, paymentInstruments, tenantResponse, hashSet, priceRequest, hj_12, null);
        Ae3.d(aW2, null, null, op2$a, 3);
    }

    public final void l(TransactionStatusRequest object, TenantResponse object2) {
        Object object3 = "request";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.a;
        object4.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = UrlHelper.Companion.getInstance();
        Object object5 = new Object[]{};
        String string2 = "payment";
        String string3 = "transaction_get_status";
        object3 = ((UrlHelper)object3).getApiUrl(string2, string3, object5);
        object5 = object2 != null ? ((TenantResponse)object2).getTenant() : null;
        ((TransactionStatusRequest)object).setTenant((Tenant)object5);
        if (object2 != null) {
            object5 = ((TenantResponse)object2).getAccessToken();
            ((TransactionStatusRequest)object).setAccessToken((String)object5);
            object2 = ((TenantResponse)object2).getStatusGetChecksum();
            ((TransactionStatusRequest)object).setRequestChecksum((String)object2);
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
        object = ((oo2_1)object4).a.transactionGetStatusRequest((String)object3, (JsonObject)object, "PAYMENT_TransactionGetstatus");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new un2_2((oo2_1)object4);
        object3 = new xy1_0((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        object = new R7(this, 2);
        int n3 = 1;
        object2 = new xa_2(n3, (Function1)object);
        object = new T7(this, n3);
        object4 = new za_2(object, 2);
        object = ((g53_0)object3).f((o60_0)object2, (o60_0)object4);
        this.b.b((yr0_2)object);
    }

    public final void m(TransactionStatusRequest object, TenantResponse object2) {
        Object object3 = "request";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.a;
        object4.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = UrlHelper.Companion.getInstance();
        Object object5 = new Object[]{};
        String string2 = "payment";
        String string3 = "transaction_status";
        object3 = ((UrlHelper)object3).getApiUrl(string2, string3, object5);
        object5 = object2 != null ? ((TenantResponse)object2).getTenant() : null;
        ((TransactionStatusRequest)object).setTenant((Tenant)object5);
        if (object2 != null) {
            object5 = ((TenantResponse)object2).getAccessToken();
            ((TransactionStatusRequest)object).setAccessToken((String)object5);
            object2 = ((TenantResponse)object2).getStatusChecksum();
            ((TransactionStatusRequest)object).setRequestChecksum((String)object2);
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
        object = ((oo2_1)object4).a.transactionStatusRequest((String)object3, (JsonObject)object, "PAYMENT_TransactionStatus");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new fy0_2(object4, 2);
        object3 = new nA1((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        object = new rp2_2(this);
        object2 = new H02(object, 1);
        object = new sp2_2(this, 0);
        object4 = new J02(1, (Function1)object);
        object = ((g53_0)object3).f((o60_0)object2, (o60_0)object4);
        this.b.b((yr0_2)object);
    }

    public final void n(String object) {
        Intrinsics.checkNotNullParameter(object, "request");
        Object object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "query");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        String string2 = "payment";
        String string3 = "upi_redirect";
        object3 = ((UrlHelper)object3).getApiUrl(string2, string3, (Object[])object4);
        object4 = dm0_0.a;
        if (object4 == null) {
            object4 = new HashMap();
        }
        object4.put("paymentEngineTransactionId", object);
        object4.toString();
        object = ((oo2_1)object2).a.urlRedirect((String)object3, (Map)object4, "PAYMENT_UpiRedirect");
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new sn2_2((oo2_1)object2);
        object2 = new b6((sn2_2)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object2);
        object = new Object();
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        object = new fp2_2(this);
        object3 = new p02((Function1)object);
        object = new gp2_2(this);
        object4 = new hp2_1(object);
        object = ((g53_0)object2).f((o60_0)object3, (o60_0)object4);
        this.b.b((yr0_2)object);
    }

    public final void onCleared() {
        super.onCleared();
        this.b.d();
    }
}

