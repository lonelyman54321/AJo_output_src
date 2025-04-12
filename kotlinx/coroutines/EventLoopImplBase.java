/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask;
import kotlinx.coroutines.EventLoopImplBase$DelayedTask;
import kotlinx.coroutines.EventLoopImplBase$a;
import kotlinx.coroutines.f;

public abstract class EventLoopImplBase
extends f
implements ao0_1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ AtomicIntegerFieldUpdater h;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<EventLoopImplBase> clazz = EventLoopImplBase.class;
        Class<Object> clazz2 = Object.class;
        f = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_queue$volatile");
        g = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_delayed$volatile");
        h = AtomicIntegerFieldUpdater.newUpdater(clazz, "_isCompleted$volatile");
    }

    public fr0_1 H(long l2, Runnable runnable2, CoroutineContext coroutineContext) {
        return hl0_2.a.H(l2, runnable2, coroutineContext);
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        this.V0(runnable2);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long R0() {
        var1_1 = this.S0();
        var2_2 = 0L;
        if (var1_1 != 0) {
            return var2_2;
        }
        this.W0();
        while (true) {
            block20: {
                block21: {
                    block19: {
                        var4_3 = EventLoopImplBase.f;
                        var5_4 = var4_3.get(this);
                        var6_5 /* !! */  = kt2_2.c;
                        var7_6 = null;
                        if (var5_4 != null) break block19;
                        while (true) {
                            var8_7 = null;
                            ** GOTO lbl39
                            break;
                        }
                    }
                    var9_8 = var5_4 instanceof bw1_2;
                    if (!var9_8) break block20;
                    Intrinsics.checkNotNull(var5_4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                    var10_9 = var5_4;
                    var10_9 = (bw1_2)var5_4;
                    var8_7 = var10_9.d();
                    var11_10 = bw1_2.g;
                    if (var8_7 == var11_10) break block21;
                    var8_7 = (Runnable)var8_7;
                    ** GOTO lbl39
                }
                var10_9 = var10_9.c();
                while ((var12_11 = var4_3.compareAndSet(this, var5_4, var10_9)) == 0 && (var6_5 /* !! */  = var4_3.get(this)) == var5_4) {
                }
                continue;
            }
            if (var5_4 == var6_5 /* !! */ ) ** continue;
            do {
                if (!(var9_8 = var4_3.compareAndSet(this, var5_4, null))) continue;
                var10_9 = "null cannot be cast to non-null type java.lang.Runnable";
                Intrinsics.checkNotNull(var5_4, (String)var10_9);
                var8_7 = var5_4;
                var8_7 = (Runnable)var5_4;
lbl39:
                // 3 sources

                if (var8_7 != null) {
                    var8_7.run();
                    return var2_2;
                }
                var5_4 = this.d;
                var13_12 = 0x7FFFFFFFFFFFFFFFL;
                var15_13 = 0.0 / 0.0;
                if (var5_4 == null) {
                    while (true) {
                        var17_15 = var13_12;
                        break;
                    }
                } else {
                    if (var19_14 = var5_4.isEmpty()) ** continue;
                    var17_15 = var2_2;
                }
                var19_14 = var17_15 == var2_2 ? 0 : (var17_15 < var2_2 ? -1 : 1);
                if (!var19_14) return var2_2;
                if ((var4_3 = var4_3.get(this)) != null) {
                    var19_14 = var4_3 instanceof bw1_2;
                    if (var19_14) {
                        var4_3 = (bw1_2)var4_3;
                        var5_4 = bw1_2.f;
                        var20_16 = var5_4.get(var4_3);
                        var1_1 = (int)(0x3FFFFFFFL & var20_16);
                        var17_15 = 0xFFFFFFFC0000000L;
                        var20_16 &= var17_15;
                        var22_17 = 30;
                        var12_11 = (int)(var20_16 >>= var22_17);
                        if (var1_1 != var12_11) return var2_2;
                    } else {
                        if (var4_3 != var6_5 /* !! */ ) return var2_2;
                        return var13_12;
                    }
                }
                if ((var4_3 = (EventLoopImplBase$a)EventLoopImplBase.g.get(this)) == null) return var13_12;
                synchronized (var4_3) {
                    block18: {
                        var5_4 = var4_3.a;
                        if (var5_4 == null) break block18;
                        var12_11 = 0;
                        var6_5 /* !! */  = null;
                        var7_6 = var5_4[0];
                    }
                    if ((var7_6 = (EventLoopImplBase$DelayedTask)var7_6) == null) ** continue;
                    var20_16 = var7_6.a;
                    var23_18 = System.nanoTime();
                    return kotlin.ranges.f.b(var20_16 -= var23_18, var2_2);
                    finally {
                    }
                }
            } while ((var10_9 = var4_3.get(this)) == var5_4);
        }
    }

    public void V0(Runnable runnable2) {
        this.W0();
        boolean bl2 = this.X0(runnable2);
        if (bl2) {
            runnable2 = this.T0();
            Thread thread2 = Thread.currentThread();
            if (thread2 != runnable2) {
                LockSupport.unpark((Thread)runnable2);
            }
        } else {
            DefaultExecutor defaultExecutor = DefaultExecutor.i;
            defaultExecutor.V0(runnable2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void W0() {
        hn3_0 hn3_02;
        EventLoopImplBase$a eventLoopImplBase$a = (EventLoopImplBase$a)g.get(this);
        if (eventLoopImplBase$a == null) return;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = gn3_0.b;
        int n3 = atomicIntegerFieldUpdater.get(eventLoopImplBase$a);
        if (n3 == 0) {
            return;
        }
        long l2 = System.nanoTime();
        do {
            boolean bl2;
            Object object;
            block11: {
                block10: {
                    // MONITORENTER : eventLoopImplBase$a
                    object = eventLoopImplBase$a.a;
                    hn3_02 = null;
                    if (object != null) {
                        object = object[0];
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null) break block10;
                    continue;
                }
                object = (EventLoopImplBase$DelayedTask)object;
                long l3 = object.a;
                l3 = l2 - l3;
                long l4 = 0L;
                long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l7 < 0) break block11;
                bl2 = this.X0((Runnable)object);
            }
            bl2 = false;
            object = null;
            if (bl2) {
                hn3_02 = eventLoopImplBase$a.c(0);
            }
            // MONITOREXIT : eventLoopImplBase$a
        } while ((hn3_02 = (EventLoopImplBase$DelayedTask)hn3_02) != null);
    }

    public final boolean X0(Runnable runnable2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object v4 = atomicReferenceFieldUpdater.get(this);
            Object object = h;
            boolean bl2 = ((AtomicIntegerFieldUpdater)object).get(this);
            int n3 = 0;
            Runnable runnable3 = null;
            boolean bl3 = true;
            if (bl2 == bl3) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            if (bl2) {
                return false;
            }
            if (v4 == null) {
                do {
                    v4 = null;
                    boolean bl4 = atomicReferenceFieldUpdater.compareAndSet(this, null, runnable2);
                    if (!bl4) continue;
                    return bl3;
                } while ((v4 = atomicReferenceFieldUpdater.get(this)) == null);
                continue;
            }
            bl2 = v4 instanceof bw1_2;
            if (bl2) {
                Intrinsics.checkNotNull(v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                object = v4;
                object = (bw1_2)v4;
                boolean bl5 = ((bw1_2)object).a(runnable2);
                if (bl5) {
                    if (bl5 != bl3) {
                        boolean bl6 = 2 != 0;
                        if (bl5 != bl6) continue;
                        return false;
                    }
                    object = ((bw1_2)object).c();
                    while ((n3 = (int)(atomicReferenceFieldUpdater.compareAndSet(this, v4, object) ? 1 : 0)) == 0 && (runnable3 = atomicReferenceFieldUpdater.get(this)) == v4) {
                    }
                    continue;
                }
                return bl3;
            }
            object = kt2_2.c;
            if (v4 == object) {
                return false;
            }
            n3 = 8;
            object = new bw1_2(n3, bl3);
            Intrinsics.checkNotNull(v4, "null cannot be cast to non-null type java.lang.Runnable");
            runnable3 = (Runnable)v4;
            runnable3 = (Runnable)v4;
            ((bw1_2)object).a(runnable3);
            ((bw1_2)object).a(runnable2);
            do {
                if ((n3 = (int)(atomicReferenceFieldUpdater.compareAndSet(this, v4, object) ? 1 : 0)) == 0) continue;
                return bl3;
            } while ((runnable3 = atomicReferenceFieldUpdater.get(this)) == v4);
        }
    }

    public final boolean Y0() {
        boolean bl2;
        block5: {
            block7: {
                Object object;
                Object object2;
                block6: {
                    object2 = this.d;
                    bl2 = true;
                    int n3 = object2 != null ? ((fp_2)object2).isEmpty() : 1;
                    if (n3 == 0) {
                        return false;
                    }
                    object2 = (EventLoopImplBase$a)g.get(this);
                    if (object2 != null && (n3 = ((AtomicIntegerFieldUpdater)(object = gn3_0.b)).get(object2)) != 0) {
                        return false;
                    }
                    object2 = f.get(this);
                    if (object2 == null) break block5;
                    boolean bl3 = object2 instanceof bw1_2;
                    if (!bl3) break block6;
                    object2 = (bw1_2)object2;
                    object = bw1_2.f;
                    long l2 = ((AtomicLongFieldUpdater)object).get(object2);
                    n3 = (int)(0x3FFFFFFFL & l2);
                    long l3 = 0xFFFFFFFC0000000L;
                    l2 &= l3;
                    int n4 = 30;
                    int n7 = (int)(l2 >>= n4);
                    if (n3 != n7) break block7;
                    break block5;
                }
                object = kt2_2.c;
                if (object2 == object) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z0(long l2, EventLoopImplBase$DelayedTask eventLoopImplBase$DelayedTask) {
        Object object;
        int n3;
        Object object2 = h;
        int n4 = ((AtomicIntegerFieldUpdater)object2).get(this);
        if (n4 == (n3 = 1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        hn3_0 hn3_02 = null;
        if (n4 != 0) {
            n4 = 1;
        } else {
            object2 = (EventLoopImplBase$a)atomicReferenceFieldUpdater.get(this);
            if (object2 == null) {
                EventLoopImplBase$a eventLoopImplBase$a = new gn3_0();
                eventLoopImplBase$a.c = l2;
                while ((n4 = (int)(atomicReferenceFieldUpdater.compareAndSet(this, null, eventLoopImplBase$a) ? 1 : 0)) == 0 && (object2 = atomicReferenceFieldUpdater.get(this)) == null) {
                }
                object2 = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(object2);
                object2 = (EventLoopImplBase$a)object2;
            }
            n4 = eventLoopImplBase$DelayedTask.d(l2, (EventLoopImplBase$a)object2, this);
        }
        if (n4 != 0) {
            if (n4 == n3) {
                this.U0(l2, eventLoopImplBase$DelayedTask);
                return;
            }
            int n7 = 2;
            if (n4 == n7) {
                return;
            }
            String string2 = "unexpected result".toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        Object object3 = (EventLoopImplBase$a)atomicReferenceFieldUpdater.get(this);
        if (object3 != null) {
            synchronized (object3) {
                object = ((gn3_0)object3).a;
                if (object != null) {
                    hn3_02 = object[0];
                }
            }
            hn3_02 = (EventLoopImplBase$DelayedTask)hn3_02;
        }
        if (hn3_02 != eventLoopImplBase$DelayedTask) return;
        object3 = this.T0();
        object = Thread.currentThread();
        if (object == object3) return;
        LockSupport.unpark((Thread)object3);
    }

    public final void l0(long l2, CancellableContinuationImpl cancellableContinuationImpl) {
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            l4 = 9223372036854L;
            long l8 = l2 - l4;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            l4 = object >= 0 ? Long.MAX_VALUE : 1000000L * l2;
        }
        if ((object = (l3 = l4 - (l2 = 0x3FFFFFFFFFFFFFFFL)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            l2 = System.nanoTime();
            EventLoopImplBase$DelayedResumeTask eventLoopImplBase$DelayedResumeTask = new EventLoopImplBase$DelayedResumeTask(this, l4 += l2, cancellableContinuationImpl);
            this.Z0(l2, eventLoopImplBase$DelayedResumeTask);
            mr0_2 mr0_22 = new mr0_2(eventLoopImplBase$DelayedResumeTask);
            dl_2.b(cancellableContinuationImpl, mr0_22);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void shutdown() {
        var1_1 = cn3_0.a;
        var1_1 = cn3_0.a;
        var2_2 = null;
        var1_1.set(null);
        var1_1 = EventLoopImplBase.h;
        var3_4 = true;
        var1_1.set(this, (int)var3_4);
        block6: while (true) {
            var1_1 = EventLoopImplBase.f;
            var4_5 /* !! */  = var1_1.get(this);
            var5_6 = kt2_2.c;
            if (var4_5 /* !! */  == null) {
                while (!(var6_7 = var1_1.compareAndSet(this, null, var5_6))) {
                    var4_5 /* !! */  = var1_1.get(this);
                    if (var4_5 /* !! */  == null) continue;
                    continue block6;
                }
            } else {
                var7_8 = var4_5 /* !! */  instanceof bw1_2;
                if (var7_8 != 0) {
                    var4_5 /* !! */  = (bw1_2)var4_5 /* !! */ ;
                    var4_5 /* !! */ .b();
                } else if (var4_5 /* !! */  != var5_6) {
                    var7_8 = 8;
                    var5_6 = new bw1_2(var7_8, var3_4);
                    Intrinsics.checkNotNull(var4_5 /* !! */ , "null cannot be cast to non-null type java.lang.Runnable");
                    var8_9 /* !! */  = var4_5 /* !! */ ;
                    var8_9 /* !! */  = (Runnable)var4_5 /* !! */ ;
                    var5_6.a(var8_9 /* !! */ );
                    while (true) {
                        var7_8 = (int)var1_1.compareAndSet(this, var4_5 /* !! */ , var5_6);
                        if (var7_8 == 0) continue;
                        break;
                    }
                }
            }
            while ((var13_12 = (cfr_temp_0 = (var9_10 = this.R0()) - (var11_11 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) <= 0) {
            }
            var9_10 = System.nanoTime();
            while ((var1_1 = (EventLoopImplBase$a)EventLoopImplBase.g.get(this)) != null) {
                block17: {
                    synchronized (var1_1) {
                        block16: {
                            try {
                                var5_6 = gn3_0.b;
                            }
                            catch (Throwable var2_3) {}
                            var14_13 = var5_6.get(var1_1);
                            if (var14_13 <= 0) break block16;
                            var14_13 = 0;
                            var5_6 = null;
                            try {
                                var5_6 = var1_1.c(0);
                            }
                            finally {
                                break block17;
                            }
                        }
                        var14_13 = 0;
                        var5_6 = null;
                    }
                }
                var5_6 = (EventLoopImplBase$DelayedTask)var5_6;
                if (var5_6 == null) break;
                this.U0(var9_10, (EventLoopImplBase$DelayedTask)var5_6);
            }
            return;
            if ((var8_9 /* !! */  = var1_1.get(this)) == var4_5 /* !! */ ) ** continue;
        }
    }
}

