/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.c;

/*
 * Renamed from FS1
 */
public final class fs1_2
extends c
implements ao0_1 {
    public final /* synthetic */ ao0_1 b;
    public final c c;
    public final String d;

    public fs1_2(c c2, String string2) {
        Object object;
        boolean bl2 = c2 instanceof ao0_1;
        if (bl2) {
            object = c2;
            object = (ao0_1)((Object)c2);
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null) {
            object = hl0_2.a;
        }
        this.b = object;
        this.c = c2;
        this.d = string2;
    }

    public final fr0_1 H(long l2, Runnable runnable2, CoroutineContext coroutineContext) {
        return this.b.H(l2, runnable2, coroutineContext);
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        this.c.J0(coroutineContext, runnable2);
    }

    public final void K0(CoroutineContext coroutineContext, Runnable runnable2) {
        this.c.K0(coroutineContext, runnable2);
    }

    public final boolean L0(CoroutineContext coroutineContext) {
        return this.c.L0(coroutineContext);
    }

    public final void l0(long l2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.b.l0(l2, cancellableContinuationImpl);
    }

    public final String toString() {
        return this.d;
    }
}

