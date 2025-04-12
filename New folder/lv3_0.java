/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from Lv3
 */
public final class lv3_0
implements fs0_2 {
    public final CoroutineContext a;
    public final Object b;
    public final Lv3$a c;

    public lv3_0(fs0_2 fs0_22, CoroutineContext object) {
        this.a = object;
        this.b = object = bn3_0.b((CoroutineContext)object);
        this.c = object = new Lv3$a(fs0_22, null);
    }

    public final Object emit(Object object, f80_0 object2) {
        CoroutineContext coroutineContext = this.a;
        Object object3 = this.b;
        Lv3$a lv3$a = this.c;
        if ((object = mr_1.a(coroutineContext, object, object3, lv3$a, object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

