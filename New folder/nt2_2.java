/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/*
 * Renamed from nT2
 */
public class nt2_2
extends g {
    public final CoroutineScheduler b;

    public nt2_2(int n3, int n4, String string2, long l2) {
        CoroutineScheduler coroutineScheduler;
        this.b = coroutineScheduler = new CoroutineScheduler(n3, n4, string2, l2);
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        CoroutineScheduler.c(this.b, runnable2, false, 6);
    }

    public final void K0(CoroutineContext coroutineContext, Runnable runnable2) {
        CoroutineScheduler.c(this.b, runnable2, true, 2);
    }
}

