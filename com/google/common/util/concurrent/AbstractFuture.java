/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.AbstractFuture$AtomicHelper;
import com.google.common.util.concurrent.AbstractFuture$Cancellation;
import com.google.common.util.concurrent.AbstractFuture$Failure;
import com.google.common.util.concurrent.AbstractFuture$Listener;
import com.google.common.util.concurrent.AbstractFuture$SafeAtomicHelper;
import com.google.common.util.concurrent.AbstractFuture$SetFuture;
import com.google.common.util.concurrent.AbstractFuture$SynchronizedHelper;
import com.google.common.util.concurrent.AbstractFuture$Trusted;
import com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper;
import com.google.common.util.concurrent.AbstractFuture$Waiter;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.NullnessCasts;
import com.google.common.util.concurrent.OverflowAvoidingLockSupport;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture
extends InternalFutureFailureAccess
implements ListenableFuture {
    private static final AbstractFuture$AtomicHelper ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000L;
    private static final Logger log;
    private volatile AbstractFuture$Listener listeners;
    private volatile Object value;
    private volatile AbstractFuture$Waiter waiters;

    static {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Class clazz;
        block17: {
            AbstractFuture$SafeAtomicHelper abstractFuture$SafeAtomicHelper;
            boolean bl2;
            clazz = AbstractFuture$Waiter.class;
            object4 = "guava.concurrent.generate_cancellation_cause";
            object3 = "false";
            object4 = System.getProperty((String)object4, (String)object3);
            try {
                bl2 = Boolean.parseBoolean((String)object4);
            }
            catch (SecurityException securityException) {
                bl2 = false;
                object4 = null;
            }
            GENERATE_CANCELLATION_CAUSES = bl2;
            object4 = AbstractFuture.class;
            log = Logger.getLogger(((Class)object4).getName());
            object3 = null;
            try {
                object4 = object2 = new AbstractFuture$UnsafeAtomicHelper(null);
                object2 = null;
                break block17;
            }
            catch (Error error) {
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            object = Thread.class;
            Object object5 = "thread";
            object5 = AtomicReferenceFieldUpdater.newUpdater(clazz, object, (String)object5);
            object = "next";
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz, (String)object);
            object = "waiters";
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AtomicReferenceFieldUpdater.newUpdater(object4, clazz, (String)object);
            clazz = AbstractFuture$Listener.class;
            object = "listeners";
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = AtomicReferenceFieldUpdater.newUpdater(object4, clazz, (String)object);
            clazz = Object.class;
            object = "value";
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AtomicReferenceFieldUpdater.newUpdater(object4, clazz, (String)object);
            object = abstractFuture$SafeAtomicHelper;
            try {
                abstractFuture$SafeAtomicHelper = new AbstractFuture$SafeAtomicHelper((AtomicReferenceFieldUpdater)object5, atomicReferenceFieldUpdater, atomicReferenceFieldUpdater2, atomicReferenceFieldUpdater3, atomicReferenceFieldUpdater4);
                object4 = abstractFuture$SafeAtomicHelper;
                break block17;
            }
            catch (Error error) {
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            object4 = new AbstractFuture$SynchronizedHelper(null);
            object3 = clazz;
        }
        ATOMIC_HELPER = object4;
        if (object3 != null) {
            clazz = log;
            object4 = Level.SEVERE;
            object = "UnsafeAtomicHelper is broken!";
            ((Logger)((Object)clazz)).log((Level)object4, (String)object, (Throwable)object2);
            object2 = "SafeAtomicHelper is broken!";
            ((Logger)((Object)clazz)).log((Level)object4, (String)object2, (Throwable)object3);
        }
        clazz = new Class();
        NULL = clazz;
    }

    public static /* synthetic */ AbstractFuture$AtomicHelper access$200() {
        return ATOMIC_HELPER;
    }

    public static /* synthetic */ Object access$300(AbstractFuture abstractFuture) {
        return abstractFuture.value;
    }

    public static /* synthetic */ Object access$302(AbstractFuture abstractFuture, Object object) {
        abstractFuture.value = object;
        return object;
    }

    public static /* synthetic */ Object access$400(ListenableFuture listenableFuture) {
        return AbstractFuture.getFutureValue(listenableFuture);
    }

    public static /* synthetic */ void access$500(AbstractFuture abstractFuture, boolean bl2) {
        AbstractFuture.complete(abstractFuture, bl2);
    }

    public static /* synthetic */ AbstractFuture$Listener access$700(AbstractFuture abstractFuture) {
        return abstractFuture.listeners;
    }

    public static /* synthetic */ AbstractFuture$Listener access$702(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener) {
        abstractFuture.listeners = abstractFuture$Listener;
        return abstractFuture$Listener;
    }

    public static /* synthetic */ AbstractFuture$Waiter access$800(AbstractFuture abstractFuture) {
        return abstractFuture.waiters;
    }

    public static /* synthetic */ AbstractFuture$Waiter access$802(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter) {
        abstractFuture.waiters = abstractFuture$Waiter;
        return abstractFuture$Waiter;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addDoneString(StringBuilder stringBuilder) {
        ExecutionException executionException2222;
        String string3;
        block4: {
            string3 = "]";
            try {
                Object object = AbstractFuture.getUninterruptibly(this);
                String string2 = "SUCCESS, result=[";
                stringBuilder.append(string2);
                this.appendResultObject(stringBuilder, object);
                stringBuilder.append(string3);
                return;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (ExecutionException executionException2222) {
                break block4;
            }
            catch (CancellationException cancellationException) {
                string3 = "CANCELLED";
                stringBuilder.append(string3);
                return;
            }
            String throwable = "UNKNOWN, cause=[";
            stringBuilder.append(throwable);
            Object object2 = runtimeException.getClass();
            stringBuilder.append(object2);
            object2 = " thrown from get()]";
            stringBuilder.append((String)object2);
            return;
        }
        String string4 = "FAILURE, cause=[";
        stringBuilder.append(string4);
        Throwable throwable = executionException2222.getCause();
        stringBuilder.append(throwable);
        stringBuilder.append(string3);
    }

    private void addPendingString(StringBuilder stringBuilder) {
        int n3 = stringBuilder.length();
        stringBuilder.append("PENDING");
        Object object = this.value;
        boolean bl2 = object instanceof AbstractFuture$SetFuture;
        String string2 = "]";
        if (bl2) {
            String string3 = ", setFuture=[";
            stringBuilder.append(string3);
            object = ((AbstractFuture$SetFuture)object).future;
            this.appendUserObject(stringBuilder, object);
            stringBuilder.append(string2);
        } else {
            CharSequence charSequence;
            block8: {
                object = this.pendingToString();
                try {
                    object = Strings.emptyToNull((String)object);
                    break block8;
                }
                catch (StackOverflowError stackOverflowError) {
                }
                catch (RuntimeException runtimeException) {
                    // empty catch block
                }
                String string4 = "Exception thrown from implementation: ";
                charSequence = new StringBuilder(string4);
                object = object.getClass();
                ((StringBuilder)charSequence).append(object);
                object = ((StringBuilder)charSequence).toString();
            }
            if (object != null) {
                charSequence = ", info=[";
                stringBuilder.append((String)charSequence);
                stringBuilder.append((String)object);
                stringBuilder.append(string2);
            }
        }
        int n4 = this.isDone();
        if (n4 != 0) {
            n4 = stringBuilder.length();
            stringBuilder.delete(n3, n4);
            this.addDoneString(stringBuilder);
        }
    }

    private void appendResultObject(StringBuilder stringBuilder, Object object) {
        if (object == null) {
            object = "null";
            stringBuilder.append((String)object);
        } else if (object == this) {
            object = "this future";
            stringBuilder.append((String)object);
        } else {
            String string2 = object.getClass().getName();
            stringBuilder.append(string2);
            string2 = "@";
            stringBuilder.append(string2);
            int n3 = System.identityHashCode(object);
            object = Integer.toHexString(n3);
            stringBuilder.append((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void appendUserObject(StringBuilder stringBuilder, Object object) {
        Class<?> clazz;
        if (object == this) {
            object = "this future";
            try {
                stringBuilder.append((String)object);
                return;
            }
            catch (StackOverflowError stackOverflowError) {
            }
            catch (RuntimeException runtimeException) {}
        } else {
            stringBuilder.append(object);
            return;
        }
        String string2 = "Exception thrown from implementation: ";
        stringBuilder.append(string2);
        clazz = clazz.getClass();
        stringBuilder.append(clazz);
    }

    private static CancellationException cancellationExceptionWithCause(String string2, Throwable throwable) {
        CancellationException cancellationException = new CancellationException(string2);
        cancellationException.initCause(throwable);
        return cancellationException;
    }

    private AbstractFuture$Listener clearListeners(AbstractFuture$Listener abstractFuture$Listener) {
        Object object = ATOMIC_HELPER;
        AbstractFuture$Listener abstractFuture$Listener2 = AbstractFuture$Listener.TOMBSTONE;
        AbstractFuture$Listener abstractFuture$Listener3 = ((AbstractFuture$AtomicHelper)object).gasListeners(this, abstractFuture$Listener2);
        object = abstractFuture$Listener;
        abstractFuture$Listener = abstractFuture$Listener3;
        while (abstractFuture$Listener != null) {
            abstractFuture$Listener2 = abstractFuture$Listener.next;
            abstractFuture$Listener.next = object;
            object = abstractFuture$Listener;
            abstractFuture$Listener = abstractFuture$Listener2;
        }
        return object;
    }

    private static void complete(AbstractFuture object, boolean bl2) {
        AbstractFuture$Listener abstractFuture$Listener = null;
        block0: while (true) {
            ((AbstractFuture)object).releaseWaiters();
            if (bl2) {
                ((AbstractFuture)object).interruptTask();
                bl2 = false;
            }
            ((AbstractFuture)object).afterDone();
            object = ((AbstractFuture)object).clearListeners(abstractFuture$Listener);
            while (object != null) {
                abstractFuture$Listener = ((AbstractFuture$Listener)object).next;
                Runnable runnable2 = ((AbstractFuture$Listener)object).task;
                Objects.requireNonNull(runnable2);
                boolean bl3 = runnable2 instanceof AbstractFuture$SetFuture;
                if (bl3) {
                    AbstractFuture$AtomicHelper abstractFuture$AtomicHelper;
                    boolean bl4;
                    runnable2 = (AbstractFuture$SetFuture)runnable2;
                    object = ((AbstractFuture$SetFuture)runnable2).owner;
                    Object object2 = ((AbstractFuture)object).value;
                    if (object2 == runnable2 && (bl4 = (abstractFuture$AtomicHelper = ATOMIC_HELPER).casValue((AbstractFuture)object, runnable2, object2 = AbstractFuture.getFutureValue(((AbstractFuture$SetFuture)runnable2).future)))) {
                        continue block0;
                    }
                } else {
                    object = ((AbstractFuture$Listener)object).executor;
                    Objects.requireNonNull(object);
                    object = (Executor)object;
                    AbstractFuture.executeListener(runnable2, (Executor)object);
                }
                object = abstractFuture$Listener;
            }
            break;
        }
    }

    private static void executeListener(Runnable object, Executor executor) {
        try {
            executor.execute((Runnable)object);
        }
        catch (RuntimeException runtimeException) {
            Logger logger = log;
            Level level = Level.SEVERE;
            String string2 = "RuntimeException while executing runnable ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            object = stringBuilder.toString();
            logger.log(level, (String)object, runtimeException);
        }
    }

    private Object getDoneValue(Object object) {
        boolean bl2 = object instanceof AbstractFuture$Cancellation;
        if (!bl2) {
            bl2 = object instanceof AbstractFuture$Failure;
            if (!bl2) {
                Object object2 = NULL;
                if (object == object2) {
                    object = NullnessCasts.uncheckedNull();
                }
                return object;
            }
            object = ((AbstractFuture$Failure)object).exception;
            ExecutionException executionException = new ExecutionException((Throwable)object);
            throw executionException;
        }
        object = ((AbstractFuture$Cancellation)object).cause;
        throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", (Throwable)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object getFutureValue(ListenableFuture object) {
        ExecutionException executionException2;
        boolean bl2;
        Object object2;
        block16: {
            CancellationException cancellationException2;
            IllegalArgumentException illegalArgumentException;
            block15: {
                void var0_3;
                Object object3;
                boolean bl3;
                object2 = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
                bl2 = object instanceof AbstractFuture$Trusted;
                illegalArgumentException = null;
                if (bl2) {
                    object = ((AbstractFuture)object).value;
                    boolean bl4 = object instanceof AbstractFuture$Cancellation;
                    if (bl4) {
                        object2 = object;
                        object2 = (AbstractFuture$Cancellation)object;
                        bl2 = ((AbstractFuture$Cancellation)object2).wasInterrupted;
                        if (bl2) {
                            object = ((AbstractFuture$Cancellation)object2).cause;
                            if (object != null) {
                                object2 = ((AbstractFuture$Cancellation)object2).cause;
                                object = new AbstractFuture$Cancellation(false, (Throwable)object2);
                            } else {
                                object = AbstractFuture$Cancellation.CAUSELESS_CANCELLED;
                            }
                        }
                    }
                    Objects.requireNonNull(object);
                    return object;
                }
                bl2 = object instanceof InternalFutureFailureAccess;
                if (bl2) {
                    Object object4 = object;
                    object4 = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess)object);
                    if (object4 != null) {
                        return new AbstractFuture$Failure((Throwable)object4);
                    }
                }
                if (bl3 = (GENERATE_CANCELLATION_CAUSES ^ true) & (bl2 = ((Future)object).isCancelled())) {
                    object = AbstractFuture$Cancellation.CAUSELESS_CANCELLED;
                    Objects.requireNonNull(object);
                    return object;
                }
                try {
                    object3 = AbstractFuture.getUninterruptibly((Future)object);
                    if (bl2) {
                        CharSequence charSequence = new StringBuilder((String)object2);
                        charSequence.append(object);
                        charSequence = charSequence.toString();
                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException((String)charSequence);
                        return new AbstractFuture$Cancellation(false, illegalArgumentException2);
                    }
                }
                catch (Error error) {
                    return new AbstractFuture$Failure((Throwable)var0_3);
                }
                catch (RuntimeException runtimeException) {
                    return new AbstractFuture$Failure((Throwable)var0_3);
                }
                catch (CancellationException cancellationException2) {
                    break block15;
                }
                catch (ExecutionException executionException2) {
                    break block16;
                }
                if (object3 != null) return object3;
                return NULL;
            }
            if (bl2) return new AbstractFuture$Cancellation(false, cancellationException2);
            StringBuilder stringBuilder = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            illegalArgumentException = new IllegalArgumentException((String)object, cancellationException2);
            return new AbstractFuture$Failure(illegalArgumentException);
        }
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder((String)object2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object, executionException2);
            return new AbstractFuture$Cancellation(false, illegalArgumentException);
        }
        object2 = executionException2.getCause();
        return new AbstractFuture$Failure((Throwable)object2);
    }

    private static Object getUninterruptibly(Future future) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    future = future.get();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return future;
            break;
        }
    }

    private void releaseWaiters() {
        Object object = ATOMIC_HELPER;
        AbstractFuture$Waiter abstractFuture$Waiter = AbstractFuture$Waiter.TOMBSTONE;
        object = ((AbstractFuture$AtomicHelper)object).gasWaiters(this, abstractFuture$Waiter);
        while (object != null) {
            ((AbstractFuture$Waiter)object).unpark();
            object = ((AbstractFuture$Waiter)object).next;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void removeWaiter(AbstractFuture$Waiter var1_1) {
        var1_1.thread = null;
        block0: while (true) {
            if ((var1_1 = this.waiters) == (var2_2 = AbstractFuture$Waiter.TOMBSTONE)) {
                return;
            }
            var2_2 = null;
            while (var1_1 != null) {
                var3_3 = var1_1.next;
                var4_4 = var1_1.thread;
                if (var4_4 != null) {
                    var2_2 = var1_1;
                } else if (var2_2 != null) {
                    var2_2.next = var3_3;
                    var1_1 = var2_2.thread;
                    if (var1_1 == null) {
                        continue block0;
                    }
                } else {
                    var4_4 = AbstractFuture.ATOMIC_HELPER;
                    var5_5 = var4_4.casWaiters(this, (AbstractFuture$Waiter)var1_1, var3_3);
                    if (var5_5) ** break;
                    continue block0;
                }
                var1_1 = var3_3;
            }
            break;
        }
    }

    public void addListener(Runnable runnable2, Executor executor) {
        AbstractFuture$Listener abstractFuture$Listener;
        Preconditions.checkNotNull(runnable2, "Runnable was null.");
        Object object = "Executor was null.";
        Preconditions.checkNotNull(executor, object);
        boolean bl2 = this.isDone();
        if (!bl2 && (object = this.listeners) != (abstractFuture$Listener = AbstractFuture$Listener.TOMBSTONE)) {
            Object object2;
            abstractFuture$Listener = new AbstractFuture$Listener(runnable2, executor);
            do {
                abstractFuture$Listener.next = object;
                object2 = ATOMIC_HELPER;
                bl2 = ((AbstractFuture$AtomicHelper)object2).casListeners(this, (AbstractFuture$Listener)object, abstractFuture$Listener);
                if (!bl2) continue;
                return;
            } while ((object = this.listeners) != (object2 = AbstractFuture$Listener.TOMBSTONE));
        }
        AbstractFuture.executeListener(runnable2, executor);
    }

    public void afterDone() {
    }

    public boolean cancel(boolean bl2) {
        boolean bl3;
        block14: {
            AbstractFuture$Cancellation abstractFuture$Cancellation;
            boolean bl4;
            Object object = this.value;
            bl3 = true;
            if (object == null) {
                bl4 = true;
            } else {
                bl4 = false;
                abstractFuture$Cancellation = null;
            }
            boolean bl5 = object instanceof AbstractFuture$SetFuture;
            if (bl4 |= bl5) {
                Object object2;
                String string2;
                bl4 = GENERATE_CANCELLATION_CAUSES;
                if (bl4) {
                    string2 = "Future.cancel() was called.";
                    object2 = new CancellationException(string2);
                    abstractFuture$Cancellation = new AbstractFuture$Cancellation(bl2, (Throwable)object2);
                } else {
                    abstractFuture$Cancellation = bl2 ? AbstractFuture$Cancellation.CAUSELESS_INTERRUPTED : AbstractFuture$Cancellation.CAUSELESS_CANCELLED;
                    Objects.requireNonNull(abstractFuture$Cancellation);
                }
                boolean bl6 = false;
                string2 = null;
                object2 = this;
                while (true) {
                    AbstractFuture$AtomicHelper abstractFuture$AtomicHelper;
                    boolean bl7;
                    if (bl7 = (abstractFuture$AtomicHelper = ATOMIC_HELPER).casValue((AbstractFuture)object2, object, abstractFuture$Cancellation)) {
                        AbstractFuture.complete((AbstractFuture)object2, bl2);
                        bl5 = object instanceof AbstractFuture$SetFuture;
                        if (bl5) {
                            object = ((AbstractFuture$SetFuture)object).future;
                            bl5 = object instanceof AbstractFuture$Trusted;
                            if (bl5) {
                                object2 = object;
                                object2 = (AbstractFuture)object;
                                object = ((AbstractFuture)object2).value;
                                if (object == null) {
                                    bl6 = true;
                                } else {
                                    bl6 = false;
                                    string2 = null;
                                }
                                bl7 = object instanceof AbstractFuture$SetFuture;
                                if (bl6 |= bl7) {
                                    bl6 = true;
                                    continue;
                                }
                            } else {
                                object.cancel(bl2);
                            }
                        }
                        break block14;
                    }
                    object = ((AbstractFuture)object2).value;
                    bl7 = object instanceof AbstractFuture$SetFuture;
                    if (!bl7) break;
                }
                bl3 = bl6;
            } else {
                bl3 = false;
            }
        }
        return bl3;
    }

    public Object get() {
        boolean bl2 = Thread.interrupted();
        if (!bl2) {
            AbstractFuture$Waiter abstractFuture$Waiter;
            boolean bl3;
            Object object = this.value;
            boolean bl4 = true;
            if (object != null) {
                bl3 = true;
            } else {
                bl3 = false;
                abstractFuture$Waiter = null;
            }
            boolean bl5 = object instanceof AbstractFuture$SetFuture ^ bl4;
            if (bl3 &= bl5) {
                return this.getDoneValue(object);
            }
            object = this.waiters;
            abstractFuture$Waiter = AbstractFuture$Waiter.TOMBSTONE;
            if (object != abstractFuture$Waiter) {
                Object object2;
                abstractFuture$Waiter = new AbstractFuture$Waiter();
                do {
                    block8: {
                        boolean bl6;
                        abstractFuture$Waiter.setNext((AbstractFuture$Waiter)object);
                        object2 = ATOMIC_HELPER;
                        bl2 = ((AbstractFuture$AtomicHelper)object2).casWaiters(this, (AbstractFuture$Waiter)object, abstractFuture$Waiter);
                        if (!bl2) continue;
                        do {
                            LockSupport.park(this);
                            bl2 = Thread.interrupted();
                            if (bl2) break block8;
                            object = this.value;
                            if (object != null) {
                                bl5 = true;
                                continue;
                            }
                            bl5 = false;
                            object2 = null;
                        } while (!(bl5 &= (bl6 = object instanceof AbstractFuture$SetFuture ^ bl4)));
                        return this.getDoneValue(object);
                    }
                    this.removeWaiter(abstractFuture$Waiter);
                    object = new InterruptedException();
                    throw object;
                } while ((object = this.waiters) != (object2 = AbstractFuture$Waiter.TOMBSTONE));
            }
            object = this.value;
            Objects.requireNonNull(object);
            return this.getDoneValue(object);
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public Object get(long l2, TimeUnit timeUnit) {
        AbstractFuture abstractFuture = this;
        long l3 = l2;
        TimeUnit timeUnit2 = timeUnit;
        long l4 = timeUnit.toNanos(l2);
        Object object = Thread.interrupted();
        if (object == 0) {
            int n3;
            Object object2;
            boolean bl2;
            Object object3;
            Object object4;
            long l7;
            long l8;
            long l12;
            int n4;
            Object object5;
            block16: {
                object5 = this.value;
                n4 = 1;
                boolean bl3 = object5 != null;
                boolean bl4 = object5 instanceof AbstractFuture$SetFuture ^ n4;
                if (bl3 &= bl4) {
                    return abstractFuture.getDoneValue(object5);
                }
                l12 = 0L;
                long l14 = l4 - l12;
                object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                l8 = object > 0 ? System.nanoTime() + l4 : l12;
                l7 = 1000L;
                long l15 = l4 - l7;
                object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object >= 0) {
                    object5 = abstractFuture.waiters;
                    object4 = AbstractFuture$Waiter.TOMBSTONE;
                    if (object5 != object4) {
                        object4 = new AbstractFuture$Waiter();
                        do {
                            block15: {
                                long l16;
                                ((AbstractFuture$Waiter)object4).setNext((AbstractFuture$Waiter)object5);
                                object3 = ATOMIC_HELPER;
                                object = ((AbstractFuture$AtomicHelper)object3).casWaiters(abstractFuture, (AbstractFuture$Waiter)object5, (AbstractFuture$Waiter)object4);
                                if (object == 0) continue;
                                do {
                                    OverflowAvoidingLockSupport.parkNanos(abstractFuture, l4);
                                    bl2 = Thread.interrupted();
                                    if (bl2) break block15;
                                    object2 = abstractFuture.value;
                                    n3 = object2 != null ? 1 : 0;
                                    object = object2 instanceof AbstractFuture$SetFuture ^ n4;
                                    if ((n3 &= object) != 0) {
                                        return abstractFuture.getDoneValue(object2);
                                    }
                                    l4 = System.nanoTime();
                                } while ((object = (Object)((l16 = (l4 = l8 - l4) - l7) == 0L ? 0 : (l16 < 0L ? -1 : 1))) >= 0);
                                abstractFuture.removeWaiter((AbstractFuture$Waiter)object4);
                                break block16;
                            }
                            abstractFuture.removeWaiter((AbstractFuture$Waiter)object4);
                            InterruptedException interruptedException = new InterruptedException();
                            throw interruptedException;
                        } while ((object5 = abstractFuture.waiters) != (object3 = AbstractFuture$Waiter.TOMBSTONE));
                    }
                    Object object6 = abstractFuture.value;
                    Objects.requireNonNull(object6);
                    return abstractFuture.getDoneValue(object6);
                }
            }
            while ((object = (Object)(l4 == l12 ? 0 : (l4 < l12 ? -1 : 1))) > 0) {
                object2 = abstractFuture.value;
                n3 = object2 != null ? 1 : 0;
                object = object2 instanceof AbstractFuture$SetFuture ^ n4;
                if ((n3 &= object) != 0) {
                    return abstractFuture.getDoneValue(object2);
                }
                bl2 = Thread.interrupted();
                if (!bl2) {
                    l4 = System.nanoTime();
                    l4 = l8 - l4;
                    continue;
                }
                InterruptedException interruptedException = new InterruptedException();
                throw interruptedException;
            }
            object5 = this.toString();
            object3 = ((Object)((Object)timeUnit)).toString();
            Locale locale = Locale.ROOT;
            object3 = ((String)object3).toLowerCase(locale);
            String string2 = "Waited ";
            object4 = " ";
            CharSequence charSequence = D70.c(l3, string2, (String)object4);
            Object object7 = ((Object)((Object)timeUnit)).toString().toLowerCase(locale);
            charSequence.append((String)object7);
            charSequence = charSequence.toString();
            l8 = l4 + l7;
            Object object8 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (object8 < 0) {
                long l17;
                long l18;
                charSequence = Ft2.a((String)charSequence, " (plus ");
                l4 = -l4;
                object7 = TimeUnit.NANOSECONDS;
                l8 = timeUnit2.convert(l4, (TimeUnit)((Object)object7));
                long l19 = timeUnit2.toNanos(l8);
                object8 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
                boolean bl5 = object8 == false || (l18 = (l17 = (l4 -= l19) - l7) == 0L ? 0 : (l17 < 0L ? -1 : 1)) > 0;
                if (object8 > 0) {
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)charSequence);
                    ((StringBuilder)object7).append(l8);
                    ((StringBuilder)object7).append((String)object4);
                    ((StringBuilder)object7).append((String)object3);
                    charSequence = ((StringBuilder)object7).toString();
                    if (bl5) {
                        object7 = ",";
                        charSequence = Ft2.a((String)charSequence, (String)object7);
                    }
                    charSequence = Ft2.a((String)charSequence, (String)object4);
                }
                if (bl5) {
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)charSequence);
                    ((StringBuilder)object7).append(l4);
                    ((StringBuilder)object7).append(" nanoseconds ");
                    charSequence = ((StringBuilder)object7).toString();
                }
                object7 = "delay)";
                charSequence = Ft2.a((String)charSequence, (String)object7);
            }
            if ((object8 = (Object)this.isDone()) != false) {
                charSequence = Ft2.a((String)charSequence, " but future completed as timeout expired");
                object7 = new TimeoutException((String)charSequence);
                throw object7;
            }
            charSequence = n1.a((String)charSequence, " for ", (String)object5);
            object7 = new TimeoutException((String)charSequence);
            throw object7;
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public void interruptTask() {
    }

    public boolean isCancelled() {
        return this.value instanceof AbstractFuture$Cancellation;
    }

    public boolean isDone() {
        Object object = this.value;
        boolean bl2 = true;
        boolean bl3 = object != null;
        return (object instanceof AbstractFuture$SetFuture ^ bl2) & bl3;
    }

    public final void maybePropagateCancellationTo(Future future) {
        boolean bl2 = future != null;
        boolean bl3 = this.isCancelled();
        if (bl2 &= bl3) {
            bl2 = this.wasInterrupted();
            future.cancel(bl2);
        }
    }

    public String pendingToString() {
        boolean bl2 = this instanceof ScheduledFuture;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder("remaining delay=[");
            Future future = this;
            future = (ScheduledFuture)((Object)this);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long l2 = future.getDelay(timeUnit);
            stringBuilder.append(l2);
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    public boolean set(Object object) {
        boolean bl2;
        if (object == null) {
            object = NULL;
        }
        if (bl2 = ATOMIC_HELPER.casValue(this, null, object)) {
            AbstractFuture.complete(this, false);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable object) {
        object = (Throwable)Preconditions.checkNotNull(object);
        AbstractFuture$Failure abstractFuture$Failure = new AbstractFuture$Failure((Throwable)object);
        object = ATOMIC_HELPER;
        boolean bl2 = ((AbstractFuture$AtomicHelper)object).casValue(this, null, abstractFuture$Failure);
        abstractFuture$Failure = null;
        if (bl2) {
            AbstractFuture.complete(this, false);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture object) {
        boolean bl2;
        boolean bl3;
        Preconditions.checkNotNull(object);
        Object object2 = this.value;
        Object object3 = null;
        if (object2 == null) {
            bl3 = object.isDone();
            bl2 = true;
            boolean bl4 = false;
            if (bl3) {
                object2 = ATOMIC_HELPER;
                boolean bl5 = ((AbstractFuture$AtomicHelper)object2).casValue(this, null, object = AbstractFuture.getFutureValue((ListenableFuture)object));
                if (bl5) {
                    AbstractFuture.complete(this, false);
                    return bl2;
                }
                return false;
            }
            AbstractFuture$AtomicHelper abstractFuture$AtomicHelper = ATOMIC_HELPER;
            object2 = new AbstractFuture$SetFuture(this, (ListenableFuture)object);
            bl4 = abstractFuture$AtomicHelper.casValue(this, null, object2);
            if (bl4) {
                block12: {
                    AbstractFuture$AtomicHelper abstractFuture$AtomicHelper2;
                    object3 = DirectExecutor.INSTANCE;
                    try {
                        object.addListener((Runnable)object2, (Executor)object3);
                        break block12;
                    }
                    catch (Error error) {
                    }
                    catch (RuntimeException runtimeException) {
                        // empty catch block
                    }
                    try {
                        object3 = new AbstractFuture$Failure((Throwable)((Object)abstractFuture$AtomicHelper2));
                    }
                    catch (Error | RuntimeException throwable) {
                        object3 = AbstractFuture$Failure.FALLBACK_INSTANCE;
                    }
                    abstractFuture$AtomicHelper2 = ATOMIC_HELPER;
                    abstractFuture$AtomicHelper2.casValue(this, object2, object3);
                }
                return bl2;
            }
            object2 = this.value;
        }
        if (bl2 = object2 instanceof AbstractFuture$Cancellation) {
            object2 = (AbstractFuture$Cancellation)object2;
            bl3 = ((AbstractFuture$Cancellation)object2).wasInterrupted;
            object.cancel(bl3);
        }
        return false;
    }

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.getClass().getName();
        boolean bl2 = string3.startsWith(string2 = "com.google.common.util.concurrent.");
        if (bl2) {
            string3 = this.getClass().getSimpleName();
            stringBuilder.append(string3);
        } else {
            string3 = this.getClass().getName();
            stringBuilder.append(string3);
        }
        stringBuilder.append('@');
        string3 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string3);
        string3 = "[status=";
        stringBuilder.append(string3);
        bl2 = this.isCancelled();
        if (bl2) {
            string3 = "CANCELLED";
            stringBuilder.append(string3);
        } else {
            bl2 = this.isDone();
            if (bl2) {
                this.addDoneString(stringBuilder);
            } else {
                this.addPendingString(stringBuilder);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final Throwable tryInternalFastPathGetFailure() {
        Object object;
        boolean bl2;
        boolean bl3 = this instanceof AbstractFuture$Trusted;
        if (bl3 && (bl2 = (object = this.value) instanceof AbstractFuture$Failure)) {
            return ((AbstractFuture$Failure)object).exception;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean wasInterrupted() {
        Object object = this.value;
        boolean bl2 = object instanceof AbstractFuture$Cancellation;
        if (!bl2) return false;
        object = (AbstractFuture$Cancellation)object;
        boolean bl3 = ((AbstractFuture$Cancellation)object).wasInterrupted;
        if (!bl3) return false;
        return true;
    }
}

