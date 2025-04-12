/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from YH0
 */
public final class yh0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ ib3_0 b;

    public yh0_2(pa_0 pa_02, ib3_0 ib3_02, f80_0 f80_02) {
        this.a = pa_02;
        this.b = ib3_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ib3_0 ib3_02 = this.b;
        pa_0 pa_02 = (pa_0)this.a;
        object = new yh0_2(pa_02, ib3_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yh0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yh0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = ((tr1_0)this.b.getValue()).getValue();
        this.a.invoke(object);
        return Unit.a;
    }
}

