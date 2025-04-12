/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.c;

final class ResumeUndispatchedRunnable
implements Runnable {
    public final c a;
    public final bl_2 b;

    public ResumeUndispatchedRunnable(c c2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = c2;
        this.b = cancellableContinuationImpl;
    }

    public final void run() {
        c c2 = this.a;
        Unit unit = Unit.a;
        this.b.E(c2, unit);
    }
}

