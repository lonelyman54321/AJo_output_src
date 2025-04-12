/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from zJ
 */
public final class zj_1
extends qg3_2
implements Function2 {
    public zj_1() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (zj_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zj_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return Unit.a;
    }
}

