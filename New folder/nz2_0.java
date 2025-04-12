/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from Nz2
 */
public final class nz2_0
implements Mz2,
tr1_0 {
    public final CoroutineContext a;
    public final /* synthetic */ tr1_0 b;

    public nz2_0(tr1_0 tr1_02, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = tr1_02;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    public final Object getValue() {
        return this.b.getValue();
    }

    public final void setValue(Object object) {
        this.b.setValue(object);
    }
}

