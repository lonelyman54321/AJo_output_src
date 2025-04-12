/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vv0
 */
public final class vv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ tv0_2 a;

    public vv0_2(tv0_2 tv0_22, f80_0 f80_02) {
        this.a = tv0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tv0_2 tv0_22 = this.a;
        object = new vv0_2(tv0_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.Pa();
        object.getClass();
        object2 = md3_0.c((jD3)object);
        gv0_2 gv0_22 = new gv0_2((ov0_0)object, null);
        Ae3.d((i90_0)object2, null, null, gv0_22, 3);
        return Unit.a;
    }
}

