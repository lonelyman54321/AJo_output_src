/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.LimitedDispatcher;

final class LimitedDispatcher$Worker
implements Runnable {
    public Runnable a;
    public final /* synthetic */ LimitedDispatcher b;

    public LimitedDispatcher$Worker(LimitedDispatcher limitedDispatcher, Runnable runnable2) {
        this.b = limitedDispatcher;
        this.a = runnable2;
    }

    public final void run() {
        Object object;
        Object object2;
        int n3;
        int n4 = 0;
        do {
            object = this.a;
            try {
                object.run();
            }
            catch (Throwable throwable) {
                object2 = f.a;
                g90_0.a((CoroutineContext)object2, throwable);
            }
            object = LimitedDispatcher.h;
            object = this.b;
            object2 = ((LimitedDispatcher)object).N0();
            if (object2 == null) {
                return;
            }
            this.a = object2;
        } while (++n4 < (n3 = 16) || (n3 = (int)(dr0_2.c((c)(object2 = ((LimitedDispatcher)object).c), (CoroutineContext)object) ? 1 : 0)) == 0);
        dr0_2.b(((LimitedDispatcher)object).c, (CoroutineContext)object, this);
    }
}

