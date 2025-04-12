/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$1;
import com.google.common.util.concurrent.AbstractFuture$AtomicHelper;
import com.google.common.util.concurrent.AbstractFuture$Listener;
import com.google.common.util.concurrent.AbstractFuture$Waiter;

final class AbstractFuture$SynchronizedHelper
extends AbstractFuture$AtomicHelper {
    private AbstractFuture$SynchronizedHelper() {
        super(null);
    }

    public /* synthetic */ AbstractFuture$SynchronizedHelper(AbstractFuture$1 abstractFuture$1) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean casListeners(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener, AbstractFuture$Listener abstractFuture$Listener2) {
        synchronized (abstractFuture) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        AbstractFuture$Listener abstractFuture$Listener3 = AbstractFuture.access$700(abstractFuture);
                        if (abstractFuture$Listener3 != abstractFuture$Listener) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    AbstractFuture.access$702(abstractFuture, abstractFuture$Listener2);
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
    public boolean casValue(AbstractFuture abstractFuture, Object object, Object object2) {
        synchronized (abstractFuture) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object3 = AbstractFuture.access$300(abstractFuture);
                        if (object3 != object) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    AbstractFuture.access$302(abstractFuture, object2);
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
    public boolean casWaiters(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter, AbstractFuture$Waiter abstractFuture$Waiter2) {
        synchronized (abstractFuture) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        AbstractFuture$Waiter abstractFuture$Waiter3 = AbstractFuture.access$800(abstractFuture);
                        if (abstractFuture$Waiter3 != abstractFuture$Waiter) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    AbstractFuture.access$802(abstractFuture, abstractFuture$Waiter2);
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
    public AbstractFuture$Listener gasListeners(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener) {
        synchronized (abstractFuture) {
            Throwable throwable2;
            block5: {
                AbstractFuture$Listener abstractFuture$Listener2;
                block4: {
                    try {
                        abstractFuture$Listener2 = AbstractFuture.access$700(abstractFuture);
                        if (abstractFuture$Listener2 == abstractFuture$Listener) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    AbstractFuture.access$702(abstractFuture, abstractFuture$Listener);
                }
                return abstractFuture$Listener2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AbstractFuture$Waiter gasWaiters(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter) {
        synchronized (abstractFuture) {
            Throwable throwable2;
            block5: {
                AbstractFuture$Waiter abstractFuture$Waiter2;
                block4: {
                    try {
                        abstractFuture$Waiter2 = AbstractFuture.access$800(abstractFuture);
                        if (abstractFuture$Waiter2 == abstractFuture$Waiter) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    AbstractFuture.access$802(abstractFuture, abstractFuture$Waiter);
                }
                return abstractFuture$Waiter2;
            }
            throw throwable2;
        }
    }

    public void putNext(AbstractFuture$Waiter abstractFuture$Waiter, AbstractFuture$Waiter abstractFuture$Waiter2) {
        abstractFuture$Waiter.next = abstractFuture$Waiter2;
    }

    public void putThread(AbstractFuture$Waiter abstractFuture$Waiter, Thread thread2) {
        abstractFuture$Waiter.thread = thread2;
    }
}

