/*
 * Decompiled with CFR 0.152.
 */
package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

public final class AsyncPagingDataDiffer$LoadStateListenerRunnable$1
implements Runnable {
    public final AtomicReference a;
    public final /* synthetic */ Cq b;

    public AsyncPagingDataDiffer$LoadStateListenerRunnable$1(Cq atomicReference) {
        this.b = atomicReference;
        this.a = atomicReference = new AtomicReference<Object>(null);
    }

    public final void run() {
        wZ wZ2 = (wZ)this.a.get();
        if (wZ2 != null) {
            boolean bl2;
            Iterator iterator = this.b.m.iterator();
            while (bl2 = iterator.hasNext()) {
                Function1 function1 = (Function1)iterator.next();
                function1.invoke(wZ2);
            }
        }
    }
}

