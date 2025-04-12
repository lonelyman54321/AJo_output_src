/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture$SetFuture;
import androidx.concurrent.futures.AbstractResolvableFuture$a;
import androidx.concurrent.futures.AbstractResolvableFuture$b;
import androidx.concurrent.futures.AbstractResolvableFuture$c;
import androidx.concurrent.futures.AbstractResolvableFuture$d;
import androidx.concurrent.futures.AbstractResolvableFuture$e;
import androidx.concurrent.futures.AbstractResolvableFuture$g;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
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

public abstract class AbstractResolvableFuture
implements ListenableFuture {
    static final AbstractResolvableFuture$a ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000L;
    private static final Logger log;
    volatile AbstractResolvableFuture$d listeners;
    volatile Object value;
    volatile AbstractResolvableFuture$g waiters;

    static {
        boolean bl2;
        Class clazz = AbstractResolvableFuture$g.class;
        GENERATE_CANCELLATION_CAUSES = bl2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        Object object = AbstractResolvableFuture.class;
        Object object2 = Logger.getLogger(((Class)object).getName());
        log = object2;
        Object object3 = Thread.class;
        Object object4 = "a";
        object4 = AtomicReferenceFieldUpdater.newUpdater(clazz, object3, (String)object4);
        object3 = "b";
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz, (String)object3);
        object3 = "waiters";
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AtomicReferenceFieldUpdater.newUpdater(object, clazz, (String)object3);
        clazz = AbstractResolvableFuture$d.class;
        object3 = "listeners";
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = AtomicReferenceFieldUpdater.newUpdater(object, clazz, (String)object3);
        clazz = Object.class;
        object3 = "value";
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AtomicReferenceFieldUpdater.newUpdater(object, clazz, (String)object3);
        object3 = object2;
        try {
            object2 = new AbstractResolvableFuture$e((AtomicReferenceFieldUpdater)object4, atomicReferenceFieldUpdater, atomicReferenceFieldUpdater2, atomicReferenceFieldUpdater3, atomicReferenceFieldUpdater4);
            clazz = null;
        }
        catch (Throwable throwable) {
            object2 = new Object();
        }
        ATOMIC_HELPER = object2;
        if (clazz != null) {
            object = log;
            object2 = Level.SEVERE;
            object3 = "SafeAtomicHelper is broken!";
            ((Logger)object).log((Level)object2, (String)object3, (Throwable)((Object)clazz));
        }
        clazz = new Class();
        NULL = clazz;
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
                Object object = AbstractResolvableFuture.getUninterruptibly(this);
                String string2 = "SUCCESS, result=[";
                stringBuilder.append(string2);
                object = this.userObjectToString(object);
                stringBuilder.append((String)object);
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

    private static CancellationException cancellationExceptionWithCause(String string2, Throwable throwable) {
        CancellationException cancellationException = new CancellationException(string2);
        cancellationException.initCause(throwable);
        return cancellationException;
    }

    public static Object checkNotNull(Object object) {
        object.getClass();
        return object;
    }

    private AbstractResolvableFuture$d clearListeners(AbstractResolvableFuture$d object) {
        AbstractResolvableFuture$d abstractResolvableFuture$d;
        AbstractResolvableFuture$d abstractResolvableFuture$d2;
        Object object2;
        boolean bl2;
        while (!(bl2 = ((AbstractResolvableFuture$a)(object2 = ATOMIC_HELPER)).a(this, abstractResolvableFuture$d2 = this.listeners, abstractResolvableFuture$d = AbstractResolvableFuture$d.d))) {
        }
        AbstractResolvableFuture$d abstractResolvableFuture$d3 = abstractResolvableFuture$d2;
        abstractResolvableFuture$d2 = object;
        object = abstractResolvableFuture$d3;
        while (object != null) {
            object2 = ((AbstractResolvableFuture$d)object).c;
            ((AbstractResolvableFuture$d)object).c = abstractResolvableFuture$d2;
            abstractResolvableFuture$d2 = object;
            object = object2;
        }
        return abstractResolvableFuture$d2;
    }

    public static void complete(AbstractResolvableFuture object) {
        AbstractResolvableFuture$d abstractResolvableFuture$d = null;
        block0: while (true) {
            ((AbstractResolvableFuture)object).releaseWaiters();
            ((AbstractResolvableFuture)object).afterDone();
            object = ((AbstractResolvableFuture)object).clearListeners(abstractResolvableFuture$d);
            while (object != null) {
                abstractResolvableFuture$d = ((AbstractResolvableFuture$d)object).c;
                Runnable runnable2 = ((AbstractResolvableFuture$d)object).a;
                boolean bl2 = runnable2 instanceof AbstractResolvableFuture$SetFuture;
                if (bl2) {
                    AbstractResolvableFuture$a abstractResolvableFuture$a;
                    boolean bl3;
                    runnable2 = (AbstractResolvableFuture$SetFuture)runnable2;
                    object = ((AbstractResolvableFuture$SetFuture)runnable2).a;
                    Object object2 = ((AbstractResolvableFuture)object).value;
                    if (object2 == runnable2 && (bl3 = (abstractResolvableFuture$a = ATOMIC_HELPER).b((AbstractResolvableFuture)object, runnable2, object2 = AbstractResolvableFuture.getFutureValue(((AbstractResolvableFuture$SetFuture)runnable2).b)))) {
                        continue block0;
                    }
                } else {
                    object = ((AbstractResolvableFuture$d)object).b;
                    AbstractResolvableFuture.executeListener(runnable2, (Executor)object);
                }
                object = abstractResolvableFuture$d;
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
        boolean bl2 = object instanceof AbstractResolvableFuture$b;
        if (!bl2) {
            bl2 = object instanceof AbstractResolvableFuture$c;
            if (!bl2) {
                Object object2 = NULL;
                if (object == object2) {
                    object = null;
                }
                return object;
            }
            object = ((AbstractResolvableFuture$c)object).a;
            ExecutionException executionException = new ExecutionException((Throwable)object);
            throw executionException;
        }
        object = ((AbstractResolvableFuture$b)object).b;
        throw AbstractResolvableFuture.cancellationExceptionWithCause("Task was cancelled.", (Throwable)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object getFutureValue(ListenableFuture object) {
        boolean bl2 = object instanceof AbstractResolvableFuture;
        IllegalArgumentException illegalArgumentException = null;
        if (bl2) {
            object = ((AbstractResolvableFuture)object).value;
            bl2 = object instanceof AbstractResolvableFuture$b;
            if (!bl2) return object;
            Object object2 = object;
            object2 = (AbstractResolvableFuture$b)object;
            boolean bl3 = ((AbstractResolvableFuture$b)object2).a;
            if (!bl3) return object;
            object = ((AbstractResolvableFuture$b)object2).b;
            if (object == null) return AbstractResolvableFuture$b.d;
            object2 = (CancellationException)((AbstractResolvableFuture$b)object2).b;
            return new AbstractResolvableFuture$b(false, (CancellationException)object2);
        }
        bl2 = object.isCancelled();
        boolean bl4 = (GENERATE_CANCELLATION_CAUSES ^ true) & bl2;
        if (bl4) {
            return AbstractResolvableFuture$b.d;
        }
        Object object3 = AbstractResolvableFuture.getUninterruptibly((Future)object);
        if (object3 != null) return object3;
        try {
            object3 = NULL;
            return object3;
        }
        catch (Throwable throwable) {}
        catch (CancellationException cancellationException) {}
        catch (ExecutionException executionException) {}
        finally {
            return object3;
        }
    }

    public static Object getUninterruptibly(Future future) {
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
        AbstractResolvableFuture$g abstractResolvableFuture$g;
        AbstractResolvableFuture$g abstractResolvableFuture$g2;
        Object object;
        boolean bl2;
        while (!(bl2 = ((AbstractResolvableFuture$a)(object = ATOMIC_HELPER)).c(this, abstractResolvableFuture$g2 = this.waiters, abstractResolvableFuture$g = AbstractResolvableFuture$g.c))) {
        }
        while (abstractResolvableFuture$g2 != null) {
            object = abstractResolvableFuture$g2.a;
            if (object != null) {
                abstractResolvableFuture$g = null;
                abstractResolvableFuture$g2.a = null;
                LockSupport.unpark((Thread)object);
            }
            abstractResolvableFuture$g2 = abstractResolvableFuture$g2.b;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void removeWaiter(AbstractResolvableFuture$g var1_1) {
        var1_1.a = null;
        block0: while (true) {
            if ((var1_1 = this.waiters) == (var2_2 = AbstractResolvableFuture$g.c)) {
                return;
            }
            var2_2 = null;
            while (var1_1 != null) {
                var3_3 = var1_1.b;
                var4_4 = var1_1.a;
                if (var4_4 != null) {
                    var2_2 = var1_1;
                } else if (var2_2 != null) {
                    var2_2.b = var3_3;
                    var1_1 = var2_2.a;
                    if (var1_1 == null) {
                        continue block0;
                    }
                } else {
                    var4_4 = AbstractResolvableFuture.ATOMIC_HELPER;
                    var5_5 = var4_4.c(this, (AbstractResolvableFuture$g)var1_1, var3_3);
                    if (var5_5) ** break;
                    continue block0;
                }
                var1_1 = var3_3;
            }
            break;
        }
    }

    private String userObjectToString(Object object) {
        if (object == this) {
            return "this future";
        }
        return String.valueOf(object);
    }

    public final void addListener(Runnable runnable2, Executor executor) {
        AbstractResolvableFuture.checkNotNull(runnable2);
        AbstractResolvableFuture.checkNotNull(executor);
        AbstractResolvableFuture$d abstractResolvableFuture$d = this.listeners;
        AbstractResolvableFuture$d abstractResolvableFuture$d2 = AbstractResolvableFuture$d.d;
        if (abstractResolvableFuture$d != abstractResolvableFuture$d2) {
            AbstractResolvableFuture$d abstractResolvableFuture$d3 = new AbstractResolvableFuture$d(runnable2, executor);
            do {
                abstractResolvableFuture$d3.c = abstractResolvableFuture$d;
                AbstractResolvableFuture$a abstractResolvableFuture$a = ATOMIC_HELPER;
                boolean bl2 = abstractResolvableFuture$a.a(this, abstractResolvableFuture$d, abstractResolvableFuture$d3);
                if (!bl2) continue;
                return;
            } while ((abstractResolvableFuture$d = this.listeners) != abstractResolvableFuture$d2);
        }
        AbstractResolvableFuture.executeListener(runnable2, executor);
    }

    public void afterDone() {
    }

    public final boolean cancel(boolean bl2) {
        boolean bl3;
        block15: {
            AbstractResolvableFuture$b abstractResolvableFuture$b;
            boolean bl4;
            Object object = this.value;
            bl3 = true;
            if (object == null) {
                bl4 = true;
            } else {
                bl4 = false;
                abstractResolvableFuture$b = null;
            }
            boolean bl5 = object instanceof AbstractResolvableFuture$SetFuture;
            if (bl4 |= bl5) {
                Object object2;
                String string2;
                bl4 = GENERATE_CANCELLATION_CAUSES;
                if (bl4) {
                    string2 = "Future.cancel() was called.";
                    object2 = new CancellationException(string2);
                    abstractResolvableFuture$b = new AbstractResolvableFuture$b(bl2, (CancellationException)object2);
                } else {
                    abstractResolvableFuture$b = bl2 ? AbstractResolvableFuture$b.c : AbstractResolvableFuture$b.d;
                }
                boolean bl6 = false;
                string2 = null;
                object2 = this;
                while (true) {
                    AbstractResolvableFuture$a abstractResolvableFuture$a;
                    boolean bl7;
                    if (bl7 = (abstractResolvableFuture$a = ATOMIC_HELPER).b((AbstractResolvableFuture)object2, object, abstractResolvableFuture$b)) {
                        if (bl2) {
                            ((AbstractResolvableFuture)object2).interruptTask();
                        }
                        AbstractResolvableFuture.complete((AbstractResolvableFuture)object2);
                        bl5 = object instanceof AbstractResolvableFuture$SetFuture;
                        if (bl5) {
                            object = ((AbstractResolvableFuture$SetFuture)object).b;
                            bl5 = object instanceof AbstractResolvableFuture;
                            if (bl5) {
                                object2 = object;
                                object2 = (AbstractResolvableFuture)object;
                                object = ((AbstractResolvableFuture)object2).value;
                                if (object == null) {
                                    bl6 = true;
                                } else {
                                    bl6 = false;
                                    string2 = null;
                                }
                                bl7 = object instanceof AbstractResolvableFuture$SetFuture;
                                if (bl6 |= bl7) {
                                    bl6 = true;
                                    continue;
                                }
                            } else {
                                object.cancel(bl2);
                            }
                        }
                        break block15;
                    }
                    object = ((AbstractResolvableFuture)object2).value;
                    bl7 = object instanceof AbstractResolvableFuture$SetFuture;
                    if (!bl7) break;
                }
                bl3 = bl6;
            } else {
                bl3 = false;
            }
        }
        return bl3;
    }

    public final Object get() {
        boolean bl2 = Thread.interrupted();
        if (!bl2) {
            AbstractResolvableFuture$g abstractResolvableFuture$g;
            boolean bl3;
            Object object = this.value;
            boolean bl4 = true;
            if (object != null) {
                bl3 = true;
            } else {
                bl3 = false;
                abstractResolvableFuture$g = null;
            }
            boolean bl5 = object instanceof AbstractResolvableFuture$SetFuture ^ bl4;
            if (bl3 &= bl5) {
                return this.getDoneValue(object);
            }
            object = this.waiters;
            abstractResolvableFuture$g = AbstractResolvableFuture$g.c;
            if (object != abstractResolvableFuture$g) {
                AbstractResolvableFuture$g abstractResolvableFuture$g2 = new AbstractResolvableFuture$g();
                do {
                    block8: {
                        boolean bl6;
                        AbstractResolvableFuture$a abstractResolvableFuture$a = ATOMIC_HELPER;
                        abstractResolvableFuture$a.d(abstractResolvableFuture$g2, (AbstractResolvableFuture$g)object);
                        bl2 = abstractResolvableFuture$a.c(this, (AbstractResolvableFuture$g)object, abstractResolvableFuture$g2);
                        if (!bl2) continue;
                        do {
                            LockSupport.park(this);
                            bl2 = Thread.interrupted();
                            if (bl2) break block8;
                            object = this.value;
                            if (object != null) {
                                bl3 = true;
                                continue;
                            }
                            bl3 = false;
                            abstractResolvableFuture$g = null;
                        } while (!(bl3 &= (bl6 = object instanceof AbstractResolvableFuture$SetFuture ^ bl4)));
                        return this.getDoneValue(object);
                    }
                    this.removeWaiter(abstractResolvableFuture$g2);
                    object = new InterruptedException();
                    throw object;
                } while ((object = this.waiters) != abstractResolvableFuture$g);
            }
            object = this.value;
            return this.getDoneValue(object);
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object get(long var1_1, TimeUnit var3_2) {
        var4_3 = this;
        var5_4 = var1_1;
        var7_5 = var3_2;
        var8_6 = var3_2.toNanos(var1_1);
        var10_7 /* !! */  = Thread.interrupted();
        if (var10_7 /* !! */  == 0) {
            block19: {
                var11_8 = this.value;
                var12_9 = 1;
                if (var11_8 != null) {
                    var13_10 = 1;
                } else {
                    var13_10 = 0;
                    var14_11 = null;
                }
                var15_12 = var11_8 instanceof AbstractResolvableFuture$SetFuture ^ var12_9;
                if ((var13_10 &= var15_12) != 0) {
                    return var4_3.getDoneValue(var11_8);
                }
                var16_13 = 0L;
                cfr_temp_0 = var8_6 - var16_13;
                var10_7 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                var18_14 = var10_7 /* !! */  > 0 ? System.nanoTime() + var8_6 : var16_13;
                var20_15 = 1000L;
                cfr_temp_1 = var8_6 - var20_15;
                var10_7 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                if (var10_7 /* !! */  >= 0) {
                    var11_8 = var4_3.waiters;
                    var22_16 = AbstractResolvableFuture$g.c;
                    if (var11_8 != var22_16) {
                        var23_17 = new AbstractResolvableFuture$g();
                        do {
                            block18: {
                                var14_11 = AbstractResolvableFuture.ATOMIC_HELPER;
                                var14_11.d((AbstractResolvableFuture$g)var23_17, (AbstractResolvableFuture$g)var11_8);
                                var10_7 /* !! */  = (int)var14_11.c(var4_3, (AbstractResolvableFuture$g)var11_8, (AbstractResolvableFuture$g)var23_17);
                                if (var10_7 /* !! */  == 0) continue;
                                do {
                                    LockSupport.parkNanos(var4_3, var8_6);
                                    var24_18 = Thread.interrupted();
                                    if (var24_18) break block18;
                                    var25_19 = var4_3.value;
                                    var26_20 = var25_19 != null ? 1 : 0;
                                    var10_7 /* !! */  = var25_19 instanceof AbstractResolvableFuture$SetFuture ^ var12_9;
                                    if ((var26_20 &= var10_7 /* !! */ ) != 0) {
                                        return var4_3.getDoneValue(var25_19);
                                    }
                                    var8_6 = System.nanoTime();
                                } while ((var10_7 /* !! */  = (int)((cfr_temp_2 = (var8_6 = var18_14 - var8_6) - var20_15) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0);
                                var4_3.removeWaiter((AbstractResolvableFuture$g)var23_17);
lbl46:
                                // 2 sources

                                while (true) {
                                    var27_21 = 0L;
                                    break block19;
                                    break;
                                }
                            }
                            var4_3.removeWaiter((AbstractResolvableFuture$g)var23_17);
                            var29_22 = new InterruptedException();
                            throw var29_22;
                        } while ((var11_8 = var4_3.waiters) != var22_16);
                    }
                    var29_23 = var4_3.value;
                    return var4_3.getDoneValue(var29_23);
                }
                var27_21 = var16_13;
            }
            var13_10 = var8_6 == var27_21 ? 0 : (var8_6 < var27_21 ? -1 : 1);
            if (var13_10 > 0) {
                var25_19 = var4_3.value;
                var26_20 = var25_19 != null ? 1 : 0;
                var10_7 /* !! */  = var25_19 instanceof AbstractResolvableFuture$SetFuture ^ var12_9;
                if ((var26_20 &= var10_7 /* !! */ ) != 0) {
                    return var4_3.getDoneValue(var25_19);
                }
                var24_18 = Thread.interrupted();
                if (!var24_18) {
                    var8_6 = System.nanoTime();
                    var8_6 = var18_14 - var8_6;
                    ** continue;
                }
                var29_24 = new InterruptedException();
                throw var29_24;
            }
            var11_8 = this.toString();
            var23_17 = var3_2.toString();
            var14_11 = Locale.ROOT;
            var23_17 = var23_17.toLowerCase((Locale)var14_11);
            var30_27 = "Waited ";
            var31_28 = " ";
            var29_25 /* !! */  = D70.c(var5_4, var30_27, var31_28);
            var32_29 = var3_2.toString().toLowerCase((Locale)var14_11);
            var29_25 /* !! */ .append((String)var32_29);
            var29_25 /* !! */  = var29_25 /* !! */ .toString();
            var16_13 = var8_6 + var20_15;
            var33_30 = 0L;
            var35_31 /* !! */  = var16_13 == var33_30 ? 0 : (var16_13 < var33_30 ? -1 : 1);
            if (var35_31 /* !! */  < 0) {
                var29_25 /* !! */  = Ft2.a((String)var29_25 /* !! */ , " (plus ");
                var8_6 = -var8_6;
                var32_29 = TimeUnit.NANOSECONDS;
                var16_13 = var7_5.convert(var8_6, (TimeUnit)var32_29);
                var36_32 = var7_5.toNanos(var16_13);
                var35_31 /* !! */  = (long)(var16_13 == var33_30 ? 0 : (var16_13 < var33_30 ? -1 : 1));
                var39_34 = var35_31 /* !! */  == false || (var38_33 = (cfr_temp_3 = (var8_6 -= var36_32) - var20_15) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) > 0;
                if (var35_31 /* !! */  > 0) {
                    var32_29 = new StringBuilder();
                    var32_29.append((String)var29_25 /* !! */ );
                    var32_29.append(var16_13);
                    var32_29.append(var31_28);
                    var32_29.append((String)var23_17);
                    var29_25 /* !! */  = var32_29.toString();
                    if (var39_34) {
                        var32_29 = ",";
                        var29_25 /* !! */  = Ft2.a((String)var29_25 /* !! */ , (String)var32_29);
                    }
                    var29_25 /* !! */  = Ft2.a((String)var29_25 /* !! */ , var31_28);
                }
                if (var39_34) {
                    var32_29 = new StringBuilder();
                    var32_29.append((String)var29_25 /* !! */ );
                    var32_29.append(var8_6);
                    var32_29.append(" nanoseconds ");
                    var29_25 /* !! */  = var32_29.toString();
                }
                var32_29 = "delay)";
                var29_25 /* !! */  = Ft2.a((String)var29_25 /* !! */ , (String)var32_29);
            }
            if ((var35_31 /* !! */  = (long)this.isDone()) != false) {
                var29_25 /* !! */  = Ft2.a((String)var29_25 /* !! */ , " but future completed as timeout expired");
                var32_29 = new TimeoutException((String)var29_25 /* !! */ );
                throw var32_29;
            }
            var29_25 /* !! */  = n1.a((String)var29_25 /* !! */ , " for ", (String)var11_8);
            var32_29 = new TimeoutException((String)var29_25 /* !! */ );
            throw var32_29;
        }
        var29_26 = new InterruptedException();
        throw var29_26;
    }

    public void interruptTask() {
    }

    public final boolean isCancelled() {
        return this.value instanceof AbstractResolvableFuture$b;
    }

    public final boolean isDone() {
        Object object = this.value;
        boolean bl2 = true;
        boolean bl3 = object != null;
        return (object instanceof AbstractResolvableFuture$SetFuture ^ bl2) & bl3;
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
        Object object = this.value;
        boolean bl2 = object instanceof AbstractResolvableFuture$SetFuture;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder("setFuture=[");
            object = ((AbstractResolvableFuture$SetFuture)object).b;
            object = this.userObjectToString(object);
            return h30_0.a(stringBuilder, (String)object, "]");
        }
        boolean bl3 = this instanceof ScheduledFuture;
        if (bl3) {
            object = new StringBuilder("remaining delay=[");
            Future future = this;
            future = (ScheduledFuture)((Object)this);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long l2 = future.getDelay(timeUnit);
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append(" ms]");
            return ((StringBuilder)object).toString();
        }
        return null;
    }

    public boolean set(Object object) {
        AbstractResolvableFuture$a abstractResolvableFuture$a;
        boolean bl2;
        if (object == null) {
            object = NULL;
        }
        if (bl2 = (abstractResolvableFuture$a = ATOMIC_HELPER).b(this, null, object)) {
            AbstractResolvableFuture.complete(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable object) {
        object = (Throwable)AbstractResolvableFuture.checkNotNull(object);
        object = ATOMIC_HELPER;
        AbstractResolvableFuture$c abstractResolvableFuture$c = new AbstractResolvableFuture$c((Throwable)object);
        boolean bl2 = ((AbstractResolvableFuture$a)object).b(this, null, abstractResolvableFuture$c);
        if (bl2) {
            AbstractResolvableFuture.complete(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture object) {
        boolean bl2;
        boolean bl3;
        AbstractResolvableFuture.checkNotNull(object);
        Object object2 = this.value;
        Object object3 = null;
        if (object2 == null) {
            bl3 = object.isDone();
            bl2 = true;
            boolean bl4 = false;
            if (bl3) {
                object2 = ATOMIC_HELPER;
                boolean bl5 = ((AbstractResolvableFuture$a)object2).b(this, null, object = AbstractResolvableFuture.getFutureValue((ListenableFuture)object));
                if (bl5) {
                    AbstractResolvableFuture.complete(this);
                    return bl2;
                }
                return false;
            }
            AbstractResolvableFuture$a abstractResolvableFuture$a = ATOMIC_HELPER;
            object2 = new AbstractResolvableFuture$SetFuture(this, (ListenableFuture)object);
            bl4 = abstractResolvableFuture$a.b(this, null, object2);
            if (bl4) {
                object3 = Eq0.INSTANCE;
                try {
                    object.addListener((Runnable)object2, (Executor)object3);
                }
                catch (Throwable throwable) {
                    try {
                        object3 = new AbstractResolvableFuture$c(throwable);
                    }
                    catch (Throwable throwable2) {
                        object3 = AbstractResolvableFuture$c.b;
                    }
                    AbstractResolvableFuture$a abstractResolvableFuture$a2 = ATOMIC_HELPER;
                    abstractResolvableFuture$a2.b(this, object2, object3);
                }
                return bl2;
            }
            object2 = this.value;
        }
        if (bl2 = object2 instanceof AbstractResolvableFuture$b) {
            object2 = (AbstractResolvableFuture$b)object2;
            bl3 = ((AbstractResolvableFuture$b)object2).a;
            object.cancel(bl3);
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = super.toString();
        stringBuilder.append((String)object);
        object = "[status=";
        stringBuilder.append((String)object);
        boolean bl2 = this.isCancelled();
        String string2 = "]";
        if (bl2) {
            object = "CANCELLED";
            stringBuilder.append((String)object);
        } else {
            bl2 = this.isDone();
            if (bl2) {
                this.addDoneString(stringBuilder);
            } else {
                boolean bl3;
                CharSequence charSequence;
                try {
                    object = this.pendingToString();
                }
                catch (RuntimeException runtimeException) {
                    String string3 = "Exception thrown from implementation: ";
                    charSequence = new StringBuilder(string3);
                    object = runtimeException.getClass();
                    ((StringBuilder)charSequence).append(object);
                    object = ((StringBuilder)charSequence).toString();
                }
                if (object != null && !(bl3 = ((String)object).isEmpty())) {
                    charSequence = "PENDING, info=[";
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append((String)object);
                    stringBuilder.append(string2);
                } else {
                    bl2 = this.isDone();
                    if (bl2) {
                        this.addDoneString(stringBuilder);
                    } else {
                        object = "PENDING";
                        stringBuilder.append((String)object);
                    }
                }
            }
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean wasInterrupted() {
        Object object = this.value;
        boolean bl2 = object instanceof AbstractResolvableFuture$b;
        if (!bl2) return false;
        object = (AbstractResolvableFuture$b)object;
        boolean bl3 = ((AbstractResolvableFuture$b)object).a;
        if (!bl3) return false;
        return true;
    }
}

