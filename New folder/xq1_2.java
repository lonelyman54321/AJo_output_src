/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from XQ1
 */
public final class xq1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ar1_0 a;

    public xq1_2(ar1_0 ar1_02, f80_0 f80_02) {
        this.a = ar1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ar1_0 ar1_02 = this.a;
        object = new xq1_2(ar1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (xq1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xq1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.getClass();
        return Unit.a;
    }
}

