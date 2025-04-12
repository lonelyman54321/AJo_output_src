/*
 * Decompiled with CFR 0.152.
 */
import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class eK$d
implements ListenableFuture {
    public final WeakReference a;
    public final eK$d$a b;

    public eK$d(eK$a eK$a) {
        WeakReference<eK$a> weakReference = new WeakReference<eK$a>(this);
        this.b = weakReference;
        this.a = weakReference = new WeakReference<eK$a>(eK$a);
    }

    public final void addListener(Runnable runnable2, Executor executor) {
        this.b.addListener(runnable2, executor);
    }

    public final boolean cancel(boolean bl2) {
        Object object = (eK$a)this.a.get();
        eK$d$a eK$d$a = this.b;
        if ((bl2 = eK$d$a.cancel(bl2)) && object != null) {
            eK$d$a = null;
            ((eK$a)object).a = null;
            ((eK$a)object).b = null;
            object = ((eK$a)object).c;
            ((AbstractResolvableFuture)object).set(null);
        }
        return bl2;
    }

    public final Object get() {
        return this.b.get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return this.b.get(l2, timeUnit);
    }

    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }
}

