/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.affise.attribution.events.parameters.PredefinedCustom;
import com.affise.attribution.events.predefined.OrderEvent;
import com.google.gson.JsonObject;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.PaymentApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oo2
 */
public final class oo2_1 {
    public static final oo2$a Companion;
    public final PaymentApi a;
    public final hh3_2 b;
    public final jo_2 c;
    public final hh3_2 d;

    static {
        oo2$a oo2$a;
        Companion = oo2$a = new Object();
    }

    public oo2_1(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = AjioApiConnector.INSTANCE.getPaymentApi();
        this.a = object2;
        object2 = new co2_2((Context)object);
        this.b = object2 = yr1_2.b((Function0)object2);
        this.c = object2 = new jo_2((Context)object);
        object = yr1_2.b((Function0)object);
        this.d = object;
    }

    public static final void b(oo2_1 object, PriceRequest object2) {
        object.getClass();
        Object object3 = ((PriceRequest)object2).getCustomer();
        if (object3 == null) {
            String string2 = ((oo2_1)object).g().getUserName();
            String string3 = ((oo2_1)object).g().getCustomerUUID();
            String string4 = ((oo2_1)object).g().getUserEmailId();
            object = ((oo2_1)object).g();
            String string5 = ((UserInformation)object).getUserPhoneNumber();
            String string6 = "";
            String string7 = "";
            String string8 = "";
            object3 = new Customer(string2, string3, string7, string8, string6, string4, string5);
            ((PriceRequest)object2).setCustomer((Customer)object3);
        } else {
            object3 = ((PriceRequest)object2).getCustomer();
            object3 = object3 != null ? ((Customer)object3).getUuid() : null;
            if (object3 == null && (object2 = ((PriceRequest)object2).getCustomer()) != null) {
                object = ((oo2_1)object).g().getCustomerUUID();
                ((Customer)object2).setUuid((String)object);
            }
        }
    }

    public static es0_2 d(oo2_1 oo2_12, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, ArrayList arrayList, boolean bl2, boolean bl3, int n3) {
        Object object;
        int n4 = n3 & 8;
        boolean bl4 = false;
        wm0_2 wm0_22 = null;
        boolean bl5 = n4 != 0 ? false : bl2;
        n4 = n3 & 0x10;
        if (n4 == 0) {
            bl4 = bl3;
        }
        oo2_12.getClass();
        Intrinsics.checkNotNullParameter(paymentInstruments, "paymentInstruments");
        Intrinsics.checkNotNullParameter(arrayList, "internalWalletsNeeded");
        Object object2 = object;
        Object object3 = tenantResponse;
        object = new so2_2(bl5, oo2_12, tenantResponse, paymentInstruments, arrayList, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object3 = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object = new ro2_2((es0_2)object3, paymentInstruments, tenantResponse, bl4, arrayList);
        wm0_22 = ir0_2.a;
        return ms0_1.m((es0_2)object, wm0_22);
    }

    public static String e(PayNowRequest object) {
        boolean bl2;
        OrderEvent orderEvent;
        p5_0.a.getClass();
        Object object2 = p5_0.d;
        object = ((PayNowRequest)object).getOrder();
        String string2 = "";
        if (object == null || (object = ((Order)object).getOrderId()) == null) {
            object = string2;
        }
        int n3 = 0;
        Object object3 = null;
        long l2 = 0L;
        int n4 = 3;
        Object object4 = orderEvent;
        orderEvent = new OrderEvent(null, l2, n4, null);
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            object4 = (String)object2.next();
            n3 = string2.length();
            if (n3 > 0) {
                object3 = ", ";
                string2 = string2.concat((String)object3);
            }
            object3 = orderEvent.customPredefined();
            object4 = ((PredefinedCustom)object3).conversionId((String)object, (String)object4);
            string2 = Ft2.a(string2, (String)object4);
        }
        p5_0.a.getClass();
        Intrinsics.checkNotNullParameter(string2, "cId");
        p5_0.e = string2;
        return string2;
    }

    public static JsonObject f(Tenant tenant) {
        JsonObject jsonObject = new JsonObject();
        String string2 = null;
        String string3 = tenant != null ? tenant.getCallbackUrl() : null;
        String string4 = "callbackUrl";
        jsonObject.addProperty(string4, string3);
        string3 = tenant != null ? tenant.getCode() : null;
        string4 = "code";
        jsonObject.addProperty(string4, string3);
        string3 = tenant != null ? tenant.getDescription() : null;
        string4 = "description";
        jsonObject.addProperty(string4, string3);
        string3 = tenant != null ? tenant.getImageURL() : null;
        string4 = "imageURL";
        jsonObject.addProperty(string4, string3);
        string3 = tenant != null ? tenant.getName() : null;
        string4 = "name";
        jsonObject.addProperty(string4, string3);
        if (tenant != null) {
            string2 = tenant.getS2sCallbackUrl();
        }
        jsonObject.addProperty("s2sCallbackUrl", string2);
        return jsonObject;
    }

    public static void h(int n3, String string2, String string3) {
        ServiceErrorEventTracker serviceErrorEventTracker = ServiceErrorEventTracker.INSTANCE;
        CharSequence charSequence = new StringBuilder("ApplicationError: statusCode:");
        charSequence.append(n3);
        charSequence.append(" ");
        charSequence.append(string3);
        String string4 = charSequence.toString();
        Boolean bl2 = Boolean.TRUE;
        charSequence = string2;
        serviceErrorEventTracker.trackPaymentServiceErrorEvents(string2, string3, string4, n3, bl2, "single page checkout", "Forward");
    }

    public final u53_0 a(String object, Error object2, TenantResponse object3, float f5) {
        String string2;
        String string3 = "reason";
        Intrinsics.checkNotNullParameter(object, string3);
        Object object4 = UrlHelper.Companion.getInstance();
        Object object5 = new Object[]{};
        Object object6 = "transaction_abort";
        object4 = ((UrlHelper)object4).getApiUrl("payment", (String)object6, (Object[])object5);
        object5 = dm0_0.a;
        Object object7 = "";
        if (object5 == null) {
            String string4;
            object6 = "ANDROID";
            object5 = p3.a("paymentChannelInformation.appType", (String)object6);
            if (object3 == null || (object6 = ((TenantResponse)object3).getAccessToken()) == null) {
                object6 = object7;
            }
            String string5 = "accessToken";
            ((HashMap)object5).put(string5, object6);
            if (object3 != null && (object6 = ((TenantResponse)object3).getCustomer()) != null) {
                string5 = ((Customer)object6).getEmail();
                if (string5 == null) {
                    string5 = object7;
                }
                string4 = "customer.email";
                ((HashMap)object5).put(string4, string5);
                string5 = ((Customer)object6).getMobile();
                if (string5 == null) {
                    string5 = object7;
                }
                string4 = "customer.mobile";
                ((HashMap)object5).put(string4, string5);
                object6 = ((Customer)object6).getUuid();
                if (object6 == null) {
                    object6 = object7;
                }
                string5 = "customer.uuid";
                ((HashMap)object5).put(string5, object6);
            }
            if (object3 != null && (object6 = ((TenantResponse)object3).getOrder()) != null) {
                string5 = String.valueOf(((Order)object6).getAmount());
                string4 = "order.amount";
                ((HashMap)object5).put(string4, string5);
                object6 = ((Order)object6).getOrderId();
                if (object6 == null) {
                    object6 = object7;
                }
                string5 = "order.orderId";
                ((HashMap)object5).put(string5, object6);
            }
            ((HashMap)object5).put("paymentChannelInformation.paymentChannel", "APP");
            object6 = "paymentChannelInformation.appVersion";
            string5 = "9.20.0";
            ((HashMap)object5).put(object6, string5);
            if (object3 != null) {
                object6 = ((TenantResponse)object3).getTenant();
                if (object6 != null) {
                    object6 = ((TenantResponse)object3).getTenant();
                    if (object6 == null || (object6 = ((Tenant)object6).getCode()) == null) {
                        object6 = object7;
                    }
                    string5 = "tenant.code";
                    ((HashMap)object5).put(string5, object6);
                }
                if ((object6 = ((TenantResponse)object3).getTenantTransactionId()) == null) {
                    object6 = object7;
                }
                string5 = "tenantTransactionId";
                ((HashMap)object5).put(string5, object6);
                object6 = ((TenantResponse)object3).getRequestChecksum();
                if (object6 == null) {
                    object6 = object7;
                }
                string5 = "requestChecksum";
                ((HashMap)object5).put(string5, object6);
                object6 = ((TenantResponse)object3).getTransactionToken();
                if (object6 == null) {
                    object6 = object7;
                }
                string5 = "transactionToken";
                ((HashMap)object5).put(string5, object6);
                object3 = ((TenantResponse)object3).getCartCheckSum();
                if (object3 == null) {
                    object3 = object7;
                }
                object6 = "cartCheckSum";
                ((HashMap)object5).put(object6, object3);
            }
            object3 = "order.netPayableAmount";
            string2 = String.valueOf(f5);
            ((HashMap)object5).put(object3, string2);
        }
        object3 = object5;
        object3 = (Map)object5;
        object3.put(string3, object);
        if (object2 != null) {
            object = ((Error)object2).getCode();
            if (object == null) {
                object = object7;
            }
            string2 = "error.code";
            object3.put(string2, object);
            object = ((Error)object2).getDescription();
            if (object == null) {
                object = object7;
            }
            string2 = "error.description";
            object3.put(string2, object);
            object = ((Error)object2).getSubReason();
            if (object != null) {
                object7 = object;
            }
            object = "error.subReason";
            object3.put(object, object7);
        }
        object5.toString();
        object = this.a.abortTransaction((String)object4, (Map)object3, "PAYMENT_AbortTransaction");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new bf1_0(this, 2);
        object3 = new ta2_0(1, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final es0_2 c(PaymentInstruments object, TenantResponse tenantResponse, HashSet hashSet, PriceRequest object2) {
        synchronized (this) {
            oo2$c oo2$c;
            Object object3 = oo2$c;
            Object object4 = object;
            oo2$c = new oo2$c((PriceRequest)object2, (PaymentInstruments)object, hashSet, tenantResponse, this, null);
            object2 = new br2_2(oo2$c);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object4 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object2 = new oo2$b((es0_2)object4, this, (PaymentInstruments)object, hashSet, tenantResponse);
            object = ir0_2.a;
            return ms0_1.m((es0_2)object2, (CoroutineContext)object);
        }
    }

    public final UserInformation g() {
        return (UserInformation)this.b.getValue();
    }
}

