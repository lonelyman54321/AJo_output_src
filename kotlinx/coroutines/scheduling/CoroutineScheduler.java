/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.CoroutineScheduler$Worker;
import kotlinx.coroutines.scheduling.CoroutineScheduler$a;
import kotlinx.coroutines.scheduling.CoroutineScheduler$b;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskImpl;

public final class CoroutineScheduler
implements Executor,
Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final /* synthetic */ AtomicLongFieldUpdater i;
    public static final /* synthetic */ AtomicIntegerFieldUpdater j;
    public static final gh3_2 k;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final d01_0 e;
    public final d01_0 f;
    public final sk2_2 g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        gh3_2 gh3_22;
        Class<CoroutineScheduler> clazz = CoroutineScheduler.class;
        h = AtomicLongFieldUpdater.newUpdater(clazz, "parkedWorkersStack$volatile");
        i = AtomicLongFieldUpdater.newUpdater(clazz, "controlState$volatile");
        j = AtomicIntegerFieldUpdater.newUpdater(clazz, "_isTerminated$volatile");
        k = gh3_22 = new gh3_2("NOT_IN_STACK");
    }

    public CoroutineScheduler(int n3, int n4, String string2, long l2) {
        this.a = n3;
        this.b = n4;
        this.c = l2;
        this.d = string2;
        int n7 = 1;
        if (n3 >= n7) {
            string2 = "Max pool size ";
            if (n4 >= n3) {
                int n8 = 0x1FFFFE;
                if (n4 <= n8) {
                    long l3 = 0L;
                    long l4 = l2 - l3;
                    n8 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                    if (n8 > 0) {
                        long l7;
                        Object object;
                        this.e = object;
                        super();
                        this.f = object;
                        n7 = (n3 + 1) * 2;
                        this.g = object = new sk2_2(n7);
                        this.controlState$volatile = l7 = (long)n3 << 42;
                        return;
                    }
                    String string3 = Ov2.a(l2, "Idle worker keep alive time ", " must be positive");
                    string3 = string3.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                    throw illegalArgumentException;
                }
                String string4 = Gj0.b(n4, string2, " should not exceed maximal supported number of threads 2097150");
                string4 = string4.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
                throw illegalArgumentException;
            }
            String string5 = D70.b(n4, n3, string2, " should be greater than or equals to core pool size ");
            string5 = string5.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string5);
            throw illegalArgumentException;
        }
        String string6 = Gj0.b(n3, "Core pool size ", " should be at least 1");
        string6 = string6.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string6);
        throw illegalArgumentException;
    }

    public static /* synthetic */ void c(CoroutineScheduler coroutineScheduler, Runnable runnable2, boolean bl2, int n3) {
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        coroutineScheduler.b(runnable2, false, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        sk2_2 sk2_22 = this.g;
        synchronized (sk2_22) {
            Throwable throwable2;
            block16: {
                IllegalArgumentException illegalArgumentException;
                Object object;
                block15: {
                    long l2;
                    long l3;
                    int n3;
                    int n4;
                    int n7;
                    block14: {
                        int n8;
                        int n10;
                        block13: {
                            block12: {
                                try {
                                    object = j;
                                    n7 = ((AtomicIntegerFieldUpdater)object).get(this);
                                    n4 = 0;
                                    illegalArgumentException = null;
                                    n3 = 1;
                                    if (n7 == n3) {
                                        return -1;
                                    }
                                    n7 = 0;
                                    object = null;
                                    if (n7 == 0) break block12;
                                }
                                catch (Throwable throwable2) {}
                                return -1;
                            }
                            object = i;
                            long l4 = ((AtomicLongFieldUpdater)object).get(this);
                            l3 = 0x1FFFFFL;
                            l2 = l4 & l3;
                            n10 = (int)l2;
                            long l7 = 4398044413952L;
                            l4 &= l7;
                            int n14 = 21;
                            n8 = (int)(l4 >>= n14);
                            int n15 = n10 - n8;
                            if (n15 < 0) {
                                n15 = 0;
                            }
                            n8 = this.a;
                            if (n15 < n8) break block13;
                            return 0;
                        }
                        n8 = this.b;
                        if (n10 < n8) break block14;
                        return 0;
                    }
                    l2 = ((AtomicLongFieldUpdater)object).get(this) & l3;
                    n4 = (int)l2 + n3;
                    if (n4 <= 0) break block15;
                    Object object2 = this.g;
                    object2 = ((sk2_2)object2).b(n4);
                    if (object2 != null) break block15;
                    object2 = new CoroutineScheduler$Worker(this, n4);
                    sk2_2 sk2_23 = this.g;
                    sk2_23.c(n4, (CoroutineScheduler$Worker)object2);
                    l2 = ((AtomicLongFieldUpdater)object).incrementAndGet(this);
                    n7 = (int)(l3 &= l2);
                    if (n4 == n7) {
                        // MONITOREXIT @DISABLED, blocks:[7, 9] lbl53 : MonitorExitStatement: MONITOREXIT : var1_1
                        ((Thread)object2).start();
                        return n15 += n3;
                    }
                    object = "Failed requirement.";
                    object = object.toString();
                    illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                    break block16;
                }
                object = "Failed requirement.";
                object = object.toString();
                illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            throw throwable2;
        }
    }

    public final void b(Runnable object, boolean bl2, boolean bl3) {
        boolean bl4;
        Object object2;
        boolean bl5;
        CoroutineScheduler$b coroutineScheduler$b;
        Object object3;
        Object object4 = xi3_2.f;
        object4.getClass();
        long l2 = System.nanoTime();
        boolean bl6 = object instanceof Task;
        if (bl6) {
            object = (Task)object;
            ((Task)object).a = l2;
            ((Task)object).b = bl2;
        } else {
            TaskImpl taskImpl = new TaskImpl((Runnable)object, l2, bl2);
            object = taskImpl;
        }
        bl2 = ((Task)object).b;
        object4 = i;
        long l3 = bl2 ? ((AtomicLongFieldUpdater)object4).addAndGet(this, 0x200000L) : 0L;
        Object object5 = Thread.currentThread();
        boolean bl7 = object5 instanceof CoroutineScheduler$Worker;
        object5 = bl7 ? (CoroutineScheduler$Worker)object5 : null;
        if (object5 == null || !(bl7 = Intrinsics.areEqual(object3 = ((CoroutineScheduler$Worker)object5).h, this))) {
            object5 = null;
        }
        if (object5 != null && (object3 = ((CoroutineScheduler$Worker)object5).c) != (coroutineScheduler$b = CoroutineScheduler$b.TERMINATED) && ((bl5 = ((Task)object).b) || object3 != (coroutineScheduler$b = CoroutineScheduler$b.BLOCKING))) {
            ((CoroutineScheduler$Worker)object5).g = bl7 = true;
            object5 = ((CoroutineScheduler$Worker)object5).a;
            if (bl3) {
                object = ((bi3_1)object5).a((Task)object);
            } else {
                object5.getClass();
                object2 = bi3_1.b;
                object = (Task)((AtomicReferenceFieldUpdater)object2).getAndSet(object5, object);
                if (object == null) {
                    bl4 = false;
                    object = null;
                } else {
                    object = ((bi3_1)object5).a((Task)object);
                }
            }
        }
        if (object != null) {
            bl3 = ((Task)object).b;
            if (bl3) {
                object2 = this.f;
                bl4 = ((aw1_2)object2).a(object);
            } else {
                object2 = this.e;
                bl4 = ((aw1_2)object2).a(object);
            }
            if (!bl4) {
                CharSequence charSequence = new StringBuilder();
                object2 = this.d;
                charSequence = h30_0.a(charSequence, (String)object2, " was terminated");
                object = new RejectedExecutionException((String)charSequence);
                throw object;
            }
        }
        if (bl2) {
            bl4 = this.n();
            if (!bl4 && !(bl4 = this.k(l3))) {
                this.n();
            }
        } else {
            long l4;
            bl4 = this.n();
            if (!bl4 && !(bl4 = this.k(l4 = ((AtomicLongFieldUpdater)object4).get(this)))) {
                this.n();
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void close() {
        CoroutineScheduler coroutineScheduler;
        Object object = j;
        int n3 = 0;
        Object var3_3 = null;
        int n4 = 1;
        boolean bl2 = ((AtomicIntegerFieldUpdater)object).compareAndSet(this, 0, n4);
        if (!bl2) {
            return;
        }
        object = Thread.currentThread();
        n3 = object instanceof CoroutineScheduler$Worker;
        Thread thread2 = null;
        if (n3 != 0) {
            object = (CoroutineScheduler$Worker)object;
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null || (n3 = Intrinsics.areEqual(coroutineScheduler = ((CoroutineScheduler$Worker)object).h, this)) == 0) {
            bl2 = false;
            object = null;
        }
        sk2_2 sk2_22 = this.g;
        // MONITORENTER : sk2_22
        Object object2 = i;
        long l2 = ((AtomicLongFieldUpdater)object2).get(this);
        long l3 = 0x1FFFFFL;
        int n7 = (int)(l2 &= l3);
        // MONITOREXIT : sk2_22
        if (n4 <= n7) {
            n3 = 1;
            while (true) {
                object2 = this.g.b(n3);
                Intrinsics.checkNotNull(object2);
                object2 = (CoroutineScheduler$Worker)object2;
                if (object2 != object) {
                    Task task2;
                    Thread.State state;
                    Object object3;
                    while ((object3 = ((Thread)object2).getState()) != (state = Thread.State.TERMINATED)) {
                        LockSupport.unpark((Thread)object2);
                        l3 = 10000L;
                        ((Thread)object2).join(l3);
                    }
                    object2 = ((CoroutineScheduler$Worker)object2).a;
                    object3 = this.f;
                    object2.getClass();
                    Task task3 = bi3_1.b.getAndSet(object2, null);
                    if (task3 != null) {
                        ((aw1_2)object3).a(task3);
                    }
                    while ((task2 = ((bi3_1)object2).b()) != null) {
                        ((aw1_2)object3).a(task2);
                    }
                }
                if (n3 == n7) break;
                ++n3;
            }
        }
        this.f.b();
        d01_0 d01_02 = this.e;
        d01_02.b();
        while (true) {
            Task task4;
            Task task5;
            Task task6;
            if ((object == null || (task6 = ((CoroutineScheduler$Worker)object).a(n4 != 0)) == null) && (task5 = (Task)this.e.d()) == null && (task4 = (Task)this.f.d()) == null) {
                if (object != null) {
                    CoroutineScheduler$b coroutineScheduler$b = CoroutineScheduler$b.TERMINATED;
                    ((CoroutineScheduler$Worker)object).h(coroutineScheduler$b);
                }
                object = h;
                long l4 = 0L;
                ((AtomicLongFieldUpdater)object).set(this, l4);
                object = i;
                ((AtomicLongFieldUpdater)object).set(this, l4);
                return;
            }
            try {
                void var3_13;
                var3_13.run();
                continue;
            }
            catch (Throwable throwable) {
                thread2 = Thread.currentThread();
                object2 = thread2.getUncaughtExceptionHandler();
                object2.uncaughtException(thread2, throwable);
                continue;
            }
            break;
        }
    }

    public final void d(CoroutineScheduler$Worker coroutineScheduler$Worker, int n3, int n4) {
        long l2;
        long l3;
        Object object;
        int n7;
        int n8;
        block0: do {
            Object object2 = h;
            l3 = ((AtomicLongFieldUpdater)object2).get(this);
            l2 = 0x1FFFFFL & l3;
            n8 = (int)l2;
            long l4 = 0x200000L + l3;
            long l7 = 0xFFE00000L;
            l4 &= l7;
            if (n8 != n3) continue;
            if (n4 == 0) {
                object2 = coroutineScheduler$Worker.c();
                while (true) {
                    if (object2 == (object = k)) {
                        n7 = -1;
                        n8 = -1;
                        continue block0;
                    }
                    if (object2 == null) {
                        n7 = 0;
                        object2 = null;
                        n8 = 0;
                        object = null;
                        continue block0;
                    }
                    n8 = ((CoroutineScheduler$Worker)(object2 = (CoroutineScheduler$Worker)object2)).b();
                    if (n8 != 0) continue block0;
                    object2 = ((CoroutineScheduler$Worker)object2).c();
                }
            }
            n8 = n4;
        } while (n8 < 0 || (n7 = (int)(((AtomicLongFieldUpdater)(object = h)).compareAndSet(this, l3, l4 |= (l2 = (long)n8)) ? 1 : 0)) == 0);
    }

    public final void execute(Runnable runnable2) {
        CoroutineScheduler.c(this, runnable2, false, 6);
    }

    public final boolean k(long l2) {
        long l3 = 0x1FFFFFL & l2;
        int n3 = (int)l3;
        long l4 = 4398044413952L;
        l2 &= l4;
        int n4 = 21;
        int n7 = (int)(l2 >>= n4);
        if ((n3 -= n7) < 0) {
            n3 = 0;
        }
        if (n3 < (n7 = this.a)) {
            n4 = this.a();
            if (n4 == (n3 = 1) && n7 > n3) {
                this.a();
            }
            if (n4 > 0) {
                return n3;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean n() {
        block0: while (true) {
            block6: {
                var1_1 = CoroutineScheduler.h;
                var2_2 = var1_1.get(this);
                var4_3 = 0x1FFFFFL & var2_2;
                var6_4 = (int)var4_3;
                var7_5 = this.g;
                var9_7 = var8_6 = var7_5.b(var6_4);
                var9_7 = (CoroutineScheduler$Worker)var8_6;
                var10_8 = -1;
                if (var9_7 != null) break block6;
                var9_7 = null;
                ** GOTO lbl36
            }
            var4_3 = 0x200000L + var2_2;
            var11_9 = 0xFFE00000L;
            var4_3 &= var11_9;
            var8_6 = var9_7.c();
            while (true) {
                block10: {
                    block8: {
                        block9: {
                            block7: {
                                if (var8_6 != (var13_10 = CoroutineScheduler.k)) break block7;
                                var14_11 = -1;
                                break block8;
                            }
                            if (var8_6 != null) break block9;
                            var14_11 = 0;
                            break block8;
                        }
                        var14_11 = (var8_6 = (CoroutineScheduler$Worker)var8_6).b();
                        if (var14_11 == 0) break block10;
                    }
                    if (var14_11 < 0) continue block0;
                    var15_12 = var14_11;
                    var8_6 = this;
                    var17_13 = var1_1.compareAndSet(this, var2_2, var4_3 |= var15_12);
                    if (!var17_13) continue block0;
                    var9_7.g(var13_10);
lbl36:
                    // 2 sources

                    if (var9_7 == null) {
                        return false;
                    }
                    var1_1 = CoroutineScheduler$Worker.i;
                    var17_13 = var1_1.compareAndSet(var9_7, var10_8, 0);
                    if (var17_13) ** break;
                    continue block0;
                    LockSupport.unpark((Thread)var9_7);
                    return true;
                }
                var8_6 = var8_6.c();
            }
            break;
        }
    }

    public final String toString() {
        Object object;
        int n3;
        Serializable serializable = new ArrayList();
        sk2_2 sk2_22 = this.g;
        int n4 = sk2_22.a();
        int n7 = 0;
        Object object2 = 1;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        for (n3 = 1; n3 < n4; ++n3) {
            Object object3;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            int n16;
            Object object4 = (CoroutineScheduler$Worker)sk2_22.b(n3);
            if (object4 == null) continue;
            Object object5 = ((CoroutineScheduler$Worker)object4).a;
            object5.getClass();
            Object object6 = bi3_1.b.get(object5);
            if (object6 != null) {
                object6 = bi3_1.c;
                n16 = ((AtomicIntegerFieldUpdater)object6).get((bi3_1)object5);
                atomicIntegerFieldUpdater = bi3_1.d;
                object3 = atomicIntegerFieldUpdater.get(object5);
                n16 = n16 - object3 + object2;
            } else {
                object6 = bi3_1.c;
                n16 = ((AtomicIntegerFieldUpdater)object6).get(object5);
                atomicIntegerFieldUpdater = bi3_1.d;
                object3 = atomicIntegerFieldUpdater.get(object5);
                n16 -= object3;
            }
            object4 = ((CoroutineScheduler$Worker)object4).c;
            object5 = CoroutineScheduler$a.$EnumSwitchMapping$0;
            object = ((Enum)object4).ordinal();
            object = object5[object];
            if (object != object2) {
                object3 = 2;
                if (object != object3) {
                    object3 = 3;
                    if (object != object3) {
                        object3 = 4;
                        if (object != object3) {
                            object3 = 5;
                            if (object == object3) {
                                ++n15;
                                continue;
                            }
                            serializable = new NoWhenBranchMatchedException();
                            throw serializable;
                        }
                        ++n14;
                        if (n16 <= 0) continue;
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(n16);
                        object3 = 100;
                        ((StringBuilder)object4).append((char)object3);
                        object4 = ((StringBuilder)object4).toString();
                        ((ArrayList)serializable).add(object4);
                        continue;
                    }
                    ++n7;
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append(n16);
                    object3 = 99;
                    ((StringBuilder)object4).append((char)object3);
                    object4 = ((StringBuilder)object4).toString();
                    ((ArrayList)serializable).add(object4);
                    continue;
                }
                ++n8;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(n16);
                object3 = 98;
                ((StringBuilder)object4).append((char)object3);
                object4 = ((StringBuilder)object4).toString();
                ((ArrayList)serializable).add(object4);
                continue;
            }
            ++n10;
        }
        long l2 = i.get(this);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d;
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = si0_2.d(this);
        stringBuilder.append(string2);
        stringBuilder.append("[Pool Size {core = ");
        n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", max = ");
        object = this.b;
        m10.a(stringBuilder, object, "}, Worker States {CPU = ", n7, ", blocking = ");
        m10.a(stringBuilder, n8, ", parked = ", n10, ", dormant = ");
        m10.a(stringBuilder, n14, ", terminated = ", n15, "}, running workers queues = ");
        stringBuilder.append(serializable);
        stringBuilder.append(", global CPU queue size = ");
        int n17 = this.e.c();
        stringBuilder.append(n17);
        stringBuilder.append(", global blocking queue size = ");
        n17 = this.f.c();
        stringBuilder.append(n17);
        stringBuilder.append(", Control State {created workers= ");
        n17 = (int)(0x1FFFFFL & l2);
        stringBuilder.append(n17);
        stringBuilder.append(", blocking tasks = ");
        n17 = (int)((0x3FFFFE00000L & l2) >> 21);
        stringBuilder.append(n17);
        stringBuilder.append(", CPUs acquired = ");
        int n18 = (int)((l2 & 0x7FFFFC0000000000L) >> 42);
        stringBuilder.append(n3 -= n18);
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }
}

