/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class pP0$h
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public pP0$h(f80_0 f80_02, dr0_0 dr0_02) {
        this.a = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        object = new pP0$h(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pP0$h)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pP0$h)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.U();
        return Unit.a;
    }
}

