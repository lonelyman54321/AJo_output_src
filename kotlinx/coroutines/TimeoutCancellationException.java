/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.i;

public final class TimeoutCancellationException
extends CancellationException
implements d80_0 {
    public final transient i a;

    public TimeoutCancellationException(String string2, i i3) {
        super(string2);
        this.a = i3;
    }

    public final Throwable a() {
        String string2 = this.getMessage();
        if (string2 == null) {
            string2 = "";
        }
        i i3 = this.a;
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(string2, i3);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}

