/*
 * Decompiled with CFR 0.152.
 */
package androidx.loader.content;

import androidx.core.os.OperationCanceledException;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.ModernAsyncTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

final class AsyncTaskLoader$LoadTask
extends ModernAsyncTask
implements Runnable {
    public final CountDownLatch h;
    public boolean i;
    public final /* synthetic */ AsyncTaskLoader j;

    public AsyncTaskLoader$LoadTask(AsyncTaskLoader object) {
        this.j = object;
        this.h = object = new CountDownLatch(1);
    }

    public final Object a() {
        OperationCanceledException operationCanceledException2;
        block3: {
            Object object = this.j;
            try {
                object = ((AsyncTaskLoader)object).onLoadInBackground();
            }
            catch (OperationCanceledException operationCanceledException2) {
                AtomicBoolean atomicBoolean = this.d;
                boolean bl2 = atomicBoolean.get();
                if (!bl2) break block3;
                object = null;
            }
            return object;
        }
        throw operationCanceledException2;
    }

    public final void b(Object object) {
        CountDownLatch countDownLatch = this.h;
        try {
            AsyncTaskLoader asyncTaskLoader = this.j;
            asyncTaskLoader.dispatchOnCancelled(this, object);
            return;
        }
        finally {
            countDownLatch.countDown();
        }
    }

    public final void c(Object object) {
        CountDownLatch countDownLatch = this.h;
        try {
            AsyncTaskLoader asyncTaskLoader = this.j;
            asyncTaskLoader.dispatchOnLoadComplete(this, object);
            return;
        }
        finally {
            countDownLatch.countDown();
        }
    }

    public final void run() {
        this.i = false;
        this.j.executePendingTask();
    }
}

