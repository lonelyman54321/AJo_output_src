/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.EventLoopImplBase$DelayedTask;

final class EventLoopImplBase$DelayedResumeTask
extends EventLoopImplBase$DelayedTask {
    public final bl_2 c;
    public final /* synthetic */ EventLoopImplBase d;

    public EventLoopImplBase$DelayedResumeTask(EventLoopImplBase eventLoopImplBase, long l2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.d = eventLoopImplBase;
        super(l2);
        this.c = cancellableContinuationImpl;
    }

    public final void run() {
        EventLoopImplBase eventLoopImplBase = this.d;
        Unit unit = Unit.a;
        this.c.E(eventLoopImplBase, unit);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = super.toString();
        stringBuilder.append((String)object);
        object = this.c;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

