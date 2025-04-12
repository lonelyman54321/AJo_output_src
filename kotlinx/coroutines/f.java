/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.EventLoopImplBase$DelayedTask;

public abstract class f
extends jb0_2 {
    public abstract Thread T0();

    public void U0(long l2, EventLoopImplBase$DelayedTask eventLoopImplBase$DelayedTask) {
        DefaultExecutor.i.Z0(l2, eventLoopImplBase$DelayedTask);
    }
}

