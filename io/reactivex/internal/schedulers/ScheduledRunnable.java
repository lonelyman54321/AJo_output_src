/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable
extends AtomicReferenceArray
implements Runnable,
Callable,
yr0_2 {
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable a;

    static {
        Object object;
        b = object = new Object();
        c = object = new Object();
        d = object = new Object();
        e = object = new Object();
    }

    public ScheduledRunnable(Runnable runnable2, ar0_2 ar0_22) {
        super(3);
        this.a = runnable2;
        this.lazySet(0, ar0_22);
    }

    public final void a(Future future) {
        Object e2;
        int n3;
        do {
            Object object;
            if ((e2 = this.get(n3 = 1)) == (object = e)) {
                return;
            }
            object = c;
            if (e2 == object) {
                future.cancel(false);
                return;
            }
            object = d;
            if (e2 != object) continue;
            future.cancel(n3 != 0);
            return;
        } while ((n3 = (int)(this.compareAndSet(n3, e2, future) ? 1 : 0)) == 0);
    }

    public final Object call() {
        this.run();
        return null;
    }

    public final void dispose() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        while ((object5 = this.get(n3 = 1)) != (object4 = e) && object5 != (object3 = c) && object5 != (object2 = d)) {
            Thread thread2;
            boolean bl2 = 2 != 0;
            Object e2 = this.get((int)(bl2 ? 1 : 0));
            if (e2 != (thread2 = Thread.currentThread())) {
                bl2 = true;
            } else {
                bl2 = false;
                e2 = null;
            }
            if (bl2) {
                object3 = object2;
            }
            if ((n3 = (int)(this.compareAndSet(n3, object5, object3) ? 1 : 0)) == 0) continue;
            if (object5 == null) break;
            object5 = (Future)object5;
            object5.cancel(bl2);
            break;
        }
        while ((object = this.get(0)) != object4 && object != (object5 = b) && object != null) {
            boolean bl3 = this.compareAndSet(0, object, object5);
            if (!bl3) continue;
            object = (ar0_2)object;
            object.a(this);
            break;
        }
    }

    public final boolean isDisposed() {
        Object object;
        boolean bl2 = false;
        Object e2 = this.get(0);
        if (e2 == (object = b) || e2 == (object = e)) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean bl2;
        Object object = d;
        Object object2 = c;
        Object object3 = b;
        Object object4 = e;
        Object object5 = Thread.currentThread();
        int n3 = 2;
        this.lazySet(n3, object5);
        object5 = null;
        int n4 = 1;
        try {
            Runnable runnable2 = this.a;
            runnable2.run();
        }
        catch (Throwable throwable) {
            try {
                dr2_2.b(throwable);
            }
            catch (Throwable throwable2) {
                boolean bl3;
                this.lazySet(n3, null);
                object5 = this.get(0);
                if (object5 != object3 && (bl3 = this.compareAndSet(0, object5, object4)) && object5 != null) {
                    object5 = (ar0_2)object5;
                    object5.a(this);
                }
                while ((object3 = this.get(n4)) != object2 && object3 != object && !(bl3 = this.compareAndSet(n4, object3, object4))) {
                }
                throw throwable2;
            }
        }
        this.lazySet(n3, null);
        object5 = this.get(0);
        if (object5 != object3 && (bl2 = this.compareAndSet(0, object5, object4)) && object5 != null) {
            object5 = (ar0_2)object5;
            object5.a(this);
        }
        while ((object3 = this.get(n4)) != object2 && object3 != object && !(bl2 = this.compareAndSet(n4, object3, object4))) {
        }
    }
}

