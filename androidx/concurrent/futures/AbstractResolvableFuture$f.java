/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.AbstractResolvableFuture$a;
import androidx.concurrent.futures.AbstractResolvableFuture$d;
import androidx.concurrent.futures.AbstractResolvableFuture$g;

public final class AbstractResolvableFuture$f
extends AbstractResolvableFuture$a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(AbstractResolvableFuture abstractResolvableFuture, AbstractResolvableFuture$d abstractResolvableFuture$d, AbstractResolvableFuture$d abstractResolvableFuture$d2) {
        synchronized (abstractResolvableFuture) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        AbstractResolvableFuture$d abstractResolvableFuture$d3 = abstractResolvableFuture.listeners;
                        if (abstractResolvableFuture$d3 != abstractResolvableFuture$d) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    abstractResolvableFuture.listeners = abstractResolvableFuture$d2;
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object object, Object object2) {
        synchronized (abstractResolvableFuture) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object3 = abstractResolvableFuture.value;
                        if (object3 != object) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    abstractResolvableFuture.value = object2;
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(AbstractResolvableFuture abstractResolvableFuture, AbstractResolvableFuture$g abstractResolvableFuture$g, AbstractResolvableFuture$g abstractResolvableFuture$g2) {
        synchronized (abstractResolvableFuture) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        AbstractResolvableFuture$g abstractResolvableFuture$g3 = abstractResolvableFuture.waiters;
                        if (abstractResolvableFuture$g3 != abstractResolvableFuture$g) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    abstractResolvableFuture.waiters = abstractResolvableFuture$g2;
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final void d(AbstractResolvableFuture$g abstractResolvableFuture$g, AbstractResolvableFuture$g abstractResolvableFuture$g2) {
        abstractResolvableFuture$g.b = abstractResolvableFuture$g2;
    }

    public final void e(AbstractResolvableFuture$g abstractResolvableFuture$g, Thread thread2) {
        abstractResolvableFuture$g.a = thread2;
    }
}

