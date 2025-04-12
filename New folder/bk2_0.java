/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Bk2
 */
public final class bk2_0
implements fs0_2 {
    public final /* synthetic */ yk2_1 a;
    public final /* synthetic */ Rv1 b;

    public bk2_0(yk2_1 yk2_12, Rv1 rv1) {
        this.a = yk2_12;
        this.b = rv1;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (ez0_0)object;
        yk2_1 yk2_12 = this.a;
        Rv1 rv1 = this.b;
        if ((object = yk2_1.b(yk2_12, rv1, (ez0_0)object, object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }
}

