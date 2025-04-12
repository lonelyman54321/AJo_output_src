/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from iv0
 */
public final class iv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;

    public iv0_2(ov0_0 ov0_02, f80_0 f80_02) {
        this.a = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.a;
        object = new iv0_2(ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (iv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((iv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        object2 = md3_0.c((jD3)object);
        hv0_1 hv0_12 = new hv0_1((ov0_0)object, null);
        Ae3.d((i90_0)object2, null, null, hv0_12, 3);
        return Unit.a;
    }
}

