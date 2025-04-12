/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from kB3
 */
public final class kb3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ mb3_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Tenant d;

    public kb3_0(mb3_0 mb3_02, String string2, Tenant tenant, f80_0 f80_02) {
        this.b = mb3_02;
        this.c = string2;
        this.d = tenant;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        Tenant tenant = this.d;
        mb3_0 mb3_02 = this.b;
        object = new kb3_0(mb3_02, string2, tenant, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kb3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kb3_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            mb3_0 mb3_02;
            int n3;
            at0_1 at0_12;
            j90_0 j90_02;
            block6: {
                int n4;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            at0_12 = null;
                            n3 = 2;
                            n4 = 1;
                            mb3_02 = this.b;
                            if (n7 == 0) break block2;
                            if (n7 == n4) break block3;
                            if (n7 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = mb3_02.a;
                this.a = n4;
                object.getClass();
                object2 = UrlHelper.Companion.getInstance();
                n4 = 0;
                Object object3 = new Object[]{};
                object2 = ((UrlHelper)object2).getApiUrl("payment", "send_otp", (Object[])object3);
                object3 = new JsonObject();
                Object object4 = ((oo2_1)object).g().getSecureAccessToken();
                ((JsonObject)object3).addProperty("accessToken", (String)object4);
                object4 = ((oo2_1)object).g().getCustomerUUID();
                ((JsonObject)object3).addProperty("cuuid", (String)object4);
                String string2 = this.c;
                ((JsonObject)object3).addProperty("mobileNumber", string2);
                object4 = oo2_1.f(this.d);
                string2 = "tenant";
                ((JsonObject)object3).add(string2, (JsonElement)object4);
                object4 = new wo2_2((oo2_1)object, (String)object2, (JsonObject)object3, null);
                object = new br2_2((Function2)object4);
                object2 = ir0_2.a;
                object2 = em0_2.b;
                object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
                object2 = new vo2_2((es0_2)object);
                object = ir0_2.a;
                object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (es0_2)object;
            object2 = new kB3$a(mb3_02, null);
            at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = new kB3$b(mb3_02);
            this.a = n3;
            object = at0_12.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

