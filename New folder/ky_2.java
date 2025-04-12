/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/*
 * Renamed from Ky
 */
public final class ky_2
extends a {
    public final Thread d;
    public final jb0_2 e;

    public ky_2(CoroutineContext coroutineContext, Thread thread2, jb0_2 jb0_22) {
        boolean bl2 = true;
        super(coroutineContext, bl2, bl2);
        this.d = thread2;
        this.e = jb0_22;
    }

    public final void s(Object object) {
        Thread thread2;
        object = Thread.currentThread();
        boolean bl2 = Intrinsics.areEqual(object, thread2 = this.d);
        if (!bl2) {
            LockSupport.unpark(thread2);
        }
    }
}

