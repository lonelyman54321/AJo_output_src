/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from lB3
 */
public final class lb3_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ mb3_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ TenantResponse e;

    public lb3_1(mb3_0 mb3_02, String string2, String string3, TenantResponse tenantResponse, f80_0 f80_02) {
        this.b = mb3_02;
        this.c = string2;
        this.d = string3;
        this.e = tenantResponse;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        TenantResponse tenantResponse = this.e;
        mb3_0 mb3_02 = this.b;
        String string3 = this.c;
        object = new lb3_1(mb3_02, string3, string2, tenantResponse, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lb3_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lb3_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            Object object2;
            mb3_0 mb3_02;
            int n3;
            at0_1 at0_12;
            j90_0 j90_02;
            block7: {
                int n4;
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            at0_12 = null;
                            n3 = 2;
                            n4 = 1;
                            mb3_02 = this.b;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                object = mb3_02.a;
                this.a = n4;
                object.getClass();
                object2 = UrlHelper.Companion.getInstance();
                n4 = 0;
                Object object3 = new Object[]{};
                object2 = ((UrlHelper)object2).getApiUrl("payment", "validate_otp", (Object[])object3);
                object3 = new JsonObject();
                Object object4 = ((oo2_1)object).g().getSecureAccessToken();
                ((JsonObject)object3).addProperty("accessToken", (String)object4);
                object4 = ((oo2_1)object).g().getCustomerUUID();
                ((JsonObject)object3).addProperty("cuuid", (String)object4);
                Object object5 = this.d;
                ((JsonObject)object3).addProperty("mobileNumber", (String)object5);
                object5 = this.c;
                ((JsonObject)object3).addProperty("otp", (String)object5);
                object4 = this.e;
                object5 = object4 != null ? ((TenantResponse)object4).getTenant() : null;
                object5 = oo2_1.f((Tenant)object5);
                String string2 = "tenant";
                ((JsonObject)object3).add(string2, (JsonElement)object5);
                object5 = object4 != null ? ((TenantResponse)object4).getTenantTransactionId() : null;
                string2 = "tenantTransactionId";
                ((JsonObject)object3).addProperty(string2, (String)object5);
                object4 = object4 != null && (object4 = ((TenantResponse)object4).getOrder()) != null ? ((Order)object4).getOrderId() : null;
                object5 = "orderId";
                ((JsonObject)object3).addProperty((String)object5, (String)object4);
                object4 = ((oo2_1)object).c.a();
                if (object4 == null) {
                    object4 = "";
                }
                ((JsonObject)object3).addProperty("deviceFingerprint", (String)object4);
                object4 = new JsonObject();
                ((JsonObject)object4).addProperty("paymentChannel", "APP");
                string2 = "ANDROID";
                ((JsonObject)object4).addProperty("appType", string2);
                object5 = "paymentChannelInformation";
                ((JsonObject)object3).add((String)object5, (JsonElement)object4);
                object4 = new yo2_1((oo2_1)object, (String)object2, (JsonObject)object3, null);
                object = new br2_2((Function2)object4);
                object2 = ir0_2.a;
                object2 = em0_2.b;
                object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
                object2 = new xo2((es0_2)object);
                object = ir0_2.a;
                object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (es0_2)object;
            object2 = new lB3$a(mb3_02, null);
            at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = new lB3$b(mb3_02);
            this.a = n3;
            object = at0_12.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

