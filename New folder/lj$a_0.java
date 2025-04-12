/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Lj$a
 */
public final class lj$a_0
extends qg3_2
implements Function1 {
    public final /* synthetic */ Lj a;

    public lj$a_0(Lj lj, f80_0 f80_02) {
        this.a = lj;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Lj lj = this.a;
        lj$a_0 lj$a_0 = new lj$a_0(lj, f80_02);
        return lj$a_0;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (lj$a_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((lj$a_0)object).invokeSuspend(unit);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        Lj.b(this.a);
        return Unit.a;
    }
}

