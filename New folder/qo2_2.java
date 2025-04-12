/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qo2
 */
public final class qo2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PriceRequest c;
    public final /* synthetic */ TenantResponse d;
    public final /* synthetic */ Float e;
    public final /* synthetic */ oo2_1 f;

    public qo2_2(PriceRequest priceRequest, TenantResponse tenantResponse, Float f5, oo2_1 oo2_12, f80_0 f80_02) {
        this.c = priceRequest;
        this.d = tenantResponse;
        this.e = f5;
        this.f = oo2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Float f5 = this.e;
        oo2_1 oo2_12 = this.f;
        PriceRequest priceRequest = this.c;
        TenantResponse tenantResponse = this.d;
        qo2_2 qo2_22 = new qo2_2(priceRequest, tenantResponse, f5, oo2_12, f80_02);
        qo2_22.b = object;
        return qo2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (qo2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qo2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            Object object2;
            Object object3;
            int n3;
            j90_0 j90_02;
            qo2_2 qo2_22;
            block11: {
                Object object4;
                int n4;
                block7: {
                    block8: {
                        block9: {
                            qo2_22 = this;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 1;
                            n3 = 2;
                            if (n7 == 0) break block7;
                            if (n7 == n4) break block8;
                            if (n7 != n3) break block9;
                            vl2_2.b(object);
                            break block10;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw illegalStateException;
                    }
                    object3 = (fs0_2)this.b;
                    vl2_2.b(object);
                    object2 = object3;
                    object3 = object;
                    break block11;
                }
                vl2_2.b(object);
                object2 = object3 = this.b;
                object2 = (fs0_2)object3;
                object3 = UrlHelper.Companion.getInstance();
                Object object5 = new Object[]{};
                Object object6 = "payment";
                Object object7 = "fetch_emi_plans";
                object5 = ((UrlHelper)object3).getApiUrl((String)object6, (String)object7, object5);
                object3 = this.c;
                if (object3 == null) {
                    object4 = object3;
                    int n8 = 1048575;
                    object3 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                }
                ((PriceRequest)object3).setAmount(null);
                object6 = qo2_22.d;
                object7 = object6 != null ? ((TenantResponse)object6).getOrder() : null;
                Object object8 = qo2_22.e;
                if (object7 != null) {
                    ((Order)object7).setNetPayableAmount((Float)object8);
                }
                no2_0.e = object8;
                ((PriceRequest)object3).setOrder((Order)object7);
                object7 = object6 != null ? ((TenantResponse)object6).getPaymentChannelInformation() : null;
                ((PriceRequest)object3).setPaymentChannelInformation((PaymentChannelInformation)object7);
                object7 = object6 != null ? ((TenantResponse)object6).getTenant() : null;
                ((PriceRequest)object3).setTenant((Tenant)object7);
                if (object6 != null) {
                    object7 = ((TenantResponse)object6).getAccessToken();
                    ((PriceRequest)object3).setAccessToken((String)object7);
                    object6 = ((TenantResponse)object6).getTenantTransactionId();
                    ((PriceRequest)object3).setTenantTransactionId((String)object6);
                } else {
                    object6 = "TenantResponse is null";
                    mz3_0.F((String)object6);
                }
                object6 = qo2_22.f;
                oo2_1.b((oo2_1)object6, (PriceRequest)object3);
                object3 = JsonUtils.toJson(object3);
                object7 = JsonObject.class;
                object3 = (JsonObject)JsonUtils.fromJson((String)object3, object7);
                if (object3 == null) {
                    object3 = new JsonObject();
                }
                object7 = object3;
                object3 = ((oo2_1)object6).g();
                Intrinsics.checkNotNullExpressionValue(object3, "access$getUserInformation(...)");
                object3 = ServiceUtil.getToken((UserInformation)object3);
                object8 = kp1_0.c("Bearer ", (String)object3);
                qo2_22.b = object2;
                qo2_22.a = n4;
                object4 = "FetchEmiPlansApi";
                object3 = ((oo2_1)object6).a;
                Object object9 = object5;
                object5 = object7;
                object6 = object4;
                object7 = object8;
                object8 = this;
                object3 = object3.fetchEmiPlans((String)object9, (JsonObject)object5, (String)object4, (String)object7, this);
                if (object3 == j90_02) {
                    return j90_02;
                }
            }
            qo2_22.b = null;
            qo2_22.a = n3;
            object3 = object2.emit(object3, qo2_22);
            if (object3 == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

