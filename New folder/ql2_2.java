/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;

/*
 * Renamed from qL2
 */
public abstract class ql2_2
extends xv_1 {
    public ql2_2(f80_0 object) {
        super((f80_0)object);
        Object object2;
        if (object != null && (object = object.getContext()) != (object2 = f.a)) {
            object2 = "Coroutines with restricted suspension must have EmptyCoroutineContext".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
    }

    public final CoroutineContext getContext() {
        return f.a;
    }
}

