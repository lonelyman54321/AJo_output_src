/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

public final class Ob0$d
extends a
implements c90_0 {
    public final /* synthetic */ ob0_1 a;

    public Ob0$d(ob0_1 ob0_12) {
        C90$a c90$a = C90$a.a;
        this.a = ob0_12;
        super(c90$a);
    }

    public final void handleException(CoroutineContext object, Throwable object2) {
        object = this.a;
        object.getClass();
        aW aW2 = md3_0.c((jD3)object);
        qb0_2 qb0_22 = new qb0_2((ob0_1)object, (Throwable)object2, null);
        int n3 = 3;
        Ae3.d(aW2, null, null, qb0_22, n3);
        object2 = ((Throwable)object2).getMessage();
        if (object2 == null) {
            object2 = "Throwable message is null";
        }
        ((ob0_1)object).r(500, "couponBonanza_getCouponInfo", (String)object2);
    }
}

