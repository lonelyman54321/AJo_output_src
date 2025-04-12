/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class UO0$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public UO0$c(f80_0 f80_02, dr0_0 dr0_02) {
        this.a = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        object = new UO0$c(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (UO0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((UO0$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        object2 = md3_0.c((jD3)object);
        hr0_2 hr0_22 = new hr0_2(null, (dr0_0)object);
        Ae3.d((i90_0)object2, null, null, hr0_22, 3);
        return Unit.a;
    }
}

