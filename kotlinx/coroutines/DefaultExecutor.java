/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask;
import kotlinx.coroutines.EventLoopImplBase$DelayedTask;

public final class DefaultExecutor
extends EventLoopImplBase
implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final DefaultExecutor i;
    public static final long j;

    static {
        Object object = new DefaultExecutor();
        i = object;
        Long l2 = null;
        ((jb0_2)object).P0(false);
        object = TimeUnit.MILLISECONDS;
        long l3 = 1000L;
        String string2 = "kotlinx.coroutines.DefaultExecutor.keepAlive";
        try {
            l2 = Long.getLong(string2, l3);
        }
        catch (SecurityException securityException) {
            l2 = l3;
        }
        l3 = l2;
        j = ((TimeUnit)((Object)object)).toNanos(l3);
    }

    private DefaultExecutor() {
    }

    public final fr0_1 H(long l2, Runnable runnable2, CoroutineContext object) {
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 > 0) {
            l4 = 9223372036854L;
            long l8 = l2 - l4;
            object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            l4 = object2 >= 0 ? Long.MAX_VALUE : 1000000L * l2;
        }
        if ((object2 = (l3 = l4 - (l2 = 0x3FFFFFFFFFFFFFFFL)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            l2 = System.nanoTime();
            object = new EventLoopImplBase$DelayedRunnableTask(l4 += l2, runnable2);
            this.Z0(l2, (EventLoopImplBase$DelayedTask)object);
        } else {
            object = l42_0.a;
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Thread T0() {
        Thread thread2 = _thread;
        if (thread2 != null) return thread2;
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    thread2 = _thread;
                    if (thread2 != null) return thread2;
                    Object object = "kotlinx.coroutines.DefaultExecutor";
                    _thread = thread2 = new Thread((Runnable)this, (String)object);
                    object = i;
                    object = object.getClass();
                    object = ((Class)object).getClassLoader();
                    thread2.setContextClassLoader((ClassLoader)object);
                    boolean bl2 = true;
                    thread2.setDaemon(bl2);
                    thread2.start();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return thread2;
            }
            throw throwable2;
        }
    }

    public final void U0(long l2, EventLoopImplBase$DelayedTask eventLoopImplBase$DelayedTask) {
        RejectedExecutionException rejectedExecutionException = new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        throw rejectedExecutionException;
    }

    public final void V0(Runnable object) {
        int n3 = debugStatus;
        int n4 = 4;
        if (n3 != n4) {
            super.V0((Runnable)object);
            return;
        }
        object = new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a1() {
        synchronized (this) {
            int n3 = debugStatus;
            int n4 = 2;
            int n7 = 3;
            if (n3 != n4) {
                if (n3 != n7) return;
            }
            n3 = 1;
            if (n3 == 0) {
                return;
            }
            debugStatus = n7;
            Object object = EventLoopImplBase.f;
            n4 = 0;
            ((AtomicReferenceFieldUpdater)object).set(this, null);
            object = EventLoopImplBase.g;
            ((AtomicReferenceFieldUpdater)object).set(this, null);
            object = "null cannot be cast to non-null type java.lang.Object";
            Intrinsics.checkNotNull(this, (String)object);
            this.notifyAll();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = this;
        var2_2 = cn3_0.a;
        var2_2.set(this);
        var3_4 = false;
        synchronized (this) {
            var4_5 = DefaultExecutor.debugStatus;
            var5_6 = 3;
            var6_7 = 2;
            var7_8 = 1;
            if (var4_5 != var6_7 && var4_5 != var5_6) {
                var4_5 = 0;
                var2_2 = null;
            } else {
                var4_5 = 1;
            }
            if (var4_5 == 0) ** break block18
        }
        DefaultExecutor._thread = null;
        this.a1();
        var4_5 = (int)this.Y0();
        if (var4_5 == 0) {
            this.T0();
        }
        return;
        {
            DefaultExecutor.debugStatus = var7_8;
            var2_2 = "null cannot be cast to non-null type java.lang.Object";
            Intrinsics.checkNotNull(var1_1, (String)var2_2);
            this.notifyAll();
        }
        var10_10 = var8_9 = 0x7FFFFFFFFFFFFFFFL;
        while (true) {
            block20: {
                block21: {
                    block22: {
                        block19: {
                            try {
                                Thread.interrupted();
                                var12_11 = this.R0();
                                var14_12 = 0L;
                                var4_5 = (int)(var12_11 == var8_9 ? 0 : (var12_11 < var8_9 ? -1 : 1));
                                if (var4_5 != 0) ** GOTO lbl55
                                var16_13 = System.nanoTime();
                                var4_5 = (int)(var10_10 == var8_9 ? 0 : (var10_10 < var8_9 ? -1 : 1));
                                if (var4_5 != 0) break block19;
                                var10_10 = DefaultExecutor.j + var16_13;
                            }
                            catch (Throwable var2_3) {}
                        }
                        if ((var20_15 = (cfr_temp_0 = (var18_14 = var10_10 - var16_13) - var14_12) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) <= 0) {
                            DefaultExecutor._thread = null;
                            this.a1();
                            var4_5 = (int)this.Y0();
                            if (var4_5 == 0) {
                                this.T0();
                            }
                            return;
                        }
                        var12_11 = kotlin.ranges.f.d(var12_11, var18_14);
                        break block22;
lbl55:
                        // 1 sources

                        var10_10 = 0x7FFFFFFFFFFFFFFFL;
                    }
                    var7_8 = (int)(var12_11 == var14_12 ? 0 : (var12_11 < var14_12 ? -1 : 1));
                    if (var7_8 <= 0) break block20;
                    var7_8 = DefaultExecutor.debugStatus;
                    var7_8 = var7_8 != var6_7 && var7_8 != var5_6 ? 0 : 1;
                    if (var7_8 == 0) break block21;
                    DefaultExecutor._thread = null;
                    this.a1();
                    var4_5 = (int)this.Y0();
                    if (var4_5 == 0) {
                        this.T0();
                    }
                    return;
                }
                LockSupport.parkNanos(var1_1, var12_11);
                break;
            }
            var7_8 = 1;
            var8_9 = 0x7FFFFFFFFFFFFFFFL;
        }
        DefaultExecutor._thread = null;
        this.a1();
        var3_4 = this.Y0();
        if (!var3_4) {
            this.T0();
        }
        throw var2_3;
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final String toString() {
        return "DefaultExecutor";
    }
}

