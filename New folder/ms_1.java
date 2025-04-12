/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ms
 */
public final class ms_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ tr1_0 b;

    public ms_1(ft1_2 ft1_22, tr1_0 tr1_02, f80_0 f80_02) {
        this.a = ft1_22;
        this.b = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.a;
        tr1_0 tr1_02 = this.b;
        object = new ms_1(ft1_22, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ms_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ms_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.a.b();
        this.b.setValue(object);
        return Unit.a;
    }
}

