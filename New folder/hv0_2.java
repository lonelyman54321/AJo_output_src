/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hv0
 */
public final class hv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;

    public hv0_2(ov0_0 ov0_02, f80_0 f80_02) {
        this.a = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.a;
        object = new hv0_2(ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        object = md3_0.c((jD3)object);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        int n3 = 2;
        mv0_2 mv0_22 = new qg3_2(n3, null);
        Ae3.d((i90_0)object, (CoroutineContext)object2, null, mv0_22, n3);
        return Unit.a;
    }
}

