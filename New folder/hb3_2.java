/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from hb3
 */
public final class hb3_2
implements f80_0,
k90_0 {
    public final f80_0 a;
    public final CoroutineContext b;

    public hb3_2(f80_0 f80_02, CoroutineContext coroutineContext) {
        this.a = f80_02;
        this.b = coroutineContext;
    }

    public final k90_0 getCallerFrame() {
        Object object = this.a;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final CoroutineContext getContext() {
        return this.b;
    }

    public final void resumeWith(Object object) {
        this.a.resumeWith(object);
    }
}

