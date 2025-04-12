/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class oo2$c
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PriceRequest c;
    public final /* synthetic */ PaymentInstruments d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ TenantResponse f;
    public final /* synthetic */ oo2_1 g;

    public oo2$c(PriceRequest priceRequest, PaymentInstruments paymentInstruments, HashSet hashSet, TenantResponse tenantResponse, oo2_1 oo2_12, f80_0 f80_02) {
        this.c = priceRequest;
        this.d = paymentInstruments;
        this.e = hashSet;
        this.f = tenantResponse;
        this.g = oo2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        TenantResponse tenantResponse = this.f;
        oo2_1 oo2_12 = this.g;
        PriceRequest priceRequest = this.c;
        PaymentInstruments paymentInstruments = this.d;
        HashSet hashSet = this.e;
        oo2$c oo2$c = new oo2$c(priceRequest, paymentInstruments, hashSet, tenantResponse, oo2_12, f80_02);
        oo2$c.b = object;
        return oo2$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (oo2$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oo2$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block23: {
            Object object2;
            Object object3;
            int n3;
            Object object4;
            oo2$c oo2$c;
            block24: {
                float f5;
                Object object5;
                boolean bl2;
                int n4;
                block20: {
                    block21: {
                        block22: {
                            oo2$c = this;
                            object4 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 1;
                            n3 = 2;
                            if (n7 == 0) break block20;
                            if (n7 == n4) break block21;
                            if (n7 != n3) break block22;
                            vl2_2.b(object);
                            break block23;
                        }
                        object4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object4;
                    }
                    object3 = (fs0_2)this.b;
                    vl2_2.b(object);
                    object2 = object;
                    break block24;
                }
                vl2_2.b(object);
                object3 = (fs0_2)this.b;
                Object object6 = UrlHelper.Companion.getInstance();
                Object object7 = null;
                Object object8 = new Object[]{};
                Object object9 = "payment";
                Object object10 = "calculate_price";
                object6 = ((UrlHelper)object6).getApiUrl((String)object9, (String)object10, (Object[])object8);
                object8 = this.c;
                if (object8 == null) {
                    object9 = object8;
                    bl2 = false;
                    object10 = null;
                    object5 = null;
                    int n8 = 1048575;
                    object8 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                }
                oo2_0.a.getClass();
                object10 = oo2$c.d;
                object9 = oo2_0.c("INTERNAL_WALLET", (PaymentInstruments)object10);
                if (object9 != null) {
                    object10 = ((PaymentInstrumentType)object9).getPaymentInstrumentsInfo();
                } else {
                    bl2 = false;
                    object10 = null;
                }
                object5 = oo2$c.f;
                if (object10 != null && !(bl2 = object10.isEmpty())) {
                    object10 = oo2$c.e;
                    bl2 = ((ArrayList)(object9 = oo2_0.g((PaymentInstrumentType)object9, (HashSet)object10, (TenantResponse)object5))).isEmpty();
                    if (bl2) {
                        object9 = new ArrayList();
                        ((PriceRequest)object8).setInternalWallets((List)object9);
                    } else {
                        ((PriceRequest)object8).setInternalWallets((List)object9);
                    }
                } else {
                    object9 = new ArrayList();
                    ((PriceRequest)object8).setInternalWallets((List)object9);
                }
                if (object5 != null) {
                    object9 = ((TenantResponse)object5).getOrder();
                } else {
                    object9 = null;
                    f5 = 0.0f;
                }
                ((PriceRequest)object8).setOrder((Order)object9);
                if (object5 != null) {
                    object9 = ((TenantResponse)object5).getPaymentChannelInformation();
                } else {
                    object9 = null;
                    f5 = 0.0f;
                }
                ((PriceRequest)object8).setPaymentChannelInformation((PaymentChannelInformation)object9);
                if (object5 != null) {
                    object9 = ((TenantResponse)object5).getTenant();
                } else {
                    object9 = null;
                    f5 = 0.0f;
                }
                ((PriceRequest)object8).setTenant((Tenant)object9);
                if (object5 != null) {
                    object9 = ((TenantResponse)object5).getAccessToken();
                    ((PriceRequest)object8).setAccessToken((String)object9);
                } else {
                    object9 = "TenantResponse is null";
                    mz3_0.F((String)object9);
                }
                if (object5 != null && (object9 = ((TenantResponse)object5).getOrder()) != null && (object9 = ((Order)object9).getAmount()) != null) {
                    f5 = ((Float)object9).floatValue();
                } else {
                    f5 = 0.0f;
                    object9 = null;
                }
                object10 = new Float(f5);
                ((PriceRequest)object8).setAmount((Float)object10);
                object9 = oo2$c.g;
                oo2_1.b((oo2_1)object9, (PriceRequest)object8);
                object8 = JsonUtils.toJson(object8);
                object10 = JsonObject.class;
                object8 = (JsonObject)JsonUtils.fromJson((String)object8, object10);
                if (object8 == null) {
                    object8 = new JsonObject();
                }
                object10 = yn3_0.a;
                object5 = "paymentDebug: before calculate price";
                object7 = new Object[]{};
                ((yn3$a)object10).a((String)object5, (Object[])object7);
                oo2$c.b = object3;
                oo2$c.a = n4;
                object7 = ((oo2_1)object9).a;
                object2 = object7.calculatePrice((String)object6, (JsonObject)object8, "PAYMENT_PriceCalculation", oo2$c);
                if (object2 == object4) {
                    return object4;
                }
            }
            oo2$c.b = null;
            oo2$c.a = n3;
            object3 = object3.emit(object2, oo2$c);
            if (object3 == object4) {
                return object4;
            }
        }
        return Unit.a;
    }
}

