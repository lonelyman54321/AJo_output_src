/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from uo2
 */
public final class uo2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ oo2_1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public uo2_2(String string2, oo2_1 oo2_12, String string3, f80_0 f80_02) {
        this.c = string2;
        this.d = oo2_12;
        this.e = string3;
        this.f = "PAYMENT_GetPaymentInstruments";
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        oo2_1 oo2_12 = this.d;
        String string3 = this.e;
        uo2_2 uo2_22 = new uo2_2(string2, oo2_12, string3, f80_02);
        uo2_22.b = object;
        return uo2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (uo2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((uo2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block17: {
            String string2;
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block18: {
                Object object3;
                Object object4;
                block14: {
                    block15: {
                        block16: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block14;
                            if (n7 == n3) break block15;
                            if (n7 != n4) break block16;
                            vl2_2.b(object);
                            break block17;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block18;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                object2 = (fs0_2)object;
                object = this.c;
                Object object5 = JsonObject.class;
                object = (JsonObject)JsonUtils.fromJson((String)object, object5);
                if (object == null) {
                    object = new JsonObject();
                } else {
                    object5 = "order";
                    boolean bl2 = ((JsonObject)object).has((String)object5);
                    if (bl2) {
                        object5 = ((JsonObject)object).getAsJsonObject((String)object5);
                        object4 = no2_0.a;
                        ((JsonObject)object5).addProperty("1pTotalPrice", (String)object4);
                        object4 = no2_0.b;
                        object3 = "3pTotalPrice";
                        ((JsonObject)object5).addProperty((String)object3, (String)object4);
                    }
                }
                object5 = new JsonObject();
                object4 = "SEND_WALLETS_IN_DISPLAY_PRIORITY";
                object3 = Boolean.TRUE;
                ((JsonObject)object5).addProperty((String)object4, (Boolean)object3);
                object4 = "notes";
                try {
                    ((JsonObject)object).add((String)object4, (JsonElement)object5);
                }
                catch (Exception exception) {
                    object4 = yn3_0.a;
                    ((yn3$a)object4).e(exception);
                }
                object5 = h40_0.a;
                object5 = z40_0.Companion;
                object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a;
                boolean bl3 = ((ao0_0)object5).a("emi_enabled");
                object4 = "showEmiInstruments";
                object5 = bl3;
                try {
                    ((JsonObject)object).addProperty((String)object4, (Boolean)object5);
                }
                catch (Exception exception) {
                    object4 = yn3_0.a;
                    ((yn3$a)object4).e(exception);
                }
                object5 = this.d.a;
                this.b = object2;
                this.a = n3;
                string2 = this.e;
                object4 = this.f;
                object = object5.getPaymentInstruments(string2, (String)object4, (JsonObject)object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            string2 = null;
            this.b = null;
            this.a = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

