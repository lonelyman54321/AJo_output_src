/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from e02
 */
public final class e02_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ qz1_2 b;

    public e02_0(f80_0 f80_02, qz1_2 qz1_22, String string2) {
        this.a = string2;
        this.b = qz1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        qz1_2 qz1_22 = this.b;
        object = new e02_0(f80_02, qz1_22, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e02_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e02_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        block2: {
            void var2_4;
            block3: {
                block0: {
                    block1: {
                        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                        vl2_2.b(object);
                        object = this.a;
                        int n3 = ((String)object).hashCode();
                        int n4 = -1872451388;
                        if (n3 == n4) break block0;
                        n4 = 74702359;
                        if (n3 == n4) break block1;
                        n4 = 1440752412;
                        if (n3 != n4) break block2;
                        String string2 = "WILL_BE_INITIATED";
                        break block3;
                    }
                    String string3 = "REFUNDED";
                    break block3;
                }
                String string4 = "REFUND_INITIATED";
            }
            ((String)object).equals(var2_4);
        }
        NewCustomEventsRevamp newCustomEventsRevamp = this.b.M;
        String string5 = this.a;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "order item details interaction", "priority delivery breech", string5, "order_item_details_interaction", "Order item Details Screen", null, null, null, "", false, null, 1760, null);
        return Unit.a;
    }
}

