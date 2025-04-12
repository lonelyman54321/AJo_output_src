/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;

final class ContinuationRunnable
extends AtomicBoolean
implements Runnable {
    public final void run() {
        boolean bl2 = true;
        boolean bl3 = this.compareAndSet(false, bl2);
        if (!bl3) {
            return;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContinuationRunnable(ran = ");
        boolean bl2 = this.get();
        stringBuilder.append(bl2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

