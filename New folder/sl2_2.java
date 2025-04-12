/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from SL2
 */
public final class sl2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ pl2_1 a;

    public sl2_2(pl2_1 pl2_12, f80_0 f80_02) {
        this.a = pl2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pl2_1 pl2_12 = this.a;
        object = new sl2_2(pl2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (sl2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sl2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        pl2_1.Pa(this.a).e("dress tool style selection halfcard screen");
        return Unit.a;
    }
}

