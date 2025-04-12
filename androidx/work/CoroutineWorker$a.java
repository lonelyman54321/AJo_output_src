/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class CoroutineWorker$a
extends c {
    public static final CoroutineWorker$a b;
    public static final wm0_2 c;

    static {
        CoroutineWorker$a coroutineWorker$a;
        b = coroutineWorker$a = new c();
        c = ir0_2.a;
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        Intrinsics.checkNotNullParameter(runnable2, "block");
        c.J0(coroutineContext, runnable2);
    }

    public final boolean L0(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        c.getClass();
        return false ^ true;
    }
}

