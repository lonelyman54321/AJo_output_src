/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Kj
 */
public final class kj_1
extends qg3_2
implements Function1 {
    public final /* synthetic */ Lj a;
    public final /* synthetic */ Object b;

    public kj_1(Lj lj, Object object, f80_0 f80_02) {
        this.a = lj;
        this.b = object;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Lj lj = this.a;
        Object object = this.b;
        kj_1 kj_12 = new kj_1(lj, object, f80_02);
        return kj_12;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (kj_1)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((kj_1)object).invokeSuspend(unit);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        Lj.b((Lj)object);
        object2 = this.b;
        object2 = Lj.a((Lj)object, object2);
        ((Lj)object).c.b.setValue(object2);
        ((Lj)object).e.setValue(object2);
        return Unit.a;
    }
}

