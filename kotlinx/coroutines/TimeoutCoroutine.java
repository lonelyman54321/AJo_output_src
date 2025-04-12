/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.time.a;
import kotlin.time.b;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.k$a;

final class TimeoutCoroutine
extends ut2_2
implements Runnable {
    public final long e;

    public TimeoutCoroutine(long l2, k$a k$a) {
        CoroutineContext coroutineContext = k$a.getContext();
        super(k$a, coroutineContext);
        this.e = l2;
    }

    public final String n0() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = super.n0();
        stringBuilder.append(string2);
        stringBuilder.append("(timeMillis=");
        long l2 = this.e;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void run() {
        Object object;
        block3: {
            Object object2;
            long l2;
            block2: {
                object = bo0_2.b(this.c);
                boolean bl2 = object instanceof do0_2;
                object = bl2 ? (do0_2)object : null;
                l2 = this.e;
                if (object == null) break block2;
                object2 = kotlin.time.a.b;
                object2 = aw0_1.MILLISECONDS;
                kotlin.time.b.g(l2, (aw0_1)((Object)object2));
                object = object.z();
                if (object != null) break block3;
            }
            object2 = " ms";
            object = Ov2.a(l2, "Timed out waiting for ", (String)object2);
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException((String)object, this);
        this.H(timeoutCancellationException);
    }
}

