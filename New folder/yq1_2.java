/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from YQ1
 */
public final class yq1_2
extends qg3_2
implements gx0_2 {
    public final /* synthetic */ ar1_0 a;

    public yq1_2(ar1_0 ar1_02, f80_0 f80_02) {
        this.a = ar1_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object2 = this.a;
        object = new yq1_2((ar1_0)object2, (f80_0)object3);
        object2 = Unit.a;
        return ((yq1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.getClass();
        return Unit.a;
    }
}

