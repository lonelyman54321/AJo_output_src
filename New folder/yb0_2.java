/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/*
 * Renamed from Yb0
 */
public final class yb0_2
extends a
implements c90_0 {
    public final /* synthetic */ ob0_1 a;

    public yb0_2(ob0_1 ob0_12) {
        C90$a c90$a = C90$a.a;
        this.a = ob0_12;
        super(c90$a);
    }

    public final void handleException(CoroutineContext object, Throwable object2) {
        object = this.a;
        object.getClass();
        aW aW2 = md3_0.c((jD3)object);
        qg3_2 qg3_22 = new ub0_2((ob0_1)object, (Throwable)object2, null);
        int n3 = 3;
        Ae3.d(aW2, null, null, qg3_22, n3);
        aW2 = md3_0.c((jD3)object);
        qg3_22 = new sb0_2((ob0_1)object, null);
        Ae3.d(aW2, null, null, qg3_22, n3);
        object2 = ((Throwable)object2).getMessage();
        if (object2 == null) {
            object2 = "Throwable message is null";
        }
        ((ob0_1)object).r(500, "couponBonanza_purchaseCoupons", (String)object2);
    }
}

